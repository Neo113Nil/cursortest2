package defpackage;

/* loaded from: classes4.dex */
public abstract class gzn extends pxm {
    @Override // defpackage.pxm
    public void d(p3i p3iVar) {
        super.d(p3iVar);
        p3iVar.d("name", g());
        p3iVar.d("type", j().a);
        p3iVar.d("place", i().a);
        String f = f();
        if (f != null) {
            p3iVar.d("codec", f);
        }
        Integer e = e();
        if (e != null) {
            p3iVar.c(Integer.valueOf(e.intValue()), "bitrate");
        }
        String h = h();
        if (h != null) {
            p3iVar.d("expectedQuality", h);
        }
    }

    public abstract Integer e();

    public abstract String f();

    public abstract String g();

    public abstract String h();

    public abstract agb i();

    public abstract vgb j();
}
