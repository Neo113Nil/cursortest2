package defpackage;

import android.graphics.drawable.Drawable;
import com.yandex.go.address.models.Address;
import com.yandex.go.address.models.PlainAddress;
import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.address_confirmation.modal.d;
import com.yandex.go.analytics.PositionChoicesShowPickerAnalytics$PointTypeV2;
import com.yandex.go.clarify_address.AddressClarificationReason;
import com.yandex.go.navigation.screen.api.Screen;
import com.yandex.go.parks.nearest.data.models.NotSupportedAddressException;
import com.yandex.go.preorder.mode.SourcePointMode;
import com.yandex.go.safety.center.api.ShareRequestParam;
import com.yandex.go.safety.center.share.notification.ShareStatus;
import com.yandex.go.scooters.qr.api.ScootersQrNumberResultSource;
import com.yandex.go.scooters.qr.ui.e;
import com.yandex.go.settings.presentation.c;
import com.yandex.go.something_wrong_screen.experiment.SomethingWrongScreenExperiment;
import com.yandex.go.taxi.main.shortcuts.ui.modalview.ShortcutModalViewMvp;
import com.yandex.go.taxi.summary.api.ui.MapPositionAction;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.go.where_you_are.impl.presentation.WhereYouAreModalView;
import com.yandex.go.where_you_are.impl.router.a;
import com.yandex.go.zone.model.Zone;
import com.yandex.mapkit.geometry.Polyline;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Result;
import kotlin.collections.EmptySet;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.HapticController$Effect;
import ru.yandex.taxi.address.experiment.r;
import ru.yandex.taxi.address.repository.AddressResolveRepository;
import ru.yandex.taxi.experiments.superapp.i;
import ru.yandex.taxi.multiexit.MultiexitProcessActionType;
import ru.yandex.taxi.multiexit.notification.MultiexitEntranceChangeNotification;
import ru.yandex.taxi.persuggest.api.finalsuggest.Action;
import ru.yandex.taxi.persuggest.api.finalsuggest.PositionInitAction;
import ru.yandex.taxi.persuggest.repository.models.FinalSuggestScreen;
import ru.yandex.taxi.persuggest.source.f;
import ru.yandex.taxi.preorder.source.ModalViewOrigin;
import ru.yandex.taxi.preorder.source.data.TaxiMainControlElementEvent;
import ru.yandex.taxi.preorder.source.domain.s;
import ru.yandex.taxi.preorder.source.pickup.PickupPoint$PointType;
import ru.yandex.taxi.preorder.tollroad.analytics.TollRoadSetReason;
import ru.yandex.taxi.scooters.presentation.route_navigation.b;
import ru.yandex.taxi.search.g;
import ru.yandex.taxi.tariffs.model.TariffOrderFlow;
import ru.yandex.taxi.utils.UiStateDrawableWrapper;

/* loaded from: classes13.dex */
public final class tpo0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ tpo0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    private final Object a(Object obj, Continuation continuation) {
        ((mgt0) this.b).updateControlElements((TaxiMainControlElementEvent) obj);
        return zy11.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:388:0x083f, code lost:
    
        if (defpackage.srb1.d(r3, r8) <= r5.intValue()) goto L369;
     */
    /* JADX WARN: Removed duplicated region for block: B:152:0x034d  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x036f  */
    /* JADX WARN: Removed duplicated region for block: B:164:0x0377  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x0506  */
    /* JADX WARN: Removed duplicated region for block: B:244:0x0524  */
    /* JADX WARN: Removed duplicated region for block: B:373:0x09a2  */
    /* JADX WARN: Removed duplicated region for block: B:435:0x0689  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02ce  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x0243  */
    @Override // defpackage.vpr
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, Continuation continuation) {
        ppo0 ppo0Var;
        Object value;
        zzs zzsVar;
        boolean z;
        String str;
        x46 a;
        boolean z2;
        tte0 tte0Var;
        Address address;
        Object obj2;
        dr40 dr40Var;
        pv0 pv0Var;
        MultiexitProcessActionType multiexitProcessActionType;
        Iterator it;
        zzs B;
        boolean z3;
        Address address2;
        boolean z4;
        boolean z5;
        SourcePointMode sourcePointMode;
        lgv0 lgv0Var;
        ry41 ry41Var;
        a aVar;
        int i = 8;
        switch (this.a) {
            case 0:
                opo0 opo0Var = opo0.a;
                e eVar = (e) this.b;
                dqo0 dqo0Var = (dqo0) obj;
                if (dqo0Var instanceof ypo0) {
                    ((npo0) eVar.Dg()).L(((ypo0) dqo0Var).a);
                } else if (dqo0Var instanceof cqo0) {
                    eVar.Mg();
                    qke.E(eVar.x, HapticController$Effect.CLICK_HEAVY, false, 12);
                    eVar.K.a(((cqo0) dqo0Var).a);
                } else if (dqo0Var instanceof zpo0) {
                    n7p0 n7p0Var = ((zpo0) dqo0Var).a;
                    if (n7p0Var != null) {
                        eVar.Mg();
                        qke.E(eVar.x, HapticController$Effect.CLICK_HEAVY, false, 12);
                        eVar.K.a(n7p0Var);
                    }
                } else if (dqo0Var instanceof aqo0) {
                    qoo0 qoo0Var = eVar.F;
                    qoo0 qoo0Var2 = eVar.F;
                    if (!(((r0) qoo0Var.b).getValue() instanceof opo0)) {
                        qoo0Var2.Fg(opo0Var);
                    }
                    qpo0 qpo0Var = (qpo0) ((r0) qoo0Var2.b).getValue();
                    aqo0 aqo0Var = (aqo0) dqo0Var;
                    r7p0 r7p0Var = aqo0Var.a;
                    zzs zzsVar2 = aqo0Var.b;
                    ScootersQrNumberResultSource scootersQrNumberResultSource = aqo0Var.c ? ScootersQrNumberResultSource.MANUAL_ENTER : ScootersQrNumberResultSource.QR;
                    if (jl40.l(qpo0Var, opo0Var)) {
                        ppo0Var = new ppo0(zzsVar2, Collections.singleton(r7p0Var), scootersQrNumberResultSource);
                    } else {
                        if (!(qpo0Var instanceof ppo0)) {
                            w511.b();
                            return null;
                        }
                        ppo0Var = new ppo0(zzsVar2, v4r0.i(((ppo0) qpo0Var).b, r7p0Var), scootersQrNumberResultSource);
                    }
                    qoo0Var2.Fg(ppo0Var);
                } else {
                    if (!(dqo0Var instanceof bqo0)) {
                        w511.b();
                        return null;
                    }
                    bqo0 bqo0Var = (bqo0) dqo0Var;
                    eVar.H.a(new xsn0(bqo0Var.a, System.currentTimeMillis(), bqo0Var.b));
                }
                return zy11.a;
            case 1:
                b bVar = (b) this.b;
                bVar.z((m950) bVar.J.get(), sy60.Q2);
                return zy11.a;
            case 2:
                ((i0p0) this.b).render((u3u0) obj);
                return zy11.a;
            case 3:
                ((t3p0) this.b).render((y3p0) obj);
                return zy11.a;
            case 4:
                ((pd61) ((s6k0) this.b).b).a();
                return zy11.a;
            case 5:
                ((bvp0) this.b).l((Drawable) obj);
                return zy11.a;
            case 6:
                UiStateDrawableWrapper uiStateDrawableWrapper = (UiStateDrawableWrapper) obj;
                r0 r0Var = ((ru.yandex.taxi.favorites.rides.settings_modal.domain.a) this.b).c;
                do {
                    value = r0Var.getValue();
                } while (!r0Var.k(value, oar0.a((oar0) value, uiStateDrawableWrapper, null, null, null, 14)));
                return zy11.a;
            case 7:
                ((x9r0) this.b).Ba((oar0) obj);
                return zy11.a;
            case 8:
                ((dbr0) this.b).render((oer0) obj);
                return zy11.a;
            case 9:
                int intValue = ((Number) obj).intValue();
                yx40 yx40Var = (yx40) this.b;
                qwd qwdVar = c.a;
                yx40Var.setIntValue(intValue);
                return zy11.a;
            case 10:
                ShareStatus shareStatus = (ShareStatus) obj;
                hkr0 hkr0Var = (hkr0) this.b;
                ((ekr0) hkr0Var.Dg()).setStatus(shareStatus);
                if (shareStatus == ShareStatus.SUCCESS) {
                    com.yandex.go.safety.center.analytics.a aVar2 = hkr0Var.B;
                    ShareRequestParam.NotificationType notificationType = hkr0Var.y.a;
                    ppl0 ppl0Var = aVar2.a;
                    int i2 = notificationType != null ? irl0.a[notificationType.ordinal()] : -1;
                    if (i2 == 1) {
                        ppl0Var.a.a("SafetyCenter.ShareTrustedContactsNotification.Succeeded", tse0.o(ppl0Var), 1, new HashMap());
                    } else if (i2 == 2) {
                        ppl0Var.a.a("SafetyCenter.ShareLocationNotification.Succeeded", tse0.o(ppl0Var), 1, new HashMap());
                    }
                }
                return zy11.a;
            case 11:
                xlr0 xlr0Var = (xlr0) obj;
                com.yandex.go.trusted_contacts.share_settings.a aVar3 = (com.yandex.go.trusted_contacts.share_settings.a) this.b;
                ((ilr0) aVar3.Dg()).render(xlr0Var);
                aVar3.H = xlr0Var;
                return zy11.a;
            case 12:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                Iterator it2 = ((com.yandex.go.shortcuts.impl.router.b) this.b).f.iterator();
                while (it2.hasNext()) {
                    eor eorVar = (eor) it2.next();
                    if (booleanValue) {
                        eorVar.show();
                    } else {
                        eorVar.hide();
                    }
                }
                return zy11.a;
            case 13:
                ((ShortcutModalViewMvp) ((com.yandex.go.taxi.main.shortcuts.ui.modalview.b) this.b).Dg()).updateBadgeCount(((Number) obj).intValue());
                return zy11.a;
            case 14:
                ((lz40) this.b).g((d4s0) obj);
                return zy11.a;
            case 15:
                ((q2s0) this.b).ua((Address) obj);
                return zy11.a;
            case 16:
                ((i) this.b).e.a();
                return zy11.a;
            case 17:
                ((flex.signals.a) this.b).d.invoke((y741) obj);
                return zy11.a;
            case 18:
                ((y5t0) this.b).refreshDoneButtonState(((Boolean) obj).booleanValue());
                return zy11.a;
            case 19:
                ((t8t0) this.b).render((f8t0) obj);
                return zy11.a;
            case 20:
                ((r8t0) this.b).U3((z8t0) obj);
                return zy11.a;
            case 21:
                SomethingWrongScreenExperiment somethingWrongScreenExperiment = (SomethingWrongScreenExperiment) obj;
                f8t0 f8t0Var = new f8t0(d6z.Y(somethingWrongScreenExperiment, somethingWrongScreenExperiment.f.b), somethingWrongScreenExperiment.f.c);
                r0 r0Var2 = ((com.yandex.go.something_wrong_screen.repository.b) this.b).j;
                r0Var2.getClass();
                r0Var2.m(null, f8t0Var);
                return zy11.a;
            case 22:
                Object value2 = ((Result) obj).getValue();
                ((com.yandex.go.preorder.address.e) this.b).G.a = false;
                Throwable a2 = Result.a(value2);
                if (a2 != null) {
                    ((com.yandex.go.preorder.address.e) this.b).I.b(a2, false);
                }
                if (!(value2 instanceof Result.Failure)) {
                    pv0 pv0Var2 = (pv0) value2;
                    com.yandex.go.preorder.address.e eVar2 = (com.yandex.go.preorder.address.e) this.b;
                    yq40 yq40Var = eVar2.f;
                    tte0 tte0Var2 = eVar2.t;
                    tit0 tit0Var = eVar2.j;
                    if (eVar2.J.d() && jl40.l(pv0Var2.a.B(), tit0Var.l)) {
                        eVar2.a(pv0Var2);
                    } else {
                        com.yandex.go.route.interactor.b bVar2 = eVar2.n;
                        if (tte0Var2.e()) {
                            List<wpb0> list = pv0Var2.e;
                            zzs B2 = pv0Var2.a.B();
                            PickupPoint$PointType pickupPoint$PointType = PickupPoint$PointType.PICKUP_POINT;
                            double d = Double.MAX_VALUE;
                            zzs zzsVar3 = null;
                            for (wpb0 wpb0Var : list) {
                                PickupPoint$PointType pickupPoint$PointType2 = wpb0Var.c;
                                zzs zzsVar4 = wpb0Var.b;
                                if (pickupPoint$PointType2 == pickupPoint$PointType) {
                                    double j = ru.yandex.taxi.map.utils.a.j(B2, zzsVar4);
                                    if (j < d) {
                                        zzsVar3 = zzsVar4;
                                        d = j;
                                    }
                                }
                            }
                            zzsVar = zzsVar3;
                        } else {
                            zzsVar = null;
                        }
                        ZoneAddress zoneAddress = bVar2.c().a;
                        Zone zone = zoneAddress != null ? zoneAddress.b : null;
                        if (zone == null || !jl40.l(zone.a, pv0Var2.a.getZoneName())) {
                            zone = null;
                        }
                        Address address3 = pv0Var2.a;
                        bVar2.m(new ZoneAddress(address3, zone), zzsVar);
                        ru.yandex.taxi.preorder.source.domain.a aVar4 = eVar2.p;
                        pv0 c = aVar4.c();
                        hst hstVar = jst.e;
                        if (c != null && (address2 = c.a) != null) {
                            address2.d();
                        }
                        hstVar.getClass();
                        if (c != null) {
                            aVar4.b(c, EmptySet.a);
                        }
                        if (com.yandex.go.preorder.address.e.b(pv0Var2)) {
                            ((com.yandex.go.clarify_address.a) eVar2.D).c(true, AddressClarificationReason.Map);
                        }
                        if (pv0Var2.b()) {
                            oce0 a3 = ((qce0) eVar2.s).a(address3, pv0Var2.j, pv0Var2.g);
                            if (a3 != null) {
                                u45 e = eVar2.z.a().e();
                                if (!(e instanceof y700) || !((y700) e).isModalViewExpanded()) {
                                    z = true;
                                    mzb mzbVar = eVar2.L;
                                    str = pv0Var2.b.e;
                                    if (str == null) {
                                        str = "";
                                    }
                                    boolean c2 = ((com.yandex.go.clarify_address.before_order.a) mzbVar).c(str);
                                    tit0Var.b = null;
                                    tit0Var.i = false;
                                    fu00 fu00Var = eVar2.k;
                                    a = h56.a(eVar2.K, pv0Var2, eVar2.e);
                                    if (a.f == null) {
                                        if (a.b) {
                                            fu00Var.a = Integer.MAX_VALUE;
                                            fu00Var.b = 0;
                                        } else if (a.c) {
                                            int i3 = a.d;
                                            fu00Var.a = a.e;
                                            fu00Var.b = i3;
                                        }
                                        zzs zzsVar5 = pv0Var2.j;
                                        if (zzsVar5 != null) {
                                            PlainAddress.Companion.getClass();
                                            PlainAddress a4 = zgc0.a(zzsVar5);
                                            a4.P("nearestposition.blockedzone.point");
                                            tit0Var.a = a4;
                                        }
                                        if (a3 == null || !z) {
                                            z2 = z;
                                            if (a.a && !tte0Var2.e() && !eVar2.g.a.a().k()) {
                                                qke.E(eVar2.c.a, HapticController$Effect.WARNING, false, 8);
                                                tit0 tit0Var2 = yq40Var.c;
                                                if (tit0Var2.c == null) {
                                                    PlainAddress plainAddress = tit0Var2.a;
                                                    if (yq40Var.f.d() && address3.getPositionInitAction() == PositionInitAction.AUTO_LOCATION) {
                                                        B = address3.B();
                                                    } else if (plainAddress == null || (B = plainAddress.B()) == null) {
                                                        B = address3.B();
                                                    }
                                                    ((gh00) yq40Var.a).G(B);
                                                    yq40Var.d.c(address3, new c90(15));
                                                }
                                                tit0Var.i = true;
                                                eVar2.B.a.c = false;
                                            }
                                        } else {
                                            uq40 uq40Var = (uq40) yq40Var.b.get();
                                            if (uq40Var.d()) {
                                                uq40Var.b();
                                            }
                                            dht0 dht0Var = eVar2.H;
                                            dht0Var.c.c();
                                            dht0Var.f.b(AddressResolveRepository.State.ERROR);
                                            tit0 tit0Var3 = dht0Var.a;
                                            tit0Var3.b = pv0Var2;
                                            oce0 oce0Var = tit0Var3.c;
                                            if (oce0Var != null) {
                                                z3 = oce0Var.k;
                                            } else {
                                                if (a3.a()) {
                                                    dht0Var.i.a.g(TaxiMainControlElementEvent.DISABLE);
                                                }
                                                jpv0 b = dht0Var.h.b();
                                                b.getClass();
                                                z3 = b instanceof hpv0;
                                            }
                                            z2 = z;
                                            oce0 oce0Var2 = new oce0(a3.a, a3.b, a3.c, a3.d, a3.e, a3.f, a3.g, a3.h, a3.i, a3.j, z3);
                                            tit0Var3.c = oce0Var2;
                                            rft0 rft0Var = dht0Var.b;
                                            ppr0 ppr0Var = new ppr0(24, dht0Var, oce0Var2);
                                            qht0 qht0Var = (qht0) rft0Var;
                                            qht0Var.getClass();
                                            qht0Var.h(new sce0(oce0Var2), ppr0Var);
                                            if (a3.j) {
                                                dht0Var.d.a(MapPositionAction.DEFAULT);
                                            }
                                            ((nwx0) dht0Var.g).a.c().C1();
                                            dht0Var.e.i(pv0Var2);
                                        }
                                        com.yandex.go.taxi.summary.map.focus.data.c cVar = (com.yandex.go.taxi.summary.map.focus.data.c) eVar2.q;
                                        cVar.getClass();
                                        cVar.d = new AtomicBoolean(true);
                                        h56.b(eVar2.K, a, eVar2.e, pv0Var2, tit0Var.a, null, 16);
                                    } else {
                                        z2 = z;
                                        fu00Var.a = Integer.MAX_VALUE;
                                        fu00Var.b = 0;
                                    }
                                    if (!z2 || (!com.yandex.go.preorder.address.e.b(pv0Var2) && c2)) {
                                        tte0Var = tte0Var2;
                                        address = address3;
                                    } else {
                                        dr40 dr40Var2 = eVar2.x;
                                        zzs zzsVar6 = tit0Var.l;
                                        nq40 nq40Var = eVar2.m;
                                        mq40 mq40Var = tit0Var.d;
                                        List list2 = tit0Var.f;
                                        nq40Var.getClass();
                                        Iterator it3 = list2.iterator();
                                        while (true) {
                                            if (it3.hasNext()) {
                                                obj2 = it3.next();
                                                String str2 = ((wpb0) obj2).a;
                                                wq40 b2 = mq40Var.b();
                                                if (jl40.l(str2, b2 != null ? b2.a : null)) {
                                                }
                                            } else {
                                                obj2 = null;
                                            }
                                        }
                                        wpb0 wpb0Var2 = (wpb0) obj2;
                                        List list3 = pv0Var2.e;
                                        zzs B3 = address3.B();
                                        mq40 mq40Var2 = pv0Var2.c;
                                        tit0Var.d = mq40Var2;
                                        tit0Var.f = list3;
                                        if (mq40Var2.a.isEmpty()) {
                                            uq40 uq40Var2 = (uq40) yq40Var.b.get();
                                            tit0 tit0Var4 = uq40Var2.n;
                                            if (uq40Var2.d()) {
                                                ede0 ede0Var = uq40Var2.f.i;
                                                ede0Var.getClass();
                                                tte0Var = tte0Var2;
                                                address = address3;
                                                pv0Var = pv0Var2;
                                                dr40Var = dr40Var2;
                                                ede0Var.a.a("PositionChoicesAutoDismissPicker", new HashMap(), 1, new HashMap());
                                            } else {
                                                dr40Var = dr40Var2;
                                                tte0Var = tte0Var2;
                                                address = address3;
                                                pv0Var = pv0Var2;
                                            }
                                            if (!tit0Var4.c() && tit0Var4.h) {
                                                ru.yandex.taxi.preorder.source.pickup.a aVar5 = uq40Var2.a;
                                                aVar5.getClass();
                                                dmb0 dmb0Var = new dmb0();
                                                List b3 = aVar5.o.b();
                                                ArrayList arrayList = new ArrayList(tcc.n(b3, 10));
                                                Iterator it4 = b3.iterator();
                                                while (it4.hasNext()) {
                                                    wpb0 wpb0Var3 = (wpb0) it4.next();
                                                    String str3 = wpb0Var3.f;
                                                    if (str3 == null || evu0.J(str3)) {
                                                        it = it4;
                                                    } else {
                                                        it = it4;
                                                        wpb0Var3 = new wpb0(wpb0Var3, null);
                                                    }
                                                    arrayList.add(wpb0Var3);
                                                    it4 = it;
                                                }
                                                dmb0Var.a = arrayList;
                                                dmb0Var.b = aVar5.o.a();
                                                dmb0Var.c = aVar5.o.d();
                                                aVar5.o = new fmb0(dmb0Var);
                                                uq40Var2.z.g();
                                            }
                                            uq40Var2.c(ModalViewOrigin.HOME);
                                        } else {
                                            dr40Var = dr40Var2;
                                            tte0Var = tte0Var2;
                                            address = address3;
                                            pv0Var = pv0Var2;
                                        }
                                        wq40 b4 = mq40Var2.b();
                                        jr40 c3 = mq40Var2.c(b4);
                                        if (b4 == null) {
                                            b4 = mq40Var2.a();
                                            c3 = mq40Var2.c(b4);
                                        }
                                        if (c3 == null) {
                                            tit0Var.q = null;
                                            tit0Var.p = null;
                                            b4 = mq40Var2.b();
                                            c3 = mq40Var2.c(b4);
                                        }
                                        PlainAddress plainAddress2 = b4 != null ? b4.c : null;
                                        if (plainAddress2 != null) {
                                            if (address.getPickAction() != null) {
                                                String pickAction = address.getPickAction();
                                                if (pickAction == null) {
                                                    pickAction = "";
                                                }
                                                plainAddress2.L1(pickAction);
                                            }
                                            plainAddress2.p(address.getZoneName());
                                        }
                                        Action finalSuggestAction = address.getFinalSuggestAction();
                                        qqo qqoVar = nq40Var.a;
                                        if (!((ir40) qqoVar.b()).b || B3 == zzs.f || zzsVar6 == null) {
                                            nq40Var.b = null;
                                            multiexitProcessActionType = MultiexitProcessActionType.DEFAULT_SHOW_MULTIEXIT_MODAL_VIEW;
                                        } else if (zzsVar6.equals(B3)) {
                                            multiexitProcessActionType = MultiexitProcessActionType.FOCUS_MULTIEXIT_POINT;
                                        } else {
                                            wpb0 wpb0Var4 = nq40Var.b;
                                            nq40Var.b = wpb0Var2;
                                            if (((ir40) qqoVar.b()).f != null) {
                                                if (srb1.d(zzsVar6, B3) <= r5.intValue() && finalSuggestAction == Action.REDIRECT) {
                                                    multiexitProcessActionType = MultiexitProcessActionType.FOCUS_MULTIEXIT_POINT_WITH_NOTIFICATION;
                                                }
                                            }
                                            if (((ir40) qqoVar.b()).g != null) {
                                                break;
                                            }
                                            zzs zzsVar7 = wpb0Var4 != null ? wpb0Var4.b : null;
                                            if (zzsVar7 == null ? false : zzsVar7.equals(B3)) {
                                                multiexitProcessActionType = MultiexitProcessActionType.FOCUS_MULTIEXIT_POINT_WITH_NOTIFICATION;
                                            }
                                            multiexitProcessActionType = MultiexitProcessActionType.DEFAULT_SHOW_MULTIEXIT_MODAL_VIEW;
                                        }
                                        int i4 = z9t0.a[multiexitProcessActionType.ordinal()];
                                        if (i4 == 1) {
                                            dr40 dr40Var3 = dr40Var;
                                            tj60 tj60Var = dr40Var3.b;
                                            ir40 ir40Var = (ir40) dr40Var3.e.b();
                                            MultiexitEntranceChangeNotification a5 = dr40Var3.a(ir40Var, ir40Var.i);
                                            if (a5 != null) {
                                                tj60Var.c(MultiexitEntranceChangeNotification.NOTIFICATION_ID);
                                                tj60Var.e(a5);
                                            }
                                        } else if (i4 != 2) {
                                            if (i4 == 3) {
                                                yq40Var.a(tit0Var.a(), c3, b4, list3);
                                                dr40 dr40Var4 = dr40Var;
                                                tj60 tj60Var2 = dr40Var4.b;
                                                ir40 ir40Var2 = (ir40) dr40Var4.e.b();
                                                MultiexitEntranceChangeNotification a6 = dr40Var4.a(ir40Var2, ir40Var2.h);
                                                if (a6 != null) {
                                                    tj60Var2.c(MultiexitEntranceChangeNotification.NOTIFICATION_ID);
                                                    tj60Var2.e(a6);
                                                }
                                            } else {
                                                if (i4 != 4) {
                                                    if (i4 == 5) {
                                                        eVar2.F.b = false;
                                                        ArrayList a7 = tit0Var.a();
                                                        yq40Var.c.m = false;
                                                        uq40 uq40Var3 = (uq40) yq40Var.b.get();
                                                        uq40Var3.a.f(a7, list3);
                                                        uq40Var3.z.g();
                                                        if (c3 != null && b4 != null) {
                                                            jpv0 b5 = uq40Var3.A.b();
                                                            b5.getClass();
                                                            if (((b5 instanceof fpv0) && !uq40Var3.p.b()) || xna1.d(b4.c)) {
                                                                rjt0 rjt0Var = uq40Var3.f;
                                                                wq40 wq40Var = uq40Var3.n.q;
                                                                x770 x770Var = rjt0Var.m;
                                                                String str4 = b4.a;
                                                                String str5 = c3.b;
                                                                String str6 = b4.b;
                                                                for (PositionChoicesShowPickerAnalytics$PointTypeV2 positionChoicesShowPickerAnalytics$PointTypeV2 : PositionChoicesShowPickerAnalytics$PointTypeV2.a()) {
                                                                    if (jl40.l(positionChoicesShowPickerAnalytics$PointTypeV2.getEventValue(), "starting")) {
                                                                        String str7 = wq40Var != null ? wq40Var.a : null;
                                                                        x770Var.getClass();
                                                                        HashMap hashMap = new HashMap();
                                                                        hashMap.put("pointId", str4);
                                                                        hashMap.put("choiceName", str5);
                                                                        hashMap.put("choicePointName", str6);
                                                                        hashMap.put("pointType", positionChoicesShowPickerAnalytics$PointTypeV2.getEventValue());
                                                                        if (str7 != null) {
                                                                            hashMap.put("prevPointId", str7);
                                                                        }
                                                                        x770Var.a.a("PositionChoicesShowPicker", hashMap, 2, new HashMap());
                                                                        uq40Var3.g(mq40Var2, c3, b4);
                                                                    }
                                                                }
                                                                w511.i("Collection contains no element matching the predicate.");
                                                            } else if (uq40Var3.t.a.a() != SourcePointMode.ROUTE) {
                                                                uq40Var3.e(c3, b4, false);
                                                            }
                                                        }
                                                    } else {
                                                        w511.b();
                                                    }
                                                    return null;
                                                }
                                                yq40Var.a(tit0Var.a(), c3, b4, list3);
                                            }
                                        }
                                        if (eVar2.M.b()) {
                                            pv0Var2 = pv0Var;
                                        } else {
                                            pv0Var2 = pv0Var;
                                            eVar2.r.e(pv0Var2);
                                        }
                                    }
                                    tte0Var.f();
                                    tit0Var.l = address.B();
                                    if (!z2) {
                                        eVar2.a(pv0Var2);
                                    }
                                }
                            }
                            z = false;
                            mzb mzbVar2 = eVar2.L;
                            str = pv0Var2.b.e;
                            if (str == null) {
                            }
                            boolean c22 = ((com.yandex.go.clarify_address.before_order.a) mzbVar2).c(str);
                            tit0Var.b = null;
                            tit0Var.i = false;
                            fu00 fu00Var2 = eVar2.k;
                            a = h56.a(eVar2.K, pv0Var2, eVar2.e);
                            if (a.f == null) {
                            }
                            if (z2) {
                            }
                            tte0Var = tte0Var2;
                            address = address3;
                            tte0Var.f();
                            tit0Var.l = address.B();
                            if (!z2) {
                            }
                        } else {
                            eVar2.I.b(new NotSupportedAddressException(address3, pv0Var2.d), false);
                        }
                    }
                }
                return zy11.a;
            case 23:
                ((f) ((d) this.b).J).c(FinalSuggestScreen.ADDRESSES_EDIT_SUFFIX);
                return zy11.a;
            case 24:
                ((fbt0) this.b).Lg((lgl0) obj);
                return zy11.a;
            case 25:
                ((g) this.b).a.render((r) obj);
                return zy11.a;
            case 26:
                zlm zlmVar = (zlm) obj;
                cft0 cft0Var = (cft0) this.b;
                tt ttVar = cft0Var.h;
                l7s0 l7s0Var = new l7s0(cft0Var, zlmVar);
                if (((q4) ttVar.h).a()) {
                    pex0 m = ((k) ((wiq0) ttVar.c)).m();
                    ((ru.yandex.taxi.preorder.source.routeoverlay.a) cft0Var.a).Rg(zlmVar, (m == null || (m.O instanceof uy1)) ? false : true);
                    SourcePointMode a8 = ((ru.yandex.taxi.preorder.source.mode.interactor.e) ttVar.b).a.a();
                    Polyline a9 = zlmVar.a();
                    if ((a9 == null || a9.getPoints().isEmpty()) && zlmVar.a.b() == null) {
                        if (a8.g()) {
                            iv70 iv70Var = (iv70) ttVar.l;
                            TariffOrderFlow tariffOrderFlow = ((dqe0) ttVar.a).a.P;
                            ((kv70) iv70Var).getClass();
                            switch (tariffOrderFlow != null ? jv70.a[tariffOrderFlow.ordinal()] : -1) {
                                case -1:
                                case 2:
                                case 3:
                                case 4:
                                case 5:
                                case 6:
                                    ((ru.yandex.taxi.preorder.source.mode.interactor.e) ttVar.b).h(SourcePointMode.POINT, false, false);
                                    Address g = ((com.yandex.go.route.interactor.c) ttVar.d).g();
                                    if (g != null) {
                                        ((xvw) ttVar.m).c(g.B(), new m8t0(i, l7s0Var));
                                        break;
                                    }
                                    break;
                                case 0:
                                default:
                                    w511.b();
                                    return null;
                                case 1:
                                    break;
                            }
                        }
                        if (a8 == SourcePointMode.FOCUS_ON_MULTIEXIT_POINT) {
                            l7s0Var.g();
                        }
                    } else if (!((com.yandex.go.navigation.screen.c) ttVar.g).g() || a8 == SourcePointMode.TOLL_ROAD_SELECTOR) {
                        if (((Boolean) kotlinx.coroutines.flow.e.d(((ru.yandex.taxi.address.clarification.impl.repo.a) ttVar.k).f).a.getValue()).booleanValue()) {
                            ttVar.b(zlmVar);
                            mgv0 mgv0Var = ((lgv0) ttVar.j).b;
                            mgv0Var.d = false;
                            mgv0Var.e = null;
                            mgv0Var.f = null;
                        } else if (((c9l0) ttVar.f).b()) {
                            ttVar.b(zlmVar);
                        }
                        ((tit0) ttVar.e).m = false;
                    } else {
                        ttVar.b(zlmVar);
                        Address h = zlmVar.a.h();
                        pv0 pv0Var3 = ((tit0) ttVar.e).b;
                        boolean z6 = (z81.a(h, pv0Var3 != null ? pv0Var3.a : null) || ((h == null) && a8 == SourcePointMode.ROUTE)) ? false : true;
                        if (z6) {
                            lgv0 lgv0Var2 = (lgv0) ttVar.j;
                            if (((com.yandex.go.clarify_address.before_order.a) lgv0Var2.g).a() && (lgv0Var2.d() || lgv0Var2.e())) {
                                z5 = true;
                                if (a8 != SourcePointMode.FOCUS_ON_MULTIEXIT_POINT) {
                                    l7s0Var.g();
                                } else if (z5) {
                                    ((evr) ttVar.i).b();
                                    xvw xvwVar = (xvw) ttVar.m;
                                    lgv0 lgv0Var3 = (lgv0) ttVar.j;
                                    SourcePointMode sourcePointMode2 = lgv0Var3.e() ? SourcePointMode.ROUTE_WITH_POINT_A_CONFIRMATION : lgv0Var3.d() ? SourcePointMode.ROUTE_WITH_FOCUS_TO_POINT_A : SourcePointMode.ROUTE_WITH_FOCUS_TO_POINT_B;
                                    nzb0 nzb0Var = xvwVar.b;
                                    l8x l8xVar = nzb0Var.b;
                                    if (l8xVar != null) {
                                        l8xVar.a(null);
                                    }
                                    nzb0Var.b = null;
                                    xvwVar.d.h(sourcePointMode2, true, false);
                                } else if (z6 && m != null && !((com.yandex.go.taxi.summary.map.walkingroute.e) ttVar.n).b(m) && ((lgv0) ttVar.j).f() && !((Boolean) kotlinx.coroutines.flow.e.d(((ru.yandex.taxi.address.clarification.impl.repo.a) ttVar.k).f).a.getValue()).booleanValue() && a8 != (sourcePointMode = SourcePointMode.ROUTE)) {
                                    xvw xvwVar2 = (xvw) ttVar.m;
                                    xvwVar2.getClass();
                                    nzb0 nzb0Var2 = xvwVar2.b;
                                    l8x l8xVar2 = nzb0Var2.b;
                                    if (l8xVar2 != null) {
                                        l8xVar2.a(null);
                                    }
                                    nzb0Var2.b = null;
                                    xvwVar2.d.h(sourcePointMode, true, false);
                                }
                                lgv0Var = (lgv0) ttVar.j;
                                if (!lgv0Var.a()) {
                                    mgv0 mgv0Var2 = lgv0Var.b;
                                    mgv0Var2.d = false;
                                    mgv0Var2.e = null;
                                    mgv0Var2.f = null;
                                }
                            }
                        }
                        z5 = false;
                        if (a8 != SourcePointMode.FOCUS_ON_MULTIEXIT_POINT) {
                        }
                        lgv0Var = (lgv0) ttVar.j;
                        if (!lgv0Var.a()) {
                        }
                    }
                    ((lgv0) ttVar.j).b();
                    ((xvw) ttVar.m).a();
                }
                mqz0 mqz0Var = cft0Var.c;
                ArrayList b6 = zlmVar.b();
                ru.yandex.taxi.preorder.tollroad.data.e eVar3 = mqz0Var.a;
                if (!b6.isEmpty()) {
                    Iterator it5 = b6.iterator();
                    while (it5.hasNext()) {
                        if (((ylm) it5.next()).b()) {
                            z4 = true;
                            boolean z7 = b6.size() != 1;
                            boolean f = eVar3.f();
                            boolean z8 = !f;
                            boolean z9 = (z4 || !z7 || f) ? false : true;
                            if (!((en11) mqz0Var.c.a.getValue()).isEnabled()) {
                                boolean z10 = ((grz0) eVar3.f.getValue()) == grz0.c;
                                if (z9) {
                                    eVar3.e(true, TollRoadSetReason.NEW_ROUTE_FROM_MAPKIT);
                                } else {
                                    moz0 moz0Var = mqz0Var.b;
                                    moz0Var.getClass();
                                    com.yandex.go.analytics.b bVar3 = moz0Var.a;
                                    bVar3.getClass();
                                    vug vugVar = new vug(bVar3, "TollRoad.onNewRoadFromMapkit");
                                    vugVar.g("notUseTollRoad", z8);
                                    vugVar.g("oneRoadOnly", z7);
                                    vugVar.g("hasTolls", z4);
                                    vugVar.g("noTollRoadsResponse", z10);
                                    vugVar.m();
                                }
                            } else if (z9) {
                                eVar3.e(true, TollRoadSetReason.NEW_ROUTE_FROM_MAPKIT);
                            }
                            return zy11.a;
                        }
                    }
                }
                z4 = false;
                if (b6.size() != 1) {
                }
                boolean f2 = eVar3.f();
                boolean z82 = !f2;
                if (z4) {
                }
                if (!((en11) mqz0Var.c.a.getValue()).isEnabled()) {
                }
                return zy11.a;
            case 27:
                Object a10 = ((s) this.b).f.a(continuation);
                return a10 == CoroutineSingletons.COROUTINE_SUSPENDED ? a10 : zy11.a;
            case 28:
                return a(obj, continuation);
            default:
                eht0 eht0Var = (eht0) this.b;
                jpv0 jpv0Var = (jpv0) obj;
                if (jpv0Var instanceof hpv0) {
                    eht0Var.x.c = ((hpv0) jpv0Var).a;
                    xvw xvwVar3 = eht0Var.Z;
                    mzb mzbVar3 = xvwVar3.x;
                    ru.yandex.taxi.preorder.source.mode.interactor.e eVar4 = xvwVar3.d;
                    if (!xvwVar3.o.d()) {
                        com.yandex.go.clarify_address.before_order.a aVar6 = (com.yandex.go.clarify_address.before_order.a) mzbVar3;
                        if (!aVar6.f()) {
                            if (xvwVar3.b()) {
                                aVar6.b.d = true;
                                eVar4.h(SourcePointMode.ROUTE_WITH_POINT_A_CONFIRMATION, false, false);
                            } else {
                                jev0 jev0Var = xvwVar3.r;
                                if (jev0Var.a.a() && !((com.yandex.go.taxi.summary.map.focus.data.c) jev0Var.b).d.get()) {
                                    eVar4.h(SourcePointMode.POINT_WITH_ROUTE, false, false);
                                } else if (!xvwVar3.m.a() || xvwVar3.f.d() == null || xvwVar3.h.b() == Screen.MULTI_AREA || xvwVar3.p.a()) {
                                    eVar4.h(SourcePointMode.POINT, false, false);
                                } else {
                                    SourcePointMode sourcePointMode3 = SourcePointMode.ROUTE;
                                    nzb0 nzb0Var3 = xvwVar3.b;
                                    l8x l8xVar3 = nzb0Var3.b;
                                    if (l8xVar3 != null) {
                                        l8xVar3.a(null);
                                    }
                                    nzb0Var3.b = null;
                                    eVar4.h(sourcePointMode3, true, false);
                                }
                            }
                            eht0Var.M.a();
                            ry41Var = (ry41) eht0Var.r0;
                            if (ry41Var.f() && (aVar = ry41Var.b) != null) {
                                aVar.a();
                                aVar.b.a().m(WhereYouAreModalView.class);
                            }
                            eht0Var.t0.hideBlockedZones();
                            eht0Var.q0.c();
                        }
                    }
                    ((com.yandex.go.clarify_address.before_order.a) mzbVar3).b.d = true;
                    eVar4.h(SourcePointMode.ROUTE_WITH_FOCUS_TO_POINT_A, false, false);
                    eht0Var.M.a();
                    ry41Var = (ry41) eht0Var.r0;
                    if (ry41Var.f()) {
                        aVar.a();
                        aVar.b.a().m(WhereYouAreModalView.class);
                    }
                    eht0Var.t0.hideBlockedZones();
                    eht0Var.q0.c();
                } else {
                    if (!(jpv0Var instanceof fpv0)) {
                        w511.b();
                        return null;
                    }
                    ((com.yandex.go.preorder.map.a) eht0Var.s0).a(false);
                    eht0Var.t0.showBlockedZones();
                    eht0Var.q0.c();
                    ((wjt0) eht0Var.N.get()).a();
                    xj0 xj0Var = eht0Var.O;
                    Address b7 = eht0Var.A.c().b();
                    jpv0 b8 = eht0Var.g0.b();
                    b8.getClass();
                    xj0Var.a(b7, b8 instanceof hpv0);
                }
                return zy11.a;
        }
    }
}
