package h;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.widget.ImageButton;
import android.widget.ImageView;
import com.watchfacestudio.spraktum.R;
import d.AbstractC0142a;

/* renamed from: h.p, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0220p extends ImageButton {

    /* renamed from: a, reason: collision with root package name */
    public final C0218n f3315a;

    /* renamed from: b, reason: collision with root package name */
    public final x0.e f3316b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0220p(Context context) {
        super(context, null, R.attr.toolbarNavigationButtonStyle);
        g0.a(context);
        C0218n c0218n = new C0218n(this);
        this.f3315a = c0218n;
        c0218n.b(null, R.attr.toolbarNavigationButtonStyle);
        x0.e eVar = new x0.e(this);
        this.f3316b = eVar;
        eVar.s(R.attr.toolbarNavigationButtonStyle);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        C0218n c0218n = this.f3315a;
        if (c0218n != null) {
            c0218n.a();
        }
        x0.e eVar = this.f3316b;
        if (eVar != null) {
            eVar.m();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        J1.h hVar;
        C0218n c0218n = this.f3315a;
        if (c0218n == null || (hVar = c0218n.f3295e) == null) {
            return null;
        }
        return (ColorStateList) hVar.f868c;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        J1.h hVar;
        C0218n c0218n = this.f3315a;
        if (c0218n == null || (hVar = c0218n.f3295e) == null) {
            return null;
        }
        return (PorterDuff.Mode) hVar.f869d;
    }

    public ColorStateList getSupportImageTintList() {
        J1.h hVar;
        x0.e eVar = this.f3316b;
        if (eVar == null || (hVar = (J1.h) eVar.f8531c) == null) {
            return null;
        }
        return (ColorStateList) hVar.f868c;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        J1.h hVar;
        x0.e eVar = this.f3316b;
        if (eVar == null || (hVar = (J1.h) eVar.f8531c) == null) {
            return null;
        }
        return (PorterDuff.Mode) hVar.f869d;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f3316b.f8530b).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        C0218n c0218n = this.f3315a;
        if (c0218n != null) {
            c0218n.f3293c = -1;
            c0218n.d(null);
            c0218n.a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i2) {
        super.setBackgroundResource(i2);
        C0218n c0218n = this.f3315a;
        if (c0218n != null) {
            c0218n.c(i2);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        x0.e eVar = this.f3316b;
        if (eVar != null) {
            eVar.m();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        x0.e eVar = this.f3316b;
        if (eVar != null) {
            eVar.m();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i2) {
        x0.e eVar = this.f3316b;
        ImageView imageView = (ImageView) eVar.f8530b;
        if (i2 != 0) {
            Drawable a2 = AbstractC0142a.a(imageView.getContext(), i2);
            if (a2 != null) {
                Rect rect = AbstractC0227x.f3368a;
            }
            imageView.setImageDrawable(a2);
        } else {
            imageView.setImageDrawable(null);
        }
        eVar.m();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        x0.e eVar = this.f3316b;
        if (eVar != null) {
            eVar.m();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        C0218n c0218n = this.f3315a;
        if (c0218n != null) {
            c0218n.e(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        C0218n c0218n = this.f3315a;
        if (c0218n != null) {
            c0218n.f(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        x0.e eVar = this.f3316b;
        if (eVar != null) {
            if (((J1.h) eVar.f8531c) == null) {
                eVar.f8531c = new J1.h();
            }
            J1.h hVar = (J1.h) eVar.f8531c;
            hVar.f868c = colorStateList;
            hVar.f867b = true;
            eVar.m();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        x0.e eVar = this.f3316b;
        if (eVar != null) {
            if (((J1.h) eVar.f8531c) == null) {
                eVar.f8531c = new J1.h();
            }
            J1.h hVar = (J1.h) eVar.f8531c;
            hVar.f869d = mode;
            hVar.f866a = true;
            eVar.m();
        }
    }
}
