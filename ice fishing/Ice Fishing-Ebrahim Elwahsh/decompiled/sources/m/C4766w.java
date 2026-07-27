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
import com.google.android.gms.internal.ads.C2728Pl;

/* renamed from: m.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C4766w extends ImageButton {

    /* renamed from: n, reason: collision with root package name */
    public final C2728Pl f39529n;

    /* renamed from: u, reason: collision with root package name */
    public final F.d f39530u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f39531v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4766w(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        O0.a(context);
        this.f39531v = false;
        N0.a(getContext(), this);
        C2728Pl c2728Pl = new C2728Pl(this);
        this.f39529n = c2728Pl;
        c2728Pl.d(attributeSet, i);
        F.d dVar = new F.d(this);
        this.f39530u = dVar;
        dVar.h(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C2728Pl c2728Pl = this.f39529n;
        if (c2728Pl != null) {
            c2728Pl.a();
        }
        F.d dVar = this.f39530u;
        if (dVar != null) {
            dVar.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        C2728Pl c2728Pl = this.f39529n;
        if (c2728Pl != null) {
            return c2728Pl.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        C2728Pl c2728Pl = this.f39529n;
        if (c2728Pl != null) {
            return c2728Pl.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        e8.h hVar;
        F.d dVar = this.f39530u;
        if (dVar == null || (hVar = (e8.h) dVar.f910d) == null) {
            return null;
        }
        return (ColorStateList) hVar.f37401c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        e8.h hVar;
        F.d dVar = this.f39530u;
        if (dVar == null || (hVar = (e8.h) dVar.f910d) == null) {
            return null;
        }
        return (PorterDuff.Mode) hVar.f37402d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f39530u.f909c).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C2728Pl c2728Pl = this.f39529n;
        if (c2728Pl != null) {
            c2728Pl.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        C2728Pl c2728Pl = this.f39529n;
        if (c2728Pl != null) {
            c2728Pl.f(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        F.d dVar = this.f39530u;
        if (dVar != null) {
            dVar.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        F.d dVar = this.f39530u;
        if (dVar != null && drawable != null && !this.f39531v) {
            dVar.f908b = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (dVar != null) {
            dVar.a();
            if (this.f39531v) {
                return;
            }
            ImageView imageView = (ImageView) dVar.f909c;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(dVar.f908b);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.f39531v = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        F.d dVar = this.f39530u;
        ImageView imageView = (ImageView) dVar.f909c;
        if (i != 0) {
            Drawable h9 = com.bumptech.glide.f.h(imageView.getContext(), i);
            if (h9 != null) {
                AbstractC4742j0.a(h9);
            }
            imageView.setImageDrawable(h9);
        } else {
            imageView.setImageDrawable(null);
        }
        dVar.a();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        F.d dVar = this.f39530u;
        if (dVar != null) {
            dVar.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C2728Pl c2728Pl = this.f39529n;
        if (c2728Pl != null) {
            c2728Pl.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C2728Pl c2728Pl = this.f39529n;
        if (c2728Pl != null) {
            c2728Pl.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        F.d dVar = this.f39530u;
        if (dVar != null) {
            if (((e8.h) dVar.f910d) == null) {
                dVar.f910d = new e8.h();
            }
            e8.h hVar = (e8.h) dVar.f910d;
            hVar.f37401c = colorStateList;
            hVar.f37400b = true;
            dVar.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        F.d dVar = this.f39530u;
        if (dVar != null) {
            if (((e8.h) dVar.f910d) == null) {
                dVar.f910d = new e8.h();
            }
            e8.h hVar = (e8.h) dVar.f910d;
            hVar.f37402d = mode;
            hVar.f37399a = true;
            dVar.a();
        }
    }
}
