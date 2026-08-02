package ru.yandex.taxi.communications.api.dto;

import defpackage.i3y;
import defpackage.myi;
import defpackage.ny61;
import defpackage.pnz;
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
public final /* synthetic */ class p implements uxs {
    public static final p a;
    private static final SerialDescriptor descriptor;

    static {
        p pVar = new p();
        a = pVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.communications.api.dto.BannerWidgets.OnCloseEffect", pVar, 2);
        pluginGeneratedSerialDescriptor.j("delay_ms", true);
        pluginGeneratedSerialDescriptor.j("type", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{pnz.a, qke.n((KSerializer) BannerWidgets.OnCloseEffect.c[1].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = BannerWidgets.OnCloseEffect.c;
        b.getClass();
        long j = 0;
        boolean z = true;
        int i = 0;
        BannerWidgets.OnCloseEffect.Type type = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                j = b.f(serialDescriptor, 0);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                type = (BannerWidgets.OnCloseEffect.Type) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), type);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new BannerWidgets.OnCloseEffect(i, j, type);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        BannerWidgets.OnCloseEffect onCloseEffect = (BannerWidgets.OnCloseEffect) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = BannerWidgets.OnCloseEffect.c;
        if (b.F() || onCloseEffect.a != 0) {
            b.s(serialDescriptor, 0, onCloseEffect.a);
        }
        if (b.F() || onCloseEffect.b != null) {
            b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), onCloseEffect.b);
        }
        b.c(serialDescriptor);
    }
}
