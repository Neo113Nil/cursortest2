package M1;

import L1.f;
import P1.g;
import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import com.IceFishing.LiveIceFishing.C5248R;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class a implements c {

    /* renamed from: n, reason: collision with root package name */
    public final ImageView f1854n;

    /* renamed from: u, reason: collision with root package name */
    public final d f1855u;

    /* renamed from: v, reason: collision with root package name */
    public Animatable f1856v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ int f1857w;

    public a(ImageView imageView, int i) {
        this.f1857w = i;
        g.c(imageView, "Argument must not be null");
        this.f1854n = imageView;
        this.f1855u = new d(imageView);
    }

    @Override // M1.c
    public final void a(f fVar) {
        this.f1855u.f1860b.remove(fVar);
    }

    @Override // M1.c
    public final void b(Object obj) {
        i(obj);
        if (!(obj instanceof Animatable)) {
            this.f1856v = null;
            return;
        }
        Animatable animatable = (Animatable) obj;
        this.f1856v = animatable;
        animatable.start();
    }

    @Override // M1.c
    public final void c(L1.c cVar) {
        this.f1854n.setTag(C5248R.id.glide_custom_view_target_tag, cVar);
    }

    @Override // M1.c
    public final void d(Drawable drawable) {
        i(null);
        this.f1856v = null;
        this.f1854n.setImageDrawable(drawable);
    }

    @Override // M1.c
    public final void e(f fVar) {
        d dVar = this.f1855u;
        ImageView imageView = dVar.f1859a;
        int paddingRight = imageView.getPaddingRight() + imageView.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = imageView.getLayoutParams();
        int a9 = dVar.a(imageView.getWidth(), layoutParams != null ? layoutParams.width : 0, paddingRight);
        ImageView imageView2 = dVar.f1859a;
        int paddingBottom = imageView2.getPaddingBottom() + imageView2.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = imageView2.getLayoutParams();
        int a10 = dVar.a(imageView2.getHeight(), layoutParams2 != null ? layoutParams2.height : 0, paddingBottom);
        if ((a9 > 0 || a9 == Integer.MIN_VALUE) && (a10 > 0 || a10 == Integer.MIN_VALUE)) {
            fVar.l(a9, a10);
            return;
        }
        ArrayList arrayList = dVar.f1860b;
        if (!arrayList.contains(fVar)) {
            arrayList.add(fVar);
        }
        if (dVar.f1861c == null) {
            ViewTreeObserver viewTreeObserver = imageView2.getViewTreeObserver();
            B.f fVar2 = new B.f(dVar);
            dVar.f1861c = fVar2;
            viewTreeObserver.addOnPreDrawListener(fVar2);
        }
    }

    @Override // M1.c
    public final void f(Drawable drawable) {
        i(null);
        this.f1856v = null;
        this.f1854n.setImageDrawable(drawable);
    }

    @Override // M1.c
    public final L1.c g() {
        Object tag = this.f1854n.getTag(C5248R.id.glide_custom_view_target_tag);
        if (tag == null) {
            return null;
        }
        if (tag instanceof L1.c) {
            return (L1.c) tag;
        }
        throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
    }

    @Override // M1.c
    public final void h(Drawable drawable) {
        d dVar = this.f1855u;
        ViewTreeObserver viewTreeObserver = dVar.f1859a.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(dVar.f1861c);
        }
        dVar.f1861c = null;
        dVar.f1860b.clear();
        Animatable animatable = this.f1856v;
        if (animatable != null) {
            animatable.stop();
        }
        i(null);
        this.f1856v = null;
        this.f1854n.setImageDrawable(drawable);
    }

    public final void i(Object obj) {
        switch (this.f1857w) {
            case 0:
                this.f1854n.setImageBitmap((Bitmap) obj);
                break;
            default:
                this.f1854n.setImageDrawable((Drawable) obj);
                break;
        }
    }

    @Override // com.bumptech.glide.manager.h
    public final void onStart() {
        Animatable animatable = this.f1856v;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // com.bumptech.glide.manager.h
    public final void onStop() {
        Animatable animatable = this.f1856v;
        if (animatable != null) {
            animatable.stop();
        }
    }

    public final String toString() {
        return "Target for: " + this.f1854n;
    }

    @Override // com.bumptech.glide.manager.h
    public final void onDestroy() {
    }
}
