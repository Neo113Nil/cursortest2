package defpackage;

import android.graphics.Matrix;
import android.os.Build;
import android.view.View;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;

/* loaded from: classes.dex */
public final class twf {
    public final bh0 a;
    public final qne b;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public ybs j;
    public cds k;
    public mnj l;
    public ynn m;
    public ynn n;
    public final Object c = new Object();
    public final CursorAnchorInfo.Builder o = new CursorAnchorInfo.Builder();
    public final float[] p = feh.a();
    public final Matrix q = new Matrix();

    public twf(bh0 bh0Var, qne qneVar) {
        this.a = bh0Var;
        this.b = qneVar;
    }

    public final void a() {
        boolean z;
        boolean z2;
        qne qneVar = this.b;
        InputMethodManager r = qneVar.r();
        View view = (View) qneVar.a;
        if (!r.isActive(view) || this.j == null || this.l == null || this.k == null || this.m == null || this.n == null) {
            return;
        }
        float[] fArr = this.p;
        feh.d(fArr);
        wof wofVar = (wof) ((nwf) this.a.b).r.getValue();
        if (wofVar != null) {
            if (!wofVar.d()) {
                wofVar = null;
            }
            if (wofVar != null) {
                wofVar.E(fArr);
            }
        }
        ynn ynnVar = this.n;
        ynnVar.getClass();
        float f = -ynnVar.a;
        ynn ynnVar2 = this.n;
        ynnVar2.getClass();
        feh.f(fArr, f, -ynnVar2.b);
        Matrix matrix = this.q;
        cxb.i0(matrix, fArr);
        ybs ybsVar = this.j;
        ybsVar.getClass();
        long j = ybsVar.b;
        mnj mnjVar = this.l;
        mnjVar.getClass();
        cds cdsVar = this.k;
        cdsVar.getClass();
        ogi ogiVar = cdsVar.b;
        ynn ynnVar3 = this.m;
        ynnVar3.getClass();
        ynn ynnVar4 = this.n;
        ynnVar4.getClass();
        boolean z3 = this.f;
        boolean z4 = this.g;
        boolean z5 = this.h;
        boolean z6 = this.i;
        CursorAnchorInfo.Builder builder = this.o;
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
            boolean C = swf.C(ynnVar3, c, b.b);
            boolean C2 = swf.C(ynnVar3, c, b.d);
            boolean z7 = cdsVar.a(d) == i2o.b;
            int i = (C || C2) ? 1 : 0;
            if (!C || !C2) {
                i |= 2;
            }
            if (z7) {
                i |= 4;
            }
            int i2 = i;
            float f2 = b.b;
            float f3 = b.d;
            builder.setInsertionMarkerLocation(c, f2, f3, f3, i2);
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
                    float f4 = fArr2[i3];
                    float f5 = fArr2[i3 + 1];
                    CursorAnchorInfo.Builder builder2 = builder;
                    float f6 = fArr2[i3 + 2];
                    float f7 = fArr2[i3 + 3];
                    int i4 = d3;
                    int i5 = (ynnVar3.a < f6 ? 1 : 0) & (f4 < ynnVar3.c ? 1 : 0) & (ynnVar3.b < f7 ? 1 : 0) & (f5 < ynnVar3.d ? 1 : 0);
                    if (!swf.C(ynnVar3, f4, f5) || !swf.C(ynnVar3, f6, f7)) {
                        i5 |= 2;
                    }
                    if (cdsVar.a(d5) == i2o.b) {
                        i5 |= 4;
                    }
                    int i6 = e2;
                    builder2.addCharacterBounds(i6, f4, f5, f6, f7, i5);
                    builder = builder2;
                    e2 = i6 + 1;
                    d3 = i4;
                }
            }
        }
        int i7 = Build.VERSION.SDK_INT;
        if (i7 >= 33 && z2) {
            rb.K(builder, ynnVar4);
        }
        if (i7 >= 34 && z6) {
            sb.b(builder, cdsVar, ynnVar3);
        }
        qneVar.r().updateCursorAnchorInfo(view, builder.build());
        this.e = false;
    }
}
