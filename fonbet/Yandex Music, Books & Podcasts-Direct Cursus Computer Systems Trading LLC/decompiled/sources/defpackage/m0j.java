package defpackage;

import android.content.Context;
import android.content.IntentFilter;
import android.net.NetworkInfo;

/* loaded from: classes3.dex */
public final class m0j extends o0j {
    public final Context f;
    public final l83 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0j(Context context, qdc qdcVar) {
        super(context, qdcVar);
        qdcVar.getClass();
        this.f = context;
        l83 l83Var = new l83(13, this);
        this.g = l83Var;
        context.registerReceiver(l83Var, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"), null, this.e);
    }

    @Override // defpackage.o0j
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
        this.f.unregisterReceiver(this.g);
    }
}
