package defpackage;

import com.yandex.go.places.models.ui.DiscoveryMainTab$TabType;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes13.dex */
public final class uiq0 {
    public final DiscoveryMainTab$TabType a;
    public final String b;

    public uiq0(DiscoveryMainTab$TabType discoveryMainTab$TabType, String str) {
        this.a = discoveryMainTab$TabType;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uiq0)) {
            return false;
        }
        uiq0 uiq0Var = (uiq0) obj;
        return this.a == uiq0Var.a && jl40.l(this.b, uiq0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SelectedTabInfo(type=" + this.a + ", screenId=" + this.b + Extension.C_BRAKE;
    }
}
