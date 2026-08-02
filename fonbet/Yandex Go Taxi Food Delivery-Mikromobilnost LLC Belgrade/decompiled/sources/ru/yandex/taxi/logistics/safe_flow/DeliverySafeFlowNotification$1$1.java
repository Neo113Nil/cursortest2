package ru.yandex.taxi.logistics.safe_flow;

import defpackage.sls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.yandex.taxi.design.ListItemComponent;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* synthetic */ class DeliverySafeFlowNotification$1$1 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        ((ListItemComponent) this.receiver).clearLeadView();
        return zy11.a;
    }
}
