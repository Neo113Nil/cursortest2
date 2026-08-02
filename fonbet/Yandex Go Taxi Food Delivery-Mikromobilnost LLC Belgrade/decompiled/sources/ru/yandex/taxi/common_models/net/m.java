package ru.yandex.taxi.common_models.net;

import defpackage.auu0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.myi;
import defpackage.ny61;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes9.dex */
public final /* synthetic */ class m implements uxs {
    public static final m a;
    private static final SerialDescriptor descriptor;

    static {
        m mVar = new m();
        a = mVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.common_models.net.FormattedText.ImageUrl", mVar, 3);
        pluginGeneratedSerialDescriptor.j("image_url", true);
        pluginGeneratedSerialDescriptor.j("vertical_alignment", true);
        pluginGeneratedSerialDescriptor.j("color", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = FormattedText.e.e;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, i3yVarArr[1].getValue(), auu0Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = FormattedText.e.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        FormattedText.VerticalAlignment verticalAlignment = null;
        String str2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                verticalAlignment = (FormattedText.VerticalAlignment) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), verticalAlignment);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                str2 = b.k(serialDescriptor, 2);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new FormattedText.e(i, str, verticalAlignment, str2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        FormattedText.e eVar = (FormattedText.e) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = FormattedText.e.e;
        if (b.F() || !jl40.l(eVar.a, "")) {
            b.o(serialDescriptor, 0, eVar.a);
        }
        if (b.F() || eVar.b != FormattedText.VerticalAlignment.BASELINE) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), eVar.b);
        }
        if (b.F() || !jl40.l(eVar.c, "")) {
            b.o(serialDescriptor, 2, eVar.c);
        }
        b.c(serialDescriptor);
    }
}
