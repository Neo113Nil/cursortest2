package defpackage;

import java.util.LinkedHashMap;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final class tmb {
    public final fnb a;
    public final cvo b;
    public final boolean c;
    public final Function0 d;
    public final jyr e;
    public final LinkedHashMap f;
    public final jyr g;
    public final jyr h;

    public tmb(int i, fnb fnbVar, cvo cvoVar) {
        x6s x6sVar = new x6s(26);
        fnbVar.getClass();
        cvoVar.getClass();
        this.a = fnbVar;
        this.b = cvoVar;
        this.c = false;
        this.d = x6sVar;
        this.e = btf.b(new tka(20));
        this.f = new LinkedHashMap();
        this.g = btf.b(new qh1(this, 7));
        this.h = btf.b(new qh1(this, 8));
    }

    public final rmb a(nab nabVar, u0s u0sVar) {
        nabVar.getClass();
        smb smbVar = new smb(nabVar, u0sVar);
        LinkedHashMap linkedHashMap = this.f;
        Object obj = linkedHashMap.get(smbVar);
        if (obj == null) {
            rmb rmbVar = new rmb(this.a, this.b, nabVar, u0sVar, this.c, this.e, this.d);
            linkedHashMap.put(smbVar, rmbVar);
            obj = rmbVar;
        }
        return (rmb) obj;
    }

    public final tnb b() {
        return (tnb) this.g.getValue();
    }
}
