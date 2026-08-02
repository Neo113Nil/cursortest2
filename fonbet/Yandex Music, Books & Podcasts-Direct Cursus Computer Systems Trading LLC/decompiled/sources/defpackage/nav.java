package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes4.dex */
public final class nav {
    public final String a;
    public final String b;
    public final String c;
    public final m1u d;
    public final String e;
    public final List f;
    public final StationId g;

    public nav(String str, String str2, String str3, m1u m1uVar, String str4, List list) {
        list.getClass();
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = m1uVar;
        this.e = str4;
        this.f = list;
        StationId f = StationId.f(str4);
        f.getClass();
        this.g = f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nav)) {
            return false;
        }
        nav navVar = (nav) obj;
        return this.a.equals(navVar.a) && Intrinsics.d(this.b, navVar.b) && Intrinsics.d(this.c, navVar.c) && Intrinsics.d(this.d, navVar.d) && this.e.equals(navVar.e) && Intrinsics.d(this.f, navVar.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        m1u m1uVar = this.d;
        return this.f.hashCode() + k5r.c((hashCode3 + (m1uVar != null ? m1uVar.hashCode() : 0)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder m = f1d.m("WavesBlockUiData(title=", this.a, ", header=", this.b, ", backgroundImageUrl=");
        m.append(this.c);
        m.append(", colors=");
        m.append(this.d);
        m.append(", stationId=");
        m.append(this.e);
        m.append(", seeds=");
        m.append(this.f);
        m.append(")");
        return m.toString();
    }
}
