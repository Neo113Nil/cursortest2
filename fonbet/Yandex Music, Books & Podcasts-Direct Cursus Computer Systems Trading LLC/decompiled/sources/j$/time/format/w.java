package j$.time.format;

import j$.time.ZoneId;
import j$.time.temporal.TemporalAccessor;

/* loaded from: classes2.dex */
public final class w implements TemporalAccessor {
    public final /* synthetic */ j$.time.chrono.b a;
    public final /* synthetic */ TemporalAccessor b;
    public final /* synthetic */ j$.time.chrono.m c;
    public final /* synthetic */ ZoneId d;

    public w(j$.time.chrono.b bVar, TemporalAccessor temporalAccessor, j$.time.chrono.m mVar, ZoneId zoneId) {
        this.a = bVar;
        this.b = temporalAccessor;
        this.c = mVar;
        this.d = zoneId;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean f(j$.time.temporal.o oVar) {
        j$.time.chrono.b bVar = this.a;
        if (bVar != null && oVar.isDateBased()) {
            return bVar.f(oVar);
        }
        return this.b.f(oVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s k(j$.time.temporal.o oVar) {
        j$.time.chrono.b bVar = this.a;
        if (bVar != null && oVar.isDateBased()) {
            return bVar.k(oVar);
        }
        return this.b.k(oVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long g(j$.time.temporal.o oVar) {
        j$.time.chrono.b bVar = this.a;
        if (bVar != null && oVar.isDateBased()) {
            return bVar.g(oVar);
        }
        return this.b.g(oVar);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object b(j$.time.f fVar) {
        if (fVar == j$.time.temporal.p.b) {
            return this.c;
        }
        if (fVar == j$.time.temporal.p.a) {
            return this.d;
        }
        if (fVar == j$.time.temporal.p.c) {
            return this.b.b(fVar);
        }
        return fVar.j(this);
    }

    public final String toString() {
        String str;
        String str2 = "";
        j$.time.chrono.m mVar = this.c;
        if (mVar != null) {
            str = " with chronology " + mVar;
        } else {
            str = "";
        }
        ZoneId zoneId = this.d;
        if (zoneId != null) {
            str2 = " with zone " + zoneId;
        }
        return this.b + str + str2;
    }
}
