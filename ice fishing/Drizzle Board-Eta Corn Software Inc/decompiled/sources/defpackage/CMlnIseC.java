package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class CMlnIseC extends ImageView {
    public final rpbmbhyp MdtA4re8;
    public final VM67d7Sv NCTxEWno;
    public boolean wxUZMvaN;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CMlnIseC(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        qc0.qoPGr6Ce(context);
        this.wxUZMvaN = false;
        ic0.qoPGr6Ce(this, getContext());
        VM67d7Sv vM67d7Sv = new VM67d7Sv(this);
        this.NCTxEWno = vM67d7Sv;
        vM67d7Sv.eVhOlqcC(attributeSet, i);
        rpbmbhyp rpbmbhypVar = new rpbmbhyp(this);
        this.MdtA4re8 = rpbmbhypVar;
        rpbmbhypVar.wxUZMvaN(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        VM67d7Sv vM67d7Sv = this.NCTxEWno;
        if (vM67d7Sv != null) {
            vM67d7Sv.qoPGr6Ce();
        }
        rpbmbhyp rpbmbhypVar = this.MdtA4re8;
        if (rpbmbhypVar != null) {
            rpbmbhypVar.qoPGr6Ce();
        }
    }

    public ColorStateList getSupportBackgroundTintList() {
        VM67d7Sv vM67d7Sv = this.NCTxEWno;
        if (vM67d7Sv != null) {
            return vM67d7Sv.Qr9iLBAD();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        VM67d7Sv vM67d7Sv = this.NCTxEWno;
        if (vM67d7Sv != null) {
            return vM67d7Sv.jb9XjC4I();
        }
        return null;
    }

    public ColorStateList getSupportImageTintList() {
        rc0 rc0Var;
        rpbmbhyp rpbmbhypVar = this.MdtA4re8;
        if (rpbmbhypVar == null || (rc0Var = (rc0) rpbmbhypVar.MdtA4re8) == null) {
            return null;
        }
        return rc0Var.qoPGr6Ce;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        rc0 rc0Var;
        rpbmbhyp rpbmbhypVar = this.MdtA4re8;
        if (rpbmbhypVar == null || (rc0Var = (rc0) rpbmbhypVar.MdtA4re8) == null) {
            return null;
        }
        return rc0Var.NCTxEWno;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        return !(((ImageView) this.MdtA4re8.NCTxEWno).getBackground() instanceof RippleDrawable) && super.hasOverlappingRendering();
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        VM67d7Sv vM67d7Sv = this.NCTxEWno;
        if (vM67d7Sv != null) {
            vM67d7Sv.ow5vqvCr();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        VM67d7Sv vM67d7Sv = this.NCTxEWno;
        if (vM67d7Sv != null) {
            vM67d7Sv.OnDfzHZD(i);
        }
    }

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        rpbmbhyp rpbmbhypVar = this.MdtA4re8;
        if (rpbmbhypVar != null) {
            rpbmbhypVar.qoPGr6Ce();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        rpbmbhyp rpbmbhypVar = this.MdtA4re8;
        if (rpbmbhypVar != null && drawable != null && !this.wxUZMvaN) {
            rpbmbhypVar.qoPGr6Ce = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (rpbmbhypVar != null) {
            rpbmbhypVar.qoPGr6Ce();
            if (this.wxUZMvaN) {
                return;
            }
            ImageView imageView = (ImageView) rpbmbhypVar.NCTxEWno;
            if (imageView.getDrawable() != null) {
                imageView.getDrawable().setLevel(rpbmbhypVar.qoPGr6Ce);
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.wxUZMvaN = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        rpbmbhyp rpbmbhypVar = this.MdtA4re8;
        if (rpbmbhypVar != null) {
            ImageView imageView = (ImageView) rpbmbhypVar.NCTxEWno;
            if (i != 0) {
                Drawable Ey6iv0m0 = ra.Ey6iv0m0(imageView.getContext(), i);
                if (Ey6iv0m0 != null) {
                    ud.qoPGr6Ce(Ey6iv0m0);
                }
                imageView.setImageDrawable(Ey6iv0m0);
            } else {
                imageView.setImageDrawable(null);
            }
            rpbmbhypVar.qoPGr6Ce();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        rpbmbhyp rpbmbhypVar = this.MdtA4re8;
        if (rpbmbhypVar != null) {
            rpbmbhypVar.qoPGr6Ce();
        }
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        VM67d7Sv vM67d7Sv = this.NCTxEWno;
        if (vM67d7Sv != null) {
            vM67d7Sv.amk52bBQ(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        VM67d7Sv vM67d7Sv = this.NCTxEWno;
        if (vM67d7Sv != null) {
            vM67d7Sv.KlHjfFWx(mode);
        }
    }

    public void setSupportImageTintList(ColorStateList colorStateList) {
        rpbmbhyp rpbmbhypVar = this.MdtA4re8;
        if (rpbmbhypVar != null) {
            rc0 rc0Var = (rc0) rpbmbhypVar.MdtA4re8;
            if (rc0Var == null) {
                rc0Var = new rc0();
                rpbmbhypVar.MdtA4re8 = rc0Var;
            }
            rc0Var.qoPGr6Ce = colorStateList;
            rc0Var.wxUZMvaN = true;
            rpbmbhypVar.qoPGr6Ce();
        }
    }

    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        rpbmbhyp rpbmbhypVar = this.MdtA4re8;
        if (rpbmbhypVar != null) {
            rc0 rc0Var = (rc0) rpbmbhypVar.MdtA4re8;
            if (rc0Var == null) {
                rc0Var = new rc0();
                rpbmbhypVar.MdtA4re8 = rc0Var;
            }
            rc0Var.NCTxEWno = mode;
            rc0Var.MdtA4re8 = true;
            rpbmbhypVar.qoPGr6Ce();
        }
    }
}
