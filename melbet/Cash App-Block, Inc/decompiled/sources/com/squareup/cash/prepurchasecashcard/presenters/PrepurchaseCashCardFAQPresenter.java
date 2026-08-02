package com.squareup.cash.prepurchasecashcard.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import com.squareup.cash.blockers.screens.BlockersScreens;
import com.squareup.cash.clientrouting.RealRouter;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.data.blockers.BlockersDataNavigator;
import com.squareup.cash.data.blockers.RealBlockersHelper;
import com.squareup.cash.data.blockers.RealBlockersHelper$Factory$Impl;
import com.squareup.cash.pdf.presenter.PdfPreviewPresenter$models$1$1;
import com.squareup.cash.prepurchasecashcard.viewmodels.PrepurchaseCardFAQViewModel;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.api.PrepurchaseCashCardFAQBlocker;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;
import timber.log.Timber;

/* loaded from: classes6.dex */
public final class PrepurchaseCashCardFAQPresenter implements MoleculePresenter {
    public final BlockersScreens.PrepurchaseCashCardFAQBlockerScreen args;
    public final BlockersDataNavigator blockersDataNavigator;
    public final RealBlockersHelper blockersHelper;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealRouter router;

    public PrepurchaseCashCardFAQPresenter(BlockersDataNavigator blockersDataNavigator, RealBlockersHelper$Factory$Impl realBlockersHelper$Factory$Impl, RealRouter$Factory$Impl realRouter$Factory$Impl, BetterNavigator.ScreenNavigator screenNavigator, BlockersScreens.PrepurchaseCashCardFAQBlockerScreen prepurchaseCashCardFAQBlockerScreen) {
        prepurchaseCashCardFAQBlockerScreen.getClass();
        this.blockersDataNavigator = blockersDataNavigator;
        this.navigator = screenNavigator;
        this.args = prepurchaseCashCardFAQBlockerScreen;
        this.blockersHelper = realBlockersHelper$Factory$Impl.create(screenNavigator);
        this.router = realRouter$Factory$Impl.create$1(screenNavigator);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0130 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0124  */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.squareup.cash.prepurchasecashcard.viewmodels.PrepurchaseCardFAQViewModel$FAQSectionData$FAQItem$ExpandableItem] */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        LocalizedString localizedString;
        PrepurchaseCashCardFAQBlocker.FAQItem.ExpandableItem expandableItem;
        PrepurchaseCardFAQViewModel.FAQSectionData.FAQItem.Header header;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(2117653672);
        Updater.LaunchedEffect(gapComposer, flow, new PdfPreviewPresenter$models$1$1(flow, (Continuation) (0 == true ? 1 : 0), this, 9));
        PrepurchaseCashCardFAQBlocker prepurchaseCashCardFAQBlocker = this.args.blocker;
        Image image = prepurchaseCashCardFAQBlocker.header_image;
        LocalizedString localizedString2 = prepurchaseCashCardFAQBlocker.title;
        String str = localizedString2 != null ? localizedString2.translated_value : null;
        str.getClass();
        List<PrepurchaseCashCardFAQBlocker.ListItem> list = prepurchaseCashCardFAQBlocker.list_items;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (PrepurchaseCashCardFAQBlocker.ListItem listItem : list) {
            LocalizedString localizedString3 = listItem.title;
            String str2 = localizedString3 != null ? localizedString3.translated_value : null;
            str2.getClass();
            LocalizedString localizedString4 = listItem.subtitle;
            arrayList.add(new PrepurchaseCardFAQViewModel.OverviewData.OverviewListItem(str2, localizedString4 != null ? localizedString4.translated_value : null));
        }
        PrepurchaseCardFAQViewModel.OverviewData overviewData = new PrepurchaseCardFAQViewModel.OverviewData(image, str, arrayList, prepurchaseCashCardFAQBlocker.primary_button_blocker_action);
        LocalizedString localizedString5 = prepurchaseCashCardFAQBlocker.faqs_section_title;
        String str3 = localizedString5 != null ? localizedString5.translated_value : null;
        List<PrepurchaseCashCardFAQBlocker.FAQItem> list2 = prepurchaseCashCardFAQBlocker.faq_items;
        ArrayList arrayList2 = new ArrayList();
        for (PrepurchaseCashCardFAQBlocker.FAQItem fAQItem : list2) {
            PrepurchaseCashCardFAQBlocker.FAQItem.ItemType itemType = fAQItem.item_type;
            if (itemType != null) {
                PrepurchaseCashCardFAQBlocker.FAQItem.ItemType.HeaderText headerText = itemType instanceof PrepurchaseCashCardFAQBlocker.FAQItem.ItemType.HeaderText ? (PrepurchaseCashCardFAQBlocker.FAQItem.ItemType.HeaderText) itemType : null;
                if (headerText != null) {
                    localizedString = headerText.getValue();
                    PrepurchaseCashCardFAQBlocker.FAQItem.ItemType itemType2 = fAQItem.item_type;
                    if (localizedString == null) {
                        itemType2.getClass();
                        PrepurchaseCashCardFAQBlocker.FAQItem.ItemType.HeaderText headerText2 = itemType2 instanceof PrepurchaseCashCardFAQBlocker.FAQItem.ItemType.HeaderText ? (PrepurchaseCashCardFAQBlocker.FAQItem.ItemType.HeaderText) itemType2 : null;
                        LocalizedString value = headerText2 != null ? headerText2.getValue() : null;
                        value.getClass();
                        String str4 = value.translated_value;
                        str4.getClass();
                        header = new PrepurchaseCardFAQViewModel.FAQSectionData.FAQItem.Header(str4);
                    } else {
                        if (itemType2 != null) {
                            PrepurchaseCashCardFAQBlocker.FAQItem.ItemType.ExpandableItem expandableItem2 = itemType2 instanceof PrepurchaseCashCardFAQBlocker.FAQItem.ItemType.ExpandableItem ? (PrepurchaseCashCardFAQBlocker.FAQItem.ItemType.ExpandableItem) itemType2 : null;
                            if (expandableItem2 != null) {
                                expandableItem = expandableItem2.getValue();
                                if (expandableItem == null) {
                                    PrepurchaseCashCardFAQBlocker.FAQItem.ItemType itemType3 = fAQItem.item_type;
                                    itemType3.getClass();
                                    PrepurchaseCashCardFAQBlocker.FAQItem.ItemType.ExpandableItem expandableItem3 = itemType3 instanceof PrepurchaseCashCardFAQBlocker.FAQItem.ItemType.ExpandableItem ? (PrepurchaseCashCardFAQBlocker.FAQItem.ItemType.ExpandableItem) itemType3 : null;
                                    PrepurchaseCashCardFAQBlocker.FAQItem.ExpandableItem value2 = expandableItem3 != null ? expandableItem3.getValue() : null;
                                    value2.getClass();
                                    LocalizedString localizedString6 = value2.title_text;
                                    localizedString6.getClass();
                                    String str5 = localizedString6.translated_value;
                                    str5.getClass();
                                    PrepurchaseCashCardFAQBlocker.FAQItem.ItemType itemType4 = fAQItem.item_type;
                                    itemType4.getClass();
                                    PrepurchaseCashCardFAQBlocker.FAQItem.ItemType.ExpandableItem expandableItem4 = itemType4 instanceof PrepurchaseCashCardFAQBlocker.FAQItem.ItemType.ExpandableItem ? (PrepurchaseCashCardFAQBlocker.FAQItem.ItemType.ExpandableItem) itemType4 : null;
                                    PrepurchaseCashCardFAQBlocker.FAQItem.ExpandableItem value3 = expandableItem4 != null ? expandableItem4.getValue() : null;
                                    value3.getClass();
                                    LocalizedString localizedString7 = value3.expanded_body_text;
                                    localizedString7.getClass();
                                    String str6 = localizedString7.translated_value;
                                    str6.getClass();
                                    header = new PrepurchaseCardFAQViewModel.FAQSectionData.FAQItem.ExpandableItem(str5, str6);
                                } else {
                                    Timber.Forest.w("FAQ item does not have header or expandable item!", new Object[0]);
                                    header = null;
                                }
                            }
                        }
                        expandableItem = null;
                        if (expandableItem == null) {
                        }
                    }
                    if (header == null) {
                        arrayList2.add(header);
                    }
                }
            }
            localizedString = null;
            PrepurchaseCashCardFAQBlocker.FAQItem.ItemType itemType22 = fAQItem.item_type;
            if (localizedString == null) {
            }
            if (header == null) {
            }
        }
        LocalizedString localizedString8 = prepurchaseCashCardFAQBlocker.disclosure;
        PrepurchaseCardFAQViewModel prepurchaseCardFAQViewModel = new PrepurchaseCardFAQViewModel(overviewData, new PrepurchaseCardFAQViewModel.FAQSectionData(str3, localizedString8 != null ? localizedString8.translated_value : null, arrayList2));
        gapComposer.end(false);
        return prepurchaseCardFAQViewModel;
    }
}
