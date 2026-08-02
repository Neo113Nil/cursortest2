package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.NetworkInfo;
import com.yandex.messenger.websdk.internal.NetworkManager21$receiver$1;
import ru.yandex.yx_platform_api.InternetConnectionStreamHandler;

/* loaded from: classes15.dex */
public final class tw50 extends sw50 {
    public final Context y;
    public final NetworkManager21$receiver$1 z;

    public tw50(Context context, ew2 ew2Var) {
        super(context, ew2Var);
        this.y = context;
        NetworkManager21$receiver$1 networkManager21$receiver$1 = new NetworkManager21$receiver$1(this);
        this.z = networkManager21$receiver$1;
        context.registerReceiver(networkManager21$receiver$1, new IntentFilter(InternetConnectionStreamHandler.CONNECTIVITY_ACTION), null, this.x);
    }

    @Override // defpackage.sw50
    public final boolean a() {
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
