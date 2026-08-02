package androidx.compose.ui.graphics;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.android.gms.internal.mlkit_vision_common.zzlc;
import com.google.android.gms.internal.mlkit_vision_common.zzld;
import com.google.android.gms.internal.mlkit_vision_common.zzle;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.activity.views.AvatarsKt;
import com.squareup.cash.bitcoin.viewmodels.applet.activity.BitcoinDependentActivityViewModel;
import com.squareup.cash.bitcoin.views.BitcoinUiFactory$$ExternalSyntheticLambda12;
import com.squareup.cash.offers.backend.api.OffersAnalyticsEventSpec;
import com.squareup.cash.offers.backend.api.OffersItemToken;
import com.squareup.cash.offers.presenters.OffersTabMapperKt;
import com.squareup.cash.offers.viewmodels.ImpressionReportable;
import com.squareup.cash.offers.viewmodels.itemviewmodels.LegacyOffersAvatarViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.LogoViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.OffersMessageViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.OffersRowViewModel;
import com.squareup.cash.offers.viewmodels.itemviewmodels.OffersSearchListItemViewModel;
import com.squareup.protos.cash.cashsuggest.api.OffersTabSearchResponse;
import com.squareup.protos.cash.shop.rendering.api.AnalyticsEvent;
import com.squareup.protos.cash.shop.rendering.api.RecentlyViewedSection;
import com.squareup.protos.cash.shop.rendering.api.RowSection;
import com.squareup.protos.cash.shop.rendering.api.RowSection$Row$Type$FilterRow;
import com.squareup.protos.cash.shop.rendering.api.RowSection$Row$Type$OfferRow;
import com.squareup.protos.cash.shop.rendering.api.SearchSection;
import com.squareup.protos.cash.shop.rendering.api.SearchSection$Content$MessageSection;
import com.squareup.protos.cash.shop.rendering.api.SearchSection$Content$RecentlyViewedSection;
import com.squareup.protos.cash.shop.rendering.api.SearchSection$Content$RowSection;
import com.squareup.protos.cash.shop.rendering.api.SectionHeader;
import com.squareup.protos.cash.shop.rendering.api.StyledText;
import com.squareup.protos.cash.shop.rendering.api.TapAction;
import com.squareup.protos.cash.shop.rendering.api.TapAction$Action$UrlAction;
import com.squareup.protos.cash.shop.rendering.api.UrlTapAction;
import com.squareup.protos.cash.shop.rendering.api.ZeroResultsMessageSection;
import com.squareup.protos.franklin.ui.Avatar;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.functions.Function1;
import kotlinx.collections.immutable.ImmutableList;
import kotlinx.collections.immutable.implementations.immutableList.PersistentVectorBuilder;
import kotlinx.collections.immutable.implementations.immutableList.SmallPersistentVector;
import okhttp3.internal.Tags;

/* loaded from: classes3.dex */
public abstract class ClipOp {
    public static final void BitcoinDependentActivityWidget(BitcoinDependentActivityViewModel bitcoinDependentActivityViewModel, Function1 function1, Composer composer, int i) {
        bitcoinDependentActivityViewModel.getClass();
        function1.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(417183133);
        int i2 = (gapComposer.changedInstance(bitcoinDependentActivityViewModel) ? 4 : 2) | i;
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 3) != 2)) {
            AvatarsKt.ActivityEmbeddedView(bitcoinDependentActivityViewModel.embeddedActivityViewModel, null, null, null, null, gapComposer, 0, EnumC0170g.SDK_ASSET_ILLUSTRATION_SECOND_DEPOSIT_CIRCLE_VALUE);
        } else {
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new BitcoinUiFactory$$ExternalSyntheticLambda12(bitcoinDependentActivityViewModel, function1, i, 9);
        }
    }

    /* renamed from: equals-impl0, reason: not valid java name */
    public static final boolean m673equalsimpl0(int i) {
        return i == 0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:127:0x02fc A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0302 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0013 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x00a6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:158:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:185:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x018a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0090 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:227:0x004e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:236:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:239:0x007b  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x008a A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:244:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01b0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:37:0x01c3 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01ed  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x020a  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x021c  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x022e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:76:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0245  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0257  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ListBuilder toSearchListItems(OffersTabSearchResponse offersTabSearchResponse, String str) {
        ZeroResultsMessageSection zeroResultsMessageSection;
        ZeroResultsMessageSection zeroResultsMessageSection2;
        StyledText styledText;
        RecentlyViewedSection recentlyViewedSection;
        RecentlyViewedSection recentlyViewedSection2;
        Object valueOf;
        String str2;
        RowSection rowSection;
        RowSection rowSection2;
        Iterator it;
        Object obj;
        Object obj2;
        RowSection.FilterRow filterRow;
        ListBuilder listBuilder;
        ImpressionReportable offersSearchFilterRowViewModel;
        RowSection.OfferRow offerRow;
        offersTabSearchResponse.getClass();
        ListBuilder createListBuilder = CollectionsKt__CollectionsJVMKt.createListBuilder();
        for (SearchSection searchSection : offersTabSearchResponse.sections) {
            String str3 = searchSection.section_id;
            ListBuilder listBuilder2 = null;
            if (str3 == null) {
                a$$ExternalSyntheticBUOutline0.m$3("Data validation: section id == null");
                return null;
            }
            AnalyticsEvent analyticsEvent = searchSection.analytics_view_event;
            OffersAnalyticsEventSpec offersAnalyticsEventSpec = analyticsEvent != null ? androidx.compose.ui.draw.ShadowKt.toOffersAnalyticsEventSpec(analyticsEvent) : null;
            SectionHeader sectionHeader = searchSection.section_header;
            if (sectionHeader != null) {
                createListBuilder.add(OffersTabMapperKt.toHeaderViewModel(sectionHeader, str3));
            }
            zzld zzldVar = searchSection.content;
            if (zzldVar != null) {
                SearchSection$Content$MessageSection searchSection$Content$MessageSection = zzldVar instanceof SearchSection$Content$MessageSection ? (SearchSection$Content$MessageSection) zzldVar : null;
                if (searchSection$Content$MessageSection != null) {
                    zeroResultsMessageSection = searchSection$Content$MessageSection.value;
                    if (zeroResultsMessageSection == null) {
                        if (zzldVar != null) {
                            SearchSection$Content$MessageSection searchSection$Content$MessageSection2 = zzldVar instanceof SearchSection$Content$MessageSection ? (SearchSection$Content$MessageSection) zzldVar : null;
                            if (searchSection$Content$MessageSection2 != null) {
                                zeroResultsMessageSection2 = searchSection$Content$MessageSection2.value;
                                zeroResultsMessageSection2.getClass();
                                AnalyticsEvent analyticsEvent2 = zeroResultsMessageSection2.analytics_view_item_event;
                                ImmutableList immutableList = Tags.toImmutableList(ArraysKt___ArraysKt.filterNotNull(new OffersAnalyticsEventSpec[]{analyticsEvent2 == null ? androidx.compose.ui.draw.ShadowKt.toOffersAnalyticsEventSpec(analyticsEvent2) : null, offersAnalyticsEventSpec}));
                                styledText = zeroResultsMessageSection2.title;
                                if (styledText != null) {
                                    a$$ExternalSyntheticBUOutline0.m$3("Data validation: message title == null");
                                    return null;
                                }
                                createListBuilder.add(new OffersMessageViewModel(str3, immutableList, styledText, zeroResultsMessageSection2.subtitle, zeroResultsMessageSection2.image, zeroResultsMessageSection2.button));
                            }
                        }
                        zeroResultsMessageSection2 = null;
                        zeroResultsMessageSection2.getClass();
                        AnalyticsEvent analyticsEvent22 = zeroResultsMessageSection2.analytics_view_item_event;
                        ImmutableList immutableList2 = Tags.toImmutableList(ArraysKt___ArraysKt.filterNotNull(new OffersAnalyticsEventSpec[]{analyticsEvent22 == null ? androidx.compose.ui.draw.ShadowKt.toOffersAnalyticsEventSpec(analyticsEvent22) : null, offersAnalyticsEventSpec}));
                        styledText = zeroResultsMessageSection2.title;
                        if (styledText != null) {
                        }
                    } else {
                        if (zzldVar != null) {
                            SearchSection$Content$RecentlyViewedSection searchSection$Content$RecentlyViewedSection = zzldVar instanceof SearchSection$Content$RecentlyViewedSection ? (SearchSection$Content$RecentlyViewedSection) zzldVar : null;
                            if (searchSection$Content$RecentlyViewedSection != null) {
                                recentlyViewedSection = searchSection$Content$RecentlyViewedSection.value;
                                if (recentlyViewedSection == null) {
                                    if (zzldVar != null) {
                                        SearchSection$Content$RecentlyViewedSection searchSection$Content$RecentlyViewedSection2 = zzldVar instanceof SearchSection$Content$RecentlyViewedSection ? (SearchSection$Content$RecentlyViewedSection) zzldVar : null;
                                        if (searchSection$Content$RecentlyViewedSection2 != null) {
                                            recentlyViewedSection2 = searchSection$Content$RecentlyViewedSection2.value;
                                            recentlyViewedSection2.getClass();
                                            List list = recentlyViewedSection2.logos;
                                            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                                            int i = 0;
                                            for (Object obj3 : list) {
                                                int i2 = i + 1;
                                                if (i < 0) {
                                                    CollectionsKt__CollectionsKt.throwIndexOverflow();
                                                    throw null;
                                                }
                                                RecentlyViewedSection.Logo logo = (RecentlyViewedSection.Logo) obj3;
                                                TapAction tapAction = logo.tap_action;
                                                if (tapAction == null) {
                                                    a$$ExternalSyntheticBUOutline0.m$3("Data validation: logo tap action == null");
                                                    return null;
                                                }
                                                String str4 = logo.boost_token;
                                                OffersItemToken offersItemToken = OffersTabMapperKt.getOffersItemToken(logo.business_token, logo.engaged_token);
                                                if (offersItemToken == null || (valueOf = offersItemToken.getToken()) == null) {
                                                    valueOf = Integer.valueOf(i);
                                                }
                                                String str5 = str3 + "|recently_viewed_logo|" + valueOf;
                                                AnalyticsEvent analyticsEvent3 = logo.analytics_view_event;
                                                OffersAnalyticsEventSpec offersAnalyticsEventSpec2 = analyticsEvent3 != null ? androidx.compose.ui.draw.ShadowKt.toOffersAnalyticsEventSpec(analyticsEvent3) : null;
                                                Avatar avatar = logo.avatar;
                                                LegacyOffersAvatarViewModel legacyOffersAvatarViewModel$default = avatar != null ? OffersTabMapperKt.toLegacyOffersAvatarViewModel$default(avatar) : null;
                                                if (legacyOffersAvatarViewModel$default == null) {
                                                    a$$ExternalSyntheticBUOutline0.m$3("Data validation: logo avatar == null");
                                                    return null;
                                                }
                                                StyledText styledText2 = logo.title;
                                                if (styledText2 == null) {
                                                    a$$ExternalSyntheticBUOutline0.m$3("Data validation: logo title == null");
                                                    return null;
                                                }
                                                zzle zzleVar = tapAction.action;
                                                if (zzleVar != null) {
                                                    TapAction$Action$UrlAction tapAction$Action$UrlAction = zzleVar instanceof TapAction$Action$UrlAction ? (TapAction$Action$UrlAction) zzleVar : null;
                                                    UrlTapAction urlTapAction = tapAction$Action$UrlAction != null ? tapAction$Action$UrlAction.value : null;
                                                    if (urlTapAction != null) {
                                                        str2 = urlTapAction.action_url;
                                                        if (str2 != null) {
                                                            a$$ExternalSyntheticBUOutline0.m$3("Data validation: logo tap action url == null");
                                                            return null;
                                                        }
                                                        List list2 = tapAction.analytics_tap_events;
                                                        PersistentVectorBuilder builder = SmallPersistentVector.EMPTY.builder();
                                                        Iterator it2 = list2.iterator();
                                                        while (it2.hasNext()) {
                                                            builder.add(androidx.compose.ui.draw.ShadowKt.toOffersAnalyticsEventSpec((AnalyticsEvent) it2.next()));
                                                        }
                                                        arrayList.add(new LogoViewModel(offersAnalyticsEventSpec2, str5, offersItemToken, legacyOffersAvatarViewModel$default, styledText2, str2, builder.build(), str4 != null && str4.equals(str)));
                                                        i = i2;
                                                    }
                                                }
                                                str2 = null;
                                                if (str2 != null) {
                                                }
                                            }
                                            createListBuilder.add(new OffersSearchListItemViewModel.RecentlyViewedSectionViewModel(str3, offersAnalyticsEventSpec, arrayList));
                                        }
                                    }
                                    recentlyViewedSection2 = null;
                                    recentlyViewedSection2.getClass();
                                    List list3 = recentlyViewedSection2.logos;
                                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                                    int i3 = 0;
                                    while (r3.hasNext()) {
                                    }
                                    createListBuilder.add(new OffersSearchListItemViewModel.RecentlyViewedSectionViewModel(str3, offersAnalyticsEventSpec, arrayList2));
                                } else {
                                    if (zzldVar != null) {
                                        SearchSection$Content$RowSection searchSection$Content$RowSection = zzldVar instanceof SearchSection$Content$RowSection ? (SearchSection$Content$RowSection) zzldVar : null;
                                        if (searchSection$Content$RowSection != null) {
                                            rowSection = searchSection$Content$RowSection.value;
                                            if (rowSection == null) {
                                                continue;
                                            } else {
                                                if (zzldVar != null) {
                                                    SearchSection$Content$RowSection searchSection$Content$RowSection2 = zzldVar instanceof SearchSection$Content$RowSection ? (SearchSection$Content$RowSection) zzldVar : null;
                                                    if (searchSection$Content$RowSection2 != null) {
                                                        rowSection2 = searchSection$Content$RowSection2.value;
                                                        rowSection2.getClass();
                                                        List list4 = rowSection2.rows;
                                                        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list4, 10));
                                                        it = list4.iterator();
                                                        while (it.hasNext()) {
                                                            zzlc zzlcVar = ((RowSection.Row) it.next()).f1337type;
                                                            if (zzlcVar != null) {
                                                                RowSection$Row$Type$OfferRow rowSection$Row$Type$OfferRow = zzlcVar instanceof RowSection$Row$Type$OfferRow ? (RowSection$Row$Type$OfferRow) zzlcVar : listBuilder2;
                                                                if (rowSection$Row$Type$OfferRow != 0) {
                                                                    obj = rowSection$Row$Type$OfferRow.value;
                                                                    if (obj == null) {
                                                                        if (zzlcVar != null) {
                                                                            RowSection$Row$Type$OfferRow rowSection$Row$Type$OfferRow2 = zzlcVar instanceof RowSection$Row$Type$OfferRow ? (RowSection$Row$Type$OfferRow) zzlcVar : listBuilder2;
                                                                            if (rowSection$Row$Type$OfferRow2 != 0) {
                                                                                offerRow = rowSection$Row$Type$OfferRow2.value;
                                                                                if (offerRow != 0) {
                                                                                    a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                                                                                    return listBuilder2;
                                                                                }
                                                                                String str6 = offerRow.boost_token;
                                                                                offersSearchFilterRowViewModel = OffersTabMapperKt.toOfferRowViewModel(offerRow, str3, str6 != null ? str6.equals(str) : false, offersAnalyticsEventSpec);
                                                                                listBuilder = listBuilder2;
                                                                            }
                                                                        }
                                                                        offerRow = listBuilder2;
                                                                        if (offerRow != 0) {
                                                                        }
                                                                    } else {
                                                                        if (zzlcVar != null) {
                                                                            RowSection$Row$Type$FilterRow rowSection$Row$Type$FilterRow = zzlcVar instanceof RowSection$Row$Type$FilterRow ? (RowSection$Row$Type$FilterRow) zzlcVar : listBuilder2;
                                                                            if (rowSection$Row$Type$FilterRow != 0) {
                                                                                obj2 = rowSection$Row$Type$FilterRow.value;
                                                                                if (obj2 != null) {
                                                                                    ListBuilder listBuilder3 = listBuilder2;
                                                                                    a$$ExternalSyntheticBUOutline0.m$1("Unsupported row type. Either offer/filter row must not be null");
                                                                                    return listBuilder3;
                                                                                }
                                                                                if (zzlcVar != null) {
                                                                                    RowSection$Row$Type$FilterRow rowSection$Row$Type$FilterRow2 = zzlcVar instanceof RowSection$Row$Type$FilterRow ? (RowSection$Row$Type$FilterRow) zzlcVar : listBuilder2;
                                                                                    if (rowSection$Row$Type$FilterRow2 != 0) {
                                                                                        filterRow = rowSection$Row$Type$FilterRow2.value;
                                                                                        if (filterRow != 0) {
                                                                                            ListBuilder listBuilder4 = listBuilder2;
                                                                                            a$$ExternalSyntheticBUOutline0.m$3("Required value was null.");
                                                                                            return listBuilder4;
                                                                                        }
                                                                                        RowSection.FilterRow.FilterTapAction filterTapAction = filterRow.tap_action;
                                                                                        String str7 = filterTapAction != null ? filterTapAction.filter_token : listBuilder2;
                                                                                        if (str7 == 0) {
                                                                                            ListBuilder listBuilder5 = listBuilder2;
                                                                                            a$$ExternalSyntheticBUOutline0.m$3("Data validation: filter row token == null");
                                                                                            return listBuilder5;
                                                                                        }
                                                                                        AnalyticsEvent analyticsEvent4 = filterRow.analytics_view_event;
                                                                                        OffersAnalyticsEventSpec offersAnalyticsEventSpec3 = analyticsEvent4 != null ? androidx.compose.ui.draw.ShadowKt.toOffersAnalyticsEventSpec(analyticsEvent4) : listBuilder2;
                                                                                        String m = Recorder$$ExternalSyntheticOutline2.m(str3, "|filter_row|", str7);
                                                                                        ImmutableList immutableList3 = Tags.toImmutableList(ArraysKt___ArraysKt.filterNotNull(new OffersAnalyticsEventSpec[]{offersAnalyticsEventSpec3, offersAnalyticsEventSpec}));
                                                                                        Avatar avatar2 = filterRow.avatar;
                                                                                        LegacyOffersAvatarViewModel legacyOffersAvatarViewModel$default2 = avatar2 != null ? OffersTabMapperKt.toLegacyOffersAvatarViewModel$default(avatar2) : listBuilder2;
                                                                                        if (legacyOffersAvatarViewModel$default2 == 0) {
                                                                                            ListBuilder listBuilder6 = listBuilder2;
                                                                                            a$$ExternalSyntheticBUOutline0.m$3("Data validation: filter row avatar == null");
                                                                                            return listBuilder6;
                                                                                        }
                                                                                        StyledText styledText3 = filterRow.title;
                                                                                        if (styledText3 == null) {
                                                                                            ListBuilder listBuilder7 = listBuilder2;
                                                                                            a$$ExternalSyntheticBUOutline0.m$3("Data validation: filter row title == null");
                                                                                            return listBuilder7;
                                                                                        }
                                                                                        StyledText styledText4 = filterRow.subtitle;
                                                                                        if (filterTapAction == null) {
                                                                                            ListBuilder listBuilder8 = listBuilder2;
                                                                                            a$$ExternalSyntheticBUOutline0.m$3("Data validation: filter row tap action == null");
                                                                                            return listBuilder8;
                                                                                        }
                                                                                        List list5 = filterTapAction.analytics_tap_events;
                                                                                        PersistentVectorBuilder builder2 = SmallPersistentVector.EMPTY.builder();
                                                                                        Iterator it3 = list5.iterator();
                                                                                        while (it3.hasNext()) {
                                                                                            builder2.add(androidx.compose.ui.draw.ShadowKt.toOffersAnalyticsEventSpec((AnalyticsEvent) it3.next()));
                                                                                            listBuilder2 = listBuilder2;
                                                                                        }
                                                                                        listBuilder = listBuilder2;
                                                                                        offersSearchFilterRowViewModel = new OffersSearchListItemViewModel.OffersSearchFilterRowViewModel(m, immutableList3, str7, new OffersRowViewModel(legacyOffersAvatarViewModel$default2, styledText3, styledText4, builder2.build(), null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_LOGO_CIRCLE_VALUE));
                                                                                    }
                                                                                }
                                                                                filterRow = listBuilder2;
                                                                                if (filterRow != 0) {
                                                                                }
                                                                            }
                                                                        }
                                                                        obj2 = listBuilder2;
                                                                        if (obj2 != null) {
                                                                        }
                                                                    }
                                                                    arrayList3.add(offersSearchFilterRowViewModel);
                                                                    listBuilder2 = listBuilder;
                                                                }
                                                            }
                                                            obj = listBuilder2;
                                                            if (obj == null) {
                                                            }
                                                            arrayList3.add(offersSearchFilterRowViewModel);
                                                            listBuilder2 = listBuilder;
                                                        }
                                                        createListBuilder.addAll(arrayList3);
                                                    }
                                                }
                                                rowSection2 = null;
                                                rowSection2.getClass();
                                                List list42 = rowSection2.rows;
                                                ArrayList arrayList32 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list42, 10));
                                                it = list42.iterator();
                                                while (it.hasNext()) {
                                                }
                                                createListBuilder.addAll(arrayList32);
                                            }
                                        }
                                    }
                                    rowSection = null;
                                    if (rowSection == null) {
                                    }
                                }
                            }
                        }
                        recentlyViewedSection = null;
                        if (recentlyViewedSection == null) {
                        }
                    }
                }
            }
            zeroResultsMessageSection = null;
            if (zeroResultsMessageSection == null) {
            }
        }
        return CollectionsKt__CollectionsJVMKt.build(createListBuilder);
    }
}
