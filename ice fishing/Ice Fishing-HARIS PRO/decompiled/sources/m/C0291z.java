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
import k0.C0188b;

/* renamed from: m.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0291z extends ImageView {

    /* renamed from: a, reason: collision with root package name */
    public final C0188b f4060a;

    /* renamed from: b, reason: collision with root package name */
    public final F.d f4061b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f4062c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0291z(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        R0.a(context);
        this.f4062c = false;
        Q0.a(this, getContext());
        C0188b c0188b = new C0188b(this);
        this.f4060a = c0188b;
        c0188b.k(attributeSet, i);
        F.d dVar = new F.d(this);
        this.f4061b = dVar;
        dVar.d(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0188b c0188b = this.f4060a;
        if (c0188b != null) {
            c0188b.a();
        }
        F.d dVar = this.f4061b;
        if (dVar != null) {
            dVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C0188b c0188b = this.f4060a;
        if (c0188b != null) {
            return c0188b.h();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C0188b c0188b = this.f4060a;
        if (c0188b != null) {
            return c0188b.i();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        S0 s0;
        F.d dVar = this.f4061b;
        if (dVar == null || (s0 = (S0) dVar.f196c) == null) {
            return null;
        }
        return s0.f3882a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        S0 s0;
        F.d dVar = this.f4061b;
        if (dVar == null || (s0 = (S0) dVar.f196c) == null) {
            return null;
        }
        return s0.f3883b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f4061b.f195b).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0188b c0188b = this.f4060a;
        if (c0188b != null) {
            c0188b.m();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C0188b c0188b = this.f4060a;
        if (c0188b != null) {
            c0188b.n(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        F.d dVar = this.f4061b;
        if (dVar != null) {
            dVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        F.d dVar = this.f4061b;
        if (dVar != null && drawable != null && !this.f4062c) {
            dVar.f194a = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (dVar != null) {
            dVar.a();
            if (this.f4062c) {
                return;
            }
            ImageView imageView = (ImageView) dVar.f195b;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(dVar.f194a);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f4062c = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        F.d dVar = this.f4061b;
        if (dVar != null) {
            ImageView imageView = (ImageView) dVar.f195b;
            if (i != 0) {
                Drawable n2 = h0.f.n(imageView.getContext(), i);
                if (n2 != null) {
                    AbstractC0265l0.a(n2);
                }
                imageView.setImageDrawable(n2);
            } else {
                imageView.setImageDrawable(null);
            }
            dVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        F.d dVar = this.f4061b;
        if (dVar != null) {
            dVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0188b c0188b = this.f4060a;
        if (c0188b != null) {
            c0188b.s(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0188b c0188b = this.f4060a;
        if (c0188b != null) {
            c0188b.t(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        F.d dVar = this.f4061b;
        if (dVar != null) {
            if (((S0) dVar.f196c) == null) {
                dVar.f196c = new S0();
            }
            S0 s0 = (S0) dVar.f196c;
            s0.f3882a = colorStateList;
            s0.f3885d = true;
            dVar.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        F.d dVar = this.f4061b;
        if (dVar != null) {
            if (((S0) dVar.f196c) == null) {
                dVar.f196c = new S0();
            }
            S0 s0 = (S0) dVar.f196c;
            s0.f3883b = mode;
            s0.f3884c = true;
            dVar.a();
        }
    }
}
