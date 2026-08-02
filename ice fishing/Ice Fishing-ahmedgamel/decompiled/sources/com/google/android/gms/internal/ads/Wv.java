package com.google.android.gms.internal.ads;

import android.os.Parcel;
import com.google.android.gms.internal.consent_sdk.C4354i2;

/* loaded from: classes2.dex */
public abstract /* synthetic */ class Wv {
    public static float a(float f2, float f9, float f10, float f11) {
        return ((f2 - f9) * f10) + f11;
    }

    public static int b(int i, int i4) {
        return String.valueOf(i).length() + i4;
    }

    public static int c(int i, int i4, int i6) {
        return OK.S(i) + i4 + i6;
    }

    public static int d(int i, int i4, int i6, int i9) {
        return OK.S(i) + i4 + i6 + i9;
    }

    public static Y2.a e(Parcel parcel) {
        Y2.a t02 = Y2.b.t0(parcel.readStrongBinder());
        parcel.recycle();
        return t02;
    }

    public static String f(int i, String str) {
        return str + i;
    }

    public static String g(String str, String str2) {
        return str + str2;
    }

    public static String h(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String i(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static StringBuilder j(int i, int i4, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i4);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder k(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder l(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder m(StringBuilder sb, String str, String str2, StringBuffer stringBuffer, String str3) {
        sb.append(str);
        sb.append(str2);
        stringBuffer.append(sb.toString());
        return new StringBuilder(str3);
    }

    public static /* synthetic */ void n(int i, String str) {
        if (i == 0) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = kotlin.jvm.internal.h.class.getName();
            int i4 = 0;
            while (!stackTrace[i4].getClassName().equals(name)) {
                i4++;
            }
            while (stackTrace[i4].getClassName().equals(name)) {
                i4++;
            }
            StackTraceElement stackTraceElement = stackTrace[i4];
            NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + com.anythink.core.common.d.j.f13164z + stackTraceElement.getMethodName() + ", parameter " + str);
            kotlin.jvm.internal.h.i(nullPointerException, kotlin.jvm.internal.h.class.getName());
            throw nullPointerException;
        }
    }

    public static int o(int i, int i4, int i6) {
        return C4354i2.i(i) + i4 + i6;
    }

    public static int p(int i, int i4, int i6, int i9) {
        return C4354i2.i(i) + i4 + i6 + i9;
    }

    public static /* synthetic */ String q(int i) {
        switch (i) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            case 10:
                return "END_DOCUMENT";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String r(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "MEMORY_CACHE" : "RESOURCE_DISK_CACHE" : "DATA_DISK_CACHE" : "REMOTE" : "LOCAL";
    }
}
