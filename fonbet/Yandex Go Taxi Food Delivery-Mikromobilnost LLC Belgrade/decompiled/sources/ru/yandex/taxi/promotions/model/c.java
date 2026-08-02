package ru.yandex.taxi.promotions.model;

import defpackage.auu0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.myi;
import defpackage.ny61;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.promotions.model.PromotionBackground;

/* loaded from: classes9.dex */
public final /* synthetic */ class c implements uxs {
    public static final c a;
    private static final SerialDescriptor descriptor;

    static {
        c cVar = new c();
        a = cVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.promotions.model.PromotionBackground", cVar, 5);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("content", true);
        pluginGeneratedSerialDescriptor.j("accessibility_info", true);
        pluginGeneratedSerialDescriptor.j("loop", true);
        pluginGeneratedSerialDescriptor.j("thumbnail", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{PromotionBackground.f[0].getValue(), auu0Var, qke.n(auu0Var), z96.a, auu0Var};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = PromotionBackground.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        boolean z2 = false;
        PromotionBackground.Type type = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                type = (PromotionBackground.Type) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), type);
                i |= 1;
            } else if (v == 1) {
                str = b.k(serialDescriptor, 1);
                i |= 2;
            } else if (v == 2) {
                str2 = (String) b.s(serialDescriptor, 2, auu0.a, str2);
                i |= 4;
            } else if (v == 3) {
                z2 = b.C(serialDescriptor, 3);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                str3 = b.k(serialDescriptor, 4);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new PromotionBackground(i, type, str, str2, z2, str3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        PromotionBackground promotionBackground = (PromotionBackground) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = PromotionBackground.f;
        if (b.F() || promotionBackground.a != PromotionBackground.Type.UNKNOWN) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), promotionBackground.a);
        }
        if (b.F() || !jl40.l(promotionBackground.b, "")) {
            b.o(serialDescriptor, 1, promotionBackground.b);
        }
        if (b.F() || promotionBackground.c != null) {
            b.g(serialDescriptor, 2, auu0.a, promotionBackground.c);
        }
        if (b.F() || promotionBackground.d) {
            b.n(serialDescriptor, 3, promotionBackground.d);
        }
        if (b.F() || !jl40.l(promotionBackground.e, "")) {
            b.o(serialDescriptor, 4, promotionBackground.e);
        }
        b.c(serialDescriptor);
    }
}
