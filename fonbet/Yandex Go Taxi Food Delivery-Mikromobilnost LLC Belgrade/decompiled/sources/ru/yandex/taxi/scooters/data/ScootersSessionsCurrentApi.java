package ru.yandex.taxi.scooters.data;

import defpackage.cmt;
import defpackage.djg0;
import defpackage.n851;
import defpackage.rhf;
import defpackage.uau;
import defpackage.wqs;
import java.util.Map;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J?\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t2\u0014\b\u0001\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u00052\b\b\u0003\u0010\b\u001a\u00020\u0007H'¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lru/yandex/taxi/scooters/data/ScootersSessionsCurrentApi;", "", "", "", "headers", "", "isMultiSession", "", "omitPaymentMethods", "Lcmt;", "Lrhf;", "b", "(Ljava/util/Map;ZI)Lcmt;", "base"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface ScootersSessionsCurrentApi {
    @wqs("scooters/external/sessions/current")
    @n851
    cmt<rhf> b(@uau Map<String, String> headers, @djg0("multi_sessions") boolean isMultiSession, @djg0("omit_payment_methods") int omitPaymentMethods);
}
