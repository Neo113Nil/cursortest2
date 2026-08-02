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
import r2.C4906k;

/* renamed from: com.google.android.gms.internal.ads.l5, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3516l5 implements I0, F5, InterfaceC3606mo {

    /* renamed from: w, reason: collision with root package name */
    public static final C3027c f32486w = new C3027c(14);

    /* renamed from: n, reason: collision with root package name */
    public int f32487n;

    /* renamed from: u, reason: collision with root package name */
    public Object f32488u;

    /* renamed from: v, reason: collision with root package name */
    public Object f32489v;

    public C3516l5(I1.a aVar) {
        this.f32487n = -1;
        this.f32488u = new byte[8];
        this.f32489v = aVar;
    }

    public static C3516l5 c(String str, boolean z6) {
        return new C3516l5(str, Boolean.valueOf(z6), 1);
    }

    public static C3516l5 j(String str, long j6) {
        return new C3516l5(str, Long.valueOf(j6), 2);
    }

    @Override // com.google.android.gms.internal.ads.InterfaceC3606mo
    /* renamed from: a */
    public /* synthetic */ void mo5a(Object obj) {
        int i = PN.C0;
        ((G6) obj).c0((X6) this.f32488u, (X6) this.f32489v, this.f32487n);
    }

    public int b() {
        int i = this.f32487n;
        if (i != 2) {
            return i != 3 ? 0 : 512;
        }
        return 2048;
    }

    public Object d(int i) {
        SparseArray sparseArray;
        if (this.f32487n == -1) {
            this.f32487n = 0;
        }
        while (true) {
            int i4 = this.f32487n;
            sparseArray = (SparseArray) this.f32488u;
            if (i4 > 0 && i < sparseArray.keyAt(i4)) {
                this.f32487n--;
            }
        }
        while (this.f32487n < sparseArray.size() - 1 && i >= sparseArray.keyAt(this.f32487n + 1)) {
            this.f32487n++;
        }
        return sparseArray.valueAt(this.f32487n);
    }

    public void e(Object obj, Object obj2) {
        int i = this.f32487n + 1;
        Object[] objArr = (Object[]) this.f32488u;
        int length = objArr.length;
        int i4 = i + i;
        if (i4 > length) {
            this.f32488u = Arrays.copyOf(objArr, MB.d(length, i4));
        }
        MA.i(obj, obj2);
        Object[] objArr2 = (Object[]) this.f32488u;
        int i6 = this.f32487n;
        int i9 = i6 + i6;
        objArr2[i9] = obj;
        objArr2[i9 + 1] = obj2;
        this.f32487n = i6 + 1;
    }

    @Override // com.google.android.gms.internal.ads.I0
    /* renamed from: f */
    public void mo1f() {
        byte[] bArr = AbstractC3182eu.f30783b;
        int length = bArr.length;
        ((Cr) this.f32489v).z(0, bArr);
    }

    @Override // com.google.android.gms.internal.ads.F5
    public byte g(M5 m52, int i) {
        int i4 = ((((~1264448664) & 231739608) | 1128901767) + ((1264448664 & 479203675) | 860794247)) - 1823332376;
        int i6 = 1761855727 % 1384724137;
        int i9 = (((((~143154913) & 992498304) | 439467622) + ((143154913 & 1627930754) | 1212551295)) - (-2089988634)) ^ (2033018190 % 70061690);
        int i10 = ((((~1661299468) & 613450408) | 2017391535) + ((1661299468 & 109051904) | 2071555381)) - (-441392543);
        int i11 = 1694830070 % 1383960411;
        int i12 = i >>> i9;
        int i13 = this.f32487n;
        byte[] bArr = (byte[]) this.f32488u;
        if (i12 != i13) {
            ((I1.a) this.f32489v).s(i12, bArr);
            this.f32487n = i12;
        }
        int i14 = i10 ^ i11;
        return (byte) (((m52.b(i) ^ bArr[i % (i4 ^ i6)]) << i14) >> i14);
    }

    public synchronized byte[] h(int i) {
        int i4 = 0;
        while (true) {
            ArrayList arrayList = (ArrayList) this.f32489v;
            if (i4 >= arrayList.size()) {
                return new byte[i];
            }
            byte[] bArr = (byte[]) arrayList.get(i4);
            int length = bArr.length;
            if (length >= i) {
                this.f32487n -= length;
                arrayList.remove(i4);
                ((ArrayList) this.f32488u).remove(bArr);
                return bArr;
            }
            i4++;
        }
    }

    @Override // com.google.android.gms.internal.ads.F5
    public /* bridge */ /* synthetic */ F5 i() {
        return new C3516l5((I1.a) this.f32489v);
    }

    public void k(C4220y8 c4220y8) {
        synchronized (this.f32488u) {
            try {
                Iterator it = ((LinkedList) this.f32489v).iterator();
                while (it.hasNext()) {
                    C4220y8 c4220y82 = (C4220y8) it.next();
                    C4906k c4906k = C4906k.f40186C;
                    if (c4906k.f40196h.g().l()) {
                        if (!c4906k.f40196h.g().m() && !c4220y8.equals(c4220y82) && c4220y82.f35910q.equals(c4220y8.f35910q)) {
                            it.remove();
                            return;
                        }
                    } else if (!c4220y8.equals(c4220y82) && c4220y82.f35908o.equals(c4220y8.f35908o)) {
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
    public M5 l(M5 m52, int i, int i4) {
        if (i < 0 || i > i4 || i4 > m52.f27037a.length) {
            throw new IndexOutOfBoundsException();
        }
        byte[] bArr = new byte[i4 - i];
        int i6 = 0;
        while (i < i4) {
            bArr[i6] = g(m52, i);
            i++;
            i6++;
        }
        return M5.e(bArr);
    }

    public void m(Set set) {
        if (set != null) {
            int size = set.size() + this.f32487n;
            Object[] objArr = (Object[]) this.f32488u;
            int length = objArr.length;
            int i = size + size;
            if (i > length) {
                this.f32488u = Arrays.copyOf(objArr, MB.d(length, i));
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
                ((ArrayList) this.f32488u).add(bArr);
                ArrayList arrayList = (ArrayList) this.f32489v;
                int binarySearch = Collections.binarySearch(arrayList, bArr, f32486w);
                if (binarySearch < 0) {
                    binarySearch = (-binarySearch) - 1;
                }
                arrayList.add(binarySearch, bArr);
                this.f32487n += length;
                synchronized (this) {
                    while (this.f32487n > 4096) {
                        byte[] bArr2 = (byte[]) ((ArrayList) this.f32488u).remove(0);
                        ((ArrayList) this.f32489v).remove(bArr2);
                        this.f32487n -= bArr2.length;
                    }
                }
            }
        }
    }

    public C3793qC o() {
        return s(true);
    }

    public void p(C4220y8 c4220y8) {
        synchronized (this.f32488u) {
            try {
                LinkedList linkedList = (LinkedList) this.f32489v;
                if (linkedList.size() >= 10) {
                    int size = linkedList.size();
                    StringBuilder sb = new StringBuilder(String.valueOf(size).length() + 30);
                    sb.append("Queue is full, current size = ");
                    sb.append(size);
                    String sb2 = sb.toString();
                    int i = w2.z.f41712b;
                    x2.i.a(sb2);
                    linkedList.remove(0);
                }
                int i4 = this.f32487n;
                this.f32487n = i4 + 1;
                c4220y8.f35905l = i4;
                synchronized (c4220y8.f35901g) {
                    try {
                        int i6 = c4220y8.f35904k;
                        int i9 = c4220y8.f35905l;
                        boolean z6 = c4220y8.f35898d;
                        int i10 = c4220y8.f35896b;
                        if (!z6) {
                            i10 = (i9 * i10) + (i6 * c4220y8.f35895a);
                        }
                        if (i10 > c4220y8.f35907n) {
                            c4220y8.f35907n = i10;
                        }
                    } finally {
                    }
                }
                linkedList.add(c4220y8);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.google.android.gms.internal.ads.I0
    public H0 q(K0 k02, long j6) {
        long j9 = k02.f26571w;
        int min = (int) Math.min(112800L, k02.f26570v - j9);
        Cr cr = (Cr) this.f32489v;
        cr.y(min);
        k02.E(cr.f24997a, 0, min, false);
        int i = cr.f24999c;
        long j10 = -1;
        long j11 = -9223372036854775807L;
        long j12 = -1;
        while (cr.B() >= 188) {
            byte[] bArr = cr.f24997a;
            int i4 = cr.f24998b;
            while (i4 < i && bArr[i4] != 71) {
                i4++;
            }
            int i6 = i4 + 188;
            if (i6 > i) {
                break;
            }
            long l9 = AbstractC2792Sd.l(cr, i4, this.f32487n);
            if (l9 != com.anythink.basead.exoplayer.b.f7168b) {
                long c9 = ((Dt) this.f32488u).c(l9);
                if (c9 > j6) {
                    return j11 == com.anythink.basead.exoplayer.b.f7168b ? new H0(-1, c9, j9) : new H0(0, com.anythink.basead.exoplayer.b.f7168b, j9 + j12);
                }
                j11 = c9;
                long j13 = i4;
                if (100000 + j11 > j6) {
                    return new H0(0, com.anythink.basead.exoplayer.b.f7168b, j9 + j13);
                }
                j12 = j13;
            }
            cr.E(i6);
            j10 = i6;
        }
        return j11 != com.anythink.basead.exoplayer.b.f7168b ? new H0(-2, j11, j9 + j10) : H0.f25972d;
    }

    public Object r() {
        C3430ja c3430ja = (C3430ja) AbstractC3110db.f30552a.get();
        Object obj = this.f32489v;
        if (c3430ja == null) {
            if (AbstractC3110db.f30553b.get() == null) {
                return obj;
            }
            throw new ClassCastException();
        }
        int i = this.f32487n - 1;
        String str = (String) this.f32488u;
        SharedPreferences sharedPreferences = c3430ja.f32049a;
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

    public C3793qC s(boolean z6) {
        SB sb;
        SB sb2;
        if (z6 && (sb2 = (SB) this.f32489v) != null) {
            throw sb2.a();
        }
        C3793qC e9 = C3793qC.e(this.f32487n, (Object[]) this.f32488u, this);
        if (!z6 || (sb = (SB) this.f32489v) == null) {
            return e9;
        }
        throw sb.a();
    }

    public C3516l5(String str, Object obj, int i) {
        this.f32488u = str;
        this.f32489v = obj;
        this.f32487n = i;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C3516l5(int i, boolean z6) {
        this(4);
        switch (i) {
            case 4:
                this.f32488u = new Object();
                this.f32489v = new LinkedList();
                break;
            case 7:
                break;
            case 9:
                C3107dP c3107dP = C3107dP.f30541B;
                this.f32488u = new SparseArray();
                this.f32489v = c3107dP;
                this.f32487n = -1;
                break;
            default:
                this.f32488u = new ArrayList();
                this.f32489v = new ArrayList(64);
                this.f32487n = 0;
                break;
        }
    }

    public C3516l5(int i) {
        this.f32488u = new Object[i + i];
        this.f32487n = 0;
    }
}
