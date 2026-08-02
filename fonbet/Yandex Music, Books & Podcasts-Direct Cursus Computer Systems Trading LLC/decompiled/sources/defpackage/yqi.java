package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class yqi extends ue5 {
    public final String a;
    public final apo b;
    public final c0p c;
    public final t1p d;

    public yqi(String str, apo apoVar, c0p c0pVar, t1p t1pVar) {
        str.getClass();
        c0pVar.getClass();
        this.a = str;
        this.b = apoVar;
        this.c = c0pVar;
        this.d = t1pVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yqi)) {
            return false;
        }
        yqi yqiVar = (yqi) obj;
        return Intrinsics.d(this.a, yqiVar.a) && this.b.equals(yqiVar.b) && this.c == yqiVar.c && this.d == yqiVar.d;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        t1p t1pVar = this.d;
        return hashCode + (t1pVar == null ? 0 : t1pVar.hashCode());
    }

    public final String toString() {
        return "MyMusicSearchParams(query=" + this.a + ", searchEntity=" + this.b + ", context=" + this.c + ", filter=" + this.d + ")";
    }
}
