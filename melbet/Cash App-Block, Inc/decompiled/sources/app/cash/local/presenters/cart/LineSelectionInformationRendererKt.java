package app.cash.local.presenters.cart;

import app.cash.local.primitives.CartEntry;
import app.cash.local.primitives.LocationMenu;
import app.cash.local.primitives.MenuItem;
import app.cash.local.primitives.MenuItemModifierList;
import app.cash.local.primitives.MenuItemVariation;
import app.cash.local.primitives.Modifier;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.cash.work.views.you.WorkYouViewKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.SortedSet;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public abstract class LineSelectionInformationRendererKt {
    public static final String buildSelectionInformationString(CartEntry cartEntry, LocationMenu locationMenu, MenuItem menuItem) {
        locationMenu.getClass();
        if (!cartEntry.comboSlotSelections.isEmpty()) {
            return null;
        }
        boolean z = false;
        Object obj = null;
        for (Object obj2 : menuItem.variations) {
            String str = ((MenuItemVariation) obj2).token;
            String str2 = cartEntry.variationToken;
            if (str2 == null ? false : Intrinsics.areEqual(str, str2)) {
                if (z) {
                    a$$ExternalSyntheticBUOutline0.m$3("Collection contains more than one matching element.");
                    return null;
                }
                z = true;
                obj = obj2;
            }
        }
        if (!z) {
            OptionalProvider$$ExternalSyntheticLambda0.m("Collection contains no element matching the predicate.");
            return null;
        }
        String str3 = ((MenuItemVariation) obj).name;
        SortedSet<CartEntry.ModifierSelection> sortedSet = cartEntry.modifierSelections;
        ArrayList arrayList = new ArrayList();
        for (CartEntry.ModifierSelection modifierSelection : sortedSet) {
            modifierSelection.getClass();
            LineSelectionInformationRenderer$ModifierInformation modifierInformation = toModifierInformation(modifierSelection, locationMenu);
            if (modifierInformation != null) {
                arrayList.add(modifierInformation);
            }
        }
        SortedSet<CartEntry.ModifierFreeEntry> sortedSet2 = cartEntry.freeTextEntries;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(sortedSet2, 10));
        for (CartEntry.ModifierFreeEntry modifierFreeEntry : sortedSet2) {
            modifierFreeEntry.getClass();
            arrayList2.add(toTextModifierInformation(modifierFreeEntry, locationMenu));
        }
        return WorkYouViewKt.renderSelectionInformation(str3, arrayList, arrayList2);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x003f, code lost:
    
        if (r1 == false) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final LineSelectionInformationRenderer$ModifierInformation toModifierInformation(CartEntry.ModifierSelection modifierSelection, LocationMenu locationMenu) {
        locationMenu.getClass();
        MenuItemModifierList m1246modifierListOrNullCUrkqkQ = locationMenu.m1246modifierListOrNullCUrkqkQ(modifierSelection.listToken);
        if (m1246modifierListOrNullCUrkqkQ != null) {
            MenuItemModifierList.InputType inputType = m1246modifierListOrNullCUrkqkQ.inputType;
            MenuItemModifierList.InputType.SelectFromList selectFromList = inputType instanceof MenuItemModifierList.InputType.SelectFromList ? (MenuItemModifierList.InputType.SelectFromList) inputType : null;
            if (selectFromList != null) {
                Iterator it = selectFromList.modifiers.iterator();
                boolean z = false;
                Object obj = null;
                while (true) {
                    if (it.hasNext()) {
                        Object next = it.next();
                        if (Intrinsics.areEqual(((Modifier) next).token, modifierSelection.selectionToken)) {
                            if (z) {
                                break;
                            }
                            z = true;
                            obj = next;
                        }
                    }
                }
                obj = null;
                Modifier modifier = (Modifier) obj;
                if (modifier != null) {
                    return new LineSelectionInformationRenderer$ModifierInformation(modifier.name, modifierSelection.quantity, modifier.price);
                }
            }
        }
        return null;
    }

    public static final LineSelectionInformationRenderer$TextModifierInformation toTextModifierInformation(CartEntry.ModifierFreeEntry modifierFreeEntry, LocationMenu locationMenu) {
        locationMenu.getClass();
        return new LineSelectionInformationRenderer$TextModifierInformation(locationMenu.m1245modifierListCUrkqkQ(modifierFreeEntry.listToken).name, modifierFreeEntry.input);
    }
}
