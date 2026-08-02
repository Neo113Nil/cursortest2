package defpackage;

import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes8.dex */
public final /* synthetic */ class shh implements uxs {
    public static final shh a;
    private static final SerialDescriptor descriptor;

    static {
        shh shhVar = new shh();
        a = shhVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.home.plaque.repository.graphql.cache.dto.DefaultPlaqueDto", shhVar, 7);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("rootWidget", false);
        pluginGeneratedSerialDescriptor.j("metricContext", false);
        pluginGeneratedSerialDescriptor.j("notification", false);
        pluginGeneratedSerialDescriptor.j("serviceMeta", false);
        pluginGeneratedSerialDescriptor.j("priority", false);
        pluginGeneratedSerialDescriptor.j("rootPredicate", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = uhh.h;
        return new KSerializer[]{auu0.a, i3yVarArr[1].getValue(), i3yVarArr[2].getValue(), qke.n((KSerializer) i3yVarArr[3].getValue()), i3yVarArr[4].getValue(), h6w.a, qke.n((KSerializer) i3yVarArr[6].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = uhh.h;
        b.getClass();
        Object obj = null;
        boolean z = true;
        int i = 0;
        int i2 = 0;
        String str = null;
        y251 y251Var = null;
        Map map = null;
        rh60 rh60Var = null;
        Map map2 = null;
        hle0 hle0Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    y251Var = (y251) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), y251Var);
                    i |= 2;
                    break;
                case 2:
                    map = (Map) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), map);
                    i |= 4;
                    break;
                case 3:
                    rh60Var = (rh60) b.s(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), rh60Var);
                    i |= 8;
                    break;
                case 4:
                    map2 = (Map) b.A(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), map2);
                    i |= 16;
                    break;
                case 5:
                    i2 = b.h(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    hle0Var = (hle0) b.s(serialDescriptor, 6, (myi) i3yVarArr[6].getValue(), hle0Var);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new uhh(i, str, y251Var, map, rh60Var, map2, i2, hle0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        uhh uhhVar = (uhh) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = uhh.h;
        b.o(serialDescriptor, 0, uhhVar.a);
        b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), uhhVar.b);
        b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), uhhVar.c);
        b.g(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), uhhVar.d);
        b.e(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), uhhVar.e);
        b.A(5, uhhVar.f, serialDescriptor);
        b.g(serialDescriptor, 6, (KSerializer) i3yVarArr[6].getValue(), uhhVar.g);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
