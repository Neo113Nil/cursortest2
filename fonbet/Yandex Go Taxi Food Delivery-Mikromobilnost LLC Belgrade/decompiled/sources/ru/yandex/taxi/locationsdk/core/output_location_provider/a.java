package ru.yandex.taxi.locationsdk.core.output_location_provider;

import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.n;
import ru.yandex.taxi.locationsdk.core.processor_controller.internal.d;

/* loaded from: classes9.dex */
public abstract class a {
    public static final n a(d dVar) {
        return new n(e.e(dVar.k, Integer.MAX_VALUE, BufferOverflow.DROP_OLDEST), new OutputLocationProviderKt$requestLocationUpdatesStartWithLast$1(dVar, null));
    }
}
