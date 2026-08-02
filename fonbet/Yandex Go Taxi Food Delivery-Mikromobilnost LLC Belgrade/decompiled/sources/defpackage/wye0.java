package defpackage;

import java.util.Set;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.surge.models.dto.PriceComplainParam$Source;

/* loaded from: classes6.dex */
public final /* synthetic */ class wye0 implements uxs {
    public static final wye0 a;
    private static final SerialDescriptor descriptor;

    static {
        wye0 wye0Var = new wye0();
        a = wye0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.surge.models.dto.PriceComplainParam", wye0Var, 5);
        pluginGeneratedSerialDescriptor.j("offer_id", false);
        pluginGeneratedSerialDescriptor.j("source", false);
        pluginGeneratedSerialDescriptor.j("selected_classes", false);
        pluginGeneratedSerialDescriptor.j("selected_reasons", false);
        pluginGeneratedSerialDescriptor.j("comment", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = zye0.f;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, i3yVarArr[1].getValue(), i3yVarArr[2].getValue(), qke.n((KSerializer) i3yVarArr[3].getValue()), qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = zye0.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        PriceComplainParam$Source priceComplainParam$Source = null;
        Set set = null;
        Set set2 = null;
        String str2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                priceComplainParam$Source = (PriceComplainParam$Source) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), priceComplainParam$Source);
                i |= 2;
            } else if (v == 2) {
                set = (Set) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), set);
                i |= 4;
            } else if (v == 3) {
                set2 = (Set) b.s(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), set2);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                str2 = (String) b.s(serialDescriptor, 4, auu0.a, str2);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new zye0(i, str, priceComplainParam$Source, set, set2, str2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        zye0 zye0Var = (zye0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = zye0.f;
        b.o(serialDescriptor, 0, zye0Var.a);
        b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), zye0Var.b);
        b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), zye0Var.c);
        b.g(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), zye0Var.d);
        b.g(serialDescriptor, 4, auu0.a, zye0Var.e);
        b.c(serialDescriptor);
    }
}
