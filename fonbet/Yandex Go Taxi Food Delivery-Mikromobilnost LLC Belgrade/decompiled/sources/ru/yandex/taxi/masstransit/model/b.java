package ru.yandex.taxi.masstransit.model;

import defpackage.auu0;
import defpackage.h6w;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.myi;
import defpackage.ny61;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.masstransit.model.VariantStyle;

/* loaded from: classes9.dex */
public final /* synthetic */ class b implements uxs {
    public static final b a;
    private static final SerialDescriptor descriptor;

    static {
        b bVar = new b();
        a = bVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.masstransit.model.VariantStyle.Variant", bVar, 8);
        pluginGeneratedSerialDescriptor.j("zoom_range", true);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("image_tag", true);
        pluginGeneratedSerialDescriptor.j("image_width", true);
        pluginGeneratedSerialDescriptor.j("image_height", true);
        pluginGeneratedSerialDescriptor.j("pointer_size", true);
        pluginGeneratedSerialDescriptor.j("frame_offset", true);
        pluginGeneratedSerialDescriptor.j("show_label", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = VariantStyle.a.i;
        h6w h6wVar = h6w.a;
        return new KSerializer[]{e.a, i3yVarArr[1].getValue(), auu0.a, h6wVar, h6wVar, h6wVar, h6wVar, z96.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = VariantStyle.a.i;
        b.getClass();
        boolean z = true;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        boolean z2 = false;
        VariantStyle.b bVar = null;
        VariantStyle.VariantType variantType = null;
        String str = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    break;
                case 0:
                    bVar = (VariantStyle.b) b.A(serialDescriptor, 0, e.a, bVar);
                    i |= 1;
                    break;
                case 1:
                    variantType = (VariantStyle.VariantType) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), variantType);
                    i |= 2;
                    break;
                case 2:
                    str = b.k(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    i2 = b.h(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    i3 = b.h(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    i4 = b.h(serialDescriptor, 5);
                    i |= 32;
                    break;
                case 6:
                    i5 = b.h(serialDescriptor, 6);
                    i |= 64;
                    break;
                case 7:
                    z2 = b.C(serialDescriptor, 7);
                    i |= 128;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new VariantStyle.a(i, bVar, variantType, str, i2, i3, i4, i5, z2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        VariantStyle.a aVar = (VariantStyle.a) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = VariantStyle.a.i;
        if (b.F() || !jl40.l(aVar.a, new VariantStyle.b(3))) {
            b.e(serialDescriptor, 0, e.a, aVar.a);
        }
        if (b.F() || aVar.b != VariantStyle.VariantType.UNKNOWN) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), aVar.b);
        }
        if (b.F() || !jl40.l(aVar.c, "")) {
            b.o(serialDescriptor, 2, aVar.c);
        }
        if (b.F() || aVar.d != 0) {
            b.A(3, aVar.d, serialDescriptor);
        }
        if (b.F() || aVar.e != 0) {
            b.A(4, aVar.e, serialDescriptor);
        }
        if (b.F() || aVar.f != 0) {
            b.A(5, aVar.f, serialDescriptor);
        }
        if (b.F() || aVar.g != 0) {
            b.A(6, aVar.g, serialDescriptor);
        }
        if (b.F() || aVar.h) {
            b.n(serialDescriptor, 7, aVar.h);
        }
        b.c(serialDescriptor);
    }
}
