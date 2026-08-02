package defpackage;

import androidx.compose.runtime.internal.a;
import ru.yandex.taxi.masstransit.geopayment.purchase.b;

/* loaded from: classes12.dex */
public final /* synthetic */ class v01 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ a c;

    public /* synthetic */ v01(int i, int i2, a aVar, Object obj) {
        this.a = i2;
        this.b = obj;
        this.c = aVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        a aVar = this.c;
        Object obj3 = this.b;
        fid fidVar = (fid) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                com.yandex.go.address.address_map_picker.ui.a.b(obj3, aVar, fidVar, vng.O(49));
                break;
            default:
                b.a(obj3, aVar, fidVar, vng.O(49));
                break;
        }
        return zy11Var;
    }
}
