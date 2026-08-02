package com.squareup.cash.payments.views.composer;

import androidx.camera.camera2.pipe.core.Debug;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.AnimateAsStateKt;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.IndicationKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.foundation.text.input.TextFieldStateKt;
import androidx.compose.material.ModalBottomSheetKt$$ExternalSyntheticLambda6;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.State;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.res.ImageResources_androidKt;
import androidx.compose.ui.semantics.Role;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.local.sharedui.LocalComposeUiKt$$ExternalSyntheticLambda1;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda17;
import app.cash.local.views.internal.DismissableToastKt$$ExternalSyntheticLambda3;
import app.cash.local.views.internal.LocalCombinedViewsKt$$ExternalSyntheticLambda3;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda11;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import coil3.size.DimensionKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.account.components.AccountToolbarKt$$ExternalSyntheticLambda2;
import com.squareup.cash.amountchooser.views.AmountKeypadState;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.components.button.ButtonCtaGroupOrientation;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.theme.RippleKt;
import com.squareup.cash.arcade.theme.RippleNodeFactory;
import com.squareup.cash.blockers.views.SsnViewKt$SsnContent$3$1$1;
import com.squareup.cash.borrow.views.FirstTimeBorrowKt$$ExternalSyntheticLambda2;
import com.squareup.cash.common.composeui.LocalCashVibratorKt;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.instruments.viewmodels.InstrumentAvatarViewModel;
import com.squareup.cash.instruments.viewmodels.InstrumentSelectionRowViewModel;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda20;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda24;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda38;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda39;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.moneybot.widgets.ComposerKt$$ExternalSyntheticLambda14;
import com.squareup.cash.mooncake.compose_ui.ComposeMooncakeThemeKt;
import com.squareup.cash.overlays.OverlayKt$$ExternalSyntheticLambda2;
import com.squareup.cash.paychecks.views.PaycheckCircles$$ExternalSyntheticLambda3;
import com.squareup.cash.paychecks.views.PaycheckCircles$$ExternalSyntheticLambda4;
import com.squareup.cash.payments.viewmodels.LabeledDetailRow;
import com.squareup.cash.payments.viewmodels.PaymentConfigurationTitleViewModel;
import com.squareup.cash.payments.viewmodels.PaymentConfigurationViewModel;
import com.squareup.cash.payments.viewmodels.RecurringDisabledInstrument;
import com.squareup.cash.payments.viewmodels.StablecoinWithdrawalOptionRow;
import com.squareup.cash.payments.views.MainPaymentViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.payments.views.MainPaymentViewKt$$ExternalSyntheticLambda25;
import com.squareup.cash.payments.views.NoteRequiredViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.payments.views.QuickPayViewKt;
import com.squareup.cash.payments.views.RecipientListViewKt$$ExternalSyntheticLambda10;
import com.squareup.cash.payments.views.RecipientListViewKt$$ExternalSyntheticLambda13;
import com.squareup.cash.payments.views.ToViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.payments.views.personalization.AlphaKt;
import com.squareup.cash.pdf.view.PdfPreviewView$$ExternalSyntheticLambda1;
import com.squareup.cash.pdf.view.PdfPreviewViewKt$$ExternalSyntheticLambda0;
import com.squareup.cash.pools.applets.views.PoolsAppletTileKt$$ExternalSyntheticLambda3;
import com.squareup.cash.pools.views.PoolCreateViewKt$$ExternalSyntheticLambda5;
import com.squareup.cash.pools.views.PoolGoalMetKt$$ExternalSyntheticLambda0;
import com.squareup.cash.pools.views.PoolToastKt$$ExternalSyntheticLambda0;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda1;
import com.squareup.cash.profile.views.OpenSourceKt$$ExternalSyntheticLambda11;
import com.squareup.cash.profile.views.ProfileKt$$ExternalSyntheticLambda11;
import com.squareup.cash.recipients.viewmodels.RecipientViewModel;
import com.squareup.cash.securitysignals.ui.TouchRecorder;
import com.squareup.cash.sheet.SheetKt$$ExternalSyntheticLambda8;
import com.squareup.cash.storage.AndroidFileSaver$save$2;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.ui.widget.amount.AmountConfig;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.common.CurrencyCode;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import com.squareup.util.compose.SharedViewEventsKt;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.collections.immutable.ImmutableList;
import okhttp3.internal.Tags;
import okio.Path$$ExternalSyntheticBUOutline0;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;
import string.ReplaceModeKt;

/* loaded from: classes6.dex */
public abstract class ErrorKt {

    /* renamed from: lambda$-1030074619, reason: not valid java name */
    public static final ComposableLambdaImpl f555lambda$1030074619 = new ComposableLambdaImpl(new PaycheckCircles$$ExternalSyntheticLambda4(17), false, -1030074619);
    public static final ComposableLambdaImpl lambda$2106016631 = new ComposableLambdaImpl(new PaycheckCircles$$ExternalSyntheticLambda3(27), false, 2106016631);
    public static final ComposableLambdaImpl lambda$662857462 = new ComposableLambdaImpl(new PaycheckCircles$$ExternalSyntheticLambda3(28), false, 662857462);
    public static final ComposableLambdaImpl lambda$332176339 = new ComposableLambdaImpl(new PaycheckCircles$$ExternalSyntheticLambda3(29), false, 332176339);
    public static final ComposableLambdaImpl lambda$1776668000 = new ComposableLambdaImpl(new PaycheckCircles$$ExternalSyntheticLambda4(18), false, 1776668000);

    /* renamed from: lambda$-1806448483, reason: not valid java name */
    public static final ComposableLambdaImpl f557lambda$1806448483 = new ComposableLambdaImpl(new PaycheckCircles$$ExternalSyntheticLambda4(19), false, -1806448483);
    public static final ComposableLambdaImpl lambda$1072286056 = new ComposableLambdaImpl(new PoolsAppletTileKt$$ExternalSyntheticLambda3(1), false, 1072286056);

    /* renamed from: lambda$-1019768135, reason: not valid java name */
    public static final ComposableLambdaImpl f553lambda$1019768135 = new ComposableLambdaImpl(new PoolsAppletTileKt$$ExternalSyntheticLambda3(2), false, -1019768135);

    /* renamed from: lambda$-2013492318, reason: not valid java name */
    public static final ComposableLambdaImpl f558lambda$2013492318 = new ComposableLambdaImpl(new PoolsAppletTileKt$$ExternalSyntheticLambda3(3), false, -2013492318);

    /* renamed from: lambda$-1262508380, reason: not valid java name */
    public static final ComposableLambdaImpl f556lambda$1262508380 = new ComposableLambdaImpl(new PoolsAppletTileKt$$ExternalSyntheticLambda3(4), false, -1262508380);
    public static final ComposableLambdaImpl lambda$229401499 = new ComposableLambdaImpl(new PoolsAppletTileKt$$ExternalSyntheticLambda3(5), false, 229401499);
    public static final ComposableLambdaImpl lambda$526829788 = new ComposableLambdaImpl(new PoolsAppletTileKt$$ExternalSyntheticLambda3(6), false, 526829788);

    /* renamed from: lambda$-1022484128, reason: not valid java name */
    public static final ComposableLambdaImpl f554lambda$1022484128 = new ComposableLambdaImpl(new PoolsAppletTileKt$$ExternalSyntheticLambda3(7), false, -1022484128);

    public static final void ButtonCtaGroupWithProminentAddRecipient(boolean z, Function0 function0, Function0 function02, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(973420410);
        int i2 = (gapComposer.changed(z) ? 4 : 2) | i | (gapComposer.changedInstance(function0) ? 32 : 16) | (gapComposer.changedInstance(function02) ? 256 : 128);
        int i3 = 1;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(-1248736004, new AccountToolbarKt$$ExternalSyntheticLambda2(i3, function02, function0, z), gapComposer), gapComposer, 24576, 15);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ShareRequestKt$$ExternalSyntheticLambda3(z, function0, function02, i, 0);
        }
    }

    public static final void ButtonCtaGroupWithProminentShareLink(boolean z, Function0 function0, Function0 function02, Composer composer, int i) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(675568953);
        int i2 = 2;
        int i3 = (gapComposer.changed(z) ? 4 : 2) | i | (gapComposer.changedInstance(function0) ? 32 : 16) | (gapComposer.changedInstance(function02) ? 256 : 128);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(-1064204553, new AccountToolbarKt$$ExternalSyntheticLambda2(i2, function0, function02, z), gapComposer), gapComposer, 24576, 15);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ShareRequestKt$$ExternalSyntheticLambda3(z, function0, function02, i, 1);
        }
    }

    public static final void Error(Function0 function0, Modifier modifier, Composer composer, int i, int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(154731204);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i4 = i3 | 48;
        } else {
            i4 = i3 | (gapComposer.changed(modifier) ? 32 : 16);
        }
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 19) != 18)) {
            Modifier modifier3 = i5 != 0 ? Modifier.Companion.$$INSTANCE : modifier;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier3);
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
            DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
            Countries.PageHeader(Room.stringResource(gapComposer, R.string.payment_configuration_loading_error_title), (Modifier) null, f555lambda$1030074619, Room.stringResource(gapComposer, R.string.payment_configuration_loading_error_subtitle), gapComposer, MLKEMEngine.KyberPolyBytes, 2);
            DBUtil.SpacerBetweenSectionXLarge(0, 1, gapComposer, null);
            DBUtil.SpacerBetweenSectionXLarge(0, 1, gapComposer, null);
            DimensionKt.ButtonCtaGroup(null, false, ButtonCtaGroupOrientation.AUTOMATIC, null, Expect_jvmKt.rememberComposableLambda(1836457532, new DismissableToastKt$$ExternalSyntheticLambda3(26, function0), gapComposer), gapComposer, 24960, 11);
            gapComposer = gapComposer;
            gapComposer.end(true);
            modifier2 = modifier3;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ErrorKt$$ExternalSyntheticLambda1(function0, modifier2, i, i2, 0);
        }
    }

    public static final void InputAmount(PaymentConfigurationViewModel.InputAmount inputAmount, Function1 function1, Function0 function0, Composer composer, int i) {
        int i2;
        PaymentConfigurationViewModel.InputAmount inputAmount2;
        inputAmount.getClass();
        CurrencyCode currencyCode = inputAmount.currencyCode;
        function1.getClass();
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-2054974372);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(inputAmount) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            i2 |= gapComposer.changedInstance(function0) ? 256 : 128;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            boolean changed = gapComposer.changed(currencyCode.ordinal());
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                AmountConfig.MoneyConfig moneyConfig = new AmountConfig.MoneyConfig(inputAmount.currencyCode, null, false, 0, 14);
                gapComposer.updateRememberedValue(moneyConfig);
                rememberedValue = moneyConfig;
            }
            AmountConfig.MoneyConfig moneyConfig2 = (AmountConfig.MoneyConfig) rememberedValue;
            boolean changed2 = gapComposer.changed(currencyCode.ordinal());
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = inputAmount.rawAmount;
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            AmountKeypadState rememberAmountKeypadState = Debug.rememberAmountKeypadState(moneyConfig2, (String) rememberedValue2, gapComposer, 8, 28);
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion, 1.0f), 16.0f, RecyclerView.DECELERATION_RATE, 2);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
            Colors colors = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors.surface.keypad.text;
            Colors colors2 = (Colors) gapComposer.consume(staticProvidableCompositionLocal);
            if (colors2 == null) {
                colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            ReplaceModeKt.m4397AmountKeypadVjY4oTo(rememberAmountKeypadState, function1, m300paddingVpY3zN4$default, j, colors2.surface.keypad.text, null, lambda$662857462, inputAmount.title.leftAligned ? 5 : 3, 0L, gapComposer, (i2 & 112) | 12583296, 608);
            gapComposer = gapComposer;
            DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
            inputAmount2 = inputAmount;
            DimensionKt.ButtonCtaGroup(SizeKt.fillMaxWidth(companion, 1.0f), false, null, null, Expect_jvmKt.rememberComposableLambda(965332964, new PoolToastKt$$ExternalSyntheticLambda0(26, inputAmount2, function0, rememberAmountKeypadState), gapComposer), gapComposer, 24582, 14);
            DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
            gapComposer.end(true);
        } else {
            inputAmount2 = inputAmount;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new NoteRequiredViewKt$$ExternalSyntheticLambda1(inputAmount2, function1, function0, i, 20);
        }
    }

    public static final void InstrumentSelectionInformation(InstrumentSelectionRowViewModel instrumentSelectionRowViewModel, Function0 function0, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        String str;
        String str2;
        GapComposer gapComposer;
        Modifier.Companion companion;
        RealImageLoader realImageLoader;
        Modifier modifier3;
        float f;
        boolean z;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1576278756);
        int i2 = i | (gapComposer2.changedInstance(instrumentSelectionRowViewModel) ? 4 : 2) | (gapComposer2.changedInstance(function0) ? 32 : 16);
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            RealImageLoader realImageLoader2 = (RealImageLoader) gapComposer2.consume(LocalImageLoaderKt.LocalImageLoader);
            Modifier testTag = TestTagKt.testTag(modifier, "Funding source");
            boolean z2 = instrumentSelectionRowViewModel.isInstrumentSectionTappable;
            String str3 = instrumentSelectionRowViewModel.creditCardFee;
            String str4 = instrumentSelectionRowViewModel.balance;
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            if (z2) {
                gapComposer2.startReplaceGroup(-2042614652);
                Object rememberedValue = gapComposer2.rememberedValue();
                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                if (rememberedValue == neverEqualPolicy) {
                    rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer2);
                }
                MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue;
                str2 = str4;
                gapComposer = gapComposer2;
                realImageLoader = realImageLoader2;
                modifier2 = testTag;
                str = str3;
                RippleNodeFactory m3400rippleYJYuY3k = RippleKt.m3400rippleYJYuY3k(0L, true, RecyclerView.DECELERATION_RATE, null, gapComposer, 48, 13);
                String stringResource = Room.stringResource(gapComposer, R.string.instrument_selector_accessibility_hint);
                boolean z3 = (i2 & 112) == 32;
                Object rememberedValue2 = gapComposer.rememberedValue();
                if (z3 || rememberedValue2 == neverEqualPolicy) {
                    rememberedValue2 = new ToViewKt$$ExternalSyntheticLambda2(13, function0);
                    gapComposer.updateRememberedValue(rememberedValue2);
                }
                Modifier m182clickableO2vRcR0$default = ImageKt.m182clickableO2vRcR0$default(companion2, mutableInteractionSourceImpl, m3400rippleYJYuY3k, false, stringResource, null, (Function0) rememberedValue2, 20);
                companion = companion2;
                Object rememberedValue3 = gapComposer.rememberedValue();
                if (rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new MainPaymentViewKt$$ExternalSyntheticLambda25(24);
                    gapComposer.updateRememberedValue(rememberedValue3);
                }
                Modifier semantics = SemanticsModifierKt.semantics(m182clickableO2vRcR0$default, false, (Function1) rememberedValue3);
                gapComposer.end(false);
                modifier3 = semantics;
            } else {
                modifier2 = testTag;
                str = str3;
                str2 = str4;
                gapComposer = gapComposer2;
                companion = companion2;
                realImageLoader = realImageLoader2;
                gapComposer.startReplaceGroup(-2042236700);
                gapComposer.end(false);
                modifier3 = companion;
            }
            Modifier then = modifier2.then(modifier3);
            Strings.getSizes(gapComposer).getClass();
            DefaultSizes.spacing.getClass();
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(SpacerKt.m300paddingVpY3zN4$default(then, 16.0f, RecyclerView.DECELERATION_RATE, 2), 1.0f);
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(4.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.CenterVertically, gapComposer, 54);
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
            Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            InstrumentAvatarViewModel instrumentAvatarViewModel = instrumentSelectionRowViewModel.instrumentAvatarViewModel;
            if (instrumentAvatarViewModel == null) {
                gapComposer.startReplaceGroup(1534318714);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1534318715);
                ComposeMooncakeThemeKt.MooncakeTheme(Expect_jvmKt.rememberComposableLambda(-1167578828, new ReviewPaymentKt$$ExternalSyntheticLambda11(realImageLoader, instrumentAvatarViewModel, 0), gapComposer), gapComposer, 6);
                gapComposer.end(false);
            }
            if (instrumentSelectionRowViewModel.subtitle.length() > 0) {
                gapComposer.startReplaceGroup(1534634109);
                gapComposer2 = gapComposer;
                f = 4.0f;
                z = false;
                Room.m1165Text25TpFw(0, 1, 0, 0, 1572864, 0, 4018, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer2, (Modifier) null, TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer).bodyMedium, 0L, 0L, FontWeight.Medium, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777211), (TextLineBalancing) null, instrumentSelectionRowViewModel.subtitle, (Map) null, (Function1) null, false);
                gapComposer2.end(false);
            } else {
                f = 4.0f;
                gapComposer2 = gapComposer;
                z = false;
                gapComposer2.startReplaceGroup(1534861866);
                gapComposer2.end(false);
            }
            if (str2 == null || str2.length() <= 0) {
                Modifier.Companion companion3 = companion;
                float f2 = f;
                if (str == null || str.length() <= 0) {
                    gapComposer2.startReplaceGroup(1535481866);
                    gapComposer2.end(z);
                } else {
                    gapComposer2.startReplaceGroup(1535243352);
                    Room.m1165Text25TpFw(0, 1, 0, 0, 1572912, 0, 4016, Strings.getColors(gapComposer2).semantic.text.subtle, (Composer) gapComposer2, SpacerKt.m302paddingqDBjuR0$default(companion3, f2, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), Strings.getTypography(gapComposer2).bodyMedium, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                    gapComposer2.end(z);
                }
            } else {
                gapComposer2.startReplaceGroup(1534932670);
                Room.m1165Text25TpFw(0, 1, 0, 0, 1572912, 0, 4016, Strings.getColors(gapComposer2).semantic.text.subtle, (Composer) gapComposer2, SpacerKt.m302paddingqDBjuR0$default(companion, f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14), Strings.getTypography(gapComposer2).bodyMedium, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                gapComposer2.end(z);
            }
            if (instrumentSelectionRowViewModel.isInstrumentSectionTappable) {
                gapComposer2.startReplaceGroup(1535547586);
                Trace.m1191Iconww6aTOc(Icons.Expand24, (String) null, (Modifier) null, Strings.getColors(gapComposer2).semantic.icon.subtle, gapComposer2, 54, 4);
                gapComposer2.end(z);
            } else {
                gapComposer2.startReplaceGroup(1535684234);
                gapComposer2.end(z);
            }
            gapComposer2.end(true);
        } else {
            gapComposer2.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer2.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PdfPreviewView$$ExternalSyntheticLambda1(instrumentSelectionRowViewModel, function0, modifier, i, 10);
        }
    }

    public static final void Loading(Modifier modifier, Function0 function0, Function0 function02, PaymentConfigurationViewModel.Loading.LoadingStatus loadingStatus, Composer composer, int i) {
        function0.getClass();
        function02.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1043245022);
        int i2 = i | 6 | (gapComposer.changedInstance(function0) ? 32 : 16) | (gapComposer.changedInstance(function02) ? 256 : 128) | (gapComposer.changedInstance(loadingStatus) ? 2048 : 1024);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 1171) != 1170)) {
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(-49444887, new PdfPreviewView$$ExternalSyntheticLambda1(loadingStatus, function0, function02), gapComposer), gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PoolGoalMetKt$$ExternalSyntheticLambda0(modifier2, function0, function02, loadingStatus, i, 9);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x01e3  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00bf  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void NavigationIcon(NavigationType navigationType, Modifier modifier, Function0 function0, Composer composer, int i) {
        String str;
        int i2;
        String m;
        String str2;
        boolean z;
        Object rememberedValue;
        boolean z2;
        Modifier semantics;
        Icons icons;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1094934840);
        int i3 = i | (gapComposer.changed(modifier) ? 32 : 16) | (gapComposer.changedInstance(function0) ? 256 : 128);
        if (gapComposer.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
            Object rememberedValue2 = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
            }
            MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) rememberedValue2;
            int ordinal = navigationType.ordinal();
            if (ordinal == 0) {
                str = "NavigationIcon_Back";
            } else if (ordinal == 1) {
                str = "NavigationIcon_Close";
            } else {
                if (ordinal != 2) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return;
                }
                str = "NavigationIcon_None";
            }
            BiasAlignment biasAlignment = Alignment.Companion.Center;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier m287sizeVpY3zN4 = SizeKt.m287sizeVpY3zN4(companion, 56.0f, 52.0f);
            NavigationType navigationType2 = NavigationType.NONE;
            boolean z3 = navigationType != navigationType2;
            int ordinal2 = navigationType.ordinal();
            if (ordinal2 == 0) {
                i2 = 0;
                m = re$$ExternalSyntheticOutline0.m(gapComposer, -34582615, R.string.back_content_description, gapComposer, false);
            } else if (ordinal2 == 1) {
                i2 = 0;
                m = re$$ExternalSyntheticOutline0.m(gapComposer, -34580278, R.string.close_content_description, gapComposer, false);
            } else {
                if (ordinal2 != 2) {
                    throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -34583926, false);
                }
                gapComposer.startReplaceGroup(-1071917627);
                i2 = 0;
                gapComposer.end(false);
                str2 = null;
                Role role = new Role(i2);
                z = (i3 & 896) != 256;
                rememberedValue = gapComposer.rememberedValue();
                if (!z || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new ToViewKt$$ExternalSyntheticLambda2(14, function0);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Modifier m181clickableO2vRcR0 = ImageKt.m181clickableO2vRcR0(m287sizeVpY3zN4, mutableInteractionSourceImpl, null, z3, str2, role, (Function0) rememberedValue);
                if (navigationType != navigationType2) {
                    gapComposer.startReplaceGroup(-1071755000);
                    Object rememberedValue3 = gapComposer.rememberedValue();
                    if (rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new MainPaymentViewKt$$ExternalSyntheticLambda25(27);
                        gapComposer.updateRememberedValue(rememberedValue3);
                    }
                    z2 = false;
                    semantics = SemanticsModifierKt.semantics(companion, false, (Function1) rememberedValue3);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(-1071671207);
                    String stringResource = Room.stringResource(gapComposer, R.string.back_content_description);
                    String stringResource2 = Room.stringResource(gapComposer, R.string.close_content_description);
                    boolean changed = gapComposer.changed(stringResource) | gapComposer.changed(stringResource2);
                    Object rememberedValue4 = gapComposer.rememberedValue();
                    if (changed || rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new MoneyTabUIKt$$ExternalSyntheticLambda39(25, navigationType, stringResource, stringResource2);
                        gapComposer.updateRememberedValue(rememberedValue4);
                    }
                    z2 = false;
                    semantics = SemanticsModifierKt.semantics(companion, false, (Function1) rememberedValue4);
                    gapComposer.end(false);
                }
                Modifier testTag = TestTagKt.testTag(m181clickableO2vRcR0.then(semantics), str);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, z2);
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, testTag);
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
                Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                if (navigationType != navigationType2) {
                    gapComposer.startReplaceGroup(1609510170);
                    int ordinal3 = navigationType.ordinal();
                    if (ordinal3 == 0) {
                        icons = Icons.NavigationBack;
                    } else {
                        if (ordinal3 != 1) {
                            Path$$ExternalSyntheticBUOutline0.m();
                            return;
                        }
                        icons = Icons.NavigationClose;
                    }
                    Trace.m1191Iconww6aTOc(icons, (String) null, IndicationKt.indication(SizeKt.m285size3ABfNKs(modifier, 24.0f), mutableInteractionSourceImpl, RippleKt.m3400rippleYJYuY3k(0L, false, 20.0f, null, gapComposer, 432, 9)), ((Color) gapComposer.consume(ArcadeThemeKt.LocalIconColor)).value, gapComposer, 48, 0);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(1609987012);
                    gapComposer.end(false);
                }
                gapComposer.end(true);
            }
            str2 = m;
            Role role2 = new Role(i2);
            if ((i3 & 896) != 256) {
            }
            rememberedValue = gapComposer.rememberedValue();
            if (!z) {
            }
            rememberedValue = new ToViewKt$$ExternalSyntheticLambda2(14, function0);
            gapComposer.updateRememberedValue(rememberedValue);
            Modifier m181clickableO2vRcR02 = ImageKt.m181clickableO2vRcR0(m287sizeVpY3zN4, mutableInteractionSourceImpl, null, z3, str2, role2, (Function0) rememberedValue);
            if (navigationType != navigationType2) {
            }
            Modifier testTag2 = TestTagKt.testTag(m181clickableO2vRcR02.then(semantics), str);
            MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, z2);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, testTag2);
            ComposeUiNode.Companion.getClass();
            LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
            if (gapComposer.applier != null) {
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PdfPreviewView$$ExternalSyntheticLambda1(navigationType, modifier, function0, i, 11);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x0207  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00e5  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x00bc  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00c6  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00e3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ee  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0216  */
    /* JADX WARN: Removed duplicated region for block: B:81:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void NoteInput(final Function0 function0, final boolean z, Modifier modifier, final Function1 function1, final String str, boolean z2, final boolean z3, ImmutableList immutableList, FocusRequester focusRequester, final String str2, Composer composer, final int i, final int i2) {
        boolean z4;
        Modifier modifier2;
        int i3;
        boolean z5;
        ImmutableList immutableList2;
        int i4;
        int i5;
        FocusRequester focusRequester2;
        int i6;
        GapComposer gapComposer;
        final boolean z6;
        final ImmutableList immutableList3;
        final FocusRequester focusRequester3;
        RecomposeScopeImpl endRestartGroup;
        int i7;
        FocusRequester focusRequester4;
        boolean z7;
        ImmutableList immutableList4;
        int i8;
        Modifier modifier3;
        int i9;
        function0.getClass();
        function1.getClass();
        str.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-841223983);
        int i10 = (gapComposer2.changedInstance(function0) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            z4 = z;
            i10 |= gapComposer2.changed(z4) ? 32 : 16;
        } else {
            z4 = z;
        }
        int i11 = i2 & 4;
        if (i11 != 0) {
            i10 |= MLKEMEngine.KyberPolyBytes;
        } else if ((i & MLKEMEngine.KyberPolyBytes) == 0) {
            modifier2 = modifier;
            i10 |= gapComposer2.changed(modifier2) ? 256 : 128;
            int i12 = i10 | (!gapComposer2.changedInstance(function1) ? 2048 : 1024) | (!gapComposer2.changed(str) ? 16384 : PKIFailureInfo.certRevoked);
            i3 = i2 & 32;
            if (i3 == 0) {
                i12 |= 196608;
            } else if ((196608 & i) == 0) {
                z5 = z2;
                i12 |= gapComposer2.changed(z5) ? PKIFailureInfo.unsupportedVersion : 65536;
                if ((i2 & 128) == 0) {
                    immutableList2 = immutableList;
                    if (gapComposer2.changed(immutableList2)) {
                        i4 = 8388608;
                        i5 = i12 | i4;
                        if ((i & 100663296) != 0) {
                            if ((i2 & 256) == 0) {
                                focusRequester2 = focusRequester;
                                if (gapComposer2.changed(focusRequester2)) {
                                    i9 = 67108864;
                                    i5 |= i9;
                                }
                            } else {
                                focusRequester2 = focusRequester;
                            }
                            i9 = 33554432;
                            i5 |= i9;
                        } else {
                            focusRequester2 = focusRequester;
                        }
                        if ((i & 805306368) == 0) {
                            i5 |= gapComposer2.changed(str2) ? PKIFailureInfo.duplicateCertReq : 268435456;
                        }
                        i6 = i5;
                        if (gapComposer2.shouldExecute(i6 & 1, (i5 & 306783379) == 306783378)) {
                            gapComposer2.skipToGroupEnd();
                            gapComposer = gapComposer2;
                            z6 = z5;
                            immutableList3 = immutableList2;
                            focusRequester3 = focusRequester2;
                        } else {
                            gapComposer2.startDefaults();
                            if ((i & 1) == 0 || gapComposer2.getDefaultsInvalid()) {
                                if (i11 != 0) {
                                    modifier2 = Modifier.Companion.$$INSTANCE;
                                }
                                if (i3 != 0) {
                                    z5 = true;
                                }
                                if ((i2 & 128) != 0) {
                                    immutableList2 = Tags.persistentListOf(Room.stringResource(gapComposer2, R.string.payment_note_input_rotating_hint_one), Room.stringResource(gapComposer2, R.string.payment_note_input_rotating_hint_two), Room.stringResource(gapComposer2, R.string.payment_note_input_rotating_hint_three));
                                    i7 = i6 & (-29360129);
                                } else {
                                    i7 = i6;
                                }
                                if ((i2 & 256) != 0) {
                                    focusRequester4 = DBUtil.rememberFocusRequesterAndRequestFocus(gapComposer2);
                                    i7 &= -234881025;
                                } else {
                                    focusRequester4 = focusRequester2;
                                }
                                focusRequester2 = focusRequester4;
                                z7 = z5;
                                immutableList4 = immutableList2;
                                i8 = i7;
                                modifier3 = modifier2;
                            } else {
                                gapComposer2.skipToGroupEnd();
                                int i13 = (i2 & 128) != 0 ? i6 & (-29360129) : i6;
                                if ((i2 & 256) != 0) {
                                    i13 &= -234881025;
                                }
                                i8 = i13;
                                modifier3 = modifier2;
                                z7 = z5;
                                immutableList4 = immutableList2;
                            }
                            gapComposer2.endDefaults();
                            Shaker rememberShaker = SharedViewEventsKt.rememberShaker(false, gapComposer2, 1);
                            RealCashVibrator realCashVibrator = (RealCashVibrator) gapComposer2.consume(LocalCashVibratorKt.LocalCashVibrator);
                            boolean z8 = false;
                            TextFieldState m382rememberTextFieldStateLepunE = TextFieldStateKt.m382rememberTextFieldStateLepunE(str, 0L, gapComposer2, (i8 >> 12) & 14, 2);
                            CharSequence charSequence = m382rememberTextFieldStateLepunE.getValue$foundation().text;
                            boolean changed = ((i8 & 7168) == 2048) | gapComposer2.changed(m382rememberTextFieldStateLepunE);
                            Object rememberedValue = gapComposer2.rememberedValue();
                            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                            if (changed || rememberedValue == neverEqualPolicy) {
                                rememberedValue = new AndroidFileSaver$save$2(function1, m382rememberTextFieldStateLepunE, (Continuation) null, 5);
                                gapComposer2.updateRememberedValue(rememberedValue);
                            }
                            Updater.LaunchedEffect(gapComposer2, charSequence, (Function2) rememberedValue);
                            Unit unit = Unit.INSTANCE;
                            if ((((234881024 & i8) ^ 100663296) > 67108864 && gapComposer2.changed(focusRequester2)) || (i8 & 100663296) == 67108864) {
                                z8 = true;
                            }
                            Object rememberedValue2 = gapComposer2.rememberedValue();
                            if (z8 || rememberedValue2 == neverEqualPolicy) {
                                rememberedValue2 = new SsnViewKt$SsnContent$3$1$1(focusRequester2, null, 5);
                                gapComposer2.updateRememberedValue(rememberedValue2);
                            }
                            Updater.LaunchedEffect(gapComposer2, unit, (Function2) rememberedValue2);
                            Modifier modifier4 = modifier3;
                            modifier2 = modifier4;
                            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1596526374, new MoneyTabUIKt$$ExternalSyntheticLambda20(modifier4, focusRequester2, z4, rememberShaker, function0, z7, m382rememberTextFieldStateLepunE, realCashVibrator, z3, immutableList4, str2), gapComposer2);
                            gapComposer = gapComposer2;
                            ArcadeThemeKt.ArcadeTheme(null, null, null, rememberComposableLambda, gapComposer, 3072, 7);
                            z6 = z7;
                            immutableList3 = immutableList4;
                            focusRequester3 = focusRequester2;
                        }
                        final Modifier modifier5 = modifier2;
                        endRestartGroup = gapComposer.endRestartGroup();
                        if (endRestartGroup == null) {
                            endRestartGroup.block = new Function2() { // from class: com.squareup.cash.payments.views.composer.NoteInputKt$$ExternalSyntheticLambda1
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    ((Integer) obj2).getClass();
                                    ErrorKt.NoteInput(Function0.this, z, modifier5, function1, str, z6, z3, immutableList3, focusRequester3, str2, (Composer) obj, Updater.updateChangedFlags(i | 1), i2);
                                    return Unit.INSTANCE;
                                }
                            };
                            return;
                        }
                        return;
                    }
                } else {
                    immutableList2 = immutableList;
                }
                i4 = 4194304;
                i5 = i12 | i4;
                if ((i & 100663296) != 0) {
                }
                if ((i & 805306368) == 0) {
                }
                i6 = i5;
                if (gapComposer2.shouldExecute(i6 & 1, (i5 & 306783379) == 306783378)) {
                }
                final Modifier modifier52 = modifier2;
                endRestartGroup = gapComposer.endRestartGroup();
                if (endRestartGroup == null) {
                }
            }
            z5 = z2;
            if ((i2 & 128) == 0) {
            }
            i4 = 4194304;
            i5 = i12 | i4;
            if ((i & 100663296) != 0) {
            }
            if ((i & 805306368) == 0) {
            }
            i6 = i5;
            if (gapComposer2.shouldExecute(i6 & 1, (i5 & 306783379) == 306783378)) {
            }
            final Modifier modifier522 = modifier2;
            endRestartGroup = gapComposer.endRestartGroup();
            if (endRestartGroup == null) {
            }
        }
        modifier2 = modifier;
        int i122 = i10 | (!gapComposer2.changedInstance(function1) ? 2048 : 1024) | (!gapComposer2.changed(str) ? 16384 : PKIFailureInfo.certRevoked);
        i3 = i2 & 32;
        if (i3 == 0) {
        }
        z5 = z2;
        if ((i2 & 128) == 0) {
        }
        i4 = 4194304;
        i5 = i122 | i4;
        if ((i & 100663296) != 0) {
        }
        if ((i & 805306368) == 0) {
        }
        i6 = i5;
        if (gapComposer2.shouldExecute(i6 & 1, (i5 & 306783379) == 306783378)) {
        }
        final Modifier modifier5222 = modifier2;
        endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup == null) {
        }
    }

    public static final void OwnLinkMessage(Function0 function0, Modifier modifier, Composer composer, int i, int i2) {
        int i3;
        int i4;
        Modifier modifier2;
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1886126560);
        if ((i & 6) == 0) {
            i3 = (gapComposer.changedInstance(function0) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        int i5 = i2 & 2;
        if (i5 != 0) {
            i4 = i3 | 48;
        } else {
            i4 = i3 | (gapComposer.changed(modifier) ? 32 : 16);
        }
        if (gapComposer.shouldExecute(i4 & 1, (i4 & 19) != 18)) {
            Modifier modifier3 = i5 != 0 ? Modifier.Companion.$$INSTANCE : modifier;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier3);
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
            DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
            Countries.PageHeader(Room.stringResource(gapComposer, R.string.payment_configuration_load_own_link_title), (Modifier) null, (Function2) null, Room.stringResource(gapComposer, R.string.payment_configuration_load_own_link_subtitle), gapComposer, 0, 6);
            DBUtil.SpacerBetweenSectionXLarge(0, 1, gapComposer, null);
            DBUtil.SpacerBetweenSectionXLarge(0, 1, gapComposer, null);
            DimensionKt.ButtonCtaGroup(null, false, ButtonCtaGroupOrientation.AUTOMATIC, null, Expect_jvmKt.rememberComposableLambda(2140548952, new DismissableToastKt$$ExternalSyntheticLambda3(27, function0), gapComposer), gapComposer, 24960, 11);
            gapComposer = gapComposer;
            gapComposer.end(true);
            modifier2 = modifier3;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ErrorKt$$ExternalSyntheticLambda1(function0, modifier2, i, i2, 1);
        }
    }

    public static final void PaymentConfigurationTitle(PaymentConfigurationTitleViewModel paymentConfigurationTitleViewModel, Function1 function1, Modifier modifier, Composer composer, int i) {
        Modifier modifier2;
        paymentConfigurationTitleViewModel.getClass();
        List list = paymentConfigurationTitleViewModel.titles;
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1502630831);
        int i2 = i | (gapComposer.changedInstance(paymentConfigurationTitleViewModel) ? 4 : 2) | (gapComposer.changedInstance(function1) ? 32 : 16) | MLKEMEngine.KyberPolyBytes;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(fillMaxWidth, 16.0f, RecyclerView.DECELERATION_RATE, 2);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m300paddingVpY3zN4$default);
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
            gapComposer.startReplaceGroup(-109420442);
            int i3 = 0;
            for (Object obj : list) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                    throw null;
                }
                Title((PaymentConfigurationTitleViewModel.TitleViewModel) obj, function1, gapComposer, i2 & 112);
                if (i3 < CollectionsKt__CollectionsKt.getLastIndex(list)) {
                    gapComposer.startReplaceGroup(1406848934);
                    DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer, null);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(1406891218);
                    gapComposer.end(false);
                }
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
            endRestartGroup.block = new PdfPreviewView$$ExternalSyntheticLambda1((Object) paymentConfigurationTitleViewModel, function1, (Object) modifier2, i, 9);
        }
    }

    public static final void RecipientRow(Modifier modifier, Function1 function1, Function1 function12, RecipientViewModel recipientViewModel, Composer composer, int i) {
        GapComposer gapComposer;
        Modifier modifier2;
        ComposableLambdaImpl rememberComposableLambda;
        function1.getClass();
        function12.getClass();
        recipientViewModel.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(673030986);
        int i2 = i | 6 | (gapComposer2.changedInstance(function1) ? 32 : 16) | (gapComposer2.changedInstance(function12) ? 256 : 128) | 3072 | (gapComposer2.changedInstance(recipientViewModel) ? 16384 : PKIFailureInfo.certRevoked);
        int i3 = 1;
        if (gapComposer2.shouldExecute(i2 & 1, (i2 & 9363) != 9362)) {
            String stringResource = Room.stringResource(gapComposer2, R.string.view_profile);
            boolean changed = ((i2 & 896) == 256) | gapComposer2.changed(stringResource) | gapComposer2.changedInstance(recipientViewModel);
            Object rememberedValue = gapComposer2.rememberedValue();
            int i4 = 24;
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = new MoneyTabUIKt$$ExternalSyntheticLambda39(i4, stringResource, function12, recipientViewModel);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier semantics = SemanticsModifierKt.semantics(companion, false, (Function1) rememberedValue);
            String str = recipientViewModel.subtitle;
            if (str == null) {
                gapComposer2.startReplaceGroup(1359785231);
                gapComposer2.end(false);
                rememberComposableLambda = null;
            } else {
                gapComposer2.startReplaceGroup(1359785232);
                rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-893538899, new PoolCreateViewKt$$ExternalSyntheticLambda5(str, i4), gapComposer2);
                gapComposer2.end(false);
            }
            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(337670124, new PdfPreviewViewKt$$ExternalSyntheticLambda0(1, recipientViewModel, function12), gapComposer2);
            ComposableLambdaImpl rememberComposableLambda3 = Expect_jvmKt.rememberComposableLambda(-1813813011, new RecipientListViewKt$$ExternalSyntheticLambda13(recipientViewModel, i3), gapComposer2);
            boolean changedInstance = gapComposer2.changedInstance(recipientViewModel) | ((i2 & 112) == 32);
            Object rememberedValue2 = gapComposer2.rememberedValue();
            if (changedInstance || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new RecipientListViewKt$$ExternalSyntheticLambda10(function1, recipientViewModel, 2);
                gapComposer2.updateRememberedValue(rememberedValue2);
            }
            modifier2 = companion;
            gapComposer = gapComposer2;
            CellDefaultKt.m3392CellDefaultLargeIconygcbOzY(rememberComposableLambda2, rememberComposableLambda3, semantics, (Function0) rememberedValue2, null, false, false, rememberComposableLambda, null, null, 0L, null, gapComposer, 805306422, 0, 3440);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PoolGoalMetKt$$ExternalSyntheticLambda0(modifier2, function1, function12, recipientViewModel, i, 10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void ReviewPayment(Modifier modifier, final Function0 function0, final Function1 function1, final Function0 function02, Function0 function03, Function0 function04, Function0 function05, Function1 function12, final InstrumentSelectionRowViewModel instrumentSelectionRowViewModel, final boolean z, boolean z2, boolean z3, boolean z4, RecurringDisabledInstrument recurringDisabledInstrument, Image image, com.squareup.protos.cash.ui.Color color, List list, String str, com.squareup.protos.cash.ui.Color color2, List list2, final String str2, final String str3, List list3, Composer composer, final int i, final int i2, final int i3) {
        Function0 function06;
        int i4;
        Function0 function07;
        int i5;
        Function0 function08;
        int i6;
        Function1 function13;
        int i7;
        int i8;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        GapComposer gapComposer;
        final Modifier modifier2;
        final boolean z5;
        final boolean z6;
        final RecurringDisabledInstrument recurringDisabledInstrument2;
        final Image image2;
        final com.squareup.protos.cash.ui.Color color3;
        final List list4;
        final String str4;
        final com.squareup.protos.cash.ui.Color color4;
        final List list5;
        final List list6;
        final Function0 function09;
        final Function0 function010;
        final Function0 function011;
        final Function1 function14;
        final boolean z7;
        int i20;
        final Function0 function012;
        final Function0 function013;
        final Function0 function014;
        int i21;
        final Function1 function15;
        int i22;
        final Image image3;
        String str5;
        final List list7;
        function0.getClass();
        function1.getClass();
        function02.getClass();
        str2.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(400120971);
        int i23 = i | 6 | (gapComposer2.changedInstance(function0) ? 32 : 16) | (gapComposer2.changedInstance(function1) ? 256 : 128);
        if ((i & 3072) == 0) {
            i23 |= gapComposer2.changedInstance(function02) ? 2048 : 1024;
        }
        int i24 = i3 & 16;
        if (i24 != 0) {
            i4 = i23 | 24576;
            function06 = function03;
        } else {
            function06 = function03;
            i4 = i23 | (gapComposer2.changedInstance(function06) ? 16384 : PKIFailureInfo.certRevoked);
        }
        int i25 = i3 & 32;
        if (i25 != 0) {
            i5 = i4 | 196608;
            function07 = function04;
        } else {
            function07 = function04;
            i5 = i4 | (gapComposer2.changedInstance(function07) ? 131072 : 65536);
        }
        int i26 = i3 & 64;
        if (i26 != 0) {
            i6 = i5 | 1572864;
            function08 = function05;
        } else {
            function08 = function05;
            i6 = i5 | (gapComposer2.changedInstance(function08) ? 1048576 : 524288);
        }
        int i27 = i3 & 128;
        if (i27 != 0) {
            i7 = i6 | 12582912;
            function13 = function12;
        } else {
            function13 = function12;
            i7 = i6 | (gapComposer2.changedInstance(function13) ? 8388608 : 4194304);
        }
        int i28 = i7 | (gapComposer2.changedInstance(instrumentSelectionRowViewModel) ? 67108864 : 33554432);
        if ((i & 805306368) == 0) {
            i28 |= gapComposer2.changed(z) ? 536870912 : 268435456;
        }
        int i29 = i3 & 1024;
        char c = i29 != 0 ? (char) 6 : gapComposer2.changed(z2) ? (char) 4 : (char) 2;
        int i30 = i3 & 2048;
        if (i30 != 0) {
            i9 = c | '0';
            i8 = i30;
        } else {
            i8 = i30;
            i9 = c | (gapComposer2.changed(z3) ? ' ' : (char) 16);
        }
        int i31 = i9;
        int i32 = i28;
        int i33 = i3 & 4096;
        if (i33 != 0) {
            i10 = i31 | MLKEMEngine.KyberPolyBytes;
        } else {
            i10 = i31 | (gapComposer2.changed(z4) ? 256 : 128);
        }
        int i34 = i3 & PKIFailureInfo.certRevoked;
        if (i34 != 0) {
            i11 = i10 | 3072;
        } else {
            i11 = i10 | (gapComposer2.changed(recurringDisabledInstrument == null ? -1 : recurringDisabledInstrument.ordinal()) ? 2048 : 1024);
        }
        int i35 = i3 & 16384;
        if (i35 != 0) {
            i12 = i11 | 24576;
        } else {
            i12 = i11 | (gapComposer2.changedInstance(image) ? 16384 : PKIFailureInfo.certRevoked);
        }
        int i36 = i3 & 32768;
        if (i36 != 0) {
            i13 = i12 | 196608;
        } else {
            i13 = i12 | (gapComposer2.changedInstance(color) ? 131072 : 65536);
        }
        int i37 = i3 & 65536;
        if (i37 != 0) {
            i14 = i13 | 1572864;
        } else {
            i14 = i13 | (gapComposer2.changedInstance(list) ? (char) 0 : (char) 0);
        }
        int i38 = i3 & PKIFailureInfo.unsupportedVersion;
        if (i38 != 0) {
            i15 = i14 | 12582912;
        } else {
            i15 = i14 | (gapComposer2.changed(str) ? (char) 0 : (char) 0);
        }
        int i39 = i3 & PKIFailureInfo.transactionIdInUse;
        if (i39 != 0) {
            i16 = i15 | 100663296;
        } else {
            i16 = i15 | (gapComposer2.changedInstance(color2) ? (char) 0 : (char) 0);
        }
        int i40 = i3 & PKIFailureInfo.signerNotTrusted;
        if (i40 != 0) {
            i17 = i16 | 805306368;
        } else {
            i17 = i16 | (gapComposer2.changedInstance(list2) ? (char) 0 : (char) 0);
        }
        if ((i2 & 6) == 0) {
            i18 = i2 | (gapComposer2.changed(str2) ? 4 : 2);
        } else {
            i18 = i2;
        }
        int i41 = i18 | (gapComposer2.changed(str3) ? 32 : 16);
        int i42 = i3 & 4194304;
        if (i42 != 0) {
            i19 = i41 | MLKEMEngine.KyberPolyBytes;
        } else {
            i19 = i41 | (gapComposer2.changedInstance(list3) ? 256 : 128);
        }
        if (gapComposer2.shouldExecute(i32 & 1, ((i32 & 306783379) == 306783378 && (i17 & 306783379) == 306783378 && (i19 & 147) == 146) ? false : true)) {
            Object obj = Composer.Companion.Empty;
            if (i24 != 0) {
                Object rememberedValue = gapComposer2.rememberedValue();
                if (rememberedValue == obj) {
                    rememberedValue = new MainPaymentViewKt$$ExternalSyntheticLambda0(23);
                    gapComposer2.updateRememberedValue(rememberedValue);
                }
                function012 = (Function0) rememberedValue;
                i20 = i35;
            } else {
                i20 = i35;
                function012 = function06;
            }
            if (i25 != 0) {
                Object rememberedValue2 = gapComposer2.rememberedValue();
                if (rememberedValue2 == obj) {
                    rememberedValue2 = new MainPaymentViewKt$$ExternalSyntheticLambda0(24);
                    gapComposer2.updateRememberedValue(rememberedValue2);
                }
                function013 = (Function0) rememberedValue2;
            } else {
                function013 = function07;
            }
            if (i26 != 0) {
                Object rememberedValue3 = gapComposer2.rememberedValue();
                if (rememberedValue3 == obj) {
                    rememberedValue3 = new MainPaymentViewKt$$ExternalSyntheticLambda0(25);
                    gapComposer2.updateRememberedValue(rememberedValue3);
                }
                function014 = (Function0) rememberedValue3;
            } else {
                function014 = function08;
            }
            if (i27 != 0) {
                Object rememberedValue4 = gapComposer2.rememberedValue();
                if (rememberedValue4 == obj) {
                    rememberedValue4 = new MainPaymentViewKt$$ExternalSyntheticLambda25(25);
                    gapComposer2.updateRememberedValue(rememberedValue4);
                }
                function15 = (Function1) rememberedValue4;
                i21 = i42;
            } else {
                i21 = i42;
                function15 = function13;
            }
            final boolean z8 = i29 != 0 ? false : z2;
            final boolean z9 = i8 != 0 ? false : z3;
            final boolean z10 = i33 != 0 ? false : z4;
            final RecurringDisabledInstrument recurringDisabledInstrument3 = i34 != 0 ? null : recurringDisabledInstrument;
            if (i20 != 0) {
                i22 = i39;
                image3 = null;
            } else {
                i22 = i39;
                image3 = image;
            }
            final com.squareup.protos.cash.ui.Color color5 = i36 != 0 ? null : color;
            if (i37 != 0) {
                str5 = null;
                list7 = EmptyList.INSTANCE;
            } else {
                str5 = null;
                list7 = list;
            }
            final String str6 = i38 != 0 ? str5 : str;
            final com.squareup.protos.cash.ui.Color color6 = i22 != 0 ? str5 : color2;
            final List list8 = i40 != 0 ? EmptyList.INSTANCE : list2;
            final List list9 = i21 != 0 ? EmptyList.INSTANCE : list3;
            Object rememberedValue5 = gapComposer2.rememberedValue();
            if (rememberedValue5 == obj) {
                rememberedValue5 = new TouchRecorder(2);
                gapComposer2.updateRememberedValue(rememberedValue5);
            }
            final TouchRecorder touchRecorder = (TouchRecorder) rememberedValue5;
            ArcadeThemeKt.ArcadeTheme(null, null, null, Expect_jvmKt.rememberComposableLambda(967892438, new Function2() { // from class: com.squareup.cash.payments.views.composer.ReviewPaymentKt$$ExternalSyntheticLambda4
                /* JADX WARN: Multi-variable type inference failed */
                /* JADX WARN: Type inference failed for: r7v10, types: [boolean, int] */
                /* JADX WARN: Type inference failed for: r7v14 */
                /* JADX WARN: Type inference failed for: r7v5 */
                /* JADX WARN: Type inference failed for: r7v9 */
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    Modifier modifier3;
                    Modifier.Companion companion;
                    ?? r7;
                    int i43;
                    Composer composer2 = (Composer) obj2;
                    int intValue = ((Integer) obj3).intValue();
                    GapComposer gapComposer3 = (GapComposer) composer2;
                    boolean shouldExecute = gapComposer3.shouldExecute(intValue & 1, (intValue & 3) != 2);
                    Applier applier = gapComposer3.applier;
                    if (shouldExecute) {
                        MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.BottomCenter, false);
                        int hashCode = Long.hashCode(gapComposer3.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer3.currentCompositionLocalScope();
                        Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                        Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer3, companion2);
                        ComposeUiNode.Companion.getClass();
                        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                        if (applier == null) {
                            Updater.invalidApplier();
                            throw null;
                        }
                        gapComposer3.startReusableNode();
                        if (gapComposer3.inserting) {
                            gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                        } else {
                            gapComposer3.useNode();
                        }
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                        Updater.m576setimpl(gapComposer3, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                        Updater.m576setimpl(gapComposer3, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
                        Integer valueOf = Integer.valueOf(hashCode);
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                        Updater.m576setimpl(gapComposer3, valueOf, composeUiNode$Companion$SetModifier$13);
                        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                        Updater.m575reconcileimpl(gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                        Updater.m576setimpl(gapComposer3, materializeModifier, composeUiNode$Companion$SetModifier$14);
                        Modifier verticalScroll$default = ImageKt.verticalScroll$default(companion2, ImageKt.rememberScrollState(gapComposer3), false, 14);
                        ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer3, 0);
                        int hashCode2 = Long.hashCode(gapComposer3.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer3.currentCompositionLocalScope();
                        Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer3, verticalScroll$default);
                        gapComposer3.startReusableNode();
                        if (gapComposer3.inserting) {
                            gapComposer3.createNode(layoutNode$Companion$Constructor$1);
                        } else {
                            gapComposer3.useNode();
                        }
                        Updater.m576setimpl(gapComposer3, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                        Updater.m576setimpl(gapComposer3, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                        Recorder$$ExternalSyntheticOutline2.m(hashCode2, gapComposer3, composeUiNode$Companion$SetModifier$13, gapComposer3, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        Updater.m576setimpl(gapComposer3, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                        Image image4 = image3;
                        Function0 function015 = function02;
                        Object obj4 = Composer.Companion.Empty;
                        if (image4 != null) {
                            gapComposer3.startReplaceGroup(-1005650466);
                            DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer3, null);
                            String str7 = str6;
                            if (str7 == null) {
                                str7 = "";
                            }
                            ((DefaultSizes) gapComposer3.consume(ArcadeThemeKt.LocalSizes)).getClass();
                            DefaultSizes.spacing.getClass();
                            modifier3 = null;
                            companion = companion2;
                            AlphaKt.ExpressivePreview(image4, color5, list7, str7, function015, SpacerKt.m300paddingVpY3zN4$default(companion2, 16.0f, RecyclerView.DECELERATION_RATE, 2), color6, list8, gapComposer3, 0, 0);
                            gapComposer3.end(false);
                            r7 = 0;
                        } else {
                            modifier3 = null;
                            companion = companion2;
                            if (z) {
                                gapComposer3.startReplaceGroup(-1005125636);
                                String stringResource = Room.stringResource(gapComposer3, R.string.payment_personalize_button_accessibility_label);
                                DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer3, null);
                                DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer3, null);
                                ((DefaultSizes) gapComposer3.consume(ArcadeThemeKt.LocalSizes)).getClass();
                                DefaultSizes.spacing.getClass();
                                Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                                boolean changed = gapComposer3.changed(stringResource) | gapComposer3.changed(function015);
                                Object rememberedValue6 = gapComposer3.rememberedValue();
                                if (changed || rememberedValue6 == obj4) {
                                    rememberedValue6 = new ModalBottomSheetKt$$ExternalSyntheticLambda6(stringResource, function015, 3);
                                    gapComposer3.updateRememberedValue(rememberedValue6);
                                }
                                r7 = 0;
                                ErrorKt.StylePaymentButton(MLKEMEngine.KyberPolyBytes, gapComposer3, SemanticsModifierKt.semantics(m300paddingVpY3zN4$default, false, (Function1) rememberedValue6), function015);
                                gapComposer3.end(false);
                            } else {
                                r7 = 0;
                                gapComposer3.startReplaceGroup(-1004406808);
                                gapComposer3.end(false);
                            }
                        }
                        List list10 = list9;
                        if (list10.isEmpty()) {
                            gapComposer3.startReplaceGroup(-1004062584);
                            gapComposer3.end(r7);
                        } else {
                            gapComposer3.startReplaceGroup(-1004351845);
                            DBUtil.SpacerBetweenSectionLarge(r7, 1, gapComposer3, modifier3);
                            Modifier testTag = TestTagKt.testTag(companion, "transaction_details");
                            ((DefaultSizes) gapComposer3.consume(ArcadeThemeKt.LocalSizes)).getClass();
                            DefaultSizes.spacing.getClass();
                            ErrorKt.TransactionDetailsSection(r7, gapComposer3, SpacerKt.m300paddingVpY3zN4$default(testTag, 16.0f, RecyclerView.DECELERATION_RATE, 2), list10);
                            gapComposer3.end(r7);
                        }
                        DBUtil.SpacerBetweenSectionLarge(r7, 1, gapComposer3, modifier3);
                        DBUtil.SpacerBetweenSectionLarge(r7, 1, gapComposer3, modifier3);
                        InstrumentSelectionRowViewModel instrumentSelectionRowViewModel2 = instrumentSelectionRowViewModel;
                        if (instrumentSelectionRowViewModel2 != null) {
                            gapComposer3.startReplaceGroup(-1003935019);
                            ErrorKt.InstrumentSelectionInformation(instrumentSelectionRowViewModel2, function0, TestTagKt.testTag(companion, "instrument_selection_row"), gapComposer3, MLKEMEngine.KyberPolyBytes);
                            gapComposer3.end(r7);
                        } else {
                            gapComposer3.startReplaceGroup(-1003722328);
                            gapComposer3.end(r7);
                        }
                        DBUtil.SpacerWithinSectionMedium(r7, 1, gapComposer3, modifier3);
                        final String str8 = str3;
                        final Function1 function16 = function15;
                        final Function1 function17 = function1;
                        final TouchRecorder touchRecorder2 = touchRecorder;
                        final boolean z11 = z8;
                        final boolean z12 = z10;
                        final Function0 function016 = function013;
                        final Function0 function017 = function012;
                        final String str9 = str2;
                        final boolean z13 = z9;
                        Strings.TouchRecordingLayout(touchRecorder2, null, Expect_jvmKt.rememberComposableLambda(2069989167, new Function2() { // from class: com.squareup.cash.payments.views.composer.ReviewPaymentKt$$ExternalSyntheticLambda7
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj5, Object obj6) {
                                ComposableLambdaImpl rememberComposableLambda;
                                Composer composer3 = (Composer) obj5;
                                int intValue2 = ((Integer) obj6).intValue();
                                GapComposer gapComposer4 = (GapComposer) composer3;
                                if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                    ButtonCtaGroupOrientation buttonCtaGroupOrientation = ButtonCtaGroupOrientation.AUTOMATIC;
                                    String str10 = str8;
                                    if (str10 == null) {
                                        gapComposer4.startReplaceGroup(-93005258);
                                        gapComposer4.end(false);
                                        rememberComposableLambda = null;
                                    } else {
                                        gapComposer4.startReplaceGroup(-93005257);
                                        rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-275475206, new TabContentViewKt$$ExternalSyntheticLambda11(str10, function16, 26), gapComposer4);
                                        gapComposer4.end(false);
                                    }
                                    ComposableLambdaImpl composableLambdaImpl = rememberComposableLambda;
                                    final Function1 function18 = function17;
                                    final TouchRecorder touchRecorder3 = touchRecorder2;
                                    final boolean z14 = z11;
                                    final boolean z15 = z12;
                                    final Function0 function018 = function016;
                                    final Function0 function019 = function017;
                                    final String str11 = str9;
                                    final boolean z16 = z13;
                                    DimensionKt.ButtonCtaGroup(null, false, buttonCtaGroupOrientation, composableLambdaImpl, Expect_jvmKt.rememberComposableLambda(1338195437, new Function3() { // from class: com.squareup.cash.payments.views.composer.ReviewPaymentKt$$ExternalSyntheticLambda16
                                        @Override // kotlin.jvm.functions.Function3
                                        public final Object invoke(Object obj7, Object obj8, Object obj9) {
                                            AdaptiveStackScope adaptiveStackScope = (AdaptiveStackScope) obj7;
                                            Composer composer4 = (Composer) obj8;
                                            int intValue3 = ((Integer) obj9).intValue();
                                            adaptiveStackScope.getClass();
                                            if ((intValue3 & 6) == 0) {
                                                intValue3 |= ((GapComposer) composer4).changed(adaptiveStackScope) ? 4 : 2;
                                            }
                                            GapComposer gapComposer5 = (GapComposer) composer4;
                                            if (gapComposer5.shouldExecute(intValue3 & 1, (intValue3 & 19) != 18)) {
                                                Modifier.Companion companion3 = Modifier.Companion.$$INSTANCE;
                                                Modifier horizontalWeight = adaptiveStackScope.horizontalWeight(companion3, 1.0f);
                                                ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                                                Function1 function19 = Function1.this;
                                                boolean changed2 = gapComposer5.changed(function19);
                                                TouchRecorder touchRecorder4 = touchRecorder3;
                                                boolean changedInstance = changed2 | gapComposer5.changedInstance(touchRecorder4);
                                                Object rememberedValue7 = gapComposer5.rememberedValue();
                                                NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                                                if (changedInstance || rememberedValue7 == neverEqualPolicy) {
                                                    rememberedValue7 = new ReviewPaymentKt$$ExternalSyntheticLambda20(function19, touchRecorder4, 0);
                                                    gapComposer5.updateRememberedValue(rememberedValue7);
                                                }
                                                coil3.size.SizeKt.ButtonCta((Function0) rememberedValue7, horizontalWeight, buttonProminence, false, false, null, Expect_jvmKt.rememberComposableLambda(1106673490, new SheetKt$$ExternalSyntheticLambda8(str11, 3), gapComposer5), gapComposer5, 1573248, 56);
                                                if (z14) {
                                                    gapComposer5.startReplaceGroup(294172404);
                                                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxHeight(SizeKt.wrapContentWidth$default(companion3, null, 3), 1.0f), 24.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 14);
                                                    boolean z17 = z15;
                                                    Modifier alpha = androidx.compose.ui.draw.AlphaKt.alpha(m302paddingqDBjuR0$default, z17 ? 0.4f : 1.0f);
                                                    boolean changed3 = gapComposer5.changed(z17);
                                                    Object rememberedValue8 = gapComposer5.rememberedValue();
                                                    if (changed3 || rememberedValue8 == neverEqualPolicy) {
                                                        rememberedValue8 = new MoneyTabUIKt$$ExternalSyntheticLambda24(z17, 16);
                                                        gapComposer5.updateRememberedValue(rememberedValue8);
                                                    }
                                                    Modifier semantics = SemanticsModifierKt.semantics(alpha, false, (Function1) rememberedValue8);
                                                    ButtonProminence buttonProminence2 = ButtonProminence.STANDARD;
                                                    boolean changed4 = gapComposer5.changed(z17);
                                                    Function0 function020 = function018;
                                                    boolean changed5 = changed4 | gapComposer5.changed(function020);
                                                    Function0 function021 = function019;
                                                    boolean changed6 = changed5 | gapComposer5.changed(function021);
                                                    Object rememberedValue9 = gapComposer5.rememberedValue();
                                                    if (changed6 || rememberedValue9 == neverEqualPolicy) {
                                                        rememberedValue9 = new ReviewPaymentKt$$ExternalSyntheticLambda23(0, function020, function021, z17);
                                                        gapComposer5.updateRememberedValue(rememberedValue9);
                                                    }
                                                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue9, semantics, buttonProminence2, false, false, null, Expect_jvmKt.rememberComposableLambda(1069204013, new MoneyTabUIKt$$ExternalSyntheticLambda38(z16, 5), gapComposer5), gapComposer5, 1573248, 56);
                                                    gapComposer5.end(false);
                                                } else {
                                                    gapComposer5.startReplaceGroup(295232821);
                                                    gapComposer5.end(false);
                                                }
                                            } else {
                                                gapComposer5.skipToGroupEnd();
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }, gapComposer4), gapComposer4, 24960, 3);
                                } else {
                                    gapComposer4.skipToGroupEnd();
                                }
                                return Unit.INSTANCE;
                            }
                        }, gapComposer3), gapComposer3, 392, 2);
                        gapComposer3.end(true);
                        RecurringDisabledInstrument recurringDisabledInstrument4 = RecurringDisabledInstrument.this;
                        if (recurringDisabledInstrument4 != null) {
                            gapComposer3.startReplaceGroup(-83763965);
                            int ordinal = recurringDisabledInstrument4.ordinal();
                            if (ordinal == 0) {
                                i43 = R.string.payment_schedule_credit_card_unsupported_title;
                            } else {
                                if (ordinal != 1) {
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return modifier3;
                                }
                                i43 = R.string.payment_schedule_google_pay_unsupported_title;
                            }
                            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                            Object rememberedValue7 = gapComposer3.rememberedValue();
                            if (rememberedValue7 == obj4) {
                                rememberedValue7 = Recorder$$ExternalSyntheticOutline2.m(gapComposer3);
                            }
                            Function0 function018 = function014;
                            ModalKt.m3380ToastBAHpl2s(ImageKt.m182clickableO2vRcR0$default(fillMaxWidth, (MutableInteractionSourceImpl) rememberedValue7, null, false, null, null, function018, 28), null, Expect_jvmKt.rememberComposableLambda(-628579429, new LocalCombinedViewsKt$$ExternalSyntheticLambda3(i43, 11), gapComposer3), null, ErrorKt.f557lambda$1806448483, null, function018, null, gapComposer3, 24960, 426);
                            gapComposer3.end(false);
                        } else {
                            gapComposer3.startReplaceGroup(-82949998);
                            gapComposer3.end(false);
                        }
                        gapComposer3.end(true);
                    } else {
                        gapComposer3.skipToGroupEnd();
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer2), gapComposer2, 3072, 7);
            gapComposer = gapComposer2;
            modifier2 = Modifier.Companion.$$INSTANCE;
            recurringDisabledInstrument2 = recurringDisabledInstrument3;
            str4 = str6;
            color3 = color5;
            list4 = list7;
            color4 = color6;
            function14 = function15;
            z7 = z8;
            function09 = function012;
            z5 = z9;
            list5 = list8;
            z6 = z10;
            list6 = list9;
            image2 = image3;
            function011 = function014;
            function010 = function013;
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
            z5 = z3;
            z6 = z4;
            recurringDisabledInstrument2 = recurringDisabledInstrument;
            image2 = image;
            color3 = color;
            list4 = list;
            str4 = str;
            color4 = color2;
            list5 = list2;
            list6 = list3;
            function09 = function06;
            function010 = function07;
            function011 = function08;
            function14 = function13;
            z7 = z2;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2() { // from class: com.squareup.cash.payments.views.composer.ReviewPaymentKt$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(i | 1);
                    int updateChangedFlags2 = Updater.updateChangedFlags(i2);
                    ErrorKt.ReviewPayment(Modifier.this, function0, function1, function02, function09, function010, function011, function14, instrumentSelectionRowViewModel, z, z7, z5, z6, recurringDisabledInstrument2, image2, color3, list4, str4, color4, list5, str2, str3, list6, (Composer) obj2, updateChangedFlags, updateChangedFlags2, i3);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void RotatingTitleIcon(int i, Composer composer, Modifier modifier, Function0 function0, boolean z) {
        Modifier modifier2;
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1316152776);
        int i2 = (gapComposer.changedInstance(function0) ? 4 : 2) | i | 48 | (gapComposer.changed(z) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            float f = RecyclerView.DECELERATION_RATE;
            State animateFloatAsState = AnimateAsStateKt.animateFloatAsState(!z ? 45.0f : 0.0f, AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE, 0, null, 6), "close rotation animation", null, gapComposer, 3120, 20);
            if (z) {
                f = 270.0f;
            }
            State animateFloatAsState2 = AnimateAsStateKt.animateFloatAsState(f, AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE, 0, null, 6), "back rotation animation", null, gapComposer, 3120, 20);
            Boolean valueOf = Boolean.valueOf(z);
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new MainPaymentViewKt$$ExternalSyntheticLambda25(26);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            modifier2 = Modifier.Companion.$$INSTANCE;
            AnimatedContentKt.AnimatedContent(valueOf, modifier2, (Function1) rememberedValue, null, "TitleBar navigation icon animation", null, Expect_jvmKt.rememberComposableLambda(-1220550261, new FirstTimeBorrowKt$$ExternalSyntheticLambda2(15, function0, animateFloatAsState, animateFloatAsState2), gapComposer), gapComposer, ((i2 >> 6) & 14) | 1597872, 40);
            gapComposer = gapComposer;
        } else {
            gapComposer.skipToGroupEnd();
            modifier2 = modifier;
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new RotatingTitleIconKt$$ExternalSyntheticLambda2(function0, modifier2, z, i);
        }
    }

    public static final void SegmentedTitle(Function0 function0, String str, Subject subject, Modifier modifier, Composer composer, int i) {
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1498696218);
        int i2 = (gapComposer.changed(str) ? 32 : 16) | i | (gapComposer.changed(subject) ? 2048 : 1024) | 114819072;
        if (gapComposer.shouldExecute(i2 & 1, (38347923 & i2) != 38347922)) {
            Updater.CompositionLocalProvider(ArcadeThemeKt.LocalTextStyle.defaultProvidedValue$runtime(((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).pageTitle), Expect_jvmKt.rememberComposableLambda(1788276442, new PdfPreviewView$$ExternalSyntheticLambda1(subject, str, function0), gapComposer), gapComposer, 56);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            gapComposer.skipToGroupEnd();
        }
        Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PoolGoalMetKt$$ExternalSyntheticLambda0(function0, str, subject, modifier2, i, 11);
        }
    }

    public static final void SelectStablecoinWithdrawalOption(PaymentConfigurationViewModel.SelectStablecoinWithdrawalOption selectStablecoinWithdrawalOption, Function1 function1, Composer composer, int i) {
        int i2;
        int i3;
        selectStablecoinWithdrawalOption.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1756534306);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(selectStablecoinWithdrawalOption) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer, 0);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            int i4 = i2;
            Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
            StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            DefaultSizes.spacing.getClass();
            PaddingValuesImpl m295PaddingValuesYgX7TsA$default = SpacerKt.m295PaddingValuesYgX7TsA$default(RecyclerView.DECELERATION_RATE, 16.0f, 1);
            boolean changedInstance = ((i4 & 112) == 32) | gapComposer.changedInstance(selectStablecoinWithdrawalOption);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new OpenSourceKt$$ExternalSyntheticLambda11(5, selectStablecoinWithdrawalOption, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            LazyDslKt.LazyColumn(fillMaxWidth2, null, m295PaddingValuesYgX7TsA$default, null, null, null, false, null, (Function1) rememberedValue, gapComposer, 6, 506);
            String str = selectStablecoinWithdrawalOption.disclaimerText;
            TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodyXSmall;
            Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
            if (colors == null) {
                colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
            } else {
                gapComposer.startReplaceGroup(-1762997739);
                gapComposer.end(false);
            }
            long j = colors.semantic.text.subtle;
            Modifier fillMaxWidth3 = SizeKt.fillMaxWidth(companion, 1.0f);
            ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
            Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3824, j, (Composer) gapComposer, SpacerKt.m299paddingVpY3zN4(fillMaxWidth3, 24.0f, 16.0f), textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
            i3 = 1;
            gapComposer.end(true);
        } else {
            i3 = 1;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OpenSourceKt$$ExternalSyntheticLambda1(selectStablecoinWithdrawalOption, function1, i, i3);
        }
    }

    public static final void ShareRequest(boolean z, boolean z2, Function0 function0, Function0 function02, boolean z3, Modifier modifier, Composer composer, final int i) {
        final boolean z4;
        final boolean z5;
        final Function0 function03;
        final Function0 function04;
        final boolean z6;
        GapComposer gapComposer;
        function0.getClass();
        function02.getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1366183122);
        int i2 = (gapComposer2.changed(z) ? 4 : 2) | i | (gapComposer2.changed(z2) ? 32 : 16) | (gapComposer2.changedInstance(function0) ? 256 : 128) | (gapComposer2.changedInstance(function02) ? 2048 : 1024) | (gapComposer2.changed(z3) ? 16384 : PKIFailureInfo.certRevoked) | 196608;
        if (gapComposer2.shouldExecute(i2 & 1, (74899 & i2) != 74898)) {
            z4 = z;
            function03 = function0;
            z5 = z2;
            z6 = z3;
            function04 = function02;
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(-1278009415, new LocalComposeUiKt$$ExternalSyntheticLambda1(function0, z2, z3, z4, function02), gapComposer2);
            gapComposer = gapComposer2;
            ArcadeThemeKt.ArcadeTheme(null, null, null, rememberComposableLambda, gapComposer, 3072, 7);
            modifier = Modifier.Companion.$$INSTANCE;
        } else {
            z4 = z;
            z5 = z2;
            function03 = function0;
            function04 = function02;
            z6 = z3;
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        final Modifier modifier2 = modifier;
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new Function2(z4, z5, function03, function04, z6, modifier2, i) { // from class: com.squareup.cash.payments.views.composer.ShareRequestKt$$ExternalSyntheticLambda1
                public final /* synthetic */ boolean f$0;
                public final /* synthetic */ boolean f$1;
                public final /* synthetic */ Function0 f$2;
                public final /* synthetic */ Function0 f$3;
                public final /* synthetic */ boolean f$4;
                public final /* synthetic */ Modifier f$5;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int updateChangedFlags = Updater.updateChangedFlags(1);
                    ErrorKt.ShareRequest(this.f$0, this.f$1, this.f$2, this.f$3, this.f$4, this.f$5, (Composer) obj, updateChangedFlags);
                    return Unit.INSTANCE;
                }
            };
        }
    }

    public static final void StylePaymentButton(int i, Composer composer, Modifier modifier, Function0 function0) {
        function0.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-313134625);
        Applier applier = gapComposer.applier;
        int i2 = (gapComposer.changedInstance(function0) ? 4 : 2) | i | (gapComposer.changed(modifier) ? 32 : 16);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            Modifier clip = ClipKt.clip(QuickPayViewKt.movingImageBackground(modifier, ImageResources_androidKt.imageResource(gapComposer, ImageKt.isSystemInDarkTheme(gapComposer) ? 2131233600 : 2131233601), gapComposer), RoundedCornerShapeKt.RoundedCornerShape(50));
            Object rememberedValue = gapComposer.rememberedValue();
            if (rememberedValue == Composer.Companion.Empty) {
                rememberedValue = Recorder$$ExternalSyntheticOutline2.m(gapComposer);
            }
            Modifier m178borderxT4_qwU = ImageKt.m178borderxT4_qwU(ImageKt.m182clickableO2vRcR0$default(clip, (MutableInteractionSourceImpl) rememberedValue, RippleKt.m3400rippleYJYuY3k(0L, true, RecyclerView.DECELERATION_RATE, null, gapComposer, 48, 13), false, null, new Role(0), function0, 12), 1.0f, Color.m675copywmQWz5c$default(0.4f, Color.Black, 14), RoundedCornerShapeKt.RoundedCornerShape(50));
            MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, m178borderxT4_qwU);
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
            Updater.m576setimpl(gapComposer, maybeCachedBoxMeasurePolicy, composeUiNode$Companion$SetModifier$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
            Integer valueOf = Integer.valueOf(hashCode);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
            Updater.m576setimpl(gapComposer, valueOf, composeUiNode$Companion$SetModifier$13);
            OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
            Updater.m575reconcileimpl(gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
            Updater.m576setimpl(gapComposer, materializeModifier, composeUiNode$Companion$SetModifier$14);
            Modifier m299paddingVpY3zN4 = SpacerKt.m299paddingVpY3zN4(Modifier.Companion.$$INSTANCE, 24.0f, 10.0f);
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(4.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.CenterVertically, gapComposer, 48);
            int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, m299paddingVpY3zN4);
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
            lambda$1776668000.invoke((Object) gapComposer, (Object) 6);
            gapComposer.end(true);
            gapComposer.end(true);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new ComposerKt$$ExternalSyntheticLambda14(function0, modifier, i, 8);
        }
    }

    public static final void Title(PaymentConfigurationTitleViewModel.TitleViewModel titleViewModel, Function1 function1, Composer composer, int i) {
        int i2;
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(-1083765402);
        if ((i & 6) == 0) {
            i2 = (gapComposer.changedInstance(titleViewModel) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= gapComposer.changedInstance(function1) ? 32 : 16;
        }
        int i3 = 0;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            Updater.CompositionLocalProvider(ArcadeThemeKt.LocalTextStyle.defaultProvidedValue$runtime(((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).pageTitle), Expect_jvmKt.rememberComposableLambda(-640798170, new PaymentConfigurationTitleKt$$ExternalSyntheticLambda1(titleViewModel, function1, i3), gapComposer), gapComposer, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new OverlayKt$$ExternalSyntheticLambda2(titleViewModel, function1, i, 29);
        }
    }

    public static final void TransactionDetailsSection(int i, Composer composer, Modifier modifier, List list) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(435591559);
        Applier applier = gapComposer.applier;
        int i2 = i | (gapComposer.changedInstance(list) ? 4 : 2) | (gapComposer.changed(modifier) ? 32 : 16);
        boolean z = true;
        boolean z2 = false;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 19) != 18)) {
            ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
            DefaultSizes.spacing.getClass();
            int i3 = 3;
            ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(8.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.Start, gapComposer, 0);
            int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, modifier);
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
            Updater.m576setimpl(gapComposer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer, materializeModifier, ComposeUiNode.Companion.SetModifier);
            gapComposer.startReplaceGroup(-1973908608);
            Iterator it = list.iterator();
            while (it.hasNext()) {
                LabeledDetailRow labeledDetailRow = (LabeledDetailRow) it.next();
                Modifier testTag = TestTagKt.testTag(Modifier.Companion.$$INSTANCE, "transaction_detail_row");
                Strings.getSizes(gapComposer).getClass();
                DefaultSizes.spacing.getClass();
                RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(4.0f, z, new Drop$$ExternalSyntheticBUOutline0(i3)), Alignment.Companion.CenterVertically, gapComposer, 48);
                int hashCode2 = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer, testTag);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                gapComposer.startReusableNode();
                if (gapComposer.inserting) {
                    gapComposer.createNode(layoutNode$Companion$Constructor$12);
                } else {
                    gapComposer.useNode();
                }
                Updater.m576setimpl(gapComposer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(gapComposer, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(gapComposer, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(gapComposer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(gapComposer, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                boolean z3 = z;
                Iterator it2 = it;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).labelMedium, (TextLineBalancing) null, labeledDetailRow.label, (Map) null, (Function1) null, false);
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodyMedium, (TextLineBalancing) null, labeledDetailRow.value, (Map) null, (Function1) null, false);
                gapComposer.end(z3);
                it = it2;
                z = z3;
                i3 = i3;
                z2 = false;
            }
            gapComposer.end(z2);
            gapComposer.end(z);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new LocalHomeGeoViewKt$$ExternalSyntheticLambda17(list, modifier, i, 8, false);
        }
    }

    public static final void WithdrawalOptionRow(final StablecoinWithdrawalOptionRow stablecoinWithdrawalOptionRow, Function1 function1, Composer composer, int i) {
        GapComposer gapComposer;
        GapComposer gapComposer2 = (GapComposer) composer;
        gapComposer2.startRestartGroup(-1143285502);
        final int i2 = 2;
        int i3 = (gapComposer2.changedInstance(stablecoinWithdrawalOptionRow) ? 4 : 2) | i | (gapComposer2.changedInstance(function1) ? 32 : 16);
        final int i4 = 1;
        if (gapComposer2.shouldExecute(i3 & 1, (i3 & 19) != 18)) {
            ComposableLambdaImpl rememberComposableLambda = Expect_jvmKt.rememberComposableLambda(1846306340, new Function2() { // from class: com.squareup.cash.payments.views.composer.SelectStablecoinWithdrawalOptionKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    String m;
                    int i5 = r2;
                    StablecoinWithdrawalOptionRow stablecoinWithdrawalOptionRow2 = stablecoinWithdrawalOptionRow;
                    switch (i5) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer2;
                            if (gapComposer3.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                                Image image = stablecoinWithdrawalOptionRow2.avatar.image;
                                if (image == null) {
                                    gapComposer3.startReplaceGroup(1961034352);
                                    gapComposer3.end(false);
                                    m = null;
                                } else {
                                    m = SVG$Unit$EnumUnboxingLocalUtility.m(gapComposer3, 478901169, image, gapComposer3, false);
                                }
                                AvatarImage.Remote.Image image2 = m != null ? new AvatarImage.Remote.Image(m, false, null, 0L, new SheetKt$$ExternalSyntheticLambda8(m, 4), 62) : null;
                                AvatarSize avatarSize = AvatarSize.Size48;
                                String str = stablecoinWithdrawalOptionRow2.avatar.monogram;
                                if (str == null) {
                                    str = "";
                                }
                                String str2 = str;
                                Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                                if (colors == null) {
                                    colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                } else {
                                    gapComposer3.startReplaceGroup(-1762997739);
                                    gapComposer3.end(false);
                                }
                                TextViewKt.Avatar(avatarSize, new AvatarEntry(str2, colors.semantic.icon.standard, null, image2, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE), null, false, gapComposer3, 6, 28);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                        case 1:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer3;
                            if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, stablecoinWithdrawalOptionRow2.label, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer4 = (Composer) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            GapComposer gapComposer5 = (GapComposer) composer4;
                            if (gapComposer5.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, stablecoinWithdrawalOptionRow2.body, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer5.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer2);
            ComposableLambdaImpl rememberComposableLambda2 = Expect_jvmKt.rememberComposableLambda(-1869894811, new Function2() { // from class: com.squareup.cash.payments.views.composer.SelectStablecoinWithdrawalOptionKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    String m;
                    int i5 = i4;
                    StablecoinWithdrawalOptionRow stablecoinWithdrawalOptionRow2 = stablecoinWithdrawalOptionRow;
                    switch (i5) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer2;
                            if (gapComposer3.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                                Image image = stablecoinWithdrawalOptionRow2.avatar.image;
                                if (image == null) {
                                    gapComposer3.startReplaceGroup(1961034352);
                                    gapComposer3.end(false);
                                    m = null;
                                } else {
                                    m = SVG$Unit$EnumUnboxingLocalUtility.m(gapComposer3, 478901169, image, gapComposer3, false);
                                }
                                AvatarImage.Remote.Image image2 = m != null ? new AvatarImage.Remote.Image(m, false, null, 0L, new SheetKt$$ExternalSyntheticLambda8(m, 4), 62) : null;
                                AvatarSize avatarSize = AvatarSize.Size48;
                                String str = stablecoinWithdrawalOptionRow2.avatar.monogram;
                                if (str == null) {
                                    str = "";
                                }
                                String str2 = str;
                                Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                                if (colors == null) {
                                    colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                } else {
                                    gapComposer3.startReplaceGroup(-1762997739);
                                    gapComposer3.end(false);
                                }
                                TextViewKt.Avatar(avatarSize, new AvatarEntry(str2, colors.semantic.icon.standard, null, image2, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE), null, false, gapComposer3, 6, 28);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                        case 1:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer3;
                            if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, stablecoinWithdrawalOptionRow2.label, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer4 = (Composer) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            GapComposer gapComposer5 = (GapComposer) composer4;
                            if (gapComposer5.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, stablecoinWithdrawalOptionRow2.body, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer5.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer2);
            int i5 = (gapComposer2.changedInstance(stablecoinWithdrawalOptionRow) ? 1 : 0) | ((i3 & 112) == 32 ? 1 : 0);
            Object rememberedValue = gapComposer2.rememberedValue();
            if (i5 != 0 || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new ProfileKt$$ExternalSyntheticLambda11(i4, function1, stablecoinWithdrawalOptionRow);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            gapComposer = gapComposer2;
            CellDefaultKt.m3392CellDefaultLargeIconygcbOzY(rememberComposableLambda, rememberComposableLambda2, null, (Function0) rememberedValue, null, false, false, Expect_jvmKt.rememberComposableLambda(1602702059, new Function2() { // from class: com.squareup.cash.payments.views.composer.SelectStablecoinWithdrawalOptionKt$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    String m;
                    int i52 = i2;
                    StablecoinWithdrawalOptionRow stablecoinWithdrawalOptionRow2 = stablecoinWithdrawalOptionRow;
                    switch (i52) {
                        case 0:
                            Composer composer2 = (Composer) obj;
                            int intValue = ((Integer) obj2).intValue();
                            GapComposer gapComposer3 = (GapComposer) composer2;
                            if (gapComposer3.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                                Image image = stablecoinWithdrawalOptionRow2.avatar.image;
                                if (image == null) {
                                    gapComposer3.startReplaceGroup(1961034352);
                                    gapComposer3.end(false);
                                    m = null;
                                } else {
                                    m = SVG$Unit$EnumUnboxingLocalUtility.m(gapComposer3, 478901169, image, gapComposer3, false);
                                }
                                AvatarImage.Remote.Image image2 = m != null ? new AvatarImage.Remote.Image(m, false, null, 0L, new SheetKt$$ExternalSyntheticLambda8(m, 4), 62) : null;
                                AvatarSize avatarSize = AvatarSize.Size48;
                                String str = stablecoinWithdrawalOptionRow2.avatar.monogram;
                                if (str == null) {
                                    str = "";
                                }
                                String str2 = str;
                                Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                                if (colors == null) {
                                    colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                } else {
                                    gapComposer3.startReplaceGroup(-1762997739);
                                    gapComposer3.end(false);
                                }
                                TextViewKt.Avatar(avatarSize, new AvatarEntry(str2, colors.semantic.icon.standard, null, image2, null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE), null, false, gapComposer3, 6, 28);
                            } else {
                                gapComposer3.skipToGroupEnd();
                            }
                            break;
                        case 1:
                            Composer composer3 = (Composer) obj;
                            int intValue2 = ((Integer) obj2).intValue();
                            GapComposer gapComposer4 = (GapComposer) composer3;
                            if (gapComposer4.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, stablecoinWithdrawalOptionRow2.label, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer4.skipToGroupEnd();
                            }
                            break;
                        default:
                            Composer composer4 = (Composer) obj;
                            int intValue3 = ((Integer) obj2).intValue();
                            GapComposer gapComposer5 = (GapComposer) composer4;
                            if (gapComposer5.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, stablecoinWithdrawalOptionRow2.body, (Map) null, (Function1) null, false);
                            } else {
                                gapComposer5.skipToGroupEnd();
                            }
                            break;
                    }
                    return Unit.INSTANCE;
                }
            }, gapComposer2), null, null, 0L, null, gapComposer, 12582966, 0, 3956);
        } else {
            gapComposer = gapComposer2;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new PdfPreviewViewKt$$ExternalSyntheticLambda0(stablecoinWithdrawalOptionRow, function1, i, 3);
        }
    }

    public static final Modifier optionalClickable(Composer composer) {
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1779838451);
        gapComposer.end(false);
        return Modifier.Companion.$$INSTANCE;
    }
}
