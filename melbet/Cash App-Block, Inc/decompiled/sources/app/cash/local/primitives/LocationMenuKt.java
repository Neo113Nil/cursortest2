package app.cash.local.primitives;

import app.cash.local.primitives.LocationMenu;
import app.cash.local.primitives.MenuItemModifierList;
import com.google.android.gms.internal.mlkit_vision_common.zzit;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.protos.cash.local.client.v1.LocalComboSlotPriceAdjustment;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.protos.cash.local.client.v1.LocalMenu;
import com.squareup.protos.cash.local.client.v1.LocalMenuAvailability;
import com.squareup.protos.cash.local.client.v1.LocalMenuCategory;
import com.squareup.protos.cash.local.client.v1.LocalMenuCategoryCollection;
import com.squareup.protos.cash.local.client.v1.LocalMenuComboCategory;
import com.squareup.protos.cash.local.client.v1.LocalMenuDiscountSummary;
import com.squareup.protos.cash.local.client.v1.LocalMenuHours;
import com.squareup.protos.cash.local.client.v1.LocalMenuItem;
import com.squareup.protos.cash.local.client.v1.LocalMenuItemComboSlot;
import com.squareup.protos.cash.local.client.v1.LocalMenuItemDeal;
import com.squareup.protos.cash.local.client.v1.LocalMenuItemModifierList;
import com.squareup.protos.cash.local.client.v1.LocalMenuItemModifierList$InputType$FreeTextEntry;
import com.squareup.protos.cash.local.client.v1.LocalMenuItemModifierList$InputType$SelectFromList;
import com.squareup.protos.cash.local.client.v1.LocalMenuItemVariation;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.CollectionsKt__MutableCollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.internal.Intrinsics;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public abstract class LocationMenuKt {
    public static final ArrayList access$withNestedModifierLists(List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            MenuItemModifierList menuItemModifierList = (MenuItemModifierList) it.next();
            CollectionsKt__MutableCollectionsKt.addAll(CollectionsKt.plus((Iterable) nestedMenuItemModifierLists(menuItemModifierList), (Collection) CollectionsKt__CollectionsJVMKt.listOf(menuItemModifierList)), arrayList);
        }
        return arrayList;
    }

    public static EmptyList getDeepLinkSpecs() {
        return ClientRoute.ViewDependentSavingsGeneralFolder.deepLinkSpecs;
    }

    public static final List nestedMenuItemModifierLists(MenuItemModifierList menuItemModifierList) {
        MenuItemModifierList.InputType selectFromList;
        MenuItemModifierList.InputType inputType = menuItemModifierList.inputType;
        MenuItemModifierList.InputType.SelectFromList selectFromList2 = inputType instanceof MenuItemModifierList.InputType.SelectFromList ? (MenuItemModifierList.InputType.SelectFromList) inputType : null;
        if (selectFromList2 == null) {
            return EmptyList.INSTANCE;
        }
        ArrayList arrayList = selectFromList2.modifiers;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            ArrayList<NestedModifierList> arrayList3 = ((Modifier) it.next()).nestedModifierLists;
            ArrayList arrayList4 = new ArrayList();
            for (NestedModifierList nestedModifierList : arrayList3) {
                String str = nestedModifierList.token;
                String str2 = nestedModifierList.name;
                if (nestedModifierList.isFreeText) {
                    Integer num = nestedModifierList.maxLength;
                    selectFromList = new MenuItemModifierList.InputType.FreeTextEntry(num != null ? num.intValue() : Integer.MAX_VALUE, nestedModifierList.minSelections > 0 || nestedModifierList.requireNonEmptyString);
                } else {
                    selectFromList = new MenuItemModifierList.InputType.SelectFromList(nestedModifierList.modifiers);
                }
                MenuItemModifierList menuItemModifierList2 = new MenuItemModifierList(str, str2, selectFromList);
                CollectionsKt__MutableCollectionsKt.addAll(CollectionsKt.plus((Iterable) nestedMenuItemModifierLists(menuItemModifierList2), (Collection) CollectionsKt__CollectionsJVMKt.listOf(menuItemModifierList2)), arrayList4);
            }
            CollectionsKt__MutableCollectionsKt.addAll(arrayList4, arrayList2);
        }
        return arrayList2;
    }

    public static final LocationMenu toLocationMenu(LocalMenu localMenu) {
        MenuItemModifierList.InputType selectFromList;
        MenuItemPreorderingSummary menuItemPreorderingSummary;
        localMenu.getClass();
        String str = localMenu.title;
        List list = localMenu.categories;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (!((LocalMenuCategory) obj).item_tokens.isEmpty()) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            LocalMenuCategory localMenuCategory = (LocalMenuCategory) it.next();
            localMenuCategory.getClass();
            String str2 = localMenuCategory.token;
            str2.getClass();
            String str3 = localMenuCategory.name;
            str3.getClass();
            LocalImage localImage = localMenuCategory.image;
            List<String> list2 = localMenuCategory.item_tokens;
            ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
            for (String str4 : list2) {
                str4.getClass();
                arrayList3.add(new MenuItemToken(str4));
            }
            LocalMenuHours localMenuHours = localMenuCategory.menu_hours;
            arrayList2.add(new Category(str2, str3, localImage, arrayList3, localMenuHours != null ? MenuHoursKt.toMenuHours(localMenuHours) : null));
        }
        Map map = localMenu.combo_categories;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (!((LocalMenuComboCategory) entry.getValue()).item_tokens.isEmpty()) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        ArrayList arrayList4 = new ArrayList(linkedHashMap.size());
        for (Map.Entry entry2 : linkedHashMap.entrySet()) {
            String str5 = (String) entry2.getKey();
            LocalMenuComboCategory localMenuComboCategory = (LocalMenuComboCategory) entry2.getValue();
            str5.getClass();
            ComboCategoryToken comboCategoryToken = new ComboCategoryToken(str5);
            localMenuComboCategory.getClass();
            String str6 = localMenuComboCategory.token;
            str6.getClass();
            String str7 = localMenuComboCategory.name;
            str7.getClass();
            LocalImage localImage2 = localMenuComboCategory.image;
            List<String> list3 = localMenuComboCategory.item_tokens;
            ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
            for (String str8 : list3) {
                str8.getClass();
                arrayList5.add(new MenuItemToken(str8));
            }
            arrayList4.add(new Pair(comboCategoryToken, new ComboCategory(str6, str7, localImage2, arrayList5)));
        }
        Map map2 = MapsKt__MapsKt.toMap(arrayList4);
        Collection values = localMenu.items.values();
        ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(values, 10));
        Iterator it2 = values.iterator();
        while (true) {
            if (!it2.hasNext()) {
                break;
            }
            LocalMenuItem localMenuItem = (LocalMenuItem) it2.next();
            localMenuItem.getClass();
            String str9 = localMenuItem.token;
            List list4 = localMenuItem.combo_slots;
            str9.getClass();
            String str10 = localMenuItem.name;
            str10.getClass();
            Integer num = localMenuItem.total_calories;
            String str11 = localMenuItem.description;
            List list5 = localMenuItem.dietary_preferences;
            List list6 = localMenuItem.ingredients;
            LocalImage localImage3 = localMenuItem.image;
            String str12 = str;
            LocalMenuItemDeal localMenuItemDeal = localMenuItem.deal;
            Integer num2 = localMenuItem.max_order_quantity;
            int intValue = num2 != null ? num2.intValue() : Integer.MAX_VALUE;
            List list7 = localMenuItem.variations;
            ArrayList arrayList7 = arrayList2;
            Map map3 = map2;
            ArrayList arrayList8 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list7, 10));
            Iterator it3 = list7.iterator();
            while (it3.hasNext()) {
                LocalMenuItemVariation localMenuItemVariation = (LocalMenuItemVariation) it3.next();
                localMenuItemVariation.getClass();
                String str13 = localMenuItemVariation.token;
                str13.getClass();
                Iterator it4 = it3;
                String str14 = localMenuItemVariation.name;
                str14.getClass();
                com.squareup.protos.cash.local.client.v1.LocalMoney localMoney = localMenuItemVariation.price;
                localMoney.getClass();
                LocalMoney money = LocalMoneyKt.toMoney(localMoney);
                LocalMenuItemDeal localMenuItemDeal2 = localMenuItemVariation.deal;
                LocalMenuAvailability localMenuAvailability = localMenuItemVariation.availability;
                if (localMenuAvailability == null) {
                    localMenuAvailability = LocalMenuAvailability.LOCAL_MENU_AVAILABILITY_NORMAL;
                }
                arrayList8.add(new MenuItemVariation(str13, str14, money, localMenuItemDeal2, localMenuAvailability));
                it3 = it4;
            }
            List list8 = localMenuItem.modifier_list_configs;
            ArrayList arrayList9 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list8, 10));
            Iterator it5 = list8.iterator();
            while (it5.hasNext()) {
                LocalMenuItem.ModifierListConfig modifierListConfig = (LocalMenuItem.ModifierListConfig) it5.next();
                modifierListConfig.getClass();
                Iterator it6 = it5;
                String str15 = modifierListConfig.modifier_list_token;
                str15.getClass();
                arrayList9.add(new ModifierListConfig(str15, modifierListConfig.min_selections, modifierListConfig.max_selections, Intrinsics.areEqual(modifierListConfig.allow_quantities, Boolean.TRUE)));
                it5 = it6;
                list6 = list6;
                list5 = list5;
                it2 = it2;
            }
            Iterator it7 = it2;
            List list9 = list6;
            List list10 = list5;
            LocalMenuAvailability localMenuAvailability2 = localMenuItem.availability;
            if (localMenuAvailability2 == null) {
                localMenuAvailability2 = LocalMenuAvailability.LOCAL_MENU_AVAILABILITY_NORMAL;
            }
            LocalMenuAvailability localMenuAvailability3 = localMenuAvailability2;
            LocalMenuHours localMenuHours2 = localMenuItem.menu_hours;
            MenuHours menuHours = localMenuHours2 != null ? MenuHoursKt.toMenuHours(localMenuHours2) : null;
            boolean z = !list4.isEmpty();
            List list11 = list4;
            ArrayList arrayList10 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list11, 10));
            Iterator it8 = list11.iterator();
            while (it8.hasNext()) {
                LocalMenuItemComboSlot localMenuItemComboSlot = (LocalMenuItemComboSlot) it8.next();
                localMenuItemComboSlot.getClass();
                String str16 = localMenuItemComboSlot.token;
                str16.getClass();
                String str17 = localMenuItemComboSlot.name;
                str17.getClass();
                String str18 = localMenuItemComboSlot.combo_category_token;
                String str19 = str18 != null ? str18 : null;
                List<String> list12 = localMenuItemComboSlot.available_item_tokens;
                Iterator it9 = it8;
                ArrayList arrayList11 = arrayList9;
                ArrayList arrayList12 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list12, 10));
                for (String str20 : list12) {
                    str20.getClass();
                    arrayList12.add(new MenuItemToken(str20));
                }
                List<String> list13 = localMenuItemComboSlot.available_variation_tokens;
                ArrayList arrayList13 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list13, 10));
                for (String str21 : list13) {
                    str21.getClass();
                    arrayList13.add(new MenuItemVariationToken(str21));
                }
                String str22 = localMenuItemComboSlot.default_variation_token;
                String str23 = str22 != null ? str22 : null;
                Integer num3 = localMenuItemComboSlot.num_selections;
                num3.getClass();
                int intValue2 = num3.intValue();
                List list14 = localMenuItemComboSlot.price_adjustments;
                ArrayList arrayList14 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list14, 10));
                Iterator it10 = list14.iterator();
                while (it10.hasNext()) {
                    LocalComboSlotPriceAdjustment localComboSlotPriceAdjustment = (LocalComboSlotPriceAdjustment) it10.next();
                    localComboSlotPriceAdjustment.getClass();
                    Iterator it11 = it10;
                    String str24 = localComboSlotPriceAdjustment.variation_token;
                    str24.getClass();
                    com.squareup.protos.cash.local.client.v1.LocalMoney localMoney2 = localComboSlotPriceAdjustment.price_adjustment;
                    localMoney2.getClass();
                    arrayList14.add(new ComboSlotPriceAdjustment(LocalMoneyKt.toMoney(localMoney2), str24));
                    it10 = it11;
                }
                arrayList10.add(new ComboSlot(str16, str17, str19, arrayList12, arrayList13, str23, intValue2, arrayList14));
                it8 = it9;
                arrayList9 = arrayList11;
            }
            ArrayList arrayList15 = arrayList9;
            List<String> list15 = localMenuItem.discount_tokens;
            ArrayList arrayList16 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list15, 10));
            for (String str25 : list15) {
                str25.getClass();
                arrayList16.add(new DiscountToken(str25));
            }
            LocalMenuItem.PreorderingItemSummary preorderingItemSummary = localMenuItem.preordering_summary;
            if (preorderingItemSummary != null) {
                String str26 = preorderingItemSummary.title;
                if (str26 == null) {
                    str26 = "";
                }
                String str27 = preorderingItemSummary.description;
                menuItemPreorderingSummary = new MenuItemPreorderingSummary(str26, str27 != null ? str27 : "");
            } else {
                menuItemPreorderingSummary = null;
            }
            arrayList6.add(new MenuItem(str9, str10, num, str11, list10, list9, localImage3, localMenuItemDeal, intValue, arrayList8, arrayList15, localMenuAvailability3, menuHours, z, arrayList10, arrayList16, menuItemPreorderingSummary));
            str = str12;
            arrayList2 = arrayList7;
            map2 = map3;
            it2 = it7;
        }
        String str28 = str;
        ArrayList arrayList17 = arrayList2;
        Map map4 = map2;
        Collection<LocalMenuItemModifierList> values2 = localMenu.modifier_lists.values();
        ArrayList arrayList18 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(values2, 10));
        for (LocalMenuItemModifierList localMenuItemModifierList : values2) {
            localMenuItemModifierList.getClass();
            String str29 = localMenuItemModifierList.token;
            str29.getClass();
            ScopedModifierTokensKt.requireNoModifierScopeSeparator(str29);
            String str30 = localMenuItemModifierList.name;
            str30.getClass();
            zzit zzitVar = localMenuItemModifierList.input_type;
            if (zzitVar == null) {
                Path$$ExternalSyntheticBUOutline0.m$1(localMenuItemModifierList, "Unsupported input type for ");
                return null;
            }
            if (zzitVar instanceof LocalMenuItemModifierList$InputType$FreeTextEntry) {
                LocalMenuItemModifierList.FreeTextEntry freeTextEntry = ((LocalMenuItemModifierList$InputType$FreeTextEntry) zzitVar).value;
                Integer num4 = freeTextEntry.max_length;
                selectFromList = new MenuItemModifierList.InputType.FreeTextEntry(num4 != null ? num4.intValue() : Integer.MAX_VALUE, Intrinsics.areEqual(freeTextEntry.require_non_empty_string, Boolean.TRUE));
            } else {
                if (!(zzitVar instanceof LocalMenuItemModifierList$InputType$SelectFromList)) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    return null;
                }
                List list16 = ((LocalMenuItemModifierList$InputType$SelectFromList) zzitVar).value.modifiers;
                ArrayList arrayList19 = new ArrayList();
                Iterator it12 = list16.iterator();
                while (it12.hasNext()) {
                    Modifier m1276toModifierOrNulloZYGaNE = ModifierKt.m1276toModifierOrNulloZYGaNE((LocalMenuItemModifierList.Modifier) it12.next(), null);
                    if (m1276toModifierOrNulloZYGaNE != null) {
                        arrayList19.add(m1276toModifierOrNulloZYGaNE);
                    }
                }
                selectFromList = new MenuItemModifierList.InputType.SelectFromList(arrayList19);
            }
            arrayList18.add(new MenuItemModifierList(str29, str30, selectFromList));
        }
        List<String> list17 = localMenu.recommended_item_tokens;
        ArrayList arrayList20 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list17, 10));
        for (String str31 : list17) {
            str31.getClass();
            arrayList20.add(new MenuItemToken(str31));
        }
        Long l = localMenu.changes_at;
        Instant ofEpochMilli = l != null ? Instant.ofEpochMilli(l.longValue()) : null;
        List<LocalMenuCategoryCollection> list18 = localMenu.menus;
        ArrayList arrayList21 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list18, 10));
        for (LocalMenuCategoryCollection localMenuCategoryCollection : list18) {
            String str32 = localMenuCategoryCollection.token;
            str32.getClass();
            String str33 = localMenuCategoryCollection.name;
            if (str33 == null) {
                str33 = "";
            }
            List<String> list19 = localMenuCategoryCollection.category_tokens;
            ArrayList arrayList22 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list19, 10));
            for (String str34 : list19) {
                str34.getClass();
                arrayList22.add(new MenuCategoryToken(str34));
            }
            LocalMenuHours localMenuHours3 = localMenuCategoryCollection.menu_hours;
            arrayList21.add(new LocationMenu.Menu(localMenuHours3 != null ? MenuHoursKt.toMenuHours(localMenuHours3) : null, str32, str33, arrayList22));
        }
        Map map5 = localMenu.discount_summaries;
        ArrayList arrayList23 = new ArrayList(map5.size());
        for (Map.Entry entry3 : map5.entrySet()) {
            String str35 = (String) entry3.getKey();
            LocalMenuDiscountSummary localMenuDiscountSummary = (LocalMenuDiscountSummary) entry3.getValue();
            str35.getClass();
            DiscountToken discountToken = new DiscountToken(str35);
            localMenuDiscountSummary.getClass();
            String str36 = localMenuDiscountSummary.token;
            str36.getClass();
            String str37 = localMenuDiscountSummary.name;
            if (str37 == null) {
                str37 = "";
            }
            arrayList23.add(new Pair(discountToken, new MenuDiscountSummary(str36, str37, CollectionsKt.joinToString$default(localMenuDiscountSummary.details, "\n\n", null, null, 0, null, null, 62))));
        }
        return new LocationMenu(str28, arrayList17, map4, ofEpochMilli, arrayList21, arrayList6, arrayList18, arrayList20, MapsKt__MapsKt.toMap(arrayList23));
    }
}
