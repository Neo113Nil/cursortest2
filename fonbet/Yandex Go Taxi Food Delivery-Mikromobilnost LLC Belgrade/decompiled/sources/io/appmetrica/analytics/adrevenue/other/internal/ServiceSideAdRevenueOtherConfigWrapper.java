package io.appmetrica.analytics.adrevenue.other.internal;

import io.appmetrica.analytics.adrevenue.other.impl.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.cprocsp.ACSP.tools.config.ConfigConstants;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\u0018\u0000 \f2\u00020\u0001:\u0001\fB\u0011\b\u0000\u0012\u0006\u0010\t\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0003\u001a\u00020\u0002H\u0016R\u001a\u0010\t\u001a\u00020\u00048\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\r"}, d2 = {"Lio/appmetrica/analytics/adrevenue/other/internal/ServiceSideAdRevenueOtherConfigWrapper;", "", "", "toString", "Lio/appmetrica/analytics/adrevenue/other/impl/j;", "a", "Lio/appmetrica/analytics/adrevenue/other/impl/j;", "getConfig$ad_revenue_other_release", "()Lio/appmetrica/analytics/adrevenue/other/impl/j;", ConfigConstants.CONFIG, "<init>", "(Lio/appmetrica/analytics/adrevenue/other/impl/j;)V", "Companion", "ad-revenue-other_release"}, k = 1, mv = {1, 9, 0})
/* loaded from: classes9.dex */
public final class ServiceSideAdRevenueOtherConfigWrapper {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* renamed from: a, reason: from kotlin metadata */
    private final j config;

    public ServiceSideAdRevenueOtherConfigWrapper(j jVar) {
        this.config = jVar;
    }

    /* renamed from: getConfig$ad_revenue_other_release, reason: from getter */
    public final j getConfig() {
        return this.config;
    }

    public String toString() {
        return "ServiceSideAdRevenueOtherConfigWrapper(config=" + this.config + ')';
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0013\u0010\u0006\u001a\u00020\u0003*\u00020\u0002H\u0000¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lio/appmetrica/analytics/adrevenue/other/internal/ServiceSideAdRevenueOtherConfigWrapper$Companion;", "", "Lio/appmetrica/analytics/adrevenue/other/impl/j;", "Lio/appmetrica/analytics/adrevenue/other/internal/ServiceSideAdRevenueOtherConfigWrapper;", "toWrapper$ad_revenue_other_release", "(Lio/appmetrica/analytics/adrevenue/other/impl/j;)Lio/appmetrica/analytics/adrevenue/other/internal/ServiceSideAdRevenueOtherConfigWrapper;", "toWrapper", "ad-revenue-other_release"}, k = 1, mv = {1, 9, 0})
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final ServiceSideAdRevenueOtherConfigWrapper toWrapper$ad_revenue_other_release(j jVar) {
            return new ServiceSideAdRevenueOtherConfigWrapper(jVar);
        }

        private Companion() {
        }
    }
}
