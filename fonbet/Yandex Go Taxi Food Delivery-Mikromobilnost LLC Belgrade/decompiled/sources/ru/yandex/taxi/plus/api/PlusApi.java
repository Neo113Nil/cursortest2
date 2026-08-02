package ru.yandex.taxi.plus.api;

import defpackage.bnd0;
import defpackage.cmt;
import defpackage.djg0;
import defpackage.dsp0;
import defpackage.q76;
import defpackage.r1v0;
import defpackage.ruc0;
import defpackage.s490;
import defpackage.wqs;
import defpackage.ymd0;
import defpackage.z8u;
import defpackage.zrp0;
import defpackage.zy11;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J+\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0001\u0010\u0003\u001a\u00020\u00022\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004H'¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\b\b\u0001\u0010\u000b\u001a\u00020\nH'¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00062\b\b\u0001\u0010\u000f\u001a\u00020\u0004H'¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00130\u00062\b\b\u0003\u0010\u0014\u001a\u00020\u0013H'¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00130\u00062\b\b\u0001\u0010\u0014\u001a\u00020\u0017H'¢\u0006\u0004\b\u0018\u0010\u0019¨\u0006\u001aÀ\u0006\u0003"}, d2 = {"Lru/yandex/taxi/plus/api/PlusApi;", "", "Lzrp0;", "sdkStateParam", "", "visibilityMode", "Lcmt;", "Ldsp0;", "a", "(Lzrp0;Ljava/lang/String;)Lcmt;", "Lymd0;", "body", "Lbnd0;", "c", "(Lymd0;)Lcmt;", "purchaseId", "Lr1v0;", "e", "(Ljava/lang/String;)Lcmt;", "Lzy11;", "param", "d", "(Lzy11;)Lcmt;", "Lruc0;", "b", "(Lruc0;)Lcmt;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes9.dex */
public interface PlusApi {
    @s490("/4.0/sweet-home/v2/sdk-state")
    cmt<dsp0> a(@q76 zrp0 sdkStateParam, @z8u("X-Visibility-Mode") String visibilityMode);

    @s490("/4.0/market-plus-plaque/v1/plaques/taxi/seen")
    cmt<zy11> b(@q76 ruc0 param);

    @s490("/4.0/sweet-home/v1/subscriptions/purchase")
    cmt<bnd0> c(@q76 ymd0 body);

    @s490("/4.0/sweet-home/v1/subscriptions/upgrade")
    cmt<zy11> d(@q76 zy11 param);

    @wqs("/4.0/sweet-home/v1/subscriptions/purchase/status")
    cmt<r1v0> e(@djg0("purchase_id") String purchaseId);
}
