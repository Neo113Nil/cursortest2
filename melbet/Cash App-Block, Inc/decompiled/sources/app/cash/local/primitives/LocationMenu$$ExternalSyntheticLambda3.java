package app.cash.local.primitives;

import androidx.compose.runtime.Updater;
import app.cash.local.primitives.LocationMenu;
import app.cash.local.primitives.MenuItemModifierList;
import com.squareup.cash.work.views.menu.ExpandableContentKt;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.collections.builders.MapBuilder;
import kotlin.jvm.functions.Function0;

/* loaded from: classes3.dex */
public final /* synthetic */ class LocationMenu$$ExternalSyntheticLambda3 implements Function0 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ LocationMenu f$0;

    public /* synthetic */ LocationMenu$$ExternalSyntheticLambda3(LocationMenu locationMenu, int i) {
        this.$r8$classId = i;
        this.f$0 = locationMenu;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        List list;
        int i = this.$r8$classId;
        LocationMenu.Menu menu = null;
        LocationMenu locationMenu = this.f$0;
        switch (i) {
            case 0:
                MapBuilder mapBuilder = new MapBuilder();
                Iterator it = LocationMenuKt.access$withNestedModifierLists(locationMenu.modifierLists).iterator();
                while (it.hasNext()) {
                    MenuItemModifierList menuItemModifierList = (MenuItemModifierList) it.next();
                    MenuItemModifierList.InputType inputType = menuItemModifierList.inputType;
                    MenuItemModifierList.InputType.SelectFromList selectFromList = inputType instanceof MenuItemModifierList.InputType.SelectFromList ? (MenuItemModifierList.InputType.SelectFromList) inputType : null;
                    if (selectFromList != null) {
                        Iterator it2 = selectFromList.modifiers.iterator();
                        while (it2.hasNext()) {
                            mapBuilder.put(new ModifierToken(((Modifier) it2.next()).token), new MenuItemModifierListToken(menuItemModifierList.token));
                        }
                    }
                }
                return mapBuilder.build();
            case 1:
                if (locationMenu != null && (list = locationMenu.menus) != null) {
                    menu = ExpandableContentKt.firstAvailableOrDefault(list);
                }
                return Updater.mutableStateOf$default(menu);
            case 2:
                ArrayList access$withNestedModifierLists = LocationMenuKt.access$withNestedModifierLists(locationMenu.modifierLists);
                int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(access$withNestedModifierLists, 10));
                LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity >= 16 ? mapCapacity : 16);
                Iterator it3 = access$withNestedModifierLists.iterator();
                while (it3.hasNext()) {
                    Object next = it3.next();
                    linkedHashMap.put(new MenuItemModifierListToken(((MenuItemModifierList) next).token), next);
                }
                return linkedHashMap;
            default:
                List list2 = locationMenu.menuItems;
                int mapCapacity2 = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(mapCapacity2 >= 16 ? mapCapacity2 : 16);
                for (Object obj : list2) {
                    linkedHashMap2.put(new MenuItemToken(((MenuItem) obj).token), obj);
                }
                return linkedHashMap2;
        }
    }
}
