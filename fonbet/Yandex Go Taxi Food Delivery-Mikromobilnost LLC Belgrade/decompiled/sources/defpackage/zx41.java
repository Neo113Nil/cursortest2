package defpackage;

import androidx.compose.foundation.lazy.b;
import java.util.List;
import ru.yandex.taxi.logistics.sdk.ui.component.control.g;

/* loaded from: classes5.dex */
public final class zx41 implements bms {
    public final /* synthetic */ m3u0 A;
    public final /* synthetic */ List a;
    public final /* synthetic */ long b;
    public final /* synthetic */ long c;
    public final /* synthetic */ tse w;
    public final /* synthetic */ b x;
    public final /* synthetic */ int y;
    public final /* synthetic */ String z;

    public zx41(List list, long j, long j2, tse tseVar, b bVar, int i, String str, m3u0 m3u0Var) {
        this.a = list;
        this.b = j;
        this.c = j2;
        this.w = tseVar;
        this.x = bVar;
        this.y = i;
        this.z = str;
        this.A = m3u0Var;
    }

    @Override // defpackage.bms
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        u4y u4yVar = (u4y) obj;
        int intValue = ((Number) obj2).intValue();
        fid fidVar = (fid) obj3;
        int intValue2 = ((Number) obj4).intValue();
        if ((intValue2 & 6) == 0) {
            i = (((bts) fidVar).k(u4yVar) ? 4 : 2) | intValue2;
        } else {
            i = intValue2;
        }
        if ((intValue2 & 48) == 0) {
            i |= fidVar.c(intValue) ? 32 : 16;
        }
        boolean z = true;
        bts btsVar = (bts) fidVar;
        if (btsVar.V(i & 1, (i & 147) != 146)) {
            String str = (String) this.a.get(intValue);
            btsVar.e0(839004261);
            boolean z2 = ((Number) this.A.getValue()).intValue() == intValue;
            long j = z2 ? this.b : this.c;
            tse tseVar = this.w;
            boolean e = btsVar.e(tseVar);
            b bVar = this.x;
            boolean k = e | btsVar.k(bVar);
            if ((((i & 112) ^ 48) <= 32 || !btsVar.c(intValue)) && (i & 48) != 32) {
                z = false;
            }
            boolean z3 = k | z;
            Object Q = btsVar.Q();
            if (z3 || Q == did.a) {
                Q = new g(tseVar, bVar, intValue);
                btsVar.o0(Q);
            }
            ay41.a(str, (sls) Q, j, this.y, z2, this.z, btsVar, 0);
            btsVar.t(false);
        } else {
            btsVar.Y();
        }
        return zy11.a;
    }
}
