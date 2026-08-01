package O2;

import P2.AbstractC0376f;
import P2.C0377g;
import P2.C0381k;
import P2.C0382l;
import android.os.SystemClock;
import com.google.android.gms.common.api.Status;

/* loaded from: classes.dex */
public final class L implements j3.c {

    /* renamed from: n, reason: collision with root package name */
    public final C0354d f2189n;

    /* renamed from: u, reason: collision with root package name */
    public final int f2190u;

    /* renamed from: v, reason: collision with root package name */
    public final C0351a f2191v;

    /* renamed from: w, reason: collision with root package name */
    public final long f2192w;

    /* renamed from: x, reason: collision with root package name */
    public final long f2193x;

    public L(C0354d c0354d, int i, C0351a c0351a, long j6, long j9) {
        this.f2189n = c0354d;
        this.f2190u = i;
        this.f2191v = c0351a;
        this.f2192w = j6;
        this.f2193x = j9;
    }

    public static C0377g a(D d2, AbstractC0376f abstractC0376f, int i) {
        P2.E e9 = abstractC0376f.f2472T;
        C0377g c0377g = e9 == null ? null : e9.f2429w;
        if (c0377g != null && c0377g.f2482u) {
            int[] iArr = c0377g.f2484w;
            int i6 = 0;
            if (iArr == null) {
                int[] iArr2 = c0377g.f2486y;
                if (iArr2 != null) {
                    while (i6 < iArr2.length) {
                        if (iArr2[i6] == i) {
                            return null;
                        }
                        i6++;
                    }
                }
            } else {
                while (i6 < iArr.length) {
                    if (iArr[i6] != i) {
                        i6++;
                    }
                }
            }
            if (d2.f2169E < c0377g.f2485x) {
                return c0377g;
            }
        }
        return null;
    }

    @Override // j3.c
    public final void f(j3.m mVar) {
        int i;
        int i6;
        int i9;
        int i10;
        int i11;
        long j6;
        long j9;
        int i12;
        if (this.f2189n.a()) {
            P2.m mVar2 = (P2.m) C0382l.a().f2515n;
            if (mVar2 == null || mVar2.f2517u) {
                D d2 = (D) this.f2189n.f2232C.get(this.f2191v);
                if (d2 != null) {
                    Object obj = d2.f2172u;
                    if (obj instanceof AbstractC0376f) {
                        AbstractC0376f abstractC0376f = (AbstractC0376f) obj;
                        int i13 = 0;
                        boolean z3 = this.f2192w > 0;
                        int i14 = abstractC0376f.f2467O;
                        if (mVar2 != null) {
                            z3 &= mVar2.f2518v;
                            int i15 = mVar2.f2519w;
                            int i16 = mVar2.f2520x;
                            i = mVar2.f2516n;
                            if (abstractC0376f.f2472T != null && !abstractC0376f.e()) {
                                C0377g a9 = a(d2, abstractC0376f, this.f2190u);
                                if (a9 == null) {
                                    return;
                                }
                                boolean z6 = a9.f2483v && this.f2192w > 0;
                                i16 = a9.f2485x;
                                z3 = z6;
                            }
                            i9 = i15;
                            i6 = i16;
                        } else {
                            i = 0;
                            i6 = 100;
                            i9 = 5000;
                        }
                        C0354d c0354d = this.f2189n;
                        if (mVar.i()) {
                            i10 = 0;
                        } else {
                            if (mVar.f38372d) {
                                i10 = 100;
                            } else {
                                Exception f3 = mVar.f();
                                if (f3 instanceof N2.f) {
                                    Status status = ((N2.f) f3).f1939n;
                                    int i17 = status.f23615n;
                                    M2.b bVar = status.f23618w;
                                    i13 = bVar == null ? -1 : bVar.f1830u;
                                    i10 = i17;
                                } else {
                                    i10 = 101;
                                }
                            }
                            i13 = -1;
                        }
                        if (z3) {
                            long j10 = this.f2192w;
                            long currentTimeMillis = System.currentTimeMillis();
                            i11 = i6;
                            i12 = (int) (SystemClock.elapsedRealtime() - this.f2193x);
                            j9 = currentTimeMillis;
                            j6 = j10;
                        } else {
                            i11 = i6;
                            j6 = 0;
                            j9 = 0;
                            i12 = -1;
                        }
                        a3.e eVar = c0354d.f2235F;
                        eVar.sendMessage(eVar.obtainMessage(18, new M(new C0381k(this.f2190u, i10, i13, j6, j9, null, null, i14, i12), i, i9, i11)));
                    }
                }
            }
        }
    }
}
