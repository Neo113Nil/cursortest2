package defpackage;

import com.yandex.plus.home.feature.webviews.internalapi.bridge.dto.common.OfferTypeDto;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class uv80 implements uxs {
    public static final uv80 a;
    private static final SerialDescriptor descriptor;

    static {
        uv80 uv80Var = new uv80();
        a = uv80Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("SUCCESS_SCREEN_SHOWN", uv80Var, 2);
        pluginGeneratedSerialDescriptor.j("trackId", true);
        pluginGeneratedSerialDescriptor.j("offerType", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(auu0.a), qke.n((KSerializer) wv80.c[1].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = wv80.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        OfferTypeDto offerTypeDto = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                offerTypeDto = (OfferTypeDto) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), offerTypeDto);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new wv80(i, str, offerTypeDto);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        wv80 wv80Var = (wv80) obj;
        OfferTypeDto offerTypeDto = wv80Var.b;
        String str = wv80Var.a;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = wv80.c;
        if (b.F() || str != null) {
            b.g(serialDescriptor, 0, auu0.a, str);
        }
        if (b.F() || offerTypeDto != null) {
            b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), offerTypeDto);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
