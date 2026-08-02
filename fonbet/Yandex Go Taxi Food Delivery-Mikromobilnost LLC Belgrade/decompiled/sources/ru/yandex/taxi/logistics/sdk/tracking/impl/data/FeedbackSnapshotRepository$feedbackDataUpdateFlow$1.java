package ru.yandex.taxi.logistics.sdk.tracking.impl.data;

import defpackage.bvq;
import defpackage.ems;
import defpackage.ziq0;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.AdaptedFunctionReference;
import ru.yandex.taxi.logistics.sdk.tracking.domain.api.data.FeedbackType;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class FeedbackSnapshotRepository$feedbackDataUpdateFlow$1 extends AdaptedFunctionReference implements ems {
    @Override // defpackage.ems
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        Integer num = (Integer) obj5;
        return new bvq((FeedbackType) obj2, ((c) this.receiver).a, num, (String) obj3, kotlin.collections.a.J0((Set) obj), (ziq0) obj4);
    }
}
