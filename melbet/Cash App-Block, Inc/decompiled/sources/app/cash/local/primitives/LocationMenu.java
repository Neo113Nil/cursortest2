package app.cash.local.primitives;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.navigation.NavAction$$ExternalSyntheticOutline0;
import app.cash.local.primitives.Line;
import bo.app.a$$ExternalSyntheticBUOutline0;
import bo.app.re$$ExternalSyntheticOutline0;
import com.android.volley.Request$Priority$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.time.Instant;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class LocationMenu implements Parcelable {
    public static final Parcelable.Creator<LocationMenu> CREATOR = new Line.Creator(22);
    public final List categories;
    public final Instant changesAt;
    public final Map comboCategories;
    public final Map discountSummaries;
    public final List menuItems;
    public final Lazy menuItemsByToken$delegate;
    public final List menus;
    public final List modifierLists;
    public final Lazy modifierListsByToken$delegate;
    public final Lazy modifierTokenToListToken$delegate;
    public final List recommendedItems;
    public final String title;

    public final class Menu implements Parcelable {
        public static final Parcelable.Creator<Menu> CREATOR = new Line.Creator(23);
        public final ArrayList categoryTokens;
        public final MenuHours hours;
        public final String name;
        public final String token;

        public Menu(MenuHours menuHours, String str, String str2, ArrayList arrayList) {
            str.getClass();
            str2.getClass();
            this.token = str;
            this.name = str2;
            this.categoryTokens = arrayList;
            this.hours = menuHours;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Menu)) {
                return false;
            }
            Menu menu = (Menu) obj;
            return Intrinsics.areEqual(this.token, menu.token) && Intrinsics.areEqual(this.name, menu.name) && this.categoryTokens.equals(menu.categoryTokens) && Intrinsics.areEqual(this.hours, menu.hours);
        }

        public final int hashCode() {
            int m = CameraState$Type$EnumUnboxingLocalUtility.m(this.categoryTokens, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.token.hashCode() * 31, 31, this.name), 31);
            MenuHours menuHours = this.hours;
            return m + (menuHours == null ? 0 : menuHours.hashCode());
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Menu(token=", MenuToken.m1269toStringimpl(this.token), ", name=", this.name, ", categoryTokens=");
            m.append(this.categoryTokens);
            m.append(", hours=");
            m.append(this.hours);
            m.append(")");
            return m.toString();
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.getClass();
            parcel.writeString(this.token);
            parcel.writeString(this.name);
            Iterator m = NavAction$$ExternalSyntheticOutline0.m(this.categoryTokens, parcel);
            while (m.hasNext()) {
                parcel.writeString(((MenuCategoryToken) m.next()).value);
            }
            MenuHours menuHours = this.hours;
            if (menuHours == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                menuHours.writeToParcel(parcel, i);
            }
        }
    }

    public LocationMenu(String str, List list, Map map, Instant instant, List list2, List list3, List list4, List list5, Map map2) {
        list.getClass();
        map.getClass();
        list2.getClass();
        list3.getClass();
        list4.getClass();
        list5.getClass();
        map2.getClass();
        this.title = str;
        this.categories = list;
        this.comboCategories = map;
        this.changesAt = instant;
        this.menus = list2;
        this.menuItems = list3;
        this.modifierLists = list4;
        this.recommendedItems = list5;
        this.discountSummaries = map2;
        this.modifierTokenToListToken$delegate = LazyKt.lazy(new LocationMenu$$ExternalSyntheticLambda3(this, 0));
        this.modifierListsByToken$delegate = LazyKt.lazy(new LocationMenu$$ExternalSyntheticLambda3(this, 2));
        this.menuItemsByToken$delegate = LazyKt.lazy(new LocationMenu$$ExternalSyntheticLambda3(this, 3));
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocationMenu)) {
            return false;
        }
        LocationMenu locationMenu = (LocationMenu) obj;
        return Intrinsics.areEqual(this.title, locationMenu.title) && Intrinsics.areEqual(this.categories, locationMenu.categories) && Intrinsics.areEqual(this.comboCategories, locationMenu.comboCategories) && Intrinsics.areEqual(this.changesAt, locationMenu.changesAt) && Intrinsics.areEqual(this.menus, locationMenu.menus) && Intrinsics.areEqual(this.menuItems, locationMenu.menuItems) && Intrinsics.areEqual(this.modifierLists, locationMenu.modifierLists) && Intrinsics.areEqual(this.recommendedItems, locationMenu.recommendedItems) && Intrinsics.areEqual(this.discountSummaries, locationMenu.discountSummaries);
    }

    /* renamed from: findMenuHours-7xgaAFE, reason: not valid java name */
    public final MenuHours m1242findMenuHours7xgaAFE(String str) {
        Object obj;
        Object obj2;
        MenuHours menuHours;
        if (str != null) {
            Iterator it = this.categories.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.areEqual(((Category) obj).token, str)) {
                    break;
                }
            }
            Category category = (Category) obj;
            if (category != null && (menuHours = category.menuHours) != null) {
                if (!menuHours.isAvailableNow() && menuHours.nextAvailableFormatted == null) {
                    menuHours = null;
                }
                if (menuHours != null) {
                    return menuHours;
                }
            }
            Iterator it2 = this.menus.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                if (((Menu) obj2).categoryTokens.contains(new MenuCategoryToken(str))) {
                    break;
                }
            }
            Menu menu = (Menu) obj2;
            if (menu != null) {
                return menu.hours;
            }
        }
        return null;
    }

    public final List getMenus() {
        return this.menus;
    }

    public final int hashCode() {
        String str = this.title;
        int m = CameraState$Type$EnumUnboxingLocalUtility.m(Recorder$$ExternalSyntheticOutline2.m((str == null ? 0 : str.hashCode()) * 31, 31, this.categories), this.comboCategories, 31);
        Instant instant = this.changesAt;
        return this.discountSummaries.hashCode() + Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m(Recorder$$ExternalSyntheticOutline2.m((m + (instant != null ? instant.hashCode() : 0)) * 31, 31, this.menus), 31, this.menuItems), 31, this.modifierLists), 31, this.recommendedItems);
    }

    /* renamed from: menuItem-GvMOdU0, reason: not valid java name */
    public final MenuItem m1243menuItemGvMOdU0(String str) {
        str.getClass();
        MenuItem m1244menuItemOrNullGvMOdU0 = m1244menuItemOrNullGvMOdU0(str);
        if (m1244menuItemOrNullGvMOdU0 != null) {
            return m1244menuItemOrNullGvMOdU0;
        }
        a$$ExternalSyntheticBUOutline0.m1430m((Object) "No menu item found for token: ".concat(MenuItemToken.m1264toStringimpl(str)));
        return null;
    }

    /* renamed from: menuItemOrNull-GvMOdU0, reason: not valid java name */
    public final MenuItem m1244menuItemOrNullGvMOdU0(String str) {
        str.getClass();
        return (MenuItem) ((Map) this.menuItemsByToken$delegate.getValue()).get(new MenuItemToken(str));
    }

    /* renamed from: modifierList-CUrkqkQ, reason: not valid java name */
    public final MenuItemModifierList m1245modifierListCUrkqkQ(String str) {
        str.getClass();
        MenuItemModifierList m1246modifierListOrNullCUrkqkQ = m1246modifierListOrNullCUrkqkQ(str);
        if (m1246modifierListOrNullCUrkqkQ != null) {
            return m1246modifierListOrNullCUrkqkQ;
        }
        a$$ExternalSyntheticBUOutline0.m1430m((Object) "No modifier list in menu for token: ".concat(MenuItemModifierListToken.m1260toStringimpl(str)));
        return null;
    }

    /* renamed from: modifierListOrNull-CUrkqkQ, reason: not valid java name */
    public final MenuItemModifierList m1246modifierListOrNullCUrkqkQ(String str) {
        str.getClass();
        return (MenuItemModifierList) ((Map) this.modifierListsByToken$delegate.getValue()).get(new MenuItemModifierListToken(str));
    }

    /* renamed from: modifierListWithModifier-QkZh8Tc, reason: not valid java name */
    public final MenuItemModifierList m1247modifierListWithModifierQkZh8Tc(String str) {
        str.getClass();
        MenuItemModifierListToken menuItemModifierListToken = (MenuItemModifierListToken) ((Map) this.modifierTokenToListToken$delegate.getValue()).get(new ModifierToken(str));
        String str2 = menuItemModifierListToken != null ? menuItemModifierListToken.value : null;
        if (str2 != null) {
            return m1245modifierListCUrkqkQ(str2);
        }
        a$$ExternalSyntheticBUOutline0.m1430m((Object) "No modifier list found for modifier token: ".concat(ModifierToken.m1277toStringimpl(str)));
        return null;
    }

    /* renamed from: modifierListsForMenuItem-GvMOdU0, reason: not valid java name */
    public final ArrayList m1248modifierListsForMenuItemGvMOdU0(String str) {
        str.getClass();
        ArrayList arrayList = m1243menuItemGvMOdU0(str).modifierListConfigs;
        ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            String str2 = ((ModifierListConfig) it.next()).token;
            arrayList2.add(str2 != null ? new MenuItemModifierListToken(str2) : null);
        }
        Set set = CollectionsKt.toSet(arrayList2);
        List list = this.modifierLists;
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : list) {
            if (set.contains(new MenuItemModifierListToken(((MenuItemModifierList) obj).token))) {
                arrayList3.add(obj);
            }
        }
        return arrayList3;
    }

    public final String toString() {
        StringBuilder m = NavAction$$ExternalSyntheticOutline0.m("LocationMenu(title=", this.title, ", categories=", ", comboCategories=", this.categories);
        m.append(this.comboCategories);
        m.append(", changesAt=");
        m.append(this.changesAt);
        m.append(", menus=");
        Request$Priority$EnumUnboxingLocalUtility.m(m, this.menus, ", menuItems=", this.menuItems, ", modifierLists=");
        Request$Priority$EnumUnboxingLocalUtility.m(m, this.modifierLists, ", recommendedItems=", this.recommendedItems, ", discountSummaries=");
        return re$$ExternalSyntheticOutline0.m(")", m, this.discountSummaries);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        parcel.getClass();
        parcel.writeString(this.title);
        Iterator m = CameraState$Type$EnumUnboxingLocalUtility.m(this.categories, parcel);
        while (m.hasNext()) {
            ((Category) m.next()).writeToParcel(parcel, i);
        }
        Iterator m2 = NavAction$$ExternalSyntheticOutline0.m(this.comboCategories, parcel);
        while (m2.hasNext()) {
            Map.Entry entry = (Map.Entry) m2.next();
            parcel.writeString(((ComboCategoryToken) entry.getKey()).value);
            ((ComboCategory) entry.getValue()).writeToParcel(parcel, i);
        }
        parcel.writeSerializable(this.changesAt);
        Iterator m3 = CameraState$Type$EnumUnboxingLocalUtility.m(this.menus, parcel);
        while (m3.hasNext()) {
            ((Menu) m3.next()).writeToParcel(parcel, i);
        }
        Iterator m4 = CameraState$Type$EnumUnboxingLocalUtility.m(this.menuItems, parcel);
        while (m4.hasNext()) {
            ((MenuItem) m4.next()).writeToParcel(parcel, i);
        }
        Iterator m5 = CameraState$Type$EnumUnboxingLocalUtility.m(this.modifierLists, parcel);
        while (m5.hasNext()) {
            ((MenuItemModifierList) m5.next()).writeToParcel(parcel, i);
        }
        Iterator m6 = CameraState$Type$EnumUnboxingLocalUtility.m(this.recommendedItems, parcel);
        while (m6.hasNext()) {
            parcel.writeString(((MenuItemToken) m6.next()).value);
        }
        Iterator m7 = NavAction$$ExternalSyntheticOutline0.m(this.discountSummaries, parcel);
        while (m7.hasNext()) {
            Map.Entry entry2 = (Map.Entry) m7.next();
            parcel.writeString(((DiscountToken) entry2.getKey()).value);
            ((MenuDiscountSummary) entry2.getValue()).writeToParcel(parcel, i);
        }
    }
}
