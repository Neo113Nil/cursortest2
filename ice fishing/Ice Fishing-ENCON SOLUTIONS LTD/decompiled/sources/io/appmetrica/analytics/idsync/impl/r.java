package io.appmetrica.analytics.idsync.impl;

import android.net.Uri;
import io.appmetrica.analytics.coreapi.internal.executors.IHandlerExecutor;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdTrackingInfo;
import io.appmetrica.analytics.coreapi.internal.identifiers.AdvertisingIdsHolder;
import io.appmetrica.analytics.coreapi.internal.identifiers.PlatformIdentifiers;
import io.appmetrica.analytics.coreapi.internal.identifiers.SdkIdentifiers;
import io.appmetrica.analytics.coreutils.internal.time.SystemTimeProvider;
import io.appmetrica.analytics.idsync.impl.r;
import io.appmetrica.analytics.modulesapi.internal.service.ServiceContext;
import io.appmetrica.analytics.networktasks.internal.CommonUrlParts;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final class r implements s {

    /* renamed from: a, reason: collision with root package name */
    public final ServiceContext f4057a;

    /* renamed from: b, reason: collision with root package name */
    public final String f4058b;

    /* renamed from: c, reason: collision with root package name */
    public final String f4059c = CommonUrlParts.ADV_ID;

    /* renamed from: d, reason: collision with root package name */
    public final String f4060d = CommonUrlParts.HUAWEI_OAID;

    /* renamed from: e, reason: collision with root package name */
    public final String f4061e = CommonUrlParts.YANDEX_ADV_ID;

    /* renamed from: f, reason: collision with root package name */
    public final String f4062f = CommonUrlParts.UUID;

    /* renamed from: g, reason: collision with root package name */
    public final String f4063g = CommonUrlParts.DEVICE_ID;

    /* renamed from: h, reason: collision with root package name */
    public final String f4064h = CommonUrlParts.APP_SET_ID;

    /* renamed from: i, reason: collision with root package name */
    public final long f4065i = TimeUnit.SECONDS.toMillis(60);

    /* renamed from: j, reason: collision with root package name */
    public final long f4066j = 1000;

    /* renamed from: k, reason: collision with root package name */
    public final SystemTimeProvider f4067k = new SystemTimeProvider();

    /* renamed from: l, reason: collision with root package name */
    public final u f4068l;

    public r(ServiceContext serviceContext, String str) {
        this.f4057a = serviceContext;
        this.f4058b = str;
        this.f4068l = new u(serviceContext);
    }

    @Override // io.appmetrica.analytics.idsync.impl.s
    public final void a(final String str, SdkIdentifiers sdkIdentifiers) {
        PlatformIdentifiers platformIdentifiers = this.f4057a.getPlatformIdentifiers();
        AdvertisingIdsHolder identifiers = platformIdentifiers.getAdvIdentifiersProvider().getIdentifiers(this.f4057a.getContext());
        Uri.Builder buildUpon = Uri.parse(this.f4058b).buildUpon();
        AdTrackingInfo adTrackingInfo = identifiers.getGoogle().mAdTrackingInfo;
        if (adTrackingInfo != null) {
            buildUpon.appendQueryParameter(this.f4059c, adTrackingInfo.advId);
        }
        AdTrackingInfo adTrackingInfo2 = identifiers.getHuawei().mAdTrackingInfo;
        if (adTrackingInfo2 != null) {
            buildUpon.appendQueryParameter(this.f4060d, adTrackingInfo2.advId);
        }
        AdTrackingInfo adTrackingInfo3 = identifiers.getYandex().mAdTrackingInfo;
        if (adTrackingInfo3 != null) {
            buildUpon.appendQueryParameter(this.f4061e, adTrackingInfo3.advId);
        }
        buildUpon.appendQueryParameter(this.f4062f, sdkIdentifiers.getUuid());
        buildUpon.appendQueryParameter(this.f4063g, sdkIdentifiers.getDeviceId());
        String id = platformIdentifiers.getAppSetIdProvider().getAppSetId().getId();
        if (id != null) {
            buildUpon.appendQueryParameter(this.f4064h, id);
        }
        final String uri = buildUpon.build().toString();
        final IHandlerExecutor supportIOExecutor = this.f4057a.getExecutorProvider().getSupportIOExecutor();
        final long currentTimeMillis = this.f4067k.currentTimeMillis();
        supportIOExecutor.execute(new Runnable() { // from class: L0.a
            @Override // java.lang.Runnable
            public final void run() {
                r.a(r.this, uri, str, supportIOExecutor, currentTimeMillis);
            }
        });
    }

    public static final void a(r rVar, String str, String str2, IHandlerExecutor iHandlerExecutor, long j2) {
        long j3 = rVar.f4066j;
        if (rVar.f4068l.a(str, str2)) {
            return;
        }
        rVar.a(str, str2, iHandlerExecutor, j2, 0, j3);
    }

    public static final void a(r rVar, String str, String str2, IHandlerExecutor iHandlerExecutor, long j2, int i2, long j3) {
        int i3 = i2 + 1;
        if (rVar.f4068l.a(str, str2)) {
            return;
        }
        rVar.a(str, str2, iHandlerExecutor, j2, i3, j3);
    }

    public final void a(final String str, final String str2, final IHandlerExecutor iHandlerExecutor, final long j2, final int i2, long j3) {
        final long j4 = j3 * 2;
        if ((this.f4067k.currentTimeMillis() - j2) + j4 <= this.f4065i) {
            iHandlerExecutor.executeDelayed(new Runnable() { // from class: L0.b
                @Override // java.lang.Runnable
                public final void run() {
                    r.a(r.this, str, str2, iHandlerExecutor, j2, i2, j4);
                }
            }, j3);
        }
    }
}
