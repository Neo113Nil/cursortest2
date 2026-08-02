package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class zfo {
    public final mqs a;
    public final bzs b;

    public zfo(mqs mqsVar, bzs bzsVar) {
        mqsVar.getClass();
        this.a = mqsVar;
        this.b = bzsVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zfo)) {
            return false;
        }
        zfo zfoVar = (zfo) obj;
        return Intrinsics.d(this.a, zfoVar.a) && this.b.equals(zfoVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.a.hashCode() * 31);
    }

    public final String toString() {
        return "RotorTrackSequenceItem(track=" + this.a + ", trackParameters=" + this.b + ")";
    }
}
