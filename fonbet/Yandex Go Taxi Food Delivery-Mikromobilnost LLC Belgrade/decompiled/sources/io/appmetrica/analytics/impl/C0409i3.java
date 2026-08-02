package io.appmetrica.analytics.impl;

import android.app.ActivityManager;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import defpackage.ny61;
import defpackage.t6f0;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\bÁ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\b\u0010\tJ\u0018\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¨\u0006\n"}, d2 = {"Lio/appmetrica/analytics/impl/i3;", "", "Landroid/content/Context;", "context", "Lio/appmetrica/analytics/impl/O2;", "converter", "Lio/appmetrica/analytics/impl/l3;", "a", "<init>", "()V", "analytics-yandex_binaryProdRelease"}, k = 1, mv = {1, 9, 0})
/* renamed from: io.appmetrica.analytics.impl.i3, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C0409i3 {
    public static final C0409i3 a = new C0409i3();

    private C0409i3() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EnumC0466k3 a(O2 o2, UsageStatsManager usageStatsManager) {
        int appStandbyBucket = usageStatsManager.getAppStandbyBucket();
        o2.getClass();
        if (!AndroidUtils.isApiAchieved(28)) {
            return null;
        }
        if (AndroidUtils.isApiAchieved(30) && appStandbyBucket == 45) {
            return EnumC0466k3.RESTRICTED;
        }
        if (appStandbyBucket == 5) {
            return EnumC0466k3.EXEMPTED;
        }
        if (appStandbyBucket == 10) {
            return EnumC0466k3.ACTIVE;
        }
        if (appStandbyBucket == 30) {
            return EnumC0466k3.FREQUENT;
        }
        if (appStandbyBucket == 20) {
            return EnumC0466k3.WORKING_SET;
        }
        if (appStandbyBucket == 40) {
            return EnumC0466k3.RARE;
        }
        return null;
    }

    public static final C0495l3 a(Context context, O2 converter) {
        return new C0495l3((EnumC0466k3) SystemServiceUtils.accessSystemServiceByNameSafely(context, "usagestats", "getting app standby bucket", "usageStatsManager", new t6f0(16, converter)), (Boolean) SystemServiceUtils.accessSystemServiceByNameSafely(context, "activity", "getting is background restricted", "activityManager", new ny61(8)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean a(ActivityManager activityManager) {
        return Boolean.valueOf(activityManager.isBackgroundRestricted());
    }
}
