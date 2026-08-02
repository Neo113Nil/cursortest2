package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import ru.yandex.music.data.wave.recommendations.Icon;
import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes4.dex */
public final class baq implements f5q {
    public final StationId a;
    public final e5d b;
    public final caq c;
    public final String d;
    public final c5b e;
    public final String f;
    public final dgr g;

    public baq(StationId stationId, e5d e5dVar) {
        stationId.getClass();
        e5dVar.getClass();
        this.a = stationId;
        this.b = e5dVar;
        this.c = new caq(stationId.h());
        String str = e5dVar.c;
        this.d = str;
        this.e = c5b.a;
        this.f = str;
        iow iowVar = iow.a;
        List c = t75.c(stationId.toString());
        String str2 = e5dVar.e;
        String hexString = Integer.toHexString(-65536);
        hexString.getClass();
        new Icon(str2, hexString);
        this.g = new dgr(stationId, c, str, "");
    }

    @Override // defpackage.f5q
    public final List c() {
        return this.e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof baq)) {
            return false;
        }
        baq baqVar = (baq) obj;
        return Intrinsics.d(this.a, baqVar.a) && Intrinsics.d(this.b, baqVar.b);
    }

    @Override // defpackage.f5q
    public final String getDescription() {
        return this.f;
    }

    @Override // defpackage.u3q
    public final a0q getId() {
        return this.c;
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SharedYnisonGenerativeEntity(stationId=" + this.a + ", stream=" + this.b + ")";
    }

    @Override // defpackage.f5q, defpackage.u3q
    public final aaq getId() {
        return this.c;
    }
}
