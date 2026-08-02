package defpackage;

import com.yandex.go.address.models.ZoneAddress;
import com.yandex.go.address.models.ZoneAddress$$serializer;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes14.dex */
public final /* synthetic */ class yzk0 implements uxs {
    public static final yzk0 a;
    private static final SerialDescriptor descriptor;

    static {
        yzk0 yzk0Var = new yzk0();
        a = yzk0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.object.Route", yzk0Var, 2);
        pluginGeneratedSerialDescriptor.j("source_address", true);
        pluginGeneratedSerialDescriptor.j("destinations", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(ZoneAddress$$serializer.INSTANCE), d0l0.f[1].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = d0l0.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        ZoneAddress zoneAddress = null;
        List list = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                zoneAddress = (ZoneAddress) b.s(serialDescriptor, 0, ZoneAddress$$serializer.INSTANCE, zoneAddress);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                list = (List) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new d0l0(i, zoneAddress, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        d0l0 d0l0Var = (d0l0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = d0l0.f;
        if (b.F() || d0l0Var.a != null) {
            b.g(serialDescriptor, 0, ZoneAddress$$serializer.INSTANCE, d0l0Var.a);
        }
        if (b.F() || !jl40.l(d0l0Var.b, EmptyList.a)) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), d0l0Var.b);
        }
        b.c(serialDescriptor);
    }
}
