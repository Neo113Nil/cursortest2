package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.util.ArrayList;
import ru.yandex.music.R;

/* loaded from: classes.dex */
public class o33 implements j6s {
    public final ImageView a;
    public final khu b;
    public Animatable c;
    public final /* synthetic */ int d;

    public o33(ImageView imageView, int i) {
        this.d = i;
        w1g.s(imageView, "Argument must not be null");
        this.a = imageView;
        this.b = new khu(imageView);
    }

    @Override // defpackage.j6s
    public final void a(anq anqVar) {
        khu khuVar = this.b;
        ArrayList arrayList = khuVar.b;
        View view = khuVar.a;
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int a = khuVar.a(view.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        int paddingBottom = view.getPaddingBottom() + view.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = view.getLayoutParams();
        int a2 = khuVar.a(view.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((a > 0 || a == Integer.MIN_VALUE) && (a2 > 0 || a2 == Integer.MIN_VALUE)) {
            ((jlq) anqVar).c(a, a2);
            return;
        }
        if (!arrayList.contains(anqVar)) {
            arrayList.add(anqVar);
        }
        if (khuVar.c == null) {
            ViewTreeObserver viewTreeObserver = view.getViewTreeObserver();
            zx6 zx6Var = new zx6(khuVar);
            khuVar.c = zx6Var;
            viewTreeObserver.addOnPreDrawListener(zx6Var);
        }
    }

    @Override // defpackage.zyf
    public final void b() {
        Animatable animatable = this.c;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // defpackage.j6s
    public final void c(jlq jlqVar) {
        this.b.b.remove(jlqVar);
    }

    @Override // defpackage.j6s
    public void d(Object obj) {
        j(obj);
        if (!(obj instanceof Animatable)) {
            this.c = null;
            return;
        }
        Animatable animatable = (Animatable) obj;
        this.c = animatable;
        animatable.start();
    }

    @Override // defpackage.j6s
    public void e(Drawable drawable) {
        j(null);
        this.c = null;
        this.a.setImageDrawable(drawable);
    }

    @Override // defpackage.j6s
    public final e0o f() {
        Object tag = this.a.getTag(R.id.glide_custom_view_target_tag);
        if (tag != null) {
            if (tag instanceof e0o) {
                return (e0o) tag;
            }
            xq0.x("You must not call setTag() on a view Glide is targeting");
        }
        return null;
    }

    @Override // defpackage.j6s
    public void g(Drawable drawable) {
        khu khuVar = this.b;
        ViewTreeObserver viewTreeObserver = khuVar.a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(khuVar.c);
        }
        khuVar.c = null;
        khuVar.b.clear();
        Animatable animatable = this.c;
        if (animatable != null) {
            animatable.stop();
        }
        j(null);
        this.c = null;
        this.a.setImageDrawable(drawable);
    }

    @Override // defpackage.j6s
    public final void h(e0o e0oVar) {
        this.a.setTag(R.id.glide_custom_view_target_tag, e0oVar);
    }

    @Override // defpackage.j6s
    public void i(Drawable drawable) {
        j(null);
        this.c = null;
        this.a.setImageDrawable(drawable);
    }

    public final void j(Object obj) {
        switch (this.d) {
            case 0:
                this.a.setImageBitmap((Bitmap) obj);
                break;
            default:
                this.a.setImageDrawable((Drawable) obj);
                break;
        }
    }

    @Override // defpackage.zyf
    public final void onStop() {
        Animatable animatable = this.c;
        if (animatable != null) {
            animatable.stop();
        }
    }

    public final String toString() {
        return "Target for: " + this.a;
    }

    @Override // defpackage.zyf
    public final void onDestroy() {
    }
}
