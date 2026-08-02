package ru.yandex.taxi.communications.common.network.api;

import defpackage.atf0;
import defpackage.cmt;
import defpackage.m6x0;
import defpackage.neu;
import defpackage.ouc;
import defpackage.q76;
import defpackage.qg21;
import defpackage.rru0;
import defpackage.rvj0;
import defpackage.s490;
import defpackage.ssf0;
import defpackage.utc;
import defpackage.wqs;
import defpackage.x6v;
import defpackage.z8u;
import kotlin.Metadata;
import ru.yandex.taxi.promotions.model.Promotion;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J+\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\u0004H'¢\u0006\u0004\b\b\u0010\tJ+\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00062\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\nH'¢\u0006\u0004\b\f\u0010\rJ+\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00062\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0001\u0010\u0005\u001a\u00020\nH'¢\u0006\u0004\b\u000f\u0010\rJ)\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00062\b\b\u0001\u0010\u0010\u001a\u00020\u00022\b\b\u0003\u0010\u0012\u001a\u00020\u0011H'¢\u0006\u0004\b\u0014\u0010\u0015¨\u0006\u0016À\u0006\u0003"}, d2 = {"Lru/yandex/taxi/communications/common/network/api/CommunicationsApi;", "", "", "location", "Lutc;", "param", "Lcmt;", "Louc;", "d", "(Ljava/lang/String;Lutc;)Lcmt;", "Lssf0;", "Latf0;", "c", "(Ljava/lang/String;Lssf0;)Lcmt;", "Lru/yandex/taxi/promotions/model/Promotion;", "b", "fileUrl", "Lx6v;", "ignoring", "Lrvj0;", "a", "(Ljava/lang/String;Lx6v;)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface CommunicationsApi {
    @rru0
    @wqs
    cmt<rvj0> a(@qg21 String fileUrl, @m6x0 x6v ignoring);

    @s490("promotions/v1/promotion/retrieve")
    @neu({"themeable: 2"})
    cmt<Promotion> b(@z8u("x-location") String location, @q76 ssf0 param);

    @s490("promotions/v1/list")
    @neu({"themeable: 2"})
    cmt<atf0> c(@z8u("x-location") String location, @q76 ssf0 param);

    @s490("inapp-communications/communications")
    cmt<ouc> d(@z8u("x-location") String location, @q76 utc param);
}
