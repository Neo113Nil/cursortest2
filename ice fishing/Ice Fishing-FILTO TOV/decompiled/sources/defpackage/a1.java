package defpackage;

import android.graphics.Paint;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.os.Build;
import android.os.Bundle;
import java.util.Arrays;

/* compiled from: r8-map-id-f07502904ffb6c7cfc104556b013e0e48cd078697d1e7ebb5294e50317be4258 */
/* loaded from: classes.dex */
public final class a1 {
    public int GWasM1elztuh;
    public Object X1lG3V04pd;
    public final Object Yi7zF1RB1;
    public Object xqGvceK5x;

    public a1(Bundle bundle) {
        bundle.getClass();
        String string = bundle.getString("nav-entry-state:id");
        if (string == null) {
            z50.cilMamHF("nav-entry-state:id");
            throw null;
        }
        this.Yi7zF1RB1 = string;
        this.GWasM1elztuh = o50.mE4lRynR(bundle, "nav-entry-state:destination-id");
        Bundle bundle2 = bundle.getBundle("nav-entry-state:args");
        if (bundle2 == null) {
            z50.cilMamHF("nav-entry-state:args");
            throw null;
        }
        this.X1lG3V04pd = bundle2;
        Bundle bundle3 = bundle.getBundle("nav-entry-state:saved-state");
        if (bundle3 != null) {
            this.xqGvceK5x = bundle3;
        } else {
            z50.cilMamHF("nav-entry-state:saved-state");
            throw null;
        }
    }

    public void AvO7iQsrTN() {
        ((Paint) this.Yi7zF1RB1).setFilterBitmap(true);
    }

    public void E7jCp8Ls(int i) {
        ((Paint) this.Yi7zF1RB1).setStyle(i == 1 ? Paint.Style.STROKE : Paint.Style.FILL);
    }

    public void EljAMC1QTz(s6 s6Var) {
        this.xqGvceK5x = s6Var;
        ((Paint) this.Yi7zF1RB1).setColorFilter(s6Var != null ? s6Var.GWasM1elztuh : null);
    }

    public int GWasM1elztuh() {
        Paint.Cap strokeCap = ((Paint) this.Yi7zF1RB1).getStrokeCap();
        int i = strokeCap == null ? -1 : b1.GWasM1elztuh[strokeCap.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    public void JFJ3QoxA(int i) {
        ((Paint) this.Yi7zF1RB1).setStrokeJoin(i == 0 ? Paint.Join.MITER : i == 2 ? Paint.Join.BEVEL : i == 1 ? Paint.Join.ROUND : Paint.Join.MITER);
    }

    public void OOA6hdeuvCS(long j) {
        ((Paint) this.Yi7zF1RB1).setColor(ki1.HFYAaqMd6(j));
    }

    public void X1lG3V04pd(float f) {
        ((Paint) this.Yi7zF1RB1).setAlpha((int) Math.rint(f * 255.0f));
    }

    public int Yi7zF1RB1() {
        Paint.Join strokeJoin = ((Paint) this.Yi7zF1RB1).getStrokeJoin();
        int i = strokeJoin == null ? -1 : b1.Yi7zF1RB1[strokeJoin.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 2;
    }

    public void encWxUiV2(Shader shader) {
        this.X1lG3V04pd = shader;
        ((Paint) this.Yi7zF1RB1).setShader(shader);
    }

    public void mOu10nynGul(int i) {
        ((Paint) this.Yi7zF1RB1).setStrokeCap(i == 2 ? Paint.Cap.SQUARE : i == 1 ? Paint.Cap.ROUND : i == 0 ? Paint.Cap.BUTT : Paint.Cap.BUTT);
    }

    public void rQPn8YBR(float f) {
        ((Paint) this.Yi7zF1RB1).setStrokeWidth(f);
    }

    public void xqGvceK5x(int i) {
        if (this.GWasM1elztuh == i) {
            return;
        }
        this.GWasM1elztuh = i;
        Paint paint = (Paint) this.Yi7zF1RB1;
        if (Build.VERSION.SDK_INT >= 29) {
            paint.setBlendMode(fb1.Uxq83abb04(i));
        } else {
            paint.setXfermode(new PorterDuffXfermode(fb1.mqNvfisv7(i)));
        }
    }

    public a1(fh0 fh0Var, int i) {
        this.Yi7zF1RB1 = fh0Var.JFJ3QoxA;
        this.GWasM1elztuh = i;
        hh0 hh0Var = fh0Var.E7jCp8Ls;
        this.X1lG3V04pd = hh0Var.GWasM1elztuh();
        Bundle jivtDDk9H = ki1.jivtDDk9H((rn0[]) Arrays.copyOf(new rn0[0], 0));
        this.xqGvceK5x = jivtDDk9H;
        hh0Var.encWxUiV2.mE4lRynR(jivtDDk9H);
    }

    public a1(Paint paint) {
        this.Yi7zF1RB1 = paint;
        this.GWasM1elztuh = 3;
    }
}
