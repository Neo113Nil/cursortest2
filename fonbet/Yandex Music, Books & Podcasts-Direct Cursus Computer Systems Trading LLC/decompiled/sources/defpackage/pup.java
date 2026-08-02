package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class pup extends ds2 {
    public final bc6 D;
    public final xr5 E;
    public final tra F;

    public pup(czg czgVar, iof iofVar, xr5 xr5Var, ayg aygVar) {
        super(czgVar, iofVar);
        this.E = xr5Var;
        bc6 bc6Var = new bc6(czgVar, this, new mup("__container", iofVar.a, false), aygVar);
        this.D = bc6Var;
        List list = Collections.EMPTY_LIST;
        bc6Var.b(list, list);
        gs4 gs4Var = this.p.x;
        if (gs4Var != null) {
            this.F = new tra(this, this, gs4Var);
        }
    }

    @Override // defpackage.ds2, defpackage.fqa
    public final void d(RectF rectF, Matrix matrix, boolean z) {
        super.d(rectF, matrix, z);
        this.D.d(rectF, this.n, z);
    }

    @Override // defpackage.ds2, defpackage.bbf
    public final void f(szg szgVar, Object obj) {
        super.f(szgVar, obj);
        PointF pointF = lzg.a;
        tra traVar = this.F;
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
        tra traVar = this.F;
        if (traVar != null) {
            qraVar = traVar.b(matrix, i);
        }
        this.D.g(canvas, matrix, i, qraVar);
    }

    @Override // defpackage.ds2
    public final ozw k() {
        ozw ozwVar = this.p.w;
        return ozwVar != null ? ozwVar : this.E.p.w;
    }

    @Override // defpackage.ds2
    public final void o(abf abfVar, int i, ArrayList arrayList, abf abfVar2) {
        this.D.c(abfVar, i, arrayList, abfVar2);
    }
}
