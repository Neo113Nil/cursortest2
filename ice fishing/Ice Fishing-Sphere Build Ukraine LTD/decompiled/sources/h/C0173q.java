package h;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.widget.ImageView;
import d.AbstractC0110a;

/* renamed from: h.q, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0173q extends ImageView {

    /* renamed from: e, reason: collision with root package name */
    public final C0170n f2250e;

    /* renamed from: f, reason: collision with root package name */
    public final L.Q f2251f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0173q(Context context, int i2) {
        super(context, null, i2);
        i0.a(context);
        C0170n c0170n = new C0170n(this);
        this.f2250e = c0170n;
        c0170n.b(null, i2);
        L.Q q2 = new L.Q(this);
        this.f2251f = q2;
        q2.r(i2);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0170n c0170n = this.f2250e;
        if (c0170n != null) {
            c0170n.a();
        }
        L.Q q2 = this.f2251f;
        if (q2 != null) {
            q2.n();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        j0 j0Var;
        C0170n c0170n = this.f2250e;
        if (c0170n == null || (j0Var = c0170n.f2239e) == null) {
            return null;
        }
        return j0Var.f2217a;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        j0 j0Var;
        C0170n c0170n = this.f2250e;
        if (c0170n == null || (j0Var = c0170n.f2239e) == null) {
            return null;
        }
        return j0Var.f2218b;
    }

    public ColorStateList getSupportImageTintList() {
        j0 j0Var;
        L.Q q2 = this.f2251f;
        if (q2 == null || (j0Var = (j0) q2.f520g) == null) {
            return null;
        }
        return j0Var.f2217a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        j0 j0Var;
        L.Q q2 = this.f2251f;
        if (q2 == null || (j0Var = (j0) q2.f520g) == null) {
            return null;
        }
        return j0Var.f2218b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f2251f.f519f).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0170n c0170n = this.f2250e;
        if (c0170n != null) {
            c0170n.f2237c = -1;
            c0170n.d(null);
            c0170n.a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0170n c0170n = this.f2250e;
        if (c0170n != null) {
            c0170n.c(i2);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        L.Q q2 = this.f2251f;
        if (q2 != null) {
            q2.n();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        L.Q q2 = this.f2251f;
        if (q2 != null) {
            q2.n();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i2) {
        L.Q q2 = this.f2251f;
        if (q2 != null) {
            ImageView imageView = (ImageView) q2.f519f;
            if (i2 != 0) {
                Drawable a2 = AbstractC0110a.a(imageView.getContext(), i2);
                if (a2 != null) {
                    Rect rect = AbstractC0180y.f2319a;
                }
                imageView.setImageDrawable(a2);
            } else {
                imageView.setImageDrawable(null);
            }
            q2.n();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        L.Q q2 = this.f2251f;
        if (q2 != null) {
            q2.n();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0170n c0170n = this.f2250e;
        if (c0170n != null) {
            c0170n.e(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0170n c0170n = this.f2250e;
        if (c0170n != null) {
            c0170n.f(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        L.Q q2 = this.f2251f;
        if (q2 != null) {
            if (((j0) q2.f520g) == null) {
                q2.f520g = new j0();
            }
            j0 j0Var = (j0) q2.f520g;
            j0Var.f2217a = colorStateList;
            j0Var.f2220d = true;
            q2.n();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        L.Q q2 = this.f2251f;
        if (q2 != null) {
            if (((j0) q2.f520g) == null) {
                q2.f520g = new j0();
            }
            j0 j0Var = (j0) q2.f520g;
            j0Var.f2218b = mode;
            j0Var.f2219c = true;
            q2.n();
        }
    }
}
