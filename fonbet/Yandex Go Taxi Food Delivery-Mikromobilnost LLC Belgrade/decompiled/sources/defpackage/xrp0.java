package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class xrp0 implements uxs {
    public static final xrp0 a;
    private static final SerialDescriptor descriptor;

    static {
        xrp0 xrp0Var = new xrp0();
        a = xrp0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.plus.api.dto.SdkStateParam", xrp0Var, 5);
        pluginGeneratedSerialDescriptor.j("include", true);
        pluginGeneratedSerialDescriptor.j("supported_features", false);
        pluginGeneratedSerialDescriptor.j("geo_state", false);
        pluginGeneratedSerialDescriptor.j("size_hint", false);
        pluginGeneratedSerialDescriptor.j("existing_screens", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = zrp0.f;
        return new KSerializer[]{qke.n((KSerializer) i3yVarArr[0].getValue()), i3yVarArr[1].getValue(), qke.n(r1t.a), h6w.a, qke.n((KSerializer) i3yVarArr[4].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = zrp0.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        int i2 = 0;
        List list = null;
        List list2 = null;
        t1t t1tVar = null;
        List list3 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                list = (List) b.s(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), list);
                i |= 1;
            } else if (v == 1) {
                list2 = (List) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list2);
                i |= 2;
            } else if (v == 2) {
                t1tVar = (t1t) b.s(serialDescriptor, 2, r1t.a, t1tVar);
                i |= 4;
            } else if (v == 3) {
                i2 = b.h(serialDescriptor, 3);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                list3 = (List) b.s(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), list3);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new zrp0(i, list, list2, t1tVar, i2, list3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        zrp0 zrp0Var = (zrp0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = zrp0.f;
        if (b.F() || zrp0Var.a != null) {
            b.g(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), zrp0Var.a);
        }
        b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), zrp0Var.b);
        b.g(serialDescriptor, 2, r1t.a, zrp0Var.c);
        b.A(3, zrp0Var.d, serialDescriptor);
        b.g(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), zrp0Var.e);
        b.c(serialDescriptor);
    }
}
