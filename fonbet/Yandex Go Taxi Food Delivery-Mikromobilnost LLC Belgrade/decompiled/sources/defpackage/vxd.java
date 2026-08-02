package defpackage;

import com.yandex.go.design.compose.colors.AppColor$Palette;
import com.yandex.go.design.compose.platform.statusbar.a;
import java.util.List;
import ru.yandex.taxi.masstransit.trains.search.b;

/* loaded from: classes11.dex */
public final /* synthetic */ class vxd implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ boolean b;

    public /* synthetic */ vxd(vs20 vs20Var, boolean z) {
        this.a = 2;
        this.b = z;
    }

    /* JADX WARN: Code restructure failed: missing block: B:63:0x01c8, code lost:
    
        if (r2.equals(ru.CryptoPro.JCP.tools.CertReader.Extension.DOT_CHAR) == false) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x01d1, code lost:
    
        if (r2.equals("") == false) goto L67;
     */
    @Override // defpackage.wls
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        boolean z = this.b;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                rpb1.a(z, (fid) obj, vng.O(1));
                break;
            case 1:
                ((Integer) obj2).getClass();
                i4a1.c(z, (fid) obj, vng.O(1));
                break;
            case 2:
                List list = (List) obj;
                String str = (String) obj2;
                int hashCode = str.hashCode();
                if (hashCode == 0) {
                    break;
                } else if (hashCode == 46) {
                    break;
                } else {
                    if (hashCode == 1472 && str.equals("..")) {
                        if (!z) {
                            if (list.size() > 0 && !jl40.l(list.get(list.size() - 1), "..")) {
                                if (!list.isEmpty()) {
                                    list.remove(list.size() - 1);
                                    break;
                                }
                            } else {
                                list.add("..");
                                break;
                            }
                        } else if (!list.isEmpty()) {
                            list.remove(list.size() - 1);
                            break;
                        }
                    }
                    list.add(str);
                    break;
                }
                break;
            case 3:
                ((Integer) obj2).getClass();
                tka0.c(z, (fid) obj, vng.O(1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                tka0.c(z, (fid) obj, vng.O(1));
                break;
            case 5:
                ((Integer) obj2).getClass();
                si91.a(z, (fid) obj, vng.O(1));
                break;
            case 6:
                break;
            case 7:
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    cuj0 cuj0Var = new cuj0(wzg0.ic_delivery_chevron_down, null, null, new zez0(((el51) btsVar.m(gl51.a)).o()), 22);
                    f530 f530Var = c530.a;
                    if (z) {
                        f530Var = ira1.i(f530Var, 180.0f);
                    }
                    s3b1.f(cuj0Var, f530Var, null, btsVar, 0, 4);
                    break;
                }
            case 8:
                fid fidVar2 = (fid) obj;
                int intValue2 = ((Integer) obj2).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(1 & intValue2, (intValue2 & 3) != 2)) {
                    btsVar2.Y();
                    break;
                } else if (!z) {
                    btsVar2.e0(-803891559);
                    yqb1.e(ohb1.e(btsVar2, kyh0.mt_schedule_header), null, null, xya1.e(btsVar2).g.b, 0, 0, null, null, null, 0, 0, btsVar2, 0, 2038);
                    btsVar2.t(false);
                    break;
                } else {
                    btsVar2.e0(-804204349);
                    yqb1.e(ohb1.e(btsVar2, kyh0.mt_schedule_header), null, null, xya1.e(btsVar2).g.b, 0, 0, ohb1.e(btsVar2, kyh0.mt_schedule_subtitle), AppColor$Palette.TextMinor, xya1.e(btsVar2).h.a, 0, 0, btsVar2, 12582912, 1590);
                    btsVar2.t(false);
                    break;
                }
            case 9:
                ((Integer) obj2).getClass();
                a.a(z, (fid) obj, vng.O(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                b.e(z, (fid) obj, vng.O(1));
                break;
            default:
                ((Integer) obj2).getClass();
                tb31.f(z, (fid) obj, vng.O(7));
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ vxd(boolean z, int i) {
        this.a = i;
        this.b = z;
    }

    public /* synthetic */ vxd(boolean z, int i, int i2) {
        this.a = i2;
        this.b = z;
    }
}
