package io.flutter.plugin.editing;

import D.C0013n;
import L.C0063n;
import android.graphics.Rect;
import c0.r;
import l0.o;
import l0.q;

/* loaded from: classes.dex */
public final class j implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ l f2420a;

    public /* synthetic */ j(l lVar) {
        this.f2420a = lVar;
    }

    public void a(int i2, o oVar) {
        l lVar = this.f2420a;
        lVar.c();
        lVar.f2429f = oVar;
        lVar.f2428e = new C0063n(2, i2);
        lVar.f2431h.e(lVar);
        C0013n c0013n = oVar.f2750j;
        lVar.f2431h = new f(c0013n != null ? (q) c0013n.f244c : null, lVar.f2424a);
        lVar.d(oVar);
        lVar.f2432i = true;
        if (lVar.f2428e.f660b == 3) {
            lVar.f2439p = false;
        }
        lVar.f2436m = null;
        lVar.f2431h.a(lVar);
    }

    public void b(double d2, double d3, double[] dArr) {
        l lVar = this.f2420a;
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
        double d8 = lVar.f2424a.getContext().getResources().getDisplayMetrics().density;
        lVar.f2436m = new Rect((int) (dArr2[0] * d8), (int) (dArr2[2] * d8), (int) Math.ceil(dArr2[1] * d8), (int) Math.ceil(dArr2[3] * d8));
    }

    public void c(q qVar) {
        q qVar2;
        int i2;
        int i3;
        l lVar = this.f2420a;
        r rVar = lVar.f2424a;
        if (!lVar.f2432i && (qVar2 = lVar.f2438o) != null && (i2 = qVar2.f2760d) >= 0 && (i3 = qVar2.f2761e) > i2) {
            int i4 = i3 - i2;
            int i5 = qVar.f2761e;
            int i6 = qVar.f2760d;
            boolean z2 = true;
            if (i4 == i5 - i6) {
                int i7 = 0;
                while (true) {
                    if (i7 >= i4) {
                        z2 = false;
                        break;
                    } else if (qVar2.f2757a.charAt(i7 + i2) != qVar.f2757a.charAt(i7 + i6)) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            lVar.f2432i = z2;
        }
        lVar.f2438o = qVar;
        lVar.f2431h.f(qVar);
        if (lVar.f2432i) {
            lVar.f2425b.restartInput(rVar);
            lVar.f2432i = false;
        }
    }
}
