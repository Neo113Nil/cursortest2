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
public final /* synthetic */ class r implements uxs {
    public static final r a;
    private static final SerialDescriptor descriptor;

    static {
        r rVar = new r();
        a = rVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.common_models.net.FormattedText.LineThroughTextDecoration", rVar, 2);
        pluginGeneratedSerialDescriptor.j("style", true);
        pluginGeneratedSerialDescriptor.j("color", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{FormattedText.f.c[0].getValue(), auu0.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = FormattedText.f.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        FormattedText.LineThroughStyle lineThroughStyle = null;
        String str = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                lineThroughStyle = (FormattedText.LineThroughStyle) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), lineThroughStyle);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                str = b.k(serialDescriptor, 1);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new FormattedText.f(i, lineThroughStyle, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        FormattedText.f fVar = (FormattedText.f) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = FormattedText.f.c;
        if (b.F() || fVar.a != FormattedText.LineThroughStyle.DEFAULT) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), fVar.a);
        }
        if (b.F() || !jl40.l(fVar.b, "")) {
            b.o(serialDescriptor, 1, fVar.b);
        }
        b.c(serialDescriptor);
    }
}
