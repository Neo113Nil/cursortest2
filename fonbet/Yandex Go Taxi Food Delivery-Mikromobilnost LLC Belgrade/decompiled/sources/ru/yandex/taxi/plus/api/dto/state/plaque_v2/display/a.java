package ru.yandex.taxi.plus.api.dto.state.plaque_v2.display;

import defpackage.jl40;
import defpackage.ny61;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.plus.api.dto.state.plaque_v2.display.ShapeSettings;

/* loaded from: classes6.dex */
public final /* synthetic */ class a implements uxs {
    public static final a a;
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.plus.api.dto.state.plaque_v2.display.ShapeSettings", aVar, 4);
        pluginGeneratedSerialDescriptor.j("left_top_corner", true);
        pluginGeneratedSerialDescriptor.j("right_top_corner", true);
        pluginGeneratedSerialDescriptor.j("left_bottom_corner", true);
        pluginGeneratedSerialDescriptor.j("right_bottom_corner", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        b bVar = b.a;
        return new KSerializer[]{bVar, bVar, bVar, bVar};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        ShapeSettings.CornerSettings cornerSettings = null;
        ShapeSettings.CornerSettings cornerSettings2 = null;
        ShapeSettings.CornerSettings cornerSettings3 = null;
        ShapeSettings.CornerSettings cornerSettings4 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                cornerSettings = (ShapeSettings.CornerSettings) b.A(serialDescriptor, 0, b.a, cornerSettings);
                i |= 1;
            } else if (v == 1) {
                cornerSettings2 = (ShapeSettings.CornerSettings) b.A(serialDescriptor, 1, b.a, cornerSettings2);
                i |= 2;
            } else if (v == 2) {
                cornerSettings3 = (ShapeSettings.CornerSettings) b.A(serialDescriptor, 2, b.a, cornerSettings3);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                cornerSettings4 = (ShapeSettings.CornerSettings) b.A(serialDescriptor, 3, b.a, cornerSettings4);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new ShapeSettings(i, cornerSettings, cornerSettings2, cornerSettings3, cornerSettings4);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ShapeSettings shapeSettings = (ShapeSettings) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(shapeSettings.a, new ShapeSettings.CornerSettings(0))) {
            b.e(serialDescriptor, 0, b.a, shapeSettings.a);
        }
        if (b.F() || !jl40.l(shapeSettings.b, new ShapeSettings.CornerSettings(0))) {
            b.e(serialDescriptor, 1, b.a, shapeSettings.b);
        }
        if (b.F() || !jl40.l(shapeSettings.c, new ShapeSettings.CornerSettings(0))) {
            b.e(serialDescriptor, 2, b.a, shapeSettings.c);
        }
        if (b.F() || !jl40.l(shapeSettings.d, new ShapeSettings.CornerSettings(0))) {
            b.e(serialDescriptor, 3, b.a, shapeSettings.d);
        }
        b.c(serialDescriptor);
    }
}
