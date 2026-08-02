package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class xbi extends uif implements Function1 {
    public final /* synthetic */ int r;
    public final /* synthetic */ boolean s;
    public final /* synthetic */ Object t;
    public final /* synthetic */ Object u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public xbi(jx7 jx7Var, tm0 tm0Var, boolean z) {
        super(1);
        this.r = 0;
        this.t = jx7Var;
        this.u = tm0Var;
        this.s = z;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.r;
        int i2 = 0;
        boolean z = this.s;
        Object obj2 = this.u;
        Object obj3 = this.t;
        switch (i) {
            case 0:
                return new bci((cci) obj, (jx7) obj3, k9i.D, (tm0) obj2, this.s);
            case 1:
                jfp jfpVar = (jfp) obj;
                mm6 mm6Var = (mm6) obj2;
                o3k o3kVar = (o3k) obj3;
                if (z) {
                    s2k s2kVar = new s2k(o3kVar, mm6Var, i2);
                    s9f[] s9fVarArr = wfp.a;
                    jfpVar.o(hfp.x, new sa(null, s2kVar));
                    jfpVar.o(hfp.z, new sa(null, new s2k(o3kVar, mm6Var, 1)));
                } else {
                    s2k s2kVar2 = new s2k(o3kVar, mm6Var, 2);
                    s9f[] s9fVarArr2 = wfp.a;
                    jfpVar.o(hfp.y, new sa(null, s2kVar2));
                    jfpVar.o(hfp.A, new sa(null, new s2k(o3kVar, mm6Var, 3)));
                }
                return Unit.a;
            case 2:
                return new zcq(z, (jx7) obj3, (gdq) obj, (Function1) obj2);
            default:
                jfp jfpVar2 = (jfp) obj;
                if (z) {
                    wfp.n(jfpVar2, 0);
                }
                wfp.o(jfpVar2, (String) obj3);
                jfpVar2.o(hfp.u, new sa(null, new d1r((g1r) obj2, 0)));
                return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ xbi(boolean z, Object obj, Object obj2, int i) {
        super(1);
        this.r = i;
        this.s = z;
        this.t = obj;
        this.u = obj2;
    }
}
