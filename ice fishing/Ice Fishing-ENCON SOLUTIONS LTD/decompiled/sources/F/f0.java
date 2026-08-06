package F;

import A1.C0019u;
import A1.InterfaceC0020v;
import h1.C0239i;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import m1.EnumC0985a;
import n1.AbstractC0995f;

/* loaded from: classes.dex */
public final class f0 extends AbstractC0995f implements t1.p {

    /* renamed from: e, reason: collision with root package name */
    public t1.p f481e;

    /* renamed from: f, reason: collision with root package name */
    public int f482f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ C0038n f483g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(C0038n c0038n, l1.d dVar) {
        super(2, dVar);
        this.f483g = c0038n;
    }

    @Override // n1.AbstractC0991b
    public final l1.d b(Object obj, l1.d dVar) {
        return new f0(this.f483g, dVar);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x018c, code lost:
    
        r6.A();
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
    
        if (r6 != C1.e.f175n) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00ca, code lost:
    
        r6 = A1.AbstractC0022x.c(R1.d.t(r21));
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
    
        r2 = r6.t();
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
    
        r2 = r7.f160b;
        r13 = r6.f48e;
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
    
        r4 = (C1.k) r14.get(r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0110, code lost:
    
        if (r7.r(r15.get(r7), true) == false) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x011f, code lost:
    
        r16 = r13.getAndIncrement(r7);
        r8 = C1.e.f163b;
        r10 = r16 / r8;
        r5 = (int) (r16 % r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x012f, code lost:
    
        if (r4.f631c == r10) goto L114;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0131, code lost:
    
        r8 = r7.l(r10, r4);
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
    
        if (r8 != C1.e.f174m) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x014e, code lost:
    
        if (r8 != C1.e.f176o) goto L116;
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
    
        if (r8 == C1.e.f175n) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0161, code lost:
    
        r4.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x0164, code lost:
    
        if (r2 == null) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0166, code lost:
    
        r3 = new F1.p(r2, r8, r14);
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
    
        r6.i(R1.l.h(r7.n()));
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0179, code lost:
    
        r5.a();
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x017d, code lost:
    
        if (r2 == null) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x017f, code lost:
    
        r3 = new F1.p(r2, r8, r13);
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
    @Override // n1.AbstractC0991b
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(Object obj) {
        C0038n c0038n;
        C0038n c0038n2;
        A1.S s2;
        C1.c cVar;
        AtomicLongFieldUpdater atomicLongFieldUpdater;
        C1.k kVar;
        EnumC0985a enumC0985a = EnumC0985a.f8194a;
        int i2 = this.f482f;
        ?? r4 = 1;
        C0038n c0038n3 = this.f483g;
        if (i2 == 0) {
            R1.l.F(obj);
            if (((AtomicInteger) ((C.j) c0038n3.f535d).f124b).get() <= 0) {
                throw new IllegalStateException("Check failed.");
            }
            s2 = (A1.S) ((InterfaceC0020v) c0038n3.f532a).h().m(C0019u.f73b);
            if (s2 == null) {
            }
            M m2 = (M) c0038n3.f533b;
            this.f481e = m2;
            this.f482f = r4;
            cVar = (C1.c) c0038n3.f534c;
            cVar.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = C1.c.f155h;
            C1.k kVar2 = (C1.k) atomicReferenceFieldUpdater.get(cVar);
            while (true) {
                atomicLongFieldUpdater = C1.c.f150c;
                if (!cVar.r(atomicLongFieldUpdater.get(cVar), r4)) {
                }
                c0038n3 = c0038n;
            }
        } else if (i2 == 1) {
            t1.p pVar = this.f481e;
            R1.l.F(obj);
            t1.p pVar2 = pVar;
            c0038n = c0038n3;
            t1.p pVar3 = null;
            Object obj2 = obj;
            this.f481e = pVar3;
            this.f482f = 2;
            if (pVar2.invoke(obj2, this) == enumC0985a) {
                return enumC0985a;
            }
            c0038n2 = c0038n;
            if (((AtomicInteger) ((C.j) c0038n2.f535d).f124b).decrementAndGet() != 0) {
            }
        } else {
            if (i2 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            R1.l.F(obj);
            c0038n2 = c0038n3;
            if (((AtomicInteger) ((C.j) c0038n2.f535d).f124b).decrementAndGet() != 0) {
                return C0239i.f3393a;
            }
            c0038n3 = c0038n2;
            r4 = 1;
            s2 = (A1.S) ((InterfaceC0020v) c0038n3.f532a).h().m(C0019u.f73b);
            if (s2 == null && !s2.b()) {
                throw ((A1.b0) s2).z();
            }
            M m22 = (M) c0038n3.f533b;
            this.f481e = m22;
            this.f482f = r4;
            cVar = (C1.c) c0038n3.f534c;
            cVar.getClass();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = C1.c.f155h;
            C1.k kVar22 = (C1.k) atomicReferenceFieldUpdater2.get(cVar);
            while (true) {
                atomicLongFieldUpdater = C1.c.f150c;
                if (!cVar.r(atomicLongFieldUpdater.get(cVar), r4)) {
                    Throwable n2 = cVar.n();
                    int i3 = F1.v.f632a;
                    throw n2;
                }
                AtomicLongFieldUpdater atomicLongFieldUpdater2 = C1.c.f151d;
                long andIncrement = atomicLongFieldUpdater2.getAndIncrement(cVar);
                long j2 = C1.e.f163b;
                long j3 = andIncrement / j2;
                int i4 = (int) (andIncrement % j2);
                c0038n = c0038n3;
                if (kVar22.f631c == j3) {
                    kVar = kVar22;
                } else {
                    kVar = cVar.l(j3, kVar22);
                    if (kVar == null) {
                        continue;
                        c0038n3 = c0038n;
                    }
                }
                Object A2 = cVar.A(kVar, i4, andIncrement, null);
                C.j jVar = C1.e.f174m;
                if (A2 == jVar) {
                    throw new IllegalStateException("unexpected");
                }
                C.j jVar2 = C1.e.f176o;
                if (A2 != jVar2) {
                    break;
                }
                if (andIncrement < cVar.p()) {
                    kVar.a();
                }
                kVar22 = kVar;
                c0038n3 = c0038n;
            }
        }
    }

    @Override // t1.p
    public final Object invoke(Object obj, Object obj2) {
        return ((f0) b((InterfaceC0020v) obj, (l1.d) obj2)).g(C0239i.f3393a);
    }
}
