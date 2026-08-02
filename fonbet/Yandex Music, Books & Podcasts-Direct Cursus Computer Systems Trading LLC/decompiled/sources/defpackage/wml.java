package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class wml implements xml {
    public final kml a;
    public final n7q b;

    public wml(kml kmlVar, n7q n7qVar) {
        n7qVar.getClass();
        this.a = kmlVar;
        this.b = n7qVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wml)) {
            return false;
        }
        wml wmlVar = (wml) obj;
        return this.a.equals(wmlVar.a) && Intrinsics.d(this.b, wmlVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Ready(queuePlayablesState=" + this.a + ", sharedQueueState=" + this.b + ")";
    }
}
