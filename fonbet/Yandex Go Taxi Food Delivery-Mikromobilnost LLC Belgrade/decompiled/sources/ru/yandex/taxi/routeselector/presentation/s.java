package ru.yandex.taxi.routeselector.presentation;

import android.text.SpannableStringBuilder;
import android.widget.FrameLayout;
import com.yandex.go.address.models.Address;
import com.yandex.go.navigation.screen.api.Screen;
import defpackage.aal0;
import defpackage.ad5;
import defpackage.ah00;
import defpackage.avj0;
import defpackage.b01;
import defpackage.bal0;
import defpackage.bvf0;
import defpackage.byb;
import defpackage.c9y0;
import defpackage.d0l0;
import defpackage.dai0;
import defpackage.dkv0;
import defpackage.eal0;
import defpackage.fal0;
import defpackage.faq0;
import defpackage.g6g;
import defpackage.gal0;
import defpackage.gh00;
import defpackage.hal0;
import defpackage.hbp0;
import defpackage.hnb0;
import defpackage.hpr0;
import defpackage.hwo0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jqr;
import defpackage.kr0;
import defpackage.kyh0;
import defpackage.m9l0;
import defpackage.mob0;
import defpackage.mxb;
import defpackage.ny61;
import defpackage.oep0;
import defpackage.pav;
import defpackage.pex0;
import defpackage.pzt0;
import defpackage.q5z;
import defpackage.q660;
import defpackage.qyb;
import defpackage.rz0;
import defpackage.s0c0;
import defpackage.t8l0;
import defpackage.tb90;
import defpackage.tdp;
import defpackage.tje;
import defpackage.tls;
import defpackage.u0c0;
import defpackage.u8l0;
import defpackage.u9l0;
import defpackage.vmw0;
import defpackage.w330;
import defpackage.w6r;
import defpackage.wae0;
import defpackage.wb1;
import defpackage.wiq0;
import defpackage.wvb1;
import defpackage.x9l0;
import defpackage.yw0;
import defpackage.z9l0;
import defpackage.zy11;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.address.experiment.AddressItemMode;
import ru.yandex.taxi.routeselector.analytics.RouteSelectorOpenReason;
import ru.yandex.taxi.routeselector.view.RouteSelectorModalView;
import ru.yandex.taxi.search.address.view.PointType;
import ru.yandex.taxi.utils.CustomImageSpan;
import ru.yandex.taxi.widget.floatbuttonholder.FloatButtonHolderLayout;

/* loaded from: classes6.dex */
public final class s extends ad5 {
    public static final Object o0 = new Object();
    public final t8l0 A;
    public final faq0 B;
    public final com.yandex.go.zone.repository.o C;
    public final u8l0 D;
    public final hpr0 E;
    public final ru.yandex.taxi.search.suggest.i F;
    public final ru.yandex.taxi.preorder.source.domain.a G;
    public final u9l0 H;
    public final aal0 I;
    public final bal0 J;
    public final ah00 K;
    public final ru.yandex.taxi.address.experiment.q L;
    public final wiq0 M;
    public final q660 N;
    public final s0c0 O;
    public final wae0 P;
    public final vmw0 Q;
    public final rz0 R;
    public final byb S;
    public final dkv0 T;
    public final mxb U;
    public final kr0 V;
    public final wb1 W;
    public final w330 Z;
    public final w6r a0;
    public final pav b0;
    public final mob0 c0;
    public final hnb0 d0;
    public final g6g e0;
    public final oep0 f0;
    public final ru.yandex.taxi.favorites.address.api.experiment.a g0;
    public final ru.yandex.taxi.favorites.address.impl.data.a h0;
    public final hwo0 i0;
    public final r0 j0;
    public final r0 k0;
    public final i3y l0;
    public final i3y m0;
    public final b01 n0;
    public final ru.yandex.taxi.styling.c x;
    public final com.yandex.go.route.interactor.c y;
    public final x9l0 z;

    public s(ru.yandex.taxi.styling.c cVar, com.yandex.go.route.interactor.c cVar2, x9l0 x9l0Var, t8l0 t8l0Var, faq0 faq0Var, com.yandex.go.zone.repository.o oVar, u8l0 u8l0Var, hpr0 hpr0Var, ru.yandex.taxi.search.suggest.i iVar, ru.yandex.taxi.preorder.source.domain.a aVar, u9l0 u9l0Var, aal0 aal0Var, bal0 bal0Var, ah00 ah00Var, ru.yandex.taxi.address.experiment.q qVar, wiq0 wiq0Var, q660 q660Var, s0c0 s0c0Var, wae0 wae0Var, vmw0 vmw0Var, rz0 rz0Var, byb bybVar, dkv0 dkv0Var, mxb mxbVar, kr0 kr0Var, wb1 wb1Var, w330 w330Var, w6r w6rVar, pav pavVar, mob0 mob0Var, hnb0 hnb0Var, g6g g6gVar, oep0 oep0Var, ru.yandex.taxi.favorites.address.api.experiment.a aVar2, ru.yandex.taxi.favorites.address.impl.data.a aVar3, hwo0 hwo0Var) {
        super(m9l0.class);
        this.x = cVar;
        this.y = cVar2;
        this.z = x9l0Var;
        this.A = t8l0Var;
        this.B = faq0Var;
        this.C = oVar;
        this.D = u8l0Var;
        this.E = hpr0Var;
        this.F = iVar;
        this.G = aVar;
        this.H = u9l0Var;
        this.I = aal0Var;
        this.J = bal0Var;
        this.K = ah00Var;
        this.L = qVar;
        this.M = wiq0Var;
        this.N = q660Var;
        this.O = s0c0Var;
        this.P = wae0Var;
        this.Q = vmw0Var;
        this.R = rz0Var;
        this.S = bybVar;
        this.T = dkv0Var;
        this.U = mxbVar;
        this.V = kr0Var;
        this.W = wb1Var;
        this.Z = w330Var;
        this.a0 = w6rVar;
        this.b0 = pavVar;
        this.c0 = mob0Var;
        this.d0 = hnb0Var;
        this.e0 = g6gVar;
        this.f0 = oep0Var;
        this.g0 = aVar2;
        this.h0 = aVar3;
        this.i0 = hwo0Var;
        RouteSelectorOpenReason routeSelectorOpenReason = x9l0Var.r;
        int i = 1;
        this.j0 = bvf0.c(Boolean.valueOf(routeSelectorOpenReason == RouteSelectorOpenReason.ADJUSTMENT));
        this.k0 = bvf0.c(Boolean.FALSE);
        this.l0 = kotlin.a.a(new eal0(this, i));
        this.m0 = kotlin.a.a(new eal0(this, 2));
        this.n0 = new b01(28, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:52:0x01ea, code lost:
    
        if (r1 == r7) goto L91;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:22:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00f6  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01b6  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object Kg(s sVar, d0l0 d0l0Var, ru.yandex.taxi.address.experiment.e eVar, u0c0 u0c0Var, Continuation continuation) {
        RouteSelectorPresenter$updateAddresses$1 routeSelectorPresenter$updateAddresses$1;
        int i;
        u0c0 u0c0Var2;
        ru.yandex.taxi.address.experiment.e eVar2;
        String F;
        String D;
        boolean z;
        String str;
        boolean z2;
        hal0 fal0Var;
        m9l0 m9l0Var;
        String str2;
        x9l0 x9l0Var = sVar.z;
        wae0 wae0Var = sVar.P;
        wiq0 wiq0Var = sVar.M;
        x9l0 x9l0Var2 = sVar.z;
        if (continuation instanceof RouteSelectorPresenter$updateAddresses$1) {
            routeSelectorPresenter$updateAddresses$1 = (RouteSelectorPresenter$updateAddresses$1) continuation;
            int i2 = routeSelectorPresenter$updateAddresses$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                routeSelectorPresenter$updateAddresses$1.label = i2 - Integer.MIN_VALUE;
                Object obj = routeSelectorPresenter$updateAddresses$1.result;
                Object obj2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = routeSelectorPresenter$updateAddresses$1.label;
                if (i != 0) {
                    kotlin.b.b(obj);
                    int i3 = x9l0Var.k;
                    Address h = i3 != -1 ? (Address) kotlin.collections.a.S(i3, d0l0Var.b) : x9l0Var.b() ? d0l0Var.h() : d0l0Var.b();
                    routeSelectorPresenter$updateAddresses$1.L$0 = null;
                    routeSelectorPresenter$updateAddresses$1.L$1 = eVar;
                    routeSelectorPresenter$updateAddresses$1.L$2 = u0c0Var;
                    routeSelectorPresenter$updateAddresses$1.L$3 = null;
                    routeSelectorPresenter$updateAddresses$1.label = 1;
                    obj = h == null ? null : sVar.h0.c(h, routeSelectorPresenter$updateAddresses$1);
                    if (obj != obj2) {
                        u0c0Var2 = u0c0Var;
                        eVar2 = eVar;
                    }
                    return obj2;
                }
                if (i != 1) {
                    if (i != 2) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    m9l0Var = (m9l0) routeSelectorPresenter$updateAddresses$1.L$8;
                    kotlin.b.b(obj);
                    m9l0Var.setSaveButtonVisible(((Boolean) obj).booleanValue());
                    ((m9l0) sVar.Dg()).setDoneButtonEnabled(!((Boolean) sVar.k0.getValue()).booleanValue());
                    sVar.S.getClass();
                    if (sVar.W.c()) {
                        ((m9l0) sVar.Dg()).showAddressAdjustment();
                    }
                    return zy11.a;
                }
                u0c0 u0c0Var3 = (u0c0) routeSelectorPresenter$updateAddresses$1.L$2;
                eVar2 = (ru.yandex.taxi.address.experiment.e) routeSelectorPresenter$updateAddresses$1.L$1;
                kotlin.b.b(obj);
                u0c0Var2 = u0c0Var3;
                Address address = (Address) obj;
                F = q5z.F(address);
                D = q5z.D(address);
                String str3 = "";
                if (jl40.l(F, D)) {
                    rz0 rz0Var = sVar.R;
                    z = true;
                    if (!((qyb) rz0Var.b.b()).c || !((qyb) rz0Var.b.b()).b) {
                        str = D;
                        boolean z3 = false;
                        if (eVar2 != null) {
                            q660 q660Var = sVar.N;
                            PointType a = x9l0Var.a();
                            if (x9l0Var2.i) {
                                pex0 m = ((com.yandex.go.taxi.tariffs.internal.repository.k) wiq0Var).m();
                                wae0Var.getClass();
                                if (wae0Var.a(m != null ? m.u0 : null)) {
                                    z3 = z;
                                }
                            }
                            tb90 panoramaData = address != null ? address.getPanoramaData() : null;
                            if (z3) {
                                str3 = ((avj0) q660Var.a).h(kyh0.favorite_porch_field);
                            } else {
                                q660Var.getClass();
                            }
                            String str4 = str3;
                            yw0 yw0Var = a == PointType.SOURCE ? eVar2.a : eVar2.b;
                            if (F.length() == 0) {
                                str2 = F;
                            } else {
                                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(F);
                                CustomImageSpan customImageSpan = (CustomImageSpan) q660Var.b.getValue();
                                if (customImageSpan != null) {
                                    spannableStringBuilder.append((CharSequence) " ");
                                    spannableStringBuilder.append(" ", customImageSpan, 18);
                                }
                                str2 = spannableStringBuilder;
                            }
                            fal0Var = new gal0(new ru.yandex.taxi.address.experiment.a(str, str2, null, null, yw0Var, str4, null, null, AddressItemMode.READ_ONLY, false, false, null, panoramaData, 456540));
                        } else {
                            String str5 = str;
                            String J1 = address != null ? address.J1() : null;
                            if (x9l0Var2.i) {
                                pex0 m2 = ((com.yandex.go.taxi.tariffs.internal.repository.k) wiq0Var).m();
                                wae0Var.getClass();
                                if (wae0Var.a(m2 != null ? m2.u0 : null)) {
                                    z2 = z;
                                    fal0Var = new fal0(F, str5, J1, u0c0Var2, z2, address == null ? address.getPanoramaData() : null);
                                }
                            }
                            z2 = false;
                            fal0Var = new fal0(F, str5, J1, u0c0Var2, z2, address == null ? address.getPanoramaData() : null);
                        }
                        ((m9l0) sVar.Dg()).renderSourceDestination(fal0Var);
                        m9l0Var = (m9l0) sVar.Dg();
                        routeSelectorPresenter$updateAddresses$1.L$0 = null;
                        routeSelectorPresenter$updateAddresses$1.L$1 = null;
                        routeSelectorPresenter$updateAddresses$1.L$2 = null;
                        routeSelectorPresenter$updateAddresses$1.L$3 = null;
                        routeSelectorPresenter$updateAddresses$1.L$4 = null;
                        routeSelectorPresenter$updateAddresses$1.L$5 = null;
                        routeSelectorPresenter$updateAddresses$1.L$6 = null;
                        routeSelectorPresenter$updateAddresses$1.L$7 = null;
                        routeSelectorPresenter$updateAddresses$1.L$8 = m9l0Var;
                        routeSelectorPresenter$updateAddresses$1.label = 2;
                        obj = sVar.Ng(address, routeSelectorPresenter$updateAddresses$1);
                    }
                } else {
                    z = true;
                }
                str = "";
                boolean z32 = false;
                if (eVar2 != null) {
                }
                ((m9l0) sVar.Dg()).renderSourceDestination(fal0Var);
                m9l0Var = (m9l0) sVar.Dg();
                routeSelectorPresenter$updateAddresses$1.L$0 = null;
                routeSelectorPresenter$updateAddresses$1.L$1 = null;
                routeSelectorPresenter$updateAddresses$1.L$2 = null;
                routeSelectorPresenter$updateAddresses$1.L$3 = null;
                routeSelectorPresenter$updateAddresses$1.L$4 = null;
                routeSelectorPresenter$updateAddresses$1.L$5 = null;
                routeSelectorPresenter$updateAddresses$1.L$6 = null;
                routeSelectorPresenter$updateAddresses$1.L$7 = null;
                routeSelectorPresenter$updateAddresses$1.L$8 = m9l0Var;
                routeSelectorPresenter$updateAddresses$1.label = 2;
                obj = sVar.Ng(address, routeSelectorPresenter$updateAddresses$1);
            }
        }
        routeSelectorPresenter$updateAddresses$1 = new RouteSelectorPresenter$updateAddresses$1(sVar, continuation);
        Object obj3 = routeSelectorPresenter$updateAddresses$1.result;
        Object obj22 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = routeSelectorPresenter$updateAddresses$1.label;
        if (i != 0) {
        }
        Address address2 = (Address) obj3;
        F = q5z.F(address2);
        D = q5z.D(address2);
        String str32 = "";
        if (jl40.l(F, D)) {
        }
        str = "";
        boolean z322 = false;
        if (eVar2 != null) {
        }
        ((m9l0) sVar.Dg()).renderSourceDestination(fal0Var);
        m9l0Var = (m9l0) sVar.Dg();
        routeSelectorPresenter$updateAddresses$1.L$0 = null;
        routeSelectorPresenter$updateAddresses$1.L$1 = null;
        routeSelectorPresenter$updateAddresses$1.L$2 = null;
        routeSelectorPresenter$updateAddresses$1.L$3 = null;
        routeSelectorPresenter$updateAddresses$1.L$4 = null;
        routeSelectorPresenter$updateAddresses$1.L$5 = null;
        routeSelectorPresenter$updateAddresses$1.L$6 = null;
        routeSelectorPresenter$updateAddresses$1.L$7 = null;
        routeSelectorPresenter$updateAddresses$1.L$8 = m9l0Var;
        routeSelectorPresenter$updateAddresses$1.label = 2;
        obj3 = sVar.Ng(address2, routeSelectorPresenter$updateAddresses$1);
    }

    @Override // defpackage.ad5, defpackage.zc5
    public final void Cg() {
        super.Cg();
        ((gh00) this.K).u(this.n0);
        this.E.b((z9l0) this.l0.getValue(), (d) this.m0.getValue());
        this.Q.b(o0);
        u9l0 u9l0Var = this.H;
        ((hbp0) u9l0Var.l.getValue()).b();
        c9y0 c9y0Var = u9l0Var.e;
        c9y0Var.a = "";
        c9y0Var.b = "";
    }

    public final void Lg(FloatButtonHolderLayout floatButtonHolderLayout, hal0 hal0Var, FrameLayout frameLayout, tls tlsVar) {
        u9l0 u9l0Var = this.H;
        pzt0 pzt0Var = u9l0Var.k;
        if (pzt0Var != null) {
            pzt0Var.a(null);
        }
        u9l0Var.k = hbp0.e((hbp0) u9l0Var.l.getValue(), null, null, new RouteSelectorPanoramaViewController$addPanoramaButton$1(u9l0Var, floatButtonHolderLayout, hal0Var, this.z, frameLayout, tlsVar, null), 3);
    }

    public final void Mg(RouteSelectorModalView routeSelectorModalView) {
        Bg(routeSelectorModalView);
        x9l0 x9l0Var = this.z;
        int i = 3;
        if (x9l0Var.b()) {
            tje.N(Jg(), null, null, new RouteSelectorPresenter$attachView$1(this, null), 3);
        }
        RouteSelectorOpenReason routeSelectorOpenReason = x9l0Var.q;
        if (routeSelectorOpenReason != null) {
            if (routeSelectorOpenReason == RouteSelectorOpenReason.PIN) {
                Screen screen = Screen.AFTER_SUMMARY_CLARIFY_POINT;
                ru.yandex.taxi.persuggest.source.f fVar = (ru.yandex.taxi.persuggest.source.f) this.a0;
                fVar.getClass();
                fVar.c(dai0.z(screen));
            }
            this.A.a(new wvb1(routeSelectorOpenReason, x9l0Var.b()));
        }
        tje.N(Jg(), null, null, new RouteSelectorPresenter$attachView$3(this, null), 3);
        tje.N(Jg(), null, null, new RouteSelectorPresenter$attachView$4(this, routeSelectorModalView, null), 3);
        tje.N(Jg(), null, null, new RouteSelectorPresenter$attachView$5(this, routeSelectorModalView, null), 3);
        tje.N(Jg(), null, null, new RouteSelectorPresenter$attachView$6(this, null), 3);
        tje.N(Jg(), null, null, new RouteSelectorPresenter$attachView$7(this, routeSelectorModalView, null), 3);
        tje.N(Jg(), null, null, new RouteSelectorPresenter$attachView$8(this, routeSelectorModalView, null), 3);
        tje.N(Jg(), null, null, new RouteSelectorPresenter$attachView$9(this, null), 3);
        tje.N(Jg(), null, null, new RouteSelectorPresenter$attachView$10(this, routeSelectorModalView, null), 3);
        mob0 mob0Var = this.c0;
        if (mob0Var.b() && x9l0Var.a() == PointType.SOURCE) {
            tje.N(Jg(), null, null, new RouteSelectorPresenter$attachView$11(this, null), 3);
            tje.N(Jg(), null, null, new RouteSelectorPresenter$attachView$12(this, routeSelectorModalView, null), 3);
            kotlinx.coroutines.flow.e.H(Jg(), new jqr(new n(mob0Var.c()), new RouteSelectorPresenter$attachView$14(routeSelectorModalView, null), i));
        }
        this.E.a((z9l0) this.l0.getValue(), (d) this.m0.getValue());
        ((gh00) this.K).e(this.n0);
        this.Q.a(o0);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object Ng(Address address, ContinuationImpl continuationImpl) {
        RouteSelectorPresenter$isSaveButtonVisible$1 routeSelectorPresenter$isSaveButtonVisible$1;
        Object obj;
        int i;
        if (continuationImpl instanceof RouteSelectorPresenter$isSaveButtonVisible$1) {
            routeSelectorPresenter$isSaveButtonVisible$1 = (RouteSelectorPresenter$isSaveButtonVisible$1) continuationImpl;
            int i2 = routeSelectorPresenter$isSaveButtonVisible$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                routeSelectorPresenter$isSaveButtonVisible$1.label = i2 - Integer.MIN_VALUE;
                obj = routeSelectorPresenter$isSaveButtonVisible$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = routeSelectorPresenter$isSaveButtonVisible$1.label;
                boolean z = true;
                if (i != 0) {
                    kotlin.b.b(obj);
                    routeSelectorPresenter$isSaveButtonVisible$1.L$0 = address;
                    routeSelectorPresenter$isSaveButtonVisible$1.label = 1;
                    obj = this.g0.a.b(routeSelectorPresenter$isSaveButtonVisible$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    address = (Address) routeSelectorPresenter$isSaveButtonVisible$1.L$0;
                    kotlin.b.b(obj);
                }
                if (((tdp) obj).b || (address != null && address.getIsFavorite())) {
                    z = false;
                }
                return Boolean.valueOf(z);
            }
        }
        routeSelectorPresenter$isSaveButtonVisible$1 = new RouteSelectorPresenter$isSaveButtonVisible$1(this, continuationImpl);
        obj = routeSelectorPresenter$isSaveButtonVisible$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = routeSelectorPresenter$isSaveButtonVisible$1.label;
        boolean z2 = true;
        if (i != 0) {
        }
        if (((tdp) obj).b) {
        }
        z2 = false;
        return Boolean.valueOf(z2);
    }
}
