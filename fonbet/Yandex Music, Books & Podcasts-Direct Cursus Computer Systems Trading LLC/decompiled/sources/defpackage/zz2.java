package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class zz2 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ j03 s;
    public final /* synthetic */ ihk t;
    public final /* synthetic */ wa4 u;
    public final /* synthetic */ r9i v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zz2(j03 j03Var, ihk ihkVar, wa4 wa4Var, r9i r9iVar, int i) {
        super(1);
        this.r = i;
        this.s = j03Var;
        this.t = ihkVar;
        this.u = wa4Var;
        this.v = r9iVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                ((aai) obj).getClass();
                return j03.b(this.s, this.t.a, this.u, this.v);
            case 1:
                ((aai) obj).getClass();
                return j03.b(this.s, this.t.a, this.u, this.v);
            default:
                ((jrr) obj).getClass();
                return j03.b(this.s, this.t.a, this.u, this.v);
        }
    }
}
