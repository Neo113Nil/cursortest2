package com.bumptech.glide;

import D.y;
import O.g0;
import Q7.q;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import android.view.View;
import android.view.Window;
import com.google.android.gms.internal.ads.AbstractC3413jg;
import com.google.android.gms.internal.ads.AbstractC3569ma;
import com.google.android.gms.internal.ads.C3052cu;
import com.google.android.gms.internal.ads.C3315ho;
import i8.s;
import java.io.Closeable;
import java.net.ProtocolException;
import java.util.List;
import q2.O;
import q2.c1;
import q2.r;
import u7.C5090h;
import v7.AbstractC5124e;

/* loaded from: classes.dex */
public abstract class d implements U.j {
    public static final boolean a(Object[] objArr, int i, int i6, List list) {
        if (i6 == list.size()) {
            for (int i9 = 0; i9 < i6; i9++) {
                if (kotlin.jvm.internal.h.a(objArr[i + i9], list.get(i9))) {
                }
            }
            return true;
        }
        return false;
    }

    public static final String b(Object[] objArr, int i, int i6, AbstractC5124e abstractC5124e) {
        StringBuilder sb = new StringBuilder((i6 * 3) + 2);
        sb.append("[");
        for (int i9 = 0; i9 < i6; i9++) {
            if (i9 > 0) {
                sb.append(", ");
            }
            Object obj = objArr[i + i9];
            if (obj == abstractC5124e) {
                sb.append("(this Collection)");
            } else {
                sb.append(obj);
            }
        }
        sb.append("]");
        String sb2 = sb.toString();
        kotlin.jvm.internal.h.d(sb2, "toString(...)");
        return sb2;
    }

    public static final void c(Closeable closeable, Throwable th) {
        if (closeable != null) {
            if (th == null) {
                closeable.close();
                return;
            }
            try {
                closeable.close();
            } catch (Throwable th2) {
                X2.e.y(th, th2);
            }
        }
    }

    public static final double d(double d2, R7.c cVar, R7.c targetUnit) {
        kotlin.jvm.internal.h.e(targetUnit, "targetUnit");
        long convert = targetUnit.f2770n.convert(1L, cVar.f2770n);
        return convert > 0 ? d2 * convert : d2 / r8.convert(1L, r9);
    }

    public static final long e(long j6, R7.c sourceUnit, R7.c targetUnit) {
        kotlin.jvm.internal.h.e(sourceUnit, "sourceUnit");
        kotlin.jvm.internal.h.e(targetUnit, "targetUnit");
        return targetUnit.f2770n.convert(j6, sourceUnit.f2770n);
    }

    public static final C5090h f(Throwable exception) {
        kotlin.jvm.internal.h.e(exception, "exception");
        return new C5090h(exception);
    }

    public static SharedPreferences g(Context context) {
        Context applicationContext = context.getApplicationContext();
        if (applicationContext != null) {
            context = applicationContext;
        }
        return context.getSharedPreferences("com.google.firebase.messaging", 0);
    }

    public static F.d h(String statusLine) {
        s sVar;
        int i;
        String str;
        kotlin.jvm.internal.h.e(statusLine, "statusLine");
        if (q.R(statusLine, "HTTP/1.")) {
            i = 9;
            if (statusLine.length() < 9 || statusLine.charAt(8) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
            int charAt = statusLine.charAt(7) - '0';
            if (charAt == 0) {
                sVar = s.f38224v;
            } else {
                if (charAt != 1) {
                    throw new ProtocolException("Unexpected status line: ".concat(statusLine));
                }
                sVar = s.f38225w;
            }
        } else if (q.R(statusLine, "ICY ")) {
            sVar = s.f38224v;
            i = 4;
        } else {
            if (!q.R(statusLine, "SOURCETABLE ")) {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
            sVar = s.f38225w;
            i = 12;
        }
        int i6 = i + 3;
        if (statusLine.length() < i6) {
            throw new ProtocolException("Unexpected status line: ".concat(statusLine));
        }
        String substring = statusLine.substring(i, i6);
        kotlin.jvm.internal.h.d(substring, "substring(...)");
        Integer S8 = q.S(substring);
        if (S8 == null) {
            throw new ProtocolException("Unexpected status line: ".concat(statusLine));
        }
        int intValue = S8.intValue();
        if (statusLine.length() <= i6) {
            str = "";
        } else {
            if (statusLine.charAt(i6) != ' ') {
                throw new ProtocolException("Unexpected status line: ".concat(statusLine));
            }
            str = statusLine.substring(i + 4);
            kotlin.jvm.internal.h.d(str, "substring(...)");
        }
        return new F.d(sVar, intValue, str);
    }

    public static final void i(Object[] objArr, int i, int i6) {
        kotlin.jvm.internal.h.e(objArr, "<this>");
        while (i < i6) {
            objArr[i] = null;
            i++;
        }
    }

    public static void j(Window window, boolean z3) {
        if (Build.VERSION.SDK_INT >= 30) {
            g0.a(window, z3);
            return;
        }
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z3 ? systemUiVisibility & (-1793) : systemUiVisibility | 1792);
    }

    public static final void k(Object obj) {
        if (obj instanceof C5090h) {
            throw ((C5090h) obj).f41331n;
        }
    }

    public static void l(Object[] objArr, int i) {
        for (int i6 = 0; i6 < i; i6++) {
            if (objArr[i6] == null) {
                throw new NullPointerException(y.m(i6, "at index ", new StringBuilder(String.valueOf(i6).length() + 9)));
            }
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static String m(String str) {
        char c9;
        if (TextUtils.isEmpty(str)) {
            return "unspecified";
        }
        switch (str.hashCode()) {
            case 1743582862:
                if (str.equals("requester_type_0")) {
                    c9 = 0;
                    break;
                }
                c9 = 65535;
                break;
            case 1743582863:
                if (str.equals("requester_type_1")) {
                    c9 = 1;
                    break;
                }
                c9 = 65535;
                break;
            case 1743582864:
                if (str.equals("requester_type_2")) {
                    c9 = 2;
                    break;
                }
                c9 = 65535;
                break;
            case 1743582865:
                if (str.equals("requester_type_3")) {
                    c9 = 3;
                    break;
                }
                c9 = 65535;
                break;
            case 1743582866:
                if (str.equals("requester_type_4")) {
                    c9 = 4;
                    break;
                }
                c9 = 65535;
                break;
            case 1743582867:
                if (str.equals("requester_type_5")) {
                    c9 = 5;
                    break;
                }
                c9 = 65535;
                break;
            case 1743582868:
                if (str.equals("requester_type_6")) {
                    c9 = 6;
                    break;
                }
                c9 = 65535;
                break;
            case 1743582869:
                if (str.equals("requester_type_7")) {
                    c9 = 7;
                    break;
                }
                c9 = 65535;
                break;
            case 1743582870:
                if (str.equals("requester_type_8")) {
                    c9 = '\b';
                    break;
                }
                c9 = 65535;
                break;
            default:
                c9 = 65535;
                break;
        }
        switch (c9) {
            case 0:
                return "0";
            case 1:
                return "1";
            case 2:
                return "2";
            case 3:
                return "3";
            case 4:
                return "4";
            case 5:
                return "5";
            case 6:
                return "6";
            case 7:
                return "7";
            case '\b':
                return "8";
            default:
                return str;
        }
    }

    public static String n(c1 c1Var) {
        Bundle bundle;
        return (c1Var == null || (bundle = c1Var.f40117v) == null) ? "unspecified" : bundle.getString("query_info_type");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static int o(Bundle bundle) {
        char c9;
        Bundle bundle2 = bundle.getBundle("com.google.ads.mediation.admob.AdMobAdapter");
        if (bundle2 != null) {
            bundle = bundle2;
        }
        String string = bundle.getString("query_info_type");
        if (!TextUtils.isEmpty(string)) {
            switch (string.hashCode()) {
                case 1743582862:
                    if (string.equals("requester_type_0")) {
                        c9 = 0;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 1743582863:
                    if (string.equals("requester_type_1")) {
                        c9 = 1;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 1743582864:
                    if (string.equals("requester_type_2")) {
                        c9 = 2;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 1743582865:
                    if (string.equals("requester_type_3")) {
                        c9 = 3;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 1743582866:
                    if (string.equals("requester_type_4")) {
                        c9 = 4;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 1743582867:
                    if (string.equals("requester_type_5")) {
                        c9 = 5;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 1743582868:
                    if (string.equals("requester_type_6")) {
                        c9 = 6;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 1743582869:
                    if (string.equals("requester_type_7")) {
                        c9 = 7;
                        break;
                    }
                    c9 = 65535;
                    break;
                case 1743582870:
                    if (string.equals("requester_type_8")) {
                        c9 = '\b';
                        break;
                    }
                    c9 = 65535;
                    break;
                default:
                    c9 = 65535;
                    break;
            }
            switch (c9) {
                case 0:
                    return 1;
                case 1:
                    return 3;
                case 2:
                    return 4;
                case 3:
                    return 5;
                case 4:
                    return 6;
                case 5:
                    return 7;
                case 6:
                    return 8;
                case 7:
                    return 9;
                case '\b':
                    return 10;
            }
        }
        return 2;
    }

    public static void p(C3315ho c3315ho, String str, Pair... pairArr) {
        if (((Boolean) r.f40204e.f40207c.a(AbstractC3569ma.f32113Q7)).booleanValue()) {
            AbstractC3413jg.f31268a.execute(new C2.y(2, c3315ho, str, pairArr));
        }
    }

    public static int q(C3052cu c3052cu) {
        if (c3052cu.f29637s) {
            return 2;
        }
        c1 c1Var = c3052cu.f29623d;
        O o6 = c1Var.f40104L;
        String str = c1Var.f40109Q;
        if (o6 == null && str == null) {
            return 1;
        }
        if (o6 == null || str == null) {
            return o6 != null ? 3 : 4;
        }
        return 5;
    }
}
