package D;

import K0.C0044u;
import K0.InterfaceC0045v;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* loaded from: classes.dex */
public final class h0 extends x0.f implements D0.p {

    /* renamed from: j, reason: collision with root package name */
    public D0.p f201j;

    /* renamed from: k, reason: collision with root package name */
    public int f202k;

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C0013n f203l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(C0013n c0013n, v0.d dVar) {
        super(2, dVar);
        this.f203l = c0013n;
    }

    @Override // D0.p
    public final Object f(Object obj, Object obj2) {
        return ((h0) l((InterfaceC0045v) obj, (v0.d) obj2)).n(t0.g.f2989a);
    }

    @Override // x0.b
    public final v0.d l(Object obj, v0.d dVar) {
        return new h0(this.f203l, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x018c, code lost:
    
        r6.B();
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x018f, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0190, code lost:
    
        r20 = r2;
        r5.a();
        r2 = r6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00c8, code lost:
    
        if (r6 != M0.d.f724n) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ca, code lost:
    
        r6 = K0.AbstractC0046w.c(o.g.u(r21));
        r20 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00df, code lost:
    
        r8 = r7.A(r5, r10, r16, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00e3, code lost:
    
        if (r8 != r13) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e5, code lost:
    
        r6.a(r5, r10);
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0187, code lost:
    
        r2 = r6.u();
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0196, code lost:
    
        if (r2 != r0) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0198, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x0199, code lost:
    
        r3 = r20;
        r4 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00ec, code lost:
    
        r2 = r7.f709g;
        r13 = r6.f509j;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x00f0, code lost:
    
        if (r8 != r12) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00f8, code lost:
    
        if (r16 >= r7.p()) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x00fa, code lost:
    
        r5.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0101, code lost:
    
        r4 = (M0.j) r14.get(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0110, code lost:
    
        if (r7.r(r15.get(r7), true) == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x011f, code lost:
    
        r16 = r13.getAndIncrement(r7);
        r8 = M0.d.f712b;
        r10 = r16 / r8;
        r5 = (int) (r16 % r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x012f, code lost:
    
        if (r4.f905h == r10) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0131, code lost:
    
        r8 = r7.j(r10, r4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0135, code lost:
    
        if (r8 != null) goto L113;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x0138, code lost:
    
        r4 = r8;
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x0139, code lost:
    
        r14 = r13;
        r8 = r7.A(r4, r5, r16, r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0146, code lost:
    
        if (r8 != M0.d.f723m) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x014e, code lost:
    
        if (r8 != M0.d.f725o) goto L116;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0156, code lost:
    
        if (r16 >= r7.p()) goto L68;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0158, code lost:
    
        r4.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x015b, code lost:
    
        r13 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x015f, code lost:
    
        if (r8 == M0.d.f724n) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0161, code lost:
    
        r4.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0164, code lost:
    
        if (r2 == null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0166, code lost:
    
        r3 = new P0.q(r2, r8, r14);
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x016d, code lost:
    
        r6.e(r8, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x016c, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x0178, code lost:
    
        throw new java.lang.IllegalStateException("unexpected");
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0148, code lost:
    
        r6.a(r4, r5);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0112, code lost:
    
        r6.c(o.g.f(r7.m()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0179, code lost:
    
        r5.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x017d, code lost:
    
        if (r2 == null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x017f, code lost:
    
        r3 = new P0.q(r2, r8, r13);
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x0185, code lost:
    
        r3 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x00fe, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:108:0x01c6 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:11:0x01bb  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x01b8  */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v12 */
    /* JADX WARN: Type inference failed for: r4v2, types: [boolean, int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:48:0x01a8 -> B:6:0x01aa). Please report as a decompilation issue!!! */
    @Override // x0.b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(Object obj) {
        C0013n c0013n;
        C0013n c0013n2;
        K0.Q q2;
        M0.b bVar;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        M0.j jVar;
        w0.a aVar = w0.a.f3071f;
        int i2 = this.f202k;
        ?? r4 = 1;
        C0013n c0013n3 = this.f203l;
        if (i2 == 0) {
            o.g.C(obj);
            if (((AtomicInteger) ((A.j) c0013n3.f245d).f30g).get() <= 0) {
                throw new IllegalStateException("Check failed.");
            }
            q2 = (K0.Q) ((InterfaceC0045v) c0013n3.f242a).o().i(C0044u.f534g);
            if (q2 == null) {
            }
            O o2 = (O) c0013n3.f243b;
            this.f201j = o2;
            this.f202k = r4;
            bVar = (M0.b) c0013n3.f244c;
            bVar.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = M0.b.f704m;
            M0.j jVar2 = (M0.j) atomicReferenceFieldUpdater.get(bVar);
            while (true) {
                atomicLongFieldUpdater = M0.b.f699h;
                if (!bVar.r(atomicLongFieldUpdater.get(bVar), r4)) {
                }
                c0013n3 = c0013n;
            }
        } else if (i2 == 1) {
            D0.p pVar = this.f201j;
            o.g.C(obj);
            D0.p pVar2 = pVar;
            c0013n = c0013n3;
            D0.p pVar3 = null;
            Object obj2 = obj;
            this.f201j = pVar3;
            this.f202k = 2;
            if (pVar2.f(obj2, this) == aVar) {
                return aVar;
            }
            c0013n2 = c0013n;
            if (((AtomicInteger) ((A.j) c0013n2.f245d).f30g).decrementAndGet() != 0) {
            }
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o.g.C(obj);
            c0013n2 = c0013n3;
            if (((AtomicInteger) ((A.j) c0013n2.f245d).f30g).decrementAndGet() != 0) {
                return t0.g.f2989a;
            }
            c0013n3 = c0013n2;
            r4 = 1;
            q2 = (K0.Q) ((InterfaceC0045v) c0013n3.f242a).o().i(C0044u.f534g);
            if (q2 == null && !q2.b()) {
                throw ((K0.a0) q2).A();
            }
            O o22 = (O) c0013n3.f243b;
            this.f201j = o22;
            this.f202k = r4;
            bVar = (M0.b) c0013n3.f244c;
            bVar.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = M0.b.f704m;
            M0.j jVar22 = (M0.j) atomicReferenceFieldUpdater2.get(bVar);
            while (true) {
                atomicLongFieldUpdater = M0.b.f699h;
                if (!bVar.r(atomicLongFieldUpdater.get(bVar), r4)) {
                    Throwable m2 = bVar.m();
                    int i3 = P0.w.f906a;
                    throw m2;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = M0.b.f700i;
                long andIncrement = atomicLongFieldUpdater2.getAndIncrement(bVar);
                long j2 = M0.d.f712b;
                long j3 = andIncrement / j2;
                int i4 = (int) (andIncrement % j2);
                c0013n = c0013n3;
                if (jVar22.f905h == j3) {
                    jVar = jVar22;
                } else {
                    jVar = bVar.j(j3, jVar22);
                    if (jVar == null) {
                        continue;
                        c0013n3 = c0013n;
                    }
                }
                Object A2 = bVar.A(jVar, i4, andIncrement, null);
                A.j jVar3 = M0.d.f723m;
                if (A2 == jVar3) {
                    throw new IllegalStateException("unexpected");
                }
                A.j jVar4 = M0.d.f725o;
                if (A2 != jVar4) {
                    break;
                }
                if (andIncrement < bVar.p()) {
                    jVar.a();
                }
                jVar22 = jVar;
                c0013n3 = c0013n;
            }
        }
    }
}
