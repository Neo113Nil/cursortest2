package androidx.navigation.fragment;

import D1.i;
import Z.AbstractComponentCallbacksC0070s;
import Z.C0053a;
import Z.M;
import Z.V;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import b.u;
import com.lumenpath.harispro.hrnavigator.R;
import f0.P;
import h0.b;
import m0.C0299g;
import m0.C0303k;

/* loaded from: classes.dex */
public abstract class AbstractListDetailFragment extends AbstractComponentCallbacksC0070s {

    /* renamed from: W, reason: collision with root package name */
    public h0.a f2070W;

    /* renamed from: X, reason: collision with root package name */
    public int f2071X;

    @Override // Z.AbstractComponentCallbacksC0070s
    public final void C(View view) {
        i.e(view, "view");
        i.d(((C0303k) I()).getChildAt(0), "listPaneView");
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public final void D(Bundle bundle) {
        this.f1582D = true;
        h0.a aVar = this.f2070W;
        i.b(aVar);
        aVar.b(((C0303k) I()).e && ((C0303k) I()).d());
    }

    public abstract View M();

    @Override // Z.AbstractComponentCallbacksC0070s
    public final View u(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        NavHostFragment navHostFragment;
        Bundle bundle2;
        i.e(layoutInflater, "inflater");
        if (bundle != null) {
            this.f2071X = bundle.getInt("android-support-nav:fragment:graphId");
        }
        C0303k c0303k = new C0303k(layoutInflater.getContext());
        c0303k.setId(R.id.sliding_pane_layout);
        View M2 = M();
        if (!i.a(M2, c0303k) && !i.a(M2.getParent(), c0303k)) {
            c0303k.addView(M2);
        }
        Context context = layoutInflater.getContext();
        i.d(context, "inflater.context");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        fragmentContainerView.setId(R.id.sliding_pane_detail_container);
        C0299g c0299g = new C0299g(layoutInflater.getContext().getResources().getDimensionPixelSize(R.dimen.sliding_pane_detail_pane_width), -1);
        c0299g.f4076a = 1.0f;
        c0303k.addView(fragmentContainerView, c0299g);
        AbstractComponentCallbacksC0070s A2 = g().A(R.id.sliding_pane_detail_container);
        boolean z2 = false;
        if (A2 != null) {
        } else {
            int i = this.f2071X;
            if (i != 0) {
                if (i != 0) {
                    bundle2 = new Bundle();
                    bundle2.putInt("android-support-nav:fragment:graphId", i);
                } else {
                    bundle2 = null;
                }
                navHostFragment = new NavHostFragment();
                if (bundle2 != null) {
                    navHostFragment.L(bundle2);
                }
            } else {
                navHostFragment = new NavHostFragment();
            }
            M g2 = g();
            i.d(g2, "childFragmentManager");
            C0053a c0053a = new C0053a(g2);
            c0053a.f1523p = true;
            c0053a.e(R.id.sliding_pane_detail_container, navHostFragment, null, 1);
            c0053a.d(false);
        }
        this.f2070W = new h0.a(c0303k);
        if (!c0303k.isLaidOut() || c0303k.isLayoutRequested()) {
            c0303k.addOnLayoutChangeListener(new b(this, c0303k));
        } else {
            h0.a aVar = this.f2070W;
            i.b(aVar);
            if (c0303k.e && c0303k.d()) {
                z2 = true;
            }
            aVar.b(z2);
        }
        u i2 = F().i();
        V v2 = this.f1593P;
        if (v2 != null) {
            h0.a aVar2 = this.f2070W;
            i.b(aVar2);
            i2.a(v2, aVar2);
            return c0303k;
        }
        throw new IllegalStateException("Can't access the Fragment View's LifecycleOwner for " + this + " when getView() is null i.e., before onCreateView() or after onDestroyView()");
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public final void y(Context context, AttributeSet attributeSet, Bundle bundle) {
        i.e(context, "context");
        i.e(attributeSet, "attrs");
        super.y(context, attributeSet, bundle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, P.f2897b);
        i.d(obtainStyledAttributes, "context.obtainStyledAttr…tion.R.styleable.NavHost)");
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.f2071X = resourceId;
        }
        obtainStyledAttributes.recycle();
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public final void z(Bundle bundle) {
        int i = this.f2071X;
        if (i != 0) {
            bundle.putInt("android-support-nav:fragment:graphId", i);
        }
    }
}
