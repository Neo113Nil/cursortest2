package com.squareup.cash.afterpayapplet.presenters;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.datadog.android.rum.model.ErrorEvent;
import com.google.android.gms.internal.mlkit_vision_common.zzld;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpaySearchViewModel;
import com.squareup.protos.cash.cashsuggest.api.AfterpayAppletSearchResponse;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.cash.shop.rendering.api.AvatarCarouselSection;
import com.squareup.protos.cash.shop.rendering.api.FilterGroupSection;
import com.squareup.protos.cash.shop.rendering.api.FilterGroupSection$FilterGroupItem$Style$FilterSheet;
import com.squareup.protos.cash.shop.rendering.api.FilterGroupSection$FilterGroupItem$Style$FilterToggle;
import com.squareup.protos.cash.shop.rendering.api.ImageTextSection;
import com.squareup.protos.cash.shop.rendering.api.RowSection;
import com.squareup.protos.cash.shop.rendering.api.SearchSection;
import com.squareup.protos.cash.shop.rendering.api.SearchSection$Content$ImageTextSection;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import kotlin.time.Duration;
import kotlin.time.DurationKt;
import kotlin.time.DurationUnit;

/* loaded from: classes8.dex */
public abstract class AfterpaySearchPresenterKt {
    public static final /* synthetic */ int $r8$clinit = 0;
    public static final long DEBOUNCE_DURATION;

    static {
        Duration.Companion companion = Duration.Companion;
        DEBOUNCE_DURATION = DurationKt.toDuration(500, DurationUnit.MILLISECONDS);
    }

    public static final FilterGroupSection.FilterGroupItem access$findFilterGroupWithId(AfterpayAppletSearchResponse afterpayAppletSearchResponse, String str) {
        List list;
        FilterGroupSection filterGroupSection = afterpayAppletSearchResponse.filter_group_sections;
        Object obj = null;
        if (filterGroupSection == null || (list = filterGroupSection.filter_group_items) == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (id((FilterGroupSection.FilterGroupItem) next).equals(str)) {
                obj = next;
                break;
            }
        }
        return (FilterGroupSection.FilterGroupItem) obj;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e A[EDGE_INSN: B:15:0x002e->B:16:0x002e BREAK  A[LOOP:0: B:4:0x000b->B:28:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[LOOP:0: B:4:0x000b->B:28:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final ImageTextSection access$findNoSearchResultsImageTextSection(AfterpayAppletSearchResponse afterpayAppletSearchResponse) {
        Object obj;
        zzld zzldVar;
        ImageTextSection imageTextSection;
        List list = afterpayAppletSearchResponse.sections;
        if (list != null) {
            Iterator it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                zzld zzldVar2 = ((SearchSection) obj).content;
                if (zzldVar2 != null) {
                    SearchSection$Content$ImageTextSection searchSection$Content$ImageTextSection = zzldVar2 instanceof SearchSection$Content$ImageTextSection ? (SearchSection$Content$ImageTextSection) zzldVar2 : null;
                    if (searchSection$Content$ImageTextSection != null) {
                        imageTextSection = searchSection$Content$ImageTextSection.value;
                        if (imageTextSection == null) {
                            break;
                        }
                    }
                }
                imageTextSection = null;
                if (imageTextSection == null) {
                }
            }
            SearchSection searchSection = (SearchSection) obj;
            if (searchSection != null && (zzldVar = searchSection.content) != null) {
                SearchSection$Content$ImageTextSection searchSection$Content$ImageTextSection2 = zzldVar instanceof SearchSection$Content$ImageTextSection ? (SearchSection$Content$ImageTextSection) zzldVar : null;
                if (searchSection$Content$ImageTextSection2 != null) {
                    return searchSection$Content$ImageTextSection2.value;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0019  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x002b  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final AfterpaySearchViewModel.FilterPillViewModel.Type access$type(FilterGroupSection.FilterGroupItem filterGroupItem) {
        FilterGroupSection.FilterGroupItem.Sheet sheet;
        FilterGroupSection.FilterGroupItem.Toggle toggle;
        ErrorEvent.Os.Companion companion = filterGroupItem.style;
        if (companion != null) {
            FilterGroupSection$FilterGroupItem$Style$FilterSheet filterGroupSection$FilterGroupItem$Style$FilterSheet = companion instanceof FilterGroupSection$FilterGroupItem$Style$FilterSheet ? (FilterGroupSection$FilterGroupItem$Style$FilterSheet) companion : null;
            if (filterGroupSection$FilterGroupItem$Style$FilterSheet != null) {
                sheet = filterGroupSection$FilterGroupItem$Style$FilterSheet.value;
                if (sheet == null) {
                    return AfterpaySearchViewModel.FilterPillViewModel.Type.SHEET;
                }
                if (companion != null) {
                    FilterGroupSection$FilterGroupItem$Style$FilterToggle filterGroupSection$FilterGroupItem$Style$FilterToggle = companion instanceof FilterGroupSection$FilterGroupItem$Style$FilterToggle ? (FilterGroupSection$FilterGroupItem$Style$FilterToggle) companion : null;
                    if (filterGroupSection$FilterGroupItem$Style$FilterToggle != null) {
                        toggle = filterGroupSection$FilterGroupItem$Style$FilterToggle.value;
                        if (toggle == null) {
                            return AfterpaySearchViewModel.FilterPillViewModel.Type.TOGGLE;
                        }
                        OptionalProvider$$ExternalSyntheticLambda0.m$1("Received neither a sheet nor a toggle");
                        return null;
                    }
                }
                toggle = null;
                if (toggle == null) {
                }
            }
        }
        sheet = null;
        if (sheet == null) {
        }
    }

    public static final FilterGroupSection.FilterGroupItem.FilterItem findItemWithToken(FilterGroupSection.FilterGroupItem filterGroupItem, String str) {
        List list;
        ErrorEvent.Os.Companion companion = filterGroupItem.style;
        Object obj = null;
        if (companion == null) {
            return null;
        }
        FilterGroupSection$FilterGroupItem$Style$FilterSheet filterGroupSection$FilterGroupItem$Style$FilterSheet = companion instanceof FilterGroupSection$FilterGroupItem$Style$FilterSheet ? (FilterGroupSection$FilterGroupItem$Style$FilterSheet) companion : null;
        FilterGroupSection.FilterGroupItem.Sheet sheet = filterGroupSection$FilterGroupItem$Style$FilterSheet != null ? filterGroupSection$FilterGroupItem$Style$FilterSheet.value : null;
        if (sheet == null || (list = sheet.filter_items) == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (Intrinsics.areEqual(((FilterGroupSection.FilterGroupItem.FilterItem) next).filter_token, str)) {
                obj = next;
                break;
            }
        }
        return (FilterGroupSection.FilterGroupItem.FilterItem) obj;
    }

    public static final SearchSection findSectionById(AfterpayAppletSearchResponse afterpayAppletSearchResponse, String str) {
        List list;
        Object obj = null;
        if (afterpayAppletSearchResponse == null || (list = afterpayAppletSearchResponse.sections) == null) {
            return null;
        }
        Iterator it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (Intrinsics.areEqual(((SearchSection) next).section_id, str)) {
                obj = next;
                break;
            }
        }
        return (SearchSection) obj;
    }

    public static final String id(RowSection.FilterRow filterRow, int i) {
        LocalizedString localizedString = filterRow.l_title;
        String str = localizedString != null ? localizedString.translated_value : null;
        if (str == null) {
            a$$ExternalSyntheticBUOutline0.m$3("filterRow.l_title");
            return null;
        }
        return "FILTER_ROW_" + ((Object) str) + "_" + i;
    }

    public static final String id(FilterGroupSection.FilterGroupItem filterGroupItem) {
        LocalizedString localizedString = filterGroupItem.l_default_name;
        String str = localizedString != null ? localizedString.translated_value : null;
        if (str == null) {
            a$$ExternalSyntheticBUOutline0.m$3("filterGroup.l_default_name");
            return null;
        }
        return "ID_" + ((Object) str);
    }

    public static final String id(RowSection.AvatarRow avatarRow, int i) {
        LocalizedString localizedString = avatarRow.label_text;
        String str = localizedString != null ? localizedString.translated_value : null;
        if (str != null) {
            return "AVATAR_ROW_" + ((Object) str) + "_" + i;
        }
        a$$ExternalSyntheticBUOutline0.m$3("avatar_rows.label_text");
        return null;
    }

    public static final String id(AvatarCarouselSection.AvatarItem avatarItem, int i) {
        LocalizedString localizedString = avatarItem.title;
        String str = localizedString != null ? localizedString.translated_value : null;
        if (str == null) {
            a$$ExternalSyntheticBUOutline0.m$3("avatar_items.title");
            return null;
        }
        return "CAROUSEL_" + ((Object) str) + "_" + i;
    }
}
