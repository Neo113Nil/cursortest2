package h2;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public abstract class r {

    /* renamed from: a, reason: collision with root package name */
    public static final long f2705a;

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f2706b = 0;

    static {
        s2.o[] oVarArr = s2.n.f6400b;
        f2705a = s2.n.f6401c;
    }

    /* JADX WARN: Code restructure failed: missing block: B:55:0x0024, code lost:
    
        if (r1 == r18.f2696a) goto L7;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final q a(q qVar, int i10, int i11, long j3, r2.q qVar2, s sVar, r2.i iVar, int i12, int i13, r2.s sVar2) {
        long j6;
        int i14 = i10;
        int i15 = i11;
        long j10 = j3;
        r2.q qVar3 = qVar2;
        s sVar3 = sVar;
        r2.i iVar2 = iVar;
        int i16 = i12;
        int i17 = i13;
        r2.s sVar4 = sVar2;
        if (i14 == Integer.MIN_VALUE) {
            j6 = 0;
        } else {
            j6 = 0;
        }
        s2.o[] oVarArr = s2.n.f6400b;
        if (((j10 & 1095216660480L) == j6 || s2.n.a(j10, qVar.f2698c)) && ((qVar3 == null || qVar3.equals(qVar.f2699d)) && ((i15 == Integer.MIN_VALUE || i15 == qVar.f2697b) && ((sVar3 == null || sVar3.equals(qVar.f2700e)) && ((iVar2 == null || iVar2.equals(qVar.f2701f)) && ((i16 == 0 || i16 == qVar.f2702g) && ((i17 == Integer.MIN_VALUE || i17 == qVar.f2703h) && (sVar4 == null || sVar4.equals(qVar.f2704i))))))))) {
            return qVar;
        }
        s2.o[] oVarArr2 = s2.n.f6400b;
        if ((j10 & 1095216660480L) == j6) {
            j10 = qVar.f2698c;
        }
        if (qVar3 == null) {
            qVar3 = qVar.f2699d;
        }
        if (i14 == Integer.MIN_VALUE) {
            i14 = qVar.f2696a;
        }
        if (i15 == Integer.MIN_VALUE) {
            i15 = qVar.f2697b;
        }
        s sVar5 = qVar.f2700e;
        if (sVar5 != null && sVar3 == null) {
            sVar3 = sVar5;
        }
        if (iVar2 == null) {
            iVar2 = qVar.f2701f;
        }
        if (i16 == 0) {
            i16 = qVar.f2702g;
        }
        if (i17 == Integer.MIN_VALUE) {
            i17 = qVar.f2703h;
        }
        if (sVar4 == null) {
            sVar4 = qVar.f2704i;
        }
        return new q(i14, i15, j10, qVar3, sVar3, iVar2, i16, i17, sVar4);
    }
}
