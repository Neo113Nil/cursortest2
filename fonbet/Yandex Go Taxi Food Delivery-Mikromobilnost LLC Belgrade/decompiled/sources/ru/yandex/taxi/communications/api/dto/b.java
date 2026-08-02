package ru.yandex.taxi.communications.api.dto;

import defpackage.i3y;
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
import ru.yandex.taxi.communications.api.dto.BannerWidgets;

/* loaded from: classes9.dex */
public final /* synthetic */ class b implements uxs {
    public static final b a;
    private static final SerialDescriptor descriptor;

    static {
        b bVar = new b();
        a = bVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.communications.api.dto.BannerWidgets.Action", bVar, 2);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("payload", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n((KSerializer) BannerWidgets.a.c[0].getValue()), qke.n(f.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = BannerWidgets.a.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        BannerWidgets.ActionType actionType = null;
        BannerWidgets.c cVar = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                actionType = (BannerWidgets.ActionType) b.s(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), actionType);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                cVar = (BannerWidgets.c) b.s(serialDescriptor, 1, f.a, cVar);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new BannerWidgets.a(i, actionType, cVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        BannerWidgets.a aVar = (BannerWidgets.a) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = BannerWidgets.a.c;
        if (b.F() || aVar.a != null) {
            b.g(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), aVar.a);
        }
        if (b.F() || aVar.b != null) {
            b.g(serialDescriptor, 1, f.a, aVar.b);
        }
        b.c(serialDescriptor);
    }
}
