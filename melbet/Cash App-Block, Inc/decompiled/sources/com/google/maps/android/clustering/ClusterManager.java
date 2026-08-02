package com.google.maps.android.clustering;

import android.content.Context;
import android.os.AsyncTask;
import androidx.compose.foundation.layout.RowScopeInstance$$ExternalSyntheticLambda0;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.Marker;
import com.google.maps.android.clustering.algo.NonHierarchicalDistanceBasedAlgorithm;
import com.google.maps.android.clustering.algo.PreCachingAlgorithmDecorator;
import com.google.maps.android.clustering.algo.ScreenBasedAlgorithmAdapter;
import com.google.maps.android.clustering.view.DefaultClusterRenderer;
import com.google.maps.android.collections.MarkerManager;
import com.google.maps.android.collections.MarkerManager.Collection;
import java.util.Set;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes4.dex */
public final class ClusterManager implements GoogleMap.OnCameraIdleListener, GoogleMap.OnMarkerClickListener, GoogleMap.OnInfoWindowClickListener {
    public final ScreenBasedAlgorithmAdapter mAlgorithm;
    public final MarkerManager.Collection mClusterMarkers;
    public ClusterTask mClusterTask;
    public final ReentrantReadWriteLock mClusterTaskLock;
    public final GoogleMap mMap;
    public final MarkerManager mMarkerManager;
    public final MarkerManager.Collection mMarkers;
    public RowScopeInstance$$ExternalSyntheticLambda0 mOnClusterClickListener;
    public RowScopeInstance$$ExternalSyntheticLambda0 mOnClusterItemClickListener;
    public RowScopeInstance$$ExternalSyntheticLambda0 mOnClusterItemInfoWindowClickListener;
    public RowScopeInstance$$ExternalSyntheticLambda0 mOnClusterItemInfoWindowLongClickListener;
    public CameraPosition mPreviousCameraPosition;
    public DefaultClusterRenderer mRenderer;

    public final class ClusterTask extends AsyncTask {
        public ClusterTask() {
        }

        @Override // android.os.AsyncTask
        public final Object doInBackground(Object[] objArr) {
            Float[] fArr = (Float[]) objArr;
            ScreenBasedAlgorithmAdapter screenBasedAlgorithmAdapter = ClusterManager.this.mAlgorithm;
            ((ReentrantReadWriteLock) screenBasedAlgorithmAdapter.data).writeLock().lock();
            try {
                return screenBasedAlgorithmAdapter.mAlgorithm.getClusters(fArr[0].floatValue());
            } finally {
                screenBasedAlgorithmAdapter.unlock();
            }
        }

        @Override // android.os.AsyncTask
        public final void onPostExecute(Object obj) {
            ClusterManager.this.mRenderer.onClustersChanged((Set) obj);
        }
    }

    public ClusterManager(Context context, GoogleMap googleMap) {
        MarkerManager markerManager = new MarkerManager(googleMap);
        this.mClusterTaskLock = new ReentrantReadWriteLock();
        this.mMap = googleMap;
        this.mMarkerManager = markerManager;
        this.mClusterMarkers = markerManager.new Collection();
        this.mMarkers = markerManager.new Collection();
        this.mRenderer = new DefaultClusterRenderer(context, googleMap, this);
        PreCachingAlgorithmDecorator preCachingAlgorithmDecorator = new PreCachingAlgorithmDecorator(new NonHierarchicalDistanceBasedAlgorithm());
        ScreenBasedAlgorithmAdapter screenBasedAlgorithmAdapter = new ScreenBasedAlgorithmAdapter(8);
        screenBasedAlgorithmAdapter.mAlgorithm = preCachingAlgorithmDecorator;
        this.mAlgorithm = screenBasedAlgorithmAdapter;
        this.mClusterTask = new ClusterTask();
        this.mRenderer.onAdd();
    }

    public final void cluster() {
        ReentrantReadWriteLock reentrantReadWriteLock = this.mClusterTaskLock;
        reentrantReadWriteLock.writeLock().lock();
        try {
            this.mClusterTask.cancel(true);
            ClusterTask clusterTask = new ClusterTask();
            this.mClusterTask = clusterTask;
            clusterTask.executeOnExecutor(AsyncTask.THREAD_POOL_EXECUTOR, Float.valueOf(this.mMap.getCameraPosition().zoom));
        } finally {
            reentrantReadWriteLock.writeLock().unlock();
        }
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnCameraIdleListener
    public final void onCameraIdle() {
        Object obj = this.mRenderer;
        if (obj instanceof GoogleMap.OnCameraIdleListener) {
            ((GoogleMap.OnCameraIdleListener) obj).onCameraIdle();
        }
        GoogleMap googleMap = this.mMap;
        googleMap.getCameraPosition();
        ScreenBasedAlgorithmAdapter screenBasedAlgorithmAdapter = this.mAlgorithm;
        screenBasedAlgorithmAdapter.getClass();
        screenBasedAlgorithmAdapter.getClass();
        CameraPosition cameraPosition = this.mPreviousCameraPosition;
        if (cameraPosition == null || cameraPosition.zoom != googleMap.getCameraPosition().zoom) {
            this.mPreviousCameraPosition = googleMap.getCameraPosition();
            cluster();
        }
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnInfoWindowClickListener
    public final void onInfoWindowClick(Marker marker) {
        this.mMarkerManager.onInfoWindowClick(marker);
    }

    @Override // com.google.android.gms.maps.GoogleMap.OnMarkerClickListener
    public final boolean onMarkerClick(Marker marker) {
        return this.mMarkerManager.onMarkerClick(marker);
    }
}
