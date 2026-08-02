package defpackage;

import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class h5v {
    public final String a;
    public final ArrayList b;

    public h5v(String str, ArrayList arrayList) {
        str.getClass();
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h5v)) {
            return false;
        }
        h5v h5vVar = (h5v) obj;
        return Intrinsics.d(this.a, h5vVar.a) && this.b.equals(h5vVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WaveSettingsBlock(type=" + this.a + ", items=" + this.b + ")";
    }
}
