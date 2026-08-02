package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class tuv implements uuv {
    public final ytv a;

    public tuv(ytv ytvVar) {
        this.a = ytvVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tuv) && jl40.l(this.a, ((tuv) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "SendAnalyticsAction(event=" + this.a + Extension.C_BRAKE;
    }
}
