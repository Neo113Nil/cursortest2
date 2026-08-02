package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes7.dex */
public final class t7c {
    public yeo a;

    public t7c(int i) {
        this.a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t7c) && jl40.l(this.a, ((t7c) obj).a);
    }

    public final int hashCode() {
        yeo yeoVar = this.a;
        if (yeoVar == null) {
            return 0;
        }
        return yeoVar.hashCode();
    }

    public final String toString() {
        return "ClusterEventSinkHolder(eventSink=" + this.a + Extension.C_BRAKE;
    }

    public t7c() {
        this(0);
    }
}
