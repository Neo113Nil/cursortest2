package defpackage;

import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.ybsdk.feature.dashboard.internal.ui.dashboard3.view.DashboardCardView;
import com.ybsdk.feature.divkit.api.ui.YbDivView;

/* loaded from: classes3.dex */
public final class u661 implements zo31 {
    public final ConstraintLayout a;
    public final TextView b;
    public final View c;
    public final LinearLayout d;
    public final AppCompatImageView e;
    public final AppCompatImageView f;
    public final DashboardCardView g;
    public final t661 h;
    public final YbDivView i;
    public final Space j;
    public final ImageView k;
    public final ImageView l;
    public final TextView m;

    public u661(ConstraintLayout constraintLayout, TextView textView, View view, LinearLayout linearLayout, AppCompatImageView appCompatImageView, AppCompatImageView appCompatImageView2, DashboardCardView dashboardCardView, t661 t661Var, YbDivView ybDivView, Space space, ImageView imageView, ImageView imageView2, TextView textView2) {
        this.a = constraintLayout;
        this.b = textView;
        this.c = view;
        this.d = linearLayout;
        this.e = appCompatImageView;
        this.f = appCompatImageView2;
        this.g = dashboardCardView;
        this.h = t661Var;
        this.i = ybDivView;
        this.j = space;
        this.k = imageView;
        this.l = imageView2;
        this.m = textView2;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
