package ru.yandex.taxi.communications.api.dto;

import defpackage.i3y;
import defpackage.iqu0;
import defpackage.iqx;
import defpackage.jl40;
import defpackage.kqu0;
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
import ru.yandex.taxi.communications.api.dto.StoryWidgets;

/* loaded from: classes5.dex */
public final /* synthetic */ class o0 implements uxs {
    public static final o0 a;
    private static final SerialDescriptor descriptor;

    static {
        o0 o0Var = new o0();
        a = o0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.communications.api.dto.StoryWidgets", o0Var, 5);
        pluginGeneratedSerialDescriptor.j("action_buttons", true);
        pluginGeneratedSerialDescriptor.j("close_button", true);
        pluginGeneratedSerialDescriptor.j("label", true);
        pluginGeneratedSerialDescriptor.j("link", true);
        pluginGeneratedSerialDescriptor.j("pager", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{StoryWidgets.f[0].getValue(), qke.n(u0.a), qke.n(zpx.a), qke.n(w0.a), qke.n(iqu0.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = StoryWidgets.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        List list = null;
        StoryWidgets.b bVar = null;
        iqx iqxVar = null;
        StoryWidgets.c cVar = null;
        kqu0 kqu0Var = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                list = (List) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), list);
                i |= 1;
            } else if (v == 1) {
                bVar = (StoryWidgets.b) b.s(serialDescriptor, 1, u0.a, bVar);
                i |= 2;
            } else if (v == 2) {
                iqxVar = (iqx) b.s(serialDescriptor, 2, zpx.a, iqxVar);
                i |= 4;
            } else if (v == 3) {
                cVar = (StoryWidgets.c) b.s(serialDescriptor, 3, w0.a, cVar);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                kqu0Var = (kqu0) b.s(serialDescriptor, 4, iqu0.a, kqu0Var);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new StoryWidgets(i, list, bVar, iqxVar, cVar, kqu0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        StoryWidgets storyWidgets = (StoryWidgets) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = StoryWidgets.f;
        if (b.F() || !jl40.l(storyWidgets.a, EmptyList.a)) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), storyWidgets.a);
        }
        if (b.F() || storyWidgets.b != null) {
            b.g(serialDescriptor, 1, u0.a, storyWidgets.b);
        }
        if (b.F() || storyWidgets.c != null) {
            b.g(serialDescriptor, 2, zpx.a, storyWidgets.c);
        }
        if (b.F() || storyWidgets.d != null) {
            b.g(serialDescriptor, 3, w0.a, storyWidgets.d);
        }
        if (b.F() || storyWidgets.e != null) {
            b.g(serialDescriptor, 4, iqu0.a, storyWidgets.e);
        }
        b.c(serialDescriptor);
    }
}
