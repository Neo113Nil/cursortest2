package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class dav extends fav {
    public final String b;
    public final f6v c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public dav(String str, f6v f6vVar) {
        super(false);
        str.getClass();
        this.b = str;
        this.c = f6vVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dav)) {
            return false;
        }
        dav davVar = (dav) obj;
        return Intrinsics.d(this.b, davVar.b) && this.c == davVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + (this.b.hashCode() * 31);
    }

    public final String toString() {
        return "Sleep(targetId=" + this.b + ", reason=" + this.c + ")";
    }
}
