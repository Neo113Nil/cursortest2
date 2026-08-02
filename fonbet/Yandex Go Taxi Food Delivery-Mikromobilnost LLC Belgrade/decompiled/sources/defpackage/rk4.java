package defpackage;

import androidx.compose.animation.a;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.logistics.sdk.ui.theme.YandexShapes;

/* loaded from: classes5.dex */
public final /* synthetic */ class rk4 implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;
    public final /* synthetic */ long c;

    public /* synthetic */ rk4(long j, String str) {
        this.a = 3;
        this.c = j;
        this.b = str;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        c530 c530Var = c530.a;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    btsVar.Y();
                    break;
                } else {
                    ymb1.a(this.b, null, this.c, null, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar, 0, 65530);
                    break;
                }
            case 1:
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 17) != 16)) {
                    btsVar2.Y();
                    break;
                } else {
                    ymb1.a(this.b, null, this.c, lzr.E, null, 0L, uh6.E(17), 0L, null, 0, false, 0, null, null, btsVar2, 12607488, 65386);
                    break;
                }
            case 2:
                fid fidVar3 = (fid) obj2;
                int intValue3 = ((Integer) obj3).intValue();
                bts btsVar3 = (bts) fidVar3;
                if (!btsVar3.V(intValue3 & 1, (intValue3 & 17) != 16)) {
                    btsVar3.Y();
                    break;
                } else {
                    ymb1.b(this.b, null, this.c, null, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar3, 0);
                    break;
                }
            case 3:
                ((Integer) obj3).getClass();
                bts btsVar4 = (bts) ((fid) obj2);
                f530 b = m4m0.b(ljs0.c(c530Var, 1.0f), this.c, ((YandexShapes) btsVar4.m(qm51.a)).d());
                String str = this.b;
                boolean k = btsVar4.k(str);
                Object Q = btsVar4.Q();
                Object obj4 = did.a;
                if (k || Q == obj4) {
                    Q = new wwb(str, 25);
                    btsVar4.o0(Q);
                }
                f530 a = fnq0.a(b, (tls) Q);
                Object Q2 = btsVar4.Q();
                if (Q2 == obj4) {
                    Q2 = new urm(18);
                    btsVar4.o0(Q2);
                }
                z6d.a.getClass();
                a.b(str, a, (tls) Q2, null, null, null, z6d.b, btsVar4, 1573248, 56);
                break;
            default:
                fid fidVar4 = (fid) obj2;
                int intValue4 = ((Integer) obj3).intValue();
                bts btsVar5 = (bts) fidVar4;
                if (!btsVar5.V(intValue4 & 1, (intValue4 & 17) != 16)) {
                    btsVar5.Y();
                    break;
                } else {
                    ymb1.f(this.b, an91.m(c530Var, 12.0f, 0.0f, 2), this.c, null, null, null, 0L, 0L, 0L, null, 0, false, 1, null, null, btsVar5, 48, HProv.ALG_TYPE_SECURECHANNEL, 57336);
                    break;
                }
        }
        return zy11Var;
    }

    public /* synthetic */ rk4(String str, long j, int i) {
        this.a = i;
        this.b = str;
        this.c = j;
    }
}
