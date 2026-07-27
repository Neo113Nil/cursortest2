package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.google.android.gms.internal.ads.C2712Ol;

/* renamed from: m.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4718w extends ImageButton {

    /* renamed from: n, reason: collision with root package name */
    public final C2712Ol f39258n;

    /* renamed from: u, reason: collision with root package name */
    public final F.d f39259u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f39260v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4718w(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        O0.a(context);
        this.f39260v = false;
        N0.a(getContext(), this);
        C2712Ol c2712Ol = new C2712Ol(this);
        this.f39258n = c2712Ol;
        c2712Ol.d(attributeSet, i);
        F.d dVar = new F.d(this);
        this.f39259u = dVar;
        dVar.h(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C2712Ol c2712Ol = this.f39258n;
        if (c2712Ol != null) {
            c2712Ol.a();
        }
        F.d dVar = this.f39259u;
        if (dVar != null) {
            dVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2712Ol c2712Ol = this.f39258n;
        if (c2712Ol != null) {
            return c2712Ol.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2712Ol c2712Ol = this.f39258n;
        if (c2712Ol != null) {
            return c2712Ol.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        i8.h hVar;
        F.d dVar = this.f39259u;
        if (dVar == null || (hVar = (i8.h) dVar.f856d) == null) {
            return null;
        }
        return (ColorStateList) hVar.f38124c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        i8.h hVar;
        F.d dVar = this.f39259u;
        if (dVar == null || (hVar = (i8.h) dVar.f856d) == null) {
            return null;
        }
        return (PorterDuff.Mode) hVar.f38125d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f39259u.f855c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2712Ol c2712Ol = this.f39258n;
        if (c2712Ol != null) {
            c2712Ol.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C2712Ol c2712Ol = this.f39258n;
        if (c2712Ol != null) {
            c2712Ol.f(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        F.d dVar = this.f39259u;
        if (dVar != null) {
            dVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        F.d dVar = this.f39259u;
        if (dVar != null && drawable != null && !this.f39260v) {
            dVar.f854b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (dVar != null) {
            dVar.a();
            if (this.f39260v) {
                return;
            }
            ImageView imageView = (ImageView) dVar.f855c;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(dVar.f854b);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f39260v = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        F.d dVar = this.f39259u;
        ImageView imageView = (ImageView) dVar.f855c;
        if (i != 0) {
            Drawable e9 = com.bumptech.glide.g.e(imageView.getContext(), i);
            if (e9 != null) {
                AbstractC4694j0.a(e9);
            }
            imageView.setImageDrawable(e9);
        } else {
            imageView.setImageDrawable(null);
        }
        dVar.a();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        F.d dVar = this.f39259u;
        if (dVar != null) {
            dVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2712Ol c2712Ol = this.f39258n;
        if (c2712Ol != null) {
            c2712Ol.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2712Ol c2712Ol = this.f39258n;
        if (c2712Ol != null) {
            c2712Ol.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        F.d dVar = this.f39259u;
        if (dVar != null) {
            if (((i8.h) dVar.f856d) == null) {
                dVar.f856d = new i8.h();
            }
            i8.h hVar = (i8.h) dVar.f856d;
            hVar.f38124c = colorStateList;
            hVar.f38123b = true;
            dVar.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        F.d dVar = this.f39259u;
        if (dVar != null) {
            if (((i8.h) dVar.f856d) == null) {
                dVar.f856d = new i8.h();
            }
            i8.h hVar = (i8.h) dVar.f856d;
            hVar.f38125d = mode;
            hVar.f38122a = true;
            dVar.a();
        }
    }
}
