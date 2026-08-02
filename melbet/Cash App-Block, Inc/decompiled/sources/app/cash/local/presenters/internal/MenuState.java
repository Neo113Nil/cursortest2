package app.cash.local.presenters.internal;

import app.cash.local.primitives.LocationMenu;

/* loaded from: classes3.dex */
public interface MenuState {

    public final class Loaded implements MenuState {
        public final LocationMenu menu;

        public Loaded(LocationMenu locationMenu) {
            this.menu = locationMenu;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Loaded) && this.menu.equals(((Loaded) obj).menu);
        }

        public final int hashCode() {
            return this.menu.hashCode();
        }

        public final String toString() {
            return "Loaded(menu=" + this.menu + ")";
        }
    }

    public final class Loading implements MenuState {
        public static final Loading INSTANCE = new Loading();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof Loading);
        }

        public final int hashCode() {
            return 900904769;
        }

        public final String toString() {
            return "Loading";
        }
    }
}
