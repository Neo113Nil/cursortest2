package ru.yandex.taxi.layers.source;

import defpackage.azx;
import defpackage.byx;
import defpackage.bzx;
import defpackage.ffx;
import defpackage.rol0;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes9.dex */
public abstract class c {
    public final n0 a = ffx.b(0, 1, BufferOverflow.DROP_OLDEST);

    public final kotlinx.coroutines.flow.l a(azx azxVar) {
        return new kotlinx.coroutines.flow.l(new rol0(new BaseLayersResponseRepository$makeRequest$1(this, azxVar, null)), new BaseLayersResponseRepository$getInitLayersResponse$1(2, null));
    }

    public final kotlinx.coroutines.flow.o b(azx azxVar) {
        return new kotlinx.coroutines.flow.o(new rol0(new BaseLayersResponseRepository$makeRequest$1(this, azxVar, null)), new BaseLayersResponseRepository$getLayersResponse$1(3, null));
    }

    public abstract Object c(azx azxVar, Continuation continuation);

    public void d(bzx bzxVar, byx byxVar) {
        this.a.g(bzxVar);
    }
}
