package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.BackStackRecord;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentContainerView;
import androidx.fragment.app.FragmentManager;
import androidx.navigation.NavHostController;
import androidx.navigation.Navigation;
import androidx.work.Worker$$ExternalSyntheticLambda0;
import com.squareup.cash.R;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import papa.Handlers$$ExternalSyntheticBUOutline0;

@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/navigation/fragment/NavHostFragment;", "Landroidx/fragment/app/Fragment;", "", "<init>", "()V", "navigation-fragment_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public class NavHostFragment extends Fragment {
    public boolean defaultNavHost;
    public int graphId;
    public final Lazy navHostController$delegate = LazyKt.lazy(new Worker$$ExternalSyntheticLambda0(this, 12));
    public View viewParent;

    public final NavHostController getNavHostController$navigation_fragment_release() {
        return (NavHostController) this.navHostController$delegate.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        context.getClass();
        super.onAttach(context);
        if (this.defaultNavHost) {
            FragmentManager parentFragmentManager = getParentFragmentManager();
            parentFragmentManager.getClass();
            BackStackRecord backStackRecord = new BackStackRecord(parentFragmentManager);
            backStackRecord.setPrimaryNavigationFragment(this);
            backStackRecord.commit();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        getNavHostController$navigation_fragment_release();
        if (bundle != null && bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
            this.defaultNavHost = true;
            FragmentManager parentFragmentManager = getParentFragmentManager();
            parentFragmentManager.getClass();
            BackStackRecord backStackRecord = new BackStackRecord(parentFragmentManager);
            backStackRecord.setPrimaryNavigationFragment(this);
            backStackRecord.commit();
        }
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        Context context = layoutInflater.getContext();
        context.getClass();
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        int id = getId();
        if (id == 0 || id == -1) {
            id = R.id.nav_host_fragment_container;
        }
        fragmentContainerView.setId(id);
        return fragmentContainerView;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        View view = this.viewParent;
        if (view != null && Navigation.findNavController(view) == getNavHostController$navigation_fragment_release()) {
            view.setTag(R.id.nav_controller_view_tag, null);
        }
        this.viewParent = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onInflate(Context context, AttributeSet attributeSet, Bundle bundle) {
        context.getClass();
        attributeSet.getClass();
        super.onInflate(context, attributeSet, bundle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, androidx.navigation.R$styleable.NavHost);
        obtainStyledAttributes.getClass();
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.graphId = resourceId;
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, R$styleable.NavHostFragment);
        obtainStyledAttributes2.getClass();
        if (obtainStyledAttributes2.getBoolean(0, false)) {
            this.defaultNavHost = true;
        }
        obtainStyledAttributes2.recycle();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        bundle.getClass();
        super.onSaveInstanceState(bundle);
        if (this.defaultNavHost) {
            bundle.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        if (!(view instanceof ViewGroup)) {
            Handlers$$ExternalSyntheticBUOutline0.m("created host view ", view, " is not a ViewGroup");
            return;
        }
        view.setTag(R.id.nav_controller_view_tag, getNavHostController$navigation_fragment_release());
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.getParent() != null) {
            Object parent = viewGroup.getParent();
            parent.getClass();
            View view2 = (View) parent;
            this.viewParent = view2;
            if (view2.getId() == getId()) {
                View view3 = this.viewParent;
                view3.getClass();
                view3.setTag(R.id.nav_controller_view_tag, getNavHostController$navigation_fragment_release());
            }
        }
    }
}
