package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.logistics.sdk.cargo_form.impl.model.common.SlotTrailModel$TrailButton$TrailButtonStyle;

/* loaded from: classes5.dex */
public final class vus0 implements jvs0 {
    public final CharSequence a;
    public final String b;
    public final SlotTrailModel$TrailButton$TrailButtonStyle c;
    public final x9x0 d;
    public final String e;

    public vus0(CharSequence charSequence, String str, SlotTrailModel$TrailButton$TrailButtonStyle slotTrailModel$TrailButton$TrailButtonStyle, x9x0 x9x0Var, String str2) {
        this.a = charSequence;
        this.b = str;
        this.c = slotTrailModel$TrailButton$TrailButtonStyle;
        this.d = x9x0Var;
        this.e = str2;
    }

    @Override // defpackage.jvs0
    public final float a() {
        return 8.0f;
    }

    @Override // defpackage.jvs0
    public final String d() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vus0)) {
            return false;
        }
        vus0 vus0Var = (vus0) obj;
        return jl40.l(this.a, vus0Var.a) && jl40.l(this.b, vus0Var.b) && this.c == vus0Var.c && this.d.equals(vus0Var.d) && jl40.l(this.e, vus0Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (this.d.hashCode() + ((this.c.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31)) * 961;
        String str2 = this.e;
        return hashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TrailButton(title=");
        sb.append((Object) this.a);
        sb.append(", accessibilityLabel=");
        sb.append(this.b);
        sb.append(", buttonStyle=");
        sb.append(this.c);
        sb.append(", widgetAction=");
        sb.append(this.d);
        sb.append(", onShownAnalyticsData=null, presentationId=");
        return oyr.t(sb, this.e, Extension.C_BRAKE);
    }
}
