package defpackage;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class hkv implements ikv {
    public final ArrayList a;
    public final boolean b;

    public hkv(ArrayList arrayList, boolean z) {
        this.a = arrayList;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hkv)) {
            return false;
        }
        hkv hkvVar = (hkv) obj;
        return this.a.equals(hkvVar.a) && this.b == hkvVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Success(items=" + this.a + ", isOffline=" + this.b + ")";
    }
}
