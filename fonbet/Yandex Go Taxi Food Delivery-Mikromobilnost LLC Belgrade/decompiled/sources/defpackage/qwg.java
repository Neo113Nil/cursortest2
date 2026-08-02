package defpackage;

import com.yandex.go.intercity.flex.dashboard.flex.sdk.descriptors.widget.payment.method.PaymentMethodWidgetData;
import com.yandex.go.intercity.flex.dashboard.flex.sdk.descriptors.widget.payment.method.PaymentMethodWidgetSection;
import com.yandex.go.vault.flexsdk.descriptors.widget.VaultsPagerWidgetData;
import com.yandex.go.vault.flexsdk.descriptors.widget.VaultsPagerWidgetSection;
import java.util.List;
import kotlin.collections.EmptyList;

/* loaded from: classes12.dex */
public final class qwg extends f0q0 {
    public final /* synthetic */ int g;
    public final pyp0 h;

    public qwg(pyp0 pyp0Var) {
        this.g = 2;
        this.h = pyp0Var;
    }

    @Override // defpackage.f0q0
    public final void b() {
        String str;
        Integer num;
        int i = this.g;
        u8a0 u8a0Var = null;
        l431 l431Var = null;
        u8a0Var = null;
        u8a0Var = null;
        u8a0Var = null;
        qc20 qc20Var = this.f;
        pyp0 pyp0Var = this.h;
        switch (i) {
            case 0:
                pwg pwgVar = (pwg) pyp0Var;
                qc20Var.C(new rwg(new twg(pwgVar.a, pwgVar.b, pwgVar.c)));
                break;
            case 1:
                PaymentMethodWidgetSection paymentMethodWidgetSection = (PaymentMethodWidgetSection) pyp0Var;
                String str2 = paymentMethodWidgetSection.a;
                PaymentMethodWidgetData paymentMethodWidgetData = paymentMethodWidgetSection.c;
                if (paymentMethodWidgetData != null && (str = paymentMethodWidgetData.a) != null && str.length() != 0 && (num = paymentMethodWidgetData.b) != null) {
                    u8a0Var = new u8a0(str, num.intValue());
                }
                qc20Var.C(new s8a0(str2, u8a0Var));
                break;
            case 2:
                qc20Var.C(new f0n0(pyp0Var.getB()));
                break;
            default:
                VaultsPagerWidgetSection vaultsPagerWidgetSection = (VaultsPagerWidgetSection) pyp0Var;
                String str3 = vaultsPagerWidgetSection.a;
                VaultsPagerWidgetData vaultsPagerWidgetData = vaultsPagerWidgetSection.c;
                if (vaultsPagerWidgetData != null) {
                    List list = vaultsPagerWidgetData.a;
                    if (list == null) {
                        list = EmptyList.a;
                    }
                    l431Var = new l431(vaultsPagerWidgetData.c, vaultsPagerWidgetData.b, vaultsPagerWidgetData.d, vaultsPagerWidgetData.e, vaultsPagerWidgetData.f, list);
                }
                qc20Var.C(new k431(str3, l431Var));
                break;
        }
    }

    public /* synthetic */ qwg(pyp0 pyp0Var, int i) {
        this.g = i;
        this.h = pyp0Var;
    }
}
