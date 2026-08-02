package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes3.dex */
public final class ham {
    public final String a;
    public final String b;
    public final String c;
    public final boolean d;
    public final saj e;
    public final String f;

    public ham(String str, String str2, String str3, boolean z, saj sajVar, String str4) {
        str3.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = z;
        this.e = sajVar;
        this.f = str4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ham)) {
            return false;
        }
        ham hamVar = (ham) obj;
        return Intrinsics.d(this.a, hamVar.a) && Intrinsics.d(this.b, hamVar.b) && Intrinsics.d(this.c, hamVar.c) && this.d == hamVar.d && Intrinsics.d(this.e, hamVar.e) && Intrinsics.d(this.f, hamVar.f);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int e = k5r.e(k5r.c((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.c), 31, this.d);
        saj sajVar = this.e;
        int hashCode2 = (e + (sajVar == null ? 0 : sajVar.hashCode())) * 31;
        String str3 = this.f;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = f1d.m("PodcastInfoUiData(description=", this.a, ", publisher=", this.b, ", publisherLabel=");
        m.append(this.c);
        m.append(", hasExplicitLabel=");
        m.append(this.d);
        m.append(", previewTrack=");
        m.append(this.e);
        m.append(", foreignAgentDisclaimer=");
        m.append(this.f);
        m.append(")");
        return m.toString();
    }
}
