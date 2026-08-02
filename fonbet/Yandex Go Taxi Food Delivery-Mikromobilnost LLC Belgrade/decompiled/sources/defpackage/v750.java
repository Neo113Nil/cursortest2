package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import com.ybsdk.core.utils.ext.view.b;
import com.ybsdk.navigation.NavigationFragment;
import com.ybsdk.screens.modal.RootSlideableModalView;
import java.util.Map;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes3.dex */
public final class v750 extends FragmentManager.a {
    public final /* synthetic */ NavigationFragment a;

    public v750(NavigationFragment navigationFragment) {
        this.a = navigationFragment;
    }

    @Override // androidx.fragment.app.FragmentManager.a
    public final void onFragmentAttached(FragmentManager fragmentManager, Fragment fragment, Context context) {
        String tag;
        Map map;
        if (!fragment.isAdded()) {
            fragment = null;
        }
        if (fragment == null || (tag = fragment.getTag()) == null) {
            return;
        }
        String str = evu0.J(tag) ? null : tag;
        if (str != null) {
            NavigationFragment navigationFragment = this.a;
            zva0 b = ((awa0) ((h9g) navigationFragment.getSdkViewComponent()).v.w0.get()).b(str);
            map = navigationFragment.fragmentTraces;
            map.put(str, b);
        }
    }

    @Override // androidx.fragment.app.FragmentManager.a
    public final void onFragmentPaused(FragmentManager fragmentManager, Fragment fragment) {
        Map map;
        String tag = fragment.getTag();
        if (tag != null) {
            if (evu0.J(tag)) {
                tag = null;
            }
            if (tag != null) {
                map = this.a.fragmentTraces;
            }
        }
    }

    @Override // androidx.fragment.app.FragmentManager.a
    public final void onFragmentResumed(FragmentManager fragmentManager, Fragment fragment) {
        uvt0 spoilerManager;
        uvt0 spoilerManager2;
        NavigationFragment navigationFragment = this.a;
        navigationFragment.invalidateBackButton();
        navigationFragment.initDetector();
        spoilerManager = navigationFragment.getSpoilerManager();
        r0 r0Var = ((vvt0) spoilerManager).d;
        spoilerManager2 = navigationFragment.getSpoilerManager();
        Boolean valueOf = Boolean.valueOf(((vvt0) spoilerManager2).a());
        r0Var.getClass();
        r0Var.m(null, valueOf);
        super.onFragmentResumed(fragmentManager, fragment);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.FragmentManager.a
    public final void onFragmentStarted(FragmentManager fragmentManager, Fragment fragment) {
        super.onFragmentStarted(fragmentManager, fragment);
        NavigationFragment navigationFragment = this.a;
        navigationFragment.invalidateBackButton();
        navigationFragment.invalidateNavigationFragmentComponents();
        navigationFragment.updateSoftInputMode();
        navigationFragment.updateStatusBarColor();
        navigationFragment.updateNavigationBarColor();
        navigationFragment.updateSensitiveDataMode(fragment instanceof wqq0 ? (wqq0) fragment : null);
        navigationFragment.updateBackground();
    }

    @Override // androidx.fragment.app.FragmentManager.a
    public final void onFragmentStopped(FragmentManager fragmentManager, Fragment fragment) {
        super.onFragmentStopped(fragmentManager, fragment);
        NavigationFragment navigationFragment = this.a;
        navigationFragment.invalidateBackButton();
        navigationFragment.updateSoftInputMode();
        navigationFragment.updateStatusBarColor();
        navigationFragment.updateNavigationBarColor();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // androidx.fragment.app.FragmentManager.a
    public final void onFragmentViewCreated(FragmentManager fragmentManager, Fragment fragment, View view, Bundle bundle) {
        hs51 ybInsetsHandlingHelper;
        Fragment lastVisibleFragment;
        RootSlideableModalView rootSlideableModalView;
        NavigationFragment navigationFragment = this.a;
        ybInsetsHandlingHelper = navigationFragment.getYbInsetsHandlingHelper();
        lastVisibleFragment = navigationFragment.getLastVisibleFragment();
        View requireView = navigationFragment.requireView();
        boolean z = ybInsetsHandlingHelper.b;
        boolean z2 = ybInsetsHandlingHelper.a;
        if ((fragment instanceof zjf) && ((zjf) fragment).getIsNewInsetsHandlingEnabled()) {
            b.w(view, new gs51(1, fragment, ybInsetsHandlingHelper));
            if (!z && z2) {
                androidx.core.view.b.d(view, new x651().a.h());
            }
        } else {
            tdr tdrVar = fragment instanceof tdr ? (tdr) fragment : null;
            view.setPadding(view.getPaddingLeft(), (tdrVar == null || !tdrVar.fitNavigation()) ? ybInsetsHandlingHelper.d : 0, view.getPaddingRight(), view.getPaddingBottom());
            if (z) {
                xdr xdrVar = fragment instanceof xdr ? (xdr) fragment : null;
                if ((xdrVar != null ? xdrVar.fitsSystemWindow() : true) || z2) {
                    b.w(view, new t26(27, ybInsetsHandlingHelper, lastVisibleFragment, view));
                }
            } else if (!z2) {
                xdr xdrVar2 = fragment instanceof xdr ? (xdr) fragment : null;
                view.setFitsSystemWindows(xdrVar2 != null ? xdrVar2.fitsSystemWindow() : true);
                requireView.requestApplyInsets();
            }
        }
        rootSlideableModalView = navigationFragment.slideableModalView;
        if (rootSlideableModalView != null) {
            rootSlideableModalView.setSlideMotionHelper(fragment instanceof uns0 ? (uns0) fragment : null);
        }
        String tag = fragment.getTag();
        if (tag != null) {
            String str = evu0.J(tag) ? null : tag;
            if (str != null) {
                new adr(view, new ve30(26, navigationFragment, str));
            }
        }
    }

    @Override // androidx.fragment.app.FragmentManager.a
    public final void onFragmentViewDestroyed(FragmentManager fragmentManager, Fragment fragment) {
        RootSlideableModalView rootSlideableModalView;
        rootSlideableModalView = this.a.slideableModalView;
        if (rootSlideableModalView != null) {
            rootSlideableModalView.setSlideMotionHelper(null);
        }
        super.onFragmentViewDestroyed(fragmentManager, fragment);
    }
}
