package ru.yandex.taxi.common_models.net;

import defpackage.auu0;
import defpackage.h6w;
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
public final /* synthetic */ class k implements uxs {
    public static final k a;
    private static final SerialDescriptor descriptor;

    static {
        k kVar = new k();
        a = kVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.common_models.net.FormattedText.Image", kVar, 5);
        pluginGeneratedSerialDescriptor.j("image_tag", true);
        pluginGeneratedSerialDescriptor.j("vertical_alignment", true);
        pluginGeneratedSerialDescriptor.j("color", true);
        pluginGeneratedSerialDescriptor.j("width", true);
        pluginGeneratedSerialDescriptor.j("height", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = FormattedText.d.g;
        auu0 auu0Var = auu0.a;
        h6w h6wVar = h6w.a;
        return new KSerializer[]{auu0Var, i3yVarArr[1].getValue(), auu0Var, h6wVar, h6wVar};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = FormattedText.d.g;
        b.getClass();
        boolean z = true;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
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
            } else if (v == 2) {
                str2 = b.k(serialDescriptor, 2);
                i |= 4;
            } else if (v == 3) {
                i2 = b.h(serialDescriptor, 3);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                i3 = b.h(serialDescriptor, 4);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new FormattedText.d(i, str, verticalAlignment, str2, i2, i3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        FormattedText.d dVar = (FormattedText.d) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = FormattedText.d.g;
        if (b.F() || !jl40.l(dVar.a, "")) {
            b.o(serialDescriptor, 0, dVar.a);
        }
        if (b.F() || dVar.b != FormattedText.VerticalAlignment.BASELINE) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), dVar.b);
        }
        if (b.F() || !jl40.l(dVar.c, "")) {
            b.o(serialDescriptor, 2, dVar.c);
        }
        if (b.F() || dVar.d != 0) {
            b.A(3, dVar.d, serialDescriptor);
        }
        if (b.F() || dVar.e != 0) {
            b.A(4, dVar.e, serialDescriptor);
        }
        b.c(serialDescriptor);
    }
}
