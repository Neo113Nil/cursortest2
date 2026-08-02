package ru.yandex.taxi.communications.model.widgets;

import defpackage.auu0;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.w7s;
import defpackage.yjd;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.communications.model.widgets.ActionButton;

/* loaded from: classes5.dex */
public final /* synthetic */ class a0 implements uxs {
    public static final a0 a;
    private static final SerialDescriptor descriptor;

    static {
        a0 a0Var = new a0();
        a = a0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.communications.model.widgets.ActionButton.ModalViewAction", a0Var, 4);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("attributed_text", true);
        pluginGeneratedSerialDescriptor.j("icon_tag", true);
        pluginGeneratedSerialDescriptor.j("button", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, w7s.a, auu0Var, t.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        FormattedText formattedText = null;
        String str2 = null;
        ActionButton.e eVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                formattedText = (FormattedText) b.A(serialDescriptor, 1, w7s.a, formattedText);
                i |= 2;
            } else if (v == 2) {
                str2 = b.k(serialDescriptor, 2);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                eVar = (ActionButton.e) b.A(serialDescriptor, 3, t.a, eVar);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new ActionButton.h(i, str, formattedText, str2, eVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0061, code lost:
    
        if (defpackage.jl40.l(r0, ru.yandex.taxi.communications.model.widgets.ActionButton.e.d) == false) goto L25;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        ActionButton.h hVar = (ActionButton.h) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(hVar.a, "")) {
            b.o(serialDescriptor, 0, hVar.a);
        }
        if (b.F() || !jl40.l(hVar.b, FormattedText.c)) {
            b.e(serialDescriptor, 1, w7s.a, hVar.b);
        }
        if (b.F() || !jl40.l(hVar.c, "")) {
            b.o(serialDescriptor, 2, hVar.c);
        }
        if (!b.F()) {
            ActionButton.e eVar = hVar.d;
            ActionButton.e.Companion.getClass();
        }
        b.e(serialDescriptor, 3, t.a, hVar.d);
        b.c(serialDescriptor);
    }
}
