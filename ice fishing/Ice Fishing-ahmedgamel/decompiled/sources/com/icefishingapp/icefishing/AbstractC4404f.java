package com.icefishingapp.icefishing;

import android.os.Parcel;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

/* renamed from: com.icefishingapp.icefishing.f, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract /* synthetic */ class AbstractC4404f {
    public static float a(float f3, float f9, float f10, float f11) {
        return ((f3 - f9) * f10) + f11;
    }

    public static int b(int i, int i6) {
        return String.valueOf(i).length() + i6;
    }

    public static W2.a c(Parcel parcel) {
        W2.a w02 = W2.b.w0(parcel.readStrongBinder());
        parcel.recycle();
        return w02;
    }

    public static com.bumptech.glide.p d(com.bumptech.glide.n nVar, ImageView imageView, MainActivity mainActivity) {
        nVar.E(imageView);
        return com.bumptech.glide.c.c(mainActivity.getApplicationContext());
    }

    public static String e(int i, String str) {
        return str + i;
    }

    public static String f(String str, String str2) {
        return str + str2;
    }

    public static String g(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static StringBuilder h(int i, int i6, String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(i6);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder i(int i, String str, String str2) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        return sb;
    }

    public static StringBuilder j(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(str2);
        sb.append(str3);
        return sb;
    }

    public static StringBuilder k(StringBuilder sb, String str, String str2, StringBuffer stringBuffer, String str3) {
        sb.append(str);
        sb.append(str2);
        stringBuffer.append(sb.toString());
        return new StringBuilder(str3);
    }

    public static /* synthetic */ void l(int i, String str) {
        if (i == 0) {
            StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
            String name = kotlin.jvm.internal.h.class.getName();
            int i6 = 0;
            while (!stackTrace[i6].getClassName().equals(name)) {
                i6++;
            }
            while (stackTrace[i6].getClassName().equals(name)) {
                i6++;
            }
            StackTraceElement stackTraceElement = stackTrace[i6];
            NullPointerException nullPointerException = new NullPointerException("Parameter specified as non-null is null: method " + stackTraceElement.getClassName() + com.anythink.core.common.d.j.f12378z + stackTraceElement.getMethodName() + ", parameter " + str);
            kotlin.jvm.internal.h.i(nullPointerException, kotlin.jvm.internal.h.class.getName());
            throw nullPointerException;
        }
    }

    public static void m(GzopArcadegamesActivity gzopArcadegamesActivity, int i, View view) {
        view.startAnimation(AnimationUtils.loadAnimation(gzopArcadegamesActivity.getApplicationContext(), i));
    }

    public static void n(GzopPuzzleLogicActivity gzopPuzzleLogicActivity, int i, View view) {
        view.startAnimation(AnimationUtils.loadAnimation(gzopPuzzleLogicActivity.getApplicationContext(), i));
    }

    public static void o(GzopSportsRacinggamesActivity gzopSportsRacinggamesActivity, int i, View view) {
        view.startAnimation(AnimationUtils.loadAnimation(gzopSportsRacinggamesActivity.getApplicationContext(), i));
    }

    public static void p(GzopStretegygamesActivity gzopStretegygamesActivity, int i, View view) {
        view.startAnimation(AnimationUtils.loadAnimation(gzopStretegygamesActivity.getApplicationContext(), i));
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
