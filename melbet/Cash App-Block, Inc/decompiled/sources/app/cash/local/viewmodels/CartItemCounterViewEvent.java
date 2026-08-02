package app.cash.local.viewmodels;

import app.cash.local.primitives.MenuCategoryToken;
import app.cash.local.primitives.MenuItemToken;
import app.cash.local.primitives.analytics.LocalClientCartMenuItemAddedContext;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public interface CartItemCounterViewEvent extends LocalMenuItemDetailsViewEvent, LocalMenuComboDetailsViewEvent, LocalBrandLocationMenuViewEvent, LocalBottomModalViewEvent {

    public final class Decrement implements CartItemCounterViewEvent {
        public final String menuItemToken;

        public Decrement(String str) {
            this.menuItemToken = str;
        }

        public final boolean equals(Object obj) {
            boolean areEqual;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Decrement)) {
                return false;
            }
            String str = ((Decrement) obj).menuItemToken;
            String str2 = this.menuItemToken;
            if (str2 == null) {
                if (str == null) {
                    areEqual = true;
                }
                areEqual = false;
            } else {
                if (str != null) {
                    areEqual = Intrinsics.areEqual(str2, str);
                }
                areEqual = false;
            }
            return areEqual;
        }

        @Override // app.cash.local.viewmodels.CartItemCounterViewEvent
        /* renamed from: getMenuItemToken-9MT7T1s */
        public final String mo1291getMenuItemToken9MT7T1s() {
            return this.menuItemToken;
        }

        public final int hashCode() {
            String str = this.menuItemToken;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            String str = this.menuItemToken;
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Decrement(menuItemToken=", str == null ? "null" : MenuItemToken.m1264toStringimpl(str), ")");
        }
    }

    public final class Increment implements CartItemCounterViewEvent {
        public final LocalClientCartMenuItemAddedContext analyticsContext;
        public final String menuCategoryToken;
        public final String menuItemToken;

        public Increment(String str, String str2, LocalClientCartMenuItemAddedContext localClientCartMenuItemAddedContext) {
            this.menuItemToken = str;
            this.menuCategoryToken = str2;
            this.analyticsContext = localClientCartMenuItemAddedContext;
        }

        public final boolean equals(Object obj) {
            boolean areEqual;
            boolean areEqual2;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Increment)) {
                return false;
            }
            Increment increment = (Increment) obj;
            String str = increment.menuItemToken;
            String str2 = this.menuItemToken;
            if (str2 == null) {
                if (str == null) {
                    areEqual = true;
                }
                areEqual = false;
            } else {
                if (str != null) {
                    areEqual = Intrinsics.areEqual(str2, str);
                }
                areEqual = false;
            }
            if (!areEqual) {
                return false;
            }
            String str3 = increment.menuCategoryToken;
            String str4 = this.menuCategoryToken;
            if (str4 == null) {
                if (str3 == null) {
                    areEqual2 = true;
                }
                areEqual2 = false;
            } else {
                if (str3 != null) {
                    areEqual2 = Intrinsics.areEqual(str4, str3);
                }
                areEqual2 = false;
            }
            return areEqual2 && Intrinsics.areEqual(this.analyticsContext, increment.analyticsContext);
        }

        @Override // app.cash.local.viewmodels.CartItemCounterViewEvent
        /* renamed from: getMenuItemToken-9MT7T1s */
        public final String mo1291getMenuItemToken9MT7T1s() {
            return this.menuItemToken;
        }

        public final int hashCode() {
            String str = this.menuItemToken;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.menuCategoryToken;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            LocalClientCartMenuItemAddedContext localClientCartMenuItemAddedContext = this.analyticsContext;
            return hashCode2 + (localClientCartMenuItemAddedContext != null ? localClientCartMenuItemAddedContext.hashCode() : 0);
        }

        public final String toString() {
            String str = this.menuItemToken;
            String m1264toStringimpl = str == null ? "null" : MenuItemToken.m1264toStringimpl(str);
            String str2 = this.menuCategoryToken;
            StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Increment(menuItemToken=", m1264toStringimpl, ", menuCategoryToken=", str2 != null ? MenuCategoryToken.m1259toStringimpl(str2) : "null", ", analyticsContext=");
            m.append(this.analyticsContext);
            m.append(")");
            return m.toString();
        }
    }

    public final class Trash implements CartItemCounterViewEvent {
        public final String menuItemToken;

        public Trash(String str) {
            this.menuItemToken = str;
        }

        public final boolean equals(Object obj) {
            boolean areEqual;
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Trash)) {
                return false;
            }
            String str = ((Trash) obj).menuItemToken;
            String str2 = this.menuItemToken;
            if (str2 == null) {
                if (str == null) {
                    areEqual = true;
                }
                areEqual = false;
            } else {
                if (str != null) {
                    areEqual = Intrinsics.areEqual(str2, str);
                }
                areEqual = false;
            }
            return areEqual;
        }

        @Override // app.cash.local.viewmodels.CartItemCounterViewEvent
        /* renamed from: getMenuItemToken-9MT7T1s */
        public final String mo1291getMenuItemToken9MT7T1s() {
            return this.menuItemToken;
        }

        public final int hashCode() {
            String str = this.menuItemToken;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        public final String toString() {
            String str = this.menuItemToken;
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m("Trash(menuItemToken=", str == null ? "null" : MenuItemToken.m1264toStringimpl(str), ")");
        }
    }

    /* renamed from: getMenuItemToken-9MT7T1s, reason: not valid java name */
    String mo1291getMenuItemToken9MT7T1s();
}
