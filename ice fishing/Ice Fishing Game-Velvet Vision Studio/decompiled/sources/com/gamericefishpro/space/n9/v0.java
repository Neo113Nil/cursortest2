package com.gamericefishpro.space.n9;

import android.text.TextUtils;
import android.util.Log;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class v0 extends z1 {
    public final t0 A;
    public final t0 B;
    public final t0 C;
    public final t0 D;
    public final t0 E;
    public final t0 F;
    public final t0 G;
    public char i;
    public long v;
    public String w;
    public final t0 y;
    public final t0 z;

    public v0(r1 r1Var) {
        super(r1Var);
        this.i = (char) 0;
        this.v = -1L;
        this.y = new t0(this, 6, false, false);
        this.z = new t0(this, 6, true, false);
        this.A = new t0(this, 6, false, true);
        this.B = new t0(this, 5, false, false);
        this.C = new t0(this, 5, true, false);
        this.D = new t0(this, 5, false, true);
        this.E = new t0(this, 4, false, false);
        this.F = new t0(this, 3, false, false);
        this.G = new t0(this, 2, false, false);
    }

    public static String C(boolean z, String str, Object obj, Object obj2, Object obj3) {
        String strD = D(obj, z);
        String strD2 = D(obj2, z);
        String strD3 = D(obj3, z);
        StringBuilder sb = new StringBuilder();
        String str2 = "";
        if (str == null) {
            str = "";
        }
        if (!TextUtils.isEmpty(str)) {
            sb.append(str);
            str2 = ": ";
        }
        String str3 = ", ";
        if (!TextUtils.isEmpty(strD)) {
            sb.append(str2);
            sb.append(strD);
            str2 = ", ";
        }
        if (TextUtils.isEmpty(strD2)) {
            str3 = str2;
        } else {
            sb.append(str2);
            sb.append(strD2);
        }
        if (!TextUtils.isEmpty(strD3)) {
            sb.append(str3);
            sb.append(strD3);
        }
        return sb.toString();
    }

    public static String D(Object obj, boolean z) {
        int iLastIndexOf;
        String className;
        int iLastIndexOf2;
        if (obj == null) {
            return "";
        }
        if (obj instanceof Integer) {
            obj = Long.valueOf(((Integer) obj).intValue());
        }
        if (obj instanceof Long) {
            if (!z) {
                return obj.toString();
            }
            Long l = (Long) obj;
            if (Math.abs(l.longValue()) < 100) {
                return obj.toString();
            }
            char cCharAt = obj.toString().charAt(0);
            String strValueOf = String.valueOf(Math.abs(l.longValue()));
            long jRound = Math.round(Math.pow(10.0d, strValueOf.length() - 1));
            long jRound2 = Math.round(Math.pow(10.0d, strValueOf.length()) - 1.0d);
            int length = String.valueOf(jRound).length();
            String str = cCharAt == '-' ? "-" : "";
            StringBuilder sb = new StringBuilder(str.length() + str.length() + length + 3 + String.valueOf(jRound2).length());
            sb.append(str);
            sb.append(jRound);
            sb.append("...");
            sb.append(str);
            sb.append(jRound2);
            return sb.toString();
        }
        if (obj instanceof Boolean) {
            return obj.toString();
        }
        if (!(obj instanceof Throwable)) {
            if (obj instanceof u0) {
                return ((u0) obj).a;
            }
            return z ? "-" : obj.toString();
        }
        Throwable th = (Throwable) obj;
        StringBuilder sb2 = new StringBuilder(z ? th.getClass().getName() : th.toString());
        String canonicalName = r1.class.getCanonicalName();
        String strSubstring = (TextUtils.isEmpty(canonicalName) || (iLastIndexOf = canonicalName.lastIndexOf(46)) == -1) ? "" : canonicalName.substring(0, iLastIndexOf);
        for (StackTraceElement stackTraceElement : th.getStackTrace()) {
            if (!stackTraceElement.isNativeMethod() && (className = stackTraceElement.getClassName()) != null) {
                if (((TextUtils.isEmpty(className) || (iLastIndexOf2 = className.lastIndexOf(46)) == -1) ? "" : className.substring(0, iLastIndexOf2)).equals(strSubstring)) {
                    sb2.append(": ");
                    sb2.append(stackTraceElement);
                    break;
                }
            }
        }
        return sb2.toString();
    }

    public static u0 z(String str) {
        if (str == null) {
            return null;
        }
        return new u0(str);
    }

    public final void A(int i, boolean z, boolean z2, String str, Object obj, Object obj2, Object obj3) {
        if (!z && Log.isLoggable(B(), i)) {
            Log.println(i, B(), C(false, str, obj, obj2, obj3));
        }
        if (z2 || i < 5) {
            return;
        }
        com.gamericefishpro.space.v8.c0.g(str);
        p1 p1Var = ((r1) this.d).z;
        if (p1Var == null) {
            Log.println(6, B(), "Scheduler not set. Not logging error/warn");
        } else {
            if (!p1Var.e) {
                Log.println(6, B(), "Scheduler not initialized. Not logging error/warn");
                return;
            }
            if (i >= 9) {
                i = 8;
            }
            p1Var.A(new s0(this, i, str, obj, obj2, obj3));
        }
    }

    public final String B() {
        String str;
        synchronized (this) {
            try {
                if (this.w == null) {
                    ((r1) ((r1) this.d).v.d).getClass();
                    this.w = "FA";
                }
                com.gamericefishpro.space.v8.c0.g(this.w);
                str = this.w;
            } catch (Throwable th) {
                throw th;
            }
        }
        return str;
    }

    @Override // com.gamericefishpro.space.n9.z1
    public final boolean s() {
        return false;
    }

    public final t0 v() {
        return this.y;
    }

    public final t0 w() {
        return this.B;
    }

    public final t0 x() {
        return this.F;
    }

    public final t0 y() {
        return this.G;
    }
}
