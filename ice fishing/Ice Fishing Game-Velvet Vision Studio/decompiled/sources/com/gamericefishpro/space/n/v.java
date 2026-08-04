package com.gamericefishpro.space.n;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.widget.ImageView;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public class v extends ImageView {
    public final com.gamericefishpro.space.h2.w1 d;
    public final com.gamericefishpro.space.f1.z e;
    public boolean i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(Context context, int i) {
        super(context, null, i);
        v1.a(context);
        this.i = false;
        u1.a(this, getContext());
        com.gamericefishpro.space.h2.w1 w1Var = new com.gamericefishpro.space.h2.w1(this);
        this.d = w1Var;
        w1Var.d(null, i);
        com.gamericefishpro.space.f1.z zVar = new com.gamericefishpro.space.f1.z(this);
        this.e = zVar;
        zVar.h(null, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        com.gamericefishpro.space.h2.w1 w1Var = this.d;
        if (w1Var != null) {
            w1Var.a();
        }
        com.gamericefishpro.space.f1.z zVar = this.e;
        if (zVar != null) {
            zVar.b();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        com.gamericefishpro.space.h2.w1 w1Var = this.d;
        if (w1Var != null) {
            return w1Var.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        com.gamericefishpro.space.h2.w1 w1Var = this.d;
        if (w1Var != null) {
            return w1Var.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        w1 w1Var;
        com.gamericefishpro.space.f1.z zVar = this.e;
        if (zVar == null || (w1Var = (w1) zVar.c) == null) {
            return null;
        }
        return w1Var.a;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        w1 w1Var;
        com.gamericefishpro.space.f1.z zVar = this.e;
        if (zVar == null || (w1Var = (w1) zVar.c) == null) {
            return null;
        }
        return w1Var.b;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.e.b).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        com.gamericefishpro.space.h2.w1 w1Var = this.d;
        if (w1Var != null) {
            w1Var.f();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        com.gamericefishpro.space.h2.w1 w1Var = this.d;
        if (w1Var != null) {
            w1Var.g(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        com.gamericefishpro.space.f1.z zVar = this.e;
        if (zVar != null) {
            zVar.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        com.gamericefishpro.space.f1.z zVar = this.e;
        if (zVar != null && drawable != null && !this.i) {
            zVar.a = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (zVar != null) {
            zVar.b();
            if (this.i) {
                return;
            }
            ImageView imageView = (ImageView) zVar.b;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(zVar.a);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.i = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        com.gamericefishpro.space.f1.z zVar = this.e;
        if (zVar != null) {
            ImageView imageView = (ImageView) zVar.b;
            if (i != 0) {
                Drawable drawableX = com.gamericefishpro.space.u6.f.x(imageView.getContext(), i);
                if (drawableX != null) {
                    q0.a(drawableX);
                }
                imageView.setImageDrawable(drawableX);
            } else {
                imageView.setImageDrawable(null);
            }
            zVar.b();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        com.gamericefishpro.space.f1.z zVar = this.e;
        if (zVar != null) {
            zVar.b();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        com.gamericefishpro.space.h2.w1 w1Var = this.d;
        if (w1Var != null) {
            w1Var.i(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        com.gamericefishpro.space.h2.w1 w1Var = this.d;
        if (w1Var != null) {
            w1Var.j(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        com.gamericefishpro.space.f1.z zVar = this.e;
        if (zVar != null) {
            if (((w1) zVar.c) == null) {
                zVar.c = new w1();
            }
            w1 w1Var = (w1) zVar.c;
            w1Var.a = colorStateList;
            w1Var.d = true;
            zVar.b();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        com.gamericefishpro.space.f1.z zVar = this.e;
        if (zVar != null) {
            if (((w1) zVar.c) == null) {
                zVar.c = new w1();
            }
            w1 w1Var = (w1) zVar.c;
            w1Var.b = mode;
            w1Var.c = true;
            zVar.b();
        }
    }
}
