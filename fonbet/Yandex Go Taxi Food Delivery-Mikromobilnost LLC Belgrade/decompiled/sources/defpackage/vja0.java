package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes9.dex */
public final /* synthetic */ class vja0 implements uxs {
    public static final vja0 a;
    private static final SerialDescriptor descriptor;

    static {
        vja0 vja0Var = new vja0();
        a = vja0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.delivery.experiments.PaymentSelectorScreenDto", vja0Var, 5);
        pluginGeneratedSerialDescriptor.j("screen_title_key", true);
        pluginGeneratedSerialDescriptor.j("screen_subtitle_key", true);
        pluginGeneratedSerialDescriptor.j("screen_header_icon_tag", true);
        pluginGeneratedSerialDescriptor.j("button_text_key", true);
        pluginGeneratedSerialDescriptor.j("list_items", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = xja0.f;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, qke.n(auu0Var), qke.n(auu0Var), auu0Var, i3yVarArr[4].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = xja0.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        List list = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                str2 = (String) b.s(serialDescriptor, 1, auu0.a, str2);
                i |= 2;
            } else if (v == 2) {
                str3 = (String) b.s(serialDescriptor, 2, auu0.a, str3);
                i |= 4;
            } else if (v == 3) {
                str4 = b.k(serialDescriptor, 3);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                list = (List) b.A(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), list);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new xja0(i, str, str2, str3, str4, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        xja0 xja0Var = (xja0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = xja0.f;
        if (b.F() || !jl40.l(xja0Var.a, "")) {
            b.o(serialDescriptor, 0, xja0Var.a);
        }
        if (b.F() || xja0Var.b != null) {
            b.g(serialDescriptor, 1, auu0.a, xja0Var.b);
        }
        if (b.F() || xja0Var.c != null) {
            b.g(serialDescriptor, 2, auu0.a, xja0Var.c);
        }
        if (b.F() || !jl40.l(xja0Var.d, "")) {
            b.o(serialDescriptor, 3, xja0Var.d);
        }
        if (b.F() || !jl40.l(xja0Var.e, EmptyList.a)) {
            b.e(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), xja0Var.e);
        }
        b.c(serialDescriptor);
    }
}
