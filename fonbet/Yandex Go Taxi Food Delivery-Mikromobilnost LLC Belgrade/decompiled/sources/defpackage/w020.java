package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.messenger.domain.MessengerChatOwner;

/* loaded from: classes9.dex */
public final class w020 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = MessengerChatOwner.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
