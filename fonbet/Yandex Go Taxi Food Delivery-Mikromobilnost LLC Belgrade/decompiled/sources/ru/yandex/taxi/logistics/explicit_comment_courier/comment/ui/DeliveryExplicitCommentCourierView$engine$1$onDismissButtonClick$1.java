package ru.yandex.taxi.logistics.explicit_comment_courier.comment.ui;

import defpackage.p8i;
import defpackage.s8i;
import defpackage.sls;
import defpackage.wth;
import defpackage.zch;
import defpackage.zy11;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class DeliveryExplicitCommentCourierView$engine$1$onDismissButtonClick$1 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        s8i s8iVar = (s8i) this.receiver;
        zch zchVar = s8iVar.z;
        String a = s8iVar.y.a();
        zchVar.getClass();
        if (a.length() == 0) {
            a = null;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        if (a != null) {
            linkedHashMap.put("comment", a);
        }
        linkedHashMap.put("is_with_pictures", Boolean.FALSE);
        linkedHashMap.put("pictures_amt", 0);
        zchVar.l("Summary.SummaryCard.CommentToCourierCard.SkipCargoCommentButton.Tapped", linkedHashMap);
        ((p8i) s8iVar.Dg()).close();
        s8iVar.Kg();
        s8iVar.A.a.r(new wth(19));
        return zy11.a;
    }
}
