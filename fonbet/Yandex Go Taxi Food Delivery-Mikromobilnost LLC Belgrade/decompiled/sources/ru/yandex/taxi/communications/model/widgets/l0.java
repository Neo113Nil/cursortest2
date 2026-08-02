package ru.yandex.taxi.communications.model.widgets;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.lq;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.communications.model.widgets.ActionButton;

@gsq0
/* loaded from: classes5.dex */
public final class l0 extends b {
    public static final l0 INSTANCE = new l0();
    public static final /* synthetic */ i3y a = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new lq(21));

    @Override // ru.yandex.taxi.communications.model.widgets.b
    public final ActionButton.ButtonActionType b() {
        return ActionButton.ButtonActionType.SHARE_ROUTE;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }
}
