package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.delivery.extracted_form_common_data.extra.DeliveryFormStepType;

/* loaded from: classes5.dex */
public final class x0i {
    public final DeliveryFormStepType a;
    public final String b;
    public final List c;
    public final String d;
    public final bgq0 e;
    public final String f;
    public final boolean g;
    public final boolean h;
    public final String i;

    public x0i(DeliveryFormStepType deliveryFormStepType, String str, List list, String str2, bgq0 bgq0Var, String str3, boolean z, boolean z2, String str4, int i) {
        deliveryFormStepType = (i & 1) != 0 ? DeliveryFormStepType.SOURCE : deliveryFormStepType;
        str3 = (i & 32) != 0 ? "" : str3;
        z = (i & 64) != 0 ? true : z;
        z2 = (i & 128) != 0 ? false : z2;
        str4 = (i & 256) != 0 ? null : str4;
        this.a = deliveryFormStepType;
        this.b = str;
        this.c = list;
        this.d = str2;
        this.e = bgq0Var;
        this.f = str3;
        this.g = z;
        this.h = z2;
        this.i = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x0i)) {
            return false;
        }
        x0i x0iVar = (x0i) obj;
        return this.a == x0iVar.a && jl40.l(this.b, x0iVar.b) && jl40.l(this.c, x0iVar.c) && jl40.l(this.d, x0iVar.d) && jl40.l(this.e, x0iVar.e) && jl40.l(this.f, x0iVar.f) && this.g == x0iVar.g && this.h == x0iVar.h && jl40.l(this.i, x0iVar.i);
    }

    public final int hashCode() {
        int c = unr0.c(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c);
        String str = this.d;
        int e = unr0.e(unr0.e(unr0.b((this.e.hashCode() + ((c + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.f), 31, this.g), 31, this.h);
        String str2 = this.i;
        return e + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DeliveryContactsConfig(screenType=");
        sb.append(this.a);
        sb.append(", screenTitle=");
        sb.append(this.b);
        sb.append(", defaultContacts=");
        oyr.D(", screenDescription=", this.d, ", previouslySelected=", sb, this.c);
        sb.append(this.e);
        sb.append(", permissionErrorText=");
        sb.append(this.f);
        sb.append(", shouldFocusOnAttach=");
        nnm.v(", shouldShowToggle=", ", buttonChooseTitle=", sb, this.g, this.h);
        return oyr.t(sb, this.i, Extension.C_BRAKE);
    }
}
