package defpackage;

import java.util.Arrays;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicReference;
import org.joda.time.DateTimeFieldType;
import org.joda.time.DateTimeZone;
import org.joda.time.DurationFieldType;
import org.joda.time.IllegalFieldValueException;
import org.joda.time.IllegalInstantException;
import org.joda.time.chrono.ISOChronology;

/* loaded from: classes5.dex */
public final class pd7 {
    public final rk4 a;
    public final Locale b;
    public final int c;
    public DateTimeZone d;
    public Integer e;
    public nd7[] f;
    public int g;
    public boolean h;
    public od7 i;

    public pd7(rk4 rk4Var) {
        AtomicReference atomicReference = sd7.a;
        rk4Var = rk4Var == null ? ISOChronology.U() : rk4Var;
        DateTimeZone k = rk4Var.k();
        this.a = rk4Var.H();
        this.b = Locale.getDefault();
        this.c = 2000;
        this.d = k;
        this.f = new nd7[8];
    }

    public static int a(psa psaVar, psa psaVar2) {
        if (psaVar == null || !psaVar.f()) {
            return (psaVar2 == null || !psaVar2.f()) ? 0 : -1;
        }
        if (psaVar2 == null || !psaVar2.f()) {
            return 1;
        }
        return -psaVar.compareTo(psaVar2);
    }

    public final long b(CharSequence charSequence) {
        nd7[] nd7VarArr = this.f;
        int i = this.g;
        if (this.h) {
            nd7VarArr = (nd7[]) nd7VarArr.clone();
            this.f = nd7VarArr;
            this.h = false;
        }
        if (i > 10) {
            Arrays.sort(nd7VarArr, 0, i);
        } else {
            for (int i2 = 0; i2 < i; i2++) {
                for (int i3 = i2; i3 > 0; i3--) {
                    int i4 = i3 - 1;
                    nd7 nd7Var = nd7VarArr[i4];
                    nd7 nd7Var2 = nd7VarArr[i3];
                    nd7Var.getClass();
                    xc7 xc7Var = nd7Var2.a;
                    int a = a(nd7Var.a.p(), xc7Var.p());
                    if (a == 0) {
                        a = a(nd7Var.a.g(), xc7Var.g());
                    }
                    if (a > 0) {
                        nd7 nd7Var3 = nd7VarArr[i3];
                        nd7VarArr[i3] = nd7VarArr[i4];
                        nd7VarArr[i4] = nd7Var3;
                    }
                }
            }
        }
        if (i > 0) {
            DurationFieldType durationFieldType = DurationFieldType.e;
            rk4 rk4Var = this.a;
            psa a2 = durationFieldType.a(rk4Var);
            psa a3 = DurationFieldType.g.a(rk4Var);
            psa g = nd7VarArr[0].a.g();
            if (a(g, a2) >= 0 && a(g, a3) <= 0) {
                DateTimeFieldType dateTimeFieldType = DateTimeFieldType.e;
                nd7 c = c();
                c.a = dateTimeFieldType.b(rk4Var);
                c.b = this.c;
                c.c = null;
                c.d = null;
                return b(charSequence);
            }
        }
        long j = 0;
        for (int i5 = 0; i5 < i; i5++) {
            try {
                nd7 nd7Var4 = nd7VarArr[i5];
                String str = nd7Var4.c;
                xc7 xc7Var2 = nd7Var4.a;
                j = nd7Var4.a.w(str == null ? xc7Var2.C(j, nd7Var4.b) : xc7Var2.B(j, str, nd7Var4.d));
            } catch (IllegalFieldValueException e) {
                if (charSequence != null) {
                    e.b("Cannot parse \"" + ((Object) charSequence) + '\"');
                }
                throw e;
            }
        }
        int i6 = 0;
        while (i6 < i) {
            if (!nd7VarArr[i6].a.s()) {
                nd7 nd7Var5 = nd7VarArr[i6];
                boolean z = i6 == i + (-1);
                String str2 = nd7Var5.c;
                xc7 xc7Var3 = nd7Var5.a;
                j = str2 == null ? xc7Var3.C(j, nd7Var5.b) : xc7Var3.B(j, str2, nd7Var5.d);
                if (z) {
                    j = nd7Var5.a.w(j);
                }
            }
            i6++;
        }
        if (this.e != null) {
            return j - r0.intValue();
        }
        DateTimeZone dateTimeZone = this.d;
        if (dateTimeZone != null) {
            int k = dateTimeZone.k(j);
            j -= k;
            if (k != this.d.j(j)) {
                String str3 = "Illegal instant due to time zone offset transition (" + this.d + ')';
                if (charSequence != null) {
                    str3 = "Cannot parse \"" + ((Object) charSequence) + "\": " + str3;
                }
                throw new IllegalInstantException(str3);
            }
        }
        return j;
    }

    public final nd7 c() {
        nd7[] nd7VarArr = this.f;
        int i = this.g;
        if (i == nd7VarArr.length || this.h) {
            nd7[] nd7VarArr2 = new nd7[i == nd7VarArr.length ? i * 2 : nd7VarArr.length];
            System.arraycopy(nd7VarArr, 0, nd7VarArr2, 0, i);
            this.f = nd7VarArr2;
            this.h = false;
            nd7VarArr = nd7VarArr2;
        }
        this.i = null;
        nd7 nd7Var = nd7VarArr[i];
        if (nd7Var == null) {
            nd7Var = new nd7();
            nd7VarArr[i] = nd7Var;
        }
        this.g = i + 1;
        return nd7Var;
    }

    public final void d(Object obj) {
        if (obj instanceof od7) {
            od7 od7Var = (od7) obj;
            if (this != od7Var.e) {
                return;
            }
            this.d = od7Var.a;
            this.e = od7Var.b;
            this.f = od7Var.c;
            int i = od7Var.d;
            if (i < this.g) {
                this.h = true;
            }
            this.g = i;
            this.i = od7Var;
        }
    }
}
