package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinVersion;

/* loaded from: classes.dex */
public final class xr5 extends ds2 {
    public cs2 D;
    public final ArrayList E;
    public final RectF F;
    public final RectF G;
    public final RectF H;
    public final dnj I;
    public final j4x J;
    public Boolean K;
    public Boolean L;
    public float M;
    public boolean N;
    public final tra O;

    public xr5(czg czgVar, iof iofVar, List list, ayg aygVar) {
        super(czgVar, iofVar);
        ds2 ds2Var;
        ds2 xr5Var;
        String str;
        this.E = new ArrayList();
        this.F = new RectF();
        this.G = new RectF();
        this.H = new RectF();
        this.I = new dnj();
        this.J = new j4x(13);
        this.N = true;
        hk0 hk0Var = iofVar.s;
        if (hk0Var != null) {
            yic a = hk0Var.a();
            this.D = a;
            e(a);
            this.D.a(this);
        } else {
            this.D = null;
        }
        ovg ovgVar = new ovg(aygVar.j.size());
        int size = list.size() - 1;
        ds2 ds2Var2 = null;
        while (true) {
            if (size < 0) {
                for (int i = 0; i < ovgVar.h(); i++) {
                    ds2 ds2Var3 = (ds2) ovgVar.c(ovgVar.e(i));
                    if (ds2Var3 != null && (ds2Var = (ds2) ovgVar.c(ds2Var3.p.f)) != null) {
                        ds2Var3.t = ds2Var;
                    }
                }
                gs4 gs4Var = this.p.x;
                if (gs4Var != null) {
                    this.O = new tra(this, this, gs4Var);
                    return;
                }
                return;
            }
            iof iofVar2 = (iof) list.get(size);
            int D = ouj.D(iofVar2.e);
            if (D == 0) {
                xr5Var = new xr5(czgVar, iofVar2, (List) aygVar.c.get(iofVar2.g), aygVar);
            } else if (D == 1) {
                xr5Var = new h3r(czgVar, iofVar2);
            } else if (D == 2) {
                xr5Var = new wbe(czgVar, iofVar2);
            } else if (D == 3) {
                xr5Var = new ogj(czgVar, iofVar2);
            } else if (D == 4) {
                xr5Var = new pup(czgVar, iofVar2, this, aygVar);
            } else if (D != 5) {
                switch (iofVar2.e) {
                    case 1:
                        str = "PRE_COMP";
                        break;
                    case 2:
                        str = "SOLID";
                        break;
                    case 3:
                        str = "IMAGE";
                        break;
                    case 4:
                        str = "NULL";
                        break;
                    case 5:
                        str = "SHAPE";
                        break;
                    case 6:
                        str = "TEXT";
                        break;
                    case 7:
                        str = "UNKNOWN";
                        break;
                    default:
                        str = "null";
                        break;
                }
                psg.b("Unknown layer type ".concat(str));
                xr5Var = null;
            } else {
                xr5Var = new zcs(czgVar, iofVar2);
            }
            if (xr5Var != null) {
                ovgVar.f(xr5Var.p.d, xr5Var);
                if (ds2Var2 != null) {
                    ds2Var2.s = xr5Var;
                    ds2Var2 = null;
                } else {
                    this.E.add(0, xr5Var);
                    int D2 = ouj.D(iofVar2.u);
                    if (D2 == 1 || D2 == 2) {
                        ds2Var2 = xr5Var;
                    }
                }
            }
            size--;
        }
    }

    @Override // defpackage.ds2, defpackage.fqa
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        super.d(rectF, matrix, z);
        ArrayList arrayList = this.E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            RectF rectF2 = this.F;
            rectF2.set(0.0f, 0.0f, 0.0f, 0.0f);
            ((ds2) arrayList.get(size)).d(rectF2, this.n, true);
            rectF.union(rectF2);
        }
    }

    @Override // defpackage.ds2, defpackage.bbf
    public final void f(szg szgVar, Object obj) {
        super.f(szgVar, obj);
        if (obj == lzg.C) {
            if (szgVar == null) {
                cs2 cs2Var = this.D;
                if (cs2Var != null) {
                    cs2Var.j(null);
                    return;
                }
                return;
            }
            rwt rwtVar = new rwt(szgVar, null);
            this.D = rwtVar;
            rwtVar.a(this);
            e(this.D);
            return;
        }
        tra traVar = this.O;
        if (obj == 5 && traVar != null) {
            traVar.c.j(szgVar);
            return;
        }
        if (obj == lzg.E && traVar != null) {
            traVar.c(szgVar);
            return;
        }
        if (obj == lzg.F && traVar != null) {
            traVar.e.j(szgVar);
            return;
        }
        if (obj == lzg.G && traVar != null) {
            traVar.f.j(szgVar);
        } else {
            if (obj != lzg.H || traVar == null) {
                return;
            }
            traVar.g.j(szgVar);
        }
    }

    @Override // defpackage.ds2
    public final void j(Canvas canvas, Matrix matrix, int i, qra qraVar) {
        Canvas canvas2;
        boolean z = false;
        tra traVar = this.O;
        boolean z2 = (qraVar == null && traVar == null) ? false : true;
        czg czgVar = this.o;
        boolean z3 = czgVar.s;
        int i2 = KotlinVersion.MAX_COMPONENT_VALUE;
        ArrayList arrayList = this.E;
        if ((z3 && arrayList.size() > 1 && i != 255) || (z2 && czgVar.t)) {
            z = true;
        }
        if (!z) {
            i2 = i;
        }
        if (traVar != null) {
            qraVar = traVar.b(matrix, i2);
        }
        boolean z4 = this.N;
        iof iofVar = this.p;
        RectF rectF = this.G;
        if (z4 || !"__container".equals(iofVar.c)) {
            rectF.set(0.0f, 0.0f, iofVar.o, iofVar.p);
            matrix.mapRect(rectF);
        } else {
            rectF.setEmpty();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                ds2 ds2Var = (ds2) it.next();
                RectF rectF2 = this.H;
                ds2Var.d(rectF2, matrix, true);
                rectF.union(rectF2);
            }
        }
        dnj dnjVar = this.I;
        if (z) {
            j4x j4xVar = this.J;
            j4xVar.c = null;
            j4xVar.b = i;
            if (qraVar != null) {
                if (Color.alpha(qraVar.d) > 0) {
                    j4xVar.c = qraVar;
                } else {
                    j4xVar.c = null;
                }
                qraVar = null;
            }
            canvas2 = dnjVar.e(canvas, rectF, j4xVar);
        } else {
            canvas2 = canvas;
        }
        canvas.save();
        if (canvas.clipRect(rectF)) {
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ((ds2) arrayList.get(size)).g(canvas2, matrix, i2, qraVar);
            }
        }
        if (z) {
            dnjVar.c();
        }
        canvas.restore();
    }

    @Override // defpackage.ds2
    public final void o(abf abfVar, int i, ArrayList arrayList, abf abfVar2) {
        int i2 = 0;
        while (true) {
            ArrayList arrayList2 = this.E;
            if (i2 >= arrayList2.size()) {
                return;
            }
            ((ds2) arrayList2.get(i2)).c(abfVar, i, arrayList, abfVar2);
            i2++;
        }
    }

    @Override // defpackage.ds2
    public final void p(boolean z) {
        super.p(z);
        Iterator it = this.E.iterator();
        while (it.hasNext()) {
            ((ds2) it.next()).p(z);
        }
    }

    @Override // defpackage.ds2
    public final void q(float f) {
        this.M = f;
        super.q(f);
        cs2 cs2Var = this.D;
        iof iofVar = this.p;
        if (cs2Var != null) {
            ayg aygVar = this.o.a;
            f = ((((Float) cs2Var.e()).floatValue() * iofVar.b.n) - iofVar.b.l) / ((aygVar.m - aygVar.l) + 0.01f);
        }
        if (this.D == null) {
            float f2 = iofVar.n;
            ayg aygVar2 = iofVar.b;
            f -= f2 / (aygVar2.m - aygVar2.l);
        }
        if (iofVar.m != 0.0f && !"__container".equals(iofVar.c)) {
            f /= iofVar.m;
        }
        ArrayList arrayList = this.E;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ((ds2) arrayList.get(size)).q(f);
        }
    }

    public final boolean r() {
        if (this.L == null) {
            ArrayList arrayList = this.E;
            for (int size = arrayList.size() - 1; size >= 0; size--) {
                ds2 ds2Var = (ds2) arrayList.get(size);
                if (ds2Var instanceof pup) {
                    if (ds2Var.l()) {
                        this.L = Boolean.TRUE;
                        return true;
                    }
                } else if ((ds2Var instanceof xr5) && ((xr5) ds2Var).r()) {
                    this.L = Boolean.TRUE;
                    return true;
                }
            }
            this.L = Boolean.FALSE;
        }
        return this.L.booleanValue();
    }
}
