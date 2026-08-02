package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class ysf0 implements uxs {
    public static final ysf0 a;
    private static final SerialDescriptor descriptor;

    static {
        ysf0 ysf0Var = new ysf0();
        a = ysf0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.communications.common.network.dto.PromotionsResponse", ysf0Var, 7);
        pluginGeneratedSerialDescriptor.j("fullscreen_banners", true);
        pluginGeneratedSerialDescriptor.j(kju0.b, true);
        pluginGeneratedSerialDescriptor.j("notifications", true);
        pluginGeneratedSerialDescriptor.j("stories", true);
        pluginGeneratedSerialDescriptor.j("tickets", true);
        pluginGeneratedSerialDescriptor.j("missed_seen", true);
        pluginGeneratedSerialDescriptor.j("typed_experiments", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = atf0.h;
        return new KSerializer[]{i3yVarArr[0].getValue(), i3yVarArr[1].getValue(), i3yVarArr[2].getValue(), i3yVarArr[3].getValue(), i3yVarArr[4].getValue(), i3yVarArr[5].getValue(), qke.n(zn11.Companion.serializer())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = atf0.h;
        b.getClass();
        Object obj = null;
        boolean z = true;
        int i = 0;
        List list = null;
        List list2 = null;
        List list3 = null;
        List list4 = null;
        List list5 = null;
        List list6 = null;
        zn11 zn11Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    list = (List) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), list);
                    i |= 1;
                    break;
                case 1:
                    list2 = (List) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list2);
                    i |= 2;
                    break;
                case 2:
                    list3 = (List) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), list3);
                    i |= 4;
                    break;
                case 3:
                    list4 = (List) b.A(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), list4);
                    i |= 8;
                    break;
                case 4:
                    list5 = (List) b.A(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), list5);
                    i |= 16;
                    break;
                case 5:
                    list6 = (List) b.A(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), list6);
                    i |= 32;
                    break;
                case 6:
                    zn11Var = (zn11) b.s(serialDescriptor, 6, zn11.Companion.serializer(), zn11Var);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new atf0(i, list, list2, list3, list4, list5, list6, zn11Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        atf0 atf0Var = (atf0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = atf0.h;
        boolean F = b.F();
        EmptyList emptyList = EmptyList.a;
        if (F || !jl40.l(atf0Var.a, emptyList)) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), atf0Var.a);
        }
        if (b.F() || !jl40.l(atf0Var.b, emptyList)) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), atf0Var.b);
        }
        if (b.F() || !jl40.l(atf0Var.c, emptyList)) {
            b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), atf0Var.c);
        }
        if (b.F() || !jl40.l(atf0Var.d, emptyList)) {
            b.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), atf0Var.d);
        }
        if (b.F() || !jl40.l(atf0Var.e, emptyList)) {
            b.e(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), atf0Var.e);
        }
        if (b.F() || !jl40.l(atf0Var.f, emptyList)) {
            b.e(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), atf0Var.f);
        }
        if (b.F() || atf0Var.g != null) {
            b.g(serialDescriptor, 6, zn11.Companion.serializer(), atf0Var.g);
        }
        b.c(serialDescriptor);
    }
}
