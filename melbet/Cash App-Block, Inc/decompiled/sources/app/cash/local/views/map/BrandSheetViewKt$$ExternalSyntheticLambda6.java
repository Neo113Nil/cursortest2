package app.cash.local.views.map;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedVisibilityScope;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.ColumnScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.material.DrawerKt$$ExternalSyntheticLambda1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.geometry.Offset;
import androidx.compose.ui.input.pointer.PointerInputChange;
import androidx.compose.ui.layout.MeasurePolicy;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.TransactorKt;
import androidx.room.util.DBUtil;
import app.cash.local.views.brand.orders.BrandPinsKt;
import app.cash.local.views.cart.LocalBrandLocationCartViewKt$$ExternalSyntheticLambda1;
import app.cash.local.views.composeuiview.LocalAddBrandsViewKt;
import app.cash.local.views.fulfillment.FulfillmentRadioCellKt;
import app.cash.local.views.home.LocalHomeGeoViewKt$$ExternalSyntheticLambda28;
import app.cash.local.views.pos.LocalPosCheckInViewKt;
import app.cash.local.views.wallet.LocalHomeViewKt$$ExternalSyntheticLambda0;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda6;
import app.cash.molecule.PlatformKt;
import coil3.svg.internal.ParseSvg_androidKt;
import com.squareup.cash.R;
import com.squareup.cash.account.components.AccountToDoKt;
import com.squareup.cash.account.components.business.BusinessInfoView;
import com.squareup.cash.account.settings.viewmodels.business.BusinessInfoViewModel;
import com.squareup.cash.activity.views.AvatarsKt;
import com.squareup.cash.activity.views.BalanceFeedKt$$ExternalSyntheticLambda4;
import com.squareup.cash.activity.views.receipts.ReceiptUiKt$$ExternalSyntheticLambda3;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpaySearchViewModel;
import com.squareup.cash.afterpayapplet.views.AfterpaySearchViewKt;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.DynamicColorConfiguration;
import com.squareup.cash.arcade.components.ProgressCircularKt;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.arcade.components.cell.RealCellActivityAccessoryScope;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.components.titlebar.TitleBarActionScope;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.banking.views.BalanceHomeViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.banking.views.BankingDialogKt;
import com.squareup.cash.banking.views.TransfersView$$ExternalSyntheticLambda0;
import com.squareup.cash.benefits.views.BenefitsHubViewKt$$ExternalSyntheticLambda4;
import com.squareup.cash.bitcoin.viewmodels.applet.education.BitcoinStoriesWidgetViewModel;
import com.squareup.cash.bitcoin.views.BitcoinInvoiceEntryViewKt;
import com.squareup.cash.bitcoin.views.applet.education.BitcoinStoriesWidgetViewKt;
import com.squareup.cash.bitcoin.views.autowithdraw.BitcoinAutoWithdrawUpsellViewKt;
import com.squareup.cash.bitcoin.views.deposits.BitcoinDepositsViewKt$$ExternalSyntheticLambda11;
import com.squareup.cash.bitcoin.views.deposits.copy.BitcoinAddressCopySheetViewKt;
import com.squareup.cash.bitcoin.views.map.BitcoinLocationViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.bitcoin.views.map.BitcoinMapViewKt$$ExternalSyntheticLambda6;
import com.squareup.cash.bitcoin.views.stablecoin.SendStablecoinViewKt;
import com.squareup.cash.common.composeui.InfoUpsellCtaButtonScope;
import com.squareup.cash.common.composeui.shimmer.ShimmerCellsKt;
import com.squareup.cash.composeUi.foundation.layout.AdaptiveStackScope;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.tax.views.TaxAuthorizationView$Content$1$1;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Map;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import org.apache.commons.imaging.formats.jpeg.iptc.IptcConstants;

/* loaded from: classes3.dex */
public final /* synthetic */ class BrandSheetViewKt$$ExternalSyntheticLambda6 implements Function3 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Function1 f$0;

    public /* synthetic */ BrandSheetViewKt$$ExternalSyntheticLambda6(int i, Function1 function1) {
        this.$r8$classId = i;
        this.f$0 = function1;
    }

    private final Object invoke$com$squareup$cash$bitcoin$views$applet$education$BitcoinStoriesWidgetViewKt$$ExternalSyntheticLambda2(Object obj, Object obj2, Object obj3) {
        BitcoinStoriesWidgetViewModel bitcoinStoriesWidgetViewModel = (BitcoinStoriesWidgetViewModel) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        bitcoinStoriesWidgetViewModel.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(bitcoinStoriesWidgetViewModel) ? 4 : 2;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            boolean z = bitcoinStoriesWidgetViewModel instanceof BitcoinStoriesWidgetViewModel.Loading;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            if (z) {
                gapComposer.startReplaceGroup(-1523651919);
                ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                DefaultSizes.spacing.getClass();
                BitcoinStoriesWidgetViewKt.LoadingContent(SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), (BitcoinStoriesWidgetViewModel.Loading) bitcoinStoriesWidgetViewModel, gapComposer, (intValue << 3) & 112);
                gapComposer.end(false);
            } else {
                boolean z2 = bitcoinStoriesWidgetViewModel instanceof BitcoinStoriesWidgetViewModel.Content;
                Function1 function1 = this.f$0;
                if (z2) {
                    gapComposer.startReplaceGroup(-1523646005);
                    ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    BitcoinStoriesWidgetViewKt.StoryGrid(SpacerKt.m300paddingVpY3zN4$default(companion, 16.0f, RecyclerView.DECELERATION_RATE, 2), (BitcoinStoriesWidgetViewModel.Content) bitcoinStoriesWidgetViewModel, function1, gapComposer, (intValue << 3) & 112);
                    gapComposer.end(false);
                } else {
                    if (!bitcoinStoriesWidgetViewModel.equals(BitcoinStoriesWidgetViewModel.Failure.INSTANCE)) {
                        throw Recorder$$ExternalSyntheticOutline2.m(gapComposer, -1523653318, false);
                    }
                    gapComposer.startReplaceGroup(-1523639810);
                    BitcoinStoriesWidgetViewKt.ErrorContent(6, gapComposer, SizeKt.fillMaxWidth(companion, 1.0f), function1);
                    gapComposer.end(false);
                }
            }
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$bitcoin$views$autowithdraw$BitcoinAutoWithdrawUpsellViewKt$$ExternalSyntheticLambda3(Object obj, Object obj2, Object obj3) {
        AdaptiveStackScope adaptiveStackScope = (AdaptiveStackScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        adaptiveStackScope.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(adaptiveStackScope) ? 4 : 2;
        }
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            ButtonProminence buttonProminence = ButtonProminence.STANDARD;
            Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
            Modifier horizontalWeight = adaptiveStackScope.horizontalWeight(companion, 1.0f);
            Function1 function1 = this.f$0;
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            Object obj4 = Composer.Companion.Empty;
            if (changed || rememberedValue == obj4) {
                rememberedValue = new BitcoinDepositsViewKt$$ExternalSyntheticLambda11(21, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, horizontalWeight, buttonProminence, false, false, null, BitcoinAutoWithdrawUpsellViewKt.f257lambda$1972412560, gapComposer, 1573248, 56);
            ButtonProminence buttonProminence2 = ButtonProminence.PROMINENT;
            Modifier horizontalWeight2 = adaptiveStackScope.horizontalWeight(companion, 1.0f);
            boolean changed2 = gapComposer.changed(function1);
            Object rememberedValue2 = gapComposer.rememberedValue();
            if (changed2 || rememberedValue2 == obj4) {
                rememberedValue2 = new BitcoinDepositsViewKt$$ExternalSyntheticLambda11(22, function1);
                gapComposer.updateRememberedValue(rememberedValue2);
            }
            coil3.size.SizeKt.ButtonCta((Function0) rememberedValue2, horizontalWeight2, buttonProminence2, false, false, null, BitcoinAutoWithdrawUpsellViewKt.f256lambda$151156647, gapComposer, 1573248, 56);
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$bitcoin$views$map$BitcoinMapOnboardingViewKt$$ExternalSyntheticLambda4(Object obj, Object obj2, Object obj3) {
        InfoUpsellCtaButtonScope infoUpsellCtaButtonScope = (InfoUpsellCtaButtonScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        infoUpsellCtaButtonScope.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(infoUpsellCtaButtonScope) ? 4 : 2;
        }
        boolean z = true;
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            String stringResource = Room.stringResource(gapComposer, R.string.bitcoin_views_map_onboarding_button);
            Function1 function1 = this.f$0;
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BitcoinMapViewKt$$ExternalSyntheticLambda6(3, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function0 function0 = (Function0) rememberedValue;
            stringResource.getClass();
            function0.getClass();
            infoUpsellCtaButtonScope.prominentButton.setValue(new ComposableLambdaImpl(new LocalHomeViewKt$$ExternalSyntheticLambda0(z, infoUpsellCtaButtonScope, function0, stringResource, 16), true, 1226384573));
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    private final Object invoke$com$squareup$cash$bitcoin$views$roundups$BitcoinRoundUpsCardUpsellViewKt$$ExternalSyntheticLambda3(Object obj, Object obj2, Object obj3) {
        InfoUpsellCtaButtonScope infoUpsellCtaButtonScope = (InfoUpsellCtaButtonScope) obj;
        Composer composer = (Composer) obj2;
        int intValue = ((Integer) obj3).intValue();
        infoUpsellCtaButtonScope.getClass();
        if ((intValue & 6) == 0) {
            intValue |= ((GapComposer) composer).changed(infoUpsellCtaButtonScope) ? 4 : 2;
        }
        boolean z = false;
        GapComposer gapComposer = (GapComposer) composer;
        if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
            String stringResource = Room.stringResource(gapComposer, R.string.bitcoin_views_round_ups_card_upsell_button);
            Function1 function1 = this.f$0;
            boolean changed = gapComposer.changed(function1);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changed || rememberedValue == Composer.Companion.Empty) {
                rememberedValue = new BitcoinMapViewKt$$ExternalSyntheticLambda6(15, function1);
                gapComposer.updateRememberedValue(rememberedValue);
            }
            Function0 function0 = (Function0) rememberedValue;
            stringResource.getClass();
            function0.getClass();
            infoUpsellCtaButtonScope.prominentButton.setValue(new ComposableLambdaImpl(new LocalHomeViewKt$$ExternalSyntheticLambda0(z, infoUpsellCtaButtonScope, function0, stringResource, 16), true, 1226384573));
        } else {
            gapComposer.skipToGroupEnd();
        }
        return Unit.INSTANCE;
    }

    @Override // kotlin.jvm.functions.Function3
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.$r8$classId;
        int i2 = 5;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Function1 function1 = this.f$0;
        switch (i) {
            case 0:
                AdaptiveStackScope adaptiveStackScope = (AdaptiveStackScope) obj;
                Composer composer = (Composer) obj2;
                int intValue = ((Integer) obj3).intValue();
                adaptiveStackScope.getClass();
                if ((intValue & 6) == 0) {
                    intValue |= ((GapComposer) composer).changed(adaptiveStackScope) ? 4 : 2;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 19) != 18)) {
                    Modifier horizontalWeight = adaptiveStackScope.horizontalWeight(companion, 1.0f);
                    ButtonProminence buttonProminence = ButtonProminence.STANDARD;
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == neverEqualPolicy) {
                        rememberedValue = new BrandSheetViewKt$$ExternalSyntheticLambda0(2, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue, horizontalWeight, buttonProminence, false, false, null, LocalMapPinKt.f53lambda$509543051, gapComposer, 1573248, 56);
                    Modifier horizontalWeight2 = adaptiveStackScope.horizontalWeight(companion, 1.0f);
                    boolean changed2 = gapComposer.changed(function1);
                    Object rememberedValue2 = gapComposer.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new BrandSheetViewKt$$ExternalSyntheticLambda0(3, function1);
                        gapComposer.updateRememberedValue(rememberedValue2);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue2, horizontalWeight2, buttonProminence, false, false, null, LocalMapPinKt.lambda$916218348, gapComposer, 1573248, 56);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                function1.invoke(new Offset(((PointerInputChange) obj2).position));
                return Unit.INSTANCE;
            case 2:
                AdaptiveStackScope adaptiveStackScope2 = (AdaptiveStackScope) obj;
                Composer composer2 = (Composer) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                adaptiveStackScope2.getClass();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((GapComposer) composer2).changed(adaptiveStackScope2) ? 4 : 2;
                }
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 19) != 18)) {
                    Modifier horizontalWeight3 = adaptiveStackScope2.horizontalWeight(companion, 1.0f);
                    ButtonProminence buttonProminence2 = ButtonProminence.PROMINENT;
                    boolean changed3 = gapComposer2.changed(function1);
                    Object rememberedValue3 = gapComposer2.rememberedValue();
                    if (changed3 || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new DrawerKt$$ExternalSyntheticLambda1(function1, false, 20);
                        gapComposer2.updateRememberedValue(rememberedValue3);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue3, horizontalWeight3, buttonProminence2, false, false, null, BrandPinsKt.f37lambda$346101192, gapComposer2, 1573248, 56);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj3).getClass();
                ((AnimatedVisibilityScope) obj).getClass();
                NavigationType navigationType = NavigationType.BACK;
                GapComposer gapComposer3 = (GapComposer) ((Composer) obj2);
                boolean changed4 = gapComposer3.changed(function1);
                Object rememberedValue4 = gapComposer3.rememberedValue();
                if (changed4 || rememberedValue4 == neverEqualPolicy) {
                    rememberedValue4 = new LocalBrandLocationCartViewKt$$ExternalSyntheticLambda1(10, function1);
                    gapComposer3.updateRememberedValue(rememberedValue4);
                }
                DBUtil.NavigationIcon(navigationType, null, (Function0) rememberedValue4, gapComposer3, 6, 2);
                return Unit.INSTANCE;
            case 4:
                Composer composer3 = (Composer) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer4 = (GapComposer) composer3;
                if (gapComposer4.shouldExecute(intValue3 & 1, (intValue3 & 17) != 16)) {
                    Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                    ButtonProminence buttonProminence3 = ButtonProminence.STANDARD;
                    boolean changed5 = gapComposer4.changed(function1);
                    Object rememberedValue5 = gapComposer4.rememberedValue();
                    if (changed5 || rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new LocalHomeGeoViewKt$$ExternalSyntheticLambda28(3, function1);
                        gapComposer4.updateRememberedValue(rememberedValue5);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue5, fillMaxWidth, buttonProminence3, false, true, null, LocalAddBrandsViewKt.f44lambda$1258123010, gapComposer4, 1597872, 40);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                AdaptiveStackScope adaptiveStackScope3 = (AdaptiveStackScope) obj;
                Composer composer4 = (Composer) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                adaptiveStackScope3.getClass();
                if ((intValue4 & 6) == 0) {
                    intValue4 |= ((GapComposer) composer4).changed(adaptiveStackScope3) ? 4 : 2;
                }
                GapComposer gapComposer5 = (GapComposer) composer4;
                if (gapComposer5.shouldExecute(intValue4 & 1, (intValue4 & 19) != 18)) {
                    Modifier horizontalWeight4 = adaptiveStackScope3.horizontalWeight(companion, 1.0f);
                    ButtonProminence buttonProminence4 = ButtonProminence.PROMINENT;
                    boolean changed6 = gapComposer5.changed(function1);
                    Object rememberedValue6 = gapComposer5.rememberedValue();
                    if (changed6 || rememberedValue6 == neverEqualPolicy) {
                        rememberedValue6 = new LocalHomeGeoViewKt$$ExternalSyntheticLambda28(13, function1);
                        gapComposer5.updateRememberedValue(rememberedValue6);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue6, horizontalWeight4, buttonProminence4, false, false, null, LocalAddBrandsViewKt.lambda$1236167367, gapComposer5, 1573248, 56);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 6:
                TitleBarActionScope titleBarActionScope = (TitleBarActionScope) obj;
                Composer composer5 = (Composer) obj2;
                int intValue5 = ((Integer) obj3).intValue();
                titleBarActionScope.getClass();
                if ((intValue5 & 6) == 0) {
                    intValue5 |= ((GapComposer) composer5).changed(titleBarActionScope) ? 4 : 2;
                }
                GapComposer gapComposer6 = (GapComposer) composer5;
                if (gapComposer6.shouldExecute(intValue5 & 1, (intValue5 & 19) != 18)) {
                    int i3 = intValue5;
                    Icons icons = Icons.CardBasic24;
                    String stringResource = Room.stringResource(gapComposer6, R.string.local_views_manage_cards);
                    boolean changed7 = gapComposer6.changed(function1);
                    Object rememberedValue7 = gapComposer6.rememberedValue();
                    if (changed7 || rememberedValue7 == neverEqualPolicy) {
                        rememberedValue7 = new LocalHomeGeoViewKt$$ExternalSyntheticLambda28(11, function1);
                        gapComposer6.updateRememberedValue(rememberedValue7);
                    }
                    TransactorKt.IconAction(titleBarActionScope, icons, stringResource, (Function0) rememberedValue7, null, null, null, null, null, null, false, gapComposer6, (i3 & 14) | 48, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 7:
                LazyItemScopeImpl lazyItemScopeImpl = (LazyItemScopeImpl) obj;
                Composer composer6 = (Composer) obj2;
                int intValue6 = ((Integer) obj3).intValue();
                lazyItemScopeImpl.getClass();
                if ((intValue6 & 6) == 0) {
                    intValue6 |= ((GapComposer) composer6).changed(lazyItemScopeImpl) ? 4 : 2;
                }
                GapComposer gapComposer7 = (GapComposer) composer6;
                if (gapComposer7.shouldExecute(intValue6 & 1, (intValue6 & 19) != 18)) {
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(LazyItemScopeImpl.fillParentMaxSize$default(lazyItemScopeImpl), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 64.0f, 7);
                    MeasurePolicy maybeCachedBoxMeasurePolicy = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                    int hashCode = Long.hashCode(gapComposer7.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer7.currentCompositionLocalScope();
                    Modifier materializeModifier = PlatformKt.materializeModifier(gapComposer7, m302paddingqDBjuR0$default);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer7.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer7.startReusableNode();
                    if (gapComposer7.inserting) {
                        gapComposer7.createNode(layoutNode$Companion$Constructor$1);
                    } else {
                        gapComposer7.useNode();
                    }
                    Updater.m576setimpl(gapComposer7, maybeCachedBoxMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer7, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer7, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer7, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer7, materializeModifier, ComposeUiNode.Companion.SetModifier);
                    String stringResource2 = Room.stringResource(gapComposer7, R.string.local_views_retry_load_scheduling_times);
                    boolean changed8 = gapComposer7.changed(function1);
                    Object rememberedValue8 = gapComposer7.rememberedValue();
                    if (changed8 || rememberedValue8 == neverEqualPolicy) {
                        rememberedValue8 = new LocalHomeGeoViewKt$$ExternalSyntheticLambda28(18, function1);
                        gapComposer7.updateRememberedValue(rememberedValue8);
                    }
                    FulfillmentRadioCellKt.ErrorState(0, gapComposer7, null, stringResource2, (Function0) rememberedValue8);
                    gapComposer7.end(true);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                Composer composer7 = (Composer) obj2;
                int intValue7 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer8 = (GapComposer) composer7;
                if (gapComposer8.shouldExecute(intValue7 & 1, (intValue7 & 17) != 16)) {
                    Modifier fillMaxWidth2 = SizeKt.fillMaxWidth(companion, 1.0f);
                    ButtonProminence buttonProminence5 = ButtonProminence.STANDARD;
                    boolean changed9 = gapComposer8.changed(function1);
                    Object rememberedValue9 = gapComposer8.rememberedValue();
                    if (changed9 || rememberedValue9 == neverEqualPolicy) {
                        rememberedValue9 = new BrandSheetViewKt$$ExternalSyntheticLambda0(12, function1);
                        gapComposer8.updateRememberedValue(rememberedValue9);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue9, fillMaxWidth2, buttonProminence5, false, true, null, LocalPosCheckInViewKt.lambda$122604360, gapComposer8, 1597872, 40);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                Composer composer8 = (Composer) obj2;
                int intValue8 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer9 = (GapComposer) composer8;
                if (gapComposer9.shouldExecute(intValue8 & 1, (intValue8 & 17) != 16)) {
                    Modifier fillMaxWidth3 = SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean changed10 = gapComposer9.changed(function1);
                    Object rememberedValue10 = gapComposer9.rememberedValue();
                    if (changed10 || rememberedValue10 == neverEqualPolicy) {
                        rememberedValue10 = new TabContentViewKt$$ExternalSyntheticLambda6(4, function1);
                        gapComposer9.updateRememberedValue(rememberedValue10);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue10, fillMaxWidth3, null, false, false, null, AccountToDoKt.f108lambda$2077673889, gapComposer9, 1572912, 60);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 10:
                BusinessInfoViewModel.ConfirmationSheetViewModel confirmationSheetViewModel = (BusinessInfoViewModel.ConfirmationSheetViewModel) obj;
                int intValue9 = ((Integer) obj3).intValue();
                int i4 = BusinessInfoView.$r8$clinit;
                confirmationSheetViewModel.getClass();
                ParseSvg_androidKt.BusinessInfoConfirmationSheet(null, confirmationSheetViewModel, function1, (Composer) obj2, (intValue9 << 3) & 112);
                return Unit.INSTANCE;
            case 11:
                LazyItemScopeImpl lazyItemScopeImpl2 = (LazyItemScopeImpl) obj;
                Composer composer9 = (Composer) obj2;
                int intValue10 = ((Integer) obj3).intValue();
                lazyItemScopeImpl2.getClass();
                if ((intValue10 & 6) == 0) {
                    intValue10 |= ((GapComposer) composer9).changed(lazyItemScopeImpl2) ? 4 : 2;
                }
                GapComposer gapComposer10 = (GapComposer) composer9;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 19) != 18)) {
                    Unit unit = Unit.INSTANCE;
                    boolean changed11 = gapComposer10.changed(function1);
                    Object rememberedValue11 = gapComposer10.rememberedValue();
                    if (changed11 || rememberedValue11 == neverEqualPolicy) {
                        rememberedValue11 = new TaxAuthorizationView$Content$1$1(function1, (Continuation) null, 2);
                        gapComposer10.updateRememberedValue(rememberedValue11);
                    }
                    Updater.LaunchedEffect(gapComposer10, unit, (Function2) rememberedValue11);
                    Modifier animateItem$default = LazyItemScopeImpl.animateItem$default(lazyItemScopeImpl2, SizeKt.fillMaxWidth(companion, 1.0f));
                    MeasurePolicy maybeCachedBoxMeasurePolicy2 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                    int hashCode2 = Long.hashCode(gapComposer10.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer10.currentCompositionLocalScope();
                    Modifier materializeModifier2 = PlatformKt.materializeModifier(gapComposer10, animateItem$default);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
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
                    Updater.m576setimpl(gapComposer10, maybeCachedBoxMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer10, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer10, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer10, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer10, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                    ShimmerCellsKt.ShimmerCells(0, 1, gapComposer10, null);
                    gapComposer10.end(true);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                LazyItemScopeImpl lazyItemScopeImpl3 = (LazyItemScopeImpl) obj;
                Composer composer10 = (Composer) obj2;
                int intValue11 = ((Integer) obj3).intValue();
                lazyItemScopeImpl3.getClass();
                if ((intValue11 & 6) == 0) {
                    intValue11 |= ((GapComposer) composer10).changed(lazyItemScopeImpl3) ? 4 : 2;
                }
                GapComposer gapComposer11 = (GapComposer) composer10;
                if (gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 19) != 18)) {
                    Unit unit2 = Unit.INSTANCE;
                    boolean changed12 = gapComposer11.changed(function1);
                    Object rememberedValue12 = gapComposer11.rememberedValue();
                    if (changed12 || rememberedValue12 == neverEqualPolicy) {
                        rememberedValue12 = new TaxAuthorizationView$Content$1$1(function1, (Continuation) null, 4);
                        gapComposer11.updateRememberedValue(rememberedValue12);
                    }
                    Updater.LaunchedEffect(gapComposer11, unit2, (Function2) rememberedValue12);
                    Modifier animateItem$default2 = LazyItemScopeImpl.animateItem$default(lazyItemScopeImpl3, SpacerKt.m299paddingVpY3zN4(SizeKt.fillMaxWidth(companion, 1.0f), 48.0f, 32.0f));
                    MeasurePolicy maybeCachedBoxMeasurePolicy3 = BoxKt.maybeCachedBoxMeasurePolicy(Alignment.Companion.Center, false);
                    int hashCode3 = Long.hashCode(gapComposer11.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer11.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer11, animateItem$default2);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer11.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer11.startReusableNode();
                    if (gapComposer11.inserting) {
                        gapComposer11.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer11.useNode();
                    }
                    Updater.m576setimpl(gapComposer11, maybeCachedBoxMeasurePolicy3, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer11, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer11, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer11, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer11, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                    ProgressCircularKt.ProgressCircular(0, 1, gapComposer11, null);
                    gapComposer11.end(true);
                } else {
                    gapComposer11.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 13:
                LazyItemScopeImpl lazyItemScopeImpl4 = (LazyItemScopeImpl) obj;
                Composer composer11 = (Composer) obj2;
                int intValue12 = ((Integer) obj3).intValue();
                lazyItemScopeImpl4.getClass();
                if ((intValue12 & 6) == 0) {
                    intValue12 |= ((GapComposer) composer11).changed(lazyItemScopeImpl4) ? 4 : 2;
                }
                GapComposer gapComposer12 = (GapComposer) composer11;
                if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 19) != 18)) {
                    Modifier animateItem$default3 = LazyItemScopeImpl.animateItem$default(lazyItemScopeImpl4, SpacerKt.m300paddingVpY3zN4$default(SizeKt.fillMaxWidth(companion, 1.0f), RecyclerView.DECELERATION_RATE, 32.0f, 1));
                    ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(new Arrangement$SpacedAligned(16.0f, true, new Drop$$ExternalSyntheticBUOutline0(3)), Alignment.Companion.CenterHorizontally, gapComposer12, 54);
                    int hashCode4 = Long.hashCode(gapComposer12.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer12.currentCompositionLocalScope();
                    Modifier materializeModifier4 = PlatformKt.materializeModifier(gapComposer12, animateItem$default3);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$14 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer12.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer12.startReusableNode();
                    if (gapComposer12.inserting) {
                        gapComposer12.createNode(layoutNode$Companion$Constructor$14);
                    } else {
                        gapComposer12.useNode();
                    }
                    Updater.m576setimpl(gapComposer12, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer12, currentCompositionLocalScope4, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer12, Integer.valueOf(hashCode4), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer12, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer12, materializeModifier4, ComposeUiNode.Companion.SetModifier);
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer12, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer12, R.string.activity_error_title), (Map) null, (Function1) null, false);
                    boolean changed13 = gapComposer12.changed(function1);
                    Object rememberedValue13 = gapComposer12.rememberedValue();
                    if (changed13 || rememberedValue13 == neverEqualPolicy) {
                        rememberedValue13 = new BalanceFeedKt$$ExternalSyntheticLambda4(18, function1);
                        gapComposer12.updateRememberedValue(rememberedValue13);
                    }
                    coil3.size.SizeKt.ButtonCompact((Function0) rememberedValue13, null, null, false, false, null, AvatarsKt.lambda$1218088259, gapComposer12, 1572864, 62);
                    gapComposer12.end(true);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 14:
                Composer composer12 = (Composer) obj2;
                int intValue13 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer13 = (GapComposer) composer12;
                if (gapComposer13.shouldExecute(intValue13 & 1, (intValue13 & 17) != 16)) {
                    NavigationType navigationType2 = NavigationType.BACK;
                    boolean changed14 = gapComposer13.changed(function1);
                    Object rememberedValue14 = gapComposer13.rememberedValue();
                    if (changed14 || rememberedValue14 == neverEqualPolicy) {
                        rememberedValue14 = new ReceiptUiKt$$ExternalSyntheticLambda3(i2, function1);
                        gapComposer13.updateRememberedValue(rememberedValue14);
                    }
                    DBUtil.TitleBarSub((String) null, navigationType2, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue14, (Modifier) null, (Function3) null, gapComposer13, 54, 108);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 15:
                Composer composer13 = (Composer) obj2;
                int intValue14 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer14 = (GapComposer) composer13;
                if (gapComposer14.shouldExecute(intValue14 & 1, (intValue14 & 17) != 16)) {
                    NavigationType navigationType3 = NavigationType.CLOSE;
                    boolean changed15 = gapComposer14.changed(function1);
                    Object rememberedValue15 = gapComposer14.rememberedValue();
                    if (changed15 || rememberedValue15 == neverEqualPolicy) {
                        rememberedValue15 = new ReceiptUiKt$$ExternalSyntheticLambda3(r13, function1);
                        gapComposer14.updateRememberedValue(rememberedValue15);
                    }
                    DBUtil.TitleBarSub((String) null, navigationType3, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue15, (Modifier) null, (Function3) null, gapComposer14, 54, 108);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 16:
                AfterpaySearchViewModel.FilterBottomSheetViewModel filterBottomSheetViewModel = (AfterpaySearchViewModel.FilterBottomSheetViewModel) obj;
                int intValue15 = ((Integer) obj3).intValue();
                filterBottomSheetViewModel.getClass();
                AfterpaySearchViewKt.FilterBottomSheetContent(filterBottomSheetViewModel, function1, (Composer) obj2, intValue15 & 14);
                return Unit.INSTANCE;
            case 17:
                Composer composer14 = (Composer) obj2;
                int intValue16 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer15 = (GapComposer) composer14;
                if (gapComposer15.shouldExecute(intValue16 & 1, (intValue16 & 17) != 16)) {
                    NavigationType navigationType4 = NavigationType.BACK;
                    boolean changed16 = gapComposer15.changed(function1);
                    Object rememberedValue16 = gapComposer15.rememberedValue();
                    if (changed16 || rememberedValue16 == neverEqualPolicy) {
                        rememberedValue16 = new BalanceHomeViewKt$$ExternalSyntheticLambda1(6, function1);
                        gapComposer15.updateRememberedValue(rememberedValue16);
                    }
                    DBUtil.TitleBarSub((String) null, navigationType4, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue16, (Modifier) null, (Function3) null, gapComposer15, 54, 108);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 18:
                TitleBarActionScope titleBarActionScope2 = (TitleBarActionScope) obj;
                Composer composer15 = (Composer) obj2;
                int intValue17 = ((Integer) obj3).intValue();
                titleBarActionScope2.getClass();
                if ((intValue17 & 6) == 0) {
                    intValue17 |= ((GapComposer) composer15).changed(titleBarActionScope2) ? 4 : 2;
                }
                GapComposer gapComposer16 = (GapComposer) composer15;
                if (gapComposer16.shouldExecute(intValue17 & 1, (intValue17 & 19) != 18)) {
                    int i5 = intValue17;
                    Icons icons2 = Icons.NavigationHelp;
                    String stringResource3 = Room.stringResource(gapComposer16, R.string.blockers_help);
                    boolean changed17 = gapComposer16.changed(function1);
                    Object rememberedValue17 = gapComposer16.rememberedValue();
                    if (changed17 || rememberedValue17 == neverEqualPolicy) {
                        rememberedValue17 = new BalanceHomeViewKt$$ExternalSyntheticLambda1(8, function1);
                        gapComposer16.updateRememberedValue(rememberedValue17);
                    }
                    TransactorKt.IconAction(titleBarActionScope2, icons2, stringResource3, (Function0) rememberedValue17, null, null, null, null, null, null, false, gapComposer16, (i5 & 14) | 48, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 19:
                RealCellActivityAccessoryScope realCellActivityAccessoryScope = (RealCellActivityAccessoryScope) obj;
                Composer composer16 = (Composer) obj2;
                int intValue18 = ((Integer) obj3).intValue();
                realCellActivityAccessoryScope.getClass();
                if ((intValue18 & 6) == 0) {
                    intValue18 |= ((GapComposer) composer16).changed(realCellActivityAccessoryScope) ? 4 : 2;
                }
                GapComposer gapComposer17 = (GapComposer) composer16;
                if (gapComposer17.shouldExecute(intValue18 & 1, (intValue18 & 19) != 18)) {
                    function1.invoke(realCellActivityAccessoryScope);
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 20:
                Composer composer17 = (Composer) obj2;
                int intValue19 = ((Integer) obj3).intValue();
                ((AdaptiveStackScope) obj).getClass();
                GapComposer gapComposer18 = (GapComposer) composer17;
                if (gapComposer18.shouldExecute(intValue19 & 1, (intValue19 & 17) != 16)) {
                    Modifier fillMaxWidth4 = SizeKt.fillMaxWidth(companion, 1.0f);
                    boolean changed18 = gapComposer18.changed(function1);
                    Object rememberedValue18 = gapComposer18.rememberedValue();
                    if (changed18 || rememberedValue18 == neverEqualPolicy) {
                        rememberedValue18 = new TransfersView$$ExternalSyntheticLambda0(1, function1);
                        gapComposer18.updateRememberedValue(rememberedValue18);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue18, fillMaxWidth4, null, false, false, null, BankingDialogKt.f241lambda$1866858722, gapComposer18, 1572912, 60);
                } else {
                    gapComposer18.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 21:
                TitleBarActionScope titleBarActionScope3 = (TitleBarActionScope) obj;
                Composer composer18 = (Composer) obj2;
                int intValue20 = ((Integer) obj3).intValue();
                titleBarActionScope3.getClass();
                if ((intValue20 & 6) == 0) {
                    intValue20 |= ((GapComposer) composer18).changed(titleBarActionScope3) ? 4 : 2;
                }
                GapComposer gapComposer19 = (GapComposer) composer18;
                if (gapComposer19.shouldExecute(intValue20 & 1, (intValue20 & 19) != 18)) {
                    int i6 = intValue20;
                    Icons icons3 = Icons.NavigationHelp;
                    String stringResource4 = Room.stringResource(gapComposer19, R.string.recurring_transfer_help_label);
                    boolean changed19 = gapComposer19.changed(function1);
                    Object rememberedValue19 = gapComposer19.rememberedValue();
                    if (changed19 || rememberedValue19 == neverEqualPolicy) {
                        rememberedValue19 = new TransfersView$$ExternalSyntheticLambda0(14, function1);
                        gapComposer19.updateRememberedValue(rememberedValue19);
                    }
                    TransactorKt.IconAction(titleBarActionScope3, icons3, stringResource4, (Function0) rememberedValue19, null, null, null, null, null, null, false, gapComposer19, (i6 & 14) | 48, IptcConstants.IMAGE_RESOURCE_BLOCK_COLOR_TRANSFER_FUNCS);
                } else {
                    gapComposer19.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 22:
                Composer composer19 = (Composer) obj2;
                int intValue21 = ((Integer) obj3).intValue();
                ((ColumnScope) obj).getClass();
                GapComposer gapComposer20 = (GapComposer) composer19;
                if (gapComposer20.shouldExecute(intValue21 & 1, (intValue21 & 17) != 16)) {
                    String stringResource5 = Room.stringResource(gapComposer20, R.string.bills_subscriptions_merchant_list_title);
                    NavigationType navigationType5 = NavigationType.BACK;
                    boolean changed20 = gapComposer20.changed(function1);
                    Object rememberedValue20 = gapComposer20.rememberedValue();
                    if (changed20 || rememberedValue20 == neverEqualPolicy) {
                        rememberedValue20 = new BenefitsHubViewKt$$ExternalSyntheticLambda4(16, function1);
                        gapComposer20.updateRememberedValue(rememberedValue20);
                    }
                    DBUtil.TitleBarSub(stringResource5, navigationType5, (Modifier) null, (DynamicColorConfiguration) null, (Function0) rememberedValue20, (Modifier) null, (Function3) null, gapComposer20, 48, 108);
                } else {
                    gapComposer20.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 23:
                AdaptiveStackScope adaptiveStackScope4 = (AdaptiveStackScope) obj;
                Composer composer20 = (Composer) obj2;
                int intValue22 = ((Integer) obj3).intValue();
                adaptiveStackScope4.getClass();
                if ((intValue22 & 6) == 0) {
                    intValue22 |= ((GapComposer) composer20).changed(adaptiveStackScope4) ? 4 : 2;
                }
                GapComposer gapComposer21 = (GapComposer) composer20;
                if (gapComposer21.shouldExecute(intValue22 & 1, (intValue22 & 19) != 18)) {
                    ButtonProminence buttonProminence6 = ButtonProminence.SUBTLE;
                    Modifier horizontalWeight5 = adaptiveStackScope4.horizontalWeight(companion, 1.0f);
                    boolean changed21 = gapComposer21.changed(function1);
                    Object rememberedValue21 = gapComposer21.rememberedValue();
                    if (changed21 || rememberedValue21 == neverEqualPolicy) {
                        rememberedValue21 = new BenefitsHubViewKt$$ExternalSyntheticLambda4(20, function1);
                        gapComposer21.updateRememberedValue(rememberedValue21);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue21, horizontalWeight5, buttonProminence6, false, false, null, BitcoinInvoiceEntryViewKt.f253lambda$945792616, gapComposer21, 1573248, 56);
                } else {
                    gapComposer21.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 24:
                return invoke$com$squareup$cash$bitcoin$views$applet$education$BitcoinStoriesWidgetViewKt$$ExternalSyntheticLambda2(obj, obj2, obj3);
            case 25:
                return invoke$com$squareup$cash$bitcoin$views$autowithdraw$BitcoinAutoWithdrawUpsellViewKt$$ExternalSyntheticLambda3(obj, obj2, obj3);
            case 26:
                AdaptiveStackScope adaptiveStackScope5 = (AdaptiveStackScope) obj;
                Composer composer21 = (Composer) obj2;
                int intValue23 = ((Integer) obj3).intValue();
                adaptiveStackScope5.getClass();
                if ((intValue23 & 6) == 0) {
                    intValue23 |= ((GapComposer) composer21).changed(adaptiveStackScope5) ? 4 : 2;
                }
                GapComposer gapComposer22 = (GapComposer) composer21;
                if (gapComposer22.shouldExecute(intValue23 & 1, (intValue23 & 19) != 18)) {
                    boolean changed22 = gapComposer22.changed(function1);
                    Object rememberedValue22 = gapComposer22.rememberedValue();
                    if (changed22 || rememberedValue22 == neverEqualPolicy) {
                        rememberedValue22 = new BitcoinLocationViewKt$$ExternalSyntheticLambda1(5, function1);
                        gapComposer22.updateRememberedValue(rememberedValue22);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue22, adaptiveStackScope5.horizontalWeight(companion, 1.0f), null, false, false, null, BitcoinAddressCopySheetViewKt.f260lambda$432696881, gapComposer22, 1572864, 60);
                } else {
                    gapComposer22.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 27:
                return invoke$com$squareup$cash$bitcoin$views$map$BitcoinMapOnboardingViewKt$$ExternalSyntheticLambda4(obj, obj2, obj3);
            case 28:
                return invoke$com$squareup$cash$bitcoin$views$roundups$BitcoinRoundUpsCardUpsellViewKt$$ExternalSyntheticLambda3(obj, obj2, obj3);
            default:
                AdaptiveStackScope adaptiveStackScope6 = (AdaptiveStackScope) obj;
                Composer composer22 = (Composer) obj2;
                int intValue24 = ((Integer) obj3).intValue();
                adaptiveStackScope6.getClass();
                if ((intValue24 & 6) == 0) {
                    intValue24 |= ((GapComposer) composer22).changed(adaptiveStackScope6) ? 4 : 2;
                }
                GapComposer gapComposer23 = (GapComposer) composer22;
                if (gapComposer23.shouldExecute(intValue24 & 1, (intValue24 & 19) != 18)) {
                    boolean changed23 = gapComposer23.changed(function1);
                    Object rememberedValue23 = gapComposer23.rememberedValue();
                    if (changed23 || rememberedValue23 == neverEqualPolicy) {
                        rememberedValue23 = new BitcoinMapViewKt$$ExternalSyntheticLambda6(25, function1);
                        gapComposer23.updateRememberedValue(rememberedValue23);
                    }
                    SendStablecoinViewKt.CopyButton(0, gapComposer23, adaptiveStackScope6.horizontalWeight(companion, 1.0f), (Function0) rememberedValue23);
                    ButtonProminence buttonProminence7 = ButtonProminence.PROMINENT;
                    Modifier horizontalWeight6 = adaptiveStackScope6.horizontalWeight(companion, 1.0f);
                    boolean changed24 = gapComposer23.changed(function1);
                    Object rememberedValue24 = gapComposer23.rememberedValue();
                    if (changed24 || rememberedValue24 == neverEqualPolicy) {
                        rememberedValue24 = new BitcoinMapViewKt$$ExternalSyntheticLambda6(26, function1);
                        gapComposer23.updateRememberedValue(rememberedValue24);
                    }
                    coil3.size.SizeKt.ButtonCta((Function0) rememberedValue24, horizontalWeight6, buttonProminence7, false, false, null, SendStablecoinViewKt.f273lambda$878268899, gapComposer23, 1573248, 56);
                } else {
                    gapComposer23.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }
}
