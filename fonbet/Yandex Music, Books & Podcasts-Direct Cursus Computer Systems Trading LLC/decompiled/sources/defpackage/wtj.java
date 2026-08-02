package defpackage;

import com.yandex.passport.sloth.ui.dependencies.m;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class wtj extends s17 {
    public static final wtj d = new wtj(1, 0, 2);

    @Override // defpackage.s17
    public final void a(n8n n8nVar, nw0 nw0Var, oxq oxqVar, m mVar) {
        int[] iArr;
        w80 w80Var;
        int c;
        int i = n8nVar.i(0);
        if (oxqVar.n != 0) {
            pq5.c("Cannot move a group while inserting");
        }
        if (i < 0) {
            pq5.c("Parameter offset is out of bounds");
        }
        if (i == 0) {
            return;
        }
        int i2 = oxqVar.t;
        int i3 = oxqVar.v;
        int i4 = oxqVar.u;
        int i5 = i2;
        while (true) {
            iArr = oxqVar.b;
            if (i <= 0) {
                break;
            }
            i5 += iArr[(oxqVar.q(i5) * 5) + 3];
            if (i5 > i4) {
                pq5.c("Parameter offset is out of bounds");
            }
            i--;
        }
        int i6 = iArr[(oxqVar.q(i5) * 5) + 3];
        int f = oxqVar.f(oxqVar.b, oxqVar.q(oxqVar.t));
        int f2 = oxqVar.f(oxqVar.b, oxqVar.q(i5));
        int i7 = i5 + i6;
        int f3 = oxqVar.f(oxqVar.b, oxqVar.q(i7));
        int i8 = f3 - f2;
        oxqVar.v(i8, Math.max(oxqVar.t - 1, 0));
        oxqVar.u(i6);
        int[] iArr2 = oxqVar.b;
        int q = oxqVar.q(i7) * 5;
        uz0.e(oxqVar.q(i2) * 5, q, (i6 * 5) + q, iArr2, iArr2);
        if (i8 > 0) {
            Object[] objArr = oxqVar.c;
            int g = oxqVar.g(f2 + i8);
            System.arraycopy(objArr, g, objArr, f, oxqVar.g(f3 + i8) - g);
        }
        int i9 = f2 + i8;
        int i10 = i9 - f;
        int i11 = oxqVar.k;
        int i12 = oxqVar.l;
        int length = oxqVar.c.length;
        int i13 = oxqVar.m;
        int i14 = i2 + i6;
        int i15 = i2;
        while (i15 < i14) {
            int q2 = oxqVar.q(i15);
            int i16 = i10;
            int[] iArr3 = iArr2;
            iArr3[(q2 * 5) + 4] = oxq.h(oxq.h(oxqVar.f(iArr2, q2) - i16, i13 < q2 ? 0 : i11, i12, length), oxqVar.k, oxqVar.l, oxqVar.c.length);
            i15++;
            i10 = i16;
            i11 = i11;
            iArr2 = iArr3;
        }
        int i17 = i7 + i6;
        int n = oxqVar.n();
        int a = hxq.a(oxqVar.d, i7, n);
        ArrayList arrayList = new ArrayList();
        if (a >= 0) {
            while (a < oxqVar.d.size() && (c = oxqVar.c((w80Var = (w80) oxqVar.d.get(a)))) >= i7 && c < i17) {
                arrayList.add(w80Var);
                oxqVar.d.remove(a);
            }
        }
        int i18 = i2 - i7;
        int size = arrayList.size();
        for (int i19 = 0; i19 < size; i19++) {
            w80 w80Var2 = (w80) arrayList.get(i19);
            int c2 = oxqVar.c(w80Var2) + i18;
            if (c2 >= oxqVar.g) {
                w80Var2.a = -(n - c2);
            } else {
                w80Var2.a = c2;
            }
            oxqVar.d.add(hxq.a(oxqVar.d, c2, n), w80Var2);
        }
        if (oxqVar.I(i7, i6)) {
            pq5.c("Unexpectedly removed anchors");
        }
        oxqVar.l(i3, oxqVar.u, i2);
        if (i8 > 0) {
            oxqVar.J(i9, i8, i7 - 1);
        }
    }
}
