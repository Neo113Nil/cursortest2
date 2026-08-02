package defpackage;

import java.util.LinkedHashMap;

/* loaded from: classes3.dex */
public final class exa {
    public final nab a;
    public final vdr b;
    public final xmb c;
    public final jyr d;
    public final LinkedHashMap e;

    public exa(nab nabVar, fnb fnbVar, vdr vdrVar) {
        nabVar.getClass();
        fnbVar.getClass();
        vdrVar.getClass();
        this.a = nabVar;
        this.b = vdrVar;
        this.c = new xmb(fnbVar);
        this.d = btf.b(new tka(9));
        this.e = new LinkedHashMap();
    }

    public final void a(wjb wjbVar, a63 a63Var) {
        wjbVar.getClass();
        a63Var.getClass();
        x43 x43Var = a63Var.a;
        cvo cvoVar = x43Var.a;
        int i = x43Var.b;
        thj thjVar = a63Var.b;
        String str = thjVar.e;
        String str2 = (String) this.e.get(thjVar.b);
        if (str2 == null) {
            str2 = "";
        }
        this.c.g(wjbVar, this.a, null, cvoVar, i, str2, thjVar, null, (r20 & 256) != 0 ? null : str, "");
    }

    public final void b(boolean z, String str, a63 a63Var, String str2) {
        str.getClass();
        a63Var.getClass();
        x43 x43Var = a63Var.a;
        thj thjVar = a63Var.b;
        jyr jyrVar = this.d;
        LinkedHashMap linkedHashMap = this.e;
        if (z) {
            linkedHashMap.put(thjVar.b, str);
            xmb.k(x43Var.b, 64, this.a, this.c, null, thjVar, x43Var.a, (u0s) jyrVar.getValue(), str, str2);
            return;
        }
        if (z) {
            b6e.s();
            return;
        }
        String str3 = (String) linkedHashMap.remove(thjVar.b);
        if (str3 == null) {
            str3 = "";
        }
        int i = x43Var.b;
        cvo cvoVar = x43Var.a;
        u0s u0sVar = (u0s) jyrVar.getValue();
        xmb.f(i, 64, this.a, this.c, null, thjVar, cvoVar, u0sVar, str3, str2);
    }
}
