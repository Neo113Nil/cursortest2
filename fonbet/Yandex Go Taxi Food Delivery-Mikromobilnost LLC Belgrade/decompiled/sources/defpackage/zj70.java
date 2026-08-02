package defpackage;

import java.util.ArrayList;
import ru.yandex.taxi.logistics.sdk.tracking.impl.order_cancel_clarification.a;

/* loaded from: classes5.dex */
public final /* synthetic */ class zj70 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ wls c;

    public /* synthetic */ zj70(ArrayList arrayList, wls wlsVar, int i, int i2) {
        this.a = i2;
        this.b = arrayList;
        this.c = wlsVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        wls wlsVar = this.c;
        ArrayList arrayList = this.b;
        fid fidVar = (fid) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                a.c(arrayList, wlsVar, fidVar, vng.O(1));
                break;
            default:
                a.b(arrayList, wlsVar, fidVar, vng.O(1));
                break;
        }
        return zy11Var;
    }
}
