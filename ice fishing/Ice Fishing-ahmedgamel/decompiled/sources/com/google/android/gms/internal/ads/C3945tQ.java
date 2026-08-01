package com.google.android.gms.internal.ads;

import com.icefishinggame.icefishinggamemultigames.AbstractC4404f;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.IdentityHashMap;

/* renamed from: com.google.android.gms.internal.ads.tQ, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3945tQ implements InterfaceC3622nQ, InterfaceC3568mQ {

    /* renamed from: A, reason: collision with root package name */
    public InterfaceC3622nQ[] f34292A;

    /* renamed from: B, reason: collision with root package name */
    public C3085dQ f34293B;

    /* renamed from: n, reason: collision with root package name */
    public final InterfaceC3622nQ[] f34294n;

    /* renamed from: u, reason: collision with root package name */
    public final boolean[] f34295u;

    /* renamed from: v, reason: collision with root package name */
    public final IdentityHashMap f34296v;

    /* renamed from: w, reason: collision with root package name */
    public final ArrayList f34297w = new ArrayList();

    /* renamed from: x, reason: collision with root package name */
    public final HashMap f34298x = new HashMap();

    /* renamed from: y, reason: collision with root package name */
    public Object f34299y;

    /* renamed from: z, reason: collision with root package name */
    public PQ f34300z;

    public C3945tQ(long[] jArr, InterfaceC3622nQ... interfaceC3622nQArr) {
        this.f34294n = interfaceC3622nQArr;
        PB pb = RB.f27177u;
        C3500lC c3500lC = C3500lC.f31745x;
        this.f34293B = new C3085dQ(c3500lC, c3500lC);
        this.f34296v = new IdentityHashMap();
        this.f34292A = new InterfaceC3622nQ[0];
        this.f34295u = new boolean[interfaceC3622nQArr.length];
        for (int i = 0; i < interfaceC3622nQArr.length; i++) {
            long j6 = jArr[i];
            if (j6 != 0) {
                this.f34295u[i] = true;
                this.f34294n[i] = new NQ(interfaceC3622nQArr[i], j6);
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3622nQ
    public final void X(long j6) {
        for (InterfaceC3622nQ interfaceC3622nQ : this.f34292A) {
            interfaceC3622nQ.X(j6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3622nQ
    public final long a(long j6) {
        long a9 = this.f34292A[0].a(j6);
        int i = 1;
        while (true) {
            InterfaceC3622nQ[] interfaceC3622nQArr = this.f34292A;
            if (i >= interfaceC3622nQArr.length) {
                return a9;
            }
            if (interfaceC3622nQArr[i].a(a9) != a9) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3622nQ
    public final void b(InterfaceC3568mQ interfaceC3568mQ, long j6) {
        this.f34299y = interfaceC3568mQ;
        ArrayList arrayList = this.f34297w;
        InterfaceC3622nQ[] interfaceC3622nQArr = this.f34294n;
        Collections.addAll(arrayList, interfaceC3622nQArr);
        for (InterfaceC3622nQ interfaceC3622nQ : interfaceC3622nQArr) {
            interfaceC3622nQ.b(this, j6);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3622nQ
    public final long c(long j6, C3997uO c3997uO) {
        InterfaceC3622nQ[] interfaceC3622nQArr = this.f34292A;
        return (interfaceC3622nQArr.length > 0 ? interfaceC3622nQArr[0] : this.f34294n[0]).c(j6, c3997uO);
    }

    @Override // com.google.android.gms.internal.ads.JQ
    public final boolean d() {
        return this.f34293B.d();
    }

    @Override // com.google.android.gms.internal.ads.JQ
    public final boolean e(C2922aO c2922aO) {
        ArrayList arrayList = this.f34297w;
        if (arrayList.isEmpty()) {
            return this.f34293B.e(c2922aO);
        }
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((InterfaceC3622nQ) arrayList.get(i)).e(c2922aO);
        }
        return false;
    }

    @Override // com.google.android.gms.internal.ads.JQ
    public final long f() {
        return this.f34293B.f();
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [com.google.android.gms.internal.ads.mQ, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.InterfaceC3568mQ
    public final void g(InterfaceC3622nQ interfaceC3622nQ) {
        InterfaceC3622nQ[] interfaceC3622nQArr;
        ArrayList arrayList = this.f34297w;
        arrayList.remove(interfaceC3622nQ);
        if (arrayList.isEmpty()) {
            int i = 0;
            int i6 = 0;
            while (true) {
                interfaceC3622nQArr = this.f34294n;
                if (i >= interfaceC3622nQArr.length) {
                    break;
                }
                i6 += interfaceC3622nQArr[i].p().f26819a;
                i++;
            }
            A8[] a8Arr = new A8[i6];
            int i9 = 0;
            for (int i10 = 0; i10 < interfaceC3622nQArr.length; i10++) {
                PQ p9 = interfaceC3622nQArr[i10].p();
                int i11 = p9.f26819a;
                int i12 = 0;
                while (i12 < i11) {
                    A8 a9 = p9.a(i12);
                    int i13 = a9.f23635a;
                    DP[] dpArr = new DP[i13];
                    int i14 = 0;
                    while (i14 < i13) {
                        DP dp = a9.f23638d[i14];
                        dp.getClass();
                        C3299hP c3299hP = new C3299hP(dp);
                        String str = dp.f24418a;
                        if (str == null) {
                            str = "";
                        }
                        InterfaceC3622nQ[] interfaceC3622nQArr2 = interfaceC3622nQArr;
                        int i15 = i9;
                        StringBuilder sb = new StringBuilder(str.length() + AbstractC4404f.b(i10, 1));
                        sb.append(i10);
                        sb.append(":");
                        sb.append(str);
                        c3299hP.f30780a = sb.toString();
                        String str2 = dp.f24429m;
                        if (str2 != null) {
                            StringBuilder sb2 = new StringBuilder(AbstractC4404f.b(i10, 1) + str2.length());
                            sb2.append(i10);
                            sb2.append(":");
                            sb2.append(str2);
                            c3299hP.f30790l = sb2.toString();
                        }
                        dpArr[i14] = new DP(c3299hP);
                        i14++;
                        interfaceC3622nQArr = interfaceC3622nQArr2;
                        i9 = i15;
                    }
                    InterfaceC3622nQ[] interfaceC3622nQArr3 = interfaceC3622nQArr;
                    int i16 = i9;
                    int b9 = AbstractC4404f.b(i10, 1);
                    String str3 = a9.f23636b;
                    StringBuilder sb3 = new StringBuilder(b9 + String.valueOf(str3).length());
                    sb3.append(i10);
                    sb3.append(":");
                    sb3.append(str3);
                    A8 a82 = new A8(sb3.toString(), dpArr);
                    this.f34298x.put(a82, a9);
                    i9 = i16 + 1;
                    a8Arr[i16] = a82;
                    i12++;
                    interfaceC3622nQArr = interfaceC3622nQArr3;
                }
            }
            this.f34300z = new PQ(a8Arr);
            ?? r12 = this.f34299y;
            r12.getClass();
            r12.g(this);
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3622nQ
    public final long h(InterfaceC3757q[] interfaceC3757qArr, boolean[] zArr, IQ[] iqArr, boolean[] zArr2, long j6) {
        int length;
        IdentityHashMap identityHashMap;
        int[] iArr;
        int[] iArr2;
        int length2 = interfaceC3757qArr.length;
        int[] iArr3 = new int[length2];
        int[] iArr4 = new int[length2];
        int i = 0;
        int i6 = 0;
        while (true) {
            length = interfaceC3757qArr.length;
            identityHashMap = this.f34296v;
            if (i6 >= length) {
                break;
            }
            IQ iq = iqArr[i6];
            Integer num = iq == null ? null : (Integer) identityHashMap.get(iq);
            iArr3[i6] = num == null ? -1 : num.intValue();
            InterfaceC3757q interfaceC3757q = interfaceC3757qArr[i6];
            if (interfaceC3757q != null) {
                String str = interfaceC3757q.c().f23636b;
                iArr4[i6] = Integer.parseInt(str.substring(0, str.indexOf(":")));
            } else {
                iArr4[i6] = -1;
            }
            i6++;
        }
        identityHashMap.clear();
        IQ[] iqArr2 = new IQ[length];
        IQ[] iqArr3 = new IQ[length];
        InterfaceC3757q[] interfaceC3757qArr2 = new InterfaceC3757q[length];
        InterfaceC3622nQ[] interfaceC3622nQArr = this.f34294n;
        ArrayList arrayList = new ArrayList(interfaceC3622nQArr.length);
        long j9 = j6;
        int i9 = 0;
        while (i9 < interfaceC3622nQArr.length) {
            int i10 = i;
            while (i10 < interfaceC3757qArr.length) {
                iqArr3[i10] = iArr3[i10] == i9 ? iqArr[i10] : null;
                if (iArr4[i10] == i9) {
                    InterfaceC3757q interfaceC3757q2 = interfaceC3757qArr[i10];
                    interfaceC3757q2.getClass();
                    iArr = iArr4;
                    iArr2 = iArr3;
                    A8 a82 = (A8) this.f34298x.get(interfaceC3757q2.c());
                    a82.getClass();
                    interfaceC3757qArr2[i10] = new C3891sQ(interfaceC3757q2, a82);
                } else {
                    iArr = iArr4;
                    iArr2 = iArr3;
                    interfaceC3757qArr2[i10] = null;
                }
                i10++;
                iArr4 = iArr;
                iArr3 = iArr2;
            }
            int[] iArr5 = iArr4;
            int[] iArr6 = iArr3;
            ArrayList arrayList2 = arrayList;
            InterfaceC3622nQ[] interfaceC3622nQArr2 = interfaceC3622nQArr;
            int i11 = i9;
            long h9 = interfaceC3622nQArr[i9].h(interfaceC3757qArr2, zArr, iqArr3, zArr2, j9);
            if (i11 == 0) {
                j9 = h9;
            } else if (h9 != j9) {
                throw new IllegalStateException("Children enabled at different positions.");
            }
            boolean z3 = false;
            for (int i12 = 0; i12 < interfaceC3757qArr.length; i12++) {
                if (iArr5[i12] == i11) {
                    IQ iq2 = iqArr3[i12];
                    iq2.getClass();
                    iqArr2[i12] = iq2;
                    identityHashMap.put(iq2, Integer.valueOf(i11));
                    z3 = true;
                } else if (iArr6[i12] == i11) {
                    AbstractC2772Sd.H(iqArr3[i12] == null);
                }
            }
            if (z3) {
                arrayList2.add(interfaceC3622nQArr2[i11]);
            }
            i9 = i11 + 1;
            arrayList = arrayList2;
            interfaceC3622nQArr = interfaceC3622nQArr2;
            iArr4 = iArr5;
            iArr3 = iArr6;
            i = 0;
        }
        int i13 = i;
        ArrayList arrayList3 = arrayList;
        System.arraycopy(iqArr2, i13, iqArr, i13, length);
        this.f34292A = (InterfaceC3622nQ[]) arrayList3.toArray(new InterfaceC3622nQ[i13]);
        this.f34293B = new C3085dQ(arrayList3, AbstractC2968bG.w(arrayList3, Oz.f26701f));
        return j9;
    }

    @Override // com.google.android.gms.internal.ads.JQ
    public final long i() {
        return this.f34293B.i();
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.google.android.gms.internal.ads.mQ, java.lang.Object] */
    @Override // com.google.android.gms.internal.ads.InterfaceC3568mQ
    public final /* bridge */ /* synthetic */ void j(JQ jq) {
        ?? r12 = this.f34299y;
        r12.getClass();
        r12.j(this);
    }

    @Override // com.google.android.gms.internal.ads.JQ
    public final void k(long j6) {
        this.f34293B.k(j6);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3622nQ
    public final PQ p() {
        PQ pq = this.f34300z;
        pq.getClass();
        return pq;
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3622nQ
    public final void q() {
        int i = 0;
        while (true) {
            InterfaceC3622nQ[] interfaceC3622nQArr = this.f34294n;
            if (i >= interfaceC3622nQArr.length) {
                return;
            }
            interfaceC3622nQArr[i].q();
            i++;
        }
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3622nQ
    public final long w() {
        long j6 = -9223372036854775807L;
        for (InterfaceC3622nQ interfaceC3622nQ : this.f34292A) {
            long w6 = interfaceC3622nQ.w();
            if (w6 != com.anythink.basead.exoplayer.b.f6382b) {
                if (j6 == com.anythink.basead.exoplayer.b.f6382b) {
                    for (InterfaceC3622nQ interfaceC3622nQ2 : this.f34292A) {
                        if (interfaceC3622nQ2 == interfaceC3622nQ) {
                            break;
                        }
                        if (interfaceC3622nQ2.a(w6) != w6) {
                            throw new IllegalStateException("Unexpected child seekToUs result.");
                        }
                    }
                    j6 = w6;
                } else if (w6 != j6) {
                    throw new IllegalStateException("Conflicting discontinuities.");
                }
            } else if (j6 != com.anythink.basead.exoplayer.b.f6382b && interfaceC3622nQ.a(j6) != j6) {
                throw new IllegalStateException("Unexpected child seekToUs result.");
            }
        }
        return j6;
    }
}
