package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.net.taxi.dto.request.EmailParam$Action;

/* loaded from: classes6.dex */
public final /* synthetic */ class yrn implements uxs {
    public static final yrn a;
    private static final SerialDescriptor descriptor;

    static {
        yrn yrnVar = new yrn();
        a = yrnVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.net.taxi.dto.request.EmailParam", yrnVar, 3);
        pluginGeneratedSerialDescriptor.j("id", false);
        pluginGeneratedSerialDescriptor.j("action", false);
        pluginGeneratedSerialDescriptor.j("email", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = bsn.d;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, i3yVarArr[1].getValue(), qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = bsn.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        EmailParam$Action emailParam$Action = null;
        String str2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                emailParam$Action = (EmailParam$Action) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), emailParam$Action);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                str2 = (String) b.s(serialDescriptor, 2, auu0.a, str2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new bsn(i, str, emailParam$Action, str2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        bsn bsnVar = (bsn) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = bsn.d;
        String str = bsnVar.a;
        String str2 = bsnVar.c;
        b.o(serialDescriptor, 0, str);
        b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), bsnVar.b);
        if (b.F() || str2 != null) {
            b.g(serialDescriptor, 2, auu0.a, str2);
        }
        b.c(serialDescriptor);
    }
}
