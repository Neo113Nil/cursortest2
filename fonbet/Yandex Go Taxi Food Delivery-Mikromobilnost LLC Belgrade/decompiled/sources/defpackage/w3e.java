package defpackage;

/* loaded from: classes5.dex */
public final class w3e implements zni {
    public final qcp0 a;
    public final an8 b;
    public final v3e c;
    public final y3e w;

    public w3e(qcp0 qcp0Var, an8 an8Var, v3e v3eVar, y3e y3eVar) {
        this.a = qcp0Var;
        this.b = an8Var;
        this.c = v3eVar;
        this.w = y3eVar;
    }

    @Override // defpackage.zni
    public final xni create() {
        this.a.getClass();
        return new aoi(this.b, this.c, this.w);
    }
}
