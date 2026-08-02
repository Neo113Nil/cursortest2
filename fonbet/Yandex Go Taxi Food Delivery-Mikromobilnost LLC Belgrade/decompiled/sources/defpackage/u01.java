package defpackage;

import androidx.compose.runtime.internal.a;

/* loaded from: classes12.dex */
public final /* synthetic */ class u01 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ int w;

    public /* synthetic */ u01(int i, int i2, a aVar, Object obj) {
        this.a = i2;
        this.b = aVar;
        this.c = obj;
        this.w = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        int i2 = this.w;
        Object obj3 = this.c;
        a aVar = this.b;
        fid fidVar = (fid) obj;
        int intValue = ((Integer) obj2).intValue();
        switch (i) {
            case 0:
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    aVar.invoke(obj3, btsVar, Integer.valueOf(i2 & 8));
                    break;
                }
            default:
                bts btsVar2 = (bts) fidVar;
                if (!btsVar2.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar2.Y();
                    break;
                } else {
                    aVar.invoke(obj3, btsVar2, Integer.valueOf(i2 & 8));
                    break;
                }
        }
        return zy11Var;
    }
}
