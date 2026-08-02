package defpackage;

/* loaded from: classes4.dex */
public final class jni extends swf {
    public final /* synthetic */ os a;
    public final /* synthetic */ dae b;
    public final /* synthetic */ m2g c;

    public jni(os osVar, dae daeVar, m2g m2gVar) {
        this.a = osVar;
        this.b = daeVar;
        this.c = m2gVar;
    }

    @Override // defpackage.swf
    public final void Y(gln glnVar, int i, String str) {
        glnVar.getClass();
        ssg.a(3, "MusicMatchClient", "closed (" + i + ")", null);
    }

    @Override // defpackage.swf
    public final void a0(gln glnVar, Exception exc, l3o l3oVar) {
        ssg.a(6, "MusicMatchClient", "error code=" + (l3oVar != null ? Integer.valueOf(l3oVar.d) : null), exc);
        this.c.invoke(exc, l3oVar);
    }

    @Override // defpackage.swf
    public final void c0(gln glnVar, String str) {
        glnVar.getClass();
        this.b.invoke(str);
    }

    @Override // defpackage.swf
    public final void d0(gln glnVar, l3o l3oVar) {
        l3oVar.getClass();
        ssg.a(3, "MusicMatchClient", "connected", null);
        this.a.invoke();
    }
}
