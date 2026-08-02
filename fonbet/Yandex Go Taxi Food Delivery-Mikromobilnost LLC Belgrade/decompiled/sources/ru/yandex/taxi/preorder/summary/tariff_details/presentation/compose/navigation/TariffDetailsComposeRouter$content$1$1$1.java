package ru.yandex.taxi.preorder.summary.tariff_details.presentation.compose.navigation;

import com.yandex.go.zone.model.Zone;
import defpackage.afx0;
import defpackage.efx0;
import defpackage.g8e;
import defpackage.gfx0;
import defpackage.hfx0;
import defpackage.ifx0;
import defpackage.jfx0;
import defpackage.jl40;
import defpackage.lfx0;
import defpackage.m950;
import defpackage.mfx0;
import defpackage.mvg;
import defpackage.nfx0;
import defpackage.ny61;
import defpackage.pex0;
import defpackage.qu;
import defpackage.sy60;
import defpackage.tse;
import defpackage.uex0;
import defpackage.w511;
import defpackage.wls;
import defpackage.zex0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.summary.tariff_details.presentation.compose.navigation.TariffDetailsComposeRouter$content$1$1$1", f = "TariffDetailsComposeRouter.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class TariffDetailsComposeRouter$content$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ zex0 $navigator;
    final /* synthetic */ mfx0 $tariffDetailUiAction;
    final /* synthetic */ nfx0 $uiActionInteractor;
    int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TariffDetailsComposeRouter$content$1$1$1(nfx0 nfx0Var, mfx0 mfx0Var, zex0 zex0Var, Continuation continuation) {
        super(2, continuation);
        this.$uiActionInteractor = nfx0Var;
        this.$tariffDetailUiAction = mfx0Var;
        this.$navigator = zex0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TariffDetailsComposeRouter$content$1$1$1(this.$uiActionInteractor, this.$tariffDetailUiAction, this.$navigator, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        TariffDetailsComposeRouter$content$1$1$1 tariffDetailsComposeRouter$content$1$1$1 = (TariffDetailsComposeRouter$content$1$1$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        tariffDetailsComposeRouter$content$1$1$1.invokeSuspend(zy11Var);
        return zy11Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Zone zone;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        b.b(obj);
        nfx0 nfx0Var = this.$uiActionInteractor;
        mfx0 mfx0Var = this.$tariffDetailUiAction;
        zex0 zex0Var = this.$navigator;
        uex0 uex0Var = nfx0Var.a;
        if (jl40.l(mfx0Var, lfx0.a)) {
            zex0Var.a.r(new qu(9));
        } else if (mfx0Var instanceof hfx0) {
            uex0Var.c.a("TariffDetails.BrandingFeatureUrlClicked");
            zex0Var.a(((hfx0) mfx0Var).a);
        } else if (mfx0Var instanceof ifx0) {
            uex0Var.c.a("TariffDetails.CarsUrlClicked");
            zex0Var.a(((ifx0) mfx0Var).a);
        } else {
            if (!(mfx0Var instanceof jfx0)) {
                w511.b();
                return null;
            }
            pex0 pex0Var = ((jfx0) mfx0Var).a;
            uex0Var.c.b("TariffDetails.MulticlassTariffClicked", g8e.z("tariff_class", pex0Var.b));
            afx0 afx0Var = zex0Var.a;
            gfx0 gfx0Var = (gfx0) afx0Var.x;
            if (gfx0Var != null && (zone = gfx0Var.getZone()) != null) {
                afx0Var.A((m950) afx0Var.I.get(), new efx0(zone, pex0Var), sy60.Q2);
            }
        }
        return zy11.a;
    }
}
