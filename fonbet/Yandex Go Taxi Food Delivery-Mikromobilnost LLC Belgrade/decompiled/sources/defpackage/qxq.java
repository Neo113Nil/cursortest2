package defpackage;

import kotlin.Pair;
import kotlin.collections.b;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class qxq extends keo {
    public final String c;
    public final String d;

    public qxq(String str, String str2) {
        super("card_input_field_focused", b.i(new Pair("field_type", str), new Pair("form_step", str2)));
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qxq)) {
            return false;
        }
        qxq qxqVar = (qxq) obj;
        return jl40.l(this.c, qxqVar.c) && jl40.l(this.d, qxqVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + (this.c.hashCode() * 31);
    }

    public final String toString() {
        return unr0.p("FieldFocusedEvent(fieldType=", this.c, ", formStep=", this.d, Extension.C_BRAKE);
    }
}
