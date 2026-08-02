package com.google.android.gms.internal.ads;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* renamed from: com.google.android.gms.internal.ads.wQ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C4130wQ implements InterfaceC3807qQ, InterfaceC3753pQ {

    /* renamed from: A, reason: collision with root package name */
    public InterfaceC3807qQ[] f35606A;

    /* renamed from: B, reason: collision with root package name */
    public C3269gQ f35607B;

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC3807qQ[] f35608n;

    /* renamed from: u, reason: collision with root package name */
    public final boolean[] f35609u;

    /* renamed from: v, reason: collision with root package name */
    public final IdentityHashMap f35610v;

    /* renamed from: w, reason: collision with root package name */
    public final ArrayList f35611w = new ArrayList();

    /* renamed from: x, reason: collision with root package name */
    public final HashMap f35612x = new HashMap();

    /* renamed from: y, reason: collision with root package name */
    public Object f35613y;

    /* renamed from: z, reason: collision with root package name */
    public SQ f35614z;

    public C4130wQ(long[] jArr, InterfaceC3807qQ... interfaceC3807qQArr) {
        this.f35608n = interfaceC3807qQArr;
        PB pb = RB.f27933u;
        C3523lC c3523lC = C3523lC.f32525x;
        this.f35607B = new C3269gQ(c3523lC, c3523lC);
        this.f35610v = new IdentityHashMap();
        this.f35606A = new InterfaceC3807qQ[0];
        this.f35609u = new boolean[interfaceC3807qQArr.length];
        for (int i = 0; i < interfaceC3807qQArr.length; i++) {
            long j6 = jArr[i];
            if (j6 != 0) {
                this.f35609u[i] = true;
                this.f35608n[i] = new QQ(interfaceC3807qQArr[i], j6);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3807qQ
    public final void X(long j6) {
        for (InterfaceC3807qQ interfaceC3807qQ : this.f35606A) {
            interfaceC3807qQ.X(j6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3807qQ
    public final long a(long j6) {
        long a9 = this.f35606A[0].a(j6);
        int i = 1;
        while (true) {
            InterfaceC3807qQ[] interfaceC3807qQArr = this.f35606A;
            if (i >= interfaceC3807qQArr.length) {
                return a9;
            }
            if (interfaceC3807qQArr[i].a(a9) != a9) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3807qQ
    public final void b(InterfaceC3753pQ interfaceC3753pQ, long j6) {
        this.f35613y = interfaceC3753pQ;
        ArrayList arrayList = this.f35611w;
        InterfaceC3807qQ[] interfaceC3807qQArr = this.f35608n;
        Collections.addAll(arrayList, interfaceC3807qQArr);
        for (InterfaceC3807qQ interfaceC3807qQ : interfaceC3807qQArr) {
            interfaceC3807qQ.b(this, j6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3807qQ
    public final long c(long j6, C4020uO c4020uO) {
        InterfaceC3807qQ[] interfaceC3807qQArr = this.f35606A;
        return (interfaceC3807qQArr.length > 0 ? interfaceC3807qQArr[0] : this.f35608n[0]).c(j6, c4020uO);
    }

    @Override // com.google.android.gms.internal.ads.MQ
    public final boolean d() {
        return this.f35607B.d();
    }

    @Override // com.google.android.gms.internal.ads.MQ
    public final boolean e(C2945aO c2945aO) {
        ArrayList arrayList = this.f35611w;
        if (arrayList.isEmpty()) {
            return this.f35607B.e(c2945aO);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC3807qQ) arrayList.get(i)).e(c2945aO);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.MQ
    public final long f() {
        return this.f35607B.f();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [com.google.android.gms.internal.ads.pQ, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.InterfaceC3753pQ
    public final void g(InterfaceC3807qQ interfaceC3807qQ) {
        InterfaceC3807qQ[] interfaceC3807qQArr;
        ArrayList arrayList = this.f35611w;
        arrayList.remove(interfaceC3807qQ);
        if (arrayList.isEmpty()) {
            int i = 0;
            int i4 = 0;
            while (true) {
                interfaceC3807qQArr = this.f35608n;
                if (i >= interfaceC3807qQArr.length) {
                    break;
                }
                i4 += interfaceC3807qQArr[i].p().f28274a;
                i++;
            }
            A8[] a8Arr = new A8[i4];
            int i6 = 0;
            for (int i9 = 0; i9 < interfaceC3807qQArr.length; i9++) {
                SQ p9 = interfaceC3807qQArr[i9].p();
                int i10 = p9.f28274a;
                int i11 = 0;
                while (i11 < i10) {
                    A8 a9 = p9.a(i11);
                    int i12 = a9.f24415a;
                    DP[] dpArr = new DP[i12];
                    int i13 = 0;
                    while (i13 < i12) {
                        DP dp = a9.f24418d[i13];
                        dp.getClass();
                        C3322hP c3322hP = new C3322hP(dp);
                        String str = dp.f25163a;
                        if (str == null) {
                            str = "";
                        }
                        InterfaceC3807qQ[] interfaceC3807qQArr2 = interfaceC3807qQArr;
                        int i14 = i6;
                        StringBuilder sb = new StringBuilder(str.length() + Wv.b(i9, 1));
                        sb.append(i9);
                        sb.append(":");
                        sb.append(str);
                        c3322hP.f31546a = sb.toString();
                        String str2 = dp.f25174m;
                        if (str2 != null) {
                            StringBuilder sb2 = new StringBuilder(Wv.b(i9, 1) + str2.length());
                            sb2.append(i9);
                            sb2.append(":");
                            sb2.append(str2);
                            c3322hP.f31556l = sb2.toString();
                        }
                        dpArr[i13] = new DP(c3322hP);
                        i13++;
                        interfaceC3807qQArr = interfaceC3807qQArr2;
                        i6 = i14;
                    }
                    InterfaceC3807qQ[] interfaceC3807qQArr3 = interfaceC3807qQArr;
                    int i15 = i6;
                    int b9 = Wv.b(i9, 1);
                    String str3 = a9.f24416b;
                    StringBuilder sb3 = new StringBuilder(b9 + String.valueOf(str3).length());
                    sb3.append(i9);
                    sb3.append(":");
                    sb3.append(str3);
                    A8 a82 = new A8(sb3.toString(), dpArr);
                    this.f35612x.put(a82, a9);
                    i6 = i15 + 1;
                    a8Arr[i15] = a82;
                    i11++;
                    interfaceC3807qQArr = interfaceC3807qQArr3;
                }
            }
            this.f35614z = new SQ(a8Arr);
            ?? r1 = this.f35613y;
            r1.getClass();
            r1.g(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3807qQ
    public final long h(InterfaceC3780q[] interfaceC3780qArr, boolean[] zArr, LQ[] lqArr, boolean[] zArr2, long j6) {
        int length;
        IdentityHashMap identityHashMap;
        int[] iArr;
        int[] iArr2;
        int length2 = interfaceC3780qArr.length;
        int[] iArr3 = new int[length2];
        int[] iArr4 = new int[length2];
        int i = 0;
        int i4 = 0;
        while (true) {
            length = interfaceC3780qArr.length;
            identityHashMap = this.f35610v;
            if (i4 >= length) {
                break;
            }
            LQ lq = lqArr[i4];
            Integer num = lq == null ? null : (Integer) identityHashMap.get(lq);
            iArr3[i4] = num == null ? -1 : num.intValue();
            InterfaceC3780q interfaceC3780q = interfaceC3780qArr[i4];
            if (interfaceC3780q != null) {
                String str = interfaceC3780q.c().f24416b;
                iArr4[i4] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr4[i4] = -1;
            }
            i4++;
        }
        identityHashMap.clear();
        LQ[] lqArr2 = new LQ[length];
        LQ[] lqArr3 = new LQ[length];
        InterfaceC3780q[] interfaceC3780qArr2 = new InterfaceC3780q[length];
        InterfaceC3807qQ[] interfaceC3807qQArr = this.f35608n;
        ArrayList arrayList = new ArrayList(interfaceC3807qQArr.length);
        long j9 = j6;
        int i6 = 0;
        while (i6 < interfaceC3807qQArr.length) {
            int i9 = i;
            while (i9 < interfaceC3780qArr.length) {
                lqArr3[i9] = iArr3[i9] == i6 ? lqArr[i9] : null;
                if (iArr4[i9] == i6) {
                    InterfaceC3780q interfaceC3780q2 = interfaceC3780qArr[i9];
                    interfaceC3780q2.getClass();
                    iArr = iArr4;
                    iArr2 = iArr3;
                    A8 a82 = (A8) this.f35612x.get(interfaceC3780q2.c());
                    a82.getClass();
                    interfaceC3780qArr2[i9] = new C4076vQ(interfaceC3780q2, a82);
                } else {
                    iArr = iArr4;
                    iArr2 = iArr3;
                    interfaceC3780qArr2[i9] = null;
                }
                i9++;
                iArr4 = iArr;
                iArr3 = iArr2;
            }
            int[] iArr5 = iArr4;
            int[] iArr6 = iArr3;
            ArrayList arrayList2 = arrayList;
            InterfaceC3807qQ[] interfaceC3807qQArr2 = interfaceC3807qQArr;
            int i10 = i6;
            long h3 = interfaceC3807qQArr[i6].h(interfaceC3780qArr2, zArr, lqArr3, zArr2, j9);
            if (i10 == 0) {
                j9 = h3;
            } else if (h3 != j9) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z6 = false;
            for (int i11 = 0; i11 < interfaceC3780qArr.length; i11++) {
                if (iArr5[i11] == i10) {
                    LQ lq2 = lqArr3[i11];
                    lq2.getClass();
                    lqArr2[i11] = lq2;
                    identityHashMap.put(lq2, Integer.valueOf(i10));
                    z6 = true;
                } else if (iArr6[i11] == i10) {
                    AbstractC2792Sd.H(lqArr3[i11] == null);
                }
            }
            if (z6) {
                arrayList2.add(interfaceC3807qQArr2[i10]);
            }
            i6 = i10 + 1;
            arrayList = arrayList2;
            interfaceC3807qQArr = interfaceC3807qQArr2;
            iArr4 = iArr5;
            iArr3 = iArr6;
            i = 0;
        }
        int i12 = i;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(lqArr2, i12, lqArr, i12, length);
        this.f35606A = (InterfaceC3807qQ[]) arrayList3.toArray(new InterfaceC3807qQ[i12]);
        this.f35607B = new C3269gQ(arrayList3, AbstractC2991bG.w(arrayList3, Oz.f27484f));
        return j9;
    }

    @Override // com.google.android.gms.internal.ads.MQ
    public final long i() {
        return this.f35607B.i();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.gms.internal.ads.pQ, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.InterfaceC3753pQ
    public final /* bridge */ /* synthetic */ void j(MQ mq) {
        ?? r1 = this.f35613y;
        r1.getClass();
        r1.j(this);
    }

    @Override // com.google.android.gms.internal.ads.MQ
    public final void k(long j6) {
        this.f35607B.k(j6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3807qQ
    public final SQ p() {
        SQ sq = this.f35614z;
        sq.getClass();
        return sq;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3807qQ
    public final void q() {
        int i = 0;
        while (true) {
            InterfaceC3807qQ[] interfaceC3807qQArr = this.f35608n;
            if (i >= interfaceC3807qQArr.length) {
                return;
            }
            interfaceC3807qQArr[i].q();
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3807qQ
    public final long w() {
        long j6 = -9223372036854775807L;
        for (InterfaceC3807qQ interfaceC3807qQ : this.f35606A) {
            long w3 = interfaceC3807qQ.w();
            if (w3 != com.anythink.basead.exoplayer.b.f7168b) {
                if (j6 == com.anythink.basead.exoplayer.b.f7168b) {
                    for (InterfaceC3807qQ interfaceC3807qQ2 : this.f35606A) {
                        if (interfaceC3807qQ2 == interfaceC3807qQ) {
                            break;
                        }
                        if (interfaceC3807qQ2.a(w3) != w3) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j6 = w3;
                } else if (w3 != j6) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j6 != com.anythink.basead.exoplayer.b.f7168b && interfaceC3807qQ.a(j6) != j6) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j6;
    }
}
