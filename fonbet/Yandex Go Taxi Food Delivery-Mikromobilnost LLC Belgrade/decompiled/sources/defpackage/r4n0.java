package defpackage;

import com.yandex.go.layers.api.model.LayersCondition$Endpoint;
import com.yandex.go.layers.api.model.params.Mode;
import com.yandex.go.layers.api.model.params.Screen;
import com.yandex.go.scooters.data_form.b;
import com.yandex.go.scooters.domain.polling.j;
import com.yandex.go.scooters.driver_license.a;
import com.yandex.go.scooters.driver_license.api.domain.model.ScootersDriverLicenseVerificationStatus;
import com.yandex.go.scooters.driver_license.data.model.ScootersDriverLicenseVerificationStatusDto;
import com.yandex.go.scooters.misc.error_dialog.ScootersErrorDialogModalView;
import com.yandex.go.scooters.mosru.api.domain.model.ScootersMosRuAuthStatus;
import com.yandex.go.scooters.offers.v2.f;
import com.yandex.go.scooters.offers.v2.g;
import com.yandex.go.scooters.passes.c;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Pair;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.scooters.presentation.detailed_order.e;
import ru.yandex.taxi.scooters.presentation.ontheway.completion.photo.vehicle_detection.domain.model.ScootersCompletionPhotoVehicleDetectionState;
import ru.yandex.taxi.scooters.presentation.route_navigation.ScootersRouteNavigationAnalytics$OpenReason;
import ru.yandex.video.m3.player.utils.DRMInfoProvider;

/* loaded from: classes13.dex */
public final class r4n0 implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r4n0(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        jkn0 jkn0Var;
        Object render;
        int i = this.a;
        int i2 = 9;
        int i3 = 3;
        int i4 = 6;
        int i5 = 1;
        Object[] objArr = 0;
        zy11 zy11Var = zy11.a;
        Object obj2 = this.b;
        switch (i) {
            case 0:
                ((p4n0) obj2).render((r3n0) obj);
                return zy11Var;
            case 1:
                ((a5n0) obj2).render((z5n0) obj);
                return zy11Var;
            case 2:
                ((p5n0) obj2).render((v5n0) obj);
                return zy11Var;
            case 3:
                f fVar = (f) obj2;
                a3n0 a3n0Var = (a3n0) obj;
                if ((a3n0Var instanceof r2n0) || (a3n0Var instanceof t2n0) || (a3n0Var instanceof z2n0)) {
                    ((m6n0) fVar.Dg()).z0();
                } else {
                    ((m6n0) fVar.Dg()).r0();
                }
                return zy11Var;
            case 4:
                ajo0 ajo0Var = (ajo0) obj;
                h7n0 h7n0Var = (h7n0) ((n6n0) obj2);
                g gVar = h7n0Var.b;
                y4c0 y4c0Var = gVar.r0;
                if (!(y4c0Var != null ? gVar.v(y4c0Var) : false)) {
                    h7n0Var.c(new nio0(ajo0Var));
                }
                return zy11Var;
            case 5:
                ((d8n0) obj2).k((gwc) obj);
                return zy11Var;
            case 6:
                ((p8n0) obj2).render((x8n0) obj);
                return zy11Var;
            case 7:
                ((pan0) obj2).tf((ScootersCompletionPhotoVehicleDetectionState) obj);
                return zy11Var;
            case 8:
                ocn0 ocn0Var = (ocn0) obj;
                b bVar = (b) obj2;
                if (ocn0Var instanceof mcn0) {
                    bVar.r(new qu(i2));
                } else {
                    if (!(ocn0Var instanceof ncn0)) {
                        bVar.getClass();
                        w511.b();
                        return null;
                    }
                    bVar.P((ncn0) ocn0Var);
                }
                return zy11Var;
            case 9:
                fdn0 fdn0Var = (fdn0) obj2;
                fdn0Var.hideLoading();
                fdn0Var.k7((hfa0) obj);
                return zy11Var;
            case 10:
                o6p0 o6p0Var = ((p6p0) obj).c;
                com.yandex.go.scooters.debt.b bVar2 = (com.yandex.go.scooters.debt.b) obj2;
                if (o6p0Var == null) {
                    ((fdn0) bVar2.Dg()).lc();
                } else {
                    bVar2.A = o6p0Var;
                    com.yandex.go.scooters.debt.b.Mg(bVar2, o6p0Var);
                }
                return zy11Var;
            case 11:
                e eVar = (e) obj2;
                mwo0 mwo0Var = (mwo0) obj;
                if (jl40.l(mwo0Var, lwo0.a)) {
                    eVar.r(av0.I);
                } else {
                    if (!(mwo0Var instanceof kwo0)) {
                        w511.b();
                        return null;
                    }
                    kwo0 kwo0Var = (kwo0) mwo0Var;
                    zuo0 zuo0Var = kwo0Var.c;
                    zzs zzsVar = kwo0Var.a;
                    ScootersRouteNavigationAnalytics$OpenReason scootersRouteNavigationAnalytics$OpenReason = kwo0Var.b;
                    ru.yandex.taxi.scooters.presentation.route_navigation.b bVar3 = eVar.T;
                    if (bVar3 != null) {
                        eVar.T = null;
                        eVar.j(new epb(bVar3));
                    }
                    s7g Q = eVar.Q();
                    p7g p7gVar = Q.a;
                    ru.yandex.taxi.scooters.presentation.route_navigation.b bVar4 = new ru.yandex.taxi.scooters.presentation.route_navigation.b(((c0g) p7gVar.a).w, p7gVar.M, (zto0) Q.Y.a, (cuo0) Q.Z.a, (pto0) Q.a0.a, (v0o0) Q.R.get(), Q.b0);
                    eVar.T = bVar4;
                    eVar.A(bVar4, new auo0(zzsVar, scootersRouteNavigationAnalytics$OpenReason, zuo0Var), new cb0(20, eVar, zuo0Var));
                    eVar.U(zuo0Var, zzsVar, kwo0Var.d);
                }
                return zy11Var;
            case 12:
                ((nhn0) obj2).updateBadgeText((String) obj);
                return zy11Var;
            case 13:
                Object obj3 = ((t2e0) obj).a;
                if (obj3 instanceof Result.Failure) {
                    obj3 = null;
                }
                ScootersDriverLicenseVerificationStatusDto scootersDriverLicenseVerificationStatusDto = (ScootersDriverLicenseVerificationStatusDto) obj3;
                a aVar = (a) obj2;
                com.yandex.go.scooters.driver_license.domain.a aVar2 = aVar.G;
                int i6 = scootersDriverLicenseVerificationStatusDto == null ? -1 : bjn0.a[scootersDriverLicenseVerificationStatusDto.ordinal()];
                if (i6 == 1) {
                    aVar2.b(ScootersDriverLicenseVerificationStatus.PENDING);
                } else if (i6 == 2) {
                    aVar2.b(ScootersDriverLicenseVerificationStatus.VERIFIED);
                    aVar.Q(false);
                } else if (i6 != 3) {
                    aVar2.b(null);
                    aVar.r(new qu(i2));
                } else {
                    aVar2.b(ScootersDriverLicenseVerificationStatus.FAILED);
                    aVar.Q(true);
                }
                return zy11Var;
            case 14:
                ScootersErrorDialogModalView scootersErrorDialogModalView = (ScootersErrorDialogModalView) obj2;
                jkn0Var = scootersErrorDialogModalView.dialogPresentation;
                render = scootersErrorDialogModalView.render(jkn0Var, continuation);
                return render == CoroutineSingletons.COROUTINE_SUSPENDED ? render : zy11Var;
            case 15:
                ((mwn0) obj2).render((w4o0) obj);
                return zy11Var;
            case 16:
                ((oyn0) obj2).g = (gyn0) obj;
                return zy11Var;
            case 17:
                Object Kg = com.yandex.go.scooters.mosru.statebar.a.Kg((com.yandex.go.scooters.mosru.statebar.a) obj2, (ScootersMosRuAuthStatus) obj, continuation);
                return Kg == CoroutineSingletons.COROUTINE_SUSPENDED ? Kg : zy11Var;
            case 18:
                r7p0 r7p0Var = (r7p0) obj;
                cyx cyxVar = ((r3o0) obj2).b;
                kdx kdxVar = new kdx();
                kdx kdxVar2 = new kdx();
                abb1.d(kdxVar2, "number", r7p0Var.a);
                abb1.d(kdxVar2, DRMInfoProvider.MediaDRMKeys.VENDOR, r7p0Var.b.k());
                kdxVar.b("polygons_selected_vehicle", kdxVar2.a());
                cyxVar.b(new byx(Screen.DISCOVERY, new c430(Mode.SCOOTERS, (kotlinx.serialization.json.b) null, new q6e("scooters", kdxVar.a())), Collections.singletonList(LayersCondition$Endpoint.POLYGONS)));
                return zy11Var;
            case 19:
                o4o0 o4o0Var = (o4o0) obj;
                com.yandex.go.scooters.offer_on_camera.domain.a aVar3 = (com.yandex.go.scooters.offer_on_camera.domain.a) obj2;
                qpo0 qpo0Var = (qpo0) ((r0) aVar3.b.b).getValue();
                ppo0 ppo0Var = qpo0Var instanceof ppo0 ? (ppo0) qpo0Var : null;
                if (ppo0Var != null) {
                    Set b = w2b1.b(o4o0Var);
                    if (!jl40.l(b, ppo0Var.b)) {
                        aVar3.b.Fg(new ppo0(ppo0Var.a, b, ppo0Var.c));
                    }
                }
                return zy11Var;
            case 20:
                ru.yandex.taxi.scooters.presentation.detailed_order.v2.a aVar4 = ((fgn0) ((ru.yandex.taxi.scooters.presentation.ontheway.f) obj2).S).a;
                Object obj4 = aVar4.Z.get();
                aVar4.z((m950) obj4, new bgn0(aVar4));
                return zy11Var;
            case 21:
                t5o0 t5o0Var = (t5o0) obj;
                ru.yandex.taxi.scooters.a aVar5 = (ru.yandex.taxi.scooters.a) obj2;
                aVar5.getClass();
                if (jl40.l(t5o0Var, s5o0.b)) {
                    aVar5.r(new pzn0(12));
                } else if (jl40.l(t5o0Var, s5o0.a)) {
                    ru.yandex.taxi.scooters.presentation.loading.b bVar5 = (ru.yandex.taxi.scooters.presentation.loading.b) aVar5.E.get();
                    aVar5.N = bVar5;
                    aVar5.z(bVar5, new mo30(29, aVar5));
                } else if (t5o0Var instanceof q5o0) {
                    aVar5.R(((q5o0) t5o0Var).a, false);
                } else {
                    if (!(t5o0Var instanceof r5o0)) {
                        w511.b();
                        return null;
                    }
                    aVar5.R(((r5o0) t5o0Var).a, true);
                }
                return zy11Var;
            case 22:
                x6o0 x6o0Var = (x6o0) obj2;
                List list = ((wl40) obj).f;
                HashMap hashMap = x6o0Var.h;
                j63 j63Var = new j63(hashMap.keySet());
                List list2 = list;
                ArrayList arrayList = new ArrayList(tcc.n(list2, 10));
                Iterator it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((zuo0) it.next()).getSessionId());
                }
                j63Var.removeAll(arrayList);
                ArrayList arrayList2 = new ArrayList(list);
                arrayList2.removeIf(new v6o0(objArr == true ? 1 : 0, new iin0(11, x6o0Var)));
                r53 r53Var = new r53(j63Var);
                while (r53Var.hasNext()) {
                    String str = (String) r53Var.next();
                    w6o0 w6o0Var = (w6o0) hashMap.remove(str);
                    if (w6o0Var != null) {
                        w6o0Var.a.detach();
                        w6o0Var.b.Hg();
                    }
                    x6o0Var.g.remove(str);
                }
                Iterator it2 = arrayList2.iterator();
                while (it2.hasNext()) {
                    zuo0 zuo0Var2 = (zuo0) it2.next();
                    String sessionId = zuo0Var2.getSessionId();
                    g641 g641Var = (g641) i5m.a((xvf0) z0s.f(x6o0Var.c, x6o0Var.e).y).get();
                    g641Var.Hg(zuo0Var2.getNumber().a, null, new r3k0(i4, x6o0Var, zuo0Var2));
                    c4p0 c4p0Var = (c4p0) x6o0Var.f.get();
                    c4p0Var.Ig(zuo0Var2.n());
                    hashMap.put(sessionId, new w6o0(g641Var, c4p0Var));
                }
                return zy11Var;
            case 23:
                n7o0 n7o0Var = (n7o0) obj2;
                Object value = ((Result) obj).getValue();
                boolean z = value instanceof Result.Failure;
                if (!z) {
                    n7o0Var.I.a.r(new lsm0((moo0) (z ? null : value), i3));
                } else if (z) {
                    cao0 cao0Var = n7o0Var.I;
                    Throwable a = Result.a(value);
                    if (a == null) {
                        a = new IllegalStateException();
                    }
                    cao0Var.a(a);
                }
                return zy11Var;
            case 24:
                ((gdo0) obj2).render(new ldo0(((ldo0) obj).a));
                return zy11Var;
            case 25:
                c cVar = (c) obj2;
                cVar.A((m950) cVar.J.get(), new zjn0((Throwable) obj, (List) null, 6), new ndn0(i5, cVar));
                return zy11Var;
            case 26:
                Object emit = ((tco0) obj2).a.emit((kr) obj, continuation);
                return emit == CoroutineSingletons.COROUTINE_SUSPENDED ? emit : zy11Var;
            case 27:
                ((fjo0) obj2).v4((List) obj);
                return zy11Var;
            case 28:
                Pair pair = (Pair) obj;
                Object a2 = j.a((j) obj2, (Set) pair.getFirst(), (Set) pair.getSecond(), continuation);
                return a2 == CoroutineSingletons.COROUTINE_SUSPENDED ? a2 : zy11Var;
            default:
                ((lno0) obj2).render((rno0) obj);
                return zy11Var;
        }
    }
}
