package ru.yandex.taxi.common_models.net.map_object;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.jg11;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes13.dex */
public final class s0 extends z {
    public static final s0 INSTANCE = new s0();
    public static final /* synthetic */ i3y a = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new jg11(19));

    @Override // ru.yandex.taxi.common_models.net.map_object.z
    public final Type a() {
        return Type.UNKNOWN;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }
}
