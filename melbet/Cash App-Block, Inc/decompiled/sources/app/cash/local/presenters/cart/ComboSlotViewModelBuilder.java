package app.cash.local.presenters.cart;

import app.cash.local.presenters.internal.LocalsKt;
import app.cash.local.primitives.CartEntry;
import app.cash.local.primitives.ComboSlot;
import app.cash.local.primitives.ComboSlotPriceAdjustment;
import app.cash.local.primitives.LocalMoney;
import app.cash.local.primitives.LocationMenu;
import app.cash.local.primitives.MenuItem;
import app.cash.local.primitives.MenuItemVariation;
import app.cash.local.viewmodels.ComboSlotViewModel;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.work.views.you.WorkYouViewKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;
import org.slf4j.Marker;

/* loaded from: classes3.dex */
public abstract class ComboSlotViewModelBuilder {
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0052, code lost:
    
        if (r5 == null) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ComboSlotViewModel buildComboSlotViewModel(LocationMenu locationMenu, MenuItem menuItem, CartEntry.ComboSlotSelection comboSlotSelection, List list) {
        ComboSlot comboSlot;
        MenuItemVariation menuItemVariation;
        Object obj;
        String str;
        Object obj2;
        locationMenu.getClass();
        comboSlotSelection.getClass();
        list.getClass();
        Iterator it = menuItem.comboSlots.iterator();
        do {
            if (!it.hasNext()) {
                OptionalProvider$$ExternalSyntheticLambda0.m("Collection contains no element matching the predicate.");
                return null;
            }
            comboSlot = (ComboSlot) it.next();
        } while (!Intrinsics.areEqual(comboSlot.token, comboSlotSelection.comboSlotToken));
        MenuItem m1244menuItemOrNullGvMOdU0 = locationMenu.m1244menuItemOrNullGvMOdU0(comboSlotSelection.menuItemToken);
        if (m1244menuItemOrNullGvMOdU0 == null) {
            return null;
        }
        ArrayList arrayList = m1244menuItemOrNullGvMOdU0.variations;
        String str2 = comboSlotSelection.variationToken;
        if (str2 != null) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                if (Intrinsics.areEqual(((MenuItemVariation) obj2).token, str2)) {
                    break;
                }
            }
            menuItemVariation = (MenuItemVariation) obj2;
        }
        menuItemVariation = (MenuItemVariation) CollectionsKt.firstOrNull((List) arrayList);
        Iterator it3 = comboSlot.priceAdjustments.iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj = null;
                break;
            }
            obj = it3.next();
            String str3 = ((ComboSlotPriceAdjustment) obj).variationToken;
            String str4 = menuItemVariation != null ? menuItemVariation.token : null;
            if (str4 == null ? false : Intrinsics.areEqual(str3, str4)) {
                break;
            }
        }
        ComboSlotPriceAdjustment comboSlotPriceAdjustment = (ComboSlotPriceAdjustment) obj;
        LocalMoney localMoney = comboSlotPriceAdjustment != null ? comboSlotPriceAdjustment.priceAdjustment : null;
        String str5 = m1244menuItemOrNullGvMOdU0.name;
        if (menuItemVariation == null || (str = menuItemVariation.name) == null || arrayList.size() <= 1) {
            str = null;
        }
        SortedSet<CartEntry.ModifierSelection> sortedSet = comboSlotSelection.modifierSelections;
        ArrayList arrayList2 = new ArrayList();
        for (CartEntry.ModifierSelection modifierSelection : sortedSet) {
            modifierSelection.getClass();
            LineSelectionInformationRenderer$ModifierInformation modifierInformation = LineSelectionInformationRendererKt.toModifierInformation(modifierSelection, locationMenu);
            if (modifierInformation != null) {
                arrayList2.add(modifierInformation);
            }
        }
        SortedSet<CartEntry.ModifierFreeEntry> sortedSet2 = comboSlotSelection.freeTextEntries;
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(sortedSet2, 10));
        for (CartEntry.ModifierFreeEntry modifierFreeEntry : sortedSet2) {
            modifierFreeEntry.getClass();
            arrayList3.add(LineSelectionInformationRendererKt.toTextModifierInformation(modifierFreeEntry, locationMenu));
        }
        return new ComboSlotViewModel(str5, WorkYouViewKt.renderSelectionInformation(str, arrayList2, arrayList3), localMoney != null ? LocalsKt.prettyPrint$default(localMoney, false, localMoney.amount > 0 ? Marker.ANY_NON_NULL_MARKER : "", 5) : null, list);
    }
}
