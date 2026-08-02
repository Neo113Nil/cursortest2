package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.comment;

import defpackage.gw00;
import defpackage.kcz0;
import defpackage.sls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.logistics.sdk.tracking.impl.data.c;
import ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.feedback.e;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class CommentWidget$Content$2$2$1 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        e eVar = (e) this.receiver;
        c cVar = eVar.f;
        kcz0 kcz0Var = eVar.g;
        if (((Boolean) cVar.e.getValue()).booleanValue()) {
            Pair pair = new Pair("comment_name", "cancellation_comment");
            String str = (String) eVar.e.d.getValue();
            if (str == null) {
                str = "";
            }
            kcz0Var.x("CommentOrder.Tapped", kotlin.collections.b.i(pair, new Pair("input_cancellation_comment", str)));
        } else {
            kcz0Var.x("SharedOrderCard.Tapped", gw00.e(new Pair("button_name", "comment")));
        }
        return zy11.a;
    }
}
