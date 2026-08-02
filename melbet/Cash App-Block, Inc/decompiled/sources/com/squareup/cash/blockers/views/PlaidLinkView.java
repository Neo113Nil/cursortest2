package com.squareup.cash.blockers.views;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.PointF;
import android.net.Uri;
import android.opengl.GLES20;
import android.opengl.GLUtils;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.MotionEvent;
import android.widget.FrameLayout;
import androidx.compose.animation.core.Animatable;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.PausedCompositionImpl;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.node.PointerInputModifierNodeKt;
import androidx.glance.session.SessionWorkerKt$runSession$snapshotMonitor$1;
import androidx.navigation.compose.NavHostKt$$ExternalSyntheticLambda8;
import androidx.paging.PageFetcher$flow$1;
import androidx.paging.PagingDataPresenter$collectFrom$2;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.api.ApiResult;
import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.badging.backend.RealBadger2$setup$lambda$0$$inlined$mapNotNull$1;
import app.cash.broadway.screen.Screen;
import app.cash.broadway.ui.Ui;
import app.cash.passcode.backend.AppLockMonitor$special$$inlined$map$2;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.braze.Braze;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.account.backend.AccountSwitcher$AccountSwitchingMetadata;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.flowlistener.BlockerFlowListener;
import com.squareup.cash.blockers.presenters.VerifyAliasPresenter;
import com.squareup.cash.blockers.presenters.VerifyContactsPresenter;
import com.squareup.cash.blockers.presenters.VerifyContactsPresenter$models$2$3$1;
import com.squareup.cash.blockers.presenters.onboarding.WelcomePresenter;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.blockers.viewmodels.PlaidLinkViewEvent;
import com.squareup.cash.blockers.viewmodels.PlaidLinkViewModel;
import com.squareup.cash.blockers.viewmodels.StripeLinkViewEvent;
import com.squareup.cash.blockers.viewmodels.VerifyAliasViewEvent;
import com.squareup.cash.blockers.views.StripeLinkView;
import com.squareup.cash.blockers.web.delegates.WebBlockerWebViewClient;
import com.squareup.cash.blockers.web.viewmodels.WebBlockerBridgeEvent;
import com.squareup.cash.braze.BrazeSetupTeardownActivityWorker;
import com.squareup.cash.braze.RealBrazeManager;
import com.squareup.cash.bugreporting.viewmodels.BugReportingViewEvent;
import com.squareup.cash.bugreporting.viewmodels.BugReportingViewModel;
import com.squareup.cash.card.onboarding.CanvasKt;
import com.squareup.cash.card.onboarding.CardContouredText;
import com.squareup.cash.card.onboarding.CardModelView;
import com.squareup.cash.card.onboarding.CardPreviewPresenter;
import com.squareup.cash.card.onboarding.CardPreviewPresenter$cardStudio$1;
import com.squareup.cash.card.onboarding.CardPreviewPresenter$cashtag$$inlined$map$1;
import com.squareup.cash.card.onboarding.CardPreviewPresenter$initialModel$3;
import com.squareup.cash.card.onboarding.CardPreviewPresenter$stamps$$inlined$map$1$2;
import com.squareup.cash.card.onboarding.CardStudioView;
import com.squareup.cash.card.onboarding.CardStylePickerPresenter;
import com.squareup.cash.card.onboarding.CardsKt;
import com.squareup.cash.card.onboarding.DisclosurePresenter;
import com.squareup.cash.card.onboarding.DisclosureViewModel;
import com.squareup.cash.card.onboarding.EquatableBitmap;
import com.squareup.cash.card.onboarding.InteractiveCardView$flingTo$1;
import com.squareup.cash.card.onboarding.PaymentDeviceCustomizationViewKt;
import com.squareup.cash.card.onboarding.PdpPanelState;
import com.squareup.cash.card.onboarding.ProductDetailsPageViewModel;
import com.squareup.cash.card.onboarding.StampSheetViewModel;
import com.squareup.cash.card.onboarding.TagOrderConfirmationPresenter;
import com.squareup.cash.card.onboarding.core.CardScene;
import com.squareup.cash.card.onboarding.core.CardSceneEffectKt$CardSceneEffect$6$1$2;
import com.squareup.cash.card.onboarding.core.ContouredTextMaterial;
import com.squareup.cash.card.onboarding.core.HeatMaskRenderer;
import com.squareup.cash.card.onboarding.core.SceneUpdate;
import com.squareup.cash.card.onboarding.graphics.CardGridNuxKt$CardGridNux$6$3$1$3;
import com.squareup.cash.card.onboarding.graphics.CardWobbleState;
import com.squareup.cash.card.onboarding.graphics.ContouredTextRing;
import com.squareup.cash.card.onboarding.graphics.scene.CardGridNuxScene;
import com.squareup.cash.card.onboarding.screens.CardPreviewScreen;
import com.squareup.cash.card.onboarding.screens.CardStyleScreen;
import com.squareup.cash.card.onboarding.screens.DisclosureScreen;
import com.squareup.cash.card.onboarding.screens.PatternSignatureStamps;
import com.squareup.cash.card.onboarding.screens.PatternSignatureStampsV2;
import com.squareup.cash.cdf.cashcard.CashCardCustomizePreviewStyle;
import com.squareup.cash.cdf.cashcard.CashCardCustomizeScrollToTheme;
import com.squareup.cash.cdf.instrument.InstrumentLinkAuthenticateInstitution;
import com.squareup.cash.common.messaging.screens.FailureMessageBlockerScreen;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.BlockersHelper;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.db.RealAppConfigManager;
import com.squareup.cash.data.transfers.RealTransferManager$addCash$$inlined$map$1;
import com.squareup.cash.db2.StampsConfig;
import com.squareup.cash.filepicker.FilePickerResult;
import com.squareup.cash.filepicker.RealFilePicker;
import com.squareup.cash.graphics.backend.math.Quat;
import com.squareup.cash.graphics.backend.math.Vector4;
import com.squareup.cash.graphics.swampgl.components.shaders.DecayShaderProgram;
import com.squareup.cash.graphics.swampgl.components.shaders.HeatShaderProgram;
import com.squareup.cash.graphics.swampgl.components.shaders.MaxAlphaShaderProgram;
import com.squareup.cash.initialscreenloader.backend.ColdStartIntegrityChecker$ColdStartIntegrityCheckResult;
import com.squareup.cash.initialscreenloader.backend.ColdStartIntegrityChecker$TriggeredBy;
import com.squareup.cash.initialscreenloader.backend.RealColdStartIntegrityChecker;
import com.squareup.cash.initialscreenloader.backend.RealColdStartIntegrityChecker$checkIntegrityWithRetry$2;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.integration.contacts.RealContactBook$getAliases$$inlined$map$1;
import com.squareup.cash.mooncake.components.LoadingHelper$Position;
import com.squareup.cash.mooncake.components.SplitButtons$$ExternalSyntheticLambda0;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.music.presenters.MusicPresenter;
import com.squareup.cash.music.presenters.MusicPresenter$models$2$1;
import com.squareup.cash.onboarding.backend.OnboardingIntegrityChecker$OnboardingIntegrityCheckResult;
import com.squareup.cash.onboarding.backend.OnboardingIntegrityChecker$TriggeredBy;
import com.squareup.cash.onboarding.backend.RealOnboardingFlowTokenManager;
import com.squareup.cash.onboarding.backend.RealOnboardingIntegrityChecker;
import com.squareup.cash.onboarding.util.AliasVerifier$Result;
import com.squareup.cash.plaid.api.PlaidLinkResult;
import com.squareup.cash.plaid.real.RealPlaidLinkActivityLauncher;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.screens.Redacted;
import com.squareup.cash.sheet.RealSheetState;
import com.squareup.cash.stripe.api.StripeLinkResult;
import com.squareup.cash.stripe.api.StripeLinkResult$Failure$InitializationError;
import com.squareup.cash.stripe.api.StripeLinkResult$Failure$Unknown;
import com.squareup.cash.stripe.real.RealStripeLinkActivityLauncher;
import com.squareup.cash.tabs.views.ToolbarTuckTargets;
import com.squareup.cash.ui.DialogResultListener;
import com.squareup.cash.ui.PaymentPasscodeActivity$loadView$3$1;
import com.squareup.cash.wallet.views.CardLockViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.wallet.views.Hero3DCardViewKt$InteractiveCard$12$1$4$1$2;
import com.squareup.protos.franklin.api.BlockerAction;
import com.squareup.protos.franklin.api.CardPresentationStyle;
import com.squareup.protos.franklin.app.ConfirmDisclosureRequest;
import com.squareup.protos.franklin.app.ConfirmDisclosureResponse;
import com.squareup.protos.franklin.common.ResponseContext;
import com.squareup.protos.franklin.common.Stamp;
import com.squareup.util.android.coroutines.ViewKt;
import com.squareup.util.coroutines.StateFlowKt;
import com.stripe.android.view.PaymentAuthWebChromeClient;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import kotlinx.coroutines.StandaloneCoroutine;
import kotlinx.coroutines.channels.BufferedChannel;
import kotlinx.coroutines.flow.Flow;
import kotlinx.coroutines.flow.FlowKt;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapConcat$$inlined$map$1;
import kotlinx.coroutines.flow.FlowKt__MergeKt$flatMapMerge$$inlined$map$1;
import kotlinx.coroutines.flow.MutableSharedFlow;
import kotlinx.coroutines.flow.SafeFlow;
import kotlinx.coroutines.flow.SharedFlowImpl;
import okio.ByteString;
import papa.SafeTrace;
import timber.log.Timber;

/* loaded from: classes4.dex */
public final class PlaidLinkView extends FrameLayout implements Ui, DialogResultListener {
    public Ui.EventReceiver eventReceiver;
    public boolean hasLaunched;
    public final RealPlaidLinkActivityLauncher launcher;

    public final class State implements Parcelable {
        public static final Parcelable.Creator<State> CREATOR = new Creator(0);
        public final boolean hasLaunched;
        public final Parcelable superState;

        public final class Creator implements Parcelable.Creator {
            public final /* synthetic */ int $r8$classId;

            public /* synthetic */ Creator(int i) {
                this.$r8$classId = i;
            }

            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                switch (this.$r8$classId) {
                    case 0:
                        parcel.getClass();
                        return new State(parcel.readParcelable(State.class.getClassLoader()), parcel.readInt() != 0);
                    default:
                        parcel.getClass();
                        return new StripeLinkView.State(parcel.readParcelable(StripeLinkView.State.class.getClassLoader()), parcel.readInt() != 0);
                }
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                switch (this.$r8$classId) {
                    case 0:
                        return new State[i];
                    default:
                        return new StripeLinkView.State[i];
                }
            }
        }

        public State(Parcelable parcelable, boolean z) {
            this.superState = parcelable;
            this.hasLaunched = z;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof State)) {
                return false;
            }
            State state = (State) obj;
            return Intrinsics.areEqual(this.superState, state.superState) && this.hasLaunched == state.hasLaunched;
        }

        public final int hashCode() {
            Parcelable parcelable = this.superState;
            return Boolean.hashCode(this.hasLaunched) + ((parcelable == null ? 0 : parcelable.hashCode()) * 31);
        }

        public final String toString() {
            return "State(superState=" + this.superState + ", hasLaunched=" + this.hasLaunched + ")";
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeParcelable(this.superState, i);
            parcel.writeInt(this.hasLaunched ? 1 : 0);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PlaidLinkView(Context context, RealPlaidLinkActivityLauncher realPlaidLinkActivityLauncher) {
        super(context);
        context.getClass();
        this.launcher = realPlaidLinkActivityLauncher;
        setId(R.id.blocker_plaid_link);
        setBackgroundColor(ThemeHelpersKt.themeInfo(this).colorPalette.background);
        new PausedCompositionImpl(this, null, new ToolbarTuckTargets(LoadingHelper$Position.Center, new SplitButtons$$ExternalSyntheticLambda0(2)), null, 54).setLoading(true);
        ViewKt.whileAttachedOnce$default(this, new AnonymousClass2(this, (Continuation) null, 0));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.hasLaunched) {
            return;
        }
        Ui.EventReceiver eventReceiver = this.eventReceiver;
        if (eventReceiver != null) {
            eventReceiver.sendEvent(PlaidLinkViewEvent.WaitingForParams.INSTANCE);
        } else {
            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
            throw null;
        }
    }

    @Override // com.squareup.cash.ui.DialogResultListener
    public final void onDialogCanceled(Screen screen) {
        screen.getClass();
    }

    @Override // com.squareup.cash.ui.DialogResultListener
    public final void onDialogResult(Screen screen, Object obj) {
        screen.getClass();
        if (screen instanceof FailureMessageBlockerScreen) {
            Ui.EventReceiver eventReceiver = this.eventReceiver;
            if (eventReceiver != null) {
                eventReceiver.sendEvent(PlaidLinkViewEvent.Dismiss.INSTANCE);
            } else {
                Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                throw null;
            }
        }
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        parcelable.getClass();
        if (!(parcelable instanceof State)) {
            a$$ExternalSyntheticBUOutline0.m$3("Failed requirement.");
            return;
        }
        State state = (State) parcelable;
        this.hasLaunched = state.hasLaunched;
        super.onRestoreInstanceState(state.superState);
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        return new State(super.onSaveInstanceState(), this.hasLaunched);
    }

    @Override // app.cash.broadway.ui.Ui
    public void setEventReceiver(Ui.EventReceiver eventReceiver) {
        eventReceiver.getClass();
        this.eventReceiver = eventReceiver;
    }

    @Override // app.cash.broadway.ui.Ui
    public void setModel(PlaidLinkViewModel plaidLinkViewModel) {
        plaidLinkViewModel.getClass();
        if (plaidLinkViewModel.equals(PlaidLinkViewModel.Loading.INSTANCE)) {
            return;
        }
        if (!(plaidLinkViewModel instanceof PlaidLinkViewModel.Ready)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return;
        }
        this.launcher.tryLaunch(((PlaidLinkViewModel.Ready) plaidLinkViewModel).params);
        this.hasLaunched = true;
    }

    /* renamed from: com.squareup.cash.blockers.views.PlaidLinkView$2, reason: invalid class name */
    public final class AnonymousClass2 extends SuspendLambda implements Function2 {
        public final /* synthetic */ int $r8$classId;
        public Object L$0;
        public int label;
        public final /* synthetic */ Object this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(CardStylePickerPresenter cardStylePickerPresenter, int i, String str, Continuation continuation) {
            super(2, continuation);
            this.$r8$classId = 18;
            this.L$0 = cardStylePickerPresenter;
            this.label = i;
            this.this$0 = str;
        }

        /* JADX WARN: Code restructure failed: missing block: B:99:0x0320, code lost:
        
            if (r4 == false) goto L139;
         */
        /* JADX WARN: Removed duplicated region for block: B:60:0x03a7  */
        /* JADX WARN: Removed duplicated region for block: B:62:0x03b0  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x03c0  */
        /* JADX WARN: Removed duplicated region for block: B:67:0x03c9  */
        /* JADX WARN: Removed duplicated region for block: B:68:0x03bb  */
        /* JADX WARN: Removed duplicated region for block: B:69:0x03ab  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:146:0x03e7 -> B:5:0x03ea). Please report as a decompilation issue!!! */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        private final Object invokeSuspend$com$squareup$cash$card$onboarding$core$HeatMaskRenderer$startRenderLoop$1(Object obj) {
            boolean isEmpty;
            int[] iArr;
            int[] iArr2;
            int[] iArr3;
            int[] iArr4;
            int[] iArr5;
            int[] iArr6;
            int[] iArr7;
            boolean glIsEnabled;
            boolean glIsEnabled2;
            boolean glIsEnabled3;
            int[] iArr8;
            char c;
            int i;
            int i2;
            CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i3 = this.label;
            int i4 = 1;
            if (i3 == 0) {
                SafeTrace.throwOnFailure(obj);
                if (((HeatMaskRenderer) this.this$0).renderLoopActive) {
                }
                return Unit.INSTANCE;
            }
            if (i3 != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
            int i5 = 1;
            i4 = i5;
            if (((HeatMaskRenderer) this.this$0).renderLoopActive || !JobKt.isActive(coroutineScope)) {
                return Unit.INSTANCE;
            }
            if (((Boolean) ((HeatMaskRenderer) this.this$0).shouldRender.invoke()).booleanValue()) {
                HeatMaskRenderer heatMaskRenderer = (HeatMaskRenderer) this.this$0;
                synchronized (heatMaskRenderer.pendingHeatPoints) {
                    isEmpty = heatMaskRenderer.pendingHeatPoints.isEmpty();
                }
                boolean z = heatMaskRenderer.hasHeat;
                if (!z && isEmpty) {
                    heatMaskRenderer.framesSinceLastHeat += i4;
                } else if (z && isEmpty && heatMaskRenderer.framesSinceLastHeat == 0 && heatMaskRenderer.framesSinceLastDecay == 0) {
                    heatMaskRenderer.framesSinceLastHeat = i4;
                } else {
                    try {
                        heatMaskRenderer.pointsToRender.clear();
                        synchronized (heatMaskRenderer.pendingHeatPoints) {
                            heatMaskRenderer.pointsToRender.addAll(heatMaskRenderer.pendingHeatPoints);
                            heatMaskRenderer.pendingHeatPoints.clear();
                        }
                        GLES20.glBindFramebuffer(36160, heatMaskRenderer.currentWriteFbo);
                        GLES20.glFramebufferTexture2D(36160, 36064, 3553, heatMaskRenderer.currentWriteTexture, 0);
                        GLES20.glViewport(0, 0, 380, 512);
                        GLES20.glDisable(2929);
                        GLES20.glActiveTexture(34001);
                        int i6 = heatMaskRenderer.framesSinceLastDecay;
                        boolean z2 = i6 >= heatMaskRenderer.decayEveryNFrames;
                        boolean z3 = heatMaskRenderer.hasHeat;
                        if (z3 && z2) {
                            try {
                                heatMaskRenderer.framesSinceLastDecay = 0;
                                GLES20.glUseProgram(heatMaskRenderer.decayShader.flags);
                                GLES20.glBindTexture(3553, heatMaskRenderer.currentReadTexture);
                                DecayShaderProgram decayShaderProgram = heatMaskRenderer.decayShader;
                                float f = heatMaskRenderer.decayAmountPerFrame * heatMaskRenderer.decayEveryNFrames;
                                GLES20.glUniform1i(decayShaderProgram.textureLoc, 17);
                                GLES20.glUniform1f(decayShaderProgram.decayFactorLoc, f);
                                GLES20.glDisable(3042);
                                heatMaskRenderer.drawFullScreenQuad();
                            } catch (Throwable th) {
                                th = th;
                                iArr8 = iArr;
                                c = 0;
                                GLES20.glBindFramebuffer(36160, iArr2[c]);
                                GLES20.glViewport(iArr8[c], iArr8[1], iArr8[2], iArr8[3]);
                                GLES20.glActiveTexture(iArr5[c]);
                                GLES20.glUseProgram(iArr6[c]);
                                if (glIsEnabled) {
                                }
                                if (glIsEnabled2) {
                                }
                                if (glIsEnabled3) {
                                }
                                throw th;
                            }
                        } else if (z3 && !z2) {
                            heatMaskRenderer.framesSinceLastDecay = i6 + 1;
                            GLES20.glUseProgram(heatMaskRenderer.decayShader.flags);
                            GLES20.glBindTexture(3553, heatMaskRenderer.currentReadTexture);
                            DecayShaderProgram decayShaderProgram2 = heatMaskRenderer.decayShader;
                            GLES20.glUniform1i(decayShaderProgram2.textureLoc, 17);
                            GLES20.glUniform1f(decayShaderProgram2.decayFactorLoc, RecyclerView.DECELERATION_RATE);
                            GLES20.glDisable(3042);
                            heatMaskRenderer.drawFullScreenQuad();
                        } else if (heatMaskRenderer.pointsToRender.isEmpty()) {
                            GLES20.glClearColor(RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE);
                            GLES20.glClear(16384);
                        }
                        if (!heatMaskRenderer.pointsToRender.isEmpty()) {
                            GLES20.glEnable(3042);
                            GLES20.glBlendFunc(770, 1);
                            GLES20.glUseProgram(heatMaskRenderer.heatShader.flags);
                            Iterator it = heatMaskRenderer.pointsToRender.iterator();
                            while (it.hasNext()) {
                                HeatMaskRenderer.HeatPoint heatPoint = (HeatMaskRenderer.HeatPoint) it.next();
                                HeatShaderProgram heatShaderProgram = heatMaskRenderer.heatShader;
                                float f2 = heatPoint.u;
                                float f3 = heatPoint.v;
                                Iterator it2 = it;
                                float f4 = heatMaskRenderer.heatRadius;
                                float f5 = heatPoint.intensity;
                                iArr8 = iArr;
                                try {
                                    GLES20.glUniform2f(heatShaderProgram.centerLoc, f2, f3);
                                    GLES20.glUniform1f(heatShaderProgram.radiusLoc, f4);
                                    GLES20.glUniform1f(heatShaderProgram.intensityLoc, f5);
                                    heatMaskRenderer.drawFullScreenQuad();
                                    it = it2;
                                    iArr = iArr8;
                                } catch (Throwable th2) {
                                    th = th2;
                                    c = 0;
                                    GLES20.glBindFramebuffer(36160, iArr2[c]);
                                    GLES20.glViewport(iArr8[c], iArr8[1], iArr8[2], iArr8[3]);
                                    GLES20.glActiveTexture(iArr5[c]);
                                    GLES20.glUseProgram(iArr6[c]);
                                    if (glIsEnabled) {
                                        GLES20.glDisable(2929);
                                    } else {
                                        GLES20.glEnable(2929);
                                    }
                                    if (glIsEnabled2) {
                                        GLES20.glDisable(3042);
                                    } else {
                                        GLES20.glEnable(3042);
                                        GLES20.glBlendFunc(iArr3[c], iArr4[c]);
                                    }
                                    if (glIsEnabled3) {
                                        GLES20.glDisable(2884);
                                    } else {
                                        GLES20.glEnable(2884);
                                        GLES20.glCullFace(iArr7[c]);
                                    }
                                    throw th;
                                }
                            }
                        }
                        int[] iArr9 = iArr;
                        GLES20.glFramebufferTexture2D(36160, 36064, 3553, 0, 0);
                        GLES20.glBindFramebuffer(36160, iArr2[0]);
                        GLES20.glViewport(iArr9[0], iArr9[1], iArr9[2], iArr9[3]);
                        GLES20.glActiveTexture(iArr5[0]);
                        GLES20.glUseProgram(iArr6[0]);
                        if (glIsEnabled) {
                            GLES20.glEnable(2929);
                        } else {
                            GLES20.glDisable(2929);
                        }
                        if (glIsEnabled2) {
                            GLES20.glEnable(3042);
                            GLES20.glBlendFunc(iArr3[0], iArr4[0]);
                        } else {
                            GLES20.glDisable(3042);
                        }
                        if (glIsEnabled3) {
                            GLES20.glEnable(2884);
                            GLES20.glCullFace(iArr7[0]);
                        } else {
                            GLES20.glDisable(2884);
                        }
                        heatMaskRenderer.swapTextures();
                        GLES20.glFlush();
                        if (heatMaskRenderer.pointsToRender.isEmpty()) {
                            i2 = 1;
                            heatMaskRenderer.framesSinceLastHeat++;
                            i = 0;
                        } else {
                            i = 0;
                            i2 = 1;
                            heatMaskRenderer.framesSinceLastHeat = 0;
                            heatMaskRenderer.hasHeat = true;
                        }
                        int i7 = heatMaskRenderer.framesSinceLastHeat;
                        heatMaskRenderer.config.getClass();
                        if (i7 >= 200) {
                            heatMaskRenderer.framesSinceLastHeat = i;
                            ByteBuffer byteBuffer = heatMaskRenderer.checkPixelBuffer;
                            MaxAlphaShaderProgram maxAlphaShaderProgram = heatMaskRenderer.maxShader;
                            int[] iArr10 = new int[4];
                            int[] iArr11 = new int[i2];
                            int[] iArr12 = new int[i2];
                            int[] iArr13 = new int[i2];
                            int[] iArr14 = new int[i2];
                            int[] iArr15 = new int[i2];
                            int[] iArr16 = new int[i2];
                            GLES20.glGetIntegerv(2978, iArr10, i);
                            GLES20.glGetIntegerv(36006, iArr11, i);
                            GLES20.glGetIntegerv(34016, iArr14, i);
                            GLES20.glGetIntegerv(35725, iArr15, i);
                            GLES20.glGetIntegerv(2885, iArr16, i);
                            boolean glIsEnabled4 = GLES20.glIsEnabled(2929);
                            boolean glIsEnabled5 = GLES20.glIsEnabled(3042);
                            boolean glIsEnabled6 = GLES20.glIsEnabled(2884);
                            GLES20.glGetIntegerv(32969, iArr12, i);
                            GLES20.glGetIntegerv(32968, iArr13, i);
                            try {
                                GLES20.glBindFramebuffer(36160, heatMaskRenderer.checkFbo);
                                GLES20.glViewport(0, 0, 1, 1);
                                GLES20.glUseProgram(maxAlphaShaderProgram.flags);
                                GLES20.glActiveTexture(34001);
                                GLES20.glBindTexture(3553, heatMaskRenderer.currentReadTexture);
                                GLES20.glUniform1i(maxAlphaShaderProgram.textureLoc, 17);
                                GLES20.glDisable(3042);
                                heatMaskRenderer.drawFullScreenQuad();
                                byteBuffer.clear();
                                GLES20.glReadPixels(0, 0, 1, 1, 6408, 5121, heatMaskRenderer.checkPixelBuffer);
                                boolean z4 = (byteBuffer.get(3) & 255) > 0;
                                GLES20.glBindFramebuffer(36160, iArr11[0]);
                                GLES20.glViewport(iArr10[0], iArr10[1], iArr10[2], iArr10[3]);
                                GLES20.glActiveTexture(iArr14[0]);
                                GLES20.glUseProgram(iArr15[0]);
                                if (glIsEnabled4) {
                                    GLES20.glEnable(2929);
                                } else {
                                    GLES20.glDisable(2929);
                                }
                                if (glIsEnabled5) {
                                    GLES20.glEnable(3042);
                                    GLES20.glBlendFunc(iArr12[0], iArr13[0]);
                                } else {
                                    GLES20.glDisable(3042);
                                }
                                if (glIsEnabled6) {
                                    GLES20.glEnable(2884);
                                    GLES20.glCullFace(iArr16[0]);
                                } else {
                                    GLES20.glDisable(2884);
                                }
                                heatMaskRenderer.hasHeat = z4;
                            } catch (Throwable th3) {
                                GLES20.glBindFramebuffer(36160, iArr11[0]);
                                GLES20.glViewport(iArr10[0], iArr10[1], iArr10[2], iArr10[3]);
                                GLES20.glActiveTexture(iArr14[0]);
                                GLES20.glUseProgram(iArr15[0]);
                                if (glIsEnabled4) {
                                    GLES20.glEnable(2929);
                                } else {
                                    GLES20.glDisable(2929);
                                }
                                if (glIsEnabled5) {
                                    GLES20.glEnable(3042);
                                    GLES20.glBlendFunc(iArr12[0], iArr13[0]);
                                } else {
                                    GLES20.glDisable(3042);
                                }
                                if (glIsEnabled6) {
                                    GLES20.glEnable(2884);
                                    GLES20.glCullFace(iArr16[0]);
                                } else {
                                    GLES20.glDisable(2884);
                                }
                                throw th3;
                            }
                        }
                        if (heatMaskRenderer.hasHeat || heatMaskRenderer.framesSinceLastHeat < 200) {
                            ((HeatMaskRenderer) this.this$0).onNeedsRender.invoke();
                        }
                    } catch (Throwable th4) {
                        th = th4;
                        iArr8 = iArr;
                    }
                    iArr = new int[4];
                    iArr2 = new int[i4];
                    iArr3 = new int[i4];
                    iArr4 = new int[i4];
                    iArr5 = new int[i4];
                    iArr6 = new int[i4];
                    iArr7 = new int[i4];
                    GLES20.glGetIntegerv(2978, iArr, 0);
                    GLES20.glGetIntegerv(36006, iArr2, 0);
                    GLES20.glGetIntegerv(34016, iArr5, 0);
                    GLES20.glGetIntegerv(35725, iArr6, 0);
                    GLES20.glGetIntegerv(2885, iArr7, 0);
                    glIsEnabled = GLES20.glIsEnabled(2929);
                    glIsEnabled2 = GLES20.glIsEnabled(3042);
                    glIsEnabled3 = GLES20.glIsEnabled(2884);
                    GLES20.glGetIntegerv(32969, iArr3, 0);
                    GLES20.glGetIntegerv(32968, iArr4, 0);
                }
            }
            ((HeatMaskRenderer) this.this$0).config.getClass();
            this.L$0 = coroutineScope;
            i5 = 1;
            this.label = 1;
            if (JobKt.delay(33L, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
            i4 = i5;
            if (((HeatMaskRenderer) this.this$0).renderLoopActive) {
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            int i = this.$r8$classId;
            Object obj2 = this.this$0;
            switch (i) {
                case 0:
                    return new AnonymousClass2((PlaidLinkView) obj2, continuation, 0);
                case 1:
                    return new AnonymousClass2((DisclosurePresenter) this.L$0, (StripeLinkViewEvent) obj2, continuation, 1);
                case 2:
                    return new AnonymousClass2((VerifyAliasPresenter) this.L$0, (VerifyAliasViewEvent) obj2, continuation, 2);
                case 3:
                    return new AnonymousClass2((VerifyAliasPresenter) this.L$0, (AliasVerifier$Result.Successful) obj2, continuation, 3);
                case 4:
                    return new AnonymousClass2((VerifyContactsPresenter) this.L$0, (MutableState) obj2, continuation, 4);
                case 5:
                    return new AnonymousClass2((VerifyContactsPresenter) this.L$0, (BlockerAction) obj2, continuation, 5);
                case 6:
                    AnonymousClass2 anonymousClass2 = new AnonymousClass2((WelcomePresenter) obj2, continuation, 6);
                    anonymousClass2.L$0 = obj;
                    return anonymousClass2;
                case 7:
                    return new AnonymousClass2((FormBlockerView) obj2, (Ui.EventReceiver) this.L$0, continuation);
                case 8:
                    return new AnonymousClass2((StripeLinkView) obj2, continuation, 8);
                case 9:
                    return new AnonymousClass2((PaymentAuthWebChromeClient) this.L$0, (Uri) obj2, continuation, 9);
                case 10:
                    return new AnonymousClass2((PaymentAuthWebChromeClient) this.L$0, (String) obj2, continuation, 10);
                case 11:
                    return new AnonymousClass2((WebBlockerWebViewClient) this.L$0, (Uri) obj2, continuation, 11);
                case 12:
                    return new AnonymousClass2((BrazeSetupTeardownActivityWorker) obj2, continuation, 12);
                case 13:
                    return new AnonymousClass2((RealFilePicker) this.L$0, (Function1) obj2, continuation, 13);
                case 14:
                    return new AnonymousClass2((BugReportingViewModel.Ready) this.L$0, (RealSheetState) obj2, continuation, 14);
                case 15:
                    return new AnonymousClass2((CardContouredText) this.L$0, (CardModelView) obj2, this.label, continuation, 15);
                case 16:
                    return new AnonymousClass2((CardPreviewPresenter) this.L$0, (MutableState) obj2, continuation, 16);
                case 17:
                    return new AnonymousClass2((CardStudioView) this.L$0, (MotionEvent) obj2, continuation, 17);
                case 18:
                    return new AnonymousClass2((CardStylePickerPresenter) this.L$0, this.label, (String) obj2, continuation);
                case 19:
                    return new AnonymousClass2((DisclosurePresenter) this.L$0, (MutableState) obj2, continuation, 19);
                case 20:
                    return new AnonymousClass2((PdpPanelState) this.L$0, (MutableState) obj2, continuation, 20);
                case 21:
                    return new AnonymousClass2((MusicPresenter) this.L$0, (MutableState) obj2, continuation, 21);
                case 22:
                    return new AnonymousClass2((MusicPresenter) this.L$0, (MutableState) obj2, continuation, 22);
                case 23:
                    return new AnonymousClass2((TagOrderConfirmationPresenter) this.L$0, (MutableState) obj2, continuation, 23);
                case 24:
                    AnonymousClass2 anonymousClass22 = new AnonymousClass2((CardScene) obj2, continuation, 24);
                    anonymousClass22.L$0 = obj;
                    return anonymousClass22;
                case 25:
                    return new AnonymousClass2((MutableSharedFlow) this.L$0, (CardWobbleState) obj2, continuation, 25);
                case 26:
                    return new AnonymousClass2((androidx.compose.runtime.State) this.L$0, (CardScene) obj2, continuation, 26);
                case 27:
                    AnonymousClass2 anonymousClass23 = new AnonymousClass2((HeatMaskRenderer) obj2, continuation, 27);
                    anonymousClass23.L$0 = obj;
                    return anonymousClass23;
                case 28:
                    return new AnonymousClass2((Animatable) this.L$0, (CardGridNuxScene) obj2, continuation, 28);
                default:
                    return new AnonymousClass2((ContouredTextRing) this.L$0, (Bitmap) obj2, this.label, continuation, 29);
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            switch (this.$r8$classId) {
                case 12:
                    ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
                    break;
            }
            return ((AnonymousClass2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }

        /* JADX WARN: Code restructure failed: missing block: B:332:0x06cc, code lost:
        
            if (r0 == r10) goto L291;
         */
        /* JADX WARN: Code restructure failed: missing block: B:340:0x06e8, code lost:
        
            if (r0 == r10) goto L291;
         */
        /* JADX WARN: Code restructure failed: missing block: B:343:0x06a5, code lost:
        
            if (kotlinx.coroutines.JobKt.coroutineScope(r2, r18) == r10) goto L291;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:417:0x090c  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object result;
            Ui.EventReceiver eventReceiver;
            Object completeLink;
            Object checkIntegrity;
            Object coroutineScope;
            Object result2;
            Ui.EventReceiver eventReceiver2;
            Object result3;
            Object trackBlockerSubmissionAnalytics$default;
            Object first;
            Object first2;
            int i = 16;
            int i2 = 3;
            int i3 = 2;
            int i4 = 0;
            int i5 = 1;
            char c = 1;
            char c2 = 1;
            char c3 = 1;
            char c4 = 1;
            char c5 = 1;
            char c6 = 1;
            Continuation continuation = null;
            Object[] objArr = 0;
            Object[] objArr2 = 0;
            Object[] objArr3 = 0;
            Object[] objArr4 = 0;
            Object[] objArr5 = 0;
            Object[] objArr6 = 0;
            Object[] objArr7 = 0;
            Object[] objArr8 = 0;
            Object[] objArr9 = 0;
            switch (this.$r8$classId) {
                case 0:
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i6 = this.label;
                    if (i6 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        PlaidLinkView plaidLinkView = (PlaidLinkView) this.this$0;
                        Ui.EventReceiver eventReceiver3 = plaidLinkView.eventReceiver;
                        if (eventReceiver3 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        }
                        RealPlaidLinkActivityLauncher realPlaidLinkActivityLauncher = plaidLinkView.launcher;
                        this.L$0 = eventReceiver3;
                        this.label = 1;
                        result = realPlaidLinkActivityLauncher.getResult(this);
                        if (result == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                        eventReceiver = eventReceiver3;
                    } else {
                        if (i6 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        eventReceiver = (Ui.EventReceiver) this.L$0;
                        SafeTrace.throwOnFailure(obj);
                        result = obj;
                    }
                    eventReceiver.sendEvent(new PlaidLinkViewEvent.ReceivedResult((PlaidLinkResult) result));
                    return Unit.INSTANCE;
                case 1:
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i7 = this.label;
                    if (i7 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        DisclosurePresenter disclosurePresenter = (DisclosurePresenter) this.L$0;
                        BetterNavigator.ScreenNavigator screenNavigator = (BetterNavigator.ScreenNavigator) disclosurePresenter.navigator;
                        BlockersScreens.StripeLinkScreen stripeLinkScreen = (BlockersScreens.StripeLinkScreen) disclosurePresenter.args;
                        StripeLinkResult stripeLinkResult = ((StripeLinkViewEvent.ReceivedResult) ((StripeLinkViewEvent) this.this$0)).result;
                        this.label = 1;
                        BlockersData blockersData = stripeLinkScreen.blockersData;
                        if (Intrinsics.areEqual(stripeLinkResult, StripeLinkResult.Canceled.INSTANCE)) {
                            DisclosurePresenter.trackInstrumentLink$default(disclosurePresenter, InstrumentLinkAuthenticateInstitution.Status.CANCEL, null, null, null, null, 30);
                            ((BlockerFlowListener) disclosurePresenter.launcher).onFlowCancelled(blockersData);
                            screenNavigator.goTo(blockersData.exitScreen);
                        } else {
                            int i8 = 58;
                            if (stripeLinkResult instanceof StripeLinkResult$Failure$InitializationError) {
                                DisclosurePresenter.trackInstrumentLink$default(disclosurePresenter, InstrumentLinkAuthenticateInstitution.Status.FAILURE, null, null, null, "Stripe initialization error", 14);
                                BlockersData blockersData2 = stripeLinkScreen.blockersData;
                                if (blockersData2.manualAchEnabled) {
                                    screenNavigator.goTo(new BlockersScreens.BankAccountLinkingScreen(blockersData2, objArr2 == true ? 1 : 0, c2 == true ? 1 : 0, i8));
                                } else {
                                    disclosurePresenter.exitWithError(null);
                                }
                            } else if (stripeLinkResult instanceof StripeLinkResult$Failure$Unknown) {
                                DisclosurePresenter.trackInstrumentLink$default(disclosurePresenter, InstrumentLinkAuthenticateInstitution.Status.FAILURE, null, null, null, "Stripe error", 14);
                                disclosurePresenter.exitWithError(null);
                            } else if (stripeLinkResult instanceof StripeLinkResult.Success) {
                                StripeLinkResult.Success success = (StripeLinkResult.Success) stripeLinkResult;
                                DisclosurePresenter.trackInstrumentLink$default(disclosurePresenter, InstrumentLinkAuthenticateInstitution.Status.RECEIVE_LINK_RESULT, null, success.institutionName, null, null, 26);
                                completeLink = disclosurePresenter.completeLink(success.accountId, success.paymentMethodId, success.institutionName, this);
                                if (completeLink != coroutineSingletons2) {
                                    completeLink = Unit.INSTANCE;
                                }
                                if (completeLink == coroutineSingletons2) {
                                    return coroutineSingletons2;
                                }
                            } else {
                                if (!Intrinsics.areEqual(stripeLinkResult, StripeLinkResult.ManualLink.INSTANCE)) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                DisclosurePresenter.trackInstrumentLink$default(disclosurePresenter, InstrumentLinkAuthenticateInstitution.Status.MANUAL_LINK, null, null, null, null, 30);
                                screenNavigator.goTo(new BlockersScreens.BankAccountLinkingScreen(stripeLinkScreen.blockersData, objArr == true ? 1 : 0, c == true ? 1 : 0, i8));
                            }
                        }
                        completeLink = Unit.INSTANCE;
                        if (completeLink == coroutineSingletons2) {
                        }
                    } else {
                        if (i7 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 2:
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i9 = this.label;
                    if (i9 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        VerifyAliasPresenter verifyAliasPresenter = (VerifyAliasPresenter) this.L$0;
                        RealBlockersHelper realBlockersHelper = verifyAliasPresenter.blockersHelper;
                        BlockerAction blockerAction = ((VerifyAliasViewEvent.BlockerActionClick) ((VerifyAliasViewEvent) this.this$0)).action;
                        BlockersScreens.VerifyAliasScreen verifyAliasScreen = verifyAliasPresenter.args;
                        this.label = 1;
                        if (BlockersHelper.handleBlockerAction$default(realBlockersHelper, blockerAction, verifyAliasScreen, null, null, false, null, null, this, EnumC0170g.SDK_ASSET_ILLUSTRATION_ROUTING_NUMBER_CONFIRMED_CIRCLE_VALUE) == coroutineSingletons3) {
                            return coroutineSingletons3;
                        }
                    } else {
                        if (i9 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 3:
                    VerifyAliasPresenter verifyAliasPresenter2 = (VerifyAliasPresenter) this.L$0;
                    BlockersScreens.VerifyAliasScreen verifyAliasScreen2 = verifyAliasPresenter2.args;
                    CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i10 = this.label;
                    if (i10 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        BlockersData blockersData3 = verifyAliasScreen2.blockersData;
                        if (blockersData3.flow == BlockersData.Flow.ONBOARDING) {
                            RealOnboardingFlowTokenManager realOnboardingFlowTokenManager = verifyAliasPresenter2.onboardingFlowTokenManager;
                            String str = blockersData3.flowToken;
                            this.label = 1;
                            realOnboardingFlowTokenManager.onboardingToken.blockingSet(str);
                            if (Unit.INSTANCE == coroutineSingletons4) {
                                return coroutineSingletons4;
                            }
                        }
                    } else {
                        if (i10 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    verifyAliasPresenter2.pendingEmailPreference.delete();
                    ResponseContext responseContext = ((AliasVerifier$Result.Successful) this.this$0).responseContext;
                    responseContext.getClass();
                    BlockersData blockersData4 = verifyAliasScreen2.blockersData;
                    Parcelable.Creator<BlockersData> creator = BlockersData.CREATOR;
                    BlockersData updateFromResponseContext = blockersData4.updateFromResponseContext(responseContext, false);
                    String str2 = responseContext.dialog_message;
                    String str3 = (str2 == null || str2.length() <= 0) ? null : str2;
                    BetterNavigator.ScreenNavigator screenNavigator2 = verifyAliasPresenter2.navigator;
                    if (str3 != null) {
                        screenNavigator2.goTo(new BlockersScreens.SuccessMessageScreen(updateFromResponseContext, null, str3, responseContext.dialog_title, 2));
                    } else {
                        screenNavigator2.goTo(verifyAliasPresenter2.blockersNavigator.getNext(verifyAliasScreen2, updateFromResponseContext));
                    }
                    return Unit.INSTANCE;
                case 4:
                    VerifyContactsPresenter verifyContactsPresenter = (VerifyContactsPresenter) this.L$0;
                    CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i11 = this.label;
                    if (i11 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        FlowKt__MergeKt$flatMapConcat$$inlined$map$1 flowKt__MergeKt$flatMapConcat$$inlined$map$1 = new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new PageFetcher$flow$1.AnonymousClass1(i3, objArr3 == true ? 1 : 0, 9), FlowKt.flowOn(new RealBadger2$setup$lambda$0$$inlined$mapNotNull$1(new RealTransferManager$addCash$$inlined$map$1(StateFlowKt.runUntil(FlowKt.take(new RealContactBook$getAliases$$inlined$map$1(verifyContactsPresenter.contactBook.contacts, verifyContactsPresenter.args.maxContacts, i4), 1), verifyContactsPresenter.signOut), verifyContactsPresenter, i2), 24), verifyContactsPresenter.ioDispatcher));
                        PasscodeViewKt$Passcode$3$1$1$1$2 passcodeViewKt$Passcode$3$1$1$1$2 = new PasscodeViewKt$Passcode$3$1$1$1$2(23, verifyContactsPresenter, (MutableState) this.this$0);
                        this.label = 1;
                        if (flowKt__MergeKt$flatMapConcat$$inlined$map$1.collect(passcodeViewKt$Passcode$3$1$1$1$2, this) == coroutineSingletons5) {
                            return coroutineSingletons5;
                        }
                    } else {
                        if (i11 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 5:
                    CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i12 = this.label;
                    if (i12 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        VerifyContactsPresenter verifyContactsPresenter2 = (VerifyContactsPresenter) this.L$0;
                        RealBlockersHelper realBlockersHelper2 = verifyContactsPresenter2.blockersHelper;
                        BlockerAction blockerAction2 = (BlockerAction) this.this$0;
                        BlockersScreens.ContactVerificationScreen contactVerificationScreen = verifyContactsPresenter2.args;
                        VerifyContactsPresenter$models$2$3$1 verifyContactsPresenter$models$2$3$1 = new VerifyContactsPresenter$models$2$3$1(verifyContactsPresenter2, null);
                        this.label = 1;
                        if (BlockersHelper.handleBlockerAction$default(realBlockersHelper2, blockerAction2, contactVerificationScreen, null, null, false, null, verifyContactsPresenter$models$2$3$1, this, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE) == coroutineSingletons6) {
                            return coroutineSingletons6;
                        }
                    } else {
                        if (i12 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 6:
                    WelcomePresenter welcomePresenter = (WelcomePresenter) this.this$0;
                    AccountSwitcher$AccountSwitchingMetadata accountSwitcher$AccountSwitchingMetadata = welcomePresenter.accountSwitchMetadata;
                    CoroutineScope coroutineScope2 = (CoroutineScope) this.L$0;
                    CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i13 = this.label;
                    if (i13 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        JobKt.launch$default(coroutineScope2, null, null, new SessionWorkerKt$runSession$snapshotMonitor$1(i3, objArr5 == true ? 1 : 0, i3), 3);
                        InteractiveCardView$flingTo$1.AnonymousClass2 anonymousClass2 = new InteractiveCardView$flingTo$1.AnonymousClass2(welcomePresenter, objArr4 == true ? 1 : 0, 14);
                        this.L$0 = null;
                        this.label = 1;
                        break;
                    } else {
                        if (i13 != 1) {
                            if (i13 == 2) {
                                SafeTrace.throwOnFailure(obj);
                                coroutineScope = obj;
                                return new WelcomePresenter.IntegrityCheckResult.FromColdStartChecker((ColdStartIntegrityChecker$ColdStartIntegrityCheckResult) coroutineScope);
                            }
                            if (i13 != 3) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                            checkIntegrity = obj;
                            return new WelcomePresenter.IntegrityCheckResult.FromOnboardingChecker((OnboardingIntegrityChecker$OnboardingIntegrityCheckResult) checkIntegrity);
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    if (((Boolean) welcomePresenter.simplifiedIntegrityChecksEnabled$delegate.getValue()).booleanValue()) {
                        RealColdStartIntegrityChecker realColdStartIntegrityChecker = welcomePresenter.coldStartIntegrityChecker;
                        ColdStartIntegrityChecker$TriggeredBy coldStartIntegrityChecker$TriggeredBy = accountSwitcher$AccountSwitchingMetadata != null ? ColdStartIntegrityChecker$TriggeredBy.ACCOUNT_SWITCH : ColdStartIntegrityChecker$TriggeredBy.END_OF_ONBOARDING;
                        this.L$0 = null;
                        this.label = 2;
                        coroutineScope = JobKt.coroutineScope(new RealColdStartIntegrityChecker$checkIntegrityWithRetry$2(realColdStartIntegrityChecker, coldStartIntegrityChecker$TriggeredBy, false, null), this);
                        break;
                    } else {
                        RealOnboardingIntegrityChecker realOnboardingIntegrityChecker = welcomePresenter.onboardingIntegrityChecker;
                        OnboardingIntegrityChecker$TriggeredBy onboardingIntegrityChecker$TriggeredBy = accountSwitcher$AccountSwitchingMetadata != null ? OnboardingIntegrityChecker$TriggeredBy.ACCOUNT_SWITCH : OnboardingIntegrityChecker$TriggeredBy.END_OF_ONBOARDING;
                        this.L$0 = null;
                        this.label = 3;
                        checkIntegrity = realOnboardingIntegrityChecker.checkIntegrity(onboardingIntegrityChecker$TriggeredBy, this);
                        break;
                    }
                    return coroutineSingletons7;
                case 7:
                    CoroutineSingletons coroutineSingletons8 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i14 = this.label;
                    if (i14 != 0) {
                        if (i14 == 1) {
                            SafeTrace.throwOnFailure(obj);
                            return Unit.INSTANCE;
                        }
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    SafeTrace.throwOnFailure(obj);
                    SharedFlowImpl sharedFlowImpl = ((FormBlockerView) this.this$0).formView.viewEvents;
                    PaymentPasscodeActivity$loadView$3$1 paymentPasscodeActivity$loadView$3$1 = new PaymentPasscodeActivity$loadView$3$1((Ui.EventReceiver) this.L$0, i2);
                    this.label = 1;
                    sharedFlowImpl.getClass();
                    SharedFlowImpl.collect$suspendImpl(sharedFlowImpl, paymentPasscodeActivity$loadView$3$1, this);
                    return coroutineSingletons8;
                case 8:
                    CoroutineSingletons coroutineSingletons9 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i15 = this.label;
                    if (i15 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        StripeLinkView stripeLinkView = (StripeLinkView) this.this$0;
                        Ui.EventReceiver eventReceiver4 = stripeLinkView.eventReceiver;
                        if (eventReceiver4 == null) {
                            Intrinsics.throwUninitializedPropertyAccessException("eventReceiver");
                            throw null;
                        }
                        RealStripeLinkActivityLauncher realStripeLinkActivityLauncher = stripeLinkView.launcher;
                        this.L$0 = eventReceiver4;
                        this.label = 1;
                        result2 = realStripeLinkActivityLauncher.getResult(this);
                        if (result2 == coroutineSingletons9) {
                            return coroutineSingletons9;
                        }
                        eventReceiver2 = eventReceiver4;
                    } else {
                        if (i15 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        eventReceiver2 = (Ui.EventReceiver) this.L$0;
                        SafeTrace.throwOnFailure(obj);
                        result2 = obj;
                    }
                    eventReceiver2.sendEvent(new StripeLinkViewEvent.ReceivedResult((StripeLinkResult) result2));
                    return Unit.INSTANCE;
                case 9:
                    CoroutineSingletons coroutineSingletons10 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i16 = this.label;
                    if (i16 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        BufferedChannel bufferedChannel = (BufferedChannel) ((PaymentAuthWebChromeClient) this.L$0).activity;
                        String uri = ((Uri) this.this$0).toString();
                        uri.getClass();
                        WebBlockerBridgeEvent.LaunchNewWindow launchNewWindow = new WebBlockerBridgeEvent.LaunchNewWindow(uri);
                        this.label = 1;
                        if (bufferedChannel.send(launchNewWindow, this) == coroutineSingletons10) {
                            return coroutineSingletons10;
                        }
                    } else {
                        if (i16 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 10:
                    CoroutineSingletons coroutineSingletons11 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i17 = this.label;
                    if (i17 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        BufferedChannel bufferedChannel2 = (BufferedChannel) ((PaymentAuthWebChromeClient) this.L$0).activity;
                        WebBlockerBridgeEvent.TitleUpdated titleUpdated = new WebBlockerBridgeEvent.TitleUpdated((String) this.this$0);
                        this.label = 1;
                        if (bufferedChannel2.send(titleUpdated, this) == coroutineSingletons11) {
                            return coroutineSingletons11;
                        }
                    } else {
                        if (i17 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 11:
                    CoroutineSingletons coroutineSingletons12 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i18 = this.label;
                    if (i18 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        BufferedChannel bufferedChannel3 = ((WebBlockerWebViewClient) this.L$0).webEvents;
                        String uri2 = ((Uri) this.this$0).toString();
                        uri2.getClass();
                        WebBlockerBridgeEvent.UrlLoading urlLoading = new WebBlockerBridgeEvent.UrlLoading(uri2);
                        this.label = 1;
                        if (bufferedChannel3.send(urlLoading, this) == coroutineSingletons12) {
                            return coroutineSingletons12;
                        }
                    } else {
                        if (i18 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 12:
                    BrazeSetupTeardownActivityWorker brazeSetupTeardownActivityWorker = (BrazeSetupTeardownActivityWorker) this.this$0;
                    CoroutineSingletons coroutineSingletons13 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i19 = this.label;
                    try {
                        if (i19 != 0) {
                            if (i19 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                            throw new KotlinNothingValueException();
                        }
                        SafeTrace.throwOnFailure(obj);
                        RealBrazeManager realBrazeManager = (RealBrazeManager) brazeSetupTeardownActivityWorker.brazeManager;
                        ((Braze) realBrazeManager.braze$delegate.getValue()).openSession(realBrazeManager.activity);
                        StandaloneCoroutine standaloneCoroutine = realBrazeManager.userSessionTrackingJob;
                        if (standaloneCoroutine != null) {
                            standaloneCoroutine.cancel(null);
                        }
                        realBrazeManager.userSessionTrackingJob = JobKt.launch$default(realBrazeManager.scope, realBrazeManager.ioContext, null, new CardModelView.AnonymousClass1.C00581(realBrazeManager, objArr6 == true ? 1 : 0, i), 2);
                        this.L$0 = brazeSetupTeardownActivityWorker;
                        this.label = 1;
                        JobKt.awaitCancellation(this);
                        return coroutineSingletons13;
                    } catch (Throwable th) {
                        RealBrazeManager realBrazeManager2 = (RealBrazeManager) brazeSetupTeardownActivityWorker.brazeManager;
                        StandaloneCoroutine standaloneCoroutine2 = realBrazeManager2.userSessionTrackingJob;
                        if (standaloneCoroutine2 != null) {
                            standaloneCoroutine2.cancel(null);
                        }
                        realBrazeManager2.userSessionTrackingJob = null;
                        ((Braze) realBrazeManager2.braze$delegate.getValue()).closeSession(realBrazeManager2.activity);
                        throw th;
                    }
                case 13:
                    CoroutineSingletons coroutineSingletons14 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i20 = this.label;
                    if (i20 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        RealFilePicker realFilePicker = (RealFilePicker) this.L$0;
                        this.label = 1;
                        result3 = realFilePicker.getResult(this);
                        if (result3 == coroutineSingletons14) {
                            return coroutineSingletons14;
                        }
                    } else {
                        if (i20 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        result3 = obj;
                    }
                    ((Function1) this.this$0).invoke(new BugReportingViewEvent.AddMoreScreenshots((FilePickerResult) result3));
                    return Unit.INSTANCE;
                case 14:
                    CoroutineSingletons coroutineSingletons15 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i21 = this.label;
                    if (i21 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        if (((BugReportingViewModel.Ready) this.L$0).diagnosticAttachmentsExpanded) {
                            RealSheetState realSheetState = (RealSheetState) this.this$0;
                            this.label = 1;
                            if (realSheetState.expand(this) == coroutineSingletons15) {
                                return coroutineSingletons15;
                            }
                        }
                    } else {
                        if (i21 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 15:
                    CoroutineSingletons coroutineSingletons16 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    CardContouredText cardContouredText = (CardContouredText) this.L$0;
                    if (cardContouredText == null) {
                        return Bitmap.createBitmap(1, 1, Bitmap.Config.ARGB_8888);
                    }
                    Context context = ((CardModelView) this.this$0).getContext();
                    context.getClass();
                    return CardsKt.createContouredText$default(context, this.label, cardContouredText.text);
                case 16:
                    CardPreviewPresenter cardPreviewPresenter = (CardPreviewPresenter) this.L$0;
                    CoroutineSingletons coroutineSingletons17 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i22 = this.label;
                    if (i22 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        cardPreviewPresenter.analytics.track(new CashCardCustomizePreviewStyle(), null);
                        Flow flowOn = FlowKt.flowOn(new SafeFlow(new CardPreviewPresenter$cardStudio$1(cardPreviewPresenter, null)), cardPreviewPresenter.ioDispatcher);
                        CardPreviewScreen cardPreviewScreen = cardPreviewPresenter.args;
                        Redacted redacted = cardPreviewScreen.cashtag;
                        int i23 = 19;
                        Flow appLockMonitor$special$$inlined$map$2 = redacted != null ? new AppLockMonitor$special$$inlined$map$2(redacted.getValue(), i23) : new CardPreviewPresenter$cashtag$$inlined$map$1(FlowKt.take(cardPreviewPresenter.profileManager.publicProfile(), 1), i4);
                        RealTransferManager$addCash$$inlined$map$1 realTransferManager$addCash$$inlined$map$1 = new RealTransferManager$addCash$$inlined$map$1(((RealAppConfigManager) cardPreviewPresenter.appConfig).stampConfig(), cardPreviewPresenter, 10);
                        boolean isDeviceSupported = cardPreviewPresenter.filamentSupportProvider.isDeviceSupported();
                        CardPresentationStyle cardPresentationStyle = cardPreviewScreen.cardPresentationStyle;
                        CardPresentationStyle cardPresentationStyle2 = CardPresentationStyle.TRUE_3D;
                        if (cardPresentationStyle != cardPresentationStyle2 || !isDeviceSupported) {
                            cardPresentationStyle2 = CardPresentationStyle.PSEUDO_3D;
                        }
                        FlowKt__MergeKt$flatMapMerge$$inlined$map$1 combine = FlowKt.combine(flowOn, appLockMonitor$special$$inlined$map$2, realTransferManager$addCash$$inlined$map$1, new AppLockMonitor$special$$inlined$map$2(cardPresentationStyle2, i23), CardPreviewPresenter$initialModel$3.INSTANCE);
                        MusicPresenter$models$2$1.AnonymousClass1 anonymousClass1 = new MusicPresenter$models$2$1.AnonymousClass1(15, (MutableState) this.this$0);
                        this.label = 1;
                        Object collect = combine.collect(new CardPreviewPresenter$stamps$$inlined$map$1$2(anonymousClass1, cardPreviewPresenter, c3 == true ? 1 : 0), this);
                        if (collect != coroutineSingletons17) {
                            collect = Unit.INSTANCE;
                        }
                        if (collect == coroutineSingletons17) {
                            return coroutineSingletons17;
                        }
                    } else {
                        if (i22 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 17:
                    MotionEvent motionEvent = (MotionEvent) this.this$0;
                    CoroutineSingletons coroutineSingletons18 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i24 = this.label;
                    if (i24 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        SharedFlowImpl sharedFlowImpl2 = ((CardStudioView) this.L$0).screenTouchPoints;
                        PointF pointF = new PointF(motionEvent.getX(), motionEvent.getY());
                        this.label = 1;
                        if (sharedFlowImpl2.emit(pointF, this) == coroutineSingletons18) {
                            return coroutineSingletons18;
                        }
                    } else {
                        if (i24 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 18:
                    CoroutineSingletons coroutineSingletons19 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    CardStylePickerPresenter cardStylePickerPresenter = (CardStylePickerPresenter) this.L$0;
                    Analytics analytics = cardStylePickerPresenter.analytics;
                    CardStyleScreen cardStyleScreen = cardStylePickerPresenter.args;
                    analytics.track(new CashCardCustomizeScrollToTheme(new Integer(this.label), String.valueOf(cardStyleScreen.blockersData.clientScenario), cardStyleScreen.blockersData.flowToken, (String) this.this$0), null);
                    return Unit.INSTANCE;
                case 19:
                    DisclosurePresenter disclosurePresenter2 = (DisclosurePresenter) this.L$0;
                    BetterNavigator.ScreenNavigator screenNavigator3 = (BetterNavigator.ScreenNavigator) disclosurePresenter2.navigator;
                    AndroidStringManager androidStringManager = (AndroidStringManager) disclosurePresenter2.stringManager;
                    DisclosureScreen disclosureScreen = (DisclosureScreen) disclosurePresenter2.args;
                    CoroutineSingletons coroutineSingletons20 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i25 = this.label;
                    if (i25 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        ConfirmDisclosureRequest confirmDisclosureRequest = new ConfirmDisclosureRequest(disclosureScreen.blockersData.requestContext, ByteString.EMPTY);
                        this.label = 1;
                        trackBlockerSubmissionAnalytics$default = PointerInputModifierNodeKt.trackBlockerSubmissionAnalytics$default(24, disclosureScreen.blockersData, (Analytics) disclosurePresenter2.analytics, androidStringManager, this, null, new PagingDataPresenter$collectFrom$2(disclosurePresenter2, confirmDisclosureRequest, objArr7 == true ? 1 : 0, 28));
                        if (trackBlockerSubmissionAnalytics$default == coroutineSingletons20) {
                            return coroutineSingletons20;
                        }
                    } else {
                        if (i25 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        trackBlockerSubmissionAnalytics$default = obj;
                    }
                    ApiResult apiResult = (ApiResult) trackBlockerSubmissionAnalytics$default;
                    if (apiResult instanceof ApiResult.Success) {
                        BlockersData blockersData5 = disclosureScreen.blockersData;
                        ResponseContext responseContext2 = ((ConfirmDisclosureResponse) ((ApiResult.Success) apiResult).response).response_context;
                        responseContext2.getClass();
                        Parcelable.Creator<BlockersData> creator2 = BlockersData.CREATOR;
                        screenNavigator3.goTo(((BlockersDataNavigator) disclosurePresenter2.blockersNavigator).getNext(disclosureScreen, blockersData5.updateFromResponseContext(responseContext2, false)));
                    } else {
                        if (!(apiResult instanceof ApiResult.Failure)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        Timber.Forest.e("Failed to confirm card order.", new Object[0]);
                        screenNavigator3.goTo(CanvasKt.toFailureScreen((ApiResult.Failure) apiResult, disclosureScreen.blockersData, androidStringManager));
                        MutableState mutableState = (MutableState) this.this$0;
                        mutableState.setValue(disclosurePresenter2.buildDisclosureViewModel(false, ((DisclosureViewModel) mutableState.getValue()).hasFullyScrolled));
                    }
                    return Unit.INSTANCE;
                case 20:
                    CoroutineSingletons coroutineSingletons21 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i26 = this.label;
                    if (i26 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        PdpPanelState pdpPanelState = (PdpPanelState) this.L$0;
                        MutableState mutableState2 = (MutableState) this.this$0;
                        int i27 = PaymentDeviceCustomizationViewKt.$r8$clinit;
                        ProductDetailsPageViewModel productDetailsPageViewModel = (ProductDetailsPageViewModel) mutableState2.getValue();
                        this.label = 1;
                        if (pdpPanelState.updateFocusedModel(productDetailsPageViewModel, this) == coroutineSingletons21) {
                            return coroutineSingletons21;
                        }
                    } else {
                        if (i26 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 21:
                    MusicPresenter musicPresenter = (MusicPresenter) this.L$0;
                    PatternSignatureStamps patternSignatureStamps = (PatternSignatureStamps) musicPresenter.musicPlayer;
                    CoroutineSingletons coroutineSingletons22 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i28 = this.label;
                    if (i28 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        FinishSetupTileBadgeCounter stampConfig = ((RealAppConfigManager) ((AppConfigManager) musicPresenter.musicRepository)).stampConfig();
                        this.label = 1;
                        first = FlowKt.first(stampConfig, this);
                        if (first == coroutineSingletons22) {
                            return coroutineSingletons22;
                        }
                    } else {
                        if (i28 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        first = obj;
                    }
                    List list = ((StampsConfig) first).stamps;
                    list.getClass();
                    ArrayList arrayList = new ArrayList();
                    for (Object obj2 : list) {
                        Stamp stamp = (Stamp) obj2;
                        if (patternSignatureStamps.availableStamps.isEmpty() || CollectionsKt.contains(patternSignatureStamps.availableStamps, stamp.name)) {
                            arrayList.add(obj2);
                        }
                    }
                    return new StampSheetViewModel(arrayList, (List) ((MutableState) this.this$0).getValue(), false);
                case 22:
                    MusicPresenter musicPresenter2 = (MusicPresenter) this.L$0;
                    PatternSignatureStampsV2 patternSignatureStampsV2 = (PatternSignatureStampsV2) musicPresenter2.musicPlayer;
                    CoroutineSingletons coroutineSingletons23 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i29 = this.label;
                    if (i29 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        FinishSetupTileBadgeCounter stampConfig2 = ((RealAppConfigManager) ((AppConfigManager) musicPresenter2.musicRepository)).stampConfig();
                        this.label = 1;
                        first2 = FlowKt.first(stampConfig2, this);
                        if (first2 == coroutineSingletons23) {
                            return coroutineSingletons23;
                        }
                    } else {
                        if (i29 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                        first2 = obj;
                    }
                    List list2 = ((StampsConfig) first2).stamps;
                    list2.getClass();
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj3 : list2) {
                        Stamp stamp2 = (Stamp) obj3;
                        if (patternSignatureStampsV2.availableStamps.isEmpty() || CollectionsKt.contains(patternSignatureStampsV2.availableStamps, stamp2.name)) {
                            arrayList2.add(obj3);
                        }
                    }
                    return new StampSheetViewModel(arrayList2, (List) ((MutableState) this.this$0).getValue(), false);
                case 23:
                    MutableState mutableState3 = (MutableState) this.this$0;
                    CoroutineSingletons coroutineSingletons24 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i30 = this.label;
                    try {
                        if (i30 == 0) {
                            SafeTrace.throwOnFailure(obj);
                            TagOrderConfirmationPresenter tagOrderConfirmationPresenter = (TagOrderConfirmationPresenter) this.L$0;
                            this.label = 1;
                            if (TagOrderConfirmationPresenter.access$handleContinue(tagOrderConfirmationPresenter, this) == coroutineSingletons24) {
                                return coroutineSingletons24;
                            }
                        } else {
                            if (i30 != 1) {
                                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            SafeTrace.throwOnFailure(obj);
                        }
                        mutableState3.setValue(Boolean.FALSE);
                        return Unit.INSTANCE;
                    } catch (Throwable th2) {
                        mutableState3.setValue(Boolean.FALSE);
                        throw th2;
                    }
                case 24:
                    SceneUpdate sceneUpdate = (SceneUpdate) this.L$0;
                    CoroutineSingletons coroutineSingletons25 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i31 = this.label;
                    if (i31 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        CardModelView.ViewModel viewModel = sceneUpdate.viewModel;
                        Quat quat = sceneUpdate.rotation;
                        Vector4 vector4 = sceneUpdate.position;
                        EquatableBitmap equatableBitmap = sceneUpdate.customizationOverride;
                        CardScene cardScene = (CardScene) this.this$0;
                        this.L$0 = null;
                        this.label = 1;
                        if (cardScene.updateCard(viewModel, quat, vector4, equatableBitmap, this) == coroutineSingletons25) {
                            return coroutineSingletons25;
                        }
                    } else {
                        if (i31 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 25:
                    CoroutineSingletons coroutineSingletons26 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i32 = this.label;
                    if (i32 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        FlowKt__MergeKt$flatMapConcat$$inlined$map$1 flowKt__MergeKt$flatMapConcat$$inlined$map$12 = new FlowKt__MergeKt$flatMapConcat$$inlined$map$1(new PageFetcher$flow$1.AnonymousClass1(i3, objArr9 == true ? 1 : 0, i), (MutableSharedFlow) this.L$0);
                        Hero3DCardViewKt$InteractiveCard$12$1$4$1$2.AnonymousClass4 anonymousClass4 = new Hero3DCardViewKt$InteractiveCard$12$1$4$1$2.AnonymousClass4((CardWobbleState) this.this$0, objArr8 == true ? 1 : 0, c4 == true ? 1 : 0);
                        this.label = 1;
                        if (FlowKt.collectLatest(flowKt__MergeKt$flatMapConcat$$inlined$map$12, anonymousClass4, this) == coroutineSingletons26) {
                            return coroutineSingletons26;
                        }
                    } else {
                        if (i32 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 26:
                    CoroutineSingletons coroutineSingletons27 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i33 = this.label;
                    if (i33 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        SafeFlow snapshotFlow = Updater.snapshotFlow(new NavHostKt$$ExternalSyntheticLambda8((androidx.compose.runtime.State) this.L$0, 18));
                        CardSceneEffectKt$CardSceneEffect$6$1$2 cardSceneEffectKt$CardSceneEffect$6$1$2 = new CardSceneEffectKt$CardSceneEffect$6$1$2((CardScene) this.this$0, continuation, c5 == true ? 1 : 0);
                        this.label = 1;
                        if (FlowKt.collectLatest(snapshotFlow, cardSceneEffectKt$CardSceneEffect$6$1$2, this) == coroutineSingletons27) {
                            return coroutineSingletons27;
                        }
                    } else {
                        if (i33 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                case 27:
                    return invokeSuspend$com$squareup$cash$card$onboarding$core$HeatMaskRenderer$startRenderLoop$1(obj);
                case 28:
                    CoroutineSingletons coroutineSingletons28 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i34 = this.label;
                    if (i34 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        SafeFlow snapshotFlow2 = Updater.snapshotFlow(new CardLockViewKt$$ExternalSyntheticLambda1((Animatable) this.L$0, i5));
                        CardGridNuxKt$CardGridNux$6$3$1$3 cardGridNuxKt$CardGridNux$6$3$1$3 = new CardGridNuxKt$CardGridNux$6$3$1$3((CardGridNuxScene) this.this$0, c6 == true ? 1 : 0);
                        this.label = 1;
                        if (snapshotFlow2.collect(cardGridNuxKt$CardGridNux$6$3$1$3, this) == coroutineSingletons28) {
                            return coroutineSingletons28;
                        }
                    } else {
                        if (i34 != 1) {
                            a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        SafeTrace.throwOnFailure(obj);
                    }
                    return Unit.INSTANCE;
                default:
                    CoroutineSingletons coroutineSingletons29 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    SafeTrace.throwOnFailure(obj);
                    Bitmap bitmap = (Bitmap) this.this$0;
                    int[] iArr = new int[1];
                    GLES20.glGenTextures(1, iArr, 0);
                    GLES20.glActiveTexture(34000);
                    GLES20.glBindTexture(3553, iArr[0]);
                    GLES20.glPixelStorei(3317, 1);
                    GLUtils.texImage2D(3553, 0, bitmap, 0);
                    GLES20.glTexParameteri(3553, 10241, 9729);
                    GLES20.glTexParameteri(3553, 10240, 9729);
                    GLES20.glTexParameteri(3553, 10242, 10497);
                    GLES20.glTexParameteri(3553, 10243, 10497);
                    int i35 = iArr[0];
                    ((Bitmap) this.this$0).recycle();
                    ContouredTextMaterial contouredTextMaterial = ((ContouredTextRing) this.L$0).material;
                    contouredTextMaterial.textureId = i35;
                    SharedFlowImpl sharedFlowImpl3 = contouredTextMaterial._dirty;
                    Unit unit = Unit.INSTANCE;
                    sharedFlowImpl3.tryEmit(unit);
                    ((ContouredTextRing) this.L$0).textureId = i35;
                    int i36 = this.label;
                    if (i36 > 0) {
                        GLES20.glDeleteTextures(1, new int[]{i36}, 0);
                    }
                    return unit;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(FormBlockerView formBlockerView, Ui.EventReceiver eventReceiver, Continuation continuation) {
            super(2, continuation);
            this.$r8$classId = 7;
            this.this$0 = formBlockerView;
            this.L$0 = eventReceiver;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass2(Object obj, Object obj2, int i, Continuation continuation, int i2) {
            super(2, continuation);
            this.$r8$classId = i2;
            this.L$0 = obj;
            this.this$0 = obj2;
            this.label = i;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass2(Object obj, Object obj2, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.L$0 = obj;
            this.this$0 = obj2;
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass2(Object obj, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.this$0 = obj;
        }
    }
}
