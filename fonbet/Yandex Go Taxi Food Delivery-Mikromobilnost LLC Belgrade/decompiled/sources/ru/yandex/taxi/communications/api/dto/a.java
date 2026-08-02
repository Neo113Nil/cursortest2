package ru.yandex.taxi.communications.api.dto;

import defpackage.i3y;
import defpackage.iqx;
import defpackage.jl40;
import defpackage.myi;
import defpackage.ny61;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.zpx;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.communications.api.dto.BannerWidgets;

/* loaded from: classes9.dex */
public final /* synthetic */ class a implements uxs {
    public static final a a;
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.communications.api.dto.BannerWidgets", aVar, 8);
        pluginGeneratedSerialDescriptor.j("close_button", true);
        pluginGeneratedSerialDescriptor.j("menu_button", true);
        pluginGeneratedSerialDescriptor.j("action_buttons", true);
        pluginGeneratedSerialDescriptor.j("label", true);
        pluginGeneratedSerialDescriptor.j("link", true);
        pluginGeneratedSerialDescriptor.j("arrow_button", true);
        pluginGeneratedSerialDescriptor.j("switch_button", true);
        pluginGeneratedSerialDescriptor.j("pager", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = BannerWidgets.i;
        k kVar = k.a;
        return new KSerializer[]{qke.n(kVar), qke.n(kVar), i3yVarArr[2].getValue(), qke.n(zpx.a), qke.n(m.a), qke.n(i.a), qke.n(u.a), qke.n(s.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = BannerWidgets.i;
        b.getClass();
        Object obj = null;
        boolean z = true;
        BannerWidgets.g gVar = null;
        BannerWidgets.e eVar = null;
        BannerWidgets.e eVar2 = null;
        List list = null;
        iqx iqxVar = null;
        BannerWidgets.f fVar = null;
        BannerWidgets.d dVar = null;
        BannerWidgets.h hVar = null;
        int i = 0;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    eVar = (BannerWidgets.e) b.s(serialDescriptor, 0, k.a, eVar);
                    i |= 1;
                    break;
                case 1:
                    eVar2 = (BannerWidgets.e) b.s(serialDescriptor, 1, k.a, eVar2);
                    i |= 2;
                    break;
                case 2:
                    list = (List) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), list);
                    i |= 4;
                    break;
                case 3:
                    iqxVar = (iqx) b.s(serialDescriptor, 3, zpx.a, iqxVar);
                    i |= 8;
                    break;
                case 4:
                    fVar = (BannerWidgets.f) b.s(serialDescriptor, 4, m.a, fVar);
                    i |= 16;
                    break;
                case 5:
                    dVar = (BannerWidgets.d) b.s(serialDescriptor, 5, i.a, dVar);
                    i |= 32;
                    break;
                case 6:
                    hVar = (BannerWidgets.h) b.s(serialDescriptor, 6, u.a, hVar);
                    i |= 64;
                    break;
                case 7:
                    gVar = (BannerWidgets.g) b.s(serialDescriptor, 7, s.a, gVar);
                    i |= 128;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new BannerWidgets(i, eVar, eVar2, list, iqxVar, fVar, dVar, hVar, gVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        BannerWidgets bannerWidgets = (BannerWidgets) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = BannerWidgets.i;
        if (b.F() || bannerWidgets.a != null) {
            b.g(serialDescriptor, 0, k.a, bannerWidgets.a);
        }
        if (b.F() || bannerWidgets.b != null) {
            b.g(serialDescriptor, 1, k.a, bannerWidgets.b);
        }
        if (b.F() || !jl40.l(bannerWidgets.c, EmptyList.a)) {
            b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), bannerWidgets.c);
        }
        if (b.F() || bannerWidgets.d != null) {
            b.g(serialDescriptor, 3, zpx.a, bannerWidgets.d);
        }
        if (b.F() || bannerWidgets.e != null) {
            b.g(serialDescriptor, 4, m.a, bannerWidgets.e);
        }
        if (b.F() || bannerWidgets.f != null) {
            b.g(serialDescriptor, 5, i.a, bannerWidgets.f);
        }
        if (b.F() || bannerWidgets.g != null) {
            b.g(serialDescriptor, 6, u.a, bannerWidgets.g);
        }
        if (b.F() || bannerWidgets.h != null) {
            b.g(serialDescriptor, 7, s.a, bannerWidgets.h);
        }
        b.c(serialDescriptor);
    }
}
