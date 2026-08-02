package ru.yandex.logistics.sdk.cargo_form.impl.universal_modal_view.ui;

import defpackage.b4s;
import defpackage.c330;
import defpackage.c4s;
import defpackage.ds31;
import defpackage.ey4;
import defpackage.fzw;
import defpackage.g2q0;
import defpackage.gci0;
import defpackage.jqr;
import defpackage.k130;
import defpackage.k5c;
import defpackage.l030;
import defpackage.mth;
import defpackage.o5s;
import defpackage.q98;
import defpackage.qkg;
import defpackage.s030;
import defpackage.tje;
import defpackage.u030;
import defpackage.u1n;
import defpackage.u3s;
import defpackage.wsr0;
import defpackage.xsr0;
import defpackage.y3s;
import defpackage.y7m;
import defpackage.y9n;
import defpackage.yfa;
import defpackage.yi8;
import defpackage.yr31;
import defpackage.zi8;
import java.util.Collections;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.q0;
import ru.yandex.logistics.sdk.cargo_form.core.api.models.modal.ModalViewType;
import ru.yandex.logistics.sdk.cargo_form.core.impl.FormCoreSectionsMapper$dashboardModelFlow$$inlined$flatMapLatest$1;

/* loaded from: classes5.dex */
public final class d extends yr31 {
    public final gci0 A;
    public final gci0 B;
    public final gci0 C;
    public final gci0 D;
    public final s030 b;
    public final k130 c;
    public final o5s w;
    public final u1n x;
    public final yfa y;
    public final c4s z;

    public d(b4s b4sVar, u3s u3sVar, l030 l030Var, s030 s030Var, k130 k130Var, o5s o5sVar, u1n u1nVar, yfa yfaVar) {
        Integer num;
        this.b = s030Var;
        this.c = k130Var;
        this.w = o5sVar;
        this.x = u1nVar;
        this.y = yfaVar;
        c4s a = b4sVar.a(u3sVar);
        this.z = a;
        ModalViewType modalViewType = l030Var.b;
        zi8 zi8Var = l030Var.a;
        qkg qkgVar = new qkg(Collections.singletonList(new g2q0(Collections.singletonList(new c330(modalViewType, (!(zi8Var instanceof yi8) || (num = ((yi8) zi8Var).b) == null) ? null : new y7m(num.intValue()))), null, null, null, false, null, null, null, null, 1022)), null, null, null, 30);
        y3s y3sVar = a.b;
        u3s u3sVar2 = a.a;
        int i = 6;
        int i2 = 3;
        q98 q98Var = new q98(new mth(u3sVar2.a(), i), i2);
        y3sVar.getClass();
        int i3 = 1;
        y9n y9nVar = new y9n(e.X(q98Var, new FormCoreSectionsMapper$dashboardModelFlow$$inlined$flatMapLatest$1(null, y3sVar)), i3);
        k5c a2 = ds31.a(this);
        wsr0 wsr0Var = xsr0.a;
        q0 a3 = wsr0.a(wsr0Var, 3);
        EmptyList emptyList = EmptyList.a;
        this.A = e.R(y9nVar, a2, a3, new qkg(emptyList, null, null, null, 30));
        y3s y3sVar2 = a.b;
        q98 q98Var2 = new q98(new mth(u3sVar2.a(), i), 2);
        y3sVar2.getClass();
        this.B = e.R(new y9n(e.X(q98Var2, new FormCoreSectionsMapper$dashboardModelFlow$$inlined$flatMapLatest$1(null, y3sVar2)), i3), ds31.a(this), wsr0.a(wsr0Var, 3), qkgVar);
        this.C = e.R(a.a(), ds31.a(this), wsr0.a(wsr0Var, 3), new qkg(emptyList, null, null, null, 30));
        this.D = e.R(new fzw(12, new q98(new mth(u3sVar2.a(), i), i), this), ds31.a(this), wsr0.a(wsr0Var, 3), new u030(null, 2));
        tje.N(ds31.a(this), null, null, new ModalViewViewModel$startReloadSubscription$1(this, null), 3);
        tje.N(ds31.a(this), null, null, new ModalViewViewModel$sendAnalyticsOnShown$1(this, null), 3);
        e.H(ds31.a(this), new jqr(new ey4((fzw) k130Var.a(), 15), new ModalViewViewModel$startDrawRouteSubscription$2(this, null), i2));
    }
}
