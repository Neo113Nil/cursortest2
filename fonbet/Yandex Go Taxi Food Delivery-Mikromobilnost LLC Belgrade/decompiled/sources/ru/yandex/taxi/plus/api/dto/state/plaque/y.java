package ru.yandex.taxi.plus.api.dto.state.plaque;

import defpackage.auu0;
import defpackage.df20;
import defpackage.h6w;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.mdx;
import defpackage.myi;
import defpackage.ny61;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.wqc0;
import defpackage.yjd;
import defpackage.yqc0;
import defpackage.z96;
import defpackage.ze20;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.plus.api.dto.Action;
import ru.yandex.taxi.plus.api.dto.state.plaque.MicroWidgetPlaqueDto;

/* loaded from: classes6.dex */
public final /* synthetic */ class y implements uxs {
    public static final y a;
    private static final SerialDescriptor descriptor;

    static {
        y yVar = new y();
        a = yVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.plus.api.dto.state.plaque.MicroWidgetPlaqueDto", yVar, 11);
        pluginGeneratedSerialDescriptor.j("plaque_id", true);
        pluginGeneratedSerialDescriptor.j("widgets_level_ids", true);
        pluginGeneratedSerialDescriptor.j("condition", true);
        pluginGeneratedSerialDescriptor.j("priority", true);
        pluginGeneratedSerialDescriptor.j("params", true);
        pluginGeneratedSerialDescriptor.j("display_rules", true);
        pluginGeneratedSerialDescriptor.j("metric_context", true);
        pluginGeneratedSerialDescriptor.j("action", true);
        pluginGeneratedSerialDescriptor.j("enabled_mark_seen_plaque", true);
        pluginGeneratedSerialDescriptor.j("seen_context", true);
        pluginGeneratedSerialDescriptor.j("icon_in_corner", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = MicroWidgetPlaqueDto.l;
        return new KSerializer[]{auu0.a, i3yVarArr[1].getValue(), qke.n(ze20.a), qke.n(h6w.a), wqc0.a, a.a, i3yVarArr[6].getValue(), ru.yandex.taxi.plus.api.dto.a.a, z96.a, qke.n(mdx.a), qke.n(z.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr2 = MicroWidgetPlaqueDto.l;
        b.getClass();
        MicroWidgetPlaqueDto.IconInCornerDto iconInCornerDto = null;
        kotlinx.serialization.json.c cVar = null;
        boolean z = true;
        Action action = null;
        int i = 0;
        String str = null;
        List list = null;
        df20 df20Var = null;
        Integer num = null;
        yqc0 yqc0Var = null;
        d dVar = null;
        List list2 = null;
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
                    list = (List) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list);
                    i |= 2;
                    break;
                case 2:
                    i3yVarArr = i3yVarArr2;
                    df20Var = (df20) b.s(serialDescriptor, 2, ze20.a, df20Var);
                    i |= 4;
                    break;
                case 3:
                    i3yVarArr = i3yVarArr2;
                    num = (Integer) b.s(serialDescriptor, 3, h6w.a, num);
                    i |= 8;
                    break;
                case 4:
                    i3yVarArr = i3yVarArr2;
                    yqc0Var = (yqc0) b.A(serialDescriptor, 4, wqc0.a, yqc0Var);
                    i |= 16;
                    break;
                case 5:
                    i3yVarArr = i3yVarArr2;
                    dVar = (d) b.A(serialDescriptor, 5, a.a, dVar);
                    i |= 32;
                    break;
                case 6:
                    i3yVarArr = i3yVarArr2;
                    list2 = (List) b.A(serialDescriptor, 6, (myi) i3yVarArr[6].getValue(), list2);
                    i |= 64;
                    break;
                case 7:
                    i3yVarArr = i3yVarArr2;
                    action = (Action) b.A(serialDescriptor, 7, ru.yandex.taxi.plus.api.dto.a.a, action);
                    i |= 128;
                    break;
                case 8:
                    i3yVarArr = i3yVarArr2;
                    z2 = b.C(serialDescriptor, 8);
                    i |= 256;
                    break;
                case 9:
                    i3yVarArr = i3yVarArr2;
                    cVar = (kotlinx.serialization.json.c) b.s(serialDescriptor, 9, mdx.a, cVar);
                    i |= 512;
                    break;
                case 10:
                    i3yVarArr = i3yVarArr2;
                    iconInCornerDto = (MicroWidgetPlaqueDto.IconInCornerDto) b.s(serialDescriptor, 10, z.a, iconInCornerDto);
                    i |= 1024;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
            i3yVarArr2 = i3yVarArr;
        }
        b.c(serialDescriptor);
        return new MicroWidgetPlaqueDto(i, str, list, df20Var, num, yqc0Var, dVar, list2, action, z2, cVar, iconInCornerDto);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x00cf, code lost:
    
        if (defpackage.jl40.l(r0, ru.yandex.taxi.plus.api.dto.Action.m) == false) goto L49;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        MicroWidgetPlaqueDto microWidgetPlaqueDto = (MicroWidgetPlaqueDto) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = MicroWidgetPlaqueDto.l;
        if (b.F() || !jl40.l(microWidgetPlaqueDto.a, "")) {
            b.o(serialDescriptor, 0, microWidgetPlaqueDto.a);
        }
        boolean F = b.F();
        EmptyList emptyList = EmptyList.a;
        if (F || !jl40.l(microWidgetPlaqueDto.b, emptyList)) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), microWidgetPlaqueDto.b);
        }
        if (b.F() || microWidgetPlaqueDto.c != null) {
            b.g(serialDescriptor, 2, ze20.a, microWidgetPlaqueDto.c);
        }
        if (b.F() || microWidgetPlaqueDto.d != null) {
            b.g(serialDescriptor, 3, h6w.a, microWidgetPlaqueDto.d);
        }
        if (b.F() || !jl40.l(microWidgetPlaqueDto.e, new yqc0(0))) {
            b.e(serialDescriptor, 4, wqc0.a, microWidgetPlaqueDto.e);
        }
        if (b.F() || !jl40.l(microWidgetPlaqueDto.f, new d(0))) {
            b.e(serialDescriptor, 5, a.a, microWidgetPlaqueDto.f);
        }
        if (b.F() || !jl40.l(microWidgetPlaqueDto.g, emptyList)) {
            b.e(serialDescriptor, 6, (KSerializer) i3yVarArr[6].getValue(), microWidgetPlaqueDto.g);
        }
        if (!b.F()) {
            Action action = microWidgetPlaqueDto.h;
            Action.Companion.getClass();
        }
        b.e(serialDescriptor, 7, ru.yandex.taxi.plus.api.dto.a.a, microWidgetPlaqueDto.h);
        if (b.F() || microWidgetPlaqueDto.i) {
            b.n(serialDescriptor, 8, microWidgetPlaqueDto.i);
        }
        if (b.F() || microWidgetPlaqueDto.j != null) {
            b.g(serialDescriptor, 9, mdx.a, microWidgetPlaqueDto.j);
        }
        if (b.F() || microWidgetPlaqueDto.k != null) {
            b.g(serialDescriptor, 10, z.a, microWidgetPlaqueDto.k);
        }
        b.c(serialDescriptor);
    }
}
