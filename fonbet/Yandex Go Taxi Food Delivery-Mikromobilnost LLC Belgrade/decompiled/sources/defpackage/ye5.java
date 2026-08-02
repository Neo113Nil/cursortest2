package defpackage;

import androidx.compose.foundation.lazy.b;
import androidx.compose.runtime.internal.a;
import com.yandex.go.design.compose.button.utils.ButtonSize;
import com.yandex.go.design.compose.check.CheckSize;
import com.yandex.go.design.compose.check.CheckState;
import com.yandex.go.navigator.compose.button.CustomButtonStyle;
import com.yandex.go.scooters.passes.purchase.packages.f;
import defpackage.dh30;
import defpackage.h711;
import defpackage.ib11;
import defpackage.tje;
import defpackage.tls;
import defpackage.zy11;
import java.util.List;
import ru.yandex.taxi.logistics.sdk.photocomments.PhotocommentsMode;

/* loaded from: classes10.dex */
public final /* synthetic */ class ye5 implements wls {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ ye5(q8h q8hVar, CheckState checkState, f530 f530Var, CheckSize checkSize, sls slsVar, boolean z, int i) {
        this.a = 3;
        this.w = q8hVar;
        this.x = checkState;
        this.y = f530Var;
        this.z = checkSize;
        this.A = slsVar;
        this.b = z;
        this.c = i;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        int i2 = this.c;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.A;
        Object obj4 = this.z;
        Object obj5 = this.y;
        Object obj6 = this.x;
        Object obj7 = this.w;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                n5b1.b((u9e0) obj7, (svz0) obj6, (tse) obj5, this.b, (oz40) obj4, (a) obj3, (fid) obj, vng.O(i2 | 1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                u691.b((hfa) obj7, this.b, (f530) obj6, (tls) obj5, (tls) obj4, (sls) obj3, (fid) obj, vng.O(i2 | 1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                bke.c((String) obj7, this.b, (yje) obj6, (f530) obj5, (zls) obj4, (sls) obj3, (fid) obj, vng.O(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                ((q8h) obj7).a((CheckState) obj6, (f530) obj5, (CheckSize) obj4, (sls) obj3, this.b, (fid) obj, vng.O(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                bqa1.b((f530) obj7, this.b, (ButtonSize) obj6, (CustomButtonStyle) obj5, (sls) obj4, (zls) obj3, (fid) obj, vng.O(i2 | 1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                zl10.b((wls) obj7, (sls) obj6, (f530) obj5, this.b, (jl10) obj4, (j690) obj3, (fid) obj, vng.O(i2 | 1));
                break;
            case 6:
                ai30 ai30Var = (ai30) obj7;
                final tls tlsVar = (tls) obj6;
                final tse tseVar = (tse) obj5;
                final b bVar = (b) obj4;
                final wg6 wg6Var = (wg6) obj3;
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    List list = ai30Var.c;
                    boolean k = btsVar.k(tlsVar);
                    Object Q = btsVar.Q();
                    o430 o430Var = did.a;
                    if (k || Q == o430Var) {
                        Q = new adp(13, tlsVar);
                        btsVar.o0(Q);
                    }
                    tls tlsVar2 = (tls) Q;
                    boolean k2 = btsVar.k(tlsVar);
                    Object Q2 = btsVar.Q();
                    if (k2 || Q2 == o430Var) {
                        Q2 = new adp(14, tlsVar);
                        btsVar.o0(Q2);
                    }
                    tls tlsVar3 = (tls) Q2;
                    boolean k3 = btsVar.k(tlsVar);
                    Object Q3 = btsVar.Q();
                    if (k3 || Q3 == o430Var) {
                        Q3 = new adp(15, tlsVar);
                        btsVar.o0(Q3);
                    }
                    tls tlsVar4 = (tls) Q3;
                    boolean k4 = btsVar.k(tlsVar);
                    Object Q4 = btsVar.Q();
                    if (k4 || Q4 == o430Var) {
                        Q4 = new adp(16, tlsVar);
                        btsVar.o0(Q4);
                    }
                    tls tlsVar5 = (tls) Q4;
                    boolean k5 = btsVar.k(tlsVar) | btsVar.e(tseVar) | btsVar.k(bVar);
                    final boolean z = this.b;
                    boolean a = k5 | btsVar.a(z) | btsVar.k(wg6Var);
                    final int i3 = this.c;
                    boolean c = a | btsVar.c(i3);
                    Object Q5 = btsVar.Q();
                    if (c || Q5 == o430Var) {
                        wls wlsVar = new wls() { // from class: ru.yandex.taxi.masstransit.detailedroute.ui.v2.b
                            @Override // defpackage.wls
                            public final Object invoke(Object obj8, Object obj9) {
                                tls.this.invoke(new dh30((h711) obj8, (ib11) obj9));
                                tje.N(tseVar, null, null, new MtDetailedRouteScreenKt$SheetBody$1$1$5$1$1(bVar, z, wg6Var, i3, null), 3);
                                return zy11.a;
                            }
                        };
                        btsVar.o0(wlsVar);
                        Q5 = wlsVar;
                    }
                    wls wlsVar2 = (wls) Q5;
                    Object Q6 = btsVar.Q();
                    if (Q6 == o430Var) {
                        Q6 = new ps20(28);
                        btsVar.o0(Q6);
                    }
                    gub1.b(list, null, tlsVar2, tlsVar3, tlsVar4, tlsVar5, wlsVar2, null, bVar, false, true, (tls) Q6, false, btsVar, 805306368, 54, 4226);
                    break;
                }
            case 7:
                ((Integer) obj2).getClass();
                hub1.b((f530) obj7, (xfh) obj6, this.b, (wp2) obj5, (sls) obj4, (a) obj3, (fid) obj, vng.O(i2 | 1));
                break;
            case 8:
                ((Integer) obj2).getClass();
                ru.yandex.taxi.logistics.sdk.photocomments.a.a((hkb0) obj7, (String) obj6, this.b, (PhotocommentsMode) obj5, (tkb0) obj4, (tls) obj3, (fid) obj, vng.O(i2 | 1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                ru.yandex.taxi.logistics.sdk.photocomments.a.i((pa90) obj7, this.b, (String) obj6, (PhotocommentsMode) obj5, (tkb0) obj4, (sls) obj3, (fid) obj, vng.O(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                f.b((bj6) obj7, (p8o0) obj6, this.b, (tls) obj5, (oip0) obj4, (yx40) obj3, (fid) obj, vng.O(i2 | 1));
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ ye5(ai30 ai30Var, tls tlsVar, tse tseVar, b bVar, boolean z, wg6 wg6Var, int i) {
        this.a = 6;
        this.w = ai30Var;
        this.x = tlsVar;
        this.y = tseVar;
        this.z = bVar;
        this.b = z;
        this.A = wg6Var;
        this.c = i;
    }

    public /* synthetic */ ye5(Object obj, Object obj2, Object obj3, boolean z, Object obj4, Object obj5, int i, int i2) {
        this.a = i2;
        this.w = obj;
        this.x = obj2;
        this.y = obj3;
        this.b = z;
        this.z = obj4;
        this.A = obj5;
        this.c = i;
    }

    public /* synthetic */ ye5(Object obj, Object obj2, boolean z, Object obj3, Object obj4, Object obj5, int i, int i2) {
        this.a = i2;
        this.w = obj;
        this.x = obj2;
        this.b = z;
        this.y = obj3;
        this.z = obj4;
        this.A = obj5;
        this.c = i;
    }

    public /* synthetic */ ye5(Object obj, boolean z, Object obj2, Object obj3, Object obj4, cms cmsVar, int i, int i2) {
        this.a = i2;
        this.w = obj;
        this.b = z;
        this.x = obj2;
        this.y = obj3;
        this.z = obj4;
        this.A = cmsVar;
        this.c = i;
    }
}
