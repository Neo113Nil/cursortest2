package io.appmetrica.analytics.idsync.impl;

import android.net.Uri;
import defpackage.zh80;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfo;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.idsync.impl.r;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;

/* loaded from: classes4.dex */
public final class r implements s {
    public final ServiceContext a;
    public final String b;
    public final String c = CommonUrlParts.ADV_ID;
    public final String d = CommonUrlParts.HUAWEI_OAID;
    public final String e = CommonUrlParts.YANDEX_ADV_ID;
    public final String f = "uuid";
    public final String g = CommonUrlParts.DEVICE_ID;
    public final String h = CommonUrlParts.APP_SET_ID;
    public final long i = 60000;
    public final long j = 1000;
    public final SystemTimeProvider k = new SystemTimeProvider();
    public final u l;

    public r(ServiceContext serviceContext, String str) {
        this.a = serviceContext;
        this.b = str;
        this.l = new u(serviceContext);
    }

    @Override // io.appmetrica.analytics.idsync.impl.s
    public final void a(String str, SdkIdentifiers sdkIdentifiers) {
        PlatformIdentifiers platformIdentifiers = this.a.getPlatformIdentifiers();
        AdvertisingIdsHolder identifiers = platformIdentifiers.getAdvIdentifiersProvider().getIdentifiers();
        Uri.Builder buildUpon = Uri.parse(this.b).buildUpon();
        AdTrackingInfo adTrackingInfo = identifiers.getGoogle().mAdTrackingInfo;
        if (adTrackingInfo != null) {
            buildUpon.appendQueryParameter(this.c, adTrackingInfo.advId);
        }
        AdTrackingInfo adTrackingInfo2 = identifiers.getHuawei().mAdTrackingInfo;
        if (adTrackingInfo2 != null) {
            buildUpon.appendQueryParameter(this.d, adTrackingInfo2.advId);
        }
        AdTrackingInfo adTrackingInfo3 = identifiers.getYandex().mAdTrackingInfo;
        if (adTrackingInfo3 != null) {
            buildUpon.appendQueryParameter(this.e, adTrackingInfo3.advId);
        }
        buildUpon.appendQueryParameter(this.f, sdkIdentifiers.getUuid());
        buildUpon.appendQueryParameter(this.g, sdkIdentifiers.getDeviceId());
        String id = platformIdentifiers.getAppSetIdProvider().getAppSetId().getId();
        if (id != null) {
            buildUpon.appendQueryParameter(this.h, id);
        }
        String uri = buildUpon.build().toString();
        IHandlerExecutor supportIOExecutor = this.a.getExecutorProvider().getSupportIOExecutor();
        supportIOExecutor.execute(new zh80(this, uri, str, supportIOExecutor, this.k.currentTimeMillis()));
    }

    public static final void a(r rVar, String str, String str2, IHandlerExecutor iHandlerExecutor, long j) {
        long j2 = rVar.j;
        if (rVar.l.a(str, str2)) {
            return;
        }
        rVar.a(str, str2, iHandlerExecutor, j, 0, j2);
    }

    public static final void a(r rVar, String str, String str2, IHandlerExecutor iHandlerExecutor, long j, int i, long j2) {
        int i2 = i + 1;
        if (rVar.l.a(str, str2)) {
            return;
        }
        rVar.a(str, str2, iHandlerExecutor, j, i2, j2);
    }

    public final void a(final String str, final String str2, final IHandlerExecutor iHandlerExecutor, final long j, final int i, long j2) {
        final long j3 = j2 * 2;
        if ((this.k.currentTimeMillis() - j) + j3 <= this.i) {
            iHandlerExecutor.executeDelayed(new Runnable() { // from class: d781
                @Override // java.lang.Runnable
                public final void run() {
                    r.a(r.this, str, str2, iHandlerExecutor, j, i, j3);
                }
            }, j2);
        }
    }
}
