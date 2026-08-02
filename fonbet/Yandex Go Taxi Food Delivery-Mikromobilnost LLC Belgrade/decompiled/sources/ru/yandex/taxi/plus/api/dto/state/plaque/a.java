package ru.yandex.taxi.plus.api.dto.state.plaque;

import defpackage.i3y;
import defpackage.jl40;
import defpackage.myi;
import defpackage.ny61;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.plus.api.dto.state.plaque.d;
import ru.yandex.taxi.plus.api.dto.state.plaque_v2.display.ShapeSettings;

/* loaded from: classes6.dex */
public final /* synthetic */ class a implements uxs {
    public static final a a;
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.plus.api.dto.state.plaque.DisplayRules", aVar, 3);
        pluginGeneratedSerialDescriptor.j("indent_rules", true);
        pluginGeneratedSerialDescriptor.j("background_color_settings", true);
        pluginGeneratedSerialDescriptor.j("background_shape_settings", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{b.a, d.d[1].getValue(), ru.yandex.taxi.plus.api.dto.state.plaque_v2.display.a.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = d.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        d.a aVar = null;
        List list = null;
        ShapeSettings shapeSettings = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                aVar = (d.a) b.A(serialDescriptor, 0, b.a, aVar);
                i |= 1;
            } else if (v == 1) {
                list = (List) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                shapeSettings = (ShapeSettings) b.A(serialDescriptor, 2, ru.yandex.taxi.plus.api.dto.state.plaque_v2.display.a.a, shapeSettings);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new d(i, aVar, list, shapeSettings);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        d dVar = (d) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = d.d;
        if (b.F() || !jl40.l(dVar.a, new d.a(0))) {
            b.e(serialDescriptor, 0, b.a, dVar.a);
        }
        if (b.F() || !jl40.l(dVar.b, EmptyList.a)) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), dVar.b);
        }
        if (b.F() || !jl40.l(dVar.c, new ShapeSettings(0))) {
            b.e(serialDescriptor, 2, ru.yandex.taxi.plus.api.dto.state.plaque_v2.display.a.a, dVar.c);
        }
        b.c(serialDescriptor);
    }
}
