package com.squareup.cash.common.composeui;

import android.content.Context;
import android.media.MediaPlayer;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.ui.hapticfeedback.PlatformHapticFeedback;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.broadway.navigation.Navigator;
import app.cash.broadway.screen.Screen;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.R;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.cdf.cash.CashDepositStart;
import com.squareup.cash.clientrouting.data.FeatureContext;
import com.squareup.cash.clientrouting.data.FeatureContextKt;
import com.squareup.cash.clientrouting.data.RoutingParams;
import com.squareup.cash.clientrouting.routers.transfers.AddCashRouter;
import com.squareup.cash.data.blockers.FlowStarter;
import com.squareup.cash.data.blockers.RealFlowStarter;
import com.squareup.cash.data.profile.JurisdictionConfigManager$JurisdictionConfig;
import com.squareup.cash.family.familyhub.views.AllowanceViewKt;
import com.squareup.cash.money.screens.MoneyTabScreen;
import com.squareup.cash.nearby.views.DotGridKt$DotGrid$3$1;
import com.squareup.cash.transfers.data.TransferData;
import com.squareup.cash.transfers.data.TransferSource;
import com.squareup.cash.transfers.screens.PendingTransfersConfirmationDialog;
import com.squareup.cash.util.money.Moneys;
import com.squareup.kotterknife.Lazy;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.protos.common.Money;
import com.squareup.protos.franklin.api.ClientScenario;
import java.util.Locale;
import kotlin.Pair;
import kotlin.Result;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class IconAnimationViewKt$IconAnimationView$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ Object $animationSpec;
    public final /* synthetic */ Object $circleAlphaAndScale;
    public Object $context;
    public final /* synthetic */ boolean $fadeOut;
    public final /* synthetic */ boolean $feedbackEnabled;
    public final /* synthetic */ Object $hapticFeedback;
    public final /* synthetic */ Object $iconAndTextAlphaAndScale;
    public final /* synthetic */ boolean $isPreviewMode;
    public final /* synthetic */ Object $onAnimationComplete;
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object $textTranslationY;
    public /* synthetic */ Object L$0;
    public int label;

    /* renamed from: com.squareup.cash.common.composeui.IconAnimationViewKt$IconAnimationView$1$1$1, reason: invalid class name */
    public final class AnonymousClass1 extends SuspendLambda implements Function2 {
        public final /* synthetic */ TweenSpec $animationSpec;
        public final /* synthetic */ Animatable $iconAndTextAlphaAndScale;
        public final /* synthetic */ int $r8$classId;
        public int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public /* synthetic */ AnonymousClass1(Animatable animatable, TweenSpec tweenSpec, Continuation continuation, int i) {
            super(2, continuation);
            this.$r8$classId = i;
            this.$iconAndTextAlphaAndScale = animatable;
            this.$animationSpec = tweenSpec;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            int i = this.$r8$classId;
            TweenSpec tweenSpec = this.$animationSpec;
            Animatable animatable = this.$iconAndTextAlphaAndScale;
            switch (i) {
                case 0:
                    return new AnonymousClass1(animatable, tweenSpec, continuation, 0);
                case 1:
                    return new AnonymousClass1(animatable, tweenSpec, continuation, 1);
                case 2:
                    return new AnonymousClass1(animatable, tweenSpec, continuation, 2);
                case 3:
                    return new AnonymousClass1(animatable, tweenSpec, continuation, 3);
                case 4:
                    return new AnonymousClass1(animatable, tweenSpec, continuation, 4);
                case 5:
                    return new AnonymousClass1(animatable, tweenSpec, continuation, 5);
                default:
                    return new AnonymousClass1(animatable, tweenSpec, continuation, 6);
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
            switch (this.$r8$classId) {
                case 0:
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i = this.label;
                    if (i == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Float f = new Float(1.0f);
                        this.label = 1;
                        if (Animatable.animateTo$default(this.$iconAndTextAlphaAndScale, f, this.$animationSpec, null, null, this, 12) == coroutineSingletons) {
                            break;
                        }
                    } else if (i != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 1:
                    CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i2 = this.label;
                    if (i2 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Float f2 = new Float(RecyclerView.DECELERATION_RATE);
                        this.label = 1;
                        if (Animatable.animateTo$default(this.$iconAndTextAlphaAndScale, f2, this.$animationSpec, null, null, this, 12) == coroutineSingletons2) {
                            break;
                        }
                    } else if (i2 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 2:
                    CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i3 = this.label;
                    if (i3 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Float f3 = new Float(RecyclerView.DECELERATION_RATE);
                        this.label = 1;
                        if (Animatable.animateTo$default(this.$iconAndTextAlphaAndScale, f3, this.$animationSpec, null, null, this, 12) == coroutineSingletons3) {
                            break;
                        }
                    } else if (i3 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 3:
                    CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i4 = this.label;
                    if (i4 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Float f4 = new Float(RecyclerView.DECELERATION_RATE);
                        this.label = 1;
                        if (Animatable.animateTo$default(this.$iconAndTextAlphaAndScale, f4, this.$animationSpec, null, null, this, 12) == coroutineSingletons4) {
                            break;
                        }
                    } else if (i4 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 4:
                    CoroutineSingletons coroutineSingletons5 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i5 = this.label;
                    if (i5 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Float f5 = new Float(AllowanceViewKt.access$randomFloat(0.93f, 0.97f));
                        this.label = 1;
                        if (Animatable.animateTo$default(this.$iconAndTextAlphaAndScale, f5, this.$animationSpec, null, null, this, 12) == coroutineSingletons5) {
                            break;
                        }
                    } else if (i5 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                case 5:
                    CoroutineSingletons coroutineSingletons6 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i6 = this.label;
                    if (i6 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Float f6 = new Float(AllowanceViewKt.access$randomFloat(-2.0f, 2.0f));
                        this.label = 1;
                        if (Animatable.animateTo$default(this.$iconAndTextAlphaAndScale, f6, this.$animationSpec, null, null, this, 12) == coroutineSingletons6) {
                            break;
                        }
                    } else if (i6 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
                default:
                    CoroutineSingletons coroutineSingletons7 = CoroutineSingletons.COROUTINE_SUSPENDED;
                    int i7 = this.label;
                    if (i7 == 0) {
                        SafeTrace.throwOnFailure(obj);
                        Float f7 = new Float(AllowanceViewKt.access$randomFloat(-0.5f, 0.5f));
                        this.label = 1;
                        if (Animatable.animateTo$default(this.$iconAndTextAlphaAndScale, f7, this.$animationSpec, null, null, this, 12) == coroutineSingletons7) {
                            break;
                        }
                    } else if (i7 != 1) {
                        a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                        break;
                    } else {
                        SafeTrace.throwOnFailure(obj);
                    }
                    break;
            }
            return Unit.INSTANCE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconAnimationViewKt$IconAnimationView$1$1(boolean z, boolean z2, Context context, Animatable animatable, TweenSpec tweenSpec, PlatformHapticFeedback platformHapticFeedback, boolean z3, Function0 function0, Animatable animatable2, Animatable animatable3, Continuation continuation) {
        super(2, continuation);
        this.$feedbackEnabled = z;
        this.$isPreviewMode = z2;
        this.$context = context;
        this.$circleAlphaAndScale = animatable;
        this.$animationSpec = tweenSpec;
        this.$hapticFeedback = platformHapticFeedback;
        this.$fadeOut = z3;
        this.$onAnimationComplete = function0;
        this.$iconAndTextAlphaAndScale = animatable2;
        this.$textTranslationY = animatable3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        Object obj2 = this.$onAnimationComplete;
        Object obj3 = this.$hapticFeedback;
        Object obj4 = this.$animationSpec;
        Object obj5 = this.$textTranslationY;
        Object obj6 = this.$iconAndTextAlphaAndScale;
        Object obj7 = this.$circleAlphaAndScale;
        switch (i) {
            case 0:
                IconAnimationViewKt$IconAnimationView$1$1 iconAnimationViewKt$IconAnimationView$1$1 = new IconAnimationViewKt$IconAnimationView$1$1(this.$feedbackEnabled, this.$isPreviewMode, (Context) this.$context, (Animatable) obj7, (TweenSpec) obj4, (PlatformHapticFeedback) obj3, this.$fadeOut, (Function0) obj2, (Animatable) obj6, (Animatable) obj5, continuation);
                iconAnimationViewKt$IconAnimationView$1$1.L$0 = obj;
                return iconAnimationViewKt$IconAnimationView$1$1;
            default:
                boolean z = this.$fadeOut;
                IconAnimationViewKt$IconAnimationView$1$1 iconAnimationViewKt$IconAnimationView$1$12 = new IconAnimationViewKt$IconAnimationView$1$1(this.$feedbackEnabled, (AddCashRouter) obj7, (Long) obj6, this.$isPreviewMode, (RoutingParams) obj5, (String) obj4, (String) obj3, (Money) obj2, z, continuation);
                iconAnimationViewKt$IconAnimationView$1$12.L$0 = obj;
                return iconAnimationViewKt$IconAnimationView$1$12;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((IconAnimationViewKt$IconAnimationView$1$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((IconAnimationViewKt$IconAnimationView$1$1) create((Pair) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x0267, code lost:
    
        if (kotlinx.coroutines.JobKt.delay(1000, r74) == r13) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x023b, code lost:
    
        r3 = r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x0239, code lost:
    
        if (androidx.compose.animation.core.Animatable.animateTo$default((androidx.compose.animation.core.Animatable) r14, r1, r2, null, null, r74, 12) == r13) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x0283, code lost:
    
        if (kotlinx.coroutines.JobKt.coroutineScope(r8, r74) == r3) goto L107;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons;
        TweenSpec tweenSpec;
        CoroutineSingletons coroutineSingletons2;
        CurrencyCode currencyCode;
        Screen screen;
        Object failure;
        Enum r0;
        Object checkPendingBeforeStartFlow$default;
        int i = this.$r8$classId;
        Object obj2 = this.$onAnimationComplete;
        Object obj3 = this.$hapticFeedback;
        Object obj4 = this.$animationSpec;
        boolean z = this.$isPreviewMode;
        boolean z2 = this.$feedbackEnabled;
        Object obj5 = this.$textTranslationY;
        Object obj6 = this.$iconAndTextAlphaAndScale;
        Object obj7 = this.$circleAlphaAndScale;
        switch (i) {
            case 0:
                Animatable animatable = (Animatable) obj6;
                TweenSpec tweenSpec2 = (TweenSpec) obj4;
                CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                Continuation continuation = null;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    if (z2 && !z) {
                        MediaPlayer.create((Context) this.$context, R.raw.notification_success).start();
                    }
                    this.L$0 = coroutineScope;
                    this.label = 1;
                    if (JobKt.delay(250L, this) == coroutineSingletons3) {
                        coroutineSingletons = coroutineSingletons3;
                        break;
                    }
                } else if (i2 == 1) {
                    SafeTrace.throwOnFailure(obj);
                } else if (i2 == 2) {
                    SafeTrace.throwOnFailure(obj);
                    coroutineSingletons2 = coroutineSingletons3;
                    tweenSpec = tweenSpec2;
                    int i3 = 0;
                    if (z2 && !z) {
                        ((PlatformHapticFeedback) obj3).m769performHapticFeedbackCdsT49E(0);
                    }
                    JobKt.launch$default(coroutineScope, null, null, new AnonymousClass1(animatable, tweenSpec, continuation, i3), 3);
                    JobKt.launch$default(coroutineScope, null, null, new AnonymousClass1((Animatable) obj5, tweenSpec, continuation, 1), 3);
                    this.L$0 = null;
                    this.label = 3;
                    break;
                } else if (i2 == 3) {
                    SafeTrace.throwOnFailure(obj);
                    coroutineSingletons2 = coroutineSingletons3;
                    tweenSpec = tweenSpec2;
                    if (this.$fadeOut) {
                        coroutineSingletons = coroutineSingletons2;
                        DotGridKt$DotGrid$3$1 dotGridKt$DotGrid$3$1 = new DotGridKt$DotGrid$3$1((Animatable) obj7, tweenSpec, animatable, continuation, 3);
                        this.L$0 = null;
                        this.label = 4;
                        break;
                    }
                    ((Function0) obj2).invoke();
                } else if (i2 != 4) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                    ((Function0) obj2).invoke();
                    break;
                }
                tweenSpec = tweenSpec2;
                Float f = new Float(1.0f);
                this.L$0 = coroutineScope;
                this.label = 2;
                coroutineSingletons2 = coroutineSingletons3;
                break;
            default:
                Long l = (Long) obj6;
                AddCashRouter addCashRouter = (AddCashRouter) obj7;
                Navigator navigator = addCashRouter.navigator;
                RoutingParams routingParams = (RoutingParams) obj5;
                Pair pair = (Pair) this.L$0;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    JurisdictionConfigManager$JurisdictionConfig jurisdictionConfigManager$JurisdictionConfig = (JurisdictionConfigManager$JurisdictionConfig) pair.first;
                    TransferData transferData = (TransferData) pair.second;
                    BlockersData.Flow.INSTANCE.getClass();
                    String generateToken = BlockersData.Flow.Companion.generateToken();
                    if (z2) {
                        addCashRouter.analytics.track(new CashDepositStart(generateToken), null);
                    }
                    if (jurisdictionConfigManager$JurisdictionConfig == null || (currencyCode = jurisdictionConfigManager$JurisdictionConfig.defaultCurrency) == null) {
                        currencyCode = CurrencyCode.USD;
                    }
                    Money zero = l == null ? Moneys.zero(currencyCode) : new Money(l, currencyCode, 4);
                    if (!z) {
                        if (!FeatureContextKt.isMoneybot(routingParams != null ? routingParams.featureContext : null)) {
                            if ((routingParams != null ? routingParams.origin : null) == null) {
                                navigator.goTo(new MoneyTabScreen(null));
                            }
                        }
                    }
                    Lazy lazy = addCashRouter.transfersInboundNavigator;
                    FlowStarter flowStarter = addCashRouter.flowStarter;
                    if (routingParams == null || (screen = routingParams.exitScreen) == null) {
                        screen = routingParams != null ? routingParams.origin : null;
                        if (screen == null) {
                            screen = new MoneyTabScreen(null);
                        }
                    }
                    Screen screen2 = screen;
                    FeatureContext featureContext = routingParams != null ? routingParams.featureContext : null;
                    FeatureContext.MoneybotChatContext moneybotChatContext = featureContext instanceof FeatureContext.MoneybotChatContext ? (FeatureContext.MoneybotChatContext) featureContext : null;
                    BlockersData startFlow$default = FlowStarter.startFlow$default((RealFlowStarter) flowStarter, BlockersData.Flow.TRANSFER, screen2, null, ClientScenario.TRANSFER_FUNDS, generateToken, null, null, moneybotChatContext != null ? new BlockersData.MoneybotContext(moneybotChatContext.sessionId, moneybotChatContext.toolRequestId) : null, null, 724);
                    String str = routingParams != null ? routingParams.source : null;
                    if (str != null) {
                        try {
                            Result.Companion companion = Result.Companion;
                            String upperCase = str.toUpperCase(Locale.ROOT);
                            upperCase.getClass();
                            failure = TransferSource.valueOf(upperCase);
                        } catch (Throwable th) {
                            Result.Companion companion2 = Result.Companion;
                            failure = new Result.Failure(th);
                        }
                        if (failure instanceof Result.Failure) {
                            failure = null;
                        }
                        r0 = (Enum) failure;
                    } else {
                        r0 = null;
                    }
                    TransferSource transferSource = (TransferSource) r0;
                    if (transferSource == null) {
                        transferSource = TransferSource.CLIENT_ROUTE;
                    }
                    this.L$0 = null;
                    this.$context = navigator;
                    this.label = 1;
                    lazy.getClass();
                    checkPendingBeforeStartFlow$default = Lazy.checkPendingBeforeStartFlow$default(lazy, BlockersData.copy$default(startFlow$default, null, null, null, null, null, null, null, null, false, false, null, null, null, false, null, null, null, null, null, null, null, null, null, null, null, null, null, false, null, TransferData.copy$default(transferData, null, null, null, null, null, null, transferSource, null, 24575), null, null, null, null, null, null, null, null, null, false, null, null, null, -1, 65531), zero, (String) obj4, PendingTransfersConfirmationDialog.Destination.ADD_MONEY, null, (String) obj3, (Money) obj2, this.$fadeOut, 16);
                    if (checkPendingBeforeStartFlow$default == coroutineSingletons4) {
                        break;
                    }
                } else if (i4 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    navigator = (Navigator) this.$context;
                    SafeTrace.throwOnFailure(obj);
                    checkPendingBeforeStartFlow$default = obj;
                }
                navigator.goTo((Screen) checkPendingBeforeStartFlow$default);
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public IconAnimationViewKt$IconAnimationView$1$1(boolean z, AddCashRouter addCashRouter, Long l, boolean z2, RoutingParams routingParams, String str, String str2, Money money, boolean z3, Continuation continuation) {
        super(2, continuation);
        this.$feedbackEnabled = z;
        this.$circleAlphaAndScale = addCashRouter;
        this.$iconAndTextAlphaAndScale = l;
        this.$isPreviewMode = z2;
        this.$textTranslationY = routingParams;
        this.$animationSpec = str;
        this.$hapticFeedback = str2;
        this.$onAnimationComplete = money;
        this.$fadeOut = z3;
    }
}
