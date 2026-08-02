package io.appmetrica.analytics.impl;

import defpackage.xz0;
import io.appmetrica.analytics.IParamsCallback;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* renamed from: io.appmetrica.analytics.impl.gp, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC0299gp {
    public static final Set a = xz0.Y(new String[]{IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS, "appmetrica_device_id_hash", "appmetrica_device_id", IParamsCallback.YANDEX_MOBILE_METRICA_GET_AD_URL, IParamsCallback.YANDEX_MOBILE_METRICA_REPORT_AD_URL, "appmetrica_uuid"});
    public static final SystemTimeProvider b = new SystemTimeProvider();
    public static final C0595r4 c = new C0595r4();

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0017 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean a(C0385jp c0385jp, Collection collection, Map map, Function0 function0) {
        boolean a2;
        if (collection != null && !collection.isEmpty() && !collection.isEmpty()) {
            Iterator it = collection.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                switch (str.hashCode()) {
                    case -1367801046:
                        if (!str.equals("appmetrica_uuid")) {
                            break;
                        } else {
                            a2 = a(c0385jp.d);
                            if (a2) {
                                return false;
                            }
                        }
                    case 155670667:
                        if (!str.equals(IParamsCallback.YANDEX_MOBILE_METRICA_GET_AD_URL)) {
                            break;
                        } else {
                            a2 = a(c0385jp.j);
                            if (a2) {
                            }
                        }
                        break;
                    case 299713912:
                        if (!str.equals("appmetrica_device_id_hash")) {
                            break;
                        } else {
                            a2 = a(c0385jp.b);
                            if (a2) {
                            }
                        }
                        break;
                    case 530949152:
                        if (!str.equals(IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS)) {
                            break;
                        } else {
                            C0595r4 c0595r4 = c;
                            C0509o4 c0509o4 = (C0509o4) function0.invoke();
                            c0595r4.getClass();
                            a2 = C0595r4.a(map, c0385jp, c0509o4);
                            if (a2) {
                            }
                        }
                        break;
                    case 703740463:
                        if (!str.equals(IParamsCallback.YANDEX_MOBILE_METRICA_REPORT_AD_URL)) {
                            break;
                        } else {
                            a2 = a(c0385jp.k);
                            if (a2) {
                            }
                        }
                        break;
                    case 1117383061:
                        if (!str.equals("appmetrica_device_id")) {
                            break;
                        } else {
                            a2 = a(c0385jp.a);
                            if (a2) {
                            }
                        }
                        break;
                }
                if (c0385jp.x) {
                    return false;
                }
                if (b.currentTimeSeconds() > c0385jp.p + c0385jp.A.a) {
                    return false;
                }
            }
        }
        return true;
    }

    public static final boolean a(String str) {
        return !(str == null || str.length() == 0);
    }
}
