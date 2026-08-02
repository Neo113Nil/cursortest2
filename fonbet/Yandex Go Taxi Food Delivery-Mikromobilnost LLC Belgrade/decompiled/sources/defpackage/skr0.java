package defpackage;

import java.util.List;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class skr0 {
    public final String a;
    public final List b;

    public skr0(String str, List list) {
        this.a = str;
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof skr0)) {
            return false;
        }
        skr0 skr0Var = (skr0) obj;
        return jl40.l(this.a, skr0Var.a) && jl40.l(this.b, skr0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        List list = this.b;
        return hashCode + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        return nnm.h("ShareSettingsChanges(selectedShareSettingsOption=", this.a, ", selectedShareSettingsSwitches=", Extension.C_BRAKE, this.b);
    }

    public skr0() {
        this(null, null);
    }
}
