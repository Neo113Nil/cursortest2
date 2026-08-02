package defpackage;

import android.content.Context;
import com.yandex.go.chargers.data.e;
import com.yandex.go.chargers.data.f;
import com.yandex.go.places.map.data.repositories.h;
import com.yandex.go.scooters.discovery.j;
import ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor.a;
import ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor.c;
import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.delivery.pin.k;
import ru.yandex.taxi.logistics.sdk.address_details.api.b;
import ru.yandex.taxi.orderbutton.summary.base.interactors.i;
import ru.yandex.taxi.preorder.map.n;

/* loaded from: classes14.dex */
public final class zs0 implements v7p {
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
    public final xvf0 q;
    public final xvf0 r;

    public /* synthetic */ zs0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, v7p v7pVar, v7p v7pVar2, xvf0 xvf0Var9, xvf0 xvf0Var10, v7p v7pVar3, xvf0 xvf0Var11, xvf0 xvf0Var12, xvf0 xvf0Var13, v7p v7pVar4, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
        this.h = xvf0Var7;
        this.i = xvf0Var8;
        this.j = v7pVar;
        this.k = v7pVar2;
        this.l = xvf0Var9;
        this.m = xvf0Var10;
        this.n = v7pVar3;
        this.o = xvf0Var11;
        this.p = xvf0Var12;
        this.q = xvf0Var13;
        this.r = v7pVar4;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.j;
        xvf0 xvf0Var2 = this.h;
        xvf0 xvf0Var3 = this.e;
        xvf0 xvf0Var4 = this.p;
        xvf0 xvf0Var5 = this.o;
        xvf0 xvf0Var6 = this.l;
        xvf0 xvf0Var7 = this.k;
        xvf0 xvf0Var8 = this.g;
        xvf0 xvf0Var9 = this.f;
        xvf0 xvf0Var10 = this.d;
        xvf0 xvf0Var11 = this.c;
        xvf0 xvf0Var12 = this.r;
        xvf0 xvf0Var13 = this.q;
        xvf0 xvf0Var14 = this.n;
        xvf0 xvf0Var15 = this.m;
        xvf0 xvf0Var16 = this.i;
        xvf0 xvf0Var17 = this.b;
        switch (i) {
            case 0:
                return new a((dv8) xvf0Var17.get(), (b) ((s90) xvf0Var7).get(), (f4l0) xvf0Var11.get(), (qt0) ((n3w) xvf0Var6).a, (cu0) xvf0Var10.get(), (p6s) xvf0Var3.get(), (yj70) ((l180) xvf0Var15).get(), (zqb0) xvf0Var9.get(), (m2v) ((p4) xvf0Var14).get(), (xt0) ((c1) xvf0Var5).get(), (xe00) xvf0Var8.get(), (gzh) xvf0Var2.get(), (oy60) xvf0Var16.get(), (boj0) ((ncb) xvf0Var4).get(), (c) ((f2b) xvf0Var13).get(), (m2v) ((js0) xvf0Var12).get(), (ru.yandex.taxi.logistics.sdk.photocomments.domain.a) xvf0Var.get());
            case 1:
                return new vk9((w030) xvf0Var17.get(), (y50) xvf0Var11.get(), (fva0) xvf0Var10.get(), this.e, (vn9) xvf0Var9.get(), (xma) xvf0Var8.get(), this.h, (ol9) xvf0Var16.get(), this.j, this.k, this.l, (tk9) xvf0Var15.get(), (ok9) xvf0Var14.get(), this.o, this.p, (com.yandex.go.chargers.data.a) xvf0Var13.get(), (yc) xvf0Var12);
            case 2:
                return new com.yandex.go.chargers.offer.domain.b((em9) ((uxf) xvf0Var7).get(), (com.yandex.go.chargers.surge.domain.a) xvf0Var17.get(), (pwy0) ((vxf) xvf0Var6).get(), (iwa) xvf0Var11.get(), (com.yandex.go.chargers.offer.data.mappers.b) xvf0Var10.get(), (k9a) xvf0Var3.get(), (com.yandex.go.chargers.offer.data.b) xvf0Var9.get(), (com.yandex.go.chargers.offer.data.a) xvf0Var8.get(), (com.yandex.go.chargers.domain.a) xvf0Var2.get(), (o9a) xvf0Var16.get(), (f8a) xvf0Var.get(), (g6a) xvf0Var15.get(), (r9a) xvf0Var14.get(), (com.yandex.go.chargers.offer.data.mappers.a) xvf0Var5.get(), (rpa) xvf0Var4.get(), (com.yandex.go.chargers.payments.data.a) xvf0Var13.get(), (i8a) xvf0Var12.get());
            case 3:
                return new com.yandex.go.chargers.station.data.c((tt2) ((lxf) xvf0Var7).get(), (k7x0) xvf0Var17.get(), (pwy0) xvf0Var11.get(), (ru.yandex.taxi.widget.c) xvf0Var10.get(), i5m.a(xvf0Var3), (iwa) xvf0Var9.get(), (gxa) xvf0Var8.get(), (f) xvf0Var2.get(), (com.yandex.go.chargers.station.data.mapper.a) xvf0Var16.get(), (com.yandex.go.chargers.domain.a) xvf0Var.get(), (lpa) xvf0Var6.get(), (g6a) xvf0Var15.get(), (rpa) xvf0Var14.get(), (e) xvf0Var5.get(), (rda) xvf0Var4.get(), (com.yandex.go.chargers.payments.data.a) xvf0Var13.get(), (ura) xvf0Var12.get());
            case 4:
                return new wzb((AddressResolveRepository) xvf0Var17.get(), (i130) xvf0Var11.get(), (mhf) xvf0Var10.get(), (uet0) xvf0Var3.get(), (yit0) xvf0Var9.get(), (y9y0) xvf0Var8.get(), (n050) xvf0Var2.get(), (n3o) xvf0Var16.get(), this.j, (oep0) xvf0Var7.get(), (wiq0) xvf0Var6.get(), (avd0) xvf0Var15.get(), (tjt0) xvf0Var14.get(), (zuj0) xvf0Var5.get(), (i6r) xvf0Var4.get(), (hyb) ((srb) xvf0Var13).get(), (y4k0) xvf0Var12.get());
            case 5:
                return new com.yandex.go.places.map.ui.pinwar.b((Context) ((x4g) xvf0Var7).get(), (ah00) xvf0Var17.get(), (odc0) xvf0Var11.get(), (h) xvf0Var10.get(), (go80) xvf0Var3.get(), (com.yandex.go.places.map.ui.pinwar.a) xvf0Var9.get(), (gdc0) xvf0Var8.get(), (pwy0) xvf0Var2.get(), (ohh) xvf0Var16.get(), (d30) xvf0Var.get(), (qdc0) xvf0Var6.get(), (go10) xvf0Var15.get(), (u050) xvf0Var14.get(), (com.yandex.go.places.impl.domain.interactors.map.f) xvf0Var5.get(), (yac0) xvf0Var4.get(), (tbc0) xvf0Var13.get(), (tse) xvf0Var12.get());
            case 6:
                return new n((ru.yandex.taxi.combo.factory.a) xvf0Var17.get(), (wiq0) xvf0Var11.get(), (uze0) xvf0Var10.get(), (ru.yandex.taxi.preorder.map.interactor.c) xvf0Var3.get(), (pwy0) xvf0Var9.get(), (tse) xvf0Var8.get(), (tt2) xvf0Var2.get(), (a3v) xvf0Var16.get(), (nj6) xvf0Var.get(), (ru.yandex.taxi.preorder.map.c) xvf0Var7.get(), (r0c0) xvf0Var6.get(), (Context) xvf0Var15.get(), (k) xvf0Var14.get(), (com.yandex.go.taxi.summary.map.clarify_source_point.interactor.a) xvf0Var5.get(), (oyb0) xvf0Var4.get(), (nyb0) xvf0Var13.get(), (ru.yandex.taxi.preorder.map.interactor.a) ((zo0) xvf0Var12).get());
            case 7:
                return new vin0((Context) xvf0Var17.get(), (j5z) xvf0Var11.get(), (ah00) xvf0Var10.get(), (tt2) ((e7g) xvf0Var7).get(), (tse) xvf0Var3.get(), (ip11) xvf0Var9.get(), (a3v) xvf0Var8.get(), (a850) xvf0Var2.get(), (fva0) xvf0Var16.get(), i5m.a(xvf0Var), (t4s0) xvf0Var15.get(), (j) xvf0Var14.get(), (lzm0) xvf0Var5.get(), (xzm0) xvf0Var4.get(), (yhn0) ((n3w) xvf0Var6).a, (w040) ((fy30) xvf0Var13).get(), (g8n0) ((mam0) xvf0Var12).get());
            case 8:
                return new qtq0((x22) xvf0Var17.get(), i5m.a(xvf0Var11), i5m.a(xvf0Var10), i5m.a(xvf0Var3), i5m.a(xvf0Var9), i5m.a(xvf0Var8), (y5u0) ((vo3) xvf0Var7).get(), (at2) xvf0Var2.get(), (ml21) xvf0Var16.get(), (k020) xvf0Var.get(), (ks10) xvf0Var6.get(), (ney0) xvf0Var15.get(), (lqo) xvf0Var14.get(), i5m.a(xvf0Var5), (xt21) xvf0Var4.get(), (kk60) ((t160) xvf0Var13).get(), i5m.a(xvf0Var12));
            case 9:
                return new com.yandex.go.taxi.main.h(((w2g) xvf0Var10).b.c(), ((w2g) xvf0Var3).b.j1(), ((w2g) xvf0Var9).b.H(), ((w2g) xvf0Var8).b.r0(), ((w2g) xvf0Var2).b.i1(), ((x2g) xvf0Var16).b.z(), ((w2g) xvf0Var).b.o0(), i5m.a(xvf0Var17), ((w2g) xvf0Var7).b.y(), ((w2g) xvf0Var6).b.G(), ((x2g) xvf0Var15).b.C0(), ((w2g) xvf0Var14).b.b0(), ((w2g) xvf0Var5).b.c1(), ((w2g) xvf0Var4).b.D0(), i5m.a(xvf0Var11), ((x2g) xvf0Var13).b.i(), ((w2g) xvf0Var12).b.f0());
            case 10:
                aj70 aj70Var = (aj70) xvf0Var17.get();
                uze0 uze0Var = (uze0) xvf0Var11.get();
                tt2 tt2Var = (tt2) xvf0Var10.get();
                a201 a201Var = (a201) ((ibz0) xvf0Var7).get();
                fjx0 fjx0Var = (fjx0) xvf0Var3.get();
                g0z g0zVar = (g0z) ((h0z) xvf0Var6).get();
                h3y a = i5m.a((ju9) xvf0Var15);
                h3y a2 = i5m.a((fwc) xvf0Var14);
                ro0 ro0Var = (ro0) xvf0Var9.get();
                iu6 iu6Var = (iu6) xvf0Var8.get();
                pwy0 pwy0Var = (pwy0) xvf0Var2.get();
                ru.yandex.taxi.summary.promotions.repository.e eVar = (ru.yandex.taxi.summary.promotions.repository.e) xvf0Var16.get();
                mo40 mo40Var = (mo40) xvf0Var.get();
                return new i(aj70Var, uze0Var, tt2Var, a201Var, fjx0Var, g0zVar, a, a2, ro0Var, iu6Var, pwy0Var, eVar, mo40Var, (ru.yandex.taxi.preorder.tollroad.data.e) xvf0Var13.get(), (ru.yandex.taxi.preorder.tollroad.a) xvf0Var12.get());
            case 11:
                return new com.yandex.go.tariffcard.ui.e((Context) ((t0g) xvf0Var7).get(), (zuj0) xvf0Var17.get(), (ru.yandex.taxi.widget.utils.e) xvf0Var11.get(), (fkx0) ((rbx0) xvf0Var6).get(), (tt2) xvf0Var10.get(), (com.yandex.go.route.interactor.c) xvf0Var3.get(), (com.yandex.go.tariffcard.ui.f) ((t4v0) xvf0Var15).get(), (viv0) xvf0Var9.get(), (sjp) ((q02) xvf0Var14).get(), (sfx0) xvf0Var8.get(), (rxy) xvf0Var2.get(), (ru.yandex.taxi.preorder.source.cars.a) xvf0Var16.get(), (com.yandex.go.pin.api.widget.b) xvf0Var.get(), (s0c0) xvf0Var5.get(), (com.yandex.go.tariffcard.ui.adapter.header.multiclass.c) ((n7i0) xvf0Var4).get(), (pwy0) xvf0Var13.get(), (q4g) ((xat) xvf0Var12).get());
            default:
                return new nu21((Context) xvf0Var17.get(), (mv21) ((q720) xvf0Var16).get(), (bv21) ((q720) xvf0Var).get(), (kl21) ((q720) xvf0Var7).get(), (kp21) ((q720) xvf0Var6).get(), (vl21) ((q720) xvf0Var15).get(), (uxj0) ((q720) xvf0Var14).get(), (fqr0) ((q720) xvf0Var5).get(), (meb) ((br10) xvf0Var4).get(), (az10) ((q720) xvf0Var13).get(), (wgu) ((br10) xvf0Var12).get(), i5m.a(xvf0Var11), (el21) xvf0Var10.get(), (avf0) xvf0Var3.get(), (bn21) xvf0Var9.get(), (ph9) xvf0Var8.get(), (z5z) xvf0Var2.get());
        }
    }

    public /* synthetic */ zs0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, xvf0 xvf0Var9, xvf0 xvf0Var10, xvf0 xvf0Var11, xvf0 xvf0Var12, xvf0 xvf0Var13, xvf0 xvf0Var14, xvf0 xvf0Var15, xvf0 xvf0Var16, xvf0 xvf0Var17, int i) {
        this.a = i;
        this.k = xvf0Var;
        this.b = xvf0Var2;
        this.c = xvf0Var3;
        this.d = xvf0Var4;
        this.e = xvf0Var5;
        this.f = xvf0Var6;
        this.g = xvf0Var7;
        this.h = xvf0Var8;
        this.i = xvf0Var9;
        this.j = xvf0Var10;
        this.l = xvf0Var11;
        this.m = xvf0Var12;
        this.n = xvf0Var13;
        this.o = xvf0Var14;
        this.p = xvf0Var15;
        this.q = xvf0Var16;
        this.r = xvf0Var17;
    }

    public zs0(h420 h420Var, q720 q720Var, q720 q720Var2, q720 q720Var3, q720 q720Var4, q720 q720Var5, q720 q720Var6, q720 q720Var7, br10 br10Var, q720 q720Var8, br10 br10Var2, xvf0 xvf0Var, edf0 edf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, bwy bwyVar) {
        this.a = 12;
        this.b = h420Var;
        this.i = q720Var;
        this.j = q720Var2;
        this.k = q720Var3;
        this.l = q720Var4;
        this.m = q720Var5;
        this.n = q720Var6;
        this.o = q720Var7;
        this.p = br10Var;
        this.q = q720Var8;
        this.r = br10Var2;
        this.c = xvf0Var;
        this.d = edf0Var;
        this.e = xvf0Var2;
        this.f = xvf0Var3;
        this.g = xvf0Var4;
        this.h = bwyVar;
    }

    public zs0(xvf0 xvf0Var, s90 s90Var, xvf0 xvf0Var2, n3w n3wVar, xvf0 xvf0Var3, xvf0 xvf0Var4, l180 l180Var, xvf0 xvf0Var5, p4 p4Var, c1 c1Var, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, ncb ncbVar, f2b f2bVar, js0 js0Var, xvf0 xvf0Var9) {
        this.a = 0;
        this.b = xvf0Var;
        this.k = s90Var;
        this.c = xvf0Var2;
        this.l = n3wVar;
        this.d = xvf0Var3;
        this.e = xvf0Var4;
        this.m = l180Var;
        this.f = xvf0Var5;
        this.n = p4Var;
        this.o = c1Var;
        this.g = xvf0Var6;
        this.h = xvf0Var7;
        this.i = xvf0Var8;
        this.p = ncbVar;
        this.q = f2bVar;
        this.r = js0Var;
        this.j = xvf0Var9;
    }

    public zs0(t0g t0gVar, w0g w0gVar, xvf0 xvf0Var, rbx0 rbx0Var, t0g t0gVar2, b1g b1gVar, t4v0 t4v0Var, b1g b1gVar2, q02 q02Var, b1g b1gVar3, y0g y0gVar, g0g g0gVar, w0g w0gVar2, w0g w0gVar3, n7i0 n7i0Var, x0g x0gVar, xat xatVar) {
        this.a = 11;
        this.k = t0gVar;
        this.b = w0gVar;
        this.c = xvf0Var;
        this.l = rbx0Var;
        this.d = t0gVar2;
        this.e = b1gVar;
        this.m = t4v0Var;
        this.f = b1gVar2;
        this.n = q02Var;
        this.g = b1gVar3;
        this.h = y0gVar;
        this.i = g0gVar;
        this.j = w0gVar2;
        this.o = w0gVar3;
        this.p = n7i0Var;
        this.q = x0gVar;
        this.r = xatVar;
    }

    public zs0(j7g j7gVar, k7g k7gVar, k7g k7gVar2, e7g e7gVar, j7g j7gVar2, n7g n7gVar, j7g j7gVar3, k7g k7gVar3, l7g l7gVar, k7g k7gVar4, n7g n7gVar2, sw10 sw10Var, jzi0 jzi0Var, xvf0 xvf0Var, n3w n3wVar, fy30 fy30Var, mam0 mam0Var) {
        this.a = 7;
        this.b = j7gVar;
        this.c = k7gVar;
        this.d = k7gVar2;
        this.k = e7gVar;
        this.e = j7gVar2;
        this.f = n7gVar;
        this.g = j7gVar3;
        this.h = k7gVar3;
        this.i = l7gVar;
        this.j = k7gVar4;
        this.m = n7gVar2;
        this.n = sw10Var;
        this.o = jzi0Var;
        this.p = xvf0Var;
        this.l = n3wVar;
        this.q = fy30Var;
        this.r = mam0Var;
    }

    public zs0(xvf0 xvf0Var, xvf0 xvf0Var2, eqh eqhVar, eqh eqhVar2, xvf0 xvf0Var3, eqh eqhVar3, vo3 vo3Var, eqh eqhVar4, n3w n3wVar, eqh eqhVar5, xvf0 xvf0Var4, xvf0 xvf0Var5, h420 h420Var, xvf0 xvf0Var6, xvf0 xvf0Var7, t160 t160Var, xvf0 xvf0Var8) {
        this.a = 8;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = eqhVar;
        this.e = eqhVar2;
        this.f = xvf0Var3;
        this.g = eqhVar3;
        this.k = vo3Var;
        this.h = eqhVar4;
        this.i = n3wVar;
        this.j = eqhVar5;
        this.l = xvf0Var4;
        this.m = xvf0Var5;
        this.n = h420Var;
        this.o = xvf0Var6;
        this.p = xvf0Var7;
        this.q = t160Var;
        this.r = xvf0Var8;
    }

    public zs0(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, ibz0 ibz0Var, xvf0 xvf0Var4, h0z h0zVar, ju9 ju9Var, fwc fwcVar, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, xvf0 xvf0Var9, xvf0 xvf0Var10, xvf0 xvf0Var11, xvf0 xvf0Var12, xvf0 xvf0Var13) {
        this.a = 10;
        this.b = xvf0Var;
        this.c = xvf0Var2;
        this.d = xvf0Var3;
        this.k = ibz0Var;
        this.e = xvf0Var4;
        this.l = h0zVar;
        this.m = ju9Var;
        this.n = fwcVar;
        this.f = xvf0Var5;
        this.g = xvf0Var6;
        this.h = xvf0Var7;
        this.i = xvf0Var8;
        this.j = xvf0Var9;
        this.o = xvf0Var10;
        this.p = xvf0Var11;
        this.q = xvf0Var12;
        this.r = xvf0Var13;
    }

    public zs0(uxf uxfVar, mu7 mu7Var, vxf vxfVar, uxf uxfVar2, wi7 wi7Var, xvf0 xvf0Var, xvf0 xvf0Var2, ht0 ht0Var, fr3 fr3Var, xvf0 xvf0Var3, xvf0 xvf0Var4, uxf uxfVar3, uxf uxfVar4, dx9 dx9Var, uxf uxfVar5, uxf uxfVar6, xvf0 xvf0Var5) {
        this.a = 2;
        this.k = uxfVar;
        this.b = mu7Var;
        this.l = vxfVar;
        this.c = uxfVar2;
        this.d = wi7Var;
        this.e = xvf0Var;
        this.f = xvf0Var2;
        this.g = ht0Var;
        this.h = fr3Var;
        this.i = xvf0Var3;
        this.j = xvf0Var4;
        this.m = uxfVar3;
        this.n = uxfVar4;
        this.o = dx9Var;
        this.p = uxfVar5;
        this.q = uxfVar6;
        this.r = xvf0Var5;
    }

    public zs0(w2g w2gVar, w2g w2gVar2, w2g w2gVar3, w2g w2gVar4, w2g w2gVar5, x2g x2gVar, w2g w2gVar6, xvf0 xvf0Var, w2g w2gVar7, w2g w2gVar8, x2g x2gVar2, w2g w2gVar9, w2g w2gVar10, w2g w2gVar11, xvf0 xvf0Var2, x2g x2gVar3, w2g w2gVar12) {
        this.a = 9;
        this.d = w2gVar;
        this.e = w2gVar2;
        this.f = w2gVar3;
        this.g = w2gVar4;
        this.h = w2gVar5;
        this.i = x2gVar;
        this.j = w2gVar6;
        this.b = xvf0Var;
        this.k = w2gVar7;
        this.l = w2gVar8;
        this.m = x2gVar2;
        this.n = w2gVar9;
        this.o = w2gVar10;
        this.p = w2gVar11;
        this.c = xvf0Var2;
        this.q = x2gVar3;
        this.r = w2gVar12;
    }
}
