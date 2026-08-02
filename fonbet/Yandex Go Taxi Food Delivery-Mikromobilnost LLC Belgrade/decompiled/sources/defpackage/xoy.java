package defpackage;

import android.app.Activity;
import android.content.Context;
import ru.yandex.taxi.linked_order.interactor.h;
import ru.yandex.taxi.linked_order.map.b;
import ru.yandex.taxi.linked_order.mapper.a;
import ru.yandex.taxi.multiorder.e;
import ru.yandex.taxi.startup.launch.c;

/* loaded from: classes12.dex */
public final class xoy extends h55 {
    public final h3y D;
    public final hdu E;

    public xoy(h3y h3yVar, hdu hduVar) {
        super(null);
        this.D = h3yVar;
        this.E = hduVar;
    }

    @Override // defpackage.h55
    public final void I(Object obj) {
        ((c) this.D.get()).b("linkedOrder.LaunchRequested", true);
    }

    @Override // defpackage.h55
    public final void J(Object obj) {
        poy poyVar = (poy) obj;
        String str = poyVar.a;
        a3v a3vVar = poyVar.c;
        hdu hduVar = this.E;
        zly zlyVar = (zly) ((h3y) hduVar.a).get();
        m25 m25Var = (m25) ((h3y) hduVar.b).get();
        mf1 mf1Var = new mf1((byte) 0, 25, str);
        zlyVar.getClass();
        Context context = zlyVar.f;
        b bVar = zlyVar.l;
        i130 i130Var = zlyVar.b;
        yi7 yi7Var = zlyVar.e;
        Activity activity = zlyVar.a;
        m25Var.getClass();
        a3vVar.getClass();
        wwf wwfVar = new wwf();
        wwfVar.a = zlyVar;
        wwfVar.b = mf1Var;
        wwfVar.c = a3vVar;
        int i = woy.a[poyVar.b.ordinal()];
        if (i == 1) {
            q5z.h(i130Var);
            q5z.h(activity);
            h i2 = wwfVar.i();
            q5z.h(bVar);
            uq1 uq1Var = zlyVar.c;
            q5z.h(uq1Var);
            q5z.h(yi7Var);
            pho phoVar = zlyVar.d;
            q5z.h(phoVar);
            c9v c9vVar = new c9v(12, new kf00(phoVar), new onr0(phoVar));
            e eVar = zlyVar.o;
            q5z.h(eVar);
            f2z f2zVar = zlyVar.p;
            q5z.h(f2zVar);
            u5c u5cVar = zlyVar.q;
            q5z.h(u5cVar);
            ony onyVar = new ony(i2, bVar, uq1Var, yi7Var, c9vVar, eVar, f2zVar, new ru.yandex.taxi.linked_order.provider.e(u5cVar));
            v8e0 v8e0Var = new v8e0(activity);
            g58 g58Var = new g58();
            z0a0 z0a0Var = zlyVar.n;
            q5z.h(z0a0Var);
            final int i3 = 0;
            A(new dr7(5, i130Var, new wrr(activity, onyVar, v8e0Var, m25Var, a3vVar, g58Var, z0a0Var, 5)), new koy(poyVar.d), new sy60(this) { // from class: voy
                public final /* synthetic */ xoy b;

                {
                    this.b = this;
                }

                @Override // defpackage.sy60
                public final void a() {
                    int i4 = i3;
                    xoy xoyVar = this.b;
                    switch (i4) {
                        case 0:
                            xoyVar.r(new qu(9));
                            break;
                        default:
                            xoyVar.r(new qu(9));
                            break;
                    }
                }
            });
            return;
        }
        if (i != 2) {
            w511.b();
            return;
        }
        tt2 tt2Var = zlyVar.h;
        q5z.h(tt2Var);
        qoy qoyVar = zlyVar.i;
        q5z.h(qoyVar);
        o8a0 o8a0Var = zlyVar.m;
        q5z.h(o8a0Var);
        r1s r1sVar = new r1s(25, qoyVar, mf1Var, new a(o8a0Var));
        zuj0 zuj0Var = zlyVar.g;
        q5z.h(zuj0Var);
        mrj mrjVar = new mrj(13, tt2Var, r1sVar, new a22(zuj0Var));
        q5z.h(context);
        abe abeVar = new abe(context, false, false);
        q5z.h(yi7Var);
        pm5 pm5Var = new pm5(12, yi7Var);
        q5z.h(context);
        y12 y12Var = new y12(abeVar, pm5Var, new amp0(context, a3vVar, new l12()));
        q5z.h(activity);
        q5z.h(i130Var);
        q5z.h(context);
        amp0 amp0Var = new amp0(context, a3vVar, new l12());
        q5z.h(bVar);
        n12 n12Var = new n12(mrjVar, y12Var, activity, i130Var, amp0Var, new ht10(bVar, wwfVar.i(), false, 27));
        final int i4 = 1;
        z(n12Var, new sy60(this) { // from class: voy
            public final /* synthetic */ xoy b;

            {
                this.b = this;
            }

            @Override // defpackage.sy60
            public final void a() {
                int i42 = i4;
                xoy xoyVar = this.b;
                switch (i42) {
                    case 0:
                        xoyVar.r(new qu(9));
                        break;
                    default:
                        xoyVar.r(new qu(9));
                        break;
                }
            }
        });
    }
}
