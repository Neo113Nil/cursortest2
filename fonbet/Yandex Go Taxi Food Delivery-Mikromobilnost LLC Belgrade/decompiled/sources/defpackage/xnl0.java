package defpackage;

import android.graphics.Matrix;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import com.caverock.androidsvg.m;

/* loaded from: classes10.dex */
public final class xnl0 extends cwa1 {
    public final /* synthetic */ int a;
    public float b;
    public final float c;
    public final /* synthetic */ m d;
    public final Object e;

    public xnl0(m mVar, float f, float f2) {
        this.a = 1;
        this.d = mVar;
        this.e = new RectF();
        this.b = f;
        this.c = f2;
    }

    @Override // defpackage.cwa1
    public final boolean b(lnl0 lnl0Var) {
        switch (this.a) {
            case 0:
                return !(lnl0Var instanceof mnl0);
            default:
                if (!(lnl0Var instanceof mnl0)) {
                    return true;
                }
                mnl0 mnl0Var = (mnl0) lnl0Var;
                yml0 h = lnl0Var.a.h(mnl0Var.n);
                if (h == null) {
                    m.o("TextPath path reference '%s' not found", mnl0Var.n);
                    return false;
                }
                lml0 lml0Var = (lml0) h;
                Path path = (Path) new unl0(lml0Var.o).c;
                Matrix matrix = lml0Var.n;
                if (matrix != null) {
                    path.transform(matrix);
                }
                RectF rectF = new RectF();
                path.computeBounds(rectF, true);
                ((RectF) this.e).union(rectF);
                return false;
        }
    }

    @Override // defpackage.cwa1
    public final void c(String str) {
        String str2;
        int i = this.a;
        Object obj = this.e;
        m mVar = this.d;
        switch (i) {
            case 0:
                if (mVar.V()) {
                    Path path = new Path();
                    str2 = str;
                    mVar.c.d.getTextPath(str2, 0, str.length(), this.b, this.c, path);
                    ((Path) obj).addPath(path);
                } else {
                    str2 = str;
                }
                this.b = mVar.c.d.measureText(str2) + this.b;
                break;
            default:
                if (mVar.V()) {
                    Rect rect = new Rect();
                    mVar.c.d.getTextBounds(str, 0, str.length(), rect);
                    RectF rectF = new RectF(rect);
                    rectF.offset(this.b, this.c);
                    ((RectF) obj).union(rectF);
                }
                this.b = mVar.c.d.measureText(str) + this.b;
                break;
        }
    }

    public xnl0(m mVar, float f, float f2, Path path) {
        this.a = 0;
        this.d = mVar;
        this.b = f;
        this.c = f2;
        this.e = path;
    }
}
