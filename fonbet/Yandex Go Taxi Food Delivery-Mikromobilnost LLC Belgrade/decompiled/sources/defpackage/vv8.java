package defpackage;

import androidx.compose.runtime.internal.a;
import ru.yandex.logistics.sdk.cargo_form.impl.ui.c;

/* loaded from: classes5.dex */
public final /* synthetic */ class vv8 implements wls {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ vv8(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i, int i2) {
        this.a = i2;
        this.c = obj;
        this.w = obj2;
        this.x = obj3;
        this.y = obj4;
        this.z = obj5;
        this.A = obj6;
        this.B = obj7;
        this.C = obj8;
        this.b = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.b;
        Object obj3 = this.C;
        Object obj4 = this.A;
        zy11 zy11Var = zy11.a;
        Object obj5 = this.B;
        Object obj6 = this.z;
        Object obj7 = this.y;
        Object obj8 = this.x;
        Object obj9 = this.w;
        Object obj10 = this.c;
        switch (i) {
            case 0:
                c cVar = (c) obj10;
                oz40 oz40Var = (oz40) obj9;
                oz40 oz40Var2 = (oz40) obj8;
                oz40 oz40Var3 = (oz40) obj7;
                oip0 oip0Var = (oip0) obj6;
                qkg qkgVar = (qkg) obj4;
                qkg qkgVar2 = (qkg) obj5;
                ldc ldcVar = (ldc) obj3;
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    cVar.d(oz40Var, oz40Var2, oz40Var3, oip0Var, qkgVar, !qkgVar2.a.isEmpty(), ldcVar, this.b, btsVar, 0);
                    break;
                }
            case 1:
                ((Integer) obj2).getClass();
                ((a) obj10).d((so41) obj9, (on41) obj8, (on41) obj7, (on41) obj6, this.A, (zls) obj5, this.C, (fid) obj, vng.O(i2) | 1);
                break;
            default:
                ((Integer) obj2).getClass();
                com.yandex.go.summary.ui.compose.expanded.content.tariffcard.c.h((cex0) obj10, (cex0) obj9, (f530) obj8, (m3u0) obj7, (tls) obj6, (tpr) obj4, (yur) obj5, (yur) obj3, (fid) obj, vng.O(i2 | 1));
                break;
        }
        return zy11Var;
    }
}
