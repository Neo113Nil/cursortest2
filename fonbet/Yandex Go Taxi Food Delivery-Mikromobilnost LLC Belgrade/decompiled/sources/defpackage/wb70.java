package defpackage;

import java.util.ArrayList;

/* loaded from: classes10.dex */
public final class wb70 extends gc70 {
    public static final wb70 c = new wb70(0, 1, 1);

    @Override // defpackage.gc70
    public final void a(vc70 vc70Var, o13 o13Var, ows0 ows0Var, zti0 zti0Var, jc70 jc70Var) {
        aii0 aii0Var = (aii0) vc70Var.b(0);
        hz40 hz40Var = zti0Var.i;
        hs90 hs90Var = hz40Var != null ? (hs90) hz40Var.d(aii0Var) : null;
        if (hs90Var != null) {
            ArrayList arrayList = zti0Var.j;
            if (arrayList == null) {
                arrayList = new ArrayList();
                zti0Var.j = arrayList;
            }
            arrayList.add(zti0Var.e);
            zti0Var.e = hs90Var.b;
        }
    }
}
