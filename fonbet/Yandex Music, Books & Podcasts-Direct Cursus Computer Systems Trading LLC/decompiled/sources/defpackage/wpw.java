package defpackage;

/* loaded from: classes4.dex */
public final class wpw implements g4q {
    public static final /* synthetic */ s9f[] l;
    public final diw e;
    public final vdr f;
    public final rjq g;
    public final um6 h;
    public final xdr i;
    public final r2e j;
    public final ogp k;

    static {
        opi opiVar = new opi(wpw.class, "processor", "getProcessor()Lcom/yandex/music/shared/ynison/domain/playback/YnisonRemoteQueueCommandsProcessor;", 0);
        ern.a.getClass();
        l = new s9f[]{opiVar};
    }

    public wpw(diw diwVar, vdr vdrVar) {
        vdrVar.getClass();
        this.e = diwVar;
        this.f = vdrVar;
        rjq rjqVar = new rjq(false);
        this.g = rjqVar;
        this.h = hld.s(rjqVar, dm6.b());
        diwVar.b(hag.I(rlw.class), true);
        this.i = ydr.a(r7q.a);
        this.j = new r2e(5, this);
        this.k = ogp.k;
    }

    @Override // defpackage.g4q
    public final void a(c9g c9gVar) {
        ssg.a(4, "YnisonRemoteQueue", "stop passive playback", null);
        this.g.V();
        s7q s7qVar = new s7q(this);
        xdr xdrVar = this.i;
        xdrVar.getClass();
        xdrVar.m(null, s7qVar);
        hqw b = b();
        if (b != null) {
            b.d();
        }
        this.j.setValue(this, l[0], null);
    }

    public final hqw b() {
        return (hqw) this.j.getValue(this, l[0]);
    }

    @Override // defpackage.g4q
    public final k7q getDescriptor() {
        return h5b.a;
    }

    @Override // defpackage.g4q
    public final vdr getState() {
        return this.i;
    }

    @Override // defpackage.g4q
    public final void start() {
        ssg.a(4, "YnisonRemoteQueue", "start", null);
        this.g.g();
        xdr xdrVar = this.i;
        xdrVar.getClass();
        xdrVar.m(null, r7q.a);
        ox6.B(zsd.b0(new l8v(this.f, this, 20)), this.h, new lot(27, this));
    }
}
