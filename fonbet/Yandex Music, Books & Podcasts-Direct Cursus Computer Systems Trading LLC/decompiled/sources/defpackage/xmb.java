package defpackage;

import java.util.concurrent.CopyOnWriteArrayList;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class xmb {
    public final fnb a;
    public final boolean b;
    public final arf c;
    public final Function0 d;

    public /* synthetic */ xmb(fnb fnbVar) {
        this(fnbVar, false, btf.b(new tka(21)), new x6s(26));
    }

    public static /* synthetic */ void b(xmb xmbVar, sjb sjbVar, nab nabVar, u0s u0sVar, cvo cvoVar, int i, String str, thj thjVar, int i2) {
        kmb kmbVar = kmb.Tap;
        if ((i2 & 8) != 0) {
            u0sVar = null;
        }
        xmbVar.a(sjbVar, kmbVar, nabVar, u0sVar, cvoVar, i, str, thjVar, null, "");
    }

    public static u5l c(thj thjVar, nab nabVar, u0s u0sVar, cvo cvoVar, Integer num) {
        thjVar.getClass();
        nabVar.getClass();
        cvoVar.getClass();
        if (num != null) {
            if (nabVar.getCount() == num.intValue()) {
                num = null;
            }
            if (num != null) {
                int intValue = num.intValue();
                if (nabVar instanceof jab) {
                    jab jabVar = (jab) nabVar;
                    qkb qkbVar = jabVar.a;
                    int i = jabVar.b;
                    int i2 = jabVar.c;
                    qkbVar.getClass();
                    nabVar = new jab(qkbVar, i, i2, intValue);
                } else {
                    if (!(nabVar instanceof lab)) {
                        b6e.s();
                        return null;
                    }
                    lab labVar = (lab) nabVar;
                    String str = labVar.a;
                    String str2 = labVar.b;
                    int i3 = labVar.c;
                    int i4 = labVar.d;
                    str.getClass();
                    str2.getClass();
                    nabVar = new lab(i3, i4, intValue, str, str2);
                }
            }
        }
        return new u5l(cvoVar, nabVar, thjVar, u0sVar);
    }

    public static /* synthetic */ void f(int i, int i2, nab nabVar, xmb xmbVar, fcc fccVar, thj thjVar, cvo cvoVar, u0s u0sVar, String str, String str2) {
        if ((i2 & 64) != 0) {
            fccVar = null;
        }
        xmbVar.e(i, nabVar, fccVar, thjVar, cvoVar, u0sVar, str, (i2 & 128) != 0 ? "" : str2);
    }

    public static /* synthetic */ void k(int i, int i2, nab nabVar, xmb xmbVar, fcc fccVar, thj thjVar, cvo cvoVar, u0s u0sVar, String str, String str2) {
        if ((i2 & 64) != 0) {
            fccVar = null;
        }
        xmbVar.j(i, nabVar, fccVar, thjVar, cvoVar, u0sVar, str, (i2 & 128) != 0 ? "" : str2);
    }

    public final void a(sjb sjbVar, kmb kmbVar, nab nabVar, u0s u0sVar, cvo cvoVar, int i, String str, thj thjVar, fcc fccVar, String str2) {
        String str3;
        pkb pkbVar;
        String str4;
        String str5;
        sjbVar.getClass();
        nabVar.getClass();
        cvoVar.getClass();
        umb umbVar = new umb(cvoVar, nabVar, thjVar, i, u0sVar, fccVar, kmbVar, sjbVar);
        if (this.b) {
            CopyOnWriteArrayList copyOnWriteArrayList = ssg.a;
        } else {
            ssg.a(4, "EvGenBlockReporter", (String) umbVar.invoke(), null);
        }
        nmb d = d();
        if (d != null) {
            String G = this.a.G();
            wjb wjbVar = cvoVar.a;
            ilb ilbVar = cvoVar.g;
            glb glbVar = cvoVar.c;
            String str6 = cvoVar.d.a;
            String a = cvoVar.a();
            avo avoVar = cvoVar.e;
            String str7 = avoVar.b;
            pkb pkbVar2 = avoVar.a;
            String a2 = nabVar.a();
            String c = nabVar.c();
            int b = nabVar.b();
            int d2 = nabVar.d();
            if (thjVar == null || (str3 = thjVar.b) == null) {
                str3 = "";
            }
            if (thjVar == null || (pkbVar = thjVar.a) == null) {
                pkbVar = pkb.NonApplicable;
            }
            int i2 = thjVar != null ? thjVar.c : 0;
            int i3 = thjVar != null ? thjVar.d : 0;
            int i4 = i2;
            if (u0sVar == null || (str4 = u0sVar.a) == null) {
                str4 = "";
            }
            d.h(kmbVar, G, wjbVar, ilbVar, glbVar, str6, pkbVar2, str7, pkbVar, str3, i4, i3, str4, u0sVar != null ? u0sVar.b : 0, u0sVar != null ? u0sVar.c : false, c, a2, b, d2, i, str2, fccVar != null ? fccVar.a : "", (fccVar == null || (str5 = fccVar.b) == null) ? "" : str5, fccVar != null ? fccVar.c : 0, str, a, cvoVar.f.a, sjbVar.a);
        }
    }

    public final nmb d() {
        if (((Boolean) this.d.invoke()).booleanValue()) {
            return (nmb) this.c.getValue();
        }
        return null;
    }

    public final void e(int i, nab nabVar, fcc fccVar, thj thjVar, cvo cvoVar, u0s u0sVar, String str, String str2) {
        String str3;
        String str4;
        thjVar.getClass();
        nabVar.getClass();
        cvoVar.getClass();
        str2.getClass();
        vmb vmbVar = new vmb(cvoVar, nabVar, thjVar, i, u0sVar, fccVar, 0);
        if (this.b) {
            CopyOnWriteArrayList copyOnWriteArrayList = ssg.a;
        } else {
            ssg.a(2, "EvGenBlockReporter", (String) vmbVar.invoke(), null);
        }
        nmb d = d();
        if (d != null) {
            String G = this.a.G();
            wjb wjbVar = cvoVar.a;
            ilb ilbVar = cvoVar.g;
            glb glbVar = cvoVar.c;
            String str5 = cvoVar.d.a;
            String a = cvoVar.a();
            avo avoVar = cvoVar.e;
            String str6 = avoVar.b;
            pkb pkbVar = avoVar.a;
            String a2 = nabVar.a();
            String c = nabVar.c();
            int b = nabVar.b();
            int d2 = nabVar.d();
            d.k(G, wjbVar, ilbVar, glbVar, str5, pkbVar, str6, thjVar.a, thjVar.b, thjVar.c, thjVar.d, (u0sVar == null || (str4 = u0sVar.a) == null) ? "" : str4, u0sVar != null ? u0sVar.b : 0, u0sVar != null ? u0sVar.c : false, c, a2, b, d2, i, str2, fccVar != null ? fccVar.a : "", (fccVar == null || (str3 = fccVar.b) == null) ? "" : str3, fccVar != null ? fccVar.c : 0, str, a, cvoVar.f.a);
        }
    }

    public final void g(wjb wjbVar, nab nabVar, u0s u0sVar, cvo cvoVar, int i, String str, thj thjVar, fcc fccVar, String str2, String str3) {
        pkb pkbVar;
        String str4;
        String str5;
        String str6;
        wjbVar.getClass();
        nabVar.getClass();
        cvoVar.getClass();
        wmb wmbVar = new wmb(cvoVar, nabVar, thjVar, i, u0sVar, fccVar, wjbVar, 2);
        if (this.b) {
            CopyOnWriteArrayList copyOnWriteArrayList = ssg.a;
        } else {
            ssg.a(4, "EvGenBlockReporter", (String) wmbVar.invoke(), null);
        }
        nmb d = d();
        if (d != null) {
            String G = this.a.G();
            wjb wjbVar2 = cvoVar.a;
            ilb ilbVar = cvoVar.g;
            glb glbVar = cvoVar.c;
            String str7 = cvoVar.d.a;
            String a = cvoVar.a();
            avo avoVar = cvoVar.e;
            String str8 = avoVar.b;
            pkb pkbVar2 = avoVar.a;
            String a2 = nabVar.a();
            String c = nabVar.c();
            int b = nabVar.b();
            int d2 = nabVar.d();
            String str9 = (thjVar == null || (str6 = thjVar.b) == null) ? "" : str6;
            if (thjVar == null || (pkbVar = thjVar.a) == null) {
                pkbVar = pkb.NonApplicable;
            }
            d.n(cvoVar.a, wjbVar, G, wjbVar2, ilbVar, glbVar, str7, pkbVar2, str8, pkbVar, str9, thjVar != null ? thjVar.c : 0, thjVar != null ? thjVar.d : 0, (u0sVar == null || (str5 = u0sVar.a) == null) ? "" : str5, u0sVar != null ? u0sVar.b : 0, u0sVar != null ? u0sVar.c : false, c, a2, b, d2, i, str3, fccVar != null ? fccVar.a : "", (fccVar == null || (str4 = fccVar.b) == null) ? "" : str4, fccVar != null ? fccVar.c : 0, str, a, cvoVar.f.a, str2 == null ? "" : str2);
        }
    }

    public final void h(String str, nab nabVar, u0s u0sVar, cvo cvoVar, int i, String str2, thj thjVar, fcc fccVar, String str3) {
        pkb pkbVar;
        String str4;
        String str5;
        String str6;
        str.getClass();
        nabVar.getClass();
        cvoVar.getClass();
        wmb wmbVar = new wmb(cvoVar, nabVar, thjVar, i, u0sVar, fccVar, str, 0);
        if (this.b) {
            CopyOnWriteArrayList copyOnWriteArrayList = ssg.a;
        } else {
            ssg.a(4, "EvGenBlockReporter", (String) wmbVar.invoke(), null);
        }
        nmb d = d();
        if (d != null) {
            String G = this.a.G();
            wjb wjbVar = cvoVar.a;
            ilb ilbVar = cvoVar.g;
            glb glbVar = cvoVar.c;
            String str7 = cvoVar.d.a;
            String a = cvoVar.a();
            avo avoVar = cvoVar.e;
            String str8 = avoVar.b;
            pkb pkbVar2 = avoVar.a;
            String a2 = nabVar.a();
            String c = nabVar.c();
            int b = nabVar.b();
            int d2 = nabVar.d();
            String str9 = (thjVar == null || (str6 = thjVar.b) == null) ? "" : str6;
            if (thjVar == null || (pkbVar = thjVar.a) == null) {
                pkbVar = pkb.NonApplicable;
            }
            d.n(cvoVar.a, wjb.Link, G, wjbVar, ilbVar, glbVar, str7, pkbVar2, str8, pkbVar, str9, thjVar != null ? thjVar.c : 0, thjVar != null ? thjVar.d : 0, (u0sVar == null || (str5 = u0sVar.a) == null) ? "" : str5, u0sVar != null ? u0sVar.b : 0, u0sVar != null ? u0sVar.c : false, c, a2, b, d2, i, str3, fccVar != null ? fccVar.a : "", (fccVar == null || (str4 = fccVar.b) == null) ? "" : str4, fccVar != null ? fccVar.c : 0, str2, a, cvoVar.f.a, str);
        }
    }

    public final void j(int i, nab nabVar, fcc fccVar, thj thjVar, cvo cvoVar, u0s u0sVar, String str, String str2) {
        String str3;
        String str4;
        thjVar.getClass();
        str.getClass();
        nabVar.getClass();
        cvoVar.getClass();
        str2.getClass();
        vmb vmbVar = new vmb(cvoVar, nabVar, thjVar, i, u0sVar, fccVar, 1);
        if (this.b) {
            CopyOnWriteArrayList copyOnWriteArrayList = ssg.a;
        } else {
            ssg.a(3, "EvGenBlockReporter", (String) vmbVar.invoke(), null);
        }
        nmb d = d();
        if (d != null) {
            String G = this.a.G();
            wjb wjbVar = cvoVar.a;
            ilb ilbVar = cvoVar.g;
            glb glbVar = cvoVar.c;
            String str5 = cvoVar.d.a;
            String a = cvoVar.a();
            avo avoVar = cvoVar.e;
            String str6 = avoVar.b;
            pkb pkbVar = avoVar.a;
            String a2 = nabVar.a();
            String c = nabVar.c();
            int b = nabVar.b();
            int d2 = nabVar.d();
            d.q(G, wjbVar, ilbVar, glbVar, str5, pkbVar, str6, thjVar.a, thjVar.b, thjVar.c, thjVar.d, (u0sVar == null || (str4 = u0sVar.a) == null) ? "" : str4, u0sVar != null ? u0sVar.b : 0, u0sVar != null ? u0sVar.c : false, c, a2, b, d2, i, str2, fccVar != null ? fccVar.a : "", (fccVar == null || (str3 = fccVar.b) == null) ? "" : str3, fccVar != null ? fccVar.c : 0, str, a, cvoVar.f.a);
        }
    }

    public final void l(String str, nab nabVar, u0s u0sVar, cvo cvoVar, int i, String str2, String str3, thj thjVar, fcc fccVar, String str4) {
        pkb pkbVar;
        String str5;
        String str6;
        String str7;
        str.getClass();
        nabVar.getClass();
        cvoVar.getClass();
        str3.getClass();
        wmb wmbVar = new wmb(cvoVar, nabVar, thjVar, i, u0sVar, fccVar, str, 1);
        if (this.b) {
            CopyOnWriteArrayList copyOnWriteArrayList = ssg.a;
        } else {
            ssg.a(4, "EvGenBlockReporter", (String) wmbVar.invoke(), null);
        }
        nmb d = d();
        if (d != null) {
            String G = this.a.G();
            wjb wjbVar = cvoVar.a;
            ilb ilbVar = cvoVar.g;
            glb glbVar = cvoVar.c;
            String str8 = cvoVar.d.a;
            String a = cvoVar.a();
            avo avoVar = cvoVar.e;
            String str9 = avoVar.b;
            pkb pkbVar2 = avoVar.a;
            String a2 = nabVar.a();
            String c = nabVar.c();
            int b = nabVar.b();
            int d2 = nabVar.d();
            String str10 = (thjVar == null || (str7 = thjVar.b) == null) ? "" : str7;
            if (thjVar == null || (pkbVar = thjVar.a) == null) {
                pkbVar = pkb.NonApplicable;
            }
            nmb.t(d, G, wjbVar, ilbVar, glbVar, str8, pkbVar2, str9, pkbVar, str10, thjVar != null ? thjVar.c : 0, thjVar != null ? thjVar.d : 0, str, (u0sVar == null || (str6 = u0sVar.a) == null) ? "" : str6, u0sVar != null ? u0sVar.b : 0, u0sVar != null ? u0sVar.c : false, c, a2, b, d2, i, str4, fccVar != null ? fccVar.a : "", (fccVar == null || (str5 = fccVar.b) == null) ? "" : str5, fccVar != null ? fccVar.c : 0, str2, a, str3, 4096);
        }
    }

    public xmb(fnb fnbVar, boolean z, arf arfVar, Function0 function0) {
        fnbVar.getClass();
        arfVar.getClass();
        this.a = fnbVar;
        this.b = z;
        this.c = arfVar;
        this.d = function0;
    }
}
