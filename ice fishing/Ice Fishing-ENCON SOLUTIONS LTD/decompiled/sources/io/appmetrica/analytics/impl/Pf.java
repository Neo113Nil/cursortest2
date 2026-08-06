package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import io.appmetrica.analytics.AppMetricaDefaultValues;
import java.util.Calendar;
import java.util.Collections;
import java.util.GregorianCalendar;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public abstract class Pf {

    /* renamed from: a, reason: collision with root package name */
    public static final Map f4929a;

    /* renamed from: b, reason: collision with root package name */
    public static final SparseArray f4930b;

    /* renamed from: c, reason: collision with root package name */
    public static final Map f4931c;

    /* renamed from: d, reason: collision with root package name */
    public static final Map f4932d;

    static {
        HashMap hashMap = new HashMap();
        Vk vk = Vk.FOREGROUND;
        hashMap.put(vk, 0);
        Vk vk2 = Vk.BACKGROUND;
        hashMap.put(vk2, 1);
        f4929a = Collections.unmodifiableMap(hashMap);
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, vk);
        sparseArray.put(1, vk2);
        f4930b = sparseArray;
        HashMap hashMap2 = new HashMap();
        EnumC0301bb enumC0301bb = EnumC0301bb.EVENT_TYPE_INIT;
        hashMap2.put(enumC0301bb, 1);
        EnumC0301bb enumC0301bb2 = EnumC0301bb.EVENT_TYPE_REGULAR;
        hashMap2.put(enumC0301bb2, 4);
        EnumC0301bb enumC0301bb3 = EnumC0301bb.EVENT_TYPE_SEND_REFERRER;
        hashMap2.put(enumC0301bb3, 5);
        EnumC0301bb enumC0301bb4 = EnumC0301bb.EVENT_TYPE_ALIVE;
        hashMap2.put(enumC0301bb4, 7);
        EnumC0301bb enumC0301bb5 = EnumC0301bb.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF;
        hashMap2.put(enumC0301bb5, 26);
        EnumC0301bb enumC0301bb6 = EnumC0301bb.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE;
        hashMap2.put(enumC0301bb6, 26);
        EnumC0301bb enumC0301bb7 = EnumC0301bb.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE;
        hashMap2.put(enumC0301bb7, 26);
        EnumC0301bb enumC0301bb8 = EnumC0301bb.EVENT_TYPE_ANR;
        hashMap2.put(enumC0301bb8, 25);
        EnumC0301bb enumC0301bb9 = EnumC0301bb.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF;
        hashMap2.put(enumC0301bb9, 26);
        EnumC0301bb enumC0301bb10 = EnumC0301bb.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF;
        hashMap2.put(enumC0301bb10, 26);
        EnumC0301bb enumC0301bb11 = EnumC0301bb.EVENT_TYPE_EXCEPTION_USER_PROTOBUF;
        hashMap2.put(enumC0301bb11, 27);
        EnumC0301bb enumC0301bb12 = EnumC0301bb.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF;
        hashMap2.put(enumC0301bb12, 27);
        EnumC0301bb enumC0301bb13 = EnumC0301bb.EVENT_TYPE_FIRST_ACTIVATION;
        hashMap2.put(enumC0301bb13, 13);
        EnumC0301bb enumC0301bb14 = EnumC0301bb.EVENT_TYPE_START;
        hashMap2.put(enumC0301bb14, 2);
        EnumC0301bb enumC0301bb15 = EnumC0301bb.EVENT_TYPE_APP_OPEN;
        hashMap2.put(enumC0301bb15, 16);
        EnumC0301bb enumC0301bb16 = EnumC0301bb.EVENT_TYPE_APP_UPDATE;
        hashMap2.put(enumC0301bb16, 17);
        EnumC0301bb enumC0301bb17 = EnumC0301bb.EVENT_TYPE_PERMISSIONS;
        hashMap2.put(enumC0301bb17, 18);
        EnumC0301bb enumC0301bb18 = EnumC0301bb.EVENT_TYPE_APP_FEATURES;
        hashMap2.put(enumC0301bb18, 19);
        EnumC0301bb enumC0301bb19 = EnumC0301bb.EVENT_TYPE_SEND_USER_PROFILE;
        hashMap2.put(enumC0301bb19, 20);
        EnumC0301bb enumC0301bb20 = EnumC0301bb.EVENT_TYPE_SEND_REVENUE_EVENT;
        hashMap2.put(enumC0301bb20, 21);
        EnumC0301bb enumC0301bb21 = EnumC0301bb.EVENT_TYPE_SEND_AD_REVENUE_EVENT;
        hashMap2.put(enumC0301bb21, 40);
        EnumC0301bb enumC0301bb22 = EnumC0301bb.EVENT_TYPE_SEND_ECOMMERCE_EVENT;
        hashMap2.put(enumC0301bb22, 35);
        hashMap2.put(EnumC0301bb.EVENT_TYPE_CLEANUP, 29);
        EnumC0301bb enumC0301bb23 = EnumC0301bb.EVENT_TYPE_WEBVIEW_SYNC;
        hashMap2.put(enumC0301bb23, 38);
        EnumC0301bb enumC0301bb24 = EnumC0301bb.EVENT_CLIENT_EXTERNAL_ATTRIBUTION;
        hashMap2.put(enumC0301bb24, 42);
        f4931c = Collections.unmodifiableMap(hashMap2);
        HashMap hashMap3 = new HashMap();
        C0841w8 c0841w8 = new C0841w8();
        C8 c8 = new C8(new H8());
        C0867x8 c0867x8 = new C0867x8();
        C0319c3 c0319c3 = new C0319c3(new H8());
        Pn pn = new Pn(new H8());
        Lf lf = new Lf();
        T8 a2 = U8.a();
        a2.f5095b = lf;
        a2.f5096c = lf;
        U8 u8 = new U8(a2);
        T8 a3 = U8.a();
        a3.f5095b = c8;
        U8 u82 = new U8(a3);
        T8 a4 = U8.a();
        a4.f5095b = c0319c3;
        U8 u83 = new U8(a4);
        T8 a5 = U8.a();
        a5.f5095b = pn;
        U8 u84 = new U8(a5);
        T8 a6 = U8.a();
        a6.f5094a = c0841w8;
        U8 u85 = new U8(a6);
        T8 a7 = U8.a();
        a7.f5095b = new C0805uo(new C8());
        U8 u86 = new U8(a7);
        hashMap3.put(enumC0301bb2, u82);
        T8 a8 = U8.a();
        a8.f5095b = new Nf();
        hashMap3.put(enumC0301bb3, new U8(a8));
        T8 a9 = U8.a();
        a9.f5094a = c0841w8;
        a9.f5095b = c0867x8;
        a9.f5098e = new W7();
        a9.f5099f = new X7();
        hashMap3.put(enumC0301bb4, new U8(a9));
        hashMap3.put(enumC0301bb9, u8);
        hashMap3.put(enumC0301bb10, u8);
        hashMap3.put(enumC0301bb11, u83);
        hashMap3.put(enumC0301bb12, u83);
        hashMap3.put(enumC0301bb5, u83);
        hashMap3.put(enumC0301bb6, u83);
        hashMap3.put(enumC0301bb7, u83);
        hashMap3.put(enumC0301bb8, u83);
        T8 a10 = U8.a();
        a10.f5094a = new C0841w8();
        a10.f5095b = c0319c3;
        hashMap3.put(enumC0301bb14, new U8(a10));
        EnumC0301bb enumC0301bb25 = EnumC0301bb.EVENT_TYPE_CUSTOM_EVENT;
        T8 a11 = U8.a();
        a11.f5097d = new Of();
        hashMap3.put(enumC0301bb25, new U8(a11));
        hashMap3.put(enumC0301bb15, u82);
        hashMap3.put(enumC0301bb17, u85);
        hashMap3.put(enumC0301bb18, u85);
        hashMap3.put(enumC0301bb19, u83);
        hashMap3.put(enumC0301bb20, u83);
        hashMap3.put(enumC0301bb21, u83);
        hashMap3.put(enumC0301bb22, u84);
        hashMap3.put(enumC0301bb, u86);
        hashMap3.put(enumC0301bb16, u86);
        hashMap3.put(enumC0301bb13, u82);
        hashMap3.put(enumC0301bb23, u82);
        hashMap3.put(enumC0301bb24, u83);
        f4932d = Collections.unmodifiableMap(hashMap3);
    }

    public static C0480i9 a(Long l2, Long l3, Boolean bool) {
        C0480i9 c0480i9 = new C0480i9();
        if (l2 != null) {
            c0480i9.f6180a = l2.longValue();
            c0480i9.f6181b = ((GregorianCalendar) Calendar.getInstance()).getTimeZone().getOffset(l2.longValue() * 1000) / AppMetricaDefaultValues.DEFAULT_MAX_REPORTS_IN_DATABASE_COUNT;
        }
        if (l3 != null) {
            c0480i9.f6182c = l3.longValue();
        }
        if (bool != null) {
            c0480i9.f6183d = bool.booleanValue();
        }
        return c0480i9;
    }

    public static void a(C0428g9 c0428g9) {
        C0376e9[] c0376e9Arr = c0428g9.f6074c;
        if (c0376e9Arr != null) {
            for (C0376e9 c0376e9 : c0376e9Arr) {
            }
        }
    }
}
