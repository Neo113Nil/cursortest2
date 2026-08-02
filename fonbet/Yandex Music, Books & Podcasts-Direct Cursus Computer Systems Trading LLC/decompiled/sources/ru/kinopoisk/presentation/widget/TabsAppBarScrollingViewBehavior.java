package ru.kinopoisk.presentation.widget;

import android.R;
import android.content.Context;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.android.material.appbar.AppBarLayout;
import defpackage.g2s;
import defpackage.uk6;
import defpackage.xk6;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0017\u0018\u00002\u00020\u0001:\u0001\bB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lru/kinopoisk/presentation/widget/TabsAppBarScrollingViewBehavior;", "Lcom/google/android/material/appbar/AppBarLayout$ScrollingViewBehavior;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "g2s", "android_ui_uikit_mobilelegacy"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public class TabsAppBarScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {
    public final int a;
    public g2s b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabsAppBarScrollingViewBehavior(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        context.getClass();
        TypedValue typedValue = new TypedValue();
        typedValue = context.getTheme().resolveAttribute(R.attr.actionBarSize, typedValue, true) ? typedValue : null;
        Integer valueOf = typedValue != null ? Integer.valueOf(TypedValue.complexToDimensionPixelSize(typedValue.data, context.getResources().getDisplayMetrics())) : null;
        this.a = valueOf != null ? valueOf.intValue() : 0;
    }

    @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, defpackage.uk6
    public final boolean layoutDependsOn(@NotNull CoordinatorLayout coordinatorLayout, @NotNull View view, @NotNull View view2) {
        coordinatorLayout.getClass();
        view.getClass();
        view2.getClass();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        xk6 xk6Var = layoutParams instanceof xk6 ? (xk6) layoutParams : null;
        uk6 uk6Var = xk6Var != null ? xk6Var.a : null;
        if ((view2 instanceof AppBarLayout) && uk6Var == this && this.b == null) {
            g2s g2sVar = new g2s(view);
            this.b = g2sVar;
            ((AppBarLayout) view2).a(g2sVar);
        }
        return super.layoutDependsOn(coordinatorLayout, view, view2);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, defpackage.uk6
    public final void onDependentViewRemoved(@NotNull CoordinatorLayout coordinatorLayout, @NotNull View view, @NotNull View view2) {
        g2s g2sVar;
        coordinatorLayout.getClass();
        view.getClass();
        view2.getClass();
        super.onDependentViewRemoved(coordinatorLayout, view, view2);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        xk6 xk6Var = layoutParams instanceof xk6 ? (xk6) layoutParams : null;
        uk6 uk6Var = xk6Var != null ? xk6Var.a : null;
        if ((view2 instanceof AppBarLayout) && uk6Var == this && (g2sVar = this.b) != null) {
            ArrayList arrayList = ((AppBarLayout) view2).h;
            if (arrayList != null) {
                arrayList.remove(g2sVar);
            }
            this.b = null;
        }
    }

    @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, com.google.android.material.appbar.g, defpackage.uk6
    public final boolean onMeasureChild(@NotNull CoordinatorLayout coordinatorLayout, @NotNull View view, int i, int i2, int i3, int i4) {
        Object obj;
        coordinatorLayout.getClass();
        view.getClass();
        List u = coordinatorLayout.u(view);
        u.getClass();
        Iterator it = u.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((View) obj) instanceof AppBarLayout) {
                break;
            }
        }
        if (((View) obj) == null) {
            return super.onMeasureChild(coordinatorLayout, view, i, i2, i3, i4);
        }
        int size = View.MeasureSpec.getSize(i3);
        Integer valueOf = size > 0 ? Integer.valueOf(size) : null;
        coordinatorLayout.C(view, i, i2, View.MeasureSpec.makeMeasureSpec((valueOf != null ? valueOf.intValue() : coordinatorLayout.getHeight()) - this.a, 1073741824), i4);
        return true;
    }
}
