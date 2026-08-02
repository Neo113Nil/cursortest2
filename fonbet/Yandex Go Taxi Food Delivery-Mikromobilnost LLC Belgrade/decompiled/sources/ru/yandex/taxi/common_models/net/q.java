package ru.yandex.taxi.common_models.net;

import defpackage.i3y;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes5.dex */
public final class q {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = FormattedText.LineThroughStyle.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
