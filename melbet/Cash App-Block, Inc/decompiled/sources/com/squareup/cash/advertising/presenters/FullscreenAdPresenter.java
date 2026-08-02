package com.squareup.cash.advertising.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.paging.PageFetcher$flow$1;
import androidx.room.util.DBUtil;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.local.db.LocalTabContentQueries;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.network.NetworkFetcher$doFetch$2;
import com.squareup.cash.account.presenters.EditProfilePresenter$models$2$1;
import com.squareup.cash.advertising.backend.real.RealFullscreenAdStore;
import com.squareup.cash.advertising.screens.FullscreenAdScreen;
import com.squareup.cash.advertising.viewmodels.FullscreenAdViewModel;
import com.squareup.cash.aiedge.MLKitTitleGenerator$1;
import com.squareup.cash.appmessages.AppMessageViewEvent;
import com.squareup.cash.appmessages.db.FullScreenMessageQueries$$ExternalSyntheticLambda5;
import com.squareup.cash.appmessages.db.FullScreenMessageQueries$get$2;
import com.squareup.cash.appmessages.presenters.RealAppMessageActionPerformer$Factory$Impl;
import com.squareup.cash.boost.db.RewardQueries;
import com.squareup.cash.cdf.AppMessageFormat;
import com.squareup.cash.cdf.appmessage.AppMessageInteractBuffer;
import com.squareup.cash.cdf.appmessage.AppMessageInteractClick;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.recipients.data.RealCustomerStore$getCustomerForId$$inlined$map$1;
import com.squareup.cash.screens.Back;
import com.squareup.protos.cash.messagingplatformcommon.app.AppMessageClientService;
import com.squareup.util.android.AndroidAudioManager;
import com.squareup.wire.GrpcMethod;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.FlowKt__ZipKt$combine$$inlined$unsafeFlow$1;
import kotlinx.coroutines.flow.ReadonlySharedFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import kotlinx.coroutines.flow.StartedWhileSubscribed;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import papa.SafeTrace;

/* loaded from: classes5.dex */
public final class FullscreenAdPresenter implements MoleculePresenter {
    public final GrpcMethod actionPerformer;
    public final Analytics analytics;
    public final FullscreenAdScreen args;
    public final AndroidAudioManager audioManager;
    public long bufferMillis;
    public final ReadonlySharedFlow fullscreenAd;
    public final RealFullscreenAdStore fullscreenAdStore;
    public final SharedFlowImpl hasAudioTrack;
    public final CoroutineContext ioDispatcher;
    public final SharedFlowImpl isMuted;
    public final BetterNavigator.ScreenNavigator navigator;
    public final CoroutineScope scope;
    public final AppMessageClientService service;

    public FullscreenAdPresenter(RealFullscreenAdStore realFullscreenAdStore, Analytics analytics, AndroidAudioManager androidAudioManager, AppMessageClientService appMessageClientService, RealAppMessageActionPerformer$Factory$Impl realAppMessageActionPerformer$Factory$Impl, CoroutineContext coroutineContext, FullscreenAdScreen fullscreenAdScreen, BetterNavigator.ScreenNavigator screenNavigator, CoroutineScope coroutineScope) {
        fullscreenAdScreen.getClass();
        this.fullscreenAdStore = realFullscreenAdStore;
        this.analytics = analytics;
        this.audioManager = androidAudioManager;
        this.service = appMessageClientService;
        this.ioDispatcher = coroutineContext;
        this.args = fullscreenAdScreen;
        this.navigator = screenNavigator;
        this.scope = coroutineScope;
        this.actionPerformer = realAppMessageActionPerformer$Factory$Impl.create$1(screenNavigator);
        String str = fullscreenAdScreen.token;
        str.getClass();
        LocalTabContentQueries localTabContentQueries = realFullscreenAdStore.fullScreenMessageQueries;
        localTabContentQueries.getClass();
        FullScreenMessageQueries$get$2 fullScreenMessageQueries$get$2 = FullScreenMessageQueries$get$2.INSTANCE;
        this.fullscreenAd = FlowKt.shareIn(FlowKt.flowOn(new RealCustomerStore$getCustomerForId$$inlined$map$1(DBUtil.mapToOneOrNull(DBUtil.toFlow(new RewardQueries.ForIdsQuery(localTabContentQueries, str, new FullScreenMessageQueries$$ExternalSyntheticLambda5(localTabContentQueries, 0))), realFullscreenAdStore.ioDispatcher), 4), coroutineContext), coroutineScope, new StartedWhileSubscribed(0L, Long.MAX_VALUE), 1);
        this.isMuted = FlowKt.MutableSharedFlow$default(0, 0, null, 7);
        this.hasAudioTrack = FlowKt.MutableSharedFlow$default(0, 0, null, 7);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object access$handleAppMessageAction(FullscreenAdPresenter fullscreenAdPresenter, String str, String str2, ContinuationImpl continuationImpl) {
        FullscreenAdPresenter$handleAppMessageAction$1 fullscreenAdPresenter$handleAppMessageAction$1;
        int i;
        String str3;
        String str4;
        FullscreenAdScreen fullscreenAdScreen = fullscreenAdPresenter.args;
        Analytics analytics = fullscreenAdPresenter.analytics;
        if (continuationImpl instanceof FullscreenAdPresenter$handleAppMessageAction$1) {
            fullscreenAdPresenter$handleAppMessageAction$1 = (FullscreenAdPresenter$handleAppMessageAction$1) continuationImpl;
            int i2 = fullscreenAdPresenter$handleAppMessageAction$1.label;
            if ((i2 & PKIFailureInfo.systemUnavail) != 0) {
                fullscreenAdPresenter$handleAppMessageAction$1.label = i2 - PKIFailureInfo.systemUnavail;
                Object obj = fullscreenAdPresenter$handleAppMessageAction$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = fullscreenAdPresenter$handleAppMessageAction$1.label;
                Continuation continuation = null;
                if (i != 0) {
                    SafeTrace.throwOnFailure(obj);
                    analytics.track(new AppMessageInteractClick(null, null, AppMessageFormat.FULL_SCREEN, fullscreenAdScreen.token, str2, 7), null);
                    analytics.track(new AppMessageInteractBuffer(Long.valueOf(fullscreenAdPresenter.bufferMillis), fullscreenAdScreen.token), null);
                    CoroutineContext coroutineContext = fullscreenAdPresenter.ioDispatcher;
                    NetworkFetcher$doFetch$2 networkFetcher$doFetch$2 = new NetworkFetcher$doFetch$2(fullscreenAdPresenter, str, continuation, 28);
                    fullscreenAdPresenter$handleAppMessageAction$1.L$0 = str;
                    fullscreenAdPresenter$handleAppMessageAction$1.L$1 = str2;
                    fullscreenAdPresenter$handleAppMessageAction$1.label = 1;
                    if (JobKt.withContext(coroutineContext, networkFetcher$doFetch$2, fullscreenAdPresenter$handleAppMessageAction$1) == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    str3 = str;
                    str4 = str2;
                } else {
                    if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str5 = fullscreenAdPresenter$handleAppMessageAction$1.L$1;
                    String str6 = fullscreenAdPresenter$handleAppMessageAction$1.L$0;
                    SafeTrace.throwOnFailure(obj);
                    str4 = str5;
                    str3 = str6;
                }
                fullscreenAdPresenter.actionPerformer.perform(new AppMessageViewEvent.AppMessageActionTaken(str3, str4, false, null, 12));
                fullscreenAdPresenter.navigator.goTo(Back.INSTANCE);
                return Unit.INSTANCE;
            }
        }
        fullscreenAdPresenter$handleAppMessageAction$1 = new FullscreenAdPresenter$handleAppMessageAction$1(fullscreenAdPresenter, continuationImpl);
        Object obj2 = fullscreenAdPresenter$handleAppMessageAction$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = fullscreenAdPresenter$handleAppMessageAction$1.label;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        fullscreenAdPresenter.actionPerformer.perform(new AppMessageViewEvent.AppMessageActionTaken(str3, str4, false, null, 12));
        fullscreenAdPresenter.navigator.goTo(Back.INSTANCE);
        return Unit.INSTANCE;
    }

    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    public final Object models(Flow flow, Composer composer, int i) {
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1280856517);
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue = gapComposer.rememberedValue();
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Continuation continuation = null;
        if (changedInstance || rememberedValue == neverEqualPolicy) {
            rememberedValue = new MLKitTitleGenerator$1(this, continuation, 3);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue);
        Object rememberedValue2 = gapComposer.rememberedValue();
        int i2 = 0;
        if (rememberedValue2 == neverEqualPolicy) {
            FullscreenAdPresenter$getAudioStatus$$inlined$flatMapLatest$1 fullscreenAdPresenter$getAudioStatus$$inlined$flatMapLatest$1 = new FullscreenAdPresenter$getAudioStatus$$inlined$flatMapLatest$1(i2, this, continuation);
            ReadonlySharedFlow readonlySharedFlow = this.fullscreenAd;
            FlowKt__MergeKt$flatMapConcat$$inlined$map$1 flowKt__MergeKt$flatMapConcat$$inlined$map$1 = new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new PageFetcher$flow$1.AnonymousClass1(2, continuation, 5), FlowKt.transformLatest(new FlowKt__ZipKt$combine$$inlined$unsafeFlow$1(readonlySharedFlow, FlowKt.distinctUntilChanged(FlowKt.transformLatest(readonlySharedFlow, fullscreenAdPresenter$getAudioStatus$$inlined$flatMapLatest$1)), FullscreenAdPresenter$getFullscreenAd$3.INSTANCE, i2), new FullscreenAdPresenter$getAudioStatus$$inlined$flatMapLatest$1(1, this, continuation)));
            gapComposer.updateRememberedValue(flowKt__MergeKt$flatMapConcat$$inlined$map$1);
            rememberedValue2 = flowKt__MergeKt$flatMapConcat$$inlined$map$1;
        }
        MutableState collectAsState = Updater.collectAsState((Flow) rememberedValue2, new FullscreenAdViewModel.Loading(null), null, gapComposer, 0, 2);
        Updater.LaunchedEffect(gapComposer, flow, new EditProfilePresenter$models$2$1(flow, continuation, this, 21));
        FullscreenAdViewModel fullscreenAdViewModel = (FullscreenAdViewModel) collectAsState.getValue();
        gapComposer.end(false);
        return fullscreenAdViewModel;
    }
}
