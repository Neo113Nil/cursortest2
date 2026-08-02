package com.squareup.cash.checks;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.SeekableTransitionState;
import androidx.compose.animation.core.SpringSpec;
import androidx.compose.foundation.gestures.FlingBehavior;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.foundation.pager.PagerState;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.node.PointerInputModifierNodeKt;
import androidx.glance.session.SessionWorker$doWork$2$2;
import androidx.paging.PageFetcher$flow$1;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.api.ApiResult;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import app.cash.local.presenters.wallet.LocalHomePresenter;
import app.cash.local.presenters.wallet.TabContentPresenter$models$4$1$1$1;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.Image;
import coil3.Image_androidKt;
import coil3.RealImageLoader;
import coil3.request.ImageRequest;
import coil3.request.ImageRequests_androidKt;
import coil3.request.ImageResult;
import com.nimbusds.jose.JWECryptoParts;
import com.plaid.internal.EnumC0170g;
import com.squareup.address.typeahead.backend.api.AddressComponents$Country;
import com.squareup.address.typeahead.backend.api.LocationSearchClient$LocationSearchResult;
import com.squareup.address.typeahead.backend.api.LocationSearchClient$SessionId$GoogleSessionId;
import com.squareup.address.typeahead.backend.real.RealLocationSearchClient;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.card.onboarding.CardModelView$iconTexture$$inlined$map$1;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.card.onboarding.core.CardScene$$ExternalSyntheticLambda1;
import com.squareup.cash.card.onboarding.core.CardSceneEffectKt;
import com.squareup.cash.card.onboarding.core.CardSceneEffectKt$cardSettleFlow$$inlined$flatMapLatest$1;
import com.squareup.cash.card.onboarding.core.instancing.BackgroundPlane$setBitmap$1;
import com.squareup.cash.card.onboarding.core.instancing.CardDesignLibraryScene;
import com.squareup.cash.card.onboarding.graphics.HeartEffectKt$HeartEffect$6$1$2;
import com.squareup.cash.card.onboarding.graphics.HeartScene;
import com.squareup.cash.card.onboarding.graphics.MiniCardEffectKt$MiniCardEffect$6$1$2;
import com.squareup.cash.card.onboarding.graphics.MiniCardScene;
import com.squareup.cash.card.onboarding.graphics.WandEffectKt$WandEffect$6$1$2;
import com.squareup.cash.card.onboarding.graphics.WandScene;
import com.squareup.cash.card.onboarding.graphics.scene.CardGridNuxScene;
import com.squareup.cash.card.onboarding.graphics.scene.CardGridNuxScene$resetHeroWobble$1;
import com.squareup.cash.cashapppay.presenters.GrantPresenter;
import com.squareup.cash.cashapppay.presenters.GrantPresenter$models$handleAction$1$1;
import com.squareup.cash.cdf.check.CheckDepositComplete;
import com.squareup.cash.cdf.check.CheckDepositReceiveError;
import com.squareup.cash.cdf.check.CheckDepositVerify;
import com.squareup.cash.checks.CaptureCheckFacePresenter$models$2$1$1;
import com.squareup.cash.checks.screens.VerifyCheckDepositScreen;
import com.squareup.cash.common.composeui.DrawerViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.core.navigationcontainer.models.NavigationModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.BlockersHelper;
import com.squareup.cash.data.blockers.RealBlockersHelper$collectBlockersActions$2;
import com.squareup.cash.data.contacts.ContactSync$SyncReason;
import com.squareup.cash.data.contacts.ContactSyncEvent;
import com.squareup.cash.data.contacts.ContactsSyncResponse;
import com.squareup.cash.data.contacts.ContactsSyncRoutine;
import com.squareup.cash.data.contacts.RealContactSync;
import com.squareup.cash.data.profile.RealProfileNotificationsRepository;
import com.squareup.cash.deposits.physical.presenter.barcode.PaperMoneyDepositBarcodeExpiredPresenter;
import com.squareup.cash.deposits.physical.presenter.details.PaperMoneyDepositMerchantDetailsPresenter;
import com.squareup.cash.deposits.physical.presenter.onboarding.PaperMoneyDepositOnboardingPresenter;
import com.squareup.cash.directdeposit.backend.api.PaycheckDepositAllocation;
import com.squareup.cash.directdeposit.backend.real.RealFormPdfProvider;
import com.squareup.cash.directdeposit.presenters.DirectDepositForm;
import com.squareup.cash.directdeposit.presenters.DirectDepositSetupPresenter;
import com.squareup.cash.directdeposit.screens.DirectDepositManualFormSubmissionScreen;
import com.squareup.cash.directdeposit.screens.DirectDepositUpdateManualFormCompletionScreen;
import com.squareup.cash.directdeposit.viewmodels.DirectDepositManualFormCompletionViewModel;
import com.squareup.cash.featureflags.AmplitudeExperiments$MobileMessagingNotificationSettingsSam;
import com.squareup.cash.featureflags.FeatureFlag$ControlTreatmentAmplitudeExperiment$Options;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.graphics.swampgl.GLLauncher;
import com.squareup.cash.graphics.swampgl.components.Scene;
import com.squareup.cash.graphics.views.AnimationsKt$takeUntil$1$1;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.analytics.UtilsKt;
import com.squareup.cash.music.presenters.MusicPresenter;
import com.squareup.cash.p2pblocking.presenters.SelectCustomerPresenter;
import com.squareup.cash.pools.presenters.PoolsListPresenter;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.wallet.views.Hero3DCardViewKt$rotateDragFlow$2;
import com.squareup.protos.cash.notificationsettings.api.v1.CategoryPreferenceUpdate;
import com.squareup.protos.cash.notificationsettings.api.v1.NotificationSettingsService;
import com.squareup.protos.cash.notificationsettings.api.v1.UpdateCategoryNotificationSettingsRequest;
import com.squareup.protos.cash.notificationsettings.common.v1.ClientChannelState;
import com.squareup.protos.cash.notificationsettings.common.v1.NotificationCategory;
import com.squareup.protos.cash.notificationsettings.common.v1.NotificationCategoryExtraConfig;
import com.squareup.protos.cash.notificationsettings.common.v1.NotificationCategoryExtraConfig$Configuration$Families;
import com.squareup.protos.cash.postbank.api.GenerateDirectDepositFormRequest;
import com.squareup.protos.cash.postbank.api.GenerateDirectDepositFormResponse;
import com.squareup.protos.cash.postbank.api.PostbankAppService;
import com.squareup.protos.cash.postbank.api.UpdateDirectDepositFormRequest;
import com.squareup.protos.cash.postbank.api.UpdateDirectDepositFormResponse;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.app.CheckDepositResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.Triple;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref$FloatRef;
import kotlin.jvm.internal.Ref$IntRef;
import kotlin.jvm.internal.Ref$LongRef;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.flow.ChannelFlowBuilder;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.internal.ChannelFlowTransformLatest;
import okio.ByteString;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class VerifyCheckDepositPresenter$models$3$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object $backPictureData$delegate;
    public final /* synthetic */ Object $frontPictureData$delegate;
    public Object $isSubmitting$delegate;
    public final /* synthetic */ int $r8$classId;
    public int label;
    public Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VerifyCheckDepositPresenter$models$3$1(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, Scene scene, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$isSubmitting$delegate = mutableState;
        this.$frontPictureData$delegate = mutableState2;
        this.$backPictureData$delegate = mutableState3;
        this.this$0 = scene;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$backPictureData$delegate;
        Object obj3 = this.$frontPictureData$delegate;
        switch (i) {
            case 0:
                return new VerifyCheckDepositPresenter$models$3$1(this.this$0, this.$isSubmitting$delegate, obj3, obj2, continuation, 0);
            case 1:
                return new VerifyCheckDepositPresenter$models$3$1(this.this$0, obj3, obj2, (MutableState) this.$isSubmitting$delegate, continuation, 1);
            case 2:
                return new VerifyCheckDepositPresenter$models$3$1((String) this.this$0, (CardDesignLibraryScene) this.$isSubmitting$delegate, (RealImageLoader) obj3, (Context) obj2, continuation, 2);
            case 3:
                return new VerifyCheckDepositPresenter$models$3$1(this.this$0, obj3, obj2, (MutableState) this.$isSubmitting$delegate, continuation, 3);
            case 4:
                return new VerifyCheckDepositPresenter$models$3$1((MutableState) this.$isSubmitting$delegate, (MutableState) obj3, (MutableState) obj2, (Scene) this.this$0, continuation, 4);
            case 5:
                return new VerifyCheckDepositPresenter$models$3$1((MutableState) this.$isSubmitting$delegate, (MutableState) obj3, (MutableState) obj2, (Scene) this.this$0, continuation, 5);
            case 6:
                return new VerifyCheckDepositPresenter$models$3$1((MutableState) this.$isSubmitting$delegate, (MutableState) obj3, (MutableState) obj2, (Scene) this.this$0, continuation, 6);
            case 7:
                VerifyCheckDepositPresenter$models$3$1 verifyCheckDepositPresenter$models$3$1 = new VerifyCheckDepositPresenter$models$3$1((Flow) obj3, continuation, (MoleculePresenter) obj2, (MutableState) this.$isSubmitting$delegate, 7);
                verifyCheckDepositPresenter$models$3$1.this$0 = obj;
                return verifyCheckDepositPresenter$models$3$1;
            case 8:
                VerifyCheckDepositPresenter$models$3$1 verifyCheckDepositPresenter$models$3$12 = new VerifyCheckDepositPresenter$models$3$1((GrantPresenter) obj3, (BlockerAction) obj2, (MutableState) this.$isSubmitting$delegate, continuation);
                verifyCheckDepositPresenter$models$3$12.this$0 = obj;
                return verifyCheckDepositPresenter$models$3$12;
            case 9:
                VerifyCheckDepositPresenter$models$3$1 verifyCheckDepositPresenter$models$3$13 = new VerifyCheckDepositPresenter$models$3$1((Flow) obj3, continuation, (MoleculePresenter) obj2, (MutableState) this.$isSubmitting$delegate, 9);
                verifyCheckDepositPresenter$models$3$13.this$0 = obj;
                return verifyCheckDepositPresenter$models$3$13;
            case 10:
                VerifyCheckDepositPresenter$models$3$1 verifyCheckDepositPresenter$models$3$14 = new VerifyCheckDepositPresenter$models$3$1((Flow) obj3, continuation, (MoleculePresenter) obj2, (MutableState) this.$isSubmitting$delegate, 10);
                verifyCheckDepositPresenter$models$3$14.this$0 = obj;
                return verifyCheckDepositPresenter$models$3$14;
            case 11:
                VerifyCheckDepositPresenter$models$3$1 verifyCheckDepositPresenter$models$3$15 = new VerifyCheckDepositPresenter$models$3$1((Flow) obj3, continuation, (MoleculePresenter) obj2, (MutableState) this.$isSubmitting$delegate, 11);
                verifyCheckDepositPresenter$models$3$15.this$0 = obj;
                return verifyCheckDepositPresenter$models$3$15;
            case 12:
                VerifyCheckDepositPresenter$models$3$1 verifyCheckDepositPresenter$models$3$16 = new VerifyCheckDepositPresenter$models$3$1((Flow) obj3, continuation, (MoleculePresenter) obj2, (MutableState) this.$isSubmitting$delegate, 12);
                verifyCheckDepositPresenter$models$3$16.this$0 = obj;
                return verifyCheckDepositPresenter$models$3$16;
            case 13:
                VerifyCheckDepositPresenter$models$3$1 verifyCheckDepositPresenter$models$3$17 = new VerifyCheckDepositPresenter$models$3$1((FlingBehavior) obj3, (Ref$FloatRef) obj2, continuation);
                verifyCheckDepositPresenter$models$3$17.$isSubmitting$delegate = obj;
                return verifyCheckDepositPresenter$models$3$17;
            case 14:
                return new VerifyCheckDepositPresenter$models$3$1((Ref$IntRef) this.this$0, (PagerState) this.$isSubmitting$delegate, (SeekableTransitionState) obj3, (NavigationModel.Ready.Swipe) obj2, continuation, 14);
            case 15:
                VerifyCheckDepositPresenter$models$3$1 verifyCheckDepositPresenter$models$3$18 = new VerifyCheckDepositPresenter$models$3$1((Flow) obj3, continuation, (MoleculePresenter) obj2, (MutableState) this.$isSubmitting$delegate, 15);
                verifyCheckDepositPresenter$models$3$18.this$0 = obj;
                return verifyCheckDepositPresenter$models$3$18;
            case 16:
                return new VerifyCheckDepositPresenter$models$3$1((RealContactSync) this.this$0, (ContactSyncEvent.SyncRoutines) this.$isSubmitting$delegate, (List) obj3, (ContactSync$SyncReason) obj2, continuation, 16);
            case 17:
                return new VerifyCheckDepositPresenter$models$3$1((LinkedHashMap) this.this$0, (RealProfileNotificationsRepository) this.$isSubmitting$delegate, (String) obj3, (Long) obj2, continuation, 17);
            case 18:
                return new VerifyCheckDepositPresenter$models$3$1((PoolsListPresenter) this.this$0, (MutableState) obj3, (MutableState) obj2, continuation);
            case 19:
                VerifyCheckDepositPresenter$models$3$1 verifyCheckDepositPresenter$models$3$19 = new VerifyCheckDepositPresenter$models$3$1((Flow) obj3, continuation, (MoleculePresenter) obj2, (MutableState) this.$isSubmitting$delegate, 19);
                verifyCheckDepositPresenter$models$3$19.this$0 = obj;
                return verifyCheckDepositPresenter$models$3$19;
            case 20:
                VerifyCheckDepositPresenter$models$3$1 verifyCheckDepositPresenter$models$3$110 = new VerifyCheckDepositPresenter$models$3$1((Flow) obj3, continuation, (MoleculePresenter) obj2, (MutableState) this.$isSubmitting$delegate, 20);
                verifyCheckDepositPresenter$models$3$110.this$0 = obj;
                return verifyCheckDepositPresenter$models$3$110;
            case 21:
                VerifyCheckDepositPresenter$models$3$1 verifyCheckDepositPresenter$models$3$111 = new VerifyCheckDepositPresenter$models$3$1((Flow) obj3, continuation, (MoleculePresenter) obj2, (MutableState) this.$isSubmitting$delegate, 21);
                verifyCheckDepositPresenter$models$3$111.this$0 = obj;
                return verifyCheckDepositPresenter$models$3$111;
            case 22:
                VerifyCheckDepositPresenter$models$3$1 verifyCheckDepositPresenter$models$3$112 = new VerifyCheckDepositPresenter$models$3$1((Flow) obj3, continuation, (MoleculePresenter) obj2, (MutableState) this.$isSubmitting$delegate, 22);
                verifyCheckDepositPresenter$models$3$112.this$0 = obj;
                return verifyCheckDepositPresenter$models$3$112;
            case 23:
                VerifyCheckDepositPresenter$models$3$1 verifyCheckDepositPresenter$models$3$113 = new VerifyCheckDepositPresenter$models$3$1((Flow) obj3, continuation, (MoleculePresenter) obj2, (MutableState) this.$isSubmitting$delegate, 23);
                verifyCheckDepositPresenter$models$3$113.this$0 = obj;
                return verifyCheckDepositPresenter$models$3$113;
            case 24:
                VerifyCheckDepositPresenter$models$3$1 verifyCheckDepositPresenter$models$3$114 = new VerifyCheckDepositPresenter$models$3$1((Flow) obj3, continuation, (MoleculePresenter) obj2, (MutableState) this.$isSubmitting$delegate, 24);
                verifyCheckDepositPresenter$models$3$114.this$0 = obj;
                return verifyCheckDepositPresenter$models$3$114;
            case 25:
                VerifyCheckDepositPresenter$models$3$1 verifyCheckDepositPresenter$models$3$115 = new VerifyCheckDepositPresenter$models$3$1((Flow) obj3, continuation, (MoleculePresenter) obj2, (MutableState) this.$isSubmitting$delegate, 25);
                verifyCheckDepositPresenter$models$3$115.this$0 = obj;
                return verifyCheckDepositPresenter$models$3$115;
            case 26:
                VerifyCheckDepositPresenter$models$3$1 verifyCheckDepositPresenter$models$3$116 = new VerifyCheckDepositPresenter$models$3$1((Flow) obj3, continuation, (MoleculePresenter) obj2, (MutableState) this.$isSubmitting$delegate, 26);
                verifyCheckDepositPresenter$models$3$116.this$0 = obj;
                return verifyCheckDepositPresenter$models$3$116;
            case 27:
                return new VerifyCheckDepositPresenter$models$3$1((LocalHomePresenter) obj2, (MutableState) this.$isSubmitting$delegate, (MutableState) obj3, continuation);
            case 28:
                VerifyCheckDepositPresenter$models$3$1 verifyCheckDepositPresenter$models$3$117 = new VerifyCheckDepositPresenter$models$3$1((Flow) this.$isSubmitting$delegate, continuation, (DirectDepositSetupPresenter) obj3, (State) obj2, 28);
                verifyCheckDepositPresenter$models$3$117.this$0 = obj;
                return verifyCheckDepositPresenter$models$3$117;
            default:
                VerifyCheckDepositPresenter$models$3$1 verifyCheckDepositPresenter$models$3$118 = new VerifyCheckDepositPresenter$models$3$1((Flow) this.$isSubmitting$delegate, continuation, (DisclosurePresenter) obj3, (State) obj2, 29);
                verifyCheckDepositPresenter$models$3$118.this$0 = obj;
                return verifyCheckDepositPresenter$models$3$118;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 14:
                break;
        }
        return ((VerifyCheckDepositPresenter$models$3$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:101:0x01ee, code lost:
    
        if (r0 != r2) goto L92;
     */
    /* JADX WARN: Code restructure failed: missing block: B:297:0x0598, code lost:
    
        if (r5 < androidx.recyclerview.widget.RecyclerView.DECELERATION_RATE) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:298:0x059a, code lost:
    
        r5 = 1.0f - r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:300:0x05a8, code lost:
    
        if (r5 != androidx.recyclerview.widget.RecyclerView.DECELERATION_RATE) goto L270;
     */
    /* JADX WARN: Code restructure failed: missing block: B:302:0x05ad, code lost:
    
        if (r5 != 1.0f) goto L281;
     */
    /* JADX WARN: Code restructure failed: missing block: B:303:0x05df, code lost:
    
        r0 = r0.get(r10);
        r25.label = 2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:304:0x05e9, code lost:
    
        if (r13.seekTo(r5, r0, r25) != r3) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:307:0x05af, code lost:
    
        r19 = r0.get(r1.element);
        r20 = androidx.compose.animation.core.AnimatableKt.snap$default();
        r25.label = 1;
        r0 = r13.transition;
     */
    /* JADX WARN: Code restructure failed: missing block: B:308:0x05bd, code lost:
    
        if (r0 != null) goto L275;
     */
    /* JADX WARN: Code restructure failed: missing block: B:309:0x05bf, code lost:
    
        r0 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:310:0x05dc, code lost:
    
        if (r0 != r3) goto L284;
     */
    /* JADX WARN: Code restructure failed: missing block: B:311:0x05c2, code lost:
    
        r0 = androidx.compose.animation.core.MutatorMutex.mutate$default(r13.mutatorMutex, new androidx.datastore.core.DataStoreImpl$readDataOrHandleCorruption$3(r0, r13, r19, r20, null, 1), r25);
     */
    /* JADX WARN: Code restructure failed: missing block: B:312:0x05d7, code lost:
    
        if (r0 != r3) goto L278;
     */
    /* JADX WARN: Code restructure failed: missing block: B:313:0x05da, code lost:
    
        r0 = kotlin.Unit.INSTANCE;
     */
    /* JADX WARN: Code restructure failed: missing block: B:315:0x05a3, code lost:
    
        if (r5 > androidx.recyclerview.widget.RecyclerView.DECELERATION_RATE) goto L263;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x0229, code lost:
    
        if (r3 == r2) goto L102;
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0146, code lost:
    
        if (r0 != r2) goto L59;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:106:0x01b9  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x017c  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        VerifyCheckDepositPresenter verifyCheckDepositPresenter;
        Long l;
        Object trackBlockerSubmissionAnalytics$default;
        CurrencyCode currencyCode;
        Long l2;
        Object execute;
        Ref$FloatRef ref$FloatRef;
        Object performFling;
        float abs;
        Object obj2;
        Object search;
        MutableState mutableState;
        Money money;
        PaycheckDepositAllocation paycheckDepositAllocation;
        String valueOf;
        Object generateDirectDepositForm;
        Money money2;
        PaycheckDepositAllocation paycheckDepositAllocation2;
        String valueOf2;
        Object updateDirectDepositForm;
        Pair pair;
        String str;
        Object downloadPdf;
        int i = this.$r8$classId;
        int i2 = 13;
        int i3 = 11;
        int i4 = 4;
        int i5 = 5;
        int i6 = 14;
        int i7 = 3;
        final int i8 = 2;
        r10 = false;
        boolean z = false;
        Object obj3 = this.$backPictureData$delegate;
        Object obj4 = this.$frontPictureData$delegate;
        final int i9 = 1;
        Continuation continuation = null;
        switch (i) {
            case 0:
                MutableState mutableState2 = (MutableState) this.$isSubmitting$delegate;
                VerifyCheckDepositPresenter verifyCheckDepositPresenter2 = (VerifyCheckDepositPresenter) this.this$0;
                VerifyCheckDepositScreen verifyCheckDepositScreen = verifyCheckDepositPresenter2.args;
                Analytics analytics = verifyCheckDepositPresenter2.analytics;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                Continuation continuation2 = null;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    mutableState2.setValue(Boolean.TRUE);
                    analytics.track(new CheckDepositVerify(null, CheckDepositVerify.State.SUBMIT, 3), null);
                    BlockersData blockersData = verifyCheckDepositScreen.blockersData;
                    AndroidStringManager androidStringManager = verifyCheckDepositPresenter2.stringManager;
                    SessionWorker$doWork$2$2 sessionWorker$doWork$2$2 = new SessionWorker$doWork$2$2(verifyCheckDepositPresenter2, (MutableState) obj4, (MutableState) obj3, continuation2, 14);
                    verifyCheckDepositPresenter = verifyCheckDepositPresenter2;
                    l = null;
                    this.label = 1;
                    trackBlockerSubmissionAnalytics$default = PointerInputModifierNodeKt.trackBlockerSubmissionAnalytics$default(24, blockersData, analytics, androidStringManager, this, null, sessionWorker$doWork$2$2);
                    if (trackBlockerSubmissionAnalytics$default == coroutineSingletons) {
                        break;
                    }
                } else if (i10 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    verifyCheckDepositPresenter = verifyCheckDepositPresenter2;
                    l = null;
                    trackBlockerSubmissionAnalytics$default = obj;
                }
                ApiResult apiResult = (ApiResult) trackBlockerSubmissionAnalytics$default;
                if (apiResult instanceof ApiResult.Success) {
                    Money money3 = verifyCheckDepositScreen.blockersData.amount;
                    Integer num = (money3 == null || (l2 = money3.amount) == null) ? l : new Integer((int) l2.longValue());
                    Money money4 = verifyCheckDepositScreen.blockersData.amount;
                    analytics.track(new CheckDepositComplete(num, (money4 == null || (currencyCode = money4.currency_code) == null) ? l : UtilsKt.getAsCdfCurrencyCode(currencyCode)), l);
                    BetterNavigator.ScreenNavigator screenNavigator = verifyCheckDepositPresenter.navigator;
                    BlockersDataNavigator blockersDataNavigator = verifyCheckDepositPresenter.blockersNavigator;
                    BlockersData blockersData2 = verifyCheckDepositScreen.blockersData;
                    ResponseContext responseContext = ((CheckDepositResponse) ((ApiResult.Success) apiResult).response).response_context;
                    responseContext.getClass();
                    screenNavigator.goTo(blockersDataNavigator.getNext(verifyCheckDepositScreen, blockersData2.updateFromResponseContext(responseContext, false)));
                } else if (!(apiResult instanceof ApiResult.Failure)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    ApiResult.Failure failure = (ApiResult.Failure) apiResult;
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    linkedHashMap.put("networkError", Boolean.valueOf(failure instanceof ApiResult.Failure.NetworkFailure));
                    if (failure instanceof ApiResult.Failure.HttpFailure) {
                        linkedHashMap.put("responseCode", Integer.valueOf(((ApiResult.Failure.HttpFailure) failure).code));
                    }
                    analytics.track(new CheckDepositReceiveError(null, (Integer) linkedHashMap.get("responseCode"), Boolean.valueOf(Intrinsics.areEqual(linkedHashMap.get("networkError"), Boolean.TRUE)), null, 9), l);
                    mutableState2.setValue(Boolean.FALSE);
                }
                break;
            case 1:
                MutableSharedFlow mutableSharedFlow = (MutableSharedFlow) this.this$0;
                MutableState mutableState3 = (MutableState) this.$isSubmitting$delegate;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    DrawerViewKt$$ExternalSyntheticLambda2 drawerViewKt$$ExternalSyntheticLambda2 = new DrawerViewKt$$ExternalSyntheticLambda2(i4, mutableState3);
                    float[] fArr = CardSceneEffectKt.X_AXIS;
                    ChannelFlowTransformLatest mapLatest = FlowKt.mapLatest(new Hero3DCardViewKt$rotateDragFlow$2(drawerViewKt$$ExternalSyntheticLambda2, continuation, i7), new CardModelView$iconTexture$$inlined$map$1(mutableSharedFlow, 23));
                    Ref$LongRef ref$LongRef = new Ref$LongRef();
                    ref$LongRef.element = 0L;
                    ChannelFlowBuilder merge = FlowKt.merge(mapLatest, FlowKt.transformLatest(new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new PageFetcher$flow$1.AnonymousClass1(i8, continuation, 17), mutableSharedFlow), new CardSceneEffectKt$cardSettleFlow$$inlined$flatMapLatest$1(null, ref$LongRef, new DrawerViewKt$$ExternalSyntheticLambda2(i5, mutableState3), new CardScene$$ExternalSyntheticLambda1(i2), new CardScene$$ExternalSyntheticLambda1(i6), (State) obj4, (State) obj3)));
                    TabContentPresenter$models$4$1$1$1 tabContentPresenter$models$4$1$1$1 = new TabContentPresenter$models$4$1$1$1(mutableState3, continuation, 10);
                    this.label = 1;
                    if (FlowKt.collectLatest(merge, tabContentPresenter$models$4$1$1$1, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i11 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 2:
                CardDesignLibraryScene cardDesignLibraryScene = (CardDesignLibraryScene) this.$isSubmitting$delegate;
                String str2 = (String) this.this$0;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (str2 == null) {
                        JWECryptoParts jWECryptoParts = cardDesignLibraryScene.backgroundPlane;
                        Job job = (Job) jWECryptoParts.authenticationTag;
                        if (job != null) {
                            job.cancel(null);
                        }
                        jWECryptoParts.authenticationTag = ((GLLauncher) jWECryptoParts.header).launch(new BackgroundPlane$setBitmap$1(jWECryptoParts, null, null));
                        break;
                    } else {
                        ImageRequest.Builder builder = new ImageRequest.Builder((Context) obj3);
                        builder.data = str2;
                        ImageRequests_androidKt.allowHardware(builder, false);
                        ImageRequest build = builder.build();
                        this.label = 1;
                        execute = ((RealImageLoader) obj4).execute(build, this);
                        if (execute == coroutineSingletons3) {
                            break;
                        }
                    }
                } else if (i12 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    execute = obj;
                }
                Image image = ((ImageResult) execute).getImage();
                Bitmap bitmap = image != null ? Image_androidKt.toBitmap(image, image.getWidth(), image.getHeight()) : null;
                JWECryptoParts jWECryptoParts2 = cardDesignLibraryScene.backgroundPlane;
                Job job2 = (Job) jWECryptoParts2.authenticationTag;
                if (job2 != null) {
                    job2.cancel(null);
                }
                jWECryptoParts2.authenticationTag = ((GLLauncher) jWECryptoParts2.header).launch(new BackgroundPlane$setBitmap$1(jWECryptoParts2, bitmap, null));
                break;
            case 3:
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i13 = this.label;
                if (i13 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ((MutableState) this.$isSubmitting$delegate).setValue(Boolean.FALSE);
                    CardGridNuxScene cardGridNuxScene = (CardGridNuxScene) this.this$0;
                    cardGridNuxScene.glLauncher.launch(new CardGridNuxScene$resetHeroWobble$1(cardGridNuxScene, continuation, r10));
                    if (((Number) ((Animatable) obj4).getValue()).floatValue() > RecyclerView.DECELERATION_RATE) {
                        this.label = 1;
                        if (Animatable.animateTo$default((Animatable) obj4, new Float(RecyclerView.DECELERATION_RATE), (SpringSpec) obj3, null, null, this, 12) == coroutineSingletons4) {
                            break;
                        }
                    }
                } else if (i13 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 4:
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i14 = this.label;
                if (i14 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    final MutableState mutableState4 = (MutableState) this.$isSubmitting$delegate;
                    final MutableState mutableState5 = (MutableState) obj4;
                    final MutableState mutableState6 = (MutableState) obj3;
                    SafeFlow snapshotFlow = Updater.snapshotFlow(new Function0() { // from class: com.squareup.cash.card.onboarding.graphics.WandEffectKt$WandEffect$9$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i15 = i9;
                            MutableState mutableState7 = mutableState6;
                            MutableState mutableState8 = mutableState5;
                            MutableState mutableState9 = mutableState4;
                            switch (i15) {
                            }
                            return new Triple(mutableState9.getValue(), mutableState8.getValue(), mutableState7.getValue());
                        }
                    });
                    HeartEffectKt$HeartEffect$6$1$2 heartEffectKt$HeartEffect$6$1$2 = new HeartEffectKt$HeartEffect$6$1$2((HeartScene) this.this$0, i9);
                    this.label = 1;
                    if (snapshotFlow.collect(heartEffectKt$HeartEffect$6$1$2, this) == coroutineSingletons5) {
                        break;
                    }
                } else if (i14 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 5:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    final MutableState mutableState7 = (MutableState) this.$isSubmitting$delegate;
                    final MutableState mutableState8 = (MutableState) obj4;
                    final MutableState mutableState9 = (MutableState) obj3;
                    SafeFlow snapshotFlow2 = Updater.snapshotFlow(new Function0() { // from class: com.squareup.cash.card.onboarding.graphics.WandEffectKt$WandEffect$9$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i152 = i8;
                            MutableState mutableState72 = mutableState9;
                            MutableState mutableState82 = mutableState8;
                            MutableState mutableState92 = mutableState7;
                            switch (i152) {
                            }
                            return new Triple(mutableState92.getValue(), mutableState82.getValue(), mutableState72.getValue());
                        }
                    });
                    MiniCardEffectKt$MiniCardEffect$6$1$2 miniCardEffectKt$MiniCardEffect$6$1$2 = new MiniCardEffectKt$MiniCardEffect$6$1$2((MiniCardScene) this.this$0, i9);
                    this.label = 1;
                    if (snapshotFlow2.collect(miniCardEffectKt$MiniCardEffect$6$1$2, this) == coroutineSingletons6) {
                        break;
                    }
                } else if (i15 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 6:
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    final MutableState mutableState10 = (MutableState) this.$isSubmitting$delegate;
                    final MutableState mutableState11 = (MutableState) obj4;
                    final MutableState mutableState12 = (MutableState) obj3;
                    SafeFlow snapshotFlow3 = Updater.snapshotFlow(new Function0() { // from class: com.squareup.cash.card.onboarding.graphics.WandEffectKt$WandEffect$9$1$$ExternalSyntheticLambda0
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            int i152 = r4;
                            MutableState mutableState72 = mutableState12;
                            MutableState mutableState82 = mutableState11;
                            MutableState mutableState92 = mutableState10;
                            switch (i152) {
                            }
                            return new Triple(mutableState92.getValue(), mutableState82.getValue(), mutableState72.getValue());
                        }
                    });
                    WandEffectKt$WandEffect$6$1$2 wandEffectKt$WandEffect$6$1$2 = new WandEffectKt$WandEffect$6$1$2((WandScene) this.this$0, i9);
                    this.label = 1;
                    if (snapshotFlow3.collect(wandEffectKt$WandEffect$6$1$2, this) == coroutineSingletons7) {
                        break;
                    }
                } else if (i16 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 7:
                CoroutineScope coroutineScope = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealBlockersHelper$collectBlockersActions$2 realBlockersHelper$collectBlockersActions$2 = new RealBlockersHelper$collectBlockersActions$2(7, coroutineScope, (GrantPresenter) obj3, (MutableState) this.$isSubmitting$delegate);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj4).collect(realBlockersHelper$collectBlockersActions$2, this) == coroutineSingletons8) {
                        break;
                    }
                } else if (i17 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 8:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    GrantPresenter grantPresenter = (GrantPresenter) obj4;
                    BlockersScreens.CashAppPayGrant cashAppPayGrant = grantPresenter.args;
                    GrantPresenter$models$handleAction$1$1 grantPresenter$models$handleAction$1$1 = new GrantPresenter$models$handleAction$1$1(coroutineScope2, (MutableState) this.$isSubmitting$delegate, grantPresenter, null);
                    this.this$0 = null;
                    this.label = 1;
                    if (BlockersHelper.handleBlockerAction$default(grantPresenter.blockersHelper, (BlockerAction) obj3, cashAppPayGrant, null, null, false, null, grantPresenter$models$handleAction$1$1, this, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE) == coroutineSingletons9) {
                        break;
                    }
                } else if (i18 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 9:
                CoroutineScope coroutineScope3 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.label;
                if (i19 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CaptureCheckFacePresenter$models$2$1$1.AnonymousClass1 anonymousClass1 = new CaptureCheckFacePresenter$models$2$1$1.AnonymousClass1(coroutineScope3, (MusicPresenter) obj3, (MutableState) this.$isSubmitting$delegate, i3);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj4).collect(anonymousClass1, this) == coroutineSingletons10) {
                        break;
                    }
                } else if (i19 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 10:
                CoroutineScope coroutineScope4 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.label;
                if (i20 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CaptureCheckFacePresenter$models$2$1$1.AnonymousClass1 anonymousClass12 = new CaptureCheckFacePresenter$models$2$1$1.AnonymousClass1(coroutineScope4, (CheckDepositAmountPresenter) obj3, (MutableState) this.$isSubmitting$delegate, 12);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj4).collect(anonymousClass12, this) == coroutineSingletons11) {
                        break;
                    }
                } else if (i20 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 11:
                CoroutineScope coroutineScope5 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.label;
                if (i21 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CaptureCheckFacePresenter$models$2$1$1.AnonymousClass1 anonymousClass13 = new CaptureCheckFacePresenter$models$2$1$1.AnonymousClass1(coroutineScope5, (ConfirmBackOfCheckPresenter) obj3, (MutableState) this.$isSubmitting$delegate, i2);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj4).collect(anonymousClass13, this) == coroutineSingletons12) {
                        break;
                    }
                } else if (i21 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 12:
                CoroutineScope coroutineScope6 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.label;
                if (i22 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CaptureCheckFacePresenter$models$2$1$1.AnonymousClass1 anonymousClass14 = new CaptureCheckFacePresenter$models$2$1$1.AnonymousClass1(coroutineScope6, (ConfirmFrontOfCheckPresenter) obj3, (MutableState) this.$isSubmitting$delegate, i6);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj4).collect(anonymousClass14, this) == coroutineSingletons13) {
                        break;
                    }
                } else if (i22 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 13:
                ScrollScope scrollScope = (ScrollScope) this.$isSubmitting$delegate;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = this.label;
                if (i23 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    ref$FloatRef = (Ref$FloatRef) obj3;
                    float f = ref$FloatRef.element;
                    this.$isSubmitting$delegate = null;
                    this.this$0 = ref$FloatRef;
                    this.label = 1;
                    performFling = ((FlingBehavior) obj4).performFling(scrollScope, f, this);
                    if (performFling == coroutineSingletons14) {
                        break;
                    }
                } else if (i23 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    Ref$FloatRef ref$FloatRef2 = (Ref$FloatRef) this.this$0;
                    SafeTrace.throwOnFailure(obj);
                    ref$FloatRef = ref$FloatRef2;
                    performFling = obj;
                }
                ref$FloatRef.element = ((Number) performFling).floatValue();
                break;
            case 14:
                List list = ((NavigationModel.Ready.Swipe) obj3).pages;
                SeekableTransitionState seekableTransitionState = (SeekableTransitionState) obj4;
                Ref$IntRef ref$IntRef = (Ref$IntRef) this.this$0;
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i24 = this.label;
                if (i24 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    r10 = ref$IntRef.element == 0 ? 1 : 0;
                    float offsetDistanceInPages = ((PagerState) this.$isSubmitting$delegate).getOffsetDistanceInPages(r10);
                    if (r10 == 0) {
                        abs = Math.abs(offsetDistanceInPages);
                        break;
                    } else {
                        abs = Math.abs(offsetDistanceInPages);
                        break;
                    }
                } else if (i24 != 1 && i24 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 15:
                CoroutineScope coroutineScope7 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i25 = this.label;
                if (i25 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealBlockersHelper$collectBlockersActions$2 realBlockersHelper$collectBlockersActions$22 = new RealBlockersHelper$collectBlockersActions$2(i3, coroutineScope7, (LocalPosCheckInPresenter) obj3, (MutableState) this.$isSubmitting$delegate);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj4).collect(realBlockersHelper$collectBlockersActions$22, this) == coroutineSingletons16) {
                        break;
                    }
                } else if (i25 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 16:
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i26 = this.label;
                if (i26 != 0) {
                    if (i26 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        break;
                    } else {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    }
                } else {
                    SafeTrace.throwOnFailure(obj);
                    ContactsSyncRoutine contactsSyncRoutine = ((ContactSyncEvent.SyncRoutines) this.$isSubmitting$delegate).detailedContactsUpload;
                    List list2 = (List) obj4;
                    ContactSync$SyncReason contactSync$SyncReason = (ContactSync$SyncReason) obj3;
                    this.label = 1;
                    int i27 = RealContactSync.$r8$clinit;
                    if (contactsSyncRoutine != null) {
                        obj2 = contactsSyncRoutine.contactsSync(list2, contactSync$SyncReason, this);
                        if (obj2 != coroutineSingletons17) {
                            obj2 = (ContactsSyncResponse) obj2;
                        }
                    } else {
                        obj2 = null;
                    }
                    if (obj2 == coroutineSingletons17) {
                        break;
                    } else {
                        break;
                    }
                }
            case 17:
                RealProfileNotificationsRepository realProfileNotificationsRepository = (RealProfileNotificationsRepository) this.$isSubmitting$delegate;
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i28 = this.label;
                if (i28 != 0) {
                    if (i28 == 1) {
                        SafeTrace.throwOnFailure(obj);
                        break;
                    } else {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    }
                } else {
                    SafeTrace.throwOnFailure(obj);
                    LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.this$0;
                    ArrayList arrayList = new ArrayList(linkedHashMap2.size());
                    for (Map.Entry entry : linkedHashMap2.entrySet()) {
                        arrayList.add(new NotificationCategoryExtraConfig.FamiliesConfiguration.SponseeNotificationStatus((String) entry.getKey(), (NotificationCategoryExtraConfig.FamiliesConfiguration.NotificationStatus) entry.getValue(), ByteString.EMPTY));
                    }
                    NotificationCategoryExtraConfig notificationCategoryExtraConfig = new NotificationCategoryExtraConfig(new NotificationCategoryExtraConfig$Configuration$Families(new NotificationCategoryExtraConfig.FamiliesConfiguration(arrayList, ByteString.EMPTY)));
                    NotificationSettingsService notificationSettingsService = realProfileNotificationsRepository.service;
                    NotificationCategory notificationCategory = NotificationCategory.NOTIFICATION_CATEGORY_FAMILY;
                    if (((String) obj4) != null && ((FeatureFlag$ControlTreatmentAmplitudeExperiment$Options) ((RealFeatureFlagManager) realProfileNotificationsRepository.featureFlagManager).peekCurrentValue(AmplitudeExperiments$MobileMessagingNotificationSettingsSam.INSTANCE)).disabled()) {
                        z = true;
                    }
                    UpdateCategoryNotificationSettingsRequest updateCategoryNotificationSettingsRequest = new UpdateCategoryNotificationSettingsRequest(CollectionsKt__CollectionsJVMKt.listOf(new CategoryPreferenceUpdate((String) obj4, notificationCategory, (ClientChannelState) null, (ClientChannelState) null, (ClientChannelState) null, (Long) obj3, notificationCategoryExtraConfig, Boolean.valueOf(z), EnumC0170g.SDK_ASSET_ILLUSTRATION_CARD_DARK_APPEARANCE_VALUE)));
                    this.label = 1;
                    Object updateCategoryNotificationSettings = notificationSettingsService.updateCategoryNotificationSettings(updateCategoryNotificationSettingsRequest, this);
                    if (updateCategoryNotificationSettings == coroutineSingletons18) {
                        break;
                    } else {
                        break;
                    }
                }
                break;
            case 18:
                MutableState mutableState13 = (MutableState) obj4;
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i29 = this.label;
                if (i29 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    MutableState mutableState14 = (MutableState) obj3;
                    if (((String) mutableState13.getValue()).length() == 0) {
                        mutableState14.setValue(null);
                        break;
                    } else {
                        PoolsListPresenter poolsListPresenter = (PoolsListPresenter) this.this$0;
                        RealLocationSearchClient realLocationSearchClient = (RealLocationSearchClient) poolsListPresenter.dateFormatManager;
                        LocationSearchClient$SessionId$GoogleSessionId locationSearchClient$SessionId$GoogleSessionId = (LocationSearchClient$SessionId$GoogleSessionId) poolsListPresenter.localeAssetProvider;
                        String str3 = (String) mutableState13.getValue();
                        AddressComponents$Country addressComponents$Country = AddressComponents$Country.US;
                        this.$isSubmitting$delegate = mutableState14;
                        this.label = 1;
                        search = realLocationSearchClient.search(locationSearchClient$SessionId$GoogleSessionId, str3, addressComponents$Country, this);
                        if (search == coroutineSingletons19) {
                            break;
                        } else {
                            mutableState = mutableState14;
                        }
                    }
                } else if (i29 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    mutableState = (MutableState) this.$isSubmitting$delegate;
                    SafeTrace.throwOnFailure(obj);
                    search = obj;
                }
                mutableState.setValue((LocationSearchClient$LocationSearchResult) search);
            case 19:
                CoroutineScope coroutineScope8 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i30 = this.label;
                if (i30 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealBlockersHelper$collectBlockersActions$2 realBlockersHelper$collectBlockersActions$23 = new RealBlockersHelper$collectBlockersActions$2(i6, coroutineScope8, (PaperMoneyDepositBarcodeExpiredPresenter) obj3, (MutableState) this.$isSubmitting$delegate);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj4).collect(realBlockersHelper$collectBlockersActions$23, this) == coroutineSingletons20) {
                        break;
                    }
                } else if (i30 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 20:
                CoroutineScope coroutineScope9 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i31 = this.label;
                if (i31 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealBlockersHelper$collectBlockersActions$2 realBlockersHelper$collectBlockersActions$24 = new RealBlockersHelper$collectBlockersActions$2(15, coroutineScope9, (SelectCustomerPresenter) obj3, (MutableState) this.$isSubmitting$delegate);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj4).collect(realBlockersHelper$collectBlockersActions$24, this) == coroutineSingletons21) {
                        break;
                    }
                } else if (i31 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 21:
                CoroutineScope coroutineScope10 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i32 = this.label;
                if (i32 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CaptureCheckFacePresenter$models$2$1$1.AnonymousClass1 anonymousClass15 = new CaptureCheckFacePresenter$models$2$1$1.AnonymousClass1(coroutineScope10, (PaperMoneyDepositMerchantDetailsPresenter) obj3, (MutableState) this.$isSubmitting$delegate, 28);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj4).collect(anonymousClass15, this) == coroutineSingletons22) {
                        break;
                    }
                } else if (i32 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 22:
                CoroutineScope coroutineScope11 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i33 = this.label;
                if (i33 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    CaptureCheckFacePresenter$models$2$1$1.AnonymousClass1 anonymousClass16 = new CaptureCheckFacePresenter$models$2$1$1.AnonymousClass1(coroutineScope11, (PaperMoneyDepositOnboardingPresenter) obj3, (MutableState) this.$isSubmitting$delegate, 29);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj4).collect(anonymousClass16, this) == coroutineSingletons23) {
                        break;
                    }
                } else if (i33 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 23:
                CoroutineScope coroutineScope12 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i34 = this.label;
                if (i34 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    AnimationsKt$takeUntil$1$1.AnonymousClass1.C00601 c00601 = new AnimationsKt$takeUntil$1$1.AnonymousClass1.C00601(coroutineScope12, (CardStudioPresenter) obj3, (MutableState) this.$isSubmitting$delegate, i9);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj4).collect(c00601, this) == coroutineSingletons24) {
                        break;
                    }
                } else if (i34 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 24:
                CoroutineScope coroutineScope13 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i35 = this.label;
                if (i35 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    AnimationsKt$takeUntil$1$1.AnonymousClass1.C00601 c006012 = new AnimationsKt$takeUntil$1$1.AnonymousClass1.C00601(coroutineScope13, (LocalPosCheckInPresenter) obj3, (MutableState) this.$isSubmitting$delegate, i8);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj4).collect(c006012, this) == coroutineSingletons25) {
                        break;
                    }
                } else if (i35 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 25:
                CoroutineScope coroutineScope14 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i36 = this.label;
                if (i36 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    AnimationsKt$takeUntil$1$1.AnonymousClass1.C00601 c006013 = new AnimationsKt$takeUntil$1$1.AnonymousClass1.C00601(coroutineScope14, (VerifyCheckDialogPresenter) obj3, (MutableState) this.$isSubmitting$delegate, i7);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj4).collect(c006013, this) == coroutineSingletons26) {
                        break;
                    }
                } else if (i36 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 26:
                CoroutineScope coroutineScope15 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i37 = this.label;
                if (i37 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    AnimationsKt$takeUntil$1$1.AnonymousClass1.C00601 c006014 = new AnimationsKt$takeUntil$1$1.AnonymousClass1.C00601(coroutineScope15, (LocalPosCheckInPresenter) obj3, (MutableState) this.$isSubmitting$delegate, i4);
                    this.this$0 = null;
                    this.label = 1;
                    if (((Flow) obj4).collect(c006014, this) == coroutineSingletons27) {
                        break;
                    }
                } else if (i37 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            case 27:
                LocalHomePresenter localHomePresenter = (LocalHomePresenter) obj3;
                DirectDepositManualFormSubmissionScreen directDepositManualFormSubmissionScreen = (DirectDepositManualFormSubmissionScreen) localHomePresenter.embeddedMapEnabled$delegate;
                MutableState mutableState15 = (MutableState) this.$isSubmitting$delegate;
                MutableState mutableState16 = (MutableState) obj4;
                CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i38 = this.label;
                DirectDepositManualFormCompletionViewModel.Error error = DirectDepositManualFormCompletionViewModel.Error.INSTANCE;
                if (i38 != 0) {
                    if (i38 != 1) {
                        if (i38 != 2) {
                            if (i38 == 3) {
                                str = (String) this.this$0;
                                SafeTrace.throwOnFailure(obj);
                                downloadPdf = obj;
                                mutableState15.setValue(new DirectDepositForm((Uri) downloadPdf, str));
                                mutableState16.setValue(DirectDepositManualFormCompletionViewModel.Success.INSTANCE);
                                break;
                            } else {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                break;
                            }
                        } else {
                            SafeTrace.throwOnFailure(obj);
                            generateDirectDepositForm = obj;
                            ApiResult apiResult2 = (ApiResult) generateDirectDepositForm;
                            if ((apiResult2 instanceof ApiResult.Failure.HttpFailure) || (apiResult2 instanceof ApiResult.Failure.NetworkFailure)) {
                                mutableState16.setValue(error);
                                break;
                            } else if (!(apiResult2 instanceof ApiResult.Success)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                break;
                            } else {
                                GenerateDirectDepositFormResponse generateDirectDepositFormResponse = (GenerateDirectDepositFormResponse) ((ApiResult.Success) apiResult2).response;
                                String str4 = generateDirectDepositFormResponse.document_token;
                                str4.getClass();
                                String str5 = generateDirectDepositFormResponse.file_url;
                                str5.getClass();
                                pair = new Pair(str4, str5);
                            }
                        }
                    } else {
                        SafeTrace.throwOnFailure(obj);
                        updateDirectDepositForm = obj;
                        ApiResult apiResult3 = (ApiResult) updateDirectDepositForm;
                        if ((apiResult3 instanceof ApiResult.Failure.HttpFailure) || (apiResult3 instanceof ApiResult.Failure.NetworkFailure)) {
                            mutableState16.setValue(error);
                            break;
                        } else if (!(apiResult3 instanceof ApiResult.Success)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        } else {
                            UpdateDirectDepositFormResponse updateDirectDepositFormResponse = (UpdateDirectDepositFormResponse) ((ApiResult.Success) apiResult3).response;
                            String str6 = updateDirectDepositFormResponse.document_token;
                            str6.getClass();
                            String str7 = updateDirectDepositFormResponse.file_url;
                            str7.getClass();
                            pair = new Pair(str6, str7);
                        }
                    }
                } else {
                    SafeTrace.throwOnFailure(obj);
                    if (((DirectDepositForm) mutableState15.getValue()) != null) {
                        break;
                    } else {
                        mutableState16.setValue(DirectDepositManualFormCompletionViewModel.Loading.INSTANCE);
                        boolean z2 = directDepositManualFormSubmissionScreen instanceof DirectDepositUpdateManualFormCompletionScreen;
                        PostbankAppService postbankAppService = (PostbankAppService) localHomePresenter.localHomeGeoPresenterFactory;
                        PaycheckDepositAllocation.All all = PaycheckDepositAllocation.All.INSTANCE;
                        if (z2) {
                            DirectDepositManualFormSubmissionScreen.FormDetails formDetails = ((DirectDepositUpdateManualFormCompletionScreen) directDepositManualFormSubmissionScreen).formDetails;
                            PaycheckDepositAllocation paycheckDepositAllocation3 = formDetails.paycheckDepositAllocation;
                            if (!Intrinsics.areEqual(paycheckDepositAllocation3, all)) {
                                if (paycheckDepositAllocation3 instanceof PaycheckDepositAllocation.CurrencyAmount) {
                                    money2 = ((PaycheckDepositAllocation.CurrencyAmount) paycheckDepositAllocation3).amount;
                                    paycheckDepositAllocation2 = formDetails.paycheckDepositAllocation;
                                    if (Intrinsics.areEqual(paycheckDepositAllocation2, all) || (paycheckDepositAllocation2 instanceof PaycheckDepositAllocation.CurrencyAmount)) {
                                        valueOf2 = null;
                                    } else if (paycheckDepositAllocation2 instanceof PaycheckDepositAllocation.Percentage) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        break;
                                    } else {
                                        valueOf2 = String.valueOf(((PaycheckDepositAllocation.Percentage) paycheckDepositAllocation2).percentage);
                                    }
                                    UpdateDirectDepositFormRequest updateDirectDepositFormRequest = new UpdateDirectDepositFormRequest(money2, Boolean.valueOf(formDetails.addSignature), directDepositManualFormSubmissionScreen.getToken(), (String) formDetails.fullName.getValue(), (String) formDetails.companyName.getValue(), null, valueOf2, ByteString.EMPTY);
                                    this.label = 1;
                                    updateDirectDepositForm = postbankAppService.updateDirectDepositForm(updateDirectDepositFormRequest, this);
                                    break;
                                } else if (!(paycheckDepositAllocation3 instanceof PaycheckDepositAllocation.Percentage)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    break;
                                }
                            }
                            money2 = null;
                            paycheckDepositAllocation2 = formDetails.paycheckDepositAllocation;
                            if (Intrinsics.areEqual(paycheckDepositAllocation2, all)) {
                                if (paycheckDepositAllocation2 instanceof PaycheckDepositAllocation.Percentage) {
                                }
                            }
                            valueOf2 = null;
                            UpdateDirectDepositFormRequest updateDirectDepositFormRequest2 = new UpdateDirectDepositFormRequest(money2, Boolean.valueOf(formDetails.addSignature), directDepositManualFormSubmissionScreen.getToken(), (String) formDetails.fullName.getValue(), (String) formDetails.companyName.getValue(), null, valueOf2, ByteString.EMPTY);
                            this.label = 1;
                            updateDirectDepositForm = postbankAppService.updateDirectDepositForm(updateDirectDepositFormRequest2, this);
                        } else {
                            DirectDepositManualFormSubmissionScreen.FormDetails formDetails2 = directDepositManualFormSubmissionScreen.getFormDetails();
                            PaycheckDepositAllocation paycheckDepositAllocation4 = formDetails2.paycheckDepositAllocation;
                            if (!Intrinsics.areEqual(paycheckDepositAllocation4, all)) {
                                if (paycheckDepositAllocation4 instanceof PaycheckDepositAllocation.CurrencyAmount) {
                                    money = ((PaycheckDepositAllocation.CurrencyAmount) paycheckDepositAllocation4).amount;
                                    paycheckDepositAllocation = formDetails2.paycheckDepositAllocation;
                                    if (Intrinsics.areEqual(paycheckDepositAllocation, all) || (paycheckDepositAllocation instanceof PaycheckDepositAllocation.CurrencyAmount)) {
                                        valueOf = null;
                                    } else if (paycheckDepositAllocation instanceof PaycheckDepositAllocation.Percentage) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        break;
                                    } else {
                                        valueOf = String.valueOf(((PaycheckDepositAllocation.Percentage) paycheckDepositAllocation).percentage);
                                    }
                                    GenerateDirectDepositFormRequest generateDirectDepositFormRequest = new GenerateDirectDepositFormRequest(money, Boolean.valueOf(formDetails2.addSignature), (String) formDetails2.fullName.getValue(), (String) formDetails2.companyName.getValue(), null, valueOf, ByteString.EMPTY);
                                    this.label = 2;
                                    generateDirectDepositForm = postbankAppService.generateDirectDepositForm(generateDirectDepositFormRequest, this);
                                    break;
                                } else if (!(paycheckDepositAllocation4 instanceof PaycheckDepositAllocation.Percentage)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    break;
                                }
                            }
                            money = null;
                            paycheckDepositAllocation = formDetails2.paycheckDepositAllocation;
                            if (Intrinsics.areEqual(paycheckDepositAllocation, all)) {
                                if (paycheckDepositAllocation instanceof PaycheckDepositAllocation.Percentage) {
                                }
                            }
                            valueOf = null;
                            GenerateDirectDepositFormRequest generateDirectDepositFormRequest2 = new GenerateDirectDepositFormRequest(money, Boolean.valueOf(formDetails2.addSignature), (String) formDetails2.fullName.getValue(), (String) formDetails2.companyName.getValue(), null, valueOf, ByteString.EMPTY);
                            this.label = 2;
                            generateDirectDepositForm = postbankAppService.generateDirectDepositForm(generateDirectDepositFormRequest2, this);
                        }
                        break;
                    }
                }
                str = (String) pair.first;
                String str8 = (String) pair.second;
                RealFormPdfProvider realFormPdfProvider = (RealFormPdfProvider) localHomePresenter.clearMarketingBadgesIfNeeded;
                this.this$0 = str;
                this.label = 3;
                downloadPdf = realFormPdfProvider.downloadPdf(str, str8, this);
                break;
            case 28:
                CoroutineScope coroutineScope16 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i39 = this.label;
                if (i39 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow = (Flow) this.$isSubmitting$delegate;
                    RealBlockersHelper$collectBlockersActions$2 realBlockersHelper$collectBlockersActions$25 = new RealBlockersHelper$collectBlockersActions$2(18, coroutineScope16, (DirectDepositSetupPresenter) obj4, (State) obj3);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow.collect(realBlockersHelper$collectBlockersActions$25, this) == coroutineSingletons29) {
                        break;
                    }
                } else if (i39 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                CoroutineScope coroutineScope17 = (CoroutineScope) this.this$0;
                CoroutineSingletons coroutineSingletons30 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i40 = this.label;
                if (i40 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow2 = (Flow) this.$isSubmitting$delegate;
                    AnimationsKt$takeUntil$1$1.AnonymousClass1.C00601 c006015 = new AnimationsKt$takeUntil$1$1.AnonymousClass1.C00601(coroutineScope17, (DisclosurePresenter) obj4, (State) obj3, i5);
                    this.this$0 = null;
                    this.label = 1;
                    if (flow2.collect(c006015, this) == coroutineSingletons30) {
                        break;
                    }
                } else if (i40 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyCheckDepositPresenter$models$3$1(FlingBehavior flingBehavior, Ref$FloatRef ref$FloatRef, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 13;
        this.$frontPictureData$delegate = flingBehavior;
        this.$backPictureData$delegate = ref$FloatRef;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyCheckDepositPresenter$models$3$1(LocalHomePresenter localHomePresenter, MutableState mutableState, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 27;
        this.$backPictureData$delegate = localHomePresenter;
        this.$isSubmitting$delegate = mutableState;
        this.$frontPictureData$delegate = mutableState2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyCheckDepositPresenter$models$3$1(GrantPresenter grantPresenter, BlockerAction blockerAction, MutableState mutableState, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 8;
        this.$frontPictureData$delegate = grantPresenter;
        this.$backPictureData$delegate = blockerAction;
        this.$isSubmitting$delegate = mutableState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerifyCheckDepositPresenter$models$3$1(PoolsListPresenter poolsListPresenter, MutableState mutableState, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 18;
        this.this$0 = poolsListPresenter;
        this.$frontPictureData$delegate = mutableState;
        this.$backPictureData$delegate = mutableState2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VerifyCheckDepositPresenter$models$3$1(Object obj, Object obj2, Object obj3, MutableState mutableState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$frontPictureData$delegate = obj2;
        this.$backPictureData$delegate = obj3;
        this.$isSubmitting$delegate = mutableState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VerifyCheckDepositPresenter$models$3$1(Object obj, Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$isSubmitting$delegate = obj2;
        this.$frontPictureData$delegate = obj3;
        this.$backPictureData$delegate = obj4;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VerifyCheckDepositPresenter$models$3$1(Flow flow, Continuation continuation, MoleculePresenter moleculePresenter, MutableState mutableState, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$frontPictureData$delegate = flow;
        this.$backPictureData$delegate = moleculePresenter;
        this.$isSubmitting$delegate = mutableState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ VerifyCheckDepositPresenter$models$3$1(Flow flow, Continuation continuation, MoleculePresenter moleculePresenter, State state, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$isSubmitting$delegate = flow;
        this.$frontPictureData$delegate = moleculePresenter;
        this.$backPictureData$delegate = state;
    }
}
