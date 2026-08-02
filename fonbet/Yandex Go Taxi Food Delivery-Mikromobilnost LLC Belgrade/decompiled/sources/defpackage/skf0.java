package defpackage;

/* loaded from: classes10.dex */
public final class skf0 implements rf10 {
    public final ipg a;
    public final vfc0 b;
    public rmm c;
    public twy d;
    public final int e;

    public skf0(ipg ipgVar, e5p e5pVar) {
        vfc0 vfc0Var = new vfc0(8, e5pVar);
        rah rahVar = new rah();
        beh behVar = new beh();
        this.a = ipgVar;
        this.b = vfc0Var;
        this.c = rahVar;
        this.d = behVar;
        this.e = 1048576;
    }

    @Override // defpackage.rf10
    public final uf10 createMediaSource(fe10 fe10Var) {
        fe10Var.b.getClass();
        return new tkf0(fe10Var, this.a, this.b, this.c.a(fe10Var), this.d, this.e, null);
    }

    @Override // defpackage.rf10
    public final int[] getSupportedTypes() {
        return new int[]{4};
    }

    @Override // defpackage.rf10
    public final rf10 setDrmSessionManagerProvider(rmm rmmVar) {
        d6z.u(rmmVar, "MediaSource.Factory#setDrmSessionManagerProvider no longer handles null by instantiating a new DefaultDrmSessionManagerProvider. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.c = rmmVar;
        return this;
    }

    @Override // defpackage.rf10
    public final rf10 setLoadErrorHandlingPolicy(twy twyVar) {
        d6z.u(twyVar, "MediaSource.Factory#setLoadErrorHandlingPolicy no longer handles null by instantiating a new DefaultLoadErrorHandlingPolicy. Explicitly construct and pass an instance in order to retain the old behavior.");
        this.d = twyVar;
        return this;
    }
}
