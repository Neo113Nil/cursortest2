package androidx.media3.exoplayer;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.util.Pair;
import androidx.camera.video.VideoCapture$$ExternalSyntheticLambda2;
import androidx.media3.common.Timeline;
import androidx.media3.common.util.SystemHandlerWrapper;
import androidx.media3.common.util.Util;
import androidx.media3.exoplayer.analytics.DefaultAnalyticsCollector;
import androidx.media3.exoplayer.analytics.PlayerId;
import androidx.media3.exoplayer.drm.DrmSessionEventListener;
import androidx.media3.exoplayer.source.BaseMediaSource;
import androidx.media3.exoplayer.source.LoadEventInfo;
import androidx.media3.exoplayer.source.MaskingMediaPeriod;
import androidx.media3.exoplayer.source.MaskingMediaSource;
import androidx.media3.exoplayer.source.MediaLoadData;
import androidx.media3.exoplayer.source.MediaPeriod;
import androidx.media3.exoplayer.source.MediaSource$MediaPeriodId;
import androidx.media3.exoplayer.source.MediaSource$MediaSourceCaller;
import androidx.media3.exoplayer.source.MediaSourceEventListener;
import androidx.media3.exoplayer.source.MediaSourceEventListener$EventDispatcher$ListenerAndHandler;
import androidx.media3.exoplayer.source.ShuffleOrder$DefaultShuffleOrder;
import androidx.media3.exoplayer.upstream.DefaultBandwidthMeter;
import androidx.recyclerview.widget.RecyclerView;
import com.appsflyer.internal.AFd1wSDK$$ExternalSyntheticLambda2;
import com.google.android.material.shadow.ShadowRenderer;
import com.google.android.material.shape.ClampedCornerSize;
import com.google.android.material.shape.CornerSize;
import com.google.android.material.shape.MaterialShapeDrawable;
import com.google.android.material.shape.ShapeAppearanceModel;
import com.google.android.material.shape.ShapeAppearancePathProvider$Lazy;
import com.google.android.material.shape.ShapePath;
import com.nimbusds.jose.jca.JCAContext;
import com.withpersona.sdk2.inquiry.shared.ResToolsKt;
import java.io.IOException;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.HashSet;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArrayList;

/* loaded from: classes3.dex */
public final class MediaSourceList {
    public final Object childSources;
    public final Object enabledMediaSourceHolders;
    public final Object eventHandler;
    public final Object eventListener;
    public boolean isPrepared;
    public final Object mediaSourceByMediaPeriod;
    public final Object mediaSourceByUid;
    public final Object mediaSourceHolders;
    public final Object mediaSourceListInfoListener;
    public Object mediaTransferListener;
    public final Object playerId;
    public Object shuffleOrder;

    public final class ForwardingEventListener implements MediaSourceEventListener, DrmSessionEventListener {
        public final MediaSourceHolder id;

        public ForwardingEventListener(MediaSourceHolder mediaSourceHolder) {
            this.id = mediaSourceHolder;
        }

        public final Pair getEventParameters(int i, MediaSource$MediaPeriodId mediaSource$MediaPeriodId) {
            MediaSource$MediaPeriodId mediaSource$MediaPeriodId2;
            MediaSourceHolder mediaSourceHolder = this.id;
            MediaSource$MediaPeriodId mediaSource$MediaPeriodId3 = null;
            if (mediaSource$MediaPeriodId != null) {
                int i2 = 0;
                while (true) {
                    if (i2 >= mediaSourceHolder.activeMediaPeriodIds.size()) {
                        mediaSource$MediaPeriodId2 = null;
                        break;
                    }
                    if (((MediaSource$MediaPeriodId) mediaSourceHolder.activeMediaPeriodIds.get(i2)).windowSequenceNumber == mediaSource$MediaPeriodId.windowSequenceNumber) {
                        Object obj = mediaSource$MediaPeriodId.periodUid;
                        Object obj2 = mediaSourceHolder.uid;
                        int i3 = PlaylistTimeline.$r8$clinit;
                        mediaSource$MediaPeriodId2 = mediaSource$MediaPeriodId.copyWithPeriodUid(Pair.create(obj2, obj));
                        break;
                    }
                    i2++;
                }
                if (mediaSource$MediaPeriodId2 == null) {
                    return null;
                }
                mediaSource$MediaPeriodId3 = mediaSource$MediaPeriodId2;
            }
            return Pair.create(Integer.valueOf(i + mediaSourceHolder.firstWindowIndexInChild), mediaSource$MediaPeriodId3);
        }

        @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
        public final void onDownstreamFormatChanged(int i, MediaSource$MediaPeriodId mediaSource$MediaPeriodId, MediaLoadData mediaLoadData) {
            Pair eventParameters = getEventParameters(i, mediaSource$MediaPeriodId);
            if (eventParameters != null) {
                ((SystemHandlerWrapper) MediaSourceList.this.eventHandler).post(new AFd1wSDK$$ExternalSyntheticLambda2(24, this, eventParameters, mediaLoadData));
            }
        }

        @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
        public final void onLoadCanceled(int i, MediaSource$MediaPeriodId mediaSource$MediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            Pair eventParameters = getEventParameters(i, mediaSource$MediaPeriodId);
            if (eventParameters != null) {
                ((SystemHandlerWrapper) MediaSourceList.this.eventHandler).post(new MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda0(this, eventParameters, loadEventInfo, mediaLoadData, 0));
            }
        }

        @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
        public final void onLoadCompleted(int i, MediaSource$MediaPeriodId mediaSource$MediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData) {
            Pair eventParameters = getEventParameters(i, mediaSource$MediaPeriodId);
            if (eventParameters != null) {
                ((SystemHandlerWrapper) MediaSourceList.this.eventHandler).post(new MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda0(this, eventParameters, loadEventInfo, mediaLoadData, 1));
            }
        }

        @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
        public final void onLoadError(int i, MediaSource$MediaPeriodId mediaSource$MediaPeriodId, LoadEventInfo loadEventInfo, MediaLoadData mediaLoadData, IOException iOException, boolean z) {
            Pair eventParameters = getEventParameters(i, mediaSource$MediaPeriodId);
            if (eventParameters != null) {
                ((SystemHandlerWrapper) MediaSourceList.this.eventHandler).post(new VideoCapture$$ExternalSyntheticLambda2(this, eventParameters, loadEventInfo, mediaLoadData, iOException, z, 1));
            }
        }

        @Override // androidx.media3.exoplayer.source.MediaSourceEventListener
        public final void onLoadStarted(int i, MediaSource$MediaPeriodId mediaSource$MediaPeriodId, final LoadEventInfo loadEventInfo, final MediaLoadData mediaLoadData, final int i2) {
            final Pair eventParameters = getEventParameters(i, mediaSource$MediaPeriodId);
            if (eventParameters != null) {
                ((SystemHandlerWrapper) MediaSourceList.this.eventHandler).post(new Runnable() { // from class: androidx.media3.exoplayer.MediaSourceList$ForwardingEventListener$$ExternalSyntheticLambda3
                    @Override // java.lang.Runnable
                    public final void run() {
                        DefaultAnalyticsCollector defaultAnalyticsCollector = (DefaultAnalyticsCollector) MediaSourceList.this.eventListener;
                        Pair pair = eventParameters;
                        defaultAnalyticsCollector.onLoadStarted(((Integer) pair.first).intValue(), (MediaSource$MediaPeriodId) pair.second, loadEventInfo, mediaLoadData, i2);
                    }
                });
            }
        }
    }

    public final class MediaSourceAndListener {
        public final MediaSourceList$$ExternalSyntheticLambda0 caller;
        public final ForwardingEventListener eventListener;
        public final BaseMediaSource mediaSource;

        public MediaSourceAndListener(BaseMediaSource baseMediaSource, MediaSourceList$$ExternalSyntheticLambda0 mediaSourceList$$ExternalSyntheticLambda0, ForwardingEventListener forwardingEventListener) {
            this.mediaSource = baseMediaSource;
            this.caller = mediaSourceList$$ExternalSyntheticLambda0;
            this.eventListener = forwardingEventListener;
        }
    }

    public final class MediaSourceHolder implements MediaSourceInfoHolder {
        public int firstWindowIndexInChild;
        public boolean isRemoved;
        public final MaskingMediaSource mediaSource;
        public final ArrayList activeMediaPeriodIds = new ArrayList();
        public final Object uid = new Object();

        public MediaSourceHolder(BaseMediaSource baseMediaSource, boolean z) {
            this.mediaSource = new MaskingMediaSource(baseMediaSource, z);
        }

        @Override // androidx.media3.exoplayer.MediaSourceInfoHolder
        public final Timeline getTimeline() {
            return this.mediaSource.timeline;
        }

        @Override // androidx.media3.exoplayer.MediaSourceInfoHolder
        public final Object getUid() {
            return this.uid;
        }
    }

    public MediaSourceList() {
        this.playerId = new ShapePath[4];
        this.mediaSourceHolders = new Matrix[4];
        this.mediaSourceByMediaPeriod = new Matrix[4];
        this.mediaSourceByUid = new PointF();
        this.childSources = new Path();
        this.mediaSourceListInfoListener = new Path();
        this.enabledMediaSourceHolders = new ShapePath();
        this.eventListener = new float[2];
        this.eventHandler = new float[2];
        this.shuffleOrder = new Path();
        this.mediaTransferListener = new Path();
        this.isPrepared = true;
        for (int i = 0; i < 4; i++) {
            ((ShapePath[]) this.playerId)[i] = new ShapePath();
            ((Matrix[]) this.mediaSourceHolders)[i] = new Matrix();
            ((Matrix[]) this.mediaSourceByMediaPeriod)[i] = new Matrix();
        }
    }

    public static MediaSourceList getInstanceOrCreate() {
        return Looper.getMainLooper().getThread() == Thread.currentThread() ? ShapeAppearancePathProvider$Lazy.INSTANCE : new MediaSourceList();
    }

    public Timeline addMediaSources(int i, ArrayList arrayList, ShuffleOrder$DefaultShuffleOrder shuffleOrder$DefaultShuffleOrder) {
        ArrayList arrayList2 = (ArrayList) this.mediaSourceHolders;
        if (!arrayList.isEmpty()) {
            this.shuffleOrder = shuffleOrder$DefaultShuffleOrder;
            for (int i2 = i; i2 < arrayList.size() + i; i2++) {
                MediaSourceHolder mediaSourceHolder = (MediaSourceHolder) arrayList.get(i2 - i);
                if (i2 > 0) {
                    MediaSourceHolder mediaSourceHolder2 = (MediaSourceHolder) arrayList2.get(i2 - 1);
                    mediaSourceHolder.firstWindowIndexInChild = mediaSourceHolder2.mediaSource.timeline.timeline.getWindowCount() + mediaSourceHolder2.firstWindowIndexInChild;
                    mediaSourceHolder.isRemoved = false;
                    mediaSourceHolder.activeMediaPeriodIds.clear();
                } else {
                    mediaSourceHolder.firstWindowIndexInChild = 0;
                    mediaSourceHolder.isRemoved = false;
                    mediaSourceHolder.activeMediaPeriodIds.clear();
                }
                int windowCount = mediaSourceHolder.mediaSource.timeline.timeline.getWindowCount();
                for (int i3 = i2; i3 < arrayList2.size(); i3++) {
                    ((MediaSourceHolder) arrayList2.get(i3)).firstWindowIndexInChild += windowCount;
                }
                arrayList2.add(i2, mediaSourceHolder);
                ((HashMap) this.mediaSourceByUid).put(mediaSourceHolder.uid, mediaSourceHolder);
                if (this.isPrepared) {
                    prepareChildSource(mediaSourceHolder);
                    if (((IdentityHashMap) this.mediaSourceByMediaPeriod).isEmpty()) {
                        ((HashSet) this.enabledMediaSourceHolders).add(mediaSourceHolder);
                    } else {
                        MediaSourceAndListener mediaSourceAndListener = (MediaSourceAndListener) ((HashMap) this.childSources).get(mediaSourceHolder);
                        if (mediaSourceAndListener != null) {
                            mediaSourceAndListener.mediaSource.disable(mediaSourceAndListener.caller);
                        }
                    }
                }
            }
        }
        return createTimeline();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r16v0 */
    /* JADX WARN: Type inference failed for: r16v1 */
    /* JADX WARN: Type inference failed for: r16v5 */
    public void calculatePath(ShapeAppearanceModel shapeAppearanceModel, float[] fArr, float f, RectF rectF, JCAContext jCAContext, Path path) {
        boolean z;
        int i;
        float f2;
        boolean z2;
        CornerSize clampedCornerSize;
        int i2;
        JCAContext jCAContext2 = jCAContext;
        Path path2 = path;
        Matrix[] matrixArr = (Matrix[]) this.mediaSourceByMediaPeriod;
        float[] fArr2 = (float[]) this.eventListener;
        ShapePath[] shapePathArr = (ShapePath[]) this.playerId;
        Matrix[] matrixArr2 = (Matrix[]) this.mediaSourceHolders;
        path2.rewind();
        Path path3 = (Path) this.childSources;
        path3.rewind();
        Path path4 = (Path) this.mediaSourceListInfoListener;
        path4.rewind();
        path4.addRect(rectF, Path.Direction.CW);
        int i3 = 0;
        while (true) {
            z = 0;
            int i4 = 1;
            if (i3 >= 4) {
                break;
            }
            PointF pointF = (PointF) this.mediaSourceByUid;
            if (fArr == null) {
                clampedCornerSize = i3 != 1 ? i3 != 2 ? i3 != 3 ? shapeAppearanceModel.topRightCornerSize : shapeAppearanceModel.topLeftCornerSize : shapeAppearanceModel.bottomLeftCornerSize : shapeAppearanceModel.bottomRightCornerSize;
            } else {
                clampedCornerSize = new ClampedCornerSize(fArr[i3]);
                i4 = 1;
            }
            ResToolsKt resToolsKt = i3 != i4 ? i3 != 2 ? i3 != 3 ? shapeAppearanceModel.topRightCorner : shapeAppearanceModel.topLeftCorner : shapeAppearanceModel.bottomLeftCorner : shapeAppearanceModel.bottomRightCorner;
            Matrix[] matrixArr3 = matrixArr;
            ShapePath shapePath = shapePathArr[i3];
            resToolsKt.getClass();
            resToolsKt.getCornerPath(shapePath, f, clampedCornerSize.getCornerSize(rectF));
            int i5 = i3 + 1;
            float f3 = (i5 % 4) * 90;
            matrixArr2[i3].reset();
            if (i3 == 1) {
                i2 = i5;
                pointF.set(rectF.right, rectF.bottom);
            } else if (i3 == 2) {
                i2 = i5;
                pointF.set(rectF.left, rectF.bottom);
            } else if (i3 != 3) {
                i2 = i5;
                pointF.set(rectF.right, rectF.top);
            } else {
                i2 = i5;
                pointF.set(rectF.left, rectF.top);
            }
            matrixArr2[i3].setTranslate(pointF.x, pointF.y);
            matrixArr2[i3].preRotate(f3);
            ShapePath shapePath2 = shapePathArr[i3];
            fArr2[0] = shapePath2.endX;
            fArr2[1] = shapePath2.endY;
            matrixArr2[i3].mapPoints(fArr2);
            matrixArr3[i3].reset();
            matrixArr3[i3].setTranslate(fArr2[0], fArr2[1]);
            matrixArr3[i3].preRotate(f3);
            i3 = i2;
            matrixArr = matrixArr3;
        }
        Matrix[] matrixArr4 = matrixArr;
        int i6 = 0;
        for (i = 4; i6 < i; i = 4) {
            ShapePath shapePath3 = shapePathArr[i6];
            shapePath3.getClass();
            fArr2[z] = 0.0f;
            fArr2[1] = shapePath3.startY;
            matrixArr2[i6].mapPoints(fArr2);
            if (i6 == 0) {
                path2.moveTo(fArr2[z], fArr2[1]);
            } else {
                path2.lineTo(fArr2[z], fArr2[1]);
            }
            shapePathArr[i6].applyToPath(matrixArr2[i6], path2);
            if (jCAContext2 != null) {
                ShapePath shapePath4 = shapePathArr[i6];
                Matrix matrix = matrixArr2[i6];
                MaterialShapeDrawable materialShapeDrawable = (MaterialShapeDrawable) jCAContext2.provider;
                f2 = 0.0f;
                BitSet bitSet = materialShapeDrawable.containsIncompatibleShadowOp;
                shapePath4.getClass();
                bitSet.set(i6, z);
                ShapePath.ShadowCompatOperation[] shadowCompatOperationArr = materialShapeDrawable.cornerShadowOperation;
                shapePath4.addConnectingShadowIfNecessary(shapePath4.endShadowAngle);
                shadowCompatOperationArr[i6] = new ShapePath.ShadowCompatOperation() { // from class: com.google.android.material.shape.ShapePath.1
                    public final /* synthetic */ ArrayList val$operations;
                    public final /* synthetic */ Matrix val$transformCopy;

                    public AnonymousClass1(ArrayList arrayList, Matrix matrix2) {
                        r1 = arrayList;
                        r2 = matrix2;
                    }

                    @Override // com.google.android.material.shape.ShapePath.ShadowCompatOperation
                    public final void draw(Matrix matrix2, ShadowRenderer shadowRenderer, int i7, Canvas canvas) {
                        Iterator it = r1.iterator();
                        while (it.hasNext()) {
                            ((ShadowCompatOperation) it.next()).draw(r2, shadowRenderer, i7, canvas);
                        }
                    }
                };
            } else {
                f2 = 0.0f;
            }
            Path path5 = (Path) this.shuffleOrder;
            ShapePath shapePath5 = (ShapePath) this.enabledMediaSourceHolders;
            int i7 = i6 + 1;
            int i8 = i7 % 4;
            ShapePath shapePath6 = shapePathArr[i6];
            ShapePath[] shapePathArr2 = shapePathArr;
            fArr2[0] = shapePath6.endX;
            fArr2[1] = shapePath6.endY;
            matrixArr2[i6].mapPoints(fArr2);
            float[] fArr3 = (float[]) this.eventHandler;
            ShapePath shapePath7 = shapePathArr2[i8];
            shapePath7.getClass();
            fArr3[0] = f2;
            fArr3[1] = shapePath7.startY;
            matrixArr2[i8].mapPoints(fArr3);
            Matrix[] matrixArr5 = matrixArr2;
            float max = Math.max(((float) Math.hypot(fArr2[0] - fArr3[0], fArr2[1] - fArr3[1])) - 0.001f, f2);
            ShapePath shapePath8 = shapePathArr2[i6];
            fArr2[0] = shapePath8.endX;
            fArr2[1] = shapePath8.endY;
            matrixArr5[i6].mapPoints(fArr2);
            float abs = (i6 == 1 || i6 == 3) ? Math.abs(rectF.centerX() - fArr2[0]) : Math.abs(rectF.centerY() - fArr2[1]);
            shapePath5.reset(RecyclerView.DECELERATION_RATE, 270.0f, RecyclerView.DECELERATION_RATE);
            (i6 != 1 ? i6 != 2 ? i6 != 3 ? shapeAppearanceModel.rightEdge : shapeAppearanceModel.topEdge : shapeAppearanceModel.leftEdge : shapeAppearanceModel.bottomEdge).getEdgePath(max, abs, f, shapePath5);
            path5.reset();
            shapePath5.applyToPath(matrixArr4[i6], path5);
            if (this.isPrepared && (pathOverlapsCorner(path5, i6) || pathOverlapsCorner(path5, i8))) {
                path5.op(path5, path4, Path.Op.DIFFERENCE);
                fArr2[0] = 0.0f;
                fArr2[1] = shapePath5.startY;
                matrixArr4[i6].mapPoints(fArr2);
                path3.moveTo(fArr2[0], fArr2[1]);
                shapePath5.applyToPath(matrixArr4[i6], path3);
                path2 = path;
            } else {
                path2 = path;
                shapePath5.applyToPath(matrixArr4[i6], path2);
            }
            if (jCAContext != null) {
                Matrix matrix2 = matrixArr4[i6];
                jCAContext2 = jCAContext;
                MaterialShapeDrawable materialShapeDrawable2 = (MaterialShapeDrawable) jCAContext2.provider;
                z2 = false;
                materialShapeDrawable2.containsIncompatibleShadowOp.set(i6 + 4, false);
                ShapePath.ShadowCompatOperation[] shadowCompatOperationArr2 = materialShapeDrawable2.edgeShadowOperation;
                shapePath5.addConnectingShadowIfNecessary(shapePath5.endShadowAngle);
                shadowCompatOperationArr2[i6] = new ShapePath.ShadowCompatOperation() { // from class: com.google.android.material.shape.ShapePath.1
                    public final /* synthetic */ ArrayList val$operations;
                    public final /* synthetic */ Matrix val$transformCopy;

                    public AnonymousClass1(ArrayList arrayList, Matrix matrix22) {
                        r1 = arrayList;
                        r2 = matrix22;
                    }

                    @Override // com.google.android.material.shape.ShapePath.ShadowCompatOperation
                    public final void draw(Matrix matrix22, ShadowRenderer shadowRenderer, int i72, Canvas canvas) {
                        Iterator it = r1.iterator();
                        while (it.hasNext()) {
                            ((ShadowCompatOperation) it.next()).draw(r2, shadowRenderer, i72, canvas);
                        }
                    }
                };
            } else {
                jCAContext2 = jCAContext;
                z2 = false;
            }
            i6 = i7;
            z = z2;
            shapePathArr = shapePathArr2;
            matrixArr2 = matrixArr5;
        }
        path2.close();
        path3.close();
        if (path3.isEmpty()) {
            return;
        }
        path2.op(path3, Path.Op.UNION);
    }

    public Timeline createTimeline() {
        ArrayList arrayList = (ArrayList) this.mediaSourceHolders;
        if (arrayList.isEmpty()) {
            return Timeline.EMPTY;
        }
        int i = 0;
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            MediaSourceHolder mediaSourceHolder = (MediaSourceHolder) arrayList.get(i2);
            mediaSourceHolder.firstWindowIndexInChild = i;
            i += mediaSourceHolder.mediaSource.timeline.timeline.getWindowCount();
        }
        return new PlaylistTimeline(arrayList, (ShuffleOrder$DefaultShuffleOrder) this.shuffleOrder);
    }

    public void disableUnusedMediaSources() {
        Iterator it = ((HashSet) this.enabledMediaSourceHolders).iterator();
        while (it.hasNext()) {
            MediaSourceHolder mediaSourceHolder = (MediaSourceHolder) it.next();
            if (mediaSourceHolder.activeMediaPeriodIds.isEmpty()) {
                MediaSourceAndListener mediaSourceAndListener = (MediaSourceAndListener) ((HashMap) this.childSources).get(mediaSourceHolder);
                if (mediaSourceAndListener != null) {
                    mediaSourceAndListener.mediaSource.disable(mediaSourceAndListener.caller);
                }
                it.remove();
            }
        }
    }

    public void maybeReleaseChildSource(MediaSourceHolder mediaSourceHolder) {
        if (mediaSourceHolder.isRemoved && mediaSourceHolder.activeMediaPeriodIds.isEmpty()) {
            MediaSourceAndListener mediaSourceAndListener = (MediaSourceAndListener) ((HashMap) this.childSources).remove(mediaSourceHolder);
            mediaSourceAndListener.getClass();
            ForwardingEventListener forwardingEventListener = mediaSourceAndListener.eventListener;
            BaseMediaSource baseMediaSource = mediaSourceAndListener.mediaSource;
            baseMediaSource.releaseSource(mediaSourceAndListener.caller);
            baseMediaSource.removeEventListener(forwardingEventListener);
            baseMediaSource.removeDrmEventListener(forwardingEventListener);
            ((HashSet) this.enabledMediaSourceHolders).remove(mediaSourceHolder);
        }
    }

    public boolean pathOverlapsCorner(Path path, int i) {
        Path path2 = (Path) this.mediaTransferListener;
        path2.reset();
        ((ShapePath[]) this.playerId)[i].applyToPath(((Matrix[]) this.mediaSourceHolders)[i], path2);
        RectF rectF = new RectF();
        path.computeBounds(rectF, true);
        path2.computeBounds(rectF, true);
        path.op(path2, Path.Op.INTERSECT);
        path.computeBounds(rectF, true);
        return !rectF.isEmpty() || (rectF.width() > 1.0f && rectF.height() > 1.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [androidx.media3.exoplayer.MediaSourceList$$ExternalSyntheticLambda0, androidx.media3.exoplayer.source.MediaSource$MediaSourceCaller] */
    public void prepareChildSource(MediaSourceHolder mediaSourceHolder) {
        MaskingMediaSource maskingMediaSource = mediaSourceHolder.mediaSource;
        ?? r1 = new MediaSource$MediaSourceCaller() { // from class: androidx.media3.exoplayer.MediaSourceList$$ExternalSyntheticLambda0
            @Override // androidx.media3.exoplayer.source.MediaSource$MediaSourceCaller
            public final void onSourceInfoRefreshed(BaseMediaSource baseMediaSource, Timeline timeline) {
                SystemHandlerWrapper systemHandlerWrapper = ((ExoPlayerImplInternal) MediaSourceList.this.mediaSourceListInfoListener).handler;
                systemHandlerWrapper.removeMessages(2);
                systemHandlerWrapper.sendEmptyMessage(22);
            }
        };
        ForwardingEventListener forwardingEventListener = new ForwardingEventListener(mediaSourceHolder);
        ((HashMap) this.childSources).put(mediaSourceHolder, new MediaSourceAndListener(maskingMediaSource, r1, forwardingEventListener));
        String str = Util.DEVICE_DEBUG_INFO;
        Looper myLooper = Looper.myLooper();
        if (myLooper == null) {
            myLooper = Looper.getMainLooper();
        }
        Handler handler = new Handler(myLooper, null);
        maskingMediaSource.getClass();
        DrmSessionEventListener.EventDispatcher eventDispatcher = maskingMediaSource.eventDispatcher;
        eventDispatcher.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList = eventDispatcher.listenerAndHandlers;
        MediaSourceEventListener$EventDispatcher$ListenerAndHandler mediaSourceEventListener$EventDispatcher$ListenerAndHandler = new MediaSourceEventListener$EventDispatcher$ListenerAndHandler();
        mediaSourceEventListener$EventDispatcher$ListenerAndHandler.handler = handler;
        mediaSourceEventListener$EventDispatcher$ListenerAndHandler.listener = forwardingEventListener;
        copyOnWriteArrayList.add(mediaSourceEventListener$EventDispatcher$ListenerAndHandler);
        Looper myLooper2 = Looper.myLooper();
        if (myLooper2 == null) {
            myLooper2 = Looper.getMainLooper();
        }
        new Handler(myLooper2, null);
        DrmSessionEventListener.EventDispatcher eventDispatcher2 = maskingMediaSource.drmEventDispatcher;
        eventDispatcher2.getClass();
        CopyOnWriteArrayList copyOnWriteArrayList2 = eventDispatcher2.listenerAndHandlers;
        DrmSessionEventListener.EventDispatcher.ListenerAndHandler listenerAndHandler = new DrmSessionEventListener.EventDispatcher.ListenerAndHandler();
        listenerAndHandler.listener = forwardingEventListener;
        copyOnWriteArrayList2.add(listenerAndHandler);
        maskingMediaSource.prepareSource(r1, (DefaultBandwidthMeter) this.mediaTransferListener, (PlayerId) this.playerId);
    }

    public void releasePeriod(MediaPeriod mediaPeriod) {
        IdentityHashMap identityHashMap = (IdentityHashMap) this.mediaSourceByMediaPeriod;
        MediaSourceHolder mediaSourceHolder = (MediaSourceHolder) identityHashMap.remove(mediaPeriod);
        mediaSourceHolder.getClass();
        mediaSourceHolder.mediaSource.releasePeriod(mediaPeriod);
        mediaSourceHolder.activeMediaPeriodIds.remove(((MaskingMediaPeriod) mediaPeriod).id);
        if (!identityHashMap.isEmpty()) {
            disableUnusedMediaSources();
        }
        maybeReleaseChildSource(mediaSourceHolder);
    }

    public void removeMediaSourcesInternal(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.mediaSourceHolders;
        for (int i3 = i2 - 1; i3 >= i; i3--) {
            MediaSourceHolder mediaSourceHolder = (MediaSourceHolder) arrayList.remove(i3);
            ((HashMap) this.mediaSourceByUid).remove(mediaSourceHolder.uid);
            int i4 = -mediaSourceHolder.mediaSource.timeline.timeline.getWindowCount();
            for (int i5 = i3; i5 < arrayList.size(); i5++) {
                ((MediaSourceHolder) arrayList.get(i5)).firstWindowIndexInChild += i4;
            }
            mediaSourceHolder.isRemoved = true;
            if (this.isPrepared) {
                maybeReleaseChildSource(mediaSourceHolder);
            }
        }
    }

    public MediaSourceList(ExoPlayerImplInternal exoPlayerImplInternal, DefaultAnalyticsCollector defaultAnalyticsCollector, SystemHandlerWrapper systemHandlerWrapper, PlayerId playerId) {
        this.playerId = playerId;
        this.mediaSourceListInfoListener = exoPlayerImplInternal;
        this.shuffleOrder = new ShuffleOrder$DefaultShuffleOrder();
        this.mediaSourceByMediaPeriod = new IdentityHashMap();
        this.mediaSourceByUid = new HashMap();
        this.mediaSourceHolders = new ArrayList();
        this.eventListener = defaultAnalyticsCollector;
        this.eventHandler = systemHandlerWrapper;
        this.childSources = new HashMap();
        this.enabledMediaSourceHolders = new HashSet();
    }
}
