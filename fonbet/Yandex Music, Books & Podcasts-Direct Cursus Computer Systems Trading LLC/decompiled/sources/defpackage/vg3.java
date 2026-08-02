package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class vg3 extends uif implements Function1 {
    public final /* synthetic */ int r = 0;
    public final /* synthetic */ int s;
    public final /* synthetic */ int t;
    public final /* synthetic */ mfh u;
    public final /* synthetic */ Object v;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vg3(ksk kskVar, ffh ffhVar, mfh mfhVar, int i, int i2, wg3 wg3Var) {
        super(1);
        this.v = kskVar;
        this.w = ffhVar;
        this.u = mfhVar;
        this.s = i;
        this.t = i2;
        this.x = wg3Var;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.r) {
            case 0:
                ug3.b((jsk) obj, (ksk) this.v, (ffh) this.w, this.u.getLayoutDirection(), this.s, this.t, ((wg3) this.x).a);
                break;
            default:
                jsk jskVar = (jsk) obj;
                ksk[] kskVarArr = (ksk[]) this.v;
                ta5 ta5Var = (ta5) this.w;
                int[] iArr = (int[]) this.x;
                int length = kskVarArr.length;
                int i = 0;
                int i2 = 0;
                while (i < length) {
                    ksk kskVar = kskVarArr[i];
                    int i3 = i2 + 1;
                    kskVar.getClass();
                    Object n = kskVar.n();
                    jho jhoVar = n instanceof jho ? (jho) n : null;
                    xof layoutDirection = this.u.getLayoutDirection();
                    jf0 jf0Var = jhoVar != null ? jhoVar.c : null;
                    int i4 = this.s;
                    jskVar.d(kskVar, jf0Var != null ? jf0Var.v(i4 - kskVar.a, layoutDirection, kskVar, this.t) : ta5Var.b.a(0, i4 - kskVar.a, layoutDirection), iArr[i2], 0.0f);
                    i++;
                    i2 = i3;
                }
                break;
        }
        return Unit.a;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vg3(ksk[] kskVarArr, ta5 ta5Var, int i, int i2, mfh mfhVar, int[] iArr) {
        super(1);
        this.v = kskVarArr;
        this.w = ta5Var;
        this.s = i;
        this.t = i2;
        this.u = mfhVar;
        this.x = iArr;
    }
}
