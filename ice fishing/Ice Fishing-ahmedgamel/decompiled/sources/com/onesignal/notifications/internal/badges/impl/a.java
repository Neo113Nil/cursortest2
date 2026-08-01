package com.onesignal.notifications.internal.badges.impl;

import A4.d;
import I7.l;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.service.notification.StatusBarNotification;
import com.onesignal.debug.internal.logging.b;
import kotlin.jvm.internal.h;
import kotlin.jvm.internal.i;
import kotlin.jvm.internal.q;
import m5.InterfaceC4733a;
import n5.c;
import t5.e;
import u5.InterfaceC5080a;
import u7.v;
import x4.f;
import y5.C5242a;

/* loaded from: classes2.dex */
public final class a implements InterfaceC4733a {
    private final f _applicationService;
    private final d _databaseProvider;
    private final InterfaceC5080a _queryHelper;
    private int badgesEnabled;

    /* renamed from: com.onesignal.notifications.internal.badges.impl.a$a, reason: collision with other inner class name */
    public static final class C0228a extends i implements l {
        final /* synthetic */ q $notificationCount;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C0228a(q qVar) {
            super(1);
            this.$notificationCount = qVar;
        }

        @Override // I7.l
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((A4.a) obj);
            return v.f41353a;
        }

        public final void invoke(A4.a it) {
            h.e(it, "it");
            this.$notificationCount.f38716n = it.getCount();
        }
    }

    public a(f _applicationService, InterfaceC5080a _queryHelper, d _databaseProvider) {
        h.e(_applicationService, "_applicationService");
        h.e(_queryHelper, "_queryHelper");
        h.e(_databaseProvider, "_databaseProvider");
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
            h.d(applicationInfo, "getApplicationInfo(...)");
            Bundle bundle = applicationInfo.metaData;
            if (bundle != null) {
                this.badgesEnabled = !"DISABLE".equals(bundle.getString("com.onesignal.BadgeCount")) ? 1 : 0;
            } else {
                this.badgesEnabled = 1;
            }
        } catch (PackageManager.NameNotFoundException e9) {
            this.badgesEnabled = 0;
            b.error("Error reading meta-data tag 'com.onesignal.BadgeCount'. Disabling badge setting.", e9);
        }
        return this.badgesEnabled == 1;
    }

    private final boolean areBadgesEnabled() {
        return areBadgeSettingsEnabled() && e.areNotificationsEnabled$default(e.INSTANCE, this._applicationService.getAppContext(), null, 2, null);
    }

    private final void updateFallback() {
        q qVar = new q();
        A4.b.query$default(this._databaseProvider.getOs(), "notification", null, this._queryHelper.recentUninteractedWithNotificationsWhere().toString(), null, null, null, null, String.valueOf(C5242a.INSTANCE.getMaxNumberOfNotifications()), new C0228a(qVar), 122, null);
        updateCount(qVar.f38716n);
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

    @Override // m5.InterfaceC4733a
    public void update() {
        if (areBadgesEnabled()) {
            updateStandard();
        }
    }

    @Override // m5.InterfaceC4733a
    public void updateCount(int i) {
        if (areBadgeSettingsEnabled()) {
            try {
                c.applyCountOrThrow(this._applicationService.getAppContext(), i);
            } catch (n5.b unused) {
            }
        }
    }
}
