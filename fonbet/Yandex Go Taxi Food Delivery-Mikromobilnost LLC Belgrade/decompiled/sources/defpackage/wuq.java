package defpackage;

import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.scooters.presentation.feedback.data.model.FeedbackSettingsParams$Screen;

/* loaded from: classes6.dex */
public final class wuq {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = FeedbackSettingsParams$Screen.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
