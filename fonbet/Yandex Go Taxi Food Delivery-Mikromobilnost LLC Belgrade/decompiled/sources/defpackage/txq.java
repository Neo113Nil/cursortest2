package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.taxi.logistics.sdk.address_details.api.ui.FieldImeAction;
import ru.yandex.taxi.logistics.sdk.address_details.api.ui.FieldVisibility;

/* loaded from: classes5.dex */
public final class txq {
    public final hyq a;
    public final String b;
    public final String c;
    public final m8e d;
    public final String e;
    public final FieldVisibility f;
    public final boolean g;
    public final FieldImeAction h;
    public final String i;

    public txq(hyq hyqVar, String str, String str2, m8e m8eVar, String str3, FieldVisibility fieldVisibility, boolean z, FieldImeAction fieldImeAction, String str4, int i) {
        m8eVar = (i & 8) != 0 ? new m8e(1) : m8eVar;
        str3 = (i & 16) != 0 ? null : str3;
        z = (i & 64) != 0 ? false : z;
        fieldImeAction = (i & 128) != 0 ? FieldImeAction.DEFAULT : fieldImeAction;
        str4 = (i & 256) != 0 ? null : str4;
        this.a = hyqVar;
        this.b = str;
        this.c = str2;
        this.d = m8eVar;
        this.e = str3;
        this.f = fieldVisibility;
        this.g = z;
        this.h = fieldImeAction;
        this.i = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof txq)) {
            return false;
        }
        txq txqVar = (txq) obj;
        return jl40.l(this.a, txqVar.a) && jl40.l(this.b, txqVar.b) && jl40.l(this.c, txqVar.c) && jl40.l(this.d, txqVar.d) && jl40.l(this.e, txqVar.e) && this.f == txqVar.f && this.g == txqVar.g && this.h == txqVar.h && jl40.l(this.i, txqVar.i);
    }

    public final int hashCode() {
        int b = oyr.b(this.d.a, unr0.b(unr0.b(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31);
        String str = this.e;
        int hashCode = (this.h.hashCode() + unr0.e((this.f.hashCode() + ((b + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.g)) * 31;
        String str2 = this.i;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FieldModel(type=");
        sb.append(this.a);
        sb.append(", title=");
        sb.append(this.b);
        sb.append(", value=");
        sb.append(this.c);
        sb.append(", constraints=");
        sb.append(this.d);
        sb.append(", bubbleText=");
        sb.append(this.e);
        sb.append(", visibility=");
        sb.append(this.f);
        sb.append(", isLocked=");
        sb.append(this.g);
        sb.append(", imeAction=");
        sb.append(this.h);
        sb.append(", editFieldName=");
        return oyr.t(sb, this.i, Extension.C_BRAKE);
    }
}
