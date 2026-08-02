package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import defpackage.gfs;
import defpackage.jq0;
import defpackage.kj3;
import defpackage.mr0;
import defpackage.sjs;

/* loaded from: classes.dex */
public class AppCompatImageView extends ImageView {
    private final jq0 mBackgroundTintHelper;
    private boolean mHasLevel;
    private final mr0 mImageHelper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatImageView(@NonNull Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        sjs.a(context);
        this.mHasLevel = false;
        gfs.a(getContext(), this);
        jq0 jq0Var = new jq0(this);
        this.mBackgroundTintHelper = jq0Var;
        jq0Var.d(attributeSet, i);
        mr0 mr0Var = new mr0(this);
        this.mImageHelper = mr0Var;
        mr0Var.b(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        jq0 jq0Var = this.mBackgroundTintHelper;
        if (jq0Var != null) {
            jq0Var.a();
        }
        mr0 mr0Var = this.mImageHelper;
        if (mr0Var != null) {
            mr0Var.a();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        jq0 jq0Var = this.mBackgroundTintHelper;
        if (jq0Var != null) {
            return jq0Var.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        jq0 jq0Var = this.mBackgroundTintHelper;
        if (jq0Var != null) {
            return jq0Var.c();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        kj3 kj3Var;
        mr0 mr0Var = this.mImageHelper;
        if (mr0Var == null || (kj3Var = mr0Var.b) == null) {
            return null;
        }
        return (ColorStateList) kj3Var.d;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        kj3 kj3Var;
        mr0 mr0Var = this.mImageHelper;
        if (mr0Var == null || (kj3Var = mr0Var.b) == null) {
            return null;
        }
        return (PorterDuff.Mode) kj3Var.e;
    }

    @Override // android.widget.ImageView, android.view.View
    public boolean hasOverlappingRendering() {
        return !(this.mImageHelper.a.getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        jq0 jq0Var = this.mBackgroundTintHelper;
        if (jq0Var != null) {
            jq0Var.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        jq0 jq0Var = this.mBackgroundTintHelper;
        if (jq0Var != null) {
            jq0Var.f(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        mr0 mr0Var = this.mImageHelper;
        if (mr0Var != null) {
            mr0Var.a();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        mr0 mr0Var = this.mImageHelper;
        if (mr0Var != null && drawable != null && !this.mHasLevel) {
            mr0Var.c = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        mr0 mr0Var2 = this.mImageHelper;
        if (mr0Var2 != null) {
            mr0Var2.a();
            if (this.mHasLevel) {
                return;
            }
            mr0 mr0Var3 = this.mImageHelper;
            ImageView imageView = mr0Var3.a;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(mr0Var3.c);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.mHasLevel = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        mr0 mr0Var = this.mImageHelper;
        if (mr0Var != null) {
            mr0Var.c(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        mr0 mr0Var = this.mImageHelper;
        if (mr0Var != null) {
            mr0Var.a();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        jq0 jq0Var = this.mBackgroundTintHelper;
        if (jq0Var != null) {
            jq0Var.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        jq0 jq0Var = this.mBackgroundTintHelper;
        if (jq0Var != null) {
            jq0Var.i(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        mr0 mr0Var = this.mImageHelper;
        if (mr0Var != null) {
            if (mr0Var.b == null) {
                mr0Var.b = new kj3();
            }
            kj3 kj3Var = mr0Var.b;
            kj3Var.d = colorStateList;
            kj3Var.c = true;
            mr0Var.a();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        mr0 mr0Var = this.mImageHelper;
        if (mr0Var != null) {
            if (mr0Var.b == null) {
                mr0Var.b = new kj3();
            }
            kj3 kj3Var = mr0Var.b;
            kj3Var.e = mode;
            kj3Var.b = true;
            mr0Var.a();
        }
    }

    public AppCompatImageView(@NonNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public AppCompatImageView(@NonNull Context context) {
        this(context, null);
    }
}
