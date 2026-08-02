package defpackage;

import defpackage.shs;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.communications.api.dto.BannerWidgets;
import ru.yandex.taxi.communications.api.dto.TypedContentWidget;
import ru.yandex.taxi.communications.api.dto.a;
import ru.yandex.taxi.communications.api.dto.y0;

/* loaded from: classes9.dex */
public final /* synthetic */ class qhs implements uxs {
    public static final qhs a;
    private static final SerialDescriptor descriptor;

    static {
        qhs qhsVar = new qhs();
        a = qhsVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.communications.api.dto.FullScreenBanner.Page", qhsVar, 8);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("text", true);
        pluginGeneratedSerialDescriptor.j("image", true);
        pluginGeneratedSerialDescriptor.j("animation", true);
        pluginGeneratedSerialDescriptor.j("widgets", true);
        pluginGeneratedSerialDescriptor.j("backgrounds", true);
        pluginGeneratedSerialDescriptor.j("policy", true);
        pluginGeneratedSerialDescriptor.j("element_payload", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = shs.a.i;
        y0 y0Var = y0.a;
        return new KSerializer[]{qke.n(y0Var), qke.n(y0Var), qke.n(auu0.a), qke.n(er4.a), a.a, i3yVarArr[5].getValue(), qke.n(mwd0.a), qke.n((KSerializer) i3yVarArr[7].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = shs.a.i;
        b.getClass();
        Object obj = null;
        boolean z = true;
        Map map = null;
        TypedContentWidget typedContentWidget = null;
        TypedContentWidget typedContentWidget2 = null;
        String str = null;
        gr4 gr4Var = null;
        BannerWidgets bannerWidgets = null;
        List list = null;
        owd0 owd0Var = null;
        int i = 0;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    typedContentWidget = (TypedContentWidget) b.s(serialDescriptor, 0, y0.a, typedContentWidget);
                    i |= 1;
                    break;
                case 1:
                    typedContentWidget2 = (TypedContentWidget) b.s(serialDescriptor, 1, y0.a, typedContentWidget2);
                    i |= 2;
                    break;
                case 2:
                    str = (String) b.s(serialDescriptor, 2, auu0.a, str);
                    i |= 4;
                    break;
                case 3:
                    gr4Var = (gr4) b.s(serialDescriptor, 3, er4.a, gr4Var);
                    i |= 8;
                    break;
                case 4:
                    bannerWidgets = (BannerWidgets) b.A(serialDescriptor, 4, a.a, bannerWidgets);
                    i |= 16;
                    break;
                case 5:
                    list = (List) b.A(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), list);
                    i |= 32;
                    break;
                case 6:
                    owd0Var = (owd0) b.s(serialDescriptor, 6, mwd0.a, owd0Var);
                    i |= 64;
                    break;
                case 7:
                    map = (Map) b.s(serialDescriptor, 7, (myi) i3yVarArr[7].getValue(), map);
                    i |= 128;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new shs.a(i, typedContentWidget, typedContentWidget2, str, gr4Var, bannerWidgets, list, owd0Var, map);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        shs.a aVar = (shs.a) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = shs.a.i;
        if (b.F() || aVar.a != null) {
            b.g(serialDescriptor, 0, y0.a, aVar.a);
        }
        if (b.F() || aVar.b != null) {
            b.g(serialDescriptor, 1, y0.a, aVar.b);
        }
        if (b.F() || aVar.c != null) {
            b.g(serialDescriptor, 2, auu0.a, aVar.c);
        }
        if (b.F() || aVar.d != null) {
            b.g(serialDescriptor, 3, er4.a, aVar.d);
        }
        if (b.F() || !jl40.l(aVar.e, BannerWidgets.j)) {
            b.e(serialDescriptor, 4, a.a, aVar.e);
        }
        if (b.F() || !jl40.l(aVar.f, EmptyList.a)) {
            b.e(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), aVar.f);
        }
        if (b.F() || aVar.g != null) {
            b.g(serialDescriptor, 6, mwd0.a, aVar.g);
        }
        if (b.F() || aVar.h != null) {
            b.g(serialDescriptor, 7, (KSerializer) i3yVarArr[7].getValue(), aVar.h);
        }
        b.c(serialDescriptor);
    }
}
