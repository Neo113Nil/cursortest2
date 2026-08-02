package ru.yandex.taxi.logistics.sdk.rental_duration_selector.ui;

import defpackage.scc;
import defpackage.sls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class RentalDurationScreenKt$RentalDurationScreen$2$3$1$1 extends FunctionReferenceImpl implements sls {
    @Override // defpackage.sls
    public final Object invoke() {
        d dVar = (d) this.receiver;
        int intValue = ((Number) dVar.A.getValue()).intValue();
        if (intValue < scc.f(dVar.W())) {
            intValue++;
        }
        dVar.X(intValue);
        return zy11.a;
    }
}
