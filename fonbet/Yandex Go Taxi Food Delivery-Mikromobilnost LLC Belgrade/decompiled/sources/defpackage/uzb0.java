package defpackage;

import com.ybsdk.feature.pin.api.entities.PinApplicationTypeEntity;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class uzb0 {
    public final String a;
    public final PinApplicationTypeEntity b;
    public final boolean c;

    public uzb0(String str, PinApplicationTypeEntity pinApplicationTypeEntity, boolean z) {
        this.a = str;
        this.b = pinApplicationTypeEntity;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uzb0)) {
            return false;
        }
        uzb0 uzb0Var = (uzb0) obj;
        return jl40.l(this.a, uzb0Var.a) && this.b == uzb0Var.b && this.c == uzb0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PinSessionApplicationEntity(applicationId=");
        sb.append(this.a);
        sb.append(", type=");
        sb.append(this.b);
        sb.append(", required=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }
}
