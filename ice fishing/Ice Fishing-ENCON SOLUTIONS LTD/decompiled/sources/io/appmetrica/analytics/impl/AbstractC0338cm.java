package io.appmetrica.analytics.impl;

import io.appmetrica.analytics.StartupParamsCallback;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import t1.InterfaceC1046a;

/* renamed from: io.appmetrica.analytics.impl.cm, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0338cm {

    /* renamed from: a, reason: collision with root package name */
    public static final Set f5767a = R1.d.F("appmetrica_clids", StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH, StartupParamsCallback.APPMETRICA_DEVICE_ID, "appmetrica_get_ad_url", "appmetrica_report_ad_url", StartupParamsCallback.APPMETRICA_UUID);

    /* renamed from: b, reason: collision with root package name */
    public static final SystemTimeProvider f5768b = new SystemTimeProvider();

    /* renamed from: c, reason: collision with root package name */
    public static final C3 f5769c = new C3();

    public static final boolean a(String str) {
        return !(str == null || str.length() == 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0017 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean a(C0415fm c0415fm, Collection collection, Map map, InterfaceC1046a interfaceC1046a) {
        boolean a2;
        if (collection == null || collection.isEmpty() || collection.isEmpty()) {
            return true;
        }
        Iterator it = collection.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            switch (str.hashCode()) {
                case -1367801046:
                    if (!str.equals(StartupParamsCallback.APPMETRICA_UUID)) {
                        if (c0415fm.f6023w) {
                            break;
                        } else {
                            if (f5768b.currentTimeSeconds() > c0415fm.f6016o + c0415fm.f6026z.f4275a) {
                                break;
                            }
                        }
                    } else {
                        a2 = a(c0415fm.f6005d);
                        if (a2) {
                            break;
                        }
                    }
                case 155670667:
                    if (str.equals("appmetrica_get_ad_url")) {
                        a2 = a(c0415fm.f6010i);
                        if (a2) {
                        }
                    } else if (c0415fm.f6023w) {
                    }
                    break;
                case 299713912:
                    if (str.equals(StartupParamsCallback.APPMETRICA_DEVICE_ID_HASH)) {
                        a2 = a(c0415fm.f6003b);
                        if (a2) {
                        }
                    } else if (c0415fm.f6023w) {
                    }
                    break;
                case 530949152:
                    if (str.equals("appmetrica_clids")) {
                        C3 c3 = f5769c;
                        C0914z3 c0914z3 = (C0914z3) interfaceC1046a.invoke();
                        c3.getClass();
                        a2 = C3.a(map, c0415fm, c0914z3);
                        if (a2) {
                        }
                    } else if (c0415fm.f6023w) {
                    }
                    break;
                case 703740463:
                    if (str.equals("appmetrica_report_ad_url")) {
                        a2 = a(c0415fm.f6011j);
                        if (a2) {
                        }
                    } else if (c0415fm.f6023w) {
                    }
                    break;
                case 1117383061:
                    if (str.equals(StartupParamsCallback.APPMETRICA_DEVICE_ID)) {
                        a2 = a(c0415fm.f6002a);
                        if (a2) {
                        }
                    } else if (c0415fm.f6023w) {
                    }
                    break;
                default:
                    if (c0415fm.f6023w) {
                    }
                    break;
            }
            return true;
        }
        return true;
    }
}
