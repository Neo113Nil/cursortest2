package ru.yandex.taxi.summary.promotions.models;

import defpackage.auu0;
import defpackage.f8s0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jsq0;
import defpackage.myi;
import defpackage.ny61;
import defpackage.o8s0;
import defpackage.qke;
import defpackage.si70;
import defpackage.sjd;
import defpackage.ui70;
import defpackage.uxs;
import defpackage.w7s;
import defpackage.yjd;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;
import ru.yandex.taxi.summary.promotions.models.SummaryPromotionsResponse;

/* loaded from: classes6.dex */
public final /* synthetic */ class w0 implements uxs {
    public static final w0 a;
    private static final SerialDescriptor descriptor;

    static {
        w0 w0Var = new w0();
        a = w0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.summary.promotions.models.SummaryPromotionsResponse.PromoModalWindows.ModalWindowsItem.StepsInstructionsItem", w0Var, 7);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("display_on", true);
        pluginGeneratedSerialDescriptor.j("show_policy", true);
        pluginGeneratedSerialDescriptor.j("widgets", true);
        pluginGeneratedSerialDescriptor.j("order_button", true);
        pluginGeneratedSerialDescriptor.j("steps", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = y0.h;
        return new KSerializer[]{auu0.a, w7s.a, qke.n((KSerializer) i3yVarArr[2].getValue()), f8s0.a, a1.a, qke.n(si70.a), qke.n((KSerializer) i3yVarArr[6].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = y0.h;
        b.getClass();
        Object obj = null;
        boolean z = true;
        int i = 0;
        String str = null;
        FormattedText formattedText = null;
        jsq0 jsq0Var = null;
        o8s0 o8s0Var = null;
        SummaryPromotionsResponse.f fVar = null;
        ui70 ui70Var = null;
        List list = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    formattedText = (FormattedText) b.A(serialDescriptor, 1, w7s.a, formattedText);
                    i |= 2;
                    break;
                case 2:
                    jsq0Var = (jsq0) b.s(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), jsq0Var);
                    i |= 4;
                    break;
                case 3:
                    o8s0Var = (o8s0) b.A(serialDescriptor, 3, f8s0.a, o8s0Var);
                    i |= 8;
                    break;
                case 4:
                    fVar = (SummaryPromotionsResponse.f) b.A(serialDescriptor, 4, a1.a, fVar);
                    i |= 16;
                    break;
                case 5:
                    ui70Var = (ui70) b.s(serialDescriptor, 5, si70.a, ui70Var);
                    i |= 32;
                    break;
                case 6:
                    list = (List) b.s(serialDescriptor, 6, (myi) i3yVarArr[6].getValue(), list);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new y0(i, str, formattedText, jsq0Var, o8s0Var, fVar, ui70Var, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        y0 y0Var = (y0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = y0.h;
        if (b.F() || !jl40.l(y0Var.a, "")) {
            b.o(serialDescriptor, 0, y0Var.a);
        }
        if (b.F() || !jl40.l(y0Var.b, FormattedText.c)) {
            b.e(serialDescriptor, 1, w7s.a, y0Var.b);
        }
        if (b.F() || y0Var.c != null) {
            b.g(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), y0Var.c);
        }
        if (b.F() || !jl40.l(y0Var.d, new o8s0(15))) {
            b.e(serialDescriptor, 3, f8s0.a, y0Var.d);
        }
        if (b.F() || !jl40.l(y0Var.e, new SummaryPromotionsResponse.f(0))) {
            b.e(serialDescriptor, 4, a1.a, y0Var.e);
        }
        if (b.F() || y0Var.f != null) {
            b.g(serialDescriptor, 5, si70.a, y0Var.f);
        }
        if (b.F() || y0Var.g != null) {
            b.g(serialDescriptor, 6, (KSerializer) i3yVarArr[6].getValue(), y0Var.g);
        }
        b.c(serialDescriptor);
    }
}
