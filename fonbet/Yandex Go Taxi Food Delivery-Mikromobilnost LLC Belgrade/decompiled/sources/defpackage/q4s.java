package defpackage;

import kotlin.text.Regex;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes3.dex */
public final class q4s {
    public final Regex a;
    public final String b;

    public q4s(Regex regex, String str) {
        this.a = regex;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof q4s) {
            q4s q4sVar = (q4s) obj;
            if (this.a == q4sVar.a && jl40.l(this.b, q4sVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FormFieldValidationEntity(regex=" + this.a + ", errorHint=" + this.b + Extension.C_BRAKE;
    }
}
