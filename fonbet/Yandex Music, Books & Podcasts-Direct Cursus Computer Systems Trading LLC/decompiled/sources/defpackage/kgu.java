package defpackage;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager2.widget.ViewPager2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public class kgu extends FrameLayout {
    public final ViewPager2 a;
    public hc9 b;

    public kgu(@NotNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.a = new ViewPager2(context);
        super.addView(getViewPager());
    }

    public final int getOrientation() {
        return getViewPager().getOrientation();
    }

    public final hc9 getPageTransformer$div_release() {
        return this.b;
    }

    public final RecyclerView getRecyclerView() {
        View childAt = getViewPager().getChildAt(0);
        if (childAt instanceof RecyclerView) {
            return (RecyclerView) childAt;
        }
        return null;
    }

    @NotNull
    public ViewPager2 getViewPager() {
        return this.a;
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if ((getOrientation() != 0 || getLayoutParams().height != -2) && (getOrientation() != 1 || getLayoutParams().width != -2)) {
            super.onMeasure(i, i2);
            return;
        }
        measureChild(getViewPager(), i, i2);
        int orientation = getOrientation();
        if (orientation == 0) {
            igu iguVar = igu.a;
            vqn vqnVar = new vqn();
            gcp gcpVar = new gcp(vqnVar, iguVar);
            RecyclerView recyclerView = getRecyclerView();
            if (recyclerView != null) {
                gcpVar.invoke(recyclerView);
            }
            super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(vqnVar.a, 1073741824));
            return;
        }
        if (orientation != 1) {
            return;
        }
        jgu jguVar = jgu.a;
        vqn vqnVar2 = new vqn();
        gcp gcpVar2 = new gcp(vqnVar2, jguVar);
        RecyclerView recyclerView2 = getRecyclerView();
        if (recyclerView2 != null) {
            gcpVar2.invoke(recyclerView2);
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(vqnVar2.a, 1073741824), i2);
    }

    public final void setOrientation(int i) {
        hb9 hb9Var = (hb9) getViewPager().getAdapter();
        if (getViewPager().getOrientation() == i && hb9Var != null && hb9Var.r == i) {
            return;
        }
        getViewPager().setOrientation(i);
        if (hb9Var != null) {
            hb9Var.r = i;
        }
        RecyclerView recyclerView = getRecyclerView();
        if (recyclerView == null) {
            return;
        }
        recyclerView.getRecycledViewPool().a();
        int i2 = 0;
        while (true) {
            if (!(i2 < recyclerView.getChildCount())) {
                return;
            }
            int i3 = i2 + 1;
            View childAt = recyclerView.getChildAt(i2);
            if (childAt == null) {
                rj7.m();
                return;
            } else {
                childAt.setTranslationX(0.0f);
                childAt.setTranslationY(0.0f);
                i2 = i3;
            }
        }
    }

    public final void setPageTransformer$div_release(hc9 hc9Var) {
        this.b = hc9Var;
        getViewPager().setPageTransformer(hc9Var);
    }

    public final void setRecycledViewPool(@NotNull fpn fpnVar) {
        hxo hxoVar = new hxo(23, fpnVar);
        RecyclerView recyclerView = getRecyclerView();
        if (recyclerView == null) {
            return;
        }
        hxoVar.invoke(recyclerView);
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    @NotNull
    public String getAccessibilityClassName() {
        return "androidx.viewpager.widget.ViewPager";
    }

    public kgu(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public /* synthetic */ kgu(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }

    public kgu(@NotNull Context context) {
        this(context, null, 0, 6, null);
    }
}
