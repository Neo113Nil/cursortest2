package defpackage;

import androidx.compose.material.a;
import androidx.compose.material3.internal.h;

/* loaded from: classes10.dex */
public final /* synthetic */ class smy0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ long b;
    public final /* synthetic */ wls c;

    public /* synthetic */ smy0(long j, wls wlsVar, int i) {
        this.a = 0;
        this.b = j;
        this.c = wlsVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        wls wlsVar = this.c;
        long j = this.b;
        zy11 zy11Var = zy11.a;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                h.c(j, wlsVar, (fid) obj, vng.O(1));
                break;
            case 1:
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    h.c(j, wlsVar, btsVar, 0);
                    break;
                }
            case 2:
                fid fidVar2 = (fid) obj;
                int intValue2 = ((Integer) obj2).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                    btsVar2.Y();
                    break;
                } else {
                    h.c(j, wlsVar, btsVar2, 0);
                    break;
                }
            case 3:
                fid fidVar3 = (fid) obj;
                int intValue3 = ((Integer) obj2).intValue();
                bts btsVar3 = (bts) fidVar3;
                if (!btsVar3.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                    btsVar3.Y();
                    break;
                } else {
                    a.c(this.b, null, this.c, btsVar3, 0, 6);
                    break;
                }
            default:
                fid fidVar4 = (fid) obj;
                int intValue4 = ((Integer) obj2).intValue();
                bts btsVar4 = (bts) fidVar4;
                if (!btsVar4.V(intValue4 & 1, (intValue4 & 3) != 2)) {
                    btsVar4.Y();
                    break;
                } else {
                    a.c(this.b, null, this.c, btsVar4, 0, 6);
                    break;
                }
        }
        return zy11Var;
    }

    public /* synthetic */ smy0(long j, wls wlsVar, int i, byte b) {
        this.a = i;
        this.b = j;
        this.c = wlsVar;
    }
}
