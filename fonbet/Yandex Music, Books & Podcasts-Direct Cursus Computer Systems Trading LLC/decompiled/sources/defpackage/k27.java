package defpackage;

import android.text.Editable;
import android.text.TextWatcher;
import android.widget.LinearLayout;
import com.yandex.payment.divkit.bind.view.DKExpirationDateInput;
import com.yandex.payment.sdk.ui.view.card.ExpirationDateInput;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* loaded from: classes4.dex */
public final class k27 implements TextWatcher {
    public final /* synthetic */ int a;
    public boolean b;
    public final /* synthetic */ LinearLayout c;

    public /* synthetic */ k27(LinearLayout linearLayout, int i) {
        this.a = i;
        this.c = linearLayout;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        int i = this.a;
        LinearLayout linearLayout = this.c;
        switch (i) {
            case 0:
                DKExpirationDateInput dKExpirationDateInput = (DKExpirationDateInput) linearLayout;
                editable.getClass();
                int length = editable.length();
                if (this.b) {
                    dKExpirationDateInput.f.invoke(new kne(fbs.EXPIRATION_DATE));
                    if (length == 1 && Character.getNumericValue(editable.charAt(0)) > 1) {
                        editable.replace(0, 1, CommonUrlParts.Values.FALSE_INTEGER).append(editable.charAt(0));
                    }
                }
                yrq[] yrqVarArr = (yrq[]) editable.getSpans(0, length, yrq.class);
                yrqVarArr.getClass();
                for (yrq yrqVar : yrqVarArr) {
                    editable.removeSpan(yrqVar);
                }
                int i2 = DKExpirationDateInput.g;
                if (2 <= editable.length()) {
                    editable.setSpan(new yrq(), 1, 2, 33);
                }
                dKExpirationDateInput.b(true, length == 4);
                break;
            default:
                ExpirationDateInput expirationDateInput = (ExpirationDateInput) linearLayout;
                editable.getClass();
                int length2 = editable.length();
                if (this.b) {
                    expirationDateInput.f.invoke(new kne(fbs.EXPIRATION_DATE));
                    if (length2 == 1 && Character.getNumericValue(editable.charAt(0)) > 1) {
                        editable.replace(0, 1, CommonUrlParts.Values.FALSE_INTEGER).append(editable.charAt(0));
                    }
                }
                xrq[] xrqVarArr = (xrq[]) editable.getSpans(0, length2, xrq.class);
                xrqVarArr.getClass();
                for (xrq xrqVar : xrqVarArr) {
                    editable.removeSpan(xrqVar);
                }
                int i3 = ExpirationDateInput.g;
                if (2 <= editable.length()) {
                    editable.setSpan(new xrq(), 1, 2, 33);
                }
                expirationDateInput.b(true, length2 == 4);
                break;
        }
    }

    @Override // android.text.TextWatcher
    public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        int i4 = this.a;
        charSequence.getClass();
    }

    @Override // android.text.TextWatcher
    public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        switch (this.a) {
            case 0:
                this.b = i3 > i2;
                break;
            default:
                this.b = i3 > i2;
                break;
        }
    }
}
