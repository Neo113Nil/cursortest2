package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class olj {
    public final String a;
    public final String b;
    public final int c;
    public final Integer d;
    public final int e;
    public final int f;
    public final String g;
    public final Integer h;

    public olj(String str, String str2, int i, Integer num, int i2, int i3, String str3, Integer num2) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = num;
        this.e = i2;
        this.f = i3;
        this.g = str3;
        this.h = num2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof olj)) {
            return false;
        }
        olj oljVar = (olj) obj;
        return Intrinsics.d(this.a, oljVar.a) && Intrinsics.d(this.b, oljVar.b) && this.c == oljVar.c && Intrinsics.d(this.d, oljVar.d) && this.e == oljVar.e && this.f == oljVar.f && Intrinsics.d(this.g, oljVar.g) && Intrinsics.d(this.h, oljVar.h);
    }

    public final int hashCode() {
        int a = f1d.a(this.c, k5r.c(this.a.hashCode() * 31, 31, this.b), 31);
        Integer num = this.d;
        int a2 = f1d.a(this.f, f1d.a(this.e, (a + (num == null ? 0 : num.hashCode())) * 31, 31), 31);
        String str = this.g;
        int hashCode = (a2 + (str == null ? 0 : str.hashCode())) * 31;
        Integer num2 = this.h;
        return hashCode + (num2 != null ? num2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = f1d.m("OfflineRecommenderMeta(version=", this.a, ", programUpdateDate=", this.b, ", availableTrackCount=");
        m.append(this.c);
        m.append(", lastTrackCount=");
        m.append(this.d);
        m.append(", programSize=");
        hrg.w(this.e, this.f, ", programStateSize=", ", seeds=", m);
        m.append(this.g);
        m.append(", serverDataCount=");
        m.append(this.h);
        m.append(")");
        return m.toString();
    }

    public /* synthetic */ olj(int i) {
        this("shuffle", "N/A", i, null, 0, 0, null, null);
    }
}
