package ru.yandex.taxi.linked_order.interactor;

/* loaded from: classes9.dex */
public final class i0 {
    public final ru.yandex.taxi.linked_order.provider.d a;

    public i0(ru.yandex.taxi.linked_order.provider.d dVar) {
        this.a = dVar;
    }

    public final kotlinx.coroutines.flow.o a() {
        return new kotlinx.coroutines.flow.o(new h0(this.a.b()), new NotificationLinkedOrderInteractor$notificationsFlow$2(3, null));
    }
}
