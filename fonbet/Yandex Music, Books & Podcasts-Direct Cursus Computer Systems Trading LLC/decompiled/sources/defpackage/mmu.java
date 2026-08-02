package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes3.dex */
public final class mmu {
    public final String a;
    public final String b;
    public final String c;
    public final StationId d;
    public final List e;
    public final lmu f;

    public mmu(String str, String str2, String str3, StationId stationId, List list, lmu lmuVar) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = stationId;
        this.e = list;
        this.f = lmuVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mmu)) {
            return false;
        }
        mmu mmuVar = (mmu) obj;
        return this.a.equals(mmuVar.a) && Intrinsics.d(this.b, mmuVar.b) && Intrinsics.d(this.c, mmuVar.c) && this.d.equals(mmuVar.d) && this.e.equals(mmuVar.e) && this.f.equals(mmuVar.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return this.f.hashCode() + k5r.d((this.d.hashCode() + ((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31, 31, this.e);
    }

    public final String toString() {
        StringBuilder m = f1d.m("WaveButtonData(title=", this.a, ", header=", this.b, ", backgroundImageUrl=");
        m.append(this.c);
        m.append(", stationId=");
        m.append(this.d);
        m.append(", seeds=");
        m.append(this.e);
        m.append(", colors=");
        m.append(this.f);
        m.append(")");
        return m.toString();
    }
}
