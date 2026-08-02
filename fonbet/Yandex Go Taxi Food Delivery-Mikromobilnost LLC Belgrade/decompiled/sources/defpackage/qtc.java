package defpackage;

import defpackage.utc;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.common.clid.ClidProvider;

/* loaded from: classes5.dex */
public final /* synthetic */ class qtc implements uxs {
    public static final qtc a;
    private static final SerialDescriptor descriptor;

    static {
        qtc qtcVar = new qtc();
        a = qtcVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.communications.api.dto.CommunicationsParam", qtcVar, 6);
        pluginGeneratedSerialDescriptor.j("communications_on_device", true);
        pluginGeneratedSerialDescriptor.j("media_size_info", true);
        pluginGeneratedSerialDescriptor.j(ClidProvider.STATE, true);
        pluginGeneratedSerialDescriptor.j("supported_activate_conditions", true);
        pluginGeneratedSerialDescriptor.j("supported_actions", true);
        pluginGeneratedSerialDescriptor.j("plus_subscription_info", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = utc.g;
        return new KSerializer[]{i3yVarArr[0].getValue(), nf10.a, rtc.a, i3yVarArr[3].getValue(), i3yVarArr[4].getValue(), qke.n(buc.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = utc.g;
        b.getClass();
        boolean z = true;
        int i = 0;
        List list = null;
        pf10 pf10Var = null;
        utc.a aVar = null;
        List list2 = null;
        List list3 = null;
        utc.b bVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    list = (List) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), list);
                    i |= 1;
                    break;
                case 1:
                    pf10Var = (pf10) b.A(serialDescriptor, 1, nf10.a, pf10Var);
                    i |= 2;
                    break;
                case 2:
                    aVar = (utc.a) b.A(serialDescriptor, 2, rtc.a, aVar);
                    i |= 4;
                    break;
                case 3:
                    list2 = (List) b.A(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), list2);
                    i |= 8;
                    break;
                case 4:
                    list3 = (List) b.A(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), list3);
                    i |= 16;
                    break;
                case 5:
                    bVar = (utc.b) b.s(serialDescriptor, 5, buc.a, bVar);
                    i |= 32;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new utc(i, list, pf10Var, aVar, list2, list3, bVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        utc utcVar = (utc) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = utc.g;
        boolean F = b.F();
        EmptyList emptyList = EmptyList.a;
        int i = 0;
        if (F || !jl40.l(utcVar.a, emptyList)) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), utcVar.a);
        }
        if (b.F() || !jl40.l(utcVar.b, new pf10(i))) {
            b.e(serialDescriptor, 1, nf10.a, utcVar.b);
        }
        if (b.F() || !jl40.l(utcVar.c, new utc.a(null, null, null, null, null, null, 4095))) {
            b.e(serialDescriptor, 2, rtc.a, utcVar.c);
        }
        if (b.F() || !jl40.l(utcVar.d, emptyList)) {
            b.e(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), utcVar.d);
        }
        if (b.F() || !jl40.l(utcVar.e, emptyList)) {
            b.e(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), utcVar.e);
        }
        if (b.F() || !jl40.l(utcVar.f, new utc.b(0))) {
            b.g(serialDescriptor, 5, buc.a, utcVar.f);
        }
        b.c(serialDescriptor);
    }
}
