package defpackage;

/* loaded from: classes.dex */
public final class vio {
    public final uio a;
    public final osh b;
    public final zno c;
    public boolean d;
    public boolean e;
    public final /* synthetic */ wio f;

    public vio(wio wioVar, zio zioVar, int i, aio aioVar) {
        this.f = wioVar;
        this.b = new osh(k5r.i(i, "ExoPlayer:RtspMediaPeriod:RtspLoaderWrapper "));
        zno znoVar = new zno(wioVar.a, null, null);
        this.c = znoVar;
        this.a = new uio(wioVar, zioVar, i, znoVar, aioVar);
        znoVar.f = wioVar.c;
    }

    public final void a() {
        if (this.d) {
            return;
        }
        this.a.b.j = true;
        this.d = true;
        wio.b(this.f);
    }
}
