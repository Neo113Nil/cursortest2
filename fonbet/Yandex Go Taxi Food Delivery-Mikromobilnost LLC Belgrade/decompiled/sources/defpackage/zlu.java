package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class zlu implements uxs {
    public static final zlu a;
    private static final SerialDescriptor descriptor;

    static {
        zlu zluVar = new zlu();
        a = zluVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.data.model.HistoryResponse", zluVar, 2);
        pluginGeneratedSerialDescriptor.j("sessions", true);
        pluginGeneratedSerialDescriptor.j("currency_rules", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n((KSerializer) bmu.c[0].getValue()), qke.n(gef.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = bmu.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        List list = null;
        ief iefVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                list = (List) b.s(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), list);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                iefVar = (ief) b.s(serialDescriptor, 1, gef.a, iefVar);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new bmu(i, list, iefVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        bmu bmuVar = (bmu) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = bmu.c;
        if (b.F() || bmuVar.a != null) {
            b.g(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), bmuVar.a);
        }
        if (b.F() || bmuVar.b != null) {
            b.g(serialDescriptor, 1, gef.a, bmuVar.b);
        }
        b.c(serialDescriptor);
    }
}
