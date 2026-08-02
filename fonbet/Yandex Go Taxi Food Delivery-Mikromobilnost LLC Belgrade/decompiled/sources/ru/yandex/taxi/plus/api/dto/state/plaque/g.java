package ru.yandex.taxi.plus.api.dto.state.plaque;

import defpackage.auu0;
import defpackage.i3y;
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
import ru.yandex.taxi.plus.api.dto.state.plaque.ElementLevelDto;

/* loaded from: classes6.dex */
public final /* synthetic */ class g implements uxs {
    public static final g a;
    private static final SerialDescriptor descriptor;

    static {
        g gVar = new g();
        a = gVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.plus.api.dto.state.plaque.ElementLevelDto", gVar, 3);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("widget_id", true);
        pluginGeneratedSerialDescriptor.j("widget_group_id", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{ElementLevelDto.d[0].getValue(), qke.n(auu0Var), qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = ElementLevelDto.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        ElementLevelDto.Type type = null;
        String str = null;
        String str2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                type = (ElementLevelDto.Type) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), type);
                i |= 1;
            } else if (v == 1) {
                str = (String) b.s(serialDescriptor, 1, auu0.a, str);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                str2 = (String) b.s(serialDescriptor, 2, auu0.a, str2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new ElementLevelDto(i, type, str, str2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        ElementLevelDto elementLevelDto = (ElementLevelDto) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = ElementLevelDto.d;
        if (b.F() || elementLevelDto.a != ElementLevelDto.Type.NONE) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), elementLevelDto.a);
        }
        if (b.F() || elementLevelDto.b != null) {
            b.g(serialDescriptor, 1, auu0.a, elementLevelDto.b);
        }
        if (b.F() || elementLevelDto.c != null) {
            b.g(serialDescriptor, 2, auu0.a, elementLevelDto.c);
        }
        b.c(serialDescriptor);
    }
}
