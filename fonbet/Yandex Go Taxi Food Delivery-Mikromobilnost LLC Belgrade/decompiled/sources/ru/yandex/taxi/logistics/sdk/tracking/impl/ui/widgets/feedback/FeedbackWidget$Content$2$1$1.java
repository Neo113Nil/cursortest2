package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.feedback;

import defpackage.gw00;
import defpackage.tls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.logistics.sdk.tracking.domain.impl.data.LocalFeedbackRepository;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class FeedbackWidget$Content$2$1$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        int intValue = ((Number) obj).intValue();
        e eVar = (e) this.receiver;
        eVar.getClass();
        eVar.g.x("SharedOrderCard.Tapped", gw00.e(new Pair("button_name", "feedback")));
        LocalFeedbackRepository localFeedbackRepository = eVar.e;
        Integer valueOf = Integer.valueOf(intValue);
        r0 r0Var = localFeedbackRepository.c;
        r0Var.getClass();
        r0Var.m(null, valueOf);
        return zy11.a;
    }
}
