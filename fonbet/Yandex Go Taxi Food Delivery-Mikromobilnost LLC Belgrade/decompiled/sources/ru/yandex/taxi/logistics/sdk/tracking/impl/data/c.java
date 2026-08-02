package ru.yandex.taxi.logistics.sdk.tracking.impl.data;

import defpackage.bvf0;
import defpackage.ha2;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.reprov.x509.PolicyMappingsExtension;

/* loaded from: classes5.dex */
public final class c {
    public final String a;
    public final r0 b;
    public final r0 c;
    public final r0 d;
    public final r0 e;
    public final r0 f;
    public final r0 g;
    public final r0 h;
    public final ha2 i;

    public c(String str) {
        this.a = str;
        r0 c = bvf0.c(null);
        this.b = c;
        r0 c2 = bvf0.c(null);
        this.c = c2;
        m0 m0Var = new m0(c, c2, new FeedbackSnapshotRepository$actualReasonsFlow$1(3, null));
        Boolean bool = Boolean.FALSE;
        r0 c3 = bvf0.c(bool);
        this.d = c3;
        r0 c4 = bvf0.c(bool);
        this.e = c4;
        m0 m0Var2 = new m0(c3, c4, new FeedbackSnapshotRepository$typeFlow$1(3, null));
        r0 c5 = bvf0.c(null);
        this.f = c5;
        r0 c6 = bvf0.c(null);
        this.g = c6;
        r0 c7 = bvf0.c(null);
        this.h = c7;
        this.i = e.l(m0Var, m0Var2, c5, c6, c7, new FeedbackSnapshotRepository$feedbackDataUpdateFlow$1(6, this, c.class, PolicyMappingsExtension.MAP, "map(Ljava/util/Set;Lru/yandex/taxi/logistics/sdk/tracking/domain/api/data/FeedbackType;Ljava/lang/String;Lru/yandex/taxi/logistics/sdk/tracking/domain/impl/data/SelectedTip;Ljava/lang/Integer;)Lru/yandex/taxi/logistics/sdk/tracking/domain/api/data/FeedbackSnapshot;", 4));
    }

    public final void a() {
        Boolean bool = Boolean.TRUE;
        r0 r0Var = this.d;
        r0Var.getClass();
        r0Var.m(null, bool);
    }
}
