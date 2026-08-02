package defpackage;

import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes8.dex */
public final class ybj {
    public final int a;
    public final int b;
    public final int c;
    public final String d;

    public ybj(int i, int i2, int i3, String str) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ybj)) {
            return false;
        }
        ybj ybjVar = (ybj) obj;
        return this.a == ybjVar.a && this.b == ybjVar.b && this.c == ybjVar.c && this.d.equals(ybjVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + oyr.b(this.c, oyr.b(this.b, Integer.hashCode(this.a) * 31, 31), 31);
    }

    public final String toString() {
        return xvz.h(this.c, ", deviceId=", this.d, Extension.C_BRAKE, b64.s(this.a, this.b, "DeviceSpecs(ramMb=", ", cpuCount=", ", cpuMaxFreqMhz="));
    }
}
