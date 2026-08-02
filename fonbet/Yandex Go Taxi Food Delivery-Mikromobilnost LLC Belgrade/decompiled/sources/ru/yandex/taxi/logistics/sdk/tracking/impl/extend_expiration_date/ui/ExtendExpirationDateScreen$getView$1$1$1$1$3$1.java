package ru.yandex.taxi.logistics.sdk.tracking.impl.extend_expiration_date.ui;

import defpackage.ffi;
import defpackage.jwh;
import defpackage.lwo;
import defpackage.sls;
import defpackage.tcc;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class ExtendExpirationDateScreen$getView$1$1$1$1$3$1 extends FunctionReferenceImpl implements sls {
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [kotlin.collections.EmptyList] */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v3, types: [java.util.ArrayList] */
    @Override // defpackage.sls
    public final Object invoke() {
        ?? r1;
        List list;
        c cVar = (c) this.receiver;
        lwo lwoVar = (lwo) cVar.D.a.getValue();
        if (lwoVar == null || (list = lwoVar.b) == null) {
            r1 = EmptyList.a;
        } else {
            List list2 = list;
            r1 = new ArrayList(tcc.n(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                r1.add(((ffi) it.next()).a);
            }
        }
        jwh jwhVar = cVar.y.a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("storage_period_expire_date", r1);
        jwhVar.a.o("Delivery.NDD.OrderStatusCard.Prolong.Shown", null, linkedHashMap);
        return zy11.a;
    }
}
