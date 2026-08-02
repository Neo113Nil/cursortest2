package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class s7u {
    public final String a;
    public final y1u b;

    public s7u(y1u y1uVar, String str) {
        y1uVar.getClass();
        this.a = str;
        this.b = y1uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s7u)) {
            return false;
        }
        s7u s7uVar = (s7u) obj;
        return this.a.equals(s7uVar.a) && Intrinsics.d(this.b, s7uVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "VideoClipRadioQueueItem(batchId=" + this.a + ", item=" + this.b + ")";
    }
}
