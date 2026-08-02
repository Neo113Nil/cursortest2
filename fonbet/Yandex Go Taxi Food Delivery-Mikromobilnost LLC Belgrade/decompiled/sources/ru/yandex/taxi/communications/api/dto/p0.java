package ru.yandex.taxi.communications.api.dto;

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
import ru.yandex.taxi.communications.api.dto.StoryWidgets;

/* loaded from: classes5.dex */
public final /* synthetic */ class p0 implements uxs {
    public static final p0 a;
    private static final SerialDescriptor descriptor;

    static {
        p0 p0Var = new p0();
        a = p0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.communications.api.dto.StoryWidgets.Action", p0Var, 2);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("payload", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n((KSerializer) q0.c[0].getValue()), qke.n(r0.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = q0.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        StoryWidgets.ActionType actionType = null;
        StoryWidgets.a aVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                actionType = (StoryWidgets.ActionType) b.s(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), actionType);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                aVar = (StoryWidgets.a) b.s(serialDescriptor, 1, r0.a, aVar);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new q0(i, actionType, aVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        q0 q0Var = (q0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        b.g(serialDescriptor, 0, (KSerializer) q0.c[0].getValue(), q0Var.a);
        b.g(serialDescriptor, 1, r0.a, q0Var.b);
        b.c(serialDescriptor);
    }
}
