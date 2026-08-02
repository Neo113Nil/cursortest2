package defpackage;

import com.yandex.messaging.domain.statuses.StatusAvailability;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes15.dex */
public final class sh7 {
    public final boolean a;
    public final StatusAvailability b;
    public final String c;
    public final String d;

    public sh7(boolean z, StatusAvailability statusAvailability, String str, String str2) {
        this.a = z;
        this.b = statusAvailability;
        this.c = str;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sh7)) {
            return false;
        }
        sh7 sh7Var = (sh7) obj;
        return this.a == sh7Var.a && this.b == sh7Var.b && jl40.l(this.c, sh7Var.c) && jl40.l(this.d, sh7Var.d);
    }

    public final int hashCode() {
        int hashCode = Boolean.hashCode(this.a) * 31;
        StatusAvailability statusAvailability = this.b;
        int hashCode2 = (hashCode + (statusAvailability == null ? 0 : statusAvailability.hashCode())) * 31;
        String str = this.c;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.d;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CallHistoryInfoState(hasChat=");
        sb.append(this.a);
        sb.append(", statusAvailability=");
        sb.append(this.b);
        sb.append(", contactName=");
        return g8e.r(sb, this.c, ", subtitle=", this.d, Extension.C_BRAKE);
    }

    public /* synthetic */ sh7(int i) {
        this(false, null, null, null);
    }

    public sh7() {
        this(0);
    }
}
