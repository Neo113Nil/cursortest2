package com.appsflyer.internal;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B+\b\u0002\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u00020\t2\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\u0004\u001a\u00020\u00032\b\u0010\u0006\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\r\u0010\u000eR\"\u0010\u0011\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00028\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0016\u0010\n\u001a\u0004\u0018\u00010\u00058\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0012"}, d2 = {"Lcom/appsflyer/internal/AFc1oSDK;", "", "", "", "p0", "Lcom/appsflyer/internal/AFc1hSDK;", "p1", "<init>", "(Ljava/util/Map;Lcom/appsflyer/internal/AFc1hSDK;)V", "", "getMonetizationNetwork", "(Ljava/lang/String;)Z", "", "getMediationNetwork", "(Ljava/lang/String;Ljava/lang/Object;)V", "getCurrencyIso4217Code", "Ljava/util/Map;", "getRevenue", "Lcom/appsflyer/internal/AFc1hSDK;", "AFa1uSDK"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AFc1oSDK {

    /* renamed from: AFa1uSDK, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: getCurrencyIso4217Code, reason: from kotlin metadata */
    final Map<String, Object> getRevenue;
    final AFc1hSDK getMonetizationNetwork;

    private AFc1oSDK(Map<String, Object> map, AFc1hSDK aFc1hSDK) {
        this.getRevenue = map;
        this.getMonetizationNetwork = aFc1hSDK;
    }

    /* synthetic */ AFc1oSDK(Map map, AFc1hSDK aFc1hSDK, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, (i & 2) != 0 ? null : aFc1hSDK);
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\tH\u0007¢\u0006\u0004\b\n\u0010\u000b"}, d2 = {"Lcom/appsflyer/internal/AFc1oSDK$AFa1uSDK;", "", "<init>", "()V", "Lcom/appsflyer/internal/AFa1oSDK;", "p0", "Lcom/appsflyer/internal/AFc1oSDK;", "AFAdRevenueData", "(Lcom/appsflyer/internal/AFa1oSDK;)Lcom/appsflyer/internal/AFc1oSDK;", "Lcom/appsflyer/internal/AFc1hSDK;", "getCurrencyIso4217Code", "(Lcom/appsflyer/internal/AFc1hSDK;)Lcom/appsflyer/internal/AFc1oSDK;"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: com.appsflyer.internal.AFc1oSDK$AFa1uSDK, reason: from kotlin metadata */
    public static final class Companion {
        private Companion() {
        }

        /* JADX WARN: Multi-variable type inference failed */
        @JvmStatic
        public static AFc1oSDK AFAdRevenueData(AFa1oSDK p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            Map<String, Object> monetizationNetwork = p0.getMonetizationNetwork();
            Intrinsics.checkNotNullExpressionValue(monetizationNetwork, "");
            return new AFc1oSDK(monetizationNetwork, null, 2, 0 == true ? 1 : 0);
        }

        @JvmStatic
        public static AFc1oSDK getCurrencyIso4217Code(AFc1hSDK p0) {
            Intrinsics.checkNotNullParameter(p0, "");
            return new AFc1oSDK(new LinkedHashMap(), p0, null);
        }

        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }
    }

    public final void getMediationNetwork(String p0, Object p1) {
        Intrinsics.checkNotNullParameter(p0, "");
        this.getRevenue.put(p0, p1);
        AFc1hSDK aFc1hSDK = this.getMonetizationNetwork;
        if (aFc1hSDK != null) {
            aFc1hSDK.AFAdRevenueData(this.getRevenue);
        }
    }

    public final boolean getMonetizationNetwork(String p0) {
        Intrinsics.checkNotNullParameter(p0, "");
        return this.getRevenue.containsKey(p0);
    }

    public /* synthetic */ AFc1oSDK(Map map, AFc1hSDK aFc1hSDK, DefaultConstructorMarker defaultConstructorMarker) {
        this(map, aFc1hSDK);
    }

    @JvmStatic
    public static final AFc1oSDK AFAdRevenueData(AFc1hSDK aFc1hSDK) {
        return Companion.getCurrencyIso4217Code(aFc1hSDK);
    }

    @JvmStatic
    public static final AFc1oSDK getMediationNetwork(AFa1oSDK aFa1oSDK) {
        return Companion.AFAdRevenueData(aFa1oSDK);
    }
}
