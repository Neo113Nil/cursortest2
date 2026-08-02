package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public final class z561 implements zo31 {
    public final ConstraintLayout a;
    public final ImageView b;
    public final TextView c;
    public final RecyclerView d;
    public final TextView e;

    public z561(ConstraintLayout constraintLayout, ImageView imageView, TextView textView, RecyclerView recyclerView, TextView textView2) {
        this.a = constraintLayout;
        this.b = imageView;
        this.c = textView;
        this.d = recyclerView;
        this.e = textView2;
    }

    public static z561 o(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        View inflate = layoutInflater.inflate(vmh0.ybsdk_screen_about, viewGroup, false);
        int i = oah0.coinImage;
        ImageView imageView = (ImageView) cma1.O(i, inflate);
        if (imageView != null) {
            i = oah0.license;
            TextView textView = (TextView) cma1.O(i, inflate);
            if (textView != null) {
                i = oah0.menuRecycler;
                RecyclerView recyclerView = (RecyclerView) cma1.O(i, inflate);
                if (recyclerView != null) {
                    i = oah0.project;
                    if (((TextView) cma1.O(i, inflate)) != null) {
                        i = oah0.title;
                        if (((TextView) cma1.O(i, inflate)) != null) {
                            i = oah0.version;
                            TextView textView2 = (TextView) cma1.O(i, inflate);
                            if (textView2 != null) {
                                return new z561((ConstraintLayout) inflate, imageView, textView, recyclerView, textView2);
                            }
                        }
                    }
                }
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
