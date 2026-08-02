package defpackage;

import java.nio.ByteBuffer;
import java.util.ArrayList;
import yads.cs1;
import yads.ve;

/* loaded from: classes7.dex */
public final class zo81 extends eo71 {
    @Override // defpackage.eo71
    public final cs1 b(u471 u471Var, ByteBuffer byteBuffer) {
        if (byteBuffer.get() == 116) {
            uh81 uh81Var = new uh81(byteBuffer.array(), byteBuffer.limit());
            uh81Var.h(12);
            int g = (uh81Var.g() + uh81Var.a(12)) - 4;
            uh81Var.h(44);
            uh81Var.j(uh81Var.a(12));
            uh81Var.h(16);
            ArrayList arrayList = new ArrayList();
            while (uh81Var.g() < g) {
                uh81Var.h(48);
                int a = uh81Var.a(8);
                uh81Var.h(4);
                int g2 = uh81Var.g() + uh81Var.a(12);
                String str = null;
                String str2 = null;
                while (uh81Var.g() < g2) {
                    int a2 = uh81Var.a(8);
                    int a3 = uh81Var.a(8);
                    int g3 = uh81Var.g() + a3;
                    if (a2 == 2) {
                        int a4 = uh81Var.a(16);
                        uh81Var.h(8);
                        if (a4 == 3) {
                            while (uh81Var.g() < g3) {
                                str = uh81Var.b(uh81Var.a(8), md81.a);
                                int a5 = uh81Var.a(8);
                                for (int i = 0; i < a5; i++) {
                                    uh81Var.j(uh81Var.a(8));
                                }
                            }
                        }
                    } else if (a2 == 21) {
                        str2 = uh81Var.b(a3, md81.a);
                    }
                    uh81Var.f(g3 * 8);
                }
                uh81Var.f(g2 * 8);
                if (str != null && str2 != null) {
                    arrayList.add(new ve(a, str.concat(str2)));
                }
            }
            if (!arrayList.isEmpty()) {
                return new cs1(arrayList);
            }
        }
        return null;
    }
}
