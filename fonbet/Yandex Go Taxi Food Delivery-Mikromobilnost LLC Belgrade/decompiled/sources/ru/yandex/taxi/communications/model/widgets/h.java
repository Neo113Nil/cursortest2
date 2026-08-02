package ru.yandex.taxi.communications.model.widgets;

import defpackage.i3y;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.communications.model.widgets.ActionButton;

/* loaded from: classes12.dex */
public final class h {
    public final KSerializer serializer() {
        i3y i3yVar;
        i3yVar = ActionButton.ButtonTextStyle.$cachedSerializer$delegate;
        return (KSerializer) i3yVar.getValue();
    }
}
