package ru.kinopoisk.presentation.behavior;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import com.google.android.material.appbar.AppBarLayout;
import defpackage.ndu;
import defpackage.wdu;
import java.util.Iterator;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ru.yandex.music.R;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lru/kinopoisk/presentation/behavior/AppBarElevationWhenScrollBehavior;", "Lcom/google/android/material/appbar/AppBarLayout$ScrollingViewBehavior;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "android_ui_uishared_coreuimobile"}, k = 1, mv = {1, 9, 0}, xi = UibcKeyCode.TV_KEYCODE_0)
/* loaded from: classes5.dex */
public final class AppBarElevationWhenScrollBehavior extends AppBarLayout.ScrollingViewBehavior {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppBarElevationWhenScrollBehavior(@NotNull Context context, @NotNull AttributeSet attributeSet) {
        super(context, attributeSet);
        context.getClass();
        attributeSet.getClass();
    }

    public static void a(CoordinatorLayout coordinatorLayout, View view) {
        Object obj;
        List u = coordinatorLayout.u(view);
        u.getClass();
        Iterator it = u.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((View) obj) instanceof AppBarLayout) {
                    break;
                }
            }
        }
        View view2 = (View) obj;
        if (view2 != null) {
            AppBarLayout appBarLayout = (AppBarLayout) view2;
            if (view.getScrollY() <= 1) {
                WeakHashMap weakHashMap = wdu.a;
                ndu.l(appBarLayout, 0.0f);
            } else {
                float dimension = appBarLayout.getResources().getDimension(R.dimen.design_appbar_elevation);
                WeakHashMap weakHashMap2 = wdu.a;
                ndu.l(appBarLayout, dimension);
            }
        }
    }

    @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, defpackage.mfu, defpackage.uk6
    public final boolean onLayoutChild(@NotNull CoordinatorLayout coordinatorLayout, @NotNull View view, int i) {
        coordinatorLayout.getClass();
        view.getClass();
        boolean onLayoutChild = super.onLayoutChild(coordinatorLayout, view, i);
        a(coordinatorLayout, view);
        return onLayoutChild;
    }

    @Override // defpackage.uk6
    public final void onNestedPreScroll(@NotNull CoordinatorLayout coordinatorLayout, @NotNull View view, @NotNull View view2, int i, int i2, @NotNull int[] iArr, int i3) {
        coordinatorLayout.getClass();
        view.getClass();
        view2.getClass();
        iArr.getClass();
        super.onNestedPreScroll(coordinatorLayout, view, view2, i, i2, iArr, i3);
        a(coordinatorLayout, view);
    }

    @Override // defpackage.uk6
    public final boolean onStartNestedScroll(@NotNull CoordinatorLayout coordinatorLayout, @NotNull View view, @NotNull View view2, @NotNull View view3, int i, int i2) {
        coordinatorLayout.getClass();
        view.getClass();
        view2.getClass();
        view3.getClass();
        return (i & 2) != 0;
    }
}
