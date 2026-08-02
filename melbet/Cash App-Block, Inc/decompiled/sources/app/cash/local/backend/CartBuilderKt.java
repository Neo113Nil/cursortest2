package app.cash.local.backend;

import app.cash.local.primitives.CartEntry;
import app.cash.local.primitives.CartEntryWithQuantity;
import app.cash.local.primitives.ComboSlot;
import app.cash.local.primitives.ComboSlotPriceAdjustment;
import app.cash.local.primitives.ComboSlotToken;
import app.cash.local.primitives.LocalMoney;
import app.cash.local.primitives.LocalMoneyKt;
import app.cash.local.primitives.LocationMenu;
import app.cash.local.primitives.MenuItem;
import app.cash.local.primitives.MenuItemModifierList;
import app.cash.local.primitives.MenuItemVariation;
import app.cash.local.primitives.MenuItemVariationToken;
import app.cash.local.primitives.Modifier;
import app.cash.local.primitives.Selection;
import app.cash.local.primitives.SelectionKt;
import app.cash.local.primitives.math.LocalMoneysKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.squareup.protos.cash.local.client.v1.LocalCart;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.SortedSet;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.CollectionsKt___CollectionsJvmKt;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public abstract class CartBuilderKt {
    public static final LocalMoney getCost(CartEntryWithQuantity cartEntryWithQuantity, LocationMenu locationMenu, boolean z) {
        cartEntryWithQuantity.getClass();
        locationMenu.getClass();
        if (cartEntryWithQuantity instanceof CartEntryWithQuantity.ClientCartEntryWithQuantity) {
            CartEntryWithQuantity.ClientCartEntryWithQuantity clientCartEntryWithQuantity = (CartEntryWithQuantity.ClientCartEntryWithQuantity) cartEntryWithQuantity;
            return LocalMoneysKt.times(getCostInMenu(clientCartEntryWithQuantity.cartEntry, locationMenu), clientCartEntryWithQuantity.quantity);
        }
        if (!(cartEntryWithQuantity instanceof CartEntryWithQuantity.ServerCartEntryWithQuantity)) {
            Drop$$ExternalSyntheticBUOutline0.m1m();
            return null;
        }
        if (!z) {
            return ((CartEntryWithQuantity.ServerCartEntryWithQuantity) cartEntryWithQuantity).totalPrice;
        }
        CartEntryWithQuantity.ServerCartEntryWithQuantity serverCartEntryWithQuantity = (CartEntryWithQuantity.ServerCartEntryWithQuantity) cartEntryWithQuantity;
        LocalMoney localMoney = serverCartEntryWithQuantity.totalPriceBeforeDiscount;
        return localMoney == null ? serverCartEntryWithQuantity.totalPrice : localMoney;
    }

    /* JADX WARN: Code restructure failed: missing block: B:91:0x003e, code lost:
    
        if (r5 == false) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final LocalMoney getCostInMenu(CartEntry cartEntry, LocationMenu locationMenu) {
        LocalMoney localMoney;
        LocalMoney localMoney2;
        cartEntry.getClass();
        locationMenu.getClass();
        MenuItem m1244menuItemOrNullGvMOdU0 = locationMenu.m1244menuItemOrNullGvMOdU0(cartEntry.menuItemToken);
        if (m1244menuItemOrNullGvMOdU0 == null) {
            return LocalMoney.Zero;
        }
        ArrayList arrayList = m1244menuItemOrNullGvMOdU0.variations;
        Iterator it = arrayList.iterator();
        boolean z = false;
        Object obj = null;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                String str = ((MenuItemVariation) next).token;
                String str2 = cartEntry.variationToken;
                if (str2 == null ? false : Intrinsics.areEqual(str, str2)) {
                    if (z) {
                        break;
                    }
                    obj = next;
                    z = true;
                }
            }
        }
        obj = null;
        MenuItemVariation menuItemVariation = (MenuItemVariation) obj;
        if (menuItemVariation == null || (localMoney = menuItemVariation.price) == null) {
            MenuItemVariation menuItemVariation2 = (MenuItemVariation) CollectionsKt.firstOrNull((List) arrayList);
            if (menuItemVariation2 == null) {
                Path$$ExternalSyntheticBUOutline0.m$1(m1244menuItemOrNullGvMOdU0, "Could not find a price for menu item: ");
                return null;
            }
            localMoney = menuItemVariation2.price;
        }
        for (CartEntry.ModifierSelection modifierSelection : cartEntry.modifierSelections) {
            String str3 = modifierSelection.listToken;
            String str4 = modifierSelection.selectionToken;
            Integer num = modifierSelection.quantity;
            MenuItemModifierList.InputType inputType = locationMenu.m1245modifierListCUrkqkQ(str3).inputType;
            inputType.getClass();
            boolean z2 = false;
            Object obj2 = null;
            for (Object obj3 : ((MenuItemModifierList.InputType.SelectFromList) inputType).modifiers) {
                if (Intrinsics.areEqual(((Modifier) obj3).token, str4)) {
                    if (z2) {
                        a$$ExternalSyntheticBUOutline0.m$3("Collection contains more than one matching element.");
                        return null;
                    }
                    z2 = true;
                    obj2 = obj3;
                }
            }
            if (!z2) {
                OptionalProvider$$ExternalSyntheticLambda0.m("Collection contains no element matching the predicate.");
                return null;
            }
            LocalMoney localMoney3 = ((Modifier) obj2).price;
            if (localMoney3 != null) {
                localMoney = LocalMoneysKt.plus(localMoney, LocalMoneysKt.times(localMoney3, num != null ? num.intValue() : 1));
            }
        }
        ArrayList<ComboSlot> arrayList2 = m1244menuItemOrNullGvMOdU0.comboSlots;
        ArrayList arrayList3 = new ArrayList();
        for (ComboSlot comboSlot : arrayList2) {
            ArrayList<ComboSlotPriceAdjustment> arrayList4 = comboSlot.priceAdjustments;
            ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList4, 10));
            for (ComboSlotPriceAdjustment comboSlotPriceAdjustment : arrayList4) {
                arrayList5.add(new Pair(new Pair(new ComboSlotToken(comboSlot.token), new MenuItemVariationToken(comboSlotPriceAdjustment.variationToken)), comboSlotPriceAdjustment.priceAdjustment));
            }
            CollectionsKt__MutableCollectionsKt.addAll(arrayList5, arrayList3);
        }
        Map map = MapsKt__MapsKt.toMap(arrayList3);
        for (CartEntry.ComboSlotSelection comboSlotSelection : cartEntry.comboSlotSelections) {
            String str5 = comboSlotSelection.comboSlotToken;
            String str6 = comboSlotSelection.variationToken;
            if (str6 != null && (localMoney2 = (LocalMoney) map.get(new Pair(new ComboSlotToken(str5), new MenuItemVariationToken(str6)))) != null) {
                localMoney = LocalMoneysKt.plus(localMoney, localMoney2);
            }
        }
        return localMoney;
    }

    /* renamed from: toCartEntry-xZOLh24, reason: not valid java name */
    public static final CartEntry m1202toCartEntryxZOLh24(Selection selection, LocationMenu locationMenu, String str, String str2) {
        selection.getClass();
        locationMenu.getClass();
        String str3 = selection.menuItemToken;
        String str4 = selection.menuItemVariationToken;
        SortedSet sortedSet = CollectionsKt___CollectionsJvmKt.toSortedSet(toModifierSelections(selection.modifiers, locationMenu));
        SortedSet sortedSet2 = CollectionsKt___CollectionsJvmKt.toSortedSet(toModifierFreeEntries(selection.textModifiers, locationMenu));
        List list = selection.comboSlots;
        list.getClass();
        List<LocalCart.Line.Selection.ComboSlot> list2 = list;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
        for (LocalCart.Line.Selection.ComboSlot comboSlot : list2) {
            String str5 = comboSlot.menu_item_combo_slot_token;
            str5.getClass();
            String str6 = comboSlot.menu_item_token;
            str6.getClass();
            String str7 = comboSlot.menu_item_variation_token;
            if (str7 == null) {
                str7 = null;
            }
            arrayList.add(new CartEntry.ComboSlotSelection(str5, str6, str7, CollectionsKt___CollectionsJvmKt.toSortedSet(toModifierSelections(comboSlot.modifiers, locationMenu)), CollectionsKt___CollectionsJvmKt.toSortedSet(toModifierFreeEntries(comboSlot.text_modifiers, locationMenu))));
        }
        return new CartEntry(str3, str4, sortedSet, sortedSet2, arrayList, str, str2);
    }

    /* renamed from: toCartEntryWithQuantity-NvqXVjw, reason: not valid java name */
    public static final CartEntryWithQuantity.ServerCartEntryWithQuantity m1203toCartEntryWithQuantityNvqXVjw(LocalCart.Line line, LocationMenu locationMenu, String str) {
        line.getClass();
        locationMenu.getClass();
        LocalCart.Line.Selection selection = line.selection;
        selection.getClass();
        Selection selection2 = SelectionKt.toSelection(selection);
        CartEntry m1202toCartEntryxZOLh24 = m1202toCartEntryxZOLh24(selection2, locationMenu, line.discount_text, str);
        int i = selection2.quantity;
        com.squareup.protos.cash.local.client.v1.LocalMoney localMoney = line.total_price;
        LocalMoney money = localMoney != null ? LocalMoneyKt.toMoney(localMoney) : getCostInMenu(m1202toCartEntryxZOLh24, locationMenu);
        com.squareup.protos.cash.local.client.v1.LocalMoney localMoney2 = line.total_price_before_discounts;
        return new CartEntryWithQuantity.ServerCartEntryWithQuantity(m1202toCartEntryxZOLh24, i, null, money, localMoney2 != null ? LocalMoneyKt.toMoney(localMoney2) : null);
    }

    public static final ArrayList toModifierFreeEntries(List list, LocationMenu locationMenu) {
        CartEntry.ModifierFreeEntry modifierFreeEntry;
        list.getClass();
        locationMenu.getClass();
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            LocalCart.Line.Selection.TextModifier textModifier = (LocalCart.Line.Selection.TextModifier) it.next();
            String str = textModifier.menu_item_menu_modifier_token;
            if (str != null) {
                String str2 = locationMenu.m1245modifierListCUrkqkQ(str).token;
                String str3 = textModifier.inputted_text;
                if (str3 == null) {
                    str3 = "";
                }
                modifierFreeEntry = new CartEntry.ModifierFreeEntry(str2, str3);
            } else {
                modifierFreeEntry = null;
            }
            if (modifierFreeEntry != null) {
                arrayList.add(modifierFreeEntry);
            }
        }
        return arrayList;
    }

    public static final ArrayList toModifierSelections(List list, LocationMenu locationMenu) {
        list.getClass();
        locationMenu.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            Integer num = ((LocalCart.Line.Selection.Modifier) obj).quantity;
            if (num == null || num.intValue() > 0) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            LocalCart.Line.Selection.Modifier modifier = (LocalCart.Line.Selection.Modifier) it.next();
            String str = modifier.menu_item_modifier_token;
            CartEntry.ModifierSelection modifierSelection = str != null ? new CartEntry.ModifierSelection(modifier.quantity, locationMenu.m1247modifierListWithModifierQkZh8Tc(str).token, str) : null;
            if (modifierSelection != null) {
                arrayList2.add(modifierSelection);
            }
        }
        return arrayList2;
    }
}
