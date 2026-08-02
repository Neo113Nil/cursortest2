package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.yandex.messaging.internal.BackendCompatibilityStatus;

/* loaded from: classes15.dex */
public final class sf4 implements of4, e1k {
    public final Handler a;
    public final Handler b;
    public uhx c;
    public pf4 w;
    public final /* synthetic */ h0w x;

    public sf4(h0w h0wVar, uhx uhxVar) {
        this.x = h0wVar;
        tje.e();
        this.c = uhxVar;
        this.a = new Handler();
        Handler handler = new Handler((Looper) h0wVar.c);
        this.b = handler;
        handler.post(new rf4(this, 0));
    }

    @Override // defpackage.of4
    public final void a(BackendCompatibilityStatus backendCompatibilityStatus) {
        z83.g(null, (Looper) this.x.c, Looper.myLooper());
        this.a.post(new mh3(5, this, backendCompatibilityStatus));
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        tje.e();
        this.c = null;
        this.b.post(new rf4(this, 1));
    }
}
