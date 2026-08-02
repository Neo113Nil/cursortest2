package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class w7p extends y7p {
    public final z9u a;
    public final x1u b;
    public final e4p c;

    public w7p(z9u z9uVar, x1u x1uVar, e4p e4pVar) {
        x1uVar.getClass();
        this.a = z9uVar;
        this.b = x1uVar;
        this.c = e4pVar;
    }

    @Override // defpackage.y7p
    public final e4p b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w7p)) {
            return false;
        }
        w7p w7pVar = (w7p) obj;
        return this.a.equals(w7pVar.a) && Intrinsics.d(this.b, w7pVar.b) && this.c == w7pVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        return "VideoClip(uiData=" + this.a + ", model=" + this.b + ", source=" + this.c + ")";
    }
}
