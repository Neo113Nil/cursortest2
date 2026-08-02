package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.persuggest.api.EditActionDto;

/* loaded from: classes9.dex */
public final class vkn {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = EditActionDto.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
