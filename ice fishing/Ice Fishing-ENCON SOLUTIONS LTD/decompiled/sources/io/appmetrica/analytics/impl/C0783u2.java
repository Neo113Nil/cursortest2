package io.appmetrica.analytics.impl;

import android.annotation.TargetApi;
import android.app.ActivityManager;
import android.app.usage.UsageStatsManager;
import android.content.Context;
import io.appmetrica.analytics.coreapi.internal.annotations.DoNotInline;
import io.appmetrica.analytics.coreutils.internal.AndroidUtils;
import io.appmetrica.analytics.coreutils.internal.system.SystemServiceUtils;

@DoNotInline
@TargetApi(28)
/* renamed from: io.appmetrica.analytics.impl.u2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0783u2 {

    /* renamed from: a, reason: collision with root package name */
    public static final C0783u2 f6962a = new C0783u2();

    private C0783u2() {
    }

    public static final C0861x2 a(Context context, C0318c2 c0318c2) {
        return new C0861x2((EnumC0835w2) SystemServiceUtils.accessSystemServiceByNameSafely(context, "usagestats", "getting app standby bucket", "usageStatsManager", new E0.a(8, c0318c2)), (Boolean) SystemServiceUtils.accessSystemServiceByNameSafely(context, "activity", "getting is background restricted", "activityManager", new H0.b(19)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final EnumC0835w2 a(C0318c2 c0318c2, UsageStatsManager usageStatsManager) {
        int appStandbyBucket;
        appStandbyBucket = usageStatsManager.getAppStandbyBucket();
        c0318c2.getClass();
        if (AndroidUtils.isApiAchieved(28)) {
            if (AndroidUtils.isApiAchieved(30) && appStandbyBucket == 45) {
                return EnumC0835w2.RESTRICTED;
            }
            if (appStandbyBucket == 5) {
                return EnumC0835w2.EXEMPTED;
            }
            if (appStandbyBucket == 10) {
                return EnumC0835w2.ACTIVE;
            }
            if (appStandbyBucket == 30) {
                return EnumC0835w2.FREQUENT;
            }
            if (appStandbyBucket == 20) {
                return EnumC0835w2.WORKING_SET;
            }
            if (appStandbyBucket == 40) {
                return EnumC0835w2.RARE;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean a(ActivityManager activityManager) {
        boolean isBackgroundRestricted;
        isBackgroundRestricted = activityManager.isBackgroundRestricted();
        return Boolean.valueOf(isBackgroundRestricted);
    }
}
