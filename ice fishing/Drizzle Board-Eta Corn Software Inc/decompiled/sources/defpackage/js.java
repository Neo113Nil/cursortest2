package defpackage;

import android.content.Context;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.PopupWindow;
import com.kolosta.rejin.jilosa.R;

/* compiled from: r8-map-id-3663cbcef52f1a493ceac7deeb6c50e305d4d0c9f83e91180cb6ce540f71d6b5 */
/* loaded from: classes.dex */
public class js {
    public final boolean MdtA4re8;
    public final yr NCTxEWno;
    public os Qr9iLBAD;
    public View VgvYg0wo;
    public boolean b2ZJblxo;
    public PopupWindow.OnDismissListener eVhOlqcC;
    public hs jb9XjC4I;
    public final Context qoPGr6Ce;
    public final int wxUZMvaN;
    public int P7K7Inc8 = 8388611;
    public final is k3x7lurq = new is(this);

    public js(Context context, yr yrVar, View view, boolean z, int i, int i2) {
        this.qoPGr6Ce = context;
        this.NCTxEWno = yrVar;
        this.VgvYg0wo = view;
        this.MdtA4re8 = z;
        this.wxUZMvaN = i;
    }

    public void MdtA4re8() {
        this.jb9XjC4I = null;
        PopupWindow.OnDismissListener onDismissListener = this.eVhOlqcC;
        if (onDismissListener != null) {
            onDismissListener.onDismiss();
        }
    }

    public final boolean NCTxEWno() {
        hs hsVar = this.jb9XjC4I;
        return hsVar != null && hsVar.NCTxEWno();
    }

    public final hs qoPGr6Ce() {
        hs hsVar = this.jb9XjC4I;
        if (hsVar == null) {
            Context context = this.qoPGr6Ce;
            Display defaultDisplay = ((WindowManager) context.getSystemService("window")).getDefaultDisplay();
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            int min = Math.min(point.x, point.y);
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(R.dimen.abc_cascading_menus_min_smallest_width);
            Context context2 = this.qoPGr6Ce;
            if (min >= dimensionPixelSize) {
                hsVar = new z3(context2, this.VgvYg0wo, this.wxUZMvaN, this.MdtA4re8);
            } else {
                hsVar = new r90(context2, this.NCTxEWno, this.VgvYg0wo, this.wxUZMvaN, this.MdtA4re8);
            }
            hsVar.ygLcUYwZ(this.NCTxEWno);
            hsVar.Ey6iv0m0(this.k3x7lurq);
            hsVar.sjUBp5pO(this.VgvYg0wo);
            hsVar.P7K7Inc8(this.Qr9iLBAD);
            hsVar.OxcuoDLp(this.b2ZJblxo);
            hsVar.amk52bBQ(this.P7K7Inc8);
            this.jb9XjC4I = hsVar;
        }
        return hsVar;
    }

    public final void wxUZMvaN(int i, int i2, boolean z, boolean z2) {
        hs qoPGr6Ce = qoPGr6Ce();
        qoPGr6Ce.I5GHvsYW(z2);
        if (z) {
            if ((Gravity.getAbsoluteGravity(this.P7K7Inc8, this.VgvYg0wo.getLayoutDirection()) & 7) == 5) {
                i -= this.VgvYg0wo.getWidth();
            }
            qoPGr6Ce.KlHjfFWx(i);
            qoPGr6Ce.RXQxj5Oe(i2);
            int i3 = (int) ((this.qoPGr6Ce.getResources().getDisplayMetrics().density * 48.0f) / 2.0f);
            qoPGr6Ce.NCTxEWno = new Rect(i - i3, i2 - i3, i + i3, i2 + i3);
        }
        qoPGr6Ce.wxUZMvaN();
    }
}
