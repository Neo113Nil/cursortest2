package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.ui.platform.AndroidComposeView;

/* loaded from: classes.dex */
public final class jw6 {
    public final AndroidComposeView a;
    public final ime b;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public ybs j;
    public cds k;
    public mnj l;
    public ynn n;
    public ynn o;
    public final Object c = new Object();
    public uif m = gx3.v0;
    public final CursorAnchorInfo.Builder p = new CursorAnchorInfo.Builder();
    public final float[] q = feh.a();
    public final Matrix r = new Matrix();

    public jw6(AndroidComposeView androidComposeView, ime imeVar) {
        this.a = androidComposeView;
        this.b = imeVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [arf, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v3, types: [kotlin.jvm.functions.Function1, uif] */
    public final void a() {
        boolean z;
        boolean z2;
        ime imeVar = this.b;
        ?? r2 = imeVar.c;
        InputMethodManager inputMethodManager = (InputMethodManager) r2.getValue();
        View view = (View) imeVar.b;
        if (inputMethodManager.isActive(view)) {
            ?? r3 = this.m;
            float[] fArr = this.q;
            r3.invoke(new feh(fArr));
            this.a.s(fArr);
            Matrix matrix = this.r;
            cxb.i0(matrix, fArr);
            ybs ybsVar = this.j;
            ybsVar.getClass();
            long j = ybsVar.b;
            mnj mnjVar = this.l;
            mnjVar.getClass();
            cds cdsVar = this.k;
            cdsVar.getClass();
            ogi ogiVar = cdsVar.b;
            ynn ynnVar = this.n;
            ynnVar.getClass();
            ynn ynnVar2 = this.o;
            ynnVar2.getClass();
            boolean z3 = this.f;
            boolean z4 = this.g;
            boolean z5 = this.h;
            boolean z6 = this.i;
            CursorAnchorInfo.Builder builder = this.p;
            builder.reset();
            builder.setMatrix(matrix);
            rds rdsVar = ybsVar.c;
            int e = rds.e(j);
            builder.setSelectionRange(e, rds.d(j));
            if (!z3 || e < 0) {
                z = z4;
                z2 = z5;
            } else {
                int d = mnjVar.d(e);
                ynn b = ogiVar.b(d);
                z = z4;
                z2 = z5;
                float c = yhn.c(b.a, 0.0f, (int) (cdsVar.c >> 32));
                boolean t = bg3.t(ynnVar, c, b.b);
                boolean t2 = bg3.t(ynnVar, c, b.d);
                boolean z7 = cdsVar.a(d) == i2o.b;
                int i = (t || t2) ? 1 : 0;
                if (!t || !t2) {
                    i |= 2;
                }
                if (z7) {
                    i |= 4;
                }
                int i2 = i;
                float f = b.b;
                float f2 = b.d;
                builder.setInsertionMarkerLocation(c, f, f2, f2, i2);
                builder = builder;
            }
            if (z) {
                int e2 = rdsVar != null ? rds.e(rdsVar.a) : -1;
                int d2 = rdsVar != null ? rds.d(rdsVar.a) : -1;
                if (e2 >= 0 && e2 < d2) {
                    builder.setComposingText(e2, ybsVar.a.b.subSequence(e2, d2));
                    int d3 = mnjVar.d(e2);
                    int d4 = mnjVar.d(d2);
                    float[] fArr2 = new float[(d4 - d3) * 4];
                    ogiVar.a(y5g.P(d3, d4), fArr2);
                    while (e2 < d2) {
                        int d5 = mnjVar.d(e2);
                        int i3 = (d5 - d3) * 4;
                        float f3 = fArr2[i3];
                        float f4 = fArr2[i3 + 1];
                        CursorAnchorInfo.Builder builder2 = builder;
                        float f5 = fArr2[i3 + 2];
                        float f6 = fArr2[i3 + 3];
                        int i4 = d3;
                        int i5 = (ynnVar.a < f5 ? 1 : 0) & (f3 < ynnVar.c ? 1 : 0) & (ynnVar.b < f6 ? 1 : 0) & (f4 < ynnVar.d ? 1 : 0);
                        if (!bg3.t(ynnVar, f3, f4) || !bg3.t(ynnVar, f5, f6)) {
                            i5 |= 2;
                        }
                        if (cdsVar.a(d5) == i2o.b) {
                            i5 |= 4;
                        }
                        int i6 = e2;
                        builder2.addCharacterBounds(i6, f3, f4, f5, f6, i5);
                        builder = builder2;
                        e2 = i6 + 1;
                        d3 = i4;
                    }
                }
            }
            int i7 = Build.VERSION.SDK_INT;
            if (i7 >= 33 && z2) {
                rb.J(builder, ynnVar2);
            }
            if (i7 >= 34 && z6) {
                sb.a(builder, cdsVar, ynnVar);
            }
            ((InputMethodManager) r2.getValue()).updateCursorAnchorInfo(view, builder.build());
            this.e = false;
        }
    }
}
