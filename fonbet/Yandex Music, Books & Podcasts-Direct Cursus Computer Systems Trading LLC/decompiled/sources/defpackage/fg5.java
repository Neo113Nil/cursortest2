package defpackage;

import android.content.Context;
import kotlin.coroutines.Continuation;

/* loaded from: classes3.dex */
public final class fg5 implements bg5 {
    public final lf5 a;
    public final mqs b;
    public final boolean c;
    public final Context d;
    public final ag5 e;
    public final vdr f;
    public final vdr g;
    public final vdr h;
    public final boolean i;

    public fg5(lf5 lf5Var, mqs mqsVar, boolean z, mm6 mm6Var, Context context, ag5 ag5Var) {
        lf5Var.getClass();
        mqsVar.getClass();
        mm6Var.getClass();
        context.getClass();
        ag5Var.getClass();
        this.a = lf5Var;
        this.b = mqsVar;
        this.c = z;
        this.d = context;
        this.e = ag5Var;
        Continuation continuation = null;
        this.f = sk3.a0(mm6Var, new u21(10, lf5Var.h(mqsVar), lf5Var.a(mqsVar), new hk4(3, 1, continuation)));
        this.g = sk3.a0(mm6Var, new d64(lf5Var.d(mqsVar), 16));
        this.h = sk3.a0(mm6Var, zsd.M0(lf5Var.f(mqsVar), new l1(continuation, this, 17)));
        this.i = lf5Var.i();
    }

    @Override // defpackage.bg5
    public final void a() {
        this.e.d(this.b);
    }

    @Override // defpackage.bg5
    public final vdr c() {
        return this.h;
    }

    @Override // defpackage.bg5
    public final void d() {
        this.e.c(this.b);
    }

    @Override // defpackage.bg5
    public final void e() {
        this.e.b(this.b);
    }

    @Override // defpackage.bg5
    public final vdr h() {
        return this.f;
    }

    @Override // defpackage.bg5
    public final void i() {
        this.e.e(this.d, this.b);
    }

    @Override // defpackage.bg5
    public final boolean j() {
        return this.c;
    }

    @Override // defpackage.bg5
    public final boolean k() {
        return this.i;
    }

    @Override // defpackage.bg5
    public final vdr l() {
        return this.g;
    }
}
