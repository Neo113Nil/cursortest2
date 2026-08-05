package androidx.navigation.fragment;

import android.content.Context;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.FragmentContainerView;
import com.kolosta.rejin.jilosa.R;
import defpackage.cb0;
import defpackage.e7;
import defpackage.ej0;
import defpackage.li;
import defpackage.m1;
import defpackage.n1;
import defpackage.u00;
import defpackage.uu;
import defpackage.w00;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class NavHostFragment extends li {
    public int ESscZ9M1;
    public final cb0 TrssYQ34 = new cb0(new e7(5, this));
    public boolean VGmz0ccI;
    public View g2aRJUAd;

    @Override // defpackage.li
    public final void DK9slbsy() {
        this.euDDoUNr = true;
        View view = this.g2aRJUAd;
        if (view != null && ej0.OxcuoDLp(view) == zCflySGU()) {
            view.setTag(R.id.nav_controller_view_tag, null);
        }
        this.g2aRJUAd = null;
    }

    @Override // defpackage.li
    public final void FySoLYna(Context context) {
        super.FySoLYna(context);
        if (this.VGmz0ccI) {
            n1 n1Var = new n1(ow5vqvCr());
            n1Var.b2ZJblxo(this);
            n1Var.wxUZMvaN(false);
        }
    }

    @Override // defpackage.li
    public final void Mq3SeTnW(Bundle bundle) {
        if (this.VGmz0ccI) {
            bundle.putBoolean("android-support-nav:fragment:defaultHost", true);
        }
    }

    @Override // defpackage.li
    public final View WYNAV5pd(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        layoutInflater.getClass();
        Context context = layoutInflater.getContext();
        context.getClass();
        FragmentContainerView fragmentContainerView = new FragmentContainerView(context);
        int i = this.gjV1z5T1;
        if (i == 0 || i == -1) {
            i = R.id.nav_host_fragment_container;
        }
        fragmentContainerView.setId(i);
        return fragmentContainerView;
    }

    @Override // defpackage.li
    public final void gjV1z5T1(Bundle bundle) {
        zCflySGU();
        if (bundle != null && bundle.getBoolean("android-support-nav:fragment:defaultHost", false)) {
            this.VGmz0ccI = true;
            n1 n1Var = new n1(ow5vqvCr());
            n1Var.b2ZJblxo(this);
            n1Var.wxUZMvaN(false);
        }
        super.gjV1z5T1(bundle);
    }

    @Override // defpackage.li
    public final void i7xS8jrb(Context context, AttributeSet attributeSet, Bundle bundle) {
        context.getClass();
        attributeSet.getClass();
        super.i7xS8jrb(context, attributeSet, bundle);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, u00.NCTxEWno);
        obtainStyledAttributes.getClass();
        int resourceId = obtainStyledAttributes.getResourceId(0, 0);
        if (resourceId != 0) {
            this.ESscZ9M1 = resourceId;
        }
        obtainStyledAttributes.recycle();
        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, w00.MdtA4re8);
        obtainStyledAttributes2.getClass();
        if (obtainStyledAttributes2.getBoolean(0, false)) {
            this.VGmz0ccI = true;
        }
        obtainStyledAttributes2.recycle();
    }

    @Override // defpackage.li
    public final void ytu5o6f4(View view) {
        view.getClass();
        if (!(view instanceof ViewGroup)) {
            m1.I5GHvsYW(view, " is not a ViewGroup", "created host view ");
            return;
        }
        view.setTag(R.id.nav_controller_view_tag, zCflySGU());
        ViewGroup viewGroup = (ViewGroup) view;
        if (viewGroup.getParent() != null) {
            Object parent = viewGroup.getParent();
            parent.getClass();
            View view2 = (View) parent;
            this.g2aRJUAd = view2;
            if (view2.getId() == this.gjV1z5T1) {
                View view3 = this.g2aRJUAd;
                view3.getClass();
                view3.setTag(R.id.nav_controller_view_tag, zCflySGU());
            }
        }
    }

    public final uu zCflySGU() {
        return (uu) this.TrssYQ34.getValue();
    }
}
