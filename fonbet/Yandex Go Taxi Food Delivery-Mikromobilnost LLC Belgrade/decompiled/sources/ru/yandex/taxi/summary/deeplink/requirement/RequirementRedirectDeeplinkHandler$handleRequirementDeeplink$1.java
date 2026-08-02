package ru.yandex.taxi.summary.deeplink.requirement;

import com.yandex.go.taxi.summary.api.analytics.SummaryExpandReason;
import com.yandex.go.taxi.summary.api.state.SummaryUiState$Type;
import com.yandex.go.taxi.tariffs.internal.repository.k;
import com.yandex.go.zone.dto.objects.TariffInfoGroupDefinition;
import defpackage.a7t0;
import defpackage.b580;
import defpackage.b8r;
import defpackage.evu0;
import defpackage.fmw0;
import defpackage.fnx0;
import defpackage.gi;
import defpackage.gmw0;
import defpackage.gnx0;
import defpackage.jl40;
import defpackage.lmw0;
import defpackage.mvg;
import defpackage.nqx0;
import defpackage.ny61;
import defpackage.pzt0;
import defpackage.sqv0;
import defpackage.tse;
import defpackage.vij0;
import defpackage.vqv0;
import defpackage.wls;
import defpackage.x8;
import defpackage.yqv0;
import defpackage.zjj0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.taxi.requirements.models.domain.RequirementLinkModel$RequirementLinkAction;
import ru.yandex.taxi.tariffs.model.SelectionOrigin;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.summary.deeplink.requirement.RequirementRedirectDeeplinkHandler$handleRequirementDeeplink$1", f = "RequirementRedirectDeeplinkHandler.kt", l = {70, 83}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class RequirementRedirectDeeplinkHandler$handleRequirementDeeplink$1 extends SuspendLambda implements wls {
    final /* synthetic */ vij0 $model;
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RequirementRedirectDeeplinkHandler$handleRequirementDeeplink$1(a aVar, vij0 vij0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$model = vij0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new RequirementRedirectDeeplinkHandler$handleRequirementDeeplink$1(this.this$0, this.$model, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((RequirementRedirectDeeplinkHandler$handleRequirementDeeplink$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0149  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0156  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x014e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0183  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        String h;
        nqx0 a;
        lmw0 lmw0Var;
        nqx0 nqx0Var;
        sqv0 sqv0Var;
        vqv0 vqv0Var;
        lmw0 lmw0Var2;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            b.b(obj);
            h = ((k) this.this$0.b).h();
            a aVar = this.this$0;
            vij0 vij0Var = this.$model;
            aVar.getClass();
            String str = vij0Var.d;
            if (evu0.J(str)) {
                str = ((k) aVar.b).h();
            }
            String str2 = vij0Var.c;
            String str3 = vij0Var.a;
            String str4 = vij0Var.b;
            fnx0 n = ((k) aVar.e).n();
            nqx0 b = a.b(n != null ? n.a : null, str3, str4);
            if (b != null) {
                a = b;
            } else if (evu0.J(str2)) {
                a = aVar.a(str, str3, str4);
            } else {
                nqx0 b2 = a.b(b8r.d(aVar.d, str2, str, 4), str3, str4);
                a = b2 == null ? aVar.a(str, str3, str4) : b2;
            }
            if (a != null) {
                lmw0Var = a.c;
                RequirementLinkModel$RequirementLinkAction requirementLinkModel$RequirementLinkAction = this.$model.e;
                if ((requirementLinkModel$RequirementLinkAction == RequirementLinkModel$RequirementLinkAction.ENABLE || requirementLinkModel$RequirementLinkAction == RequirementLinkModel$RequirementLinkAction.SHOW_AND_ENABLE) && (lmw0Var instanceof fmw0)) {
                    fmw0 fmw0Var = (fmw0) lmw0Var;
                    b580 e = gi.e(fmw0Var.a, fmw0Var.b);
                    x8 x8Var = (x8) this.this$0.g;
                    x8Var.c(e, false);
                    x8Var.a();
                }
                RequirementLinkModel$RequirementLinkAction requirementLinkModel$RequirementLinkAction2 = this.$model.e;
                if (requirementLinkModel$RequirementLinkAction2 == RequirementLinkModel$RequirementLinkAction.SHOW || requirementLinkModel$RequirementLinkAction2 == RequirementLinkModel$RequirementLinkAction.SHOW_AND_ENABLE) {
                    pzt0 a2 = this.this$0.a.a(new gnx0(new fnx0(a.a, SelectionOrigin.DEEPLINK), true));
                    if (a2 != null) {
                        this.L$0 = h;
                        this.L$1 = a;
                        this.L$2 = lmw0Var;
                        this.L$3 = null;
                        this.label = 1;
                        Object u0 = a2.u0(this);
                        if (u0 != coroutineSingletons) {
                            nqx0Var = a;
                            obj = u0;
                        }
                        return coroutineSingletons;
                    }
                    if (!jl40.l(((k) this.this$0.b).h(), h) && ((a7t0) this.this$0.c).a().a == SummaryUiState$Type.TRAP) {
                        ((a7t0) this.this$0.c).b(new yqv0(SummaryUiState$Type.NORMAL, ""));
                    }
                    String name = lmw0Var == null ? lmw0Var.getName() : null;
                    TariffInfoGroupDefinition tariffInfoGroupDefinition = a.b;
                    sqv0Var = new sqv0(SummaryExpandReason.AUTO_REQUIREMENT_DEEPLINK, new zjj0(name, tariffInfoGroupDefinition == null ? tariffInfoGroupDefinition.a : null));
                    vqv0Var = this.this$0.f;
                    this.L$0 = null;
                    this.L$1 = null;
                    this.L$2 = lmw0Var;
                    this.L$3 = null;
                    this.L$4 = null;
                    this.L$5 = null;
                    this.L$6 = null;
                    this.label = 2;
                    if (vqv0Var.a.emit(sqv0Var, this) != coroutineSingletons) {
                        lmw0Var2 = lmw0Var;
                        if (lmw0Var2 instanceof gmw0) {
                        }
                    }
                    return coroutineSingletons;
                }
            }
            return zy11Var;
        }
        if (i != 1) {
            if (i != 2) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            lmw0Var2 = (lmw0) this.L$2;
            b.b(obj);
            if (lmw0Var2 instanceof gmw0) {
                this.this$0.h.getClass();
                if (lmw0Var2.f()) {
                    this.this$0.i.a((gmw0) lmw0Var2, 0);
                }
            }
            return zy11Var;
        }
        lmw0Var = (lmw0) this.L$2;
        nqx0Var = (nqx0) this.L$1;
        h = (String) this.L$0;
        b.b(obj);
        a = nqx0Var;
        if (!jl40.l(((k) this.this$0.b).h(), h)) {
            ((a7t0) this.this$0.c).b(new yqv0(SummaryUiState$Type.NORMAL, ""));
        }
        if (lmw0Var == null) {
        }
        TariffInfoGroupDefinition tariffInfoGroupDefinition2 = a.b;
        sqv0Var = new sqv0(SummaryExpandReason.AUTO_REQUIREMENT_DEEPLINK, new zjj0(name, tariffInfoGroupDefinition2 == null ? tariffInfoGroupDefinition2.a : null));
        vqv0Var = this.this$0.f;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = lmw0Var;
        this.L$3 = null;
        this.L$4 = null;
        this.L$5 = null;
        this.L$6 = null;
        this.label = 2;
        if (vqv0Var.a.emit(sqv0Var, this) != coroutineSingletons) {
        }
        return coroutineSingletons;
    }
}
