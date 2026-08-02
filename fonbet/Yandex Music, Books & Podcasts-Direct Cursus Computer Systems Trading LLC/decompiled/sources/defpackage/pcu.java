package defpackage;

/* loaded from: classes4.dex */
public final class pcu implements mcu {
    public final x6k a;
    public final /* synthetic */ fk0 b;
    public final /* synthetic */ aqi c;
    public final /* synthetic */ aqi d;
    public final /* synthetic */ sdr e;

    public pcu(sbu sbuVar, fk0 fk0Var, aqi aqiVar, aqi aqiVar2, poi poiVar) {
        this.b = fk0Var;
        this.c = aqiVar;
        this.d = aqiVar2;
        this.e = poiVar;
        this.a = sbuVar.d;
    }

    @Override // defpackage.mcu
    public final float a() {
        return ((Number) this.e.getValue()).floatValue();
    }

    @Override // defpackage.mcu
    public final kcu b() {
        return (kcu) this.d.getValue();
    }

    @Override // defpackage.mcu
    public final float c() {
        return ((Number) this.b.e()).floatValue();
    }

    @Override // defpackage.mcu
    public final x6k d() {
        return this.a;
    }

    @Override // defpackage.mcu
    public final boolean e() {
        return ((Boolean) this.c.getValue()).booleanValue();
    }
}
