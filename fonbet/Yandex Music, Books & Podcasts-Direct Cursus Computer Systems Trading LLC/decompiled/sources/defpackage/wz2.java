package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class wz2 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ j03 s;
    public final /* synthetic */ ihk t;
    public final /* synthetic */ oxa u;
    public final /* synthetic */ jtc v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wz2(j03 j03Var, ihk ihkVar, oxa oxaVar, jtc jtcVar, int i) {
        super(1);
        this.r = i;
        this.s = j03Var;
        this.t = ihkVar;
        this.u = oxaVar;
        this.v = jtcVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                sbk sbkVar = (sbk) obj;
                sbkVar.getClass();
                return j03.a(this.s, this.t, null, sbkVar.a, this.u, this.v);
            case 1:
                ((aai) obj).getClass();
                return j03.b(this.s, this.t.a, this.u, this.v);
            case 2:
                ((jrr) obj).getClass();
                return j03.b(this.s, this.t.a, this.u, this.v);
            case 3:
                aai aaiVar = (aai) obj;
                aaiVar.getClass();
                String str = aaiVar.a;
                String str2 = aaiVar.b;
                boolean equals = str.equals("warning");
                j03 j03Var = this.s;
                if (!equals) {
                    return j03.b(j03Var, this.t.a, this.u, this.v);
                }
                ((x60) j03Var.g).a(gut.M0(str2 == null ? "" : str2));
                return nif.c(new k03(q1c.C, r1c.b, null, str, str2 == null ? "" : str2));
            default:
                ((jrr) obj).getClass();
                return j03.b(this.s, this.t.a, this.u, this.v);
        }
    }
}
