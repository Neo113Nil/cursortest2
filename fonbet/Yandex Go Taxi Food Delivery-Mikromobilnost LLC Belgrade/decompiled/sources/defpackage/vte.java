package defpackage;

import com.yandex.go.payments.shared.business.accountcreation.corp.create_navigator.employee_access_info.a;

/* loaded from: classes13.dex */
public final /* synthetic */ class vte implements tls {
    public final /* synthetic */ int a;
    public final /* synthetic */ a b;

    public /* synthetic */ vte(a aVar, int i) {
        this.a = i;
        this.b = aVar;
    }

    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        a aVar = this.b;
        switch (i) {
            case 0:
                yfd yfdVar = (yfd) obj;
                ((agd) yfdVar).e = new vte(aVar, 1);
                i6d.a.getClass();
                ((agd) yfdVar).g = i6d.b;
                break;
            default:
                if (((xte) obj) != null) {
                    aVar.r(new qu(9));
                    break;
                }
                break;
        }
        return zy11Var;
    }
}
