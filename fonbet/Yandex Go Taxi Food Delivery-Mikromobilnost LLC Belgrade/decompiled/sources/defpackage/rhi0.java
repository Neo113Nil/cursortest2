package defpackage;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.yandex.go.design.view.GoView;
import com.yandex.go.masstransit.sdk.order.impl.activation.c;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.design.SliderButtonView;
import ru.yandex.taxi.masstransit.trains.schedule.h;

/* loaded from: classes12.dex */
public final /* synthetic */ class rhi0 implements wls {
    public final /* synthetic */ int a;
    public final /* synthetic */ tls b;

    public /* synthetic */ rhi0(int i, int i2, tls tlsVar) {
        this.a = i2;
        this.b = tlsVar;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        int i = this.a;
        o430 o430Var = did.a;
        int i2 = 2;
        zy11 zy11Var = zy11.a;
        tls tlsVar = this.b;
        switch (i) {
            case 0:
                fid fidVar = (fid) obj;
                int intValue = ((Integer) obj2).intValue();
                bts btsVar = (bts) fidVar;
                if (!btsVar.V(intValue & 1, (intValue & 3) != 2)) {
                    btsVar.Y();
                    break;
                } else {
                    au2 b = hgb1.b();
                    String e = ohb1.e(btsVar, kyh0.select_current_geolocation_description);
                    boolean k = btsVar.k(tlsVar);
                    Object Q = btsVar.Q();
                    if (k || Q == o430Var) {
                        Q = new ukb0(25, tlsVar);
                        btsVar.o0(Q);
                    }
                    nab1.a(b, e, (sls) Q, null, btsVar, 0, 8);
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
                    au2 c = vza1.c();
                    String e2 = ohb1.e(btsVar2, kyh0.common_back);
                    boolean k2 = btsVar2.k(tlsVar);
                    Object Q2 = btsVar2.Q();
                    if (k2 || Q2 == o430Var) {
                        Q2 = new ukb0(29, tlsVar);
                        btsVar2.o0(Q2);
                    }
                    nab1.b(c, e2, (sls) Q2, null, btsVar2, 0, 8);
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
                    boolean k3 = btsVar3.k(tlsVar);
                    Object Q3 = btsVar3.Q();
                    if (k3 || Q3 == o430Var) {
                        Q3 = new v6k0(11, tlsVar);
                        btsVar3.o0(Q3);
                    }
                    xqb1.b(null, (sls) Q3, btsVar3, 0, 1);
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
                    boolean k4 = btsVar4.k(tlsVar);
                    Object Q4 = btsVar4.Q();
                    if (k4 || Q4 == o430Var) {
                        Q4 = new wzl0(4, tlsVar);
                        btsVar4.o0(Q4);
                    }
                    xqb1.b(null, (sls) Q4, btsVar4, 0, 1);
                    break;
                }
            case 4:
                View inflate = ((LayoutInflater) obj).inflate(ysh0.steps_instructions_button_item, (ViewGroup) obj2, false);
                int i3 = yhh0.button;
                ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i3, inflate);
                if (buttonComponent == null) {
                    ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
                    break;
                } else {
                    break;
                }
            case 5:
                View inflate2 = ((LayoutInflater) obj).inflate(ysh0.steps_instructions_slider_item, (ViewGroup) obj2, false);
                if (inflate2 == null) {
                    ny61.t("rootView");
                    break;
                } else {
                    SliderButtonView sliderButtonView = (SliderButtonView) inflate2;
                    break;
                }
            case 6:
                tlsVar.invoke(new evx0((z611) obj, ((Integer) obj2).intValue()));
                break;
            case 7:
                View inflate3 = ((LayoutInflater) obj).inflate(uqh0.mt_thread_variants_button_view_holder, (ViewGroup) obj2, false);
                int i4 = reh0.button;
                ButtonComponent buttonComponent2 = (ButtonComponent) cma1.O(i4, inflate3);
                if (buttonComponent2 != null) {
                    i4 = reh0.lead;
                    GoView goView = (GoView) cma1.O(i4, inflate3);
                    if (goView != null) {
                        break;
                    }
                }
                ny61.t("Missing required view with ID: ".concat(inflate3.getResources().getResourceName(i4)));
                break;
            case 8:
                ((Integer) obj2).getClass();
                c.h(tlsVar, (fid) obj, vng.O(1));
                break;
            case 9:
                ((Integer) obj2).getClass();
                h.a(tlsVar, (fid) obj, vng.O(1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                dk91.c(tlsVar, (fid) obj, vng.O(1));
                break;
            case 11:
                fid fidVar5 = (fid) obj;
                int intValue5 = ((Integer) obj2).intValue();
                bts btsVar5 = (bts) fidVar5;
                if (!btsVar5.V(intValue5 & 1, (intValue5 & 3) != 2)) {
                    btsVar5.Y();
                    break;
                } else {
                    boolean k5 = btsVar5.k(tlsVar);
                    Object Q5 = btsVar5.Q();
                    if (k5 || Q5 == o430Var) {
                        Q5 = new fc01(16, tlsVar);
                        btsVar5.o0(Q5);
                    }
                    iab1.b(null, (sls) Q5, btsVar5, 0, 1);
                    break;
                }
            default:
                fid fidVar6 = (fid) obj;
                int intValue6 = ((Integer) obj2).intValue();
                bts btsVar6 = (bts) fidVar6;
                if (!btsVar6.V(intValue6 & 1, (intValue6 & 3) != 2)) {
                    btsVar6.Y();
                    break;
                } else {
                    boolean k6 = btsVar6.k(tlsVar);
                    Object Q6 = btsVar6.Q();
                    if (k6 || Q6 == o430Var) {
                        Q6 = new fc01(24, tlsVar);
                        btsVar6.o0(Q6);
                    }
                    iab1.b(null, (sls) Q6, btsVar6, 0, 1);
                    break;
                }
        }
        return zy11Var;
    }

    public /* synthetic */ rhi0(int i, tls tlsVar) {
        this.a = i;
        this.b = tlsVar;
    }
}
