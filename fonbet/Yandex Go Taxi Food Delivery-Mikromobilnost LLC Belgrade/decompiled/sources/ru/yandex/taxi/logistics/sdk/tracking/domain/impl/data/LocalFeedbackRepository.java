package ru.yandex.taxi.logistics.sdk.tracking.domain.impl.data;

import defpackage.bvf0;
import defpackage.ha2;
import kotlinx.coroutines.flow.r0;

/* loaded from: classes5.dex */
public final class LocalFeedbackRepository {
    public final r0 a;
    public final r0 b;
    public final r0 c;
    public final r0 d;
    public final r0 e;
    public final ha2 f;

    public LocalFeedbackRepository() {
        r0 c = bvf0.c(null);
        this.a = c;
        r0 c2 = bvf0.c(null);
        this.b = c2;
        r0 c3 = bvf0.c(null);
        this.c = c3;
        r0 c4 = bvf0.c(null);
        this.d = c4;
        r0 c5 = bvf0.c(null);
        this.e = c5;
        this.f = kotlinx.coroutines.flow.e.l(c, c2, c3, c4, c5, new LocalFeedbackRepository$currentFeedbackFlow$1(6, this, LocalFeedbackRepository.class, "mapCurrentFeedback", "mapCurrentFeedback(Ljava/util/Set;Lru/yandex/taxi/logistics/sdk/tracking/domain/impl/data/SelectedTip;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Lru/yandex/taxi/logistics/sdk/tracking/domain/impl/models/CurrentFeedbackModel;", 4));
    }
}
