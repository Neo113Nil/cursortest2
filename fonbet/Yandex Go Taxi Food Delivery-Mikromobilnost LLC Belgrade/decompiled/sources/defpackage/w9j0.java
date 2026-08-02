package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.shortcuts.dto.response.RequiredAccount;

/* loaded from: classes10.dex */
public final class w9j0 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = RequiredAccount.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
