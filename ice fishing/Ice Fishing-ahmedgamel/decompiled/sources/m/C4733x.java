package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import com.google.android.gms.internal.ads.C2749Pl;

/* renamed from: m.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4733x extends ImageView {

    /* renamed from: n, reason: collision with root package name */
    public final C2749Pl f39330n;

    /* renamed from: u, reason: collision with root package name */
    public final F.d f39331u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f39332v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4733x(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        O0.a(context);
        this.f39332v = false;
        N0.a(getContext(), this);
        C2749Pl c2749Pl = new C2749Pl(this);
        this.f39330n = c2749Pl;
        c2749Pl.d(attributeSet, i);
        F.d dVar = new F.d(this);
        this.f39331u = dVar;
        dVar.h(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C2749Pl c2749Pl = this.f39330n;
        if (c2749Pl != null) {
            c2749Pl.a();
        }
        F.d dVar = this.f39331u;
        if (dVar != null) {
            dVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2749Pl c2749Pl = this.f39330n;
        if (c2749Pl != null) {
            return c2749Pl.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2749Pl c2749Pl = this.f39330n;
        if (c2749Pl != null) {
            return c2749Pl.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        i8.h hVar;
        F.d dVar = this.f39331u;
        if (dVar == null || (hVar = (i8.h) dVar.f919d) == null) {
            return null;
        }
        return (ColorStateList) hVar.f38243c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        i8.h hVar;
        F.d dVar = this.f39331u;
        if (dVar == null || (hVar = (i8.h) dVar.f919d) == null) {
            return null;
        }
        return (PorterDuff.Mode) hVar.f38244d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f39331u.f918c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2749Pl c2749Pl = this.f39330n;
        if (c2749Pl != null) {
            c2749Pl.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C2749Pl c2749Pl = this.f39330n;
        if (c2749Pl != null) {
            c2749Pl.f(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        F.d dVar = this.f39331u;
        if (dVar != null) {
            dVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        F.d dVar = this.f39331u;
        if (dVar != null && drawable != null && !this.f39332v) {
            dVar.f917b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (dVar != null) {
            dVar.a();
            if (this.f39332v) {
                return;
            }
            ImageView imageView = (ImageView) dVar.f918c;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(dVar.f917b);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f39332v = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        F.d dVar = this.f39331u;
        if (dVar != null) {
            ImageView imageView = (ImageView) dVar.f918c;
            if (i != 0) {
                Drawable h3 = com.bumptech.glide.g.h(imageView.getContext(), i);
                if (h3 != null) {
                    AbstractC4707j0.a(h3);
                }
                imageView.setImageDrawable(h3);
            } else {
                imageView.setImageDrawable(null);
            }
            dVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        F.d dVar = this.f39331u;
        if (dVar != null) {
            dVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2749Pl c2749Pl = this.f39330n;
        if (c2749Pl != null) {
            c2749Pl.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2749Pl c2749Pl = this.f39330n;
        if (c2749Pl != null) {
            c2749Pl.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        F.d dVar = this.f39331u;
        if (dVar != null) {
            if (((i8.h) dVar.f919d) == null) {
                dVar.f919d = new i8.h();
            }
            i8.h hVar = (i8.h) dVar.f919d;
            hVar.f38243c = colorStateList;
            hVar.f38242b = true;
            dVar.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        F.d dVar = this.f39331u;
        if (dVar != null) {
            if (((i8.h) dVar.f919d) == null) {
                dVar.f919d = new i8.h();
            }
            i8.h hVar = (i8.h) dVar.f919d;
            hVar.f38244d = mode;
            hVar.f38241a = true;
            dVar.a();
        }
    }
}
