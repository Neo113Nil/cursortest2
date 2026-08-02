package ru.yandex.taxi.communications.api.dto;

import com.adjust.sdk.Constants;
import com.yandex.messaging.core.net.entities.BackendConfig;
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
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.communications.api.dto.BannerWidgets;

/* loaded from: classes9.dex */
public final /* synthetic */ class d implements uxs {
    public static final d a;
    private static final SerialDescriptor descriptor;

    static {
        d dVar = new d();
        a = dVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.communications.api.dto.BannerWidgets.ActionButton", dVar, 11);
        pluginGeneratedSerialDescriptor.j(Constants.DEEPLINK, true);
        pluginGeneratedSerialDescriptor.j("background_urls", true);
        pluginGeneratedSerialDescriptor.j("text", true);
        pluginGeneratedSerialDescriptor.j("target", true);
        pluginGeneratedSerialDescriptor.j("color", true);
        pluginGeneratedSerialDescriptor.j("text_color", true);
        pluginGeneratedSerialDescriptor.j("action", true);
        pluginGeneratedSerialDescriptor.j("extra_actions", true);
        pluginGeneratedSerialDescriptor.j(BackendConfig.Restrictions.ENABLED, true);
        pluginGeneratedSerialDescriptor.j("element_payload", true);
        pluginGeneratedSerialDescriptor.j("on_close_effect", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = BannerWidgets.b.m;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, i3yVarArr[1].getValue(), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), qke.n(b.a), i3yVarArr[7].getValue(), z96.a, qke.n((KSerializer) i3yVarArr[9].getValue()), qke.n(p.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr2 = BannerWidgets.b.m;
        b.getClass();
        BannerWidgets.OnCloseEffect onCloseEffect = null;
        Map map = null;
        boolean z = true;
        List list = null;
        int i = 0;
        String str = null;
        Set set = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        BannerWidgets.a aVar = null;
        boolean z2 = false;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    i3yVarArr = i3yVarArr2;
                    z = false;
                    break;
                case 0:
                    i3yVarArr = i3yVarArr2;
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    i3yVarArr = i3yVarArr2;
                    set = (Set) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), set);
                    i |= 2;
                    break;
                case 2:
                    i3yVarArr = i3yVarArr2;
                    str2 = (String) b.s(serialDescriptor, 2, auu0.a, str2);
                    i |= 4;
                    break;
                case 3:
                    i3yVarArr = i3yVarArr2;
                    str3 = (String) b.s(serialDescriptor, 3, auu0.a, str3);
                    i |= 8;
                    break;
                case 4:
                    i3yVarArr = i3yVarArr2;
                    str4 = (String) b.s(serialDescriptor, 4, auu0.a, str4);
                    i |= 16;
                    break;
                case 5:
                    i3yVarArr = i3yVarArr2;
                    str5 = (String) b.s(serialDescriptor, 5, auu0.a, str5);
                    i |= 32;
                    break;
                case 6:
                    i3yVarArr = i3yVarArr2;
                    aVar = (BannerWidgets.a) b.s(serialDescriptor, 6, b.a, aVar);
                    i |= 64;
                    break;
                case 7:
                    i3yVarArr = i3yVarArr2;
                    list = (List) b.A(serialDescriptor, 7, (myi) i3yVarArr[7].getValue(), list);
                    i |= 128;
                    break;
                case 8:
                    i3yVarArr = i3yVarArr2;
                    z2 = b.C(serialDescriptor, 8);
                    i |= 256;
                    break;
                case 9:
                    i3yVarArr = i3yVarArr2;
                    map = (Map) b.s(serialDescriptor, 9, (myi) i3yVarArr[9].getValue(), map);
                    i |= 512;
                    break;
                case 10:
                    i3yVarArr = i3yVarArr2;
                    onCloseEffect = (BannerWidgets.OnCloseEffect) b.s(serialDescriptor, 10, p.a, onCloseEffect);
                    i |= 1024;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
            i3yVarArr2 = i3yVarArr;
        }
        b.c(serialDescriptor);
        return new BannerWidgets.b(i, str, set, str2, str3, str4, str5, aVar, list, z2, map, onCloseEffect);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        BannerWidgets.b bVar = (BannerWidgets.b) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = BannerWidgets.b.m;
        if (b.F() || !jl40.l(bVar.a, "")) {
            b.o(serialDescriptor, 0, bVar.a);
        }
        if (b.F() || !jl40.l(bVar.b, EmptySet.a)) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), bVar.b);
        }
        if (b.F() || bVar.c != null) {
            b.g(serialDescriptor, 2, auu0.a, bVar.c);
        }
        if (b.F() || bVar.d != null) {
            b.g(serialDescriptor, 3, auu0.a, bVar.d);
        }
        if (b.F() || bVar.e != null) {
            b.g(serialDescriptor, 4, auu0.a, bVar.e);
        }
        if (b.F() || bVar.f != null) {
            b.g(serialDescriptor, 5, auu0.a, bVar.f);
        }
        if (b.F() || bVar.g != null) {
            b.g(serialDescriptor, 6, b.a, bVar.g);
        }
        if (b.F() || !jl40.l(bVar.h, EmptyList.a)) {
            b.e(serialDescriptor, 7, (KSerializer) i3yVarArr[7].getValue(), bVar.h);
        }
        if (b.F() || !bVar.i) {
            b.n(serialDescriptor, 8, bVar.i);
        }
        if (b.F() || bVar.j != null) {
            b.g(serialDescriptor, 9, (KSerializer) i3yVarArr[9].getValue(), bVar.j);
        }
        if (b.F() || bVar.k != null) {
            b.g(serialDescriptor, 10, p.a, bVar.k);
        }
        b.c(serialDescriptor);
    }
}
