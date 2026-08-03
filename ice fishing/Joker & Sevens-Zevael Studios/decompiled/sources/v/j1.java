package v;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public interface j1 {
    boolean a();

    long b(n nVar, n nVar2, n nVar3);

    n k(long j3, n nVar, n nVar2, n nVar3);

    default n n(n nVar, n nVar2, n nVar3) {
        return p(b(nVar, nVar2, nVar3), nVar, nVar2, nVar3);
    }

    n p(long j3, n nVar, n nVar2, n nVar3);
}
