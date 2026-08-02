package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import java.util.LinkedHashMap;

/* loaded from: classes15.dex */
public final class ul6 extends ip31 implements g62 {
    public LinearLayout b;
    public View c;
    public final LinkedHashMap w;

    public ul6(View view) {
        super(view);
        this.w = new LinkedHashMap();
    }

    @Override // defpackage.g62
    public final void a(LinearLayout linearLayout, View view) {
        this.a = linearLayout;
        this.b = linearLayout;
        this.c = view;
    }

    @Override // defpackage.ip31
    public final void c(View.OnLayoutChangeListener onLayoutChangeListener) {
        LinkedHashMap linkedHashMap = this.w;
        if (linkedHashMap.containsKey(onLayoutChangeListener)) {
            return;
        }
        u90 u90Var = new u90(7, (yln) onLayoutChangeListener);
        linkedHashMap.put(onLayoutChangeListener, u90Var);
        super.c(u90Var);
    }

    @Override // defpackage.ip31
    public final int d() {
        View view = this.c;
        return view != null ? view.getBottom() : this.a.getBottom();
    }

    @Override // defpackage.ip31
    public final int e() {
        View view = this.c;
        return view != null ? view.getHeight() : this.a.getHeight();
    }

    @Override // defpackage.ip31
    public final int f() {
        LinearLayout linearLayout = this.b;
        return linearLayout != null ? linearLayout.getLeft() : this.a.getLeft();
    }

    @Override // defpackage.ip31
    public final int g() {
        View view = this.c;
        LinearLayout linearLayout = this.b;
        if (view == null || linearLayout == null) {
            return this.a.getRight();
        }
        return linearLayout.getLeft() + view.getWidth();
    }

    @Override // defpackage.ip31
    public final int h() {
        LinearLayout linearLayout = this.b;
        return linearLayout != null ? linearLayout.getTop() : this.a.getTop();
    }

    @Override // defpackage.ip31
    public final int i() {
        View view = this.c;
        return view != null ? view.getWidth() : this.a.getWidth();
    }

    @Override // defpackage.ip31
    public final void j(View.OnLayoutChangeListener onLayoutChangeListener) {
        LinkedHashMap linkedHashMap = this.w;
        View.OnLayoutChangeListener onLayoutChangeListener2 = (View.OnLayoutChangeListener) linkedHashMap.get(onLayoutChangeListener);
        if (onLayoutChangeListener2 != null) {
            linkedHashMap.remove(onLayoutChangeListener);
            super.j(onLayoutChangeListener2);
        }
    }
}
