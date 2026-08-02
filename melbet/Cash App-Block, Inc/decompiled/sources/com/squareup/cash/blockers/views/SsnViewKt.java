package com.squareup.cash.blockers.views;

import android.content.Context;
import android.content.res.Configuration;
import android.text.SpannableStringBuilder;
import android.text.SpannedString;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import androidx.camera.core.AspectRatio;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.core.TransitionKt$$ExternalSyntheticLambda9;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.text.BasicTextFieldKt;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.foundation.text.input.InputTransformation;
import androidx.compose.foundation.text.input.TextFieldBuffer;
import androidx.compose.foundation.text.input.TextFieldLineLimits;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.internal.PartialGapBuffer;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.runtime.saveable.Saver;
import androidx.compose.runtime.saveable.SaverKt;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusTraversalKt;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.CompositionLocalsKt;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.unit.Density;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.broadway.ui.compose.DialogEventHandlerKt;
import app.cash.broadway.ui.compose.SecureScreenKt;
import app.cash.broadway.ui.compose.UiScopeKt;
import app.cash.local.views.brand.orders.OrderStatusRowKt$$ExternalSyntheticLambda1;
import app.cash.local.views.internal.DismissableToastKt$$ExternalSyntheticLambda3;
import app.cash.local.views.toolbar.LocalToolbarKt$$ExternalSyntheticLambda1;
import app.cash.local.views.wallet.LocalHomeViewKt$$ExternalSyntheticLambda0;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda26;
import app.cash.molecule.PlatformKt;
import app.cash.versioned.Versioned;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import coil3.size.DimensionKt;
import com.google.accompanist.drawablepainter.DrawablePainterKt;
import com.google.android.gms.internal.mlkit_genai_prompt.zzacn;
import com.google.android.gms.internal.mlkit_genai_prompt.zzagj;
import com.google.mlkit.common.internal.zzd;
import com.plaid.internal.EnumC0170g;
import com.squareup.cardcustomizations.signature.SignatureState;
import com.squareup.cash.R;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.BadgeKt$$ExternalSyntheticLambda3;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.ScreenScaffoldKt;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.input.InputFieldKt;
import com.squareup.cash.arcade.components.internal.InputState;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt;
import com.squareup.cash.badging.db.BadgeQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.banking.views.BalanceHomeViewKt$$ExternalSyntheticLambda12;
import com.squareup.cash.blockers.viewmodels.BankAccountLinkingViewModel;
import com.squareup.cash.blockers.viewmodels.BirthdayViewModel;
import com.squareup.cash.blockers.viewmodels.CardActivationQrViewModel;
import com.squareup.cash.blockers.viewmodels.CashtagViewModel;
import com.squareup.cash.blockers.viewmodels.ConfirmCvvViewModel;
import com.squareup.cash.blockers.viewmodels.DisplayHelpItem;
import com.squareup.cash.blockers.viewmodels.EarnerEnrollmentBlockerViewModel;
import com.squareup.cash.blockers.viewmodels.GpsExplainerViewModel;
import com.squareup.cash.blockers.viewmodels.GpsLocationConsentBlockerViewModel;
import com.squareup.cash.blockers.viewmodels.HelpOptionsViewModel;
import com.squareup.cash.blockers.viewmodels.InputCardInfoViewModel;
import com.squareup.cash.blockers.viewmodels.OnboardingInternalRouteViewModel;
import com.squareup.cash.blockers.viewmodels.PasscodeViewModel;
import com.squareup.cash.blockers.viewmodels.ReferralCodeViewModel;
import com.squareup.cash.blockers.viewmodels.RequestPushNotificationsBlockerViewModel;
import com.squareup.cash.blockers.viewmodels.SavingsTransferOptionSelectionViewModel;
import com.squareup.cash.blockers.viewmodels.SetNameViewModel;
import com.squareup.cash.blockers.viewmodels.SetNameViewModel$Event$Done;
import com.squareup.cash.blockers.viewmodels.SetNameViewModel$Event$InputValidationFailed;
import com.squareup.cash.blockers.viewmodels.SetNameViewModel$Event$None;
import com.squareup.cash.blockers.viewmodels.SetNameViewModel$Event$ShowLoadingScreen;
import com.squareup.cash.blockers.viewmodels.SetNameViewModel$Event$SubmissionFailed;
import com.squareup.cash.blockers.viewmodels.SetNameViewModel$Event$Submitted;
import com.squareup.cash.blockers.viewmodels.SetPinViewModel;
import com.squareup.cash.blockers.viewmodels.SignatureViewModel;
import com.squareup.cash.blockers.viewmodels.SsnViewModel;
import com.squareup.cash.blockers.viewmodels.UnselectableOptionViewModel;
import com.squareup.cash.blockers.viewmodels.VerifyContactsViewModel;
import com.squareup.cash.blockers.viewmodels.VerifyHelpItem;
import com.squareup.cash.blockers.viewmodels.VerifyInstrumentModel;
import com.squareup.cash.blockers.views.CardState;
import com.squareup.cash.borrow.views.BorrowHomeKt$$ExternalSyntheticLambda0;
import com.squareup.cash.borrow.views.BulletinTileKt$$ExternalSyntheticLambda12;
import com.squareup.cash.borrow.views.BulletinTileKt$$ExternalSyntheticLambda9;
import com.squareup.cash.borrow.views.LimitHubIncreaseLimitSectionKt$$ExternalSyntheticLambda0;
import com.squareup.cash.card.onboarding.InteractiveCardView$flingTo$1;
import com.squareup.cash.checks.CheckDepositAmountKt$$ExternalSyntheticLambda1;
import com.squareup.cash.checks.CheckDepositAmountKt$$ExternalSyntheticLambda3;
import com.squareup.cash.checks.VerifyCheckDepositKt$$ExternalSyntheticLambda14;
import com.squareup.cash.common.composeui.LocalCashVibratorKt;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.dialog.ArcadeModal2Kt$$ExternalSyntheticLambda3;
import com.squareup.cash.directory_ui.views.SectionKt$$ExternalSyntheticLambda2;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda32;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.mooncake.components.MooncakePillButton;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.nfc.views.NfcNotAvailableKt$$ExternalSyntheticLambda1;
import com.squareup.cash.payments.views.ToViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.score.views.InfoSectionKt$$ExternalSyntheticLambda6;
import com.squareup.cash.scrubbing.CardNumberKt;
import com.squareup.cash.scrubbing.DateScrubber;
import com.squareup.cash.scrubbing.HyphenatingScrubber;
import com.squareup.cash.scrubbing.InsertingScrubber;
import com.squareup.cash.scrubbing.MaskVisualTransformation;
import com.squareup.cash.scrubbing.UsSsnScrubber;
import com.squareup.cash.securitysignals.ui.TouchRecorder;
import com.squareup.cash.sheet.BasicShieetKt$$ExternalSyntheticLambda0;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.franklin.api.HelpItem;
import com.squareup.protos.franklin.api.Region;
import com.squareup.util.android.Views;
import com.squareup.util.android.widget.ImageSpan;
import com.squareup.util.cash.Countries;
import com.squareup.util.compose.SharedViewEventsKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.internal.http2.Http2Connection$$ExternalSyntheticLambda3;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import papa.InputEventTrigger;

/* loaded from: classes4.dex */
public abstract class SsnViewKt {
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ca, code lost:
    
        if (new kotlin.ranges.IntRange(r16.minDigits, r16.maxDigits, 1).contains(((androidx.compose.ui.text.input.TextFieldValue) r12.getValue()).annotatedString.text.length()) != false) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BankAccountLinking(BankAccountLinkingViewModel bankAccountLinkingViewModel, Function1 function1, FocusRequester focusRequester, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer;
        Modifier modifier2;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-2097815519);
        int i2 = i | (gapComposer2.changedInstance(bankAccountLinkingViewModel) ? 4 : 2) | (gapComposer2.changedInstance(function1) ? 32 : 16) | (gapComposer2.changed(focusRequester) ? 256 : 128) | 3072;
        boolean z = true;
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Shaker rememberShaker = SharedViewEventsKt.rememberShaker(false, gapComposer2, 1);
            RealCashVibrator realCashVibrator = (RealCashVibrator) gapComposer2.consume(LocalCashVibratorKt.LocalCashVibrator);
            DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) gapComposer2.consume(CompositionLocalsKt.LocalSoftwareKeyboardController);
            BankAccountLinkingViewModel.Mode mode = bankAccountLinkingViewModel.mode;
            boolean z2 = bankAccountLinkingViewModel.loading;
            Versioned versioned = bankAccountLinkingViewModel.valid;
            Object[] objArr = {mode};
            boolean changedInstance = gapComposer2.changedInstance(bankAccountLinkingViewModel);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy) {
                rememberedValue = new ErrorView$$ExternalSyntheticLambda0(bankAccountLinkingViewModel, 22);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            MutableState rememberSaveable = SaverKt.rememberSaveable(objArr, (Saver) TextFieldValue.Saver, (Function0) rememberedValue, (Composer) gapComposer2, 0);
            boolean changed = gapComposer2.changed(bankAccountLinkingViewModel.mode.ordinal()) | gapComposer2.changed(z2) | gapComposer2.changed(versioned);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (changed || rememberedValue2 == neverEqualPolicy) {
                if (!z2 && ((Boolean) versioned.value).booleanValue()) {
                }
                z = false;
                rememberedValue2 = Recorder$$ExternalSyntheticOutline1.m(z, gapComposer2);
            }
            MutableState mutableState = (MutableState) rememberedValue2;
            Versioned versioned2 = bankAccountLinkingViewModel.errorMessage;
            boolean changedInstance2 = gapComposer2.changedInstance(bankAccountLinkingViewModel) | gapComposer2.changedInstance(rememberShaker) | gapComposer2.changedInstance(realCashVibrator);
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (changedInstance2 || rememberedValue3 == neverEqualPolicy) {
                SetNameViewKt$SetName$2$1 setNameViewKt$SetName$2$1 = new SetNameViewKt$SetName$2$1(bankAccountLinkingViewModel, rememberShaker, realCashVibrator, (Continuation) null, 18);
                gapComposer2.updateRememberedValue(setNameViewKt$SetName$2$1);
                rememberedValue3 = setNameViewKt$SetName$2$1;
            }
            Updater.LaunchedEffect(versioned2, versioned, (Function2) rememberedValue3, gapComposer2);
            gapComposer = gapComposer2;
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1545262764, new BasicShieetKt$$ExternalSyntheticLambda0(bankAccountLinkingViewModel, delegatingSoftwareKeyboardController, function1, rememberShaker, focusRequester, mutableState, rememberSaveable), gapComposer2), gapComposer, 3072, 7);
            modifier2 = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new VerifyCheckDepositKt$$ExternalSyntheticLambda14(bankAccountLinkingViewModel, i, function1, focusRequester, modifier2, 4);
        }
    }

    public static final void Birthday(BirthdayViewModel birthdayViewModel, Function1 function1, FocusRequester focusRequester, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer;
        Modifier modifier2;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1895010437);
        int i2 = i | (gapComposer2.changedInstance(birthdayViewModel) ? 4 : 2) | (gapComposer2.changedInstance(function1) ? 32 : 16) | (gapComposer2.changed(focusRequester) ? 256 : 128) | 3072;
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Object[] objArr = new Object[0];
            boolean changedInstance = gapComposer2.changedInstance(birthdayViewModel);
            Object rememberedValue = gapComposer2.rememberedValue();
            Object obj = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == obj) {
                rememberedValue = new ErrorView$$ExternalSyntheticLambda0(birthdayViewModel, 23);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            MutableState rememberSaveable = SaverKt.rememberSaveable(objArr, (Saver) TextFieldValue.Saver, (Function0) rememberedValue, (Composer) gapComposer2, 0);
            Object[] objArr2 = new Object[0];
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (rememberedValue2 == obj) {
                rememberedValue2 = new SsnViewKt$$ExternalSyntheticLambda0(15);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState = (MutableState) SaverKt.rememberSaveable(objArr2, (Function0) rememberedValue2, gapComposer2, 48);
            Shaker rememberShaker = SharedViewEventsKt.rememberShaker(false, gapComposer2, 1);
            boolean changed = gapComposer2.changed(birthdayViewModel.dateFormatIn);
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (changed || rememberedValue3 == obj) {
                rememberedValue3 = new DateScrubber(birthdayViewModel.dateFormatIn, DateScrubber.Type.PAST);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            DateScrubber dateScrubber = (DateScrubber) rememberedValue3;
            boolean changedInstance2 = gapComposer2.changedInstance(rememberShaker);
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (changedInstance2 || rememberedValue4 == obj) {
                rememberedValue4 = new CheckDepositAmountKt$$ExternalSyntheticLambda3(1, rememberShaker);
                gapComposer2.updateRememberedValue(rememberedValue4);
            }
            Function0 function0 = (Function0) rememberedValue4;
            dateScrubber.getClass();
            function0.getClass();
            dateScrubber.onInvalidContentListener = function0;
            Boolean valueOf = Boolean.valueOf(birthdayViewModel.lastSubmissionWasInvalid);
            boolean changedInstance3 = gapComposer2.changedInstance(birthdayViewModel) | gapComposer2.changedInstance(rememberShaker) | gapComposer2.changed(mutableState);
            Object rememberedValue5 = gapComposer2.rememberedValue();
            if (changedInstance3 || rememberedValue5 == obj) {
                Object setNameViewKt$SetName$2$1 = new SetNameViewKt$SetName$2$1(birthdayViewModel, rememberShaker, mutableState, (Continuation) null, 19);
                gapComposer2.updateRememberedValue(setNameViewKt$SetName$2$1);
                rememberedValue5 = setNameViewKt$SetName$2$1;
            }
            Updater.LaunchedEffect(gapComposer2, valueOf, (Function2) rememberedValue5);
            gapComposer = gapComposer2;
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-383263930, new BasicShieetKt$$ExternalSyntheticLambda0(birthdayViewModel, rememberShaker, focusRequester, function1, rememberSaveable, dateScrubber, mutableState), gapComposer2), gapComposer, 3072, 7);
            modifier2 = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new VerifyCheckDepositKt$$ExternalSyntheticLambda14(birthdayViewModel, i, function1, focusRequester, modifier2, 5);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00b6  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x021f  */
    /* JADX WARN: Removed duplicated region for block: B:66:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0210  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x006d  */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r6v4 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void BlockerSheetScaffold(PaddingValues paddingValues, NavigationType navigationType, Function0 function0, float f, Function2 function2, ComposableLambdaImpl composableLambdaImpl, Composer composer, int i, int i2) {
        PaddingValues paddingValues2;
        int i3;
        int i4;
        float f2;
        ComposableLambdaImpl composableLambdaImpl2;
        NavigationType navigationType2;
        Function0 function02;
        float f3;
        RecomposeScopeImpl endRestartGroup;
        int i5;
        int i6;
        Function0 function03;
        int i7;
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1;
        BiasAlignment.Horizontal horizontal;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        ?? r6;
        Function0 function04;
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1;
        float f4;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12;
        Function2 function22 = function2;
        paddingValues.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1964925739);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            paddingValues2 = paddingValues;
            i3 = (gapComposer.changed(paddingValues2) ? 4 : 2) | i;
        } else {
            paddingValues2 = paddingValues;
            i3 = i;
        }
        int i8 = i2 & 2;
        if (i8 != 0) {
            i3 |= 48;
        } else if ((i & 48) == 0) {
            i3 |= gapComposer.changed(navigationType == null ? -1 : navigationType.ordinal()) ? 32 : 16;
        }
        int i9 = i2 & 4;
        if (i9 != 0) {
            i3 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i3 |= gapComposer.changedInstance(function0) ? 256 : 128;
            i4 = i2 & 8;
            if (i4 == 0) {
                i3 |= 3072;
            } else if ((i & 3072) == 0) {
                f2 = f;
                i3 |= gapComposer.changed(f2) ? 2048 : 1024;
                if ((i & 24576) == 0) {
                    i3 |= gapComposer.changedInstance(function22) ? 16384 : PKIFailureInfo.certRevoked;
                }
                if ((196608 & i) == 0) {
                    i3 |= gapComposer.changedInstance(composableLambdaImpl) ? PKIFailureInfo.unsupportedVersion : 65536;
                }
                if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
                    if (i8 != 0) {
                        i5 = i9;
                        navigationType2 = null;
                    } else {
                        i5 = i9;
                        navigationType2 = navigationType;
                    }
                    if (i5 != 0) {
                        Object rememberedValue = gapComposer.rememberedValue();
                        if (rememberedValue == Composer.Companion.Empty) {
                            rememberedValue = new SsnViewKt$$ExternalSyntheticLambda0(16);
                            gapComposer.updateRememberedValue(rememberedValue);
                        }
                        function03 = (Function0) rememberedValue;
                        i6 = i4;
                    } else {
                        i6 = i4;
                        function03 = function0;
                    }
                    float f5 = i6 != 0 ? 0.95f : f2;
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(SizeKt.m279heightInVpY3zN4$default(SizeKt.fillMaxWidth(companion, 1.0f), RecyclerView.DECELERATION_RATE, ((Configuration) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalConfiguration)).screenHeightDp * f5, 1), RecyclerView.DECELERATION_RATE, paddingValues2.mo267calculateTopPaddingD9Ej5fM(), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                    Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
                    BiasAlignment.Horizontal horizontal2 = Alignment.Companion.Start;
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal2, gapComposer, 0);
                    Function0 function05 = function03;
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m302paddingqDBjuR0$default);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$13);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$14);
                    Integer valueOf = Integer.valueOf(hashCode);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$15);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$12);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$16);
                    if (navigationType2 == null) {
                        gapComposer.startReplaceGroup(-1507323576);
                        gapComposer.end(false);
                        i7 = i3;
                        composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$16;
                        ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                        r6 = 0;
                        horizontal = horizontal2;
                        function04 = function05;
                        layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                        f4 = f5;
                        composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$15;
                    } else {
                        gapComposer.startReplaceGroup(-1507323575);
                        int i10 = i3 & 896;
                        i7 = i3;
                        ownerSnapshotObserver$onCommitAffectingLayout$1 = ownerSnapshotObserver$onCommitAffectingLayout$12;
                        horizontal = horizontal2;
                        composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$16;
                        r6 = 0;
                        function04 = function05;
                        layoutNode$Companion$Constructor$1 = layoutNode$Companion$Constructor$12;
                        f4 = f5;
                        composeUiNode$Companion$SetModifier$12 = composeUiNode$Companion$SetModifier$15;
                        DBUtil.NavigationIcon(navigationType2, null, function04, gapComposer, i10, 2);
                        gapComposer.end(false);
                    }
                    ColumnScopeInstance columnScopeInstance = ColumnScopeInstance.INSTANCE;
                    Modifier verticalScroll$default = ImageKt.verticalScroll$default(columnScopeInstance.weight(1.0f, companion, r6), ImageKt.rememberScrollState(gapComposer), r6, 14);
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, r6);
                    int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, verticalScroll$default);
                    gapComposer.startReusableNode();
                    if (gapComposer.inserting) {
                        gapComposer.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer.useNode();
                    }
                    Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$13);
                    Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$14);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$12, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$1);
                    int i11 = i7 >> 12;
                    composableLambdaImpl2 = composableLambdaImpl;
                    Recorder$$ExternalSyntheticOutline1.m((i11 & 112) | 6, composableLambdaImpl2, columnScopeInstance, gapComposer, true);
                    if (function2 == null) {
                        gapComposer.startReplaceGroup(-1507094300);
                        gapComposer.end(r6);
                        function22 = function2;
                    } else {
                        gapComposer.startReplaceGroup(-1988278595);
                        function22 = function2;
                        Recorder$$ExternalSyntheticOutline1.m(i11 & 14, function22, gapComposer, (boolean) r6);
                    }
                    gapComposer.end(true);
                    f3 = f4;
                    function02 = function04;
                } else {
                    composableLambdaImpl2 = composableLambdaImpl;
                    gapComposer.skipToGroupEnd();
                    navigationType2 = navigationType;
                    function02 = function0;
                    f3 = f2;
                }
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new LocalToolbarKt$$ExternalSyntheticLambda1(paddingValues, navigationType2, function02, f3, function22, composableLambdaImpl2, i, i2);
                    return;
                }
                return;
            }
            f2 = f;
            if ((i & 24576) == 0) {
            }
            if ((196608 & i) == 0) {
            }
            if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup != null) {
            }
        }
        i4 = i2 & 8;
        if (i4 == 0) {
        }
        f2 = f;
        if ((i & 24576) == 0) {
        }
        if ((196608 & i) == 0) {
        }
        if (gapComposer.shouldExecute(i3 & 1, (74899 & i3) != 74898)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
        }
    }

    public static final void CardActivationQrScanner(CardActivationQrViewModel cardActivationQrViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1989166051);
        int i2 = (gapComposer.changedInstance(cardActivationQrViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState mutableState = (MutableState) rememberedValue;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = Boxes$$ExternalSyntheticOutline1.m(0, gapComposer);
            }
            ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) rememberedValue2;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = Updater.mutableStateOf$default(null);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(-180728866, new CardActivationQrScannerViewKt$$ExternalSyntheticLambda0(function1, (Density) gapComposer.consume(CompositionLocalsKt.LocalDensity), cardActivationQrViewModel, parcelableSnapshotMutableIntState, (MutableState) rememberedValue3, mutableState, 0), gapComposer), gapComposer, 6);
            modifier2 = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BirthdayView$$ExternalSyntheticLambda0(modifier2, cardActivationQrViewModel, function1, i, 14);
        }
    }

    public static final void Cashtag(CashtagViewModel cashtagViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        cashtagViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1095836997);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(cashtagViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        int i4 = 0;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            boolean z = cashtagViewModel.lookupViewModel.isLoading;
            Object[] objArr = new Object[0];
            boolean changedInstance = gapComposer.changedInstance(cashtagViewModel);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy) {
                rememberedValue = new ErrorView$$ExternalSyntheticLambda0(cashtagViewModel, 25);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            MutableState rememberSaveable = SaverKt.rememberSaveable(objArr, (Saver) TextFieldValue.Saver, (Function0) rememberedValue, (Composer) gapComposer, 0);
            Unit unit = Unit.INSTANCE;
            int i5 = i3 & 112;
            boolean changed = (i5 == 32) | gapComposer.changed(rememberSaveable);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new CashtagViewKt$Cashtag$1$1(function1, rememberSaveable, null, i4);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue2);
            boolean changed2 = gapComposer.changed(rememberSaveable) | (i5 == 32);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new CashMapViewKt$$ExternalSyntheticLambda3(function1, rememberSaveable, 5);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            DialogEventHandlerKt.DialogEventHandler((Function1) rememberedValue3, gapComposer, 0);
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1104117200, new LocalHomeViewKt$$ExternalSyntheticLambda0(z, cashtagViewModel, function1, rememberSaveable), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SetPinViewKt$$ExternalSyntheticLambda3((Object) cashtagViewModel, function1, (Object) modifier2, i, 24);
        }
    }

    public static final void ClientScenarioLauncherUi(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2006899821);
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier systemBarsPadding = SpacerKt.systemBarsPadding(SizeKt.fillMaxSize(ImageKt.m177backgroundbw27NRU(Modifier.Companion.$$INSTANCE, colors.semantic.background.f1047app, ColorKt.RectangleShape), 1.0f));
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, systemBarsPadding);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            ProgressCircularKt.ProgressCircular(0, 1, gapComposer, null);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new GetFlowLoadingViewKt$$ExternalSyntheticLambda0(i, 12);
        }
    }

    public static final void ConfirmCvv(ConfirmCvvViewModel confirmCvvViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        MutableState mutableState;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(781899187);
        int i2 = i | (gapComposer.changedInstance(confirmCvvViewModel) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m106m(gapComposer);
            }
            FocusRequester focusRequester = (FocusRequester) rememberedValue;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = Updater.mutableStateOf$default("");
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState2 = (MutableState) rememberedValue2;
            Unit unit = Unit.INSTANCE;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new SsnViewKt$SsnContent$3$1$1(focusRequester, null, 2);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue3);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors.semantic.background.f1047app;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m = BalanceFeedKt$$ExternalSyntheticOutline0.m(companion, j, rectangleShapeKt$RectangleShape$1, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
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
            DBUtil.TitleBarSub((String) null, NavigationType.NONE, (Modifier) null, (DynamicColorConfiguration) null, (Function0) null, (Modifier) null, (Function3) null, gapComposer, 54, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer, null);
            Countries.PageHeader(confirmCvvViewModel.title, (Modifier) null, (Function2) null, (String) null, gapComposer, 0, 14);
            DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer, null);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier focusRequester2 = FocusTraversalKt.focusRequester(SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), focusRequester);
            String str = (String) mutableState2.getValue();
            KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, 8, 6, (Boolean) null, 115);
            boolean changedInstance = gapComposer.changedInstance(confirmCvvViewModel) | ((i2 & 112) == 32);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = new BadgeQueries$$ExternalSyntheticLambda0(25, function1, confirmCvvViewModel);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            KeyboardActions keyboardActions = new KeyboardActions(null, (Function1) rememberedValue4, null, 59);
            boolean changedInstance2 = gapComposer.changedInstance(confirmCvvViewModel);
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (changedInstance2 || rememberedValue5 == neverEqualPolicy) {
                mutableState = mutableState2;
                rememberedValue5 = new BadgeQueries$$ExternalSyntheticLambda0(26, confirmCvvViewModel, mutableState);
                gapComposer.updateRememberedValue(rememberedValue5);
            } else {
                mutableState = mutableState2;
            }
            InputFieldKt.InputField(str, (Function1) rememberedValue5, focusRequester2, (InputState) null, (Function2) null, (Function2) null, (Function2) null, (Function3) null, (String) null, keyboardOptions, keyboardActions, (VisualTransformation) null, gapComposer, 805306368, 0, 2552);
            SpacerKt.Spacer(gapComposer, new LayoutWeightElement(1.0f, true));
            DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(-492760773, new SectionKt$$ExternalSyntheticLambda2(7, confirmCvvViewModel, function1, mutableState), gapComposer), gapComposer, 24576, 15);
            gapComposer = gapComposer;
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BirthdayView$$ExternalSyntheticLambda0(modifier2, confirmCvvViewModel, function1, i, 16);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0166  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0057  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void Content(SavingsTransferOptionSelectionViewModel.Content content, Function1 function1, Modifier modifier, Composer composer, int i, int i2) {
        Modifier modifier2;
        Modifier modifier3;
        GapComposer gapComposer;
        RecomposeScopeImpl endRestartGroup;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-118024914);
        final int i3 = 2;
        int i4 = (i & 6) == 0 ? (gapComposer2.changedInstance(content) ? 4 : 2) | i : i;
        int i5 = 32;
        if ((i & 48) == 0) {
            i4 |= gapComposer2.changedInstance(function1) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i4 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            modifier2 = modifier;
            i4 |= gapComposer2.changed(modifier2) ? 256 : 128;
            final int i7 = 0;
            final int i8 = 1;
            if (gapComposer2.shouldExecute(i4 & 1, (i4 & 147) == 146)) {
                gapComposer2.skipToGroupEnd();
                modifier3 = modifier2;
                gapComposer = gapComposer2;
            } else {
                Modifier modifier4 = i6 != 0 ? Modifier.Companion.$$INSTANCE : modifier2;
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
                int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, modifier4);
                ComposeUiNode.Companion.getClass();
                Function0 function0 = ComposeUiNode.Companion.Constructor;
                if (gapComposer2.applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer2.startReusableNode();
                if (gapComposer2.inserting) {
                    gapComposer2.createNode(function0);
                } else {
                    gapComposer2.useNode();
                }
                Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                Countries.PageHeader(content.title, (Modifier) null, (Function2) null, content.subtitle, gapComposer2, 0, 6);
                gapComposer2.startReplaceGroup(1870090562);
                GapComposer gapComposer3 = gapComposer2;
                for (final SavingsTransferOptionSelectionViewModel.Content.TransferOption transferOption : content.transferOptions) {
                    CellDefaultAccessory.Push push = CellDefaultAccessory.Push.INSTANCE;
                    boolean z = transferOption.isEnabled;
                    ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1038370357, new Function2() { // from class: com.squareup.cash.blockers.views.SavingsTransferOptionSelectionScreenKt$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i9 = i7;
                            SavingsTransferOptionSelectionViewModel.Content.TransferOption transferOption2 = transferOption;
                            switch (i9) {
                                case 0:
                                    Composer composer2 = (Composer) obj;
                                    int intValue = ((Integer) obj2).intValue();
                                    GapComposer gapComposer4 = (GapComposer) composer2;
                                    if (gapComposer4.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                        SavingsTransferOptionSelectionViewModel.Content.TransferOption.Icon icon = transferOption2.icon;
                                        if (icon instanceof SavingsTransferOptionSelectionViewModel.Content.TransferOption.GoalIcon) {
                                            gapComposer4.startReplaceGroup(1736940440);
                                            SavingsTransferOptionSelectionViewModel.Content.TransferOption.GoalIcon goalIcon = (SavingsTransferOptionSelectionViewModel.Content.TransferOption.GoalIcon) icon;
                                            VisibleKt.m3496ProgressEmojiIconLzaahlw(goalIcon.iconId, goalIcon.progress, AlphaKt.alpha(SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, 48.0f), transferOption2.isEnabled ? 1.0f : 0.4f), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 0L, 0L, 0L, gapComposer4, 0, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                                            gapComposer4.end(false);
                                        } else {
                                            if (!(icon instanceof SavingsTransferOptionSelectionViewModel.Content.TransferOption.AvatarIcon)) {
                                                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer4, 1441501345, false);
                                            }
                                            gapComposer4.startReplaceGroup(1737196066);
                                            TextViewKt.Avatar(AvatarSize.Size48, AvatarsKt.toAvatarEntry(((SavingsTransferOptionSelectionViewModel.Content.TransferOption.AvatarIcon) icon).uiAvatar, null, gapComposer4, 1), null, transferOption2.isEnabled, gapComposer4, 6, 20);
                                            gapComposer4.end(false);
                                        }
                                    } else {
                                        gapComposer4.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                case 1:
                                    Composer composer3 = (Composer) obj;
                                    int intValue2 = ((Integer) obj2).intValue();
                                    GapComposer gapComposer5 = (GapComposer) composer3;
                                    if (gapComposer5.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, transferOption2.label, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer5.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    Composer composer4 = (Composer) obj;
                                    int intValue3 = ((Integer) obj2).intValue();
                                    GapComposer gapComposer6 = (GapComposer) composer4;
                                    if (gapComposer6.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, transferOption2.body, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer6.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    }, gapComposer3);
                    ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-1910842732, new Function2() { // from class: com.squareup.cash.blockers.views.SavingsTransferOptionSelectionScreenKt$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i9 = i8;
                            SavingsTransferOptionSelectionViewModel.Content.TransferOption transferOption2 = transferOption;
                            switch (i9) {
                                case 0:
                                    Composer composer2 = (Composer) obj;
                                    int intValue = ((Integer) obj2).intValue();
                                    GapComposer gapComposer4 = (GapComposer) composer2;
                                    if (gapComposer4.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                        SavingsTransferOptionSelectionViewModel.Content.TransferOption.Icon icon = transferOption2.icon;
                                        if (icon instanceof SavingsTransferOptionSelectionViewModel.Content.TransferOption.GoalIcon) {
                                            gapComposer4.startReplaceGroup(1736940440);
                                            SavingsTransferOptionSelectionViewModel.Content.TransferOption.GoalIcon goalIcon = (SavingsTransferOptionSelectionViewModel.Content.TransferOption.GoalIcon) icon;
                                            VisibleKt.m3496ProgressEmojiIconLzaahlw(goalIcon.iconId, goalIcon.progress, AlphaKt.alpha(SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, 48.0f), transferOption2.isEnabled ? 1.0f : 0.4f), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 0L, 0L, 0L, gapComposer4, 0, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                                            gapComposer4.end(false);
                                        } else {
                                            if (!(icon instanceof SavingsTransferOptionSelectionViewModel.Content.TransferOption.AvatarIcon)) {
                                                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer4, 1441501345, false);
                                            }
                                            gapComposer4.startReplaceGroup(1737196066);
                                            TextViewKt.Avatar(AvatarSize.Size48, AvatarsKt.toAvatarEntry(((SavingsTransferOptionSelectionViewModel.Content.TransferOption.AvatarIcon) icon).uiAvatar, null, gapComposer4, 1), null, transferOption2.isEnabled, gapComposer4, 6, 20);
                                            gapComposer4.end(false);
                                        }
                                    } else {
                                        gapComposer4.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                case 1:
                                    Composer composer3 = (Composer) obj;
                                    int intValue2 = ((Integer) obj2).intValue();
                                    GapComposer gapComposer5 = (GapComposer) composer3;
                                    if (gapComposer5.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, transferOption2.label, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer5.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    Composer composer4 = (Composer) obj;
                                    int intValue3 = ((Integer) obj2).intValue();
                                    GapComposer gapComposer6 = (GapComposer) composer4;
                                    if (gapComposer6.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, transferOption2.body, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer6.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    }, gapComposer3);
                    int i9 = ((i4 & 112) == i5 ? i8 : i7) | (gapComposer3.changedInstance(transferOption) ? 1 : 0);
                    Object rememberedValue = gapComposer3.rememberedValue();
                    if (i9 != 0 || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new BulletinTileKt$$ExternalSyntheticLambda12(18, function1, transferOption);
                        gapComposer3.updateRememberedValue(rememberedValue);
                    }
                    GapComposer gapComposer4 = gapComposer3;
                    CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(rememberComposableLambda, rememberComposableLambda2, null, (Function0) rememberedValue, z, false, Expect_jvmKt.rememberComposableLambda(1868715214, new Function2() { // from class: com.squareup.cash.blockers.views.SavingsTransferOptionSelectionScreenKt$$ExternalSyntheticLambda12
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i92 = i3;
                            SavingsTransferOptionSelectionViewModel.Content.TransferOption transferOption2 = transferOption;
                            switch (i92) {
                                case 0:
                                    Composer composer2 = (Composer) obj;
                                    int intValue = ((Integer) obj2).intValue();
                                    GapComposer gapComposer42 = (GapComposer) composer2;
                                    if (gapComposer42.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                                        SavingsTransferOptionSelectionViewModel.Content.TransferOption.Icon icon = transferOption2.icon;
                                        if (icon instanceof SavingsTransferOptionSelectionViewModel.Content.TransferOption.GoalIcon) {
                                            gapComposer42.startReplaceGroup(1736940440);
                                            SavingsTransferOptionSelectionViewModel.Content.TransferOption.GoalIcon goalIcon = (SavingsTransferOptionSelectionViewModel.Content.TransferOption.GoalIcon) icon;
                                            VisibleKt.m3496ProgressEmojiIconLzaahlw(goalIcon.iconId, goalIcon.progress, AlphaKt.alpha(SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, 48.0f), transferOption2.isEnabled ? 1.0f : 0.4f), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 0L, 0L, 0L, gapComposer42, 0, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                                            gapComposer42.end(false);
                                        } else {
                                            if (!(icon instanceof SavingsTransferOptionSelectionViewModel.Content.TransferOption.AvatarIcon)) {
                                                throw Recorder$$ExternalSyntheticOutline2.m(gapComposer42, 1441501345, false);
                                            }
                                            gapComposer42.startReplaceGroup(1737196066);
                                            TextViewKt.Avatar(AvatarSize.Size48, AvatarsKt.toAvatarEntry(((SavingsTransferOptionSelectionViewModel.Content.TransferOption.AvatarIcon) icon).uiAvatar, null, gapComposer42, 1), null, transferOption2.isEnabled, gapComposer42, 6, 20);
                                            gapComposer42.end(false);
                                        }
                                    } else {
                                        gapComposer42.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                case 1:
                                    Composer composer3 = (Composer) obj;
                                    int intValue2 = ((Integer) obj2).intValue();
                                    GapComposer gapComposer5 = (GapComposer) composer3;
                                    if (gapComposer5.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, transferOption2.label, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer5.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                                default:
                                    Composer composer4 = (Composer) obj;
                                    int intValue3 = ((Integer) obj2).intValue();
                                    GapComposer gapComposer6 = (GapComposer) composer4;
                                    if (gapComposer6.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, transferOption2.body, (Map) null, (Function1) null, false);
                                    } else {
                                        gapComposer6.skipToGroupEnd();
                                    }
                                    return Unit.INSTANCE;
                            }
                        }
                    }, gapComposer3), null, push, 0L, gapComposer4, 817889334, 3412);
                    i7 = i7;
                    gapComposer3 = gapComposer4;
                    i5 = 32;
                    modifier4 = modifier4;
                    i3 = 2;
                    i8 = 1;
                }
                gapComposer3.end(i7);
                gapComposer3.end(true);
                modifier3 = modifier4;
                gapComposer = gapComposer3;
            }
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
                endRestartGroup.block = new OrderStatusRowKt$$ExternalSyntheticLambda1(content, function1, modifier3, i, i2, 23);
                return;
            }
            return;
        }
        modifier2 = modifier;
        final int i72 = 0;
        final int i82 = 1;
        if (gapComposer2.shouldExecute(i4 & 1, (i4 & 147) == 146)) {
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void DrawSignature(SignatureViewModel.Content content, Function1 function1, SignatureState signatureState, Composer composer, int i) {
        int i2;
        SignatureState signatureState2;
        boolean z;
        int i3;
        content.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2137245845);
        Applier applier = gapComposer.applier;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(content) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= (i & 512) == 0 ? gapComposer.changed(signatureState) : gapComposer.changedInstance(signatureState) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            gapComposer.startDefaults();
            if ((i & 1) != 0 && !gapComposer.getDefaultsInvalid()) {
                gapComposer.skipToGroupEnd();
            }
            gapComposer.endDefaults();
            long j = MooncakeTheme.getColors(gapComposer).background;
            RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(SpacerKt.systemBarsPadding(ImageKt.m177backgroundbw27NRU(companion, j, rectangleShapeKt$RectangleShape$1)), RecyclerView.DECELERATION_RATE, 24.0f, 1);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            int i4 = i2;
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            KeypadKt.m3651TextPdH14aY(1, 0, 0, 0, 196608, 0, 4050, MooncakeTheme.getColors(gapComposer).disabledLabel, (Composer) gapComposer, (Modifier) null, MooncakeTheme.getTypography(gapComposer).mainBody, (TextLineBalancing) null, content.title, (Map) null, (Function1) null, false);
            Painter rememberDrawablePainter = DrawablePainterKt.rememberDrawablePainter(PlatformKt.getDrawableCompat((Context) gapComposer.consume(AndroidCompositionLocals_androidKt.LocalContext), R.drawable.signature_background, null), gapComposer);
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(SizeKt.fillMaxSize(new LayoutWeightElement(0.33f, true), 1.0f), 44.0f, 24.0f);
            long j2 = MooncakeTheme.getColors(gapComposer).cardCustomizationStroke;
            AspectRatio.Signature(TestTagKt.testTag(ClipKt.paint$default(m299paddingVpY3zN4, rememberDrawablePainter, null, ContentScale.Companion.FillBounds, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j2, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j2), ColorKt.m693toAndroidBlendModes9anfk8(5))), 22), "SignatureArea"), false, ColorKt.m694toArgb8_81llA(MooncakeTheme.getColors(gapComposer).cardCustomizationStroke), 0, null, RecyclerView.DECELERATION_RATE, 10.0f, null, signatureState, gapComposer, 135790592 | ((i4 << 18) & 234881024), EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_ATOMIC_TEXT_VALUE);
            gapComposer = gapComposer;
            Modifier m300paddingVpY3zN4$default2 = SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion, 1.0f), 64.0f, RecyclerView.DECELERATION_RATE, 2);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.SpaceBetween, Alignment.Companion.CenterVertically, gapComposer, 54);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default2);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            String str = content.backLabel;
            MooncakePillButton.Style style = MooncakePillButton.Style.TERTIARY;
            int i5 = i4 & 112;
            boolean z2 = i5 == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z2 || rememberedValue == neverEqualPolicy) {
                rememberedValue = new SsnViewKt$$ExternalSyntheticLambda14(13, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            signatureState2 = signatureState;
            KeypadKt.m3640ButtonGFipHI0(str, (Function0) rememberedValue, null, null, null, style, null, false, 0, null, null, gapComposer, 196608, 0, 4060);
            int i6 = (i4 & 896) ^ MLKEMEngine.KyberPolyBytes;
            boolean z3 = (i6 > 256 && gapComposer.changed(signatureState2)) || (i4 & MLKEMEngine.KyberPolyBytes) == 256;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z3 || rememberedValue2 == neverEqualPolicy) {
                signatureState2.getClass();
                z = true;
                rememberedValue2 = Updater.derivedStateOf(new SignatureViewKt$$ExternalSyntheticLambda1(signatureState2, 1));
                gapComposer.updateRememberedValue(rememberedValue2);
            } else {
                z = true;
            }
            boolean booleanValue = ((Boolean) ((State) rememberedValue2).getValue()).booleanValue();
            boolean z4 = ((i6 <= 256 || !gapComposer.changedInstance(signatureState2)) && (i4 & MLKEMEngine.KyberPolyBytes) != 256) ? false : z;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (z4 || rememberedValue3 == neverEqualPolicy) {
                i3 = 0;
                rememberedValue3 = new SignatureViewKt$$ExternalSyntheticLambda1(signatureState2, 0);
                gapComposer.updateRememberedValue(rememberedValue3);
            } else {
                i3 = 0;
            }
            KeypadKt.IconButton((Function0) rememberedValue3, null, null, booleanValue, Expect_jvmKt.rememberComposableLambda(-1739807563, new SignatureViewKt$$ExternalSyntheticLambda2(booleanValue, i3), gapComposer), gapComposer, 24576, 6);
            String str2 = content.nextLabel;
            boolean z5 = (((i6 <= 256 || !gapComposer.changedInstance(signatureState2)) && (i4 & MLKEMEngine.KyberPolyBytes) != 256) ? false : z) | (i5 == 32 ? z : false);
            Object rememberedValue4 = gapComposer.rememberedValue();
            if (z5 || rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = new SignatureViewKt$$ExternalSyntheticLambda3(function1, signatureState2, 0);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            boolean z6 = z;
            KeypadKt.m3640ButtonGFipHI0(str2, (Function0) rememberedValue4, null, null, null, style, null, booleanValue, 0, null, null, gapComposer, 196608, 0, 3932);
            gapComposer.end(z6);
            gapComposer.end(z6);
        } else {
            signatureState2 = signatureState;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SetPinViewKt$$ExternalSyntheticLambda3((Object) content, function1, (Object) signatureState2, i, 29);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0052, code lost:
    
        if (r4 == null) goto L24;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void EarnerCategorySelectionRow(EarnerEnrollmentBlockerViewModel.CategorySelection.Category category, boolean z, Function0 function0, Composer composer, int i) {
        GapComposer gapComposer;
        Icons icons;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(931258444);
        int i2 = i | (gapComposer2.changedInstance(category) ? 4 : 2) | (gapComposer2.changed(z) ? 32 : 16) | (gapComposer2.changedInstance(function0) ? 256 : 128);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            String str = category.arcadeIconId;
            if (str != null) {
                Icons.Companion.getClass();
                icons = zzd.get(str);
            }
            icons = Icons.Business24;
            Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            int i3 = ((i2 << 12) & 3670016) | 805309488;
            gapComposer = gapComposer2;
            CellDefaultKt.m3391CellDefaultLargeIconaIPZJ5k(icons, null, colors.semantic.background.subtle, Expect_jvmKt.rememberComposableLambda(940582769, new CashtagViewKt$$ExternalSyntheticLambda10(category, 25), gapComposer2), null, 0L, function0, null, false, true, null, null, new CellDefaultAccessory.Radio(z), 0L, null, gapComposer, i3, 0, 28080);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TabContentViewKt$$ExternalSyntheticLambda26(category, z, function0, i, 10);
        }
    }

    public static final void EarnerEnrollmentCategoryContinueButton(EarnerEnrollmentBlockerViewModel.CategorySelection categorySelection, Function0 function0, Composer composer, int i) {
        Function0 function02;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(2109034077);
        int i2 = (gapComposer.changedInstance(categorySelection) ? 4 : 2) | i | (gapComposer.changedInstance(function0) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            function02 = function0;
            coil3.size.SizeKt.ButtonCta(function02, SizeKt.fillMaxWidth(Modifier.Companion.$$INSTANCE, 1.0f), ButtonProminence.PROMINENT, false, categorySelection.selectedCategory != null, null, Expect_jvmKt.rememberComposableLambda(-1828012584, new SsnViewKt$$ExternalSyntheticLambda2(categorySelection, 17), gapComposer), gapComposer, ((i2 >> 3) & 14) | 1573296, 40);
        } else {
            function02 = function0;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new EarnerEnrollmentCategorySelectionViewKt$$ExternalSyntheticLambda0(categorySelection, function02, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void EarnerEnrollmentCategorySelectionContent(final EarnerEnrollmentBlockerViewModel.CategorySelection categorySelection, final Function0 function0, final Function1 function1, final Function0 function02, final boolean z, final PaddingValues paddingValues, Composer composer, final int i) {
        int i2;
        Function1 function12;
        Function0 function03;
        Function0 function04;
        categorySelection.getClass();
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1564971539);
        int i3 = 2;
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(categorySelection) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(function02) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changed(z) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if ((196608 & i) == 0) {
            i2 |= gapComposer.changed(paddingValues) ? PKIFailureInfo.unsupportedVersion : 65536;
        }
        if (!gapComposer.shouldExecute(i2 & 1, (74899 & i2) != 74898)) {
            function12 = function1;
            function03 = function02;
            function04 = function0;
            gapComposer.skipToGroupEnd();
        } else {
            if (z) {
                gapComposer.startReplaceGroup(-196811817);
                int i4 = i2;
                BlockerSheetScaffold(paddingValues, NavigationType.CLOSE, function0, RecyclerView.DECELERATION_RATE, Expect_jvmKt.rememberComposableLambda(1297384646, new EarnerEnrollmentCategorySelectionViewKt$$ExternalSyntheticLambda0(categorySelection, function02, r14, r14), gapComposer), Expect_jvmKt.rememberComposableLambda(-825619179, new BorrowHomeKt$$ExternalSyntheticLambda0(19, categorySelection, function1), gapComposer), gapComposer, ((i4 >> 15) & 14) | 221232 | ((i4 << 3) & 896), 8);
                gapComposer.end(false);
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i5 = 0;
                    endRestartGroup.block = new Function2() { // from class: com.squareup.cash.blockers.views.EarnerEnrollmentCategorySelectionViewKt$$ExternalSyntheticLambda2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i6 = i5;
                            int i7 = i;
                            switch (i6) {
                                case 0:
                                    ((Integer) obj2).getClass();
                                    SsnViewKt.EarnerEnrollmentCategorySelectionContent(categorySelection, function0, function1, function02, z, paddingValues, (Composer) obj, Updater.updateChangedFlags(i7 | 1));
                                    break;
                                default:
                                    ((Integer) obj2).getClass();
                                    SsnViewKt.EarnerEnrollmentCategorySelectionContent(categorySelection, function0, function1, function02, z, paddingValues, (Composer) obj, Updater.updateChangedFlags(i7 | 1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    return;
                }
                return;
            }
            function12 = function1;
            int i6 = i2;
            function03 = function02;
            function04 = function0;
            gapComposer.startReplaceGroup(-195891179);
            gapComposer.end(false);
            Modifier fillMaxSize = SizeKt.fillMaxSize(Modifier.Companion.$$INSTANCE, 1.0f);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape);
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-706092553, new DismissableToastKt$$ExternalSyntheticLambda3(10, function04), gapComposer);
            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-1426244634, new EarnerEnrollmentCategorySelectionViewKt$$ExternalSyntheticLambda0(categorySelection, function03, i3, r14), gapComposer);
            boolean z2 = (gapComposer.changedInstance(categorySelection) ? 1 : 0) | ((i6 & 896) == 256 ? (byte) 1 : (byte) 0);
            Object rememberedValue = gapComposer.rememberedValue();
            if (z2 != 0 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BadgeQueries$$ExternalSyntheticLambda0(27, categorySelection, function12);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            ScreenScaffoldKt.ScreenScaffoldLazy(m177backgroundbw27NRU, null, null, rememberComposableLambda, rememberComposableLambda2, (Function1) rememberedValue, gapComposer, 27648, 6);
            gapComposer = gapComposer;
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            final int i7 = 1;
            final Function0 function05 = function04;
            final Function1 function13 = function12;
            final Function0 function06 = function03;
            endRestartGroup2.block = new Function2() { // from class: com.squareup.cash.blockers.views.EarnerEnrollmentCategorySelectionViewKt$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i62 = i7;
                    int i72 = i;
                    switch (i62) {
                        case 0:
                            ((Integer) obj2).getClass();
                            SsnViewKt.EarnerEnrollmentCategorySelectionContent(categorySelection, function05, function13, function06, z, paddingValues, (Composer) obj, Updater.updateChangedFlags(i72 | 1));
                            break;
                        default:
                            ((Integer) obj2).getClass();
                            SsnViewKt.EarnerEnrollmentCategorySelectionContent(categorySelection, function05, function13, function06, z, paddingValues, (Composer) obj, Updater.updateChangedFlags(i72 | 1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void EarnerEnrollmentCategoryTitle(EarnerEnrollmentBlockerViewModel.CategorySelection categorySelection, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1827673367);
        int i2 = (gapComposer.changedInstance(categorySelection) ? 4 : 2) | i | (gapComposer.changed(modifier) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            String str = categorySelection.title;
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTypography;
            zzacn.m2012AutoScaleTextZLomxE(2, 0, 0, (i2 & 112) | 24576, 424, 0L, ((Typography) gapComposer.consume(staticProvidableCompositionLocal)).titleBarPageTitle.spanStyle.fontSize, gapComposer, modifier, ((Typography) gapComposer.consume(staticProvidableCompositionLocal)).header, str, null);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SetPinViewKt$$ExternalSyntheticLambda2(categorySelection, modifier, i, 12);
        }
    }

    public static final void ErrorMessage(Function1 function1, OnboardingInternalRouteViewModel onboardingInternalRouteViewModel, Modifier modifier, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-781849101);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(onboardingInternalRouteViewModel) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(626630728, new SetPinViewKt$$ExternalSyntheticLambda2(onboardingInternalRouteViewModel, function1), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SetPinViewKt$$ExternalSyntheticLambda3(function1, (Object) onboardingInternalRouteViewModel, modifier2, i, 25);
        }
    }

    public static final void FilesetUploadOptionsSheet(Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-967054710);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        boolean z = false;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-843419947, new BalanceHomeViewKt$$ExternalSyntheticLambda12(function1, z, 29), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NfcNotAvailableKt$$ExternalSyntheticLambda1(function1, i, 6, false);
        }
    }

    public static final void FooterButtons(RequestPushNotificationsBlockerViewModel requestPushNotificationsBlockerViewModel, Function1 function1, Composer composer, int i) {
        boolean z;
        Modifier.Companion companion;
        boolean z2;
        float f;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(161050317);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changedInstance(requestPushNotificationsBlockerViewModel) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier navigationBarsPadding = SpacerKt.navigationBarsPadding(SizeKt.fillMaxWidth(companion2, 1.0f));
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, navigationBarsPadding);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(companion2, 16.0f, 16.0f);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.CenterHorizontally, gapComposer, 54);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m299paddingVpY3zN4);
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(gapComposer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            String str = requestPushNotificationsBlockerViewModel.skipButton;
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (str == null) {
                gapComposer.startReplaceGroup(674934659);
                gapComposer.end(false);
                z2 = false;
                companion = companion2;
                f = 1.0f;
            } else {
                gapComposer.startReplaceGroup(674934660);
                ButtonProminence buttonProminence = ButtonProminence.STANDARD;
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion2, 1.0f);
                boolean z3 = (i2 & 112) == 32;
                Object rememberedValue = gapComposer.rememberedValue();
                if (z3 || rememberedValue == neverEqualPolicy) {
                    z = true;
                    rememberedValue = new SsnViewKt$$ExternalSyntheticLambda14(1, function1);
                    gapComposer.updateRememberedValue(rememberedValue);
                } else {
                    z = true;
                }
                ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1523696772, new SetPinViewKt$$ExternalSyntheticLambda7(str, 10), gapComposer);
                companion = companion2;
                z2 = false;
                f = 1.0f;
                coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, fillMaxWidth, buttonProminence, false, false, null, rememberComposableLambda, gapComposer, 1573296, 56);
                gapComposer.end(false);
            }
            ButtonProminence buttonProminence2 = ButtonProminence.PROMINENT;
            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, f);
            boolean z4 = (i2 & 112) == 32 ? true : z2;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z4 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new SsnViewKt$$ExternalSyntheticLambda14(2, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue2, fillMaxWidth2, buttonProminence2, false, false, null, Expect_jvmKt.rememberComposableLambda(-580379044, new SsnViewKt$$ExternalSyntheticLambda2(requestPushNotificationsBlockerViewModel, 21), gapComposer), gapComposer, 1573296, 56);
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new RequestPushNotificationsBlockerViewKt$$ExternalSyntheticLambda0(requestPushNotificationsBlockerViewModel, function1, i, 3);
        }
    }

    public static final void GetFlowLoading(Function1 function1, Composer composer, int i) {
        int i2;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(494947475);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(function1) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            boolean z = (i2 & 14) == 4;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new SsnViewKt$$ExternalSyntheticLambda1(1, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DialogEventHandlerKt.DialogEventHandler((Function1) rememberedValue, gapComposer, 0);
            ArcadeThemeKt.ArcadeTheme(null, null, null, AmountBlockerViewKt.f300lambda$55648866, gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NfcNotAvailableKt$$ExternalSyntheticLambda1(function1, i, 7, false);
        }
    }

    public static final void GetFlowLoadingSheet(Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1698051547);
        int i2 = 0;
        if (gapComposer.shouldExecute(i & 1, i != 0)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, AmountBlockerViewKt.f297lambda$455801754, gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new GetFlowLoadingViewKt$$ExternalSyntheticLambda0(i, i2);
        }
    }

    public static final void GpsBlocker(GpsLocationConsentBlockerViewModel.Loaded loaded, Function1 function1, Composer composer, int i) {
        int i2;
        Icons icons;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1096061951);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(loaded) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            String str = loaded.icon.arcade_id;
            if (str != null) {
                Icons.Companion.getClass();
                icons = zzd.get(str);
            } else {
                icons = null;
            }
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(463402442, new BirthdayView$$ExternalSyntheticLambda0(loaded, function1, icons, 21), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CheckDepositAmountKt$$ExternalSyntheticLambda1(loaded, function1, i, 5);
        }
    }

    public static final void GpsExplainerSheet(GpsExplainerViewModel gpsExplainerViewModel, Function1 function1, Composer composer, int i) {
        Icons icons;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(624512616);
        int i2 = (gapComposer.changedInstance(gpsExplainerViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            String str = gpsExplainerViewModel.image.arcade_id;
            if (str != null) {
                Icons.Companion.getClass();
                icons = zzd.get(str);
            } else {
                icons = null;
            }
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-468177293, new BirthdayView$$ExternalSyntheticLambda0(icons, gpsExplainerViewModel, function1, 19), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SetPinViewKt$$ExternalSyntheticLambda2(gpsExplainerViewModel, function1, i, 13);
        }
    }

    public static final void HelpItem(int i, Composer composer, String str, Function0 function0) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1016285032);
        int i2 = i | (gapComposer.changedInstance(function0) ? 4 : 2) | (gapComposer.changed(str) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(SizeKt.m279heightInVpY3zN4$default(SpacerKt.m298padding3ABfNKs(ImageKt.m183clickableoSLSa3U$default(Modifier.Companion.$$INSTANCE, false, null, new Role(0), function0, 11), 4.0f), 56.0f, RecyclerView.DECELERATION_RATE, 2), 1.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Room.m1165Text25TpFw(0, 0, 0, 0, (i2 >> 3) & 14, 0, 4090, 0L, (Composer) gapComposer, (Modifier) null, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).button, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ToViewKt$$ExternalSyntheticLambda0(function0, str, i, 4);
        }
    }

    public static final void HelpOptions(HelpOptionsViewModel helpOptionsViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        helpOptionsViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1015963089);
        int i2 = i | (gapComposer.changedInstance(helpOptionsViewModel) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ScrollState rememberScrollState = ImageKt.rememberScrollState(gapComposer);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(companion, rememberScrollState, false, 14);
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(verticalScroll$default, colors.semantic.background.f1047app, ColorKt.RectangleShape);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m177backgroundbw27NRU);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
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
            gapComposer.startReplaceGroup(1104390554);
            int i3 = 0;
            for (Object obj : helpOptionsViewModel.helpItems) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                    throw null;
                }
                DisplayHelpItem displayHelpItem = (DisplayHelpItem) obj;
                if (i3 > 0) {
                    gapComposer.startReplaceGroup(-1967545131);
                    ModalKt.HorizontalDivider(0, 1, gapComposer, null);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-1967509574);
                    gapComposer.end(false);
                }
                boolean changedInstance = gapComposer.changedInstance(displayHelpItem) | gapComposer.changed(i3) | ((i2 & 112) == 32);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new Http2Connection$$ExternalSyntheticLambda3(displayHelpItem, i3, function1, 4);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                HelpOptionsSheetItem(null, (Function0) rememberedValue, displayHelpItem, gapComposer, 0);
                i3 = i4;
            }
            gapComposer.end(false);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BirthdayView$$ExternalSyntheticLambda0(modifier2, helpOptionsViewModel, function1, i, 23);
        }
    }

    public static final void HelpOptionsSheetItem(Modifier modifier, final Function0 function0, final DisplayHelpItem displayHelpItem, Composer composer, final int i) {
        final Modifier modifier2;
        RecomposeScopeImpl endRestartGroup;
        Function2 function2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1214371091);
        int i2 = i | 6 | (gapComposer.changedInstance(function0) ? 32 : 16) | (gapComposer.changedInstance(displayHelpItem) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            String text = displayHelpItem.getText();
            final Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (text == null) {
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    final int i3 = 0;
                    function2 = new Function2(companion, function0, displayHelpItem, i, i3) { // from class: com.squareup.cash.blockers.views.HelpOptionsSheetKt$$ExternalSyntheticLambda2
                        public final /* synthetic */ int $r8$classId;
                        public final /* synthetic */ Modifier f$0;
                        public final /* synthetic */ Function0 f$1;
                        public final /* synthetic */ DisplayHelpItem f$2;

                        {
                            this.$r8$classId = i3;
                        }

                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            int i4 = this.$r8$classId;
                            Composer composer2 = (Composer) obj;
                            ((Integer) obj2).getClass();
                            switch (i4) {
                                case 0:
                                    SsnViewKt.HelpOptionsSheetItem(this.f$0, this.f$1, this.f$2, composer2, Updater.updateChangedFlags(1));
                                    break;
                                default:
                                    SsnViewKt.HelpOptionsSheetItem(this.f$0, this.f$1, this.f$2, composer2, Updater.updateChangedFlags(1));
                                    break;
                            }
                            return Unit.INSTANCE;
                        }
                    };
                    endRestartGroup.block = function2;
                }
                return;
            }
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(SizeKt.m279heightInVpY3zN4$default(SpacerKt.m298padding3ABfNKs(ImageKt.m183clickableoSLSa3U$default(companion, false, null, new Role(0), function0, 11), 4.0f), 56.0f, RecyclerView.DECELERATION_RATE, 2), 1.0f);
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, fillMaxWidth);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer.startReusableNode();
            if (gapComposer.inserting) {
                gapComposer.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer.useNode();
            }
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4090, 0L, (Composer) gapComposer, (Modifier) null, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).button, (TextLineBalancing) null, text, (Map) null, (Function1) null, false);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            final int i4 = 1;
            function2 = new Function2(modifier2, function0, displayHelpItem, i, i4) { // from class: com.squareup.cash.blockers.views.HelpOptionsSheetKt$$ExternalSyntheticLambda2
                public final /* synthetic */ int $r8$classId;
                public final /* synthetic */ Modifier f$0;
                public final /* synthetic */ Function0 f$1;
                public final /* synthetic */ DisplayHelpItem f$2;

                {
                    this.$r8$classId = i4;
                }

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    int i42 = this.$r8$classId;
                    Composer composer2 = (Composer) obj;
                    ((Integer) obj2).getClass();
                    switch (i42) {
                        case 0:
                            SsnViewKt.HelpOptionsSheetItem(this.f$0, this.f$1, this.f$2, composer2, Updater.updateChangedFlags(1));
                            break;
                        default:
                            SsnViewKt.HelpOptionsSheetItem(this.f$0, this.f$1, this.f$2, composer2, Updater.updateChangedFlags(1));
                            break;
                    }
                    return Unit.INSTANCE;
                }
            };
            endRestartGroup.block = function2;
        }
    }

    public static final void InputCardInfo(InputCardInfoViewModel inputCardInfoViewModel, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1166210577);
        int i2 = (gapComposer.changedInstance(inputCardInfoViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            FocusOwnerImpl focusOwnerImpl = (FocusOwnerImpl) gapComposer.consume(CompositionLocalsKt.LocalFocusManager);
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            if (z || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new CashtagViewKt$$ExternalSyntheticLambda6(24, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer, 0, 1);
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-712504858, new BirthdayView$$ExternalSyntheticLambda0(inputCardInfoViewModel, focusOwnerImpl, function1, 25), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SetPinViewKt$$ExternalSyntheticLambda2(inputCardInfoViewModel, function1, i, 15);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0038, code lost:
    
        if (r2 == null) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void NotificationIcon(Icon icon, Composer composer, int i) {
        Icons icons;
        String str;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-270406058);
        int i2 = (gapComposer.changedInstance(icon) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            if (icon != null && (str = icon.arcade_id) != null) {
                Icons.Companion.getClass();
                icons = zzd.get(str);
            }
            icons = Icons.NotificationsFill32;
            AvatarSize avatarSize = AvatarSize.Size64;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            TextViewKt.Avatar(avatarSize, new AvatarEntry("", colors.semantic.background.brand, null, new AvatarImage.LocalIcon(icons, 0L, 6), null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE), null, false, gapComposer, 6, 28);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LimitHubIncreaseLimitSectionKt$$ExternalSyntheticLambda0(icon, i);
        }
    }

    public static final void NotificationToggles(RequestPushNotificationsBlockerViewModel requestPushNotificationsBlockerViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        Icons icons;
        ComposableLambdaImpl rememberComposableLambda;
        String str;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1017215295);
        int i3 = 32;
        int i4 = (gapComposer.changedInstance(requestPushNotificationsBlockerViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        boolean z = false;
        boolean z2 = true;
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 19) != 18)) {
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, Modifier.Companion.$$INSTANCE);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
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
            gapComposer.startReplaceGroup(1530893658);
            for (RequestPushNotificationsBlockerViewModel.NotificationToggle notificationToggle : requestPushNotificationsBlockerViewModel.toggles) {
                Icon icon = notificationToggle.icon;
                if (icon == null || (str = icon.arcade_id) == null) {
                    icons = null;
                } else {
                    Icons.Companion.getClass();
                    icons = zzd.get(str);
                }
                if (icons == null) {
                    gapComposer.startReplaceGroup(388960010);
                    gapComposer.end(z);
                    rememberComposableLambda = null;
                } else {
                    gapComposer.startReplaceGroup(388960011);
                    rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-345987957, new InfoSectionKt$$ExternalSyntheticLambda6(icons, 11), gapComposer);
                    gapComposer.end(z);
                }
                CellDefaultAccessory.Toggle toggle = new CellDefaultAccessory.Toggle(notificationToggle.enabled);
                ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(1846674074, new CashtagViewKt$$ExternalSyntheticLambda10(notificationToggle, 29), gapComposer);
                boolean changedInstance = ((i4 & 112) == i3 ? z2 : z) | gapComposer.changedInstance(notificationToggle);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new BulletinTileKt$$ExternalSyntheticLambda12(17, function1, notificationToggle);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(rememberComposableLambda, rememberComposableLambda2, null, (Function0) rememberedValue, false, true, null, null, toggle, 0L, gapComposer, 1572912, 3508);
                z2 = true;
                z = z;
                i3 = i3;
            }
            gapComposer.end(z);
            i2 = 1;
            gapComposer.end(true);
        } else {
            i2 = 1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new RequestPushNotificationsBlockerViewKt$$ExternalSyntheticLambda0(requestPushNotificationsBlockerViewModel, function1, i, i2);
        }
    }

    public static final void Passcode(PasscodeViewModel passcodeViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        passcodeViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1504644024);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(passcodeViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            SecureScreenKt.SecureScreen(true, gapComposer, 6);
            boolean z = passcodeViewModel instanceof PasscodeViewModel.Loading;
            int i4 = i3 & 112;
            boolean z2 = i4 == 32;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z2 || rememberedValue == neverEqualPolicy) {
                rememberedValue = new CashtagViewKt$$ExternalSyntheticLambda6(28, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue, gapComposer, 0, 1);
            boolean z3 = i4 == 32;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z3 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new SsnViewKt$$ExternalSyntheticLambda1(2, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            DialogEventHandlerKt.DialogEventHandler((Function1) rememberedValue2, gapComposer, 0);
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-927931571, new TabContentViewKt$$ExternalSyntheticLambda26(passcodeViewModel, z, function1), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SetPinViewKt$$ExternalSyntheticLambda3((Object) passcodeViewModel, function1, (Object) modifier2, i, 26);
        }
    }

    public static final void PasscodeInput(TextFieldState textFieldState, final int i, Modifier modifier, boolean z, Composer composer, int i2) {
        textFieldState.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(873030843);
        int i3 = i2 | (gapComposer.changed(textFieldState) ? 4 : 2);
        if ((i2 & 48) == 0) {
            i3 |= gapComposer.changed(i) ? 32 : 16;
        }
        int i4 = i3 | (gapComposer.changed(modifier) ? 256 : 128) | (gapComposer.changed(z) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 1171) != 1170)) {
            final Shaker rememberShaker = SharedViewEventsKt.rememberShaker(false, gapComposer, 1);
            String stringResource = Room.stringResource(gapComposer, R.string.blockers_passcode_input_description);
            Modifier shakeWith = SharedViewEventsKt.shakeWith(modifier, rememberShaker);
            boolean changed = gapComposer.changed(stringResource);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = new BadgeKt$$ExternalSyntheticLambda3(stringResource, 15);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Modifier semantics = SemanticsModifierKt.semantics(shakeWith, false, (Function1) rememberedValue);
            KeyboardOptions keyboardOptions = new KeyboardOptions(8, 0, false, 121);
            boolean changedInstance = gapComposer.changedInstance(rememberShaker) | ((i4 & 112) == 32);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new InputTransformation() { // from class: com.squareup.cash.blockers.views.PasscodeKt$$ExternalSyntheticLambda1
                    @Override // androidx.compose.foundation.text.input.InputTransformation
                    public final void transformInput(TextFieldBuffer textFieldBuffer) {
                        int i5;
                        PartialGapBuffer partialGapBuffer = textFieldBuffer.buffer;
                        if (partialGapBuffer.length() <= i) {
                            while (i5 < partialGapBuffer.length()) {
                                char charAt = partialGapBuffer.charAt(i5);
                                i5 = ('0' <= charAt && charAt < ':') ? i5 + 1 : 0;
                            }
                            return;
                        }
                        textFieldBuffer.revertAllChanges();
                        rememberShaker.shake();
                    }
                };
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            BasicTextFieldKt.BasicTextField(textFieldState, semantics, z, false, (InputTransformation) rememberedValue2, null, keyboardOptions, null, TextFieldLineLimits.SingleLine.INSTANCE, null, null, null, new PasscodeKt$PasscodeInput$3(i, textFieldState), null, gapComposer, (i4 & 14) | 102236160 | ((i4 >> 3) & 896), 0, 24232);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PasscodeKt$$ExternalSyntheticLambda2(textFieldState, i, modifier, z, i2);
        }
    }

    public static final void ReferralCode(Modifier modifier, ReferralCodeViewModel referralCodeViewModel, Function1 function1, RealImageLoader realImageLoader, RealCashVibrator realCashVibrator, Composer composer, int i) {
        Modifier modifier2;
        referralCodeViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(532239684);
        int i2 = i | 6;
        int i3 = 16;
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(referralCodeViewModel) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer.changedInstance(realImageLoader) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= gapComposer.changedInstance(realCashVibrator) ? 16384 : PKIFailureInfo.certRevoked;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m106m(gapComposer);
            }
            FocusRequester focusRequester = (FocusRequester) rememberedValue;
            DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) gapComposer.consume(CompositionLocalsKt.LocalSoftwareKeyboardController);
            Object[] objArr = new Object[0];
            int i4 = i2 & 896;
            boolean changedInstance = gapComposer.changedInstance(referralCodeViewModel) | (i4 == 256);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new BulletinTileKt$$ExternalSyntheticLambda12(i3, (Object) referralCodeViewModel, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            MutableState mutableState = (MutableState) SaverKt.rememberSaveable(objArr, (Function0) rememberedValue2, gapComposer, 0);
            boolean changed = (i4 == 256) | gapComposer.changed(delegatingSoftwareKeyboardController);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (changed || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new SetNameViewKt$$ExternalSyntheticLambda6(function1, delegatingSoftwareKeyboardController, 3);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            DBUtil.BackHandler(false, (Function0) rememberedValue3, gapComposer, 0, 1);
            Boolean valueOf = Boolean.valueOf(referralCodeViewModel.showLoadingScreen);
            boolean changedInstance2 = gapComposer.changedInstance(referralCodeViewModel);
            Object rememberedValue4 = gapComposer.rememberedValue();
            Continuation continuation = null;
            if (changedInstance2 || rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = new InteractiveCardView$flingTo$1.AnonymousClass2(referralCodeViewModel, focusRequester, continuation, 15);
                gapComposer.updateRememberedValue(rememberedValue4);
            }
            Updater.LaunchedEffect(gapComposer, valueOf, (Function2) rememberedValue4);
            Boolean valueOf2 = Boolean.valueOf(referralCodeViewModel.invalidSubmission);
            boolean changedInstance3 = gapComposer.changedInstance(referralCodeViewModel) | gapComposer.changedInstance(realCashVibrator);
            Object rememberedValue5 = gapComposer.rememberedValue();
            if (changedInstance3 || rememberedValue5 == neverEqualPolicy) {
                rememberedValue5 = new InteractiveCardView$flingTo$1.AnonymousClass2(referralCodeViewModel, realCashVibrator, continuation, i3);
                gapComposer.updateRememberedValue(rememberedValue5);
            }
            Updater.LaunchedEffect(gapComposer, valueOf2, (Function2) rememberedValue5);
            Updater.CompositionLocalProvider(new ProvidedValue[]{LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader), LocalCashVibratorKt.LocalCashVibrator.defaultProvidedValue$runtime(realCashVibrator)}, Expect_jvmKt.rememberComposableLambda(-1231050236, new ReferralCodeViewKt$$ExternalSyntheticLambda2(referralCodeViewModel, focusRequester, delegatingSoftwareKeyboardController, function1, mutableState, 0), gapComposer), gapComposer, 56);
            modifier2 = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new TransitionKt$$ExternalSyntheticLambda9(modifier2, referralCodeViewModel, function1, realImageLoader, realCashVibrator, i, 21);
        }
    }

    public static final void RequestPushNotificationsBlockerContent(RequestPushNotificationsBlockerViewModel requestPushNotificationsBlockerViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        requestPushNotificationsBlockerViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(276948601);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(requestPushNotificationsBlockerViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1462201660, new RequestPushNotificationsBlockerViewKt$$ExternalSyntheticLambda0(requestPushNotificationsBlockerViewModel, function1, i3), gapComposer), gapComposer, 3072, 7);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new CheckDepositAmountKt$$ExternalSyntheticLambda1(requestPushNotificationsBlockerViewModel, function1, i, 6);
        }
    }

    public static final void SavingsTransferOptionSelectionFullScreen(SavingsTransferOptionSelectionViewModel savingsTransferOptionSelectionViewModel, Function1 function1, Composer composer, int i) {
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1990728950);
        int i2 = 2;
        int i3 = 4;
        int i4 = (gapComposer.changedInstance(savingsTransferOptionSelectionViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (!gapComposer.shouldExecute(i4 & 1, (i4 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (savingsTransferOptionSelectionViewModel == null) {
                RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    endRestartGroup.block = new BlockersUiFactory$$ExternalSyntheticLambda13(savingsTransferOptionSelectionViewModel, function1, i, i2);
                    return;
                }
                return;
            }
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(1409606273, new BlockersUiFactory$$ExternalSyntheticLambda13(savingsTransferOptionSelectionViewModel, function1, 3), gapComposer), gapComposer, 3072, 7);
        }
        RecomposeScopeImpl endRestartGroup2 = gapComposer.endRestartGroup();
        if (endRestartGroup2 != null) {
            endRestartGroup2.block = new BlockersUiFactory$$ExternalSyntheticLambda13(savingsTransferOptionSelectionViewModel, function1, i, i3);
        }
    }

    public static final void SavingsTransferOptionSelectionSheet(SavingsTransferOptionSelectionViewModel savingsTransferOptionSelectionViewModel, Function1 function1, Composer composer, int i) {
        RecomposeScopeImpl endRestartGroup;
        BlockersUiFactory$$ExternalSyntheticLambda13 blockersUiFactory$$ExternalSyntheticLambda13;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1860471596);
        int i2 = (gapComposer.changedInstance(savingsTransferOptionSelectionViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16);
        if (!gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            gapComposer.skipToGroupEnd();
        } else {
            if (savingsTransferOptionSelectionViewModel == null) {
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup != null) {
                    blockersUiFactory$$ExternalSyntheticLambda13 = new BlockersUiFactory$$ExternalSyntheticLambda13(savingsTransferOptionSelectionViewModel, function1, i, 5);
                    endRestartGroup.block = blockersUiFactory$$ExternalSyntheticLambda13;
                }
                return;
            }
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-2041174935, new BlockersUiFactory$$ExternalSyntheticLambda13(function1, savingsTransferOptionSelectionViewModel), gapComposer), gapComposer, 3072, 7);
        }
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            blockersUiFactory$$ExternalSyntheticLambda13 = new BlockersUiFactory$$ExternalSyntheticLambda13(savingsTransferOptionSelectionViewModel, function1, i, 7);
            endRestartGroup.block = blockersUiFactory$$ExternalSyntheticLambda13;
        }
    }

    public static final void SetName(SetNameViewModel setNameViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        Modifier modifier2;
        InputState inputState;
        Object setNameViewKt$SetName$2$1;
        MutableState mutableState;
        Shaker shaker;
        setNameViewModel.getClass();
        zzagj zzagjVar = setNameViewModel.lastEvent;
        function1.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-2098545653);
        if ((i & 6) == 0) {
            i2 = i | (gapComposer2.changedInstance(setNameViewModel) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            boolean z = (zzagjVar instanceof SetNameViewModel$Event$Submitted) || (zzagjVar instanceof SetNameViewModel$Event$ShowLoadingScreen);
            if (Intrinsics.areEqual(zzagjVar, SetNameViewModel$Event$Done.INSTANCE) || Intrinsics.areEqual(zzagjVar, SetNameViewModel$Event$None.INSTANCE)) {
                inputState = InputState.DEFAULT;
            } else if (Intrinsics.areEqual(zzagjVar, SetNameViewModel$Event$InputValidationFailed.INSTANCE) || Intrinsics.areEqual(zzagjVar, SetNameViewModel$Event$SubmissionFailed.INSTANCE)) {
                inputState = InputState.ERROR;
            } else {
                if (!Intrinsics.areEqual(zzagjVar, SetNameViewModel$Event$ShowLoadingScreen.INSTANCE) && !Intrinsics.areEqual(zzagjVar, SetNameViewModel$Event$Submitted.INSTANCE)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                inputState = InputState.DISABLED;
            }
            InputState inputState2 = inputState;
            Object[] objArr = new Object[0];
            boolean changedInstance = gapComposer2.changedInstance(setNameViewModel);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy) {
                rememberedValue = new SsnViewKt$$ExternalSyntheticLambda4(setNameViewModel, 3);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            MutableState rememberSaveable = SaverKt.rememberSaveable(objArr, (Saver) TextFieldValue.Saver, (Function0) rememberedValue, (Composer) gapComposer2, 0);
            Shaker rememberShaker = SharedViewEventsKt.rememberShaker(false, gapComposer2, 1);
            DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) gapComposer2.consume(CompositionLocalsKt.LocalSoftwareKeyboardController);
            boolean z2 = (i3 & 112) == 32;
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (z2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new SsnViewKt$$ExternalSyntheticLambda1(3, function1);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            DialogEventHandlerKt.DialogEventHandler((Function1) rememberedValue2, gapComposer2, 0);
            boolean changedInstance2 = gapComposer2.changedInstance(setNameViewModel) | gapComposer2.changed(rememberSaveable) | gapComposer2.changedInstance(rememberShaker);
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (changedInstance2 || rememberedValue3 == neverEqualPolicy) {
                mutableState = rememberSaveable;
                shaker = rememberShaker;
                setNameViewKt$SetName$2$1 = new SetNameViewKt$SetName$2$1(setNameViewModel, shaker, mutableState, (Continuation) null, 0);
                gapComposer2.updateRememberedValue(setNameViewKt$SetName$2$1);
            } else {
                setNameViewKt$SetName$2$1 = rememberedValue3;
                mutableState = rememberSaveable;
                shaker = rememberShaker;
            }
            Updater.LaunchedEffect(gapComposer2, zzagjVar, (Function2) setNameViewKt$SetName$2$1);
            gapComposer = gapComposer2;
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-2090265450, new MoneyTabUIKt$$ExternalSyntheticLambda32(z, setNameViewModel, delegatingSoftwareKeyboardController, function1, shaker, mutableState, inputState2), gapComposer2), gapComposer, 3072, 7);
            modifier2 = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SetPinViewKt$$ExternalSyntheticLambda3((Object) setNameViewModel, function1, (Object) modifier2, i, 28);
        }
    }

    public static final void SetPin(SetPinViewModel setPinViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        setPinViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1889096477);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(setPinViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            SecureScreenKt.SecureScreen(true, gapComposer, 6);
            boolean z = setPinViewModel.isLoading;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new SsnViewKt$$ExternalSyntheticLambda0(21);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(z, (Function0) rememberedValue, gapComposer, 48, 0);
            boolean z2 = (i3 & 112) == 32;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new SsnViewKt$$ExternalSyntheticLambda1(4, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            DialogEventHandlerKt.DialogEventHandler((Function1) rememberedValue2, gapComposer, 0);
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-63760328, new SetPinViewKt$$ExternalSyntheticLambda2(setPinViewModel, function1), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new SetPinViewKt$$ExternalSyntheticLambda3((Object) setPinViewModel, function1, (Object) modifier2, i, 0);
        }
    }

    public static final void Ssn(SsnViewModel ssnViewModel, Function1 function1, FocusRequester focusRequester, Composer composer, int i) {
        int i2;
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1100580270);
        if ((i & 6) == 0) {
            i2 = (gapComposer2.changedInstance(ssnViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer2.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer2.changed(focusRequester) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= gapComposer2.changed(Modifier.Companion.$$INSTANCE) ? 2048 : 1024;
        }
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            Object[] objArr = new Object[0];
            boolean changedInstance = gapComposer2.changedInstance(ssnViewModel);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changedInstance || rememberedValue == neverEqualPolicy) {
                rememberedValue = new SsnViewKt$$ExternalSyntheticLambda4(ssnViewModel, 0);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            MutableState rememberSaveable = SaverKt.rememberSaveable(objArr, (Saver) TextFieldValue.Saver, (Function0) rememberedValue, (Composer) gapComposer2, 0);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new TouchRecorder();
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            TouchRecorder touchRecorder = (TouchRecorder) rememberedValue2;
            Object rememberedValue3 = gapComposer2.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = Updater.mutableStateOf$default(Boolean.FALSE);
                gapComposer2.updateRememberedValue(rememberedValue3);
            }
            MutableState mutableState = (MutableState) rememberedValue3;
            boolean z = ssnViewModel.hyphenate;
            Region region = ssnViewModel.region;
            boolean changed = gapComposer2.changed(z) | gapComposer2.changed(region.ordinal());
            Object rememberedValue4 = gapComposer2.rememberedValue();
            if (changed || rememberedValue4 == neverEqualPolicy) {
                rememberedValue4 = ssnViewModel.hyphenate ? region == Region.USA ? new UsSsnScrubber() : new HyphenatingScrubber() : null;
                gapComposer2.updateRememberedValue(rememberedValue4);
            }
            gapComposer = gapComposer2;
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(761811431, new SsnViewKt$$ExternalSyntheticLambda5(ssnViewModel, touchRecorder, focusRequester, function1, rememberSaveable, (InsertingScrubber) rememberedValue4, mutableState), gapComposer2), gapComposer, 3072, 7);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeModal2Kt$$ExternalSyntheticLambda3(ssnViewModel, function1, focusRequester, i);
        }
    }

    public static final void SsnContent(SsnViewModel ssnViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        int i2;
        ssnViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1267050427);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(ssnViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = i2 | MLKEMEngine.KyberPolyBytes;
        int i4 = 0;
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            SecureScreenKt.SecureScreen(true, gapComposer, 6);
            boolean z = ssnViewModel.isLoading;
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue == neverEqualPolicy) {
                rememberedValue = new SsnViewKt$$ExternalSyntheticLambda0(0);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            DBUtil.BackHandler(z, (Function0) rememberedValue, gapComposer, 48, 0);
            int i5 = i3 & 112;
            boolean z2 = i5 == 32;
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (z2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new SsnViewKt$$ExternalSyntheticLambda1(0, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            DialogEventHandlerKt.DialogEventHandler((Function1) rememberedValue2, gapComposer, 0);
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = Recorder$$ExternalSyntheticOutline2.m106m(gapComposer);
            }
            FocusRequester focusRequester = (FocusRequester) rememberedValue3;
            UiScopeKt.UiScope(Expect_jvmKt.rememberComposableLambda(2075351938, new SsnViewKt$$ExternalSyntheticLambda2(focusRequester, i4), gapComposer), gapComposer, 6);
            Ssn(ssnViewModel, function1, focusRequester, gapComposer, (i3 & 14) | MLKEMEngine.KyberPolyBytes | i5 | ((i3 << 3) & 7168));
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ArcadeModal2Kt$$ExternalSyntheticLambda3(ssnViewModel, function1, modifier2, i, 1);
        }
    }

    public static final void UnselectableOptionDialogView(UnselectableOptionViewModel unselectableOptionViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1629446561);
        int i2 = (gapComposer.changedInstance(unselectableOptionViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1774682892, new SetPinViewKt$$ExternalSyntheticLambda2(unselectableOptionViewModel, function1), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BulletinTileKt$$ExternalSyntheticLambda9(unselectableOptionViewModel, function1, modifier2, i, 3);
        }
    }

    public static final void VerifyCardViewUi(VerifyInstrumentModel verifyInstrumentModel, Function1 function1, Composer composer, int i) {
        Function1 function12;
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(1251080507);
        int i2 = i | (gapComposer2.changedInstance(verifyInstrumentModel) ? 4 : 2) | (gapComposer2.changedInstance(function1) ? 32 : 16);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            CardState rememberCardState = rememberCardState(gapComposer2);
            boolean z = (i2 & 112) == 32;
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (z || rememberedValue == neverEqualPolicy) {
                rememberedValue = new SsnViewKt$$ExternalSyntheticLambda1(5, function1);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            DialogEventHandlerKt.DialogEventHandler((Function1) rememberedValue, gapComposer2, 0);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxSize = SizeKt.fillMaxSize(companion, 1.0f);
            Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
            } else {
                gapComposer2.startReplaceGroup(-1762997739);
                gapComposer2.end(false);
            }
            Modifier imePadding = SpacerKt.imePadding(ImageKt.m177backgroundbw27NRU(fillMaxSize, colors.semantic.background.f1047app, ColorKt.RectangleShape));
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, imePadding);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer2.applier == null) {
                Updater.invalidApplier();
                throw null;
            }
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(gapComposer2, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            DBUtil.TitleBarSub((String) null, NavigationType.NONE, (Modifier) null, (DynamicColorConfiguration) null, (Function0) null, (Modifier) null, (Function3) null, gapComposer2, 54, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer2, null);
            String str = verifyInstrumentModel.title;
            if (str == null) {
                gapComposer2.startReplaceGroup(-2063933694);
                gapComposer2.end(false);
            } else {
                gapComposer2.startReplaceGroup(-2063933693);
                Countries.PageHeader(str, (Modifier) null, (Function2) null, (String) null, gapComposer2, 0, 14);
                DBUtil.SpacerBetweenSectionLarge(0, 1, gapComposer2, null);
                gapComposer2.end(false);
            }
            String str2 = rememberCardState.get_number();
            InputState inputState = verifyInstrumentModel.isLoading ? InputState.DISABLED : InputState.DEFAULT;
            String str3 = verifyInstrumentModel.inputHint;
            MaskVisualTransformation rememberCardNumberTransformation = CardNumberKt.rememberCardNumberTransformation(rememberCardState.get_brand(), gapComposer2);
            KeyboardOptions keyboardOptions = new KeyboardOptions(0, (Boolean) null, 3, 7, (Boolean) null, 115);
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            ((DefaultSizes) gapComposer2.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            boolean changed = gapComposer2.changed(rememberCardState);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (changed || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new VerifyCardViewKt$$ExternalSyntheticLambda1(rememberCardState, 0);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            InputFieldKt.InputField(str2, (Function1) rememberedValue2, m300paddingVpY3zN4$default, inputState, (Function2) null, (Function2) null, (Function2) null, (Function3) null, str3, keyboardOptions, (KeyboardActions) null, rememberCardNumberTransformation, gapComposer2, 805306368, 0, 1264);
            SpacerKt.Spacer(gapComposer2, new LayoutWeightElement(1.0f, true));
            function12 = function1;
            DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(378678451, new SectionKt$$ExternalSyntheticLambda2(9, verifyInstrumentModel, function12, rememberCardState), gapComposer2), gapComposer2, 24576, 15);
            gapComposer = gapComposer2;
            gapComposer.end(true);
        } else {
            function12 = function1;
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new VerifyCardView$$ExternalSyntheticLambda0(verifyInstrumentModel, function12, i);
        }
    }

    public static final void VerifyContacts(VerifyContactsViewModel verifyContactsViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1029371190);
        int i2 = (gapComposer.changedInstance(verifyContactsViewModel) ? 4 : 2) | i | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-1616247009, new SetPinViewKt$$ExternalSyntheticLambda2(verifyContactsViewModel, function1), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BulletinTileKt$$ExternalSyntheticLambda9(verifyContactsViewModel, function1, modifier2, i, 6);
        }
    }

    public static final void VerifyHelpOptions(Function1 function1, Modifier modifier, List list, List list2, Composer composer, int i) {
        Modifier modifier2;
        NeverEqualPolicy neverEqualPolicy;
        int i2;
        int i3;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-774031239);
        int i4 = i | (gapComposer.changedInstance(function1) ? 4 : 2) | 48 | (gapComposer.changedInstance(list) ? 256 : 128) | (gapComposer.changedInstance(list2) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 1171) != 1170)) {
            ScrollState rememberScrollState = ImageKt.rememberScrollState(gapComposer);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier verticalScroll$default = ImageKt.verticalScroll$default(companion, rememberScrollState, false, 14);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.CenterHorizontally, gapComposer, 48);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, verticalScroll$default);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier == null) {
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
            gapComposer.startReplaceGroup(113048798);
            Iterator it = list.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                neverEqualPolicy = Composer.Companion.Empty;
                if (!hasNext) {
                    break;
                }
                HelpItem helpItem = (HelpItem) it.next();
                boolean changedInstance = ((i4 & 14) == 4) | gapComposer.changedInstance(helpItem);
                Object rememberedValue = gapComposer.rememberedValue();
                if (changedInstance || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new SelectionViewKt$$ExternalSyntheticLambda14(function1, helpItem);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Function0 function0 = (Function0) rememberedValue;
                String str = helpItem.text;
                if (str == null) {
                    str = "";
                }
                HelpItem(0, gapComposer, str, function0);
                ModalKt.HorizontalDivider(0, 1, gapComposer, null);
            }
            gapComposer.end(false);
            gapComposer.startReplaceGroup(113053998);
            Iterator it2 = list2.iterator();
            while (it2.hasNext()) {
                VerifyHelpItem verifyHelpItem = (VerifyHelpItem) it2.next();
                boolean changed = ((i4 & 14) == 4) | gapComposer.changed(verifyHelpItem.ordinal());
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (changed || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new BulletinTileKt$$ExternalSyntheticLambda12(26, function1, verifyHelpItem);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                Function0 function02 = (Function0) rememberedValue2;
                int ordinal = verifyHelpItem.ordinal();
                if (ordinal == 0) {
                    i2 = -1938637576;
                    i3 = R.string.blockers_verify_help_edit_email;
                } else if (ordinal == 1) {
                    i2 = -1938635178;
                    i3 = R.string.blockers_verify_help_edit_sms;
                } else if (ordinal == 2) {
                    i2 = -1938632974;
                    i3 = R.string.blockers_verify_help_call;
                } else {
                    if (ordinal != 3) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1938638421, false);
                    }
                    i2 = -1938630894;
                    i3 = R.string.blockers_verify_help_skip;
                }
                HelpItem(0, gapComposer, re$$ExternalSyntheticOutline0.m(gapComposer, i2, i3, gapComposer, false), function02);
                ModalKt.HorizontalDivider(0, 1, gapComposer, null);
            }
            gapComposer.end(false);
            boolean z = (i4 & 14) == 4;
            Object rememberedValue3 = gapComposer.rememberedValue();
            if (z || rememberedValue3 == neverEqualPolicy) {
                rememberedValue3 = new SsnViewKt$$ExternalSyntheticLambda14(21, function1);
                gapComposer.updateRememberedValue(rememberedValue3);
            }
            HelpItem(0, gapComposer, Room.stringResource(gapComposer, R.string.cancel), (Function0) rememberedValue3);
            gapComposer.end(true);
            modifier2 = companion;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new VerifyCheckDepositKt$$ExternalSyntheticLambda14(function1, i, modifier2, list, list2, 8);
        }
    }

    public static final SpannedString access$renderClickableDetail(ViewGroup viewGroup, String str, boolean z, int i, Size size) {
        if (!z) {
            Context context = viewGroup.getContext();
            context.getClass();
            return InputEventTrigger.Companion.markdownToSpanned$default(str, context, null, 30);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        Context context2 = viewGroup.getContext();
        context2.getClass();
        spannableStringBuilder.append((CharSequence) InputEventTrigger.Companion.markdownToSpanned$default(str, context2, null, 30));
        Context context3 = viewGroup.getContext();
        context3.getClass();
        ImageSpan imageSpan = new ImageSpan(context3, R.drawable.mooncake_info_inline, Integer.valueOf(i), Views.dip((View) viewGroup, 4), Views.dip((View) viewGroup, 2), Views.dip((View) viewGroup, 2), size, EnumC0170g.SDK_ASSET_ICON_PLAID_LOGO_VALUE);
        int length = spannableStringBuilder.length();
        int length2 = spannableStringBuilder.length();
        spannableStringBuilder.append(' ');
        spannableStringBuilder.setSpan(imageSpan, length, (spannableStringBuilder.length() - length2) + length, 17);
        return new SpannedString(spannableStringBuilder);
    }

    public static final CardState rememberCardState(Composer composer) {
        Object[] objArr = new Object[0];
        GapComposer gapComposer = (GapComposer) composer;
        Object rememberedValue = gapComposer.rememberedValue();
        if (rememberedValue == Composer.Companion.Empty) {
            rememberedValue = new SsnViewKt$$ExternalSyntheticLambda0(17);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        return (CardState) SaverKt.m581rememberSaveable(objArr, (Saver) CardState.Saver.INSTANCE, (Function0) rememberedValue, (Composer) gapComposer, 432);
    }
}
