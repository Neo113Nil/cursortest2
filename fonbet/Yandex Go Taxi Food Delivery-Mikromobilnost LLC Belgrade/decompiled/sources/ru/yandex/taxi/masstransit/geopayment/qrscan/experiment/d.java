package ru.yandex.taxi.masstransit.geopayment.qrscan.experiment;

import defpackage.i3y;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.masstransit.geopayment.qrscan.experiment.TransportQrScannerExperiment;

/* loaded from: classes9.dex */
public final class d {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = TransportQrScannerExperiment.QrTarget.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
