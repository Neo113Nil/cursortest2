package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class l1h {
    public final String a;
    public final String b;
    public final Long c;
    public final CharSequence d;
    public final long e;
    public final jzb f;

    public l1h(String str, String str2, Long l, String str3, long j, jzb jzbVar) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
        this.c = l;
        this.d = str3;
        this.e = j;
        this.f = jzbVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l1h)) {
            return false;
        }
        l1h l1hVar = (l1h) obj;
        return Intrinsics.d(this.a, l1hVar.a) && Intrinsics.d(this.b, l1hVar.b) && this.c.equals(l1hVar.c) && Intrinsics.d(this.d, l1hVar.d) && this.e == l1hVar.e && this.f == l1hVar.f;
    }

    public final int hashCode() {
        int hashCode = (this.c.hashCode() + k5r.c(this.a.hashCode() * 31, 31, this.b)) * 31;
        CharSequence charSequence = this.d;
        int c = tlm.c(this.e, (hashCode + (charSequence == null ? 0 : charSequence.hashCode())) * 31, 31);
        jzb jzbVar = this.f;
        return c + (jzbVar != null ? jzbVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = f1d.m("LyricsBottomSheetHeaderUiState(id=", this.a, ", title=", this.b, ", subtitlePostfix=");
        m.append(this.c);
        m.append(", subtitle=");
        m.append((Object) this.d);
        m.append(", duration=");
        m.append(this.e);
        m.append(", explicitType=");
        m.append(this.f);
        m.append(")");
        return m.toString();
    }
}
