package defpackage;

import androidx.compose.runtime.internal.a;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes4.dex */
public final class zqm implements brm {
    public final a a;

    public zqm(a aVar) {
        this.a = aVar;
    }

    @Override // defpackage.brm
    public final xqm a() {
        return gu91.a(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof zqm) {
            return y7m.b(12.0f, 12.0f) && this.a == ((zqm) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode() + (Float.hashCode(12.0f) * 31);
    }

    public final String toString() {
        return "Image(rounding=" + y7m.c(12.0f) + ", content=" + this.a + Extension.C_BRAKE;
    }
}
