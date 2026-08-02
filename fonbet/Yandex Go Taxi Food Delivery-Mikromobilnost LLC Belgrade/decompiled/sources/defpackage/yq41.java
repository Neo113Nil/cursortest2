package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class yq41 extends fig0 {
    public final String d;

    public yq41(String str) {
        super("webchat_webview_created", g8e.z("version", str));
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yq41) && jl40.l(this.d, ((yq41) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }

    public final String toString() {
        return oyr.p("Created(version=", this.d, Extension.C_BRAKE);
    }
}
