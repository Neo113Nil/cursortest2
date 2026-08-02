package com.braze.ui.support;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.core.view.DisplayCutoutCompat;
import androidx.core.view.WindowInsetsCompat;
import bo.app.q2$$ExternalSyntheticLambda8;
import bo.app.t7$$ExternalSyntheticLambda4;
import com.braze.enums.inappmessage.Orientation;
import com.braze.support.BrazeLogger;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0011\u0010\u0004\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0004\u0010\u0003\u001a\u001d\u0010\t\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n\u001a\u0011\u0010\r\u001a\u00020\f*\u00020\u000b¢\u0006\u0004\b\r\u0010\u000e\u001a\u0019\u0010\u0011\u001a\u00020\u0001*\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012\u001a\u001d\u0010\u0015\u001a\u00020\u00012\u0006\u0010\u0013\u001a\u00020\u00002\u0006\u0010\u0014\u001a\u00020\u000f¢\u0006\u0004\b\u0015\u0010\u0016\u001a\u0015\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0017\u0010\u0018\u001a\u001d\u0010\u001c\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001d\u001a\u0015\u0010 \u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!\u001a\u0015\u0010\"\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b\"\u0010!\u001a\u0015\u0010#\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b#\u0010!\u001a\u0015\u0010$\u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b$\u0010!\u001a\u0015\u0010%\u001a\u00020\f2\u0006\u0010\u0013\u001a\u00020\u0000¢\u0006\u0004\b%\u0010&\u001a\u0015\u0010'\u001a\u00020\u000f2\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b'\u0010(\"\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+¨\u0006,"}, d2 = {"Landroid/view/View;", "", "removeViewFromParent", "(Landroid/view/View;)V", "setFocusableInTouchModeAndRequestFocus", "Landroid/content/Context;", "context", "", "valueInDp", "convertDpToPixels", "(Landroid/content/Context;D)D", "Landroid/app/Activity;", "", "isRunningOnTablet", "(Landroid/app/Activity;)Z", "", "requestedOrientation", "setActivityRequestedOrientation", "(Landroid/app/Activity;I)V", "view", "height", "setHeightOnViewLayoutParams", "(Landroid/view/View;I)V", "isDeviceInNightMode", "(Landroid/content/Context;)Z", "currentScreenOrientation", "Lcom/braze/enums/inappmessage/Orientation;", "preferredOrientation", "isCurrentOrientationValid", "(ILcom/braze/enums/inappmessage/Orientation;)Z", "Landroidx/core/view/WindowInsetsCompat;", "windowInsets", "getMaxSafeLeftInset", "(Landroidx/core/view/WindowInsetsCompat;)I", "getMaxSafeRightInset", "getMaxSafeTopInset", "getMaxSafeBottomInset", "isDeviceNotInTouchMode", "(Landroid/view/View;)Z", "getStatusBarHeight", "(Landroid/content/Context;)I", "", "TAG", "Ljava/lang/String;", "android-sdk-ui_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class ViewUtils {
    private static final String TAG = BrazeLogger.INSTANCE.getBrazeLogTag("ViewUtils");

    public static final double convertDpToPixels(Context context, double d) {
        context.getClass();
        return d * context.getResources().getDisplayMetrics().density;
    }

    public static final int getMaxSafeBottomInset(WindowInsetsCompat windowInsetsCompat) {
        windowInsetsCompat.getClass();
        WindowInsetsCompat.Impl impl = windowInsetsCompat.mImpl;
        DisplayCutoutCompat displayCutout = impl.getDisplayCutout();
        return Math.max(displayCutout != null ? displayCutout.mDisplayCutout.getSafeInsetBottom() : 0, impl.getInsets(519).bottom);
    }

    public static final int getMaxSafeLeftInset(WindowInsetsCompat windowInsetsCompat) {
        windowInsetsCompat.getClass();
        WindowInsetsCompat.Impl impl = windowInsetsCompat.mImpl;
        DisplayCutoutCompat displayCutout = impl.getDisplayCutout();
        return Math.max(displayCutout != null ? displayCutout.mDisplayCutout.getSafeInsetLeft() : 0, impl.getInsets(519).left);
    }

    public static final int getMaxSafeRightInset(WindowInsetsCompat windowInsetsCompat) {
        windowInsetsCompat.getClass();
        WindowInsetsCompat.Impl impl = windowInsetsCompat.mImpl;
        DisplayCutoutCompat displayCutout = impl.getDisplayCutout();
        return Math.max(displayCutout != null ? displayCutout.mDisplayCutout.getSafeInsetRight() : 0, impl.getInsets(519).right);
    }

    public static final int getMaxSafeTopInset(WindowInsetsCompat windowInsetsCompat) {
        windowInsetsCompat.getClass();
        WindowInsetsCompat.Impl impl = windowInsetsCompat.mImpl;
        DisplayCutoutCompat displayCutout = impl.getDisplayCutout();
        return Math.max(displayCutout != null ? displayCutout.mDisplayCutout.getSafeInsetTop() : 0, impl.getInsets(519).top);
    }

    public static final int getStatusBarHeight(Context context) {
        context.getClass();
        int identifier = context.getResources().getIdentifier("status_bar_height", "dimen", "android");
        if (identifier > 0) {
            return context.getResources().getDimensionPixelSize(identifier);
        }
        return 0;
    }

    public static final boolean isCurrentOrientationValid(int i, Orientation orientation) {
        orientation.getClass();
        if (i == 2 && orientation == Orientation.LANDSCAPE) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.D, (Throwable) null, false, (Function0) new ViewUtils$$ExternalSyntheticLambda0(13), 12, (Object) null);
            return true;
        }
        if (i == 1 && orientation == Orientation.PORTRAIT) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.D, (Throwable) null, false, (Function0) new ViewUtils$$ExternalSyntheticLambda0(14), 12, (Object) null);
            return true;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.D, (Throwable) null, false, (Function0) new q2$$ExternalSyntheticLambda8(i, orientation, 7), 12, (Object) null);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isCurrentOrientationValid$lambda$0() {
        return "Current and preferred orientation are landscape.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isCurrentOrientationValid$lambda$1() {
        return "Current and preferred orientation are portrait.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String isCurrentOrientationValid$lambda$2(int i, Orientation orientation) {
        return "Current orientation " + i + " and preferred orientation " + orientation + " don't match";
    }

    public static final boolean isDeviceInNightMode(Context context) {
        context.getClass();
        return (context.getResources().getConfiguration().uiMode & 48) == 32;
    }

    public static final boolean isDeviceNotInTouchMode(View view) {
        view.getClass();
        return !view.isInTouchMode();
    }

    public static final boolean isRunningOnTablet(Activity activity) {
        activity.getClass();
        return activity.getResources().getConfiguration().smallestScreenWidthDp >= 600;
    }

    public static final void removeViewFromParent(View view) {
        if (view == null) {
            try {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.D, (Throwable) null, false, (Function0) new ViewUtils$$ExternalSyntheticLambda0(0), 12, (Object) null);
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new ViewUtils$$ExternalSyntheticLambda0(11), 8, (Object) null);
                return;
            }
        }
        if ((view != null ? view.getParent() : null) instanceof ViewGroup) {
            ViewParent parent = view.getParent();
            parent.getClass();
            ViewGroup viewGroup = (ViewGroup) parent;
            viewGroup.removeView(view);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.D, (Throwable) null, false, (Function0) new t7$$ExternalSyntheticLambda4(24, view, viewGroup), 12, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeViewFromParent$lambda$0() {
        return "View passed in is null. Not removing from parent.";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeViewFromParent$lambda$1(View view, ViewGroup viewGroup) {
        return "Removed view: " + view + "\nfrom parent: " + viewGroup;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String removeViewFromParent$lambda$2() {
        return "Caught exception while removing view from parent.";
    }

    public static final void setActivityRequestedOrientation(Activity activity, int i) {
        activity.getClass();
        try {
            activity.setRequestedOrientation(i);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new q2$$ExternalSyntheticLambda8(i, activity, 6), 8, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setActivityRequestedOrientation$lambda$0(int i, Activity activity) {
        return "Failed to set requested orientation " + i + " for activity class: " + activity.getLocalClassName();
    }

    public static final void setFocusableInTouchModeAndRequestFocus(View view) {
        view.getClass();
        try {
            view.setFocusableInTouchMode(true);
            view.requestFocus();
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, TAG, BrazeLogger.Priority.E, (Throwable) e, false, (Function0) new ViewUtils$$ExternalSyntheticLambda0(12), 8, (Object) null);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final String setFocusableInTouchModeAndRequestFocus$lambda$0() {
        return "Caught exception while setting view to focusable in touch mode and requesting focus.";
    }

    public static final void setHeightOnViewLayoutParams(View view, int i) {
        view.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        layoutParams.height = i;
        view.setLayoutParams(layoutParams);
    }
}
