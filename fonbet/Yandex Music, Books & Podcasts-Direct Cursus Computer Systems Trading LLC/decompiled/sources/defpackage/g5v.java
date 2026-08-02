package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* loaded from: classes5.dex */
public final class g5v {
    public final ArrayList a;
    public final LinkedHashMap b;

    public g5v(ArrayList arrayList, LinkedHashMap linkedHashMap) {
        this.a = arrayList;
        this.b = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g5v)) {
            return false;
        }
        g5v g5vVar = (g5v) obj;
        return this.a.equals(g5vVar.a) && this.b.equals(g5vVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WaveSettings(blocks=" + this.a + ", settingRestrictions=" + this.b + ")";
    }
}
