package ru.kinopoisk.presentation.widget;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.android.material.appbar.AppBarLayout;
import defpackage.btn;
import defpackage.uk6;
import defpackage.xk6;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0001\bB\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\t"}, d2 = {"Lru/kinopoisk/presentation/widget/RelativeAppBarScrollingViewBehavior;", "Lcom/google/android/material/appbar/AppBarLayout$ScrollingViewBehavior;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "btn", "android_ui_uikit_mobilelegacy"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final class RelativeAppBarScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {
    public xk6 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RelativeAppBarScrollingViewBehavior(@NotNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
    }

    @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, defpackage.uk6
    public final boolean onDependentViewChanged(@NotNull CoordinatorLayout coordinatorLayout, @NotNull View view, @NotNull View view2) {
        coordinatorLayout.getClass();
        view.getClass();
        view2.getClass();
        super.onDependentViewChanged(coordinatorLayout, view, view2);
        if (!(view2 instanceof AppBarLayout) || !(view instanceof RecyclerView)) {
            return false;
        }
        ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
        layoutParams.getClass();
        uk6 uk6Var = ((xk6) layoutParams).a;
        uk6Var.getClass();
        AppBarLayout.Behavior behavior = (AppBarLayout.Behavior) uk6Var;
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        layoutParams2.getClass();
        xk6 xk6Var = (xk6) layoutParams2;
        int topAndBottomOffset = behavior.getTopAndBottomOffset() + view2.getHeight();
        if (this.a == null) {
            this.a = new xk6(xk6Var);
        }
        behavior.setDragCallback(btn.a);
        xk6 xk6Var2 = this.a;
        if (xk6Var2 == null) {
            Intrinsics.j("defaultLayoutParams");
            throw null;
        }
        int i = ((ViewGroup.MarginLayoutParams) xk6Var2).leftMargin;
        if (xk6Var2 == null) {
            Intrinsics.j("defaultLayoutParams");
            throw null;
        }
        int i2 = ((ViewGroup.MarginLayoutParams) xk6Var2).topMargin;
        if (xk6Var2 == null) {
            Intrinsics.j("defaultLayoutParams");
            throw null;
        }
        int i3 = ((ViewGroup.MarginLayoutParams) xk6Var2).rightMargin;
        if (xk6Var2 == null) {
            Intrinsics.j("defaultLayoutParams");
            throw null;
        }
        xk6Var.setMargins(i, i2, i3, ((ViewGroup.MarginLayoutParams) xk6Var2).bottomMargin + topAndBottomOffset);
        ((RecyclerView) view).setLayoutParams(xk6Var);
        return true;
    }
}
