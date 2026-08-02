package defpackage;

import kotlin.collections.a;
import ru.yandex.logistics.sdk.cargo_form.impl.model.widget.CurrencySymbolAnchor;

/* loaded from: classes11.dex */
public final class qye implements gy31 {
    public final String a;
    public final CurrencySymbolAnchor b;

    public qye(String str, CurrencySymbolAnchor currencySymbolAnchor) {
        this.a = str;
        this.b = currencySymbolAnchor;
    }

    @Override // defpackage.gy31
    public final vw01 b(kk2 kk2Var) {
        String str = kk2Var.b;
        String obj = gvu0.z0(a.X(gvu0.q0(3, gvu0.z0(str.length() == 0 ? "0" : str).toString()), " ", null, null, null, 62)).toString();
        CurrencySymbolAnchor currencySymbolAnchor = this.b;
        String str2 = this.a;
        if (str2 != null) {
            obj = currencySymbolAnchor == CurrencySymbolAnchor.LEADING ? g8e.p(str2, " ", obj) : g8e.p(obj, " ", str2);
        }
        int i = 0;
        int length = (str2 == null || currencySymbolAnchor != CurrencySymbolAnchor.LEADING) ? 0 : str2.length() + 1;
        if (str2 != null && currencySymbolAnchor == CurrencySymbolAnchor.TRAILING) {
            i = str2.length() + 1;
        }
        return new vw01(new kk2(obj), new yi6(str, obj, length, i));
    }
}
