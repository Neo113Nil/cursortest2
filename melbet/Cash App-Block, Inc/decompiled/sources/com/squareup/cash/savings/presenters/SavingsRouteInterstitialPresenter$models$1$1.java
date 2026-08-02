package com.squareup.cash.savings.presenters;

import androidx.core.text.TextUtilsCompat;
import app.cash.api.ApiResult;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientsync.readers.AndroidSyncValueSpecs;
import com.squareup.cash.clientsync.readers.SyncValueReader;
import com.squareup.cash.pdf.presenter.PdfPreviewPresenter;
import com.squareup.cash.profile.screens.ProfileScreens;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.savings.screens.SavingsRouteInterstitialScreen;
import com.squareup.protos.cash.piggybank.appapi.PiggybankAppService;
import com.squareup.protos.cash.piggybank.appapi.RefreshSavingsAppletRequest;
import com.squareup.protos.franklin.common.RequestContext;
import kotlin.Lazy;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.FlowKt;
import papa.SafeTrace;
import squareup.cash.savings.SavingsApplet;
import squareup.cash.savings.action.SavingsAction;

/* loaded from: classes6.dex */
public final class SavingsRouteInterstitialPresenter$models$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object L$0;
    public final /* synthetic */ PdfPreviewPresenter this$0;

    /* renamed from: com.squareup.cash.savings.presenters.SavingsRouteInterstitialPresenter$models$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements Function2 {
        public final /* synthetic */ int $r8$classId;
        public int label;
        public final /* synthetic */ PdfPreviewPresenter this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(PdfPreviewPresenter pdfPreviewPresenter, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.this$0 = pdfPreviewPresenter;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            int i = this.$r8$classId;
            PdfPreviewPresenter pdfPreviewPresenter = this.this$0;
            switch (i) {
                case 0:
                    return new AnonymousClass1(pdfPreviewPresenter, continuation, 0);
                default:
                    return new AnonymousClass1(pdfPreviewPresenter, continuation, 1);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            CoroutineScope coroutineScope = (CoroutineScope) obj;
            Continuation continuation = (Continuation) obj2;
            switch (this.$r8$classId) {
            }
            return ((AnonymousClass1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            SavingsAction.Action action;
            int i = this.$r8$classId;
            PdfPreviewPresenter pdfPreviewPresenter = this.this$0;
            String str = null;
            switch (i) {
                case 0:
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = this.label;
                    if (i2 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        PiggybankAppService piggybankAppService = (PiggybankAppService) pdfPreviewPresenter.args;
                        RefreshSavingsAppletRequest refreshSavingsAppletRequest = new RefreshSavingsAppletRequest((RequestContext) null, 3);
                        this.label = 1;
                        obj = piggybankAppService.refreshSavingsApplet(refreshSavingsAppletRequest, this);
                        if (obj == coroutineSingletons) {
                            break;
                        }
                    } else if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    ApiResult apiResult = (ApiResult) obj;
                    if (apiResult instanceof ApiResult.Failure) {
                        pdfPreviewPresenter.navigator.goTo(new ProfileScreens.ErrorScreen(TextUtilsCompat.errorMessaging((AndroidStringManager) pdfPreviewPresenter.stringManager, (ApiResult.Failure) apiResult, null).message, null, 14));
                    }
                    break;
                default:
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i3 = this.label;
                    if (i3 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        RealBadger2$setup$lambda$0$$inlined$mapNotNull$1 realBadger2$setup$lambda$0$$inlined$mapNotNull$1 = new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(((SyncValueReader) pdfPreviewPresenter.fileProvider).getSingleValue(AndroidSyncValueSpecs.SavingsApplet), 24);
                        this.label = 1;
                        obj = FlowKt.first(realBadger2$setup$lambda$0$$inlined$mapNotNull$1, this);
                        if (obj == coroutineSingletons2) {
                            break;
                        }
                    } else if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    SavingsAction savingsAction = ((SavingsApplet) obj).override_action;
                    if (savingsAction != null && (action = savingsAction.action) != null) {
                        SavingsAction.Action.ClientRoute clientRoute = action instanceof SavingsAction.Action.ClientRoute ? (SavingsAction.Action.ClientRoute) action : null;
                        if (clientRoute != null) {
                            str = clientRoute.value;
                        }
                    }
                    ((RealRouter) ((Lazy) pdfPreviewPresenter.pdfFile$delegate).getValue()).route(((SavingsRouteInterstitialScreen) pdfPreviewPresenter.fileSaver).routingParams, str);
                    break;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ SavingsRouteInterstitialPresenter$models$1$1(PdfPreviewPresenter pdfPreviewPresenter, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = pdfPreviewPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        PdfPreviewPresenter pdfPreviewPresenter = this.this$0;
        switch (i) {
            case 0:
                SavingsRouteInterstitialPresenter$models$1$1 savingsRouteInterstitialPresenter$models$1$1 = new SavingsRouteInterstitialPresenter$models$1$1(pdfPreviewPresenter, continuation, 0);
                savingsRouteInterstitialPresenter$models$1$1.L$0 = obj;
                return savingsRouteInterstitialPresenter$models$1$1;
            default:
                SavingsRouteInterstitialPresenter$models$1$1 savingsRouteInterstitialPresenter$models$1$12 = new SavingsRouteInterstitialPresenter$models$1$1(pdfPreviewPresenter, continuation, 1);
                savingsRouteInterstitialPresenter$models$1$12.L$0 = obj;
                return savingsRouteInterstitialPresenter$models$1$12;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((SavingsRouteInterstitialPresenter$models$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        PdfPreviewPresenter pdfPreviewPresenter = this.this$0;
        Continuation continuation = null;
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                JobKt.launch$default(coroutineScope, null, null, new AnonymousClass1(pdfPreviewPresenter, continuation, 0), 3);
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                JobKt.launch$default(coroutineScope, null, null, new AnonymousClass1(pdfPreviewPresenter, continuation, 1), 3);
                break;
        }
        return Unit.INSTANCE;
    }
}
