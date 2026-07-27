package io.flutter.plugin.editing;

import D.C0013n;
import L.C0038n;
import android.graphics.Rect;
import c0.r;
import l0.C0212o;
import l0.C0214q;

/* loaded from: classes.dex */
public final class j implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f2428a;

    public /* synthetic */ j(l lVar) {
        this.f2428a = lVar;
    }

    public void a(int i2, C0212o c0212o) {
        l lVar = this.f2428a;
        lVar.c();
        lVar.f2437f = c0212o;
        lVar.f2436e = new C0038n(2, i2);
        lVar.f2439h.e(lVar);
        C0013n c0013n = c0212o.f2758j;
        lVar.f2439h = new f(c0013n != null ? (C0214q) c0013n.f245c : null, lVar.f2432a);
        lVar.d(c0212o);
        lVar.f2440i = true;
        if (lVar.f2436e.f582b == 3) {
            lVar.f2447p = false;
        }
        lVar.f2444m = null;
        lVar.f2439h.a(lVar);
    }

    public void b(double d2, double d3, double[] dArr) {
        l lVar = this.f2428a;
        lVar.getClass();
        double[] dArr2 = new double[4];
        boolean z2 = dArr[3] == 0.0d && dArr[7] == 0.0d && dArr[15] == 1.0d;
        double d4 = dArr[12];
        double d5 = dArr[15];
        double d6 = d4 / d5;
        dArr2[1] = d6;
        dArr2[0] = d6;
        double d7 = dArr[13] / d5;
        dArr2[3] = d7;
        dArr2[2] = d7;
        k kVar = new k(z2, dArr, dArr2);
        kVar.a(d2, 0.0d);
        kVar.a(d2, d3);
        kVar.a(0.0d, d3);
        double d8 = lVar.f2432a.getContext().getResources().getDisplayMetrics().density;
        lVar.f2444m = new Rect((int) (dArr2[0] * d8), (int) (dArr2[2] * d8), (int) Math.ceil(dArr2[1] * d8), (int) Math.ceil(dArr2[3] * d8));
    }

    public void c(C0214q c0214q) {
        C0214q c0214q2;
        int i2;
        int i3;
        l lVar = this.f2428a;
        r rVar = lVar.f2432a;
        if (!lVar.f2440i && (c0214q2 = lVar.f2446o) != null && (i2 = c0214q2.f2768d) >= 0 && (i3 = c0214q2.f2769e) > i2) {
            int i4 = i3 - i2;
            int i5 = c0214q.f2769e;
            int i6 = c0214q.f2768d;
            boolean z2 = true;
            if (i4 == i5 - i6) {
                int i7 = 0;
                while (true) {
                    if (i7 >= i4) {
                        z2 = false;
                        break;
                    } else if (c0214q2.f2765a.charAt(i7 + i2) != c0214q.f2765a.charAt(i7 + i6)) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            lVar.f2440i = z2;
        }
        lVar.f2446o = c0214q;
        lVar.f2439h.f(c0214q);
        if (lVar.f2440i) {
            lVar.f2433b.restartInput(rVar);
            lVar.f2440i = false;
        }
    }
}
