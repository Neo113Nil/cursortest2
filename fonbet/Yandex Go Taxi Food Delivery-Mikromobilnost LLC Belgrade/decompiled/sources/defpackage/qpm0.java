package defpackage;

import com.yandex.go.scooters.parking.d;
import java.util.Collections;
import java.util.Set;
import kotlin.collections.EmptySet;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.yandex.taxi.masstransit.trains.search.b;

/* loaded from: classes5.dex */
public final /* synthetic */ class qpm0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ String b;

    public /* synthetic */ qpm0(String str, int i) {
        this.a = i;
        this.b = str;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        String str = this.b;
        zy11 zy11Var = zy11.a;
        int i2 = 1;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                vza1.b(str, (fid) obj, vng.O(1));
                return zy11Var;
            case 1:
                ((Integer) obj2).getClass();
                d.h(str, (fid) obj, vng.O(1));
                return zy11Var;
            case 2:
                ((Integer) obj2).getClass();
                v4b1.d(str, (fid) obj, vng.O(1));
                return zy11Var;
            case 3:
                ((Integer) obj2).getClass();
                d5b1.b(str, (fid) obj, vng.O(1));
                return zy11Var;
            case 4:
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    vqy0.c(this.b, null, 0L, 0L, null, 0L, null, 0L, 0, false, 0, 0, null, btsVar, 0, 0, 262142);
                } else {
                    btsVar.Y();
                }
                return zy11Var;
            case 5:
                ((Integer) obj2).getClass();
                bfb1.b(str, (fid) obj, vng.O(1));
                return zy11Var;
            case 6:
                fid fidVar2 = (fid) obj;
                int intValue2 = ((Integer) obj2).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (btsVar2.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                    ymb1.e(this.b, null, ((el51) btsVar2.m(gl51.a)).o(), null, null, null, 0L, 0L, 0L, null, 0, false, 0, null, null, btsVar2, 0, 0, 65530);
                } else {
                    btsVar2.Y();
                }
                return zy11Var;
            case 7:
                fid fidVar3 = (fid) obj;
                int intValue3 = ((Integer) obj2).intValue();
                bts btsVar3 = (bts) fidVar3;
                if (btsVar3.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                    ymb1.f(this.b, an91.o(c530.a, 0.0f, 0.0f, 8.0f, 0.0f, 11), 0L, null, null, null, 0L, 0L, 0L, null, 0, false, 2, null, null, btsVar3, 48, HProv.ALG_TYPE_SECURECHANNEL, 57340);
                } else {
                    btsVar3.Y();
                }
                return zy11Var;
            case 8:
                ((Integer) obj2).getClass();
                iqb1.a(str, (fid) obj, vng.O(1));
                return zy11Var;
            case 9:
                ((Integer) obj2).getClass();
                b.b(str, (fid) obj, vng.O(1));
                return zy11Var;
            case 10:
                Set set = (Set) obj2;
                return set != null ? v4r0.i(set, str) : Collections.singleton(str);
            case 11:
                Set set2 = (Set) obj2;
                return v4r0.h(Collections.singleton("UnifiedPollingRepositoryImpl:SPECIAL_ONE_TIME_ID"), set2 != null ? v4r0.f(set2, str) : EmptySet.a);
            default:
                fid fidVar4 = (fid) obj;
                int intValue4 = ((Integer) obj2).intValue();
                bts btsVar4 = (bts) fidVar4;
                if (btsVar4.V(intValue4 & 1, (intValue4 & 3) != 2)) {
                    boolean k = btsVar4.k(str);
                    Object Q = btsVar4.Q();
                    if (k || Q == did.a) {
                        Q = new lv21(str, i2);
                        btsVar4.o0(Q);
                    }
                    s3b1.f(new cuj0(vzg0.ic_tracking_copy, null, Boolean.TRUE, null, 26), fnq0.a(c530.a, (tls) Q), null, btsVar4, 0, 4);
                } else {
                    btsVar4.Y();
                }
                return zy11Var;
        }
    }

    public /* synthetic */ qpm0(String str, int i, int i2) {
        this.a = i2;
        this.b = str;
    }
}
