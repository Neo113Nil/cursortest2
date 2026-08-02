package defpackage;

import java.util.function.UnaryOperator;

/* loaded from: classes12.dex */
public final /* synthetic */ class vp7 implements UnaryOperator {
    public final /* synthetic */ int a;

    public /* synthetic */ vp7(int i) {
        this.a = i;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        switch (this.a) {
            case 0:
                return fq7.a((fq7) obj, false, false, null, false, 30);
            case 1:
                return fq7.a((fq7) obj, false, false, null, false, 21);
            case 2:
                return fq7.a((fq7) obj, false, false, null, false, 27);
            case 3:
                return fq7.a((fq7) obj, false, false, null, false, 27);
            case 4:
                return fq7.a((fq7) obj, false, false, null, false, 27);
            case 5:
                tva0 tva0Var = (tva0) obj;
                if (tva0Var != null) {
                    return new tva0(tva0Var.a, tva0Var.b, true);
                }
                return null;
            case 6:
                return dnz0.a((dnz0) obj, null, null, 1);
            default:
                return null;
        }
    }
}
