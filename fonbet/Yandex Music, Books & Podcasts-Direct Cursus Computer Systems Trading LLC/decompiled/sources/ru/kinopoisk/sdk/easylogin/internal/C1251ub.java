package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.oj;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.ub, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* synthetic */ class C1251ub extends oj implements Function2<Za, Continuation<? super Unit>, Object> {
    public C1251ub(InterfaceC1112kb interfaceC1112kb) {
        super(2, 4, InterfaceC1112kb.class, interfaceC1112kb, "trackShowedEvent", "trackShowedEvent(Lru/kinopoisk/tvauth/discovery/presentation/TvDiscoveryState;)V");
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ((InterfaceC1112kb) this.receiver).trackShowedEvent((Za) obj);
        return Unit.a;
    }
}
