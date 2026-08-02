package defpackage;

import android.app.Activity;
import com.yandex.go.chargers.data.q;
import com.yandex.go.payments.shared.f;
import com.yandex.go.payments.shared.v;
import com.yandex.go.payments.shared.y;
import com.yandex.go.scooters.domain.p;
import com.yandex.go.superapp.order.multi.old.provider.g;
import ru.yandex.taxi.linked_order.provider.d;
import ru.yandex.taxi.persuggest.fingerprint.c;
import ru.yandex.taxi.persuggest.source.a;
import ru.yandex.taxi.preorder.source.userposition.b;

/* loaded from: classes9.dex */
public final class x03 implements v7p {
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

    public /* synthetic */ x03(xvf0 xvf0Var, v7p v7pVar, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, xvf0 xvf0Var9, xvf0 xvf0Var10, xvf0 xvf0Var11, xvf0 xvf0Var12, xvf0 xvf0Var13, xvf0 xvf0Var14, xvf0 xvf0Var15, xvf0 xvf0Var16, int i) {
        this.a = i;
        this.b = xvf0Var;
        this.c = v7pVar;
        this.d = xvf0Var2;
        this.e = xvf0Var3;
        this.f = xvf0Var4;
        this.g = xvf0Var5;
        this.h = xvf0Var6;
        this.i = xvf0Var7;
        this.j = xvf0Var8;
        this.k = xvf0Var9;
        this.l = xvf0Var10;
        this.m = xvf0Var11;
        this.n = xvf0Var12;
        this.o = xvf0Var13;
        this.p = xvf0Var14;
        this.q = xvf0Var15;
        this.r = xvf0Var16;
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.m;
        xvf0 xvf0Var2 = this.l;
        xvf0 xvf0Var3 = this.i;
        xvf0 xvf0Var4 = this.r;
        xvf0 xvf0Var5 = this.q;
        xvf0 xvf0Var6 = this.p;
        xvf0 xvf0Var7 = this.o;
        xvf0 xvf0Var8 = this.n;
        xvf0 xvf0Var9 = this.k;
        xvf0 xvf0Var10 = this.j;
        xvf0 xvf0Var11 = this.h;
        xvf0 xvf0Var12 = this.g;
        xvf0 xvf0Var13 = this.f;
        xvf0 xvf0Var14 = this.e;
        xvf0 xvf0Var15 = this.d;
        xvf0 xvf0Var16 = this.c;
        xvf0 xvf0Var17 = this.b;
        switch (i) {
            case 0:
                return new a((km21) xvf0Var17.get(), (ru.yandex.taxi.persuggest.fingerprint.a) xvf0Var16.get(), (c) xvf0Var15.get(), (dox0) xvf0Var14.get(), (b) xvf0Var13.get(), (rta0) xvf0Var12.get(), (fif) xvf0Var11.get(), (ru.yandex.taxi.preorder.source.userposition.a) xvf0Var3.get(), (ohf) xvf0Var10.get(), (tta0) xvf0Var9.get(), (dhe0) xvf0Var2.get(), (ru.yandex.taxi.location.lbs.wifi.a) xvf0Var.get(), (o3u) xvf0Var8.get(), (hq0) xvf0Var7.get(), (jc00) xvf0Var6.get(), (ht2) xvf0Var5.get(), (com.yandex.go.address.search.perf.c) xvf0Var4.get());
            case 1:
                return new g((tt2) xvf0Var17.get(), (com.yandex.go.taxi.order.provider.a) xvf0Var16.get(), (com.yandex.go.superapp.order.multi.old.eats.a) xvf0Var15.get(), (bem) xvf0Var14.get(), (d) xvf0Var13.get(), (q) xvf0Var12.get(), (com.yandex.go.taxi.order.repositories.c) xvf0Var11.get(), (ps70) xvf0Var3.get(), (p) xvf0Var10.get(), (ru.yandex.taxi.logistics.deliveries.multiorder.d) xvf0Var9.get(), (pw40) xvf0Var2.get(), (vd7) xvf0Var.get(), (yl40) xvf0Var8.get(), (hit) xvf0Var7.get(), (com.yandex.go.navigator.order.c) xvf0Var6.get(), (vr40) xvf0Var5.get(), (llh) xvf0Var4.get());
            default:
                return new y((Activity) xvf0Var16.get(), (u500) xvf0Var15.get(), (dpr0) xvf0Var14.get(), (fga0) xvf0Var13.get(), (cda0) xvf0Var12.get(), i5m.a(xvf0Var11), this.i, (v) xvf0Var10.get(), (com.yandex.go.payments.shared.a) xvf0Var9.get(), this.l, this.m, (sw6) xvf0Var8.get(), (d90) xvf0Var7.get(), (f) xvf0Var6.get(), (zor0) xvf0Var5.get(), (com.yandex.go.payments.shared.g) xvf0Var4.get());
        }
    }
}
