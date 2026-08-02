package defpackage;

import android.graphics.Paint;
import android.graphics.Typeface;
import android.util.Log;
import com.caverock.androidsvg.k;

/* loaded from: classes10.dex */
public final class ynl0 {
    public final k a;
    public boolean b;
    public boolean c;
    public final Paint d;
    public final Paint e;
    public pt3 f;
    public pt3 g;
    public boolean h;

    public ynl0(ynl0 ynl0Var) {
        this.b = ynl0Var.b;
        this.c = ynl0Var.c;
        this.d = new Paint(ynl0Var.d);
        this.e = new Paint(ynl0Var.e);
        pt3 pt3Var = ynl0Var.f;
        if (pt3Var != null) {
            this.f = new pt3(pt3Var);
        }
        pt3 pt3Var2 = ynl0Var.g;
        if (pt3Var2 != null) {
            this.g = new pt3(pt3Var2);
        }
        this.h = ynl0Var.h;
        try {
            this.a = (k) ynl0Var.a.clone();
        } catch (CloneNotSupportedException e) {
            Log.e("SVGAndroidRenderer", "Unexpected clone error", e);
            this.a = k.a();
        }
    }

    public ynl0() {
        Paint paint = new Paint();
        this.d = paint;
        paint.setFlags(193);
        paint.setHinting(0);
        paint.setStyle(Paint.Style.FILL);
        Typeface typeface = Typeface.DEFAULT;
        paint.setTypeface(typeface);
        Paint paint2 = new Paint();
        this.e = paint2;
        paint2.setFlags(193);
        paint2.setHinting(0);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setTypeface(typeface);
        this.a = k.a();
    }
}
