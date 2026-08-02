package defpackage;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.text.StringsKt;

/* loaded from: classes5.dex */
public final class ov3 extends gw3 {
    public final ArrayList a;
    public final yx3 b;

    public ov3(ArrayList arrayList, yx3 yx3Var) {
        this.a = arrayList;
        this.b = yx3Var;
    }

    @Override // defpackage.gw3
    public final yx3 b(c3x c3xVar) {
        String S;
        Integer q0;
        String str = ((bx3) c3xVar).j;
        if (str.length() >= 1 && (q0 = StringsKt.q0((S = up6.S(0, 8, str)))) != null) {
            int length = S.length();
            ArrayList arrayList = this.a;
            if (length < 8) {
                int length2 = 8 - S.length();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    nv3 nv3Var = (nv3) it.next();
                    int intValue = q0.intValue();
                    int i = nv3Var.a;
                    int i2 = nv3Var.b;
                    for (int i3 = length2; i3 > 0; i3--) {
                        i /= 10;
                        i2 /= 10;
                    }
                    if (intValue >= i && intValue <= i2) {
                        return null;
                    }
                }
            } else {
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    nv3 nv3Var2 = (nv3) it2.next();
                    if (q0.intValue() < nv3Var2.a) {
                        break;
                    }
                    if (q0.intValue() >= nv3Var2.a && q0.intValue() <= nv3Var2.b) {
                        return null;
                    }
                }
            }
        }
        return this.b;
    }
}
