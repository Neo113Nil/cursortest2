package defpackage;

import androidx.compose.runtime.internal.a;
import com.yandex.go.design.compose.colors.AppColor$Palette;

/* loaded from: classes.dex */
public final /* synthetic */ class vy2 implements wls {
    public final /* synthetic */ int a = 0;
    public final /* synthetic */ a b;

    public /* synthetic */ vy2(a aVar) {
        this.b = aVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        a aVar = this.b;
        fid fidVar = (fid) obj;
        Integer num = (Integer) obj2;
        switch (i) {
            case 0:
                int intValue = num.intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    k2z.a(AppColor$Palette.Background, AppColor$Palette.Text, aVar, btsVar, 54);
                    break;
                }
            default:
                num.getClass();
                fhe0.a(aVar, fidVar, vng.O(7));
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ vy2(a aVar, int i) {
        this.b = aVar;
    }
}
