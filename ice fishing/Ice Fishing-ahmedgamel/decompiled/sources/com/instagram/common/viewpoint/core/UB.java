package com.instagram.common.viewpoint.core;

import android.content.SharedPreferences;
import android.os.Build;
import com.facebook.ads.internal.util.process.ProcessUtils;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicInteger;

/* loaded from: assets/audience_network/classes2.dex */
public final class UB {
    public static String A00;
    public static XT A01;
    public static byte[] A02;
    public static String[] A03 = {"voSC7", "XZAhka0CvCOYv4I2O5x3YaAw3CbuYBFN", "p9gqIJ2nr", "98tXqko6jTMLdbqfVFP5nvRcnbiOcAti", "T2H4NPeAA8j3XC4jkS0zz8rIAu9TBODq", "PgqQ", "DWYdqAxgZwpx5TFll0r56voildH8EXHj", "oGCSEutn0BLuvxJJ07JBH6t"};
    public static final Map<String, Integer> A04;
    public static final AtomicInteger A05;

    public static String A02(int i, int i4, int i6) {
        byte[] copyOfRange = Arrays.copyOfRange(A02, i, i + i4);
        int i9 = 0;
        while (true) {
            int length = copyOfRange.length;
            String[] strArr = A03;
            if (strArr[3].charAt(19) != strArr[6].charAt(19)) {
                throw new RuntimeException();
            }
            A03[1] = "U3LMWoXZ5NcjJWeamIlVlKUbevsxyVyN";
            if (i9 >= length) {
                return new String(copyOfRange);
            }
            copyOfRange[i9] = (byte) ((copyOfRange[i9] ^ i6) ^ 91);
            i9++;
        }
    }

    public static void A05() {
        A02 = new byte[]{115, 6, 1, 23};
    }

    static {
        A05();
        A00 = null;
        A05 = new AtomicInteger(0);
        A04 = new HashMap();
    }

    public static synchronized XT A00(T8 t82) {
        XT xt;
        synchronized (UB.class) {
            if (A01 == null) {
                A01 = XU.A00(t82);
            }
            xt = A01;
        }
        return xt;
    }

    public static Integer A01(String str) {
        synchronized (A04) {
            Integer num = A04.get(str);
            if (num == null) {
                return 0;
            }
            return num;
        }
    }

    public static void A06(T8 t82, String str, Map<String, String> params) {
        String str2;
        if (A0A(t82)) {
            str2 = C1357Wn.A03(str);
        } else {
            str2 = A00;
        }
        if (str2 != null) {
            String fingerprint = A02(1, 3, 28);
            params.put(fingerprint, str2);
        }
    }

    public static void A07(T8 t82, boolean z6) {
        if (!A05.compareAndSet(0, 1)) {
            return;
        }
        A00(t82);
        try {
            SharedPreferences A002 = WN.A00(t82);
            C1283To c1283To = new C1283To(t82);
            String str = Build.FINGERPRINT + A02(0, 1, 19) + c1283To.A06();
            A00 = A002.getString(str, null);
            FutureTask futureTask = new FutureTask(new UA(t82, c1283To, A002, str));
            Executors.newSingleThreadExecutor().submit(futureTask);
            if (z6) {
                futureTask.get();
            }
        } catch (Exception unused) {
            A05.set(0);
        }
    }

    public static void A08(T8 t82, boolean z6, String str) {
        if (A0A(t82)) {
            A09(t82, z6, str);
        } else {
            A07(t82, z6);
        }
    }

    public static void A09(T8 t82, boolean z6, String str) {
        if (str == null) {
            str = t82.getPackageName();
        }
        if (A0B(str)) {
            return;
        }
        A00(t82);
        C1357Wn c1357Wn = new C1357Wn(t82, str);
        try {
            c1357Wn.A06();
            FutureTask futureTask = new FutureTask(new U9(c1357Wn, str));
            Executors.newSingleThreadExecutor().submit(futureTask);
            if (z6) {
                futureTask.get();
            }
        } catch (Exception unused) {
            synchronized (A04) {
                A04.put(str, 0);
            }
        }
    }

    public static boolean A0A(T8 t82) {
        if (!ProcessUtils.isRemoteRenderingProcess()) {
            boolean A2t = C1310Up.A2t(t82);
            if (A03[4].charAt(29) == 'E') {
                throw new RuntimeException();
            }
            String[] strArr = A03;
            strArr[5] = "Hubg";
            strArr[0] = "jm3dJ";
            if (!A2t) {
                return false;
            }
        }
        return true;
    }

    public static boolean A0B(String str) {
        synchronized (A04) {
            int status = A01(str).intValue();
            if (status != 0) {
                return true;
            }
            A04.put(str, 1);
            return false;
        }
    }
}
