package com.anythink.core.common.v;

import com.anythink.core.api.ATAdConst;
import com.anythink.core.common.d.j;

/* loaded from: classes.dex */
public class t {

    /* renamed from: a, reason: collision with root package name */
    private static final String f17672a = "t";

    /* renamed from: b, reason: collision with root package name */
    private static double f17673b;

    /* renamed from: c, reason: collision with root package name */
    private static double f17674c;

    /* renamed from: com.anythink.core.common.v.t$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {

        /* renamed from: a, reason: collision with root package name */
        static final /* synthetic */ int[] f17675a;

        static {
            int[] iArr = new int[ATAdConst.CURRENCY.values().length];
            f17675a = iArr;
            try {
                iArr[ATAdConst.CURRENCY.RMB.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                f17675a[ATAdConst.CURRENCY.RMB_CENT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                f17675a[ATAdConst.CURRENCY.USD.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public static double a() {
        return f17674c;
    }

    public static double b() {
        return f17673b;
    }

    public static void a(double d9) {
        f17673b = d9;
        if (d9 > 0.0d) {
            f17674c = 1.0d / d9;
        }
    }

    public static ATAdConst.CURRENCY a(String str) {
        if (j.C0076j.f13272b.equalsIgnoreCase(str)) {
            return ATAdConst.CURRENCY.RMB;
        }
        if (j.C0076j.f13271a.equalsIgnoreCase(str)) {
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
    public static double a(double d9, ATAdConst.CURRENCY currency, ATAdConst.CURRENCY currency2) {
        double d10;
        if (d9 <= 0.0d || currency2 == null || currency == null) {
            return d9;
        }
        try {
            int i = AnonymousClass1.f17675a[currency.ordinal()];
            if (i != 1) {
                if (i != 2) {
                    if (currency2 == ATAdConst.CURRENCY.RMB) {
                        d10 = f17674c;
                        return d9 * d10;
                    }
                    if (currency2 == ATAdConst.CURRENCY.RMB_CENT) {
                        d9 *= f17674c;
                        return d9 * 100.0d;
                    }
                } else {
                    if (currency2 == ATAdConst.CURRENCY.USD) {
                        return f17673b * (d9 / 100.0d);
                    }
                    if (currency2 == ATAdConst.CURRENCY.RMB) {
                        return d9 / 100.0d;
                    }
                }
                return d9 * 1.0d;
            }
            if (currency2 == ATAdConst.CURRENCY.USD) {
                d10 = f17673b;
                return d9 * d10;
            }
        } catch (Throwable th) {
            th.getMessage();
            return d9;
        }
    }
}
