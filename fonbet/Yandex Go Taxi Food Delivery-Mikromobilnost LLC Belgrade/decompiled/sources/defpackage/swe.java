package defpackage;

import java.util.HashMap;

/* loaded from: classes5.dex */
public final class swe extends fwe {
    public String A;
    public final xe6 z;

    public swe(uwe uweVar, xe6 xe6Var, hwe hweVar) {
        super(rwe.class, uweVar, hweVar);
        this.z = xe6Var;
    }

    @Override // defpackage.fwe
    public final boolean Mg() {
        return this.x.a(this.A);
    }

    @Override // defpackage.fwe
    public final void Ng() {
        xe6 xe6Var = this.z;
        b1 b1Var = (b1) xe6Var.d;
        int i = xe6Var.b;
        boolean z = xe6Var.c;
        String str = (String) xe6Var.e;
        HashMap hashMap = new HashMap();
        hashMap.put("index", Integer.valueOf(i));
        hashMap.put("is_required", Boolean.valueOf(z));
        b1Var.a.a("CostCenterCard.FieldText.Confirm.Tapped", hashMap, 1, tse0.r("title", hashMap, str));
        String str2 = this.A;
        uwe uweVar = this.x;
        uweVar.b.d(uweVar.c.a, str2);
    }
}
