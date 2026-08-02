package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.bottom_dashboard;

import defpackage.d2q0;
import defpackage.o6q0;
import defpackage.qkg;
import defpackage.rcc;
import defpackage.zls;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class BottomDashboardStateHolder$dashboardFlow$1 extends AdaptedFunctionReference implements zls {
    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        List list = (List) obj2;
        a aVar = (a) this.receiver;
        aVar.getClass();
        ListBuilder a = rcc.a();
        List list2 = (List) obj;
        if (!list2.isEmpty()) {
            a.addAll(list2);
        }
        if (list != null) {
            List list3 = list;
            if (!list3.isEmpty()) {
                a.add(new o6q0());
                a.addAll(list3);
            }
        }
        ListBuilder j = a.j();
        if (j.isEmpty()) {
            return null;
        }
        aVar.a.getClass();
        return new qkg(d2q0.a(j), null, null, null, 30);
    }
}
