package m8;

/* loaded from: classes2.dex */
public final class k extends l8.a {

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ v f39522e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ l f39523f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(String str, v vVar, l lVar) {
        super(str);
        this.f39522e = vVar;
        this.f39523f = lVar;
    }

    @Override // l8.a
    public final long a() {
        u uVar;
        v vVar = this.f39522e;
        try {
            uVar = vVar.c();
        } catch (Throwable th) {
            uVar = new u(vVar, th, 2);
        }
        l lVar = this.f39523f;
        if (!lVar.f39528x.contains(vVar)) {
            return -1L;
        }
        lVar.f39529y.put(uVar);
        return -1L;
    }
}
