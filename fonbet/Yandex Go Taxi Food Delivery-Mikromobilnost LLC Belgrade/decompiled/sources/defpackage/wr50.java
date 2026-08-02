package defpackage;

import com.yandex.plus.home.datasource.openapi.models.NetworkDisplayRulesModel$HorizontalGravity;
import com.yandex.plus.home.datasource.openapi.models.NetworkDisplayRulesModel$VerticalGravity;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes2.dex */
public final /* synthetic */ class wr50 implements uxs {
    public static final wr50 a;
    private static final SerialDescriptor descriptor;

    static {
        wr50 wr50Var = new wr50();
        a = wr50Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.yandex.plus.home.datasource.openapi.models.NetworkDisplayRulesModel", wr50Var, 7);
        pluginGeneratedSerialDescriptor.j("widthType", false);
        pluginGeneratedSerialDescriptor.j("backgroundColors", false);
        pluginGeneratedSerialDescriptor.j("backgroundShape", false);
        pluginGeneratedSerialDescriptor.j("opacity", true);
        pluginGeneratedSerialDescriptor.j("indents", true);
        pluginGeneratedSerialDescriptor.j("horizontalGravity", true);
        pluginGeneratedSerialDescriptor.j("verticalGravity", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = yr50.h;
        return new KSerializer[]{k260.Companion.serializer(), i3yVarArr[1].getValue(), oo50.a, qke.n(h6w.a), qke.n(mv50.a), qke.n((KSerializer) i3yVarArr[5].getValue()), qke.n((KSerializer) i3yVarArr[6].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = yr50.h;
        b.getClass();
        Object obj = null;
        boolean z = true;
        int i = 0;
        k260 k260Var = null;
        List list = null;
        qo50 qo50Var = null;
        Integer num = null;
        ov50 ov50Var = null;
        NetworkDisplayRulesModel$HorizontalGravity networkDisplayRulesModel$HorizontalGravity = null;
        NetworkDisplayRulesModel$VerticalGravity networkDisplayRulesModel$VerticalGravity = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    k260Var = (k260) b.A(serialDescriptor, 0, k260.Companion.serializer(), k260Var);
                    i |= 1;
                    break;
                case 1:
                    list = (List) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list);
                    i |= 2;
                    break;
                case 2:
                    qo50Var = (qo50) b.A(serialDescriptor, 2, oo50.a, qo50Var);
                    i |= 4;
                    break;
                case 3:
                    num = (Integer) b.s(serialDescriptor, 3, h6w.a, num);
                    i |= 8;
                    break;
                case 4:
                    ov50Var = (ov50) b.s(serialDescriptor, 4, mv50.a, ov50Var);
                    i |= 16;
                    break;
                case 5:
                    networkDisplayRulesModel$HorizontalGravity = (NetworkDisplayRulesModel$HorizontalGravity) b.s(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), networkDisplayRulesModel$HorizontalGravity);
                    i |= 32;
                    break;
                case 6:
                    networkDisplayRulesModel$VerticalGravity = (NetworkDisplayRulesModel$VerticalGravity) b.s(serialDescriptor, 6, (myi) i3yVarArr[6].getValue(), networkDisplayRulesModel$VerticalGravity);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new yr50(i, k260Var, list, qo50Var, num, ov50Var, networkDisplayRulesModel$HorizontalGravity, networkDisplayRulesModel$VerticalGravity);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        yr50 yr50Var = (yr50) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = yr50.h;
        KSerializer serializer = k260.Companion.serializer();
        k260 k260Var = yr50Var.a;
        NetworkDisplayRulesModel$VerticalGravity networkDisplayRulesModel$VerticalGravity = yr50Var.g;
        NetworkDisplayRulesModel$HorizontalGravity networkDisplayRulesModel$HorizontalGravity = yr50Var.f;
        ov50 ov50Var = yr50Var.e;
        Integer num = yr50Var.d;
        b.e(serialDescriptor, 0, serializer, k260Var);
        b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), yr50Var.b);
        b.e(serialDescriptor, 2, oo50.a, yr50Var.c);
        if (b.F() || num != null) {
            b.g(serialDescriptor, 3, h6w.a, num);
        }
        if (b.F() || ov50Var != null) {
            b.g(serialDescriptor, 4, mv50.a, ov50Var);
        }
        if (b.F() || networkDisplayRulesModel$HorizontalGravity != null) {
            b.g(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), networkDisplayRulesModel$HorizontalGravity);
        }
        if (b.F() || networkDisplayRulesModel$VerticalGravity != null) {
            b.g(serialDescriptor, 6, (KSerializer) i3yVarArr[6].getValue(), networkDisplayRulesModel$VerticalGravity);
        }
        b.c(serialDescriptor);
    }

    @Override // defpackage.uxs
    public final KSerializer[] typeParametersSerializers() {
        return ooc.d;
    }
}
