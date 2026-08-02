package defpackage;

import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.PointF;
import android.graphics.RectF;
import com.airbnb.lottie.LottieDrawable;
import com.airbnb.lottie.utils.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* loaded from: classes.dex */
public final class uhr0 extends l35 {
    public final fge C;
    public final eud D;
    public final bnm E;

    public uhr0(LottieDrawable lottieDrawable, mxx mxxVar, eud eudVar, nsz nszVar) {
        super(lottieDrawable, mxxVar);
        this.D = eudVar;
        fge fgeVar = new fge(lottieDrawable, this, new qhr0("__container", mxxVar.a, false), nszVar);
        this.C = fgeVar;
        List list = Collections.EMPTY_LIST;
        fgeVar.e(list, list);
        oo2 oo2Var = this.p.x;
        if (oo2Var != null) {
            this.E = new bnm(this, this, oo2Var);
        }
    }

    @Override // defpackage.l35, defpackage.ccm
    public final void b(RectF rectF, Matrix matrix, boolean z) {
        super.b(rectF, matrix, z);
        this.C.b(rectF, this.n, z);
    }

    @Override // defpackage.l35, defpackage.tix
    public final void g(puz puzVar, Object obj) {
        super.g(puzVar, obj);
        PointF pointF = cuz.a;
        bnm bnmVar = this.E;
        if (obj == 5 && bnmVar != null) {
            bnmVar.b(puzVar);
            return;
        }
        if (obj == cuz.E && bnmVar != null) {
            bnmVar.f(puzVar);
            return;
        }
        if (obj == cuz.F && bnmVar != null) {
            bnmVar.c(puzVar);
            return;
        }
        if (obj == cuz.G && bnmVar != null) {
            bnmVar.e(puzVar);
        } else {
            if (obj != cuz.H || bnmVar == null) {
                return;
            }
            bnmVar.g(puzVar);
        }
    }

    @Override // defpackage.l35
    public final void i(Canvas canvas, Matrix matrix, int i, a aVar) {
        bnm bnmVar = this.E;
        if (bnmVar != null) {
            aVar = bnmVar.a(matrix, i);
        }
        this.C.f(canvas, matrix, i, aVar);
    }

    @Override // defpackage.l35
    public final cot j() {
        cot cotVar = this.p.w;
        return cotVar != null ? cotVar : this.D.p.w;
    }

    @Override // defpackage.l35
    public final void n(six sixVar, int i, ArrayList arrayList, six sixVar2) {
        this.C.a(sixVar, i, arrayList, sixVar2);
    }
}
