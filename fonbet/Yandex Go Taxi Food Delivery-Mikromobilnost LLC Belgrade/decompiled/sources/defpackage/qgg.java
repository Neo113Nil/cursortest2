package defpackage;

import com.yandex.messaging.paging.PagedLoader$LoadType;
import java.util.concurrent.atomic.AtomicLong;

/* loaded from: classes10.dex */
public final class qgg implements pgg, v790, c5p, d5p, ng61, bb71, yg71, iy60 {
    public final /* synthetic */ int a;
    public final long b;
    public final Object c;

    public qgg(c5p c5pVar, long j) {
        this.a = 5;
        this.c = c5pVar;
        d6z.l(c5pVar.getPosition() >= j);
        this.b = j;
    }

    @Override // defpackage.d5p
    public void A() {
        ((d5p) this.c).A();
    }

    @Override // defpackage.d5p
    public g001 B(int i, int i2) {
        return ((d5p) this.c).B(i, i2);
    }

    @Override // defpackage.pgg
    public long C() {
        return 0L;
    }

    @Override // defpackage.bb71
    public boolean E(byte[] bArr, int i, int i2, boolean z) {
        return ((w971) this.c).E(bArr, 0, 8, true);
    }

    @Override // defpackage.v790
    public void F(w790 w790Var) {
        long currentTimeMillis = System.currentTimeMillis() - this.b;
        b890 b890Var = (b890) this.c;
        long j = 0 - currentTimeMillis;
        b890Var.b.postDelayed(new ud30(9, b890Var, PagedLoader$LoadType.INIT, w790Var), j >= 0 ? j : 0L);
    }

    @Override // defpackage.pgg
    public w6i0 G(long j) {
        return new w6i0(null, ((qsb) this.c).c[(int) j], r6.b[r7]);
    }

    @Override // defpackage.c5p
    public boolean H(byte[] bArr, int i, int i2, boolean z) {
        return ((c5p) this.c).H(bArr, i, i2, z);
    }

    @Override // defpackage.bb71
    public boolean I(byte[] bArr, int i, int i2, boolean z) {
        return ((w971) this.c).I(bArr, 0, 8, true);
    }

    @Override // defpackage.c5p
    public void J() {
        ((c5p) this.c).J();
    }

    @Override // defpackage.c5p
    public long L() {
        return ((c5p) this.c).L() - this.b;
    }

    @Override // defpackage.c5p
    public void N(int i) {
        ((c5p) this.c).N(i);
    }

    @Override // defpackage.c5p
    public void O(int i) {
        ((c5p) this.c).O(i);
    }

    @Override // defpackage.pgg
    public boolean P() {
        return true;
    }

    @Override // defpackage.pgg
    public long R(long j, long j2) {
        return ((qsb) this.c).a;
    }

    @Override // defpackage.ng61
    public long a(long j) {
        return ((jt81) this.c).e[(int) j] - this.b;
    }

    @Override // defpackage.bb71
    public void b(int i) {
        ((w971) this.c).b(i);
    }

    @Override // defpackage.ng61
    public long c(long j, long j2) {
        jt81 jt81Var = (jt81) this.c;
        return rf71.t(jt81Var.e, j + this.b, true);
    }

    @Override // defpackage.ng61
    public of81 d(long j) {
        return new of81(null, ((jt81) this.c).c[(int) j], r6.b[r7]);
    }

    @Override // defpackage.bb71
    public long e() {
        return (((w971) this.c).w + r0.y) - this.b;
    }

    @Override // defpackage.pgg
    public long f(long j) {
        return ((qsb) this.c).e[(int) j] - this.b;
    }

    @Override // defpackage.c5p
    public void g(int i, int i2, byte[] bArr) {
        ((c5p) this.c).g(i, i2, bArr);
    }

    @Override // defpackage.c5p
    public long getLength() {
        return ((c5p) this.c).getLength() - this.b;
    }

    @Override // defpackage.c5p
    public long getPosition() {
        return ((c5p) this.c).getPosition() - this.b;
    }

    @Override // defpackage.pgg
    public long h(long j, long j2) {
        return ((qsb) this.c).d[(int) j];
    }

    @Override // defpackage.pgg
    public long i(long j, long j2) {
        return 0L;
    }

    @Override // defpackage.pgg
    public long j(long j, long j2) {
        return -9223372036854775807L;
    }

    @Override // defpackage.ng61
    public long k(long j) {
        return ((jt81) this.c).a;
    }

    @Override // defpackage.yg71
    public fb81 l(int i, int i2) {
        return ((yg71) this.c).l(i, i2);
    }

    @Override // defpackage.ng61
    public long m(long j, long j2) {
        return ((jt81) this.c).d[(int) j];
    }

    @Override // defpackage.ng61
    public long n(long j, long j2) {
        return 0L;
    }

    @Override // defpackage.ng61
    public long o(long j, long j2) {
        return -9223372036854775807L;
    }

    @Override // defpackage.v790
    public void onError() {
        b890 b890Var = (b890) this.c;
        b890Var.b.post(new sd30(26, b890Var, PagedLoader$LoadType.INIT));
    }

    @Override // defpackage.iy60
    public void onFailure(Exception exc) {
        switch (this.a) {
            case 10:
                ((AtomicLong) ((p891) this.c).w).set(this.b);
                break;
            case 11:
                q8b1 q8b1Var = (q8b1) this.c;
                q8b1Var.b.set(this.b);
                break;
            case 12:
                q8b1 q8b1Var2 = (q8b1) this.c;
                q8b1Var2.b.set(this.b);
                break;
            case 13:
                btb1 btb1Var = (btb1) this.c;
                btb1Var.b.set(this.b);
                break;
            default:
                btb1 btb1Var2 = (btb1) this.c;
                btb1Var2.b.set(this.b);
                break;
        }
    }

    @Override // defpackage.c5p
    public int p(int i, int i2, byte[] bArr) {
        return ((c5p) this.c).p(i, i2, bArr);
    }

    @Override // defpackage.ng61
    public long q(long j, long j2) {
        return ((jt81) this.c).a;
    }

    @Override // defpackage.yg71
    public void r(a871 a871Var) {
        ((yg71) this.c).r(new j481(this, a871Var));
    }

    @Override // defpackage.apg
    public int read(byte[] bArr, int i, int i2) {
        return ((c5p) this.c).read(bArr, i, i2);
    }

    @Override // defpackage.c5p
    public void readFully(byte[] bArr, int i, int i2) {
        ((c5p) this.c).readFully(bArr, i, i2);
    }

    @Override // defpackage.bb71
    public void s(int i, int i2, byte[] bArr) {
        ((w971) this.c).I(bArr, i, i2, false);
    }

    @Override // defpackage.pgg
    public long t(long j, long j2) {
        qsb qsbVar = (qsb) this.c;
        return tw21.e(qsbVar.e, j + this.b, true);
    }

    @Override // defpackage.bb71
    public void u(int i, int i2, byte[] bArr) {
        ((w971) this.c).E(bArr, i, i2, false);
    }

    @Override // defpackage.jz61
    public int v(int i, int i2, byte[] bArr) {
        return ((w971) this.c).v(i, i2, bArr);
    }

    @Override // defpackage.d5p
    public void w(f7q0 f7q0Var) {
        ((d5p) this.c).w(new l1u0(this, f7q0Var, f7q0Var));
    }

    @Override // defpackage.pgg
    public long x(long j) {
        return ((qsb) this.c).a;
    }

    @Override // defpackage.c5p
    public boolean y(byte[] bArr, int i, int i2, boolean z) {
        return ((c5p) this.c).y(bArr, 0, i2, z);
    }

    @Override // defpackage.c5p
    public int z(int i) {
        return ((c5p) this.c).z(i);
    }

    @Override // defpackage.ng61
    public long b() {
        return 0L;
    }

    @Override // defpackage.yg71
    /* renamed from: a, reason: collision with other method in class */
    public void mo495a() {
        ((yg71) this.c).mo495a();
    }

    @Override // defpackage.bb71
    public long f() {
        return ((w971) this.c).w - this.b;
    }

    @Override // defpackage.bb71
    public long a() {
        return ((w971) this.c).c - this.b;
    }

    @Override // defpackage.bb71
    public void e(int i) {
        ((w971) this.c).c(i, false);
    }

    @Override // defpackage.bb71
    public void c() {
        ((w971) this.c).y = 0;
    }

    @Override // defpackage.ng61
    /* renamed from: a */
    public boolean mo485a() {
        return true;
    }

    public /* synthetic */ qgg(Object obj, long j, int i) {
        this.a = i;
        this.c = obj;
        this.b = j;
    }

    public qgg(w971 w971Var, long j) {
        this.a = 8;
        this.c = w971Var;
        if (w971Var.w >= j) {
            this.b = j;
        } else {
            w511.q();
            throw null;
        }
    }

    public /* synthetic */ qgg(long j, Object obj, int i) {
        this.a = i;
        this.b = j;
        this.c = obj;
    }
}
