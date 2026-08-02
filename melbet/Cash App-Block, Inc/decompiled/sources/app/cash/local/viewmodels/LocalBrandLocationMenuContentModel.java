package app.cash.local.viewmodels;

import app.cash.local.primitives.MenuCategoryToken;
import app.cash.local.primitives.MenuHours;
import app.cash.local.primitives.MenuToken;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class LocalBrandLocationMenuContentModel implements LocalBrandProfileSectionContent {
    public final List menus;
    public final Menu selectedMenu;
    public final boolean showMenuSelector;

    public final class Entry {
        public final MenuHours hours;
        public final LocalImage image;
        public final String label;
        public final String token;

        public Entry(String str, LocalImage localImage, String str2, MenuHours menuHours) {
            str.getClass();
            str2.getClass();
            this.token = str;
            this.image = localImage;
            this.label = str2;
            this.hours = menuHours;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Entry)) {
                return false;
            }
            Entry entry = (Entry) obj;
            return Intrinsics.areEqual(this.token, entry.token) && Intrinsics.areEqual(this.image, entry.image) && Intrinsics.areEqual(this.label, entry.label) && Intrinsics.areEqual(this.hours, entry.hours);
        }

        public final int hashCode() {
            int hashCode = this.token.hashCode() * 31;
            LocalImage localImage = this.image;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((hashCode + (localImage == null ? 0 : localImage.hashCode())) * 31, 31, this.label);
            MenuHours menuHours = this.hours;
            return m + (menuHours != null ? menuHours.hashCode() : 0);
        }

        public final String toString() {
            return "Entry(token=" + MenuCategoryToken.m1259toStringimpl(this.token) + ", image=" + this.image + ", label=" + this.label + ", hours=" + this.hours + ")";
        }
    }

    public final class Menu {
        public final ArrayList entries;
        public final MenuHours hours;
        public final String name;
        public final String token;

        public Menu(MenuHours menuHours, String str, String str2, ArrayList arrayList) {
            str2.getClass();
            this.token = str;
            this.name = str2;
            this.hours = menuHours;
            this.entries = arrayList;
        }

        /* JADX WARN: Removed duplicated region for block: B:10:0x0022  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final boolean equals(Object obj) {
            boolean equals;
            if (this != obj) {
                if (obj instanceof Menu) {
                    Menu menu = (Menu) obj;
                    String str = menu.token;
                    String str2 = this.token;
                    if (str2 == null) {
                        if (str == null) {
                            equals = true;
                            if (equals && Intrinsics.areEqual(this.name, menu.name) && Intrinsics.areEqual(this.hours, menu.hours) && this.entries.equals(menu.entries)) {
                            }
                        }
                        equals = false;
                        if (equals) {
                        }
                    } else {
                        if (str != null) {
                            equals = str2.equals(str);
                            if (equals) {
                            }
                        }
                        equals = false;
                        if (equals) {
                        }
                    }
                }
                return false;
            }
            return true;
        }

        public final int hashCode() {
            String str = this.token;
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.name);
            MenuHours menuHours = this.hours;
            return this.entries.hashCode() + ((m + (menuHours != null ? menuHours.hashCode() : 0)) * 31);
        }

        public final String toString() {
            String str = this.token;
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Menu(token=", str == null ? "null" : MenuToken.m1269toStringimpl(str), ", name=", this.name, ", hours=");
            m.append(this.hours);
            m.append(", entries=");
            m.append(this.entries);
            m.append(")");
            return m.toString();
        }
    }

    public LocalBrandLocationMenuContentModel(List list, boolean z, Menu menu) {
        list.getClass();
        this.menus = list;
        this.showMenuSelector = z;
        this.selectedMenu = menu;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LocalBrandLocationMenuContentModel)) {
            return false;
        }
        LocalBrandLocationMenuContentModel localBrandLocationMenuContentModel = (LocalBrandLocationMenuContentModel) obj;
        return Intrinsics.areEqual(this.menus, localBrandLocationMenuContentModel.menus) && this.showMenuSelector == localBrandLocationMenuContentModel.showMenuSelector && Intrinsics.areEqual(this.selectedMenu, localBrandLocationMenuContentModel.selectedMenu);
    }

    public final int hashCode() {
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.menus.hashCode() * 31, 31, this.showMenuSelector);
        Menu menu = this.selectedMenu;
        return m + (menu == null ? 0 : menu.hashCode());
    }

    public final String toString() {
        return "LocalBrandLocationMenuContentModel(menus=" + this.menus + ", showMenuSelector=" + this.showMenuSelector + ", selectedMenu=" + this.selectedMenu + ")";
    }

    public /* synthetic */ LocalBrandLocationMenuContentModel(List list) {
        this(list, false, (Menu) CollectionsKt.firstOrNull(list));
    }
}
