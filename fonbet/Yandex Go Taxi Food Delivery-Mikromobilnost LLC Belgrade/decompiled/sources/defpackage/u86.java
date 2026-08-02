package defpackage;

import com.yandex.go.places.impl.data.entities.network.bookings.BookingState;
import kotlinx.serialization.KSerializer;

/* loaded from: classes13.dex */
public final class u86 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = BookingState.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
