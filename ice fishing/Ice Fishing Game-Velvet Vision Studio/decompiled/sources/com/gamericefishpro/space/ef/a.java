package com.gamericefishpro.space.ef;

import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import com.gamericefishpro.space.ei.l;
import com.gamericefishpro.space.ei.y;
import com.gamericefishpro.space.ff.c;
import com.gamericefishpro.space.lc.f;
import com.gamericefishpro.space.mf.e;
import com.gamericefishpro.space.od.b;
import com.gamericefishpro.space.tc.d;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
/* JADX INFO: loaded from: classes.dex */
public final class a implements com.gamericefishpro.space.df.a {
    private final f _applicationService;
    private final d _databaseProvider;
    private final com.gamericefishpro.space.nf.a _queryHelper;
    private int badgesEnabled;

    /* JADX INFO: renamed from: com.gamericefishpro.space.ef.a$a, reason: collision with other inner class name */
    /* JADX INFO: compiled from: r8-map-id-020a1517951ead57be77a6b773195444ecc812bf491d4c7c9fe6933b01540740 */
    public static final class C0011a extends l implements Function1 {
        final /* synthetic */ y $notificationCount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0011a(y yVar) {
            super(1);
            this.$notificationCount = yVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((com.gamericefishpro.space.tc.a) obj);
            return Unit.a;
        }

        public final void invoke(com.gamericefishpro.space.tc.a it) {
            Intrinsics.checkNotNullParameter(it, "it");
            this.$notificationCount.d = it.getCount();
        }
    }

    public a(f _applicationService, com.gamericefishpro.space.nf.a _queryHelper, d _databaseProvider) {
        Intrinsics.checkNotNullParameter(_applicationService, "_applicationService");
        Intrinsics.checkNotNullParameter(_queryHelper, "_queryHelper");
        Intrinsics.checkNotNullParameter(_databaseProvider, "_databaseProvider");
        this._applicationService = _applicationService;
        this._queryHelper = _queryHelper;
        this._databaseProvider = _databaseProvider;
        this.badgesEnabled = -1;
    }

    private final boolean areBadgeSettingsEnabled() {
        int i = this.badgesEnabled;
        if (i != -1) {
            return i == 1;
        }
        try {
            ApplicationInfo applicationInfo = this._applicationService.getAppContext().getPackageManager().getApplicationInfo(this._applicationService.getAppContext().getPackageName(), 128);
            Intrinsics.checkNotNullExpressionValue(applicationInfo, "getApplicationInfo(...)");
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null) {
                this.badgesEnabled = !"DISABLE".equals(bundle.getString("com.onesignal.BadgeCount")) ? 1 : 0;
            } else {
                this.badgesEnabled = 1;
            }
        } catch (PackageManager.NameNotFoundException e) {
            this.badgesEnabled = 0;
            b.error("Error reading meta-data tag 'com.onesignal.BadgeCount'. Disabling badge setting.", e);
        }
        return this.badgesEnabled == 1;
    }

    private final boolean areBadgesEnabled() {
        return areBadgeSettingsEnabled() && e.areNotificationsEnabled$default(e.INSTANCE, this._applicationService.getAppContext(), null, 2, null);
    }

    private final void updateFallback() {
        y yVar = new y();
        com.gamericefishpro.space.tc.b.query$default(this._databaseProvider.getOs(), "notification", null, this._queryHelper.recentUninteractedWithNotificationsWhere().toString(), null, null, null, null, String.valueOf(com.gamericefishpro.space.vf.a.INSTANCE.getMaxNumberOfNotifications()), new C0011a(yVar), 122, null);
        updateCount(yVar.d);
    }

    private final void updateStandard() {
        int i = 0;
        for (StatusBarNotification statusBarNotification : e.INSTANCE.getActiveNotifications(this._applicationService.getAppContext())) {
            if (!e.INSTANCE.isGroupSummary(statusBarNotification)) {
                i++;
            }
        }
        updateCount(i);
    }

    @Override // com.gamericefishpro.space.df.a
    public void update() {
        if (areBadgesEnabled()) {
            updateStandard();
        }
    }

    @Override // com.gamericefishpro.space.df.a
    public void updateCount(int i) {
        if (areBadgeSettingsEnabled()) {
            try {
                c.applyCountOrThrow(this._applicationService.getAppContext(), i);
            } catch (com.gamericefishpro.space.ff.b unused) {
            }
        }
    }
}
