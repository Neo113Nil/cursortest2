package com.google.android.gms.internal.ads;

import android.media.AudioDescriptor;
import android.os.Build;
import java.math.BigDecimal;
import java.nio.charset.StandardCharsets;
import java.security.NoSuchAlgorithmException;
import java.security.spec.ECParameterSpec;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.Future;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/* loaded from: classes2.dex */
public abstract class QC {
    public static int a(int i) {
        int i4 = 0;
        while (i > 0) {
            i >>>= 1;
            i4++;
        }
        return i4;
    }

    public static RB b(List list) {
        int standard;
        byte[] descriptor;
        if (Build.VERSION.SDK_INT < 31 || list == null) {
            PB pb = RB.f27933u;
            return C3523lC.f32525x;
        }
        TreeSet treeSet = new TreeSet(Comparator.comparing(NO.f27270b).reversed());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AudioDescriptor e9 = GO.e(it.next());
            standard = e9.getStandard();
            if (standard == 1) {
                descriptor = e9.getDescriptor();
                int length = descriptor.length;
                if (length != 3) {
                    com.IceFishing.LiveIceFishing.k.t(length, "Invalid SAD length: ", "AudioDescriptorUtil", new StringBuilder(String.valueOf(length).length() + 20));
                } else {
                    byte b9 = descriptor[0];
                    int i = (b9 & 7) + 1;
                    if (((b9 >> 3) & 15) == 1) {
                        treeSet.add(Integer.valueOf(AbstractC3182eu.e(i)));
                    }
                }
            }
        }
        return RB.n(treeSet);
    }

    public static ND c(Object obj) {
        return obj == null ? ND.f27257u : new ND(obj);
    }

    public static BigDecimal d(String str) {
        l(str);
        BigDecimal bigDecimal = new BigDecimal(str);
        if (Math.abs(bigDecimal.scale()) < 10000) {
            return bigDecimal;
        }
        throw new NumberFormatException("Number has unsupported scale: ".concat(str));
    }

    public static void e(String str, long j6) {
        if (j6 >= 0) {
            return;
        }
        StringBuilder sb = new StringBuilder(String.valueOf(j6).length() + 17);
        sb.append(str);
        sb.append(" (");
        sb.append(j6);
        sb.append(") must be >= 0");
        throw new IllegalArgumentException(sb.toString());
    }

    public static void f(long[] jArr, long[] jArr2, int i) {
        for (int i4 = 0; i4 < 10; i4++) {
            int i6 = (int) jArr[i4];
            jArr[i4] = ((-i) & (((int) jArr2[i4]) ^ i6)) ^ i6;
        }
    }

    public static int g(String str) {
        int length = str.length();
        int i = 0;
        int i4 = 0;
        while (i4 < length && str.charAt(i4) < 128) {
            i4++;
        }
        int i6 = length;
        while (true) {
            if (i4 >= length) {
                break;
            }
            char charAt = str.charAt(i4);
            if (charAt < 2048) {
                i6 += (127 - charAt) >>> 31;
                i4++;
            } else {
                try {
                    int i9 = RL.f27953a;
                    int length2 = str.length();
                    while (i4 < length2) {
                        char charAt2 = str.charAt(i4);
                        if (charAt2 < 2048) {
                            i += (127 - charAt2) >>> 31;
                        } else {
                            i += 2;
                            if (charAt2 >= 55296 && charAt2 <= 57343) {
                                if (Character.codePointAt(str, i4) < 65536) {
                                    StringBuilder sb = new StringBuilder(String.valueOf(i4).length() + 32 + String.valueOf(length2).length());
                                    sb.append("Unpaired surrogate at index ");
                                    sb.append(i4);
                                    sb.append(" of ");
                                    sb.append(length2);
                                    throw new QL(sb.toString());
                                }
                                i4++;
                            }
                        }
                        i4++;
                    }
                    i6 += i;
                } catch (QL unused) {
                    return str.getBytes(StandardCharsets.UTF_8).length;
                }
            }
        }
        if (i6 >= length) {
            return i6;
        }
        long j6 = i6 + 4294967296L;
        StringBuilder sb2 = new StringBuilder(String.valueOf(j6).length() + 34);
        sb2.append("UTF-8 length does not fit in int: ");
        sb2.append(j6);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static C4201xq h(Cr cr, boolean z6, boolean z9) {
        if (z6) {
            m(3, cr, false);
        }
        cr.k((int) cr.a(), StandardCharsets.UTF_8);
        long a9 = cr.a();
        String[] strArr = new String[(int) a9];
        for (int i = 0; i < a9; i++) {
            strArr[i] = cr.k((int) cr.a(), StandardCharsets.UTF_8);
        }
        if (z9 && (cr.K() & 1) == 0) {
            throw U4.a(null, "framing bit expected to be set");
        }
        return new C4201xq(13, strArr);
    }

    public static ECParameterSpec i(SJ sj) {
        int ordinal = sj.ordinal();
        if (ordinal == 0) {
            return MF.f27065a;
        }
        if (ordinal == 1) {
            return MF.f27066b;
        }
        if (ordinal == 2) {
            return MF.f27067c;
        }
        throw new NoSuchAlgorithmException("curve not implemented:".concat(sj.toString()));
    }

    public static void j(boolean z6) {
        if (!z6) {
            throw new ArithmeticException("mode was UNNECESSARY, but rounding was necessary");
        }
    }

    public static MD k(Throwable th) {
        th.getClass();
        MD md = new MD();
        md.e(th);
        return md;
    }

    public static void l(String str) {
        if (str.length() <= 10000) {
            return;
        }
        String substring = str.substring(0, 30);
        throw new NumberFormatException(D.x.p(new StringBuilder(String.valueOf(substring).length() + 28), "Number string too large: ", substring, "..."));
    }

    public static boolean m(int i, Cr cr, boolean z6) {
        if (cr.B() < 7) {
            if (z6) {
                return false;
            }
            int B3 = cr.B();
            StringBuilder sb = new StringBuilder(String.valueOf(B3).length() + 18);
            sb.append("too short header: ");
            sb.append(B3);
            throw U4.a(null, sb.toString());
        }
        if (cr.K() != i) {
            if (z6) {
                return false;
            }
            throw U4.a(null, "expected header type ".concat(String.valueOf(Integer.toHexString(i))));
        }
        if (cr.K() == 118 && cr.K() == 111 && cr.K() == 114 && cr.K() == 98 && cr.K() == 105 && cr.K() == 115) {
            return true;
        }
        if (z6) {
            return false;
        }
        throw U4.a(null, "expected characters 'vorbis'");
    }

    public static byte[] n(byte[] bArr) {
        int length;
        int i = 0;
        while (true) {
            length = bArr.length;
            if (i >= length || bArr[i] != 0) {
                break;
            }
            i++;
        }
        if (i == length) {
            i = length - 1;
        }
        int i4 = (bArr[i] & com.anythink.core.common.s.a.c.f17103a) == 128 ? 1 : 0;
        int i6 = length - i;
        byte[] bArr2 = new byte[i6 + i4];
        System.arraycopy(bArr, i, bArr2, i4, i6);
        return bArr2;
    }

    public static RunnableFutureC2989bE o(Callable callable, Executor executor) {
        RunnableFutureC2989bE runnableFutureC2989bE = new RunnableFutureC2989bE(callable);
        executor.execute(runnableFutureC2989bE);
        return runnableFutureC2989bE;
    }

    public static RunnableFutureC2989bE p(AD ad, RD rd) {
        RunnableFutureC2989bE runnableFutureC2989bE = new RunnableFutureC2989bE();
        runnableFutureC2989bE.f30035A = new C2935aE(runnableFutureC2989bE, ad);
        rd.execute(runnableFutureC2989bE);
        return runnableFutureC2989bE;
    }

    public static YC q(P3.a aVar, Class cls, UA ua, Executor executor) {
        int i = ZC.f29631D;
        YC yc = new YC(aVar, cls, ua);
        aVar.a(yc, UC.k(executor, yc));
        return yc;
    }

    public static XC r(P3.a aVar, Class cls, BD bd, Executor executor) {
        int i = ZC.f29631D;
        XC xc = new XC(aVar, cls, bd);
        aVar.a(xc, UC.k(executor, xc));
        return xc;
    }

    public static P3.a s(P3.a aVar, long j6, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (aVar.isDone()) {
            return aVar;
        }
        ZD zd = new ZD();
        zd.f29635A = aVar;
        RunnableC3830qw runnableC3830qw = new RunnableC3830qw();
        runnableC3830qw.f34209u = zd;
        zd.f29636B = scheduledExecutorService.schedule(runnableC3830qw, j6, timeUnit);
        aVar.a(runnableC3830qw, GD.f25742n);
        return zd;
    }

    public static C3901sD t(P3.a aVar, BD bd, Executor executor) {
        int i = AbstractRunnableC4009uD.f35280C;
        C3901sD c3901sD = new C3901sD(aVar, bd);
        aVar.a(c3901sD, UC.k(executor, c3901sD));
        return c3901sD;
    }

    public static C3955tD u(P3.a aVar, UA ua, Executor executor) {
        int i = AbstractRunnableC4009uD.f35280C;
        C3955tD c3955tD = new C3955tD(aVar, ua);
        aVar.a(c3955tD, UC.k(executor, c3955tD));
        return c3955tD;
    }

    public static Object v(Future future) {
        if (future.isDone()) {
            return C2944aN.e(future);
        }
        throw new IllegalStateException(AbstractC2659Kg.x("Future was expected to be done: %s", future));
    }

    public static Object w(C3490kg c3490kg) {
        try {
            return C2944aN.e(c3490kg);
        } catch (ExecutionException e9) {
            if (e9.getCause() instanceof Error) {
                throw new H7.a((Error) e9.getCause());
            }
            throw new B0.c(e9.getCause());
        }
    }
}
