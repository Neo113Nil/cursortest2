package defpackage;

import androidx.compose.ui.text.style.ResolvedTextDirection;
import java.util.Collections;
import java.util.List;
import ru.CryptoPro.JCP.ASN.Gost_CryptoPro_PrivateKey._Gost_CryptoPro_PrivateKeyValues;

/* loaded from: classes10.dex */
public final class tny0 {
    public final kk2 a;
    public final long b;
    public final dry0 c;
    public final iv60 d;
    public final vry0 e;
    public long f;
    public final kk2 g;
    public final hoy0 h;
    public final ery0 i;

    public tny0(hoy0 hoy0Var, iv60 iv60Var, ery0 ery0Var, vry0 vry0Var) {
        kk2 kk2Var = hoy0Var.a;
        long j = hoy0Var.b;
        dry0 dry0Var = ery0Var != null ? ery0Var.a : null;
        this.a = kk2Var;
        this.b = j;
        this.c = dry0Var;
        this.d = iv60Var;
        this.e = vry0Var;
        this.f = j;
        this.g = kk2Var;
        this.h = hoy0Var;
        this.i = ery0Var;
    }

    public final List a(tls tlsVar) {
        if (!asy0.c(this.f)) {
            return scc.g(new fnc("", 0), new d4r0(asy0.f(this.f), asy0.f(this.f)));
        }
        zkn zknVar = (zkn) tlsVar.invoke(this);
        if (zknVar != null) {
            return Collections.singletonList(zknVar);
        }
        return null;
    }

    public final Integer b() {
        dry0 dry0Var = this.c;
        if (dry0Var == null) {
            return null;
        }
        hm40 hm40Var = dry0Var.b;
        int e = asy0.e(this.f);
        iv60 iv60Var = this.d;
        return Integer.valueOf(iv60Var.j(hm40Var.c(hm40Var.d(iv60Var.r(e)), true)));
    }

    public final Integer c() {
        dry0 dry0Var = this.c;
        if (dry0Var == null) {
            return null;
        }
        int f = asy0.f(this.f);
        iv60 iv60Var = this.d;
        return Integer.valueOf(iv60Var.j(dry0Var.k(dry0Var.b.d(iv60Var.r(f)))));
    }

    public final Integer d() {
        int length;
        dry0 dry0Var = this.c;
        if (dry0Var == null) {
            return null;
        }
        int r = r();
        while (true) {
            kk2 kk2Var = this.a;
            if (r < kk2Var.b.length()) {
                int length2 = this.g.b.length() - 1;
                if (r <= length2) {
                    length2 = r;
                }
                long n = dry0Var.n(length2);
                int i = asy0.c;
                int i2 = (int) (n & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
                if (i2 > r) {
                    length = this.d.j(i2);
                    break;
                }
                r++;
            } else {
                length = kk2Var.b.length();
                break;
            }
        }
        return Integer.valueOf(length);
    }

    public final Integer e() {
        int i;
        dry0 dry0Var = this.c;
        if (dry0Var == null) {
            return null;
        }
        int r = r();
        while (true) {
            if (r <= 0) {
                i = 0;
                break;
            }
            int length = this.g.b.length() - 1;
            if (r <= length) {
                length = r;
            }
            long n = dry0Var.n(length);
            int i2 = asy0.c;
            int i3 = (int) (n >> 32);
            if (i3 < r) {
                i = this.d.j(i3);
                break;
            }
            r--;
        }
        return Integer.valueOf(i);
    }

    public final boolean f() {
        dry0 dry0Var = this.c;
        return (dry0Var != null ? dry0Var.l(r()) : null) != ResolvedTextDirection.Rtl;
    }

    public final int g(dry0 dry0Var, int i) {
        int r = r();
        vry0 vry0Var = this.e;
        if (vry0Var.a == null) {
            vry0Var.a = Float.valueOf(dry0Var.c(r).a);
        }
        hm40 hm40Var = dry0Var.b;
        int d = hm40Var.d(r) + i;
        if (d < 0) {
            return 0;
        }
        if (d >= hm40Var.f) {
            return this.g.b.length();
        }
        float b = hm40Var.b(d) - 1.0f;
        Float f = vry0Var.a;
        float floatValue = f.floatValue();
        if ((f() && floatValue >= dry0Var.j(d)) || (!f() && floatValue <= dry0Var.i(d))) {
            return hm40Var.c(d, true);
        }
        return this.d.j(hm40Var.g((Float.floatToRawIntBits(b) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(f.floatValue()) << 32)));
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0011, code lost:
    
        if (r9 == null) goto L9;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int h(ery0 ery0Var, int i) {
        zii0 zii0Var;
        rzx rzxVar = ery0Var.b;
        dry0 dry0Var = ery0Var.a;
        if (rzxVar != null) {
            rzx rzxVar2 = ery0Var.c;
            zii0Var = rzxVar2 != null ? rzxVar2.j(rzxVar, true) : null;
        }
        zii0Var = zii0.e;
        long j = this.h.b;
        int i2 = asy0.c;
        int i3 = (int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD);
        iv60 iv60Var = this.d;
        zii0 c = dry0Var.c(iv60Var.r(i3));
        float f = c.a;
        float intBitsToFloat = (Float.intBitsToFloat((int) (zii0Var.d() & _Gost_CryptoPro_PrivateKeyValues.maxDWORD)) * i) + c.b;
        return iv60Var.j(dry0Var.b.g((Float.floatToRawIntBits(intBitsToFloat) & _Gost_CryptoPro_PrivateKeyValues.maxDWORD) | (Float.floatToRawIntBits(f) << 32)));
    }

    public final void i() {
        vry0 vry0Var = this.e;
        vry0Var.a = null;
        kk2 kk2Var = this.g;
        if (kk2Var.b.length() > 0) {
            if (f()) {
                k();
                return;
            }
            vry0Var.a = null;
            if (kk2Var.b.length() > 0) {
                String str = kk2Var.b;
                long j = this.f;
                int i = asy0.c;
                int b = nhb1.b((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), str);
                if (b != -1) {
                    q(b, b);
                }
            }
        }
    }

    public final void j() {
        this.e.a = null;
        kk2 kk2Var = this.g;
        String str = kk2Var.b;
        String str2 = kk2Var.b;
        if (str.length() > 0) {
            int d = lhb1.d(asy0.e(this.f), str2);
            if (d == asy0.e(this.f) && d != str2.length()) {
                d = lhb1.d(d + 1, str2);
            }
            q(d, d);
        }
    }

    public final void k() {
        this.e.a = null;
        kk2 kk2Var = this.g;
        if (kk2Var.b.length() > 0) {
            String str = kk2Var.b;
            long j = this.f;
            int i = asy0.c;
            int c = nhb1.c((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), str);
            if (c != -1) {
                q(c, c);
            }
        }
    }

    public final void l() {
        this.e.a = null;
        kk2 kk2Var = this.g;
        String str = kk2Var.b;
        String str2 = kk2Var.b;
        if (str.length() > 0) {
            int e = lhb1.e(asy0.f(this.f), str2);
            if (e == asy0.f(this.f) && e != 0) {
                e = lhb1.e(e - 1, str2);
            }
            q(e, e);
        }
    }

    public final void m() {
        vry0 vry0Var = this.e;
        vry0Var.a = null;
        kk2 kk2Var = this.g;
        if (kk2Var.b.length() > 0) {
            if (!f()) {
                k();
                return;
            }
            vry0Var.a = null;
            if (kk2Var.b.length() > 0) {
                String str = kk2Var.b;
                long j = this.f;
                int i = asy0.c;
                int b = nhb1.b((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD), str);
                if (b != -1) {
                    q(b, b);
                }
            }
        }
    }

    public final void n() {
        Integer b;
        this.e.a = null;
        if (this.g.b.length() <= 0 || (b = b()) == null) {
            return;
        }
        int intValue = b.intValue();
        q(intValue, intValue);
    }

    public final void o() {
        Integer c;
        this.e.a = null;
        if (this.g.b.length() <= 0 || (c = c()) == null) {
            return;
        }
        int intValue = c.intValue();
        q(intValue, intValue);
    }

    public final void p() {
        if (this.g.b.length() > 0) {
            int i = asy0.c;
            this.f = eja1.c((int) (this.b >> 32), (int) (this.f & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
        }
    }

    public final void q(int i, int i2) {
        this.f = eja1.c(i, i2);
    }

    public final int r() {
        long j = this.f;
        int i = asy0.c;
        return this.d.r((int) (j & _Gost_CryptoPro_PrivateKeyValues.maxDWORD));
    }
}
