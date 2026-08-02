package defpackage;

import com.yandex.go.payments.data.model.response.ActionButton;
import com.yandex.go.payments.data.model.response.BindDialog;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class sa70 {
    public final String a;
    public final String b;
    public final ActionButton c;
    public final ActionButton d;
    public final BindDialog.LegalFooter e;

    static {
        new ActionButton(0);
    }

    public sa70(String str, String str2, ActionButton actionButton, ActionButton actionButton2, BindDialog.LegalFooter legalFooter) {
        this.a = str;
        this.b = str2;
        this.c = actionButton;
        this.d = actionButton2;
        this.e = legalFooter;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sa70)) {
            return false;
        }
        sa70 sa70Var = (sa70) obj;
        return this.a.equals(sa70Var.a) && jl40.l(this.b, sa70Var.b) && jl40.l(this.c, sa70Var.c) && jl40.l(this.d, sa70Var.d) && jl40.l(this.e, sa70Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        ActionButton actionButton = this.c;
        int hashCode3 = (this.d.hashCode() + ((hashCode2 + (actionButton == null ? 0 : actionButton.hashCode())) * 31)) * 31;
        BindDialog.LegalFooter legalFooter = this.e;
        return hashCode3 + (legalFooter != null ? legalFooter.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder v = b64.v("OpeningBankDialogUiState(title=", this.a, ", description=", this.b, ", additionalButton=");
        v.append(this.c);
        v.append(", mainButton=");
        v.append(this.d);
        v.append(", legalFooter=");
        v.append(this.e);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
