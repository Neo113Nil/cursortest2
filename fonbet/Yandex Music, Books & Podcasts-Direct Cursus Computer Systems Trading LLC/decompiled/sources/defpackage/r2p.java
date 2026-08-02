package defpackage;

import androidx.compose.foundation.layout.d;
import androidx.compose.foundation.lazy.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;

/* loaded from: classes3.dex */
public final class r2p implements pyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ fvf c;
    public final /* synthetic */ q0k d;

    public r2p(fvf fvfVar, float f, q0k q0kVar, int i) {
        this.a = i;
        switch (i) {
            case 1:
                this.c = fvfVar;
                this.d = q0kVar;
                this.b = f;
                break;
            default:
                this.c = fvfVar;
                this.d = q0kVar;
                this.b = f;
                break;
        }
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        switch (this.a) {
            case 0:
                mfh mfhVar = (mfh) obj;
                ffh ffhVar = (ffh) obj2;
                long j = ((ga6) obj3).a;
                mfhVar.getClass();
                ffhVar.getClass();
                bvf j2 = this.c.j();
                List list = j2.k;
                ArrayList arrayList = new ArrayList();
                for (Object obj4 : list) {
                    cvf cvfVar = (cvf) obj4;
                    if (cvfVar.a != 0 && !cvfVar.l.equals("bottom_empty_space")) {
                        arrayList.add(obj4);
                    }
                }
                Iterator it = arrayList.iterator();
                int i = 0;
                while (it.hasNext()) {
                    i += ((cvf) it.next()).q;
                }
                int g = ((((((int) (j2.g() & 4294967295L)) - (-j2.l)) - j2.q) - i) - mfhVar.L(this.b)) - mfhVar.L(this.d.b);
                if (g < 0) {
                    g = 0;
                }
                if (g < 0) {
                    ume.a("height must be >= 0");
                }
                ksk M = ffhVar.M(ia6.e(j, ia6.h(0, Integer.MAX_VALUE, g, g)));
                return mfh.m0(mfhVar, M.a, M.b, new me3(M, 1));
            default:
                hq5 hq5Var = (hq5) obj2;
                int intValue = ((Number) obj3).intValue();
                ((a) obj).getClass();
                if ((intValue & 17) == 16) {
                    oq5 oq5Var = (oq5) hq5Var;
                    if (oq5Var.z()) {
                        oq5Var.S();
                        return Unit.a;
                    }
                }
                ug3.a(d.d(androidx.compose.ui.layout.a.b(vci.a, new r2p(this.c, this.b, this.d, 0)), 1.0f), hq5Var, 0);
                return Unit.a;
        }
    }
}
