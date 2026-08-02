package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes12.dex */
public final class wlj {
    public final qlj a;

    public /* synthetic */ wlj(int i) {
        this(new qlj(0));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wlj) && jl40.l(this.a, ((wlj) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return "DirectionSelectorState(data=" + this.a + Extension.C_BRAKE;
    }

    public wlj(qlj qljVar) {
        this.a = qljVar;
    }

    public wlj() {
        this(0);
    }
}
