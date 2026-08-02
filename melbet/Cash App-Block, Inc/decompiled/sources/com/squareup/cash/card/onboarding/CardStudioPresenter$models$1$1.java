package com.squareup.cash.card.onboarding;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.draw.RotateKt;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import app.cash.passcode.presenters.EndAppLockPresenter;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_genai_prompt.zzahg;
import com.google.android.gms.internal.mlkit_genai_prompt.zzahj;
import com.squareup.cash.blockers.presenters.ErrorPresenter;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.boost.backend.RealBoostSelector$removeBoost$1;
import com.squareup.cash.braze.RealBrazeManager$openSession$1$1;
import com.squareup.cash.buynowpaylater.viewmodels.AfterPayOrderDocumentViewModel;
import com.squareup.cash.card.onboarding.CardPreviewViewEvent;
import com.squareup.cash.card.onboarding.core.CardScene;
import com.squareup.cash.card.onboarding.core.CardSceneEffectKt$CardSceneEffect$6$1$2;
import com.squareup.cash.card.onboarding.graphics.CardGridNuxKt$CardGridNux$6$3$1$1;
import com.squareup.cash.card.onboarding.graphics.CardGridNuxKt$CardGridNux$6$3$1$3;
import com.squareup.cash.card.onboarding.graphics.CardWobbleState;
import com.squareup.cash.card.onboarding.graphics.CardWobbleState$endWobbling$2;
import com.squareup.cash.card.onboarding.graphics.scene.CardGridNuxScene;
import com.squareup.cash.card.onboarding.graphics.scene.CardGridNuxScene$resetHeroWobble$1;
import com.squareup.cash.card.onboarding.opengl.renderer.HeatRenderer;
import com.squareup.cash.card.onboarding.screens.CardStudioScreen;
import com.squareup.cash.card.spendinginsights.backend.api.GeneralSpendingInsightsError;
import com.squareup.cash.card.spendinginsights.backend.api.SpendingInsightsParsingErrorFactory;
import com.squareup.cash.card.spendinginsights.backend.api.SpendingInsightsProtoParsingError;
import com.squareup.cash.card.spendinginsights.backend.api.mappers.SpendingInsightMappersKt;
import com.squareup.cash.card.spendinginsights.backend.api.model.SpendingInsight;
import com.squareup.cash.card.spendinginsights.screens.SpendingInsightDetailScreen;
import com.squareup.cash.cashapplite.presenters.LiteActivityPresenter;
import com.squareup.cash.cashapplite.presenters.LiteCashInPresenter;
import com.squareup.cash.cashapppay.presenters.StatusInterstitialPresenter;
import com.squareup.cash.cashapppay.settings.backend.BusinessGrantManager$DeleteResult;
import com.squareup.cash.cashapppay.settings.screens.UnlinkResultScreen;
import com.squareup.cash.cashapppay.settings.viewmodels.BusinessGrantDeleted;
import com.squareup.cash.cashapppay.settings.viewmodels.CashAppPaySettingsViewEvent;
import com.squareup.cash.cdf.businessgrant.BusinessGrantRemoveConfirm;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda12;
import com.squareup.cash.checks.CaptureCheckFacePresenter$models$2$1$1;
import com.squareup.cash.checks.VerifyCheckDialogPresenter;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.db.RealAppConfigManager;
import com.squareup.cash.data.transfers.RealTransferManager$addCash$$inlined$map$1;
import com.squareup.cash.graphics.backend.gl.core.EglCore;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.graphics.backend.math.Vector4;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.music.presenters.MusicPresenter;
import com.squareup.cash.music.presenters.MusicPresenter$models$2$1;
import com.squareup.cash.observability.protovalidation.ProtoParsingError;
import com.squareup.cash.observability.protovalidation.ProtoValidationScope;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.p2pblocking.presenters.SelectCustomerPresenter;
import com.squareup.cash.profile.presenters.AddAliasPresenter;
import com.squareup.cash.score.views.ScoreSummaryKt$$ExternalSyntheticLambda1;
import com.squareup.cash.screens.Back;
import com.squareup.cash.screens.Redacted;
import com.squareup.cash.sharesheet.RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1;
import com.squareup.cash.wallet.presenters.CardLockPresenter;
import com.squareup.cash.work.webview.views.WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.spendinginsights.CardSpendingInsight;
import com.squareup.protos.cash.spendinginsights.CardSpendingInsightType;
import com.squareup.protos.cash.spendinginsights.TextSize;
import com.squareup.protos.cash.spendinginsights.appapi.SpendingInsightsAppService;
import com.squareup.protos.cash.ui.ColoredButton;
import com.squareup.protos.cash.ui.ColoredString;
import com.squareup.protos.cash.ui.graphs.HorizontalBarGraph;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class CardStudioPresenter$models$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public /* synthetic */ Object $state$delegate;
    public Object L$0;
    public int label;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardStudioPresenter$models$1$1(MutableState mutableState, MutableState mutableState2, CardScene cardScene, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 12;
        this.L$0 = mutableState;
        this.$state$delegate = mutableState2;
        this.this$0 = cardScene;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.this$0;
        switch (i) {
            case 0:
                return new CardStudioPresenter$models$1$1((CardStudioPresenter) obj2, (MutableState) this.$state$delegate, continuation, 0);
            case 1:
                CardStudioPresenter$models$1$1 cardStudioPresenter$models$1$1 = new CardStudioPresenter$models$1$1((Flow) this.$state$delegate, continuation, (MusicPresenter) obj2, 1);
                cardStudioPresenter$models$1$1.L$0 = obj;
                return cardStudioPresenter$models$1$1;
            case 2:
                CardStudioPresenter$models$1$1 cardStudioPresenter$models$1$12 = new CardStudioPresenter$models$1$1((Flow) this.$state$delegate, continuation, (MusicPresenter) obj2, 2);
                cardStudioPresenter$models$1$12.L$0 = obj;
                return cardStudioPresenter$models$1$12;
            case 3:
                return new CardStudioPresenter$models$1$1((LocalPosCheckInPresenter) obj2, (MutableState) this.$state$delegate, continuation, 3);
            case 4:
                return new CardStudioPresenter$models$1$1(4, (MutableState) this.L$0, (CardPreviewPresenter) this.$state$delegate, (CardPreviewViewEvent) obj2, continuation);
            case 5:
                CardStudioPresenter$models$1$1 cardStudioPresenter$models$1$13 = new CardStudioPresenter$models$1$1((Flow) this.$state$delegate, continuation, (EndAppLockPresenter) obj2, 5);
                cardStudioPresenter$models$1$13.L$0 = obj;
                return cardStudioPresenter$models$1$13;
            case 6:
                CardStudioPresenter$models$1$1 cardStudioPresenter$models$1$14 = new CardStudioPresenter$models$1$1((Flow) this.$state$delegate, continuation, (CardStudioUndoDialogPresenter) obj2, 6);
                cardStudioPresenter$models$1$14.L$0 = obj;
                return cardStudioPresenter$models$1$14;
            case 7:
                return new CardStudioPresenter$models$1$1(7, (MutableState) this.L$0, (Flow) this.$state$delegate, (HeatRenderer) obj2, continuation);
            case 8:
                CardStudioPresenter$models$1$1 cardStudioPresenter$models$1$15 = new CardStudioPresenter$models$1$1((Flow) this.$state$delegate, continuation, (CardStylePickerPresenter) obj2, 8);
                cardStudioPresenter$models$1$15.L$0 = obj;
                return cardStudioPresenter$models$1$15;
            case 9:
                CardStudioPresenter$models$1$1 cardStudioPresenter$models$1$16 = new CardStudioPresenter$models$1$1((CardStylePickerPresenter) obj2, continuation, 9);
                cardStudioPresenter$models$1$16.$state$delegate = obj;
                return cardStudioPresenter$models$1$16;
            case 10:
                CardStudioPresenter$models$1$1 cardStudioPresenter$models$1$17 = new CardStudioPresenter$models$1$1((Flow) this.$state$delegate, continuation, (ErrorPresenter) obj2, 10);
                cardStudioPresenter$models$1$17.L$0 = obj;
                return cardStudioPresenter$models$1$17;
            case 11:
                return new CardStudioPresenter$models$1$1((PaymentDeviceCustomizationPresenter) obj2, (MutableState) this.L$0, (MutableState) this.$state$delegate, continuation);
            case 12:
                return new CardStudioPresenter$models$1$1((MutableState) this.L$0, (MutableState) this.$state$delegate, (CardScene) obj2, continuation);
            case 13:
                CardStudioPresenter$models$1$1 cardStudioPresenter$models$1$18 = new CardStudioPresenter$models$1$1((CardGridNuxScene) this.$state$delegate, (CardWobbleState) obj2, continuation);
                cardStudioPresenter$models$1$18.L$0 = obj;
                return cardStudioPresenter$models$1$18;
            case 14:
                CardStudioPresenter$models$1$1 cardStudioPresenter$models$1$19 = new CardStudioPresenter$models$1$1((CardWobbleState) obj2, continuation, 14);
                cardStudioPresenter$models$1$19.$state$delegate = obj;
                return cardStudioPresenter$models$1$19;
            case 15:
                CardStudioPresenter$models$1$1 cardStudioPresenter$models$1$110 = new CardStudioPresenter$models$1$1((Flow) this.$state$delegate, continuation, (SelectCustomerPresenter) obj2, 15);
                cardStudioPresenter$models$1$110.L$0 = obj;
                return cardStudioPresenter$models$1$110;
            case 16:
                CardStudioPresenter$models$1$1 cardStudioPresenter$models$1$111 = new CardStudioPresenter$models$1$1((Flow) this.$state$delegate, continuation, (MusicPresenter) obj2, 16);
                cardStudioPresenter$models$1$111.L$0 = obj;
                return cardStudioPresenter$models$1$111;
            case 17:
                CardStudioPresenter$models$1$1 cardStudioPresenter$models$1$112 = new CardStudioPresenter$models$1$1((Flow) this.$state$delegate, continuation, (DisclosurePresenter) obj2, 17);
                cardStudioPresenter$models$1$112.L$0 = obj;
                return cardStudioPresenter$models$1$112;
            case 18:
                return new CardStudioPresenter$models$1$1((DisclosurePresenter) obj2, (MutableState) this.$state$delegate, continuation, 18);
            case 19:
                CardStudioPresenter$models$1$1 cardStudioPresenter$models$1$113 = new CardStudioPresenter$models$1$1((Flow) this.$state$delegate, continuation, (CardLockPresenter) obj2, 19);
                cardStudioPresenter$models$1$113.L$0 = obj;
                return cardStudioPresenter$models$1$113;
            case 20:
                CardStudioPresenter$models$1$1 cardStudioPresenter$models$1$114 = new CardStudioPresenter$models$1$1((Flow) this.$state$delegate, continuation, (ErrorPresenter) obj2, 20);
                cardStudioPresenter$models$1$114.L$0 = obj;
                return cardStudioPresenter$models$1$114;
            case 21:
                CardStudioPresenter$models$1$1 cardStudioPresenter$models$1$115 = new CardStudioPresenter$models$1$1((Flow) this.$state$delegate, continuation, (LiteActivityPresenter) obj2, 21);
                cardStudioPresenter$models$1$115.L$0 = obj;
                return cardStudioPresenter$models$1$115;
            case 22:
                CardStudioPresenter$models$1$1 cardStudioPresenter$models$1$116 = new CardStudioPresenter$models$1$1((Flow) this.$state$delegate, continuation, (AddAliasPresenter) obj2, 22);
                cardStudioPresenter$models$1$116.L$0 = obj;
                return cardStudioPresenter$models$1$116;
            case 23:
                CardStudioPresenter$models$1$1 cardStudioPresenter$models$1$117 = new CardStudioPresenter$models$1$1((Flow) this.$state$delegate, continuation, (LocalPosCheckInPresenter) obj2, 23);
                cardStudioPresenter$models$1$117.L$0 = obj;
                return cardStudioPresenter$models$1$117;
            case 24:
                CardStudioPresenter$models$1$1 cardStudioPresenter$models$1$118 = new CardStudioPresenter$models$1$1((Flow) this.$state$delegate, continuation, (LiteCashInPresenter) obj2, 24);
                cardStudioPresenter$models$1$118.L$0 = obj;
                return cardStudioPresenter$models$1$118;
            case 25:
                CardStudioPresenter$models$1$1 cardStudioPresenter$models$1$119 = new CardStudioPresenter$models$1$1((Flow) this.$state$delegate, continuation, (StatusInterstitialPresenter) obj2, 25);
                cardStudioPresenter$models$1$119.L$0 = obj;
                return cardStudioPresenter$models$1$119;
            case 26:
                return new CardStudioPresenter$models$1$1(26, (MutableState) this.L$0, (MusicPresenter) this.$state$delegate, (CashAppPaySettingsViewEvent) obj2, continuation);
            case 27:
                CardStudioPresenter$models$1$1 cardStudioPresenter$models$1$120 = new CardStudioPresenter$models$1$1((Flow) this.$state$delegate, continuation, (VerifyCheckDialogPresenter) obj2, 27);
                cardStudioPresenter$models$1$120.L$0 = obj;
                return cardStudioPresenter$models$1$120;
            case 28:
                CardStudioPresenter$models$1$1 cardStudioPresenter$models$1$121 = new CardStudioPresenter$models$1$1((Flow) this.$state$delegate, continuation, (EndAppLockPresenter) obj2, 28);
                cardStudioPresenter$models$1$121.L$0 = obj;
                return cardStudioPresenter$models$1$121;
            default:
                CardStudioPresenter$models$1$1 cardStudioPresenter$models$1$122 = new CardStudioPresenter$models$1$1((Flow) this.$state$delegate, continuation, (MusicPresenter) obj2, 29);
                cardStudioPresenter$models$1$122.L$0 = obj;
                return cardStudioPresenter$models$1$122;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
        }
        return ((CardStudioPresenter$models$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:250:0x0475, code lost:
    
        if (kotlinx.coroutines.JobKt.coroutineScope(new com.squareup.cash.card.onboarding.graphics.CardWobbleState$endWobbling$2(r13, r12, 0), r23) == r2) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:252:0x048e, code lost:
    
        return r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:256:0x0464, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.collectLatest(r0, r3, r23) == r2) goto L221;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0574, code lost:
    
        if (kotlinx.coroutines.JobKt.withContext(r0, r2, r23) == r9) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:?, code lost:
    
        return r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x0556, code lost:
    
        if (r0 == r9) goto L261;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x0548, code lost:
    
        if (kotlinx.coroutines.JobKt.withContext(r0, r2, r23) == r9) goto L261;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0336 A[Catch: Exception -> 0x02fa, TryCatch #0 {Exception -> 0x02fa, blocks: (B:155:0x02d0, B:156:0x02e6, B:158:0x02ec, B:160:0x02fd, B:165:0x030f, B:167:0x031e, B:169:0x0332, B:171:0x0336, B:172:0x033d, B:176:0x0326, B:177:0x032c, B:178:0x032f, B:179:0x0303), top: B:154:0x02d0 }] */
    /* JADX WARN: Removed duplicated region for block: B:175:0x033b  */
    /* JADX WARN: Type inference failed for: r16v0, types: [com.squareup.cash.card.spendinginsights.backend.api.model.SpendingInsight] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object withContext;
        MutableState mutableState;
        Object access$loadOrderDocument;
        MutableState mutableState2;
        Object withContext2;
        Object withContext3;
        MutableState mutableState3;
        Object access$loadInsight;
        SpendingInsight.TitleSize titleSize;
        SpendingInsight.TitleSize titleSize2;
        Object deleteBusinessGrant;
        BusinessGrantRemoveConfirm.Result result;
        int i = this.$r8$classId;
        int i2 = 5;
        int i3 = 6;
        int i4 = 7;
        int i5 = 11;
        int i6 = 12;
        int i7 = 15;
        int i8 = 16;
        int i9 = 10;
        int i10 = 3;
        int i11 = 2;
        Object obj2 = this.this$0;
        int i12 = 1;
        Continuation continuation = null;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MutableState mutableState4 = (MutableState) this.$state$delegate;
                    CardStudioPresenter cardStudioPresenter = (CardStudioPresenter) obj2;
                    Redacted redacted = ((CardStudioScreen) cardStudioPresenter.args).cashtag;
                    String str = redacted != null ? (String) redacted.getValue() : null;
                    if (str == null) {
                        str = "";
                    }
                    this.L$0 = mutableState4;
                    this.label = 1;
                    withContext = JobKt.withContext((CoroutineContext) cardStudioPresenter.ioContext, new CardStudioPresenter$initialModel$2(cardStudioPresenter, str, null), this);
                    if (withContext == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    mutableState = mutableState4;
                } else {
                    if (i13 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mutableState = (MutableState) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    withContext = obj;
                }
                mutableState.setValue((CardStudioViewModel) withContext);
                return Unit.INSTANCE;
            case 1:
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow = (Flow) this.$state$delegate;
                    RealBrazeManager$openSession$1$1 realBrazeManager$openSession$1$1 = new RealBrazeManager$openSession$1$1(coroutineScope, (MusicPresenter) obj2, 28);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow.collect(realBrazeManager$openSession$1$1, this) == coroutineSingletons2) {
                        return coroutineSingletons2;
                    }
                } else {
                    if (i14 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 2:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow2 = (Flow) this.$state$delegate;
                    RealBrazeManager$openSession$1$1 realBrazeManager$openSession$1$12 = new RealBrazeManager$openSession$1$1(coroutineScope2, (MusicPresenter) obj2, 29);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow2.collect(realBrazeManager$openSession$1$12, this) == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                } else {
                    if (i15 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 3:
                LocalPosCheckInPresenter localPosCheckInPresenter = (LocalPosCheckInPresenter) obj2;
                MutableState mutableState5 = (MutableState) this.$state$delegate;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    this.L$0 = mutableState5;
                    this.label = 1;
                    access$loadOrderDocument = LocalPosCheckInPresenter.access$loadOrderDocument(localPosCheckInPresenter, this);
                    if (access$loadOrderDocument == coroutineSingletons4) {
                        return coroutineSingletons4;
                    }
                    mutableState2 = mutableState5;
                } else {
                    if (i16 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    MutableState mutableState6 = (MutableState) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    mutableState2 = mutableState6;
                    access$loadOrderDocument = obj;
                }
                mutableState2.setValue((AfterPayOrderDocumentViewModel) access$loadOrderDocument);
                if (((AfterPayOrderDocumentViewModel) mutableState5.getValue()) instanceof AfterPayOrderDocumentViewModel.Loaded) {
                    IntentLauncher intentLauncher = (IntentLauncher) localPosCheckInPresenter.store;
                    AfterPayOrderDocumentViewModel afterPayOrderDocumentViewModel = (AfterPayOrderDocumentViewModel) mutableState5.getValue();
                    afterPayOrderDocumentViewModel.getClass();
                    String str2 = ((AfterPayOrderDocumentViewModel.Loaded) afterPayOrderDocumentViewModel).documentUrl;
                    str2.getClass();
                    intentLauncher.intentFactory.maybeStartUrlIntent(str2, intentLauncher.activity, false);
                    ((BetterNavigator.ScreenNavigator) localPosCheckInPresenter.navigator).goTo(Back.INSTANCE);
                }
                return Unit.INSTANCE;
            case 4:
                MutableState mutableState7 = (MutableState) this.L$0;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CardPreviewPresenter cardPreviewPresenter = (CardPreviewPresenter) this.$state$delegate;
                    CoroutineContext coroutineContext = cardPreviewPresenter.ioDispatcher;
                    ChannelFlowTransformLatest transformLatest = FlowKt.transformLatest(FlowKt.flowOn(FlowKt.combine(new AppLockMonitor$special$$inlined$map$2((CardPreviewViewEvent.OrderCard) ((CardPreviewViewEvent) obj2), 19), FlowKt.flowOn(new SafeFlow(new CardPreviewPresenter$cardStudio$1(cardPreviewPresenter, null)), coroutineContext), new RealTransferManager$addCash$$inlined$map$1(((RealAppConfigManager) cardPreviewPresenter.appConfig).stampConfig(), cardPreviewPresenter, i9), CardPreviewPresenter$orderLogic$3.INSTANCE), coroutineContext), new RealShareTargetsManager$shareTo$$inlined$flatMapLatest$1(continuation, cardPreviewPresenter, (CardPreviewViewModel) mutableState7.getValue(), i4));
                    MusicPresenter$models$2$1.AnonymousClass1 anonymousClass1 = new MusicPresenter$models$2$1.AnonymousClass1(i8, mutableState7);
                    this.label = 1;
                    if (transformLatest.collect(anonymousClass1, this) == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                } else {
                    if (i17 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 5:
                CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow3 = (Flow) this.$state$delegate;
                    CardModelView$1$2$2 cardModelView$1$2$2 = new CardModelView$1$2$2(coroutineScope3, (EndAppLockPresenter) obj2, i12);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow3.collect(cardModelView$1$2$2, this) == coroutineSingletons6) {
                        return coroutineSingletons6;
                    }
                } else {
                    if (i18 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 6:
                CoroutineScope coroutineScope4 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.label;
                if (i19 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow4 = (Flow) this.$state$delegate;
                    CardModelView$1$2$2 cardModelView$1$2$22 = new CardModelView$1$2$2(coroutineScope4, (CardStudioUndoDialogPresenter) obj2, i11);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow4.collect(cardModelView$1$2$22, this) == coroutineSingletons7) {
                        return coroutineSingletons7;
                    }
                } else {
                    if (i19 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 7:
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.label;
                if (i20 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow5 = (Flow) this.$state$delegate;
                    CaptureCheckFacePresenter$models$2$1$1.AnonymousClass1 anonymousClass12 = new CaptureCheckFacePresenter$models$2$1$1.AnonymousClass1(i2, (HeatRenderer) obj2, (MutableState) this.L$0);
                    this.label = 1;
                    if (flow5.collect(anonymousClass12, this) == coroutineSingletons8) {
                        return coroutineSingletons8;
                    }
                } else {
                    if (i20 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 8:
                CoroutineScope coroutineScope5 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.label;
                if (i21 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow6 = (Flow) this.$state$delegate;
                    CaptureCheckFacePresenter$models$2$1$1.AnonymousClass1 anonymousClass13 = new CaptureCheckFacePresenter$models$2$1$1.AnonymousClass1(i3, coroutineScope5, (CardStylePickerPresenter) obj2);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow6.collect(anonymousClass13, this) == coroutineSingletons9) {
                        return coroutineSingletons9;
                    }
                } else {
                    if (i21 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 9:
                CardStylePickerPresenter cardStylePickerPresenter = (CardStylePickerPresenter) obj2;
                ProduceStateScope produceStateScope = (ProduceStateScope) this.$state$delegate;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.label;
                if (i22 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Redacted redacted2 = cardStylePickerPresenter.args.cashtag;
                    if (redacted2 == null || (r3 = (String) redacted2.getValue()) == null) {
                        this.$state$delegate = null;
                        this.L$0 = produceStateScope;
                        this.label = 1;
                        withContext2 = JobKt.withContext(cardStylePickerPresenter.ioDispatcher, new CardStylePickerPresenter$models$1$2(cardStylePickerPresenter, continuation, i11), this);
                        if (withContext2 == coroutineSingletons10) {
                            return coroutineSingletons10;
                        }
                    }
                    produceStateScope.setValue(r3);
                    return Unit.INSTANCE;
                }
                if (i22 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                produceStateScope = (ProduceStateScope) this.L$0;
                SafeTrace.throwOnFailure(obj);
                withContext2 = obj;
                String str3 = (String) withContext2;
                produceStateScope.setValue(str3);
                return Unit.INSTANCE;
            case 10:
                CoroutineScope coroutineScope6 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = this.label;
                if (i23 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow7 = (Flow) this.$state$delegate;
                    CardModelView$1$2$2 cardModelView$1$2$23 = new CardModelView$1$2$2(coroutineScope6, (ErrorPresenter) obj2, i10);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow7.collect(cardModelView$1$2$23, this) == coroutineSingletons11) {
                        return coroutineSingletons11;
                    }
                } else {
                    if (i23 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 11:
                PaymentDeviceCustomizationPresenter paymentDeviceCustomizationPresenter = (PaymentDeviceCustomizationPresenter) obj2;
                CoroutineContext coroutineContext2 = paymentDeviceCustomizationPresenter.ioDispatcher;
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = this.label;
                if (i24 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    PaymentDeviceCustomizationPresenter$models$3$1$1 paymentDeviceCustomizationPresenter$models$3$1$1 = new PaymentDeviceCustomizationPresenter$models$3$1$1(paymentDeviceCustomizationPresenter, continuation, 0);
                    this.label = 1;
                    break;
                } else if (i24 == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else if (i24 == 2) {
                    SafeTrace.throwOnFailure(obj);
                    withContext3 = obj;
                    Map map = (Map) withContext3;
                    CoroutineContext coroutineContext3 = paymentDeviceCustomizationPresenter.ioDispatcher;
                    RealBoostSelector$removeBoost$1 realBoostSelector$removeBoost$1 = new RealBoostSelector$removeBoost$1(paymentDeviceCustomizationPresenter, map, (MutableState) this.L$0, (MutableState) this.$state$delegate, null, 26);
                    this.label = 3;
                    break;
                } else {
                    if (i24 == 3) {
                        SafeTrace.throwOnFailure(obj);
                        return Unit.INSTANCE;
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                this.label = 2;
                withContext3 = JobKt.withContext(coroutineContext2, new PaymentDeviceCustomizationPresenter$models$2$1(paymentDeviceCustomizationPresenter, continuation, i12), this);
                break;
            case 12:
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = this.label;
                if (i25 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SafeFlow snapshotFlow = Updater.snapshotFlow(new ScoreSummaryKt$$ExternalSyntheticLambda1((MutableState) this.L$0, (MutableState) this.$state$delegate, i10));
                    CardSceneEffectKt$CardSceneEffect$6$1$2 cardSceneEffectKt$CardSceneEffect$6$1$2 = new CardSceneEffectKt$CardSceneEffect$6$1$2((CardScene) obj2, continuation, 0);
                    this.label = 1;
                    if (FlowKt.collectLatest(snapshotFlow, cardSceneEffectKt$CardSceneEffect$6$1$2, this) == coroutineSingletons13) {
                        return coroutineSingletons13;
                    }
                } else {
                    if (i25 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 13:
                CardWobbleState cardWobbleState = (CardWobbleState) obj2;
                CardGridNuxScene cardGridNuxScene = (CardGridNuxScene) this.$state$delegate;
                CoroutineScope coroutineScope7 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = this.label;
                if (i26 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    cardGridNuxScene.glLauncher.launch(new CardGridNuxScene$resetHeroWobble$1(cardGridNuxScene, continuation, i12));
                    int i27 = 0;
                    JobKt.launch$default(coroutineScope7, null, null, new CardGridNuxKt$CardGridNux$6$3$1$1(cardWobbleState, continuation, i27), 3);
                    SafeFlow snapshotFlow2 = Updater.snapshotFlow(new SsnViewKt$$ExternalSyntheticLambda4(cardWobbleState, i7));
                    CardGridNuxKt$CardGridNux$6$3$1$3 cardGridNuxKt$CardGridNux$6$3$1$3 = new CardGridNuxKt$CardGridNux$6$3$1$3(cardGridNuxScene, i27);
                    this.L$0 = null;
                    this.label = 1;
                    if (snapshotFlow2.collect(cardGridNuxKt$CardGridNux$6$3$1$3, this) == coroutineSingletons14) {
                        return coroutineSingletons14;
                    }
                } else {
                    if (i26 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 14:
                CardWobbleState cardWobbleState2 = (CardWobbleState) obj2;
                CoroutineScope coroutineScope8 = (CoroutineScope) this.$state$delegate;
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i28 = this.label;
                try {
                    if (i28 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        FlowKt__LimitKt$takeWhile$$inlined$unsafeFlow$1 access$wobbleFlow = CardWobbleState.access$wobbleFlow(cardWobbleState2, coroutineScope8, (Quat) cardWobbleState2.wobbleRotation.getValue(), (Vector4) cardWobbleState2.wobbleTranslation.getValue());
                        CardWobbleState$endWobbling$2 cardWobbleState$endWobbling$2 = new CardWobbleState$endWobbling$2(cardWobbleState2, continuation, i12);
                        this.$state$delegate = null;
                        this.label = 1;
                        break;
                    } else {
                        if (i28 != 1) {
                            if (i28 == 2) {
                                SafeTrace.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            }
                            if (i28 != 3) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            Throwable th = (Throwable) this.L$0;
                            SafeTrace.throwOnFailure(obj);
                            throw th;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    this.$state$delegate = null;
                    this.label = 2;
                    break;
                } catch (Throwable th2) {
                    this.$state$delegate = null;
                    this.L$0 = th2;
                    this.label = 3;
                    if (JobKt.coroutineScope(new CardWobbleState$endWobbling$2(cardWobbleState2, continuation, 0), this) != coroutineSingletons15) {
                        throw th2;
                    }
                }
                break;
            case 15:
                CoroutineScope coroutineScope9 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i29 = this.label;
                if (i29 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow8 = (Flow) this.$state$delegate;
                    CardModelView$1$2$2 cardModelView$1$2$24 = new CardModelView$1$2$2(coroutineScope9, (SelectCustomerPresenter) obj2, i2);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow8.collect(cardModelView$1$2$24, this) == coroutineSingletons16) {
                        return coroutineSingletons16;
                    }
                } else {
                    if (i29 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 16:
                CoroutineScope coroutineScope10 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i30 = this.label;
                if (i30 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow9 = (Flow) this.$state$delegate;
                    CardModelView$1$2$2 cardModelView$1$2$25 = new CardModelView$1$2$2(coroutineScope10, (MusicPresenter) obj2, i3);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow9.collect(cardModelView$1$2$25, this) == coroutineSingletons17) {
                        return coroutineSingletons17;
                    }
                } else {
                    if (i30 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 17:
                CoroutineScope coroutineScope11 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i31 = this.label;
                if (i31 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow10 = (Flow) this.$state$delegate;
                    CardModelView$1$2$2 cardModelView$1$2$26 = new CardModelView$1$2$2(coroutineScope11, (DisclosurePresenter) obj2, i4);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow10.collect(cardModelView$1$2$26, this) == coroutineSingletons18) {
                        return coroutineSingletons18;
                    }
                } else {
                    if (i31 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 18:
                DisclosurePresenter disclosurePresenter = (DisclosurePresenter) obj2;
                SpendingInsightDetailScreen spendingInsightDetailScreen = (SpendingInsightDetailScreen) disclosurePresenter.analytics;
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i32 = this.label;
                if (i32 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    mutableState3 = (MutableState) this.$state$delegate;
                    SpendingInsightsAppService spendingInsightsAppService = (SpendingInsightsAppService) disclosurePresenter.appService;
                    String str4 = spendingInsightDetailScreen.f1066type;
                    try {
                        CardSpendingInsightType valueOf = CardSpendingInsightType.valueOf(str4);
                        String str5 = spendingInsightDetailScreen.context;
                        CaptureCheckFaceKt$$ExternalSyntheticLambda12 captureCheckFaceKt$$ExternalSyntheticLambda12 = new CaptureCheckFaceKt$$ExternalSyntheticLambda12(disclosurePresenter, i5);
                        this.L$0 = mutableState3;
                        this.label = 1;
                        access$loadInsight = zzahj.access$loadInsight(spendingInsightsAppService, valueOf, str5, captureCheckFaceKt$$ExternalSyntheticLambda12, this);
                        if (access$loadInsight == coroutineSingletons19) {
                            return coroutineSingletons19;
                        }
                    } catch (Exception e) {
                        throw new GeneralSpendingInsightsError(Recorder$$ExternalSyntheticOutline2.m("Could not parse insight type for SpendingInsightDetailScreen: ", str4), e);
                    }
                } else {
                    if (i32 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    MutableState mutableState8 = (MutableState) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    mutableState3 = mutableState8;
                    access$loadInsight = obj;
                }
                CardSpendingInsight cardSpendingInsight = (CardSpendingInsight) access$loadInsight;
                if (cardSpendingInsight != null) {
                    SpendingInsightsParsingErrorFactory spendingInsightsParsingErrorFactory = SpendingInsightsParsingErrorFactory.INSTANCE;
                    try {
                        ProtoValidationScope protoValidationScope = new ProtoValidationScope(cardSpendingInsight, spendingInsightsParsingErrorFactory, disclosurePresenter);
                        List list = cardSpendingInsight.colored_title;
                        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                        Iterator it = list.iterator();
                        while (it.hasNext()) {
                            arrayList.add(zzahg.toColoredText(protoValidationScope, (ColoredString) it.next()));
                        }
                        TextSize textSize = cardSpendingInsight.title_text_size;
                        int i33 = textSize == null ? -1 : SpendingInsightMappersKt.WhenMappings.$EnumSwitchMapping$0[textSize.ordinal()];
                        if (i33 == 1) {
                            titleSize = SpendingInsight.TitleSize.MEDIUM;
                        } else if (i33 != 2) {
                            ProtoParsingError.ErrorType errorType = ProtoParsingError.ErrorType.REQUIRED_FIELD_MISSING;
                            SpendingInsightsProtoParsingError spendingInsightsProtoParsingError = new SpendingInsightsProtoParsingError("TextSize", 12);
                            ErrorReporter.DefaultSamplingStrategy defaultSamplingStrategy = ErrorReporter.DefaultSamplingStrategy.INSTANCE;
                            ErrorReporter errorReporter = ErrorReporter.Companion.INSTANCE;
                            if (errorReporter != null) {
                                errorReporter.report(spendingInsightsProtoParsingError, defaultSamplingStrategy);
                                titleSize = SpendingInsight.TitleSize.MEDIUM;
                            } else {
                                WorkWebViewDownloadHandler$CookieProvider$Companion$$ExternalSyntheticLambda0.m();
                                titleSize2 = null;
                                LocalizedString localizedString = cardSpendingInsight.subtitle;
                                String str6 = localizedString == null ? localizedString.translated_value : null;
                                HorizontalBarGraph horizontalBarGraph = cardSpendingInsight.horizontal_bar_graph;
                                ProtoValidationScope.required(horizontalBarGraph, "horizontal_bar_graph");
                                SpendingInsight.HorizontalBarGraph horizontalBarGraph2 = SpendingInsightMappersKt.toHorizontalBarGraph(protoValidationScope, horizontalBarGraph);
                                SpendingInsight.SpendingAnalysis analysis = SpendingInsightMappersKt.toAnalysis(protoValidationScope, cardSpendingInsight.spending_analysis_category, cardSpendingInsight.card_spending_insight_type);
                                ColoredButton coloredButton = cardSpendingInsight.button;
                                ProtoValidationScope.required(coloredButton, "button");
                                continuation = new SpendingInsight(arrayList, titleSize2, str6, horizontalBarGraph2, analysis, SpendingInsightMappersKt.toButton(protoValidationScope, coloredButton));
                            }
                        } else {
                            titleSize = SpendingInsight.TitleSize.LARGE;
                        }
                        titleSize2 = titleSize;
                        LocalizedString localizedString2 = cardSpendingInsight.subtitle;
                        if (localizedString2 == null) {
                        }
                        HorizontalBarGraph horizontalBarGraph3 = cardSpendingInsight.horizontal_bar_graph;
                        ProtoValidationScope.required(horizontalBarGraph3, "horizontal_bar_graph");
                        SpendingInsight.HorizontalBarGraph horizontalBarGraph22 = SpendingInsightMappersKt.toHorizontalBarGraph(protoValidationScope, horizontalBarGraph3);
                        SpendingInsight.SpendingAnalysis analysis2 = SpendingInsightMappersKt.toAnalysis(protoValidationScope, cardSpendingInsight.spending_analysis_category, cardSpendingInsight.card_spending_insight_type);
                        ColoredButton coloredButton2 = cardSpendingInsight.button;
                        ProtoValidationScope.required(coloredButton2, "button");
                        continuation = new SpendingInsight(arrayList, titleSize2, str6, horizontalBarGraph22, analysis2, SpendingInsightMappersKt.toButton(protoValidationScope, coloredButton2));
                    } catch (Exception e2) {
                        throw RotateKt.toProtoParsingExceptionFor(e2, Reflection.factory.getOrCreateKotlinClass(CardSpendingInsight.class), spendingInsightsParsingErrorFactory, null);
                    }
                }
                mutableState3.setValue(continuation);
                return Unit.INSTANCE;
            case 19:
                CoroutineScope coroutineScope12 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i34 = this.label;
                if (i34 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow11 = (Flow) this.$state$delegate;
                    CardModelView$1$2$2 cardModelView$1$2$27 = new CardModelView$1$2$2(coroutineScope12, (CardLockPresenter) obj2, 8);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow11.collect(cardModelView$1$2$27, this) == coroutineSingletons20) {
                        return coroutineSingletons20;
                    }
                } else {
                    if (i34 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 20:
                CoroutineScope coroutineScope13 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i35 = this.label;
                if (i35 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow12 = (Flow) this.$state$delegate;
                    CardModelView$1$2$2 cardModelView$1$2$28 = new CardModelView$1$2$2(coroutineScope13, (ErrorPresenter) obj2, 9);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow12.collect(cardModelView$1$2$28, this) == coroutineSingletons21) {
                        return coroutineSingletons21;
                    }
                } else {
                    if (i35 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 21:
                CoroutineScope coroutineScope14 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i36 = this.label;
                if (i36 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow13 = (Flow) this.$state$delegate;
                    CardModelView$1$2$2 cardModelView$1$2$29 = new CardModelView$1$2$2(coroutineScope14, (LiteActivityPresenter) obj2, i9);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow13.collect(cardModelView$1$2$29, this) == coroutineSingletons22) {
                        return coroutineSingletons22;
                    }
                } else {
                    if (i36 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 22:
                CoroutineScope coroutineScope15 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i37 = this.label;
                if (i37 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow14 = (Flow) this.$state$delegate;
                    CardModelView$1$2$2 cardModelView$1$2$210 = new CardModelView$1$2$2(coroutineScope15, (AddAliasPresenter) obj2, i5);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow14.collect(cardModelView$1$2$210, this) == coroutineSingletons23) {
                        return coroutineSingletons23;
                    }
                } else {
                    if (i37 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 23:
                CoroutineScope coroutineScope16 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i38 = this.label;
                if (i38 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow15 = (Flow) this.$state$delegate;
                    CardModelView$1$2$2 cardModelView$1$2$211 = new CardModelView$1$2$2(coroutineScope16, (LocalPosCheckInPresenter) obj2, i6);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow15.collect(cardModelView$1$2$211, this) == coroutineSingletons24) {
                        return coroutineSingletons24;
                    }
                } else {
                    if (i38 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 24:
                CoroutineScope coroutineScope17 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i39 = this.label;
                if (i39 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow16 = (Flow) this.$state$delegate;
                    CardModelView$1$2$2 cardModelView$1$2$212 = new CardModelView$1$2$2(coroutineScope17, (LiteCashInPresenter) obj2, 13);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow16.collect(cardModelView$1$2$212, this) == coroutineSingletons25) {
                        return coroutineSingletons25;
                    }
                } else {
                    if (i39 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 25:
                CoroutineScope coroutineScope18 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i40 = this.label;
                if (i40 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow17 = (Flow) this.$state$delegate;
                    CaptureCheckFacePresenter$models$2$1$1.AnonymousClass1 anonymousClass14 = new CaptureCheckFacePresenter$models$2$1$1.AnonymousClass1(i9, coroutineScope18, (StatusInterstitialPresenter) obj2);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow17.collect(anonymousClass14, this) == coroutineSingletons26) {
                        return coroutineSingletons26;
                    }
                } else {
                    if (i40 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 26:
                CashAppPaySettingsViewEvent cashAppPaySettingsViewEvent = (CashAppPaySettingsViewEvent) obj2;
                MusicPresenter musicPresenter = (MusicPresenter) this.$state$delegate;
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i41 = this.label;
                if (i41 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    EglCore eglCore = (EglCore) musicPresenter.musicPlayer;
                    String str7 = ((BusinessGrantDeleted) cashAppPaySettingsViewEvent).businessGrantId;
                    this.label = 1;
                    deleteBusinessGrant = eglCore.deleteBusinessGrant(str7, this);
                    if (deleteBusinessGrant == coroutineSingletons27) {
                        return coroutineSingletons27;
                    }
                } else {
                    if (i41 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    deleteBusinessGrant = obj;
                }
                BusinessGrantManager$DeleteResult businessGrantManager$DeleteResult = (BusinessGrantManager$DeleteResult) deleteBusinessGrant;
                Analytics analytics = (Analytics) musicPresenter.args;
                BusinessGrantDeleted businessGrantDeleted = (BusinessGrantDeleted) cashAppPaySettingsViewEvent;
                String str8 = businessGrantDeleted.businessGrantId;
                boolean areEqual = Intrinsics.areEqual(businessGrantManager$DeleteResult, BusinessGrantManager$DeleteResult.Failed.INSTANCE);
                BusinessGrantManager$DeleteResult.Success success = BusinessGrantManager$DeleteResult.Success.INSTANCE;
                if (areEqual) {
                    result = BusinessGrantRemoveConfirm.Result.FAILURE;
                } else {
                    if (!Intrinsics.areEqual(businessGrantManager$DeleteResult, success)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    result = BusinessGrantRemoveConfirm.Result.SUCCESS;
                }
                analytics.track(new BusinessGrantRemoveConfirm(str8, result), null);
                boolean areEqual2 = Intrinsics.areEqual(businessGrantManager$DeleteResult, success);
                ((BetterNavigator.ScreenNavigator) musicPresenter.navigator).goTo(new UnlinkResultScreen(areEqual2, businessGrantDeleted.actionType));
                if (!areEqual2) {
                    ((MutableState) this.L$0).setValue(Boolean.FALSE);
                }
                return Unit.INSTANCE;
            case 27:
                CoroutineScope coroutineScope19 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i42 = this.label;
                if (i42 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow18 = (Flow) this.$state$delegate;
                    CardModelView$1$2$2 cardModelView$1$2$213 = new CardModelView$1$2$2(coroutineScope19, (VerifyCheckDialogPresenter) obj2, 14);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow18.collect(cardModelView$1$2$213, this) == coroutineSingletons28) {
                        return coroutineSingletons28;
                    }
                } else {
                    if (i42 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 28:
                CoroutineScope coroutineScope20 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i43 = this.label;
                if (i43 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow19 = (Flow) this.$state$delegate;
                    CardModelView$1$2$2 cardModelView$1$2$214 = new CardModelView$1$2$2(coroutineScope20, (EndAppLockPresenter) obj2, i7);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow19.collect(cardModelView$1$2$214, this) == coroutineSingletons29) {
                        return coroutineSingletons29;
                    }
                } else {
                    if (i43 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            default:
                CoroutineScope coroutineScope21 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i44 = this.label;
                if (i44 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow20 = (Flow) this.$state$delegate;
                    CardModelView$1$2$2 cardModelView$1$2$215 = new CardModelView$1$2$2(coroutineScope21, (MusicPresenter) obj2, i8);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow20.collect(cardModelView$1$2$215, this) == coroutineSingletons30) {
                        return coroutineSingletons30;
                    }
                } else {
                    if (i44 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardStudioPresenter$models$1$1(int i, MutableState mutableState, Object obj, Object obj2, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$state$delegate = obj;
        this.this$0 = obj2;
        this.L$0 = mutableState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardStudioPresenter$models$1$1(MoleculePresenter moleculePresenter, MutableState mutableState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = moleculePresenter;
        this.$state$delegate = mutableState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardStudioPresenter$models$1$1(PaymentDeviceCustomizationPresenter paymentDeviceCustomizationPresenter, MutableState mutableState, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 11;
        this.this$0 = paymentDeviceCustomizationPresenter;
        this.L$0 = mutableState;
        this.$state$delegate = mutableState2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardStudioPresenter$models$1$1(CardGridNuxScene cardGridNuxScene, CardWobbleState cardWobbleState, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 13;
        this.$state$delegate = cardGridNuxScene;
        this.this$0 = cardWobbleState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardStudioPresenter$models$1$1(Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ CardStudioPresenter$models$1$1(Flow flow, Continuation continuation, MoleculePresenter moleculePresenter, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$state$delegate = flow;
        this.this$0 = moleculePresenter;
    }
}
