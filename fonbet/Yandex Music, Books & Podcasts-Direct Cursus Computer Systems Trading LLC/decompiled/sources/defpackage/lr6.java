package defpackage;

import kotlin.text.StringsKt;

/* loaded from: classes4.dex */
public final class lr6 extends bfu {
    public final cvl k;
    public final bnd l;
    public final xdr m;
    public final fkn n;

    public lr6(cvl cvlVar, bnd bndVar) {
        bndVar.getClass();
        this.k = cvlVar;
        this.l = bndVar;
        String str = cvlVar != null ? cvlVar.b : null;
        str = str == null ? "" : str;
        String str2 = cvlVar != null ? cvlVar.b : null;
        xdr a = ydr.a(new qr6(str, !(str2 == null || StringsKt.U(str2)), true));
        this.m = a;
        this.n = new fkn(a);
    }
}
