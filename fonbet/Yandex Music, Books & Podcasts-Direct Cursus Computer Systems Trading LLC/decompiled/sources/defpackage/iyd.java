package defpackage;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicIntegerArray;
import java.util.concurrent.atomic.AtomicLong;
import kotlin.text.Charsets;

/* loaded from: classes5.dex */
public class iyd extends lyd {
    public final boo b;
    public final boo c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public iyd(String str, di3 di3Var) {
        super(str);
        str.getClass();
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            byte[] bytes = str.getBytes(Charsets.UTF_8);
            bytes.getClass();
            boo booVar = new boo(ByteBuffer.wrap(messageDigest.digest(bytes)).order(ByteOrder.BIG_ENDIAN).getLong(), di3Var);
            this.b = booVar;
            this.c = new boo(booVar.a.a, di3Var);
        } catch (NoSuchAlgorithmException e) {
            wvs.m(e);
            throw null;
        }
    }

    @Override // defpackage.lyd
    public final void a(int i, int i2) {
        int i3;
        int i4;
        boo booVar = this.b;
        di3 di3Var = booVar.b;
        int i5 = di3Var.a[0];
        int a = di3Var.a();
        di3 di3Var2 = booVar.b;
        int i6 = di3Var2.a[a];
        if (i > 2147483646) {
            i = 2147483646;
        }
        if (i < 0) {
            i = 0;
        }
        if (i2 <= 0) {
            return;
        }
        int g = booVar.g(i);
        if (booVar.f() == null) {
            int[] iArr = di3Var2.a;
            int i7 = iArr.length < 2 ? Integer.MAX_VALUE : iArr[iArr.length - 2];
            AtomicInteger atomicInteger = (AtomicInteger) booVar.a.e;
            atomicInteger.getClass();
            if (men.q(atomicInteger, g, i2)) {
                int i8 = i < i7 ? i : 0;
                long j = i2;
                booVar.d(i2, i * j, j * i8);
                if (booVar.f() != null) {
                    booVar.i();
                    return;
                }
                return;
            }
            i3 = i2;
            i4 = g;
            booVar.h();
        } else {
            i3 = i2;
            i4 = g;
        }
        AtomicIntegerArray f = booVar.f();
        f.getClass();
        f.addAndGet(i4, i3);
        int[] iArr2 = di3Var2.a;
        long j2 = i3;
        booVar.d(i3, i * j2, j2 * (i < (iArr2.length >= 2 ? iArr2[iArr2.length - 2] : Integer.MAX_VALUE) ? i : 0));
    }

    @Override // defpackage.lyd
    public final void b(int i) {
        a(i, 1);
    }

    @Override // defpackage.lyd
    public final int d(wyd wydVar) {
        wydVar.getClass();
        boo booVar = this.b;
        int a = booVar.b.a();
        int i = 0;
        int i2 = -1;
        int i3 = 0;
        while (i < a) {
            int i4 = booVar.b.a[i];
            if (i2 >= i4) {
                i3 = 2;
            }
            i++;
            i2 = i4;
        }
        di3 di3Var = booVar.b;
        if (di3Var.b != di3Var.b()) {
            i3 |= 1;
        }
        long c = ((AtomicInteger) wydVar.a.d).get() - wydVar.c();
        if (c != 0) {
            int i5 = (int) c;
            if (i5 != c) {
                i5 = Integer.MAX_VALUE;
            }
            if (i5 > 0) {
                if (i5 > 5) {
                    return i3 | 4;
                }
            } else if ((-i5) > 5) {
                return i3 | 8;
            }
        }
        return i3;
    }

    @Override // defpackage.lyd
    public final boolean e(int i, int i2, int i3) {
        boo booVar = this.b;
        if (i3 != booVar.b.a()) {
            return false;
        }
        di3 di3Var = booVar.b;
        if (i != (di3Var.a() < 2 ? -1 : di3Var.a[1])) {
            return false;
        }
        di3 di3Var2 = booVar.b;
        return i2 == (di3Var2.a() >= 2 ? di3Var2.a[di3Var2.a() - 1] : -1);
    }

    @Override // defpackage.lyd
    public final long f() {
        return this.b.a.a;
    }

    @Override // defpackage.lyd
    public final wyd g() {
        boo booVar = this.b;
        wyd booVar2 = new boo(booVar.a.a, booVar.b);
        booVar2.a(booVar);
        m78 m78Var = booVar2.a;
        booVar.d(-((AtomicInteger) m78Var.d).get(), -((AtomicLong) m78Var.b).get(), -((AtomicLong) m78Var.c).get());
        booVar.b(booVar2.e(), 1);
        this.c.a(booVar2);
        return booVar2;
    }
}
