package defpackage;

import android.os.Handler;
import android.os.Looper;
import com.squareup.moshi.Moshi;
import com.yandex.messaging.internal.ServerMessageRef;
import java.io.Closeable;
import kotlin.jvm.internal.MutablePropertyReference1Impl;

/* loaded from: classes15.dex */
public final class qbb implements e1k {
    public static final /* synthetic */ kgx[] x;
    public final obb a;
    public final fv10 b;
    public final qp3 c;
    public final /* synthetic */ rbb w;

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl("disposable", 0, "getDisposable()Lcom/yandex/alicekit/core/Disposable;", qbb.class);
        qoi0.a.getClass();
        x = new kgx[]{mutablePropertyReference1Impl};
    }

    public qbb(rbb rbbVar, obb obbVar, fv10 fv10Var, ServerMessageRef serverMessageRef) {
        Closeable labVar;
        oab oabVar = rbbVar.c;
        this.w = rbbVar;
        this.a = obbVar;
        this.b = fv10Var;
        qp3 qp3Var = new qp3();
        this.c = qp3Var;
        if (serverMessageRef != null) {
            z83.g(null, oabVar.c, Looper.myLooper());
            labVar = new nab(oabVar, this, serverMessageRef);
        } else if (fv10Var == fv10.a) {
            z83.g(null, oabVar.c, Looper.myLooper());
            labVar = new mab(oabVar, this, 1);
        } else if (fv10Var == fv10.b) {
            z83.g(null, oabVar.c, Looper.myLooper());
            labVar = new mab(oabVar, this, 0);
        } else {
            z83.g(null, oabVar.c, Looper.myLooper());
            vcz0 vcz0Var = oabVar.x;
            k020 k020Var = vcz0Var.b;
            long j = vcz0Var.a.a;
            at2 at2Var = k020Var.b;
            long g = at2Var.Y().g(j);
            az10 B = at2Var.B();
            a(new yab(B.L(j), (Moshi) k020Var.h.get(), g), new iaz0(), vcz0Var.f());
            labVar = new lab(oabVar, null, new a7b(6, this, oabVar));
        }
        kgx kgxVar = x[0];
        qp3Var.b(labVar);
    }

    public final void a(yab yabVar, iaz0 iaz0Var, yab yabVar2) {
        rbb rbbVar = this.w;
        k020 k020Var = rbbVar.b;
        int a = this.b.a(k020Var.k(rbbVar.a.a), k020Var);
        obb obbVar = this.a;
        z83.g(null, obbVar.C.a.get(), Looper.myLooper());
        obbVar.b(yabVar, a);
        boolean z = obbVar.A;
        Handler handler = obbVar.x;
        if (z) {
            handler.post(new nbb(obbVar, yabVar, iaz0Var, a, yabVar2));
        } else {
            handler.post(new mbb(obbVar, yabVar, a, yabVar2, 0));
            obbVar.A = true;
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        kgx kgxVar = x[0];
        this.c.b(null);
    }
}
