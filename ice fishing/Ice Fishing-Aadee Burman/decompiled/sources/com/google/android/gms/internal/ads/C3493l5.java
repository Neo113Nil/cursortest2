package com.google.android.gms.internal.ads;

import android.content.SharedPreferences;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Set;
import p2.C4835j;

/* renamed from: com.google.android.gms.internal.ads.l5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3493l5 implements I0, F5, InterfaceC3529lo {

    /* renamed from: w, reason: collision with root package name */
    public static final C3004c f31706w = new C3004c(14);

    /* renamed from: n, reason: collision with root package name */
    public int f31707n;

    /* renamed from: u, reason: collision with root package name */
    public Object f31708u;

    /* renamed from: v, reason: collision with root package name */
    public Object f31709v;

    public C3493l5(G1.a aVar) {
        this.f31707n = -1;
        this.f31708u = new byte[8];
        this.f31709v = aVar;
    }

    public static C3493l5 c(String str, boolean z3) {
        return new C3493l5(str, Boolean.valueOf(z3), 1);
    }

    public static C3493l5 j(String str, long j6) {
        return new C3493l5(str, Long.valueOf(j6), 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3529lo
    /* renamed from: a */
    public /* synthetic */ void mo1a(Object obj) {
        int i = PN.f26764H0;
        ((G6) obj).c0((X6) this.f31708u, (X6) this.f31709v, this.f31707n);
    }

    public int b() {
        int i = this.f31707n;
        if (i != 2) {
            return i != 3 ? 0 : 512;
        }
        return 2048;
    }

    public Object d(int i) {
        SparseArray sparseArray;
        if (this.f31707n == -1) {
            this.f31707n = 0;
        }
        while (true) {
            int i6 = this.f31707n;
            sparseArray = (SparseArray) this.f31708u;
            if (i6 > 0 && i < sparseArray.keyAt(i6)) {
                this.f31707n--;
            }
        }
        while (this.f31707n < sparseArray.size() - 1 && i >= sparseArray.keyAt(this.f31707n + 1)) {
            this.f31707n++;
        }
        return sparseArray.valueAt(this.f31707n);
    }

    public void e(Object obj, Object obj2) {
        int i = this.f31707n + 1;
        Object[] objArr = (Object[]) this.f31708u;
        int length = objArr.length;
        int i6 = i + i;
        if (i6 > length) {
            this.f31708u = Arrays.copyOf(objArr, MB.d(length, i6));
        }
        MA.i(obj, obj2);
        Object[] objArr2 = (Object[]) this.f31708u;
        int i9 = this.f31707n;
        int i10 = i9 + i9;
        objArr2[i10] = obj;
        objArr2[i10 + 1] = obj2;
        this.f31707n = i9 + 1;
    }

    @Override // com.google.android.gms.internal.ads.I0
    /* renamed from: f */
    public void mo2f() {
        byte[] bArr = AbstractC3159eu.f29994b;
        int length = bArr.length;
        ((Cr) this.f31709v).z(0, bArr);
    }

    @Override // com.google.android.gms.internal.ads.F5
    public byte g(M5 m52, int i) {
        int i6 = ((((~1264448664) & 231739608) | 1128901767) + ((1264448664 & 479203675) | 860794247)) - 1823332376;
        int i9 = 1761855727 % 1384724137;
        int i10 = (((((~143154913) & 992498304) | 439467622) + ((143154913 & 1627930754) | 1212551295)) - (-2089988634)) ^ (2033018190 % 70061690);
        int i11 = ((((~1661299468) & 613450408) | 2017391535) + ((1661299468 & 109051904) | 2071555381)) - (-441392543);
        int i12 = 1694830070 % 1383960411;
        int i13 = i >>> i10;
        int i14 = this.f31707n;
        byte[] bArr = (byte[]) this.f31708u;
        if (i13 != i14) {
            ((G1.a) this.f31709v).s(i13, bArr);
            this.f31707n = i13;
        }
        int i15 = i11 ^ i12;
        return (byte) (((m52.b(i) ^ bArr[i % (i6 ^ i9)]) << i15) >> i15);
    }

    public synchronized byte[] h(int i) {
        int i6 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.f31709v;
            if (i6 >= arrayList.size()) {
                return new byte[i];
            }
            byte[] bArr = (byte[]) arrayList.get(i6);
            int length = bArr.length;
            if (length >= i) {
                this.f31707n -= length;
                arrayList.remove(i6);
                ((ArrayList) this.f31708u).remove(bArr);
                return bArr;
            }
            i6++;
        }
    }

    @Override // com.google.android.gms.internal.ads.F5
    public /* bridge */ /* synthetic */ F5 i() {
        return new C3493l5((G1.a) this.f31709v);
    }

    public void k(C4197y8 c4197y8) {
        synchronized (this.f31708u) {
            try {
                Iterator it = ((LinkedList) this.f31709v).iterator();
                while (it.hasNext()) {
                    C4197y8 c4197y82 = (C4197y8) it.next();
                    C4835j c4835j = C4835j.f39730C;
                    if (c4835j.f39740h.g().l()) {
                        if (!c4835j.f39740h.g().m() && !c4197y8.equals(c4197y82) && c4197y82.f35124q.equals(c4197y8.f35124q)) {
                            it.remove();
                            return;
                        }
                    } else if (!c4197y8.equals(c4197y82) && c4197y82.f35122o.equals(c4197y8.f35122o)) {
                        it.remove();
                        return;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.F5
    public M5 l(M5 m52, int i, int i6) {
        if (i < 0 || i > i6 || i6 > m52.f26246a.length) {
            throw new IndexOutOfBoundsException();
        }
        byte[] bArr = new byte[i6 - i];
        int i9 = 0;
        while (i < i6) {
            bArr[i9] = g(m52, i);
            i++;
            i9++;
        }
        return M5.e(bArr);
    }

    public void m(Set set) {
        if (set != null) {
            int size = set.size() + this.f31707n;
            Object[] objArr = (Object[]) this.f31708u;
            int length = objArr.length;
            int i = size + size;
            if (i > length) {
                this.f31708u = Arrays.copyOf(objArr, MB.d(length, i));
            }
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            e(entry.getKey(), entry.getValue());
        }
    }

    public synchronized void n(byte[] bArr) {
        if (bArr != null) {
            int length = bArr.length;
            if (length <= 4096) {
                ((ArrayList) this.f31708u).add(bArr);
                ArrayList arrayList = (ArrayList) this.f31709v;
                int binarySearch = Collections.binarySearch(arrayList, bArr, f31706w);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                arrayList.add(binarySearch, bArr);
                this.f31707n += length;
                synchronized (this) {
                    while (this.f31707n > 4096) {
                        byte[] bArr2 = (byte[]) ((ArrayList) this.f31708u).remove(0);
                        ((ArrayList) this.f31709v).remove(bArr2);
                        this.f31707n -= bArr2.length;
                    }
                }
            }
        }
    }

    public C3770qC o() {
        return s(true);
    }

    @Override // com.google.android.gms.internal.ads.I0
    public H0 p(K0 k02, long j6) {
        long j9 = k02.f25819w;
        int min = (int) Math.min(112800L, k02.f25818v - j9);
        Cr cr = (Cr) this.f31709v;
        cr.y(min);
        k02.A(cr.f24252a, 0, min, false);
        int i = cr.f24254c;
        long j10 = -1;
        long j11 = -9223372036854775807L;
        long j12 = -1;
        while (cr.B() >= 188) {
            byte[] bArr = cr.f24252a;
            int i6 = cr.f24253b;
            while (i6 < i && bArr[i6] != 71) {
                i6++;
            }
            int i9 = i6 + 188;
            if (i9 > i) {
                break;
            }
            long l9 = AbstractC2772Sd.l(cr, i6, this.f31707n);
            if (l9 != com.anythink.basead.exoplayer.b.f6382b) {
                long c9 = ((Dt) this.f31708u).c(l9);
                if (c9 > j6) {
                    return j11 == com.anythink.basead.exoplayer.b.f6382b ? new H0(-1, c9, j9) : new H0(0, com.anythink.basead.exoplayer.b.f6382b, j9 + j12);
                }
                j11 = c9;
                long j13 = i6;
                if (100000 + j11 > j6) {
                    return new H0(0, com.anythink.basead.exoplayer.b.f6382b, j9 + j13);
                }
                j12 = j13;
            }
            cr.E(i9);
            j10 = i9;
        }
        return j11 != com.anythink.basead.exoplayer.b.f6382b ? new H0(-2, j11, j9 + j10) : H0.f25200d;
    }

    public void q(C4197y8 c4197y8) {
        synchronized (this.f31708u) {
            try {
                LinkedList linkedList = (LinkedList) this.f31709v;
                if (linkedList.size() >= 10) {
                    int size = linkedList.size();
                    StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 30);
                    sb.append("Queue is full, current size = ");
                    sb.append(size);
                    String sb2 = sb.toString();
                    int i = u2.z.f41319b;
                    v2.i.a(sb2);
                    linkedList.remove(0);
                }
                int i6 = this.f31707n;
                this.f31707n = i6 + 1;
                c4197y8.f35119l = i6;
                synchronized (c4197y8.f35115g) {
                    try {
                        int i9 = c4197y8.f35118k;
                        int i10 = c4197y8.f35119l;
                        boolean z3 = c4197y8.f35112d;
                        int i11 = c4197y8.f35110b;
                        if (!z3) {
                            i11 = (i10 * i11) + (i9 * c4197y8.f35109a);
                        }
                        if (i11 > c4197y8.f35121n) {
                            c4197y8.f35121n = i11;
                        }
                    } finally {
                    }
                }
                linkedList.add(c4197y8);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public Object r() {
        C3407ja c3407ja = (C3407ja) AbstractC3087db.f29779a.get();
        Object obj = this.f31709v;
        if (c3407ja == null) {
            if (AbstractC3087db.f29780b.get() == null) {
                return obj;
            }
            throw new ClassCastException();
        }
        int i = this.f31707n - 1;
        String str = (String) this.f31708u;
        SharedPreferences sharedPreferences = c3407ja.f31262a;
        if (i == 0) {
            boolean booleanValue = ((Boolean) obj).booleanValue();
            try {
                return Boolean.valueOf(sharedPreferences.getBoolean(str, booleanValue));
            } catch (ClassCastException unused) {
                return Boolean.valueOf(sharedPreferences.getString(str, String.valueOf(booleanValue)));
            }
        }
        if (i == 1) {
            try {
                return Long.valueOf(sharedPreferences.getLong(str, ((Long) obj).longValue()));
            } catch (ClassCastException unused2) {
                return Long.valueOf(sharedPreferences.getInt(str, (int) r1));
            }
        }
        if (i != 2) {
            return sharedPreferences.getString(str, (String) obj);
        }
        try {
            return Double.valueOf(sharedPreferences.getFloat(str, (float) r1));
        } catch (ClassCastException unused3) {
            return Double.valueOf(sharedPreferences.getString(str, String.valueOf(((Double) obj).doubleValue())));
        }
    }

    public C3770qC s(boolean z3) {
        SB sb;
        SB sb2;
        if (z3 && (sb2 = (SB) this.f31709v) != null) {
            throw sb2.a();
        }
        C3770qC e9 = C3770qC.e(this.f31707n, (Object[]) this.f31708u, this);
        if (!z3 || (sb = (SB) this.f31709v) == null) {
            return e9;
        }
        throw sb.a();
    }

    public C3493l5(String str, Object obj, int i) {
        this.f31708u = str;
        this.f31709v = obj;
        this.f31707n = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3493l5(int i, boolean z3) {
        this(4);
        switch (i) {
            case 4:
                this.f31708u = new Object();
                this.f31709v = new LinkedList();
                break;
            case 7:
                break;
            case 9:
                C3084dP c3084dP = C3084dP.f29769B;
                this.f31708u = new SparseArray();
                this.f31709v = c3084dP;
                this.f31707n = -1;
                break;
            default:
                this.f31708u = new ArrayList();
                this.f31709v = new ArrayList(64);
                this.f31707n = 0;
                break;
        }
    }

    public C3493l5(int i) {
        this.f31708u = new Object[i + i];
        this.f31707n = 0;
    }
}
