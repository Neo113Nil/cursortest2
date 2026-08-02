package ru.yandex.taxi.persuggest.repository;

import defpackage.b2k;
import defpackage.ffx;
import defpackage.q0t;
import defpackage.q9j0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.n0;

/* loaded from: classes9.dex */
public final class RequestedSourcePointInfoRepositoryImpl implements q9j0 {
    public final n0 a;
    public final b2k b;
    public volatile q0t c;

    public RequestedSourcePointInfoRepositoryImpl() {
        n0 b = ffx.b(1, 0, BufferOverflow.DROP_OLDEST);
        this.a = b;
        this.b = kotlinx.coroutines.flow.e.s(b, new RequestedSourcePointInfoRepositoryImpl$requestedSourcePointInfoFlow$1(2, this, RequestedSourcePointInfoRepositoryImpl.class, "areEquivalent", "areEquivalent(Lru/yandex/taxi/persuggest/repository/RequestedSourcePointInfo;Lru/yandex/taxi/persuggest/repository/RequestedSourcePointInfo;)Z", 0));
    }
}
