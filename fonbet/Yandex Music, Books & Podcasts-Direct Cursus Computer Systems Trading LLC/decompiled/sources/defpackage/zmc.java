package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final /* synthetic */ class zmc implements Function1 {
    public final /* synthetic */ int a;
    public final /* synthetic */ int[] b;
    public final /* synthetic */ int c;
    public final /* synthetic */ int d;
    public final /* synthetic */ int e;
    public final /* synthetic */ ksk[] f;
    public final /* synthetic */ int g;
    public final /* synthetic */ mfh h;
    public final /* synthetic */ int i;
    public final /* synthetic */ int[] j;
    public final /* synthetic */ ggi k;

    public /* synthetic */ zmc(int[] iArr, int i, int i2, int i3, ksk[] kskVarArr, ggi ggiVar, int i4, mfh mfhVar, int i5, int[] iArr2, int i6) {
        this.a = i6;
        this.b = iArr;
        this.c = i;
        this.d = i2;
        this.e = i3;
        this.f = kskVarArr;
        this.k = ggiVar;
        this.g = i4;
        this.h = mfhVar;
        this.i = i5;
        this.j = iArr2;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = this.a;
        int[] iArr = this.j;
        int i2 = this.i;
        mfh mfhVar = this.h;
        int i3 = this.g;
        ggi ggiVar = this.k;
        ksk[] kskVarArr = this.f;
        int i4 = this.e;
        int i5 = this.d;
        int i6 = this.c;
        int[] iArr2 = this.b;
        switch (i) {
            case 0:
                enc encVar = (enc) ggiVar;
                jsk jskVar = (jsk) obj;
                jskVar.getClass();
                int i7 = iArr2[i6];
                for (int i8 = i5; i8 < i4; i8++) {
                    ksk kskVar = kskVarArr[i8];
                    kskVar.getClass();
                    fu6 fu6Var = jnc.a;
                    kskVar.n();
                    mfhVar.getLayoutDirection().getClass();
                    pd pdVar = encVar.d;
                    int Z = i3 - kskVar.Z();
                    xof xofVar = xof.a;
                    jskVar.d(kskVar, iArr[i8 - i5], pdVar.s(Z, i2, kskVar) + i7, 0.0f);
                }
                break;
            case 1:
                fnc fncVar = (fnc) ggiVar;
                jsk jskVar2 = (jsk) obj;
                jskVar2.getClass();
                int i9 = iArr2[i6];
                for (int i10 = i5; i10 < i4; i10++) {
                    ksk kskVar2 = kskVarArr[i10];
                    kskVar2.getClass();
                    gu6 gu6Var = knc.a;
                    kskVar2.n();
                    mfhVar.getLayoutDirection().getClass();
                    xv xvVar = fncVar.d;
                    int Z2 = i3 - kskVar2.Z();
                    xof xofVar2 = xof.a;
                    jskVar2.d(kskVar2, iArr[i10 - i5], xvVar.y(Z2, i2, kskVar2) + i9, 0.0f);
                }
                break;
            default:
                dnc dncVar = (dnc) ggiVar;
                jsk jskVar3 = (jsk) obj;
                jskVar3.getClass();
                int i11 = iArr2[i6];
                for (int i12 = i5; i12 < i4; i12++) {
                    ksk kskVar3 = kskVarArr[i12];
                    kskVar3.getClass();
                    eu6 eu6Var = lnc.a;
                    kskVar3.n();
                    mfhVar.getLayoutDirection().getClass();
                    zsd zsdVar = dncVar.d;
                    int Z3 = i3 - kskVar3.Z();
                    xof xofVar3 = xof.a;
                    jskVar3.d(kskVar3, iArr[i12 - i5], zsdVar.B(Z3, i2, kskVar3) + i11, 0.0f);
                }
                break;
        }
        return Unit.a;
    }
}
