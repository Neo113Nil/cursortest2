package J3;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.ads.AbstractC2792Sd;
import com.google.android.gms.internal.ads.C3131dx;
import com.google.android.gms.internal.ads.C3523lC;
import com.google.android.gms.internal.ads.C3786q5;
import com.google.android.gms.internal.ads.Cr;
import com.google.android.gms.internal.ads.InterfaceC3239fx;
import com.google.android.gms.internal.ads.RB;
import com.google.android.gms.internal.ads.SK;
import com.google.android.gms.internal.ads.U4;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Locale;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public int f1502a;

    /* renamed from: b, reason: collision with root package name */
    public int f1503b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1504c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1505d;

    public q() {
        this.f1504c = new long[10];
        this.f1505d = new Object[10];
    }

    public static q a(Cr cr) {
        String str;
        int i;
        int i4;
        int i6;
        int i9;
        int i10;
        try {
            if (cr.b() != 0) {
                throw U4.a(null, "Unsupported VVC version");
            }
            int K7 = cr.K();
            int i11 = K7 >> 1;
            int i12 = 1;
            str = "L";
            if ((K7 & 1) != 0) {
                cr.G(1);
                int K8 = cr.K() >> 4;
                i = cr.K() >> 5;
                int K9 = cr.K() & 63;
                int K10 = cr.K();
                i6 = K10 >> 1;
                str = (K10 & 1) != 0 ? "H" : "L";
                i4 = cr.K();
                cr.G(K9);
                int i13 = K8 & 7;
                if (i13 > 1) {
                    int K11 = cr.K();
                    for (int i14 = 0; i14 < i13 - 1; i14++) {
                        if (((K11 >> (7 - i14)) & 1) != 0) {
                            cr.G(1);
                        }
                    }
                }
                cr.G(cr.K() * 4);
                cr.G(6);
            } else {
                i = 0;
                i4 = 0;
                i6 = 0;
            }
            int K12 = cr.K();
            int i15 = cr.f24998b;
            int i16 = 0;
            int i17 = 0;
            while (true) {
                i9 = 12;
                i10 = 13;
                if (i16 >= K12) {
                    break;
                }
                int K13 = cr.K() & 31;
                int L2 = (K13 == 13 || K13 == 12) ? 1 : cr.L();
                for (int i18 = 0; i18 < L2; i18++) {
                    int L6 = cr.L();
                    i17 = L6 + 4 + i17;
                    cr.G(L6);
                }
                i16++;
            }
            cr.E(i15);
            byte[] bArr = new byte[i17];
            int i19 = 0;
            int i20 = 0;
            while (i19 < K12) {
                int K14 = cr.K() & 31;
                int L8 = (K14 == i10 || K14 == i9) ? i12 : cr.L();
                int i21 = i12;
                for (int i22 = 0; i22 < L8; i22++) {
                    int L9 = cr.L();
                    System.arraycopy(SK.m0, 0, bArr, i20, 4);
                    int i23 = i20 + 4;
                    cr.H(bArr, i23, L9);
                    i20 = i23 + L9;
                }
                i19++;
                i12 = i21;
                i9 = 12;
                i10 = 13;
            }
            Locale locale = Locale.US;
            String str2 = "vvc1." + i6 + com.anythink.core.common.d.j.f13164z + str + i4;
            C3523lC j6 = RB.j(bArr);
            q qVar = new q();
            qVar.f1504c = j6;
            qVar.f1502a = (i11 & 3) + 1;
            qVar.f1505d = str2;
            qVar.f1503b = i + 8;
            return qVar;
        } catch (ArrayIndexOutOfBoundsException e9) {
            throw U4.a(e9, "Error parsing VVC configuration");
        }
    }

    public synchronized void b() {
        try {
            C3131dx c3131dx = (C3131dx) this.f1505d;
            if (c3131dx.f30654b) {
                InterfaceC3239fx interfaceC3239fx = c3131dx.f30653a;
                interfaceC3239fx.b2((byte[]) this.f1504c);
                interfaceC3239fx.D(this.f1502a);
                interfaceC3239fx.a0(this.f1503b);
                interfaceC3239fx.p0();
                interfaceC3239fx.d();
            }
        } catch (RemoteException e9) {
            Log.d("GASS", "Clearcut log failed", e9);
        }
    }

    public synchronized void c(long j6, Object obj) {
        try {
            if (this.f1503b > 0) {
                if (j6 <= ((long[]) this.f1504c)[((this.f1502a + r0) - 1) % ((Object[]) this.f1505d).length]) {
                    synchronized (this) {
                        this.f1502a = 0;
                        this.f1503b = 0;
                        Arrays.fill((Object[]) this.f1505d, (Object) null);
                    }
                }
            }
            int length = ((Object[]) this.f1505d).length;
            if (this.f1503b >= length) {
                int i = length + length;
                long[] jArr = new long[i];
                Object[] objArr = new Object[i];
                int i4 = this.f1502a;
                int i6 = length - i4;
                System.arraycopy((long[]) this.f1504c, i4, jArr, 0, i6);
                System.arraycopy((Object[]) this.f1505d, this.f1502a, objArr, 0, i6);
                int i9 = this.f1502a;
                if (i9 > 0) {
                    System.arraycopy((long[]) this.f1504c, 0, jArr, i6, i9);
                    System.arraycopy((Object[]) this.f1505d, 0, objArr, i6, this.f1502a);
                }
                this.f1504c = jArr;
                this.f1505d = objArr;
                this.f1502a = 0;
            }
            int i10 = this.f1502a;
            int i11 = this.f1503b;
            Object[] objArr2 = (Object[]) this.f1505d;
            int length2 = (i10 + i11) % objArr2.length;
            ((long[]) this.f1504c)[length2] = j6;
            objArr2[length2] = obj;
            this.f1503b = i11 + 1;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized int d() {
        return this.f1503b;
    }

    public synchronized Object e() {
        if (this.f1503b == 0) {
            return null;
        }
        return g();
    }

    public synchronized Object f(long j6) {
        Object obj;
        obj = null;
        while (this.f1503b > 0 && j6 - ((long[]) this.f1504c)[this.f1502a] >= 0) {
            obj = g();
        }
        return obj;
    }

    public Object g() {
        AbstractC2792Sd.H(this.f1503b > 0);
        Object[] objArr = (Object[]) this.f1505d;
        int i = this.f1502a;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f1502a = (i + 1) % objArr.length;
        this.f1503b--;
        return obj;
    }

    public q(int i, ArrayList arrayList, int i4, C3786q5 c3786q5) {
        this.f1502a = i;
        this.f1504c = arrayList;
        this.f1503b = i4;
        this.f1505d = c3786q5;
    }

    public /* synthetic */ q(C3131dx c3131dx, byte[] bArr) {
        Objects.requireNonNull(c3131dx);
        this.f1505d = c3131dx;
        this.f1504c = bArr;
    }
}
