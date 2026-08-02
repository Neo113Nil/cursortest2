package defpackage;

import io.grpc.internal.b;

/* loaded from: classes5.dex */
public final class ijp extends bt1 {
    public final /* synthetic */ qe6 c;
    public final /* synthetic */ xop d;
    public final /* synthetic */ String e;
    public final /* synthetic */ s2i f;
    public final /* synthetic */ tjp g;
    public final /* synthetic */ fjp h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ijp(sfm sfmVar, qe6 qe6Var, xop xopVar, String str, s2i s2iVar, tjp tjpVar, fjp fjpVar) {
        super(1, qe6Var);
        this.c = qe6Var;
        this.d = xopVar;
        this.e = str;
        this.f = s2iVar;
        this.g = tjpVar;
        this.h = fjpVar;
    }

    @Override // defpackage.bt1
    public final void b() {
        jkk.c();
        try {
            jee jeeVar = jkk.a;
            jeeVar.getClass();
            jkk.a();
            d();
            jeeVar.getClass();
        } catch (Throwable th) {
            try {
                jkk.a.getClass();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void d() {
        gjp gjpVar = b.x;
        if (this.d.a instanceof g6) {
            return;
        }
        try {
            String str = this.e;
            kjp kjpVar = (kjp) leu.O(this.d);
            s2i s2iVar = this.f;
            vip vipVar = kjpVar.b;
            xip xipVar = kjpVar.a;
            uip b = vipVar.b(xipVar, s2iVar);
            if (b == null) {
                throw new NullPointerException("startCall() returned a null listener for method " + str);
            }
            this.h.c(new wip(xipVar, b, xipVar.d));
            this.c.a(new sml(this));
        } finally {
        }
    }
}
