package app.cash.local.views.internal;

import androidx.camera.core.impl.utils.Threads;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.collection.internal.RuntimeHelpersKt;
import androidx.compose.animation.AnimatedContentScopeImpl;
import androidx.compose.animation.BoundsTransform;
import androidx.compose.animation.RemeasureImpl;
import androidx.compose.animation.SharedBoundsNode$$ExternalSyntheticLambda0;
import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.animation.core.Animatable;
import androidx.compose.animation.core.MutableTransitionState;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.Arrangement$End$1;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.LayoutWeightElement;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScopeInstance;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.layout.internal.InlineClassHelperKt;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.foundation.shape.RoundedCornerShape;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.foundation.text.contextmenu.provider.BasicTextContextMenuProvider;
import androidx.compose.material.SwipeToDismissKt$$ExternalSyntheticLambda4;
import androidx.compose.material3.DateInputKt$$ExternalSyntheticLambda5;
import androidx.compose.material3.MenuKt;
import androidx.compose.material3.SliderDefaults$$ExternalSyntheticLambda3;
import androidx.compose.material3.TooltipKt$$ExternalSyntheticLambda1;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.draw.RotateKt;
import androidx.compose.ui.draw.ScaleKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.ContentScale$Companion$Fit$1;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.layout.ValueInsets;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.local.viewmodels.CouponSection;
import app.cash.local.viewmodels.marketingmessages.MarketingMessageViewModel;
import app.cash.local.viewmodels.marketingmessages.MarketingMessagesViewModel;
import app.cash.local.viewmodels.toasts.ToastData;
import app.cash.local.views.LocalViewFactory$$ExternalSyntheticLambda6;
import app.cash.local.views.brand.checkout.CheckoutTipSectionKt;
import app.cash.local.views.map.BrandSheetViewKt$$ExternalSyntheticLambda0;
import app.cash.local.views.map.BrandSheetViewKt$$ExternalSyntheticLambda1;
import app.cash.local.views.marketingmessages.MarketingMessageKt;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda1;
import app.cash.molecule.PlatformKt;
import bo.app.b$$ExternalSyntheticLambda3;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.AsyncImageKt;
import coil3.compose.UtilsKt$$ExternalSyntheticLambda1;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.zxing.BinaryBitmap;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.account.components.AccountToDoKt;
import com.squareup.cash.account.components.ThemeSwitcherViewKt;
import com.squareup.cash.account.components.accountswitcher.BadgeTitleKt;
import com.squareup.cash.account.settings.viewmodels.AccountAvatarViewModel;
import com.squareup.cash.account.settings.viewmodels.AccountViewEvent;
import com.squareup.cash.account.settings.viewmodels.ThemeData;
import com.squareup.cash.activity.viewmodels.ActivityEmbeddedViewModel;
import com.squareup.cash.activity.viewmodels.ActivityTabViewModel;
import com.squareup.cash.activity.views.ActivityTabViewKt;
import com.squareup.cash.activity.views.AvatarsKt;
import com.squareup.cash.afterpayapplet.applets.viewmodels.AfterpayAppletTileViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletPurchasesEmbeddedViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletUpsellCardViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpaySearchViewModel;
import com.squareup.cash.afterpayapplet.viewmodels.CardThumbnailDisplayStyle;
import com.squareup.cash.afterpayapplet.viewmodels.FooterSection;
import com.squareup.cash.afterpayapplet.views.AfterpaySearchViewKt;
import com.squareup.cash.afterpayapplet.views.homesection.v3.AfterpayCardKt;
import com.squareup.cash.appmessages.InlineAppMessageV2ViewModel;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.bindings.component.ArcadeComponentProtoBindingKt;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.internal.TooltipState;
import com.squareup.cash.arcade.components.list.ListOrderedKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.bitcoin.views.applet.buttons.BitcoinTradeButtonsWidgetViewKt;
import com.squareup.cash.blockers.views.CashtagViewKt$$ExternalSyntheticLambda13;
import com.squareup.cash.card.onboarding.StyledCardViewKt;
import com.squareup.cash.card.onboarding.StyledCardViewModel;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda12;
import com.squareup.cash.family.applets.views.FamilyAppletTile;
import com.squareup.cash.money.applets.viewmodels.AppletTile;
import com.squareup.cash.moneybot.analytics.AnalyticsMappersKt;
import com.squareup.cash.mooncake.components.MooncakeLargeIcon;
import com.squareup.cash.paymentpad.viewmodels.MainPaymentPadViewModel;
import com.squareup.cash.performance.RealScrollPerformanceTrackerFactory;
import com.squareup.cash.profile.viewmodels.ProfileHeaderViewModel;
import com.squareup.cash.sheet.SheetKt;
import com.squareup.cash.tax.applet.views.TaxesAppletViewsModule$$ExternalSyntheticLambda1;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Map;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.time.Duration;
import kotlinx.coroutines.channels.SendChannel;
import org.intellij.markdown.ast.ASTNodeImpl;
import squareup.cash.savings.action.SavingsAction;
import squareup.cash.ui.arcade.elements.ArcadeComponent;

/* loaded from: classes3.dex */
public final /* synthetic */ class DismissableToastKt$$ExternalSyntheticLambda4 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;

    public /* synthetic */ DismissableToastKt$$ExternalSyntheticLambda4(AfterpayAppletPurchasesEmbeddedViewModel.Default r2, Function1 function1, AfterpayAppletPurchasesEmbeddedViewModel.EmbeddedActivitySection embeddedActivitySection, AfterpayAppletPurchasesEmbeddedViewModel.EmbeddedActivitySection embeddedActivitySection2) {
        this.$r8$classId = 19;
        this.f$0 = r2;
        this.f$1 = function1;
        this.f$2 = embeddedActivitySection;
        this.f$3 = embeddedActivitySection2;
    }

    private final Object invoke$com$squareup$cash$afterpayapplet$views$homesection$v3$PrepurchaseToggleSectionKt$$ExternalSyntheticLambda6(Object obj, Object obj2) {
        AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PrepurchaseToggleSection.ToggleState toggleState = (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PrepurchaseToggleSection.ToggleState) this.f$0;
        AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PrepurchaseToggleSection prepurchaseToggleSection = (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PrepurchaseToggleSection) this.f$1;
        SharedTransitionScope sharedTransitionScope = (SharedTransitionScope) this.f$2;
        AnimatedContentScopeImpl animatedContentScopeImpl = (AnimatedContentScopeImpl) this.f$3;
        Composer composer = (Composer) obj;
        int intValue = ((Integer) obj2).intValue();
        GapComposer gapComposer = (GapComposer) composer;
        if (!gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
            gapComposer.skipToGroupEnd();
        } else if (toggleState == AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PrepurchaseToggleSection.ToggleState.TURNED_OFF) {
            gapComposer.startReplaceGroup(1262673565);
            StyledCardViewModel styledCardViewModel = prepurchaseToggleSection.styledCardViewModel;
            if (styledCardViewModel == null) {
                gapComposer.startReplaceGroup(488174852);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(488174853);
                BiasAlignment biasAlignment = Alignment.Companion.Center;
                gapComposer.startReplaceGroup(1262676818);
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(companion, 38.0f);
                RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
                Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(ClipKt.clip(m285size3ABfNKs, rectangleShapeKt$RectangleShape$1), Color.Transparent, rectangleShapeKt$RectangleShape$1);
                SharedTransitionScope.SharedContentState rememberSharedContentState = sharedTransitionScope.rememberSharedContentState("prepurchase-card", gapComposer, 6);
                Object rememberedValue = gapComposer.rememberedValue();
                if (rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new SharedBoundsNode$$ExternalSyntheticLambda0(3);
                    gapComposer.updateRememberedValue(rememberedValue);
                }
                Modifier sharedBounds$default = SharedTransitionScope.sharedBounds$default(sharedTransitionScope, m177backgroundbw27NRU, rememberSharedContentState, animatedContentScopeImpl, null, null, (BoundsTransform) rememberedValue, RemeasureImpl.scaleToBounds$default(SharedTransitionScope.ResizeMode.Companion, ContentScale.Companion.Fit), null, 972);
                gapComposer.end(false);
                MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer, sharedBounds$default);
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
                Modifier scale = ScaleKt.scale(SizeKt.m290width3ABfNKs(SizeKt.wrapContentSize$default(companion, null, 1), 144.0f), 0.2638889f, 0.2638889f);
                CardThumbnailDisplayStyle cardThumbnailDisplayStyle = CardThumbnailDisplayStyle.STANDARD;
                Modifier rotate = RotateKt.rotate(scale, -9.0f);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                DefaultSizes.spacing.getClass();
                ((DefaultSizes) gapComposer.consume(staticProvidableCompositionLocal)).getClass();
                StyledCardViewKt.m3439StyledCardnSlTg7c(StyledCardViewModel.copy$default(styledCardViewModel, null, null, false, null, 63487), SpacerKt.m302paddingqDBjuR0$default(rotate, 8.0f, RecyclerView.DECELERATION_RATE, 4.0f, RecyclerView.DECELERATION_RATE, 10), null, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, false, gapComposer, 0, 60);
                gapComposer.end(true);
                gapComposer.end(false);
            }
            gapComposer.end(false);
        } else {
            gapComposer.startReplaceGroup(489589693);
            gapComposer.end(false);
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$arcade$bindings$component$ArcadeComponentProtoBindingKt$$ExternalSyntheticLambda0(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        ArcadeComponentProtoBindingKt.m3377ArcadeComponentxqIIw2o((ArcadeComponent) this.f$1, (Function1) this.f$2, (Modifier) this.f$0, (Color) this.f$3, (Composer) obj, Updater.updateChangedFlags(49));
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$arcade$components$internal$TooltipKt$$ExternalSyntheticLambda1(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        RuntimeHelpersKt.TooltipBox((Modifier) this.f$0, (String) this.f$1, (TooltipState) this.f$2, (ComposableLambdaImpl) this.f$3, (Composer) obj, Updater.updateChangedFlags(3073));
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$arcade$components$list$ListOrderedKt$$ExternalSyntheticLambda17(Object obj, Object obj2) {
        ((Integer) obj2).getClass();
        ListOrderedKt.StandardItemWithBody((String) this.f$1, (ComposableLambdaImpl) this.f$2, (Function2) this.f$3, (Modifier) this.f$0, (Composer) obj, Updater.updateChangedFlags(3073));
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x0215, code lost:
    
        if (r4 == r3) goto L54;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v104 */
    /* JADX WARN: Type inference failed for: r0v105 */
    /* JADX WARN: Type inference failed for: r0v13, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.GapComposer] */
    /* JADX WARN: Type inference failed for: r0v21, types: [androidx.compose.runtime.Composer, androidx.compose.runtime.GapComposer] */
    /* JADX WARN: Type inference failed for: r4v42 */
    /* JADX WARN: Type inference failed for: r4v44, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v51 */
    /* JADX WARN: Type inference failed for: r8v27, types: [androidx.compose.ui.Modifier] */
    /* JADX WARN: Type inference failed for: r9v10, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v25 */
    /* JADX WARN: Type inference failed for: r9v26, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r9v55 */
    /* JADX WARN: Type inference failed for: r9v56, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v57 */
    /* JADX WARN: Type inference failed for: r9v74 */
    @Override // kotlin.jvm.functions.Function2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        int i;
        boolean z;
        Modifier.Companion companion;
        ContentScale$Companion$Fit$1 contentScale$Companion$Fit$1;
        ContentScale$Companion$Fit$1 contentScale$Companion$Fit$12;
        MarketingMessageViewModel marketingMessageViewModel;
        boolean z2;
        ?? r9;
        MarketingMessageViewModel.OfferPreview offerPreview;
        int i2;
        GapComposer gapComposer;
        Arrangement$End$1 arrangement$End$1;
        Function1 function1;
        ?? r4;
        ?? r92;
        Modifier.Companion companion2;
        Composer composer;
        NeverEqualPolicy neverEqualPolicy;
        MutableState mutableState;
        Object obj3;
        TextStyle textStyle;
        NeverEqualPolicy neverEqualPolicy2;
        int i3 = this.$r8$classId;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
        Modifier.Companion companion3 = Modifier.Companion.$$INSTANCE;
        NeverEqualPolicy neverEqualPolicy3 = Composer.Companion.Empty;
        Object obj4 = this.f$0;
        int i4 = 7;
        Object obj5 = this.f$3;
        Object obj6 = this.f$2;
        Object obj7 = this.f$1;
        switch (i3) {
            case 0:
                ((Integer) obj2).getClass();
                LocalMapKt.m1318DismissableToastTnuy9kA((Modifier) obj4, (ToastData) obj7, (Function0) obj6, (Duration) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 1:
                Modifier modifier = (Modifier) obj4;
                MutableState mutableState2 = (MutableState) obj7;
                ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) obj6;
                BasicTextContextMenuProvider basicTextContextMenuProvider = (BasicTextContextMenuProvider) obj5;
                Composer composer2 = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Object rememberedValue = gapComposer2.rememberedValue();
                    if (rememberedValue == neverEqualPolicy3) {
                        rememberedValue = new DateInputKt$$ExternalSyntheticLambda5(5, mutableState2);
                        gapComposer2.updateRememberedValue(rememberedValue);
                    }
                    Modifier onGloballyPositioned = ValueInsets.onGloballyPositioned(modifier, (Function1) rememberedValue);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.TopStart, true);
                    int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, onGloballyPositioned);
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
                    Updater.m576setimpl(gapComposer2, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    composableLambdaImpl.invoke((Object) gapComposer2, (Object) 0);
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (rememberedValue2 == neverEqualPolicy3) {
                        rememberedValue2 = new TooltipKt$$ExternalSyntheticLambda1(9, mutableState2);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    basicTextContextMenuProvider.ContextMenu((Function0) rememberedValue2, gapComposer2, 6);
                    gapComposer2.end(true);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                CheckoutTipSectionKt.CheckoutCouponSection((Modifier) obj4, (CouponSection) obj7, (Function1) obj6, (Function1) obj5, (Composer) obj, Updater.updateChangedFlags(7));
                return Unit.INSTANCE;
            case 3:
                Modifier modifier2 = (Modifier) obj4;
                MarketingMessageViewModel marketingMessageViewModel2 = (MarketingMessageViewModel) obj7;
                Function1 function12 = (Function1) obj6;
                MutableState mutableState3 = (MutableState) obj5;
                Composer composer3 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                Arrangement$End$1 arrangement$End$12 = SpacerKt.Start;
                BiasAlignment.Vertical vertical = Alignment.Companion.CenterVertically;
                BiasAlignment biasAlignment = Alignment.Companion.TopStart;
                ?? r0 = (GapComposer) composer3;
                boolean shouldExecute = r0.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2);
                Applier applier = r0.applier;
                if (shouldExecute) {
                    RoundedCornerShape m340RoundedCornerShape0680j_4 = RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(32.0f);
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(SpacerKt.statusBarsPadding(ImageKt.m177backgroundbw27NRU(SizeKt.fillMaxSize(modifier2, 1.0f), Strings.getColors(r0).semantic.background.inverse, rectangleShapeKt$RectangleShape$1)), RecyclerView.DECELERATION_RATE, 16.0f, 1);
                    Arrangement$Top$1 arrangement$Top$1 = SpacerKt.Top;
                    BiasAlignment.Horizontal horizontal = Alignment.Companion.Start;
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, r0, 0);
                    int hashCode2 = Long.hashCode(r0.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = r0.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(r0, m300paddingVpY3zN4$default);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    r0.startReusableNode();
                    if (r0.inserting) {
                        r0.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        r0.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(r0, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(r0, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode2);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(r0, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(r0, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(r0, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    Modifier.Companion companion4 = Modifier.Companion.$$INSTANCE;
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion4, 1.0f);
                    if (1.0f <= 0.0d) {
                        InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
                    }
                    Modifier then = fillMaxWidth.then(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true));
                    LocalColor localColor = marketingMessageViewModel2.backgroundColor;
                    MarketingMessageViewModel.OfferPreview offerPreview2 = marketingMessageViewModel2.offer;
                    Modifier m177backgroundbw27NRU = ImageKt.m177backgroundbw27NRU(ImageKt.m177backgroundbw27NRU(then, LocalViewsKt.toComposeColor(localColor, r0, 0), m340RoundedCornerShape0680j_4), Color.m675copywmQWz5c$default(0.9f, Strings.getColors(r0).base.constantWhite, 14), m340RoundedCornerShape0680j_4);
                    LocalColor localColor2 = marketingMessageViewModel2.backgroundColor;
                    m177backgroundbw27NRU.getClass();
                    localColor2.getClass();
                    Colors colors = (Colors) r0.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        i = 0;
                        colors = re$$ExternalSyntheticOutline0.m((GapComposer) r0, -1762997026, (GapComposer) r0, false);
                    } else {
                        i = 0;
                        r0.startReplaceGroup(-1762997739);
                        r0.end(false);
                    }
                    if (colors.isLight) {
                        r0.startReplaceGroup(1200036617);
                        long composeColor = LocalViewsKt.toComposeColor(localColor2, r0, i);
                        z = Color.m681getRedimpl(composeColor) >= 0.95f && Color.m680getGreenimpl(composeColor) >= 0.95f && Color.m678getBlueimpl(composeColor) >= 0.95f;
                        r0.end(false);
                    } else {
                        ?? r93 = i;
                        r0.startReplaceGroup(-1453569300);
                        r0.end(r93);
                        z = r93 == true ? 1 : 0;
                    }
                    if (z) {
                        m177backgroundbw27NRU = m177backgroundbw27NRU.then(ImageKt.m178borderxT4_qwU(companion4, LocalViewsKt.CloseToWhiteBackgroundBorderWidth, LocalViewsKt.CloseToWhiteBackgroundBorderColor, m340RoundedCornerShape0680j_4));
                    }
                    Modifier clip = ClipKt.clip(m177backgroundbw27NRU, m340RoundedCornerShape0680j_4);
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, r0, 0);
                    int hashCode3 = Long.hashCode(r0.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = r0.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(r0, clip);
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    r0.startReusableNode();
                    if (r0.inserting) {
                        r0.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        r0.useNode();
                    }
                    Updater.m576setimpl(r0, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(r0, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode3, (GapComposer) r0, composeUiNode$Companion$SetModifier$13, (GapComposer) r0, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(r0, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                    if (1.0f <= 0.0d) {
                        InlineClassHelperKt.throwIllegalArgumentException("invalid weight; must be greater than zero");
                    }
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(SpacerKt.m300paddingVpY3zN4$default(new LayoutWeightElement(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 24.0f, RecyclerView.DECELERATION_RATE, 2), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 48.0f, 7);
                    ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, r0, 0);
                    int hashCode4 = Long.hashCode(r0.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = r0.currentCompositionLocalScope();
                    Modifier materializeModifier4 = PlatformKt.materializeModifier(r0, m302paddingqDBjuR0$default);
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    r0.startReusableNode();
                    if (r0.inserting) {
                        r0.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        r0.useNode();
                    }
                    Updater.m576setimpl(r0, columnMeasurePolicy3, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(r0, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode4, (GapComposer) r0, composeUiNode$Companion$SetModifier$13, (GapComposer) r0, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(r0, materializeModifier4, composeUiNode$Companion$SetModifier$14);
                    MarketingMessageKt.MarketingMessageProfileHeader(marketingMessageViewModel2, function12, r0, 0);
                    LocalImage localImage = marketingMessageViewModel2.image;
                    Modifier clip2 = ClipKt.clip(SizeKt.fillMaxSize(SpacerKt.m302paddingqDBjuR0$default(companion4, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), 1.0f), rectangleShapeKt$RectangleShape$1);
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(localImage != null ? biasAlignment : Alignment.Companion.Center, false);
                    int hashCode5 = Long.hashCode(r0.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope5 = r0.currentCompositionLocalScope();
                    Modifier materializeModifier5 = PlatformKt.materializeModifier(r0, clip2);
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    r0.startReusableNode();
                    if (r0.inserting) {
                        r0.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        r0.useNode();
                    }
                    Updater.m576setimpl(r0, maybeCachedBoxMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(r0, currentCompositionLocalScope5, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode5, (GapComposer) r0, composeUiNode$Companion$SetModifier$13, (GapComposer) r0, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(r0, materializeModifier5, composeUiNode$Companion$SetModifier$14);
                    ContentScale$Companion$Fit$1 contentScale$Companion$Fit$13 = ContentScale.Companion.Fit;
                    if (localImage != null) {
                        r0.startReplaceGroup(1637531173);
                        companion = companion4;
                        AsyncImageKt.m1438AsyncImage10Xjiaw(LocalViewsKt.getThemedUrl(localImage, r0), null, SizeKt.fillMaxSize(SpacerKt.m300paddingVpY3zN4$default(SpacerKt.m302paddingqDBjuR0$default(companion4, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), 24.0f, RecyclerView.DECELERATION_RATE, 2), 1.0f), null, contentScale$Companion$Fit$13, null, r0, 1573296, 1976);
                        contentScale$Companion$Fit$1 = contentScale$Companion$Fit$13;
                        r0.end(false);
                    } else {
                        companion = companion4;
                        contentScale$Companion$Fit$1 = contentScale$Companion$Fit$13;
                        r0.startReplaceGroup(1637794921);
                        r0.end(false);
                    }
                    String str = marketingMessageViewModel2.messageText;
                    if (str == null || StringsKt.isBlank(str)) {
                        contentScale$Companion$Fit$12 = contentScale$Companion$Fit$1;
                        marketingMessageViewModel = marketingMessageViewModel2;
                        z2 = true;
                        r9 = 0;
                        r0.startReplaceGroup(1638763113);
                        r0.end(false);
                    } else {
                        r0.startReplaceGroup(1637916472);
                        Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 0.8f);
                        contentScale$Companion$Fit$12 = contentScale$Companion$Fit$1;
                        MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(biasAlignment, false);
                        int hashCode6 = Long.hashCode(r0.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope6 = r0.currentCompositionLocalScope();
                        Modifier materializeModifier6 = PlatformKt.materializeModifier(r0, fillMaxWidth2);
                        if (applier == null) {
                            Updater.invalidApplier();
                            throw null;
                        }
                        r0.startReusableNode();
                        marketingMessageViewModel = marketingMessageViewModel2;
                        if (r0.inserting) {
                            r0.createNode(layoutNode$Companion$Constructor$12);
                        } else {
                            r0.useNode();
                        }
                        Updater.m576setimpl(r0, maybeCachedBoxMeasurePolicy3, composeUiNode$Companion$SetModifier$1);
                        Updater.m576setimpl(r0, currentCompositionLocalScope6, composeUiNode$Companion$SetModifier$12);
                        Recorder$$ExternalSyntheticOutline2.m(hashCode6, (GapComposer) r0, composeUiNode$Companion$SetModifier$13, (GapComposer) r0, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        Updater.m576setimpl(r0, materializeModifier6, composeUiNode$Companion$SetModifier$14);
                        if (str.length() <= 12) {
                            r0.startReplaceGroup(-210339458);
                            textStyle = Strings.getTypography(r0).headlineLarge;
                            r0.end(false);
                        } else if (str.length() <= 50) {
                            r0.startReplaceGroup(-210336738);
                            textStyle = Strings.getTypography(r0).headlineSmall;
                            r0.end(false);
                        } else {
                            r0.startReplaceGroup(-210334659);
                            textStyle = Strings.getTypography(r0).sectionTitle;
                            r0.end(false);
                        }
                        TextStyle textStyle2 = textStyle;
                        Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(ImageKt.m177backgroundbw27NRU(companion, Strings.getColors(r0).base.constantBlack, RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(4.0f)), 12.0f);
                        FontWeight fontWeight = FontWeight.W400;
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4080, Strings.getColors(r0).base.constantWhite, (Composer) r0, m298padding3ABfNKs, TextStyle.m994copyp1EtxEg$default(textStyle2, 0L, 0L, FontWeight.Normal, null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777211), (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                        z2 = true;
                        r0.end(true);
                        r9 = 0;
                        r0.end(false);
                    }
                    r0.end(z2);
                    r0.end(z2);
                    if (offerPreview2 == null) {
                        r0.startReplaceGroup(1475233741);
                        r0.end(r9);
                        arrangement$End$1 = arrangement$End$12;
                        function1 = function12;
                        offerPreview = offerPreview2;
                        r4 = 1;
                        composer = r0;
                    } else {
                        r0.startReplaceGroup(1475233742);
                        MarketingMessageKt.DashedDividerWithCircles(null, r0, r9);
                        Modifier m300paddingVpY3zN4$default2 = SpacerKt.m300paddingVpY3zN4$default(SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(companion, 1.0f), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 24.0f, 7), 24.0f, RecyclerView.DECELERATION_RATE, 2);
                        RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), vertical, r0, 54);
                        int hashCode7 = Long.hashCode(r0.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope7 = r0.currentCompositionLocalScope();
                        Modifier materializeModifier7 = PlatformKt.materializeModifier(r0, m300paddingVpY3zN4$default2);
                        if (applier == null) {
                            Updater.invalidApplier();
                            throw null;
                        }
                        r0.startReusableNode();
                        if (r0.inserting) {
                            r0.createNode(layoutNode$Companion$Constructor$12);
                        } else {
                            r0.useNode();
                        }
                        Updater.m576setimpl(r0, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                        Updater.m576setimpl(r0, currentCompositionLocalScope7, composeUiNode$Companion$SetModifier$12);
                        Recorder$$ExternalSyntheticOutline2.m(hashCode7, (GapComposer) r0, composeUiNode$Companion$SetModifier$13, (GapComposer) r0, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        Updater.m576setimpl(r0, materializeModifier7, composeUiNode$Companion$SetModifier$14);
                        offerPreview = offerPreview2;
                        LocalImage localImage2 = offerPreview.icon;
                        if (localImage2 != null) {
                            r0.startReplaceGroup(-490617311);
                            Modifier clip3 = ClipKt.clip(SizeKt.m285size3ABfNKs(companion, 64.0f), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(12.0f));
                            Float ratio = LocalViewsKt.getRatio(localImage2);
                            if (ratio != null) {
                                r92 = 0;
                                companion2 = OffsetKt.aspectRatio(ratio.floatValue(), companion, false);
                            } else {
                                r92 = 0;
                                companion2 = companion;
                            }
                            LocalMapKt.LocalAsyncImage(clip3, companion2, LocalViewsKt.getThemedUrl(localImage2, r0), contentScale$Companion$Fit$12, null, null, MarketingMessageKt.lambda$184458969, r0, 1575936, 48);
                            r0.end(r92);
                            gapComposer = r0;
                            i2 = r92;
                        } else {
                            r0.startReplaceGroup(-490247884);
                            Trace.m1191Iconww6aTOc(Icons.DiscountTag24, (String) null, Request$Priority$EnumUnboxingLocalUtility.m(12.0f, ClipKt.clip(SizeKt.m285size3ABfNKs(companion, 64.0f), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(12.0f)), Strings.getColors(r0).semantic.background.inverse, 20.0f), Strings.getColors(r0).semantic.icon.inverse, (Composer) r0, 54, 0);
                            GapComposer gapComposer3 = r0;
                            i2 = 0;
                            gapComposer3.end(false);
                            gapComposer = gapComposer3;
                        }
                        LayoutWeightElement layoutWeightElement = new LayoutWeightElement(1.0f, true);
                        ColumnMeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement$Top$1, horizontal, gapComposer, i2);
                        int hashCode8 = Long.hashCode(gapComposer.compositeKeyHashCode);
                        PersistentCompositionLocalHashMap currentCompositionLocalScope8 = gapComposer.currentCompositionLocalScope();
                        Modifier materializeModifier8 = PlatformKt.materializeModifier(gapComposer, layoutWeightElement);
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
                        Updater.m576setimpl(gapComposer, columnMeasurePolicy4, composeUiNode$Companion$SetModifier$1);
                        Updater.m576setimpl(gapComposer, currentCompositionLocalScope8, composeUiNode$Companion$SetModifier$12);
                        Recorder$$ExternalSyntheticOutline2.m(hashCode8, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                        Updater.m576setimpl(gapComposer, materializeModifier8, composeUiNode$Companion$SetModifier$14);
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).labelSmall, (TextLineBalancing) null, offerPreview.title, (Map) null, (Function1) null, false);
                        MarketingMessageViewModel.OfferPreview.DiscountOffer discountOffer = offerPreview.discountOffer;
                        if (discountOffer == null) {
                            gapComposer.startReplaceGroup(-1802330644);
                            gapComposer.end(false);
                            arrangement$End$1 = arrangement$End$12;
                            function1 = function12;
                        } else {
                            gapComposer.startReplaceGroup(-1802330643);
                            arrangement$End$1 = arrangement$End$12;
                            RowMeasurePolicy rowMeasurePolicy2 = RowKt.rowMeasurePolicy(arrangement$End$1, Alignment.Companion.Top, gapComposer, 0);
                            int hashCode9 = Long.hashCode(gapComposer.compositeKeyHashCode);
                            PersistentCompositionLocalHashMap currentCompositionLocalScope9 = gapComposer.currentCompositionLocalScope();
                            Modifier materializeModifier9 = PlatformKt.materializeModifier(gapComposer, companion);
                            if (applier == null) {
                                Updater.invalidApplier();
                                throw null;
                            }
                            gapComposer.startReusableNode();
                            function1 = function12;
                            if (gapComposer.inserting) {
                                gapComposer.createNode(layoutNode$Companion$Constructor$12);
                            } else {
                                gapComposer.useNode();
                            }
                            Updater.m576setimpl(gapComposer, rowMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                            Updater.m576setimpl(gapComposer, currentCompositionLocalScope9, composeUiNode$Companion$SetModifier$12);
                            Recorder$$ExternalSyntheticOutline2.m(hashCode9, gapComposer, composeUiNode$Companion$SetModifier$13, gapComposer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                            Updater.m576setimpl(gapComposer, materializeModifier9, composeUiNode$Companion$SetModifier$14);
                            GapComposer gapComposer4 = gapComposer;
                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer4, (Modifier) null, Strings.getTypography(gapComposer).labelSmall, (TextLineBalancing) null, discountOffer.newAmount, (Map) null, (Function1) null, false);
                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.standard, (Composer) gapComposer4, (Modifier) null, Strings.getTypography(gapComposer).labelSmall, (TextLineBalancing) null, Room.stringResource(gapComposer, R.string.local_views_separator_dot), (Map) null, (Function1) null, false);
                            Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer4, (Modifier) null, TextStyle.m994copyp1EtxEg$default(Strings.getTypography(gapComposer).bodySmall, 0L, 0L, null, null, 0L, null, 0L, TextDecoration.LineThrough, null, null, 0, 0L, null, null, 0, 16773119), (TextLineBalancing) null, discountOffer.originalAmount, (Map) null, (Function1) null, false);
                            gapComposer.end(true);
                            gapComposer.end(false);
                        }
                        Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer).semantic.text.subtle, (Composer) gapComposer, (Modifier) null, Strings.getTypography(gapComposer).bodySmall, (TextLineBalancing) null, offerPreview.validity, (Map) null, (Function1) null, false);
                        r4 = 1;
                        Boxes$$ExternalSyntheticOutline1.m(gapComposer, true, true, false);
                        composer = gapComposer;
                    }
                    composer.end(r4);
                    Modifier m300paddingVpY3zN4$default3 = SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion, 1.0f), RecyclerView.DECELERATION_RATE, 24.0f, r4);
                    RowMeasurePolicy rowMeasurePolicy3 = RowKt.rowMeasurePolicy(arrangement$End$1, vertical, composer, 48);
                    int hashCode10 = Long.hashCode(composer.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope10 = composer.currentCompositionLocalScope();
                    Modifier materializeModifier10 = PlatformKt.materializeModifier(composer, m300paddingVpY3zN4$default3);
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    composer.startReusableNode();
                    if (composer.inserting) {
                        composer.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        composer.useNode();
                    }
                    Updater.m576setimpl(composer, rowMeasurePolicy3, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(composer, currentCompositionLocalScope10, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode10, (GapComposer) composer, composeUiNode$Companion$SetModifier$13, (GapComposer) composer, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(composer, materializeModifier10, composeUiNode$Companion$SetModifier$14);
                    if (offerPreview != null) {
                        composer.startReplaceGroup(1923394117);
                        Modifier alpha = AlphaKt.alpha(companion, RecyclerView.DECELERATION_RATE);
                        Object rememberedValue3 = composer.rememberedValue();
                        neverEqualPolicy = neverEqualPolicy3;
                        Object obj8 = rememberedValue3;
                        if (rememberedValue3 == neverEqualPolicy) {
                            b$$ExternalSyntheticLambda3 b__externalsyntheticlambda3 = new b$$ExternalSyntheticLambda3(2);
                            composer.updateRememberedValue(b__externalsyntheticlambda3);
                            obj8 = b__externalsyntheticlambda3;
                        }
                        MenuKt.IconButton((Function0) obj8, alpha, false, null, null, MarketingMessageKt.lambda$1307612932, composer, 1573302, 56);
                        composer.end(false);
                    } else {
                        neverEqualPolicy = neverEqualPolicy3;
                        composer.startReplaceGroup(1923698103);
                        composer.end(false);
                    }
                    RowScopeInstance rowScopeInstance = RowScopeInstance.INSTANCE;
                    SpacerKt.Spacer(composer, rowScopeInstance.weight(1.0f, companion, true));
                    ButtonProminence buttonProminence = ButtonProminence.STANDARD;
                    boolean z3 = !(offerPreview != null && offerPreview.isRedeemed);
                    Function1 function13 = function1;
                    boolean changed = composer.changed(function13);
                    Object rememberedValue4 = composer.rememberedValue();
                    Object obj9 = rememberedValue4;
                    if (changed || rememberedValue4 == neverEqualPolicy) {
                        BrandSheetViewKt$$ExternalSyntheticLambda0 brandSheetViewKt$$ExternalSyntheticLambda0 = new BrandSheetViewKt$$ExternalSyntheticLambda0(5, function13);
                        composer.updateRememberedValue(brandSheetViewKt$$ExternalSyntheticLambda0);
                        obj9 = brandSheetViewKt$$ExternalSyntheticLambda0;
                    }
                    MarketingMessageViewModel marketingMessageViewModel3 = marketingMessageViewModel;
                    coil3.size.SizeKt.ButtonCta((Function0) obj9, companion, buttonProminence, false, z3, null, Expect_jvmKt.rememberComposableLambda(-937761488, new SliderDefaults$$ExternalSyntheticLambda3(marketingMessageViewModel3, 25), composer), composer, 1573296, 40);
                    SpacerKt.Spacer(composer, rowScopeInstance.weight(1.0f, companion, true));
                    if (offerPreview != null) {
                        composer.startReplaceGroup(1924561453);
                        boolean changed2 = composer.changed(function13);
                        Object rememberedValue5 = composer.rememberedValue();
                        if (changed2 || rememberedValue5 == neverEqualPolicy) {
                            mutableState = mutableState3;
                            CashtagViewKt$$ExternalSyntheticLambda13 cashtagViewKt$$ExternalSyntheticLambda13 = new CashtagViewKt$$ExternalSyntheticLambda13(function13, mutableState, 2);
                            composer.updateRememberedValue(cashtagViewKt$$ExternalSyntheticLambda13);
                            obj3 = cashtagViewKt$$ExternalSyntheticLambda13;
                        } else {
                            mutableState = mutableState3;
                            obj3 = rememberedValue5;
                        }
                        MenuKt.IconButton((Function0) obj3, null, false, null, null, MarketingMessageKt.f54lambda$1566898821, composer, 1572864, 62);
                        composer.end(false);
                    } else {
                        mutableState = mutableState3;
                        composer.startReplaceGroup(1924970839);
                        composer.end(false);
                    }
                    composer.end(true);
                    composer.end(true);
                    if (!((Boolean) mutableState.getValue()).booleanValue() || offerPreview == null) {
                        composer.startReplaceGroup(484785873);
                        composer.end(false);
                    } else {
                        composer.startReplaceGroup(484261167);
                        Object rememberedValue6 = composer.rememberedValue();
                        Object obj10 = rememberedValue6;
                        if (rememberedValue6 == neverEqualPolicy) {
                            TabContentViewKt$$ExternalSyntheticLambda1 tabContentViewKt$$ExternalSyntheticLambda1 = new TabContentViewKt$$ExternalSyntheticLambda1(i4, mutableState);
                            composer.updateRememberedValue(tabContentViewKt$$ExternalSyntheticLambda1);
                            obj10 = tabContentViewKt$$ExternalSyntheticLambda1;
                        }
                        SheetKt.Sheet((Function0) obj10, null, null, null, null, false, null, Expect_jvmKt.rememberComposableLambda(320573461, new ComposeDialogKt$$ExternalSyntheticLambda12(offerPreview, marketingMessageViewModel3, function13, mutableState, 9), composer), composer, 100663302, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
                        composer.end(false);
                    }
                } else {
                    r0.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                MarketingMessageKt.MarketingMessageTile((Modifier) obj4, (MarketingMessagesViewModel.MessageTile) obj7, (Function0) obj6, (Function0) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                SendChannel.DefaultImpls.MarkdownCheckBox((String) obj4, (ASTNodeImpl) obj7, (TextStyle) obj6, (Function4) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 6:
                Function1 function14 = (Function1) obj7;
                String str2 = (String) obj6;
                String str3 = (String) obj5;
                String str4 = (String) obj2;
                ((String) obj).getClass();
                str4.getClass();
                if (Intrinsics.areEqual(str4, (String) obj4)) {
                    function14.invoke(AccountViewEvent.PrivacyNoticeClick.INSTANCE);
                } else if (Intrinsics.areEqual(str4, str2)) {
                    function14.invoke(AccountViewEvent.TermsOfServiceClick.INSTANCE);
                } else if (Intrinsics.areEqual(str4, str3)) {
                    function14.invoke(AccountViewEvent.OpenSourceSoftwareClick.INSTANCE);
                }
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                AccountToDoKt.PreviewProfileHeader((AccountAvatarViewModel) obj4, (String) obj7, (String) obj6, (ProfileHeaderViewModel) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 8:
                ((Integer) obj2).getClass();
                ThemeSwitcherViewKt.CircularRevealAnimation((Modifier) obj4, (Animatable) obj7, (Animatable) obj6, (Animatable) obj5, (Composer) obj, Updater.updateChangedFlags(4679));
                return Unit.INSTANCE;
            case 9:
                Modifier modifier3 = (Modifier) obj4;
                ThemeData themeData = (ThemeData) obj7;
                MainPaymentPadViewModel mainPaymentPadViewModel = (MainPaymentPadViewModel) obj6;
                Function1 function15 = (Function1) obj5;
                Composer composer4 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer4;
                if (gapComposer5.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    ThemeSwitcherViewKt.ThemeSelection(modifier3, themeData.buttonText, mainPaymentPadViewModel, function15, gapComposer5, 0);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                ((Integer) obj2).getClass();
                BadgeTitleKt.IconHeaderView((Modifier) obj4, (String) obj7, (String) obj6, (MooncakeLargeIcon.Icon) obj5, (Composer) obj, Updater.updateChangedFlags(3073));
                return Unit.INSTANCE;
            case 11:
                ActivityTabViewModel activityTabViewModel = (ActivityTabViewModel) obj4;
                Function1 function16 = (Function1) obj7;
                LazyListState lazyListState = (LazyListState) obj6;
                RealScrollPerformanceTrackerFactory realScrollPerformanceTrackerFactory = (RealScrollPerformanceTrackerFactory) obj5;
                Composer composer5 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer5;
                if (gapComposer6.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    ActivityTabViewKt.ActivityFeed(SizeKt.fillMaxSize(companion3, 1.0f), activityTabViewModel, function16, lazyListState, realScrollPerformanceTrackerFactory, gapComposer6, 6);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                ((Integer) obj2).getClass();
                ((FamilyAppletTile) obj4).CreditStateTile((AfterpayAppletTileViewModel.Installed.CreditState) obj7, (AppletTile.AppletTileAppearance) obj6, (TaxesAppletViewsModule$$ExternalSyntheticLambda1) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 13:
                ((Integer) obj2).getClass();
                ((FamilyAppletTile) obj4).V3InstalledContent((AfterpayAppletTileViewModel.Installed.V3Installed) obj7, (AppletTile.AppletTileAppearance) obj6, (TaxesAppletViewsModule$$ExternalSyntheticLambda1) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 14:
                ((Integer) obj2).getClass();
                ((FamilyAppletTile) obj4).CreditBreakdownTile((AfterpayAppletTileViewModel.Installed.CreditBreakdown) obj7, (AppletTile.AppletTileAppearance) obj6, (TaxesAppletViewsModule$$ExternalSyntheticLambda1) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 15:
                ((Integer) obj2).getClass();
                ((FamilyAppletTile) obj4).CreditDetailsTile((AfterpayAppletTileViewModel.Installed.CreditDetails) obj7, (AppletTile.AppletTileAppearance) obj6, (TaxesAppletViewsModule$$ExternalSyntheticLambda1) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 16:
                ((Integer) obj2).getClass();
                ((FamilyAppletTile) obj4).DefaultStateTile((AfterpayAppletTileViewModel.Installed.DefaultState) obj7, (AppletTile.AppletTileAppearance) obj6, (TaxesAppletViewsModule$$ExternalSyntheticLambda1) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 17:
                ((Integer) obj2).getClass();
                ((FamilyAppletTile) obj4).UninstalledUI((AfterpayAppletTileViewModel.Uninstalled) obj7, (AppletTile.AppletTileAppearance) obj6, (TaxesAppletViewsModule$$ExternalSyntheticLambda1) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 18:
                ((Integer) obj2).getClass();
                AfterpaySearchViewKt.AfterpayAppletNotificationOverlay((String) obj4, (String) obj7, (Long) obj5, (Function0) obj6, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 19:
                AfterpayAppletPurchasesEmbeddedViewModel.Default r15 = (AfterpayAppletPurchasesEmbeddedViewModel.Default) obj4;
                Function1 function17 = (Function1) obj7;
                AfterpayAppletPurchasesEmbeddedViewModel.EmbeddedActivitySection embeddedActivitySection = (AfterpayAppletPurchasesEmbeddedViewModel.EmbeddedActivitySection) obj6;
                AfterpayAppletPurchasesEmbeddedViewModel.EmbeddedActivitySection embeddedActivitySection2 = (AfterpayAppletPurchasesEmbeddedViewModel.EmbeddedActivitySection) obj5;
                Composer composer6 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer6;
                boolean shouldExecute2 = gapComposer7.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2);
                Applier applier2 = gapComposer7.applier;
                if (shouldExecute2) {
                    Modifier fillMaxSize = SizeKt.fillMaxSize(companion3, 1.0f);
                    Colors colors2 = (Colors) gapComposer7.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer7, -1762997026, gapComposer7, false);
                    } else {
                        gapComposer7.startReplaceGroup(-1762997739);
                        gapComposer7.end(false);
                    }
                    Modifier statusBarsPadding = SpacerKt.statusBarsPadding(SpacerKt.navigationBarsPadding(ImageKt.m177backgroundbw27NRU(fillMaxSize, colors2.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1)));
                    Arrangement$Top$1 arrangement$Top$12 = SpacerKt.Top;
                    BiasAlignment.Horizontal horizontal2 = Alignment.Companion.Start;
                    ColumnMeasurePolicy columnMeasurePolicy5 = ColumnKt.columnMeasurePolicy(arrangement$Top$12, horizontal2, gapComposer7, 0);
                    int hashCode11 = Long.hashCode(gapComposer7.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope11 = gapComposer7.currentCompositionLocalScope();
                    Modifier materializeModifier11 = PlatformKt.materializeModifier(gapComposer7, statusBarsPadding);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                    if (applier2 == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer7.startReusableNode();
                    if (gapComposer7.inserting) {
                        gapComposer7.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer7.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$15 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer7, columnMeasurePolicy5, composeUiNode$Companion$SetModifier$15);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$16 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer7, currentCompositionLocalScope11, composeUiNode$Companion$SetModifier$16);
                    Integer valueOf2 = Integer.valueOf(hashCode11);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$17 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer7, valueOf2, composeUiNode$Companion$SetModifier$17);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$12 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer7, ownerSnapshotObserver$onCommitAffectingLayout$12);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$18 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer7, materializeModifier11, composeUiNode$Companion$SetModifier$18);
                    AfterpaySearchViewKt.PurchasesToolbar(r15.toolbarTitle, function17, gapComposer7, 0);
                    Modifier verticalScroll$default = ImageKt.verticalScroll$default(new LayoutWeightElement(1.0f, true), ImageKt.rememberScrollState(gapComposer7), false, 14);
                    ColumnMeasurePolicy columnMeasurePolicy6 = ColumnKt.columnMeasurePolicy(arrangement$Top$12, horizontal2, gapComposer7, 0);
                    int hashCode12 = Long.hashCode(gapComposer7.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope12 = gapComposer7.currentCompositionLocalScope();
                    Modifier materializeModifier12 = PlatformKt.materializeModifier(gapComposer7, verticalScroll$default);
                    gapComposer7.startReusableNode();
                    if (gapComposer7.inserting) {
                        gapComposer7.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer7.useNode();
                    }
                    Updater.m576setimpl(gapComposer7, columnMeasurePolicy6, composeUiNode$Companion$SetModifier$15);
                    Updater.m576setimpl(gapComposer7, currentCompositionLocalScope12, composeUiNode$Companion$SetModifier$16);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode12, gapComposer7, composeUiNode$Companion$SetModifier$17, gapComposer7, ownerSnapshotObserver$onCommitAffectingLayout$12);
                    Updater.m576setimpl(gapComposer7, materializeModifier12, composeUiNode$Companion$SetModifier$18);
                    DBUtil.SpacerWithinSectionMedium(0, 1, gapComposer7, null);
                    AfterpayAppletPurchasesEmbeddedViewModel.TotalOwedSection totalOwedSection = r15.totalOwedSection;
                    if (totalOwedSection == null) {
                        gapComposer7.startReplaceGroup(-410174781);
                        gapComposer7.end(false);
                    } else {
                        gapComposer7.startReplaceGroup(-410174780);
                        AfterpaySearchViewKt.PurchasesTotalOwedSection(totalOwedSection, gapComposer7, 0);
                        DBUtil.SpacerBetweenSectionXLarge(0, 1, gapComposer7, null);
                        gapComposer7.end(false);
                    }
                    ActivityEmbeddedViewModel activityEmbeddedViewModel = embeddedActivitySection.activitiesViewModel;
                    boolean changed3 = gapComposer7.changed(function17);
                    Object rememberedValue7 = gapComposer7.rememberedValue();
                    if (!changed3) {
                        neverEqualPolicy2 = neverEqualPolicy3;
                        break;
                    } else {
                        neverEqualPolicy2 = neverEqualPolicy3;
                    }
                    rememberedValue7 = new UtilsKt$$ExternalSyntheticLambda1(19, function17);
                    gapComposer7.updateRememberedValue(rememberedValue7);
                    int i5 = 20;
                    AvatarsKt.ActivityEmbeddedView(activityEmbeddedViewModel, (Function1) rememberedValue7, null, Expect_jvmKt.rememberComposableLambda(-649699881, new BrandSheetViewKt$$ExternalSyntheticLambda1(i5, (Object) embeddedActivitySection, function17), gapComposer7), null, null, gapComposer7, 3072, 500);
                    ActivityEmbeddedViewModel activityEmbeddedViewModel2 = embeddedActivitySection2.activitiesViewModel;
                    boolean changed4 = gapComposer7.changed(function17);
                    Object rememberedValue8 = gapComposer7.rememberedValue();
                    if (changed4 || rememberedValue8 == neverEqualPolicy2) {
                        rememberedValue8 = new UtilsKt$$ExternalSyntheticLambda1(i5, function17);
                        gapComposer7.updateRememberedValue(rememberedValue8);
                    }
                    AvatarsKt.ActivityEmbeddedView(activityEmbeddedViewModel2, (Function1) rememberedValue8, null, Expect_jvmKt.rememberComposableLambda(-1626872512, new LocalViewFactory$$ExternalSyntheticLambda6(embeddedActivitySection, function17, embeddedActivitySection2, i5), gapComposer7), null, null, gapComposer7, 3072, 500);
                    FooterSection footerSection = r15.footer;
                    if (footerSection == null) {
                        gapComposer7.startReplaceGroup(-407435807);
                        gapComposer7.end(false);
                    } else {
                        gapComposer7.startReplaceGroup(-407435806);
                        DBUtil.SpacerBetweenSectionXLarge(0, 1, gapComposer7, null);
                        boolean changed5 = gapComposer7.changed(function17);
                        Object rememberedValue9 = gapComposer7.rememberedValue();
                        if (changed5 || rememberedValue9 == neverEqualPolicy2) {
                            rememberedValue9 = new SwipeToDismissKt$$ExternalSyntheticLambda4(18, function17);
                            gapComposer7.updateRememberedValue(rememberedValue9);
                        }
                        AfterpaySearchViewKt.AfterpayAppletFooter(footerSection, (Function2) rememberedValue9, gapComposer7, 0);
                        gapComposer7.end(false);
                    }
                    gapComposer7.end(true);
                    gapComposer7.end(true);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                ((Integer) obj2).getClass();
                AfterpayCardKt.AfterpayHeroUpsellSection((Modifier) obj4, (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.AfterpayHeroUpsell) obj7, (Function1) obj5, (Function0) obj6, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 21:
                return invoke$com$squareup$cash$afterpayapplet$views$homesection$v3$PrepurchaseToggleSectionKt$$ExternalSyntheticLambda6(obj, obj2);
            case 22:
                ((Integer) obj2).getClass();
                AnalyticsMappersKt.AfterpayAppletUpsellCard((AfterpayAppletUpsellCardViewModel) obj7, (Modifier) obj4, (Function0) obj6, (Function0) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 23:
                ((Integer) obj2).getClass();
                SavingsAction.Action.AfterpayCategoriesSection((Modifier) obj4, (AfterpaySearchViewModel.CategoryTilesSectionViewModel) obj7, (LazyGridState) obj6, (Function1) obj5, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 24:
                ((Integer) obj2).getClass();
                Threads.InlineAppMessageV2((MutableTransitionState) obj7, (InlineAppMessageV2ViewModel.Ready) obj6, (Function1) obj5, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 25:
                ((Integer) obj2).getClass();
                ((BinaryBitmap) obj7).Content((Modifier) obj4, (String) obj6, (BetterNavigator.ScreenNavigator) obj5, (Composer) obj, Updater.updateChangedFlags(7));
                return Unit.INSTANCE;
            case 26:
                return invoke$com$squareup$cash$arcade$bindings$component$ArcadeComponentProtoBindingKt$$ExternalSyntheticLambda0(obj, obj2);
            case 27:
                return invoke$com$squareup$cash$arcade$components$internal$TooltipKt$$ExternalSyntheticLambda1(obj, obj2);
            case 28:
                return invoke$com$squareup$cash$arcade$components$list$ListOrderedKt$$ExternalSyntheticLambda17(obj, obj2);
            default:
                ((Integer) obj2).getClass();
                BitcoinTradeButtonsWidgetViewKt.TextButton((String) obj7, (Function0) obj6, (Function1) obj5, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(385));
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ DismissableToastKt$$ExternalSyntheticLambda4(Modifier modifier, Object obj, Object obj2, Object obj3, int i, int i2) {
        this.$r8$classId = i2;
        this.f$1 = obj;
        this.f$0 = modifier;
        this.f$2 = obj2;
        this.f$3 = obj3;
    }

    public /* synthetic */ DismissableToastKt$$ExternalSyntheticLambda4(int i, int i2, Object obj, Object obj2, Object obj3, Function0 function0) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$3 = obj3;
        this.f$2 = function0;
    }

    public /* synthetic */ DismissableToastKt$$ExternalSyntheticLambda4(Object obj, int i, Object obj2, Object obj3, Object obj4, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
    }

    public /* synthetic */ DismissableToastKt$$ExternalSyntheticLambda4(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
    }

    public /* synthetic */ DismissableToastKt$$ExternalSyntheticLambda4(Object obj, Object obj2, Function function, Modifier modifier, int i, int i2) {
        this.$r8$classId = i2;
        this.f$1 = obj;
        this.f$2 = obj2;
        this.f$3 = function;
        this.f$0 = modifier;
    }

    public /* synthetic */ DismissableToastKt$$ExternalSyntheticLambda4(ArcadeComponent arcadeComponent, Function1 function1, Modifier modifier, Color color, int i) {
        this.$r8$classId = 26;
        this.f$1 = arcadeComponent;
        this.f$2 = function1;
        this.f$0 = modifier;
        this.f$3 = color;
    }
}
