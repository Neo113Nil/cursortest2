package androidx.navigation.fragment;

import android.app.Dialog;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.Window;
import androidx.fragment.app.DialogFragment;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.Fragment$5$$ExternalSyntheticOutline0;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigation;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.clientroutes.ClientRoute;
import java.util.List;

/* loaded from: classes3.dex */
public abstract class FragmentKt {
    public static final NavHostController findNavController(Fragment fragment) {
        Dialog dialog;
        Window window;
        fragment.getClass();
        for (Fragment fragment2 = fragment; fragment2 != null; fragment2 = fragment2.getParentFragment()) {
            if (fragment2 instanceof NavHostFragment) {
                return ((NavHostFragment) fragment2).getNavHostController$navigation_fragment_release();
            }
            Fragment fragment3 = fragment2.getParentFragmentManager().mPrimaryNav;
            if (fragment3 instanceof NavHostFragment) {
                return ((NavHostFragment) fragment3).getNavHostController$navigation_fragment_release();
            }
        }
        View view = fragment.getView();
        if (view != null) {
            return Navigation.findNavController(view);
        }
        DialogFragment dialogFragment = fragment instanceof DialogFragment ? (DialogFragment) fragment : null;
        View decorView = (dialogFragment == null || (dialog = dialogFragment.getDialog()) == null || (window = dialog.getWindow()) == null) ? null : window.getDecorView();
        if (decorView != null) {
            return Navigation.findNavController(decorView);
        }
        a$$ExternalSyntheticBUOutline0.m$1(Fragment$5$$ExternalSyntheticOutline0.m("Fragment ", fragment, " does not have a NavController set"));
        return null;
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewBitcoinAutoInvest.deepLinkSpecs;
    }

    public static final GradientDrawable roundedRect(float f, int i) {
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(f);
        gradientDrawable.setShape(0);
        gradientDrawable.setColor(i);
        return gradientDrawable;
    }
}
