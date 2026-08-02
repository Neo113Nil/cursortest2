package defpackage;

import com.yandex.go.payments.addmethod.data.model.AddPaymentHomeResponse;
import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class rh0 {
    public final String a;
    public final AddPaymentHomeResponse.FieldType b;
    public final String c;
    public final boolean d;
    public final String e;
    public final String f;
    public final int g;
    public final int h;
    public final List i;

    public rh0(String str, AddPaymentHomeResponse.FieldType fieldType, String str2, boolean z, String str3, String str4, int i, int i2, List list) {
        this.a = str;
        this.b = fieldType;
        this.c = str2;
        this.d = z;
        this.e = str3;
        this.f = str4;
        this.g = i;
        this.h = i2;
        this.i = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rh0)) {
            return false;
        }
        rh0 rh0Var = (rh0) obj;
        return jl40.l(this.a, rh0Var.a) && this.b == rh0Var.b && jl40.l(this.c, rh0Var.c) && this.d == rh0Var.d && jl40.l(this.e, rh0Var.e) && jl40.l(this.f, rh0Var.f) && this.g == rh0Var.g && this.h == rh0Var.h && this.i.equals(rh0Var.i);
    }

    public final int hashCode() {
        int b = unr0.b(unr0.e(unr0.b((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e);
        String str = this.f;
        return this.i.hashCode() + oyr.b(this.h, oyr.b(this.g, (b + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("InputFieldUiState(fieldId=");
        sb.append(this.a);
        sb.append(", fieldType=");
        sb.append(this.b);
        sb.append(", defaultValue=");
        tse0.y(this.c, ", isRequired=", ", accessibilityText=", sb, this.d);
        g8e.D(sb, this.e, ", notEditablePrefix=", this.f, ", minLength=");
        vfc.u(this.g, this.h, ", maxLength=", ", phoneFormats=", sb);
        return ly3.s(sb, this.i, Extension.C_BRAKE);
    }
}
