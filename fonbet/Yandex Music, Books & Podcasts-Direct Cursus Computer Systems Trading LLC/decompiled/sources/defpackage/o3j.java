package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o3j {
    public final String a;
    public final String b;
    public final v9b c;
    public final v9b d;

    public o3j(String str, String str2, v9b v9bVar, v9b v9bVar2) {
        this.a = str;
        this.b = str2;
        this.c = v9bVar;
        this.d = v9bVar2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3j)) {
            return false;
        }
        o3j o3jVar = (o3j) obj;
        return this.a.equals(o3jVar.a) && Intrinsics.d(this.b, o3jVar.b) && Intrinsics.d(this.c, o3jVar.c) && Intrinsics.d(this.d, o3jVar.d);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        v9b v9bVar = this.c;
        int hashCode3 = (hashCode2 + (v9bVar == null ? 0 : v9bVar.hashCode())) * 31;
        v9b v9bVar2 = this.d;
        return hashCode3 + (v9bVar2 != null ? v9bVar2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = f1d.m("NewEpisodesEntityUiData(title=", this.a, ", subtitle=", this.b, ", foregroundCover=");
        m.append(this.c);
        m.append(", backgroundCover=");
        m.append(this.d);
        m.append(")");
        return m.toString();
    }
}
