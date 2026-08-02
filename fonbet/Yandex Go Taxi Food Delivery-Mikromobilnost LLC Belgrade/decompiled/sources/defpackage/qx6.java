package defpackage;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.core.widget.NestedScrollView;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.design.ListTitleComponent;
import ru.yandex.taxi.design.LoadingStoriesComponent;
import ru.yandex.taxi.widget.BottomEdgeButtonLayout;

/* loaded from: classes13.dex */
public final class qx6 implements zo31 {
    public final FrameLayout a;
    public final ListItemComponent b;
    public final BottomEdgeButtonLayout c;
    public final ListItemComponent d;
    public final ListItemComponent e;
    public final ButtonComponent f;
    public final ListItemComponent g;
    public final NestedScrollView h;
    public final ListItemComponent i;
    public final ListTitleComponent j;
    public final ButtonComponent k;
    public final LinearLayout l;
    public final ListItemComponent m;
    public final px6 n;
    public final FrameLayout o;
    public final LoadingStoriesComponent p;

    public qx6(FrameLayout frameLayout, ListItemComponent listItemComponent, BottomEdgeButtonLayout bottomEdgeButtonLayout, ListItemComponent listItemComponent2, ListItemComponent listItemComponent3, ButtonComponent buttonComponent, ListItemComponent listItemComponent4, NestedScrollView nestedScrollView, ListItemComponent listItemComponent5, ListTitleComponent listTitleComponent, ButtonComponent buttonComponent2, LinearLayout linearLayout, ListItemComponent listItemComponent6, px6 px6Var, FrameLayout frameLayout2, LoadingStoriesComponent loadingStoriesComponent) {
        this.a = frameLayout;
        this.b = listItemComponent;
        this.c = bottomEdgeButtonLayout;
        this.d = listItemComponent2;
        this.e = listItemComponent3;
        this.f = buttonComponent;
        this.g = listItemComponent4;
        this.h = nestedScrollView;
        this.i = listItemComponent5;
        this.j = listTitleComponent;
        this.k = buttonComponent2;
        this.l = linearLayout;
        this.m = listItemComponent6;
        this.n = px6Var;
        this.o = frameLayout2;
        this.p = loadingStoriesComponent;
    }

    @Override // defpackage.zo31
    public final View getRoot() {
        return this.a;
    }
}
