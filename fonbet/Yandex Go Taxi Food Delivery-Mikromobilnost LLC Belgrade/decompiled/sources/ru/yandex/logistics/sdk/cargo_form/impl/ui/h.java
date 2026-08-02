package ru.yandex.logistics.sdk.cargo_form.impl.ui;

import defpackage.b4s;
import defpackage.c4s;
import defpackage.ca80;
import defpackage.cd0;
import defpackage.cv8;
import defpackage.ds31;
import defpackage.g2q0;
import defpackage.gci0;
import defpackage.gzh;
import defpackage.h3y;
import defpackage.jqr;
import defpackage.k5c;
import defpackage.lv8;
import defpackage.mth;
import defpackage.o3s;
import defpackage.o4;
import defpackage.o5s;
import defpackage.pb;
import defpackage.pzt0;
import defpackage.q98;
import defpackage.qkg;
import defpackage.tje;
import defpackage.u1n;
import defpackage.u3s;
import defpackage.ue11;
import defpackage.vls0;
import defpackage.wsr0;
import defpackage.xsr0;
import defpackage.y3s;
import defpackage.y7m;
import defpackage.y9n;
import defpackage.yi8;
import defpackage.yr31;
import defpackage.zi8;
import java.util.Collections;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.q0;
import kotlinx.coroutines.flow.r0;
import ru.yandex.logistics.sdk.cargo_form.core.api.models.FormEventType;
import ru.yandex.logistics.sdk.cargo_form.core.impl.FormCoreSectionsMapper$dashboardModelFlow$$inlined$flatMapLatest$1;
import ru.yandex.taxi.logistics.sdk.delivery_launch.domain.DeliveryLaunchLoadingStateRepository;
import ru.yandex.taxi.logistics.sdk.ui.AppVisibilitySubscription$State;

/* loaded from: classes5.dex */
public final class h extends yr31 {
    public final h3y A;
    public final ca80 B;
    public final ru.yandex.logistics.sdk.cargo_form.impl.photocomments.a C;
    public final ue11 D;
    public final c4s E;
    public final qkg F;
    public final gci0 G;
    public final gci0 H;
    public final gci0 I;
    public final gci0 J;
    public final gci0 K;
    public final cv8 b;
    public final o3s c;
    public final u1n w;
    public final ru.yandex.taxi.logistics.sdk.photocomments.domain.a x;
    public final ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a y;
    public final gzh z;

    public h(cv8 cv8Var, b4s b4sVar, u3s u3sVar, ru.yandex.logistics.sdk.cargo_form.impl.domain.a aVar, ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor.a aVar2, ru.yandex.logistics.sdk.cargo_form.impl.ai_widgets.ui.a aVar3, ru.yandex.logistics.sdk.cargo_form.core.impl.interactor.b bVar, o3s o3sVar, u1n u1nVar, DeliveryLaunchLoadingStateRepository deliveryLaunchLoadingStateRepository, o5s o5sVar, ru.yandex.taxi.logistics.sdk.photocomments.domain.a aVar4, ru.yandex.logistics.sdk.cargo_form.impl.ui.mapper.a aVar5, gzh gzhVar, h3y h3yVar, ca80 ca80Var, ru.yandex.logistics.sdk.cargo_form.impl.photocomments.a aVar6, ue11 ue11Var) {
        Integer num;
        r0 r0Var = deliveryLaunchLoadingStateRepository.a;
        this.b = cv8Var;
        this.c = o3sVar;
        this.w = u1nVar;
        this.x = aVar4;
        this.y = aVar5;
        this.z = gzhVar;
        this.A = h3yVar;
        this.B = ca80Var;
        this.C = aVar6;
        this.D = ue11Var;
        c4s a = b4sVar.a(u3sVar);
        this.E = a;
        zi8 zi8Var = cv8Var.w;
        qkg qkgVar = new qkg(Collections.singletonList(new g2q0(Collections.singletonList(new vls0((!(zi8Var instanceof yi8) || (num = ((yi8) zi8Var).b) == null) ? null : new y7m(num.intValue()))), null, null, null, false, null, null, null, null, 1022)), null, null, null, 30);
        this.F = qkgVar;
        y3s y3sVar = a.b;
        u3s u3sVar2 = a.a;
        int i = 6;
        q98 q98Var = new q98(new mth(u3sVar2.a(), i), 3);
        y3sVar.getClass();
        int i2 = 1;
        int i3 = 24;
        m0 m0Var = new m0(new y9n(kotlinx.coroutines.flow.e.X(q98Var, new FormCoreSectionsMapper$dashboardModelFlow$$inlined$flatMapLatest$1(null, y3sVar)), i2), kotlinx.coroutines.flow.e.T(new pb(r0Var, i3), 1), new CargoFormViewModel$topWidgetsFlow$1(3, null));
        k5c a2 = ds31.a(this);
        wsr0 wsr0Var = xsr0.a;
        q0 a3 = wsr0.a(wsr0Var, 3);
        EmptyList emptyList = EmptyList.a;
        this.G = kotlinx.coroutines.flow.e.R(m0Var, a2, a3, new qkg(emptyList, null, null, null, 30));
        y3s y3sVar2 = a.b;
        q98 q98Var2 = new q98(new mth(u3sVar2.a(), i), 2);
        y3sVar2.getClass();
        gci0 R = kotlinx.coroutines.flow.e.R(new m0(new y9n(kotlinx.coroutines.flow.e.X(q98Var2, new FormCoreSectionsMapper$dashboardModelFlow$$inlined$flatMapLatest$1(null, y3sVar2)), i2), kotlinx.coroutines.flow.e.T(new pb(r0Var, i3), 1), new CargoFormViewModel$contentWidgetsFlow$1(3, null)), ds31.a(this), wsr0.a(wsr0Var, 3), qkgVar);
        this.H = R;
        this.I = kotlinx.coroutines.flow.e.R(new m0(a.a(), kotlinx.coroutines.flow.e.T(new pb(r0Var, i3), 1), new CargoFormViewModel$bottomWidgetsFlow$1(3, null)), ds31.a(this), wsr0.a(wsr0Var, 3), new qkg(emptyList, null, null, null, 30));
        int i4 = 6;
        this.J = kotlinx.coroutines.flow.e.R(new cd0(19, new q98(new mth(u3sVar2.a(), i4), i4), this), ds31.a(this), wsr0.a(wsr0Var, 3), new lv8(null, 2));
        this.K = kotlinx.coroutines.flow.e.R(new m0(aVar3.a(), R, new CargoFormViewModel$aiWidgetsConfigFlow$1(this, null)), ds31.a(this), wsr0.a(wsr0Var, 3), null);
        tje.N(ds31.a(this), null, null, new CargoFormViewModel$1(this, null), 3);
        bVar.a();
        aVar.a(ds31.a(this));
        ue11Var.c.b(ds31.a(this));
        tje.N(ds31.a(this), null, null, new CargoFormViewModel$sendAnalyticsOnShown$1(this, null), 3);
        kotlinx.coroutines.flow.e.H(ds31.a(this), new jqr(o5sVar.c, new CargoFormViewModel$subscribeOverrideAnalytics$1(this, null), 3));
        tje.N(ds31.a(this), null, null, new CargoFormViewModel$observeUploadPhotoErrors$1(this, null), 3);
        tje.N(ds31.a(this), null, null, new CargoFormViewModel$listenPhotocommentsAddressChanges$1(this, null), 3);
        if (cv8Var.c) {
            ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor.a.a(aVar2, cv8Var.x, null, 2);
        }
    }

    @Override // defpackage.yr31
    public final void V() {
        o4 o4Var;
        this.B.getClass();
        ue11 ue11Var = this.D;
        ru.yandex.logistics.sdk.cargo_form.impl.trigger_communications.abandoned_cart.domain.a aVar = ue11Var.c;
        pzt0 pzt0Var = aVar.l;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        Object value = aVar.g.observe().getValue();
        AppVisibilitySubscription$State appVisibilitySubscription$State = AppVisibilitySubscription$State.FOREGROUND;
        if (value == appVisibilitySubscription$State && (o4Var = (o4) aVar.j.a.getValue()) != null) {
            aVar.e(o4Var);
        }
        if (ue11Var.d.observe().getValue() == appVisibilitySubscription$State) {
            ue11Var.a(FormEventType.CLOSED);
        }
    }
}
