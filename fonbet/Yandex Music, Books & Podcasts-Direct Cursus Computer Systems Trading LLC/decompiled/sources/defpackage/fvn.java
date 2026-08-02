package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class fvn {
    public final boolean a;
    public final String b;
    public final Integer c;
    public final Boolean d;
    public final nyn e;
    public final a4g f;
    public final String g;

    public fvn(boolean z, String str, Integer num, Boolean bool, nyn nynVar, a4g a4gVar, String str2) {
        this.a = z;
        this.b = str;
        this.c = num;
        this.d = bool;
        this.e = nynVar;
        this.f = a4gVar;
        this.g = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fvn)) {
            return false;
        }
        fvn fvnVar = (fvn) obj;
        return this.a == fvnVar.a && this.b.equals(fvnVar.b) && Intrinsics.d(this.c, fvnVar.c) && Intrinsics.d(this.d, fvnVar.d) && this.e == fvnVar.e && this.f.equals(fvnVar.f) && Intrinsics.d(this.g, fvnVar.g);
    }

    public final int hashCode() {
        int c = k5r.c(Boolean.hashCode(this.a) * 31, 31, this.b);
        Integer num = this.c;
        int hashCode = (c + (num == null ? 0 : num.hashCode())) * 31;
        Boolean bool = this.d;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        nyn nynVar = this.e;
        int hashCode3 = (this.f.hashCode() + ((hashCode2 + (nynVar == null ? 0 : nynVar.hashCode())) * 31)) * 31;
        String str = this.g;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("RemotePlaybackRequest(play=");
        sb.append(this.a);
        sb.append(", from=");
        sb.append(this.b);
        sb.append(", position=");
        sb.append(this.c);
        sb.append(", shuffle=");
        sb.append(this.d);
        sb.append(", repeatMode=");
        sb.append(this.e);
        sb.append(", content=");
        sb.append(this.f);
        sb.append(", playbackActionId=");
        return su4.o(sb, this.g, ")");
    }
}
