package defpackage;

import android.content.Context;
import android.os.PowerManager;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.scooters.ignition.data.i;
import com.yandex.go.taxi.order.y;
import java.net.ProxySelector;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import okhttp3.OkHttpClient;
import ru.yandex.taxi.activity.g;
import ru.yandex.taxi.am.e;
import ru.yandex.taxi.am.f0;
import ru.yandex.taxi.am.internal.d;
import ru.yandex.taxi.am.internal.f;
import ru.yandex.taxi.am.k;
import ru.yandex.taxi.am.m;
import ru.yandex.taxi.am.o;
import ru.yandex.taxi.am.r;
import ru.yandex.taxi.am.s;
import ru.yandex.taxi.am.token.a;
import ru.yandex.taxi.analytics.j;
import ru.yandex.taxi.jobs.b;
import ru.yandex.taxi.order.l;
import ru.yandex.taxi.startup.launch.c;
import ru.yandex.taxi.startup.launch.h;
import ru.yandex.taxi.systemrequeirements.location.n;
import ru.yandex.taxi.ui.MainUiAvailabilityMonitor;

/* loaded from: classes9.dex */
public final class ur3 implements v7p {
    public final /* synthetic */ int a;
    public final xvf0 b;
    public final xvf0 c;
    public final xvf0 d;
    public final xvf0 e;
    public final xvf0 f;
    public final xvf0 g;
    public final xvf0 h;
    public final xvf0 i;
    public final xvf0 j;
    public final xvf0 k;
    public final xvf0 l;
    public final xvf0 m;
    public final xvf0 n;
    public final xvf0 o;
    public final xvf0 p;

    public /* synthetic */ ur3(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, xvf0 xvf0Var9, xvf0 xvf0Var10, xvf0 xvf0Var11, xvf0 xvf0Var12, xvf0 xvf0Var13, xvf0 xvf0Var14, xvf0 xvf0Var15, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
        this.h = xvf0Var7;
        this.i = xvf0Var8;
        this.j = xvf0Var9;
        this.k = xvf0Var10;
        this.l = xvf0Var11;
        this.m = xvf0Var12;
        this.n = xvf0Var13;
        this.o = xvf0Var14;
        this.p = xvf0Var15;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.p;
        xvf0 xvf0Var2 = this.o;
        xvf0 xvf0Var3 = this.n;
        xvf0 xvf0Var4 = this.m;
        xvf0 xvf0Var5 = this.l;
        xvf0 xvf0Var6 = this.k;
        xvf0 xvf0Var7 = this.j;
        xvf0 xvf0Var8 = this.i;
        xvf0 xvf0Var9 = this.h;
        xvf0 xvf0Var10 = this.g;
        xvf0 xvf0Var11 = this.f;
        xvf0 xvf0Var12 = this.e;
        xvf0 xvf0Var13 = this.d;
        xvf0 xvf0Var14 = this.c;
        xvf0 xvf0Var15 = this.b;
        switch (i) {
            case 0:
                return new r((Lifecycle) xvf0Var15.get(), (w94) xvf0Var14.get(), (g) xvf0Var13.get(), (ru.yandex.taxi.am.g) xvf0Var12.get(), (k) xvf0Var11.get(), (c) xvf0Var10.get(), (e) xvf0Var9.get(), (f) xvf0Var8.get(), (d) xvf0Var7.get(), (fhz) xvf0Var6.get(), (tt2) xvf0Var5.get(), (s) xvf0Var4.get(), (ip90) xvf0Var3.get(), (lnj) xvf0Var2.get(), (im51) xvf0Var.get());
            case 1:
                return new a19((Context) xvf0Var15.get(), (rs2) xvf0Var14.get(), (h) xvf0Var13.get(), (kb20) xvf0Var12.get(), (j5z) xvf0Var11.get(), (n) xvf0Var10.get(), (po21) xvf0Var9.get(), (j) xvf0Var8.get(), (ru.yandex.taxi.am.g) xvf0Var7.get(), (a) xvf0Var6.get(), (f0) xvf0Var5.get(), (m) xvf0Var4.get(), (u02) xvf0Var3.get(), (o) xvf0Var2.get(), (pwy0) xvf0Var.get());
            case 2:
                return new seu(24);
            case 3:
                sa7 sa7Var = (sa7) xvf0Var15.get();
                pw60 pw60Var = (pw60) xvf0Var14.get();
                com.yandex.go.zone.repository.d dVar = (com.yandex.go.zone.repository.d) xvf0Var13.get();
                v7u v7uVar = (v7u) xvf0Var12.get();
                h hVar = (h) xvf0Var11.get();
                h7u0 h7u0Var = (h7u0) xvf0Var10.get();
                com.yandex.go.antirobot.c cVar = (com.yandex.go.antirobot.c) xvf0Var9.get();
                koe0 koe0Var = (koe0) xvf0Var8.get();
                cjy0 cjy0Var = (cjy0) xvf0Var7.get();
                w9w0 w9w0Var = (w9w0) xvf0Var6.get();
                ProxySelector proxySelector = (ProxySelector) xvf0Var5.get();
                h3y a = i5m.a(xvf0Var4);
                h3y a2 = i5m.a(xvf0Var3);
                nua0 nua0Var = (nua0) xvf0Var2.get();
                nbj nbjVar = (nbj) xvf0Var.get();
                OkHttpClient.a aVar = new OkHttpClient.a();
                aVar.l = sa7Var;
                aVar.g(30L, TimeUnit.SECONDS);
                aVar.i(30L);
                if (!proxySelector.equals(aVar.n)) {
                    aVar.D = null;
                }
                aVar.n = proxySelector;
                ow60 ow60Var = pw60Var.a.b.a().a ? (ow60) pw60Var.b.getValue() : null;
                if (ow60Var != null) {
                    aVar.h(ow60Var.b, ow60Var.a);
                }
                cjy0Var.getClass();
                com.yandex.go.zone.interceptor.a aVar2 = new com.yandex.go.zone.interceptor.a(dVar);
                ArrayList arrayList = aVar.c;
                arrayList.add(aVar2);
                arrayList.add(v7uVar);
                arrayList.add(new dk0(hVar, a, a2));
                arrayList.add(new uc(20, h7u0Var));
                arrayList.add(new uc(5, cVar));
                arrayList.add(new uc(8, koe0Var));
                arrayList.add(new uc(4, w9w0Var));
                aVar.a(new uc(3, nbjVar));
                nua0Var.getClass();
                return new OkHttpClient(aVar);
            case 4:
                return new y((tse) xvf0Var15.get(), (h6r) xvf0Var14.get(), (l) xvf0Var13.get(), (ru.yandex.taxi.order.k) xvf0Var12.get(), (com.yandex.go.taxi.order.analytics.a) xvf0Var11.get(), (jtq0) xvf0Var10.get(), (ysg) xvf0Var9.get(), (b) xvf0Var8.get(), (PowerManager) xvf0Var7.get(), (com.yandex.go.taxi.order.provider.a) xvf0Var6.get(), (d1t) xvf0Var5.get(), (MainUiAvailabilityMonitor) xvf0Var4.get(), (a880) xvf0Var3.get(), (com.yandex.go.xiva.domain.f) xvf0Var2.get(), (com.yandex.go.taxi.order.net.xiva.d) xvf0Var.get());
            case 5:
                return new com.yandex.go.scooters.ignition.domain.k((tt2) xvf0Var15.get(), (ky2) xvf0Var14.get(), (m2o0) xvf0Var13.get(), (tsn0) xvf0Var12.get(), (com.yandex.go.scooters.ignition.domain.m) xvf0Var11.get(), (com.yandex.go.scooters.ignition.data.b) xvf0Var10.get(), (com.yandex.go.scooters.ignition.analytics.a) xvf0Var9.get(), (brn0) xvf0Var8.get(), (com.yandex.go.scooters.ignition.data.d) xvf0Var7.get(), (com.yandex.go.scooters.ignition.data.a) xvf0Var6.get(), (vqn0) xvf0Var5.get(), (com.yandex.go.scooters.ignition.data.c) xvf0Var4.get(), (jsn0) xvf0Var3.get(), (i) xvf0Var2.get(), (psn0) xvf0Var.get());
            case 6:
                tse tseVar = (tse) xvf0Var15.get();
                ylp0 ylp0Var = (ylp0) xvf0Var13.get();
                d2c d2cVar = (d2c) xvf0Var11.get();
                c1f c1fVar = (c1f) xvf0Var10.get();
                z660 z660Var = (z660) xvf0Var9.get();
                n170 n170Var = (n170) xvf0Var8.get();
                jc00 jc00Var = (jc00) xvf0Var7.get();
                xsv0 xsv0Var = (xsv0) xvf0Var6.get();
                com.yandex.go.models.b bVar = (com.yandex.go.models.b) xvf0Var5.get();
                hwe0 hwe0Var = (hwe0) xvf0Var4.get();
                return new d3s0(tseVar, ylp0Var, d2cVar, c1fVar, z660Var, n170Var, jc00Var, xsv0Var, bVar, hwe0Var);
            default:
                return new ru.yandex.taxi.summary.promotions.repository.e((on2) xvf0Var15.get(), (tt2) xvf0Var14.get(), (ru.yandex.taxi.summary.promotions.models.a) xvf0Var13.get(), (ru.yandex.taxi.summary.promotions.models.b) xvf0Var12.get(), (uze0) xvf0Var11.get(), (qbl0) xvf0Var10.get(), (ru.yandex.taxi.summary.promotions.factory.a) xvf0Var9.get(), (jas0) xvf0Var8.get(), (ru.yandex.taxi.summary.promotions.repository.a) xvf0Var7.get(), (smv0) xvf0Var6.get(), (wiq0) xvf0Var5.get(), (Lifecycle) xvf0Var4.get(), (rqo) xvf0Var3.get(), (qpf0) xvf0Var2.get(), (bgx0) xvf0Var.get());
        }
    }

    public ur3(w8r w8rVar, n3w n3wVar, p9p p9pVar, qsn qsnVar, mwq mwqVar, p9p p9pVar2, xvf0 xvf0Var, xvf0 xvf0Var2, bvx bvxVar, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, eqh eqhVar, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8) {
        this.a = 2;
        this.b = n3wVar;
        this.c = p9pVar;
        this.d = qsnVar;
        this.e = mwqVar;
        this.f = p9pVar2;
        this.g = xvf0Var;
        this.h = xvf0Var2;
        this.i = bvxVar;
        this.j = xvf0Var3;
        this.k = xvf0Var4;
        this.l = xvf0Var5;
        this.m = eqhVar;
        this.n = xvf0Var6;
        this.o = xvf0Var7;
        this.p = xvf0Var8;
    }
}
