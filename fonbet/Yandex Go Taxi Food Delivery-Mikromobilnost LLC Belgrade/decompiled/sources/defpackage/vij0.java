package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.requirements.models.domain.RequirementLinkModel$RequirementLinkAction;

/* loaded from: classes6.dex */
public final class vij0 {
    public static final vij0 f = new vij0("", "", "", "", RequirementLinkModel$RequirementLinkAction.SHOW);
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final RequirementLinkModel$RequirementLinkAction e;

    public vij0(String str, String str2, String str3, String str4, RequirementLinkModel$RequirementLinkAction requirementLinkModel$RequirementLinkAction) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = requirementLinkModel$RequirementLinkAction;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vij0)) {
            return false;
        }
        vij0 vij0Var = (vij0) obj;
        return this.a.equals(vij0Var.a) && this.b.equals(vij0Var.b) && this.c.equals(vij0Var.c) && this.d.equals(vij0Var.d) && this.e == vij0Var.e;
    }

    public final int hashCode() {
        return this.e.hashCode() + unr0.b(unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder v = b64.v("RequirementLinkModel(requirementName=", this.a, ", groupId=", this.b, ", tariffClass=");
        g8e.D(v, this.c, ", verticalId=", this.d, ", action=");
        v.append(this.e);
        v.append(Extension.C_BRAKE);
        return v.toString();
    }
}
