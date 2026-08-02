package defpackage;

/* loaded from: classes4.dex */
public final class bzn extends pxm {
    public final String c;
    public final int d;
    public final hjm e;
    public final fwk f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bzn(String str, String str2, String str3, int i, hjm hjmVar, fwk fwkVar) {
        super(str, str2);
        str.getClass();
        fwkVar.getClass();
        this.c = str3;
        this.d = i;
        this.e = hjmVar;
        this.f = fwkVar;
    }

    @Override // defpackage.pxm
    public final void d(p3i p3iVar) {
        super.d(p3iVar);
        p3iVar.d("uuid", this.c);
        p3iVar.c(Integer.valueOf(this.d), "percentPrefetched");
        p3iVar.d("prefetchType", this.e.a);
        p3iVar.d("extraTrackType", this.f.a);
    }
}
