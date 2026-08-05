package defpackage;

import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import androidx.appcompat.widget.Toolbar;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class dd0 implements sa {
    public View MdtA4re8;
    public int NCTxEWno;
    public CTE3lpUp OnDfzHZD;
    public Drawable P7K7Inc8;
    public CharSequence Qr9iLBAD;
    public Drawable VgvYg0wo;
    public boolean b2ZJblxo;
    public CharSequence eVhOlqcC;
    public CharSequence jb9XjC4I;
    public Window.Callback k3x7lurq;
    public Drawable lDXGDhIF;
    public boolean ow5vqvCr;
    public Toolbar qoPGr6Ce;
    public Drawable wxUZMvaN;
    public int ygLcUYwZ;

    public final void MdtA4re8() {
        Drawable drawable;
        int i = this.NCTxEWno;
        if ((i & 2) == 0) {
            drawable = null;
        } else if ((i & 1) != 0) {
            drawable = this.VgvYg0wo;
            if (drawable == null) {
                drawable = this.wxUZMvaN;
            }
        } else {
            drawable = this.wxUZMvaN;
        }
        this.qoPGr6Ce.setLogo(drawable);
    }

    public final void NCTxEWno() {
        if ((this.NCTxEWno & 4) != 0) {
            boolean isEmpty = TextUtils.isEmpty(this.eVhOlqcC);
            Toolbar toolbar = this.qoPGr6Ce;
            if (isEmpty) {
                toolbar.setNavigationContentDescription(this.ygLcUYwZ);
            } else {
                toolbar.setNavigationContentDescription(this.eVhOlqcC);
            }
        }
    }

    public final void qoPGr6Ce(int i) {
        View view;
        Toolbar toolbar = this.qoPGr6Ce;
        int i2 = this.NCTxEWno ^ i;
        this.NCTxEWno = i;
        if (i2 != 0) {
            if ((i2 & 4) != 0) {
                if ((i & 4) != 0) {
                    NCTxEWno();
                }
                if ((this.NCTxEWno & 4) != 0) {
                    Drawable drawable = this.P7K7Inc8;
                    if (drawable == null) {
                        drawable = this.lDXGDhIF;
                    }
                    toolbar.setNavigationIcon(drawable);
                } else {
                    toolbar.setNavigationIcon((Drawable) null);
                }
            }
            if ((i2 & 3) != 0) {
                MdtA4re8();
            }
            if ((i2 & 8) != 0) {
                if ((i & 8) != 0) {
                    toolbar.setTitle(this.Qr9iLBAD);
                    toolbar.setSubtitle(this.jb9XjC4I);
                } else {
                    toolbar.setTitle((CharSequence) null);
                    toolbar.setSubtitle((CharSequence) null);
                }
            }
            if ((i2 & 16) == 0 || (view = this.MdtA4re8) == null) {
                return;
            }
            if ((i & 16) != 0) {
                toolbar.addView(view);
            } else {
                toolbar.removeView(view);
            }
        }
    }
}
