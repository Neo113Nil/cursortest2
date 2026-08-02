package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.delivery.experiments.FormType;

/* loaded from: classes9.dex */
public final /* synthetic */ class xjl0 implements uxs {
    public static final xjl0 a;
    private static final SerialDescriptor descriptor;

    static {
        xjl0 xjl0Var = new xjl0();
        a = xjl0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.delivery.experiments.RuleDto", xjl0Var, 2);
        pluginGeneratedSerialDescriptor.j("condition", true);
        pluginGeneratedSerialDescriptor.j("form_type", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr;
        i3yVarArr = zjl0.c;
        return new KSerializer[]{rxd.a, i3yVarArr[1].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3yVarArr = zjl0.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        txd txdVar = null;
        FormType formType = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                txdVar = (txd) b.A(serialDescriptor, 0, rxd.a, txdVar);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                formType = (FormType) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), formType);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new zjl0(i, txdVar, formType);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        zjl0.b((zjl0) obj, b, serialDescriptor);
        b.c(serialDescriptor);
    }
}
