package m8;

/* loaded from: classes2.dex */
public final class l extends l8.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ w f39365e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ m f39366f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(String str, w wVar, m mVar) {
        super(str);
        this.f39365e = wVar;
        this.f39366f = mVar;
    }

    @Override // l8.a
    public final long a() {
        v vVar;
        w wVar = this.f39365e;
        try {
            vVar = wVar.c();
        } catch (Throwable th) {
            vVar = new v(wVar, th, 2);
        }
        m mVar = this.f39366f;
        if (!mVar.f39371x.contains(wVar)) {
            return -1L;
        }
        mVar.f39372y.put(vVar);
        return -1L;
    }
}
