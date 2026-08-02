package androidx.compose.material3;

import androidx.compose.animation.AnimatedContentScopeImpl;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.BoxScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.text.selection.SelectionManager_androidKt$$ExternalSyntheticLambda10;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ProvidedValue;
import androidx.compose.runtime.State;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.window.PopupPositionProvider;
import app.cash.local.views.fulfillment.FulfillmentRadioCellKt;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticOutline0;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.Badge;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.cell.CellDefaultAccessory;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.benefits.views.BenefitsHubViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.bitcoin.views.send.MoveBitcoinViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.blockers.viewmodels.SetNameViewModel;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda15;
import com.squareup.cash.blockers.views.SsnViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.common.composeui.LocalCashVibratorKt;
import com.squareup.cash.deposits.physical.view.map.AtmPmdExplainerViewKt$$ExternalSyntheticLambda7;
import com.squareup.cash.dialog.ArcadeModal2Kt;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda10;
import com.squareup.cash.history.views.ErrorView$$ExternalSyntheticLambda1;
import com.squareup.cash.investing.components.ArcadeBordersKt;
import com.squareup.cash.investing.viewmodels.InvestingStockSelectionViewModel;
import com.squareup.cash.money.viewmodels.MoneyTabModel;
import com.squareup.cash.money.views.CardNestedScrollExpander;
import com.squareup.cash.money.views.MoneyTabUIKt;
import com.squareup.cash.money.views.ToolbarNestedScrollExpander;
import com.squareup.cash.moneybot.components.api.ClientRenderablePluginRegistry;
import com.squareup.cash.moneybot.components.api.LocalMoneybotPluginRegistryKt;
import com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewModel;
import com.squareup.cash.moneybot.views.chat.MoneybotChatViewKt$$ExternalSyntheticLambda2;
import com.squareup.cash.moneybot.views.menu.ExpandableContentKt;
import com.squareup.cash.moneybot.views.shared.LocalMoneybotAnimationsEnabledKt;
import com.squareup.cash.payments.viewmodels.ConfirmRetryResourceDialog;
import com.squareup.cash.payments.viewmodels.PersonalizePaymentToolbarViewModel;
import com.squareup.cash.payments.views.personalization.AlphaKt;
import com.squareup.cash.qrcodes.viewmodels.QrCodeModel;
import com.squareup.cash.securitysignals.ui.TouchRecorder;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.cash.wallet.views.CardRegistry;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.cards.CardTheme;
import com.squareup.util.Strings;
import java.io.Serializable;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import squareup.cash.ui.arcade.elements.CellDefault;

/* loaded from: classes3.dex */
public final /* synthetic */ class TooltipKt$$ExternalSyntheticLambda2 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ boolean f$6;
    public final /* synthetic */ Object f$8;

    public /* synthetic */ TooltipKt$$ExternalSyntheticLambda2(Modifier modifier, Icons icons, String str, String str2, boolean z, Function0 function0, int i) {
        this.$r8$classId = 9;
        this.f$3 = modifier;
        this.f$0 = icons;
        this.f$1 = str;
        this.f$8 = str2;
        this.f$6 = z;
        this.f$2 = function0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:102:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0352  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0367  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x03a1  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x03bc  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x03d1  */
    /* JADX WARN: Removed duplicated region for block: B:135:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:141:0x0392  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x035e  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x0418  */
    /* JADX WARN: Type inference failed for: r2v75, types: [androidx.compose.ui.Modifier] */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        Modifier m183clickableoSLSa3U$default;
        Modifier modifier;
        Icons icons;
        Color color;
        androidx.compose.ui.graphics.Color m;
        long j;
        CellDefault.CellDefaultIcon.IconStyle iconStyle;
        Color color2;
        androidx.compose.ui.graphics.Color m2;
        Icon icon;
        String str;
        CardSchemeViewModel.Module.HeroTag activeHeroTag;
        int i = this.$r8$classId;
        int i2 = 7;
        boolean z = this.f$6;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        boolean z2 = false;
        Object obj3 = this.f$3;
        Object obj4 = this.f$2;
        Object obj5 = this.f$8;
        Object obj6 = this.f$1;
        Object obj7 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                TooltipKt.TooltipBox((PopupPositionProvider) obj7, (ComposableLambdaImpl) obj6, (TooltipStateImpl) obj4, (Modifier) obj3, this.f$6, (ComposableLambdaImpl) obj5, (Composer) obj, Updater.updateChangedFlags(100663345));
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                FulfillmentRadioCellKt.SchedulingTimePickerChip((Modifier) obj3, (String) obj7, (String) obj6, this.f$6, (Function0) obj5, (MutableInteractionSourceImpl) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 2:
                Modifier modifier2 = (Modifier) obj3;
                Function0 function0 = (Function0) obj7;
                QrCodeModel qrCodeModel = (QrCodeModel) obj6;
                Function0 function02 = (Function0) obj5;
                PaddingValues paddingValues = (PaddingValues) obj4;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Modifier aspectRatio = OffsetKt.aspectRatio(1.0f, SizeKt.fillMaxWidth(modifier2, 1.0f), false);
                    Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                    if (function0 == null) {
                        gapComposer.startReplaceGroup(-1992685156);
                        gapComposer.end(false);
                        m183clickableoSLSa3U$default = companion2;
                        modifier = m183clickableoSLSa3U$default;
                    } else {
                        gapComposer.startReplaceGroup(-1992684405);
                        boolean changed = gapComposer.changed(function0);
                        Object rememberedValue = gapComposer.rememberedValue();
                        if (changed || rememberedValue == neverEqualPolicy) {
                            rememberedValue = new ComposeDialogKt$$ExternalSyntheticLambda10(5, function0);
                            gapComposer.updateRememberedValue(rememberedValue);
                        }
                        m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(companion2, false, null, null, (Function0) rememberedValue, 15);
                        modifier = companion2;
                        gapComposer.end(false);
                    }
                    Modifier then = aspectRatio.then(m183clickableoSLSa3U$default);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, then);
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
                    boolean z3 = qrCodeModel.loading && !z;
                    Modifier fillMaxSize = SizeKt.fillMaxSize(modifier, 1.0f);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new BenefitsHubViewKt$$ExternalSyntheticLambda2(26);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    Strings.LoadableFullScreenContent(qrCodeModel, z3, fillMaxSize, (Function1) rememberedValue2, null, Expect_jvmKt.rememberComposableLambda(559777529, new MoveBitcoinViewKt$$ExternalSyntheticLambda4(z, function02, paddingValues), gapComposer), gapComposer, 200064, 16);
                    gapComposer.end(true);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                AnimatedContentScopeImpl animatedContentScopeImpl = (AnimatedContentScopeImpl) obj7;
                Function1 function1 = (Function1) obj6;
                MutableState mutableState = (MutableState) obj5;
                TouchRecorder touchRecorder = (TouchRecorder) obj4;
                SetNameViewModel setNameViewModel = (SetNameViewModel) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                    boolean z4 = (animatedContentScopeImpl.$$delegate_0.getTransition().isRunning() || z) ? false : true;
                    boolean changed2 = gapComposer2.changed(function1) | gapComposer2.changed(mutableState) | gapComposer2.changedInstance(touchRecorder);
                    Object rememberedValue3 = gapComposer2.rememberedValue();
                    if (changed2 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new SsnViewKt$$ExternalSyntheticLambda15(function1, touchRecorder, mutableState, 2);
                        gapComposer2.updateRememberedValue(rememberedValue3);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue3, fillMaxWidth, buttonProminence, false, z4, null, Expect_jvmKt.rememberComposableLambda(-1215565355, new SsnViewKt$$ExternalSyntheticLambda2(setNameViewModel, 23), gapComposer2), gapComposer2, 1573296, 40);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                CellDefault cellDefault = (CellDefault) obj7;
                Function0 function03 = (Function0) obj6;
                Badge.Small small = (Badge.Small) obj5;
                CellDefaultAccessory cellDefaultAccessory = (CellDefaultAccessory) obj4;
                RealImageLoader realImageLoader = (RealImageLoader) obj3;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    CellDefault.CellDefaultIcon cellDefaultIcon = cellDefault.icon;
                    boolean z5 = this.f$6;
                    if (cellDefaultIcon != null) {
                        gapComposer3.startReplaceGroup(-2081168347);
                        CellDefault.CellDefaultIcon.IconStyle iconStyle2 = cellDefaultIcon.icon_style;
                        if (iconStyle2 != null) {
                            CellDefault.CellDefaultIcon.IconStyle.TintedIcon tintedIcon = iconStyle2 instanceof CellDefault.CellDefaultIcon.IconStyle.TintedIcon ? (CellDefault.CellDefaultIcon.IconStyle.TintedIcon) iconStyle2 : null;
                            CellDefault.CellDefaultIcon.TintedIcon value = tintedIcon != null ? tintedIcon.getValue() : null;
                            if (value != null && (icon = value.icon) != null && (str = icon.arcade_id) != null) {
                                Icons.Companion.getClass();
                                icons = zzd.get(str);
                                if (icons == null) {
                                    gapComposer3.startReplaceGroup(-2081066946);
                                    CellDefault.CellDefaultIcon.IconStyle iconStyle3 = cellDefaultIcon.icon_style;
                                    if (iconStyle3 != null) {
                                        CellDefault.CellDefaultIcon.IconStyle.TintedIcon tintedIcon2 = iconStyle3 instanceof CellDefault.CellDefaultIcon.IconStyle.TintedIcon ? (CellDefault.CellDefaultIcon.IconStyle.TintedIcon) iconStyle3 : null;
                                        CellDefault.CellDefaultIcon.TintedIcon value2 = tintedIcon2 != null ? tintedIcon2.getValue() : null;
                                        if (value2 != null) {
                                            color = value2.icon_tint_color;
                                            if (color != null) {
                                                gapComposer3.startReplaceGroup(-2080915357);
                                                gapComposer3.end(false);
                                                m = null;
                                            } else {
                                                m = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer3, -205673634, color, gapComposer3, false);
                                            }
                                            if (m != null) {
                                                gapComposer3.startReplaceGroup(-205671685);
                                                Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                                                if (colors == null) {
                                                    colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                                                } else {
                                                    gapComposer3.startReplaceGroup(-1762997739);
                                                    gapComposer3.end(false);
                                                }
                                                j = colors.semantic.icon.inverse;
                                                gapComposer3.end(false);
                                            } else {
                                                gapComposer3.startReplaceGroup(-205675033);
                                                gapComposer3.end(false);
                                                j = m.value;
                                            }
                                            iconStyle = cellDefaultIcon.icon_style;
                                            if (iconStyle != null) {
                                                CellDefault.CellDefaultIcon.IconStyle.TintedIcon tintedIcon3 = iconStyle instanceof CellDefault.CellDefaultIcon.IconStyle.TintedIcon ? (CellDefault.CellDefaultIcon.IconStyle.TintedIcon) iconStyle : null;
                                                CellDefault.CellDefaultIcon.TintedIcon value3 = tintedIcon3 != null ? tintedIcon3.getValue() : null;
                                                if (value3 != null) {
                                                    color2 = value3.background_color;
                                                    if (color2 == null) {
                                                        gapComposer3.startReplaceGroup(-2080759613);
                                                        gapComposer3.end(false);
                                                        m2 = null;
                                                    } else {
                                                        m2 = BalanceFeedKt$$ExternalSyntheticOutline0.m(gapComposer3, -205668610, color2, gapComposer3, false);
                                                    }
                                                    CellDefaultKt.m3391CellDefaultLargeIconaIPZJ5k(icons, null, m2 != null ? m2.value : androidx.compose.ui.graphics.Color.Unspecified, Expect_jvmKt.rememberComposableLambda(-1600153671, new AtmPmdExplainerViewKt$$ExternalSyntheticLambda7(cellDefault, i2), gapComposer3), null, j, function03, null, z5, true, Expect_jvmKt.rememberComposableLambda(-830521371, new AtmPmdExplainerViewKt$$ExternalSyntheticLambda7(cellDefault, 8), gapComposer3), small, cellDefaultAccessory, 0L, null, gapComposer3, 805309488, 6, 24720);
                                                    gapComposer3.end(false);
                                                }
                                            }
                                            color2 = null;
                                            if (color2 == null) {
                                            }
                                            CellDefaultKt.m3391CellDefaultLargeIconaIPZJ5k(icons, null, m2 != null ? m2.value : androidx.compose.ui.graphics.Color.Unspecified, Expect_jvmKt.rememberComposableLambda(-1600153671, new AtmPmdExplainerViewKt$$ExternalSyntheticLambda7(cellDefault, i2), gapComposer3), null, j, function03, null, z5, true, Expect_jvmKt.rememberComposableLambda(-830521371, new AtmPmdExplainerViewKt$$ExternalSyntheticLambda7(cellDefault, 8), gapComposer3), small, cellDefaultAccessory, 0L, null, gapComposer3, 805309488, 6, 24720);
                                            gapComposer3.end(false);
                                        }
                                    }
                                    color = null;
                                    if (color != null) {
                                    }
                                    if (m != null) {
                                    }
                                    iconStyle = cellDefaultIcon.icon_style;
                                    if (iconStyle != null) {
                                    }
                                    color2 = null;
                                    if (color2 == null) {
                                    }
                                    CellDefaultKt.m3391CellDefaultLargeIconaIPZJ5k(icons, null, m2 != null ? m2.value : androidx.compose.ui.graphics.Color.Unspecified, Expect_jvmKt.rememberComposableLambda(-1600153671, new AtmPmdExplainerViewKt$$ExternalSyntheticLambda7(cellDefault, i2), gapComposer3), null, j, function03, null, z5, true, Expect_jvmKt.rememberComposableLambda(-830521371, new AtmPmdExplainerViewKt$$ExternalSyntheticLambda7(cellDefault, 8), gapComposer3), small, cellDefaultAccessory, 0L, null, gapComposer3, 805309488, 6, 24720);
                                    gapComposer3.end(false);
                                } else {
                                    gapComposer3.startReplaceGroup(-2080430485);
                                    CellDefaultKt.m3394CellDefaultSmallIconygcbOzY(Expect_jvmKt.rememberComposableLambda(859713831, new ErrorView$$ExternalSyntheticLambda1(2, cellDefaultIcon, realImageLoader), gapComposer3), Expect_jvmKt.rememberComposableLambda(-2096761210, new AtmPmdExplainerViewKt$$ExternalSyntheticLambda7(cellDefault, 9), gapComposer3), null, function03, z5, false, Expect_jvmKt.rememberComposableLambda(1639225024, new AtmPmdExplainerViewKt$$ExternalSyntheticLambda7(cellDefault, 10), gapComposer3), small, cellDefaultAccessory, 0L, gapComposer3, 12582966, 3156);
                                    gapComposer3.end(false);
                                }
                                gapComposer3.end(false);
                            }
                        }
                        icons = null;
                        if (icons == null) {
                        }
                        gapComposer3.end(false);
                    } else {
                        gapComposer3.startReplaceGroup(-2079700993);
                        CellDefaultKt.m3393CellDefaultNoIconpX9LQoI(Expect_jvmKt.rememberComposableLambda(1406079874, new AtmPmdExplainerViewKt$$ExternalSyntheticLambda7(cellDefault, 11), gapComposer3), null, function03, z5, false, Expect_jvmKt.rememberComposableLambda(880712968, new AtmPmdExplainerViewKt$$ExternalSyntheticLambda7(cellDefault, 12), gapComposer3), small, 0L, cellDefaultAccessory, null, gapComposer3, 1572870, 1322);
                        gapComposer3.end(false);
                    }
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                ArcadeBordersKt.SearchResultItem((InvestingStockSelectionViewModel.SearchResultItemModel) obj7, this.f$6, (RealImageLoader) obj6, (Function0) obj5, (Function0) obj4, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 6:
                MoneyTabModel.Loaded loaded = (MoneyTabModel.Loaded) obj7;
                CardRegistry cardRegistry = (CardRegistry) obj6;
                ToolbarNestedScrollExpander toolbarNestedScrollExpander = (ToolbarNestedScrollExpander) obj5;
                CardNestedScrollExpander cardNestedScrollExpander = (CardNestedScrollExpander) obj4;
                LazyListState lazyListState = (LazyListState) obj3;
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    Object rememberedValue4 = gapComposer4.rememberedValue();
                    if (rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = Updater.derivedStateOf(new DatePickerKt$$ExternalSyntheticLambda24(lazyListState, 7));
                        gapComposer4.updateRememberedValue(rememberedValue4);
                    }
                    if (((Boolean) ((State) rememberedValue4).getValue()).booleanValue()) {
                        gapComposer4.startReplaceGroup(-249063915);
                        MoneyTabUIKt.MoneyTabBackground(3078, gapComposer4, SizeKt.fillMaxSize(companion, 1.0f), cardNestedScrollExpander, toolbarNestedScrollExpander, (cardRegistry == null || (activeHeroTag = cardRegistry.getActiveHeroTag()) == null) ? null : activeHeroTag.background, loaded.cardThemeId, this.f$6);
                        gapComposer4.end(false);
                    } else {
                        gapComposer4.startReplaceGroup(-248582454);
                        gapComposer4.end(false);
                    }
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(3079);
                MoneyTabUIKt.MoneyTabBackground(updateChangedFlags, (Composer) obj, (Modifier) obj3, (CardNestedScrollExpander) obj4, (ToolbarNestedScrollExpander) obj5, (Image) obj6, (CardTheme.Identifier) obj7, this.f$6);
                return Unit.INSTANCE;
            case 8:
                RealImageLoader realImageLoader2 = (RealImageLoader) obj7;
                RealCashVibrator realCashVibrator = (RealCashVibrator) obj6;
                ClientRenderablePluginRegistry clientRenderablePluginRegistry = (ClientRenderablePluginRegistry) obj5;
                MoneybotChatViewModel moneybotChatViewModel = (MoneybotChatViewModel) obj4;
                Function1 function12 = (Function1) obj3;
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    if (z) {
                        gapComposer5.startReplaceGroup(1528226816);
                        boolean booleanValue = ((Boolean) gapComposer5.consume(LocalMoneybotAnimationsEnabledKt.LocalMoneybotAnimationsEnabled)).booleanValue();
                        gapComposer5.end(false);
                        z2 = booleanValue;
                    } else {
                        gapComposer5.startReplaceGroup(130392277);
                        gapComposer5.end(false);
                    }
                    Updater.CompositionLocalProvider(new ProvidedValue[]{LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(realImageLoader2), LocalCashVibratorKt.LocalCashVibrator.defaultProvidedValue$runtime(realCashVibrator), LocalMoneybotPluginRegistryKt.LocalMoneybotPluginRegistry.defaultProvidedValue$runtime(clientRenderablePluginRegistry), LocalMoneybotAnimationsEnabledKt.LocalMoneybotAnimationsEnabled.defaultProvidedValue$runtime(Boolean.valueOf(z2))}, Expect_jvmKt.rememberComposableLambda(-1875932679, new MoneybotChatViewKt$$ExternalSyntheticLambda2(moneybotChatViewModel, z, function12), gapComposer5), gapComposer5, 56);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                ((Integer) obj2).getClass();
                ExpandableContentKt.MoneybotOverflowMenuItem((Modifier) obj3, (Icons) obj7, (String) obj6, (String) obj5, this.f$6, (Function0) obj4, (Composer) obj, Updater.updateChangedFlags(49));
                return Unit.INSTANCE;
            default:
                PersonalizePaymentToolbarViewModel personalizePaymentToolbarViewModel = (PersonalizePaymentToolbarViewModel) obj7;
                Function0 function04 = (Function0) obj6;
                ConfirmRetryResourceDialog confirmRetryResourceDialog = (ConfirmRetryResourceDialog) obj5;
                Function0 function05 = (Function0) obj4;
                Function0 function06 = (Function0) obj3;
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    Modifier fillMaxSize2 = SizeKt.fillMaxSize(ImageKt.m177backgroundbw27NRU(companion, androidx.compose.ui.graphics.Color.Black, ColorKt.RectangleShape), 1.0f);
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, false);
                    int hashCode2 = Long.hashCode(gapComposer6.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer6.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer6, fillMaxSize2);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer6.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer6.startReusableNode();
                    if (gapComposer6.inserting) {
                        gapComposer6.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer6.useNode();
                    }
                    Updater.m576setimpl(gapComposer6, maybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer6, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer6, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer6, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer6, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                    boolean z6 = this.f$6;
                    Modifier.Companion statusBarsPadding = z6 ? companion : SpacerKt.statusBarsPadding(companion);
                    List list = personalizePaymentToolbarViewModel.recipients;
                    PersonalizePaymentToolbarViewModel.SendButtonConfiguration sendButtonConfiguration = personalizePaymentToolbarViewModel.sendButtonConfiguration;
                    boolean z7 = sendButtonConfiguration != null && sendButtonConfiguration.isSendEnabled;
                    boolean z8 = personalizePaymentToolbarViewModel.isSender;
                    AlphaKt.PersonalizedPaymentToolbar(statusBarsPadding, function04, null, list, z7, !z8, z8, z6, null, false, gapComposer6, 0, 772);
                    AlphaKt.PersonalizedBackgroundLoadingIndicator(SizeKt.m285size3ABfNKs(BoxScopeInstance.INSTANCE.align(companion, Alignment.Companion.Center), 32.0f), gapComposer6, 0);
                    if (confirmRetryResourceDialog == null) {
                        gapComposer6.startReplaceGroup(897605663);
                        gapComposer6.end(false);
                    } else {
                        gapComposer6.startReplaceGroup(897605664);
                        String str2 = confirmRetryResourceDialog.title;
                        String str3 = confirmRetryResourceDialog.message;
                        String str4 = confirmRetryResourceDialog.positiveButtonText;
                        String str5 = confirmRetryResourceDialog.negativeButtonText;
                        boolean changed3 = gapComposer6.changed(function05) | gapComposer6.changed(function04);
                        Object rememberedValue5 = gapComposer6.rememberedValue();
                        if (changed3 || rememberedValue5 == neverEqualPolicy) {
                            rememberedValue5 = new SelectionManager_androidKt$$ExternalSyntheticLambda10(function05, function04, 2);
                            gapComposer6.updateRememberedValue(rememberedValue5);
                        }
                        ArcadeModal2Kt.AlertDialog(str2, str3, str4, str5, (Function1) rememberedValue5, function06, function06, gapComposer6, 0);
                        gapComposer6.end(false);
                    }
                    gapComposer6.end(true);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ TooltipKt$$ExternalSyntheticLambda2(AnimatedContentScopeImpl animatedContentScopeImpl, MutableState mutableState, SetNameViewModel setNameViewModel, TouchRecorder touchRecorder, Function1 function1, boolean z) {
        this.$r8$classId = 3;
        this.f$0 = animatedContentScopeImpl;
        this.f$6 = z;
        this.f$1 = function1;
        this.f$8 = mutableState;
        this.f$2 = touchRecorder;
        this.f$3 = setNameViewModel;
    }

    public /* synthetic */ TooltipKt$$ExternalSyntheticLambda2(int i, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, boolean z) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$6 = z;
        this.f$8 = obj3;
        this.f$2 = obj4;
        this.f$3 = obj5;
    }

    public /* synthetic */ TooltipKt$$ExternalSyntheticLambda2(Modifier modifier, Object obj, Serializable serializable, boolean z, Object obj2, Object obj3, int i, int i2) {
        this.$r8$classId = i2;
        this.f$3 = modifier;
        this.f$0 = obj;
        this.f$1 = serializable;
        this.f$6 = z;
        this.f$8 = obj2;
        this.f$2 = obj3;
    }

    public /* synthetic */ TooltipKt$$ExternalSyntheticLambda2(Modifier modifier, Function0 function0, QrCodeModel qrCodeModel, boolean z, Function0 function02, PaddingValues paddingValues) {
        this.$r8$classId = 2;
        this.f$3 = modifier;
        this.f$0 = function0;
        this.f$1 = qrCodeModel;
        this.f$6 = z;
        this.f$8 = function02;
        this.f$2 = paddingValues;
    }

    public /* synthetic */ TooltipKt$$ExternalSyntheticLambda2(PopupPositionProvider popupPositionProvider, ComposableLambdaImpl composableLambdaImpl, TooltipStateImpl tooltipStateImpl, Modifier modifier, boolean z, ComposableLambdaImpl composableLambdaImpl2, int i) {
        this.$r8$classId = 0;
        this.f$0 = popupPositionProvider;
        this.f$1 = composableLambdaImpl;
        this.f$2 = tooltipStateImpl;
        this.f$3 = modifier;
        this.f$6 = z;
        this.f$8 = composableLambdaImpl2;
    }

    public /* synthetic */ TooltipKt$$ExternalSyntheticLambda2(InvestingStockSelectionViewModel.SearchResultItemModel searchResultItemModel, boolean z, RealImageLoader realImageLoader, Function0 function0, Function0 function02, Function0 function03, int i) {
        this.$r8$classId = 5;
        this.f$0 = searchResultItemModel;
        this.f$6 = z;
        this.f$1 = realImageLoader;
        this.f$8 = function0;
        this.f$2 = function02;
        this.f$3 = function03;
    }

    public /* synthetic */ TooltipKt$$ExternalSyntheticLambda2(boolean z, RealImageLoader realImageLoader, RealCashVibrator realCashVibrator, ClientRenderablePluginRegistry clientRenderablePluginRegistry, MoneybotChatViewModel moneybotChatViewModel, Function1 function1) {
        this.$r8$classId = 8;
        this.f$6 = z;
        this.f$0 = realImageLoader;
        this.f$1 = realCashVibrator;
        this.f$8 = clientRenderablePluginRegistry;
        this.f$2 = moneybotChatViewModel;
        this.f$3 = function1;
    }

    public /* synthetic */ TooltipKt$$ExternalSyntheticLambda2(boolean z, PersonalizePaymentToolbarViewModel personalizePaymentToolbarViewModel, Function0 function0, ConfirmRetryResourceDialog confirmRetryResourceDialog, Function0 function02, Function0 function03) {
        this.$r8$classId = 10;
        this.f$6 = z;
        this.f$0 = personalizePaymentToolbarViewModel;
        this.f$1 = function0;
        this.f$8 = confirmRetryResourceDialog;
        this.f$2 = function02;
        this.f$3 = function03;
    }
}
