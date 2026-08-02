package ru.yandex.taxi.masstransit.geopayment.linkcard.network;

import defpackage.cmt;
import defpackage.nky;
import defpackage.q76;
import defpackage.qky;
import defpackage.s490;
import defpackage.tky;
import defpackage.yky;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\bH'¢\u0006\u0004\b\n\u0010\u000b¨\u0006\fÀ\u0006\u0003"}, d2 = {"Lru/yandex/taxi/masstransit/geopayment/linkcard/network/MtLinkCardApi;", "", "Lnky;", "body", "Lcmt;", "Lqky;", "a", "(Lnky;)Lcmt;", "Ltky;", "Lyky;", "b", "(Ltky;)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface MtLinkCardApi {
    @s490("masstransit-mosmetro-payment-data-proxy/v1/mosmetro/link-card")
    cmt<qky> a(@q76 nky body);

    @s490("masstransit-mosmetro-payment-data-proxy/v1/mosmetro/link-card/status")
    cmt<yky> b(@q76 tky body);
}
