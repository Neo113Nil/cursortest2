package androidx.compose.foundation.pager;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.GestureNodeKt$$ExternalSyntheticLambda0;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.contextmenu.ContextMenuColors;
import androidx.compose.foundation.contextmenu.ContextMenuScope;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.Arrangement$Top$1;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScopeInstance;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.layout.PaddingValuesImpl;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyDslKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.lazy.grid.LazyGridItemScopeImpl;
import androidx.compose.foundation.text.TextFieldPointerModifier_commonKt$$ExternalSyntheticLambda1;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.material.DrawerKt$$ExternalSyntheticLambda1;
import androidx.compose.material.MenuKt$$ExternalSyntheticLambda1;
import androidx.compose.material.SwipeToDismissKt$$ExternalSyntheticLambda4;
import androidx.compose.runtime.Applier;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.ParcelableSnapshotMutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.AlphaKt;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.input.pointer.SuspendingPointerInputFilterKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.layout.ContentScale$Companion$Fit$1;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.ComposeUiNode$Companion$SetModifier$1;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.node.OwnerSnapshotObserver$onCommitAffectingLayout$1;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.unit.Density;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.media3.muxer.Boxes$$ExternalSyntheticOutline1;
import androidx.navigation.Navigator$$ExternalSyntheticLambda0;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import androidx.work.impl.utils.StatusRunnable$$ExternalSyntheticLambda1;
import app.cash.badging.backend.RealBadger2$$ExternalSyntheticLambda0;
import app.cash.local.primitives.MenuHours;
import app.cash.local.viewmodels.AppliedCouponBanner;
import app.cash.local.viewmodels.CardManagementSheetModel;
import app.cash.local.viewmodels.InputError;
import app.cash.local.viewmodels.LocalAddBrandsViewModel;
import app.cash.local.viewmodels.LocalBrandLocationCheckoutViewModel;
import app.cash.local.viewmodels.LocalBrandLocationMenuViewModel;
import app.cash.local.viewmodels.LocalBrandProfileViewModel;
import app.cash.local.viewmodels.LocalCashBalanceViewModel;
import app.cash.local.viewmodels.LocalCheckoutGiftCardSectionViewModel;
import app.cash.local.viewmodels.LocalCheckoutPaymentSectionViewModel;
import app.cash.local.viewmodels.LocalEditorialContent;
import app.cash.local.viewmodels.LocalMenuItemDetailsViewModel;
import app.cash.local.viewmodels.LocalOrderStatusViewModel;
import app.cash.local.viewmodels.LocationStatus;
import app.cash.local.viewmodels.OrderBuilderModel;
import app.cash.local.viewmodels.instore.TableQrCodeScannerViewModel;
import app.cash.local.viewmodels.internal.MenuSelectorOption;
import app.cash.local.viewmodels.marketingmessages.MarketingMessageViewModel;
import app.cash.local.viewmodels.marketingmessages.MarketingMessagesViewModel;
import app.cash.local.viewmodels.pos.LocalPosBrandOnboardingViewModel;
import app.cash.local.viewmodels.pos.LocalPosCheckInViewModel;
import app.cash.local.viewmodels.pos.LocalPosLocalCashRedemptionViewModel;
import app.cash.local.viewmodels.sheet.MapDecisionSheetModel;
import app.cash.local.views.brand.checkout.CheckoutExpandableReviewRowKt;
import app.cash.local.views.brand.checkout.CheckoutTipSectionKt;
import app.cash.local.views.brand.checkout.LocalBrandLocationCheckoutViewKt;
import app.cash.local.views.brand.menu.LocalCaloriesTextKt;
import app.cash.local.views.brand.orders.BrandPinsKt;
import app.cash.local.views.brand.profile.FulfillmentRowSecondaryLine;
import app.cash.local.views.brand.profile.LocalBrandLocationRowKt;
import app.cash.local.views.cart.LocalBrandLocationCartViewKt;
import app.cash.local.views.cart.LocalBrandLocationCartViewKt$$ExternalSyntheticLambda1;
import app.cash.local.views.composeuiview.LocalAddBrandsViewKt;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda28;
import app.cash.local.views.internal.LocalMapKt;
import app.cash.local.views.internal.LocalViewsKt;
import app.cash.local.views.internal.menus.LocalMenuHoursViewKt;
import app.cash.local.views.marketingmessages.MarketingMessageKt;
import app.cash.local.views.pos.LocalPosBrandOnboardingViewKt$$ExternalSyntheticLambda1;
import app.cash.local.views.pos.LocalPosCheckInViewKt$$ExternalSyntheticLambda1;
import app.cash.local.views.pos.LocalPosLocalCashRedemptionViewKt$$ExternalSyntheticLambda1;
import app.cash.local.views.wallet.LocalHomeViewKt$$ExternalSyntheticLambda1;
import app.cash.molecule.PlatformKt;
import bo.app.n$$ExternalSyntheticLambda0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import com.google.android.gms.internal.mlkit_genai_prompt.zzaco;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.ColorsDarkKt;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.borrow.views.BorrowHomeOverlayKt$BorrowHomeOverlay$1$1$3;
import com.squareup.cash.collapsingtoolbar.views.CollapsingToolbarScaffoldScopeInstance;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackState;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda13;
import com.squareup.cash.wallet.views.CoreInteractiveCardKt$InteractiveCardEffect$16$6$1$1;
import com.squareup.protos.cash.local.client.v1.GetNeighborhoodsTabContentResponse;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.util.Strings;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.text.StringsKt;
import kotlinx.coroutines.CoroutineScope;

/* loaded from: classes3.dex */
public final /* synthetic */ class PagerDefaults$$ExternalSyntheticLambda0 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ PagerDefaults$$ExternalSyntheticLambda0(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    private final Object invoke$app$cash$local$views$brand$profile$LocalBrandProfileViewKt$$ExternalSyntheticLambda11(Object obj, Object obj2, Object obj3) {
        Modifier wrapContentHeight;
        long j;
        FulfillmentRowSecondaryLine fulfillmentRowSecondaryLine = (FulfillmentRowSecondaryLine) this.f$0;
        LocationStatus locationStatus = (LocationStatus) this.f$1;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((AdaptiveStackScope) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            String str = fulfillmentRowSecondaryLine.subtitle;
            if (str == null) {
                gapComposer.startReplaceGroup(-1229595693);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1229595692);
                String concat = str.concat(fulfillmentRowSecondaryLine.separator);
                TextStyle textStyle = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
                Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors.semantic.text.subtle, (Composer) gapComposer, (Modifier) null, textStyle, (TextLineBalancing) null, concat, (Map) null, (Function1) null, false);
                gapComposer.end(false);
            }
            String str2 = fulfillmentRowSecondaryLine.locationStatusLabel;
            if (str2 == null) {
                gapComposer.startReplaceGroup(-1229321808);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-1229321807);
                wrapContentHeight = SizeKt.wrapContentHeight(Modifier.Companion.$$INSTANCE, Alignment.Companion.CenterVertically, (r2 & 2) == 0);
                if ((locationStatus instanceof LocationStatus.Unknown) || (locationStatus instanceof LocationStatus.Open)) {
                    gapComposer.startReplaceGroup(1741242174);
                    Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    j = colors2.semantic.text.success;
                    gapComposer.end(false);
                } else {
                    if (!(locationStatus instanceof LocationStatus.Closed) && !(locationStatus instanceof LocationStatus.TemporarilyDisabled)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, 1741238711, false);
                    }
                    gapComposer.startReplaceGroup(1741245854);
                    Colors colors3 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    j = colors3.semantic.text.warning;
                    gapComposer.end(false);
                }
                Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, j, (Composer) gapComposer, wrapContentHeight, ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodySmall, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                gapComposer.end(false);
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$app$cash$local$views$cart$LocalBrandLocationCartViewKt$$ExternalSyntheticLambda10(Object obj, Object obj2, Object obj3) {
        AppliedCouponBanner appliedCouponBanner = (AppliedCouponBanner) this.f$0;
        Function1 function1 = (Function1) this.f$1;
        LazyItemScopeImpl lazyItemScopeImpl = (LazyItemScopeImpl) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        lazyItemScopeImpl.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(lazyItemScopeImpl) ? 4 : 2;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(LazyItemScopeImpl.animateItem$default(lazyItemScopeImpl, Modifier.Companion.$$INSTANCE), RecyclerView.DECELERATION_RATE, 8.0f, 1);
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new LocalBrandLocationCartViewKt$$ExternalSyntheticLambda1(22, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            LocalBrandLocationCartViewKt.AppliedCouponBannerView(appliedCouponBanner, (Function0) rememberedValue, m300paddingVpY3zN4$default, gapComposer, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [androidx.compose.ui.Modifier] */
    private final Object invoke$app$cash$local$views$composeuiview$CardManagementSheetKt$$ExternalSyntheticLambda4(Object obj, Object obj2, Object obj3) {
        Modifier.Companion companion;
        int i;
        GapComposer gapComposer;
        CardManagementSheetModel.Card card = (CardManagementSheetModel.Card) this.f$0;
        AdaptiveStackState adaptiveStackState = (AdaptiveStackState) this.f$1;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((AdaptiveStackScope) obj).getClass();
        GapComposer gapComposer2 = (GapComposer) composer;
        if (gapComposer2.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(SpacerKt.Start, Alignment.Companion.Top, gapComposer2, 0);
            int hashCode = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer2.currentCompositionLocalScope();
            Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
            Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer2, companion2);
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
            Updater.m576setimpl(gapComposer2, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
            Updater.m576setimpl(gapComposer2, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
            Updater.m576setimpl(gapComposer2, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
            Updater.m575reconcileimpl(gapComposer2, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
            Updater.m576setimpl(gapComposer2, materializeModifier, ComposeUiNode.Companion.SetModifier);
            String str = card.primaryText;
            String str2 = card.secondaryText;
            if (str == null) {
                gapComposer2.startReplaceGroup(-305184344);
                gapComposer2.end(false);
                companion = companion2;
                gapComposer = gapComposer2;
                i = -1762997026;
            } else {
                gapComposer2.startReplaceGroup(-305184343);
                TextStyle textStyle = ((Typography) gapComposer2.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
                Colors colors = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                } else {
                    gapComposer2.startReplaceGroup(-1762997739);
                    gapComposer2.end(false);
                }
                companion = companion2;
                i = -1762997026;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors.semantic.text.standard, (Composer) gapComposer2, (Modifier) null, textStyle, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                gapComposer = gapComposer2;
                gapComposer.end(false);
            }
            String str3 = card.primaryText;
            if (str3 == null || StringsKt.isBlank(str3) || str2 == null || StringsKt.isBlank(str2)) {
                gapComposer.startReplaceGroup(-304509566);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(-304856921);
                Modifier.Companion alpha = ((AdaptiveStackState.MeasuredOrientation) adaptiveStackState.lastMeasuredOrientation$delegate.getValue()) == AdaptiveStackState.MeasuredOrientation.Vertical ? AlphaKt.alpha(companion, RecyclerView.DECELERATION_RATE) : companion;
                TextStyle textStyle2 = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
                Colors colors2 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors2 == null) {
                    colors2 = re$$ExternalSyntheticOutline0.m(gapComposer, i, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                GapComposer gapComposer3 = gapComposer;
                Room.m1165Text25TpFw(0, 0, 0, 0, 6, 0, 4080, colors2.semantic.text.standard, (Composer) gapComposer3, (Modifier) alpha, textStyle2, (TextLineBalancing) null, " · ", (Map) null, (Function1) null, false);
                gapComposer = gapComposer3;
                gapComposer.end(false);
            }
            gapComposer.end(true);
            if (str2 == null) {
                gapComposer.startReplaceGroup(1728556338);
                gapComposer.end(false);
            } else {
                gapComposer.startReplaceGroup(1728556339);
                TextStyle textStyle3 = ((Typography) gapComposer.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
                Colors colors3 = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                if (colors3 == null) {
                    colors3 = re$$ExternalSyntheticOutline0.m(gapComposer, i, gapComposer, false);
                } else {
                    gapComposer.startReplaceGroup(-1762997739);
                    gapComposer.end(false);
                }
                GapComposer gapComposer4 = gapComposer;
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors3.semantic.text.subtle, (Composer) gapComposer4, (Modifier) null, textStyle3, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                gapComposer4.end(false);
            }
        } else {
            gapComposer2.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$app$cash$local$views$composeuiview$LocalAddBrandsViewKt$$ExternalSyntheticLambda8(Object obj, Object obj2, Object obj3) {
        LocalAddBrandsViewModel.BrandCard brandCard = (LocalAddBrandsViewModel.BrandCard) this.f$0;
        Function1 function1 = (Function1) this.f$1;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        ((LazyGridItemScopeImpl) obj).getClass();
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
            boolean changed = gapComposer.changed(function1) | gapComposer.changedInstance(brandCard);
            Object rememberedValue = gapComposer.rememberedValue();
            NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy) {
                rememberedValue = new n$$ExternalSyntheticLambda0(3, function1, brandCard);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function0 function0 = (Function0) rememberedValue;
            boolean changed2 = gapComposer.changed(function1) | gapComposer.changedInstance(brandCard);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue2 == neverEqualPolicy) {
                rememberedValue2 = new RealBadger2$$ExternalSyntheticLambda0(20, function1, brandCard);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            LocalAddBrandsViewKt.BrandCardGridItem(brandCard, function0, (Function1) rememberedValue2, gapComposer, 0);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v22, types: [androidx.compose.ui.Modifier] */
    /* JADX WARN: Type inference failed for: r1v12 */
    /* JADX WARN: Type inference failed for: r1v23 */
    /* JADX WARN: Type inference failed for: r1v6, types: [androidx.compose.runtime.GapComposer] */
    /* JADX WARN: Type inference failed for: r2v13, types: [int] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r2v21 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r3v15 */
    /* JADX WARN: Type inference failed for: r3v17, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v22 */
    /* JADX WARN: Type inference failed for: r9v2, types: [androidx.compose.runtime.GapComposer] */
    private final Object invoke$app$cash$local$views$composeuiview$LocalCashBalanceComposeUiKt$$ExternalSyntheticLambda2(Object obj, Object obj2, Object obj3) {
        String str;
        NeverEqualPolicy neverEqualPolicy;
        boolean z;
        ?? r3;
        ?? r2;
        ?? r1;
        Arrangement$Top$1 arrangement$Top$1;
        Modifier.Companion companion;
        BiasAlignment.Horizontal horizontal;
        ?? r22;
        float f;
        Modifier.Companion companion2;
        float f2;
        List list;
        int i;
        int i2;
        Modifier.Companion companion3;
        int i3;
        float f3;
        int i4;
        int i5;
        GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding.HowItWorks.Row row;
        Modifier.Companion companion4;
        LocalCashBalanceViewModel localCashBalanceViewModel = (LocalCashBalanceViewModel) this.f$0;
        Function1 function1 = (Function1) this.f$1;
        Composer composer = (Composer) obj2;
        ((Integer) obj3).getClass();
        BiasAlignment.Horizontal horizontal2 = Alignment.Companion.Start;
        ((CollapsingToolbarScaffoldScopeInstance) obj).getClass();
        ScrollState rememberScrollState = ImageKt.rememberScrollState(composer);
        Modifier.Companion companion5 = Modifier.Companion.$$INSTANCE;
        Modifier verticalScroll$default = ImageKt.verticalScroll$default(companion5, rememberScrollState, false, 14);
        BiasAlignment.Horizontal horizontal3 = Alignment.Companion.CenterHorizontally;
        Arrangement$Top$1 arrangement$Top$12 = SpacerKt.Top;
        ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(arrangement$Top$12, horizontal3, composer, 48);
        GapComposer gapComposer = (GapComposer) composer;
        int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
        PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
        Modifier materializeModifier = PlatformKt.materializeModifier(composer, verticalScroll$default);
        ComposeUiNode.Companion.getClass();
        LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
        ?? r9 = (GapComposer) composer;
        if (r9.applier == null) {
            Updater.invalidApplier();
            throw null;
        }
        r9.startReusableNode();
        if (r9.inserting) {
            r9.createNode(layoutNode$Companion$Constructor$1);
        } else {
            r9.useNode();
        }
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
        Updater.m576setimpl(composer, columnMeasurePolicy, composeUiNode$Companion$SetModifier$1);
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
        Updater.m576setimpl(composer, currentCompositionLocalScope, composeUiNode$Companion$SetModifier$12);
        Integer valueOf = Integer.valueOf(hashCode);
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
        Updater.m576setimpl(composer, valueOf, composeUiNode$Companion$SetModifier$13);
        OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
        Updater.m575reconcileimpl(composer, ownerSnapshotObserver$onCommitAffectingLayout$1);
        ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
        Updater.m576setimpl(composer, materializeModifier, composeUiNode$Companion$SetModifier$14);
        LocalCashBalanceViewModel.Activity activity = localCashBalanceViewModel.activity;
        GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding.HowItWorks howItWorks = localCashBalanceViewModel.howItWorks;
        String str2 = localCashBalanceViewModel.buttonText;
        String str3 = localCashBalanceViewModel.header;
        if (activity == null) {
            r9.startReplaceGroup(-408296967);
            r9.end(false);
            str = str3;
        } else {
            str = str3;
            r9.startReplaceGroup(-408296966);
            LocalMapKt.LocalCashActivityView(null, activity, function1, composer, 0);
            r9.end(false);
        }
        if (str == null && str2 == null) {
            r9.startReplaceGroup(-408079935);
            r9.end(false);
        } else {
            r9.startReplaceGroup(-408130868);
            DBUtil.SpacerWithinSectionMedium(0, 1, composer, null);
            r9.end(false);
        }
        if (howItWorks != null) {
            r9.startReplaceGroup(-407963716);
            ModalKt.HorizontalDivider(6, 0, composer, SpacerKt.m300paddingVpY3zN4$default(SpacerKt.m302paddingqDBjuR0$default(companion5, RecyclerView.DECELERATION_RATE, 24.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), 24.0f, RecyclerView.DECELERATION_RATE, 2));
            Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion5, 1.0f);
            ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(arrangement$Top$12, horizontal2, composer, 48);
            int hashCode2 = Long.hashCode(r9.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope2 = r9.currentCompositionLocalScope();
            Modifier materializeModifier2 = PlatformKt.materializeModifier(composer, fillMaxWidth);
            r9.startReusableNode();
            if (r9.inserting) {
                r9.createNode(layoutNode$Companion$Constructor$1);
            } else {
                r9.useNode();
            }
            Updater.m576setimpl(composer, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(composer, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
            Request$Priority$EnumUnboxingLocalUtility.m(hashCode2, composer, composeUiNode$Companion$SetModifier$13, composer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(composer, materializeModifier2, composeUiNode$Companion$SetModifier$14);
            String str4 = howItWorks.title;
            if (str4 == null) {
                r9.startReplaceGroup(-1451805352);
                r9.end(false);
                horizontal = horizontal2;
                companion = companion5;
                r22 = 0;
                arrangement$Top$1 = arrangement$Top$12;
            } else {
                r9.startReplaceGroup(-1451805351);
                Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(companion5, 24.0f);
                TextStyle textStyle = ((Typography) r9.consume(ArcadeThemeKt.LocalTypography)).sectionTitle;
                Colors colors = (Colors) r9.consume(ArcadeThemeKt.LocalColors);
                if (colors == null) {
                    colors = re$$ExternalSyntheticOutline0.m((GapComposer) r9, -1762997026, (GapComposer) r9, false);
                } else {
                    r9.startReplaceGroup(-1762997739);
                    r9.end(false);
                }
                arrangement$Top$1 = arrangement$Top$12;
                companion = companion5;
                horizontal = horizontal2;
                r22 = 0;
                Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, colors.semantic.text.standard, composer, m298padding3ABfNKs, textStyle, (TextLineBalancing) null, str4, (Map) null, (Function1) null, false);
                r9.end(false);
            }
            r9.startReplaceGroup(-323915394);
            List list2 = howItWorks.rows;
            int size = list2.size();
            int i6 = r22;
            while (i6 < size) {
                GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding.HowItWorks.Row row2 = (GetNeighborhoodsTabContentResponse.EnrollmentIncentive.Onboarding.HowItWorks.Row) list2.get(i6);
                Modifier.Companion companion6 = companion;
                Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(SpacerKt.m300paddingVpY3zN4$default(companion6, 18.0f, RecyclerView.DECELERATION_RATE, 2), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, 7);
                long j = Strings.getColors(composer).semantic.background.subtle;
                Strings.getSizes(composer).getClass();
                Object obj4 = DefaultSizes.border.entries;
                Modifier m = Request$Priority$EnumUnboxingLocalUtility.m(24.0f, m302paddingqDBjuR0$default, j, 8.0f);
                BiasAlignment.Horizontal horizontal4 = horizontal;
                Arrangement$Top$1 arrangement$Top$13 = arrangement$Top$1;
                ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(arrangement$Top$13, horizontal4, composer, r22);
                int hashCode3 = Long.hashCode(r9.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope3 = r9.currentCompositionLocalScope();
                Modifier materializeModifier3 = PlatformKt.materializeModifier(composer, m);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                r9.startReusableNode();
                if (r9.inserting) {
                    r9.createNode(layoutNode$Companion$Constructor$12);
                } else {
                    r9.useNode();
                }
                Updater.m576setimpl(composer, columnMeasurePolicy3, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(composer, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(composer, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(composer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(composer, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                LocalImage localImage = row2.image;
                if (localImage == null) {
                    r9.startReplaceGroup(-931750830);
                    r9.end(r22);
                    list = list2;
                    horizontal = horizontal4;
                    arrangement$Top$1 = arrangement$Top$13;
                    i = size;
                    i2 = i6;
                    i3 = 2;
                    f3 = RecyclerView.DECELERATION_RATE;
                    f = 24.0f;
                    f2 = 8.0f;
                    companion3 = companion6;
                } else {
                    r9.startReplaceGroup(-931750829);
                    Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(SpacerKt.m299paddingVpY3zN4(companion6, 24.0f, 8.0f), 64.0f);
                    Float ratio = LocalViewsKt.getRatio(localImage);
                    if (ratio != null) {
                        f = 24.0f;
                        companion2 = OffsetKt.aspectRatio(ratio.floatValue(), companion6, r22);
                    } else {
                        f = 24.0f;
                        companion2 = companion6;
                    }
                    horizontal = horizontal4;
                    BiasAlignment biasAlignment = Alignment.Companion.Center;
                    String themedUrl = LocalViewsKt.getThemedUrl(localImage, composer);
                    Composer composer2 = composer;
                    ContentScale$Companion$Fit$1 contentScale$Companion$Fit$1 = ContentScale.Companion.Fit;
                    arrangement$Top$1 = arrangement$Top$13;
                    f2 = 8.0f;
                    list = list2;
                    i = size;
                    i2 = i6;
                    companion3 = companion6;
                    i3 = 2;
                    f3 = RecyclerView.DECELERATION_RATE;
                    LocalMapKt.LocalAsyncImage(m285size3ABfNKs, companion2, themedUrl, contentScale$Companion$Fit$1, biasAlignment, null, null, composer2, 27654, 96);
                    composer = composer2;
                    r9.end(r22);
                }
                String str5 = row2.title;
                if (str5 == null) {
                    r9.startReplaceGroup(-931270950);
                    r9.end(r22);
                    i4 = i;
                    companion4 = companion3;
                    row = row2;
                    i5 = i2;
                } else {
                    r9.startReplaceGroup(-931270949);
                    i4 = i;
                    i5 = i2;
                    row = row2;
                    companion4 = companion3;
                    Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, Strings.getColors(composer).semantic.text.standard, composer, SpacerKt.m302paddingqDBjuR0$default(SpacerKt.m300paddingVpY3zN4$default(companion3, 16.0f, f3, i3), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, f2, 7), Strings.getTypography(composer).headlineSmall, (TextLineBalancing) null, str5, (Map) null, (Function1) null, false);
                    r9.end(r22);
                }
                String str6 = row.body;
                if (str6 == null) {
                    r9.startReplaceGroup(-930891014);
                    r9.end(r22);
                    companion = companion4;
                } else {
                    r9.startReplaceGroup(-930891013);
                    Modifier.Companion companion7 = companion4;
                    companion = companion7;
                    Room.m1165Text25TpFw(0, 0, 0, 0, 48, 0, 4080, Strings.getColors(composer).semantic.text.standard, composer, SpacerKt.m302paddingqDBjuR0$default(SpacerKt.m300paddingVpY3zN4$default(companion7, 16.0f, RecyclerView.DECELERATION_RATE, 2), RecyclerView.DECELERATION_RATE, f2, RecyclerView.DECELERATION_RATE, f, 5), Strings.getTypography(composer).bodyMedium, (TextLineBalancing) null, str6, (Map) null, (Function1) null, false);
                    r9.end(r22);
                }
                r9.end(true);
                i6 = i5 + 1;
                list2 = list;
                size = i4;
            }
            Boxes$$ExternalSyntheticOutline1.m((GapComposer) r9, (boolean) r22, true, (boolean) r22);
            r3 = 1;
            r1 = r9;
            r2 = r22;
        } else {
            GapComposer gapComposer2 = r9;
            gapComposer2.startReplaceGroup(-405600710);
            boolean changed = gapComposer2.changed(function1);
            Object rememberedValue = gapComposer2.rememberedValue();
            NeverEqualPolicy neverEqualPolicy2 = Composer.Companion.Empty;
            if (changed || rememberedValue == neverEqualPolicy2) {
                rememberedValue = new LocalHomeGeoViewKt$$ExternalSyntheticLambda28(9, function1);
                gapComposer2.updateRememberedValue(rememberedValue);
            }
            Modifier m183clickableoSLSa3U$default = ImageKt.m183clickableoSLSa3U$default(companion5, false, null, null, (Function0) rememberedValue, 15);
            ColumnMeasurePolicy columnMeasurePolicy4 = ColumnKt.columnMeasurePolicy(arrangement$Top$12, horizontal3, composer, 48);
            int hashCode4 = Long.hashCode(gapComposer2.compositeKeyHashCode);
            PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer2.currentCompositionLocalScope();
            Modifier materializeModifier4 = PlatformKt.materializeModifier(composer, m183clickableoSLSa3U$default);
            gapComposer2.startReusableNode();
            if (gapComposer2.inserting) {
                gapComposer2.createNode(layoutNode$Companion$Constructor$1);
            } else {
                gapComposer2.useNode();
            }
            Updater.m576setimpl(composer, columnMeasurePolicy4, composeUiNode$Companion$SetModifier$1);
            Updater.m576setimpl(composer, currentCompositionLocalScope4, composeUiNode$Companion$SetModifier$12);
            Request$Priority$EnumUnboxingLocalUtility.m(hashCode4, composer, composeUiNode$Companion$SetModifier$13, composer, ownerSnapshotObserver$onCommitAffectingLayout$1);
            Updater.m576setimpl(composer, materializeModifier4, composeUiNode$Companion$SetModifier$14);
            DBUtil.SpacerWithinSectionSmall(0, 1, composer, null);
            Trace.m1191Iconww6aTOc(Icons.Like24, (String) null, SizeKt.m285size3ABfNKs(companion5, 24.0f), Strings.getColors(composer).semantic.icon.standard, composer, 438, 0);
            if (str == null) {
                gapComposer2.startReplaceGroup(1232188469);
                gapComposer2.end(false);
                z = false;
                neverEqualPolicy = neverEqualPolicy2;
            } else {
                gapComposer2.startReplaceGroup(1232188470);
                Strings.getSizes(composer).getClass();
                DefaultSizes.spacing.getClass();
                Strings.getSizes(composer).getClass();
                Modifier m302paddingqDBjuR0$default2 = SpacerKt.m302paddingqDBjuR0$default(companion5, 16.0f, 8.0f, 16.0f, RecyclerView.DECELERATION_RATE, 8);
                long j2 = Strings.getColors(composer).semantic.text.standard;
                TextStyle m994copyp1EtxEg$default = TextStyle.m994copyp1EtxEg$default(Strings.getTypography(composer).sectionTitle, 0L, 0L, new FontWeight(500), null, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777211);
                boolean changed2 = gapComposer2.changed(function1);
                Object rememberedValue2 = gapComposer2.rememberedValue();
                if (changed2 || rememberedValue2 == neverEqualPolicy2) {
                    rememberedValue2 = new SwipeToDismissKt$$ExternalSyntheticLambda4(6, function1);
                    gapComposer2.updateRememberedValue(rememberedValue2);
                }
                neverEqualPolicy = neverEqualPolicy2;
                z = false;
                LazyDslKt.m304MarkdownTextpCuZGqc(str, (Function2) rememberedValue2, m302paddingqDBjuR0$default2, m994copyp1EtxEg$default, j2, null, null, null, 0, 0, 3, composer, 0, 992);
                composer = composer;
                gapComposer2.end(false);
            }
            if (str2 == null) {
                gapComposer2.startReplaceGroup(1232838911);
                gapComposer2.end(z);
            } else {
                gapComposer2.startReplaceGroup(1232838912);
                Modifier m302paddingqDBjuR0$default3 = SpacerKt.m302paddingqDBjuR0$default(companion5, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                boolean changed3 = gapComposer2.changed(function1);
                Object rememberedValue3 = gapComposer2.rememberedValue();
                if (changed3 || rememberedValue3 == neverEqualPolicy) {
                    rememberedValue3 = new LocalHomeGeoViewKt$$ExternalSyntheticLambda28(10, function1);
                    gapComposer2.updateRememberedValue(rememberedValue3);
                }
                Composer composer3 = composer;
                coil3.size.SizeKt.ButtonCompact((Function0) rememberedValue3, m302paddingqDBjuR0$default3, null, false, false, null, Expect_jvmKt.rememberComposableLambda(-1383622861, new LocalHomeViewKt$$ExternalSyntheticLambda1(str2, 5), composer), composer3, 1572912, 60);
                composer = composer3;
                gapComposer2.end(z);
            }
            r3 = 1;
            gapComposer2.end(true);
            gapComposer2.end(z);
            r1 = gapComposer2;
            r2 = z;
        }
        DBUtil.SpacerBetweenSectionLarge(r2, r3, composer, null);
        r1.end(r3);
        return Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:165:0x047b, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r5, r3.hoursFormatted) == false) goto L175;
     */
    /* JADX WARN: Code restructure failed: missing block: B:467:0x0af4, code lost:
    
        if (r4 != false) goto L491;
     */
    /* JADX WARN: Removed duplicated region for block: B:170:0x0485  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x0490  */
    @Override // kotlin.jvm.functions.Function3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        MenuHours menuHours;
        long j;
        int i = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        String str = null;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        int i2 = 16;
        Object obj4 = this.f$1;
        Object obj5 = this.f$0;
        switch (i) {
            case 0:
                PagerState pagerState = (PagerState) obj5;
                LayoutDirection layoutDirection = (LayoutDirection) obj4;
                float floatValue = ((Float) obj).floatValue();
                float floatValue2 = ((Float) obj2).floatValue();
                float floatValue3 = ((Float) obj3).floatValue();
                boolean isScrollingForward = zzaco.isScrollingForward(pagerState, floatValue);
                if (pagerState.getLayoutInfo().orientation != Orientation.Vertical && layoutDirection != LayoutDirection.Ltr) {
                    isScrollingForward = !isScrollingForward;
                }
                int i3 = pagerState.getLayoutInfo().pageSize;
                float dragGestureDelta = i3 == 0 ? 0.0f : zzaco.dragGestureDelta(pagerState) / i3;
                float f = dragGestureDelta - ((int) dragGestureDelta);
                char c = Math.abs(floatValue) < pagerState.density.mo236toPx0680j_4(400.0f) ? (char) 0 : floatValue > RecyclerView.DECELERATION_RATE ? (char) 1 : (char) 2;
                if (c != 0) {
                    if (c != 1) {
                        if (c != 2) {
                            floatValue2 = 0.0f;
                        }
                    }
                    floatValue2 = floatValue3;
                } else if (Math.abs(f) <= 0.5f) {
                    float abs = Math.abs(dragGestureDelta);
                    Density density = pagerState.density;
                    PagerStateKt$UnitDensity$1 pagerStateKt$UnitDensity$1 = PagerStateKt.UnitDensity;
                    if (abs < Math.abs(Math.min(density.mo236toPx0680j_4(56.0f), pagerState.getPageSize$foundation() / 2.0f) / pagerState.getPageSize$foundation())) {
                        floatValue2 = floatValue3;
                        break;
                    } else {
                        floatValue2 = floatValue3;
                    }
                }
                return Float.valueOf(floatValue2);
            case 1:
                Function1 function1 = (Function1) obj5;
                ContextMenuColors contextMenuColors = (ContextMenuColors) obj4;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 17) != 16)) {
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = new ContextMenuScope();
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    ContextMenuScope contextMenuScope = (ContextMenuScope) rememberedValue;
                    contextMenuScope.composables.clear();
                    function1.invoke(contextMenuScope);
                    contextMenuScope.Content$foundation(contextMenuColors, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                TextFieldPointerModifier_commonKt$$ExternalSyntheticLambda1 textFieldPointerModifier_commonKt$$ExternalSyntheticLambda1 = (TextFieldPointerModifier_commonKt$$ExternalSyntheticLambda1) obj5;
                MutableInteractionSourceImpl mutableInteractionSourceImpl = (MutableInteractionSourceImpl) obj4;
                ((Integer) obj3).getClass();
                GapComposer gapComposer2 = (GapComposer) ((Composer) obj2);
                gapComposer2.startReplaceGroup(-102778667);
                Object rememberedValue2 = gapComposer2.rememberedValue();
                Object obj6 = rememberedValue2;
                if (rememberedValue2 == neverEqualPolicy) {
                    CoroutineScope createCompositionCoroutineScope = Updater.createCompositionCoroutineScope(EmptyCoroutineContext.INSTANCE, gapComposer2);
                    gapComposer2.updateRememberedValue(createCompositionCoroutineScope);
                    obj6 = createCompositionCoroutineScope;
                }
                CoroutineScope coroutineScope = (CoroutineScope) obj6;
                Object rememberedValue3 = gapComposer2.rememberedValue();
                Object obj7 = rememberedValue3;
                if (rememberedValue3 == neverEqualPolicy) {
                    ParcelableSnapshotMutableState mutableStateOf$default = Updater.mutableStateOf$default(null);
                    gapComposer2.updateRememberedValue(mutableStateOf$default);
                    obj7 = mutableStateOf$default;
                }
                MutableState mutableState = (MutableState) obj7;
                MutableState rememberUpdatedState = Updater.rememberUpdatedState(textFieldPointerModifier_commonKt$$ExternalSyntheticLambda1, gapComposer2);
                boolean changed = gapComposer2.changed(mutableInteractionSourceImpl);
                Object rememberedValue4 = gapComposer2.rememberedValue();
                Object obj8 = rememberedValue4;
                if (changed || rememberedValue4 == neverEqualPolicy) {
                    Navigator$$ExternalSyntheticLambda0 navigator$$ExternalSyntheticLambda0 = new Navigator$$ExternalSyntheticLambda0(r12, mutableState, mutableInteractionSourceImpl);
                    gapComposer2.updateRememberedValue(navigator$$ExternalSyntheticLambda0);
                    obj8 = navigator$$ExternalSyntheticLambda0;
                }
                Updater.DisposableEffect(mutableInteractionSourceImpl, (Function1) obj8, gapComposer2);
                boolean changedInstance = gapComposer2.changedInstance(coroutineScope) | gapComposer2.changed(mutableInteractionSourceImpl) | gapComposer2.changed(rememberUpdatedState);
                Object rememberedValue5 = gapComposer2.rememberedValue();
                Object obj9 = rememberedValue5;
                if (changedInstance || rememberedValue5 == neverEqualPolicy) {
                    CoreInteractiveCardKt$InteractiveCardEffect$16$6$1$1 coreInteractiveCardKt$InteractiveCardEffect$16$6$1$1 = new CoreInteractiveCardKt$InteractiveCardEffect$16$6$1$1(coroutineScope, mutableState, mutableInteractionSourceImpl, rememberUpdatedState);
                    gapComposer2.updateRememberedValue(coreInteractiveCardKt$InteractiveCardEffect$16$6$1$1);
                    obj9 = coreInteractiveCardKt$InteractiveCardEffect$16$6$1$1;
                }
                Modifier pointerInput = SuspendingPointerInputFilterKt.pointerInput(companion, mutableInteractionSourceImpl, (PointerInputEventHandler) obj9);
                gapComposer2.end(false);
                return pointerInput;
            case 3:
                LocalAddBrandsViewModel localAddBrandsViewModel = (LocalAddBrandsViewModel) obj5;
                Function1 function12 = (Function1) obj4;
                Modifier modifier = (Modifier) obj;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                modifier.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer2).changed(modifier) ? 4 : 2;
                }
                GapComposer gapComposer3 = (GapComposer) composer2;
                if (gapComposer3.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                    LocalAddBrandsViewKt.LocalAddBrandsView(modifier, localAddBrandsViewModel, function12, gapComposer3, intValue2 & 14);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                LocalPosCheckInViewModel localPosCheckInViewModel = (LocalPosCheckInViewModel) obj5;
                Function1 function13 = (Function1) obj4;
                Modifier modifier2 = (Modifier) obj;
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                modifier2.getClass();
                if ((intValue3 & 6) == 0) {
                    intValue3 |= ((GapComposer) composer3).changed(modifier2) ? 4 : 2;
                }
                GapComposer gapComposer4 = (GapComposer) composer3;
                if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 19) != 18)) {
                    ArcadeThemeKt.ArcadeTheme(ColorsDarkKt.colorsDark, null, null, Expect_jvmKt.rememberComposableLambda(-782235031, new LocalPosCheckInViewKt$$ExternalSyntheticLambda1(modifier2, localPosCheckInViewModel, function13), gapComposer4), gapComposer4, 3072, 6);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                MarketingMessagesViewModel marketingMessagesViewModel = (MarketingMessagesViewModel) obj5;
                Function1 function14 = (Function1) obj4;
                Modifier modifier3 = (Modifier) obj;
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                modifier3.getClass();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= ((GapComposer) composer4).changed(modifier3) ? 4 : 2;
                }
                GapComposer gapComposer5 = (GapComposer) composer4;
                if (gapComposer5.shouldExecute(intValue4 & 1, (intValue4 & 19) != 18)) {
                    MarketingMessageKt.MarketingMessages(modifier3, marketingMessagesViewModel, function14, gapComposer5, intValue4 & 14, 0);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                LocalPosBrandOnboardingViewModel localPosBrandOnboardingViewModel = (LocalPosBrandOnboardingViewModel) obj5;
                Function1 function15 = (Function1) obj4;
                Modifier modifier4 = (Modifier) obj;
                Composer composer5 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                modifier4.getClass();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((GapComposer) composer5).changed(modifier4) ? 4 : 2;
                }
                GapComposer gapComposer6 = (GapComposer) composer5;
                if (gapComposer6.shouldExecute(intValue5 & 1, (intValue5 & 19) != 18)) {
                    ArcadeThemeKt.ArcadeTheme(ColorsDarkKt.colorsDark, null, null, Expect_jvmKt.rememberComposableLambda(-249053430, new LocalPosBrandOnboardingViewKt$$ExternalSyntheticLambda1(modifier4, localPosBrandOnboardingViewModel, function15), gapComposer6), gapComposer6, 3072, 6);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                LocalMenuItemDetailsViewModel localMenuItemDetailsViewModel = (LocalMenuItemDetailsViewModel) obj5;
                Function1 function16 = (Function1) obj4;
                Modifier modifier5 = (Modifier) obj;
                Composer composer6 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                modifier5.getClass();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= ((GapComposer) composer6).changed(modifier5) ? 4 : 2;
                }
                GapComposer gapComposer7 = (GapComposer) composer6;
                if (gapComposer7.shouldExecute(intValue6 & 1, (intValue6 & 19) != 18)) {
                    LocalCaloriesTextKt.LocalMenuItemDetailsView(modifier5, localMenuItemDetailsViewModel, function16, gapComposer7, intValue6 & 14);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                LocalBrandLocationCheckoutViewModel localBrandLocationCheckoutViewModel = (LocalBrandLocationCheckoutViewModel) obj5;
                Function1 function17 = (Function1) obj4;
                Modifier modifier6 = (Modifier) obj;
                Composer composer7 = (Composer) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                modifier6.getClass();
                if ((intValue7 & 6) == 0) {
                    intValue7 |= ((GapComposer) composer7).changed(modifier6) ? 4 : 2;
                }
                GapComposer gapComposer8 = (GapComposer) composer7;
                if (gapComposer8.shouldExecute(intValue7 & 1, (intValue7 & 19) != 18)) {
                    LocalBrandLocationCheckoutViewKt.LocalBrandLocationCheckoutView(modifier6, localBrandLocationCheckoutViewModel, function17, gapComposer8, intValue7 & 14);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                LocalBrandLocationMenuViewModel localBrandLocationMenuViewModel = (LocalBrandLocationMenuViewModel) obj5;
                Function1 function18 = (Function1) obj4;
                Modifier modifier7 = (Modifier) obj;
                Composer composer8 = (Composer) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                modifier7.getClass();
                if ((intValue8 & 6) == 0) {
                    intValue8 |= ((GapComposer) composer8).changed(modifier7) ? 4 : 2;
                }
                GapComposer gapComposer9 = (GapComposer) composer8;
                if (gapComposer9.shouldExecute(intValue8 & 1, (intValue8 & 19) != 18)) {
                    boolean changedInstance2 = gapComposer9.changedInstance(localBrandLocationMenuViewModel) | gapComposer9.changed(function18);
                    Object rememberedValue6 = gapComposer9.rememberedValue();
                    if (changedInstance2 || rememberedValue6 == neverEqualPolicy) {
                        rememberedValue6 = new StatusRunnable$$ExternalSyntheticLambda1(15, localBrandLocationMenuViewModel, function18);
                        gapComposer9.updateRememberedValue(rememberedValue6);
                    }
                    DBUtil.BackHandler(false, (Function0) rememberedValue6, gapComposer9, 0, 1);
                    LocalCaloriesTextKt.LocalBrandLocationMenuView(modifier7, localBrandLocationMenuViewModel, function18, gapComposer9, intValue8 & 14);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                MarketingMessageViewModel marketingMessageViewModel = (MarketingMessageViewModel) obj5;
                Function1 function19 = (Function1) obj4;
                Modifier modifier8 = (Modifier) obj;
                Composer composer9 = (Composer) obj2;
                int intValue9 = ((Integer) obj3).intValue();
                modifier8.getClass();
                if ((intValue9 & 6) == 0) {
                    intValue9 |= ((GapComposer) composer9).changed(modifier8) ? 4 : 2;
                }
                GapComposer gapComposer10 = (GapComposer) composer9;
                if (gapComposer10.shouldExecute(intValue9 & 1, (intValue9 & 19) != 18)) {
                    MarketingMessageKt.MarketingMessage(modifier8, marketingMessageViewModel, function19, gapComposer10, intValue9 & 14, 0);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                TableQrCodeScannerViewModel tableQrCodeScannerViewModel = (TableQrCodeScannerViewModel) obj5;
                Function1 function110 = (Function1) obj4;
                Modifier modifier9 = (Modifier) obj;
                Composer composer10 = (Composer) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                modifier9.getClass();
                if ((intValue10 & 6) == 0) {
                    intValue10 |= ((GapComposer) composer10).changed(modifier9) ? 4 : 2;
                }
                GapComposer gapComposer11 = (GapComposer) composer10;
                if (gapComposer11.shouldExecute(intValue10 & 1, (intValue10 & 19) != 18)) {
                    ArcadeThemeKt.ArcadeTheme(ColorsDarkKt.colorsDark, null, null, Expect_jvmKt.rememberComposableLambda(-1126068812, new MenuKt$$ExternalSyntheticLambda1(tableQrCodeScannerViewModel, function110, modifier9), gapComposer11), gapComposer11, 3072, 6);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                LocalPosLocalCashRedemptionViewModel localPosLocalCashRedemptionViewModel = (LocalPosLocalCashRedemptionViewModel) obj5;
                Function1 function111 = (Function1) obj4;
                Modifier modifier10 = (Modifier) obj;
                Composer composer11 = (Composer) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                modifier10.getClass();
                if ((intValue11 & 6) == 0) {
                    intValue11 |= ((GapComposer) composer11).changed(modifier10) ? 4 : 2;
                }
                GapComposer gapComposer12 = (GapComposer) composer11;
                if (gapComposer12.shouldExecute(intValue11 & 1, (intValue11 & 19) != 18)) {
                    ArcadeThemeKt.ArcadeTheme(ColorsDarkKt.colorsDark, null, null, Expect_jvmKt.rememberComposableLambda(1253576046, new LocalPosLocalCashRedemptionViewKt$$ExternalSyntheticLambda1(modifier10, localPosLocalCashRedemptionViewModel, function111), gapComposer12), gapComposer12, 3072, 6);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) obj4;
                Composer composer12 = (Composer) obj2;
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                Modifier padding = SpacerKt.padding(SizeKt.fillMaxWidth(companion, 1.0f), (PaddingValues) obj5);
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, composer12, 0);
                GapComposer gapComposer13 = (GapComposer) composer12;
                int hashCode = Long.hashCode(gapComposer13.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer13.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(composer12, padding);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                GapComposer gapComposer14 = (GapComposer) composer12;
                if (gapComposer14.applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer14.startReusableNode();
                if (gapComposer14.inserting) {
                    gapComposer14.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer14.useNode();
                }
                Updater.m576setimpl(composer12, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(composer12, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(composer12, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(composer12, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(composer12, materializeModifier, ComposeUiNode.Companion.SetModifier);
                composableLambdaImpl.invoke((Object) ColumnScopeInstance.INSTANCE, (Object) composer12, (Object) 6);
                gapComposer14.end(true);
                return Unit.INSTANCE;
            case 14:
                LocalCheckoutGiftCardSectionViewModel localCheckoutGiftCardSectionViewModel = (LocalCheckoutGiftCardSectionViewModel) obj5;
                Function1 function112 = (Function1) obj4;
                Composer composer13 = (Composer) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer15 = (GapComposer) composer13;
                if (gapComposer15.shouldExecute(intValue12 & 1, (intValue12 & 17) != 16)) {
                    Modifier modifier11 = LocalBrandLocationCheckoutViewKt.SectionItemModifier;
                    boolean changed2 = gapComposer15.changed(function112);
                    Object rememberedValue7 = gapComposer15.rememberedValue();
                    if (changed2 || rememberedValue7 == neverEqualPolicy) {
                        rememberedValue7 = new GestureNodeKt$$ExternalSyntheticLambda0(i2, function112);
                        gapComposer15.updateRememberedValue(rememberedValue7);
                    }
                    Function1 function113 = (Function1) rememberedValue7;
                    boolean changed3 = gapComposer15.changed(function112);
                    Object rememberedValue8 = gapComposer15.rememberedValue();
                    if (changed3 || rememberedValue8 == neverEqualPolicy) {
                        rememberedValue8 = new GestureNodeKt$$ExternalSyntheticLambda0(17, function112);
                        gapComposer15.updateRememberedValue(rememberedValue8);
                    }
                    Function1 function114 = (Function1) rememberedValue8;
                    boolean changed4 = gapComposer15.changed(function112);
                    Object rememberedValue9 = gapComposer15.rememberedValue();
                    if (changed4 || rememberedValue9 == neverEqualPolicy) {
                        rememberedValue9 = new DrawerKt$$ExternalSyntheticLambda1(function112, false, 11);
                        gapComposer15.updateRememberedValue(rememberedValue9);
                    }
                    Function0 function0 = (Function0) rememberedValue9;
                    boolean changed5 = gapComposer15.changed(function112);
                    Object rememberedValue10 = gapComposer15.rememberedValue();
                    if (changed5 || rememberedValue10 == neverEqualPolicy) {
                        rememberedValue10 = new BorrowHomeOverlayKt$BorrowHomeOverlay$1$1$3(r12, function112);
                        gapComposer15.updateRememberedValue(rememberedValue10);
                    }
                    CheckoutTipSectionKt.CheckoutGiftCardSection(modifier11, localCheckoutGiftCardSectionViewModel, function113, function114, function0, (Function1) rememberedValue10, gapComposer15, 6);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                LocalBrandLocationCheckoutViewModel.CurbsidePickupSection curbsidePickupSection = (LocalBrandLocationCheckoutViewModel.CurbsidePickupSection) obj5;
                Function1 function115 = (Function1) obj4;
                Composer composer14 = (Composer) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer16 = (GapComposer) composer14;
                if (gapComposer16.shouldExecute(intValue13 & 1, (intValue13 & 17) != 16)) {
                    LocalBrandLocationCheckoutViewKt.CurbsidePickupInfoSection(SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), curbsidePickupSection, function115, gapComposer16, 6);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                OrderBuilderModel.OrderType orderType = (OrderBuilderModel.OrderType) obj5;
                Function1 function116 = (Function1) obj4;
                Composer composer15 = (Composer) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer17 = (GapComposer) composer15;
                if (gapComposer17.shouldExecute(intValue14 & 1, (intValue14 & 17) != 16)) {
                    LocalBrandLocationCheckoutViewKt.DropOffNotes((OrderBuilderModel.OrderType.Regular) orderType, function116, gapComposer17, 0);
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 17:
                LocalCheckoutPaymentSectionViewModel localCheckoutPaymentSectionViewModel = (LocalCheckoutPaymentSectionViewModel) obj5;
                Function1 function117 = (Function1) obj4;
                Composer composer16 = (Composer) obj2;
                int intValue15 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer18 = (GapComposer) composer16;
                if (gapComposer18.shouldExecute(intValue15 & 1, (intValue15 & 17) != 16)) {
                    Modifier modifier12 = LocalBrandLocationCheckoutViewKt.SectionItemModifier;
                    PaddingValuesImpl paddingValuesImpl = CheckoutExpandableReviewRowKt.CheckoutReviewRowTouchTargetPadding;
                    boolean changed6 = gapComposer18.changed(function117);
                    Object rememberedValue11 = gapComposer18.rememberedValue();
                    if (changed6 || rememberedValue11 == neverEqualPolicy) {
                        rememberedValue11 = new BorrowHomeOverlayKt$BorrowHomeOverlay$1$1$3(true ? 1 : 0, function117);
                        gapComposer18.updateRememberedValue(rememberedValue11);
                    }
                    CheckoutTipSectionKt.m1303CheckoutPaymentSectionPfoAEA0(localCheckoutPaymentSectionViewModel, (Function1) rememberedValue11, modifier12, null, true, RecyclerView.DECELERATION_RATE, paddingValuesImpl, gapComposer18, 1794432);
                } else {
                    gapComposer18.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                LocalBrandLocationMenuViewModel.MenuCategory menuCategory = (LocalBrandLocationMenuViewModel.MenuCategory) obj5;
                LocalBrandLocationMenuViewModel localBrandLocationMenuViewModel2 = (LocalBrandLocationMenuViewModel) obj4;
                Composer composer17 = (Composer) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                ((LazyGridItemScopeImpl) obj).getClass();
                GapComposer gapComposer19 = (GapComposer) composer17;
                boolean shouldExecute = gapComposer19.shouldExecute(intValue16 & 1, (intValue16 & 17) != 16);
                Applier applier = gapComposer19.applier;
                if (shouldExecute) {
                    Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion2, 4.0f, 24.0f, 4.0f, RecyclerView.DECELERATION_RATE, 8);
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer19, 0);
                    int hashCode2 = Long.hashCode(gapComposer19.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer19.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer19, m302paddingqDBjuR0$default);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                    if (applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer19.startReusableNode();
                    if (gapComposer19.inserting) {
                        gapComposer19.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer19.useNode();
                    }
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$1 = ComposeUiNode.Companion.SetMeasurePolicy;
                    Updater.m576setimpl(gapComposer19, columnMeasurePolicy2, composeUiNode$Companion$SetModifier$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$12 = ComposeUiNode.Companion.SetResolvedCompositionLocals;
                    Updater.m576setimpl(gapComposer19, currentCompositionLocalScope2, composeUiNode$Companion$SetModifier$12);
                    Integer valueOf = Integer.valueOf(hashCode2);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$13 = ComposeUiNode.Companion.SetCompositeKeyHash;
                    Updater.m576setimpl(gapComposer19, valueOf, composeUiNode$Companion$SetModifier$13);
                    OwnerSnapshotObserver$onCommitAffectingLayout$1 ownerSnapshotObserver$onCommitAffectingLayout$1 = ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion;
                    Updater.m575reconcileimpl(gapComposer19, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    ComposeUiNode$Companion$SetModifier$1 composeUiNode$Companion$SetModifier$14 = ComposeUiNode.Companion.SetModifier;
                    Updater.m576setimpl(gapComposer19, materializeModifier2, composeUiNode$Companion$SetModifier$14);
                    RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(6.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.CenterVertically, gapComposer19, 54);
                    int hashCode3 = Long.hashCode(gapComposer19.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer19.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer19, companion2);
                    gapComposer19.startReusableNode();
                    if (gapComposer19.inserting) {
                        gapComposer19.createNode(layoutNode$Companion$Constructor$12);
                    } else {
                        gapComposer19.useNode();
                    }
                    Updater.m576setimpl(gapComposer19, rowMeasurePolicy, composeUiNode$Companion$SetModifier$1);
                    Updater.m576setimpl(gapComposer19, currentCompositionLocalScope3, composeUiNode$Companion$SetModifier$12);
                    Recorder$$ExternalSyntheticOutline2.m(hashCode3, gapComposer19, composeUiNode$Companion$SetModifier$13, gapComposer19, ownerSnapshotObserver$onCommitAffectingLayout$1);
                    Updater.m576setimpl(gapComposer19, materializeModifier3, composeUiNode$Companion$SetModifier$14);
                    String str2 = menuCategory.label;
                    boolean z = menuCategory.showUnavailable;
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, Strings.getColors(gapComposer19).semantic.text.prominent, (Composer) gapComposer19, (Modifier) null, Strings.getTypography(gapComposer19).sectionTitle, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                    if (z) {
                        gapComposer19.startReplaceGroup(1584539877);
                        Trace.m1191Iconww6aTOc(Icons.Time16, (String) null, (Modifier) null, Strings.getColors(gapComposer19).semantic.icon.extraSubtle, gapComposer19, 54, 4);
                        gapComposer19.end(false);
                    } else {
                        gapComposer19.startReplaceGroup(1584756784);
                        gapComposer19.end(false);
                    }
                    gapComposer19.end(true);
                    MenuHours menuHours2 = menuCategory.menuHours;
                    if (menuHours2 != null) {
                        if (!z) {
                            MenuSelectorOption menuSelectorOption = localBrandLocationMenuViewModel2.selectedMenuOption;
                            MenuHours menuHours3 = menuSelectorOption != null ? menuSelectorOption.hours : null;
                            String str3 = menuHours2.hoursFormatted;
                            if (str3 != null) {
                                if ((menuHours3 != null ? menuHours3.hoursFormatted : null) != null) {
                                    break;
                                }
                            }
                        }
                        menuHours = menuHours2;
                        if (menuHours != null) {
                            gapComposer19.startReplaceGroup(-32465100);
                            gapComposer19.end(false);
                        } else {
                            re$$ExternalSyntheticOutline0.m(gapComposer19, -32465099, companion2, 2.0f, gapComposer19);
                            LocalMenuHoursViewKt.LocalMenuHoursView(null, menuHours, null, gapComposer19, 0, 5);
                            gapComposer19.end(false);
                        }
                        gapComposer19.end(true);
                    }
                    menuHours = null;
                    if (menuHours != null) {
                    }
                    gapComposer19.end(true);
                } else {
                    gapComposer19.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                LocalMenuItemDetailsViewModel.ItemModifier.FreeTextEntry freeTextEntry = (LocalMenuItemDetailsViewModel.ItemModifier.FreeTextEntry) obj5;
                MutableState mutableState2 = (MutableState) obj4;
                Composer composer18 = (Composer) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                ((RowScope) obj).getClass();
                GapComposer gapComposer20 = (GapComposer) composer18;
                if (gapComposer20.shouldExecute(intValue17 & 1, (intValue17 & 17) != 16)) {
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(SpacerKt.m302paddingqDBjuR0$default(Modifier.Companion.$$INSTANCE, RecyclerView.DECELERATION_RATE, 3.0f, RecyclerView.DECELERATION_RATE, 3.0f, 5), 1.0f);
                    InputError.TextTooLong textTooLong = freeTextEntry.inputError;
                    if (textTooLong != null) {
                        str = ((TextFieldState) mutableState2.getValue()).getValue$foundation().text.length() + " / " + textTooLong.maxLength;
                    }
                    if (str == null) {
                        str = "";
                    }
                    String str4 = str;
                    int length = ((TextFieldState) mutableState2.getValue()).getValue$foundation().text.length();
                    InputError.TextTooLong textTooLong2 = freeTextEntry.inputError;
                    if (length > (textTooLong2 != null ? textTooLong2.maxLength : Integer.MAX_VALUE)) {
                        gapComposer20.startReplaceGroup(-30714010);
                        Colors colors = (Colors) gapComposer20.consume(ArcadeThemeKt.LocalColors);
                        if (colors == null) {
                            colors = re$$ExternalSyntheticOutline0.m(gapComposer20, -1762997026, gapComposer20, false);
                        } else {
                            gapComposer20.startReplaceGroup(-1762997739);
                            gapComposer20.end(false);
                        }
                        j = colors.component.input.border.error;
                        gapComposer20.end(false);
                    } else {
                        gapComposer20.startReplaceGroup(-30635766);
                        Colors colors2 = (Colors) gapComposer20.consume(ArcadeThemeKt.LocalColors);
                        if (colors2 == null) {
                            colors2 = re$$ExternalSyntheticOutline0.m(gapComposer20, -1762997026, gapComposer20, false);
                        } else {
                            gapComposer20.startReplaceGroup(-1762997739);
                            gapComposer20.end(false);
                        }
                        j = colors2.semantic.border.standard;
                        gapComposer20.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 6, 48, 0, 3824, j, (Composer) gapComposer20, fillMaxWidth, ((Typography) gapComposer20.consume(ArcadeThemeKt.LocalTypography)).helpText, (TextLineBalancing) null, str4, (Map) null, (Function1) null, false);
                } else {
                    gapComposer20.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                LocalOrderStatusViewModel.Loaded loaded = (LocalOrderStatusViewModel.Loaded) obj5;
                Function1 function118 = (Function1) obj4;
                AdaptiveStackScope adaptiveStackScope = (AdaptiveStackScope) obj;
                Composer composer19 = (Composer) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                adaptiveStackScope.getClass();
                if ((intValue18 & 6) == 0) {
                    intValue18 |= ((GapComposer) composer19).changed(adaptiveStackScope) ? 4 : 2;
                }
                GapComposer gapComposer21 = (GapComposer) composer19;
                if (gapComposer21.shouldExecute(intValue18 & 1, (intValue18 & 19) != 18)) {
                    String str5 = loaded.receiptUrl;
                    if (str5 == null) {
                        gapComposer21.startReplaceGroup(-1213600110);
                        gapComposer21.end(false);
                    } else {
                        gapComposer21.startReplaceGroup(-1213600109);
                        Modifier horizontalWeight = adaptiveStackScope.horizontalWeight(companion, 1.0f);
                        boolean changed7 = gapComposer21.changed(function118) | gapComposer21.changed(str5);
                        Object rememberedValue12 = gapComposer21.rememberedValue();
                        Object obj10 = rememberedValue12;
                        if (changed7 || rememberedValue12 == neverEqualPolicy) {
                            P2PListViewKt$$ExternalSyntheticLambda13 p2PListViewKt$$ExternalSyntheticLambda13 = new P2PListViewKt$$ExternalSyntheticLambda13(function118, str5, 1);
                            gapComposer21.updateRememberedValue(p2PListViewKt$$ExternalSyntheticLambda13);
                            obj10 = p2PListViewKt$$ExternalSyntheticLambda13;
                        }
                        coil3.size.SizeKt.ButtonCta((Function0) obj10, horizontalWeight, null, false, false, null, BrandPinsKt.f33lambda$1272453697, gapComposer21, 1572864, 60);
                        gapComposer21.end(false);
                    }
                    if (loaded.allowToolbarNavigation) {
                        gapComposer21.startReplaceGroup(-1213083866);
                        gapComposer21.end(false);
                    } else {
                        gapComposer21.startReplaceGroup(-1213307066);
                        Modifier horizontalWeight2 = adaptiveStackScope.horizontalWeight(companion, 1.0f);
                        ButtonProminence buttonProminence = ButtonProminence.PROMINENT;
                        boolean changed8 = gapComposer21.changed(function118);
                        Object rememberedValue13 = gapComposer21.rememberedValue();
                        Object obj11 = rememberedValue13;
                        if (changed8 || rememberedValue13 == neverEqualPolicy) {
                            DrawerKt$$ExternalSyntheticLambda1 drawerKt$$ExternalSyntheticLambda1 = new DrawerKt$$ExternalSyntheticLambda1(function118, false, 21);
                            gapComposer21.updateRememberedValue(drawerKt$$ExternalSyntheticLambda1);
                            obj11 = drawerKt$$ExternalSyntheticLambda1;
                        }
                        coil3.size.SizeKt.ButtonCta((Function0) obj11, horizontalWeight2, buttonProminence, false, false, null, BrandPinsKt.f38lambda$751050276, gapComposer21, 1573248, 56);
                        gapComposer21.end(false);
                    }
                } else {
                    gapComposer21.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                MapDecisionSheetModel mapDecisionSheetModel = (MapDecisionSheetModel) obj5;
                Function1 function119 = (Function1) obj4;
                PaddingValues paddingValues = (PaddingValues) obj;
                Composer composer20 = (Composer) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                paddingValues.getClass();
                if ((intValue19 & 6) == 0) {
                    intValue19 |= ((GapComposer) composer20).changed(paddingValues) ? 4 : 2;
                }
                GapComposer gapComposer22 = (GapComposer) composer20;
                if (gapComposer22.shouldExecute(intValue19 & 1, (intValue19 & 19) != 18)) {
                    LocalBrandLocationRowKt.LocalBrandLocationMapDecisionSheet(SpacerKt.padding(companion, paddingValues), mapDecisionSheetModel, function119, gapComposer22, 0);
                } else {
                    gapComposer22.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 22:
                return invoke$app$cash$local$views$brand$profile$LocalBrandProfileViewKt$$ExternalSyntheticLambda11(obj, obj2, obj3);
            case 23:
                LocalBrandProfileViewModel.Fulfillment.InStore inStore = (LocalBrandProfileViewModel.Fulfillment.InStore) obj5;
                Function1 function120 = (Function1) obj4;
                PaddingValues paddingValues2 = (PaddingValues) obj;
                Composer composer21 = (Composer) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                paddingValues2.getClass();
                if ((intValue20 & 6) == 0) {
                    intValue20 |= ((GapComposer) composer21).changed(paddingValues2) ? 4 : 2;
                }
                GapComposer gapComposer23 = (GapComposer) composer21;
                if (gapComposer23.shouldExecute(intValue20 & 1, (intValue20 & 19) != 18)) {
                    Modifier padding2 = SpacerKt.padding(companion, paddingValues2);
                    boolean changed9 = gapComposer23.changed(function120);
                    Object rememberedValue14 = gapComposer23.rememberedValue();
                    if (changed9 || rememberedValue14 == neverEqualPolicy) {
                        rememberedValue14 = new LocalBrandLocationCartViewKt$$ExternalSyntheticLambda1(14, function120);
                        gapComposer23.updateRememberedValue(rememberedValue14);
                    }
                    LocalBrandLocationRowKt.LocalBrandLocationCheckedInSheet(padding2, inStore, (Function0) rememberedValue14, gapComposer23, 0, 4);
                } else {
                    gapComposer23.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 24:
                return invoke$app$cash$local$views$cart$LocalBrandLocationCartViewKt$$ExternalSyntheticLambda10(obj, obj2, obj3);
            case 25:
                return invoke$app$cash$local$views$composeuiview$CardManagementSheetKt$$ExternalSyntheticLambda4(obj, obj2, obj3);
            case 26:
                return invoke$app$cash$local$views$composeuiview$LocalAddBrandsViewKt$$ExternalSyntheticLambda8(obj, obj2, obj3);
            case 27:
                return invoke$app$cash$local$views$composeuiview$LocalCashBalanceComposeUiKt$$ExternalSyntheticLambda2(obj, obj2, obj3);
            case 28:
                CardManagementSheetModel cardManagementSheetModel = (CardManagementSheetModel) obj5;
                Function1 function121 = (Function1) obj4;
                PaddingValues paddingValues3 = (PaddingValues) obj;
                Composer composer22 = (Composer) obj2;
                int intValue21 = ((Integer) obj3).intValue();
                paddingValues3.getClass();
                if ((intValue21 & 6) == 0) {
                    intValue21 |= ((GapComposer) composer22).changed(paddingValues3) ? 4 : 2;
                }
                GapComposer gapComposer24 = (GapComposer) composer22;
                if (gapComposer24.shouldExecute(intValue21 & 1, (intValue21 & 19) != 18)) {
                    LocalAddBrandsViewKt.CardManagementSheet(paddingValues3, cardManagementSheetModel, function121, gapComposer24, intValue21 & 14);
                } else {
                    gapComposer24.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            default:
                LocalEditorialContent.BrandCarousel brandCarousel = (LocalEditorialContent.BrandCarousel) obj5;
                Function1 function122 = (Function1) obj4;
                Composer composer23 = (Composer) obj2;
                int intValue22 = ((Integer) obj3).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                GapComposer gapComposer25 = (GapComposer) composer23;
                if (gapComposer25.shouldExecute(intValue22 & 1, (intValue22 & 17) != 16)) {
                    LocalAddBrandsViewKt.LocalEditorialBrandCarousel(null, brandCarousel, function122, gapComposer25, 0);
                } else {
                    gapComposer25.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
