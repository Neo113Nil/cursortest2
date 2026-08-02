package ru.yandex.taxi.common_models.net.map_object;

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
import ru.yandex.taxi.common_models.net.map_object.AdditionalRequestAction;

/* loaded from: classes5.dex */
public final /* synthetic */ class b implements uxs {
    public static final b a;
    private static final SerialDescriptor descriptor;

    static {
        b bVar = new b();
        a = bVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.common_models.net.map_object.AdditionalRequestAction.AdditionalRequestParams", bVar, 1);
        pluginGeneratedSerialDescriptor.j("type", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{AdditionalRequestAction.AdditionalRequestParams.b[0].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = AdditionalRequestAction.AdditionalRequestParams.b;
        b.getClass();
        boolean z = true;
        int i = 0;
        AdditionalRequestAction.AdditionalRequestParams.AdditionalRequestParamType additionalRequestParamType = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                additionalRequestParamType = (AdditionalRequestAction.AdditionalRequestParams.AdditionalRequestParamType) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), additionalRequestParamType);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new AdditionalRequestAction.AdditionalRequestParams(i, additionalRequestParamType);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        AdditionalRequestAction.AdditionalRequestParams additionalRequestParams = (AdditionalRequestAction.AdditionalRequestParams) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = AdditionalRequestAction.AdditionalRequestParams.b;
        if (b.F() || additionalRequestParams.a != AdditionalRequestAction.AdditionalRequestParams.AdditionalRequestParamType.UNKNOWN) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), additionalRequestParams.a);
        }
        b.c(serialDescriptor);
    }
}
