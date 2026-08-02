package defpackage;

import com.ybsdk.core.utils.ext.ErrorResponse;
import com.ybsdk.core.utils.ext.ErrorResponseException;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes2.dex */
public final class sne {
    public final rne a;
    public final long b;
    public final long c;

    public sne(rne rneVar, long j, long j2) {
        this.a = rneVar;
        this.b = j;
        this.c = j2;
    }

    public final long a() {
        return this.c;
    }

    public final long b() {
        return this.b;
    }

    public final boolean c(Throwable th) {
        ErrorResponse errorResponse;
        Integer num;
        ErrorResponseException errorResponseException = th instanceof ErrorResponseException ? (ErrorResponseException) th : null;
        if (errorResponseException != null && (errorResponse = errorResponseException.getErrorResponse()) != null) {
            int code = errorResponse.getCode();
            rne rneVar = this.a;
            Integer num2 = rneVar.a;
            boolean z = num2 != null && num2.intValue() == code;
            Integer num3 = rneVar.b;
            boolean z2 = num3 != null && (num = rneVar.c) != null && code <= num.intValue() && num3.intValue() <= code;
            if (z || z2) {
                return true;
            }
        }
        return false;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sne)) {
            return false;
        }
        sne sneVar = (sne) obj;
        return this.a.equals(sneVar.a) && this.b == sneVar.b && this.c == sneVar.c;
    }

    public final int hashCode() {
        return Long.hashCode(this.c) + qv10.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CooldownConfigItem(condition=");
        sb.append(this.a);
        sb.append(", minCooldownMs=");
        sb.append(this.b);
        return g8e.l(this.c, ", maxCooldownMs=", Extension.C_BRAKE, sb);
    }
}
