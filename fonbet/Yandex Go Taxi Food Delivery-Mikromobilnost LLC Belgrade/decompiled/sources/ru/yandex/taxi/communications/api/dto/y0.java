package ru.yandex.taxi.communications.api.dto;

import defpackage.auu0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.myi;
import defpackage.ny61;
import defpackage.qke;
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
import ru.yandex.taxi.communications.api.dto.TypedContentWidget;

/* loaded from: classes9.dex */
public final /* synthetic */ class y0 implements uxs {
    public static final y0 a;
    private static final SerialDescriptor descriptor;

    static {
        y0 y0Var = new y0();
        a = y0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.communications.api.dto.TypedContentWidget", y0Var, 4);
        pluginGeneratedSerialDescriptor.j("content", true);
        pluginGeneratedSerialDescriptor.j("color", true);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("attributed_text", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = TypedContentWidget.e;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, qke.n(auu0Var), i3yVarArr[2].getValue(), w7s.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = TypedContentWidget.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        TypedContentWidget.Type type = null;
        FormattedText formattedText = null;
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
                type = (TypedContentWidget.Type) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), type);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                formattedText = (FormattedText) b.A(serialDescriptor, 3, w7s.a, formattedText);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new TypedContentWidget(i, str, str2, type, formattedText);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        TypedContentWidget typedContentWidget = (TypedContentWidget) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = TypedContentWidget.e;
        if (b.F() || !jl40.l(typedContentWidget.a, "")) {
            b.o(serialDescriptor, 0, typedContentWidget.a);
        }
        if (b.F() || typedContentWidget.b != null) {
            b.g(serialDescriptor, 1, auu0.a, typedContentWidget.b);
        }
        if (b.F() || typedContentWidget.c != TypedContentWidget.Type.SMALL) {
            b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), typedContentWidget.c);
        }
        if (b.F() || !jl40.l(typedContentWidget.d, FormattedText.c)) {
            b.e(serialDescriptor, 3, w7s.a, typedContentWidget.d);
        }
        b.c(serialDescriptor);
    }
}
