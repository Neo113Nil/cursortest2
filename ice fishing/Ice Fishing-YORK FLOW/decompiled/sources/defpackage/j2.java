package defpackage;

/* compiled from: r8-map-id-5e15bf382d9e1cc682b2b5d208f848646545054061ee84effb1e415a0540fc32 */
/* loaded from: classes.dex */
public final class j2 {
    public java.lang.Object JhCgjQRTAOCT;
    public int ZpBGe2uQfcn8;
    public java.lang.Object fWTAfUmVKrZq;
    public final java.lang.Object giKS3J6vZuNy;

    public j2(android.os.Bundle bundle) {
        bundle.getClass();
        java.lang.String string = bundle.getString("nav-entry-state:id");
        if (string == null) {
            defpackage.w60.KrtOTfE6jiS2("nav-entry-state:id");
            throw null;
        }
        this.giKS3J6vZuNy = string;
        this.ZpBGe2uQfcn8 = defpackage.wc1.KrtOTfE6jiS2("nav-entry-state:destination-id", bundle);
        this.fWTAfUmVKrZq = defpackage.wc1.BXaznwstz2U0("nav-entry-state:args", bundle);
        this.JhCgjQRTAOCT = defpackage.wc1.BXaznwstz2U0("nav-entry-state:saved-state", bundle);
    }

    public void GE9mJIPrb8gP(int i) {
        ((android.graphics.Paint) this.giKS3J6vZuNy).setStrokeJoin(i == 0 ? android.graphics.Paint.Join.MITER : i == 2 ? android.graphics.Paint.Join.BEVEL : i == 1 ? android.graphics.Paint.Join.ROUND : android.graphics.Paint.Join.MITER);
    }

    public void JhCgjQRTAOCT(int i) {
        if (this.ZpBGe2uQfcn8 == i) {
            return;
        }
        this.ZpBGe2uQfcn8 = i;
        android.graphics.Paint paint = (android.graphics.Paint) this.giKS3J6vZuNy;
        if (android.os.Build.VERSION.SDK_INT >= 29) {
            paint.setBlendMode(defpackage.h0.FhgBoOud6zyW(i));
        } else {
            paint.setXfermode(new android.graphics.PorterDuffXfermode(defpackage.h0.Rl68HURFBtL3(i)));
        }
    }

    public void Ns0WNyEWdPsk(float f) {
        ((android.graphics.Paint) this.giKS3J6vZuNy).setStrokeWidth(f);
    }

    public void P05cfTpS5W5L(android.graphics.Shader shader) {
        this.fWTAfUmVKrZq = shader;
        ((android.graphics.Paint) this.giKS3J6vZuNy).setShader(shader);
    }

    public void QiMR8OkAhezm(int i) {
        ((android.graphics.Paint) this.giKS3J6vZuNy).setFilterBitmap(!(i == 0));
    }

    public void WDYagTQQm9ns(long j) {
        ((android.graphics.Paint) this.giKS3J6vZuNy).setColor(defpackage.ok0.PS16moFv2oLu(j));
    }

    public int ZpBGe2uQfcn8() {
        android.graphics.Paint.Cap strokeCap = ((android.graphics.Paint) this.giKS3J6vZuNy).getStrokeCap();
        int i = strokeCap == null ? -1 : defpackage.k2.ZpBGe2uQfcn8[strokeCap.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 2;
        }
        return 1;
    }

    public void e6mdH7fiFuta(int i) {
        ((android.graphics.Paint) this.giKS3J6vZuNy).setStrokeCap(i == 2 ? android.graphics.Paint.Cap.SQUARE : i == 1 ? android.graphics.Paint.Cap.ROUND : i == 0 ? android.graphics.Paint.Cap.BUTT : android.graphics.Paint.Cap.BUTT);
    }

    public void fNwYGHIYeJcR(int i) {
        ((android.graphics.Paint) this.giKS3J6vZuNy).setStyle(i == 1 ? android.graphics.Paint.Style.STROKE : android.graphics.Paint.Style.FILL);
    }

    public void fWTAfUmVKrZq(float f) {
        ((android.graphics.Paint) this.giKS3J6vZuNy).setAlpha((int) java.lang.Math.rint(f * 255.0f));
    }

    public int giKS3J6vZuNy() {
        android.graphics.Paint.Join strokeJoin = ((android.graphics.Paint) this.giKS3J6vZuNy).getStrokeJoin();
        int i = strokeJoin == null ? -1 : defpackage.k2.giKS3J6vZuNy[strokeJoin.ordinal()];
        if (i == 1) {
            return 0;
        }
        if (i != 2) {
            return i != 3 ? 0 : 1;
        }
        return 2;
    }

    public void oh71FJcDz6S2(defpackage.ga gaVar) {
        this.JhCgjQRTAOCT = gaVar;
        ((android.graphics.Paint) this.giKS3J6vZuNy).setColorFilter(gaVar != null ? gaVar.ZpBGe2uQfcn8 : null);
    }

    public j2(defpackage.xo0 xo0Var, int i) {
        this.giKS3J6vZuNy = xo0Var.GE9mJIPrb8gP;
        this.ZpBGe2uQfcn8 = i;
        defpackage.zo0 zo0Var = xo0Var.fNwYGHIYeJcR;
        this.fWTAfUmVKrZq = zo0Var.ZpBGe2uQfcn8();
        android.os.Bundle GE9mJIPrb8gP = defpackage.i61.GE9mJIPrb8gP((defpackage.bw0[]) java.util.Arrays.copyOf(new defpackage.bw0[0], 0));
        this.JhCgjQRTAOCT = GE9mJIPrb8gP;
        zo0Var.P05cfTpS5W5L.OcTWLQzke1i2(GE9mJIPrb8gP);
    }

    public j2(android.graphics.Paint paint) {
        this.giKS3J6vZuNy = paint;
        this.ZpBGe2uQfcn8 = 3;
    }
}
