package ru.yandex.taxi.plus.api.dto.state.plaque_v2.display;

import defpackage.h6w;
import defpackage.i3y;
import defpackage.myi;
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
public final /* synthetic */ class b implements uxs {
    public static final b a;
    private static final SerialDescriptor descriptor;

    static {
        b bVar = new b();
        a = bVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.plus.api.dto.state.plaque_v2.display.ShapeSettings.CornerSettings", bVar, 2);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("height_fix", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{ShapeSettings.CornerSettings.c[0].getValue(), h6w.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = ShapeSettings.CornerSettings.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        int i2 = 0;
        ShapeSettings.CornerSettings.Type type = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                type = (ShapeSettings.CornerSettings.Type) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), type);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                i2 = b.h(serialDescriptor, 1);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new ShapeSettings.CornerSettings(i, type, i2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ShapeSettings.CornerSettings cornerSettings = (ShapeSettings.CornerSettings) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = ShapeSettings.CornerSettings.c;
        if (b.F() || cornerSettings.a != ShapeSettings.CornerSettings.Type.HALF_HEIGHT) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), cornerSettings.a);
        }
        if (b.F() || cornerSettings.b != 0) {
            b.A(1, cornerSettings.b, serialDescriptor);
        }
        b.c(serialDescriptor);
    }
}
