package defpackage;

import com.yandex.go.ai_widget.ui.a;
import com.yandex.go.ai_widget.ui.component.b;
import java.util.List;

/* loaded from: classes5.dex */
public final /* synthetic */ class wo1 implements wls {
    public final /* synthetic */ Object A;
    public final /* synthetic */ int a = 3;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ tls c;
    public final /* synthetic */ Object w;
    public final /* synthetic */ Object x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ wo1(up1 up1Var, boolean z, b bVar, tls tlsVar, oz40 oz40Var, m3u0 m3u0Var, m3u0 m3u0Var2) {
        this.w = up1Var;
        this.b = z;
        this.x = bVar;
        this.c = tlsVar;
        this.y = oz40Var;
        this.z = m3u0Var;
        this.A = m3u0Var2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        boolean z = this.b;
        zy11 zy11Var = zy11.a;
        Object obj3 = this.A;
        Object obj4 = this.z;
        Object obj5 = this.y;
        Object obj6 = this.x;
        Object obj7 = this.w;
        switch (i) {
            case 0:
                up1 up1Var = (up1) obj7;
                b bVar = (b) obj6;
                oz40 oz40Var = (oz40) obj5;
                m3u0 m3u0Var = (m3u0) obj4;
                m3u0 m3u0Var2 = (m3u0) obj3;
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(1 & intValue, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    a.e(((Boolean) oz40Var.getValue()).booleanValue(), up1Var.c, up1Var.d, ((Number) m3u0Var.getValue()).floatValue(), ((Number) m3u0Var2.getValue()).floatValue(), btsVar, 0);
                    if (!z) {
                        btsVar.e0(1680470138);
                        a.d(up1Var, bVar, this.c, btsVar, 0);
                        btsVar.t(false);
                        break;
                    } else {
                        btsVar.e0(1680613327);
                        btsVar.t(false);
                        break;
                    }
                }
            case 1:
                ((Integer) obj2).getClass();
                dha1.a((pd5) obj7, (List) obj6, this.b, this.c, (sls) obj5, (sls) obj4, (sls) obj3, (fid) obj, vng.O(1));
                break;
            case 2:
                ((Integer) obj2).getClass();
                ru.yandex.taxi.favorites.address.impl.ui.a.b(this.b, (String) obj7, (String) obj6, (uu21) obj4, (u5t0) obj3, (oz40) obj5, this.c, (fid) obj, vng.O(196609));
                break;
            case 3:
                ((Integer) obj2).getClass();
                com.yandex.go.masstransit.sdk.externalservice.impl.mosmetro_otp.uicomponents.a.d((String) obj7, (Integer) obj6, this.b, (String) obj5, this.c, (tls) obj4, (f530) obj3, (fid) obj, vng.O(12583297));
                break;
            default:
                y9o y9oVar = (y9o) obj7;
                wg6 wg6Var = (wg6) obj6;
                kz6 kz6Var = (kz6) obj5;
                je31 je31Var = (je31) obj4;
                z0a0 z0a0Var = (z0a0) obj3;
                fid fidVar2 = (fid) obj;
                int intValue2 = ((Integer) obj2).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(1 & intValue2, (intValue2 & 3) != 2)) {
                    btsVar2.Y();
                    break;
                } else {
                    tls tlsVar = this.c;
                    if (!z) {
                        if (kz6Var == null) {
                            btsVar2.e0(-243411960);
                            btsVar2.t(false);
                            break;
                        } else {
                            btsVar2.e0(-243628805);
                            tb31.a(je31Var, kz6Var, z0a0Var, tlsVar, btsVar2, 0);
                            btsVar2.t(false);
                            break;
                        }
                    } else {
                        btsVar2.e0(-243804544);
                        tb31.b(y9oVar, wg6Var, tlsVar, btsVar2, 0);
                        btsVar2.t(false);
                        break;
                    }
                }
        }
        return zy11Var;
    }

    public /* synthetic */ wo1(pd5 pd5Var, List list, boolean z, tls tlsVar, sls slsVar, sls slsVar2, sls slsVar3, int i) {
        this.w = pd5Var;
        this.x = list;
        this.b = z;
        this.c = tlsVar;
        this.y = slsVar;
        this.z = slsVar2;
        this.A = slsVar3;
    }

    public /* synthetic */ wo1(String str, Integer num, boolean z, String str2, tls tlsVar, tls tlsVar2, f530 f530Var, int i) {
        this.w = str;
        this.x = num;
        this.b = z;
        this.y = str2;
        this.c = tlsVar;
        this.z = tlsVar2;
        this.A = f530Var;
    }

    public /* synthetic */ wo1(boolean z, y9o y9oVar, wg6 wg6Var, tls tlsVar, kz6 kz6Var, je31 je31Var, z0a0 z0a0Var) {
        this.b = z;
        this.w = y9oVar;
        this.x = wg6Var;
        this.c = tlsVar;
        this.y = kz6Var;
        this.z = je31Var;
        this.A = z0a0Var;
    }

    public /* synthetic */ wo1(boolean z, String str, String str2, uu21 uu21Var, u5t0 u5t0Var, oz40 oz40Var, tls tlsVar, int i) {
        this.b = z;
        this.w = str;
        this.x = str2;
        this.z = uu21Var;
        this.A = u5t0Var;
        this.y = oz40Var;
        this.c = tlsVar;
    }
}
