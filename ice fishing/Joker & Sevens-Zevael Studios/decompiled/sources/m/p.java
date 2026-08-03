package m;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.widget.ImageButton;
import android.widget.ImageView;
import org.fortheloss.st.R;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class p extends ImageButton {

    /* renamed from: g, reason: collision with root package name */
    public final n f4423g;

    /* renamed from: h, reason: collision with root package name */
    public final x4.s f4424h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(Context context) {
        super(context, null, R.attr.toolbarNavigationButtonStyle);
        k1.a(context);
        j1.a(this, getContext());
        n nVar = new n(this);
        this.f4423g = nVar;
        nVar.b(null, R.attr.toolbarNavigationButtonStyle);
        x4.s sVar = new x4.s((ImageView) this);
        this.f4424h = sVar;
        sVar.f(R.attr.toolbarNavigationButtonStyle);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        n nVar = this.f4423g;
        if (nVar != null) {
            nVar.a();
        }
        x4.s sVar = this.f4424h;
        if (sVar != null) {
            sVar.d();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        l1 l1Var;
        n nVar = this.f4423g;
        if (nVar == null || (l1Var = (l1) nVar.f4392e) == null) {
            return null;
        }
        return l1Var.f4380a;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        l1 l1Var;
        n nVar = this.f4423g;
        if (nVar == null || (l1Var = (l1) nVar.f4392e) == null) {
            return null;
        }
        return l1Var.f4381b;
    }

    public ColorStateList getSupportImageTintList() {
        l1 l1Var;
        x4.s sVar = this.f4424h;
        if (sVar == null || (l1Var = (l1) sVar.f8357i) == null) {
            return null;
        }
        return l1Var.f4380a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        l1 l1Var;
        x4.s sVar = this.f4424h;
        if (sVar == null || (l1Var = (l1) sVar.f8357i) == null) {
            return null;
        }
        return l1Var.f4381b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.f4424h.f8356h).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        n nVar = this.f4423g;
        if (nVar != null) {
            nVar.f4388a = -1;
            nVar.d(null);
            nVar.a();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
        super.setBackgroundResource(i10);
        n nVar = this.f4423g;
        if (nVar != null) {
            nVar.c(i10);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        x4.s sVar = this.f4424h;
        if (sVar != null) {
            sVar.d();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        super.setImageDrawable(drawable);
        x4.s sVar = this.f4424h;
        if (sVar != null) {
            sVar.d();
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i10) {
        x4.s sVar = this.f4424h;
        ImageView imageView = (ImageView) sVar.f8356h;
        if (i10 != 0) {
            Drawable a6 = j.a.a(imageView.getContext(), i10);
            if (a6 != null) {
                int i11 = c0.f4278a;
            }
            imageView.setImageDrawable(a6);
        } else {
            imageView.setImageDrawable(null);
        }
        sVar.d();
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        x4.s sVar = this.f4424h;
        if (sVar != null) {
            sVar.d();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        n nVar = this.f4423g;
        if (nVar != null) {
            nVar.e(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        n nVar = this.f4423g;
        if (nVar != null) {
            nVar.f(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        x4.s sVar = this.f4424h;
        if (sVar != null) {
            if (((l1) sVar.f8357i) == null) {
                sVar.f8357i = new l1();
            }
            l1 l1Var = (l1) sVar.f8357i;
            l1Var.f4380a = colorStateList;
            l1Var.f4383d = true;
            sVar.d();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        x4.s sVar = this.f4424h;
        if (sVar != null) {
            if (((l1) sVar.f8357i) == null) {
                sVar.f8357i = new l1();
            }
            l1 l1Var = (l1) sVar.f8357i;
            l1Var.f4381b = mode;
            l1Var.f4382c = true;
            sVar.d();
        }
    }
}
