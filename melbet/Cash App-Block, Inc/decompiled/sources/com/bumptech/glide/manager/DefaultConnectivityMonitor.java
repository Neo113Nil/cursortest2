package com.bumptech.glide.manager;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.camera.video.VideoCapture;
import androidx.work.impl.constraints.IndividualNetworkCallback;
import coil3.request.ViewTargetDisposable;
import com.android.volley.Response;
import com.bumptech.glide.RequestManager;
import java.util.HashSet;

/* loaded from: classes4.dex */
public final class DefaultConnectivityMonitor implements ConnectivityMonitor {
    public final Context context;
    public final RequestManager.RequestManagerConnectivityListener listener;

    public DefaultConnectivityMonitor(Context context, RequestManager.RequestManagerConnectivityListener requestManagerConnectivityListener) {
        this.context = context.getApplicationContext();
        this.listener = requestManagerConnectivityListener;
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public final void onDestroy() {
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public final void onStart() {
        VideoCapture.AnonymousClass3 anonymousClass3 = VideoCapture.AnonymousClass3.get(this.context);
        RequestManager.RequestManagerConnectivityListener requestManagerConnectivityListener = this.listener;
        synchronized (anonymousClass3) {
            ((HashSet) anonymousClass3.this$0).add(requestManagerConnectivityListener);
            anonymousClass3.maybeRegisterReceiver();
        }
    }

    @Override // com.bumptech.glide.manager.LifecycleListener
    public final void onStop() {
        VideoCapture.AnonymousClass3 anonymousClass3 = VideoCapture.AnonymousClass3.get(this.context);
        RequestManager.RequestManagerConnectivityListener requestManagerConnectivityListener = this.listener;
        synchronized (anonymousClass3) {
            ((HashSet) anonymousClass3.this$0).remove(requestManagerConnectivityListener);
            if (anonymousClass3.val$isStreamActive && ((HashSet) anonymousClass3.this$0).isEmpty()) {
                Response response = (Response) anonymousClass3.val$surfaceUpdateFuture;
                ((ConnectivityManager) ((ViewTargetDisposable) response.cacheEntry).get()).unregisterNetworkCallback((IndividualNetworkCallback) response.error);
                anonymousClass3.val$isStreamActive = false;
            }
        }
    }
}
