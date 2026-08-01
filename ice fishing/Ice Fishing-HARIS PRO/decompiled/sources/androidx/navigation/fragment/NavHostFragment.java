package androidx.navigation.fragment;

import D1.i;
import J1.j;
import Z.AbstractComponentCallbacksC0070s;
import Z.C0053a;
import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import com.lumenpath.harispro.hrnavigator.R;
import f0.P;
import f0.z;
import h.AbstractActivityC0168i;
import h0.n;
import t1.h;

/* loaded from: classes.dex */
public class NavHostFragment extends AbstractComponentCallbacksC0070s {

    /* renamed from: W, reason: collision with root package name */
    public final h f2082W = new h(new j(5, this));

    /* renamed from: X, reason: collision with root package name */
    public View f2083X;

    /* renamed from: Y, reason: collision with root package name */
    public int f2084Y;

    /* renamed from: Z, reason: collision with root package name */
    public boolean f2085Z;

    @Override // Z.AbstractComponentCallbacksC0070s
    public final void C(View view) {
        i.e(view, "view");
        if (!(view instanceof ViewGroup)) {
            throw new IllegalStateException(("created host view " + view + " is not a ViewGroup").toString());
        }
        view.setTag(R.id.nav_controller_view_tag, M());
        if (view.getParent() != null) {
            Object parent = view.getParent();
            i.c(parent, "null cannot be cast to non-null type android.view.View");
            View view2 = (View) parent;
            this.f2083X = view2;
            if (view2.getId() == this.f1618w) {
                View view3 = this.f2083X;
                i.b(view3);
                view3.setTag(R.id.nav_controller_view_tag, M());
            }
        }
    }

    public final z M() {
        return (z) this.f2082W.getValue();
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public final void s(AbstractActivityC0168i abstractActivityC0168i) {
        i.e(abstractActivityC0168i, "context");
        super.s(abstractActivityC0168i);
        if (this.f2085Z) {
            C0053a c0053a = new C0053a(j());
            c0053a.g(this);
            c0053a.d(false);
        }
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public final void t(Bundle bundle) {
        M();
        if (bundle != null && bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
            this.f2085Z = true;
            C0053a c0053a = new C0053a(j());
            c0053a.g(this);
            c0053a.d(false);
        }
        super.t(bundle);
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public final View u(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        i.e(layoutInflater, "inflater");
        Context context = layoutInflater.getContext();
        i.d(context, "inflater.context");
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        int i = this.f1618w;
        if (i == 0 || i == -1) {
            i = R.id.nav_host_fragment_container;
        }
        fragmentContainerView.setId(i);
        return fragmentContainerView;
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public final void v() {
        this.f1582D = true;
        View view = this.f2083X;
        if (view != null && R.j.r(view) == M()) {
            view.setTag(R.id.nav_controller_view_tag, null);
        }
        this.f2083X = null;
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
            this.f2084Y = resourceId;
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, n.f3267c);
        i.d(obtainStyledAttributes2, "context.obtainStyledAttr…tyleable.NavHostFragment)");
        if (obtainStyledAttributes2.getBoolean(0, false)) {
            this.f2085Z = true;
        }
        obtainStyledAttributes2.recycle();
    }

    @Override // Z.AbstractComponentCallbacksC0070s
    public final void z(Bundle bundle) {
        if (this.f2085Z) {
            bundle.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
    }
}
