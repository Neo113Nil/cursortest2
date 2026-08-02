package com.squareup.cash.blockers.views;

import android.icu.text.MessageFormat;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentScopeImpl;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.BasicTextFieldKt$$ExternalSyntheticLambda2;
import androidx.compose.foundation.text.KeyboardActions;
import androidx.compose.foundation.text.KeyboardOptions;
import androidx.compose.material.SwipeToDismissKt$$ExternalSyntheticLambda2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.focus.FocusTraversalKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.platform.DelegatingSoftwareKeyboardController;
import androidx.compose.ui.platform.TestTagKt;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.input.TextFieldValue;
import androidx.compose.ui.text.input.VisualTransformation;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.unit.Dp;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import androidx.navigation.NavDestination;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.TransactorKt;
import androidx.room.util.DBUtil;
import app.cash.molecule.PlatformKt;
import bo.app.l2$$ExternalSyntheticLambda7;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.SubcomposeAsyncImageKt$$ExternalSyntheticLambda0;
import coil3.size.DimensionKt;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewModel;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.Badge;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.input.InputFieldKt;
import com.squareup.cash.arcade.components.internal.InputState;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.components.titlebar.TitleBarActionScope;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.AvatarsKt$$ExternalSyntheticLambda4;
import com.squareup.cash.blockers.viewmodels.BankAccountLinkingViewModel;
import com.squareup.cash.blockers.viewmodels.SsnViewModel;
import com.squareup.cash.blockers.viewmodels.VerifyAliasModel;
import com.squareup.cash.blockers.views.components.VerificationCodeHyphenationTransformer;
import com.squareup.cash.borrow.views.BorrowHomeKt$$ExternalSyntheticLambda3;
import com.squareup.cash.card.ui.CashCardKt$$ExternalSyntheticLambda0;
import com.squareup.cash.checks.CaptureCheckFaceKt$$ExternalSyntheticLambda11;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.directory_ui.views.SectionKt$$ExternalSyntheticLambda2;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.maps.views.CashMapViewKt$$ExternalSyntheticLambda3;
import com.squareup.cash.moneyformatter.api.MoneyFormatter;
import com.squareup.cash.mooncake.themes.ColorPalette;
import com.squareup.cash.mooncake.themes.ThemeInfo;
import com.squareup.cash.offers.viewmodels.itemviewmodels.OffersHomeListItemViewModel;
import com.squareup.cash.offers.views.UtilsKt$$ExternalSyntheticLambda0;
import com.squareup.cash.offers.views.home.OffersHeroTileKt;
import com.squareup.cash.offers.views.home.OffersHeroTileKt$$ExternalSyntheticLambda3;
import com.squareup.cash.scrubbing.InsertingScrubber;
import com.squareup.cash.scrubbing.MaskVisualTransformation;
import com.squareup.cash.securitysignals.ui.TouchRecorder;
import com.squareup.cash.tabs.viewmodels.TabToolbarBadgeViewModel$Dot;
import com.squareup.cash.tabs.viewmodels.TabToolbarBadgeViewModel$Text;
import com.squareup.cash.tabs.viewmodels.TabToolbarInternalViewModel;
import com.squareup.cash.tabs.views.SharedToolbarSwipeScope;
import com.squareup.cash.tabs.views.SwipeToolbarCorner;
import com.squareup.cash.tabs.views.TabToolbarsKt;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda19;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda8;
import com.squareup.cash.transfers.viewmodels.AddMoneyViewModel;
import com.squareup.cash.transfers.viewmodels.WithdrawViewModel;
import com.squareup.cash.transfers.views.AddMoneyView;
import com.squareup.cash.transfers.views.AddMoneyView$$ExternalSyntheticLambda12;
import com.squareup.cash.transfers.views.AddMoneyViewKt;
import com.squareup.cash.transfers.views.WithdrawView;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.ui.widget.amount.AmountConfig;
import com.squareup.cash.wallet.views.WalletHomeViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.work.identifiers.JobIdentifier;
import com.squareup.cash.work.identifiers.LocationIdentifier;
import com.squareup.cash.work.viewmodels.ClockInBottomSheetViewModel;
import com.squareup.cash.work.views.clockin.ClockInSheetMode;
import com.squareup.cash.work.views.clockin.DisclaimerTextKt;
import com.squareup.cash.work.views.pay.PayHomeViewKt$$ExternalSyntheticLambda2;
import com.squareup.cropview.Edge;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import com.squareup.util.compose.SharedViewEventsKt;
import com.stripe.android.model.parsers.WalletJsonParser;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes7.dex */
public final /* synthetic */ class SsnViewKt$$ExternalSyntheticLambda7 implements Function4 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Function1 f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Object f$5;

    public /* synthetic */ SsnViewKt$$ExternalSyntheticLambda7(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, ClockInBottomSheetViewModel clockInBottomSheetViewModel, Function0 function0, Function1 function1) {
        this.$r8$classId = 8;
        this.f$0 = clockInBottomSheetViewModel;
        this.f$1 = function0;
        this.f$2 = function1;
        this.f$3 = mutableState;
        this.f$5 = mutableState2;
        this.f$4 = mutableState3;
    }

    /* JADX WARN: Code restructure failed: missing block: B:170:0x06de, code lost:
    
        if (r2 == r1) goto L182;
     */
    @Override // kotlin.jvm.functions.Function4
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        Color m;
        Colors m1468withTint4WTKRHQ;
        ColorPalette colorPalette;
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1;
        NavigationType navigationType;
        Function1 function1;
        Object obj5;
        Modifier m183clickableoSLSa3U$default;
        Badge badge;
        Badge large;
        int i = this.$r8$classId;
        Function1 function12 = this.f$2;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Object obj6 = Composer.Companion.Empty;
        Object obj7 = this.f$4;
        Object obj8 = this.f$5;
        Object obj9 = this.f$3;
        Object obj10 = this.f$1;
        Object obj11 = this.f$0;
        switch (i) {
            case 0:
                TouchRecorder touchRecorder = (TouchRecorder) obj11;
                FocusRequester focusRequester = (FocusRequester) obj10;
                MutableState mutableState = (MutableState) obj9;
                InsertingScrubber insertingScrubber = (InsertingScrubber) obj7;
                MutableState mutableState2 = (MutableState) obj8;
                AnimatedContentScopeImpl animatedContentScopeImpl = (AnimatedContentScopeImpl) obj;
                SsnViewModel ssnViewModel = (SsnViewModel) obj2;
                Composer composer = (Composer) obj3;
                ((Integer) obj4).getClass();
                animatedContentScopeImpl.getClass();
                ssnViewModel.getClass();
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, composer, 0);
                GapComposer gapComposer = (GapComposer) composer;
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(composer, companion);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                GapComposer gapComposer2 = (GapComposer) composer;
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
                Updater.m576setimpl(composer, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(composer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(composer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(composer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(composer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                DBUtil.TitleBarSub((String) null, NavigationType.NONE, (Modifier) null, (DynamicColorConfiguration) null, (Function0) null, (Modifier) null, (Function3) null, composer, 54, EnumC0170g.SDK_ASSET_ILLUSTRATION_SIGNATURE_VALUE);
                DBUtil.SpacerWithinSectionMedium(0, 1, composer, null);
                Countries.PageHeader(ssnViewModel.title, (Modifier) null, (Function2) null, (String) null, composer, 0, 14);
                DBUtil.SpacerBetweenSectionLarge(0, 1, composer, null);
                Function1 function13 = this.f$2;
                Strings.TouchRecordingLayout(touchRecorder, null, Expect_jvmKt.rememberComposableLambda(733924704, new SsnViewKt$$ExternalSyntheticLambda5(focusRequester, ssnViewModel, function13, mutableState, touchRecorder, insertingScrubber, mutableState2), composer), composer, 392, 2);
                SpacerKt.Spacer(composer, new LayoutWeightElement(1.0f, true));
                DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(1630882903, new SubcomposeAsyncImageKt$$ExternalSyntheticLambda0(ssnViewModel, touchRecorder, function13, animatedContentScopeImpl, mutableState, mutableState2, 5), composer), composer, 24576, 15);
                gapComposer2.end(true);
                return Unit.INSTANCE;
            case 1:
                AmountPickerViewModel amountPickerViewModel = (AmountPickerViewModel) obj11;
                ThemeInfo themeInfo = (ThemeInfo) obj10;
                AmountConfig amountConfig = (AmountConfig) obj9;
                Modifier modifier = (Modifier) obj8;
                Function3 function3 = (Function3) obj7;
                Composer composer2 = (Composer) obj3;
                ((Integer) obj4).getClass();
                ((AnimatedContentScopeImpl) obj).getClass();
                ((AmountPickerViewModel) obj2).getClass();
                if (!(amountPickerViewModel instanceof AmountPickerViewModel.Ready)) {
                    return Unit.INSTANCE;
                }
                com.squareup.protos.cash.ui.Color color = ((AmountPickerViewModel.Ready) amountPickerViewModel).tintOverride;
                if (color == null) {
                    GapComposer gapComposer3 = (GapComposer) composer2;
                    gapComposer3.startReplaceGroup(1661507741);
                    gapComposer3.end(false);
                    m = null;
                } else {
                    GapComposer gapComposer4 = (GapComposer) composer2;
                    m = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer4, 192144356, color, gapComposer4, false);
                }
                Color color2 = m == null ? (themeInfo == null || (colorPalette = themeInfo.colorPalette) == null) ? null : new Color(ColorKt.Color(colorPalette.tint)) : m;
                if (color2 == null) {
                    GapComposer gapComposer5 = (GapComposer) composer2;
                    gapComposer5.startReplaceGroup(1661642716);
                    m1468withTint4WTKRHQ = (Colors) gapComposer5.consume(ArcadeThemeKt.LocalColors);
                    if (m1468withTint4WTKRHQ == null) {
                        m1468withTint4WTKRHQ = re$$ExternalSyntheticOutline0.m(gapComposer5, -1762997026, gapComposer5, false);
                    } else {
                        gapComposer5.startReplaceGroup(-1762997739);
                        gapComposer5.end(false);
                    }
                    gapComposer5.end(false);
                } else {
                    GapComposer gapComposer6 = (GapComposer) composer2;
                    gapComposer6.startReplaceGroup(1661693246);
                    Colors colors = (Colors) gapComposer6.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer6, -1762997026, gapComposer6, false);
                    } else {
                        gapComposer6.startReplaceGroup(-1762997739);
                        gapComposer6.end(false);
                    }
                    m1468withTint4WTKRHQ = DimensionKt.m1468withTint4WTKRHQ(colors, color2.value);
                    gapComposer6.end(false);
                }
                ArcadeThemeKt.ArcadeTheme(m1468withTint4WTKRHQ, null, null, Expect_jvmKt.rememberComposableLambda(1866055269, new AvatarsKt$$ExternalSyntheticLambda4(amountPickerViewModel, amountConfig, this.f$2, modifier, function3), composer2), composer2, 3072, 6);
                return Unit.INSTANCE;
            case 2:
                DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController = (DelegatingSoftwareKeyboardController) obj11;
                Shaker shaker = (Shaker) obj7;
                FocusRequester focusRequester2 = (FocusRequester) obj10;
                MutableState mutableState3 = (MutableState) obj9;
                MutableState mutableState4 = (MutableState) obj8;
                AnimatedContentScopeImpl animatedContentScopeImpl2 = (AnimatedContentScopeImpl) obj;
                final BankAccountLinkingViewModel bankAccountLinkingViewModel = (BankAccountLinkingViewModel) obj2;
                Composer composer3 = (Composer) obj3;
                ((Integer) obj4).getClass();
                animatedContentScopeImpl2.getClass();
                bankAccountLinkingViewModel.getClass();
                ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, composer3, 0);
                GapComposer gapComposer7 = (GapComposer) composer3;
                int hashCode2 = Long.hashCode(gapComposer7.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer7.currentCompositionLocalScope();
                Modifier materializeModifier2 = PlatformKt.materializeModifier(composer3, companion);
                ComposeUiNode.Companion.getClass();
                Function0 function0 = ComposeUiNode.Companion.Constructor;
                GapComposer gapComposer8 = (GapComposer) composer3;
                if (gapComposer8.applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer8.startReusableNode();
                if (gapComposer8.inserting) {
                    gapComposer8.createNode(function0);
                } else {
                    gapComposer8.useNode();
                }
                Updater.m576setimpl(composer3, columnMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(composer3, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(composer3, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(composer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(composer3, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                NavigationType navigationType2 = NavigationType.BACK;
                boolean changed = gapComposer8.changed(delegatingSoftwareKeyboardController);
                Function1 function14 = this.f$2;
                boolean changed2 = changed | gapComposer8.changed(function14);
                Object rememberedValue = gapComposer8.rememberedValue();
                if (changed2 || rememberedValue == obj6) {
                    rememberedValue = new SetNameViewKt$$ExternalSyntheticLambda6(delegatingSoftwareKeyboardController, function14, 1);
                    gapComposer8.updateRememberedValue(rememberedValue);
                }
                DBUtil.TitleBarSub((String) null, navigationType2, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue, (Modifier) null, (Function3) null, composer3, 54, 108);
                final int i2 = 1;
                final int i3 = 0;
                DBUtil.SpacerWithinSectionMedium(0, 1, composer3, null);
                Countries.PageHeader(Expect_jvmKt.rememberComposableLambda(1291087354, new Function2() { // from class: com.squareup.cash.blockers.views.BankAccountLinkingViewKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj12, Object obj13) {
                        int i4 = i3;
                        BankAccountLinkingViewModel bankAccountLinkingViewModel2 = bankAccountLinkingViewModel;
                        switch (i4) {
                            case 0:
                                Composer composer4 = (Composer) obj12;
                                int intValue = ((Integer) obj13).intValue();
                                GapComposer gapComposer9 = (GapComposer) composer4;
                                if (gapComposer9.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                                    String str = bankAccountLinkingViewModel2.title;
                                    if (str == null) {
                                        gapComposer9.startReplaceGroup(1351249655);
                                    } else {
                                        gapComposer9.startReplaceGroup(1351249656);
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer9, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                    }
                                    gapComposer9.end(false);
                                } else {
                                    gapComposer9.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer5 = (Composer) obj12;
                                int intValue2 = ((Integer) obj13).intValue();
                                GapComposer gapComposer10 = (GapComposer) composer5;
                                if (gapComposer10.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                    String str2 = bankAccountLinkingViewModel2.subTitle;
                                    if (str2 == null) {
                                        gapComposer10.startReplaceGroup(1443545460);
                                    } else {
                                        gapComposer10.startReplaceGroup(1443545461);
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer10, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                                    }
                                    gapComposer10.end(false);
                                } else {
                                    gapComposer10.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, composer3), (Modifier) null, (Function2) null, Expect_jvmKt.rememberComposableLambda(489937981, new Function2() { // from class: com.squareup.cash.blockers.views.BankAccountLinkingViewKt$$ExternalSyntheticLambda5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj12, Object obj13) {
                        int i4 = i2;
                        BankAccountLinkingViewModel bankAccountLinkingViewModel2 = bankAccountLinkingViewModel;
                        switch (i4) {
                            case 0:
                                Composer composer4 = (Composer) obj12;
                                int intValue = ((Integer) obj13).intValue();
                                GapComposer gapComposer9 = (GapComposer) composer4;
                                if (gapComposer9.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                                    String str = bankAccountLinkingViewModel2.title;
                                    if (str == null) {
                                        gapComposer9.startReplaceGroup(1351249655);
                                    } else {
                                        gapComposer9.startReplaceGroup(1351249656);
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer9, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                                    }
                                    gapComposer9.end(false);
                                } else {
                                    gapComposer9.skipToGroupEnd();
                                }
                                break;
                            default:
                                Composer composer5 = (Composer) obj12;
                                int intValue2 = ((Integer) obj13).intValue();
                                GapComposer gapComposer10 = (GapComposer) composer5;
                                if (gapComposer10.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                                    String str2 = bankAccountLinkingViewModel2.subTitle;
                                    if (str2 == null) {
                                        gapComposer10.startReplaceGroup(1443545460);
                                    } else {
                                        gapComposer10.startReplaceGroup(1443545461);
                                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer10, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                                    }
                                    gapComposer10.end(false);
                                } else {
                                    gapComposer10.skipToGroupEnd();
                                }
                                break;
                        }
                        return Unit.INSTANCE;
                    }
                }, composer3), composer3, 3078, 6);
                DBUtil.SpacerBetweenSectionLarge(0, 1, composer3, null);
                ((DefaultSizes) gapComposer8.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                Modifier focusRequester3 = FocusTraversalKt.focusRequester(SharedViewEventsKt.shakeWith(SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), shaker), focusRequester2);
                TextFieldValue textFieldValue = (TextFieldValue) mutableState4.getValue();
                String str = bankAccountLinkingViewModel.inputMask;
                VisualTransformation maskVisualTransformation = str != null ? new MaskVisualTransformation(str, new Edge.Companion(9)) : VisualTransformation.Companion.None;
                InputState inputState = bankAccountLinkingViewModel.loading ? InputState.DISABLED : (bankAccountLinkingViewModel.errorMessage.value == null && ((Boolean) bankAccountLinkingViewModel.valid.value).booleanValue()) ? InputState.DEFAULT : InputState.ERROR;
                String str2 = bankAccountLinkingViewModel.hint;
                KeyboardOptions keyboardOptions = new KeyboardOptions(3, 2, false, 113);
                boolean changed3 = gapComposer8.changed(mutableState3) | gapComposer8.changed(function14) | gapComposer8.changed(mutableState4);
                Object rememberedValue2 = gapComposer8.rememberedValue();
                if (changed3 || rememberedValue2 == obj6) {
                    rememberedValue2 = new BasicTextFieldKt$$ExternalSyntheticLambda2(2, mutableState3, mutableState4, function14);
                    gapComposer8.updateRememberedValue(rememberedValue2);
                }
                Function1 function15 = (Function1) rememberedValue2;
                KeyboardActions keyboardActions = new KeyboardActions(function15, function15, function15, function15, function15, function15);
                boolean changedInstance = gapComposer8.changedInstance(bankAccountLinkingViewModel) | gapComposer8.changed(mutableState4) | gapComposer8.changed(mutableState3);
                Object rememberedValue3 = gapComposer8.rememberedValue();
                if (changedInstance || rememberedValue3 == obj6) {
                    rememberedValue3 = new CaptureCheckFaceKt$$ExternalSyntheticLambda11((Object) bankAccountLinkingViewModel, mutableState4, (Object) mutableState3, 6);
                    gapComposer8.updateRememberedValue(rememberedValue3);
                }
                InputFieldKt.InputField(textFieldValue, (Function1) rememberedValue3, focusRequester3, inputState, (Function2) null, (Function2) null, (Function2) null, Expect_jvmKt.rememberComposableLambda(167763261, new SsnViewKt$$ExternalSyntheticLambda2(bankAccountLinkingViewModel, 11), composer3), str2, keyboardOptions, keyboardActions, maskVisualTransformation, composer3, 12582912, 0, 112);
                SpacerKt.Spacer(composer3, new LayoutWeightElement(1.0f, true));
                DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(-506041933, new SwipeToDismissKt$$ExternalSyntheticLambda2(5, bankAccountLinkingViewModel, animatedContentScopeImpl2, mutableState4, mutableState3, function14), composer3), composer3, 24576, 15);
                gapComposer8.end(true);
                return Unit.INSTANCE;
            case 3:
                VerifyAliasModel verifyAliasModel = (VerifyAliasModel) obj11;
                FocusOwnerImpl focusOwnerImpl = (FocusOwnerImpl) obj10;
                DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController2 = (DelegatingSoftwareKeyboardController) obj8;
                MutableState mutableState5 = (MutableState) obj9;
                VerifyAliasModel.ResendCodeButtonState resendCodeButtonState = (VerifyAliasModel.ResendCodeButtonState) obj7;
                VerifyAliasModel verifyAliasModel2 = (VerifyAliasModel) obj2;
                Composer composer4 = (Composer) obj3;
                ((Integer) obj4).getClass();
                ((AnimatedContentScopeImpl) obj).getClass();
                verifyAliasModel2.getClass();
                Modifier imePadding = SpacerKt.imePadding(SizeKt.fillMaxSize(companion, 1.0f));
                Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
                BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
                ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, composer4, 0);
                GapComposer gapComposer9 = (GapComposer) composer4;
                int hashCode3 = Long.hashCode(gapComposer9.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer9.currentCompositionLocalScope();
                Modifier materializeModifier3 = PlatformKt.materializeModifier(composer4, imePadding);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                GapComposer gapComposer10 = (GapComposer) composer4;
                if (gapComposer10.applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer10.startReusableNode();
                if (gapComposer10.inserting) {
                    gapComposer10.createNode(layoutNode$Companion$Constructor$12);
                } else {
                    gapComposer10.useNode();
                }
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetMeasurePolicy;
                Updater.m576setimpl(composer4, columnMeasurePolicy3, composeUiNode$Companion$SetModifier$12);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                Updater.m576setimpl(composer4, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$13);
                Integer valueOf = Integer.valueOf(hashCode3);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetCompositeKeyHash;
                Updater.m576setimpl(composer4, valueOf, composeUiNode$Companion$SetModifier$14);
                OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                Updater.m575reconcileimpl(composer4, ownerSnapshotObserver$onCommitAffectingLayout$1);
                ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetModifier;
                Updater.m576setimpl(composer4, materializeModifier3, composeUiNode$Companion$SetModifier$15);
                int ordinal = verifyAliasModel.navigationButton.ordinal();
                if (ordinal != 0) {
                    composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                    if (ordinal == 1) {
                        navigationType = NavigationType.BACK;
                    } else {
                        if (ordinal != 2) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        navigationType = NavigationType.CLOSE;
                    }
                } else {
                    composeUiNode$Companion$SetModifier$1 = composeUiNode$Companion$SetModifier$15;
                    navigationType = NavigationType.NONE;
                }
                boolean changedInstance2 = gapComposer10.changedInstance(focusOwnerImpl) | gapComposer10.changed(delegatingSoftwareKeyboardController2) | gapComposer10.changedInstance(verifyAliasModel);
                Function1 function16 = this.f$2;
                boolean changed4 = changedInstance2 | gapComposer10.changed(function16);
                Object rememberedValue4 = gapComposer10.rememberedValue();
                if (changed4 || rememberedValue4 == obj6) {
                    rememberedValue4 = new l2$$ExternalSyntheticLambda7(focusOwnerImpl, delegatingSoftwareKeyboardController2, verifyAliasModel, function16, 19);
                    function1 = function16;
                    gapComposer10.updateRememberedValue(rememberedValue4);
                } else {
                    function1 = function16;
                }
                DBUtil.TitleBarSub((String) null, navigationType, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue4, (Modifier) null, Expect_jvmKt.rememberComposableLambda(1660150198, new SectionKt$$ExternalSyntheticLambda2(10, focusOwnerImpl, delegatingSoftwareKeyboardController2, function1), composer4), composer4, 1572870, 44);
                if (1.0f <= 0.0d) {
                    InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
                }
                Modifier verticalScroll$default = ImageKt.verticalScroll$default(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), ImageKt.rememberScrollState(composer4), false, 14);
                ColumnMeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, composer4, 0);
                int hashCode4 = Long.hashCode(gapComposer10.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer10.currentCompositionLocalScope();
                Modifier materializeModifier4 = PlatformKt.materializeModifier(composer4, verticalScroll$default);
                gapComposer10.startReusableNode();
                if (gapComposer10.inserting) {
                    gapComposer10.createNode(layoutNode$Companion$Constructor$12);
                } else {
                    gapComposer10.useNode();
                }
                Updater.m576setimpl(composer4, columnMeasurePolicy4, composeUiNode$Companion$SetModifier$12);
                Updater.m576setimpl(composer4, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$13);
                Request$Priority$EnumUnboxingLocalUtility.m(hashCode4, composer4, composeUiNode$Companion$SetModifier$14, composer4, ownerSnapshotObserver$onCommitAffectingLayout$1);
                Updater.m576setimpl(composer4, materializeModifier4, composeUiNode$Companion$SetModifier$1);
                DBUtil.SpacerWithinSectionMedium(0, 1, composer4, null);
                Countries.PageHeader(verifyAliasModel2.title, (Modifier) null, (Function2) null, verifyAliasModel2.headline, composer4, 0, 6);
                DBUtil.SpacerBetweenSectionLarge(0, 1, composer4, null);
                Modifier testTag = TestTagKt.testTag(FocusTraversalKt.focusRequester(SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), DBUtil.rememberFocusRequesterAndRequestFocus(composer4)), "code input");
                String str3 = (String) mutableState5.getValue();
                KeyboardOptions keyboardOptions2 = new KeyboardOptions(0, (Boolean) null, 8, 7, (Boolean) null, 115);
                boolean changed5 = gapComposer10.changed(function1) | gapComposer10.changed(mutableState5);
                Object rememberedValue5 = gapComposer10.rememberedValue();
                if (!changed5) {
                    obj5 = obj6;
                    break;
                } else {
                    obj5 = obj6;
                }
                rememberedValue5 = new CashMapViewKt$$ExternalSyntheticLambda3(function1, mutableState5, 8);
                gapComposer10.updateRememberedValue(rememberedValue5);
                Function1 function17 = (Function1) rememberedValue5;
                KeyboardActions keyboardActions2 = new KeyboardActions(function17, function17, function17, function17, function17, function17);
                VerificationCodeHyphenationTransformer verificationCodeHyphenationTransformer = new VerificationCodeHyphenationTransformer();
                boolean changed6 = gapComposer10.changed(mutableState5);
                Object rememberedValue6 = gapComposer10.rememberedValue();
                if (changed6 || rememberedValue6 == obj5) {
                    rememberedValue6 = new CashCardKt$$ExternalSyntheticLambda0(10, mutableState5);
                    gapComposer10.updateRememberedValue(rememberedValue6);
                }
                InputFieldKt.InputField(str3, (Function1) rememberedValue6, testTag, (InputState) null, (Function2) null, (Function2) null, (Function2) null, (Function3) null, (String) null, keyboardOptions2, keyboardActions2, verificationCodeHyphenationTransformer, composer4, 805306368, 0, 504);
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(SpacerKt.m299paddingVpY3zN4(companion, 16.0f, 20.0f), 1.0f);
                boolean changed7 = gapComposer10.changed(function1);
                Object rememberedValue7 = gapComposer10.rememberedValue();
                if (changed7 || rememberedValue7 == obj5) {
                    rememberedValue7 = new BorrowHomeKt$$ExternalSyntheticLambda3(4, function1);
                    gapComposer10.updateRememberedValue(rememberedValue7);
                }
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(composer4).semantic.text.standard, composer4, ImageKt.m183clickableoSLSa3U$default(fillMaxWidth, false, null, null, (Function0) rememberedValue7, 15), TextStyle.m994copyp1EtxEg$default(Strings.getTypography(composer4).bodyMedium, 0L, 0L, null, null, 0L, null, 0L, TextDecoration.Underline, null, null, 3, 0L, null, null, 0, 16740351), (TextLineBalancing) null, Room.stringResource(composer4, R.string.blockers_account_recovery_help), (Map) null, (Function1) null, false);
                if (1.0f <= 0.0d) {
                    InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
                }
                SpacerKt.Spacer(composer4, new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                if (resendCodeButtonState instanceof VerifyAliasModel.ResendCodeButtonState.Disabled) {
                    gapComposer10.startReplaceGroup(-1537502837);
                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(SpacerKt.m299paddingVpY3zN4(companion, 32.0f, 16.0f), 1.0f);
                    String format2 = new MessageFormat(Room.stringResource(composer4, R.string.blockers_verify_resend_remaining_seconds)).format(NavAction$$ExternalSyntheticOutline0.m(1, Integer.valueOf(((VerifyAliasModel.ResendCodeButtonState.Disabled) resendCodeButtonState).remainingSecondsToEnable), "seconds"));
                    format2.getClass();
                    Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, Strings.getColors(composer4).semantic.text.standard, composer4, fillMaxWidth2, TextStyle.m994copyp1EtxEg$default(Strings.getTypography(composer4).bodySmall, 0L, 0L, null, null, 0L, null, 0L, null, null, null, 3, 0L, null, null, 0, 16744447), (TextLineBalancing) null, format2, (Map) null, (Function1) null, false);
                    gapComposer10.end(false);
                } else {
                    gapComposer10.startReplaceGroup(-1536989291);
                    gapComposer10.end(false);
                }
                gapComposer10.end(true);
                DimensionKt.ButtonCtaGroup(null, false, null, null, Expect_jvmKt.rememberComposableLambda(-1403095367, new SwipeToDismissKt$$ExternalSyntheticLambda2(resendCodeButtonState, function1, focusOwnerImpl, delegatingSoftwareKeyboardController2, mutableState5, 6), composer4), composer4, 24576, 15);
                gapComposer10.end(true);
                return Unit.INSTANCE;
            case 4:
                OffersHomeListItemViewModel.HeroOffersTileViewModel heroOffersTileViewModel = (OffersHomeListItemViewModel.HeroOffersTileViewModel) obj9;
                Function4 function4 = (Function4) obj7;
                OffersHomeListItemViewModel.HeroOffersTileViewModel heroOffersTileViewModel2 = (OffersHomeListItemViewModel.HeroOffersTileViewModel) obj2;
                Composer composer5 = (Composer) obj3;
                int intValue = ((Integer) obj4).intValue();
                ((AnimatedContentScopeImpl) obj).getClass();
                heroOffersTileViewModel2.getClass();
                Modifier testTag2 = TestTagKt.testTag(SizeKt.m277height3ABfNKs(SpacerKt.padding(SizeKt.fillMaxWidth((Modifier) obj11, 1.0f), (PaddingValues) obj10), ((Dp) ((State) obj8).getValue()).value), "HeroOffer");
                GapComposer gapComposer11 = (GapComposer) composer5;
                ((DefaultSizes) gapComposer11.consume(ArcadeThemeKt.LocalSizes)).getClass();
                Object obj12 = DefaultSizes.border.entries;
                Modifier clip = ClipKt.clip(testTag2, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(16.0f));
                OffersHomeListItemViewModel.HeroOffersTileViewModel.CurrentTile currentTile = heroOffersTileViewModel instanceof OffersHomeListItemViewModel.HeroOffersTileViewModel.CurrentTile ? (OffersHomeListItemViewModel.HeroOffersTileViewModel.CurrentTile) heroOffersTileViewModel : null;
                Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                if (currentTile == null) {
                    gapComposer11.startReplaceGroup(-244024058);
                    gapComposer11.end(false);
                    m183clickableoSLSa3U$default = null;
                } else {
                    gapComposer11.startReplaceGroup(-244024057);
                    boolean changed8 = gapComposer11.changed(function12) | gapComposer11.changed(currentTile);
                    Object rememberedValue8 = gapComposer11.rememberedValue();
                    if (changed8 || rememberedValue8 == obj6) {
                        rememberedValue8 = new UtilsKt$$ExternalSyntheticLambda0(28, function12, currentTile);
                        gapComposer11.updateRememberedValue(rememberedValue8);
                    }
                    m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(companion2, false, null, null, (Function0) rememberedValue8, 15);
                    gapComposer11.end(false);
                }
                if (m183clickableoSLSa3U$default == null) {
                    m183clickableoSLSa3U$default = companion2;
                }
                Modifier then = clip.then(m183clickableoSLSa3U$default);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                int hashCode5 = Long.hashCode(gapComposer11.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope5 = gapComposer11.currentCompositionLocalScope();
                Modifier materializeModifier5 = PlatformKt.materializeModifier(composer5, then);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                GapComposer gapComposer12 = (GapComposer) composer5;
                if (gapComposer12.applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer12.startReusableNode();
                if (gapComposer12.inserting) {
                    gapComposer12.createNode(layoutNode$Companion$Constructor$13);
                } else {
                    gapComposer12.useNode();
                }
                Updater.m576setimpl(composer5, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(composer5, currentCompositionLocalScope5, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(composer5, Integer.valueOf(hashCode5), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(composer5, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(composer5, materializeModifier5, ComposeUiNode.Companion.SetModifier);
                if (heroOffersTileViewModel2 instanceof OffersHomeListItemViewModel.HeroOffersTileViewModel.CurrentTile) {
                    gapComposer12.startReplaceGroup(-1265846651);
                    OffersHeroTileKt.HeroOffersTileCardContent((OffersHomeListItemViewModel.HeroOffersTileViewModel.CurrentTile) heroOffersTileViewModel2, function4, composer5, 6 | (intValue & 112));
                    gapComposer12.end(false);
                } else {
                    gapComposer12.startReplaceGroup(-1265740941);
                    gapComposer12.end(false);
                }
                gapComposer12.end(true);
                return Unit.INSTANCE;
            case 5:
                SharedToolbarSwipeScope sharedToolbarSwipeScope = (SharedToolbarSwipeScope) obj11;
                ElementBoundsRegistry elementBoundsRegistry = (ElementBoundsRegistry) obj10;
                TabToolbarInternalViewModel.ProfileButton profileButton = (TabToolbarInternalViewModel.ProfileButton) obj9;
                TitleBarActionScope titleBarActionScope = (TitleBarActionScope) obj8;
                String str4 = (String) obj7;
                Modifier modifier2 = (Modifier) obj;
                Composer composer6 = (Composer) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                modifier2.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer6).changed(modifier2) ? 4 : 2;
                }
                GapComposer gapComposer13 = (GapComposer) composer6;
                if (gapComposer13.shouldExecute(intValue2 & 1, (intValue2 & 131) != 130)) {
                    Modifier swipeToolbarEntryPoint = TabToolbarsKt.swipeToolbarEntryPoint(TabToolbarsKt.reportTuckCorner(modifier2, sharedToolbarSwipeScope != null ? sharedToolbarSwipeScope.tuckTargets : null, false), sharedToolbarSwipeScope, SwipeToolbarCorner.Trailing, gapComposer13, MLKEMEngine.KyberPolyBytes, 0);
                    if (elementBoundsRegistry != null) {
                        swipeToolbarEntryPoint = swipeToolbarEntryPoint.then(WalletJsonParser.provideBounds(elementBoundsRegistry, ElementBoundsRegistry.Element.ToolbarProfileMenuItem));
                    }
                    Modifier then2 = swipeToolbarEntryPoint.then(TabToolbarsKt.tabToolbarIconTonalBackground(gapComposer13));
                    Icons icons = Icons.NavigationAccount;
                    TransactorKt transactorKt = profileButton.badge;
                    if (transactorKt != null) {
                        long j = profileButton.badgeCount;
                        if (Intrinsics.areEqual(transactorKt, TabToolbarBadgeViewModel$Dot.INSTANCE)) {
                            large = Badge.Small.INSTANCE;
                        } else {
                            if (!(transactorKt instanceof TabToolbarBadgeViewModel$Text)) {
                                Drop$$ExternalSyntheticBUOutline0.m1m();
                                return null;
                            }
                            large = new Badge.Large(j);
                        }
                        badge = large;
                    } else {
                        badge = null;
                    }
                    boolean changed9 = gapComposer13.changed(function12) | gapComposer13.changedInstance(profileButton);
                    Object rememberedValue9 = gapComposer13.rememberedValue();
                    if (changed9 || rememberedValue9 == obj6) {
                        rememberedValue9 = new TabToolbarsKt$$ExternalSyntheticLambda19(function12, profileButton, 0);
                        gapComposer13.updateRememberedValue(rememberedValue9);
                    }
                    Function0 function02 = (Function0) rememberedValue9;
                    boolean changed10 = gapComposer13.changed(function12);
                    Object rememberedValue10 = gapComposer13.rememberedValue();
                    if (changed10 || rememberedValue10 == obj6) {
                        rememberedValue10 = new TabToolbarsKt$$ExternalSyntheticLambda8(16, function12);
                        gapComposer13.updateRememberedValue(rememberedValue10);
                    }
                    TransactorKt.IconAction(titleBarActionScope, icons, str4, function02, then2, (Function0) rememberedValue10, badge, null, null, null, false, gapComposer13, 48, 960);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                PaddingValues paddingValues = (PaddingValues) obj11;
                Function0 function03 = (Function0) obj10;
                MoneyFormatter moneyFormatter = (MoneyFormatter) obj9;
                AddMoneyView addMoneyView = (AddMoneyView) obj8;
                Function0 function04 = (Function0) obj7;
                AddMoneyViewModel addMoneyViewModel = (AddMoneyViewModel) obj;
                float floatValue = ((Float) obj2).floatValue();
                Composer composer7 = (Composer) obj3;
                int intValue3 = ((Integer) obj4).intValue();
                addMoneyViewModel.getClass();
                boolean z = addMoneyViewModel instanceof AddMoneyViewModel.AtmPicker;
                Function1 function18 = this.f$2;
                if (z) {
                    GapComposer gapComposer14 = (GapComposer) composer7;
                    gapComposer14.startReplaceGroup(-194449513);
                    AddMoneyViewKt.AddMoneyAtmPicker(NavDestination.Companion.sheetAlpha(SpacerKt.padding(companion, paddingValues), floatValue), (AddMoneyViewModel.AtmPicker) addMoneyViewModel, function18, function03, gapComposer14, (intValue3 << 3) & 112);
                    gapComposer14.end(false);
                } else if (addMoneyViewModel instanceof AddMoneyViewModel.Keypad) {
                    GapComposer gapComposer15 = (GapComposer) composer7;
                    gapComposer15.startReplaceGroup(-194437927);
                    AddMoneyViewKt.AddMoneyKeypad(NavDestination.Companion.sheetAlpha(companion, floatValue), (AddMoneyViewModel.Keypad) addMoneyViewModel, function18, moneyFormatter, (RealCashVibrator) addMoneyView.vibrator, gapComposer15, (intValue3 << 3) & 112);
                    gapComposer15.end(false);
                } else {
                    if (!(addMoneyViewModel instanceof AddMoneyViewModel.ManagedAccountInstrumentPicker)) {
                        throw Recorder$$ExternalSyntheticOutline2.m((GapComposer) composer7, -194450951, false);
                    }
                    GapComposer gapComposer16 = (GapComposer) composer7;
                    gapComposer16.startReplaceGroup(-194426324);
                    Modifier sheetAlpha = NavDestination.Companion.sheetAlpha(companion, floatValue);
                    AddMoneyViewModel.ManagedAccountInstrumentPicker managedAccountInstrumentPicker = (AddMoneyViewModel.ManagedAccountInstrumentPicker) addMoneyViewModel;
                    boolean changed11 = gapComposer16.changed(function04) | gapComposer16.changed(function18);
                    Object rememberedValue11 = gapComposer16.rememberedValue();
                    if (changed11 || rememberedValue11 == obj6) {
                        rememberedValue11 = new AddMoneyView$$ExternalSyntheticLambda12(function04, function18);
                        gapComposer16.updateRememberedValue(rememberedValue11);
                    }
                    AddMoneyViewKt.ManagedAccountInstrumentPickerContent(sheetAlpha, managedAccountInstrumentPicker, (Function1) rememberedValue11, function04, gapComposer16, (intValue3 << 3) & 112);
                    gapComposer16.end(false);
                }
                return Unit.INSTANCE;
            case 7:
                PaddingValues paddingValues2 = (PaddingValues) obj11;
                Function0 function05 = (Function0) obj10;
                MoneyFormatter moneyFormatter2 = (MoneyFormatter) obj9;
                Function0 function06 = (Function0) obj8;
                WithdrawView withdrawView = (WithdrawView) obj7;
                WithdrawViewModel withdrawViewModel = (WithdrawViewModel) obj;
                float floatValue2 = ((Float) obj2).floatValue();
                Composer composer8 = (Composer) obj3;
                int intValue4 = ((Integer) obj4).intValue();
                withdrawViewModel.getClass();
                boolean z2 = withdrawViewModel instanceof WithdrawViewModel.ViewAmount;
                Function1 function19 = this.f$2;
                if (z2) {
                    GapComposer gapComposer17 = (GapComposer) composer8;
                    gapComposer17.startReplaceGroup(-914320742);
                    AddMoneyViewKt.WithdrawViewAmountContent(NavDestination.Companion.sheetAlpha(SpacerKt.padding(companion, paddingValues2), floatValue2), (WithdrawViewModel.ViewAmount) withdrawViewModel, function19, function05, gapComposer17, (intValue4 << 3) & 112);
                    gapComposer17.end(false);
                } else if (withdrawViewModel instanceof WithdrawViewModel.ChangeAmount) {
                    GapComposer gapComposer18 = (GapComposer) composer8;
                    gapComposer18.startReplaceGroup(-914309700);
                    AddMoneyViewKt.WithdrawChangedAmountContent(NavDestination.Companion.sheetAlpha(companion, floatValue2), (WithdrawViewModel.ChangeAmount) withdrawViewModel, moneyFormatter2, function19, function06, gapComposer18, (intValue4 << 3) & 112);
                    gapComposer18.end(false);
                } else if (withdrawViewModel instanceof WithdrawViewModel.ManagedAccountAmountEntry) {
                    GapComposer gapComposer19 = (GapComposer) composer8;
                    gapComposer19.startReplaceGroup(-914297115);
                    AddMoneyViewKt.ManagedAccountAmountEntryContent(NavDestination.Companion.sheetAlpha(SpacerKt.padding(companion, paddingValues2), floatValue2), (WithdrawViewModel.ManagedAccountAmountEntry) withdrawViewModel, moneyFormatter2, withdrawView.vibrator, function19, function06, gapComposer19, (intValue4 << 3) & 112);
                    gapComposer19.end(false);
                } else {
                    if (!(withdrawViewModel instanceof WithdrawViewModel.ManagedAccountConfirmation)) {
                        throw Recorder$$ExternalSyntheticOutline2.m((GapComposer) composer8, -914322050, false);
                    }
                    GapComposer gapComposer20 = (GapComposer) composer8;
                    gapComposer20.startReplaceGroup(-914282390);
                    AddMoneyViewKt.ManagedAccountConfirmationContent(NavDestination.Companion.sheetAlpha(SpacerKt.padding(companion, paddingValues2), floatValue2), (WithdrawViewModel.ManagedAccountConfirmation) withdrawViewModel, function19, gapComposer20, (intValue4 << 3) & 112);
                    gapComposer20.end(false);
                }
                return Unit.INSTANCE;
            default:
                ClockInBottomSheetViewModel clockInBottomSheetViewModel = (ClockInBottomSheetViewModel) obj11;
                Function0 function07 = (Function0) obj10;
                MutableState mutableState6 = (MutableState) obj9;
                MutableState mutableState7 = (MutableState) obj8;
                MutableState mutableState8 = (MutableState) obj7;
                ClockInSheetMode clockInSheetMode = (ClockInSheetMode) obj2;
                Composer composer9 = (Composer) obj3;
                ((Integer) obj4).getClass();
                ((AnimatedContentScopeImpl) obj).getClass();
                clockInSheetMode.getClass();
                int ordinal2 = clockInSheetMode.ordinal();
                if (ordinal2 == 0) {
                    GapComposer gapComposer21 = (GapComposer) composer9;
                    gapComposer21.startReplaceGroup(-784312730);
                    JobIdentifier jobIdentifier = (JobIdentifier) mutableState7.getValue();
                    LocationIdentifier locationIdentifier = (LocationIdentifier) mutableState6.getValue();
                    Object rememberedValue12 = gapComposer21.rememberedValue();
                    if (rememberedValue12 == obj6) {
                        rememberedValue12 = new WalletHomeViewKt$$ExternalSyntheticLambda6(10, mutableState8);
                        gapComposer21.updateRememberedValue(rememberedValue12);
                    }
                    Function0 function08 = (Function0) rememberedValue12;
                    Object rememberedValue13 = gapComposer21.rememberedValue();
                    if (rememberedValue13 == obj6) {
                        rememberedValue13 = new WalletHomeViewKt$$ExternalSyntheticLambda6(9, mutableState8);
                        gapComposer21.updateRememberedValue(rememberedValue13);
                    }
                    Function0 function09 = (Function0) rememberedValue13;
                    boolean changed12 = gapComposer21.changed(function12);
                    Object rememberedValue14 = gapComposer21.rememberedValue();
                    if (changed12 || rememberedValue14 == obj6) {
                        rememberedValue14 = new PayHomeViewKt$$ExternalSyntheticLambda2(9, function12);
                        gapComposer21.updateRememberedValue(rememberedValue14);
                    }
                    Function0 function010 = (Function0) rememberedValue14;
                    boolean changed13 = gapComposer21.changed(function12);
                    Object rememberedValue15 = gapComposer21.rememberedValue();
                    if (changed13 || rememberedValue15 == obj6) {
                        rememberedValue15 = new PayHomeViewKt$$ExternalSyntheticLambda2(10, function12);
                        gapComposer21.updateRememberedValue(rememberedValue15);
                    }
                    DisclaimerTextKt.ClockInMainContent(clockInBottomSheetViewModel, jobIdentifier, locationIdentifier, function08, function09, function07, function010, (Function0) rememberedValue15, gapComposer21, 27648);
                    gapComposer21.end(false);
                } else if (ordinal2 == 1) {
                    GapComposer gapComposer22 = (GapComposer) composer9;
                    gapComposer22.startReplaceGroup(-783543000);
                    List list = clockInBottomSheetViewModel.locations;
                    LocationIdentifier locationIdentifier2 = (LocationIdentifier) mutableState6.getValue();
                    boolean changed14 = gapComposer22.changed(mutableState6) | gapComposer22.changed(function12);
                    Object rememberedValue16 = gapComposer22.rememberedValue();
                    if (changed14 || rememberedValue16 == obj6) {
                        rememberedValue16 = new BasicTextFieldKt$$ExternalSyntheticLambda2(3, mutableState6, mutableState8, function12);
                        gapComposer22.updateRememberedValue(rememberedValue16);
                    }
                    DisclaimerTextKt.LocationPickerContent(list, locationIdentifier2, (Function1) rememberedValue16, null, gapComposer22, 0);
                    gapComposer22.end(false);
                } else {
                    if (ordinal2 != 2) {
                        throw Recorder$$ExternalSyntheticOutline2.m((GapComposer) composer9, -1410774583, false);
                    }
                    GapComposer gapComposer23 = (GapComposer) composer9;
                    gapComposer23.startReplaceGroup(-783058470);
                    List list2 = clockInBottomSheetViewModel.jobs;
                    JobIdentifier jobIdentifier2 = (JobIdentifier) mutableState7.getValue();
                    boolean changed15 = gapComposer23.changed(mutableState7) | gapComposer23.changed(function12);
                    Object rememberedValue17 = gapComposer23.rememberedValue();
                    if (changed15 || rememberedValue17 == obj6) {
                        rememberedValue17 = new BasicTextFieldKt$$ExternalSyntheticLambda2(4, mutableState7, mutableState8, function12);
                        gapComposer23.updateRememberedValue(rememberedValue17);
                    }
                    DisclaimerTextKt.JobPickerContent(list2, jobIdentifier2, (Function1) rememberedValue17, null, gapComposer23, 0);
                    gapComposer23.end(false);
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ SsnViewKt$$ExternalSyntheticLambda7(PaddingValues paddingValues, Function1 function1, Function0 function0, MoneyFormatter moneyFormatter, Object obj, Object obj2, int i) {
        this.$r8$classId = i;
        this.f$0 = paddingValues;
        this.f$2 = function1;
        this.f$1 = function0;
        this.f$3 = moneyFormatter;
        this.f$5 = obj;
        this.f$4 = obj2;
    }

    public /* synthetic */ SsnViewKt$$ExternalSyntheticLambda7(Modifier modifier, PaddingValues paddingValues, OffersHomeListItemViewModel.HeroOffersTileViewModel heroOffersTileViewModel, State state, Function1 function1, OffersHeroTileKt$$ExternalSyntheticLambda3 offersHeroTileKt$$ExternalSyntheticLambda3) {
        this.$r8$classId = 4;
        this.f$0 = modifier;
        this.f$1 = paddingValues;
        this.f$3 = heroOffersTileViewModel;
        this.f$5 = state;
        this.f$2 = function1;
        this.f$4 = offersHeroTileKt$$ExternalSyntheticLambda3;
    }

    public /* synthetic */ SsnViewKt$$ExternalSyntheticLambda7(DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController, Function1 function1, Shaker shaker, FocusRequester focusRequester, MutableState mutableState, MutableState mutableState2) {
        this.$r8$classId = 2;
        this.f$0 = delegatingSoftwareKeyboardController;
        this.f$2 = function1;
        this.f$4 = shaker;
        this.f$1 = focusRequester;
        this.f$3 = mutableState;
        this.f$5 = mutableState2;
    }

    public /* synthetic */ SsnViewKt$$ExternalSyntheticLambda7(AmountPickerViewModel amountPickerViewModel, ThemeInfo themeInfo, AmountConfig amountConfig, Function1 function1, Modifier modifier, Function3 function3) {
        this.$r8$classId = 1;
        this.f$0 = amountPickerViewModel;
        this.f$1 = themeInfo;
        this.f$3 = amountConfig;
        this.f$2 = function1;
        this.f$5 = modifier;
        this.f$4 = function3;
    }

    public /* synthetic */ SsnViewKt$$ExternalSyntheticLambda7(VerifyAliasModel verifyAliasModel, FocusOwnerImpl focusOwnerImpl, DelegatingSoftwareKeyboardController delegatingSoftwareKeyboardController, Function1 function1, MutableState mutableState, VerifyAliasModel.ResendCodeButtonState resendCodeButtonState) {
        this.$r8$classId = 3;
        this.f$0 = verifyAliasModel;
        this.f$1 = focusOwnerImpl;
        this.f$5 = delegatingSoftwareKeyboardController;
        this.f$2 = function1;
        this.f$3 = mutableState;
        this.f$4 = resendCodeButtonState;
    }

    public /* synthetic */ SsnViewKt$$ExternalSyntheticLambda7(TouchRecorder touchRecorder, FocusRequester focusRequester, Function1 function1, MutableState mutableState, InsertingScrubber insertingScrubber, MutableState mutableState2) {
        this.$r8$classId = 0;
        this.f$0 = touchRecorder;
        this.f$1 = focusRequester;
        this.f$2 = function1;
        this.f$3 = mutableState;
        this.f$4 = insertingScrubber;
        this.f$5 = mutableState2;
    }

    public /* synthetic */ SsnViewKt$$ExternalSyntheticLambda7(SharedToolbarSwipeScope sharedToolbarSwipeScope, ElementBoundsRegistry elementBoundsRegistry, TabToolbarInternalViewModel.ProfileButton profileButton, TitleBarActionScope titleBarActionScope, String str, Function1 function1) {
        this.$r8$classId = 5;
        this.f$0 = sharedToolbarSwipeScope;
        this.f$1 = elementBoundsRegistry;
        this.f$3 = profileButton;
        this.f$5 = titleBarActionScope;
        this.f$4 = str;
        this.f$2 = function1;
    }
}
