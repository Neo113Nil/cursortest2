package ru.yandex.taxi.logistics.deliveries.map.android;

import android.content.Context;
import defpackage.f1h0;
import defpackage.qje;
import defpackage.sdi;
import defpackage.tje;
import defpackage.tls;
import defpackage.xng0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.FunctionReferenceImpl;

@Metadata(k = 3, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
final /* synthetic */ class DeliveryPinUpdater$updateDeliveryPin$2 extends FunctionReferenceImpl implements tls {
    @Override // defpackage.tls
    public final Object invoke(Object obj) {
        ru.yandex.taxi.logistics.deliveries.map.data.a aVar = (ru.yandex.taxi.logistics.deliveries.map.data.a) ((sdi) this.receiver);
        Context context = aVar.a;
        return aVar.d(tje.y(f1h0.ic_destination_pin_24, context), qje.t(xng0.controlMinor, context), qje.u(context.getTheme(), xng0.textOnControlMinor), (Continuation) obj);
    }
}
