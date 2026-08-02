package app.cash.local.viewmodels;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline1;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import app.cash.local.primitives.MenuCategoryToken;
import app.cash.local.primitives.MenuItemToken;
import app.cash.local.primitives.analytics.LocalClientCartMenuItemAddedContext;
import com.squareup.cash.clientroutes.ClientRoute;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class CartItemCounterViewModel {
    public final LocalClientCartMenuItemAddedContext analyticsContext;
    public final Integer maxQuantity;
    public final String menuCategoryToken;
    public final String menuItemToken;
    public final int minQuantity;
    public final Mode mode;
    public final int quantity;

    public abstract class Mode {

        public final class Compact extends Mode {
            public final boolean expandable;

            public Compact(boolean z) {
                this.expandable = z;
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Compact) && this.expandable == ((Compact) obj).expandable;
            }

            public final int hashCode() {
                return Boolean.hashCode(this.expandable);
            }

            public final String toString() {
                return Fragment$5$$ExternalSyntheticOutline0.m("Compact(expandable=", ")", this.expandable);
            }
        }

        public final class Dynamic extends Mode {
            public static final Dynamic INSTANCE = new Dynamic();

            public final boolean equals(Object obj) {
                return this == obj || (obj instanceof Dynamic);
            }

            public final int hashCode() {
                return -114225639;
            }

            public final String toString() {
                return "Dynamic";
            }
        }

        public static List getDeepLinkSpecs() {
            return ClientRoute.ViewDirectDepositForm.deepLinkSpecs;
        }
    }

    public /* synthetic */ CartItemCounterViewModel(String str, String str2, int i, int i2, Integer num, Mode mode, LocalClientCartMenuItemAddedContext localClientCartMenuItemAddedContext, int i3) {
        this(str, (i3 & 2) != 0 ? null : str2, i, (i3 & 8) != 0 ? 0 : i2, num, mode, (i3 & 64) != 0 ? null : localClientCartMenuItemAddedContext);
    }

    /* renamed from: copy-s0nK_MQ$default, reason: not valid java name */
    public static CartItemCounterViewModel m1292copys0nK_MQ$default(CartItemCounterViewModel cartItemCounterViewModel, String str, LocalClientCartMenuItemAddedContext localClientCartMenuItemAddedContext, int i) {
        String str2 = cartItemCounterViewModel.menuItemToken;
        if ((i & 2) != 0) {
            str = cartItemCounterViewModel.menuCategoryToken;
        }
        String str3 = str;
        int i2 = (i & 4) != 0 ? cartItemCounterViewModel.quantity : 0;
        int i3 = cartItemCounterViewModel.minQuantity;
        Integer num = (i & 16) != 0 ? cartItemCounterViewModel.maxQuantity : 0;
        Mode mode = cartItemCounterViewModel.mode;
        if ((i & 64) != 0) {
            localClientCartMenuItemAddedContext = cartItemCounterViewModel.analyticsContext;
        }
        mode.getClass();
        return new CartItemCounterViewModel(str2, str3, i2, i3, num, mode, localClientCartMenuItemAddedContext);
    }

    public final boolean equals(Object obj) {
        boolean areEqual;
        boolean areEqual2;
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CartItemCounterViewModel)) {
            return false;
        }
        CartItemCounterViewModel cartItemCounterViewModel = (CartItemCounterViewModel) obj;
        String str = cartItemCounterViewModel.menuItemToken;
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
        String str3 = cartItemCounterViewModel.menuCategoryToken;
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
        return areEqual2 && this.quantity == cartItemCounterViewModel.quantity && this.minQuantity == cartItemCounterViewModel.minQuantity && Intrinsics.areEqual(this.maxQuantity, cartItemCounterViewModel.maxQuantity) && Intrinsics.areEqual(this.mode, cartItemCounterViewModel.mode) && Intrinsics.areEqual(this.analyticsContext, cartItemCounterViewModel.analyticsContext);
    }

    public final int hashCode() {
        String str = this.menuItemToken;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.menuCategoryToken;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.minQuantity, JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.quantity, (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31);
        Integer num = this.maxQuantity;
        int hashCode2 = (this.mode.hashCode() + ((m + (num == null ? 0 : num.hashCode())) * 31)) * 31;
        LocalClientCartMenuItemAddedContext localClientCartMenuItemAddedContext = this.analyticsContext;
        return hashCode2 + (localClientCartMenuItemAddedContext != null ? localClientCartMenuItemAddedContext.hashCode() : 0);
    }

    public final String toString() {
        String str = this.menuItemToken;
        String m1264toStringimpl = str == null ? "null" : MenuItemToken.m1264toStringimpl(str);
        String str2 = this.menuCategoryToken;
        StringBuilder m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m("CartItemCounterViewModel(menuItemToken=", m1264toStringimpl, ", menuCategoryToken=", str2 != null ? MenuCategoryToken.m1259toStringimpl(str2) : "null", ", quantity=");
        Recorder$$ExternalSyntheticOutline1.m105m(this.quantity, this.minQuantity, ", minQuantity=", ", maxQuantity=", m);
        m.append(this.maxQuantity);
        m.append(", mode=");
        m.append(this.mode);
        m.append(", analyticsContext=");
        m.append(this.analyticsContext);
        m.append(")");
        return m.toString();
    }

    public CartItemCounterViewModel(String str, String str2, int i, int i2, Integer num, Mode mode, LocalClientCartMenuItemAddedContext localClientCartMenuItemAddedContext) {
        this.menuItemToken = str;
        this.menuCategoryToken = str2;
        this.quantity = i;
        this.minQuantity = i2;
        this.maxQuantity = num;
        this.mode = mode;
        this.analyticsContext = localClientCartMenuItemAddedContext;
    }
}
