package defpackage;

import kotlin.Unit;
import ru.yandex.music.R;

/* loaded from: classes3.dex */
public final class r1p implements pyc {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ r1p(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    @Override // defpackage.pyc
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String n;
        int i = this.a;
        Object obj4 = this.b;
        switch (i) {
            case 0:
                hq5 hq5Var = (hq5) obj2;
                int intValue = ((Number) obj3).intValue();
                ((oho) obj).getClass();
                oq5 oq5Var = (oq5) hq5Var;
                if (oq5Var.P(intValue & 1, (intValue & 17) != 16)) {
                    bfg bfgVar = ((n1p) obj4).b;
                    if (bfgVar instanceof mht) {
                        oq5Var.Z(315128419);
                        oq5Var.p(false);
                        n = ((mht) bfgVar).a;
                    } else {
                        if (!(bfgVar instanceof nht)) {
                            throw vz1.i(oq5Var, 315127058, false);
                        }
                        n = vz1.n(oq5Var, 315129683, R.string.mixed_search_filter_top, oq5Var, false);
                    }
                    xcs.b(n, null, 0L, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, null, oq5Var, 0, 0, 131070);
                } else {
                    oq5Var.S();
                }
                return Unit.a;
            default:
                mfh mfhVar = (mfh) obj;
                ffh ffhVar = (ffh) obj2;
                long j = ((ga6) obj3).a;
                mfhVar.getClass();
                ffhVar.getClass();
                ksk M = ffhVar.M(j);
                int i2 = M.b;
                float f = k5t.a;
                ((aqi) obj4).setValue(Integer.valueOf(i2));
                return mfh.m0(mfhVar, M.a, M.b, new me3(M, 2));
        }
    }
}
