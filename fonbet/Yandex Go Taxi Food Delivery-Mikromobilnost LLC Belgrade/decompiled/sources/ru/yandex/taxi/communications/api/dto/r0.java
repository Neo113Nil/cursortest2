package ru.yandex.taxi.communications.api.dto;

import defpackage.auu0;
import defpackage.h6w;
import defpackage.jl40;
import defpackage.ny61;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import io.appmetrica.analytics.rtm.internal.Constants;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.communications.api.dto.StoryWidgets;

/* loaded from: classes5.dex */
public final /* synthetic */ class r0 implements uxs {
    public static final r0 a;
    private static final SerialDescriptor descriptor;

    static {
        r0 r0Var = new r0();
        a = r0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.communications.api.dto.StoryWidgets.ActionPayload", r0Var, 9);
        pluginGeneratedSerialDescriptor.j("content", true);
        pluginGeneratedSerialDescriptor.j("need_authorization", true);
        pluginGeneratedSerialDescriptor.j(Constants.KEY_PAGE, true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("text_to_copy", true);
        pluginGeneratedSerialDescriptor.j("inactive_title", true);
        pluginGeneratedSerialDescriptor.j("coupon", true);
        pluginGeneratedSerialDescriptor.j("activated_text", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, z96.a, h6w.a, qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), auu0Var, auu0Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        Object obj = null;
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        int i2 = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
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
                    z2 = b.C(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    i2 = b.h(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    str2 = (String) b.s(serialDescriptor, 3, auu0.a, str2);
                    i |= 8;
                    break;
                case 4:
                    str3 = (String) b.s(serialDescriptor, 4, auu0.a, str3);
                    i |= 16;
                    break;
                case 5:
                    str4 = (String) b.s(serialDescriptor, 5, auu0.a, str4);
                    i |= 32;
                    break;
                case 6:
                    str5 = (String) b.s(serialDescriptor, 6, auu0.a, str5);
                    i |= 64;
                    break;
                case 7:
                    str6 = b.k(serialDescriptor, 7);
                    i |= 128;
                    continue;
                case 8:
                    str7 = b.k(serialDescriptor, 8);
                    i |= 256;
                    continue;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new StoryWidgets.a(i, str, z2, i2, str2, str3, str4, str5, str6, str7);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        StoryWidgets.a aVar = (StoryWidgets.a) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(aVar.a, "")) {
            b.o(serialDescriptor, 0, aVar.a);
        }
        if (b.F() || aVar.b) {
            b.n(serialDescriptor, 1, aVar.b);
        }
        if (b.F() || aVar.c != 0) {
            b.A(2, aVar.c, serialDescriptor);
        }
        if (b.F() || aVar.d != null) {
            b.g(serialDescriptor, 3, auu0.a, aVar.d);
        }
        if (b.F() || aVar.e != null) {
            b.g(serialDescriptor, 4, auu0.a, aVar.e);
        }
        if (b.F() || aVar.f != null) {
            b.g(serialDescriptor, 5, auu0.a, aVar.f);
        }
        if (b.F() || aVar.g != null) {
            b.g(serialDescriptor, 6, auu0.a, aVar.g);
        }
        if (b.F() || !jl40.l(aVar.h, "")) {
            b.o(serialDescriptor, 7, aVar.h);
        }
        if (b.F() || !jl40.l(aVar.i, "")) {
            b.o(serialDescriptor, 8, aVar.i);
        }
        b.c(serialDescriptor);
    }
}
