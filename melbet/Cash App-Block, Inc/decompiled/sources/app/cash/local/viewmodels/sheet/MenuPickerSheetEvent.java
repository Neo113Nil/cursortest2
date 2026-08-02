package app.cash.local.viewmodels.sheet;

import app.cash.local.primitives.LocationMenu;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public interface MenuPickerSheetEvent {

    public final class MenuSelected implements MenuPickerSheetEvent {
        public final LocationMenu.Menu menu;

        public MenuSelected(LocationMenu.Menu menu) {
            menu.getClass();
            this.menu = menu;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MenuSelected) && Intrinsics.areEqual(this.menu, ((MenuSelected) obj).menu);
        }

        public final int hashCode() {
            return this.menu.hashCode();
        }

        public final String toString() {
            return "MenuSelected(menu=" + this.menu + ")";
        }
    }

    public final class SheetDismissed implements MenuPickerSheetEvent {
        public static final SheetDismissed INSTANCE = new SheetDismissed();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof SheetDismissed);
        }

        public final int hashCode() {
            return 1202986259;
        }

        public final String toString() {
            return "SheetDismissed";
        }
    }
}
