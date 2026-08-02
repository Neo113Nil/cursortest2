package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.messenger.domain.MessengerChatOwner;

/* loaded from: classes9.dex */
public final /* synthetic */ class y150 implements uxs {
    public static final y150 a;
    private static final SerialDescriptor descriptor;

    static {
        y150 y150Var = new y150();
        a = y150Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.messenger.experiment.NamespaceDefinition", y150Var, 2);
        pluginGeneratedSerialDescriptor.j("namespace", true);
        pluginGeneratedSerialDescriptor.j("chat_owner", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{auu0.a, qke.n((KSerializer) a250.c[1].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = a250.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        MessengerChatOwner messengerChatOwner = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                messengerChatOwner = (MessengerChatOwner) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), messengerChatOwner);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new a250(i, str, messengerChatOwner);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        a250 a250Var = (a250) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = a250.c;
        if (b.F() || !jl40.l(a250Var.a, "")) {
            b.o(serialDescriptor, 0, a250Var.a);
        }
        if (b.F() || a250Var.b != null) {
            b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), a250Var.b);
        }
        b.c(serialDescriptor);
    }
}
