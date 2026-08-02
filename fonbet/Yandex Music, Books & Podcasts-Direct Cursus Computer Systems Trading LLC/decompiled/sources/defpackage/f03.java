package defpackage;

import kotlin.jvm.functions.Function1;

/* loaded from: classes5.dex */
public final class f03 extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ j03 s;
    public final /* synthetic */ ihk t;
    public final /* synthetic */ awc u;
    public final /* synthetic */ jtc v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f03(j03 j03Var, ihk ihkVar, awc awcVar, jtc jtcVar, int i) {
        super(1);
        this.r = i;
        switch (i) {
            case 1:
                bro[] broVarArr = bro.a;
                this.s = j03Var;
                this.t = ihkVar;
                this.u = awcVar;
                this.v = jtcVar;
                super(1);
                break;
            default:
                bro[] broVarArr2 = bro.a;
                this.s = j03Var;
                this.t = ihkVar;
                this.u = awcVar;
                this.v = jtcVar;
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.r;
        jtc jtcVar = this.v;
        awc awcVar = this.u;
        ihk ihkVar = this.t;
        j03 j03Var = this.s;
        switch (i) {
            case 0:
                ((aai) obj).getClass();
                String str = ihkVar.a;
                bro[] broVarArr = bro.a;
                return j03.c(j03Var, str, awcVar, jtcVar);
            default:
                ((jrr) obj).getClass();
                String str2 = ihkVar.a;
                bro[] broVarArr2 = bro.a;
                return j03.c(j03Var, str2, awcVar, jtcVar);
        }
    }
}
