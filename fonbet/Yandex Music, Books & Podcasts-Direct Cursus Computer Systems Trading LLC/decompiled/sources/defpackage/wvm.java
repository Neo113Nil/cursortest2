package defpackage;

/* loaded from: classes.dex */
public final class wvm implements tvh {
    public final va7 a;
    public final uvg b;
    public hra c;
    public xeg d;
    public final int e;

    public wvm(va7 va7Var, u2c u2cVar) {
        uvg uvgVar = new uvg(28, u2cVar);
        es6 es6Var = new es6(4);
        klx klxVar = new klx(19);
        this.a = va7Var;
        this.b = uvgVar;
        this.c = es6Var;
        this.d = klxVar;
        this.e = 1048576;
    }

    @Override // defpackage.tvh
    public final wvh d(onh onhVar) {
        onhVar.b.getClass();
        return new xvm(onhVar, this.a, this.b, this.c.v(onhVar), this.d, this.e, null);
    }

    @Override // defpackage.tvh
    public final tvh e(hra hraVar) {
        vq1.y(hraVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.c = hraVar;
        return this;
    }

    public wvm(va7 va7Var) {
        this(va7Var, new hm7());
    }
}
