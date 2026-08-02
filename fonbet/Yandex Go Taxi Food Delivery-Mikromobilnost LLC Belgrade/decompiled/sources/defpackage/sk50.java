package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes5.dex */
public final /* synthetic */ class sk50 implements uxs {
    public static final sk50 a;
    private static final SerialDescriptor descriptor;

    static {
        sk50 sk50Var = new sk50();
        a = sk50Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.maas.api.NearestMetroResponse", sk50Var, 5);
        pluginGeneratedSerialDescriptor.j("stations", true);
        pluginGeneratedSerialDescriptor.j("dropoff_points", true);
        pluginGeneratedSerialDescriptor.j("lines", true);
        pluginGeneratedSerialDescriptor.j("station_screen", true);
        pluginGeneratedSerialDescriptor.j("dropoff_screen", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = uk50.f;
        kcp0 kcp0Var = kcp0.a;
        return new KSerializer[]{i3yVarArr[0].getValue(), i3yVarArr[1].getValue(), i3yVarArr[2].getValue(), kcp0Var, kcp0Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = uk50.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        List list = null;
        List list2 = null;
        List list3 = null;
        mcp0 mcp0Var = null;
        mcp0 mcp0Var2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                list = (List) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), list);
                i |= 1;
            } else if (v == 1) {
                list2 = (List) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list2);
                i |= 2;
            } else if (v == 2) {
                list3 = (List) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), list3);
                i |= 4;
            } else if (v == 3) {
                mcp0Var = (mcp0) b.A(serialDescriptor, 3, kcp0.a, mcp0Var);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                mcp0Var2 = (mcp0) b.A(serialDescriptor, 4, kcp0.a, mcp0Var2);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new uk50(i, list, list2, list3, mcp0Var, mcp0Var2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        uk50 uk50Var = (uk50) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = uk50.f;
        boolean F = b.F();
        EmptyList emptyList = EmptyList.a;
        if (F || !jl40.l(uk50Var.a, emptyList)) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), uk50Var.a);
        }
        if (b.F() || !jl40.l(uk50Var.b, emptyList)) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), uk50Var.b);
        }
        if (b.F() || !jl40.l(uk50Var.c, emptyList)) {
            b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), uk50Var.c);
        }
        if (b.F() || !jl40.l(uk50Var.d, new mcp0(0))) {
            b.e(serialDescriptor, 3, kcp0.a, uk50Var.d);
        }
        if (b.F() || !jl40.l(uk50Var.e, new mcp0(0))) {
            b.e(serialDescriptor, 4, kcp0.a, uk50Var.e);
        }
        b.c(serialDescriptor);
    }
}
