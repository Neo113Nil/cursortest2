package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.feedback;

import defpackage.bvf0;
import defpackage.gw00;
import defpackage.ho;
import defpackage.mfz0;
import defpackage.tje;
import defpackage.tls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class FeedbackWidget$Content$2$3$1 extends FunctionReferenceImpl implements tls {
    public final void i(mfz0 mfz0Var) {
        e eVar = (e) this.receiver;
        eVar.g.x("SharedOrderCard.Tapped", gw00.e(new Pair("chosen_tip", mfz0Var.a())));
        List a = eVar.c.a();
        ArrayList arrayList = new ArrayList();
        for (Object obj : a) {
            if (obj instanceof ho) {
                arrayList.add(obj);
            }
        }
        ho hoVar = (ho) kotlin.collections.a.R(arrayList);
        List list = hoVar != null ? hoVar.c : null;
        if (list == null || mfz0Var.isEmpty()) {
            eVar.b(mfz0Var);
        } else {
            tje.N(bvf0.a(eVar.j.a), null, null, new FeedbackStateHolder$openPaymentsForTips$1(eVar, list, mfz0Var, null), 3);
        }
    }

    @Override // defpackage.tls
    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        i((mfz0) obj);
        return zy11.a;
    }
}
