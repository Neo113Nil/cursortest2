package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class y1u {
    public final tfn a;
    public final x1u b;
    public final wmn c;

    public y1u(tfn tfnVar, x1u x1uVar, wmn wmnVar) {
        x1uVar.getClass();
        this.a = tfnVar;
        this.b = x1uVar;
        this.c = wmnVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y1u)) {
            return false;
        }
        y1u y1uVar = (y1u) obj;
        return this.a.equals(y1uVar.a) && Intrinsics.d(this.b, y1uVar.b) && this.c == y1uVar.c;
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.a.hashCode() * 31)) * 31;
        wmn wmnVar = this.c;
        return hashCode + (wmnVar == null ? 0 : wmnVar.hashCode());
    }

    public final String toString() {
        return "VideoClip(id=" + this.a + ", videoClip=" + this.b + ", recommendationType=" + this.c + ")";
    }
}
