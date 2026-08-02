package defpackage;

import androidx.compose.foundation.lazy.a;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class p8i extends uif implements ryc {
    public final /* synthetic */ ArrayList r;
    public final /* synthetic */ boolean s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p8i(ArrayList arrayList, boolean z) {
        super(4);
        this.r = arrayList;
        this.s = z;
    }

    @Override // defpackage.ryc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        a aVar = (a) obj;
        int intValue = ((Number) obj2).intValue();
        hq5 hq5Var = (hq5) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i = (((oq5) hq5Var).f(aVar) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= ((oq5) hq5Var).d(intValue) ? 32 : 16;
        }
        oq5 oq5Var = (oq5) hq5Var;
        if (oq5Var.P(i & 1, (i & 147) != 146)) {
            k8i k8iVar = (k8i) this.r.get(intValue);
            oq5Var.Z(1609308900);
            boolean d = Intrinsics.d(k8iVar, h8i.a);
            boolean z = this.s;
            if (d) {
                oq5Var.Z(883198683);
                avf.e(z, oq5Var, 0);
                oq5Var.p(false);
            } else if (Intrinsics.d(k8iVar, g8i.a)) {
                oq5Var.Z(883201082);
                hdg.j(0, 2, oq5Var, null, z);
                oq5Var.p(false);
            } else if (Intrinsics.d(k8iVar, i8i.a)) {
                oq5Var.Z(883203874);
                ivf.f(z, oq5Var, 0);
                oq5Var.p(false);
            } else {
                if (!Intrinsics.d(k8iVar, j8i.a)) {
                    throw vz1.i(oq5Var, 883197183, false);
                }
                oq5Var.Z(883206810);
                hdg.j(0, 2, oq5Var, null, z);
                oq5Var.p(false);
            }
            oq5Var.p(false);
        } else {
            oq5Var.S();
        }
        return Unit.a;
    }
}
