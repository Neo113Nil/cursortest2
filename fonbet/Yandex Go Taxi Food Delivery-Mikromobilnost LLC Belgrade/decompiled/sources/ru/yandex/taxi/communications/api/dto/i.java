package ru.yandex.taxi.communications.api.dto;

import com.adjust.sdk.Constants;
import defpackage.auu0;
import defpackage.jl40;
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
import ru.yandex.taxi.communications.api.dto.BannerWidgets;

/* loaded from: classes9.dex */
public final /* synthetic */ class i implements uxs {
    public static final i a;
    private static final SerialDescriptor descriptor;

    static {
        i iVar = new i();
        a = iVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.communications.api.dto.BannerWidgets.ArrowButton", iVar, 3);
        pluginGeneratedSerialDescriptor.j(Constants.DEEPLINK, true);
        pluginGeneratedSerialDescriptor.j("target", true);
        pluginGeneratedSerialDescriptor.j("color", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, qke.n(auu0Var)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                str2 = b.k(serialDescriptor, 1);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                str3 = (String) b.s(serialDescriptor, 2, auu0.a, str3);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new BannerWidgets.d(i, str, str2, str3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        BannerWidgets.d dVar = (BannerWidgets.d) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        if (b.F() || !jl40.l(dVar.a, "")) {
            b.o(serialDescriptor, 0, dVar.a);
        }
        if (b.F() || !jl40.l(dVar.b, "")) {
            b.o(serialDescriptor, 1, dVar.b);
        }
        if (b.F() || dVar.c != null) {
            b.g(serialDescriptor, 2, auu0.a, dVar.c);
        }
        b.c(serialDescriptor);
    }
}
