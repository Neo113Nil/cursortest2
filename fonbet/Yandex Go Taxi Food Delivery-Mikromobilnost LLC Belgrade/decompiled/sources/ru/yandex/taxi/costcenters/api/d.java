package ru.yandex.taxi.costcenters.api;

import defpackage.i3y;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.costcenters.api.CostCenterField;

/* loaded from: classes5.dex */
public final class d {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = CostCenterField.InputFormat.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
