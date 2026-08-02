package ru.yandex.taxi.communications.model.widgets;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.lq;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;
import ru.yandex.taxi.communications.model.widgets.ActionButton;

@gsq0
/* loaded from: classes5.dex */
public final class d extends b {
    public static final d INSTANCE = new d();
    public static final /* synthetic */ i3y a = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new lq(15));

    @Override // ru.yandex.taxi.communications.model.widgets.b
    public final ActionButton.ButtonActionType b() {
        return ActionButton.ButtonActionType.ADD_PROMOCODE;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }
}
