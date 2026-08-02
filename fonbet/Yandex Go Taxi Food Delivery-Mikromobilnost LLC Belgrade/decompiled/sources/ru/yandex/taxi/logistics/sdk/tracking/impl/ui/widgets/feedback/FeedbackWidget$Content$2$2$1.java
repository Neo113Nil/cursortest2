package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.feedback;

import defpackage.cuq;
import defpackage.fsx;
import defpackage.kcz0;
import defpackage.tls;
import defpackage.tn;
import defpackage.v4r0;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.EmptySet;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlinx.coroutines.flow.r0;
import ru.yandex.taxi.logistics.sdk.tracking.domain.impl.data.LocalFeedbackRepository;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class FeedbackWidget$Content$2$2$1 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        fsx fsxVar;
        List list;
        cuq cuqVar = (cuq) obj;
        e eVar = (e) this.receiver;
        LocalFeedbackRepository localFeedbackRepository = eVar.e;
        Set set = (Set) localFeedbackRepository.a.getValue();
        if (set == null) {
            List a = eVar.c.a();
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : a) {
                if (obj2 instanceof tn) {
                    arrayList.add(obj2);
                }
            }
            tn tnVar = (tn) kotlin.collections.a.R(arrayList);
            set = (tnVar == null || (fsxVar = tnVar.d) == null || (list = fsxVar.c) == null) ? null : kotlin.collections.a.N0(list);
            if (set == null) {
                set = EmptySet.a;
            }
        }
        boolean z = cuqVar.e;
        String str = cuqVar.a;
        Iterable g = z ? v4r0.g(set, Collections.singleton(str)) : v4r0.h(set, Collections.singleton(str));
        r0 r0Var = localFeedbackRepository.a;
        r0Var.getClass();
        r0Var.m(null, g);
        List J0 = kotlin.collections.a.J0(g);
        kcz0 kcz0Var = eVar.g;
        if (((Boolean) eVar.f.e.getValue()).booleanValue()) {
            kcz0Var.x("CanceledOrderCard.Tapped", kotlin.collections.b.i(new Pair("checkbox_name", "cancellation_reasons"), new Pair("chosen_cancellation_reasons", kotlin.collections.a.J0(J0))));
        } else {
            Integer num = (Integer) localFeedbackRepository.c.getValue();
            if ((num != null ? num.intValue() : 0) == 5) {
                kcz0Var.x("CanceledOrderCard.Tapped", kotlin.collections.b.i(new Pair("tag_name", "feedback_tags"), new Pair("chosen_feedback_tags", kotlin.collections.a.J0(J0))));
            } else {
                kcz0Var.x("CanceledOrderCard.Tapped", kotlin.collections.b.i(new Pair("checkbox_name", "feedback_reasons"), new Pair("chosen_feedback_reasons", kotlin.collections.a.J0(J0))));
            }
        }
        return zy11.a;
    }
}
