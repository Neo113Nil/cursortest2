package ru.yandex.taxi.plus.api.dto.state.plaque;

import defpackage.auu0;
import defpackage.h6w;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.myi;
import defpackage.ny61;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.plus.api.dto.state.plaque.DisplayWidgetRules;

/* loaded from: classes6.dex */
public final /* synthetic */ class e implements uxs {
    public static final e a;
    private static final SerialDescriptor descriptor;

    static {
        e eVar = new e();
        a = eVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.plus.api.dto.state.plaque.DisplayWidgetRules", eVar, 5);
        pluginGeneratedSerialDescriptor.j("display_rules", true);
        pluginGeneratedSerialDescriptor.j("width_type", true);
        pluginGeneratedSerialDescriptor.j("fix_width", true);
        pluginGeneratedSerialDescriptor.j("horizontal_rule", true);
        pluginGeneratedSerialDescriptor.j("vertical_rule", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = DisplayWidgetRules.f;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{a.a, i3yVarArr[1].getValue(), qke.n(h6w.a), auu0Var, auu0Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = DisplayWidgetRules.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        d dVar = null;
        DisplayWidgetRules.Type type = null;
        Integer num = null;
        String str = null;
        String str2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                dVar = (d) b.A(serialDescriptor, 0, a.a, dVar);
                i |= 1;
            } else if (v == 1) {
                type = (DisplayWidgetRules.Type) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), type);
                i |= 2;
            } else if (v == 2) {
                num = (Integer) b.s(serialDescriptor, 2, h6w.a, num);
                i |= 4;
            } else if (v == 3) {
                str = b.k(serialDescriptor, 3);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                str2 = b.k(serialDescriptor, 4);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new DisplayWidgetRules(i, dVar, type, num, str, str2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        DisplayWidgetRules displayWidgetRules = (DisplayWidgetRules) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = DisplayWidgetRules.f;
        if (b.F() || !jl40.l(displayWidgetRules.a, new d(0))) {
            b.e(serialDescriptor, 0, a.a, displayWidgetRules.a);
        }
        if (b.F() || displayWidgetRules.b != DisplayWidgetRules.Type.FIT) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), displayWidgetRules.b);
        }
        if (b.F() || displayWidgetRules.c != null) {
            b.g(serialDescriptor, 2, h6w.a, displayWidgetRules.c);
        }
        if (b.F() || !jl40.l(displayWidgetRules.d, "")) {
            b.o(serialDescriptor, 3, displayWidgetRules.d);
        }
        if (b.F() || !jl40.l(displayWidgetRules.e, "")) {
            b.o(serialDescriptor, 4, displayWidgetRules.e);
        }
        b.c(serialDescriptor);
    }
}
