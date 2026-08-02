package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.requirements.models.net.OptionViewStyleDto;

/* loaded from: classes9.dex */
public final class uf70 {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = OptionViewStyleDto.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
