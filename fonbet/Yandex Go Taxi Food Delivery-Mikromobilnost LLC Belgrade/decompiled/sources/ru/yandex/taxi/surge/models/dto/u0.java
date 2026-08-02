package ru.yandex.taxi.surge.models.dto;

import defpackage.auu0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.myi;
import defpackage.ny61;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.xow0;
import defpackage.yjd;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.surge.models.dto.SurgeInfoItem$ActionButtonsContent;

/* loaded from: classes6.dex */
public final /* synthetic */ class u0 implements uxs {
    public static final u0 a;
    private static final SerialDescriptor descriptor;

    static {
        u0 u0Var = new u0();
        a = u0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.surge.models.dto.SurgeInfoItem.ActionButtonsContent.ActionButton", u0Var, 4);
        pluginGeneratedSerialDescriptor.j("text", true);
        pluginGeneratedSerialDescriptor.j("style", true);
        pluginGeneratedSerialDescriptor.j("action", true);
        pluginGeneratedSerialDescriptor.j("icon_tag", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = SurgeInfoItem$ActionButtonsContent.a.e;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, i3yVarArr[1].getValue(), xow0.e, qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = SurgeInfoItem$ActionButtonsContent.a.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        SurgeButtonActionDto$ActionButtonStyle surgeButtonActionDto$ActionButtonStyle = null;
        h0 h0Var = null;
        String str2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                surgeButtonActionDto$ActionButtonStyle = (SurgeButtonActionDto$ActionButtonStyle) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), surgeButtonActionDto$ActionButtonStyle);
                i |= 2;
            } else if (v == 2) {
                h0Var = (h0) b.A(serialDescriptor, 2, xow0.e, h0Var);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                str2 = (String) b.s(serialDescriptor, 3, auu0.a, str2);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new SurgeInfoItem$ActionButtonsContent.a(i, str, surgeButtonActionDto$ActionButtonStyle, h0Var, str2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SurgeInfoItem$ActionButtonsContent.a aVar = (SurgeInfoItem$ActionButtonsContent.a) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = SurgeInfoItem$ActionButtonsContent.a.e;
        if (b.F() || !jl40.l(aVar.a, "")) {
            b.o(serialDescriptor, 0, aVar.a);
        }
        if (b.F() || aVar.b != SurgeButtonActionDto$ActionButtonStyle.DEFAULT) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), aVar.b);
        }
        if (b.F() || !jl40.l(aVar.c, g0.INSTANCE)) {
            b.e(serialDescriptor, 2, xow0.e, aVar.c);
        }
        if (b.F() || aVar.d != null) {
            b.g(serialDescriptor, 3, auu0.a, aVar.d);
        }
        b.c(serialDescriptor);
    }
}
