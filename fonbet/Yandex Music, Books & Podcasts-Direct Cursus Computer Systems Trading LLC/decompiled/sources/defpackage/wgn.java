package defpackage;

import java.util.ArrayList;

/* loaded from: classes5.dex */
public final class wgn {
    public final String a;
    public final ArrayList b;

    public wgn(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wgn)) {
            return false;
        }
        wgn wgnVar = (wgn) obj;
        return this.a.equals(wgnVar.a) && this.b.equals(wgnVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "RadioRestriction(name=" + this.a + ", values=" + this.b + ")";
    }
}
