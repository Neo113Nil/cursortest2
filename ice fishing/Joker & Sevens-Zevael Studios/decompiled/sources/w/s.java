package w;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class s implements f1.g0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7501a;

    @Override // f1.g0
    public final f1.b0 a(long j3, s2.l lVar, s2.c cVar) {
        switch (this.f7501a) {
            case 0:
                float D = cVar.D(t.f7504a);
                return new f1.z(new e1.c(0.0f, -D, e1.e.d(j3), e1.e.b(j3) + D));
            default:
                float D2 = cVar.D(t.f7504a);
                return new f1.z(new e1.c(-D2, 0.0f, e1.e.d(j3) + D2, e1.e.b(j3)));
        }
    }
}
