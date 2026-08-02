package io.appmetrica.analytics.impl;

import defpackage.j73;
import defpackage.sls;
import io.appmetrica.analytics.IParamsCallback;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* renamed from: io.appmetrica.analytics.impl.yp, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC0893yp {
    public static final Set a = j73.f0(new String[]{IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS, "appmetrica_device_id_hash", "appmetrica_device_id", IParamsCallback.YANDEX_MOBILE_METRICA_GET_AD_URL, IParamsCallback.YANDEX_MOBILE_METRICA_REPORT_AD_URL, "appmetrica_uuid"});
    public static final SystemTimeProvider b = new SystemTimeProvider();
    public static final C0785v4 c = new C0785v4();

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0017 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean a(Bp bp, Collection collection, Map map, sls slsVar) {
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
                            a2 = a(bp.d);
                            if (a2) {
                                return false;
                            }
                        }
                    case 155670667:
                        if (!str.equals(IParamsCallback.YANDEX_MOBILE_METRICA_GET_AD_URL)) {
                            break;
                        } else {
                            a2 = a(bp.j);
                            if (a2) {
                            }
                        }
                        break;
                    case 299713912:
                        if (!str.equals("appmetrica_device_id_hash")) {
                            break;
                        } else {
                            a2 = a(bp.b);
                            if (a2) {
                            }
                        }
                        break;
                    case 530949152:
                        if (!str.equals(IParamsCallback.YANDEX_MOBILE_METRICA_CLIDS)) {
                            break;
                        } else {
                            C0785v4 c0785v4 = c;
                            C0698s4 c0698s4 = (C0698s4) slsVar.invoke();
                            c0785v4.getClass();
                            a2 = C0785v4.a(map, bp, c0698s4);
                            if (a2) {
                            }
                        }
                        break;
                    case 703740463:
                        if (!str.equals(IParamsCallback.YANDEX_MOBILE_METRICA_REPORT_AD_URL)) {
                            break;
                        } else {
                            a2 = a(bp.k);
                            if (a2) {
                            }
                        }
                        break;
                    case 1117383061:
                        if (!str.equals("appmetrica_device_id")) {
                            break;
                        } else {
                            a2 = a(bp.a);
                            if (a2) {
                            }
                        }
                        break;
                }
                if (bp.x) {
                    return false;
                }
                if (b.currentTimeSeconds() > bp.p + bp.A.a) {
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
