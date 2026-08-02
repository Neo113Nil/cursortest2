package defpackage;

import java.util.ArrayList;

/* loaded from: classes4.dex */
public final class q7v {
    public final String a;
    public final ArrayList b;

    public q7v(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q7v)) {
            return false;
        }
        q7v q7vVar = (q7v) obj;
        return this.a.equals(q7vVar.a) && this.b.equals(q7vVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "TrackTarget(trackId=" + this.a + ", cards=" + this.b + ")";
    }
}
