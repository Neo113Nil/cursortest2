package defpackage;

import com.yandex.delivery.attrbutedtext.api.FormattedText;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.logistics.sdk.cargo_form.impl.model.common.SlotTrailModel$TrailButton$TrailButtonStyle;

/* loaded from: classes5.dex */
public final class qvs0 implements fws0, hz {
    public final FormattedText a;
    public final String b;
    public final SlotTrailModel$TrailButton$TrailButtonStyle c;
    public final r9x0 d;
    public final String e;
    public final x2s f;

    public qvs0(FormattedText formattedText, String str, SlotTrailModel$TrailButton$TrailButtonStyle slotTrailModel$TrailButton$TrailButtonStyle, r9x0 r9x0Var, String str2, x2s x2sVar) {
        this.a = formattedText;
        this.b = str;
        this.c = slotTrailModel$TrailButton$TrailButtonStyle;
        this.d = r9x0Var;
        this.e = str2;
        this.f = x2sVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qvs0)) {
            return false;
        }
        qvs0 qvs0Var = (qvs0) obj;
        return this.a.equals(qvs0Var.a) && jl40.l(this.b, qvs0Var.b) && this.c == qvs0Var.c && this.d.equals(qvs0Var.d) && jl40.l(this.e, qvs0Var.e) && this.f.equals(qvs0Var.f);
    }

    @Override // defpackage.hz
    public final r9x0 getAction() {
        return this.d;
    }

    public final int hashCode() {
        int hashCode = this.a.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 31;
        String str2 = this.e;
        return this.f.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "TrailButton(title=" + this.a + ", accessibilityLabel=" + this.b + ", buttonStyle=" + this.c + ", action=" + this.d + ", presentationId=" + this.e + ", analyticsData=" + this.f + Extension.C_BRAKE;
    }
}
