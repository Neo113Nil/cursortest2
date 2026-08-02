package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class h7p extends j7p {
    public final z9u a;
    public final x1u b;
    public final e4p c;
    public final String d;

    public h7p(z9u z9uVar, x1u x1uVar, e4p e4pVar, String str) {
        x1uVar.getClass();
        str.getClass();
        this.a = z9uVar;
        this.b = x1uVar;
        this.c = e4pVar;
        this.d = str;
    }

    @Override // defpackage.y7p
    public final e4p b() {
        return this.c;
    }

    @Override // defpackage.j7p
    public final String c() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h7p)) {
            return false;
        }
        h7p h7pVar = (h7p) obj;
        return this.a.equals(h7pVar.a) && Intrinsics.d(this.b, h7pVar.b) && this.c == h7pVar.c && Intrinsics.d(this.d, h7pVar.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "VideoClip(uiData=" + this.a + ", model=" + this.b + ", source=" + this.c + ", id=" + this.d + ")";
    }
}
