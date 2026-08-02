package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

/* loaded from: classes9.dex */
public final class vxi0 {
    public final Map a;
    public final Map b;
    public final LinkedHashMap c;
    public final ArrayList d;

    public vxi0(Map map, Map map2, LinkedHashMap linkedHashMap, ArrayList arrayList) {
        this.a = map;
        this.b = map2;
        this.c = linkedHashMap;
        this.d = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vxi0)) {
            return false;
        }
        vxi0 vxi0Var = (vxi0) obj;
        return jl40.l(this.a, vxi0Var.a) && this.b.equals(vxi0Var.b) && this.c.equals(vxi0Var.c) && this.d.equals(vxi0Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + unr0.d(this.a.hashCode() * 31, 31, this.b)) * 31);
    }

    public final String toString() {
        return "RenderDiffContext(prevSignatures=" + this.a + ", next=" + this.b + ", nextSignatures=" + this.c + ", out=" + this.d + Extension.C_BRAKE;
    }
}
