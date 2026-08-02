package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.view.accessibility.AccessibilityManager;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Lifecycle;
import com.yandex.go.places.organization.card.impl.domain.interactors.map.flex.g;
import com.yandex.go.places.organization.card.impl.domain.interactors.map.flex.j;
import com.yandex.go.route.interactor.c;
import com.yandex.go.superapp.order.multi.old.h;
import com.yandex.go.superapp.tracking.data.e;
import com.yandex.go.taxi.order.details.v2.ui.view.presentation.modal.state.bottom_sheet.RideCardChangeStateEventRepository;
import com.yandex.go.taxi.order.domain.repositories.f0;
import com.yandex.go.taxi.order.view.l;
import com.yandex.messaging.domain.unreadcount.d;
import com.yandex.messaging.internal.v;
import ru.yandex.taxi.address.experiment.q;
import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.clarifypoint.b;
import ru.yandex.taxi.persuggest.clarifypoints.a;
import ru.yandex.taxi.preorder.source.domain.r;
import ru.yandex.taxi.preorder.source.domain.u;
import ru.yandex.taxi.summary.solid.interactor.p;

/* loaded from: classes14.dex */
public final class so4 implements v7p {
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

    public /* synthetic */ so4(xvf0 xvf0Var, xvf0 xvf0Var2, xvf0 xvf0Var3, xvf0 xvf0Var4, xvf0 xvf0Var5, xvf0 xvf0Var6, xvf0 xvf0Var7, xvf0 xvf0Var8, xvf0 xvf0Var9, int i) {
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
    }

    @Override // defpackage.yvf0
    public final Object get() {
        int i = this.a;
        xvf0 xvf0Var = this.j;
        xvf0 xvf0Var2 = this.i;
        xvf0 xvf0Var3 = this.h;
        xvf0 xvf0Var4 = this.g;
        xvf0 xvf0Var5 = this.f;
        xvf0 xvf0Var6 = this.e;
        xvf0 xvf0Var7 = this.d;
        xvf0 xvf0Var8 = this.c;
        xvf0 xvf0Var9 = this.b;
        switch (i) {
            case 0:
                return new ro4();
            case 1:
                return new bu0((Context) xvf0Var9.get(), (hwy0) xvf0Var8.get(), (dci) xvf0Var7.get(), (st2) xvf0Var6.get(), (t0k0) xvf0Var5.get(), (l7x0) xvf0Var4.get(), (jwh) xvf0Var3.get(), (qcp0) xvf0Var2.get(), (qdc) xvf0Var.get());
            case 2:
                return new p99((at2) xvf0Var7.get(), (k020) xvf0Var6.get(), (Looper) xvf0Var5.get(), (to3) xvf0Var4.get(), (o1b0) xvf0Var3.get(), (c8b) xvf0Var2.get(), (x22) xvf0Var.get());
            case 3:
                return new b((nyb) xvf0Var9.get(), (qbl0) xvf0Var8.get(), (wiq0) xvf0Var7.get(), (c) xvf0Var6.get(), (t41) xvf0Var5.get(), (a) xvf0Var4.get(), (com.yandex.go.navigation.screen.c) xvf0Var3.get(), (mzb) xvf0Var2.get(), (rqo) xvf0Var.get());
            case 4:
                return new uyb((i130) xvf0Var9.get(), (mhf) xvf0Var8.get(), (AddressResolveRepository) xvf0Var7.get(), (n050) xvf0Var6.get(), (hyb) xvf0Var5.get(), (u) xvf0Var4.get(), (wiq0) xvf0Var3.get(), (avd0) xvf0Var2.get(), (i6r) xvf0Var.get());
            case 5:
                return new com.yandex.messaging.internal.authorized.chat.notifications.b((Context) xvf0Var9.get(), (o1b0) xvf0Var8.get(), (g6b) xvf0Var7.get(), (i6b) xvf0Var6.get(), (rz10) xvf0Var5.get(), (p150) xvf0Var4.get(), (mi60) xvf0Var3.get(), (pg60) xvf0Var2.get(), (wi60) xvf0Var.get());
            case 6:
                return new bu0((Context) xvf0Var9.get(), (qcp0) xvf0Var8.get(), (hwy0) xvf0Var7.get(), (yuj0) xvf0Var6.get(), (com.yandex.delivery.utils.dialogmanager.impl.b) xvf0Var5.get(), (t0k0) xvf0Var4.get(), (jwh) xvf0Var3.get(), (st2) xvf0Var2.get(), (q8s) xvf0Var.get());
            case 7:
                return new mjt((Context) xvf0Var9.get(), (k020) xvf0Var8.get(), (to3) xvf0Var7.get(), (h9b) xvf0Var6.get(), (ml21) xvf0Var5.get(), (ogu) xvf0Var4.get(), (lqo) xvf0Var3.get(), (ks10) xvf0Var2.get(), (doc) xvf0Var.get());
            case 8:
                return new zzw((Fragment) xvf0Var9.get(), (j0x) xvf0Var8.get(), (ps10) xvf0Var7.get(), (e2k0) xvf0Var6.get(), (zm31) xvf0Var5.get(), (mdb) xvf0Var4.get(), (rz10) xvf0Var3.get(), (ezq) xvf0Var2.get(), (k0b) xvf0Var.get());
            case 9:
                return new uy10((Context) xvf0Var9.get(), (o1b0) xvf0Var8.get(), (k020) xvf0Var7.get(), (ij10) xvf0Var6.get(), (noy0) xvf0Var5.get(), (f3c) xvf0Var4.get(), (rp21) xvf0Var3.get(), (dmt0) xvf0Var2.get(), (u7s) xvf0Var.get());
            case 10:
                return new h((Lifecycle) xvf0Var9.get(), (gu11) xvf0Var8.get(), (l) xvf0Var7.get(), (jt00) xvf0Var6.get(), (hc80) xvf0Var5.get(), (e) xvf0Var4.get(), (l) xvf0Var3.get(), (wr00) xvf0Var2.get(), (f0) xvf0Var.get());
            case 11:
                return new g((qf80) xvf0Var9.get(), (yac0) xvf0Var8.get(), ((Boolean) xvf0Var7.get()).booleanValue(), (com.yandex.go.places.map.data.mappers.a) xvf0Var6.get(), (com.yandex.go.places.map.data.repositories.h) xvf0Var5.get(), (com.yandex.go.places.map.domain.layer.c) xvf0Var4.get(), (tt2) xvf0Var3.get(), (iaq0) xvf0Var2.get(), (pwy0) xvf0Var.get());
            case 12:
                return new j((ch80) xvf0Var9.get(), (yac0) xvf0Var8.get(), ((Boolean) xvf0Var7.get()).booleanValue(), (com.yandex.go.places.map.data.mappers.a) xvf0Var6.get(), (com.yandex.go.places.map.data.repositories.h) xvf0Var5.get(), (com.yandex.go.places.map.domain.layer.c) xvf0Var4.get(), (tt2) xvf0Var3.get(), (iaq0) xvf0Var2.get(), (pwy0) xvf0Var.get());
            case 13:
                return new com.yandex.messaging.ui.settings.e((v) xvf0Var9.get(), (w5t) xvf0Var8.get(), (ce80) xvf0Var7.get(), (lqo) xvf0Var6.get(), (d) xvf0Var5.get(), (b00) xvf0Var4.get(), (lqo) xvf0Var3.get(), (yz10) xvf0Var2.get(), (qj80) xvf0Var.get());
            case 14:
                return new p((ru.yandex.taxi.widget.utils.e) xvf0Var9.get(), (pdc) xvf0Var8.get(), (mnv0) xvf0Var7.get(), (ykz0) xvf0Var6.get(), (ru.yandex.taxi.summary.promotions.repository.e) xvf0Var5.get(), (wk21) xvf0Var4.get(), (pwy0) xvf0Var3.get(), (gei0) xvf0Var2.get(), (yp2) xvf0Var.get());
            case 15:
                return new com.yandex.go.taxi.order.details.v2.ui.view.presentation.modal.state.bottom_sheet.a((o2y0) xvf0Var9.get(), (zkk0) xvf0Var8.get(), (ps70) xvf0Var7.get(), (kvp0) xvf0Var6.get(), (mjg0) xvf0Var5.get(), (AccessibilityManager) xvf0Var4.get(), (tt2) xvf0Var3.get(), (zd80) xvf0Var2.get(), (RideCardChangeStateEventRepository) xvf0Var.get());
            case 16:
                return new igt0((pd61) xvf0Var9.get(), (mhf) xvf0Var8.get(), (rjt0) xvf0Var7.get(), (jgt0) xvf0Var6.get(), (r) xvf0Var5.get(), (biv0) xvf0Var4.get(), (z3g0) xvf0Var3.get(), (com.yandex.go.address.position_confirmation.j) xvf0Var2.get(), (xvw) xvf0Var.get());
            case 17:
                return new xit0((yit0) xvf0Var9.get(), (biv0) xvf0Var8.get(), (ru.yandex.taxi.preorder.source.domain.d) xvf0Var7.get(), (tit0) xvf0Var6.get(), (xj0) xvf0Var5.get(), (ou7) xvf0Var4.get(), (ru.yandex.taxi.preorder.source.mode.interactor.e) xvf0Var3.get(), (uet0) xvf0Var2.get(), (kqv0) xvf0Var.get());
            case 18:
                return new com.yandex.go.taxi.summary.interactor.g((q) xvf0Var9.get(), (arv0) xvf0Var8.get(), (jgv) xvf0Var7.get(), (k7x0) xvf0Var6.get(), (ck31) xvf0Var5.get(), (tt2) xvf0Var4.get(), (vev0) xvf0Var3.get(), (rgv0) xvf0Var2.get(), (fwu0) xvf0Var.get());
            case 19:
                return new com.yandex.go.preorder.navigation.p((oft0) xvf0Var9.get(), (net0) xvf0Var8.get(), (fy01) xvf0Var7.get(), (i130) xvf0Var6.get(), (cwx0) xvf0Var5.get(), (vpr0) xvf0Var4.get(), (com.yandex.go.preorder.header.g) xvf0Var3.get(), (mf00) xvf0Var2.get(), (t5k0) xvf0Var.get());
            case 20:
                return new odz0((Activity) xvf0Var9.get(), (kse) xvf0Var8.get(), (vse) xvf0Var7.get(), (k0b) xvf0Var6.get(), i5m.a(xvf0Var5), (com.yandex.messaging.input.g) xvf0Var4.get(), (sfl0) xvf0Var3.get(), (mrh) xvf0Var2.get(), (ycz0) xvf0Var.get());
            case 21:
                return new com.yandex.messaging.internal.translator.j((kse) xvf0Var9.get(), (xdf0) xvf0Var8.get(), (jz01) xvf0Var7.get(), (vw10) xvf0Var6.get(), (k020) xvf0Var5.get(), (o1b0) xvf0Var4.get(), (n5t0) xvf0Var3.get(), (x22) xvf0Var2.get(), (fbb) xvf0Var.get());
            default:
                return new au21((x0j0) xvf0Var9.get(), (yt21) xvf0Var8.get(), (ut21) xvf0Var7.get(), (xdf0) xvf0Var6.get(), (kse) xvf0Var5.get(), (w3c) xvf0Var4.get(), (xt21) xvf0Var3.get(), (Handler) xvf0Var2.get(), (vtq0) xvf0Var.get());
        }
    }
}
