package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import com.yandex.go.design.view.GoImageView;
import ru.yandex.taxi.design.ListItemComponent;
import ru.yandex.taxi.logistics.sdk.ui.component.control.a;
import ru.yandex.taxi.logistics.sdk.ui.theme.YandexShapes;
import ru.yandex.taxi.masstransit.trains.search.b;

/* loaded from: classes5.dex */
public final /* synthetic */ class us4 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ sls b;

    public /* synthetic */ us4(int i, sls slsVar) {
        this.a = i;
        this.b = slsVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        c530 c530Var = c530.a;
        Object[] objArr = 0;
        zy11 zy11Var = zy11.a;
        sls slsVar = this.b;
        int i2 = 1;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    long g = ((el51) btsVar.m(gl51.a)).g();
                    f530 c = ljs0.c(ljs0.e(an91.k(c530Var, 8.0f), 56.0f), 1.0f);
                    byk0 b = ((YandexShapes) btsVar.m(qm51.a)).b();
                    v2d.a.getClass();
                    a.b(this.b, c, b, g, 0L, null, null, null, false, null, null, null, v2d.b, btsVar, 0, 384, 4080);
                    break;
                }
            case 1:
                fid fidVar2 = (fid) obj;
                int intValue2 = ((Integer) obj2).intValue();
                bts btsVar2 = (bts) fidVar2;
                if (!btsVar2.V(intValue2 & 1, (intValue2 & 3) != 2)) {
                    btsVar2.Y();
                    break;
                } else {
                    iab1.b(null, slsVar, btsVar2, 0, 1);
                    break;
                }
            case 2:
                fid fidVar3 = (fid) obj;
                int intValue3 = ((Integer) obj2).intValue();
                bts btsVar3 = (bts) fidVar3;
                if (!btsVar3.V(intValue3 & 1, (intValue3 & 3) != 2)) {
                    btsVar3.Y();
                    break;
                } else {
                    mab1.b(0, btsVar3, slsVar, null);
                    break;
                }
            case 3:
                fid fidVar4 = (fid) obj;
                int intValue4 = ((Integer) obj2).intValue();
                bts btsVar4 = (bts) fidVar4;
                if (!btsVar4.V(intValue4 & 1, (intValue4 & 3) != 2)) {
                    btsVar4.Y();
                    break;
                } else {
                    mab1.b(0, btsVar4, slsVar, null);
                    break;
                }
            case 4:
                fid fidVar5 = (fid) obj;
                int intValue5 = ((Integer) obj2).intValue();
                bts btsVar5 = (bts) fidVar5;
                if (!btsVar5.V(intValue5 & 1, (intValue5 & 3) != 2)) {
                    btsVar5.Y();
                    break;
                } else {
                    btsVar5.e0(-89452312);
                    btsVar5.t(false);
                    break;
                }
            case 5:
                fid fidVar6 = (fid) obj;
                int intValue6 = ((Integer) obj2).intValue();
                bts btsVar6 = (bts) fidVar6;
                if (!btsVar6.V(intValue6 & 1, (intValue6 & 3) != 2)) {
                    btsVar6.Y();
                    break;
                } else {
                    xqb1.b(null, slsVar, btsVar6, 0, 1);
                    break;
                }
            case 6:
                fid fidVar7 = (fid) obj;
                int intValue7 = ((Integer) obj2).intValue();
                bts btsVar7 = (bts) fidVar7;
                if (!btsVar7.V(intValue7 & 1, (intValue7 & 3) != 2)) {
                    btsVar7.Y();
                    break;
                } else {
                    Object Q = btsVar7.Q();
                    if (Q == did.a) {
                        Q = new l0o(2);
                        btsVar7.o0(Q);
                    }
                    xqb1.b(fnq0.b(c530Var, false, (tls) Q), slsVar, btsVar7, 0, 0);
                    break;
                }
            case 7:
                fid fidVar8 = (fid) obj;
                int intValue8 = ((Integer) obj2).intValue();
                bts btsVar8 = (bts) fidVar8;
                if (!btsVar8.V(intValue8 & 1, (intValue8 & 3) != 2)) {
                    btsVar8.Y();
                    break;
                } else {
                    xqb1.b(null, slsVar, btsVar8, 0, 1);
                    break;
                }
            case 8:
                ((Integer) obj2).getClass();
                xqb1.a(slsVar, (fid) obj, vng.O(1));
                break;
            case 9:
                View inflate = ((LayoutInflater) obj).inflate(uuh0.organizations_retry_loading_item, (ViewGroup) obj2, false);
                int i3 = o6h0.reload_icon;
                if (((GoImageView) cma1.O(i3, inflate)) != null) {
                    i3 = o6h0.reload_list_item;
                    ListItemComponent listItemComponent = (ListItemComponent) cma1.O(i3, inflate);
                    if (listItemComponent != null) {
                        LinearLayout linearLayout = (LinearLayout) inflate;
                        break;
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
                break;
            case 10:
                ((Integer) obj2).getClass();
                h6b1.a(slsVar, (fid) obj, vng.O(1));
                break;
            case 11:
                View inflate2 = ((LayoutInflater) obj).inflate(zkh0.modal_default_slider_item, (ViewGroup) obj2, false);
                if (inflate2 == null) {
                    ny61.t("rootView");
                    break;
                } else {
                    break;
                }
            case 12:
                fid fidVar9 = (fid) obj;
                int intValue9 = ((Integer) obj2).intValue();
                bts btsVar9 = (bts) fidVar9;
                if (!btsVar9.V(intValue9 & 1, (intValue9 & 3) != 2)) {
                    btsVar9.Y();
                    break;
                } else {
                    pkb1.a(0, btsVar9, slsVar, null);
                    break;
                }
            case 13:
                fid fidVar10 = (fid) obj;
                int intValue10 = ((Integer) obj2).intValue();
                bts btsVar10 = (bts) fidVar10;
                if (!btsVar10.V(intValue10 & 1, (intValue10 & 3) != 2)) {
                    btsVar10.Y();
                    break;
                } else {
                    xqb1.b(null, slsVar, btsVar10, 0, 1);
                    break;
                }
            default:
                ((Integer) obj2).getClass();
                b.c(slsVar, (fid) obj, vng.O(1));
                break;
        }
        return zy11Var;
    }

    public /* synthetic */ us4(sls slsVar, int i, int i2) {
        this.a = i2;
        this.b = slsVar;
    }
}
