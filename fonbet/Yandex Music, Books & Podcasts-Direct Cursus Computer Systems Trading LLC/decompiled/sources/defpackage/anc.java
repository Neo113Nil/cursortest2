package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes.dex */
public final class anc extends uif implements Function1 {
    public final /* synthetic */ int[] A;
    public final /* synthetic */ int[] r;
    public final /* synthetic */ int s;
    public final /* synthetic */ int t;
    public final /* synthetic */ int u;
    public final /* synthetic */ ksk[] v;
    public final /* synthetic */ gnc w;
    public final /* synthetic */ int x;
    public final /* synthetic */ xof y;
    public final /* synthetic */ int z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public anc(int[] iArr, int i, int i2, int i3, ksk[] kskVarArr, gnc gncVar, int i4, xof xofVar, int i5, int[] iArr2) {
        super(1);
        this.r = iArr;
        this.s = i;
        this.t = i2;
        this.u = i3;
        this.v = kskVarArr;
        this.w = gncVar;
        this.x = i4;
        this.y = xofVar;
        this.z = i5;
        this.A = iArr2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        jf0 jf0Var;
        jsk jskVar = (jsk) obj;
        int[] iArr = this.r;
        int i = iArr != null ? iArr[this.s] : 0;
        int i2 = this.t;
        for (int i3 = i2; i3 < this.u; i3++) {
            ksk kskVar = this.v[i3];
            kskVar.getClass();
            Object n = kskVar.n();
            jho jhoVar = n instanceof jho ? (jho) n : null;
            if (jhoVar == null || (jf0Var = jhoVar.c) == null) {
                jf0Var = this.w.d;
            }
            jskVar.d(kskVar, this.A[i3 - i2], jf0Var.v(this.x - kskVar.Z(), this.y, kskVar, this.z) + i, 0.0f);
        }
        return Unit.a;
    }
}
