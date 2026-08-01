package com.anythink.core.common.v;

import com.anythink.core.api.ATAdConst;
import com.anythink.core.common.d.j;

/* loaded from: classes.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    private static final String f16885a = "t";

    /* renamed from: b, reason: collision with root package name */
    private static double f16886b;

    /* renamed from: c, reason: collision with root package name */
    private static double f16887c;

    /* renamed from: com.anythink.core.common.v.t$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f16888a;

        static {
            int[] iArr = new int[ATAdConst.CURRENCY.values().length];
            f16888a = iArr;
            try {
                iArr[ATAdConst.CURRENCY.RMB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f16888a[ATAdConst.CURRENCY.RMB_CENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f16888a[ATAdConst.CURRENCY.USD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static double a() {
        return f16887c;
    }

    public static double b() {
        return f16886b;
    }

    public static void a(double d2) {
        f16886b = d2;
        if (d2 > 0.0d) {
            f16887c = 1.0d / d2;
        }
    }

    public static ATAdConst.CURRENCY a(String str) {
        if (j.C0076j.f12486b.equalsIgnoreCase(str)) {
            return ATAdConst.CURRENCY.RMB;
        }
        if (j.C0076j.f12485a.equalsIgnoreCase(str)) {
            return ATAdConst.CURRENCY.USD;
        }
        return ATAdConst.CURRENCY.RMB_CENT;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x004b, code lost:
    
        if (r8 == com.anythink.core.api.ATAdConst.CURRENCY.RMB_CENT) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static double a(double d2, ATAdConst.CURRENCY currency, ATAdConst.CURRENCY currency2) {
        double d9;
        if (d2 <= 0.0d || currency2 == null || currency == null) {
            return d2;
        }
        try {
            int i = AnonymousClass1.f16888a[currency.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (currency2 == ATAdConst.CURRENCY.RMB) {
                        d9 = f16887c;
                        return d2 * d9;
                    }
                    if (currency2 == ATAdConst.CURRENCY.RMB_CENT) {
                        d2 *= f16887c;
                        return d2 * 100.0d;
                    }
                } else {
                    if (currency2 == ATAdConst.CURRENCY.USD) {
                        return f16886b * (d2 / 100.0d);
                    }
                    if (currency2 == ATAdConst.CURRENCY.RMB) {
                        return d2 / 100.0d;
                    }
                }
                return d2 * 1.0d;
            }
            if (currency2 == ATAdConst.CURRENCY.USD) {
                d9 = f16886b;
                return d2 * d9;
            }
        } catch (Throwable th) {
            th.getMessage();
            return d2;
        }
    }
}
