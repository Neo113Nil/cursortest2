package defpackage;

/* loaded from: classes10.dex */
public abstract class sz6 {
    public static final l690 a = new l690(16.0f, 8.0f, 16.0f, 8.0f);
    public static final float b = 64.0f;
    public static final float c = 36.0f;

    static {
        an91.c(8.0f, 8.0f, 8.0f, 8.0f);
    }

    public static h7h a(int i, int i2, long j, fid fidVar) {
        long j2;
        if ((i2 & 1) != 0) {
            j2 = ((lic) ((bts) fidVar).m(mic.a)).c();
        } else {
            j2 = j;
        }
        long a2 = mic.a(j2, fidVar);
        a7u0 a7u0Var = mic.a;
        bts btsVar = (bts) fidVar;
        long k = rzo.k(ldc.b(((lic) btsVar.m(a7u0Var)).b(), 0.12f, 0.0f, 0.0f, 0.0f, 14), ((lic) btsVar.m(a7u0Var)).d());
        bts btsVar2 = (bts) fidVar;
        long b2 = ((lic) btsVar2.m(a7u0Var)).b();
        long j3 = ((ldc) btsVar2.m(cfe.a)).a;
        if (((lic) btsVar2.m(a7u0Var)).e()) {
            rzo.M(j3);
        } else {
            rzo.M(j3);
        }
        return new h7h(j2, a2, k, ldc.b(b2, 0.38f, 0.0f, 0.0f, 0.0f, 14));
    }
}
