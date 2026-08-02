package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class yz2 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ j03 s;
    public final /* synthetic */ ihk t;
    public final /* synthetic */ n7b u;
    public final /* synthetic */ jtc v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yz2(j03 j03Var, ihk ihkVar, n7b n7bVar, jtc jtcVar, int i) {
        super(1);
        this.r = i;
        this.s = j03Var;
        this.t = ihkVar;
        this.u = n7bVar;
        this.v = jtcVar;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.r;
        jtc jtcVar = this.v;
        n7b n7bVar = this.u;
        ihk ihkVar = this.t;
        j03 j03Var = this.s;
        switch (i) {
            case 0:
                ((aai) obj).getClass();
                String str = ihkVar.a;
                bro[] broVarArr = bro.a;
                return j03.c(j03Var, str, n7bVar, jtcVar);
            default:
                ((jrr) obj).getClass();
                String str2 = ihkVar.a;
                bro[] broVarArr2 = bro.a;
                return j03.c(j03Var, str2, n7bVar, jtcVar);
        }
    }
}
