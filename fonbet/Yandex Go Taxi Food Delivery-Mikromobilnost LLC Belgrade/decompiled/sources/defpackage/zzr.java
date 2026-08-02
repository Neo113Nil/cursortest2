package defpackage;

import com.yandex.go.design.compose.slot.body.BodyAlign;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

/* loaded from: classes11.dex */
public final /* synthetic */ class zzr implements zls {
    public final /* synthetic */ int a;
    public final /* synthetic */ dj70 b;

    public /* synthetic */ zzr(dj70 dj70Var, int i) {
        this.a = i;
        this.b = dj70Var;
    }

    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        dj70 dj70Var = this.b;
        int i2 = 1;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj2;
                int intValue = ((Integer) obj3).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 17) != 16)) {
                    btsVar.Y();
                    break;
                } else {
                    ydb1.a(null, null, wwg.S(773550490, true, new zzr(dj70Var, i2), btsVar), null, null, null, null, false, btsVar, 384, 251);
                    break;
                }
            default:
                ebp0 ebp0Var = (ebp0) obj;
                fid fidVar2 = (fid) obj2;
                int intValue2 = ((Integer) obj3).intValue();
                if ((intValue2 & 6) == 0) {
                    intValue2 |= ((bts) fidVar2).k(ebp0Var) ? 4 : 2;
                }
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 19) != 18)) {
                    btsVar2.Y();
                    break;
                } else {
                    f530 c = ljs0.c(ooc.d(c530.a, null, 3), 1.0f);
                    Object Q = btsVar2.Q();
                    if (Q == did.a) {
                        Q = new teb(20);
                        btsVar2.o0(Q);
                    }
                    tp2 tp2Var = tp2.a;
                    m9b1.b(ebp0Var, dj70Var.a, fnq0.a(c, (tls) Q), tp2Var, xya1.e(btsVar2).g.b, 0, 0, dj70Var.b, tp2Var, xya1.e(btsVar2).h.a, 0, 0, BodyAlign.Center, btsVar2, (intValue2 & 14) | 805309440, HProv.ALG_CLASS_DATA_ENCRYPT, 23664);
                    break;
                }
        }
        return zy11Var;
    }
}
