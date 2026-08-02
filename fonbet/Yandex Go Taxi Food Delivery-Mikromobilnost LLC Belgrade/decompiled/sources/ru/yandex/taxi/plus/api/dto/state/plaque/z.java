package ru.yandex.taxi.plus.api.dto.state.plaque;

import defpackage.auu0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.myi;
import defpackage.ny61;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.plus.api.dto.state.plaque.MicroWidgetPlaqueDto;

/* loaded from: classes6.dex */
public final /* synthetic */ class z implements uxs {
    public static final z a;
    private static final SerialDescriptor descriptor;

    static {
        z zVar = new z();
        a = zVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.plus.api.dto.state.plaque.MicroWidgetPlaqueDto.IconInCornerDto", zVar, 2);
        pluginGeneratedSerialDescriptor.j("icon_url", true);
        pluginGeneratedSerialDescriptor.j("icon_position", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{auu0.a, qke.n((KSerializer) MicroWidgetPlaqueDto.IconInCornerDto.c[1].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = MicroWidgetPlaqueDto.IconInCornerDto.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        MicroWidgetPlaqueDto.IconInCornerDto.Position position = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                position = (MicroWidgetPlaqueDto.IconInCornerDto.Position) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), position);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new MicroWidgetPlaqueDto.IconInCornerDto(i, str, position);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        MicroWidgetPlaqueDto.IconInCornerDto iconInCornerDto = (MicroWidgetPlaqueDto.IconInCornerDto) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = MicroWidgetPlaqueDto.IconInCornerDto.c;
        if (b.F() || !jl40.l(iconInCornerDto.a, "")) {
            b.o(serialDescriptor, 0, iconInCornerDto.a);
        }
        if (b.F() || iconInCornerDto.b != null) {
            b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), iconInCornerDto.b);
        }
        b.c(serialDescriptor);
    }
}
