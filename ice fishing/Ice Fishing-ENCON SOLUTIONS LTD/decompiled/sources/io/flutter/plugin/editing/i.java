package io.flutter.plugin.editing;

import F.C0038n;
import P.C0064m;
import P0.t;
import Z0.n;
import Z0.p;
import android.graphics.Rect;
import com.yandex.varioqub.config.model.ConfigValue;

/* loaded from: classes.dex */
public final class i implements a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ j f7814a;

    public /* synthetic */ i(j jVar) {
        this.f7814a = jVar;
    }

    public void a(int i2, n nVar) {
        j jVar = this.f7814a;
        jVar.c();
        jVar.f7820f = nVar;
        jVar.f7819e = new C0064m(2, i2);
        jVar.f7822h.e(jVar);
        C0038n c0038n = nVar.f2016j;
        jVar.f7822h = new f(c0038n != null ? (p) c0038n.f534c : null, jVar.f7815a);
        jVar.d(nVar);
        jVar.f7823i = true;
        if (jVar.f7819e.f1355b == 3) {
            jVar.f7830p = false;
        }
        jVar.f7827m = null;
        jVar.f7822h.a(jVar);
    }

    public void b(double d2, double d3, double[] dArr) {
        j jVar = this.f7814a;
        jVar.getClass();
        double[] dArr2 = new double[4];
        boolean z2 = dArr[3] == ConfigValue.DOUBLE_DEFAULT_VALUE && dArr[7] == ConfigValue.DOUBLE_DEFAULT_VALUE && dArr[15] == 1.0d;
        double d4 = dArr[12];
        double d5 = dArr[15];
        double d6 = d4 / d5;
        dArr2[1] = d6;
        dArr2[0] = d6;
        double d7 = dArr[13] / d5;
        dArr2[3] = d7;
        dArr2[2] = d7;
        D0.j jVar2 = new D0.j(z2, dArr, dArr2);
        jVar2.a(d2, ConfigValue.DOUBLE_DEFAULT_VALUE);
        jVar2.a(d2, d3);
        jVar2.a(ConfigValue.DOUBLE_DEFAULT_VALUE, d3);
        double d8 = jVar.f7815a.getContext().getResources().getDisplayMetrics().density;
        jVar.f7827m = new Rect((int) (dArr2[0] * d8), (int) (dArr2[2] * d8), (int) Math.ceil(dArr2[1] * d8), (int) Math.ceil(dArr2[3] * d8));
    }

    public void c(p pVar) {
        p pVar2;
        int i2;
        int i3;
        j jVar = this.f7814a;
        t tVar = jVar.f7815a;
        if (!jVar.f7823i && (pVar2 = jVar.f7829o) != null && (i2 = pVar2.f2026d) >= 0 && (i3 = pVar2.f2027e) > i2) {
            int i4 = i3 - i2;
            int i5 = pVar.f2027e;
            int i6 = pVar.f2026d;
            boolean z2 = true;
            if (i4 == i5 - i6) {
                int i7 = 0;
                while (true) {
                    if (i7 >= i4) {
                        z2 = false;
                        break;
                    } else if (pVar2.f2023a.charAt(i7 + i2) != pVar.f2023a.charAt(i7 + i6)) {
                        break;
                    } else {
                        i7++;
                    }
                }
            }
            jVar.f7823i = z2;
        }
        jVar.f7829o = pVar;
        jVar.f7822h.f(pVar);
        if (jVar.f7823i) {
            jVar.f7816b.restartInput(tVar);
            jVar.f7823i = false;
        }
    }
}
