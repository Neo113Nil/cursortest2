package com.squareup.cash.fidesmo.real;

import android.app.Activity;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.gestures.ContentInViewNode$launchAnimation$2;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.interaction.PressInteraction;
import androidx.compose.material.SwipeableState$special$$inlined$filter$1;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.ProduceStateScope;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.snapshots.SnapshotStateSet;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.room.util.DBUtil;
import app.cash.api.ApiResult;
import app.cash.broadway.screen.Screen;
import app.cash.local.presenters.LocalEditorialPresenter;
import app.cash.local.presenters.pos.LocalPosCheckInPresenter;
import app.cash.sqldelight.SimpleQuery;
import app.cash.sqldelight.db.SqlDriver;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.fidesmo.sec.delivery.ServiceDeliveryClient;
import com.fidesmo.sec.devices.Device;
import com.fidesmo.sec.nfc.DeviceListener;
import com.google.zxing.Result;
import com.squareup.cash.activity.backend.FormattedPaymentHistoryActivityItem;
import com.squareup.cash.activity.backend.loader.PaymentHistoryActivityData;
import com.squareup.cash.banking.Disclosure;
import com.squareup.cash.banking.presenters.TransfersPresenter;
import com.squareup.cash.bitcoin.presenters.RealBitcoinAmountPickerPresenter;
import com.squareup.cash.card.onboarding.CardStudioPresenter;
import com.squareup.cash.card.onboarding.graphics.WandScene$ring$3;
import com.squareup.cash.cdf.earnings.EarningsViewOpen;
import com.squareup.cash.checks.VerifyCheckDialogPresenter;
import com.squareup.cash.common.composeui.DrawerViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.RealBlockersHelper$collectBlockersActions$2;
import com.squareup.cash.data.blockers.RealBlockersHelper$skipBlocker$1;
import com.squareup.cash.data.db.RealAppConfigManager$update$2$2;
import com.squareup.cash.data.profile.RealProfileManager$profileOrNull$2;
import com.squareup.cash.datefilterbar.backend.api.DateFilter;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda14;
import com.squareup.cash.earnings.backend.api.EarningsStream;
import com.squareup.cash.earnings.backend.api.EarningsStreamsResult$Success;
import com.squareup.cash.earnings.backend.api.PayerResult;
import com.squareup.cash.earnings.backend.real.RealEarningsStreamsRepository;
import com.squareup.cash.earnings.backend.real.RealPayerRepository;
import com.squareup.cash.earnings.presenters.home.EarningsHomeAnalytics;
import com.squareup.cash.earnings.presenters.home.EarningsHomePresenter;
import com.squareup.cash.earnings.presenters.home.EarningsHomePresenter$models$3$1;
import com.squareup.cash.earnings.presenters.streamdetail.EarningsStreamDetailPresenter$StreamDetailState;
import com.squareup.cash.earnings.screens.AddPayerCustomersScreen;
import com.squareup.cash.earnings.screens.home.EarningsHomeScreen;
import com.squareup.cash.earnings.screens.streamdetail.EarningsStreamDetailScreen;
import com.squareup.cash.earnings.viewmodels.home.EarningsHomeViewModel;
import com.squareup.cash.earnings.viewmodels.payers.AddPayerCustomersViewModel;
import com.squareup.cash.education.stories.backend.api.EducationStory;
import com.squareup.cash.education.stories.backend.api.EducationStoryHttpError;
import com.squareup.cash.education.stories.backend.api.GetStoriesResult;
import com.squareup.cash.education.stories.backend.api.SceneBackground;
import com.squareup.cash.education.stories.backend.real.EducationStoryEntity;
import com.squareup.cash.education.stories.backend.real.RealEducationStoryRepository;
import com.squareup.cash.education.stories.db.Education_story;
import com.squareup.cash.education.stories.db.Education_story_scene_data;
import com.squareup.cash.education.stories.db.SelectWithSceneData;
import com.squareup.cash.education.stories.db.StoryQueries;
import com.squareup.cash.education.stories.db.StoryQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.education.stories.db.StoryQueries$selectWithSceneData$2;
import com.squareup.cash.education.stories.service.api.EducationStoryService;
import com.squareup.cash.education.stories.service.api.models.SceneColor;
import com.squareup.cash.education.stories.service.api.models.SceneData;
import com.squareup.cash.education.stories.service.api.models.Story;
import com.squareup.cash.education.stories.service.api.models.StoryListResponse;
import com.squareup.cash.exchangedata.real.RealFxExchangeRateStreamingSubscriber;
import com.squareup.cash.family.familyhub.backend.api.DependentControlStatus;
import com.squareup.cash.family.familyhub.backend.real.sync.RealTargetEntityManager;
import com.squareup.cash.family.familyhub.backend.real.sync.TargetEntityManager$TargetEntityValue;
import com.squareup.cash.family.familyhub.presenters.BaseDependentControlPresenter;
import com.squareup.cash.family.familyhub.presenters.PendingRequestActivityState;
import com.squareup.cash.family.familyhub.presenters.RealPendingRequestActivityManager;
import com.squareup.cash.family.familyhub.viewmodels.DependentControlViewEvent;
import com.squareup.cash.family.familyhub.views.DisabledClickableNode;
import com.squareup.cash.family.requestsponsorship.presenters.SponsorSelectionDetailsPresenter;
import com.squareup.cash.featureflags.AmplitudeExperiments$BitcoinBasicsTagId;
import com.squareup.cash.featureflags.FeatureFlag$EnabledDisabledFeatureFlag$Options;
import com.squareup.cash.featureflags.FeatureFlag$StringAmplitudeExperiment;
import com.squareup.cash.featureflags.LaunchDarklyFeatureFlags$ProvisioningPostDisconnectStabilityCheck;
import com.squareup.cash.featureflags.RealFeatureFlagManager;
import com.squareup.cash.fidesmo.api.FidesmoDeviceState;
import com.squareup.cash.fidesmo.api.FidesmoServiceType;
import com.squareup.cash.fidesmo.presenters.FidesmoDeprovisioningPresenter;
import com.squareup.cash.fidesmo.presenters.FidesmoProvisioningPresenter;
import com.squareup.cash.fidesmo.real.RealFidesmoClient;
import com.squareup.cash.formview.components.FormCashtag;
import com.squareup.cash.formview.components.arcade.ArcadeFormMoneyInput;
import com.squareup.cash.formview.components.arcade.ArcadeFormMoneyInput$Content$1$1$1$1;
import com.squareup.cash.formview.components.arcade.ArcadeFormTextInputGroupView;
import com.squareup.cash.formview.presenters.FormCashtagPresenter;
import com.squareup.cash.formview.presenters.FormPresenter;
import com.squareup.cash.genericelements.presenters.api.GenericTreeElementsItem;
import com.squareup.cash.gps.db.GpsConfigQueries$$ExternalSyntheticLambda3;
import com.squareup.cash.graphics.backend.engine.TextureType;
import com.squareup.cash.graphics.backend.gl.GLSceneScope;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda1;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$$ExternalSyntheticLambda2;
import com.squareup.cash.graphics.backend.gl.GLSceneScope$rememberMaterial$1$1$$ExternalSyntheticLambda1;
import com.squareup.cash.graphics.backend.gl.core.PBRMaterial;
import com.squareup.cash.graphics.views.AnimationsKt$takeUntil$1$1;
import com.squareup.cash.history.presenters.CheckStatusPresenter;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.observability.types.ErrorReporter;
import com.squareup.cash.profile.presenters.ProfilePresenter;
import com.squareup.cash.score.views.ScoreSummaryKt$$ExternalSyntheticLambda1;
import com.squareup.cash.screens.Back;
import com.squareup.protos.cash.activity.api.v1.ActivityGetResponse;
import com.squareup.protos.cash.clientsync.service.ClientSyncAppApiService;
import com.squareup.protos.cash.clientsync.service.GetSyncEntitiesByTargetRequest;
import com.squareup.protos.cash.clientsync.service.GetSyncEntitiesByTargetResponse;
import com.squareup.protos.cash.clientsync.service.SyncTopic;
import com.squareup.protos.cash.clientsync.service.TargetEntities;
import com.squareup.protos.cash.clientsync.service.TargetSpecifications;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.franklin.common.SyncEntity;
import com.squareup.protos.franklin.common.SyncValue;
import com.squareup.workflow1.internal.SubtreeManager;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CancellationException;
import kotlin.Pair;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.channels.ProducerCoroutine;
import kotlinx.coroutines.channels.ProducerScope;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowCollector;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.StateFlow;
import kotlinx.coroutines.flow.StateFlowImpl;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class RealFidesmoClient$observeDeviceState$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object $activity;
    public final /* synthetic */ int $r8$classId;
    public Object $serviceType;
    public Object L$0;
    public int label;
    public Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealFidesmoClient$observeDeviceState$1(Object obj, Object obj2, Object obj3, Object obj4, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.L$0 = obj;
        this.this$0 = obj2;
        this.$serviceType = obj3;
        this.$activity = obj4;
    }

    private final Object invokeSuspend$com$squareup$cash$family$requestsponsorship$presenters$SelectContactMethodPresenter$models$$inlined$CollectEffect$1(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Flow flow = (Flow) this.this$0;
            RealBlockersHelper$collectBlockersActions$2 realBlockersHelper$collectBlockersActions$2 = new RealBlockersHelper$collectBlockersActions$2(24, coroutineScope, (LocalEditorialPresenter) this.$serviceType, (MutableState) this.$activity);
            this.L$0 = null;
            this.label = 1;
            if (flow.collect(realBlockersHelper$collectBlockersActions$2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    private final Object invokeSuspend$com$squareup$cash$family$requestsponsorship$presenters$SponsorSelectionDetailsPresenter$models$$inlined$CollectEffect$1(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Flow flow = (Flow) this.this$0;
            RealBlockersHelper$collectBlockersActions$2 realBlockersHelper$collectBlockersActions$2 = new RealBlockersHelper$collectBlockersActions$2(25, coroutineScope, (SponsorSelectionDetailsPresenter) this.$serviceType, (MutableState) this.$activity);
            this.L$0 = null;
            this.label = 1;
            if (flow.collect(realBlockersHelper$collectBlockersActions$2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    private final Object invokeSuspend$com$squareup$cash$family$safetyhub$presenters$SafetyHubPresenter$models$$inlined$CollectEffect$1(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Flow flow = (Flow) this.this$0;
            AnimationsKt$takeUntil$1$1.AnonymousClass1.C00601 c00601 = new AnimationsKt$takeUntil$1$1.AnonymousClass1.C00601(coroutineScope, (VerifyCheckDialogPresenter) this.$serviceType, (MutableState) this.$activity, 17);
            this.L$0 = null;
            this.label = 1;
            if (flow.collect(c00601, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    private final Object invokeSuspend$com$squareup$cash$fidesmo$presenters$FidesmoDeprovisioningPresenter$models$11$1(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Flow distinctUntilChanged = FlowKt.distinctUntilChanged(Updater.snapshotFlow(new ScoreSummaryKt$$ExternalSyntheticLambda1((MutableState) this.L$0, (MutableState) this.this$0, 4)));
            AnimationsKt$takeUntil$1$1.AnonymousClass1.C00601 c00601 = new AnimationsKt$takeUntil$1$1.AnonymousClass1.C00601(20, (FidesmoDeprovisioningPresenter) this.$serviceType, (String) this.$activity);
            this.label = 1;
            if (distinctUntilChanged.collect(c00601, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    private final Object invokeSuspend$com$squareup$cash$fidesmo$presenters$FidesmoProvisioningPresenter$models$10$1(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Flow distinctUntilChanged = FlowKt.distinctUntilChanged(Updater.snapshotFlow(new ScoreSummaryKt$$ExternalSyntheticLambda1((MutableState) this.L$0, (MutableState) this.this$0, 5)));
            AnimationsKt$takeUntil$1$1.AnonymousClass1.C00601 c00601 = new AnimationsKt$takeUntil$1$1.AnonymousClass1.C00601(21, (FidesmoProvisioningPresenter) this.$serviceType, (String) this.$activity);
            this.label = 1;
            if (distinctUntilChanged.collect(c00601, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    private final Object invokeSuspend$com$squareup$cash$formview$components$arcade$ArcadeFormMoneyInput$Content$1$1$1(Object obj) {
        StateFlowImpl stateFlowImpl;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            ArcadeFormMoneyInput arcadeFormMoneyInput = (ArcadeFormMoneyInput) this.this$0;
            StateFlowImpl stateFlowImpl2 = arcadeFormMoneyInput.models;
            CoroutineContext coroutineContext = arcadeFormMoneyInput.ioDispatcher;
            ArcadeFormMoneyInput$Content$1$1$1$1 arcadeFormMoneyInput$Content$1$1$1$1 = new ArcadeFormMoneyInput$Content$1$1$1$1(arcadeFormMoneyInput, (MutableState) this.$serviceType, (MutableState) this.$activity, null);
            this.L$0 = stateFlowImpl2;
            this.label = 1;
            obj = JobKt.withContext(coroutineContext, arcadeFormMoneyInput$Content$1$1$1$1, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
            stateFlowImpl = stateFlowImpl2;
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            stateFlowImpl = (StateFlowImpl) this.L$0;
            SafeTrace.throwOnFailure(obj);
        }
        stateFlowImpl.setValue(obj);
        return Unit.INSTANCE;
    }

    private final Object invokeSuspend$com$squareup$cash$formview$components$arcade$ArcadeFormTextInputGroupView$Content$4$1(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            this.label = 1;
            if (JobKt.delay(500L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        if (((Boolean) ((MutableState) this.L$0).getValue()).booleanValue()) {
            return Unit.INSTANCE;
        }
        DBUtil.requestFocusCompat((ArcadeFormTextInputGroupView) this.this$0, (FocusRequester) this.$serviceType);
        DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) this.$activity;
        if (delegatingSoftwareKeyboardController != null) {
            delegatingSoftwareKeyboardController.show();
        }
        return Unit.INSTANCE;
    }

    private final Object invokeSuspend$com$squareup$cash$formview$presenters$FormCashtagPresenter$models$$inlined$CollectEffect$1(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Flow flow = (Flow) this.this$0;
            RealBlockersHelper$collectBlockersActions$2 realBlockersHelper$collectBlockersActions$2 = new RealBlockersHelper$collectBlockersActions$2(26, coroutineScope, (FormCashtagPresenter) this.$serviceType, (MutableState) this.$activity);
            this.L$0 = null;
            this.label = 1;
            if (flow.collect(realBlockersHelper$collectBlockersActions$2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    private final Object invokeSuspend$com$squareup$cash$formview$presenters$FormPresenter$models$$inlined$CollectEffect$1(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Flow flow = (Flow) this.this$0;
            RealBlockersHelper$collectBlockersActions$2 realBlockersHelper$collectBlockersActions$2 = new RealBlockersHelper$collectBlockersActions$2(28, coroutineScope, (String) this.$serviceType, (FormPresenter) this.$activity);
            this.L$0 = null;
            this.label = 1;
            if (flow.collect(realBlockersHelper$collectBlockersActions$2, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    private final Object invokeSuspend$com$squareup$cash$genericelements$presenters$RealGenericTreeElementsPresenter$model$$inlined$CollectEffect$1(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Flow flow = (Flow) this.this$0;
            AnimationsKt$takeUntil$1$1.AnonymousClass1.C00601 c00601 = new AnimationsKt$takeUntil$1$1.AnonymousClass1.C00601(coroutineScope, (SubtreeManager) this.$serviceType, (GenericTreeElementsItem) this.$activity, 24);
            this.L$0 = null;
            this.label = 1;
            if (flow.collect(c00601, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x005b, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.collectLatest(r9, r1, r8) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x005d, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.first(r1, r8) == r0) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object invokeSuspend$com$squareup$cash$graphics$backend$gl$GLSceneScope$produceTexture$1$1(Object obj) {
        GLSceneScope gLSceneScope = (GLSceneScope) this.$serviceType;
        ProduceStateScope produceStateScope = (ProduceStateScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            SwipeableState$special$$inlined$filter$1 swipeableState$special$$inlined$filter$1 = new SwipeableState$special$$inlined$filter$1(Updater.snapshotFlow(new GLSceneScope$$ExternalSyntheticLambda1(gLSceneScope, 6)), 8);
            this.L$0 = produceStateScope;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    SafeTrace.throwOnFailure(obj);
                    return Unit.INSTANCE;
                }
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        Flow flow = (Flow) this.this$0;
        AnimationsKt$takeUntil$1$1 animationsKt$takeUntil$1$1 = new AnimationsKt$takeUntil$1$1(produceStateScope, gLSceneScope, (TextureType) this.$activity, (Continuation) null, 4);
        this.L$0 = null;
        this.label = 2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x004b, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.first(r3, r9) == r2) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object invokeSuspend$com$squareup$cash$graphics$backend$gl$GLSceneScope$rememberMaterial$1$1(Object obj) {
        ProduceStateScope produceStateScope;
        GLSceneScope gLSceneScope = (GLSceneScope) this.$serviceType;
        ProduceStateScope produceStateScope2 = (ProduceStateScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        Continuation continuation = null;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            SwipeableState$special$$inlined$filter$1 swipeableState$special$$inlined$filter$1 = new SwipeableState$special$$inlined$filter$1(Updater.snapshotFlow(new GLSceneScope$$ExternalSyntheticLambda1(gLSceneScope, 7)), 9);
            this.L$0 = produceStateScope2;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i == 3) {
                        throw Recorder$$ExternalSyntheticOutline2.m(obj);
                    }
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                produceStateScope = (ProduceStateScope) this.this$0;
                SafeTrace.throwOnFailure(obj);
                produceStateScope.setValue(obj);
                GLSceneScope$rememberMaterial$1$1$$ExternalSyntheticLambda1 gLSceneScope$rememberMaterial$1$1$$ExternalSyntheticLambda1 = new GLSceneScope$rememberMaterial$1$1$$ExternalSyntheticLambda1(gLSceneScope, produceStateScope2, 0);
                this.L$0 = null;
                this.this$0 = null;
                this.label = 3;
                produceStateScope2.awaitDispose(gLSceneScope$rememberMaterial$1$1$$ExternalSyntheticLambda1, this);
                return coroutineSingletons;
            }
            SafeTrace.throwOnFailure(obj);
        }
        CoroutineScope coroutineScope = gLSceneScope.glScope;
        if (coroutineScope == null) {
            Intrinsics.throwUninitializedPropertyAccessException("glScope");
            throw null;
        }
        CoroutineContext coroutineContext = coroutineScope.getCoroutineContext();
        CheckStatusPresenter.AnonymousClass1.C00611 c00611 = new CheckStatusPresenter.AnonymousClass1.C00611(gLSceneScope, (String) this.$activity, continuation, 19);
        this.L$0 = produceStateScope2;
        this.this$0 = produceStateScope2;
        this.label = 2;
        obj = JobKt.withContext(coroutineContext, c00611, this);
        if (obj != coroutineSingletons) {
            produceStateScope = produceStateScope2;
            produceStateScope.setValue(obj);
            GLSceneScope$rememberMaterial$1$1$$ExternalSyntheticLambda1 gLSceneScope$rememberMaterial$1$1$$ExternalSyntheticLambda12 = new GLSceneScope$rememberMaterial$1$1$$ExternalSyntheticLambda1(gLSceneScope, produceStateScope2, 0);
            this.L$0 = null;
            this.this$0 = null;
            this.label = 3;
            produceStateScope2.awaitDispose(gLSceneScope$rememberMaterial$1$1$$ExternalSyntheticLambda12, this);
            return coroutineSingletons;
        }
        return coroutineSingletons;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$activity;
        switch (i) {
            case 0:
                RealFidesmoClient$observeDeviceState$1 realFidesmoClient$observeDeviceState$1 = new RealFidesmoClient$observeDeviceState$1((RealFidesmoClient) this.this$0, (FidesmoServiceType) this.$serviceType, (Activity) obj2, continuation, 0);
                realFidesmoClient$observeDeviceState$1.L$0 = obj;
                return realFidesmoClient$observeDeviceState$1;
            case 1:
                RealFidesmoClient$observeDeviceState$1 realFidesmoClient$observeDeviceState$12 = new RealFidesmoClient$observeDeviceState$1((Flow) this.this$0, continuation, (CardStudioPresenter) this.$serviceType, (MutableState) obj2, 1);
                realFidesmoClient$observeDeviceState$12.L$0 = obj;
                return realFidesmoClient$observeDeviceState$12;
            case 2:
                RealFidesmoClient$observeDeviceState$1 realFidesmoClient$observeDeviceState$13 = new RealFidesmoClient$observeDeviceState$1((Flow) this.this$0, continuation, (EarningsHomePresenter) this.$serviceType, (MutableState) obj2, 2);
                realFidesmoClient$observeDeviceState$13.L$0 = obj;
                return realFidesmoClient$observeDeviceState$13;
            case 3:
                return new RealFidesmoClient$observeDeviceState$1((Flow) this.L$0, (EarningsHomePresenter) this.this$0, (MutableState) this.$serviceType, (MutableState) obj2, continuation, 3);
            case 4:
                return new RealFidesmoClient$observeDeviceState$1((CardStudioPresenter) this.L$0, (LinkedHashSet) this.this$0, (SnapshotStateSet) this.$serviceType, (MutableState) obj2, continuation, 4);
            case 5:
                return new RealFidesmoClient$observeDeviceState$1((CardStudioPresenter) this.L$0, (SnapshotStateSet) this.this$0, (AddPayerCustomersViewModel.Loaded) this.$serviceType, (MutableState) obj2, continuation, 5);
            case 6:
                return new RealFidesmoClient$observeDeviceState$1((TransfersPresenter) this.this$0, (MutableState) this.$serviceType, (MutableState) obj2, continuation, 6);
            case 7:
                RealFidesmoClient$observeDeviceState$1 realFidesmoClient$observeDeviceState$14 = new RealFidesmoClient$observeDeviceState$1((Flow) this.this$0, continuation, (LocalPosCheckInPresenter) this.$serviceType, (MutableState) obj2, 7);
                realFidesmoClient$observeDeviceState$14.L$0 = obj;
                return realFidesmoClient$observeDeviceState$14;
            case 8:
                RealFidesmoClient$observeDeviceState$1 realFidesmoClient$observeDeviceState$15 = new RealFidesmoClient$observeDeviceState$1((RealEducationStoryRepository) obj2, continuation);
                realFidesmoClient$observeDeviceState$15.L$0 = obj;
                return realFidesmoClient$observeDeviceState$15;
            case 9:
                RealFidesmoClient$observeDeviceState$1 realFidesmoClient$observeDeviceState$16 = new RealFidesmoClient$observeDeviceState$1((RealFxExchangeRateStreamingSubscriber) this.this$0, (CurrencyCode) this.$serviceType, (CurrencyCode) obj2, continuation, 9);
                realFidesmoClient$observeDeviceState$16.L$0 = obj;
                return realFidesmoClient$observeDeviceState$16;
            case 10:
                return new RealFidesmoClient$observeDeviceState$1((String) this.L$0, (List) this.this$0, (RealTargetEntityManager) this.$serviceType, (MutableState) obj2, continuation, 10);
            case 11:
                return new RealFidesmoClient$observeDeviceState$1((BaseDependentControlPresenter) this.L$0, (DependentControlViewEvent) this.this$0, (State) this.$serviceType, (State) obj2, continuation, 11);
            case 12:
                RealFidesmoClient$observeDeviceState$1 realFidesmoClient$observeDeviceState$17 = new RealFidesmoClient$observeDeviceState$1((Flow) this.this$0, continuation, (RealBitcoinAmountPickerPresenter) this.$serviceType, (MutableState) obj2, 12);
                realFidesmoClient$observeDeviceState$17.L$0 = obj;
                return realFidesmoClient$observeDeviceState$17;
            case 13:
                RealFidesmoClient$observeDeviceState$1 realFidesmoClient$observeDeviceState$18 = new RealFidesmoClient$observeDeviceState$1((Flow) this.this$0, continuation, (CardStudioPresenter) this.$serviceType, (MutableStateFlow) obj2, 13);
                realFidesmoClient$observeDeviceState$18.L$0 = obj;
                return realFidesmoClient$observeDeviceState$18;
            case 14:
                return new RealFidesmoClient$observeDeviceState$1((String) this.L$0, (RealPendingRequestActivityManager) this.this$0, (String) this.$serviceType, (MutableState) obj2, continuation, 14);
            case 15:
                RealFidesmoClient$observeDeviceState$1 realFidesmoClient$observeDeviceState$19 = new RealFidesmoClient$observeDeviceState$1((Flow) this.this$0, continuation, (ProfilePresenter) this.$serviceType, (State) obj2, 15);
                realFidesmoClient$observeDeviceState$19.L$0 = obj;
                return realFidesmoClient$observeDeviceState$19;
            case 16:
                return new RealFidesmoClient$observeDeviceState$1((DisabledClickableNode) this.$serviceType, (PointerInputChange) obj2, continuation, 16);
            case 17:
                RealFidesmoClient$observeDeviceState$1 realFidesmoClient$observeDeviceState$110 = new RealFidesmoClient$observeDeviceState$1((Flow) this.this$0, continuation, (LocalEditorialPresenter) this.$serviceType, (MutableState) obj2, 17);
                realFidesmoClient$observeDeviceState$110.L$0 = obj;
                return realFidesmoClient$observeDeviceState$110;
            case 18:
                RealFidesmoClient$observeDeviceState$1 realFidesmoClient$observeDeviceState$111 = new RealFidesmoClient$observeDeviceState$1((Flow) this.this$0, continuation, (SponsorSelectionDetailsPresenter) this.$serviceType, (MutableState) obj2, 18);
                realFidesmoClient$observeDeviceState$111.L$0 = obj;
                return realFidesmoClient$observeDeviceState$111;
            case 19:
                RealFidesmoClient$observeDeviceState$1 realFidesmoClient$observeDeviceState$112 = new RealFidesmoClient$observeDeviceState$1((Flow) this.this$0, continuation, (VerifyCheckDialogPresenter) this.$serviceType, (MutableState) obj2, 19);
                realFidesmoClient$observeDeviceState$112.L$0 = obj;
                return realFidesmoClient$observeDeviceState$112;
            case 20:
                return new RealFidesmoClient$observeDeviceState$1((MutableState) this.L$0, (MutableState) this.this$0, (FidesmoDeprovisioningPresenter) this.$serviceType, (String) obj2, continuation, 20);
            case 21:
                return new RealFidesmoClient$observeDeviceState$1((MutableState) this.L$0, (MutableState) this.this$0, (FidesmoProvisioningPresenter) this.$serviceType, (String) obj2, continuation, 21);
            case 22:
                return new RealFidesmoClient$observeDeviceState$1((ArcadeFormMoneyInput) this.this$0, (MutableState) this.$serviceType, (MutableState) obj2, continuation, 22);
            case 23:
                return new RealFidesmoClient$observeDeviceState$1((MutableState) this.L$0, (ArcadeFormTextInputGroupView) this.this$0, (FocusRequester) this.$serviceType, (DelegatingSoftwareKeyboardController) obj2, continuation, 23);
            case 24:
                RealFidesmoClient$observeDeviceState$1 realFidesmoClient$observeDeviceState$113 = new RealFidesmoClient$observeDeviceState$1((Flow) this.this$0, continuation, (FormCashtagPresenter) this.$serviceType, (MutableState) obj2, 24);
                realFidesmoClient$observeDeviceState$113.L$0 = obj;
                return realFidesmoClient$observeDeviceState$113;
            case 25:
                RealFidesmoClient$observeDeviceState$1 realFidesmoClient$observeDeviceState$114 = new RealFidesmoClient$observeDeviceState$1((Flow) this.this$0, continuation, (String) this.$serviceType, (FormPresenter) obj2, 25);
                realFidesmoClient$observeDeviceState$114.L$0 = obj;
                return realFidesmoClient$observeDeviceState$114;
            case 26:
                RealFidesmoClient$observeDeviceState$1 realFidesmoClient$observeDeviceState$115 = new RealFidesmoClient$observeDeviceState$1((Flow) this.this$0, continuation, (SubtreeManager) this.$serviceType, (GenericTreeElementsItem) obj2, 26);
                realFidesmoClient$observeDeviceState$115.L$0 = obj;
                return realFidesmoClient$observeDeviceState$115;
            case 27:
                RealFidesmoClient$observeDeviceState$1 realFidesmoClient$observeDeviceState$116 = new RealFidesmoClient$observeDeviceState$1((Flow) this.this$0, (GLSceneScope) this.$serviceType, (TextureType) obj2, continuation, 27);
                realFidesmoClient$observeDeviceState$116.L$0 = obj;
                return realFidesmoClient$observeDeviceState$116;
            case 28:
                RealFidesmoClient$observeDeviceState$1 realFidesmoClient$observeDeviceState$117 = new RealFidesmoClient$observeDeviceState$1((GLSceneScope) this.$serviceType, (String) obj2, continuation, 28);
                realFidesmoClient$observeDeviceState$117.L$0 = obj;
                return realFidesmoClient$observeDeviceState$117;
            default:
                RealFidesmoClient$observeDeviceState$1 realFidesmoClient$observeDeviceState$118 = new RealFidesmoClient$observeDeviceState$1((GLSceneScope) this.$serviceType, (PBRMaterial) obj2, continuation, 29);
                realFidesmoClient$observeDeviceState$118.L$0 = obj;
                return realFidesmoClient$observeDeviceState$118;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((RealFidesmoClient$observeDeviceState$1) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 1:
                return ((RealFidesmoClient$observeDeviceState$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 2:
                return ((RealFidesmoClient$observeDeviceState$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 3:
                return ((RealFidesmoClient$observeDeviceState$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 4:
                return ((RealFidesmoClient$observeDeviceState$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 5:
                return ((RealFidesmoClient$observeDeviceState$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 6:
                return ((RealFidesmoClient$observeDeviceState$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 7:
                return ((RealFidesmoClient$observeDeviceState$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 8:
                return ((RealFidesmoClient$observeDeviceState$1) create((FlowCollector) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 9:
                return ((RealFidesmoClient$observeDeviceState$1) create((ProducerScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 10:
                return ((RealFidesmoClient$observeDeviceState$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 11:
                return ((RealFidesmoClient$observeDeviceState$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 12:
                return ((RealFidesmoClient$observeDeviceState$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 13:
                return ((RealFidesmoClient$observeDeviceState$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 14:
                return ((RealFidesmoClient$observeDeviceState$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 15:
                return ((RealFidesmoClient$observeDeviceState$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 16:
                return ((RealFidesmoClient$observeDeviceState$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 17:
                return ((RealFidesmoClient$observeDeviceState$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 18:
                return ((RealFidesmoClient$observeDeviceState$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 19:
                return ((RealFidesmoClient$observeDeviceState$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 20:
                return ((RealFidesmoClient$observeDeviceState$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 21:
                return ((RealFidesmoClient$observeDeviceState$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 22:
                return ((RealFidesmoClient$observeDeviceState$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 23:
                return ((RealFidesmoClient$observeDeviceState$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 24:
                return ((RealFidesmoClient$observeDeviceState$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 25:
                return ((RealFidesmoClient$observeDeviceState$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 26:
                return ((RealFidesmoClient$observeDeviceState$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 27:
                return ((RealFidesmoClient$observeDeviceState$1) create((ProduceStateScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            case 28:
                ((RealFidesmoClient$observeDeviceState$1) create((ProduceStateScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                return CoroutineSingletons.COROUTINE_SUSPENDED;
            default:
                return ((RealFidesmoClient$observeDeviceState$1) create((ProduceStateScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0075, code lost:
    
        if (r0 == r3) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:?, code lost:
    
        return r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:224:0x03f8, code lost:
    
        if (kotlinx.coroutines.JobKt.m4182delayVtjQ1oo(r3, r33) != r2) goto L193;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0055, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.first(r5, r33) == r3) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x07f6, code lost:
    
        if (r5.emit(r2, r33) == r7) goto L314;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x0814, code lost:
    
        if (r5.emit(r2, r33) == r7) goto L314;
     */
    /* JADX WARN: Code restructure failed: missing block: B:362:0x05aa, code lost:
    
        if (r5.emit(r3, r33) == r12) goto L243;
     */
    /* JADX WARN: Code restructure failed: missing block: B:534:0x0a55, code lost:
    
        if (kotlinx.coroutines.flow.FlowKt.first(r4, r5, r33) == r0) goto L415;
     */
    /* JADX WARN: Code restructure failed: missing block: B:536:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:538:0x0a34, code lost:
    
        if (r3 == r0) goto L415;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x019a, code lost:
    
        if (r0 == r5) goto L92;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:241:0x07b6  */
    /* JADX WARN: Removed duplicated region for block: B:260:0x05f4  */
    /* JADX WARN: Removed duplicated region for block: B:310:0x07af  */
    /* JADX WARN: Type inference failed for: r10v24, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r21v1, types: [com.squareup.cash.education.stories.db.Education_story_scene_data] */
    /* JADX WARN: Type inference failed for: r32v12 */
    /* JADX WARN: Type inference failed for: r32v3, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r32v7 */
    /* JADX WARN: Type inference failed for: r3v2, types: [com.fidesmo.sec.nfc.DeviceListener, com.squareup.cash.fidesmo.real.RealFidesmoClient$observeDeviceState$1$listener$1, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v31, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r7v2, types: [com.fidesmo.sec.nfc.NfcDevicesManager] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object first;
        EarningsViewOpen.EarningsOrigin earningsOrigin;
        String str;
        Object withContext;
        Object withContext2;
        Object withContext3;
        Object obj2;
        Continuation continuation;
        CoroutineSingletons coroutineSingletons;
        Continuation continuation2;
        ArrayList arrayList;
        Object stories;
        List list;
        ?? r32;
        ApiResult apiResult;
        EducationStoryService educationStoryService;
        ApiResult apiResult2;
        List list2;
        Iterator it;
        CoroutineSingletons coroutineSingletons2;
        Long l;
        long j;
        Long l2;
        Object obj3;
        Object obj4;
        Object syncEntitiesByTarget;
        Object value;
        Object ready;
        Object access$fetchActivity;
        Object access$formatActivityData;
        DisabledClickableNode disabledClickableNode;
        PressInteraction.Press press;
        Object withContext4;
        int i = 21;
        int i2 = 6;
        int i3 = 10;
        Continuation continuation3 = null;
        switch (this.$r8$classId) {
            case 0:
                final ProducerScope producerScope = (ProducerScope) this.L$0;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    final RealFidesmoClient realFidesmoClient = (RealFidesmoClient) this.this$0;
                    final FidesmoServiceType fidesmoServiceType = (FidesmoServiceType) this.$serviceType;
                    ?? r3 = new DeviceListener() { // from class: com.squareup.cash.fidesmo.real.RealFidesmoClient$observeDeviceState$1$listener$1
                        @Override // com.fidesmo.sec.nfc.DeviceListener
                        public final void onDeviceConnected(Device device) {
                            ServiceDeliveryClient serviceDeliveryClient;
                            device.getClass();
                            if (((FeatureFlag$EnabledDisabledFeatureFlag$Options) ((RealFeatureFlagManager) RealFidesmoClient.this.featureFlagManager).peekCurrentValue(LaunchDarklyFeatureFlags$ProvisioningPostDisconnectStabilityCheck.INSTANCE)).enabled()) {
                                RealFidesmoClient realFidesmoClient2 = RealFidesmoClient.this;
                                ProducerScope producerScope2 = producerScope;
                                synchronized (realFidesmoClient2.nfcDiscoveryLock) {
                                    RealFidesmoClient.ActiveDelivery activeDelivery = realFidesmoClient2.activeDelivery;
                                    if (activeDelivery != null) {
                                        if (!RealFidesmoClient.keepsSdkSessionActive(activeDelivery.state)) {
                                            activeDelivery = null;
                                        }
                                        if (activeDelivery != null) {
                                            if (activeDelivery.isDeviceConnected) {
                                                activeDelivery = null;
                                            }
                                            if (activeDelivery != null) {
                                                serviceDeliveryClient = activeDelivery.client;
                                            }
                                        }
                                    }
                                    serviceDeliveryClient = null;
                                }
                                if (serviceDeliveryClient != null) {
                                    long incrementAndGet = realFidesmoClient2.activeDeliveryReconnectAttempt.incrementAndGet();
                                    Timber.Forest forest = Timber.Forest;
                                    StringBuilder m = re$$ExternalSyntheticOutline0.m("Fidesmo device reconnected during active delivery; verifying stability before resuming SDK session (device=", RealFidesmoClient.logId(device), ", attemptId=", incrementAndGet);
                                    m.append(")");
                                    forest.i(m.toString(), new Object[0]);
                                    ((ProducerCoroutine) producerScope2).mo1159trySendJP2dKIU(new FidesmoDeviceState.CheckingStability(0, 4));
                                    JobKt.launch$default(producerScope2, realFidesmoClient2.ioDispatcher, null, new ContentInViewNode$launchAnimation$2(realFidesmoClient2, device, incrementAndGet, serviceDeliveryClient, producerScope2, (Continuation) null), 2);
                                    return;
                                }
                            }
                            if (RealFidesmoClient.access$publishDeviceToActiveDelivery(RealFidesmoClient.this, device)) {
                                Timber.Forest.i(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Fidesmo device connected during active delivery; published reconnect to SDK session (device=", RealFidesmoClient.logId(device), ")"), new Object[0]);
                                ((ProducerCoroutine) producerScope).mo1159trySendJP2dKIU(FidesmoDeviceState.Connected.INSTANCE);
                                return;
                            }
                            long incrementActiveConnectionId = RealFidesmoClient.this.incrementActiveConnectionId();
                            Timber.Forest.i(Boxes$$ExternalSyntheticOutline1.m(incrementActiveConnectionId, "Fidesmo device connected (connectionId=", ")"), new Object[0]);
                            ((ProducerCoroutine) producerScope).mo1159trySendJP2dKIU(FidesmoDeviceState.Connected.INSTANCE);
                            ProducerScope producerScope3 = producerScope;
                            RealFidesmoClient realFidesmoClient3 = RealFidesmoClient.this;
                            JobKt.launch$default(producerScope3, realFidesmoClient3.ioDispatcher, null, new RealFidesmoClient$observeDeviceState$1$listener$1$onDeviceConnected$1(realFidesmoClient3, device, producerScope3, fidesmoServiceType, incrementActiveConnectionId, null), 2);
                        }

                        @Override // com.fidesmo.sec.nfc.DeviceListener
                        public final void onDeviceDisconnected(Device device) {
                            boolean z;
                            device.getClass();
                            RealFidesmoClient realFidesmoClient2 = RealFidesmoClient.this;
                            synchronized (realFidesmoClient2.nfcDiscoveryLock) {
                                RealFidesmoClient.ActiveDelivery activeDelivery = realFidesmoClient2.activeDelivery;
                                if (activeDelivery != null) {
                                    RealFidesmoClient.ActiveDelivery activeDelivery2 = RealFidesmoClient.keepsSdkSessionActive(activeDelivery.state) ? activeDelivery : null;
                                    if (activeDelivery2 != null) {
                                        realFidesmoClient2.activeDelivery = RealFidesmoClient.ActiveDelivery.copy$default(activeDelivery2, null, false, 0, 0, 119);
                                        z = true;
                                    }
                                }
                                z = false;
                            }
                            if (z) {
                                Timber.Forest.w(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Fidesmo device disconnected during active delivery; keeping SDK session for retry (device=", RealFidesmoClient.logId(device), ")"), new Object[0]);
                                ((ProducerCoroutine) producerScope).mo1159trySendJP2dKIU(FidesmoDeviceState.Disconnected.INSTANCE);
                            } else {
                                RealFidesmoClient.this.incrementActiveConnectionId();
                                RealFidesmoClient.this._activationData.setValue(null);
                                Timber.Forest.w("Fidesmo device disconnected", new Object[0]);
                                ((ProducerCoroutine) producerScope).mo1159trySendJP2dKIU(FidesmoDeviceState.Disconnected.INSTANCE);
                            }
                        }
                    };
                    Object obj5 = realFidesmoClient.nfcDiscoveryLock;
                    Activity activity = (Activity) this.$activity;
                    synchronized (obj5) {
                        try {
                            RealFidesmoClient$observeDeviceState$1$listener$1 realFidesmoClient$observeDeviceState$1$listener$1 = realFidesmoClient.activeDeviceListener;
                            if (realFidesmoClient$observeDeviceState$1$listener$1 != null) {
                                realFidesmoClient.devicesManager.removeDeviceListener(realFidesmoClient$observeDeviceState$1$listener$1);
                            }
                            realFidesmoClient.devicesManager.addDeviceListener(r3);
                            realFidesmoClient.activeDeviceListener = r3;
                            realFidesmoClient.devicesManager.startNfcDiscovery(activity);
                            realFidesmoClient.nfcDiscoveryStarted = true;
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    GLSceneScope$$ExternalSyntheticLambda2 gLSceneScope$$ExternalSyntheticLambda2 = new GLSceneScope$$ExternalSyntheticLambda2(10, (RealFidesmoClient) this.this$0, (Activity) this.$activity, r3);
                    this.L$0 = null;
                    this.label = 1;
                    if (TuplesKt.awaitClose(producerScope, gLSceneScope$$ExternalSyntheticLambda2, this) == coroutineSingletons3) {
                        return coroutineSingletons3;
                    }
                } else {
                    if (i4 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 1:
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow = (Flow) this.this$0;
                    AnimationsKt$takeUntil$1$1.AnonymousClass1.C00601 c00601 = new AnimationsKt$takeUntil$1$1.AnonymousClass1.C00601(coroutineScope, (CardStudioPresenter) this.$serviceType, (MutableState) this.$activity, i2);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow.collect(c00601, this) == coroutineSingletons4) {
                        return coroutineSingletons4;
                    }
                } else {
                    if (i5 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 2:
                CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i6 = this.label;
                if (i6 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow2 = (Flow) this.this$0;
                    RealBlockersHelper$collectBlockersActions$2 realBlockersHelper$collectBlockersActions$2 = new RealBlockersHelper$collectBlockersActions$2(i, coroutineScope2, (EarningsHomePresenter) this.$serviceType, (MutableState) this.$activity);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow2.collect(realBlockersHelper$collectBlockersActions$2, this) == coroutineSingletons5) {
                        return coroutineSingletons5;
                    }
                } else {
                    if (i6 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 3:
                CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i7 = this.label;
                if (i7 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow3 = (Flow) this.L$0;
                    this.label = 1;
                    first = FlowKt.first(flow3, this);
                    break;
                } else {
                    if (i7 != 1) {
                        if (i7 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        EarningsHomePresenter earningsHomePresenter = (EarningsHomePresenter) this.this$0;
                        EarningsHomeAnalytics earningsHomeAnalytics = earningsHomePresenter.earningsHomeAnalytics;
                        EarningsHomeScreen.Origin origin = earningsHomePresenter.args.origin;
                        List list3 = (List) ((MutableState) this.$activity).getValue();
                        origin.getClass();
                        list3.getClass();
                        Analytics analytics = earningsHomeAnalytics.analytics;
                        int ordinal = origin.ordinal();
                        if (ordinal == 0) {
                            earningsOrigin = EarningsViewOpen.EarningsOrigin.MONEY_TAB_APPLET;
                        } else if (ordinal == 1) {
                            earningsOrigin = EarningsViewOpen.EarningsOrigin.DEEP_LINK;
                        } else if (ordinal == 2) {
                            earningsOrigin = EarningsViewOpen.EarningsOrigin.ACTIVITY;
                        } else if (ordinal == 3) {
                            earningsOrigin = EarningsViewOpen.EarningsOrigin.RECEIPT;
                        } else if (ordinal == 4) {
                            earningsOrigin = EarningsViewOpen.EarningsOrigin.PUSH;
                        } else {
                            if (ordinal != 5) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            earningsOrigin = EarningsViewOpen.EarningsOrigin.UNKNOWN;
                        }
                        List<EarningsHomeViewModel.SectionContent> list4 = list3;
                        ArrayList arrayList2 = new ArrayList();
                        for (EarningsHomeViewModel.SectionContent sectionContent : list4) {
                            if (sectionContent instanceof EarningsHomeViewModel.SectionContent.Header) {
                                str = "HEADER";
                            } else if (sectionContent instanceof EarningsHomeViewModel.SectionContent.Activity) {
                                str = "ACTIVITY";
                            } else if (sectionContent instanceof EarningsHomeViewModel.SectionContent.Distributions) {
                                str = "EARNING_CARD";
                            } else if (sectionContent instanceof EarningsHomeViewModel.SectionContent.ActionButtons) {
                                str = "ACTION_BUTTONS";
                            } else if (sectionContent instanceof EarningsHomeViewModel.SectionContent.EarningTools) {
                                str = "EARNER_TOOLS";
                            } else if (sectionContent instanceof EarningsHomeViewModel.SectionContent.DisclosureFooter) {
                                str = "FOOTER";
                            } else {
                                if (!Intrinsics.areEqual(sectionContent, EarningsHomeViewModel.SectionContent.Unknown.INSTANCE)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                str = null;
                            }
                            if (str != null) {
                                arrayList2.add(str);
                            }
                        }
                        String joinToString$default = CollectionsKt.joinToString$default(arrayList2, ",", null, null, 0, null, null, 62);
                        ArrayList arrayList3 = new ArrayList();
                        for (Object obj6 : list4) {
                            if (obj6 instanceof EarningsHomeViewModel.SectionContent.EarningTools) {
                                arrayList3.add(obj6);
                            }
                        }
                        EarningsHomeViewModel.SectionContent.EarningTools earningTools = (EarningsHomeViewModel.SectionContent.EarningTools) CollectionsKt.firstOrNull((List) arrayList3);
                        analytics.track(new EarningsViewOpen(earningsOrigin, joinToString$default, earningTools != null ? CollectionsKt.joinToString$default(earningTools.items, ",", null, null, 0, null, new ComposeDialogKt$$ExternalSyntheticLambda14(earningsHomeAnalytics), 30) : null), null);
                        return Unit.INSTANCE;
                    }
                    SafeTrace.throwOnFailure(obj);
                    first = obj;
                }
                SafeFlow snapshotFlow = Updater.snapshotFlow(new DrawerViewKt$$ExternalSyntheticLambda2(15, (MutableState) this.$serviceType));
                RealAppConfigManager$update$2$2 realAppConfigManager$update$2$2 = new RealAppConfigManager$update$2$2((Disclosure) first, null, i);
                this.label = 2;
                break;
            case 4:
                SnapshotStateSet snapshotStateSet = (SnapshotStateSet) this.$serviceType;
                LinkedHashSet linkedHashSet = (LinkedHashSet) this.this$0;
                CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i8 = this.label;
                if (i8 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealPayerRepository realPayerRepository = (RealPayerRepository) ((CardStudioPresenter) this.L$0).args;
                    this.label = 1;
                    withContext = JobKt.withContext(realPayerRepository.ioDispatcher, new FormCashtag.AnonymousClass8.AnonymousClass2(realPayerRepository, CollectionsKt.toList(linkedHashSet), null, 1), this);
                    if (withContext == coroutineSingletons7) {
                        return coroutineSingletons7;
                    }
                } else {
                    if (i8 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    withContext = obj;
                }
                PayerResult payerResult = (PayerResult) withContext;
                if (payerResult instanceof PayerResult.Success) {
                    snapshotStateSet.clear();
                    snapshotStateSet.addAll(linkedHashSet);
                } else if (!(payerResult instanceof PayerResult.Failure)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                ((MutableState) this.$activity).setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 5:
                CardStudioPresenter cardStudioPresenter = (CardStudioPresenter) this.L$0;
                CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i9 = this.label;
                if (i9 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealPayerRepository realPayerRepository2 = (RealPayerRepository) cardStudioPresenter.args;
                    this.label = 1;
                    withContext2 = JobKt.withContext(realPayerRepository2.ioDispatcher, new FormCashtag.AnonymousClass8.AnonymousClass2(realPayerRepository2, CollectionsKt.toList((SnapshotStateSet) this.this$0), null, 1), this);
                    if (withContext2 == coroutineSingletons8) {
                        return coroutineSingletons8;
                    }
                } else {
                    if (i9 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    withContext2 = obj;
                }
                PayerResult payerResult2 = (PayerResult) withContext2;
                if (payerResult2 instanceof PayerResult.Success) {
                    BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) cardStudioPresenter.navigator;
                    Screen screen = ((AddPayerCustomersScreen) cardStudioPresenter.cardStudioQueries).exitScreen;
                    if (screen == null) {
                        screen = Back.INSTANCE;
                    }
                    screenNavigator.goTo(screen);
                } else {
                    if (!(payerResult2 instanceof PayerResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    ((MutableState) this.$activity).setValue(new AddPayerCustomersViewModel.SaveError((AddPayerCustomersViewModel.Loaded) this.$serviceType));
                }
                return Unit.INSTANCE;
            case 6:
                MutableState mutableState = (MutableState) this.$activity;
                MutableState mutableState2 = (MutableState) this.$serviceType;
                TransfersPresenter transfersPresenter = (TransfersPresenter) this.this$0;
                EarningsStreamDetailScreen earningsStreamDetailScreen = (EarningsStreamDetailScreen) transfersPresenter.featureFlagManager;
                LinkedHashMap linkedHashMap = (LinkedHashMap) transfersPresenter.router;
                CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i10 = this.label;
                EarningsStream earningsStream = null;
                boolean z = false;
                if (i10 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (linkedHashMap.containsKey((DateFilter) mutableState2.getValue())) {
                        mutableState.setValue(new EarningsStreamDetailPresenter$StreamDetailState.Loaded((EarningsStream) linkedHashMap.get((DateFilter) mutableState2.getValue())));
                        return Unit.INSTANCE;
                    }
                    if (!(((EarningsStreamDetailPresenter$StreamDetailState) mutableState.getValue()) instanceof EarningsStreamDetailPresenter$StreamDetailState.Loaded)) {
                        mutableState.setValue(EarningsStreamDetailPresenter$StreamDetailState.Loading.INSTANCE);
                    }
                    RealEarningsStreamsRepository realEarningsStreamsRepository = (RealEarningsStreamsRepository) transfersPresenter.clipboardManager;
                    DateFilter dateFilter = (DateFilter) mutableState2.getValue();
                    String str2 = earningsStreamDetailScreen.streamId;
                    this.L$0 = mutableState;
                    this.label = 1;
                    withContext3 = JobKt.withContext(realEarningsStreamsRepository.ioDispatcher, new EarningsHomePresenter$models$3$1(dateFilter, str2, realEarningsStreamsRepository, z ? 1 : 0, 3), this);
                    if (withContext3 == coroutineSingletons9) {
                        return coroutineSingletons9;
                    }
                } else {
                    if (i10 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    mutableState = (MutableState) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    withContext3 = obj;
                }
                ApiResult apiResult3 = (ApiResult) withContext3;
                if (apiResult3 instanceof ApiResult.Success) {
                    Iterator it2 = ((EarningsStreamsResult$Success) ((ApiResult.Success) apiResult3).response).streams.iterator();
                    while (true) {
                        if (it2.hasNext()) {
                            ?? next = it2.next();
                            if (((EarningsStream) next).token.equals(earningsStreamDetailScreen.streamId)) {
                                earningsStream = next;
                            }
                        }
                    }
                    EarningsStream earningsStream2 = earningsStream;
                    linkedHashMap.put((DateFilter) mutableState2.getValue(), earningsStream2);
                    obj2 = new EarningsStreamDetailPresenter$StreamDetailState.Loaded(earningsStream2);
                } else {
                    if (!(apiResult3 instanceof ApiResult.Failure)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    obj2 = EarningsStreamDetailPresenter$StreamDetailState.Error.INSTANCE;
                }
                mutableState.setValue(obj2);
                return Unit.INSTANCE;
            case 7:
                CoroutineScope coroutineScope3 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i11 = this.label;
                if (i11 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow4 = (Flow) this.this$0;
                    AnimationsKt$takeUntil$1$1.AnonymousClass1.C00601 c006012 = new AnimationsKt$takeUntil$1$1.AnonymousClass1.C00601(coroutineScope3, (LocalPosCheckInPresenter) this.$serviceType, (MutableState) this.$activity, 7);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow4.collect(c006012, this) == coroutineSingletons10) {
                        return coroutineSingletons10;
                    }
                } else {
                    if (i11 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 8:
                RealEducationStoryRepository realEducationStoryRepository = (RealEducationStoryRepository) this.$activity;
                EducationStoryService educationStoryService2 = realEducationStoryRepository.storyService;
                Result result = realEducationStoryRepository.storyDao;
                FlowCollector flowCollector = (FlowCollector) this.L$0;
                CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i12 = this.label;
                if (i12 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    StoryQueries storyQueries = (StoryQueries) result.text;
                    storyQueries.getClass();
                    StoryQueries$selectWithSceneData$2 storyQueries$selectWithSceneData$2 = StoryQueries$selectWithSceneData$2.INSTANCE;
                    SqlDriver sqlDriver = storyQueries.driver;
                    StoryQueries$$ExternalSyntheticLambda0 storyQueries$$ExternalSyntheticLambda0 = new StoryQueries$$ExternalSyntheticLambda0(0);
                    sqlDriver.getClass();
                    List executeAsList = new SimpleQuery(-1251341798, new String[]{"education_story", "education_story_scene_data"}, sqlDriver, "Story.sq", "selectWithSceneData", "SELECT story.id, story.url, story.slug, story.title, story.thumbnail, story.primaryColor, story.published_at_millis, story.priority, scene.id, scene.scene_index, scene.backgroundColor, scene.storyId FROM education_story story\nLEFT JOIN education_story_scene_data scene ON story.id = scene.storyId\nORDER BY story.priority DESC", storyQueries$$ExternalSyntheticLambda0).executeAsList();
                    LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                    Iterator it3 = executeAsList.iterator();
                    while (it3.hasNext()) {
                        Object next2 = it3.next();
                        SelectWithSceneData selectWithSceneData = (SelectWithSceneData) next2;
                        Continuation continuation4 = continuation3;
                        Iterator it4 = it3;
                        Education_story education_story = new Education_story(selectWithSceneData.id, selectWithSceneData.url, selectWithSceneData.slug, selectWithSceneData.title, selectWithSceneData.thumbnail, selectWithSceneData.primaryColor, selectWithSceneData.published_at_millis, selectWithSceneData.priority);
                        Object obj7 = linkedHashMap2.get(education_story);
                        if (obj7 == null) {
                            obj7 = new ArrayList();
                            linkedHashMap2.put(education_story, obj7);
                        }
                        ((List) obj7).add(next2);
                        it3 = it4;
                        continuation3 = continuation4;
                    }
                    Continuation continuation5 = continuation3;
                    ArrayList arrayList4 = new ArrayList(linkedHashMap2.size());
                    for (Map.Entry entry : linkedHashMap2.entrySet()) {
                        Education_story education_story2 = (Education_story) entry.getKey();
                        List<SelectWithSceneData> list5 = (List) entry.getValue();
                        ArrayList arrayList5 = new ArrayList();
                        for (SelectWithSceneData selectWithSceneData2 : list5) {
                            Long l3 = selectWithSceneData2.id_;
                            if (l3 != null) {
                                long longValue = l3.longValue();
                                Long l4 = selectWithSceneData2.scene_index;
                                continuation = new Education_story_scene_data(longValue, l4 != null ? l4.longValue() : -1L, selectWithSceneData2.backgroundColor, education_story2.id);
                            } else {
                                continuation = continuation5;
                            }
                            if (continuation != null) {
                                arrayList5.add(continuation);
                            }
                        }
                        arrayList4.add(new EducationStoryEntity(education_story2, arrayList5));
                    }
                    ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList4, 10));
                    Iterator it5 = arrayList4.iterator();
                    while (it5.hasNext()) {
                        arrayList6.add(RealEducationStoryRepository.access$toDomainModel(realEducationStoryRepository, (EducationStoryEntity) it5.next()));
                    }
                    boolean isEmpty = arrayList6.isEmpty();
                    arrayList = arrayList6;
                    continuation2 = continuation5;
                    if (!isEmpty) {
                        GetStoriesResult.Success success = new GetStoriesResult.Success(arrayList6);
                        this.L$0 = flowCollector;
                        this.this$0 = arrayList6;
                        this.label = 1;
                        arrayList = arrayList6;
                        continuation2 = continuation5;
                        break;
                    }
                } else {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            if (i12 != 3) {
                                if (i12 != 4 && i12 != 5) {
                                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                    return null;
                                }
                                SafeTrace.throwOnFailure(obj);
                                return Unit.INSTANCE;
                            }
                            apiResult2 = (ApiResult) this.$serviceType;
                            list2 = (List) this.this$0;
                            SafeTrace.throwOnFailure(obj);
                            educationStoryService = educationStoryService2;
                            obj4 = null;
                            coroutineSingletons = coroutineSingletons11;
                            list = list2;
                            apiResult = apiResult2;
                            obj3 = obj4;
                            if (apiResult instanceof ApiResult.Failure) {
                                ApiResult.Failure failure = (ApiResult.Failure) apiResult;
                                boolean z2 = failure instanceof ApiResult.Failure.HttpFailure;
                                if (z2) {
                                    realEducationStoryRepository.errorReporter.report(new EducationStoryHttpError(educationStoryService.getClass().getSimpleName(), ((ApiResult.Failure.HttpFailure) failure).code), ErrorReporter.DefaultSamplingStrategy.INSTANCE);
                                }
                                if (list.isEmpty()) {
                                    if (!z2) {
                                        if (!(failure instanceof ApiResult.Failure.NetworkFailure)) {
                                            Drop$$ExternalSyntheticBUOutline0.m1m();
                                            return null;
                                        }
                                        GetStoriesResult.NetworkFailure networkFailure = new GetStoriesResult.NetworkFailure(((ApiResult.Failure.NetworkFailure) failure).error);
                                        this.L$0 = null;
                                        this.this$0 = null;
                                        this.$serviceType = apiResult;
                                        this.label = 5;
                                        break;
                                    } else {
                                        GetStoriesResult.HttpFailure httpFailure = new GetStoriesResult.HttpFailure(((ApiResult.Failure.HttpFailure) failure).code);
                                        Object obj8 = obj3;
                                        this.L$0 = obj8;
                                        this.this$0 = obj8;
                                        this.$serviceType = apiResult;
                                        this.label = 4;
                                        break;
                                    }
                                }
                            }
                            return Unit.INSTANCE;
                        }
                        list = (List) this.this$0;
                        SafeTrace.throwOnFailure(obj);
                        stories = obj;
                        r32 = 0;
                        apiResult = (ApiResult) stories;
                        if (apiResult instanceof ApiResult.Success) {
                            educationStoryService = educationStoryService2;
                            coroutineSingletons = coroutineSingletons11;
                            obj3 = r32;
                            if (apiResult instanceof ApiResult.Failure) {
                            }
                            return Unit.INSTANCE;
                        }
                        StoryListResponse storyListResponse = (StoryListResponse) ((ApiResult.Success) apiResult).response;
                        List list6 = storyListResponse.results;
                        CoroutineSingletons coroutineSingletons12 = coroutineSingletons11;
                        WandScene$ring$3 wandScene$ring$3 = new WandScene$ring$3(0, realEducationStoryRepository, RealEducationStoryRepository.class, "updateTtl", "updateTtl()V", 0, 20);
                        List list7 = list6;
                        ArrayList arrayList7 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list7, 10));
                        Iterator it6 = list7.iterator();
                        while (it6.hasNext()) {
                            Story story = (Story) it6.next();
                            String str3 = story.id;
                            String str4 = story.slug;
                            long epochMilli = story.publishedAt.toEpochMilli();
                            String str5 = story.title;
                            EducationStoryService educationStoryService3 = educationStoryService2;
                            String str6 = story.media.poster.landscape;
                            Integer primaryColor = realEducationStoryRepository.getPrimaryColor(story);
                            if (primaryColor != null) {
                                int intValue = primaryColor.intValue();
                                it = it6;
                                coroutineSingletons2 = coroutineSingletons12;
                                l = Long.valueOf(intValue);
                            } else {
                                it = it6;
                                coroutineSingletons2 = coroutineSingletons12;
                                l = r32;
                            }
                            Education_story education_story3 = new Education_story(str3, story.url, str4, str5, str6, l, epochMilli, story.priority);
                            List list8 = story.sceneData;
                            ArrayList arrayList8 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list8, 10));
                            Iterator it7 = list8.iterator();
                            int i13 = 0;
                            while (it7.hasNext()) {
                                Object next3 = it7.next();
                                int i14 = i13 + 1;
                                if (i13 < 0) {
                                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                                    throw r32;
                                }
                                FlowCollector flowCollector2 = flowCollector;
                                Iterator it8 = it7;
                                long j2 = i13;
                                String str7 = story.id;
                                SceneColor sceneColor = (SceneColor) CollectionsKt.firstOrNull(((SceneData) next3).color);
                                if ((sceneColor != null ? realEducationStoryRepository.toAndroidColor(sceneColor.background) : r32) != null) {
                                    j = j2;
                                    l2 = Long.valueOf(r13.intValue());
                                } else {
                                    j = j2;
                                    l2 = r32;
                                }
                                arrayList8.add(new Education_story_scene_data(0L, j, l2, str7));
                                i13 = i14;
                                flowCollector = flowCollector2;
                                it7 = it8;
                            }
                            arrayList7.add(new EducationStoryEntity(education_story3, arrayList8));
                            it6 = it;
                            educationStoryService2 = educationStoryService3;
                            coroutineSingletons12 = coroutineSingletons2;
                            flowCollector = flowCollector;
                        }
                        educationStoryService = educationStoryService2;
                        FlowCollector flowCollector3 = flowCollector;
                        CoroutineSingletons coroutineSingletons13 = coroutineSingletons12;
                        ((StoryQueries) result.text).transactionWithWrapper(new GpsConfigQueries$$ExternalSyntheticLambda3(4, result, arrayList7, wandScene$ring$3));
                        List<Story> list9 = storyListResponse.results;
                        ArrayList arrayList9 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list9, 10));
                        for (Story story2 : list9) {
                            String str8 = story2.url;
                            String str9 = story2.title;
                            Integer primaryColor2 = realEducationStoryRepository.getPrimaryColor(story2);
                            String str10 = story2.slug;
                            String str11 = story2.media.poster.landscape;
                            List list10 = story2.sceneData;
                            ArrayList arrayList10 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list10, 10));
                            Iterator it9 = list10.iterator();
                            while (it9.hasNext()) {
                                SceneColor sceneColor2 = (SceneColor) CollectionsKt.firstOrNull(((SceneData) it9.next()).color);
                                Integer androidColor = sceneColor2 != null ? realEducationStoryRepository.toAndroidColor(sceneColor2.background) : r32;
                                arrayList10.add(androidColor != null ? new SceneBackground.Color(androidColor.intValue()) : SceneBackground.None.INSTANCE);
                            }
                            arrayList9.add(new EducationStory(str8, str10, str9, str11, primaryColor2, arrayList10));
                        }
                        GetStoriesResult.Success success2 = new GetStoriesResult.Success(arrayList9);
                        flowCollector = flowCollector3;
                        this.L$0 = flowCollector;
                        this.this$0 = list;
                        this.$serviceType = apiResult;
                        this.label = 3;
                        coroutineSingletons = coroutineSingletons13;
                        if (flowCollector.emit(success2, this) != coroutineSingletons) {
                            apiResult2 = apiResult;
                            list2 = list;
                            obj4 = r32;
                            list = list2;
                            apiResult = apiResult2;
                            obj3 = obj4;
                            if (apiResult instanceof ApiResult.Failure) {
                            }
                            return Unit.INSTANCE;
                        }
                        return coroutineSingletons;
                    }
                    List list11 = (List) this.this$0;
                    SafeTrace.throwOnFailure(obj);
                    continuation2 = null;
                    arrayList = list11;
                }
                if (realEducationStoryRepository.clock.millis() >= ((Number) realEducationStoryRepository.expiryTime.getValue()).longValue() || arrayList.isEmpty()) {
                    String str12 = ((FeatureFlag$StringAmplitudeExperiment.Value) ((RealFeatureFlagManager) realEducationStoryRepository.featureFlagManager).peekCurrentValue(AmplitudeExperiments$BitcoinBasicsTagId.INSTANCE)).value;
                    this.L$0 = flowCollector;
                    this.this$0 = arrayList;
                    this.label = 2;
                    stories = educationStoryService2.getStories(str12, "priority", this);
                    if (stories != coroutineSingletons11) {
                        list = arrayList;
                        r32 = continuation2;
                        apiResult = (ApiResult) stories;
                        if (apiResult instanceof ApiResult.Success) {
                        }
                    }
                    coroutineSingletons = coroutineSingletons11;
                    return coroutineSingletons;
                }
                return Unit.INSTANCE;
            case 9:
                RealFxExchangeRateStreamingSubscriber realFxExchangeRateStreamingSubscriber = (RealFxExchangeRateStreamingSubscriber) this.this$0;
                ProducerScope producerScope2 = (ProducerScope) this.L$0;
                CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i15 = this.label;
                try {
                } catch (CancellationException e) {
                    throw e;
                } catch (Exception e2) {
                    Timber.Forest.w("Failed to stream FX exchange rate", new Object[0], e2);
                    long m1145nextDelayUwyO8pc = realFxExchangeRateStreamingSubscriber.exponentialBackoff.m1145nextDelayUwyO8pc();
                    this.L$0 = null;
                    this.label = 2;
                    break;
                }
                if (i15 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    StateFlow stateFlow = realFxExchangeRateStreamingSubscriber.requestMetadata;
                    RealBlockersHelper$skipBlocker$1 realBlockersHelper$skipBlocker$1 = new RealBlockersHelper$skipBlocker$1(realFxExchangeRateStreamingSubscriber, (CurrencyCode) this.$serviceType, (CurrencyCode) this.$activity, producerScope2, (Continuation) null, 22);
                    this.L$0 = null;
                    this.label = 1;
                    if (FlowKt.collectLatest(stateFlow, realBlockersHelper$skipBlocker$1, this) == coroutineSingletons14) {
                        return coroutineSingletons14;
                    }
                } else {
                    if (i15 != 1) {
                        if (i15 == 2) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                throw new IllegalStateException("SharedFlow never completes, this call should never return.");
            case 10:
                RealTargetEntityManager realTargetEntityManager = (RealTargetEntityManager) this.$serviceType;
                String str13 = (String) this.L$0;
                CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i16 = this.label;
                if (i16 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    GetSyncEntitiesByTargetRequest getSyncEntitiesByTargetRequest = new GetSyncEntitiesByTargetRequest(str13, CollectionsKt__CollectionsJVMKt.listOf(new TargetSpecifications(SyncTopic.SYNC_VALUES, (List) this.this$0)), new Integer(100), 24);
                    ClientSyncAppApiService clientSyncAppApiService = realTargetEntityManager.service;
                    this.label = 1;
                    syncEntitiesByTarget = clientSyncAppApiService.getSyncEntitiesByTarget("TODO", getSyncEntitiesByTargetRequest, this);
                    if (syncEntitiesByTarget == coroutineSingletons15) {
                        return coroutineSingletons15;
                    }
                } else {
                    if (i16 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    syncEntitiesByTarget = obj;
                }
                ApiResult apiResult4 = (ApiResult) syncEntitiesByTarget;
                MutableState mutableState3 = (MutableState) this.$activity;
                if (apiResult4 instanceof ApiResult.Failure) {
                    ApiResult.Failure failure2 = (ApiResult.Failure) apiResult4;
                    if (failure2 instanceof ApiResult.Failure.HttpFailure) {
                        Timber.Forest.e("Failed to fetch sync entities for account " + str13 + ". Http error: " + ((ApiResult.Failure.HttpFailure) apiResult4).code, new Object[0]);
                    } else {
                        if (!(failure2 instanceof ApiResult.Failure.NetworkFailure)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        Timber.Forest.e(Recorder$$ExternalSyntheticOutline2.m("Failed to fetch sync entities for account ", str13), new Object[0], ((ApiResult.Failure.NetworkFailure) apiResult4).error);
                    }
                    List list12 = (List) ((Map) realTargetEntityManager.cachedSyncValues.getValue()).get(str13);
                    ready = list12 != null ? new TargetEntityManager$TargetEntityValue.Ready(list12, null, null, 6) : null;
                    if (ready == null) {
                        ready = TargetEntityManager$TargetEntityValue.Failed.INSTANCE;
                    }
                } else {
                    if (!(apiResult4 instanceof ApiResult.Success)) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    List list13 = ((GetSyncEntitiesByTargetResponse) ((ApiResult.Success) apiResult4).response).target_entities;
                    ArrayList arrayList11 = new ArrayList();
                    Iterator it10 = list13.iterator();
                    while (it10.hasNext()) {
                        CollectionsKt__MutableCollectionsKt.addAll(((TargetEntities) it10.next()).entities, arrayList11);
                    }
                    ArrayList arrayList12 = new ArrayList();
                    Iterator it11 = arrayList11.iterator();
                    while (it11.hasNext()) {
                        SyncValue syncValue = ((SyncEntity) it11.next()).sync_value;
                        if (syncValue != null) {
                            arrayList12.add(syncValue);
                        }
                    }
                    StateFlowImpl stateFlowImpl = realTargetEntityManager.cachedSyncValues;
                    do {
                        value = stateFlowImpl.getValue();
                    } while (!stateFlowImpl.compareAndSet(value, MapsKt__MapsKt.plus((Map) value, new Pair(str13, arrayList12))));
                    ready = new TargetEntityManager$TargetEntityValue.Ready(arrayList12, null, null, 6);
                }
                mutableState3.setValue(ready);
                return Unit.INSTANCE;
            case 11:
                CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i17 = this.label;
                if (i17 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    BaseDependentControlPresenter baseDependentControlPresenter = (BaseDependentControlPresenter) this.L$0;
                    DependentControlViewEvent dependentControlViewEvent = (DependentControlViewEvent) this.this$0;
                    String str14 = (String) ((State) this.$serviceType).getValue();
                    DependentControlStatus dependentControlStatus = (DependentControlStatus) ((State) this.$activity).getValue();
                    this.label = 1;
                    if (baseDependentControlPresenter.handleControlSpecificEvent(dependentControlViewEvent, str14, dependentControlStatus, this) == coroutineSingletons16) {
                        return coroutineSingletons16;
                    }
                } else {
                    if (i17 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 12:
                CoroutineScope coroutineScope4 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i18 = this.label;
                if (i18 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow5 = (Flow) this.this$0;
                    AnimationsKt$takeUntil$1$1.AnonymousClass1.C00601 c006013 = new AnimationsKt$takeUntil$1$1.AnonymousClass1.C00601(coroutineScope4, (RealBitcoinAmountPickerPresenter) this.$serviceType, (MutableState) this.$activity, i3);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow5.collect(c006013, this) == coroutineSingletons17) {
                        return coroutineSingletons17;
                    }
                } else {
                    if (i18 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 13:
                CoroutineScope coroutineScope5 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i19 = this.label;
                if (i19 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow6 = (Flow) this.this$0;
                    AnimationsKt$takeUntil$1$1.AnonymousClass1.C00601 c006014 = new AnimationsKt$takeUntil$1$1.AnonymousClass1.C00601(coroutineScope5, (CardStudioPresenter) this.$serviceType, (MutableStateFlow) this.$activity, 11);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow6.collect(c006014, this) == coroutineSingletons18) {
                        return coroutineSingletons18;
                    }
                } else {
                    if (i19 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 14:
                String str15 = (String) this.L$0;
                RealPendingRequestActivityManager realPendingRequestActivityManager = (RealPendingRequestActivityManager) this.this$0;
                PendingRequestActivityState.Failed failed = PendingRequestActivityState.Failed.INSTANCE;
                MutableState mutableState4 = (MutableState) this.$activity;
                CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i20 = this.label;
                try {
                } catch (Exception unused) {
                    mutableState4.setValue(failed);
                }
                if (i20 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (str15 == null) {
                        mutableState4.setValue(failed);
                        return Unit.INSTANCE;
                    }
                    if (!(((PendingRequestActivityState) mutableState4.getValue()) instanceof PendingRequestActivityState.Loading)) {
                        return Unit.INSTANCE;
                    }
                    this.label = 1;
                    access$fetchActivity = RealPendingRequestActivityManager.access$fetchActivity(realPendingRequestActivityManager, str15, this);
                    if (access$fetchActivity == coroutineSingletons19) {
                        return coroutineSingletons19;
                    }
                } else {
                    if (i20 != 1) {
                        if (i20 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        access$formatActivityData = obj;
                        FormattedPaymentHistoryActivityItem formattedPaymentHistoryActivityItem = (FormattedPaymentHistoryActivityItem) access$formatActivityData;
                        if (formattedPaymentHistoryActivityItem != null) {
                            mutableState4.setValue(new PendingRequestActivityState.Loaded(formattedPaymentHistoryActivityItem, (String) this.$serviceType));
                        } else {
                            mutableState4.setValue(failed);
                        }
                        return Unit.INSTANCE;
                    }
                    SafeTrace.throwOnFailure(obj);
                    access$fetchActivity = obj;
                }
                ActivityGetResponse activityGetResponse = (ActivityGetResponse) access$fetchActivity;
                PaymentHistoryActivityData access$convertToPaymentHistoryActivityData = activityGetResponse != null ? RealPendingRequestActivityManager.access$convertToPaymentHistoryActivityData(realPendingRequestActivityManager, activityGetResponse) : null;
                if (access$convertToPaymentHistoryActivityData == null) {
                    mutableState4.setValue(failed);
                    return Unit.INSTANCE;
                }
                this.label = 2;
                access$formatActivityData = RealPendingRequestActivityManager.access$formatActivityData(realPendingRequestActivityManager, access$convertToPaymentHistoryActivityData, this);
                break;
            case 15:
                CoroutineScope coroutineScope6 = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i21 = this.label;
                if (i21 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    Flow flow7 = (Flow) this.this$0;
                    AnimationsKt$takeUntil$1$1.AnonymousClass1.C00601 c006015 = new AnimationsKt$takeUntil$1$1.AnonymousClass1.C00601(coroutineScope6, (ProfilePresenter) this.$serviceType, (State) this.$activity, 12);
                    this.L$0 = null;
                    this.label = 1;
                    if (flow7.collect(c006015, this) == coroutineSingletons20) {
                        return coroutineSingletons20;
                    }
                } else {
                    if (i21 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                return Unit.INSTANCE;
            case 16:
                CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i22 = this.label;
                if (i22 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    DisabledClickableNode disabledClickableNode2 = (DisabledClickableNode) this.$serviceType;
                    PressInteraction.Press press2 = new PressInteraction.Press(((PointerInputChange) this.$activity).position);
                    MutableInteractionSourceImpl mutableInteractionSourceImpl = disabledClickableNode2.interactionSource;
                    this.L$0 = press2;
                    this.this$0 = disabledClickableNode2;
                    this.label = 1;
                    if (mutableInteractionSourceImpl.emit(press2, this) == coroutineSingletons21) {
                        return coroutineSingletons21;
                    }
                    disabledClickableNode = disabledClickableNode2;
                    press = press2;
                } else {
                    if (i22 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    disabledClickableNode = (DisabledClickableNode) this.this$0;
                    press = (PressInteraction.Press) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                disabledClickableNode.pressInteraction = press;
                return Unit.INSTANCE;
            case 17:
                return invokeSuspend$com$squareup$cash$family$requestsponsorship$presenters$SelectContactMethodPresenter$models$$inlined$CollectEffect$1(obj);
            case 18:
                return invokeSuspend$com$squareup$cash$family$requestsponsorship$presenters$SponsorSelectionDetailsPresenter$models$$inlined$CollectEffect$1(obj);
            case 19:
                return invokeSuspend$com$squareup$cash$family$safetyhub$presenters$SafetyHubPresenter$models$$inlined$CollectEffect$1(obj);
            case 20:
                return invokeSuspend$com$squareup$cash$fidesmo$presenters$FidesmoDeprovisioningPresenter$models$11$1(obj);
            case 21:
                return invokeSuspend$com$squareup$cash$fidesmo$presenters$FidesmoProvisioningPresenter$models$10$1(obj);
            case 22:
                return invokeSuspend$com$squareup$cash$formview$components$arcade$ArcadeFormMoneyInput$Content$1$1$1(obj);
            case 23:
                return invokeSuspend$com$squareup$cash$formview$components$arcade$ArcadeFormTextInputGroupView$Content$4$1(obj);
            case 24:
                return invokeSuspend$com$squareup$cash$formview$presenters$FormCashtagPresenter$models$$inlined$CollectEffect$1(obj);
            case 25:
                return invokeSuspend$com$squareup$cash$formview$presenters$FormPresenter$models$$inlined$CollectEffect$1(obj);
            case 26:
                return invokeSuspend$com$squareup$cash$genericelements$presenters$RealGenericTreeElementsPresenter$model$$inlined$CollectEffect$1(obj);
            case 27:
                return invokeSuspend$com$squareup$cash$graphics$backend$gl$GLSceneScope$produceTexture$1$1(obj);
            case 28:
                return invokeSuspend$com$squareup$cash$graphics$backend$gl$GLSceneScope$rememberMaterial$1$1(obj);
            default:
                GLSceneScope gLSceneScope = (GLSceneScope) this.$serviceType;
                ProduceStateScope produceStateScope = (ProduceStateScope) this.L$0;
                CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i23 = this.label;
                if (i23 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SwipeableState$special$$inlined$filter$1 swipeableState$special$$inlined$filter$1 = new SwipeableState$special$$inlined$filter$1(Updater.snapshotFlow(new GLSceneScope$$ExternalSyntheticLambda1(gLSceneScope, 8)), i3);
                    this.L$0 = produceStateScope;
                    this.label = 1;
                    break;
                } else {
                    if (i23 != 1) {
                        if (i23 != 2) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        produceStateScope = (ProduceStateScope) this.this$0;
                        SafeTrace.throwOnFailure(obj);
                        withContext4 = obj;
                        produceStateScope.setValue(withContext4);
                        return Unit.INSTANCE;
                    }
                    SafeTrace.throwOnFailure(obj);
                }
                CoroutineScope coroutineScope7 = gLSceneScope.glScope;
                if (coroutineScope7 == null) {
                    Intrinsics.throwUninitializedPropertyAccessException("glScope");
                    throw null;
                }
                CoroutineContext coroutineContext = coroutineScope7.getCoroutineContext();
                RealProfileManager$profileOrNull$2 realProfileManager$profileOrNull$2 = new RealProfileManager$profileOrNull$2((PBRMaterial) this.$activity, continuation3, 19);
                this.L$0 = null;
                this.this$0 = produceStateScope;
                this.label = 2;
                withContext4 = JobKt.withContext(coroutineContext, realProfileManager$profileOrNull$2, this);
                break;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RealFidesmoClient$observeDeviceState$1(RealEducationStoryRepository realEducationStoryRepository, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 8;
        this.$activity = realEducationStoryRepository;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealFidesmoClient$observeDeviceState$1(Object obj, Object obj2, Object obj3, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = obj;
        this.$serviceType = obj2;
        this.$activity = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealFidesmoClient$observeDeviceState$1(Object obj, Object obj2, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$serviceType = obj;
        this.$activity = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ RealFidesmoClient$observeDeviceState$1(Flow flow, Continuation continuation, Object obj, Object obj2, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = flow;
        this.$serviceType = obj;
        this.$activity = obj2;
    }
}
