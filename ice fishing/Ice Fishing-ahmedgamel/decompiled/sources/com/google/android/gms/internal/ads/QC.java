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
        int i6 = 0;
        while (i > 0) {
            i >>>= 1;
            i6++;
        }
        return i6;
    }

    public static RB b(List list) {
        int standard;
        byte[] descriptor;
        if (Build.VERSION.SDK_INT < 31 || list == null) {
            PB pb = RB.f27177u;
            return C3500lC.f31745x;
        }
        TreeSet treeSet = new TreeSet(Comparator.comparing(NO.f26486b).reversed());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AudioDescriptor e9 = GO.e(it.next());
            standard = e9.getStandard();
            if (standard == 1) {
                descriptor = e9.getDescriptor();
                int length = descriptor.length;
                if (length != 3) {
                    com.anythink.basead.exoplayer.f.f.q(length, "Invalid SAD length: ", "AudioDescriptorUtil", new StringBuilder(String.valueOf(length).length() + 20));
                } else {
                    byte b9 = descriptor[0];
                    int i = (b9 & 7) + 1;
                    if (((b9 >> 3) & 15) == 1) {
                        treeSet.add(Integer.valueOf(AbstractC3159eu.e(i)));
                    }
                }
            }
        }
        return RB.n(treeSet);
    }

    public static ND c(Object obj) {
        return obj == null ? ND.f26473u : new ND(obj);
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
        for (int i6 = 0; i6 < 10; i6++) {
            int i9 = (int) jArr[i6];
            jArr[i6] = ((-i) & (((int) jArr2[i6]) ^ i9)) ^ i9;
        }
    }

    public static int g(String str) {
        int length = str.length();
        int i = 0;
        int i6 = 0;
        while (i6 < length && str.charAt(i6) < 128) {
            i6++;
        }
        int i9 = length;
        while (true) {
            if (i6 >= length) {
                break;
            }
            char charAt = str.charAt(i6);
            if (charAt < 2048) {
                i9 += (127 - charAt) >>> 31;
                i6++;
            } else {
                try {
                    int i10 = RL.f27197a;
                    int length2 = str.length();
                    while (i6 < length2) {
                        char charAt2 = str.charAt(i6);
                        if (charAt2 < 2048) {
                            i += (127 - charAt2) >>> 31;
                        } else {
                            i += 2;
                            if (charAt2 >= 55296 && charAt2 <= 57343) {
                                if (Character.codePointAt(str, i6) < 65536) {
                                    StringBuilder sb = new StringBuilder(String.valueOf(i6).length() + 32 + String.valueOf(length2).length());
                                    sb.append("Unpaired surrogate at index ");
                                    sb.append(i6);
                                    sb.append(" of ");
                                    sb.append(length2);
                                    throw new QL(sb.toString());
                                }
                                i6++;
                            }
                        }
                        i6++;
                    }
                    i9 += i;
                } catch (QL unused) {
                    return str.getBytes(StandardCharsets.UTF_8).length;
                }
            }
        }
        if (i9 >= length) {
            return i9;
        }
        long j6 = i9 + 4294967296L;
        StringBuilder sb2 = new StringBuilder(String.valueOf(j6).length() + 34);
        sb2.append("UTF-8 length does not fit in int: ");
        sb2.append(j6);
        throw new IllegalArgumentException(sb2.toString());
    }

    public static C4178xq h(Cr cr, boolean z3, boolean z6) {
        if (z3) {
            m(3, cr, false);
        }
        cr.k((int) cr.a(), StandardCharsets.UTF_8);
        long a9 = cr.a();
        String[] strArr = new String[(int) a9];
        for (int i = 0; i < a9; i++) {
            strArr[i] = cr.k((int) cr.a(), StandardCharsets.UTF_8);
        }
        if (z6 && (cr.K() & 1) == 0) {
            throw U4.a(null, "framing bit expected to be set");
        }
        return new C4178xq(13, strArr);
    }

    public static ECParameterSpec i(SJ sj) {
        int ordinal = sj.ordinal();
        if (ordinal == 0) {
            return MF.f26274a;
        }
        if (ordinal == 1) {
            return MF.f26275b;
        }
        if (ordinal == 2) {
            return MF.f26276c;
        }
        throw new NoSuchAlgorithmException("curve not implemented:".concat(sj.toString()));
    }

    public static void j(boolean z3) {
        if (!z3) {
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
        throw new NumberFormatException(D.y.s(new StringBuilder(String.valueOf(substring).length() + 28), "Number string too large: ", substring, "..."));
    }

    public static boolean m(int i, Cr cr, boolean z3) {
        if (cr.B() < 7) {
            if (z3) {
                return false;
            }
            int B9 = cr.B();
            StringBuilder sb = new StringBuilder(String.valueOf(B9).length() + 18);
            sb.append("too short header: ");
            sb.append(B9);
            throw U4.a(null, sb.toString());
        }
        if (cr.K() != i) {
            if (z3) {
                return false;
            }
            throw U4.a(null, "expected header type ".concat(String.valueOf(Integer.toHexString(i))));
        }
        if (cr.K() == 118 && cr.K() == 111 && cr.K() == 114 && cr.K() == 98 && cr.K() == 105 && cr.K() == 115) {
            return true;
        }
        if (z3) {
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
        int i6 = (bArr[i] & com.anythink.core.common.s.a.c.f16316a) == 128 ? 1 : 0;
        int i9 = length - i;
        byte[] bArr2 = new byte[i9 + i6];
        System.arraycopy(bArr, i, bArr2, i6, i9);
        return bArr2;
    }

    public static RunnableFutureC2966bE o(Callable callable, Executor executor) {
        RunnableFutureC2966bE runnableFutureC2966bE = new RunnableFutureC2966bE(callable);
        executor.execute(runnableFutureC2966bE);
        return runnableFutureC2966bE;
    }

    public static RunnableFutureC2966bE p(AD ad, RD rd) {
        RunnableFutureC2966bE runnableFutureC2966bE = new RunnableFutureC2966bE();
        runnableFutureC2966bE.f29247A = new C2912aE(runnableFutureC2966bE, ad);
        rd.execute(runnableFutureC2966bE);
        return runnableFutureC2966bE;
    }

    public static YC q(N3.a aVar, Class cls, UA ua, Executor executor) {
        int i = ZC.f28851D;
        YC yc = new YC(aVar, cls, ua);
        aVar.a(yc, UC.k(executor, yc));
        return yc;
    }

    public static XC r(N3.a aVar, Class cls, BD bd, Executor executor) {
        int i = ZC.f28851D;
        XC xc = new XC(aVar, cls, bd);
        aVar.a(xc, UC.k(executor, xc));
        return xc;
    }

    public static N3.a s(N3.a aVar, long j6, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        if (aVar.isDone()) {
            return aVar;
        }
        ZD zd = new ZD();
        zd.f28855A = aVar;
        RunnableC3807qw runnableC3807qw = new RunnableC3807qw();
        runnableC3807qw.f33442u = zd;
        zd.f28856B = scheduledExecutorService.schedule(runnableC3807qw, j6, timeUnit);
        aVar.a(runnableC3807qw, GD.f24952n);
        return zd;
    }

    public static C3878sD t(N3.a aVar, BD bd, Executor executor) {
        int i = AbstractRunnableC3986uD.f34506C;
        C3878sD c3878sD = new C3878sD(aVar, bd);
        aVar.a(c3878sD, UC.k(executor, c3878sD));
        return c3878sD;
    }

    public static C3932tD u(N3.a aVar, UA ua, Executor executor) {
        int i = AbstractRunnableC3986uD.f34506C;
        C3932tD c3932tD = new C3932tD(aVar, ua);
        aVar.a(c3932tD, UC.k(executor, c3932tD));
        return c3932tD;
    }

    public static Object v(Future future) {
        if (future.isDone()) {
            return C2921aN.e(future);
        }
        throw new IllegalStateException(AbstractC2639Kg.x("Future was expected to be done: %s", future));
    }

    public static Object w(C3467kg c3467kg) {
        try {
            return C2921aN.e(c3467kg);
        } catch (ExecutionException e9) {
            if (e9.getCause() instanceof Error) {
                throw new H7.a((Error) e9.getCause());
            }
            throw new B0.c(e9.getCause());
        }
    }
}
