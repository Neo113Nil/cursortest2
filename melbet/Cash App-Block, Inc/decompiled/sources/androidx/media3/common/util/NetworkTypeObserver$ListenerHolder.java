package androidx.media3.common.util;

import androidx.media3.exoplayer.upstream.DefaultBandwidthMeter$$ExternalSyntheticLambda0;
import com.android.volley.NetworkResponse;
import java.lang.ref.WeakReference;
import java.util.concurrent.Executor;

/* loaded from: classes3.dex */
public final class NetworkTypeObserver$ListenerHolder {
    public final Executor executor;
    public final WeakReference listener;
    public final /* synthetic */ NetworkResponse this$0;

    public NetworkTypeObserver$ListenerHolder(NetworkResponse networkResponse, DefaultBandwidthMeter$$ExternalSyntheticLambda0 defaultBandwidthMeter$$ExternalSyntheticLambda0, Executor executor) {
        this.this$0 = networkResponse;
        this.listener = new WeakReference(defaultBandwidthMeter$$ExternalSyntheticLambda0);
        this.executor = executor;
    }
}
