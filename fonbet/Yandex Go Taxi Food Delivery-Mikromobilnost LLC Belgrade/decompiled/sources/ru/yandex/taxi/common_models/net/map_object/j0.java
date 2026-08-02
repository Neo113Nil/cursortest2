package ru.yandex.taxi.common_models.net.map_object;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.w0q0;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes5.dex */
public final class j0 extends z {
    public static final j0 INSTANCE = new j0();
    public static final /* synthetic */ i3y a = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new w0q0(27));

    @Override // ru.yandex.taxi.common_models.net.map_object.z
    public final Type a() {
        return Type.SELECT_SHUTTLE_STOP_POINT;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }
}
