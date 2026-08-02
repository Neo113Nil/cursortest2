package androidx.core.view;

import android.os.Build;
import android.view.DisplayCutout;
import androidx.core.graphics.Insets;
import androidx.lifecycle.LifecycleOwner;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.money.applets.viewmodels.Applet;
import com.squareup.cash.money.core.ids.AppletId;
import com.squareup.cash.retro.views.RetroUiFactory$$ExternalSyntheticLambda3;
import com.squareup.cash.savings.applets.presenters.RealSavingsAppletTileRepository;
import com.squareup.cash.savings.applets.presenters.SavingsAppletTilePresenter$Factory$Impl;
import java.util.List;

/* loaded from: classes.dex */
public final class DisplayCutoutCompat {
    public final DisplayCutout mDisplayCutout;

    /* loaded from: classes3.dex */
    public abstract class Api28Impl {
        public static List getBoundingRects(DisplayCutout displayCutout) {
            return displayCutout.getBoundingRects();
        }

        public static List getDeepLinkSpecs() {
            return ClientRoute.DeprecatedViewShopHub.deepLinkSpecs;
        }

        public static int getSafeInsetBottom(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetBottom();
        }

        public static int getSafeInsetLeft(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetLeft();
        }

        public static int getSafeInsetRight(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetRight();
        }

        public static int getSafeInsetTop(DisplayCutout displayCutout) {
            return displayCutout.getSafeInsetTop();
        }

        public static Applet savingsApplet(RealSavingsAppletTileRepository realSavingsAppletTileRepository, SavingsAppletTilePresenter$Factory$Impl savingsAppletTilePresenter$Factory$Impl, LifecycleOwner lifecycleOwner) {
            return new Applet(AppletId.SAVINGS, realSavingsAppletTileRepository.availabilityState, new RetroUiFactory$$ExternalSyntheticLambda3(22, savingsAppletTilePresenter$Factory$Impl, lifecycleOwner, realSavingsAppletTileRepository));
        }
    }

    public DisplayCutoutCompat(DisplayCutout displayCutout) {
        this.mDisplayCutout = displayCutout;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DisplayCutoutCompat.class != obj.getClass()) {
            return false;
        }
        return this.mDisplayCutout.equals(((DisplayCutoutCompat) obj).mDisplayCutout);
    }

    public final Insets getWaterfallInsets() {
        return Build.VERSION.SDK_INT >= 30 ? Insets.toCompatInsets(WindowCompat$Api35Impl.getWaterfallInsets(this.mDisplayCutout)) : Insets.NONE;
    }

    public final int hashCode() {
        return this.mDisplayCutout.hashCode();
    }

    public final String toString() {
        return "DisplayCutoutCompat{" + this.mDisplayCutout + "}";
    }
}
