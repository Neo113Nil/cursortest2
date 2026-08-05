package defpackage;

import android.content.res.ColorStateList;
import android.graphics.drawable.Drawable;
import android.view.View;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public final class b2 {
    public final /* synthetic */ View MdtA4re8;
    public final /* synthetic */ int NCTxEWno;
    public W64EBLa6 qoPGr6Ce;

    public /* synthetic */ b2(View view, int i) {
        this.NCTxEWno = i;
        this.MdtA4re8 = view;
    }

    public void NCTxEWno(Drawable drawable) {
        switch (this.NCTxEWno) {
            case 2:
                nr nrVar = (nr) this.MdtA4re8;
                ColorStateList colorStateList = nrVar.sjUBp5pO;
                if (colorStateList != null) {
                    drawable.setTint(colorStateList.getColorForState(nrVar.Ey6iv0m0, colorStateList.getDefaultColor()));
                    break;
                }
                break;
        }
    }

    public final void qoPGr6Ce(Drawable drawable) {
        int i = this.NCTxEWno;
        View view = this.MdtA4re8;
        switch (i) {
            case 0:
                c2 c2Var = (c2) view;
                c2Var.setIndeterminate(false);
                c2Var.qoPGr6Ce(c2Var.MdtA4re8);
                break;
            case 1:
                c2 c2Var2 = (c2) view;
                if (!c2Var2.Qr9iLBAD) {
                    c2Var2.setVisibility(c2Var2.jb9XjC4I);
                    break;
                }
                break;
            default:
                ColorStateList colorStateList = ((nr) view).sjUBp5pO;
                if (colorStateList != null) {
                    drawable.setTintList(colorStateList);
                    break;
                }
                break;
        }
    }

    public final void MdtA4re8(Drawable drawable) {
    }
}
