package com.onesignal.notifications.internal.badges.impl;

import ac.o;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import com.onesignal.debug.internal.logging.b;
import na.e;
import oc.c;
import pc.j;
import pc.k;
import pc.q;
import q8.f;
import t8.d;

/* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
/* loaded from: classes.dex */
public final class a implements ga.a {
    private final f _applicationService;
    private final d _databaseProvider;
    private final oa.a _queryHelper;
    private int badgesEnabled;

    /* compiled from: r8-map-id-9ca073bbfde00f50be8682633edd5c48170ffeeeebc591f4c22ad3deaafa0d20 */
    /* renamed from: com.onesignal.notifications.internal.badges.impl.a$a, reason: collision with other inner class name */
    public static final class C0049a extends k implements c {
        final /* synthetic */ q $notificationCount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0049a(q qVar) {
            super(1);
            this.$notificationCount = qVar;
        }

        @Override // oc.c
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((t8.a) obj);
            return o.f277a;
        }

        public final void invoke(t8.a aVar) {
            j.e(aVar, "it");
            this.$notificationCount.f5681g = aVar.getCount();
        }
    }

    public a(f fVar, oa.a aVar, d dVar) {
        j.e(fVar, "_applicationService");
        j.e(aVar, "_queryHelper");
        j.e(dVar, "_databaseProvider");
        this._applicationService = fVar;
        this._queryHelper = aVar;
        this._databaseProvider = dVar;
        this.badgesEnabled = -1;
    }

    private final boolean areBadgeSettingsEnabled() {
        int i10 = this.badgesEnabled;
        if (i10 != -1) {
            return i10 == 1;
        }
        try {
            ApplicationInfo applicationInfo = this._applicationService.getAppContext().getPackageManager().getApplicationInfo(this._applicationService.getAppContext().getPackageName(), 128);
            j.d(applicationInfo, "_applicationService.appC…A_DATA,\n                )");
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null) {
                this.badgesEnabled = !"DISABLE".equals(bundle.getString("com.onesignal.BadgeCount")) ? 1 : 0;
            } else {
                this.badgesEnabled = 1;
            }
        } catch (PackageManager.NameNotFoundException e10) {
            this.badgesEnabled = 0;
            b.error("Error reading meta-data tag 'com.onesignal.BadgeCount'. Disabling badge setting.", e10);
        }
        return this.badgesEnabled == 1;
    }

    private final boolean areBadgesEnabled() {
        return areBadgeSettingsEnabled() && e.areNotificationsEnabled$default(e.INSTANCE, this._applicationService.getAppContext(), null, 2, null);
    }

    private final void updateFallback() {
        q qVar = new q();
        t8.b.query$default(this._databaseProvider.getOs(), "notification", null, this._queryHelper.recentUninteractedWithNotificationsWhere().toString(), null, null, null, null, String.valueOf(sa.a.INSTANCE.getMaxNumberOfNotifications()), new C0049a(qVar), 122, null);
        updateCount(qVar.f5681g);
    }

    private final void updateStandard() {
        int i10 = 0;
        for (StatusBarNotification statusBarNotification : e.INSTANCE.getActiveNotifications(this._applicationService.getAppContext())) {
            if (!e.INSTANCE.isGroupSummary(statusBarNotification)) {
                i10++;
            }
        }
        updateCount(i10);
    }

    @Override // ga.a
    public void update() {
        if (areBadgesEnabled()) {
            updateStandard();
        }
    }

    @Override // ga.a
    public void updateCount(int i10) {
        if (areBadgeSettingsEnabled()) {
            try {
                ha.c.applyCountOrThrow(this._applicationService.getAppContext(), i10);
            } catch (ha.b unused) {
            }
        }
    }
}
