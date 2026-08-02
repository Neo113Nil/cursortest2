package ru.yandex.taxi.common_models.net.map_object;

import defpackage.gsq0;
import defpackage.i3y;
import defpackage.xlf0;
import kotlin.LazyThreadSafetyMode;
import kotlinx.serialization.KSerializer;

@gsq0
/* loaded from: classes9.dex */
public final class c0 extends z {
    public static final c0 INSTANCE = new c0();
    public static final /* synthetic */ i3y a = kotlin.a.b(LazyThreadSafetyMode.PUBLICATION, new xlf0(13));

    @Override // ru.yandex.taxi.common_models.net.map_object.z
    public final Type a() {
        return Type.PULL_OUT_OF_ZONE;
    }

    public final KSerializer serializer() {
        return (KSerializer) a.getValue();
    }
}
