package defpackage;

import java.io.InputStream;
import java.util.logging.Logger;

/* loaded from: classes5.dex */
public final class wn4 extends bt1 {
    public final /* synthetic */ int c = 3;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wn4(osh oshVar, s2i s2iVar) {
        super(1, ((zn4) oshVar.c).e);
        this.e = oshVar;
        this.d = s2iVar;
    }

    @Override // defpackage.bt1
    public final void b() {
        switch (this.c) {
            case 0:
                ((bg3) this.d).Q(vut.T(((zn4) this.e).e), new s2i());
                return;
            case 1:
                osh oshVar = (osh) this.e;
                jkk.c();
                try {
                    jkk.a();
                    jkk.a.getClass();
                    if (((sgr) oshVar.b) == null) {
                        try {
                            ((bg3) oshVar.a).R((s2i) this.d);
                        } catch (Throwable th) {
                            sgr i = sgr.f.h(th).i("Failed to read headers");
                            oshVar.b = i;
                            ((zn4) oshVar.c).i.f(i);
                        }
                    }
                    jkk.a.getClass();
                    return;
                } catch (Throwable th2) {
                    try {
                        jkk.a.getClass();
                    } catch (Throwable th3) {
                        th2.addSuppressed(th3);
                    }
                    throw th2;
                }
            case 2:
                jkk.c();
                try {
                    jkk.a();
                    jee jeeVar = jkk.a;
                    jeeVar.getClass();
                    d();
                    jeeVar.getClass();
                    return;
                } finally {
                }
            case 3:
                fjp fjpVar = (fjp) this.e;
                jkk.c();
                try {
                    jkk.a();
                    jee jeeVar2 = jkk.a;
                    jeeVar2.getClass();
                    ujp ujpVar = fjpVar.e;
                    if (ujpVar == null) {
                        throw new IllegalStateException("listener unset");
                    }
                    ujpVar.s((sgr) this.d);
                    jeeVar2.getClass();
                    return;
                } finally {
                }
            default:
                fjp fjpVar2 = (fjp) this.e;
                try {
                    jkk.c();
                    try {
                        jkk.a();
                        jee jeeVar3 = jkk.a;
                        jeeVar3.getClass();
                        ujp ujpVar2 = fjpVar2.e;
                        if (ujpVar2 == null) {
                            throw new IllegalStateException("listener unset");
                        }
                        ujpVar2.t((uhe) this.d);
                        jeeVar3.getClass();
                        return;
                    } finally {
                    }
                } catch (Throwable th4) {
                    fjp.a(fjpVar2, th4);
                    throw th4;
                }
        }
    }

    public void d() {
        ljr ljrVar = (ljr) this.d;
        osh oshVar = (osh) this.e;
        zn4 zn4Var = (zn4) oshVar.c;
        if (((sgr) oshVar.b) != null) {
            Logger logger = xqd.a;
            while (true) {
                InputStream next = ljrVar.next();
                if (next == null) {
                    return;
                } else {
                    xqd.b(next);
                }
            }
        } else {
            while (true) {
                try {
                    InputStream next2 = ljrVar.next();
                    if (next2 == null) {
                        return;
                    }
                    try {
                        ((bg3) oshVar.a).S(zn4Var.a.e.a(next2));
                        next2.close();
                    } catch (Throwable th) {
                        xqd.b(next2);
                        throw th;
                    }
                } catch (Throwable th2) {
                    Logger logger2 = xqd.a;
                    while (true) {
                        InputStream next3 = ljrVar.next();
                        if (next3 == null) {
                            sgr i = sgr.f.h(th2).i("Failed to read message.");
                            oshVar.b = i;
                            zn4Var.i.f(i);
                            return;
                        }
                        xqd.b(next3);
                    }
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wn4(zn4 zn4Var, bg3 bg3Var) {
        super(1, zn4Var.e);
        this.e = zn4Var;
        this.d = bg3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wn4(osh oshVar, ljr ljrVar) {
        super(1, ((zn4) oshVar.c).e);
        this.e = oshVar;
        this.d = ljrVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wn4(fjp fjpVar, uhe uheVar) {
        super(1, fjpVar.c);
        this.e = fjpVar;
        this.d = uheVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wn4(fjp fjpVar, sgr sgrVar) {
        super(1, fjpVar.c);
        this.e = fjpVar;
        this.d = sgrVar;
    }
}
