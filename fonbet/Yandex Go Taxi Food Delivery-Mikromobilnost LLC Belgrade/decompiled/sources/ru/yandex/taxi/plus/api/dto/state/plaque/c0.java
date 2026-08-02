package ru.yandex.taxi.plus.api.dto.state.plaque;

import defpackage.auu0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.myi;
import defpackage.ny61;
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
import ru.yandex.taxi.plus.api.dto.Action;
import ru.yandex.taxi.plus.api.dto.state.plaque.e0;

/* loaded from: classes6.dex */
public final /* synthetic */ class c0 implements uxs {
    public static final c0 a;
    private static final SerialDescriptor descriptor;

    static {
        c0 c0Var = new c0();
        a = c0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.plus.api.dto.state.plaque.MicroWidgetsPlaqueDefinitionDto.WidgetLevelDto", c0Var, 4);
        pluginGeneratedSerialDescriptor.j("widgets_level_id", true);
        pluginGeneratedSerialDescriptor.j("elements", true);
        pluginGeneratedSerialDescriptor.j("display_rules", true);
        pluginGeneratedSerialDescriptor.j("action", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{auu0.a, e0.a.e[1].getValue(), a.a, ru.yandex.taxi.plus.api.dto.a.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = e0.a.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        List list = null;
        d dVar = null;
        Action action = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = b.k(serialDescriptor, 0);
                i |= 1;
            } else if (v == 1) {
                list = (List) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list);
                i |= 2;
            } else if (v == 2) {
                dVar = (d) b.A(serialDescriptor, 2, a.a, dVar);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                action = (Action) b.A(serialDescriptor, 3, ru.yandex.taxi.plus.api.dto.a.a, action);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new e0.a(i, str, list, dVar, action);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x0070, code lost:
    
        if (defpackage.jl40.l(r0, ru.yandex.taxi.plus.api.dto.Action.m) == false) goto L25;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        e0.a aVar = (e0.a) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = e0.a.e;
        if (b.F() || !jl40.l(aVar.a, "")) {
            b.o(serialDescriptor, 0, aVar.a);
        }
        if (b.F() || !jl40.l(aVar.b, EmptyList.a)) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), aVar.b);
        }
        if (b.F() || !jl40.l(aVar.c, new d(0))) {
            b.e(serialDescriptor, 2, a.a, aVar.c);
        }
        if (!b.F()) {
            Action action = aVar.d;
            Action.Companion.getClass();
        }
        b.e(serialDescriptor, 3, ru.yandex.taxi.plus.api.dto.a.a, aVar.d);
        b.c(serialDescriptor);
    }
}
