package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class y930 implements z930 {
    public final o930 a;

    public y930(o930 o930Var) {
        this.a = o930Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof y930) && this.a.equals(((y930) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "OnRetryAfterError(errorSource=" + this.a + Extension.C_BRAKE;
    }
}
