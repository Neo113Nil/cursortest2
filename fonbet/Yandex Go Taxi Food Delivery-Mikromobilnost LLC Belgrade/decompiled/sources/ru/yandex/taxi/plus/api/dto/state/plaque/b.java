package ru.yandex.taxi.plus.api.dto.state.plaque;

import defpackage.h6w;
import defpackage.ny61;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.plus.api.dto.state.plaque.d;

/* loaded from: classes6.dex */
public final /* synthetic */ class b implements uxs {
    public static final b a;
    private static final SerialDescriptor descriptor;

    static {
        b bVar = new b();
        a = bVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.plus.api.dto.state.plaque.DisplayRules.IndentRules", bVar, 4);
        pluginGeneratedSerialDescriptor.j("indent_left", true);
        pluginGeneratedSerialDescriptor.j("indent_right", true);
        pluginGeneratedSerialDescriptor.j("indent_bottom", true);
        pluginGeneratedSerialDescriptor.j("indent_top", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        h6w h6wVar = h6w.a;
        return new KSerializer[]{h6wVar, h6wVar, h6wVar, h6wVar};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                i2 = b.h(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                i3 = b.h(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                i4 = b.h(serialDescriptor, 2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                i5 = b.h(serialDescriptor, 3);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new d.a(i, i2, i3, i4, i5);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        d.a aVar = (d.a) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || aVar.a != 0) {
            b.A(0, aVar.a, serialDescriptor);
        }
        if (b.F() || aVar.b != 0) {
            b.A(1, aVar.b, serialDescriptor);
        }
        if (b.F() || aVar.c != 0) {
            b.A(2, aVar.c, serialDescriptor);
        }
        if (b.F() || aVar.d != 0) {
            b.A(3, aVar.d, serialDescriptor);
        }
        b.c(serialDescriptor);
    }
}
