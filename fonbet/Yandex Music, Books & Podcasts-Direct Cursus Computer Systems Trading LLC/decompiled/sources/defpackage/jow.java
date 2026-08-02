package defpackage;

import ru.yandex.music.data.wave.recommendations.StationId;

/* loaded from: classes4.dex */
public final class jow extends oow {
    public final StationId a;
    public final e5d b;
    public final gxc c;
    public final boolean d;
    public final long e;

    public jow(StationId stationId, e5d e5dVar, gxc gxcVar, boolean z, long j) {
        stationId.getClass();
        e5dVar.getClass();
        gxcVar.getClass();
        this.a = stationId;
        this.b = e5dVar;
        this.c = gxcVar;
        this.d = z;
        this.e = j;
    }

    @Override // defpackage.oow
    public final boolean a() {
        throw null;
    }

    @Override // defpackage.oow
    public final long b() {
        throw null;
    }

    @Override // defpackage.oow
    public final h4q c() {
        throw null;
    }

    @Override // defpackage.oow
    public final long d() {
        return this.e;
    }

    public final String toString() {
        return hrg.q("Launch.Generative(", this.a.h(), ")");
    }
}
