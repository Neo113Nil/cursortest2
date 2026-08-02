package io.appmetrica.analytics.impl;

import android.util.SparseArray;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

/* renamed from: io.appmetrica.analytics.impl.mi, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC0465mi {
    public static final Map a;
    public static final SparseArray b;
    public static final Map c;
    public static final Map d;

    static {
        HashMap hashMap = new HashMap();
        Xn xn = Xn.FOREGROUND;
        hashMap.put(xn, 0);
        Xn xn2 = Xn.BACKGROUND;
        hashMap.put(xn2, 1);
        a = Collections.unmodifiableMap(hashMap);
        SparseArray sparseArray = new SparseArray();
        sparseArray.put(0, xn);
        sparseArray.put(1, xn2);
        b = sparseArray;
        HashMap hashMap2 = new HashMap();
        EnumC0603rc enumC0603rc = EnumC0603rc.EVENT_TYPE_INIT;
        hashMap2.put(enumC0603rc, 1);
        EnumC0603rc enumC0603rc2 = EnumC0603rc.EVENT_TYPE_REGULAR;
        hashMap2.put(enumC0603rc2, 4);
        EnumC0603rc enumC0603rc3 = EnumC0603rc.EVENT_TYPE_SEND_REFERRER;
        hashMap2.put(enumC0603rc3, 5);
        EnumC0603rc enumC0603rc4 = EnumC0603rc.EVENT_TYPE_ALIVE;
        hashMap2.put(enumC0603rc4, 7);
        EnumC0603rc enumC0603rc5 = EnumC0603rc.EVENT_TYPE_EXCEPTION_UNHANDLED_PROTOBUF;
        hashMap2.put(enumC0603rc5, 26);
        EnumC0603rc enumC0603rc6 = EnumC0603rc.EVENT_TYPE_PREV_SESSION_EXCEPTION_UNHANDLED_FROM_FILE;
        hashMap2.put(enumC0603rc6, 26);
        EnumC0603rc enumC0603rc7 = EnumC0603rc.EVENT_TYPE_EXCEPTION_UNHANDLED_FROM_FILE;
        hashMap2.put(enumC0603rc7, 26);
        EnumC0603rc enumC0603rc8 = EnumC0603rc.EVENT_TYPE_ANR;
        hashMap2.put(enumC0603rc8, 25);
        EnumC0603rc enumC0603rc9 = EnumC0603rc.EVENT_TYPE_PREV_SESSION_NATIVE_CRASH_PROTOBUF;
        hashMap2.put(enumC0603rc9, 26);
        EnumC0603rc enumC0603rc10 = EnumC0603rc.EVENT_TYPE_CURRENT_SESSION_NATIVE_CRASH_PROTOBUF;
        hashMap2.put(enumC0603rc10, 26);
        EnumC0603rc enumC0603rc11 = EnumC0603rc.EVENT_TYPE_EXCEPTION_USER_PROTOBUF;
        hashMap2.put(enumC0603rc11, 27);
        EnumC0603rc enumC0603rc12 = EnumC0603rc.EVENT_TYPE_EXCEPTION_USER_CUSTOM_PROTOBUF;
        hashMap2.put(enumC0603rc12, 27);
        EnumC0603rc enumC0603rc13 = EnumC0603rc.EVENT_TYPE_FIRST_ACTIVATION;
        hashMap2.put(enumC0603rc13, 13);
        EnumC0603rc enumC0603rc14 = EnumC0603rc.EVENT_TYPE_START;
        hashMap2.put(enumC0603rc14, 2);
        EnumC0603rc enumC0603rc15 = EnumC0603rc.EVENT_TYPE_APP_OPEN;
        hashMap2.put(enumC0603rc15, 16);
        EnumC0603rc enumC0603rc16 = EnumC0603rc.EVENT_TYPE_APP_UPDATE;
        hashMap2.put(enumC0603rc16, 17);
        EnumC0603rc enumC0603rc17 = EnumC0603rc.EVENT_TYPE_PERMISSIONS;
        hashMap2.put(enumC0603rc17, 18);
        EnumC0603rc enumC0603rc18 = EnumC0603rc.EVENT_TYPE_APP_FEATURES;
        hashMap2.put(enumC0603rc18, 19);
        EnumC0603rc enumC0603rc19 = EnumC0603rc.EVENT_TYPE_SEND_USER_PROFILE;
        hashMap2.put(enumC0603rc19, 20);
        EnumC0603rc enumC0603rc20 = EnumC0603rc.EVENT_TYPE_SEND_REVENUE_EVENT;
        hashMap2.put(enumC0603rc20, 21);
        EnumC0603rc enumC0603rc21 = EnumC0603rc.EVENT_TYPE_SEND_AD_REVENUE_EVENT;
        hashMap2.put(enumC0603rc21, 40);
        EnumC0603rc enumC0603rc22 = EnumC0603rc.EVENT_TYPE_SEND_ECOMMERCE_EVENT;
        hashMap2.put(enumC0603rc22, 35);
        hashMap2.put(EnumC0603rc.EVENT_TYPE_CLEANUP, 29);
        EnumC0603rc enumC0603rc23 = EnumC0603rc.EVENT_TYPE_WEBVIEW_SYNC;
        hashMap2.put(enumC0603rc23, 38);
        EnumC0603rc enumC0603rc24 = EnumC0603rc.EVENT_CLIENT_EXTERNAL_ATTRIBUTION;
        hashMap2.put(enumC0603rc24, 42);
        c = Collections.unmodifiableMap(hashMap2);
        HashMap hashMap3 = new HashMap();
        E9 e9 = new E9();
        K9 k9 = new K9(new P9());
        F9 f9 = new F9();
        R3 r3 = new R3(new P9());
        Uq uq = new Uq(new P9());
        C0349ii c0349ii = new C0349ii();
        C0140ba a2 = C0169ca.a();
        a2.b = c0349ii;
        a2.c = c0349ii;
        C0169ca c0169ca = new C0169ca(a2);
        C0140ba a3 = C0169ca.a();
        a3.b = k9;
        C0169ca c0169ca2 = new C0169ca(a3);
        C0140ba a4 = C0169ca.a();
        a4.b = r3;
        C0169ca c0169ca3 = new C0169ca(a4);
        C0140ba a5 = C0169ca.a();
        a5.b = uq;
        C0169ca c0169ca4 = new C0169ca(a5);
        C0140ba a6 = C0169ca.a();
        a6.a = e9;
        C0169ca c0169ca5 = new C0169ca(a6);
        C0140ba a7 = C0169ca.a();
        a7.b = new Er(new K9());
        C0169ca c0169ca6 = new C0169ca(a7);
        hashMap3.put(enumC0603rc2, c0169ca2);
        C0140ba a8 = C0169ca.a();
        a8.b = new C0407ki();
        hashMap3.put(enumC0603rc3, new C0169ca(a8));
        C0140ba a9 = C0169ca.a();
        a9.a = e9;
        a9.b = f9;
        a9.e = new C0139b9();
        a9.f = new C0168c9();
        hashMap3.put(enumC0603rc4, new C0169ca(a9));
        hashMap3.put(enumC0603rc9, c0169ca);
        hashMap3.put(enumC0603rc10, c0169ca);
        hashMap3.put(enumC0603rc11, c0169ca3);
        hashMap3.put(enumC0603rc12, c0169ca3);
        hashMap3.put(enumC0603rc5, c0169ca3);
        hashMap3.put(enumC0603rc6, c0169ca3);
        hashMap3.put(enumC0603rc7, c0169ca3);
        hashMap3.put(enumC0603rc8, c0169ca3);
        C0140ba a10 = C0169ca.a();
        a10.a = new E9();
        a10.b = r3;
        hashMap3.put(enumC0603rc14, new C0169ca(a10));
        EnumC0603rc enumC0603rc25 = EnumC0603rc.EVENT_TYPE_CUSTOM_EVENT;
        C0140ba a11 = C0169ca.a();
        a11.d = new C0436li();
        hashMap3.put(enumC0603rc25, new C0169ca(a11));
        hashMap3.put(enumC0603rc15, c0169ca2);
        hashMap3.put(enumC0603rc17, c0169ca5);
        hashMap3.put(enumC0603rc18, c0169ca5);
        hashMap3.put(enumC0603rc19, c0169ca3);
        hashMap3.put(enumC0603rc20, c0169ca3);
        hashMap3.put(enumC0603rc21, c0169ca3);
        hashMap3.put(enumC0603rc22, c0169ca4);
        hashMap3.put(enumC0603rc, c0169ca6);
        hashMap3.put(enumC0603rc16, c0169ca6);
        hashMap3.put(enumC0603rc13, c0169ca2);
        hashMap3.put(enumC0603rc23, c0169ca2);
        hashMap3.put(enumC0603rc24, c0169ca3);
        d = Collections.unmodifiableMap(hashMap3);
    }

    public static void a(C0515oa c0515oa) {
        C0457ma[] c0457maArr = c0515oa.c;
        if (c0457maArr != null) {
            for (C0457ma c0457ma : c0457maArr) {
            }
        }
    }
}
