package H3;

import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.internal.ads.AbstractC2772Sd;
import com.google.android.gms.internal.ads.C3108dx;
import com.google.android.gms.internal.ads.C3500lC;
import com.google.android.gms.internal.ads.C3763q5;
import com.google.android.gms.internal.ads.Cr;
import com.google.android.gms.internal.ads.InterfaceC3216fx;
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
    public int f1146a;

    /* renamed from: b, reason: collision with root package name */
    public int f1147b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1148c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1149d;

    public q() {
        this.f1148c = new long[10];
        this.f1149d = new Object[10];
    }

    public static q a(Cr cr) {
        String str;
        int i;
        int i6;
        int i9;
        int i10;
        int i11;
        try {
            if (cr.b() != 0) {
                throw U4.a(null, "Unsupported VVC version");
            }
            int K7 = cr.K();
            int i12 = K7 >> 1;
            int i13 = 1;
            str = "L";
            if ((K7 & 1) != 0) {
                cr.G(1);
                int K8 = cr.K() >> 4;
                i = cr.K() >> 5;
                int K9 = cr.K() & 63;
                int K10 = cr.K();
                i9 = K10 >> 1;
                str = (K10 & 1) != 0 ? "H" : "L";
                i6 = cr.K();
                cr.G(K9);
                int i14 = K8 & 7;
                if (i14 > 1) {
                    int K11 = cr.K();
                    for (int i15 = 0; i15 < i14 - 1; i15++) {
                        if (((K11 >> (7 - i15)) & 1) != 0) {
                            cr.G(1);
                        }
                    }
                }
                cr.G(cr.K() * 4);
                cr.G(6);
            } else {
                i = 0;
                i6 = 0;
                i9 = 0;
            }
            int K12 = cr.K();
            int i16 = cr.f24253b;
            int i17 = 0;
            int i18 = 0;
            while (true) {
                i10 = 12;
                i11 = 13;
                if (i17 >= K12) {
                    break;
                }
                int K13 = cr.K() & 31;
                int L6 = (K13 == 13 || K13 == 12) ? 1 : cr.L();
                for (int i19 = 0; i19 < L6; i19++) {
                    int L8 = cr.L();
                    i18 = L8 + 4 + i18;
                    cr.G(L8);
                }
                i17++;
            }
            cr.E(i16);
            byte[] bArr = new byte[i18];
            int i20 = 0;
            int i21 = 0;
            while (i20 < K12) {
                int K14 = cr.K() & 31;
                int L9 = (K14 == i11 || K14 == i10) ? i13 : cr.L();
                int i22 = i13;
                for (int i23 = 0; i23 < L9; i23++) {
                    int L10 = cr.L();
                    System.arraycopy(SK.f27460r0, 0, bArr, i21, 4);
                    int i24 = i21 + 4;
                    cr.H(bArr, i24, L10);
                    i21 = i24 + L10;
                }
                i20++;
                i13 = i22;
                i10 = 12;
                i11 = 13;
            }
            Locale locale = Locale.US;
            String str2 = "vvc1." + i9 + com.anythink.core.common.d.j.f12378z + str + i6;
            C3500lC j6 = RB.j(bArr);
            q qVar = new q();
            qVar.f1148c = j6;
            qVar.f1146a = (i12 & 3) + 1;
            qVar.f1149d = str2;
            qVar.f1147b = i + 8;
            return qVar;
        } catch (ArrayIndexOutOfBoundsException e9) {
            throw U4.a(e9, "Error parsing VVC configuration");
        }
    }

    public synchronized void b() {
        try {
            C3108dx c3108dx = (C3108dx) this.f1149d;
            if (c3108dx.f29862b) {
                InterfaceC3216fx interfaceC3216fx = c3108dx.f29861a;
                interfaceC3216fx.d2((byte[]) this.f1148c);
                interfaceC3216fx.D(this.f1146a);
                interfaceC3216fx.a0(this.f1147b);
                interfaceC3216fx.p0();
                interfaceC3216fx.d();
            }
        } catch (RemoteException e9) {
            Log.d("GASS", "Clearcut log failed", e9);
        }
    }

    public synchronized void c(long j6, Object obj) {
        try {
            if (this.f1147b > 0) {
                if (j6 <= ((long[]) this.f1148c)[((this.f1146a + r0) - 1) % ((Object[]) this.f1149d).length]) {
                    synchronized (this) {
                        this.f1146a = 0;
                        this.f1147b = 0;
                        Arrays.fill((Object[]) this.f1149d, (Object) null);
                    }
                }
            }
            int length = ((Object[]) this.f1149d).length;
            if (this.f1147b >= length) {
                int i = length + length;
                long[] jArr = new long[i];
                Object[] objArr = new Object[i];
                int i6 = this.f1146a;
                int i9 = length - i6;
                System.arraycopy((long[]) this.f1148c, i6, jArr, 0, i9);
                System.arraycopy((Object[]) this.f1149d, this.f1146a, objArr, 0, i9);
                int i10 = this.f1146a;
                if (i10 > 0) {
                    System.arraycopy((long[]) this.f1148c, 0, jArr, i9, i10);
                    System.arraycopy((Object[]) this.f1149d, 0, objArr, i9, this.f1146a);
                }
                this.f1148c = jArr;
                this.f1149d = objArr;
                this.f1146a = 0;
            }
            int i11 = this.f1146a;
            int i12 = this.f1147b;
            Object[] objArr2 = (Object[]) this.f1149d;
            int length2 = (i11 + i12) % objArr2.length;
            ((long[]) this.f1148c)[length2] = j6;
            objArr2[length2] = obj;
            this.f1147b = i12 + 1;
        } catch (Throwable th) {
            throw th;
        }
    }

    public synchronized int d() {
        return this.f1147b;
    }

    public synchronized Object e() {
        if (this.f1147b == 0) {
            return null;
        }
        return g();
    }

    public synchronized Object f(long j6) {
        Object obj;
        obj = null;
        while (this.f1147b > 0 && j6 - ((long[]) this.f1148c)[this.f1146a] >= 0) {
            obj = g();
        }
        return obj;
    }

    public Object g() {
        AbstractC2772Sd.H(this.f1147b > 0);
        Object[] objArr = (Object[]) this.f1149d;
        int i = this.f1146a;
        Object obj = objArr[i];
        objArr[i] = null;
        this.f1146a = (i + 1) % objArr.length;
        this.f1147b--;
        return obj;
    }

    public q(int i, ArrayList arrayList, int i6, C3763q5 c3763q5) {
        this.f1146a = i;
        this.f1148c = arrayList;
        this.f1147b = i6;
        this.f1149d = c3763q5;
    }

    public /* synthetic */ q(C3108dx c3108dx, byte[] bArr) {
        Objects.requireNonNull(c3108dx);
        this.f1149d = c3108dx;
        this.f1148c = bArr;
    }
}
