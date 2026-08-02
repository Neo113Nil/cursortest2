package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class cz7 implements Function2 {
    public final /* synthetic */ int a;
    public final /* synthetic */ nii b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ yci d;
    public final /* synthetic */ int e;

    public /* synthetic */ cz7(nii niiVar, boolean z, yci yciVar, int i, int i2) {
        this.a = i2;
        this.b = niiVar;
        this.c = z;
        this.d = yciVar;
        this.e = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        hq5 hq5Var = (hq5) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                jf0.o(this.b, this.c, this.d, hq5Var, rvf.R(this.e | 1));
                break;
            default:
                this.b.c(rvf.R(this.e | 1), hq5Var, this.d, this.c);
                break;
        }
        return Unit.a;
    }
}
