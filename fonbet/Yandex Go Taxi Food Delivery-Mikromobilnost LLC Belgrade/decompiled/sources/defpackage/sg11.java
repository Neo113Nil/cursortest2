package defpackage;

import com.yandex.go.trusted_contacts.data.entities.network.TrustedContactsErrorActionDto;
import kotlinx.serialization.KSerializer;

/* loaded from: classes14.dex */
public final class sg11 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = TrustedContactsErrorActionDto.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
