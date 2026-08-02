package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes3.dex */
public final class i7p extends j7p {
    public final euu a;
    public final klu b;
    public final List c;
    public final StationId d;
    public final e4p e;
    public final String f;

    public i7p(euu euuVar, klu kluVar, List list, StationId stationId, e4p e4pVar, String str) {
        stationId.getClass();
        str.getClass();
        this.a = euuVar;
        this.b = kluVar;
        this.c = list;
        this.d = stationId;
        this.e = e4pVar;
        this.f = str;
    }

    @Override // defpackage.y7p
    public final e4p b() {
        return this.e;
    }

    @Override // defpackage.j7p
    public final String c() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i7p)) {
            return false;
        }
        i7p i7pVar = (i7p) obj;
        return this.a.equals(i7pVar.a) && Intrinsics.d(this.b, i7pVar.b) && this.c.equals(i7pVar.c) && Intrinsics.d(this.d, i7pVar.d) && this.e == i7pVar.e && Intrinsics.d(this.f, i7pVar.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        klu kluVar = this.b;
        return this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + k5r.d((hashCode + (kluVar == null ? 0 : kluVar.hashCode())) * 31, 31, this.c)) * 31)) * 31);
    }

    public final String toString() {
        return "Wave(uiData=" + this.a + ", agentUiData=" + this.b + ", seeds=" + this.c + ", stationId=" + this.d + ", source=" + this.e + ", id=" + this.f + ")";
    }
}
