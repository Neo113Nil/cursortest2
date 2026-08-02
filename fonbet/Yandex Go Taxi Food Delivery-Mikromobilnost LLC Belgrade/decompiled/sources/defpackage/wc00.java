package defpackage;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class wc00 implements xc00 {
    public final tyz0 a;
    public final cd00 b;
    public View c;
    public View d;
    public sls e = new k801(25);
    public final int[] f = new int[2];

    public wc00(tyz0 tyz0Var, cd00 cd00Var) {
        this.a = tyz0Var;
        this.b = cd00Var;
    }

    public static boolean a(View view) {
        if (view == null) {
            return true;
        }
        if (!(view instanceof RecyclerView)) {
            if (!(view instanceof ViewGroup)) {
                return true;
            }
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = viewGroup.getChildAt(i);
                if (childAt.getVisibility() != 0 || a(childAt)) {
                }
            }
            return true;
        }
        if (!((RecyclerView) view).canScrollVertically(-1)) {
            return true;
        }
        return false;
    }
}
