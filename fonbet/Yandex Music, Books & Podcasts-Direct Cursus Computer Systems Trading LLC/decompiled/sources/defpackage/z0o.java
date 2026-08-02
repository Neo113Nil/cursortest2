package defpackage;

import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import java.util.ArrayList;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public final class z0o implements j6s {
    public final ay6 a;
    public final View b;
    public final /* synthetic */ int c;

    public z0o(View view, int i) {
        this.c = i;
        w1g.s(view, "Argument must not be null");
        this.b = view;
        this.a = new ay6(view);
    }

    @Override // defpackage.j6s
    public final void a(anq anqVar) {
        ay6 ay6Var = this.a;
        ArrayList arrayList = ay6Var.b;
        View view = ay6Var.a;
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int a = ay6Var.a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        int a2 = ay6Var.a(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((a > 0 || a == Integer.MIN_VALUE) && (a2 > 0 || a2 == Integer.MIN_VALUE)) {
            anqVar.c(a, a2);
            return;
        }
        if (!arrayList.contains(anqVar)) {
            arrayList.add(anqVar);
        }
        if (ay6Var.c == null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            zx6 zx6Var = new zx6(ay6Var);
            ay6Var.c = zx6Var;
            viewTreeObserver.addOnPreDrawListener(zx6Var);
        }
    }

    @Override // defpackage.j6s
    public final void c(jlq jlqVar) {
        this.a.b.remove(jlqVar);
    }

    @Override // defpackage.j6s
    public final void d(Object obj) {
        int i = this.c;
    }

    @Override // defpackage.j6s
    public final e0o f() {
        Object tag = this.b.getTag(R.id.glide_custom_view_target_tag);
        if (tag != null) {
            if (tag instanceof e0o) {
                return (e0o) tag;
            }
            xq0.x("You must not pass non-R.id ids to setTag(id)");
        }
        return null;
    }

    @Override // defpackage.j6s
    public final void g(Drawable drawable) {
        ay6 ay6Var = this.a;
        ViewTreeObserver viewTreeObserver = ay6Var.a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(ay6Var.c);
        }
        ay6Var.c = null;
        ay6Var.b.clear();
    }

    @Override // defpackage.j6s
    public final void h(e0o e0oVar) {
        this.b.setTag(R.id.glide_custom_view_target_tag, e0oVar);
    }

    @Override // defpackage.j6s
    public final void i(Drawable drawable) {
        int i = this.c;
    }

    public final String toString() {
        return "Target for: " + this.b;
    }

    @Override // defpackage.zyf
    public final void b() {
    }

    @Override // defpackage.zyf
    public final void onDestroy() {
    }

    @Override // defpackage.zyf
    public final void onStop() {
    }

    private final void j(Drawable drawable) {
    }

    private final void k(Drawable drawable) {
    }

    private final void l(Object obj) {
    }

    private final void m(Object obj) {
    }

    @Override // defpackage.j6s
    public final void e(Drawable drawable) {
    }
}
