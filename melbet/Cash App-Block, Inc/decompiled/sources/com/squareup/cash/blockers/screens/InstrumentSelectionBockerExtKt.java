package com.squareup.cash.blockers.screens;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.cash.blockers.screens.InstrumentSelectionBlockerScreen;
import com.squareup.cash.screens.RedactedString;
import com.squareup.protos.franklin.api.CashInstrumentType;
import com.squareup.protos.franklin.blockers.InstrumentSelectionBlockerV3;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;

/* loaded from: classes8.dex */
public abstract class InstrumentSelectionBockerExtKt {
    public static final InstrumentSelectionBlockerScreen.InstrumentOption asInstrumentOption(InstrumentSelectionBlockerV3.InstrumentOption instrumentOption) {
        String str;
        InstrumentSelectionBlockerScreen.InstrumentAction instrumentAction;
        String str2 = instrumentOption.title;
        str2.getClass();
        String str3 = instrumentOption.subtitle;
        InstrumentSelectionBlockerV3.InstrumentOption.InstrumentLabel instrumentLabel = instrumentOption.tertiary_label;
        CashInstrumentType cashInstrumentType = instrumentOption.instrument_type;
        InstrumentSelectionBlockerV3.InstrumentOption.Icon icon = instrumentOption.icon;
        InstrumentSelectionBlockerV3.InstrumentOption.Icon.Url url = icon instanceof InstrumentSelectionBlockerV3.InstrumentOption.Icon.Url ? (InstrumentSelectionBlockerV3.InstrumentOption.Icon.Url) icon : null;
        String value = url != null ? url.getValue() : null;
        InstrumentSelectionBlockerV3.InstrumentOption.Icon icon2 = instrumentOption.icon;
        InstrumentSelectionBlockerV3.InstrumentOption.Icon.ArcadeId arcadeId = icon2 instanceof InstrumentSelectionBlockerV3.InstrumentOption.Icon.ArcadeId ? (InstrumentSelectionBlockerV3.InstrumentOption.Icon.ArcadeId) icon2 : null;
        if (arcadeId == null || (str = arcadeId.getValue()) == null) {
            str = instrumentOption.fallback_arcade_id;
        }
        RedactedString redactedString = null;
        InstrumentSelectionBlockerScreen.IconData iconData = new InstrumentSelectionBlockerScreen.IconData(value, str != null ? new InstrumentSelectionBlockerScreen.IconData.ArcadeIcon(str, instrumentOption.icon_background_color) : null, instrumentOption.card_image_url);
        InstrumentSelectionBlockerV3.InstrumentOption.SelectionAction selectionAction = instrumentOption.selection_action;
        if (selectionAction instanceof InstrumentSelectionBlockerV3.InstrumentOption.SelectionAction.SelectInstrumentAction) {
            InstrumentSelectionBlockerV3.InstrumentOption.SelectionAction.SelectInstrumentAction selectInstrumentAction = (InstrumentSelectionBlockerV3.InstrumentOption.SelectionAction.SelectInstrumentAction) selectionAction;
            String str4 = selectInstrumentAction.getValue().instrumentToken;
            str4.getClass();
            CashInstrumentType cashInstrumentType2 = selectInstrumentAction.getValue().instrumentType;
            cashInstrumentType2.getClass();
            instrumentAction = new InstrumentSelectionBlockerScreen.InstrumentAction.Select(cashInstrumentType2, str4);
        } else if (selectionAction instanceof InstrumentSelectionBlockerV3.InstrumentOption.SelectionAction.LinkInstrumentAction) {
            CashInstrumentType cashInstrumentType3 = ((InstrumentSelectionBlockerV3.InstrumentOption.SelectionAction.LinkInstrumentAction) selectionAction).getValue().instrumentType;
            cashInstrumentType3.getClass();
            instrumentAction = new InstrumentSelectionBlockerScreen.InstrumentAction.Link(cashInstrumentType3);
        } else if (selectionAction instanceof InstrumentSelectionBlockerV3.InstrumentOption.SelectionAction.ReplaceInstrumentAction) {
            InstrumentSelectionBlockerV3.InstrumentOption.SelectionAction.ReplaceInstrumentAction replaceInstrumentAction = (InstrumentSelectionBlockerV3.InstrumentOption.SelectionAction.ReplaceInstrumentAction) selectionAction;
            String str5 = replaceInstrumentAction.getValue().instrumentToken;
            str5.getClass();
            CashInstrumentType cashInstrumentType4 = replaceInstrumentAction.getValue().instrumentType;
            cashInstrumentType4.getClass();
            instrumentAction = new InstrumentSelectionBlockerScreen.InstrumentAction.Replace(cashInstrumentType4, str5);
        } else if (selectionAction instanceof InstrumentSelectionBlockerV3.InstrumentOption.SelectionAction.ShowSheetInstrumentAction) {
            InstrumentSelectionBlockerV3.Sheet sheet = ((InstrumentSelectionBlockerV3.InstrumentOption.SelectionAction.ShowSheetInstrumentAction) selectionAction).getValue().sheet;
            sheet.getClass();
            String str6 = sheet.header;
            str6.getClass();
            String str7 = sheet.description;
            List<InstrumentSelectionBlockerV3.InstrumentOption> list = sheet.instrument_options;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(asInstrumentOption((InstrumentSelectionBlockerV3.InstrumentOption) it.next()));
            }
            instrumentAction = new InstrumentSelectionBlockerScreen.InstrumentAction.ShowSheet(str6, str7, arrayList);
        } else {
            if (!(selectionAction instanceof InstrumentSelectionBlockerV3.InstrumentOption.SelectionAction.NoInstrumentAction)) {
                if (selectionAction == null) {
                    a$$ExternalSyntheticBUOutline0.m$3("InstrumentOption must have a valid action");
                    return null;
                }
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            instrumentAction = InstrumentSelectionBlockerScreen.InstrumentAction.None.INSTANCE;
        }
        Boolean bool = instrumentOption.preselected;
        boolean booleanValue = bool != null ? bool.booleanValue() : false;
        String str8 = instrumentOption.info_message;
        if (str8 != null) {
            redactedString = new RedactedString(str8);
        }
        return new InstrumentSelectionBlockerScreen.InstrumentOption(str2, str3, instrumentLabel, instrumentAction, iconData, booleanValue, redactedString, cashInstrumentType);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r2v3, types: [java.util.ArrayList] */
    public static final InstrumentSelectionBlockerScreen asScreen(InstrumentSelectionBlockerV3 instrumentSelectionBlockerV3, BlockersData blockersData) {
        ?? listOf;
        instrumentSelectionBlockerV3.getClass();
        if (instrumentSelectionBlockerV3.instrument_sections.isEmpty()) {
            String str = instrumentSelectionBlockerV3.title;
            str.getClass();
            RedactedString redactedString = new RedactedString(str);
            List<InstrumentSelectionBlockerV3.InstrumentOption> list = instrumentSelectionBlockerV3.instrument_options;
            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(asInstrumentOption((InstrumentSelectionBlockerV3.InstrumentOption) it.next()));
            }
            listOf = CollectionsKt__CollectionsJVMKt.listOf(new InstrumentSelectionBlockerScreen.InstrumentSection(redactedString, arrayList));
        } else {
            List<InstrumentSelectionBlockerV3.InstrumentSection> list2 = instrumentSelectionBlockerV3.instrument_sections;
            listOf = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            for (InstrumentSelectionBlockerV3.InstrumentSection instrumentSection : list2) {
                String str2 = instrumentSection.title;
                str2.getClass();
                RedactedString redactedString2 = new RedactedString(str2);
                List<InstrumentSelectionBlockerV3.InstrumentOption> list3 = instrumentSection.instrument_options;
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                Iterator it2 = list3.iterator();
                while (it2.hasNext()) {
                    arrayList2.add(asInstrumentOption((InstrumentSelectionBlockerV3.InstrumentOption) it2.next()));
                }
                listOf.add(new InstrumentSelectionBlockerScreen.InstrumentSection(redactedString2, arrayList2));
            }
        }
        String str3 = instrumentSelectionBlockerV3.ctaButtonLabel;
        str3.getClass();
        return new InstrumentSelectionBlockerScreen(blockersData, listOf, str3);
    }
}
