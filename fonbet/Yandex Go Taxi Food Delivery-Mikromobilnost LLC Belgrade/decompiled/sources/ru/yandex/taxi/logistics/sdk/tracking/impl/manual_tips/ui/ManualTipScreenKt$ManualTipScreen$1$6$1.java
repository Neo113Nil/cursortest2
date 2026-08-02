package ru.yandex.taxi.logistics.sdk.tracking.impl.manual_tips.ui;

import defpackage.af00;
import defpackage.avu0;
import defpackage.sls;
import defpackage.ziq0;
import defpackage.zy11;
import java.math.BigDecimal;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.logistics.sdk.tracking.domain.impl.data.LocalFeedbackRepository;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class ManualTipScreenKt$ManualTipScreen$1$6$1 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        b bVar = (b) this.receiver;
        BigDecimal h = avu0.h((String) bVar.B.getValue());
        af00 af00Var = bVar.z;
        ErrorType errorType = h == null ? ErrorType.INCORRECT_VALUE : h.compareTo(af00Var.c) < 0 ? ErrorType.MORE_TIP_EXPECTED : h.compareTo(af00Var.d) > 0 ? ErrorType.LESS_TIP_EXPECTED : null;
        if (errorType == null) {
            String format = bVar.y.format(h);
            bVar.W("SharedOrderCard.Tapped", kotlin.collections.b.i(new Pair("button_name", "done"), new Pair("tip_input", format)));
            LocalFeedbackRepository localFeedbackRepository = bVar.w;
            ziq0 ziq0Var = new ziq0(af00Var.e, format);
            r0 r0Var = localFeedbackRepository.b;
            r0Var.getClass();
            r0Var.m(null, ziq0Var);
            localFeedbackRepository.e.l(format);
            bVar.b.a.dismiss();
        } else {
            r0 r0Var2 = bVar.C;
            r0Var2.getClass();
            r0Var2.m(null, errorType);
        }
        return zy11.a;
    }
}
