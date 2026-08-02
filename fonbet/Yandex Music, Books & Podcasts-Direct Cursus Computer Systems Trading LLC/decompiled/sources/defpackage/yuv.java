package defpackage;

import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class yuv {
    public static final /* synthetic */ s9f[] g;
    public final quv a;
    public final cq4 b;
    public final vdr c;
    public final arf d;
    public final arf e;
    public final z6n f;

    static {
        opi opiVar = new opi(yuv.class, "job", "getJob()Lkotlinx/coroutines/Job;", 0);
        ern.a.getClass();
        g = new s9f[]{opiVar};
    }

    public yuv(quv quvVar, cq4 cq4Var, vdr vdrVar, wuv wuvVar) {
        jyr b = wuvVar.b(hag.I(gvv.class), true);
        jyr b2 = wuvVar.b(hag.I(iuv.class), true);
        vdrVar.getClass();
        wuvVar.getClass();
        this.a = quvVar;
        this.b = cq4Var;
        this.c = vdrVar;
        this.d = b;
        this.e = b2;
        this.f = new z6n(7);
    }

    public final void a(boolean z, Function1 function1) {
        AtomicBoolean atomicBoolean = new AtomicBoolean(z);
        Continuation continuation = null;
        rar B = ox6.B(zsd.s0(zsd.b0(new xo2(zsd.M0(this.c, new j0v(continuation, this, 2)), 7)), new h0t(this, atomicBoolean, continuation, 26)), this.b, new ale(this, function1));
        this.f.setValue(this, g[0], B);
    }
}
