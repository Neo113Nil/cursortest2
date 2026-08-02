package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class mho extends uif implements Function1 {
    public final /* synthetic */ int r = 1;
    public final /* synthetic */ int s;
    public final /* synthetic */ int t;
    public final /* synthetic */ Object u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mho(r5w r5wVar, int i, ksk kskVar, int i2, mfh mfhVar) {
        super(1);
        this.u = r5wVar;
        this.s = i;
        this.v = kskVar;
        this.t = i2;
        this.w = mfhVar;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [kotlin.jvm.functions.Function2, uif] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                jsk jskVar = (jsk) obj;
                ksk[] kskVarArr = (ksk[]) this.u;
                nho nhoVar = (nho) this.v;
                int[] iArr = (int[]) this.w;
                int length = kskVarArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    ksk kskVar = kskVarArr[i];
                    int i3 = i2 + 1;
                    kskVar.getClass();
                    Object n = kskVar.n();
                    jho jhoVar = n instanceof jho ? (jho) n : null;
                    jf0 jf0Var = jhoVar != null ? jhoVar.c : null;
                    int i4 = this.s;
                    jskVar.d(kskVar, iArr[i2], jf0Var != null ? jf0Var.v(i4 - kskVar.b, xof.a, kskVar, this.t) : nhoVar.b.a(0, i4 - kskVar.b), 0.0f);
                    i++;
                    i2 = i3;
                }
                break;
            default:
                ?? r0 = ((r5w) this.u).q;
                jsk.f((jsk) obj, (ksk) this.v, ((wpe) r0.invoke(new hqe(((this.s - r1.a) << 32) | ((this.t - r1.b) & 4294967295L)), ((mfh) this.w).getLayoutDirection())).a);
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mho(ksk[] kskVarArr, nho nhoVar, int i, int i2, int[] iArr) {
        super(1);
        this.u = kskVarArr;
        this.v = nhoVar;
        this.s = i;
        this.t = i2;
        this.w = iArr;
    }
}
