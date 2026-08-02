package ru.yandex.taxi.communications.api.dto;

import defpackage.h6w;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.mwd0;
import defpackage.myi;
import defpackage.ny61;
import defpackage.owd0;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import java.util.List;
import java.util.Map;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.communications.api.dto.Story;

/* loaded from: classes5.dex */
public final /* synthetic */ class a0 implements uxs {
    public static final a0 a;
    private static final SerialDescriptor descriptor;

    static {
        a0 a0Var = new a0();
        a = a0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.communications.api.dto.Story.Page", a0Var, 10);
        pluginGeneratedSerialDescriptor.j("duration", true);
        pluginGeneratedSerialDescriptor.j("autonext", true);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("text", true);
        pluginGeneratedSerialDescriptor.j("backgrounds", true);
        pluginGeneratedSerialDescriptor.j("main_view", true);
        pluginGeneratedSerialDescriptor.j("widgets", true);
        pluginGeneratedSerialDescriptor.j("element_payload", true);
        pluginGeneratedSerialDescriptor.j("layout", true);
        pluginGeneratedSerialDescriptor.j("policy", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = Story.b.k;
        y0 y0Var = y0.a;
        return new KSerializer[]{h6w.a, z96.a, qke.n(y0Var), qke.n(y0Var), i3yVarArr[4].getValue(), qke.n(c0.a), o0.a, qke.n((KSerializer) i3yVarArr[7].getValue()), l0.a, qke.n(mwd0.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr2 = Story.b.k;
        b.getClass();
        owd0 owd0Var = null;
        Story.g gVar = null;
        boolean z = true;
        Map map = null;
        int i = 0;
        int i2 = 0;
        boolean z2 = false;
        TypedContentWidget typedContentWidget = null;
        TypedContentWidget typedContentWidget2 = null;
        List list = null;
        Story.c cVar = null;
        StoryWidgets storyWidgets = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    i3yVarArr = i3yVarArr2;
                    z = false;
                    break;
                case 0:
                    i3yVarArr = i3yVarArr2;
                    i2 = b.h(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    i3yVarArr = i3yVarArr2;
                    z2 = b.C(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    i3yVarArr = i3yVarArr2;
                    typedContentWidget = (TypedContentWidget) b.s(serialDescriptor, 2, y0.a, typedContentWidget);
                    i |= 4;
                    break;
                case 3:
                    i3yVarArr = i3yVarArr2;
                    typedContentWidget2 = (TypedContentWidget) b.s(serialDescriptor, 3, y0.a, typedContentWidget2);
                    i |= 8;
                    break;
                case 4:
                    i3yVarArr = i3yVarArr2;
                    list = (List) b.A(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    i3yVarArr = i3yVarArr2;
                    cVar = (Story.c) b.s(serialDescriptor, 5, c0.a, cVar);
                    i |= 32;
                    break;
                case 6:
                    i3yVarArr = i3yVarArr2;
                    storyWidgets = (StoryWidgets) b.A(serialDescriptor, 6, o0.a, storyWidgets);
                    i |= 64;
                    break;
                case 7:
                    i3yVarArr = i3yVarArr2;
                    map = (Map) b.s(serialDescriptor, 7, (myi) i3yVarArr[7].getValue(), map);
                    i |= 128;
                    break;
                case 8:
                    i3yVarArr = i3yVarArr2;
                    gVar = (Story.g) b.A(serialDescriptor, 8, l0.a, gVar);
                    i |= 256;
                    break;
                case 9:
                    i3yVarArr = i3yVarArr2;
                    owd0Var = (owd0) b.s(serialDescriptor, 9, mwd0.a, owd0Var);
                    i |= 512;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
            i3yVarArr2 = i3yVarArr;
        }
        b.c(serialDescriptor);
        return new Story.b(i, i2, z2, typedContentWidget, typedContentWidget2, list, cVar, storyWidgets, map, gVar, owd0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00ca, code lost:
    
        if (defpackage.jl40.l(r0, ru.yandex.taxi.communications.api.dto.Story.o) == false) goto L55;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        Story.b bVar = (Story.b) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = Story.b.k;
        if (b.F() || bVar.a != 0) {
            b.A(0, bVar.a, serialDescriptor);
        }
        if (b.F() || bVar.b) {
            b.n(serialDescriptor, 1, bVar.b);
        }
        if (b.F() || bVar.c != null) {
            b.g(serialDescriptor, 2, y0.a, bVar.c);
        }
        if (b.F() || bVar.d != null) {
            b.g(serialDescriptor, 3, y0.a, bVar.d);
        }
        if (b.F() || !jl40.l(bVar.e, EmptyList.a)) {
            b.e(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), bVar.e);
        }
        if (b.F() || bVar.f != null) {
            b.g(serialDescriptor, 5, c0.a, bVar.f);
        }
        if (b.F() || !jl40.l(bVar.g, StoryWidgets.g)) {
            b.e(serialDescriptor, 6, o0.a, bVar.g);
        }
        if (b.F() || bVar.h != null) {
            b.g(serialDescriptor, 7, (KSerializer) i3yVarArr[7].getValue(), bVar.h);
        }
        if (!b.F()) {
            Story.g gVar = bVar.i;
            Story.Companion.getClass();
        }
        b.e(serialDescriptor, 8, l0.a, bVar.i);
        if (b.F() || bVar.j != null) {
            b.g(serialDescriptor, 9, mwd0.a, bVar.j);
        }
        b.c(serialDescriptor);
    }
}
