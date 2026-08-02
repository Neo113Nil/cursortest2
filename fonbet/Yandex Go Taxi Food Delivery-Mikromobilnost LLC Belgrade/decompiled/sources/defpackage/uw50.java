package defpackage;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import android.os.Looper;
import com.yandex.messaging.internal.net.NetworkManager21$receiver$1;
import defpackage.uw50;
import defpackage.z83;
import ru.yandex.yx_platform_api.InternetConnectionStreamHandler;

/* loaded from: classes15.dex */
public final class uw50 extends xw50 {
    public final Context y;
    public final NetworkManager21$receiver$1 z;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v1, types: [android.content.BroadcastReceiver, com.yandex.messaging.internal.net.NetworkManager21$receiver$1] */
    public uw50(Context context, wff0 wff0Var, x22 x22Var) {
        super(context, wff0Var, x22Var);
        this.y = context;
        ?? r3 = new BroadcastReceiver() { // from class: com.yandex.messaging.internal.net.NetworkManager21$receiver$1
            @Override // android.content.BroadcastReceiver
            public void onReceive(Context context2, Intent intent) {
                z83.g(null, uw50.this.w.getLooper(), Looper.myLooper());
                uw50 uw50Var = uw50.this;
                uw50Var.c(uw50Var.a());
            }
        };
        this.z = r3;
        context.registerReceiver(r3, new IntentFilter(InternetConnectionStreamHandler.CONNECTIVITY_ACTION), null, this.w);
    }

    @Override // defpackage.xw50
    public final boolean a() {
        z83.g(null, this.w.getLooper(), Looper.myLooper());
        try {
            NetworkInfo activeNetworkInfo = this.c.getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isAvailable() && activeNetworkInfo.isConnected();
        } catch (SecurityException unused) {
            return true;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.y.unregisterReceiver(this.z);
    }
}
