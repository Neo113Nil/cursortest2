package defpackage;

import java.util.List;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes8.dex */
public final /* synthetic */ class rm20 implements uxs {
    public static final rm20 a;
    private static final SerialDescriptor descriptor;

    static {
        rm20 rm20Var = new rm20();
        a = rm20Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.mob.api.model.MobConfig", rm20Var, 4);
        pluginGeneratedSerialDescriptor.j("config_id", false);
        pluginGeneratedSerialDescriptor.j("algorithm_settings", false);
        pluginGeneratedSerialDescriptor.j("proxy_list", false);
        pluginGeneratedSerialDescriptor.j("apis", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = tm20.e;
        return new KSerializer[]{auu0.a, xk20.a, i3yVarArr[2].getValue(), qke.n((KSerializer) i3yVarArr[3].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = tm20.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        zk20 zk20Var = null;
        List list = null;
        Map map = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                zk20Var = (zk20) b.A(serialDescriptor, 1, xk20.a, zk20Var);
                i |= 2;
            } else if (v == 2) {
                list = (List) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), list);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                map = (Map) b.s(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), map);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new tm20(i, str, zk20Var, list, map);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        tm20 tm20Var = (tm20) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = tm20.e;
        String str = tm20Var.a;
        Map map = tm20Var.d;
        b.o(serialDescriptor, 0, str);
        b.e(serialDescriptor, 1, xk20.a, tm20Var.b);
        b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), tm20Var.c);
        if (b.F() || map != null) {
            b.g(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), map);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
