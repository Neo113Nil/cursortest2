package com.squareup.cash.pools.views;

import android.icu.text.MessageFormat;
import android.view.View;
import androidx.activity.OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.animation.AnimatedContentScopeImpl;
import androidx.compose.foundation.layout.Arrangement$SpacedAligned;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.RowKt;
import androidx.compose.foundation.layout.RowMeasurePolicy;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.pager.PagerMeasureKt;
import androidx.compose.foundation.pager.PagerScopeImpl;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.glance.appwidget.WidgetLayoutKt;
import androidx.paging.compose.LazyPagingItems;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import androidx.tracing.Trace;
import app.cash.broadway.screen.Screen;
import app.cash.molecule.PlatformKt;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.androidsvg.SVG$Unit$EnumUnboxingLocalUtility;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.ScreenScaffoldKt;
import com.squareup.cash.arcade.components.ScrollingScaffoldContentScope;
import com.squareup.cash.arcade.components.SearchBarKt$$ExternalSyntheticLambda1;
import com.squareup.cash.borrow.views.BorrowUiFactory$$ExternalSyntheticLambda1;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.directory_ui.views.ComposeUtilsKt;
import com.squareup.cash.instruments.viewmodels.InstrumentCellViewModel;
import com.squareup.cash.instruments.views.InstrumentCellKt;
import com.squareup.cash.investing.components.inject.InvestingViewFactory;
import com.squareup.cash.investing.screen.keys.InvestingScreens;
import com.squareup.cash.investing.viewmodels.InvestingStockDetailsViewModel;
import com.squareup.cash.merchant.views.SquareLoyaltyDetailsView;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.mooncake.compose_ui.components.NavigationIconType;
import com.squareup.cash.mooncake.themes.ThemeHelpersKt;
import com.squareup.cash.offers.viewmodels.OffersSearchViewModel;
import com.squareup.cash.offers.views.UtilsKt;
import com.squareup.cash.onboarding.accountpicker.viewmodels.AccountPickerViewEvent;
import com.squareup.cash.onboarding.accountpicker.viewmodels.AccountPickerViewModel;
import com.squareup.cash.onboarding.accountpicker.viewmodels.AccountViewModel;
import com.squareup.cash.onboarding.accountpicker.views.AliasPickerViewKt;
import com.squareup.cash.p2pblocking.viewmodels.AllowlistSelectionViewModel;
import com.squareup.cash.p2pblocking.viewmodels.P2PListRowModel;
import com.squareup.cash.p2pblocking.views.P2PListRowKt;
import com.squareup.cash.p2pblocking.views.P2PListViewKt$$ExternalSyntheticLambda17;
import com.squareup.cash.paychecks.viewmodels.PaychecksHomeViewModel;
import com.squareup.cash.paychecks.views.HelpSheetViewKt;
import com.squareup.cash.pools.viewmodels.ContributionAnimation;
import com.squareup.cash.savings.viewmodels.TransferringViewModel;
import com.squareup.cash.savings.views.ButtonGroupKt;
import com.squareup.cash.score.views.ScoreUiFactory;
import com.squareup.cash.shopping.viewmodels.BulletModel;
import com.squareup.cash.shopping.views.BrandsSearchView$$ExternalSyntheticLambda6;
import com.squareup.cash.support.backend.api.disputesTracker.DisputeRow;
import com.squareup.cash.support.viewmodels.SupportDisputeTrackerViewModel;
import com.squareup.cash.support.views.ScreenshotReviewViewKt;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda10;
import com.squareup.cash.transactionpicker.viewmodels.TransactionViewModel;
import com.squareup.cash.transactionpicker.views.ArcadeTransactionPickerViewKt;
import com.squareup.cash.transfers.views.AddMoneyViewKt$$ExternalSyntheticLambda1;
import com.squareup.cash.upsell.viewmodels.NullStateViewModel$SwipeViewModel$Content;
import com.squareup.cash.work.viewmodels.ClockInOverlayViewModel;
import com.squareup.cash.work.viewmodels.ShiftCardModel;
import com.squareup.cash.work.viewmodels.ShiftSection2ViewModel;
import com.squareup.cash.work.views.clockin.DisclaimerTextKt;
import com.squareup.cash.work.views.shift.ShiftSectionView2Kt;
import com.squareup.protos.cash.discover.api.app.v1.model.Text;
import com.squareup.protos.cash.discover.api.app.v1.model.TextStyle;
import com.squareup.protos.cash.ui.Color;
import com.squareup.util.Strings;
import java.util.Iterator;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function4;
import kotlin.text.StringsKt;
import net.oneformapp.DLog;
import okhttp3.internal.http2.Http2Connection$$ExternalSyntheticLambda3;

/* loaded from: classes6.dex */
public final /* synthetic */ class PoolDetailsViewKt$$ExternalSyntheticLambda41 implements Function4 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ PoolDetailsViewKt$$ExternalSyntheticLambda41(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = obj2;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        int i4 = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Object obj5 = this.f$1;
        Object obj6 = this.f$0;
        switch (i4) {
            case 0:
                ContributionAnimation contributionAnimation = (ContributionAnimation) obj5;
                boolean booleanValue = ((Boolean) obj2).booleanValue();
                Composer composer = (Composer) obj3;
                ((Integer) obj4).getClass();
                ((AnimatedContentScopeImpl) obj).getClass();
                Strings.getSizes(composer).getClass();
                DefaultSizes.spacing.getClass();
                Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default((Modifier) obj6, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 16.0f, 7);
                Strings.getSizes(composer).getClass();
                RowMeasurePolicy rowMeasurePolicy = RowKt.rowMeasurePolicy(new Arrangement$SpacedAligned(4.0f, true, new OnBackPressedDispatcher$OnBackPressedEventInput$$ExternalSyntheticLambda0(Alignment.Companion.CenterHorizontally, 1)), Alignment.Companion.CenterVertically, composer, 48);
                GapComposer gapComposer = (GapComposer) composer;
                int hashCode = Long.hashCode(gapComposer.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(composer, m302paddingqDBjuR0$default);
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
                Updater.m576setimpl(composer, rowMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(composer, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(composer, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(composer, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(composer, materializeModifier, ComposeUiNode.Companion.SetModifier);
                if (!booleanValue || contributionAnimation == null) {
                    gapComposer2.startReplaceGroup(-1991633962);
                    Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3826, Strings.getColors(composer).semantic.text.subtle, composer, (Modifier) null, Strings.getTypography(composer).bodySmall, (TextLineBalancing) null, Room.stringResource(composer, R.string.pools_details_activity_footer_scroll), (Map) null, (Function1) null, false);
                    Trace.m1191Iconww6aTOc(Icons.TickerDown16, (String) null, (Modifier) null, Strings.getColors(composer).semantic.icon.subtle, composer, 54, 4);
                    gapComposer2.end(false);
                } else {
                    gapComposer2.startReplaceGroup(-1992220513);
                    String str = contributionAnimation.contributionAmountFormatted;
                    String format2 = new MessageFormat(Room.stringResource(composer, R.string.pools_details_activity_footer_contributed)).format(SVG$Unit$EnumUnboxingLocalUtility.m(1, str, "amount", str));
                    format2.getClass();
                    Room.m1165Text25TpFw(0, 0, 0, 3, 0, 0, 3826, Strings.getColors(composer).semantic.text.subtle, composer, (Modifier) null, Strings.getTypography(composer).bodySmall, (TextLineBalancing) null, format2, (Map) null, (Function1) null, false);
                    Trace.m1191Iconww6aTOc(Icons.TickerDown16, (String) null, (Modifier) null, Strings.getColors(composer).semantic.icon.subtle, composer, 54, 4);
                    gapComposer2.end(false);
                }
                gapComposer2.end(true);
                return Unit.INSTANCE;
            case 1:
                InvestingViewFactory investingViewFactory = (InvestingViewFactory) obj6;
                Screen screen = (Screen) obj5;
                InvestingStockDetailsViewModel investingStockDetailsViewModel = (InvestingStockDetailsViewModel) obj;
                Function1 function1 = (Function1) obj2;
                Composer composer2 = (Composer) obj3;
                int intValue = ((Integer) obj4).intValue();
                investingStockDetailsViewModel.getClass();
                function1.getClass();
                if ((intValue & 6) == 0) {
                    i = intValue | (((GapComposer) composer2).changed(investingStockDetailsViewModel) ? 4 : 2);
                } else {
                    i = intValue;
                }
                if ((intValue & 48) == 0) {
                    i |= ((GapComposer) composer2).changedInstance(function1) ? 32 : 16;
                }
                GapComposer gapComposer3 = (GapComposer) composer2;
                if (gapComposer3.shouldExecute(i & 1, (i & 147) != 146)) {
                    gapComposer3.startReplaceGroup(-155435377);
                    DLog.InvestmentEntityContent(investingStockDetailsViewModel.entity, function1, investingViewFactory.imageLoader, investingViewFactory.metricViewFactory, (InvestingScreens) screen, gapComposer3, i & 112);
                    gapComposer3.end(false);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 2:
                TextFieldState textFieldState = (TextFieldState) obj6;
                Function0 function0 = (Function0) obj5;
                OffersSearchViewModel offersSearchViewModel = (OffersSearchViewModel) obj;
                Function1 function12 = (Function1) obj2;
                int intValue2 = ((Integer) obj4).intValue();
                offersSearchViewModel.getClass();
                function12.getClass();
                GapComposer gapComposer4 = (GapComposer) ((Composer) obj3);
                boolean changed = gapComposer4.changed(textFieldState);
                Object rememberedValue = gapComposer4.rememberedValue();
                if (changed || rememberedValue == neverEqualPolicy) {
                    rememberedValue = new SearchBarKt$$ExternalSyntheticLambda1(16, textFieldState);
                    gapComposer4.updateRememberedValue(rememberedValue);
                }
                UtilsKt.OffersSearchView(offersSearchViewModel, textFieldState, null, function12, function0, (Function0) rememberedValue, gapComposer4, (intValue2 & 14) | ((intValue2 << 6) & 7168));
                return Unit.INSTANCE;
            case 3:
                final AccountPickerViewModel.AccountList accountList = (AccountPickerViewModel.AccountList) obj6;
                final Function1 function13 = (Function1) obj5;
                final int intValue3 = ((Integer) obj2).intValue();
                Composer composer3 = (Composer) obj3;
                int intValue4 = ((Integer) obj4).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                if ((intValue4 & 48) == 0) {
                    intValue4 |= ((GapComposer) composer3).changed(intValue3) ? 32 : 16;
                }
                GapComposer gapComposer5 = (GapComposer) composer3;
                if (gapComposer5.shouldExecute(intValue4 & 1, (intValue4 & EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) != 144)) {
                    AccountViewModel accountViewModel = (AccountViewModel) accountList.accountViewModels.get(intValue3);
                    boolean z = accountList.isInEditMode;
                    int i5 = intValue4 & 112;
                    boolean changed2 = gapComposer5.changed(function13) | gapComposer5.changedInstance(accountList) | (i5 == 32);
                    Object rememberedValue2 = gapComposer5.rememberedValue();
                    if (changed2 || rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new Function0() { // from class: com.squareup.cash.onboarding.accountpicker.views.AccountPickerViewKt$$ExternalSyntheticLambda20
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i6 = r4;
                                int i7 = intValue3;
                                AccountPickerViewModel.AccountList accountList2 = accountList;
                                Function1 function14 = function13;
                                switch (i6) {
                                    case 0:
                                        function14.invoke(new AccountPickerViewEvent.AccountSelected(((AccountViewModel) accountList2.accountViewModels.get(i7)).accountToken));
                                        break;
                                    default:
                                        function14.invoke(new AccountPickerViewEvent.RemoveAccount(((AccountViewModel) accountList2.accountViewModels.get(i7)).accountToken));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        gapComposer5.updateRememberedValue(rememberedValue2);
                    }
                    Function0 function02 = (Function0) rememberedValue2;
                    int i6 = (gapComposer5.changed(function13) ? 1 : 0) | (gapComposer5.changedInstance(accountList) ? 1 : 0) | (i5 == 32 ? 1 : 0);
                    Object rememberedValue3 = gapComposer5.rememberedValue();
                    if (i6 != 0 || rememberedValue3 == neverEqualPolicy) {
                        final int i7 = r14 ? 1 : 0;
                        rememberedValue3 = new Function0() { // from class: com.squareup.cash.onboarding.accountpicker.views.AccountPickerViewKt$$ExternalSyntheticLambda20
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                int i62 = i7;
                                int i72 = intValue3;
                                AccountPickerViewModel.AccountList accountList2 = accountList;
                                Function1 function14 = function13;
                                switch (i62) {
                                    case 0:
                                        function14.invoke(new AccountPickerViewEvent.AccountSelected(((AccountViewModel) accountList2.accountViewModels.get(i72)).accountToken));
                                        break;
                                    default:
                                        function14.invoke(new AccountPickerViewEvent.RemoveAccount(((AccountViewModel) accountList2.accountViewModels.get(i72)).accountToken));
                                        break;
                                }
                                return Unit.INSTANCE;
                            }
                        };
                        gapComposer5.updateRememberedValue(rememberedValue3);
                    }
                    AliasPickerViewKt.ArcadeAccountRowItem(function02, (Function0) rememberedValue3, accountViewModel, z, null, gapComposer5, 0);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                AllowlistSelectionViewModel allowlistSelectionViewModel = (AllowlistSelectionViewModel) obj6;
                Function1 function14 = (Function1) obj5;
                int intValue5 = ((Integer) obj2).intValue();
                Composer composer4 = (Composer) obj3;
                int intValue6 = ((Integer) obj4).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                if ((intValue6 & 48) == 0) {
                    intValue6 |= ((GapComposer) composer4).changed(intValue5) ? 32 : 16;
                }
                GapComposer gapComposer6 = (GapComposer) composer4;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) != 144)) {
                    P2PListRowModel p2PListRowModel = (P2PListRowModel) allowlistSelectionViewModel.selectedContacts.get(intValue5);
                    boolean changedInstance = gapComposer6.changedInstance(p2PListRowModel) | gapComposer6.changed(function14);
                    Object rememberedValue4 = gapComposer6.rememberedValue();
                    Object obj7 = rememberedValue4;
                    if (changedInstance || rememberedValue4 == neverEqualPolicy) {
                        P2PListViewKt$$ExternalSyntheticLambda17 p2PListViewKt$$ExternalSyntheticLambda17 = new P2PListViewKt$$ExternalSyntheticLambda17(p2PListRowModel, function14, 1);
                        gapComposer6.updateRememberedValue(p2PListViewKt$$ExternalSyntheticLambda17);
                        obj7 = p2PListViewKt$$ExternalSyntheticLambda17;
                    }
                    Function0 function03 = (Function0) obj7;
                    boolean changed3 = gapComposer6.changed(function14) | gapComposer6.changedInstance(p2PListRowModel);
                    Object rememberedValue5 = gapComposer6.rememberedValue();
                    Object obj8 = rememberedValue5;
                    if (changed3 || rememberedValue5 == neverEqualPolicy) {
                        P2PListViewKt$$ExternalSyntheticLambda17 p2PListViewKt$$ExternalSyntheticLambda172 = new P2PListViewKt$$ExternalSyntheticLambda17(function14, p2PListRowModel, 2);
                        gapComposer6.updateRememberedValue(p2PListViewKt$$ExternalSyntheticLambda172);
                        obj8 = p2PListViewKt$$ExternalSyntheticLambda172;
                    }
                    P2PListRowKt.P2PListRow(p2PListRowModel, function03, (Function0) obj8, gapComposer6, 0);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                Function1 function15 = (Function1) obj6;
                ScrollingScaffoldContentScope scrollingScaffoldContentScope = (ScrollingScaffoldContentScope) obj5;
                PaychecksHomeViewModel paychecksHomeViewModel = (PaychecksHomeViewModel) obj2;
                Composer composer5 = (Composer) obj3;
                ((Integer) obj4).getClass();
                ((AnimatedContentScopeImpl) obj).getClass();
                paychecksHomeViewModel.getClass();
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, composer5, 0);
                GapComposer gapComposer7 = (GapComposer) composer5;
                int hashCode2 = Long.hashCode(gapComposer7.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope2 = gapComposer7.currentCompositionLocalScope();
                Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                Modifier materializeModifier2 = PlatformKt.materializeModifier(composer5, companion);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$12 = ComposeUiNode.Companion.Constructor;
                GapComposer gapComposer8 = (GapComposer) composer5;
                if (gapComposer8.applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer8.startReusableNode();
                if (gapComposer8.inserting) {
                    gapComposer8.createNode(layoutNode$Companion$Constructor$12);
                } else {
                    gapComposer8.useNode();
                }
                Updater.m576setimpl(composer5, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(composer5, currentCompositionLocalScope2, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(composer5, Integer.valueOf(hashCode2), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(composer5, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(composer5, materializeModifier2, ComposeUiNode.Companion.SetModifier);
                PaychecksHomeViewModel.Content content = (PaychecksHomeViewModel.Content) paychecksHomeViewModel;
                DBUtil.SpacerWithinSectionMedium(0, 1, composer5, null);
                PaychecksHomeViewModel.Content.ArcadeHeader arcadeHeader = content.arcadeHeader;
                if (arcadeHeader == null) {
                    gapComposer8.startReplaceGroup(-1510330878);
                    gapComposer8.end(false);
                } else {
                    gapComposer8.startReplaceGroup(-1510330877);
                    if (arcadeHeader instanceof PaychecksHomeViewModel.Content.ArcadeHeader.BenefitsModuleNullStateViewModel) {
                        gapComposer8.startReplaceGroup(1425452069);
                        HelpSheetViewKt.BenefitsModuleNullStateHeader((PaychecksHomeViewModel.Content.ArcadeHeader.BenefitsModuleNullStateViewModel) arcadeHeader, function15, ScreenScaffoldKt.markAsScaffoldTitle(companion, scrollingScaffoldContentScope, composer5, 6), composer5, 0);
                        gapComposer8.end(false);
                    } else {
                        if (!(arcadeHeader instanceof PaychecksHomeViewModel.Content.ArcadeHeader.BenefitsModuleHeaderViewModel)) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer8, 1425449503, false);
                        }
                        gapComposer8.startReplaceGroup(1425460060);
                        HelpSheetViewKt.BenefitsModuleHeader((PaychecksHomeViewModel.Content.ArcadeHeader.BenefitsModuleHeaderViewModel) arcadeHeader, function15, ScreenScaffoldKt.markAsScaffoldTitle(companion, scrollingScaffoldContentScope, composer5, 6), composer5, 0, 0);
                        gapComposer8.end(false);
                    }
                    gapComposer8.end(false);
                }
                gapComposer8.startReplaceGroup(2029508369);
                Iterator it = content.sections.iterator();
                while (it.hasNext()) {
                    HelpSheetViewKt.Section((PaychecksHomeViewModel.Content.Section) it.next(), function15, composer5, 0);
                }
                gapComposer8.end(false);
                PaychecksHomeViewModel.Content.DisclosureFooter disclosureFooter = content.disclosureFooter;
                if (disclosureFooter == null) {
                    gapComposer8.startReplaceGroup(-1509665773);
                } else {
                    gapComposer8.startReplaceGroup(-1509665772);
                    HelpSheetViewKt.Disclosure(disclosureFooter, function15, composer5, 0);
                }
                gapComposer8.end(false);
                HelpSheetViewKt.TermsOfServiceDisclosures(content.termsOfServiceDisclosures, function15, composer5, 0);
                gapComposer8.end(true);
                return Unit.INSTANCE;
            case 6:
                TransferringViewModel transferringViewModel = (TransferringViewModel) obj6;
                ((Integer) obj4).intValue();
                ((AnimatedContentScopeImpl) obj).getClass();
                ((TransferringViewModel) obj2).getClass();
                transferringViewModel.getClass();
                ButtonGroupKt.Error((TransferringViewModel.Error) transferringViewModel, (Function1) obj5, (Composer) obj3, 0);
                return Unit.INSTANCE;
            case 7:
                ScoreUiFactory scoreUiFactory = (ScoreUiFactory) obj6;
                ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) obj5;
                Function1 function16 = (Function1) obj2;
                Composer composer6 = (Composer) obj3;
                int intValue7 = ((Integer) obj4).intValue();
                function16.getClass();
                if ((intValue7 & 6) == 0) {
                    i2 = intValue7 | ((intValue7 & 8) == 0 ? ((GapComposer) composer6).changed(obj) : ((GapComposer) composer6).changedInstance(obj) ? 4 : 2);
                } else {
                    i2 = intValue7;
                }
                if ((intValue7 & 48) == 0) {
                    i2 |= ((GapComposer) composer6).changedInstance(function16) ? 32 : 16;
                }
                GapComposer gapComposer9 = (GapComposer) composer6;
                if (gapComposer9.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
                    Updater.CompositionLocalProvider(LocalImageLoaderKt.LocalImageLoader.defaultProvidedValue$runtime(scoreUiFactory.imageLoader), Expect_jvmKt.rememberComposableLambda(767898301, new BorrowUiFactory$$ExternalSyntheticLambda1(composableLambdaImpl, obj, function16, 3), gapComposer9), gapComposer9, 56);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 8:
                BulletModel bulletModel = (BulletModel) obj6;
                SquareLoyaltyDetailsView squareLoyaltyDetailsView = (SquareLoyaltyDetailsView) obj5;
                Modifier modifier = (Modifier) obj;
                MutableState mutableState = (MutableState) obj2;
                Composer composer7 = (Composer) obj3;
                int intValue8 = ((Integer) obj4).intValue();
                modifier.getClass();
                mutableState.getClass();
                if ((intValue8 & 6) == 0) {
                    i3 = intValue8 | (((GapComposer) composer7).changed(modifier) ? 4 : 2);
                } else {
                    i3 = intValue8;
                }
                if ((intValue8 & 48) == 0) {
                    i3 |= ((GapComposer) composer7).changed(mutableState) ? 32 : 16;
                }
                GapComposer gapComposer10 = (GapComposer) composer7;
                if (gapComposer10.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
                    ColumnMeasurePolicy columnMeasurePolicy2 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, gapComposer10, 0);
                    int hashCode3 = Long.hashCode(gapComposer10.compositeKeyHashCode);
                    PersistentCompositionLocalHashMap currentCompositionLocalScope3 = gapComposer10.currentCompositionLocalScope();
                    Modifier materializeModifier3 = PlatformKt.materializeModifier(gapComposer10, modifier);
                    ComposeUiNode.Companion.getClass();
                    LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$13 = ComposeUiNode.Companion.Constructor;
                    if (gapComposer10.applier == null) {
                        Updater.invalidApplier();
                        throw null;
                    }
                    gapComposer10.startReusableNode();
                    if (gapComposer10.inserting) {
                        gapComposer10.createNode(layoutNode$Companion$Constructor$13);
                    } else {
                        gapComposer10.useNode();
                    }
                    Updater.m576setimpl(gapComposer10, columnMeasurePolicy2, ComposeUiNode.Companion.SetMeasurePolicy);
                    Updater.m576setimpl(gapComposer10, currentCompositionLocalScope3, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                    Updater.m576setimpl(gapComposer10, Integer.valueOf(hashCode3), ComposeUiNode.Companion.SetCompositeKeyHash);
                    Updater.m575reconcileimpl(gapComposer10, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                    Updater.m576setimpl(gapComposer10, materializeModifier3, ComposeUiNode.Companion.SetModifier);
                    Text text = bulletModel.title;
                    Text text2 = bulletModel.body;
                    String str2 = text.text;
                    str2.getClass();
                    TextStyle textStyle = text.text_style;
                    textStyle.getClass();
                    androidx.compose.ui.text.TextStyle composeTextStyle = ComposeUtilsKt.toComposeTextStyle(textStyle, gapComposer10);
                    Color color = text.text_color;
                    color.getClass();
                    androidx.compose.ui.graphics.Color forThemeComposable = PagerMeasureKt.forThemeComposable(new ColorModel.Accented(color), ThemeHelpersKt.themeInfo(squareLoyaltyDetailsView), gapComposer10);
                    forThemeComposable.getClass();
                    long j = forThemeComposable.value;
                    boolean z2 = (i3 & 112) == 32;
                    Object rememberedValue6 = gapComposer10.rememberedValue();
                    if (z2 || rememberedValue6 == neverEqualPolicy) {
                        rememberedValue6 = new TabToolbarsKt$$ExternalSyntheticLambda10(10, mutableState);
                        gapComposer10.updateRememberedValue(rememberedValue6);
                    }
                    KeypadKt.m3651TextPdH14aY(0, 0, 5, 0, 0, 0, 3810, j, (Composer) gapComposer10, (Modifier) null, composeTextStyle, (TextLineBalancing) null, str2, (Map) null, (Function1) rememberedValue6, false);
                    String str3 = text2.text;
                    if (str3 == null) {
                        gapComposer10.startReplaceGroup(-483940453);
                        gapComposer10.end(false);
                    } else {
                        gapComposer10.startReplaceGroup(-483940452);
                        if (StringsKt.isBlank(str3)) {
                            gapComposer10.startReplaceGroup(1647156549);
                            gapComposer10.end(false);
                        } else {
                            gapComposer10.startReplaceGroup(1646891313);
                            TextStyle textStyle2 = text2.text_style;
                            textStyle2.getClass();
                            androidx.compose.ui.text.TextStyle composeTextStyle2 = ComposeUtilsKt.toComposeTextStyle(textStyle2, gapComposer10);
                            Color color2 = text2.text_color;
                            color2.getClass();
                            androidx.compose.ui.graphics.Color forThemeComposable2 = PagerMeasureKt.forThemeComposable(new ColorModel.Accented(color2), ThemeHelpersKt.themeInfo(squareLoyaltyDetailsView), gapComposer10);
                            forThemeComposable2.getClass();
                            KeypadKt.m3651TextPdH14aY(0, 0, 5, 0, 0, 0, 3826, forThemeComposable2.value, (Composer) gapComposer10, (Modifier) null, composeTextStyle2, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                            gapComposer10.end(false);
                        }
                        gapComposer10.end(false);
                    }
                    gapComposer10.end(true);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 9:
                Function1 function17 = (Function1) obj6;
                RealImageLoader realImageLoader = (RealImageLoader) obj5;
                NullStateViewModel$SwipeViewModel$Content nullStateViewModel$SwipeViewModel$Content = (NullStateViewModel$SwipeViewModel$Content) obj;
                Function1 function18 = (Function1) obj2;
                Composer composer8 = (Composer) obj3;
                int intValue9 = ((Integer) obj4).intValue();
                function18.getClass();
                ColumnMeasurePolicy columnMeasurePolicy3 = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, composer8, 0);
                GapComposer gapComposer11 = (GapComposer) composer8;
                int hashCode4 = Long.hashCode(gapComposer11.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope4 = gapComposer11.currentCompositionLocalScope();
                Modifier.Companion companion2 = Modifier.Companion.$$INSTANCE;
                Modifier materializeModifier4 = PlatformKt.materializeModifier(composer8, companion2);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$14 = ComposeUiNode.Companion.Constructor;
                GapComposer gapComposer12 = (GapComposer) composer8;
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
                Updater.m576setimpl(composer8, columnMeasurePolicy3, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(composer8, currentCompositionLocalScope4, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(composer8, Integer.valueOf(hashCode4), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(composer8, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(composer8, materializeModifier4, ComposeUiNode.Companion.SetModifier);
                Modifier m302paddingqDBjuR0$default2 = SpacerKt.m302paddingqDBjuR0$default(companion2, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 12.0f, RecyclerView.DECELERATION_RATE, 11);
                NavigationIconType navigationIconType = NavigationIconType.CLOSE;
                boolean changed4 = gapComposer12.changed(function17);
                Object rememberedValue7 = gapComposer12.rememberedValue();
                if (changed4 || rememberedValue7 == neverEqualPolicy) {
                    rememberedValue7 = new BrandsSearchView$$ExternalSyntheticLambda6(29, function17);
                    gapComposer12.updateRememberedValue(rememberedValue7);
                }
                KeypadKt.m3654ToolbarA_Dysh8(null, m302paddingqDBjuR0$default2, navigationIconType, 0L, (Function0) rememberedValue7, null, composer8, 24630, 364);
                nullStateViewModel$SwipeViewModel$Content.getClass();
                WidgetLayoutKt.NullStateCarousel(nullStateViewModel$SwipeViewModel$Content, function18, null, realImageLoader, composer8, intValue9 & 112);
                gapComposer12.end(true);
                return Unit.INSTANCE;
            case 10:
                SupportDisputeTrackerViewModel.Loaded loaded = (SupportDisputeTrackerViewModel.Loaded) obj6;
                Function1 function19 = (Function1) obj5;
                int intValue10 = ((Integer) obj2).intValue();
                Composer composer9 = (Composer) obj3;
                int intValue11 = ((Integer) obj4).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                if ((intValue11 & 48) == 0) {
                    intValue11 |= ((GapComposer) composer9).changed(intValue10) ? 32 : 16;
                }
                GapComposer gapComposer13 = (GapComposer) composer9;
                if (gapComposer13.shouldExecute(intValue11 & 1, (intValue11 & EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) != 144)) {
                    ScreenshotReviewViewKt.Dispute((DisputeRow) loaded.disputes.get(intValue10), function19, gapComposer13, 0);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 11:
                LazyPagingItems lazyPagingItems = (LazyPagingItems) obj6;
                Function2 function2 = (Function2) obj5;
                int intValue12 = ((Integer) obj2).intValue();
                Composer composer10 = (Composer) obj3;
                int intValue13 = ((Integer) obj4).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                if ((intValue13 & 48) == 0) {
                    intValue13 |= ((GapComposer) composer10).changed(intValue12) ? 32 : 16;
                }
                GapComposer gapComposer14 = (GapComposer) composer10;
                if (gapComposer14.shouldExecute(intValue13 & 1, (intValue13 & EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) != 144)) {
                    TransactionViewModel transactionViewModel = (TransactionViewModel) lazyPagingItems.get(intValue12);
                    if (transactionViewModel == null) {
                        return Unit.INSTANCE;
                    }
                    boolean changed5 = gapComposer14.changed(function2) | gapComposer14.changed(transactionViewModel) | ((intValue13 & 112) == 32);
                    Object rememberedValue8 = gapComposer14.rememberedValue();
                    Object obj9 = rememberedValue8;
                    if (changed5 != 0 || rememberedValue8 == neverEqualPolicy) {
                        Http2Connection$$ExternalSyntheticLambda3 http2Connection$$ExternalSyntheticLambda3 = new Http2Connection$$ExternalSyntheticLambda3(function2, transactionViewModel, intValue12, 7);
                        gapComposer14.updateRememberedValue(http2Connection$$ExternalSyntheticLambda3);
                        obj9 = http2Connection$$ExternalSyntheticLambda3;
                    }
                    ArcadeTransactionPickerViewKt.Transaction(transactionViewModel, (Function0) obj9, gapComposer14, 0);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 12:
                View view = (View) obj6;
                Function1 function110 = (Function1) obj5;
                InstrumentCellViewModel instrumentCellViewModel = (InstrumentCellViewModel) obj2;
                int intValue14 = ((Integer) obj4).intValue();
                ((AnimatedContentScopeImpl) obj).getClass();
                instrumentCellViewModel.getClass();
                GapComposer gapComposer15 = (GapComposer) ((Composer) obj3);
                boolean changedInstance2 = gapComposer15.changedInstance(view) | gapComposer15.changed(function110);
                Object rememberedValue9 = gapComposer15.rememberedValue();
                if (changedInstance2 || rememberedValue9 == neverEqualPolicy) {
                    rememberedValue9 = new AddMoneyViewKt$$ExternalSyntheticLambda1(view, function110, 5);
                    gapComposer15.updateRememberedValue(rememberedValue9);
                }
                InstrumentCellKt.InstrumentCellSmall(null, instrumentCellViewModel, null, null, (Function0) rememberedValue9, gapComposer15, intValue14 & 112, 13);
                return Unit.INSTANCE;
            case 13:
                ClockInOverlayViewModel.Loaded loaded2 = (ClockInOverlayViewModel.Loaded) obj2;
                int intValue15 = ((Integer) obj4).intValue();
                ((AnimatedContentScopeImpl) obj).getClass();
                loaded2.getClass();
                DisclaimerTextKt.ClockInStatusDataContent(loaded2, (Function0) obj6, (Function0) obj5, (Composer) obj3, (intValue15 >> 3) & 14);
                return Unit.INSTANCE;
            default:
                int intValue16 = ((Integer) obj2).intValue();
                ((Integer) obj4).getClass();
                ((PagerScopeImpl) obj).getClass();
                ShiftSectionView2Kt.ShiftSection2Card((ShiftCardModel) ((ShiftSection2ViewModel.Loaded) obj6).shifts.get(intValue16), (Function1) obj5, (Composer) obj3, 0);
                return Unit.INSTANCE;
        }
    }
}
