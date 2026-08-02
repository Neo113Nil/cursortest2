package ru.yandex.taxi.summary.requirements.list.recycler;

import defpackage.aij0;
import defpackage.alz0;
import defpackage.bij0;
import defpackage.bkx0;
import defpackage.boj0;
import defpackage.ca1;
import defpackage.czo0;
import defpackage.dij0;
import defpackage.eij0;
import defpackage.f0z0;
import defpackage.fij0;
import defpackage.fnx0;
import defpackage.foc;
import defpackage.g0c;
import defpackage.hbp0;
import defpackage.he7;
import defpackage.hij0;
import defpackage.iij0;
import defpackage.jij0;
import defpackage.k7x0;
import defpackage.kb5;
import defpackage.kij0;
import defpackage.lgp;
import defpackage.lz8;
import defpackage.mr21;
import defpackage.mz8;
import defpackage.ogj0;
import defpackage.omc;
import defpackage.p6g;
import defpackage.pav;
import defpackage.pm5;
import defpackage.qmx0;
import defpackage.qoi0;
import defpackage.rmx0;
import defpackage.scc;
import defpackage.teb;
import defpackage.tij0;
import defpackage.tje;
import defpackage.tls;
import defpackage.ub60;
import defpackage.uhj0;
import defpackage.uhx0;
import defpackage.ur70;
import defpackage.vhj0;
import defpackage.w040;
import defpackage.w511;
import defpackage.whj0;
import defpackage.wmx0;
import defpackage.woj0;
import defpackage.wu1;
import defpackage.xmx0;
import defpackage.xuv;
import defpackage.yvf0;
import defpackage.zhj0;
import defpackage.zp01;
import defpackage.zxs;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.summary.requirements.list.interactors.h0;
import ru.yandex.taxi.summary.requirements.list.recycler.c;
import ru.yandex.taxi.summary.requirements.list.recycler.n;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;
import ru.yandex.taxi.widget.utils.e;

/* loaded from: classes6.dex */
public final class i {
    public final yvf0 a;
    public final ru.yandex.taxi.summary.requirements.list.router.a b;
    public final boj0 c;
    public final w040 d;
    public final h0 e;
    public final woj0 f;
    public final h g;
    public final rmx0 h;
    public final ogj0 i;
    public final hbp0 j = new hbp0(new czo0(14), "", null);

    public i(p6g p6gVar, ru.yandex.taxi.summary.requirements.list.router.a aVar, ru.yandex.taxi.summary.requirements.list.interactors.a aVar2, boj0 boj0Var, w040 w040Var, h0 h0Var, woj0 woj0Var, h hVar, rmx0 rmx0Var, ogj0 ogj0Var) {
        this.a = p6gVar;
        this.b = aVar;
        this.c = boj0Var;
        this.d = w040Var;
        this.e = h0Var;
        this.f = woj0Var;
        this.g = hVar;
        this.h = rmx0Var;
        this.i = ogj0Var;
    }

    public final void a() {
        hbp0 hbp0Var = this.j;
        hbp0Var.a();
        hbp0.e(hbp0Var, null, null, new RequirementItemsExternalDelegate$attach$1(this, null), 3);
        tje.N(hbp0Var, null, null, new RequirementItemsExternalDelegate$attach$$inlined$safeCollectIn$1(this.i.b, null, this), 3);
    }

    public final ArrayList b() {
        List list;
        List b;
        final int i = 0;
        final tij0 tij0Var = new tij0(this.c, 0);
        RequirementItemsExternalDelegate$createItemTypes$2 requirementItemsExternalDelegate$createItemTypes$2 = new RequirementItemsExternalDelegate$createItemTypes$2(1, this, i.class, "onCarouselItemClick", "onCarouselItemClick(Lru/yandex/taxi/summary/requirements/list/carousel/model/CarouselItemWithIndex;)V", 0);
        RequirementItemsExternalDelegate$createItemTypes$3 requirementItemsExternalDelegate$createItemTypes$3 = new RequirementItemsExternalDelegate$createItemTypes$3(1, this, i.class, "onDeeplinkItemClick", "onDeeplinkItemClick(Ljava/lang/String;)V", 0);
        List a = h.a(tij0Var);
        h hVar = this.g;
        boolean i2 = hVar.g.i();
        final int i3 = 1;
        if (i2) {
            int i4 = omc.W;
            g0c a2 = qoi0.a(vhj0.class);
            teb tebVar = new teb(26);
            teb tebVar2 = new teb(27);
            zxs zxsVar = new zxs(a2.a(), 0, tebVar, defpackage.n.v(null), new he7(i3, tebVar2), null);
            int i5 = omc.W;
            g0c a3 = qoi0.a(whj0.class);
            foc focVar = new foc(23);
            foc focVar2 = new foc(24);
            Class a4 = a3.a();
            he7 he7Var = new he7(i3, focVar2);
            EmptyList emptyList = EmptyList.a;
            zxs zxsVar2 = new zxs(a4, 0, focVar, emptyList, he7Var, null);
            int i6 = g.W;
            g0c a5 = qoi0.a(bij0.class);
            int i7 = 4;
            ur70 ur70Var = new ur70(i7);
            ub60 ub60Var = new ub60(9, tij0Var);
            zxs zxsVar3 = new zxs(a5.a(), 0, ur70Var, defpackage.n.v(null), new he7(i3, ub60Var), null);
            int i8 = omc.W;
            g0c a6 = qoi0.a(fij0.class);
            zxs zxsVar4 = new zxs(a6.a(), 0, new bkx0(28), emptyList, new he7(i3, new bkx0(29)), null);
            int i9 = ca1.g0;
            g0c a7 = qoi0.a(eij0.class);
            zxs zxsVar5 = new zxs(a7.a(), 0, new bkx0(5), emptyList, new he7(i3, new bkx0(6)), null);
            int i10 = e.Z;
            final ru.yandex.taxi.widget.utils.e eVar = hVar.c;
            g0c a8 = qoi0.a(aij0.class);
            ur70 ur70Var2 = new ur70(2);
            tls tlsVar = new tls() { // from class: i9w
                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    int i11 = i3;
                    e eVar2 = eVar;
                    tij0 tij0Var2 = tij0Var;
                    ListItemComponent listItemComponent = (ListItemComponent) obj;
                    switch (i11) {
                        case 0:
                            return new c(listItemComponent, tij0Var2, eVar2);
                        case 1:
                            return new ru.yandex.taxi.summary.requirements.list.recycler.e(listItemComponent, tij0Var2, eVar2);
                        default:
                            return new n(listItemComponent, tij0Var2, eVar2);
                    }
                }
            };
            zxs zxsVar6 = new zxs(a8.a(), 0, ur70Var2, defpackage.n.v(null), new he7(i3, tlsVar), null);
            int i11 = c.Z;
            g0c a9 = qoi0.a(zhj0.class);
            xuv xuvVar = new xuv(11);
            tls tlsVar2 = new tls() { // from class: i9w
                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    int i112 = i;
                    e eVar2 = eVar;
                    tij0 tij0Var2 = tij0Var;
                    ListItemComponent listItemComponent = (ListItemComponent) obj;
                    switch (i112) {
                        case 0:
                            return new c(listItemComponent, tij0Var2, eVar2);
                        case 1:
                            return new ru.yandex.taxi.summary.requirements.list.recycler.e(listItemComponent, tij0Var2, eVar2);
                        default:
                            return new n(listItemComponent, tij0Var2, eVar2);
                    }
                }
            };
            zxs zxsVar7 = new zxs(a9.a(), 0, xuvVar, defpackage.n.v(null), new he7(i3, tlsVar2), null);
            int i12 = p.b0;
            k7x0 k7x0Var = hVar.b;
            pav pavVar = hVar.a;
            g0c a10 = qoi0.a(jij0.class);
            list = a;
            zxs zxsVar8 = new zxs(a10.a(), 0, new mr21(i7), emptyList, new he7(1, new alz0(pavVar, k7x0Var, 3)), null);
            int i13 = n.Z;
            g0c a11 = qoi0.a(iij0.class);
            zp01 zp01Var = new zp01(8);
            final int i14 = 2;
            tls tlsVar3 = new tls() { // from class: i9w
                @Override // defpackage.tls
                public final Object invoke(Object obj) {
                    int i112 = i14;
                    e eVar2 = eVar;
                    tij0 tij0Var2 = tij0Var;
                    ListItemComponent listItemComponent = (ListItemComponent) obj;
                    switch (i112) {
                        case 0:
                            return new c(listItemComponent, tij0Var2, eVar2);
                        case 1:
                            return new ru.yandex.taxi.summary.requirements.list.recycler.e(listItemComponent, tij0Var2, eVar2);
                        default:
                            return new n(listItemComponent, tij0Var2, eVar2);
                    }
                }
            };
            int i15 = 3;
            List g = scc.g(new lgp(TransferV2ViewHolder$Companion$itemType$3.b, TransferV2ViewHolder$Companion$itemType$4.b, i15), new lgp(TransferV2ViewHolder$Companion$itemType$5.b, TransferV2ViewHolder$Companion$itemType$6.b, i15), new lgp(TransferV2ViewHolder$Companion$itemType$7.b, TransferV2ViewHolder$Companion$itemType$8.b, i15));
            int i16 = 1;
            zxs zxsVar9 = new zxs(a11.a(), 0, zp01Var, g, new he7(i16, tlsVar3), null);
            int i17 = m.Z;
            g0c a12 = qoi0.a(hij0.class);
            f0z0 f0z0Var = new f0z0(15);
            alz0 alz0Var = new alz0(pavVar, k7x0Var, i16);
            int i18 = 3;
            zxs zxsVar10 = new zxs(a12.a(), 0, f0z0Var, scc.g(new lgp(ToggleV2RequirementViewHolder$Companion$itemType$3.b, ToggleV2RequirementViewHolder$Companion$itemType$4.b, i18), new lgp(ToggleV2RequirementViewHolder$Companion$itemType$5.b, ToggleV2RequirementViewHolder$Companion$itemType$6.b, i18)), new he7(1, alz0Var), null);
            int i19 = xmx0.b0;
            qmx0 qmx0Var = hVar.f;
            g0c a13 = qoi0.a(dij0.class);
            zxs zxsVar11 = new zxs(a13.a(), 0, new bkx0(9), emptyList, new he7(1, new wmx0(pavVar, qmx0Var, requirementItemsExternalDelegate$createItemTypes$3, 0)), null);
            int i20 = mz8.V;
            ru.yandex.taxi.summary.requirements.list.carousel.recycler.a aVar = hVar.e;
            pm5 pm5Var = hVar.d;
            List v = defpackage.n.v(null);
            g0c a14 = qoi0.a(uhj0.class);
            b = scc.g(zxsVar, zxsVar2, zxsVar3, zxsVar4, zxsVar5, zxsVar6, zxsVar7, zxsVar8, zxsVar9, zxsVar10, zxsVar11, new zxs(a14.a(), 0, null, v, null, new lz8(requirementItemsExternalDelegate$createItemTypes$2, aVar, pm5Var, 0)));
        } else {
            list = a;
            if (i2) {
                w511.b();
                return null;
            }
            b = hVar.b(tij0Var, requirementItemsExternalDelegate$createItemTypes$2, requirementItemsExternalDelegate$createItemTypes$3);
        }
        return kotlin.collections.a.m0(b, list);
    }

    public final ArrayList c() {
        tij0 tij0Var = new tij0(this.c, 1);
        RequirementItemsExternalDelegate$createOldTariffCardItemTypes$2 requirementItemsExternalDelegate$createOldTariffCardItemTypes$2 = new RequirementItemsExternalDelegate$createOldTariffCardItemTypes$2(1, this, i.class, "onCarouselItemClick", "onCarouselItemClick(Lru/yandex/taxi/summary/requirements/list/carousel/model/CarouselItemWithIndex;)V", 0);
        RequirementItemsExternalDelegate$createOldTariffCardItemTypes$3 requirementItemsExternalDelegate$createOldTariffCardItemTypes$3 = new RequirementItemsExternalDelegate$createOldTariffCardItemTypes$3(1, this, i.class, "onDeeplinkItemClick", "onDeeplinkItemClick(Ljava/lang/String;)V", 0);
        List a = h.a(tij0Var);
        return kotlin.collections.a.m0(this.g.b(tij0Var, requirementItemsExternalDelegate$createOldTariffCardItemTypes$2, requirementItemsExternalDelegate$createOldTariffCardItemTypes$3), a);
    }

    public final void d(uhx0 uhx0Var) {
        if (uhx0Var instanceof kij0) {
            hbp0.e(this.j, null, null, new RequirementItemsExternalDelegate$handleRequirementClick$1(this, uhx0Var, null), 3);
        }
    }

    public final void e(fnx0 fnx0Var) {
        String str = fnx0Var.c.b;
        String str2 = fnx0Var.d;
        r0 r0Var = this.f.c;
        kb5 kb5Var = new kb5(str2, str, (wu1) null, (TariffOrderFlow) null, false, 60);
        r0Var.getClass();
        r0Var.m(null, kb5Var);
    }
}
