package ru.yandex.taxi.common_models.net;

import androidx.core.provider.FontsContractCompat$Columns;
import defpackage.auu0;
import defpackage.h6w;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.jsq0;
import defpackage.ksq0;
import defpackage.myi;
import defpackage.nor;
import defpackage.ny61;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.common_models.net.FormattedText;

/* loaded from: classes9.dex */
public final /* synthetic */ class v implements uxs {
    public static final v a;
    private static final SerialDescriptor descriptor;

    static {
        v vVar = new v();
        a = vVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.common_models.net.FormattedText.Text", vVar, 11);
        pluginGeneratedSerialDescriptor.j("text", true);
        pluginGeneratedSerialDescriptor.j("font_style", true);
        pluginGeneratedSerialDescriptor.j(FontsContractCompat$Columns.WEIGHT, true);
        pluginGeneratedSerialDescriptor.j("font_size", true);
        pluginGeneratedSerialDescriptor.j("text_decoration", true);
        pluginGeneratedSerialDescriptor.j("detailed_text_decoration", true);
        pluginGeneratedSerialDescriptor.j("color", true);
        pluginGeneratedSerialDescriptor.j("meta_color", true);
        pluginGeneratedSerialDescriptor.j("meta_style", true);
        pluginGeneratedSerialDescriptor.j("stroke_color", true);
        pluginGeneratedSerialDescriptor.j("stroke_width", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = FormattedText.h.l;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, i3yVarArr[1].getValue(), qke.n((KSerializer) i3yVarArr[2].getValue()), qke.n(h6w.a), i3yVarArr[4].getValue(), i3yVarArr[5].getValue(), auu0Var, qke.n(auu0Var), qke.n((KSerializer) i3yVarArr[8].getValue()), qke.n(auu0Var), qke.n(nor.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        boolean z;
        i3y[] i3yVarArr2;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr3 = FormattedText.h.l;
        b.getClass();
        Float f = null;
        String str = null;
        TextMetaStyle textMetaStyle = null;
        boolean z2 = true;
        String str2 = null;
        int i = 0;
        String str3 = null;
        FormattedText.FontStyle fontStyle = null;
        FormattedText.FontWeight fontWeight = null;
        Integer num = null;
        jsq0 jsq0Var = null;
        List list = null;
        String str4 = null;
        while (z2) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    i3yVarArr2 = i3yVarArr3;
                    z2 = false;
                    i3yVarArr3 = i3yVarArr2;
                case 0:
                    i3yVarArr = i3yVarArr3;
                    z = z2;
                    str3 = b.k(serialDescriptor, 0);
                    i |= 1;
                    i3yVarArr3 = i3yVarArr;
                    z2 = z;
                case 1:
                    i3yVarArr = i3yVarArr3;
                    z = z2;
                    fontStyle = (FormattedText.FontStyle) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), fontStyle);
                    i |= 2;
                    i3yVarArr3 = i3yVarArr;
                    z2 = z;
                case 2:
                    i3yVarArr = i3yVarArr3;
                    z = z2;
                    fontWeight = (FormattedText.FontWeight) b.s(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), fontWeight);
                    i |= 4;
                    i3yVarArr3 = i3yVarArr;
                    z2 = z;
                case 3:
                    i3yVarArr = i3yVarArr3;
                    z = z2;
                    num = (Integer) b.s(serialDescriptor, 3, h6w.a, num);
                    i |= 8;
                    i3yVarArr3 = i3yVarArr;
                    z2 = z;
                case 4:
                    i3yVarArr = i3yVarArr3;
                    z = z2;
                    jsq0Var = (jsq0) b.A(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), jsq0Var);
                    i |= 16;
                    i3yVarArr3 = i3yVarArr;
                    z2 = z;
                case 5:
                    i3yVarArr = i3yVarArr3;
                    z = z2;
                    list = (List) b.A(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), list);
                    i |= 32;
                    i3yVarArr3 = i3yVarArr;
                    z2 = z;
                case 6:
                    i3yVarArr2 = i3yVarArr3;
                    str4 = b.k(serialDescriptor, 6);
                    i |= 64;
                    i3yVarArr3 = i3yVarArr2;
                case 7:
                    i3yVarArr = i3yVarArr3;
                    z = z2;
                    str2 = (String) b.s(serialDescriptor, 7, auu0.a, str2);
                    i |= 128;
                    i3yVarArr3 = i3yVarArr;
                    z2 = z;
                case 8:
                    i3yVarArr = i3yVarArr3;
                    z = z2;
                    textMetaStyle = (TextMetaStyle) b.s(serialDescriptor, 8, (myi) i3yVarArr[8].getValue(), textMetaStyle);
                    i |= 256;
                    i3yVarArr3 = i3yVarArr;
                    z2 = z;
                case 9:
                    i3yVarArr = i3yVarArr3;
                    z = z2;
                    str = (String) b.s(serialDescriptor, 9, auu0.a, str);
                    i |= 512;
                    i3yVarArr3 = i3yVarArr;
                    z2 = z;
                case 10:
                    i3yVarArr = i3yVarArr3;
                    z = z2;
                    f = (Float) b.s(serialDescriptor, 10, nor.a, f);
                    i |= 1024;
                    i3yVarArr3 = i3yVarArr;
                    z2 = z;
                default:
                    ny61.c(v);
                    return null;
            }
        }
        b.c(serialDescriptor);
        return new FormattedText.h(i, str3, fontStyle, fontWeight, num, jsq0Var, list, str4, str2, textMetaStyle, str, f);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        FormattedText.h hVar = (FormattedText.h) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = FormattedText.h.l;
        if (b.F() || !jl40.l(hVar.a, "")) {
            b.o(serialDescriptor, 0, hVar.a);
        }
        if (b.F() || hVar.b != FormattedText.FontStyle.NORMAL) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), hVar.b);
        }
        if (b.F() || hVar.c != null) {
            b.g(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), hVar.c);
        }
        if (b.F() || hVar.d != null) {
            b.g(serialDescriptor, 3, h6w.a, hVar.d);
        }
        if (b.F() || !jl40.l(hVar.e, ksq0.a)) {
            b.e(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), hVar.e);
        }
        if (b.F() || !jl40.l(hVar.f, EmptyList.a)) {
            b.e(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), hVar.f);
        }
        if (b.F() || !jl40.l(hVar.g, "")) {
            b.o(serialDescriptor, 6, hVar.g);
        }
        if (b.F() || hVar.h != null) {
            b.g(serialDescriptor, 7, auu0.a, hVar.h);
        }
        if (b.F() || hVar.i != null) {
            b.g(serialDescriptor, 8, (KSerializer) i3yVarArr[8].getValue(), hVar.i);
        }
        if (b.F() || hVar.j != null) {
            b.g(serialDescriptor, 9, auu0.a, hVar.j);
        }
        if (b.F() || hVar.k != null) {
            b.g(serialDescriptor, 10, nor.a, hVar.k);
        }
        b.c(serialDescriptor);
    }
}
