package ru.yandex.taxi.communications.api.dto;

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
import ru.yandex.taxi.communications.api.dto.BannerWidgets;

/* loaded from: classes9.dex */
public final /* synthetic */ class f implements uxs {
    public static final f a;
    private static final SerialDescriptor descriptor;

    static {
        f fVar = new f();
        a = fVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.communications.api.dto.BannerWidgets.ActionPayload", fVar, 10);
        pluginGeneratedSerialDescriptor.j("content", true);
        pluginGeneratedSerialDescriptor.j("need_authorization", true);
        pluginGeneratedSerialDescriptor.j("text_to_copy", true);
        pluginGeneratedSerialDescriptor.j("activated_text", true);
        pluginGeneratedSerialDescriptor.j("coupon", true);
        pluginGeneratedSerialDescriptor.j("activated_deeplink", true);
        pluginGeneratedSerialDescriptor.j("inactive_title", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("subtitle", true);
        pluginGeneratedSerialDescriptor.j("name", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = BannerWidgets.c.k;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, z96.a, qke.n(auu0Var), auu0Var, auu0Var, auu0Var, qke.n(auu0Var), qke.n(auu0Var), qke.n(auu0Var), i3yVarArr[9].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr2 = BannerWidgets.c.k;
        b.getClass();
        BannerWidgets.NamedActionType namedActionType = null;
        String str = null;
        boolean z = true;
        String str2 = null;
        int i = 0;
        String str3 = null;
        boolean z2 = false;
        String str4 = null;
        String str5 = null;
        String str6 = null;
        String str7 = null;
        String str8 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    i3yVarArr = i3yVarArr2;
                    z = false;
                    break;
                case 0:
                    i3yVarArr = i3yVarArr2;
                    str3 = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    i3yVarArr = i3yVarArr2;
                    z2 = b.C(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    i3yVarArr = i3yVarArr2;
                    str4 = (String) b.s(serialDescriptor, 2, auu0.a, str4);
                    i |= 4;
                    break;
                case 3:
                    i3yVarArr = i3yVarArr2;
                    str5 = b.k(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    i3yVarArr = i3yVarArr2;
                    str6 = b.k(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    i3yVarArr = i3yVarArr2;
                    str7 = b.k(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    i3yVarArr = i3yVarArr2;
                    str8 = (String) b.s(serialDescriptor, 6, auu0.a, str8);
                    i |= 64;
                    break;
                case 7:
                    i3yVarArr = i3yVarArr2;
                    str2 = (String) b.s(serialDescriptor, 7, auu0.a, str2);
                    i |= 128;
                    break;
                case 8:
                    i3yVarArr = i3yVarArr2;
                    str = (String) b.s(serialDescriptor, 8, auu0.a, str);
                    i |= 256;
                    break;
                case 9:
                    i3yVarArr = i3yVarArr2;
                    namedActionType = (BannerWidgets.NamedActionType) b.A(serialDescriptor, 9, (myi) i3yVarArr2[9].getValue(), namedActionType);
                    i |= 512;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
            i3yVarArr2 = i3yVarArr;
        }
        b.c(serialDescriptor);
        return new BannerWidgets.c(i, str3, z2, str4, str5, str6, str7, str8, str2, str, namedActionType);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        BannerWidgets.c cVar = (BannerWidgets.c) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = BannerWidgets.c.k;
        if (b.F() || !jl40.l(cVar.a, "")) {
            b.o(serialDescriptor, 0, cVar.a);
        }
        if (b.F() || cVar.b) {
            b.n(serialDescriptor, 1, cVar.b);
        }
        if (b.F() || cVar.c != null) {
            b.g(serialDescriptor, 2, auu0.a, cVar.c);
        }
        if (b.F() || !jl40.l(cVar.d, "")) {
            b.o(serialDescriptor, 3, cVar.d);
        }
        if (b.F() || !jl40.l(cVar.e, "")) {
            b.o(serialDescriptor, 4, cVar.e);
        }
        if (b.F() || !jl40.l(cVar.f, "")) {
            b.o(serialDescriptor, 5, cVar.f);
        }
        if (b.F() || cVar.g != null) {
            b.g(serialDescriptor, 6, auu0.a, cVar.g);
        }
        if (b.F() || cVar.h != null) {
            b.g(serialDescriptor, 7, auu0.a, cVar.h);
        }
        if (b.F() || cVar.i != null) {
            b.g(serialDescriptor, 8, auu0.a, cVar.i);
        }
        if (b.F() || cVar.j != BannerWidgets.NamedActionType.EMPTY) {
            b.e(serialDescriptor, 9, (KSerializer) i3yVarArr[9].getValue(), cVar.j);
        }
        b.c(serialDescriptor);
    }
}
