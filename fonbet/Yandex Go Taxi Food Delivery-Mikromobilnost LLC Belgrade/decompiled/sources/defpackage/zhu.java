package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

@gsq0
/* loaded from: classes12.dex */
public final class zhu implements ig5 {
    public static final yhu Companion = new yhu();
    public final String a;
    public final long b;
    public final String c;

    public /* synthetic */ zhu(String str, String str2, int i, long j) {
        if (1 != (i & 1)) {
            qje.Z(i, 1, xhu.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = (i & 2) == 0 ? 300L : j;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zhu)) {
            return false;
        }
        zhu zhuVar = (zhu) obj;
        return jl40.l(this.a, zhuVar.a) && this.b == zhuVar.b && jl40.l(this.c, zhuVar.c);
    }

    public final int hashCode() {
        int c = qv10.c(this.a.hashCode() * 31, 31, this.b);
        String str = this.c;
        return c + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return unr0.r(x4e.l("HideCutoutAction(viewId=", this.a, ", animationDurationMs=", this.b), ", animationType=", this.c, Extension.C_BRAKE);
    }
}
