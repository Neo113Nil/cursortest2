package defpackage;

import java.util.LinkedHashMap;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes14.dex */
public final class wlq0 {
    public final v0f0 a;
    public final v0f0 b;
    public final LinkedHashMap c;

    public wlq0(v0f0 v0f0Var, v0f0 v0f0Var2, LinkedHashMap linkedHashMap) {
        this.a = v0f0Var;
        this.b = v0f0Var2;
        this.c = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wlq0)) {
            return false;
        }
        wlq0 wlq0Var = (wlq0) obj;
        return this.a.equals(wlq0Var.a) && this.b.equals(wlq0Var.b) && this.c.equals(wlq0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "SelectorPriceUi(selector=" + this.a + ", selectorSelected=" + this.b + ", selectorHighlight=" + this.c + Extension.C_BRAKE;
    }
}
