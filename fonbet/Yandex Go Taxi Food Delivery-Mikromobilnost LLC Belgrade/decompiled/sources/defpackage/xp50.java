package defpackage;

import com.yandex.plus.home.datasource.openapi.models.NetworkComparePredicateModel$CompareType;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class xp50 implements uxs {
    public static final xp50 a;
    private static final SerialDescriptor descriptor;

    static {
        xp50 xp50Var = new xp50();
        a = xp50Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.home.datasource.openapi.models.NetworkComparePredicateModel", xp50Var, 4);
        pluginGeneratedSerialDescriptor.j("type", false);
        pluginGeneratedSerialDescriptor.j("argName", false);
        pluginGeneratedSerialDescriptor.j("primitiveArg", false);
        pluginGeneratedSerialDescriptor.j("compareType", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = zp50.e;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, xy50.Companion.serializer(), i3yVarArr[3].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = zp50.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        xy50 xy50Var = null;
        NetworkComparePredicateModel$CompareType networkComparePredicateModel$CompareType = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                str2 = b.k(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                xy50Var = (xy50) b.A(serialDescriptor, 2, xy50.Companion.serializer(), xy50Var);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                networkComparePredicateModel$CompareType = (NetworkComparePredicateModel$CompareType) b.A(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), networkComparePredicateModel$CompareType);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new zp50(i, str, str2, xy50Var, networkComparePredicateModel$CompareType);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        zp50 zp50Var = (zp50) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = zp50.e;
        b.o(serialDescriptor, 0, zp50Var.a);
        b.o(serialDescriptor, 1, zp50Var.b);
        b.e(serialDescriptor, 2, xy50.Companion.serializer(), zp50Var.c);
        b.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), zp50Var.d);
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
