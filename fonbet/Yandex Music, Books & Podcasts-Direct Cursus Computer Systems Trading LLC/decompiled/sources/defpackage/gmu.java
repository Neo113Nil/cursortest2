package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes4.dex */
public final class gmu {
    public final String a;
    public final String b;
    public final String c;
    public final StationId d;
    public final List e;
    public final String f;
    public final String g;

    public gmu(String str, String str2, String str3, StationId stationId, List list, String str4, String str5) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = stationId;
        this.e = list;
        this.f = str4;
        this.g = str5;
    }

    public static gmu a(gmu gmuVar, String str) {
        String str2 = gmuVar.a;
        String str3 = gmuVar.b;
        StationId stationId = gmuVar.d;
        List list = gmuVar.e;
        String str4 = gmuVar.f;
        String str5 = gmuVar.g;
        gmuVar.getClass();
        return new gmu(str2, str3, str, stationId, list, str4, str5);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gmu)) {
            return false;
        }
        gmu gmuVar = (gmu) obj;
        return this.a.equals(gmuVar.a) && Intrinsics.d(this.b, gmuVar.b) && Intrinsics.d(this.c, gmuVar.c) && this.d.equals(gmuVar.d) && this.e.equals(gmuVar.e) && Intrinsics.d(this.f, gmuVar.f) && Intrinsics.d(this.g, gmuVar.g);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int d = k5r.d((this.d.hashCode() + ((hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31, 31, this.e);
        String str3 = this.f;
        int hashCode3 = (d + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.g;
        return hashCode3 + (str4 != null ? str4.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder m = f1d.m("WaveButton(title=", this.a, ", header=", this.b, ", backgroundImageUrl=");
        m.append(this.c);
        m.append(", stationId=");
        m.append(this.d);
        m.append(", seeds=");
        m.append(this.e);
        m.append(", average=");
        m.append(this.f);
        m.append(", waveTextColor=");
        return su4.o(m, this.g, ")");
    }
}
