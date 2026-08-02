package ru.yandex.taxi.requirements.models.net.experiment;

import defpackage.auu0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.myi;
import defpackage.ny61;
import defpackage.qke;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.requirements.models.net.experiment.RequirementBubbleDto;

/* loaded from: classes9.dex */
public final /* synthetic */ class a implements uxs {
    public static final a a;
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.requirements.models.net.experiment.RequirementBubbleDto", aVar, 7);
        pluginGeneratedSerialDescriptor.j("icon_tag", true);
        pluginGeneratedSerialDescriptor.j("bubble_available", true);
        pluginGeneratedSerialDescriptor.j("bubble_available_description", true);
        pluginGeneratedSerialDescriptor.j("bubble_unavailable", true);
        pluginGeneratedSerialDescriptor.j("bubble_unavailable_description", true);
        pluginGeneratedSerialDescriptor.j("options", true);
        pluginGeneratedSerialDescriptor.j("action", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = RequirementBubbleDto.h;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{auu0Var, auu0Var, qke.n(auu0Var), auu0Var, qke.n(auu0Var), i3yVarArr[5].getValue(), i3yVarArr[6].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = RequirementBubbleDto.h;
        b.getClass();
        Object obj = null;
        boolean z = true;
        int i = 0;
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        String str5 = null;
        Map map = null;
        RequirementBubbleDto.RequirementBubbleActionDto requirementBubbleActionDto = null;
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
                    str2 = b.k(serialDescriptor, 1);
                    i |= 2;
                    break;
                case 2:
                    str3 = (String) b.s(serialDescriptor, 2, auu0.a, str3);
                    i |= 4;
                    break;
                case 3:
                    str4 = b.k(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    str5 = (String) b.s(serialDescriptor, 4, auu0.a, str5);
                    i |= 16;
                    break;
                case 5:
                    map = (Map) b.A(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), map);
                    i |= 32;
                    break;
                case 6:
                    requirementBubbleActionDto = (RequirementBubbleDto.RequirementBubbleActionDto) b.A(serialDescriptor, 6, (myi) i3yVarArr[6].getValue(), requirementBubbleActionDto);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new RequirementBubbleDto(i, str, str2, str3, str4, str5, map, requirementBubbleActionDto);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        RequirementBubbleDto requirementBubbleDto = (RequirementBubbleDto) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = RequirementBubbleDto.h;
        if (b.F() || !jl40.l(requirementBubbleDto.a, "")) {
            b.o(serialDescriptor, 0, requirementBubbleDto.a);
        }
        if (b.F() || !jl40.l(requirementBubbleDto.b, "")) {
            b.o(serialDescriptor, 1, requirementBubbleDto.b);
        }
        if (b.F() || requirementBubbleDto.c != null) {
            b.g(serialDescriptor, 2, auu0.a, requirementBubbleDto.c);
        }
        if (b.F() || !jl40.l(requirementBubbleDto.d, "")) {
            b.o(serialDescriptor, 3, requirementBubbleDto.d);
        }
        if (b.F() || requirementBubbleDto.e != null) {
            b.g(serialDescriptor, 4, auu0.a, requirementBubbleDto.e);
        }
        if (b.F() || !jl40.l(requirementBubbleDto.f, kotlin.collections.b.f())) {
            b.e(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), requirementBubbleDto.f);
        }
        if (b.F() || requirementBubbleDto.g != RequirementBubbleDto.RequirementBubbleActionDto.DEFAULT) {
            b.e(serialDescriptor, 6, (KSerializer) i3yVarArr[6].getValue(), requirementBubbleDto.g);
        }
        b.c(serialDescriptor);
    }
}
