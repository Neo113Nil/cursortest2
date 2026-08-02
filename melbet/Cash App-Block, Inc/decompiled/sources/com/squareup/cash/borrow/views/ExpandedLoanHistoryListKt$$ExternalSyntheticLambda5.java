package com.squareup.cash.borrow.views;

import android.content.res.Resources;
import android.icu.text.MessageFormat;
import androidx.compose.animation.AnimatedContentScopeImpl;
import androidx.compose.animation.SharedTransitionScope;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.ColumnKt;
import androidx.compose.foundation.layout.ColumnMeasurePolicy;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.foundation.pager.PagerScopeImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.PersistentCompositionLocalHashMap;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.node.ComposeUiNode;
import androidx.compose.ui.node.LayoutNode$Companion$Constructor$1;
import androidx.paging.compose.LazyPagingItems;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.molecule.PlatformKt;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.compose.UtilsKt$$ExternalSyntheticLambda1;
import com.google.android.gms.internal.mlkit_vision_barcode.zzsc;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel;
import com.squareup.cash.afterpayapplet.views.AfterpaySearchViewKt$$ExternalSyntheticLambda43;
import com.squareup.cash.afterpayapplet.views.homesection.v3.AfterpayCardKt;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.borrow.viewmodels.ExpandedLoanHistoryListModel;
import com.squareup.cash.family.profileselection.api.FamilyProfile;
import com.squareup.cash.filament.RealFilamentSupportProvider;
import com.squareup.cash.money.applets.common.viewmodels.PromotedAppletTileViewModel;
import com.squareup.cash.money.core.states.AppletAvailabilityState;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.wallet.presenters.CardAppletTilePresenter;
import com.squareup.cash.wallet.presenters.CardAppletTilePresenter$models$1$1;
import com.squareup.cash.wallet.presenters.CardDetailsModel;
import com.squareup.cash.wallet.presenters.CardDetailsModel$CardPillModel$Installed$Locked;
import com.squareup.cash.wallet.presenters.CardDetailsModel$CardPillModel$Installed$Suspended;
import com.squareup.cash.wallet.presenters.CardDetailsModel$CardPillModel$Installed$WithCardInfo;
import com.squareup.cash.wallet.viewmodels.CardAppletTileViewModel;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.cards.CardTheme;
import com.squareup.protos.lending.sync_values.BorrowAppletLoanHistoryTile;
import java.util.ArrayList;
import java.util.List;
import kotlin.Lazy;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt___StringsKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.JobKt;

/* loaded from: classes7.dex */
public final /* synthetic */ class ExpandedLoanHistoryListKt$$ExternalSyntheticLambda5 implements Function4 {
    public final /* synthetic */ int $r8$classId = 2;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;

    public /* synthetic */ ExpandedLoanHistoryListKt$$ExternalSyntheticLambda5(AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PrepurchaseToggleSection prepurchaseToggleSection, boolean z, Function1 function1, SharedTransitionScope sharedTransitionScope) {
        this.f$1 = prepurchaseToggleSection;
        this.f$0 = z;
        this.f$3 = function1;
        this.f$2 = sharedTransitionScope;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        BorrowAppletLoanHistoryTile.Data.Loan loan;
        String str;
        int i = this.$r8$classId;
        Object obj5 = Composer.Companion.Empty;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Continuation continuation = null;
        boolean z = this.f$0;
        boolean z2 = false;
        Object obj6 = this.f$3;
        Object obj7 = this.f$2;
        Object obj8 = this.f$1;
        switch (i) {
            case 0:
                LazyPagingItems lazyPagingItems = (LazyPagingItems) obj8;
                ExpandedLoanHistoryListModel expandedLoanHistoryListModel = (ExpandedLoanHistoryListModel) obj7;
                Function1 function1 = (Function1) obj6;
                int intValue = ((Integer) obj2).intValue();
                Composer composer = (Composer) obj3;
                int intValue2 = ((Integer) obj4).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                if ((intValue2 & 48) == 0) {
                    intValue2 |= ((GapComposer) composer).changed(intValue) ? 32 : 16;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue2 & 1, (intValue2 & EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) != 144)) {
                    if (z) {
                        loan = (BorrowAppletLoanHistoryTile.Data.Loan) lazyPagingItems.get(intValue);
                        if (loan == null) {
                            return Unit.INSTANCE;
                        }
                    } else {
                        loan = (BorrowAppletLoanHistoryTile.Data.Loan) expandedLoanHistoryListModel.initialLoans.get(intValue);
                    }
                    boolean changed = gapComposer.changed(function1) | gapComposer.changedInstance(loan);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == obj5) {
                        rememberedValue = new LoanHistoryTileKt$$ExternalSyntheticLambda5(function1, loan, 1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    Function1 function12 = (Function1) rememberedValue;
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    BorrowHomeKt.LoanHistoryTileRow(loan, function12, ImageKt.m177backgroundbw27NRU(companion, colors.component.cell.background.f171default, ColorKt.RectangleShape), gapComposer, 0, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.CalendarDate calendarDate = (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.CalendarDate) obj7;
                Function1 function13 = (Function1) obj6;
                int intValue3 = ((Integer) obj2).intValue();
                Composer composer2 = (Composer) obj3;
                ((Integer) obj4).getClass();
                ((PagerScopeImpl) obj).getClass();
                List list = (List) CollectionsKt.getOrNull(intValue3, (ArrayList) obj8);
                if (list == null) {
                    list = EmptyList.INSTANCE;
                }
                List list2 = list;
                if (z && intValue3 == r9.size() - 1 && list2.size() < 7) {
                    GapComposer gapComposer2 = (GapComposer) composer2;
                    gapComposer2.startReplaceGroup(-948283973);
                    EmptyList emptyList = EmptyList.INSTANCE;
                    Object rememberedValue2 = gapComposer2.rememberedValue();
                    if (rememberedValue2 == obj5) {
                        rememberedValue2 = new AfterpaySearchViewKt$$ExternalSyntheticLambda43(18);
                        gapComposer2.updateRememberedValue(rememberedValue2);
                    }
                    AfterpayCardKt.DateRow(null, emptyList, calendarDate, (Function1) rememberedValue2, true, gapComposer2, 27696);
                    gapComposer2.end(false);
                } else {
                    GapComposer gapComposer3 = (GapComposer) composer2;
                    gapComposer3.startReplaceGroup(-948117937);
                    boolean changed2 = gapComposer3.changed(function13);
                    Object rememberedValue3 = gapComposer3.rememberedValue();
                    if (changed2 || rememberedValue3 == obj5) {
                        rememberedValue3 = new UtilsKt$$ExternalSyntheticLambda1(26, function13);
                        gapComposer3.updateRememberedValue(rememberedValue3);
                    }
                    AfterpayCardKt.DateRow(null, list2, calendarDate, (Function1) rememberedValue3, false, gapComposer3, 24576);
                    gapComposer3.end(false);
                }
                return Unit.INSTANCE;
            case 2:
                AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PrepurchaseToggleSection prepurchaseToggleSection = (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PrepurchaseToggleSection) obj8;
                Function1 function14 = (Function1) obj6;
                SharedTransitionScope sharedTransitionScope = (SharedTransitionScope) obj7;
                AnimatedContentScopeImpl animatedContentScopeImpl = (AnimatedContentScopeImpl) obj;
                AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PrepurchaseToggleSection.ToggleState toggleState = (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PrepurchaseToggleSection.ToggleState) obj2;
                Composer composer3 = (Composer) obj3;
                int intValue4 = ((Integer) obj4).intValue();
                animatedContentScopeImpl.getClass();
                toggleState.getClass();
                Modifier fillMaxWidth = SizeKt.fillMaxWidth(companion, 1.0f);
                StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalSizes;
                GapComposer gapComposer4 = (GapComposer) composer3;
                ((DefaultSizes) gapComposer4.consume(staticProvidableCompositionLocal)).getClass();
                DefaultSizes.spacing.getClass();
                ((DefaultSizes) gapComposer4.consume(staticProvidableCompositionLocal)).getClass();
                Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(fillMaxWidth, RecyclerView.DECELERATION_RATE, 32.0f, RecyclerView.DECELERATION_RATE, 8.0f, 5);
                ColumnMeasurePolicy columnMeasurePolicy = ColumnKt.columnMeasurePolicy(SpacerKt.Top, Alignment.Companion.Start, composer3, 0);
                int hashCode = Long.hashCode(gapComposer4.compositeKeyHashCode);
                PersistentCompositionLocalHashMap currentCompositionLocalScope = gapComposer4.currentCompositionLocalScope();
                Modifier materializeModifier = PlatformKt.materializeModifier(composer3, m302paddingqDBjuR0$default);
                ComposeUiNode.Companion.getClass();
                LayoutNode$Companion$Constructor$1 layoutNode$Companion$Constructor$1 = ComposeUiNode.Companion.Constructor;
                GapComposer gapComposer5 = (GapComposer) composer3;
                if (gapComposer5.applier == null) {
                    Updater.invalidApplier();
                    throw null;
                }
                gapComposer5.startReusableNode();
                if (gapComposer5.inserting) {
                    gapComposer5.createNode(layoutNode$Companion$Constructor$1);
                } else {
                    gapComposer5.useNode();
                }
                Updater.m576setimpl(composer3, columnMeasurePolicy, ComposeUiNode.Companion.SetMeasurePolicy);
                Updater.m576setimpl(composer3, currentCompositionLocalScope, ComposeUiNode.Companion.SetResolvedCompositionLocals);
                Updater.m576setimpl(composer3, Integer.valueOf(hashCode), ComposeUiNode.Companion.SetCompositeKeyHash);
                Updater.m575reconcileimpl(composer3, ComposeUiNode.Companion.ApplyOnDeactivatedNodeAssertion);
                Updater.m576setimpl(composer3, materializeModifier, ComposeUiNode.Companion.SetModifier);
                AfterpayCardKt.CardHeaderContent((toggleState == AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.PrepurchaseToggleSection.ToggleState.TURNED_ON ? prepurchaseToggleSection.turnedOnContent : prepurchaseToggleSection.turnedOffContent).header, z, function14, composer3, 0);
                AfterpayCardKt.PrepurchaseToggleFooterContent(prepurchaseToggleSection, toggleState, sharedTransitionScope, animatedContentScopeImpl, function14, composer3, (intValue4 & 112) | ((intValue4 << 9) & 7168));
                gapComposer5.end(true);
                return Unit.INSTANCE;
            default:
                CoroutineScope coroutineScope = (CoroutineScope) obj8;
                CardAppletTilePresenter cardAppletTilePresenter = (CardAppletTilePresenter) obj7;
                Lazy lazy = cardAppletTilePresenter.isCardGridEnabled$delegate;
                AndroidStringManager androidStringManager = cardAppletTilePresenter.stringManager;
                RealFilamentSupportProvider realFilamentSupportProvider = cardAppletTilePresenter.filamentSupportProvider;
                PromotedAppletTileViewModel.Loaded loaded = (PromotedAppletTileViewModel.Loaded) obj6;
                AppletAvailabilityState appletAvailabilityState = (AppletAvailabilityState) obj;
                Pair pair = (Pair) obj2;
                boolean booleanValue = ((Boolean) obj3).booleanValue();
                FamilyProfile familyProfile = (FamilyProfile) obj4;
                appletAvailabilityState.getClass();
                pair.getClass();
                familyProfile.getClass();
                List list3 = (List) pair.first;
                CardDetailsModel cardDetailsModel = (CardDetailsModel) pair.second;
                FamilyProfile.ManagedAccount managedAccount = familyProfile instanceof FamilyProfile.ManagedAccount ? (FamilyProfile.ManagedAccount) familyProfile : null;
                if (managedAccount == null || (str = managedAccount.firstName) == null || StringsKt.isBlank(str)) {
                    str = null;
                }
                int i2 = 3;
                boolean z3 = this.f$0;
                if (list3 == null) {
                    if (cardDetailsModel == null) {
                        boolean z4 = appletAvailabilityState == AppletAvailabilityState.AVAILABLE;
                        if (z3 && booleanValue) {
                            z2 = true;
                        }
                        return new CardAppletTileViewModel.Loading(z4, z2);
                    }
                    if (booleanValue) {
                        JobKt.launch$default(coroutineScope, null, null, new CardAppletTilePresenter$models$1$1(cardAppletTilePresenter, continuation, 4), 3);
                    }
                    CardSchemeViewModel.Module.HeroCardDetails heroCardDetails = cardDetailsModel.heroCardDetails;
                    zzsc zzscVar = cardDetailsModel.pillModel;
                    String text = cardAppletTilePresenter.text(zzscVar, str);
                    CardTheme cardTheme = heroCardDetails.cardTheme;
                    if (((Boolean) cardAppletTilePresenter.isBratHypeEnabled$delegate.getValue()).booleanValue() && cardTheme.id == CardTheme.Identifier.BRAT_ID && !(zzscVar instanceof CardDetailsModel$CardPillModel$Installed$Suspended) && !(zzscVar instanceof CardDetailsModel$CardPillModel$Installed$Locked)) {
                        z2 = true;
                    }
                    boolean isDeviceSupported = realFilamentSupportProvider.isDeviceSupported();
                    boolean z5 = cardAppletTilePresenter.isFilamentDisabled;
                    CardAppletTileViewModel.CardPillViewModel cardPillViewModel = new CardAppletTileViewModel.CardPillViewModel(CardAppletTilePresenter.icon(zzscVar), text, zzscVar instanceof CardDetailsModel$CardPillModel$Installed$WithCardInfo ? "" : text, z2);
                    Object[] objArr = {CollectionsKt.joinToString$default(StringsKt___StringsKt.chunked(1, zzscVar.getLastFour()), " ", null, null, 0, null, null, 62)};
                    Resources resources = androidStringManager.resources;
                    resources.getClass();
                    String format2 = new MessageFormat(resources.getString(R.string.card_applet_content_description)).format(objArr);
                    format2.getClass();
                    return new CardAppletTileViewModel.Installed(isDeviceSupported, z5, androidStringManager.get(R.string.card_applet_on_click_label), heroCardDetails, cardPillViewModel, format2);
                }
                if (booleanValue) {
                    JobKt.launch$default(coroutineScope, null, null, new CardAppletTilePresenter$models$1$1(cardAppletTilePresenter, continuation, i2), 3);
                }
                boolean isDeviceSupported2 = realFilamentSupportProvider.isDeviceSupported();
                boolean z6 = ((Boolean) lazy.getValue()).booleanValue() || cardAppletTilePresenter.isFilamentDisabled;
                boolean booleanValue2 = ((Boolean) lazy.getValue()).booleanValue();
                String str2 = androidStringManager.get(R.string.card_applet_nux_on_click_label);
                List<CardDetailsModel> list4 = list3;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                for (CardDetailsModel cardDetailsModel2 : list4) {
                    CardSchemeViewModel.Module.HeroCardDetails heroCardDetails2 = cardDetailsModel2.heroCardDetails;
                    zzsc zzscVar2 = cardDetailsModel2.pillModel;
                    arrayList.add(new Pair(heroCardDetails2, new CardAppletTileViewModel.CardPillViewModel(CardAppletTilePresenter.icon(zzscVar2), cardAppletTilePresenter.text(zzscVar2, str), cardAppletTilePresenter.text(zzscVar2, str), false)));
                }
                if (str != null) {
                    Resources resources2 = androidStringManager.resources;
                    resources2.getClass();
                    String format3 = new MessageFormat(resources2.getString(R.string.promoted_card_subtitle_managed)).format(new Object[]{str});
                    format3.getClass();
                    if (loaded != null) {
                        String str3 = loaded.title;
                        Integer num = loaded.imageResource;
                        Image image = loaded.image;
                        str3.getClass();
                        loaded = new PromotedAppletTileViewModel.Loaded(str3, format3, num, image);
                    } else {
                        loaded = new PromotedAppletTileViewModel.Loaded(androidStringManager.get(R.string.promoted_card_title), format3, 2131233367, null);
                    }
                }
                return new CardAppletTileViewModel.Uninstalled(isDeviceSupported2, z6, str2, z3, booleanValue2, arrayList, loaded);
        }
    }

    public /* synthetic */ ExpandedLoanHistoryListKt$$ExternalSyntheticLambda5(ArrayList arrayList, boolean z, AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.HeroBalanceSection.PaymentCalendar.CalendarDate calendarDate, Function1 function1) {
        this.f$1 = arrayList;
        this.f$0 = z;
        this.f$2 = calendarDate;
        this.f$3 = function1;
    }

    public /* synthetic */ ExpandedLoanHistoryListKt$$ExternalSyntheticLambda5(CoroutineScope coroutineScope, CardAppletTilePresenter cardAppletTilePresenter, PromotedAppletTileViewModel.Loaded loaded, boolean z) {
        this.f$1 = coroutineScope;
        this.f$2 = cardAppletTilePresenter;
        this.f$3 = loaded;
        this.f$0 = z;
    }

    public /* synthetic */ ExpandedLoanHistoryListKt$$ExternalSyntheticLambda5(boolean z, LazyPagingItems lazyPagingItems, ExpandedLoanHistoryListModel expandedLoanHistoryListModel, Function1 function1) {
        this.f$0 = z;
        this.f$1 = lazyPagingItems;
        this.f$2 = expandedLoanHistoryListModel;
        this.f$3 = function1;
    }
}
