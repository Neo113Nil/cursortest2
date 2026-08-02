package ru.yandex.taxi.linked_order.api;

import defpackage.cmt;
import defpackage.npy;
import defpackage.q76;
import defpackage.rny;
import defpackage.s490;
import defpackage.tpy;
import defpackage.umy;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH'¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lru/yandex/taxi/linked_order/api/LinkedOrderApi;", "", "Lrny;", "request", "Lcmt;", "Lumy;", "a", "(Lrny;)Lcmt;", "Ltpy;", "Lnpy;", "b", "(Ltpy;)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface LinkedOrderApi {
    @s490("sharedroute/info")
    cmt<umy> a(@q76 rny request);

    @s490("sharedroute/track")
    cmt<npy> b(@q76 tpy request);
}
