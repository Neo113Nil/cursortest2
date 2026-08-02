package defpackage;

import androidx.compose.runtime.internal.a;
import androidx.compose.ui.unit.LayoutDirection;

/* loaded from: classes10.dex */
public final /* synthetic */ class wq1 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ cms w;

    public /* synthetic */ wq1(float f, LayoutDirection layoutDirection, a aVar) {
        this.a = 0;
        this.b = f;
        this.c = layoutDirection;
        this.w = aVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        cms cmsVar = this.w;
        float f = this.b;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                LayoutDirection layoutDirection = (LayoutDirection) obj3;
                a aVar = (a) cmsVar;
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    vqr.c(null, new i43(8.0f, true, new quz(11)), new i43(f, true, new quz(11)), null, 0, 0, wwg.S(879927511, true, new u5(23, layoutDirection, aVar), btsVar), btsVar, 1572864, 57);
                    break;
                }
            case 1:
                ((Integer) obj2).getClass();
                ru.yandex.logistics.sdk.cargo_form.impl.ui.widgets.wheel_picker.a.b((vx41) obj3, f, (tls) cmsVar, (fid) obj, vng.O(7));
                break;
            default:
                ((Integer) obj2).getClass();
                v1b1.b((t1y) obj3, f, (a) cmsVar, (fid) obj, vng.O(3079));
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ wq1(Object obj, float f, cms cmsVar, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.b = f;
        this.w = cmsVar;
    }
}
