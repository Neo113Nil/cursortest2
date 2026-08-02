package app.cash.local.views.wallet;

import androidx.camera.camera2.pipe.core.Debug;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.animation.EnterExitState;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.CubicBezierEasing;
import androidx.compose.animation.core.EasingKt;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.animation.core.Transition;
import androidx.compose.animation.core.TweenSpec;
import androidx.compose.animation.core.TwoWayConverterImpl;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.WindowInsetsHolder;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.material3.ThumbNode$$ExternalSyntheticLambda0;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.snapshots.Snapshot;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.graphics.drawscope.DrawScope;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.res.PrimitiveResources_androidKt;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.SpanStyle;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.intl.LocaleList;
import androidx.compose.ui.text.style.BaselineShift;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import app.cash.broadway.ui.compose.ChromeConfigKt;
import app.cash.broadway.ui.compose.ChromeSystemIconColor;
import app.cash.broadway.ui.compose.UiScopeKt;
import app.cash.local.viewmodels.LocalBottomModalViewModel;
import app.cash.local.viewmodels.LocalBrandLocationsBottomSheetModel$Location;
import app.cash.local.viewmodels.LocalMenuComboDetailsViewModel;
import app.cash.local.viewmodels.wallet.LocalHomeViewModel;
import app.cash.local.views.brand.menu.LocalCaloriesTextKt;
import app.cash.local.views.fulfillment.FulfillmentRadioCellKt;
import app.cash.local.views.internal.LocalMapKt;
import app.cash.local.views.map.LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$8;
import app.cash.local.views.sheet.LoyaltySheetKt;
import app.cash.molecule.PlatformKt;
import app.cash.versioned.Versioned;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.svg.internal.ParseSvg_androidKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.android.gms.dynamite.zzg;
import com.google.mlkit.common.internal.zzc;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.account.components.accountswitcher.ManagedAccountSwitchLoadingContentKt;
import com.squareup.cash.account.screens.ManagedAccountAnimationInfo;
import com.squareup.cash.advertising.views.FullscreenAdViewKt;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader;
import com.squareup.cash.afterpayapplet.views.homesection.v3.AfterpayCardKt;
import com.squareup.cash.amountchooser.views.AmountKeypadState;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.bitcoin.viewmodels.MoveBitcoinModel;
import com.squareup.cash.bitcoin.views.send.MoveBitcoinViewKt;
import com.squareup.cash.blockers.viewmodels.EarnerEnrollmentBlockerViewModel;
import com.squareup.cash.blockers.viewmodels.PasscodeViewModel;
import com.squareup.cash.blockers.viewmodels.StatusResultViewModel;
import com.squareup.cash.blockers.views.SetPinViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.blockers.views.SsnViewKt;
import com.squareup.cash.card.onboarding.CanvasKt;
import com.squareup.cash.card.onboarding.CollapsibleDetailsSection;
import com.squareup.cash.card.onboarding.pdp.HeroSectionKt;
import com.squareup.cash.charting.components.SegmentedBarChartKt;
import com.squareup.cash.charting.viewmodels.SegmentedBarChartViewModel;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda7;
import com.squareup.cash.composeUi.foundation.text.MarkdownSpanValues;
import com.squareup.cash.db2.recipients.RecipientQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.deposits.physical.viewmodels.barcode.PaperMoneyDepositBarcodeViewModel;
import com.squareup.cash.earnings.viewmodels.payers.PayerCustomerRowModel;
import com.squareup.cash.earnings.views.payers.AddPayerCustomersViewKt;
import com.squareup.cash.formview.components.arcade.ArcadeFormEmojiPickerKt;
import com.squareup.cash.formview.components.arcade.ArcadeFormTextKt;
import com.squareup.cash.formview.components.arcade.ArcadeSelectableRow;
import com.squareup.cash.formview.components.arcade.SelectableRowViewModel;
import com.squareup.cash.growtools.viewmodels.manager.GrowToolsManagerViewModel;
import com.squareup.cash.instruments.screens.TransferOptionPickerDisplayIcon;
import com.squareup.cash.limits.viewmodels.LimitViewModel;
import com.squareup.cash.money.booklet.CollapsibleDetailsSection;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda11;
import com.squareup.cash.moneybot.backend.api.model.chat.clientrenderable.SlotContent;
import com.squareup.cash.moneybot.viewmodels.MoneybotHomeViewModel;
import com.squareup.cash.moneybot.views.plugins.TextCardKt;
import com.squareup.cash.music.views.MusicViewKt$$ExternalSyntheticLambda7;
import com.squareup.cash.nfc.views.NfcNotAvailableKt$$ExternalSyntheticLambda0;
import com.squareup.cash.paychecks.views.HelpSheetViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.paymentpad.viewmodels.LitePaymentPadViewModel;
import com.squareup.cash.paymentpad.viewmodels.PaymentPadTheme;
import com.squareup.cash.paymentpad.views.HomeViewKt;
import com.squareup.cash.paymentpad.views.HomeViewKt$$ExternalSyntheticLambda8;
import com.squareup.cash.paymentpad.views.LitePaymentPadEntranceAnimation;
import com.squareup.cash.paymentpad.views.LitePaymentPadKt$blockHiddenContentInput$1;
import com.squareup.cash.payments.viewmodels.QuickPayViewModel;
import com.squareup.cash.payments.views.MainPaymentView$Content$2$1;
import com.squareup.cash.payments.views.QuickPayViewKt;
import com.squareup.cash.payments.views.UtilKt$$ExternalSyntheticLambda0;
import com.squareup.cash.pools.views.PoolListSectionKt$$ExternalSyntheticLambda8;
import com.squareup.cash.tabs.views.TabToolbarsKt;
import com.squareup.cash.tax.views.TaxToolTipViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.ui.widget.amount.AmountConfig;
import com.squareup.cash.wallet.data.TagFormFactor;
import com.squareup.protos.cash.local.client.v1.SchedulingTime;
import com.squareup.protos.franklin.api.FormBlocker;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.WeakHashMap;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.RangesKt___RangesKt;
import kotlin.reflect.jvm.KTypesJvm;
import org.apache.commons.imaging.formats.jpeg.JpegConstants;
import org.bouncycastle.asn1.cmc.BodyPartID;
import papa.InteractionResult;
import string.ReplaceModeKt;

/* loaded from: classes3.dex */
public final /* synthetic */ class TabContentViewKt$$ExternalSyntheticLambda26 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ boolean f$1;
    public final /* synthetic */ Object f$2;

    public /* synthetic */ TabContentViewKt$$ExternalSyntheticLambda26(PasscodeViewModel passcodeViewModel, boolean z, Function1 function1) {
        this.$r8$classId = 11;
        this.f$0 = passcodeViewModel;
        this.f$1 = z;
        this.f$2 = function1;
    }

    private final Object invoke$com$squareup$cash$paymentpad$views$LitePaymentPadKt$$ExternalSyntheticLambda0(Object obj, Object obj2) {
        boolean z;
        Applier applier;
        boolean z2;
        Object m;
        boolean z3;
        Object m2;
        boolean z4;
        Object m3;
        Modifier.Companion companion;
        LitePaymentPadViewModel litePaymentPadViewModel;
        LitePaymentPadViewModel litePaymentPadViewModel2 = (LitePaymentPadViewModel) this.f$0;
        Function1 function1 = (Function1) this.f$2;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        GapComposer gapComposer = (GapComposer) composer;
        boolean shouldExecute = gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2);
        Applier applier2 = gapComposer.applier;
        if (shouldExecute) {
            PaymentPadTheme paymentPadTheme = PaymentPadTheme.GREEN;
            ChromeSystemIconColor systemIconColors = HomeViewKt.systemIconColors(paymentPadTheme);
            ChromeSystemIconColor systemIconColors2 = HomeViewKt.systemIconColors(paymentPadTheme);
            Boolean bool = Boolean.TRUE;
            ChromeConfigKt.ChromeConfig(null, systemIconColors, systemIconColors2, bool, null, null, null, gapComposer, 3072, 113);
            long j = Strings.getColors(gapComposer).surface.keypad.text;
            Density density = (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity);
            CubicBezierEasing cubicBezierEasing = LitePaymentPadEntranceAnimation.BLOOM_EXPANSION_EASING;
            gapComposer.startReplaceGroup(581133344);
            long mo238toSp0xMU5do = density.mo238toSp0xMU5do(PrimitiveResources_androidKt.dimensionResource(gapComposer, R.dimen.payment_pad_amount_text_size));
            gapComposer.end(false);
            AmountKeypadState rememberAmountKeypadState = Debug.rememberAmountKeypadState(new AmountConfig.MoneyConfig(litePaymentPadViewModel2.currencyCode, null, false, 0, 14), litePaymentPadViewModel2.rawAmount, gapComposer, 8, 28);
            AnimatedVisibilityScope animatedVisibilityScope = (AnimatedVisibilityScope) gapComposer.consume(UiScopeKt.LocalContainerAnimatedVisibilityScope);
            Transition transition = animatedVisibilityScope != null ? animatedVisibilityScope.getTransition() : null;
            boolean z5 = this.f$1;
            boolean changed = gapComposer.changed(z5) | gapComposer.changed(transition);
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj3 = Composer.Companion.Empty;
            if (changed || rememberedValue == obj3) {
                if (z5 && transition != null) {
                    Object currentState = transition.transitionState.getCurrentState();
                    EnterExitState enterExitState = EnterExitState.Visible;
                    if (currentState != enterExitState && transition.targetState$delegate.getValue() == enterExitState) {
                        z = true;
                        rememberedValue = Boolean.valueOf(z);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                }
                z = false;
                rememberedValue = Boolean.valueOf(z);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            boolean booleanValue = ((Boolean) rememberedValue).booleanValue();
            boolean changed2 = gapComposer.changed(booleanValue);
            Object rememberedValue2 = gapComposer.rememberedValue();
            Object obj4 = rememberedValue2;
            if (changed2 || rememberedValue2 == obj3) {
                MutableTransitionState mutableTransitionState = new MutableTransitionState(Boolean.valueOf(!booleanValue));
                mutableTransitionState.setTargetState(bool);
                gapComposer.updateRememberedValue(mutableTransitionState);
                obj4 = mutableTransitionState;
            }
            MutableTransitionState mutableTransitionState2 = (MutableTransitionState) obj4;
            Transition updateTransition = AnimatableKt.updateTransition(mutableTransitionState2, "lite_payment_pad_entrance", gapComposer, 48);
            TwoWayConverterImpl twoWayConverterImpl = AnimatableKt.FloatToVector;
            boolean isSeeking = updateTransition.isSeeking();
            InteractionResult interactionResult = updateTransition.transitionState;
            if (isSeeking) {
                applier = applier2;
                z2 = false;
                m = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, 1666827533, false, interactionResult);
            } else {
                gapComposer.startReplaceGroup(1666573488);
                boolean changed3 = gapComposer.changed(updateTransition);
                m = gapComposer.rememberedValue();
                if (changed3 || m == obj3) {
                    Snapshot currentThreadSnapshot = zzg.getCurrentThreadSnapshot();
                    Function1 readObserver = currentThreadSnapshot != null ? currentThreadSnapshot.getReadObserver() : null;
                    Snapshot makeCurrentNonObservable = zzg.makeCurrentNonObservable(currentThreadSnapshot);
                    applier = applier2;
                    try {
                        Object currentState2 = interactionResult.getCurrentState();
                        zzg.restoreNonObservable(currentThreadSnapshot, makeCurrentNonObservable, readObserver);
                        gapComposer.updateRememberedValue(currentState2);
                        m = currentState2;
                    } finally {
                    }
                } else {
                    applier = applier2;
                }
                z2 = false;
                gapComposer.end(false);
            }
            boolean booleanValue2 = ((Boolean) m).booleanValue();
            gapComposer.startReplaceGroup(-1877654766);
            float f = booleanValue2 ? 1.0f : RecyclerView.DECELERATION_RATE;
            gapComposer.end(z2);
            Float valueOf = Float.valueOf(f);
            boolean changed4 = gapComposer.changed(updateTransition);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changed4 || rememberedValue3 == obj3) {
                rememberedValue3 = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$8(updateTransition, 22));
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            boolean booleanValue3 = ((Boolean) ((State) rememberedValue3).getValue()).booleanValue();
            gapComposer.startReplaceGroup(-1877654766);
            float f2 = booleanValue3 ? 1.0f : RecyclerView.DECELERATION_RATE;
            gapComposer.end(false);
            Float valueOf2 = Float.valueOf(f2);
            boolean changed5 = gapComposer.changed(updateTransition);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (changed5 || rememberedValue4 == obj3) {
                rememberedValue4 = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$8(updateTransition, 23));
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            ((Transition.Segment) ((State) rememberedValue4).getValue()).getClass();
            gapComposer.startReplaceGroup(1527390509);
            TweenSpec tween$default = AnimatableKt.tween$default(280, 0, LitePaymentPadEntranceAnimation.BLOOM_EXPANSION_EASING, 2);
            gapComposer.end(false);
            Transition.TransitionAnimationState createTransitionAnimation = AnimatableKt.createTransitionAnimation(updateTransition, valueOf, valueOf2, tween$default, twoWayConverterImpl, gapComposer, 196608);
            if (updateTransition.isSeeking()) {
                z3 = false;
                m2 = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, 1666827533, false, interactionResult);
            } else {
                gapComposer.startReplaceGroup(1666573488);
                boolean changed6 = gapComposer.changed(updateTransition);
                m2 = gapComposer.rememberedValue();
                if (changed6 || m2 == obj3) {
                    Snapshot currentThreadSnapshot2 = zzg.getCurrentThreadSnapshot();
                    Function1 readObserver2 = currentThreadSnapshot2 != null ? currentThreadSnapshot2.getReadObserver() : null;
                    Snapshot makeCurrentNonObservable2 = zzg.makeCurrentNonObservable(currentThreadSnapshot2);
                    try {
                        Object currentState3 = interactionResult.getCurrentState();
                        zzg.restoreNonObservable(currentThreadSnapshot2, makeCurrentNonObservable2, readObserver2);
                        gapComposer.updateRememberedValue(currentState3);
                        m2 = currentState3;
                    } finally {
                    }
                }
                z3 = false;
                gapComposer.end(false);
            }
            boolean booleanValue4 = ((Boolean) m2).booleanValue();
            gapComposer.startReplaceGroup(-1890203761);
            float f3 = booleanValue4 ? 1.0f : RecyclerView.DECELERATION_RATE;
            gapComposer.end(z3);
            Float valueOf3 = Float.valueOf(f3);
            boolean changed7 = gapComposer.changed(updateTransition);
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (changed7 || rememberedValue5 == obj3) {
                rememberedValue5 = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$8(updateTransition, 24));
                gapComposer.updateRememberedValue(rememberedValue5);
            }
            boolean booleanValue5 = ((Boolean) ((State) rememberedValue5).getValue()).booleanValue();
            gapComposer.startReplaceGroup(-1890203761);
            float f4 = booleanValue5 ? 1.0f : RecyclerView.DECELERATION_RATE;
            gapComposer.end(false);
            Float valueOf4 = Float.valueOf(f4);
            boolean changed8 = gapComposer.changed(updateTransition);
            Object rememberedValue6 = gapComposer.rememberedValue();
            if (changed8 || rememberedValue6 == obj3) {
                rememberedValue6 = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$8(updateTransition, 25));
                gapComposer.updateRememberedValue(rememberedValue6);
            }
            ((Transition.Segment) ((State) rememberedValue6).getValue()).getClass();
            gapComposer.startReplaceGroup(1267677716);
            Drop$$ExternalSyntheticBUOutline0 drop$$ExternalSyntheticBUOutline0 = EasingKt.LinearEasing;
            TweenSpec tweenSpec = new TweenSpec(EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE, EnumC0170g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE, drop$$ExternalSyntheticBUOutline0);
            gapComposer.end(false);
            Object createTransitionAnimation2 = AnimatableKt.createTransitionAnimation(updateTransition, valueOf3, valueOf4, tweenSpec, twoWayConverterImpl, gapComposer, 196608);
            if (updateTransition.isSeeking()) {
                z4 = false;
                m3 = Request$Priority$EnumUnboxingLocalUtility.m(gapComposer, 1666827533, false, interactionResult);
            } else {
                gapComposer.startReplaceGroup(1666573488);
                boolean changed9 = gapComposer.changed(updateTransition);
                m3 = gapComposer.rememberedValue();
                if (changed9 || m3 == obj3) {
                    Snapshot currentThreadSnapshot3 = zzg.getCurrentThreadSnapshot();
                    Function1 readObserver3 = currentThreadSnapshot3 != null ? currentThreadSnapshot3.getReadObserver() : null;
                    Snapshot makeCurrentNonObservable3 = zzg.makeCurrentNonObservable(currentThreadSnapshot3);
                    try {
                        Object currentState4 = interactionResult.getCurrentState();
                        zzg.restoreNonObservable(currentThreadSnapshot3, makeCurrentNonObservable3, readObserver3);
                        gapComposer.updateRememberedValue(currentState4);
                        m3 = currentState4;
                    } finally {
                    }
                }
                gapComposer.end(false);
                z4 = false;
            }
            boolean booleanValue6 = ((Boolean) m3).booleanValue();
            gapComposer.startReplaceGroup(-1848112401);
            float f5 = booleanValue6 ? 1.0f : RecyclerView.DECELERATION_RATE;
            gapComposer.end(z4);
            Float valueOf5 = Float.valueOf(f5);
            boolean changed10 = gapComposer.changed(updateTransition);
            Object rememberedValue7 = gapComposer.rememberedValue();
            if (changed10 || rememberedValue7 == obj3) {
                rememberedValue7 = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$8(updateTransition, 26));
                gapComposer.updateRememberedValue(rememberedValue7);
            }
            boolean booleanValue7 = ((Boolean) ((State) rememberedValue7).getValue()).booleanValue();
            gapComposer.startReplaceGroup(-1848112401);
            float f6 = booleanValue7 ? 1.0f : RecyclerView.DECELERATION_RATE;
            gapComposer.end(false);
            Float valueOf6 = Float.valueOf(f6);
            boolean changed11 = gapComposer.changed(updateTransition);
            Object rememberedValue8 = gapComposer.rememberedValue();
            if (changed11 || rememberedValue8 == obj3) {
                rememberedValue8 = Updater.derivedStateOf(new LocalMapPinKt$LocalMapPinFpGtcJw$$inlined$animateDp$8(updateTransition, 27));
                gapComposer.updateRememberedValue(rememberedValue8);
            }
            ((Transition.Segment) ((State) rememberedValue8).getValue()).getClass();
            gapComposer.startReplaceGroup(1520447668);
            TweenSpec tweenSpec2 = new TweenSpec(340, EnumC0170g.SDK_ASSET_HEADER_NOT_LISTED_ERROR_VALUE, drop$$ExternalSyntheticBUOutline0);
            gapComposer.end(false);
            Object createTransitionAnimation3 = AnimatableKt.createTransitionAnimation(updateTransition, valueOf5, valueOf6, tweenSpec2, twoWayConverterImpl, gapComposer, 196608);
            boolean z6 = Intrinsics.areEqual(mutableTransitionState2.currentState$delegate.getValue(), mutableTransitionState2.targetState$delegate.getValue()) && !((Boolean) ((ParcelableSnapshotMutableState) mutableTransitionState2.$$delegate_0).getValue()).booleanValue() && ((Boolean) mutableTransitionState2.currentState$delegate.getValue()).booleanValue();
            float mo236toPx0680j_4 = density.mo236toPx0680j_4(LitePaymentPadEntranceAnimation.CONTENT_INITIAL_OFFSET);
            final float mo236toPx0680j_42 = density.mo236toPx0680j_4(32.0f);
            WeakHashMap weakHashMap = WindowInsetsHolder.viewMap;
            float f7 = Arrangement$End$1.current(gapComposer).navigationBars.getInsets$foundation_layout().bottom;
            gapComposer.startReplaceGroup(581215012);
            Strings.getSizes(gapComposer).getClass();
            zzc zzcVar = DefaultSizes.spacing;
            zzcVar.getClass();
            float mo236toPx0680j_43 = density.mo236toPx0680j_4(48.0f);
            gapComposer.end(false);
            final float f8 = mo236toPx0680j_43 + f7;
            final long j2 = Strings.getColors(gapComposer).surface.keypad.background;
            Versioned versioned = litePaymentPadViewModel2.amountErrorTrigger;
            boolean changedInstance = gapComposer.changedInstance(litePaymentPadViewModel2) | gapComposer.changed(rememberAmountKeypadState);
            Object rememberedValue9 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue9 == obj3) {
                rememberedValue9 = new MainPaymentView$Content$2$1(litePaymentPadViewModel2, rememberAmountKeypadState, null, 8);
                gapComposer.updateRememberedValue(rememberedValue9);
            }
            Updater.LaunchedEffect(gapComposer, versioned, (Function2) rememberedValue9);
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion2, 1.0f);
            final float floatValue = ((Number) createTransitionAnimation.value$delegate.getValue()).floatValue();
            fillMaxSize.getClass();
            Modifier drawBehind = ClipKt.drawBehind(fillMaxSize, new Function1() { // from class: com.squareup.cash.paymentpad.views.LitePaymentPadEntranceAnimationKt$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj5) {
                    DrawScope drawScope = (DrawScope) obj5;
                    drawScope.getClass();
                    float intBitsToFloat = Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32)) / 2.0f;
                    long floatToRawIntBits = (Float.floatToRawIntBits(Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() & BodyPartID.bodyIdMax)) - f8) & BodyPartID.bodyIdMax) | (Float.floatToRawIntBits(intBitsToFloat) << 32);
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (floatToRawIntBits >> 32));
                    float intBitsToFloat3 = Float.intBitsToFloat((int) (floatToRawIntBits & BodyPartID.bodyIdMax));
                    float intBitsToFloat4 = Float.intBitsToFloat((int) (drawScope.mo753getSizeNHjbRc() >> 32));
                    float intBitsToFloat5 = Float.intBitsToFloat((int) (BodyPartID.bodyIdMax & drawScope.mo753getSizeNHjbRc()));
                    float f9 = intBitsToFloat2 * intBitsToFloat2;
                    float f10 = intBitsToFloat3 * intBitsToFloat3;
                    float sqrt = (float) Math.sqrt(f10 + f9);
                    float f11 = intBitsToFloat4 - intBitsToFloat2;
                    float f12 = f11 * f11;
                    float f13 = intBitsToFloat5 - intBitsToFloat3;
                    float f14 = f13 * f13;
                    float[] fArr = {(float) Math.sqrt(f10 + f12), (float) Math.sqrt(f9 + f14), (float) Math.sqrt(f14 + f12)};
                    for (int i = 0; i < 3; i++) {
                        sqrt = Math.max(sqrt, fArr[i]);
                    }
                    float coerceIn = RangesKt___RangesKt.coerceIn(floatValue, RecyclerView.DECELERATION_RATE, 1.0f);
                    float f15 = mo236toPx0680j_42;
                    DrawScope.m738drawCircleVaOC9Bg$default(drawScope, j2, CameraState$Type$EnumUnboxingLocalUtility.m(sqrt + 1.0f, f15, coerceIn, f15), floatToRawIntBits, null, 0, 120);
                    return Unit.INSTANCE;
                }
            });
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, drawBehind);
            ComposeUiNode.Companion.getClass();
            Function0 function0 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(function0);
            } else {
                gapComposer.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf7 = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf7, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            boolean z7 = z6;
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            gapComposer.startReplaceGroup(1716809406);
            Modifier fillMaxSize2 = SizeKt.fillMaxSize(companion2, 1.0f);
            if (z7) {
                companion = companion2;
                litePaymentPadViewModel = litePaymentPadViewModel2;
            } else {
                Object rememberedValue10 = gapComposer.rememberedValue();
                if (rememberedValue10 == obj3) {
                    litePaymentPadViewModel = litePaymentPadViewModel2;
                    rememberedValue10 = new HelpSheetViewKt$$ExternalSyntheticLambda4(29);
                    gapComposer.updateRememberedValue(rememberedValue10);
                } else {
                    litePaymentPadViewModel = litePaymentPadViewModel2;
                }
                companion = companion2;
                fillMaxSize2 = fillMaxSize2.then(SuspendingPointerInputFilterKt.pointerInput(SemanticsModifierKt.clearAndSetSemantics(companion2, (Function1) rememberedValue10), Unit.INSTANCE, LitePaymentPadKt$blockHiddenContentInput$1.INSTANCE));
            }
            gapComposer.end(false);
            boolean changed12 = gapComposer.changed(createTransitionAnimation2) | gapComposer.changed(mo236toPx0680j_4) | gapComposer.changed(createTransitionAnimation3);
            Object rememberedValue11 = gapComposer.rememberedValue();
            int i = 9;
            if (changed12 || rememberedValue11 == obj3) {
                rememberedValue11 = new ThumbNode$$ExternalSyntheticLambda0(mo236toPx0680j_4, createTransitionAnimation2, createTransitionAnimation3, i);
                gapComposer.updateRememberedValue(rememberedValue11);
            }
            Modifier graphicsLayer = ColorKt.graphicsLayer(fillMaxSize2, (Function1) rememberedValue11);
            Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
            BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, graphicsLayer);
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(function0);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            NavigationType navigationType = NavigationType.CLOSE;
            boolean changed13 = gapComposer.changed(function1);
            Object rememberedValue12 = gapComposer.rememberedValue();
            if (changed13 || rememberedValue12 == obj3) {
                rememberedValue12 = new HomeViewKt$$ExternalSyntheticLambda8(9, function1);
                gapComposer.updateRememberedValue(rememberedValue12);
            }
            DBUtil.TitleBarSub((String) null, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue12, (Modifier) null, Expect_jvmKt.rememberComposableLambda(-729158059, new MusicViewKt$$ExternalSyntheticLambda7(27, function1), gapComposer), gapComposer, 1572918, 44);
            ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
            Modifier.Companion companion3 = companion;
            Modifier weight = columnScopeInstance.weight(1.0f, companion3, true);
            Strings.getSizes(gapComposer).getClass();
            zzcVar.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(weight, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, 0);
            int hashCode3 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(function0);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier3, composeUiNode$Companion$SetModifier$14);
            LitePaymentPadViewModel litePaymentPadViewModel3 = litePaymentPadViewModel;
            String str = litePaymentPadViewModel3.errorMessage;
            AnimatedContentKt.AnimatedVisibility(columnScopeInstance, !(str == null || str.length() == 0), null, EnterExitTransitionKt.fadeIn$default(null, 3).plus(EnterExitTransitionKt.slideInVertically$default(3, null)), EnterExitTransitionKt.fadeOut$default(null, 3).plus(EnterExitTransitionKt.slideOutVertically$default(3, null)), null, Expect_jvmKt.rememberComposableLambda(-1515981210, new PoolListSectionKt$$ExternalSyntheticLambda8(litePaymentPadViewModel3, j, 8), gapComposer), gapComposer, 1600518, 18);
            gapComposer.startMovableGroup(-188912926, litePaymentPadViewModel3.currencyCode);
            Modifier weight2 = columnScopeInstance.weight(1.0f, companion3, true);
            boolean changed14 = gapComposer.changed(function1);
            Object rememberedValue13 = gapComposer.rememberedValue();
            if (changed14 || rememberedValue13 == obj3) {
                rememberedValue13 = new UtilKt$$ExternalSyntheticLambda0(11, function1);
                gapComposer.updateRememberedValue(rememberedValue13);
            }
            ReplaceModeKt.m4397AmountKeypadVjY4oTo(rememberAmountKeypadState, (Function1) rememberedValue13, weight2, j, j, HomeViewKt.f544lambda$847551014, Expect_jvmKt.rememberComposableLambda(-1114600805, new TaxToolTipViewKt$$ExternalSyntheticLambda3(litePaymentPadViewModel3, j, function1, 7), gapComposer), 0, mo238toSp0xMU5do, gapComposer, 14155776, EnumC0170g.SDK_ASSET_ILLUSTRATION_CHECK_ALL_VALUE);
            gapComposer.end(false);
            Strings.getSizes(gapComposer).getClass();
            zzcVar.getClass();
            SpacerKt.Spacer(gapComposer, SizeKt.m277height3ABfNKs(companion3, 64.0f));
            ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion3, 1.0f);
            Strings.getSizes(gapComposer).getClass();
            zzcVar.getClass();
            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(fillMaxWidth, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 64.0f, 7);
            boolean changed15 = gapComposer.changed(function1);
            Object rememberedValue14 = gapComposer.rememberedValue();
            if (changed15 || rememberedValue14 == obj3) {
                rememberedValue14 = new HomeViewKt$$ExternalSyntheticLambda8(8, function1);
                gapComposer.updateRememberedValue(rememberedValue14);
            }
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue14, m302paddingqDBjuR0$default, buttonProminence, false, false, null, HomeViewKt.lambda$845028921, gapComposer, 1573248, 56);
            Boxes$$ExternalSyntheticOutline1.m(gapComposer, true, true, true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:239:0x0734  */
    /* JADX WARN: Removed duplicated region for block: B:242:0x0766  */
    /* JADX WARN: Removed duplicated region for block: B:265:0x07e2  */
    /* JADX WARN: Removed duplicated region for block: B:267:0x0737  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0397  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03db A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x039c  */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        float f;
        Function1 function1;
        long j;
        int i;
        Colors colors;
        boolean changed;
        Object rememberedValue;
        TextStyle textStyle;
        String str;
        int i2 = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        int i3 = 4;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
        Modifier modifier = Modifier.Companion.$$INSTANCE;
        boolean z = this.f$1;
        Object obj3 = this.f$2;
        Object obj4 = this.f$0;
        switch (i2) {
            case 0:
                ((Integer) obj2).getClass();
                LocalHomeViewKt.WalletWidgetContent((LocalHomeViewModel.TabContent.Widget) obj4, z, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                LocalCaloriesTextKt.ComboSlotOptionTrailingAccessory(z, (LocalMenuComboDetailsViewModel.ComboSlotOption.OptionType) obj4, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                FulfillmentRadioCellKt.SchedulingTimeRow((SchedulingTime) obj4, z, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                LocalMapKt.TitleView((LayoutWeightElement) obj4, z, (LocalBottomModalViewModel.Title) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                LoyaltySheetKt.FulfillmentPickupLocationRow((Modifier) obj4, (LocalBrandLocationsBottomSheetModel$Location) obj3, z, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                ManagedAccountSwitchLoadingContentKt.ManagedAccountSwitchLoadingContent((ManagedAccountAnimationInfo) obj4, z, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 6:
                AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardSection afterpayCardSection = (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardSection) obj4;
                Function1 function12 = (Function1) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardContent afterpayCardContent = afterpayCardSection.content;
                    AfterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader afterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader = afterpayCardSection.header;
                    AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.CardFooter cardFooter = afterpayCardSection.footer;
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(modifier, 1.0f);
                    if (afterpayCardContent instanceof AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardContent.ImageTextContent) {
                        AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardContent.ImageTextContent imageTextContent = (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardContent.ImageTextContent) afterpayCardContent;
                        if ((imageTextContent.image != null || imageTextContent.cashCard != null) && afterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader == null) {
                            f = 0.0f;
                            Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(fillMaxWidth, RecyclerView.DECELERATION_RATE, f, RecyclerView.DECELERATION_RATE, cardFooter != null ? 24.0f : 0.0f, 5);
                            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 48);
                            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
                            ComposeUiNode.Companion.getClass();
                            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                            if (gapComposer.applier != null) {
                                Updater.invalidApplier();
                                throw null;
                            }
                            gapComposer.startReusableNode();
                            if (gapComposer.inserting) {
                                gapComposer.createNode(layoutNode$Companion$Constructor$1);
                            } else {
                                gapComposer.useNode();
                            }
                            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                            if (afterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader == null) {
                                gapComposer.startReplaceGroup(-995090207);
                                gapComposer.end(false);
                            } else {
                                gapComposer.startReplaceGroup(-995090206);
                                AfterpayCardKt.CardHeaderContent(afterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader, z, function12, gapComposer, 0);
                                gapComposer.end(false);
                            }
                            AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardContent afterpayCardContent2 = afterpayCardSection.content;
                            if (afterpayCardContent2 == null) {
                                gapComposer.startReplaceGroup(-994904393);
                                gapComposer.end(false);
                            } else {
                                gapComposer.startReplaceGroup(-994904392);
                                AfterpayCardKt.CardBodyContent(afterpayCardContent2, cardFooter != null, function12, gapComposer, 0);
                                gapComposer.end(false);
                            }
                            if (cardFooter == null) {
                                gapComposer.startReplaceGroup(-994773046);
                            } else {
                                gapComposer.startReplaceGroup(-994773045);
                                AfterpayCardKt.CardFooterContent(cardFooter, function12, gapComposer, 0);
                            }
                            gapComposer.end(false);
                            gapComposer.end(true);
                        }
                    }
                    f = 24.0f;
                    Modifier m302paddingqDBjuR0$default2 = SpacerKt.m302paddingqDBjuR0$default(fillMaxWidth, RecyclerView.DECELERATION_RATE, f, RecyclerView.DECELERATION_RATE, cardFooter != null ? 24.0f : 0.0f, 5);
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 48);
                    int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default2);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer.applier != null) {
                    }
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                AfterpayCardKt.CardHeaderContent((AfterpayAppletHomeContentViewModel$HomeSection$SectionContent$CardHeader$StandardHeader) obj4, z, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                AfterpayCardKt.CardBodyContent((AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayCardContent) obj4, z, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                MoveBitcoinViewKt.MoveBitcoinContent((MoveBitcoinModel.Content) obj4, z, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                SsnViewKt.EarnerCategorySelectionRow((EarnerEnrollmentBlockerViewModel.CategorySelection.Category) obj4, z, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 11:
                PasscodeViewModel passcodeViewModel = (PasscodeViewModel) obj4;
                Function1 function13 = (Function1) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Modifier fillMaxSize = SizeKt.fillMaxSize(modifier, 1.0f);
                    Colors colors2 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    Strings.LoadableFullScreenContent(passcodeViewModel, this.f$1, SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxSize, colors2.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1)), null, null, Expect_jvmKt.rememberComposableLambda(629708311, new SetPinViewKt$$ExternalSyntheticLambda4(20, function13), gapComposer2), gapComposer2, 196608, 24);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                StatusResultViewModel statusResultViewModel = (StatusResultViewModel) obj4;
                Function1 function14 = (Function1) obj3;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    Modifier fillMaxSize2 = SizeKt.fillMaxSize(modifier, 1.0f);
                    Colors colors3 = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                    } else {
                        gapComposer3.startReplaceGroup(-1762997739);
                        gapComposer3.end(false);
                    }
                    Strings.LoadableFullScreenContent(statusResultViewModel, this.f$1, SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxSize2, colors3.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1)), null, null, Expect_jvmKt.rememberComposableLambda(1779279509, new SetPinViewKt$$ExternalSyntheticLambda4(24, function14), gapComposer3), gapComposer3, 196608, 24);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                CanvasKt.TagOrderConfirmationEffect(Updater.updateChangedFlags(1), (Composer) obj, (Modifier) obj3, (TagFormFactor) obj4, z);
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                HeroSectionKt.CollapsibleDetail((CollapsibleDetailsSection.CollapsibleDetail) obj4, z, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                SegmentedBarChartKt.CategoryLabel((SegmentedBarChartViewModel.Category) obj4, z, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 16:
                PaperMoneyDepositBarcodeViewModel paperMoneyDepositBarcodeViewModel = (PaperMoneyDepositBarcodeViewModel) obj4;
                Function1 function15 = (Function1) obj3;
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    Strings.getSizes(gapComposer4).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(modifier, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                    Strings.getSizes(gapComposer4).getClass();
                    Object obj5 = DefaultSizes.border.entries;
                    Modifier m302paddingqDBjuR0$default3 = SpacerKt.m302paddingqDBjuR0$default(ImageKt.m177backgroundbw27NRU(ClipKt.clip(m300paddingVpY3zN4$default, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f)), Strings.getColors(gapComposer4).semantic.background.f1047app, rectangleShapeKt$RectangleShape$1), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 12.0f, RecyclerView.DECELERATION_RATE, 11);
                    if (z) {
                        gapComposer4.startReplaceGroup(-774591417);
                    } else {
                        gapComposer4.startReplaceGroup(-774546157);
                        Strings.getSizes(gapComposer4).getClass();
                        modifier = SpacerKt.m300paddingVpY3zN4$default(modifier, RecyclerView.DECELERATION_RATE, 32.0f, 1);
                    }
                    gapComposer4.end(false);
                    Modifier then = m302paddingqDBjuR0$default3.then(modifier);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode3 = Long.hashCode(gapComposer4.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer4.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer4, then);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer4.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer4.startReusableNode();
                    if (gapComposer4.inserting) {
                        gapComposer4.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer4.useNode();
                    }
                    Updater.m576setimpl(gapComposer4, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer4, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer4, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer4, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer4, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                    long j2 = Strings.getColors(gapComposer4).semantic.text.subtle;
                    boolean changed2 = gapComposer4.changed(j2) | gapComposer4.changedInstance(paperMoneyDepositBarcodeViewModel) | gapComposer4.changed(function15);
                    Object rememberedValue2 = gapComposer4.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        CaptureCheckFaceKt$$ExternalSyntheticLambda7 captureCheckFaceKt$$ExternalSyntheticLambda7 = new CaptureCheckFaceKt$$ExternalSyntheticLambda7(j2, paperMoneyDepositBarcodeViewModel, function15, 4);
                        gapComposer4.updateRememberedValue(captureCheckFaceKt$$ExternalSyntheticLambda7);
                        rememberedValue2 = captureCheckFaceKt$$ExternalSyntheticLambda7;
                    }
                    Function1 function16 = (Function1) rememberedValue2;
                    boolean changedInstance = gapComposer4.changedInstance(paperMoneyDepositBarcodeViewModel);
                    Object rememberedValue3 = gapComposer4.rememberedValue();
                    if (changedInstance || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new RecipientQueries$$ExternalSyntheticLambda0(paperMoneyDepositBarcodeViewModel, 11);
                        gapComposer4.updateRememberedValue(rememberedValue3);
                    }
                    AndroidView_androidKt.AndroidView(function16, null, (Function1) rememberedValue3, gapComposer4, 0, 2);
                    gapComposer4.end(true);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                AddPayerCustomersViewKt.PayerCustomerRow((PayerCustomerRowModel) obj4, (Function1) obj3, z, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                ArcadeFormEmojiPickerKt.DisabledClickWrapper(z, (Function0) obj4, (ComposableLambdaImpl) obj3, (Composer) obj, Updater.updateChangedFlags(385));
                return Unit.INSTANCE;
            case 19:
                FormBlocker.Element.TextElement textElement = (FormBlocker.Element.TextElement) obj4;
                Function1 function17 = (Function1) obj3;
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTypography;
                    Typography typography = (Typography) gapComposer5.consume(staticProvidableCompositionLocal);
                    com.squareup.protos.cash.ui.Typography typography2 = textElement.typography;
                    TextStyle fromID = (typography2 == null || (str = typography2.arcade_id) == null) ? null : typography.fromID(str);
                    if (fromID == null) {
                        gapComposer5.startReplaceGroup(-1880693575);
                        FormBlocker.Element.TextElement.Size size = textElement.size;
                        size.getClass();
                        int i4 = ArcadeFormTextKt.WhenMappings.$EnumSwitchMapping$0[size.ordinal()];
                        if (i4 == 1) {
                            gapComposer5.startReplaceGroup(2049570323);
                            textStyle = ((Typography) gapComposer5.consume(staticProvidableCompositionLocal)).bodySmall;
                            gapComposer5.end(false);
                        } else if (i4 == 2) {
                            gapComposer5.startReplaceGroup(2049572628);
                            textStyle = ((Typography) gapComposer5.consume(staticProvidableCompositionLocal)).bodyMedium;
                            gapComposer5.end(false);
                        } else if (i4 == 3) {
                            gapComposer5.startReplaceGroup(2049574928);
                            textStyle = ((Typography) gapComposer5.consume(staticProvidableCompositionLocal)).header;
                            gapComposer5.end(false);
                        } else {
                            if (i4 != 4) {
                                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer5, 2049567913, false);
                            }
                            gapComposer5.startReplaceGroup(2049577294);
                            textStyle = ((Typography) gapComposer5.consume(staticProvidableCompositionLocal)).hero;
                            gapComposer5.end(false);
                        }
                        fromID = textStyle;
                        gapComposer5.end(false);
                    } else {
                        gapComposer5.startReplaceGroup(-337764431);
                        gapComposer5.end(false);
                    }
                    TextStyle textStyle2 = fromID;
                    FormBlocker.Element.TextElement.TextColor textColor = textElement.text_color;
                    int i5 = textColor == null ? -1 : ArcadeFormTextKt.WhenMappings.$EnumSwitchMapping$1[textColor.ordinal()];
                    if (i5 == -1 || i5 == 1) {
                        function1 = function17;
                        gapComposer5.startReplaceGroup(-1880165397);
                        FormBlocker.Element.TextElement.Size size2 = textElement.size;
                        size2.getClass();
                        int i6 = ArcadeFormTextKt.WhenMappings.$EnumSwitchMapping$0[size2.ordinal()];
                        if (i6 == 1) {
                            gapComposer5.startReplaceGroup(-337742475);
                            Colors colors4 = (Colors) gapComposer5.consume(ArcadeThemeKt.LocalColors);
                            if (colors4 == null) {
                                colors4 = re$$ExternalSyntheticOutline0.m(gapComposer5, -1762997026, gapComposer5, false);
                            } else {
                                gapComposer5.startReplaceGroup(-1762997739);
                                gapComposer5.end(false);
                            }
                            j = colors4.semantic.text.standard;
                            gapComposer5.end(false);
                        } else if (i6 == 2) {
                            gapComposer5.startReplaceGroup(-337739883);
                            Colors colors5 = (Colors) gapComposer5.consume(ArcadeThemeKt.LocalColors);
                            if (colors5 == null) {
                                colors5 = re$$ExternalSyntheticOutline0.m(gapComposer5, -1762997026, gapComposer5, false);
                            } else {
                                gapComposer5.startReplaceGroup(-1762997739);
                                gapComposer5.end(false);
                            }
                            j = colors5.semantic.text.standard;
                            gapComposer5.end(false);
                        } else if (i6 == 3) {
                            gapComposer5.startReplaceGroup(-337737323);
                            Colors colors6 = (Colors) gapComposer5.consume(ArcadeThemeKt.LocalColors);
                            if (colors6 == null) {
                                colors6 = re$$ExternalSyntheticOutline0.m(gapComposer5, -1762997026, gapComposer5, false);
                            } else {
                                gapComposer5.startReplaceGroup(-1762997739);
                                gapComposer5.end(false);
                            }
                            j = colors6.semantic.text.standard;
                            gapComposer5.end(false);
                        } else {
                            if (i6 != 4) {
                                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer5, -337745161, false);
                            }
                            gapComposer5.startReplaceGroup(-337734571);
                            Colors colors7 = (Colors) gapComposer5.consume(ArcadeThemeKt.LocalColors);
                            if (colors7 == null) {
                                colors7 = re$$ExternalSyntheticOutline0.m(gapComposer5, -1762997026, gapComposer5, false);
                            } else {
                                gapComposer5.startReplaceGroup(-1762997739);
                                gapComposer5.end(false);
                            }
                            j = colors7.semantic.text.standard;
                            gapComposer5.end(false);
                        }
                        gapComposer5.end(false);
                    } else if (i5 == 2) {
                        function1 = function17;
                        gapComposer5.startReplaceGroup(-337731212);
                        Colors colors8 = (Colors) gapComposer5.consume(ArcadeThemeKt.LocalColors);
                        if (colors8 == null) {
                            colors8 = re$$ExternalSyntheticOutline0.m(gapComposer5, -1762997026, gapComposer5, false);
                        } else {
                            gapComposer5.startReplaceGroup(-1762997739);
                            gapComposer5.end(false);
                        }
                        j = colors8.semantic.text.warning;
                        gapComposer5.end(false);
                    } else if (i5 == 3) {
                        function1 = function17;
                        gapComposer5.startReplaceGroup(-337728654);
                        Colors colors9 = (Colors) gapComposer5.consume(ArcadeThemeKt.LocalColors);
                        if (colors9 == null) {
                            colors9 = re$$ExternalSyntheticOutline0.m(gapComposer5, -1762997026, gapComposer5, false);
                        } else {
                            gapComposer5.startReplaceGroup(-1762997739);
                            gapComposer5.end(false);
                        }
                        j = colors9.semantic.text.brand;
                        gapComposer5.end(false);
                    } else {
                        if (i5 != 4) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer5, -337747846, false);
                        }
                        gapComposer5.startReplaceGroup(-337726061);
                        Colors colors10 = (Colors) gapComposer5.consume(ArcadeThemeKt.LocalColors);
                        if (colors10 == null) {
                            colors10 = re$$ExternalSyntheticOutline0.m(gapComposer5, -1762997026, gapComposer5, false);
                        } else {
                            gapComposer5.startReplaceGroup(-1762997739);
                            gapComposer5.end(false);
                        }
                        function1 = function17;
                        j = colors10.semantic.text.subtle;
                        gapComposer5.end(false);
                    }
                    long j3 = j;
                    FormBlocker.Element.TextElement.HorizontalAlignment horizontalAlignment = textElement.alignment;
                    int i7 = horizontalAlignment == null ? -1 : ArcadeFormTextKt.WhenMappings.$EnumSwitchMapping$2[horizontalAlignment.ordinal()];
                    if (i7 != -1) {
                        if (i7 != 1) {
                            if (i7 == 2) {
                                i = 3;
                            } else {
                                if (i7 != 3) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                i = 6;
                            }
                            String str2 = textElement.text;
                            str2.getClass();
                            colors = (Colors) gapComposer5.consume(ArcadeThemeKt.LocalColors);
                            if (colors != null) {
                                colors = re$$ExternalSyntheticOutline0.m(gapComposer5, -1762997026, gapComposer5, false);
                            } else {
                                gapComposer5.startReplaceGroup(-1762997739);
                                gapComposer5.end(false);
                            }
                            MarkdownSpanValues markdownSpanValues = new MarkdownSpanValues(new SpanStyle(colors.semantic.text.link, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, JpegConstants.COM_MARKER), 2);
                            Function1 function18 = function1;
                            changed = gapComposer5.changed(function18);
                            rememberedValue = gapComposer5.rememberedValue();
                            if (!changed || rememberedValue == neverEqualPolicy) {
                                rememberedValue = new NfcNotAvailableKt$$ExternalSyntheticLambda0(6, function18);
                                gapComposer5.updateRememberedValue(rememberedValue);
                            }
                            LazyDslKt.m305MultiblockMarkdown1kVgcOc(str2, (Function2) rememberedValue, Modifier.Companion.$$INSTANCE, textStyle2, j3, markdownSpanValues, i, null, gapComposer5, 0, 128);
                        }
                        i = 5;
                        String str22 = textElement.text;
                        str22.getClass();
                        colors = (Colors) gapComposer5.consume(ArcadeThemeKt.LocalColors);
                        if (colors != null) {
                        }
                        MarkdownSpanValues markdownSpanValues2 = new MarkdownSpanValues(new SpanStyle(colors.semantic.text.link, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, JpegConstants.COM_MARKER), 2);
                        Function1 function182 = function1;
                        changed = gapComposer5.changed(function182);
                        rememberedValue = gapComposer5.rememberedValue();
                        if (!changed) {
                        }
                        rememberedValue = new NfcNotAvailableKt$$ExternalSyntheticLambda0(6, function182);
                        gapComposer5.updateRememberedValue(rememberedValue);
                        LazyDslKt.m305MultiblockMarkdown1kVgcOc(str22, (Function2) rememberedValue, Modifier.Companion.$$INSTANCE, textStyle2, j3, markdownSpanValues2, i, null, gapComposer5, 0, 128);
                    } else {
                        if (textElement.size != FormBlocker.Element.TextElement.Size.SMALL || !z) {
                            i = 0;
                            String str222 = textElement.text;
                            str222.getClass();
                            colors = (Colors) gapComposer5.consume(ArcadeThemeKt.LocalColors);
                            if (colors != null) {
                            }
                            MarkdownSpanValues markdownSpanValues22 = new MarkdownSpanValues(new SpanStyle(colors.semantic.text.link, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, JpegConstants.COM_MARKER), 2);
                            Function1 function1822 = function1;
                            changed = gapComposer5.changed(function1822);
                            rememberedValue = gapComposer5.rememberedValue();
                            if (!changed) {
                            }
                            rememberedValue = new NfcNotAvailableKt$$ExternalSyntheticLambda0(6, function1822);
                            gapComposer5.updateRememberedValue(rememberedValue);
                            LazyDslKt.m305MultiblockMarkdown1kVgcOc(str222, (Function2) rememberedValue, Modifier.Companion.$$INSTANCE, textStyle2, j3, markdownSpanValues22, i, null, gapComposer5, 0, 128);
                        }
                        i = 5;
                        String str2222 = textElement.text;
                        str2222.getClass();
                        colors = (Colors) gapComposer5.consume(ArcadeThemeKt.LocalColors);
                        if (colors != null) {
                        }
                        MarkdownSpanValues markdownSpanValues222 = new MarkdownSpanValues(new SpanStyle(colors.semantic.text.link, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (BaselineShift) null, (TextGeometricTransform) null, (LocaleList) null, 0L, (TextDecoration) null, (Shadow) null, JpegConstants.COM_MARKER), 2);
                        Function1 function18222 = function1;
                        changed = gapComposer5.changed(function18222);
                        rememberedValue = gapComposer5.rememberedValue();
                        if (!changed) {
                        }
                        rememberedValue = new NfcNotAvailableKt$$ExternalSyntheticLambda0(6, function18222);
                        gapComposer5.updateRememberedValue(rememberedValue);
                        LazyDslKt.m305MultiblockMarkdown1kVgcOc(str2222, (Function2) rememberedValue, Modifier.Companion.$$INSTANCE, textStyle2, j3, markdownSpanValues222, i, null, gapComposer5, 0, 128);
                    }
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                ((ArcadeSelectableRow) obj4).LeadingIcon((SelectableRowViewModel.LeadingIcon.Small) obj3, z, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 21:
                ((Integer) obj2).getClass();
                KTypesJvm.GrowToolsAvatar((GrowToolsManagerViewModel.Loaded.Header.Target) obj4, (Modifier) obj3, z, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 22:
                ((Integer) obj2).getClass();
                ParseSvg_androidKt.FlatLimitSection((LimitViewModel) obj4, z, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                FullscreenAdViewKt.CollapsibleDetail((CollapsibleDetailsSection.CollapsibleDetail) obj4, z, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 24:
                MoneybotHomeViewModel moneybotHomeViewModel = (MoneybotHomeViewModel) obj4;
                Function1 function19 = (Function1) obj3;
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (!gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    gapComposer6.skipToGroupEnd();
                } else if (z) {
                    gapComposer6.startReplaceGroup(-1787160540);
                    TabToolbarsKt.SharedTabToolbarSpacer(6, 0, gapComposer6, SizeKt.fillMaxWidth(modifier, 1.0f));
                    gapComposer6.end(false);
                } else {
                    gapComposer6.startReplaceGroup(-1787038772);
                    UiScopeKt.UiScope(Expect_jvmKt.rememberComposableLambda(-1738189277, new MoneyTabUIKt$$ExternalSyntheticLambda11(i3, (Object) moneybotHomeViewModel, (Object) function19), gapComposer6), gapComposer6, 6);
                    gapComposer6.end(false);
                }
                return Unit.INSTANCE;
            case 25:
                ((Integer) obj2).getClass();
                TextCardKt.Bubble((SlotContent.ProgressRing.Content) obj4, z, (Modifier) obj3, (Composer) obj, Updater.updateChangedFlags(49));
                return Unit.INSTANCE;
            case 26:
                ((Integer) obj2).getClass();
                TextCardKt.Bubble((SlotContent.StackedImage.Content) obj4, (Modifier) obj3, z, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 27:
                ((Integer) obj2).getClass();
                TextCardKt.TransferOptionIcon((TransferOptionPickerDisplayIcon) obj4, (AvatarSize) obj3, z, (Composer) obj, Updater.updateChangedFlags(433));
                return Unit.INSTANCE;
            case 28:
                return invoke$com$squareup$cash$paymentpad$views$LitePaymentPadKt$$ExternalSyntheticLambda0(obj, obj2);
            default:
                ((Integer) obj2).getClass();
                QuickPayViewKt.Toolbar((QuickPayViewModel.ToolbarWithAvatarViewModel) obj4, z, (Function1) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ TabContentViewKt$$ExternalSyntheticLambda26(int i, int i2, Object obj, Function function, boolean z) {
        this.$r8$classId = i2;
        this.f$1 = z;
        this.f$0 = obj;
        this.f$2 = function;
    }

    public /* synthetic */ TabContentViewKt$$ExternalSyntheticLambda26(StatusResultViewModel statusResultViewModel, boolean z, Function1 function1) {
        this.$r8$classId = 12;
        this.f$0 = statusResultViewModel;
        this.f$1 = z;
        this.f$2 = function1;
    }

    public /* synthetic */ TabContentViewKt$$ExternalSyntheticLambda26(FormBlocker.Element.TextElement textElement, boolean z, Function1 function1) {
        this.$r8$classId = 19;
        this.f$0 = textElement;
        this.f$1 = z;
        this.f$2 = function1;
    }

    public /* synthetic */ TabContentViewKt$$ExternalSyntheticLambda26(Object obj, Object obj2, boolean z, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$1 = z;
    }

    public /* synthetic */ TabContentViewKt$$ExternalSyntheticLambda26(Object obj, boolean z, Object obj2, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = z;
        this.f$2 = obj2;
    }

    public /* synthetic */ TabContentViewKt$$ExternalSyntheticLambda26(Object obj, boolean z, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = z;
        this.f$2 = function1;
    }

    public /* synthetic */ TabContentViewKt$$ExternalSyntheticLambda26(boolean z, Object obj, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$1 = z;
        this.f$0 = obj;
        this.f$2 = function1;
    }
}
