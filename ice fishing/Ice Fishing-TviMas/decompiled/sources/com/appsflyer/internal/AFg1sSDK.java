package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import java.util.concurrent.TimeUnit;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u0000 \u00142\u00020\u0001:\u0001\u0014B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\r\u0010\t\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\r\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u000eR\u001b\u0010\f\u001a\u00020\u000b8GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u0010\u0010\u0011\u001a\u0004\b\u0012\u0010\rR\u001b\u0010\t\u001a\u00020\u000b8GX\u0087\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\u0011\u001a\u0004\b\u0010\u0010\rR\u0014\u0010\u0012\u001a\u00020\u00048\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013"}, d2 = {"Lcom/appsflyer/internal/AFg1sSDK;", "", "Lcom/appsflyer/internal/AFd1qSDK;", "p0", "Lcom/appsflyer/internal/AFg1vSDK;", "p1", "<init>", "(Lcom/appsflyer/internal/AFd1qSDK;Lcom/appsflyer/internal/AFg1vSDK;)V", "", "AFAdRevenueData", "()J", "", "getRevenue", "()Z", "Lcom/appsflyer/internal/AFd1qSDK;", "getMonetizationNetwork", "getMediationNetwork", "Lkotlin/Lazy;", "getCurrencyIso4217Code", "Lcom/appsflyer/internal/AFg1vSDK;", "AFa1vSDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AFg1sSDK {
    private static final long getRevenue = TimeUnit.HOURS.toSeconds(24);

    /* renamed from: AFAdRevenueData, reason: from kotlin metadata */
    private final AFd1qSDK getMonetizationNetwork;
    private final AFg1vSDK getCurrencyIso4217Code;

    /* renamed from: getMediationNetwork, reason: from kotlin metadata */
    private final Lazy getRevenue;

    /* renamed from: getMonetizationNetwork, reason: from kotlin metadata */
    private final Lazy AFAdRevenueData;

    public AFg1sSDK(AFd1qSDK aFd1qSDK, AFg1vSDK aFg1vSDK) {
        Intrinsics.checkNotNullParameter(aFd1qSDK, "");
        Intrinsics.checkNotNullParameter(aFg1vSDK, "");
        this.getMonetizationNetwork = aFd1qSDK;
        this.getCurrencyIso4217Code = aFg1vSDK;
        this.getRevenue = LazyKt.lazy(new Function0<Boolean>() { // from class: com.appsflyer.internal.AFg1sSDK.2
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: getRevenue, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(Boolean.parseBoolean(AFg1sSDK.this.getMonetizationNetwork.getRevenue("com.appsflyer.rc.sandbox")));
            }

            {
                super(0);
            }
        });
        this.AFAdRevenueData = LazyKt.lazy(new Function0<Boolean>() { // from class: com.appsflyer.internal.AFg1sSDK.5
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: AFAdRevenueData, reason: merged with bridge method [inline-methods] */
            public final Boolean invoke() {
                return Boolean.valueOf(Boolean.parseBoolean(AFg1sSDK.this.getMonetizationNetwork.getRevenue("com.appsflyer.rc.staging")));
            }

            {
                super(0);
            }
        });
    }

    public final boolean getCurrencyIso4217Code() {
        return ((Boolean) this.getRevenue.getValue()).booleanValue();
    }

    public final boolean getMediationNetwork() {
        return ((Boolean) this.AFAdRevenueData.getValue()).booleanValue();
    }

    public final long AFAdRevenueData() {
        Object m6239constructorimpl;
        String revenue = this.getMonetizationNetwork.getRevenue("com.appsflyer.rc.cache.max-age-fallback");
        if (revenue != null) {
            try {
                Result.Companion companion = Result.INSTANCE;
                AFg1sSDK aFg1sSDK = this;
                m6239constructorimpl = Result.m6239constructorimpl(Long.valueOf(Long.parseLong(revenue)));
            } catch (Throwable th) {
                Result.Companion companion2 = Result.INSTANCE;
                m6239constructorimpl = Result.m6239constructorimpl(ResultKt.createFailure(th));
            }
            Throwable m6242exceptionOrNullimpl = Result.m6242exceptionOrNullimpl(m6239constructorimpl);
            if (m6242exceptionOrNullimpl != null) {
                AFLogger.afErrorLog("Can't read maxAgeFallback from Manifest: " + m6242exceptionOrNullimpl.getMessage(), m6242exceptionOrNullimpl);
                m6239constructorimpl = Long.valueOf(getRevenue);
            }
            return ((Number) m6239constructorimpl).longValue();
        }
        return getRevenue;
    }

    public final boolean getRevenue() {
        AFi1uSDK aFi1uSDK;
        AFi1vSDK aFi1vSDK = this.getCurrencyIso4217Code.getRevenue;
        if (aFi1vSDK == null) {
            AFh1uSDK.i$default(AFLogger.INSTANCE, AFh1vSDK.REMOTE_CONTROL, "active config is missing - fetching from CDN", false, 4, null);
            return true;
        }
        AFh1cSDK aFh1cSDK = aFi1vSDK.getRevenue;
        return ((aFh1cSDK == null || (aFi1uSDK = aFh1cSDK.getCurrencyIso4217Code) == null) ? false : aFi1uSDK.getCurrencyIso4217Code()) || System.currentTimeMillis() - this.getCurrencyIso4217Code.getCurrencyIso4217Code > TimeUnit.SECONDS.toMillis(this.getCurrencyIso4217Code.getMonetizationNetwork);
    }
}
