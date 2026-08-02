package ru.yandex.taxi.communications.api.dto;

import defpackage.auu0;
import defpackage.h6w;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.myi;
import defpackage.ny61;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import defpackage.z96;
import java.util.Map;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.communications.api.dto.Story;

/* loaded from: classes9.dex */
public final /* synthetic */ class w implements uxs {
    public static final w a;
    private static final SerialDescriptor descriptor;

    static {
        w wVar = new w();
        a = wVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.communications.api.dto.Story", wVar, 9);
        pluginGeneratedSerialDescriptor.j("id", true);
        pluginGeneratedSerialDescriptor.j("analytics_payload", true);
        pluginGeneratedSerialDescriptor.j("promotion", true);
        pluginGeneratedSerialDescriptor.j("from_promotions_list", true);
        pluginGeneratedSerialDescriptor.j("shouldBeDeletedAfterShow", true);
        pluginGeneratedSerialDescriptor.j("screens", true);
        pluginGeneratedSerialDescriptor.j("options", true);
        pluginGeneratedSerialDescriptor.j("payload", true);
        pluginGeneratedSerialDescriptor.j("position", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = Story.l;
        auu0 auu0Var = auu0.a;
        z96 z96Var = z96.a;
        return new KSerializer[]{auu0Var, qke.n((KSerializer) i3yVarArr[1].getValue()), auu0Var, z96Var, z96Var, i3yVarArr[5].getValue(), y.a, f0.a, h6w.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = Story.l;
        b.getClass();
        Object obj = null;
        boolean z = true;
        Story.d dVar = null;
        String str = null;
        Map map = null;
        String str2 = null;
        Set set = null;
        Story.a aVar = null;
        int i = 0;
        boolean z2 = false;
        boolean z3 = false;
        int i2 = 0;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    map = (Map) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), map);
                    i |= 2;
                    break;
                case 2:
                    str2 = b.k(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    z2 = b.C(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    z3 = b.C(serialDescriptor, 4);
                    i |= 16;
                    break;
                case 5:
                    set = (Set) b.A(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), set);
                    i |= 32;
                    break;
                case 6:
                    aVar = (Story.a) b.A(serialDescriptor, 6, y.a, aVar);
                    i |= 64;
                    break;
                case 7:
                    dVar = (Story.d) b.A(serialDescriptor, 7, f0.a, dVar);
                    i |= 128;
                    break;
                case 8:
                    i2 = b.h(serialDescriptor, 8);
                    i |= 256;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new Story(i, str, map, str2, z2, z3, set, aVar, dVar, i2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        Story story = (Story) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = Story.l;
        if (b.F() || !jl40.l(story.b, "")) {
            b.o(serialDescriptor, 0, story.b);
        }
        if (b.F() || story.c != null) {
            b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), story.c);
        }
        if (b.F() || !jl40.l(story.d, "")) {
            b.o(serialDescriptor, 2, story.d);
        }
        if (b.F() || story.e) {
            b.n(serialDescriptor, 3, story.e);
        }
        if (b.F() || !story.f) {
            b.n(serialDescriptor, 4, story.f);
        }
        if (b.F() || !jl40.l(story.g, EmptySet.a)) {
            b.e(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), story.g);
        }
        if (b.F() || !jl40.l(story.h, Story.m)) {
            b.e(serialDescriptor, 6, y.a, story.h);
        }
        if (b.F() || !jl40.l(story.i, Story.n)) {
            b.e(serialDescriptor, 7, f0.a, story.i);
        }
        if (b.F() || story.j != 0) {
            b.A(8, story.j, serialDescriptor);
        }
        b.c(serialDescriptor);
    }
}
