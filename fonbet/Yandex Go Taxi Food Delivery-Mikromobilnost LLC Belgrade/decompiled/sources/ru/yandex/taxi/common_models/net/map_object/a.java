package ru.yandex.taxi.common_models.net.map_object;

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
import ru.yandex.taxi.common_models.net.map_object.AdditionalRequestAction;

/* loaded from: classes5.dex */
public final /* synthetic */ class a implements uxs {
    public static final a a;
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.common_models.net.map_object.AdditionalRequestAction", aVar, 1);
        pluginGeneratedSerialDescriptor.j("request_params", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(b.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        AdditionalRequestAction.AdditionalRequestParams additionalRequestParams = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                additionalRequestParams = (AdditionalRequestAction.AdditionalRequestParams) b.s(serialDescriptor, 0, b.a, additionalRequestParams);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new AdditionalRequestAction(i, additionalRequestParams);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        AdditionalRequestAction additionalRequestAction = (AdditionalRequestAction) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || additionalRequestAction.a != null) {
            b.g(serialDescriptor, 0, b.a, additionalRequestAction.a);
        }
        b.c(serialDescriptor);
    }
}
