package defpackage;

import android.view.View;
import android.widget.LinearLayout;
import java.util.LinkedHashMap;

/* loaded from: classes15.dex */
public final class t190 extends ip31 implements g62 {
    public LinearLayout b;
    public final LinkedHashMap c;

    public t190(View view) {
        super(view);
        this.c = new LinkedHashMap();
    }

    @Override // defpackage.g62
    public final void a(LinearLayout linearLayout, View view) {
        this.a = view;
        this.b = linearLayout;
    }

    @Override // defpackage.ip31
    public final void c(View.OnLayoutChangeListener onLayoutChangeListener) {
        LinkedHashMap linkedHashMap = this.c;
        if (linkedHashMap.containsKey(onLayoutChangeListener)) {
            return;
        }
        dmn dmnVar = new dmn(1, (yln) onLayoutChangeListener, this);
        linkedHashMap.put(onLayoutChangeListener, dmnVar);
        super.c(dmnVar);
    }

    @Override // defpackage.ip31
    public final int f() {
        LinearLayout linearLayout = this.b;
        return linearLayout != null ? linearLayout.getLeft() : this.a.getLeft();
    }

    @Override // defpackage.ip31
    public final int g() {
        Integer k = k();
        return k != null ? k.intValue() : this.a.getRight();
    }

    @Override // defpackage.ip31
    public final int i() {
        Integer k = k();
        return k != null ? k.intValue() : this.a.getWidth();
    }

    @Override // defpackage.ip31
    public final void j(View.OnLayoutChangeListener onLayoutChangeListener) {
        LinkedHashMap linkedHashMap = this.c;
        View.OnLayoutChangeListener onLayoutChangeListener2 = (View.OnLayoutChangeListener) linkedHashMap.get(onLayoutChangeListener);
        if (onLayoutChangeListener2 != null) {
            linkedHashMap.remove(onLayoutChangeListener);
            super.j(onLayoutChangeListener2);
        }
    }

    public final Integer k() {
        LinearLayout linearLayout = this.b;
        if (linearLayout == null) {
            return null;
        }
        return Integer.valueOf(linearLayout.getLeft() + this.a.getWidth());
    }
}
