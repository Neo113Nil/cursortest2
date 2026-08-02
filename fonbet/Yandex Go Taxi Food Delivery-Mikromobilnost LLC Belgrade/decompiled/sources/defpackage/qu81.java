package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import yads.x80;

/* loaded from: classes7.dex */
public final class qu81 {
    public final x80 a;
    public final List b;

    public qu81(x80 x80Var, List list) {
        this.a = x80Var;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qu81)) {
            return false;
        }
        qu81 qu81Var = (qu81) obj;
        return this.a == qu81Var.a && jl40.l(this.b, qu81Var.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        List list = this.b;
        return hashCode + (list == null ? 0 : list.hashCode());
    }

    public final String toString() {
        return "DebugPanelSdkIntegrationStatusData(status=" + this.a + ", messages=" + this.b + Extension.C_BRAKE;
    }
}
