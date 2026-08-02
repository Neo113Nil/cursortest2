package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes6.dex */
public final class ye11 {
    public final String a;

    public /* synthetic */ ye11(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ye11) {
            return jl40.l(this.a, ((ye11) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return oyr.p("TriggerFinalSuggestRepeatRequestEvent(customFinalSuggestMode=", this.a, Extension.C_BRAKE);
    }
}
