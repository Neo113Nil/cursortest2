package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes4.dex */
public final class u1u {
    public final StationId a;
    public final List b;
    public final String c;
    public final String d;
    public final int e;
    public final String f;
    public final np g;

    public u1u(StationId stationId, List list, String str, String str2, int i, String str3, np npVar) {
        list.getClass();
        this.a = stationId;
        this.b = list;
        this.c = str;
        this.d = str2;
        this.e = i;
        this.f = str3;
        this.g = npVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u1u)) {
            return false;
        }
        u1u u1uVar = (u1u) obj;
        return this.a.equals(u1uVar.a) && Intrinsics.d(this.b, u1uVar.b) && this.c.equals(u1uVar.c) && this.d.equals(u1uVar.d) && this.e == u1uVar.e && Intrinsics.d(this.f, u1uVar.f) && Intrinsics.d(this.g, u1uVar.g);
    }

    public final int hashCode() {
        int a = f1d.a(this.e, k5r.c(k5r.c(k5r.d(this.a.hashCode() * 31, 31, this.b), 31, this.c), 31, this.d), 31);
        String str = this.f;
        int hashCode = (a + (str == null ? 0 : str.hashCode())) * 31;
        np npVar = this.g;
        return hashCode + (npVar != null ? npVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VibeSearchModel(stationId=");
        sb.append(this.a);
        sb.append(", seeds=");
        sb.append(this.b);
        sb.append(", title=");
        su4.v(sb, this.c, ", subtitle=", this.d, ", coverBackgroundColor=");
        sb.append(this.e);
        sb.append(", coverUrlTemplate=");
        sb.append(this.f);
        sb.append(", agent=");
        sb.append(this.g);
        sb.append(")");
        return sb.toString();
    }
}
