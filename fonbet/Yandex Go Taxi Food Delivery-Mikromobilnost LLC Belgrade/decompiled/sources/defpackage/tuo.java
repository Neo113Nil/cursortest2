package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class tuo implements vuo {
    public final ouo a;

    public tuo(ouo ouoVar) {
        this.a = ouoVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tuo) && this.a.equals(((tuo) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }

    public final String toString() {
        return "Content(data=" + this.a + Extension.C_BRAKE;
    }
}
