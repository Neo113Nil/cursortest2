package ru.yandex.taxi.plus.api.dto.state.plaque;

import defpackage.auu0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.myi;
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
import ru.yandex.taxi.plus.api.dto.Action;
import ru.yandex.taxi.plus.api.dto.state.plaque.MicroWidgetDto;

/* loaded from: classes6.dex */
public final /* synthetic */ class w implements uxs {
    public static final w a;
    private static final SerialDescriptor descriptor;

    static {
        w wVar = new w();
        a = wVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.plus.api.dto.state.plaque.MicroWidgetGroupDto", wVar, 5);
        pluginGeneratedSerialDescriptor.j("widget_group_id", true);
        pluginGeneratedSerialDescriptor.j("widgets", true);
        pluginGeneratedSerialDescriptor.j("action", true);
        pluginGeneratedSerialDescriptor.j("display_rules", true);
        pluginGeneratedSerialDescriptor.j("content_description", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{auu0.a, x.f[1].getValue(), ru.yandex.taxi.plus.api.dto.a.a, a.a, qke.n(n.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = x.f;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        List list = null;
        Action action = null;
        d dVar = null;
        MicroWidgetDto.c cVar = null;
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
                action = (Action) b.A(serialDescriptor, 2, ru.yandex.taxi.plus.api.dto.a.a, action);
                i |= 4;
            } else if (v == 3) {
                dVar = (d) b.A(serialDescriptor, 3, a.a, dVar);
                i |= 8;
            } else {
                if (v != 4) {
                    ny61.c(v);
                    return null;
                }
                cVar = (MicroWidgetDto.c) b.s(serialDescriptor, 4, n.a, cVar);
                i |= 16;
            }
        }
        b.c(serialDescriptor);
        return new x(i, str, list, action, dVar, cVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0054, code lost:
    
        if (defpackage.jl40.l(r0, ru.yandex.taxi.plus.api.dto.Action.m) == false) goto L19;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        x xVar = (x) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = x.f;
        if (b.F() || !jl40.l(xVar.a, "")) {
            b.o(serialDescriptor, 0, xVar.a);
        }
        if (b.F() || !jl40.l(xVar.b, EmptyList.a)) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), xVar.b);
        }
        if (!b.F()) {
            Action action = xVar.c;
            Action.Companion.getClass();
        }
        b.e(serialDescriptor, 2, ru.yandex.taxi.plus.api.dto.a.a, xVar.c);
        if (b.F() || !jl40.l(xVar.d, new d(0))) {
            b.e(serialDescriptor, 3, a.a, xVar.d);
        }
        if (b.F() || xVar.e != null) {
            b.g(serialDescriptor, 4, n.a, xVar.e);
        }
        b.c(serialDescriptor);
    }
}
