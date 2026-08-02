package defpackage;

import java.util.LinkedHashMap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes.dex */
public final class wnp0 {
    public final xqu0 a;
    public final LinkedHashMap b;
    public final boolean c;

    public wnp0(xqu0 xqu0Var, LinkedHashMap linkedHashMap, boolean z) {
        this.a = xqu0Var;
        this.b = linkedHashMap;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wnp0)) {
            return false;
        }
        wnp0 wnp0Var = (wnp0) obj;
        return this.a.equals(wnp0Var.a) && this.b.equals(wnp0Var.b) && this.c == wnp0Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SdkConfig(strategy=");
        sb.append(this.a);
        sb.append(", inputConfigs=");
        sb.append(this.b);
        sb.append(", fetchLastKnownOnStart=");
        return x4e.i(sb, this.c, Extension.C_BRAKE);
    }
}
