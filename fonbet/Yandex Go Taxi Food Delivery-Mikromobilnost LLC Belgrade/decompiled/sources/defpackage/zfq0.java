package defpackage;

import java.util.UUID;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.contacts.SelectedFrom;

/* loaded from: classes5.dex */
public final /* synthetic */ class zfq0 implements uxs {
    public static final zfq0 a;
    private static final SerialDescriptor descriptor;

    static {
        zfq0 zfq0Var = new zfq0();
        a = zfq0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.contacts.SelectedContact", zfq0Var, 4);
        pluginGeneratedSerialDescriptor.j("name", true);
        pluginGeneratedSerialDescriptor.j("phone", true);
        pluginGeneratedSerialDescriptor.j("from", true);
        pluginGeneratedSerialDescriptor.j("id", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = bgq0.e;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, i3yVarArr[2].getValue(), auu0Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = bgq0.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        SelectedFrom selectedFrom = null;
        String str3 = null;
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
                selectedFrom = (SelectedFrom) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), selectedFrom);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                str3 = b.k(serialDescriptor, 3);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new bgq0(i, str, str2, selectedFrom, str3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        bgq0 bgq0Var = (bgq0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = bgq0.e;
        if (b.F() || !jl40.l(bgq0Var.a, "")) {
            b.o(serialDescriptor, 0, bgq0Var.a);
        }
        if (b.F() || !jl40.l(bgq0Var.b, "")) {
            b.o(serialDescriptor, 1, bgq0Var.b);
        }
        if (b.F() || bgq0Var.c != SelectedFrom.STANDALONE) {
            b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), bgq0Var.c);
        }
        if (b.F() || !jl40.l(bgq0Var.d, UUID.randomUUID().toString())) {
            b.o(serialDescriptor, 3, bgq0Var.d);
        }
        b.c(serialDescriptor);
    }
}
