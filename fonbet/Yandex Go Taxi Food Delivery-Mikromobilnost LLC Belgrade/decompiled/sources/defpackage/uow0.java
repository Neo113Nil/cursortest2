package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.surge.models.dto.c0;
import ru.yandex.taxi.surge.models.dto.w;
import ru.yandex.taxi.surge.models.dto.y;
import ru.yandex.taxi.surge.models.dto.z;

/* loaded from: classes6.dex */
public final /* synthetic */ class uow0 implements uxs {
    public static final uow0 a;
    private static final SerialDescriptor descriptor;

    static {
        uow0 uow0Var = new uow0();
        a = uow0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.surge.models.dto.SurgeButtonActionDto.PriceFeedbackModal", uow0Var, 2);
        pluginGeneratedSerialDescriptor.j("price_feedback_modal", true);
        pluginGeneratedSerialDescriptor.j("feedback_sent_successfully", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{z.a, qow0.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        c0 c0Var = null;
        w wVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                c0Var = (c0) b.A(serialDescriptor, 0, z.a, c0Var);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                wVar = (w) b.A(serialDescriptor, 1, qow0.a, wVar);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new y(i, c0Var, wVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        y yVar = (y) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(yVar.a, new c0(0))) {
            b.e(serialDescriptor, 0, z.a, yVar.a);
        }
        if (b.F() || !jl40.l(yVar.b, new w(0))) {
            b.e(serialDescriptor, 1, qow0.a, yVar.b);
        }
        b.c(serialDescriptor);
    }
}
