package ru.yandex.taxi.logistics.sdk.tracking.impl.ui.widgets.completed_state_widgets;

import defpackage.cx90;
import defpackage.qkt0;
import defpackage.rcc;
import defpackage.ryc;
import defpackage.zls;
import kotlin.Metadata;
import kotlin.collections.builders.ListBuilder;
import kotlin.jvm.internal.AdaptedFunctionReference;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class CompletedStateWidgetsStateHolder$widgetModelFlow$1 extends AdaptedFunctionReference implements zls {
    @Override // defpackage.zls
    public final Object invoke(Object obj, Object obj2, Object obj3) {
        ryc rycVar = (ryc) obj;
        cx90 cx90Var = (cx90) obj2;
        ((a) this.receiver).getClass();
        if (rycVar == null) {
            return null;
        }
        ListBuilder a = rcc.a();
        if (cx90Var != null) {
            a.add(cx90Var);
        } else {
            a.add(new qkt0("spacer-key"));
        }
        a.add(rycVar);
        return a.j();
    }
}
