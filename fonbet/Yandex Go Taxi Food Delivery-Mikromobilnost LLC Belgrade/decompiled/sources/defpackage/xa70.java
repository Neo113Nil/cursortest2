package defpackage;

import java.util.List;

/* loaded from: classes10.dex */
public final class xa70 extends gc70 {
    public static final xa70 c = new xa70(0, 2, 1);

    @Override // defpackage.gc70
    public final void a(vc70 vc70Var, o13 o13Var, ows0 ows0Var, zti0 zti0Var, jc70 jc70Var) {
        int i = ((g6w) vc70Var.b(0)).a;
        List list = (List) vc70Var.b(1);
        int size = list.size();
        for (int i2 = 0; i2 < size; i2++) {
            Object obj = list.get(i2);
            int i3 = i + i2;
            o13Var.m(i3, obj);
            o13Var.k(i3, obj);
        }
    }
}
