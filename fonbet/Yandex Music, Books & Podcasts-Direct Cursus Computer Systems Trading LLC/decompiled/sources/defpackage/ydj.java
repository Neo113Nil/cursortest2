package defpackage;

import android.content.Context;

/* loaded from: classes3.dex */
public final class ydj implements wdj, bg5 {
    public final /* synthetic */ fg5 a;
    public final fdj b;
    public final mqs c;
    public final boolean d;
    public final vdj e;
    public final vdr f;
    public final kvh g;

    public ydj(fdj fdjVar, mqs mqsVar, boolean z, mm6 mm6Var, Context context, ag5 ag5Var, vdj vdjVar) {
        fdjVar.getClass();
        mqsVar.getClass();
        mm6Var.getClass();
        context.getClass();
        ag5Var.getClass();
        this.a = new fg5(fdjVar, mqsVar, z, mm6Var, context, ag5Var);
        this.b = fdjVar;
        this.c = mqsVar;
        this.d = z;
        this.e = vdjVar;
        this.f = sk3.a0(mm6Var, fdjVar.j(mqsVar));
        this.g = new kvh(fdjVar.a.e(mqsVar), 16);
    }

    @Override // defpackage.bg5
    public final void a() {
        this.a.a();
    }

    @Override // defpackage.wdj
    public final pjc b() {
        return this.g;
    }

    @Override // defpackage.bg5
    public final vdr c() {
        return this.a.h;
    }

    @Override // defpackage.bg5
    public final void d() {
        this.a.d();
    }

    @Override // defpackage.bg5
    public final void e() {
        this.a.e();
    }

    @Override // defpackage.wdj
    public final vdr g() {
        return this.f;
    }

    @Override // defpackage.bg5
    public final vdr h() {
        return this.a.f;
    }

    @Override // defpackage.bg5
    public final void i() {
        this.a.i();
    }

    @Override // defpackage.bg5
    public final boolean j() {
        return this.d;
    }

    @Override // defpackage.bg5
    public final boolean k() {
        return this.a.i;
    }

    @Override // defpackage.bg5
    public final vdr l() {
        return this.a.g;
    }

    @Override // defpackage.wdj
    public final void m(boolean z) {
        vdj vdjVar = this.e;
        if (vdjVar != null) {
            vdjVar.f(z);
        }
        fdj fdjVar = this.b;
        fdjVar.getClass();
        mqs mqsVar = this.c;
        mqsVar.getClass();
        t3g t3gVar = fdjVar.c;
        if (z) {
            t3gVar.A(mqsVar);
        } else {
            t3gVar.t(mqsVar);
        }
    }
}
