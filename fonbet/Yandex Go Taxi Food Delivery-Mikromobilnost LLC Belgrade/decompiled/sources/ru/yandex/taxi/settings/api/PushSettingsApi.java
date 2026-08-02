package ru.yandex.taxi.settings.api;

import defpackage.bdr0;
import defpackage.cmt;
import defpackage.q76;
import defpackage.qbr0;
import defpackage.s490;
import defpackage.szu0;
import defpackage.zy11;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u001f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H'¢\u0006\u0004\b\u0006\u0010\u0007J#\u0010\u000b\u001a\f\u0012\u0004\u0012\u00020\t0\u0004j\u0002`\n2\b\b\u0001\u0010\u0003\u001a\u00020\bH'¢\u0006\u0004\b\u000b\u0010\f¨\u0006\rÀ\u0006\u0003"}, d2 = {"Lru/yandex/taxi/settings/api/PushSettingsApi;", "", "Lqbr0;", "param", "Lcmt;", "Lbdr0;", "a", "(Lqbr0;)Lcmt;", "Lszu0;", "Lzy11;", "Lru/yandex/taxi/network/api/GoApiEffect;", "b", "(Lszu0;)Lcmt;", "settings"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes6.dex */
public interface PushSettingsApi {
    @s490("communications/push/settings")
    cmt<bdr0> a(@q76 qbr0 param);

    @s490("communications/push/subscribe")
    cmt<zy11> b(@q76 szu0 param);
}
