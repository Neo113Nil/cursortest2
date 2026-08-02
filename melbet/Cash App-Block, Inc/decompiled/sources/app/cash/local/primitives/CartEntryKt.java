package app.cash.local.primitives;

import app.cash.local.primitives.CartEntry;
import com.squareup.protos.cash.local.client.v1.LocalCart;
import java.util.ArrayList;
import java.util.List;
import java.util.SortedSet;
import kotlin.collections.CollectionsKt__IterablesKt;

/* loaded from: classes3.dex */
public abstract class CartEntryKt {
    public static final Selection toSelection(CartEntry cartEntry, int i) {
        cartEntry.getClass();
        String str = cartEntry.menuItemToken;
        String str2 = cartEntry.variationToken;
        SortedSet<CartEntry.ModifierSelection> sortedSet = cartEntry.modifierSelections;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(sortedSet, 10));
        for (CartEntry.ModifierSelection modifierSelection : sortedSet) {
            arrayList.add(new LocalCart.Line.Selection.Modifier(modifierSelection.selectionToken, modifierSelection.quantity, null, null, null, null, 60, null));
        }
        SortedSet<CartEntry.ModifierFreeEntry> sortedSet2 = cartEntry.freeTextEntries;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(sortedSet2, 10));
        for (CartEntry.ModifierFreeEntry modifierFreeEntry : sortedSet2) {
            arrayList2.add(new LocalCart.Line.Selection.TextModifier(modifierFreeEntry.listToken, modifierFreeEntry.input, null, null, 12, null));
        }
        List<CartEntry.ComboSlotSelection> list = cartEntry.comboSlotSelections;
        ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        for (CartEntry.ComboSlotSelection comboSlotSelection : list) {
            String str3 = comboSlotSelection.comboSlotToken;
            String str4 = comboSlotSelection.menuItemToken;
            String str5 = comboSlotSelection.variationToken;
            if (str5 == null) {
                str5 = null;
            }
            String str6 = str5;
            SortedSet<CartEntry.ModifierSelection> sortedSet3 = comboSlotSelection.modifierSelections;
            ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(sortedSet3, 10));
            for (CartEntry.ModifierSelection modifierSelection2 : sortedSet3) {
                arrayList4.add(new LocalCart.Line.Selection.Modifier(modifierSelection2.selectionToken, modifierSelection2.quantity, null, null, null, null, 60, null));
            }
            SortedSet<CartEntry.ModifierFreeEntry> sortedSet4 = comboSlotSelection.freeTextEntries;
            ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(sortedSet4, 10));
            for (CartEntry.ModifierFreeEntry modifierFreeEntry2 : sortedSet4) {
                arrayList5.add(new LocalCart.Line.Selection.TextModifier(modifierFreeEntry2.listToken, modifierFreeEntry2.input, null, null, 12, null));
            }
            arrayList3.add(new LocalCart.Line.Selection.ComboSlot(str3, str4, str6, arrayList4, arrayList5, null, null, null, 224, null));
        }
        return new Selection(str, i, str2, arrayList, arrayList2, arrayList3);
    }
}
