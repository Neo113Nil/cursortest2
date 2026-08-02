package io.appmetrica.analytics.impl;

import androidx.annotation.NonNull;
import io.appmetrica.analytics.ecommerce.ECommerceEvent;
import io.appmetrica.analytics.ecommerce.ECommerceScreen;
import java.util.List;

/* renamed from: io.appmetrica.analytics.impl.io, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0355io extends ECommerceEvent {

    @NonNull
    public final C0123am a;
    public final InterfaceC0369j9 b;

    public C0355io(@NonNull ECommerceScreen eCommerceScreen) {
        this(new C0123am(eCommerceScreen), new C0384jo());
    }

    @NonNull
    public final InterfaceC0369j9 a() {
        return this.b;
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent
    @NonNull
    public final String getPublicDescription() {
        return "shown screen info";
    }

    @Override // io.appmetrica.analytics.ecommerce.ECommerceEvent, io.appmetrica.analytics.impl.InterfaceC0321hi
    public final List<C0439ll> toProto() {
        return (List) this.b.fromModel(this);
    }

    public final String toString() {
        return "ShownScreenInfoEvent{screen=" + this.a + ", converter=" + this.b + '}';
    }

    public C0355io(@NonNull C0123am c0123am, @NonNull InterfaceC0369j9 interfaceC0369j9) {
        this.a = c0123am;
        this.b = interfaceC0369j9;
    }
}
