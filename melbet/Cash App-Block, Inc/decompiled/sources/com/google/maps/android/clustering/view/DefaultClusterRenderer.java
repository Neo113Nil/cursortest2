package com.google.maps.android.clustering.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.TextView;
import androidx.compose.foundation.layout.RowScopeInstance$$ExternalSyntheticLambda0;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.fillr.browsersdk.interactors.AffiliateInteractor;
import com.fillr.m1;
import com.fillr.n;
import com.google.android.gms.common.internal.zzae;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.BitmapDescriptor;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;
import com.google.crypto.tink.aead.subtle.AesGcmSiv$$ExternalSyntheticLambda0;
import com.google.maps.android.clustering.Cluster;
import com.google.maps.android.clustering.ClusterManager;
import com.google.maps.android.collections.MarkerManager;
import com.google.maps.android.projection.Point;
import com.google.maps.android.projection.SphericalMercatorProjection;
import com.google.maps.android.ui.BubbleDrawable;
import com.google.maps.android.ui.RotationLayout;
import com.google.maps.android.ui.SquareTextView;
import com.knotapi.knot.webview.KnotView$$ExternalSyntheticLambda1;
import com.nimbusds.jose.jwk.JWK$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.maps.engine.googlemaps.GoogleMapEngine;
import com.withpersona.sdk2.camera.feed.CameraFeedKt;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes4.dex */
public class DefaultClusterRenderer {
    public final boolean mAnimate;
    public final long mAnimationDurationMs;
    public RowScopeInstance$$ExternalSyntheticLambda0 mClickListener;
    public final ClusterManager mClusterManager;
    public final AffiliateInteractor mClusterMarkerCache;
    public Set mClusters;
    public final ShapeDrawable mColoredCircleBackground;
    public final ExecutorService mExecutor;
    public final n mIconGenerator;
    public final SparseArray mIcons;
    public RowScopeInstance$$ExternalSyntheticLambda0 mItemClickListener;
    public RowScopeInstance$$ExternalSyntheticLambda0 mItemInfoWindowClickListener;
    public RowScopeInstance$$ExternalSyntheticLambda0 mItemInfoWindowLongClickListener;
    public final GoogleMap mMap;
    public final AffiliateInteractor mMarkerCache;
    public Set mMarkers;
    public int mMinClusterSize;
    public final ViewModifier mViewModifier;
    public float mZoom;
    public static final int[] BUCKETS = {10, 20, 50, 100, 200, 500, IptcConstants.IMAGE_RESOURCE_BLOCK_PHOTOSHOP2_INFO};
    public static final DecelerateInterpolator ANIMATION_INTERP = new DecelerateInterpolator();

    public final class AnimationTask extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {
        public final LatLng from;
        public MarkerManager mMarkerManager;
        public boolean mRemoveOnComplete;
        public final Marker marker;
        public final MarkerWithPosition markerWithPosition;
        public final LatLng to;

        public AnimationTask(MarkerWithPosition markerWithPosition, LatLng latLng, LatLng latLng2) {
            this.markerWithPosition = markerWithPosition;
            this.marker = markerWithPosition.marker;
            this.from = latLng;
            this.to = latLng2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (this.mRemoveOnComplete) {
                DefaultClusterRenderer defaultClusterRenderer = DefaultClusterRenderer.this;
                AffiliateInteractor affiliateInteractor = defaultClusterRenderer.mMarkerCache;
                Marker marker = this.marker;
                affiliateInteractor.remove(marker);
                defaultClusterRenderer.mClusterMarkerCache.remove(marker);
                this.mMarkerManager.remove(marker);
            }
            this.markerWithPosition.position = this.to;
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            LatLng latLng;
            Marker marker;
            LatLng latLng2 = this.to;
            if (latLng2 == null || (latLng = this.from) == null || (marker = this.marker) == null) {
                return;
            }
            float animatedFraction = valueAnimator.getAnimatedFraction();
            double d = latLng2.latitude;
            double d2 = latLng.latitude;
            double d3 = animatedFraction;
            double d4 = ((d - d2) * d3) + d2;
            double d5 = latLng2.longitude - latLng.longitude;
            if (Math.abs(d5) > 180.0d) {
                d5 -= Math.signum(d5) * 360.0d;
            }
            marker.setPosition(new LatLng(d4, (d5 * d3) + latLng.longitude));
        }
    }

    public final class CreateMarkerTask {
        public final LatLng animateFrom;
        public final Cluster cluster;
        public final Set newMarkers;

        /* renamed from: -$$Nest$mperform, reason: not valid java name */
        public static void m2056$$Nest$mperform(CreateMarkerTask createMarkerTask, MarkerModifier markerModifier) {
            MarkerWithPosition markerWithPosition;
            MarkerWithPosition markerWithPosition2;
            DefaultClusterRenderer defaultClusterRenderer = DefaultClusterRenderer.this;
            LinkedList linkedList = markerModifier.mAnimationTasks;
            ReentrantLock reentrantLock = markerModifier.lock;
            Set set = createMarkerTask.newMarkers;
            LatLng latLng = createMarkerTask.animateFrom;
            DefaultClusterRenderer defaultClusterRenderer2 = DefaultClusterRenderer.this;
            Cluster cluster = createMarkerTask.cluster;
            boolean shouldRenderAsCluster = defaultClusterRenderer2.shouldRenderAsCluster(cluster);
            AffiliateInteractor affiliateInteractor = defaultClusterRenderer2.mClusterMarkerCache;
            ClusterManager clusterManager = defaultClusterRenderer2.mClusterManager;
            AffiliateInteractor affiliateInteractor2 = defaultClusterRenderer2.mMarkerCache;
            if (shouldRenderAsCluster) {
                Marker marker = (Marker) affiliateInteractor.urlRequestMethodsMap.get(cluster);
                if (marker == null) {
                    MarkerOptions markerOptions = new MarkerOptions();
                    LatLng position = latLng == null ? cluster.getPosition() : latLng;
                    if (position == null) {
                        a$$ExternalSyntheticBUOutline0.m$3("latlng cannot be null - a position is required.");
                        return;
                    }
                    markerOptions.zza = position;
                    defaultClusterRenderer2.onBeforeClusterRendered(cluster, markerOptions);
                    MarkerManager.Collection collection = clusterManager.mClusterMarkers;
                    Marker addMarker = MarkerManager.this.mMap.addMarker(markerOptions);
                    collection.mObjects.add(addMarker);
                    collection.this$0$1.mAllObjects.put(addMarker, collection);
                    affiliateInteractor.urlRequestMethodsMap.put(cluster, addMarker);
                    affiliateInteractor.affiliateStatesMap.put(addMarker, cluster);
                    markerWithPosition = new MarkerWithPosition(addMarker);
                    if (latLng != null) {
                        LatLng position2 = cluster.getPosition();
                        reentrantLock.lock();
                        linkedList.add(defaultClusterRenderer.new AnimationTask(markerWithPosition, latLng, position2));
                        reentrantLock.unlock();
                    }
                } else {
                    MarkerWithPosition markerWithPosition3 = new MarkerWithPosition(marker);
                    marker.setIcon(defaultClusterRenderer2.getDescriptorForCluster(cluster));
                    markerWithPosition = markerWithPosition3;
                }
                set.add(markerWithPosition);
                return;
            }
            for (GoogleMapEngine.GoogleClusterItemAdapter googleClusterItemAdapter : cluster.getItems()) {
                Marker marker2 = (Marker) affiliateInteractor2.urlRequestMethodsMap.get(googleClusterItemAdapter);
                if (marker2 == null) {
                    MarkerOptions markerOptions2 = new MarkerOptions();
                    if (latLng != null) {
                        markerOptions2.zza = latLng;
                    } else {
                        markerOptions2.zza = googleClusterItemAdapter.getPosition();
                    }
                    defaultClusterRenderer2.onBeforeClusterItemRendered(googleClusterItemAdapter, markerOptions2);
                    MarkerManager.Collection collection2 = clusterManager.mMarkers;
                    Marker addMarker2 = MarkerManager.this.mMap.addMarker(markerOptions2);
                    collection2.mObjects.add(addMarker2);
                    collection2.this$0$1.mAllObjects.put(addMarker2, collection2);
                    markerWithPosition2 = new MarkerWithPosition(addMarker2);
                    affiliateInteractor2.urlRequestMethodsMap.put(googleClusterItemAdapter, addMarker2);
                    affiliateInteractor2.affiliateStatesMap.put(addMarker2, googleClusterItemAdapter);
                    if (latLng != null) {
                        LatLng position3 = googleClusterItemAdapter.getPosition();
                        reentrantLock.lock();
                        linkedList.add(defaultClusterRenderer.new AnimationTask(markerWithPosition2, latLng, position3));
                        reentrantLock.unlock();
                    }
                } else {
                    markerWithPosition2 = new MarkerWithPosition(marker2);
                    googleClusterItemAdapter.getClass();
                    if (!marker2.getPosition().equals(googleClusterItemAdapter.getPosition())) {
                        marker2.setPosition(googleClusterItemAdapter.getPosition());
                        if (marker2.isInfoWindowShown()) {
                            marker2.showInfoWindow();
                        }
                    }
                }
                set.add(markerWithPosition2);
            }
        }

        public CreateMarkerTask(Cluster cluster, Set set, LatLng latLng) {
            this.cluster = cluster;
            this.newMarkers = set;
            this.animateFrom = latLng;
        }
    }

    public final class MarkerModifier extends Handler implements MessageQueue.IdleHandler {
        public final Condition busyCondition;
        public final ReentrantLock lock;
        public final LinkedList mAnimationTasks;
        public final LinkedList mCreateMarkerTasks;
        public boolean mListenerAdded;
        public final LinkedList mOnScreenCreateMarkerTasks;
        public final LinkedList mOnScreenRemoveMarkerTasks;
        public final LinkedList mRemoveMarkerTasks;

        public MarkerModifier() {
            super(Looper.getMainLooper());
            ReentrantLock reentrantLock = new ReentrantLock();
            this.lock = reentrantLock;
            this.busyCondition = reentrantLock.newCondition();
            this.mCreateMarkerTasks = new LinkedList();
            this.mOnScreenCreateMarkerTasks = new LinkedList();
            this.mRemoveMarkerTasks = new LinkedList();
            this.mOnScreenRemoveMarkerTasks = new LinkedList();
            this.mAnimationTasks = new LinkedList();
        }

        public final void add(boolean z, CreateMarkerTask createMarkerTask) {
            ReentrantLock reentrantLock = this.lock;
            reentrantLock.lock();
            sendEmptyMessage(0);
            if (z) {
                this.mOnScreenCreateMarkerTasks.add(createMarkerTask);
            } else {
                this.mCreateMarkerTasks.add(createMarkerTask);
            }
            reentrantLock.unlock();
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (!this.mListenerAdded) {
                Looper.myQueue().addIdleHandler(this);
                this.mListenerAdded = true;
            }
            removeMessages(0);
            ReentrantLock reentrantLock = this.lock;
            reentrantLock.lock();
            for (int i = 0; i < 10; i++) {
                try {
                    performNextTask();
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            if (isBusy()) {
                sendEmptyMessageDelayed(0, 10L);
            } else {
                this.mListenerAdded = false;
                Looper.myQueue().removeIdleHandler(this);
                this.busyCondition.signalAll();
            }
            reentrantLock.unlock();
        }

        public final boolean isBusy() {
            boolean z;
            ReentrantLock reentrantLock = this.lock;
            try {
                reentrantLock.lock();
                if (this.mCreateMarkerTasks.isEmpty() && this.mOnScreenCreateMarkerTasks.isEmpty() && this.mOnScreenRemoveMarkerTasks.isEmpty() && this.mRemoveMarkerTasks.isEmpty()) {
                    if (this.mAnimationTasks.isEmpty()) {
                        z = false;
                        return z;
                    }
                }
                z = true;
                return z;
            } finally {
                reentrantLock.unlock();
            }
        }

        public final void performNextTask() {
            LinkedList linkedList = this.mOnScreenRemoveMarkerTasks;
            boolean isEmpty = linkedList.isEmpty();
            DefaultClusterRenderer defaultClusterRenderer = DefaultClusterRenderer.this;
            if (!isEmpty) {
                Marker marker = (Marker) linkedList.poll();
                defaultClusterRenderer.mMarkerCache.remove(marker);
                defaultClusterRenderer.mClusterMarkerCache.remove(marker);
                defaultClusterRenderer.mClusterManager.mMarkerManager.remove(marker);
                return;
            }
            LinkedList linkedList2 = this.mAnimationTasks;
            if (!linkedList2.isEmpty()) {
                AnimationTask animationTask = (AnimationTask) linkedList2.poll();
                animationTask.getClass();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(RecyclerView.DECELERATION_RATE, 1.0f);
                ofFloat.setInterpolator(DefaultClusterRenderer.ANIMATION_INTERP);
                ofFloat.setDuration(DefaultClusterRenderer.this.mAnimationDurationMs);
                ofFloat.addUpdateListener(animationTask);
                ofFloat.addListener(animationTask);
                ofFloat.start();
                return;
            }
            LinkedList linkedList3 = this.mOnScreenCreateMarkerTasks;
            if (!linkedList3.isEmpty()) {
                CreateMarkerTask.m2056$$Nest$mperform((CreateMarkerTask) linkedList3.poll(), this);
                return;
            }
            LinkedList linkedList4 = this.mCreateMarkerTasks;
            if (!linkedList4.isEmpty()) {
                CreateMarkerTask.m2056$$Nest$mperform((CreateMarkerTask) linkedList4.poll(), this);
                return;
            }
            LinkedList linkedList5 = this.mRemoveMarkerTasks;
            if (linkedList5.isEmpty()) {
                return;
            }
            Marker marker2 = (Marker) linkedList5.poll();
            defaultClusterRenderer.mMarkerCache.remove(marker2);
            defaultClusterRenderer.mClusterMarkerCache.remove(marker2);
            defaultClusterRenderer.mClusterManager.mMarkerManager.remove(marker2);
        }

        @Override // android.os.MessageQueue.IdleHandler
        public final boolean queueIdle() {
            sendEmptyMessage(0);
            return true;
        }

        public final void remove(boolean z, Marker marker) {
            ReentrantLock reentrantLock = this.lock;
            reentrantLock.lock();
            sendEmptyMessage(0);
            if (z) {
                this.mOnScreenRemoveMarkerTasks.add(marker);
            } else {
                this.mRemoveMarkerTasks.add(marker);
            }
            reentrantLock.unlock();
        }

        public final void waitUntilFree() {
            while (isBusy()) {
                sendEmptyMessage(0);
                ReentrantLock reentrantLock = this.lock;
                reentrantLock.lock();
                try {
                    try {
                        if (isBusy()) {
                            this.busyCondition.await();
                        }
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                } finally {
                    reentrantLock.unlock();
                }
            }
        }
    }

    public final class MarkerWithPosition {
        public final Marker marker;
        public LatLng position;

        public MarkerWithPosition(Marker marker) {
            this.marker = marker;
            this.position = marker.getPosition();
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof MarkerWithPosition)) {
                return false;
            }
            return this.marker.equals(((MarkerWithPosition) obj).marker);
        }

        public final int hashCode() {
            return this.marker.hashCode();
        }
    }

    public final class RenderTask implements Runnable {
        public final Set clusters;
        public KnotView$$ExternalSyntheticLambda1 mCallback;
        public float mMapZoom;
        public m1 mProjection;
        public SphericalMercatorProjection mSphericalMercatorProjection;

        public RenderTask(Set set) {
            this.clusters = set;
        }

        @Override // java.lang.Runnable
        public final void run() {
            boolean z;
            float f;
            boolean z2;
            double d;
            boolean z3;
            LatLngBounds latLngBounds;
            ArrayList arrayList;
            DefaultClusterRenderer defaultClusterRenderer = DefaultClusterRenderer.this;
            boolean z4 = defaultClusterRenderer.mAnimate;
            Set set = defaultClusterRenderer.mClusters;
            Set unmodifiableSet = set != null ? Collections.unmodifiableSet(set) : Collections.EMPTY_SET;
            Set<Cluster> set2 = this.clusters;
            if ((set2 != null ? Collections.unmodifiableSet(set2) : Collections.EMPTY_SET).equals(unmodifiableSet)) {
                this.mCallback.run();
                return;
            }
            MarkerModifier markerModifier = defaultClusterRenderer.new MarkerModifier();
            float f2 = this.mMapZoom;
            float f3 = defaultClusterRenderer.mZoom;
            boolean z5 = f2 > f3;
            float f4 = f2 - f3;
            Set<MarkerWithPosition> set3 = defaultClusterRenderer.mMarkers;
            try {
                latLngBounds = this.mProjection.getVisibleRegion().latLngBounds;
                z3 = z4;
                f = f2;
                z2 = z5;
                z = true;
            } catch (Exception e) {
                e.printStackTrace();
                LatLng latLng = new LatLng(0.0d, 0.0d);
                double d2 = latLng.latitude;
                double min = Math.min(Double.POSITIVE_INFINITY, d2);
                z = true;
                double max = Math.max(Double.NEGATIVE_INFINITY, d2);
                boolean isNaN = Double.isNaN(Double.NaN);
                double d3 = latLng.longitude;
                if (isNaN) {
                    f = f2;
                } else if (Double.NaN <= d3 || d3 <= Double.NaN) {
                    f = f2;
                    d3 = Double.NaN;
                } else {
                    if (((Double.NaN - d3) + 360.0d) % 360.0d < ((d3 - Double.NaN) + 360.0d) % 360.0d) {
                        f = f2;
                        z2 = z5;
                        d = Double.NaN;
                    } else {
                        f = f2;
                        z2 = z5;
                        d = d3;
                        d3 = Double.NaN;
                    }
                    z3 = z4;
                    zzae.checkState("no included points", !Double.isNaN(d3));
                    latLngBounds = new LatLngBounds(new LatLng(min, d3), new LatLng(max, d));
                }
                z2 = z5;
                d = d3;
                z3 = z4;
                zzae.checkState("no included points", !Double.isNaN(d3));
                latLngBounds = new LatLngBounds(new LatLng(min, d3), new LatLng(max, d));
            }
            ArrayList arrayList2 = null;
            if (defaultClusterRenderer.mClusters == null || !z3) {
                arrayList = null;
            } else {
                arrayList = new ArrayList();
                for (Cluster cluster : defaultClusterRenderer.mClusters) {
                    if (defaultClusterRenderer.shouldRenderAsCluster(cluster) && latLngBounds.contains(cluster.getPosition())) {
                        arrayList.add(this.mSphericalMercatorProjection.toPoint(cluster.getPosition()));
                    }
                }
            }
            Set newSetFromMap = Collections.newSetFromMap(new ConcurrentHashMap());
            for (Cluster cluster2 : set2) {
                boolean contains = latLngBounds.contains(cluster2.getPosition());
                if (z2 && contains && z3) {
                    Point m2055$$Nest$mfindClosestCluster = DefaultClusterRenderer.m2055$$Nest$mfindClosestCluster(defaultClusterRenderer, arrayList, this.mSphericalMercatorProjection.toPoint(cluster2.getPosition()));
                    if (m2055$$Nest$mfindClosestCluster != null) {
                        markerModifier.add(z, defaultClusterRenderer.new CreateMarkerTask(cluster2, newSetFromMap, this.mSphericalMercatorProjection.toLatLng(m2055$$Nest$mfindClosestCluster)));
                    } else {
                        markerModifier.add(z, defaultClusterRenderer.new CreateMarkerTask(cluster2, newSetFromMap, null));
                    }
                } else {
                    markerModifier.add(contains, defaultClusterRenderer.new CreateMarkerTask(cluster2, newSetFromMap, null));
                }
                z = true;
            }
            markerModifier.waitUntilFree();
            set3.removeAll(newSetFromMap);
            if (z3) {
                arrayList2 = new ArrayList();
                for (Cluster cluster3 : set2) {
                    if (defaultClusterRenderer.shouldRenderAsCluster(cluster3) && latLngBounds.contains(cluster3.getPosition())) {
                        arrayList2.add(this.mSphericalMercatorProjection.toPoint(cluster3.getPosition()));
                    }
                }
            }
            for (MarkerWithPosition markerWithPosition : set3) {
                LatLng latLng2 = markerWithPosition.position;
                Marker marker = markerWithPosition.marker;
                boolean z6 = latLng2 != null && latLngBounds.contains(latLng2);
                if (z2 || f4 <= -3.0f || !z6 || !z3) {
                    markerModifier.remove(z6, marker);
                } else {
                    Point m2055$$Nest$mfindClosestCluster2 = DefaultClusterRenderer.m2055$$Nest$mfindClosestCluster(defaultClusterRenderer, arrayList2, this.mSphericalMercatorProjection.toPoint(markerWithPosition.position));
                    if (m2055$$Nest$mfindClosestCluster2 != null) {
                        LatLng latLng3 = this.mSphericalMercatorProjection.toLatLng(m2055$$Nest$mfindClosestCluster2);
                        LatLng latLng4 = markerWithPosition.position;
                        ReentrantLock reentrantLock = markerModifier.lock;
                        reentrantLock.lock();
                        DefaultClusterRenderer defaultClusterRenderer2 = DefaultClusterRenderer.this;
                        AnimationTask animationTask = defaultClusterRenderer2.new AnimationTask(markerWithPosition, latLng4, latLng3);
                        animationTask.mMarkerManager = defaultClusterRenderer2.mClusterManager.mMarkerManager;
                        animationTask.mRemoveOnComplete = true;
                        markerModifier.mAnimationTasks.add(animationTask);
                        reentrantLock.unlock();
                    } else {
                        markerModifier.remove(true, marker);
                    }
                }
            }
            markerModifier.waitUntilFree();
            defaultClusterRenderer.mMarkers = newSetFromMap;
            defaultClusterRenderer.mClusters = set2;
            defaultClusterRenderer.mZoom = f;
            this.mCallback.run();
        }
    }

    public final class ViewModifier extends Handler {
        public boolean mViewModificationInProgress = false;
        public RenderTask mNextClusters = null;

        public ViewModifier() {
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            RenderTask renderTask;
            if (message.what == 1) {
                this.mViewModificationInProgress = false;
                if (this.mNextClusters != null) {
                    sendEmptyMessage(0);
                    return;
                }
                return;
            }
            removeMessages(0);
            if (this.mViewModificationInProgress || this.mNextClusters == null) {
                return;
            }
            m1 projection = DefaultClusterRenderer.this.mMap.getProjection();
            synchronized (this) {
                renderTask = this.mNextClusters;
                this.mNextClusters = null;
                this.mViewModificationInProgress = true;
            }
            renderTask.mCallback = new KnotView$$ExternalSyntheticLambda1(this, 13);
            renderTask.mProjection = projection;
            renderTask.mMapZoom = DefaultClusterRenderer.this.mMap.getCameraPosition().zoom;
            renderTask.mSphericalMercatorProjection = new SphericalMercatorProjection(Math.pow(2.0d, Math.min(r7, DefaultClusterRenderer.this.mZoom)) * 256.0d);
            DefaultClusterRenderer.this.mExecutor.execute(renderTask);
        }
    }

    /* renamed from: -$$Nest$mfindClosestCluster, reason: not valid java name */
    public static Point m2055$$Nest$mfindClosestCluster(DefaultClusterRenderer defaultClusterRenderer, ArrayList arrayList, Point point) {
        Point point2 = null;
        if (arrayList != null && !arrayList.isEmpty()) {
            int i = defaultClusterRenderer.mClusterManager.mAlgorithm.mAlgorithm.mAlgorithm.mMaxDistance;
            double d = i * i;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Point point3 = (Point) it.next();
                double d2 = point3.x - point.x;
                double d3 = point3.y - point.y;
                double d4 = (d3 * d3) + (d2 * d2);
                if (d4 < d) {
                    point2 = point3;
                    d = d4;
                }
            }
        }
        return point2;
    }

    public DefaultClusterRenderer(Context context, GoogleMap googleMap, ClusterManager clusterManager) {
        ExecutorService newSingleThreadExecutor = Executors.newSingleThreadExecutor();
        this.mMarkers = Collections.newSetFromMap(new ConcurrentHashMap());
        this.mIcons = new SparseArray();
        this.mMarkerCache = new AffiliateInteractor(1);
        this.mMinClusterSize = 4;
        this.mClusterMarkerCache = new AffiliateInteractor(1);
        this.mViewModifier = new ViewModifier();
        this.mMap = googleMap;
        this.mExecutor = newSingleThreadExecutor;
        this.mAnimate = true;
        this.mAnimationDurationMs = 300L;
        float f = context.getResources().getDisplayMetrics().density;
        n nVar = new n();
        nVar.a = context;
        BubbleDrawable bubbleDrawable = new BubbleDrawable(context);
        ViewGroup viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.amu_text_bubble, (ViewGroup) null);
        nVar.b = viewGroup;
        RotationLayout rotationLayout = (RotationLayout) viewGroup.getChildAt(0);
        nVar.c = rotationLayout;
        nVar.d = (TextView) rotationLayout.findViewById(R.id.amu_text);
        bubbleDrawable.mColor = -1;
        nVar.setBackground(bubbleDrawable);
        TextView textView = (TextView) nVar.d;
        if (textView != null) {
            textView.setTextAppearance(context, R.style.amu_Bubble_TextAppearance_Dark);
        }
        this.mIconGenerator = nVar;
        SquareTextView squareTextView = new SquareTextView(context);
        squareTextView.setLayoutParams(new ViewGroup.LayoutParams(-2, -2));
        squareTextView.setId(R.id.amu_text);
        int i = (int) (12.0f * f);
        squareTextView.setPadding(i, i, i, i);
        RotationLayout rotationLayout2 = (RotationLayout) nVar.c;
        rotationLayout2.removeAllViews();
        rotationLayout2.addView(squareTextView);
        View findViewById = rotationLayout2.findViewById(R.id.amu_text);
        TextView textView2 = findViewById instanceof TextView ? (TextView) findViewById : null;
        nVar.d = textView2;
        if (textView2 != null) {
            textView2.setTextAppearance(context, R.style.amu_ClusterIcon_TextAppearance);
        }
        this.mColoredCircleBackground = new ShapeDrawable(new OvalShape());
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(-2130706433);
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{shapeDrawable, this.mColoredCircleBackground});
        int i2 = (int) (f * 3.0f);
        layerDrawable.setLayerInset(1, i2, i2, i2, i2);
        nVar.setBackground(layerDrawable);
        this.mClusterManager = clusterManager;
    }

    public BitmapDescriptor getDescriptorForCluster(Cluster cluster) {
        int size = cluster.getSize();
        int[] iArr = BUCKETS;
        if (size > iArr[0]) {
            int i = 0;
            while (true) {
                if (i >= 6) {
                    size = iArr[6];
                    break;
                }
                int i2 = i + 1;
                if (size < iArr[i2]) {
                    size = iArr[i];
                    break;
                }
                i = i2;
            }
        }
        SparseArray sparseArray = this.mIcons;
        BitmapDescriptor bitmapDescriptor = (BitmapDescriptor) sparseArray.get(size);
        if (bitmapDescriptor != null) {
            return bitmapDescriptor;
        }
        Paint paint = this.mColoredCircleBackground.getPaint();
        float min = 300.0f - Math.min(size, 300.0f);
        paint.setColor(Color.HSVToColor(new float[]{((min * min) / 90000.0f) * 220.0f, 1.0f, 0.6f}));
        n nVar = this.mIconGenerator;
        Context context = (Context) nVar.a;
        TextView textView = (TextView) nVar.d;
        if (textView != null) {
            textView.setTextAppearance(context, R.style.amu_ClusterIcon_TextAppearance);
        }
        String valueOf = size < iArr[0] ? String.valueOf(size) : Boxes$$ExternalSyntheticOutline1.m(size, org.slf4j.Marker.ANY_NON_NULL_MARKER);
        TextView textView2 = (TextView) nVar.d;
        if (textView2 != null) {
            textView2.setText(valueOf);
        }
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
        ViewGroup viewGroup = (ViewGroup) nVar.b;
        viewGroup.measure(makeMeasureSpec, makeMeasureSpec);
        int measuredWidth = viewGroup.getMeasuredWidth();
        int measuredHeight = viewGroup.getMeasuredHeight();
        viewGroup.layout(0, 0, measuredWidth, measuredHeight);
        Bitmap createBitmap = Bitmap.createBitmap(measuredWidth, measuredHeight, Bitmap.Config.ARGB_8888);
        createBitmap.eraseColor(0);
        viewGroup.draw(new Canvas(createBitmap));
        BitmapDescriptor fromBitmap = CameraFeedKt.fromBitmap(createBitmap);
        sparseArray.put(size, fromBitmap);
        return fromBitmap;
    }

    public final void onAdd() {
        ClusterManager clusterManager = this.mClusterManager;
        MarkerManager.Collection collection = clusterManager.mMarkers;
        collection.mMarkerClickListener = new DefaultClusterRenderer$$ExternalSyntheticLambda0(this, 0);
        collection.mInfoWindowClickListener = new DefaultClusterRenderer$$ExternalSyntheticLambda0(this, 1);
        collection.mInfoWindowLongClickListener = new DefaultClusterRenderer$$ExternalSyntheticLambda0(this, 2);
        MarkerManager.Collection collection2 = clusterManager.mClusterMarkers;
        collection2.mMarkerClickListener = new DefaultClusterRenderer$$ExternalSyntheticLambda0(this, 3);
        collection2.mInfoWindowClickListener = new AesGcmSiv$$ExternalSyntheticLambda0(this, 29);
        collection2.mInfoWindowLongClickListener = new JWK$$ExternalSyntheticBUOutline0(this);
    }

    public void onBeforeClusterItemRendered(GoogleMapEngine.GoogleClusterItemAdapter googleClusterItemAdapter, MarkerOptions markerOptions) {
        googleClusterItemAdapter.getClass();
    }

    public void onBeforeClusterRendered(Cluster cluster, MarkerOptions markerOptions) {
        markerOptions.zzd = getDescriptorForCluster(cluster);
        ArrayList arrayList = new ArrayList(cluster.getItems());
        if (arrayList.isEmpty()) {
            return;
        }
        ((GoogleMapEngine.GoogleClusterItemAdapter) arrayList.get(0)).getClass();
    }

    public void onClustersChanged(Set set) {
        ViewModifier viewModifier = this.mViewModifier;
        synchronized (viewModifier) {
            viewModifier.mNextClusters = DefaultClusterRenderer.this.new RenderTask(set);
        }
        viewModifier.sendEmptyMessage(0);
    }

    public final boolean shouldRenderAsCluster(Cluster cluster) {
        return cluster.getSize() >= this.mMinClusterSize;
    }
}
