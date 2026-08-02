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
public final /* synthetic */ class i implements uxs {
    public static final i a;
    private static final SerialDescriptor descriptor;

    static {
        i iVar = new i();
        a = iVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.plus.api.dto.state.plaque.MicroWidgetDto", iVar, 11);
        pluginGeneratedSerialDescriptor.j("widget_id", true);
        pluginGeneratedSerialDescriptor.j("display_widget_rules", true);
        pluginGeneratedSerialDescriptor.j("type", true);
        pluginGeneratedSerialDescriptor.j("action", true);
        pluginGeneratedSerialDescriptor.j("templates", true);
        pluginGeneratedSerialDescriptor.j("text", true);
        pluginGeneratedSerialDescriptor.j("icon", true);
        pluginGeneratedSerialDescriptor.j("button", true);
        pluginGeneratedSerialDescriptor.j("balance", true);
        pluginGeneratedSerialDescriptor.j("switch", true);
        pluginGeneratedSerialDescriptor.j("content_description", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = MicroWidgetDto.l;
        return new KSerializer[]{auu0.a, e.a, qke.n((KSerializer) i3yVarArr[2].getValue()), ru.yandex.taxi.plus.api.dto.a.a, i3yVarArr[4].getValue(), qke.n(t.a), qke.n(p.a), qke.n(l.a), qke.n(j.a), qke.n(r.a), qke.n(n.a)};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        i3y[] i3yVarArr;
        boolean z;
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr2 = MicroWidgetDto.l;
        b.getClass();
        MicroWidgetDto.c cVar = null;
        MicroWidgetDto.e eVar = null;
        MicroWidgetDto.a aVar = null;
        boolean z2 = true;
        MicroWidgetDto.b bVar = null;
        int i = 0;
        String str = null;
        DisplayWidgetRules displayWidgetRules = null;
        MicroWidgetDto.Type type = null;
        Action action = null;
        List list = null;
        MicroWidgetDto.f fVar = null;
        MicroWidgetDto.d dVar = null;
        while (z2) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z2 = false;
                    i3yVarArr2 = i3yVarArr2;
                    continue;
                case 0:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    str = b.k(serialDescriptor, 0);
                    i |= 1;
                    break;
                case 1:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    displayWidgetRules = (DisplayWidgetRules) b.A(serialDescriptor, 1, e.a, displayWidgetRules);
                    i |= 2;
                    break;
                case 2:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    type = (MicroWidgetDto.Type) b.s(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), type);
                    i |= 4;
                    break;
                case 3:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    action = (Action) b.A(serialDescriptor, 3, ru.yandex.taxi.plus.api.dto.a.a, action);
                    i |= 8;
                    break;
                case 4:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    list = (List) b.A(serialDescriptor, 4, (myi) i3yVarArr[4].getValue(), list);
                    i |= 16;
                    break;
                case 5:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    fVar = (MicroWidgetDto.f) b.s(serialDescriptor, 5, t.a, fVar);
                    i |= 32;
                    break;
                case 6:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    dVar = (MicroWidgetDto.d) b.s(serialDescriptor, 6, p.a, dVar);
                    i |= 64;
                    break;
                case 7:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    bVar = (MicroWidgetDto.b) b.s(serialDescriptor, 7, l.a, bVar);
                    i |= 128;
                    break;
                case 8:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    aVar = (MicroWidgetDto.a) b.s(serialDescriptor, 8, j.a, aVar);
                    i |= 256;
                    break;
                case 9:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    eVar = (MicroWidgetDto.e) b.s(serialDescriptor, 9, r.a, eVar);
                    i |= 512;
                    break;
                case 10:
                    i3yVarArr = i3yVarArr2;
                    z = z2;
                    cVar = (MicroWidgetDto.c) b.s(serialDescriptor, 10, n.a, cVar);
                    i |= 1024;
                    break;
                default:
                    ny61.c(v);
                    return null;
            }
            i3yVarArr2 = i3yVarArr;
            z2 = z;
        }
        b.c(serialDescriptor);
        return new MicroWidgetDto(i, str, displayWidgetRules, type, action, list, fVar, dVar, bVar, aVar, eVar, cVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:16:0x006a, code lost:
    
        if (defpackage.jl40.l(r1, ru.yandex.taxi.plus.api.dto.Action.m) == false) goto L25;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        MicroWidgetDto microWidgetDto = (MicroWidgetDto) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = MicroWidgetDto.l;
        if (b.F() || !jl40.l(microWidgetDto.a, "")) {
            b.o(serialDescriptor, 0, microWidgetDto.a);
        }
        if (b.F() || !jl40.l(microWidgetDto.b, new DisplayWidgetRules(0))) {
            b.e(serialDescriptor, 1, e.a, microWidgetDto.b);
        }
        if (b.F() || microWidgetDto.c != null) {
            b.g(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), microWidgetDto.c);
        }
        if (!b.F()) {
            Action action = microWidgetDto.d;
            Action.Companion.getClass();
        }
        b.e(serialDescriptor, 3, ru.yandex.taxi.plus.api.dto.a.a, microWidgetDto.d);
        if (b.F() || !jl40.l(microWidgetDto.e, EmptyList.a)) {
            b.e(serialDescriptor, 4, (KSerializer) i3yVarArr[4].getValue(), microWidgetDto.e);
        }
        if (b.F() || microWidgetDto.f != null) {
            b.g(serialDescriptor, 5, t.a, microWidgetDto.f);
        }
        if (b.F() || microWidgetDto.g != null) {
            b.g(serialDescriptor, 6, p.a, microWidgetDto.g);
        }
        if (b.F() || microWidgetDto.h != null) {
            b.g(serialDescriptor, 7, l.a, microWidgetDto.h);
        }
        if (b.F() || microWidgetDto.i != null) {
            b.g(serialDescriptor, 8, j.a, microWidgetDto.i);
        }
        if (b.F() || microWidgetDto.j != null) {
            b.g(serialDescriptor, 9, r.a, microWidgetDto.j);
        }
        if (b.F() || microWidgetDto.k != null) {
            b.g(serialDescriptor, 10, n.a, microWidgetDto.k);
        }
        b.c(serialDescriptor);
    }
}
