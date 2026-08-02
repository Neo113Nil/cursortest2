package app.cash.local.viewmodels;

import app.cash.local.primitives.MenuCategoryToken;
import app.cash.local.primitives.MenuItemToken;
import app.cash.local.primitives.analytics.LocalClientCartMenuItemAddedContext;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public interface LocalBrandLocationMenuViewEvent {

    public final class BackClicked implements LocalBrandLocationMenuViewEvent {
        public static final BackClicked INSTANCE = new BackClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof BackClicked);
        }

        public final int hashCode() {
            return 73025993;
        }

        public final String toString() {
            return "BackClicked";
        }
    }

    public final class MenuItemClicked implements LocalBrandLocationMenuViewEvent {
        public final LocalClientCartMenuItemAddedContext analyticsContext;
        public final String menuCategoryToken;
        public final String menuItemToken;

        public MenuItemClicked(String str, String str2, LocalClientCartMenuItemAddedContext localClientCartMenuItemAddedContext) {
            str.getClass();
            str2.getClass();
            this.menuItemToken = str;
            this.menuCategoryToken = str2;
            this.analyticsContext = localClientCartMenuItemAddedContext;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MenuItemClicked)) {
                return false;
            }
            MenuItemClicked menuItemClicked = (MenuItemClicked) obj;
            return Intrinsics.areEqual(this.menuItemToken, menuItemClicked.menuItemToken) && Intrinsics.areEqual(this.menuCategoryToken, menuItemClicked.menuCategoryToken) && Intrinsics.areEqual(this.analyticsContext, menuItemClicked.analyticsContext);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.menuItemToken.hashCode() * 31, 31, this.menuCategoryToken);
            LocalClientCartMenuItemAddedContext localClientCartMenuItemAddedContext = this.analyticsContext;
            return m + (localClientCartMenuItemAddedContext == null ? 0 : localClientCartMenuItemAddedContext.hashCode());
        }

        public final String toString() {
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("MenuItemClicked(menuItemToken=", MenuItemToken.m1264toStringimpl(this.menuItemToken), ", menuCategoryToken=", MenuCategoryToken.m1259toStringimpl(this.menuCategoryToken), ", analyticsContext=");
            m.append(this.analyticsContext);
            m.append(")");
            return m.toString();
        }
    }

    public final class MenuSelectorClicked implements LocalBrandLocationMenuViewEvent {
        public static final MenuSelectorClicked INSTANCE = new MenuSelectorClicked();

        public final boolean equals(Object obj) {
            return this == obj || (obj instanceof MenuSelectorClicked);
        }

        public final int hashCode() {
            return 1405735794;
        }

        public final String toString() {
            return "MenuSelectorClicked";
        }
    }
}
