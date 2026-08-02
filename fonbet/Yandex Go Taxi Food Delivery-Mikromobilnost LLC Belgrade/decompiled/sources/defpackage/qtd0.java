package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.common_models.net.map_object.a0;

/* loaded from: classes5.dex */
public final /* synthetic */ class qtd0 implements uxs {
    public static final qtd0 a;
    private static final SerialDescriptor descriptor;

    static {
        qtd0 qtd0Var = new qtd0();
        a = qtd0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.common_models.net.map_object.PointAdjustmentScreen", qtd0Var, 4);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("button", true);
        pluginGeneratedSerialDescriptor.j("content", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        w7s w7sVar = w7s.a;
        return new KSerializer[]{w7sVar, qke.n(w7sVar), btd0.a, std0.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        FormattedText formattedText = null;
        FormattedText formattedText2 = null;
        dtd0 dtd0Var = null;
        utd0 utd0Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                formattedText = (FormattedText) b.A(serialDescriptor, 0, w7s.a, formattedText);
                i |= 1;
            } else if (v == 1) {
                formattedText2 = (FormattedText) b.s(serialDescriptor, 1, w7s.a, formattedText2);
                i |= 2;
            } else if (v == 2) {
                dtd0Var = (dtd0) b.A(serialDescriptor, 2, btd0.a, dtd0Var);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                utd0Var = (utd0) b.A(serialDescriptor, 3, std0.a, utd0Var);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new a0(i, formattedText, formattedText2, dtd0Var, utd0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x004a, code lost:
    
        if (defpackage.jl40.l(r0, defpackage.dtd0.b) == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0068, code lost:
    
        if (defpackage.jl40.l(r0, defpackage.utd0.d) == false) goto L25;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        a0 a0Var = (a0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        rtd0 rtd0Var = a0.Companion;
        if (b.F() || !jl40.l(a0Var.a, FormattedText.c)) {
            b.e(serialDescriptor, 0, w7s.a, a0Var.a);
        }
        if (b.F() || a0Var.b != null) {
            b.g(serialDescriptor, 1, w7s.a, a0Var.b);
        }
        if (!b.F()) {
            dtd0 dtd0Var = a0Var.c;
            dtd0.Companion.getClass();
        }
        b.e(serialDescriptor, 2, btd0.a, a0Var.c);
        if (!b.F()) {
            utd0 utd0Var = a0Var.d;
            utd0.Companion.getClass();
        }
        b.e(serialDescriptor, 3, std0.a, a0Var.d);
        b.c(serialDescriptor);
    }
}
