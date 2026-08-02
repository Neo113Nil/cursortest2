package ru.yandex.taxi.communications.model.widgets;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.lq;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.communications.model.widgets.ActionButton;

@gsq0
/* loaded from: classes5.dex */
public final class q extends b {
    public static final q INSTANCE = new q();
    public static final /* synthetic */ i3y a = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new lq(18));

    @Override // ru.yandex.taxi.communications.model.widgets.b
    public final ActionButton.ButtonActionType b() {
        return ActionButton.ButtonActionType.CLOSE_MODAL_VIEW_AND_DECLINE_ROBO_ORDER;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }
}
