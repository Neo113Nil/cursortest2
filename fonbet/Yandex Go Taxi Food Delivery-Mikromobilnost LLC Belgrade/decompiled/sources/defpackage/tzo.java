package defpackage;

import android.util.Pair;
import android.util.Size;
import androidx.camera.core.impl.UseCaseConfigFactory$CaptureType;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes10.dex */
public final class tzo implements zi21 {
    public final h2t b;
    public final c8v c;
    public final c8v d;

    public tzo(b731 b731Var) {
        this.b = new h2t(b731Var);
        this.c = new c8v(b731Var);
        this.d = new c8v(b731Var);
    }

    @Override // defpackage.zi21
    public final szd a(UseCaseConfigFactory$CaptureType useCaseConfigFactory$CaptureType, int i) {
        yy40 p;
        int i2 = szo.a[useCaseConfigFactory$CaptureType.ordinal()];
        if (i2 == 1) {
            q8v q8vVar = new q8v();
            List e = ((b731) this.b.a).e();
            x34 x34Var = icv.u2;
            yy40 yy40Var = q8vVar.a;
            yy40Var.w(x34Var, e);
            yy40Var.w(xi21.s4, Boolean.TRUE);
            p = yy40.p(q8vVar.e());
        } else {
            if (i2 != 2) {
                if (i2 != 3) {
                    if (i2 != 4) {
                        return null;
                    }
                    ny61.g("Should not go here. VideoCapture is supported by recording the preview stream when Extension is enabled.");
                    return null;
                }
                v7v v7vVar = new v7v();
                Size[] n = this.d.a.n();
                ArrayList arrayList = new ArrayList();
                if (n.length > 0) {
                    arrayList.add(new Pair(35, n));
                }
                x34 x34Var2 = icv.u2;
                v7vVar.a.w(x34Var2, arrayList);
                b8v e2 = v7vVar.e();
                List<Pair> list = (List) e2.g(x34Var2, null);
                if (list != null) {
                    for (Pair pair : list) {
                        int intValue = ((Integer) pair.first).intValue();
                        Size[] sizeArr = (Size[]) pair.second;
                        if (intValue == 35 && sizeArr != null && sizeArr.length > 0) {
                            p = yy40.p(e2);
                        }
                    }
                }
                ny61.g("ImageAnalysis is not supported when Extension is enabled on this device. Check ExtensionsManager.isImageAnalysisSupported before binding the ImageAnalysis use case.");
                return null;
            }
            pxe0 pxe0Var = new pxe0();
            List o = this.c.a.o();
            x34 x34Var3 = icv.u2;
            yy40 yy40Var2 = pxe0Var.a;
            yy40Var2.w(x34Var3, o);
            yy40Var2.w(xi21.s4, Boolean.TRUE);
            p = yy40.p(pxe0Var.e());
        }
        p.w(xi21.r4, Boolean.TRUE);
        return ug70.a(p);
    }
}
