package defpackage;

import defpackage.jfo0;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class qfo0 implements uxs {
    public static final qfo0 a;
    private static final SerialDescriptor descriptor;

    static {
        qfo0 qfo0Var = new qfo0();
        a = qfo0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.ScootersPassesPurchaseWindowDto.PassSelectionSection.PassElement.Price", qfo0Var, 3);
        pluginGeneratedSerialDescriptor.j("unlock", true);
        pluginGeneratedSerialDescriptor.j("riding", true);
        pluginGeneratedSerialDescriptor.j("parking", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        h6w h6wVar = h6w.a;
        return new KSerializer[]{h6wVar, h6wVar, h6wVar};
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
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                i4 = b.h(serialDescriptor, 2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new jfo0.b.a.C0098b(i, i2, i3, i4);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        jfo0.b.a.C0098b c0098b = (jfo0.b.a.C0098b) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || c0098b.a != 0) {
            b.A(0, c0098b.a, serialDescriptor);
        }
        if (b.F() || c0098b.b != 0) {
            b.A(1, c0098b.b, serialDescriptor);
        }
        if (b.F() || c0098b.c != 0) {
            b.A(2, c0098b.c, serialDescriptor);
        }
        b.c(serialDescriptor);
    }
}
