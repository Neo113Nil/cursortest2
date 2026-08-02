package ru.yandex.taxi.surge.models.dto;

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
import ru.yandex.taxi.surge.models.dto.c0;

/* loaded from: classes6.dex */
public final /* synthetic */ class z implements uxs {
    public static final z a;
    private static final SerialDescriptor descriptor;

    static {
        z zVar = new z();
        a = zVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.surge.models.dto.SurgeButtonActionDto.PriceFeedbackModalContent", zVar, 4);
        pluginGeneratedSerialDescriptor.j("title", true);
        pluginGeneratedSerialDescriptor.j("feedback_options", true);
        pluginGeneratedSerialDescriptor.j("comment_item", true);
        pluginGeneratedSerialDescriptor.j("buttons_section", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(auu0.a), c0.e[1].getValue(), qke.n(a0.a), t0.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = c0.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        List list = null;
        c0.a aVar = null;
        SurgeInfoItem$ActionButtonsContent surgeInfoItem$ActionButtonsContent = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                i |= 1;
            } else if (v == 1) {
                list = (List) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list);
                i |= 2;
            } else if (v == 2) {
                aVar = (c0.a) b.s(serialDescriptor, 2, a0.a, aVar);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                surgeInfoItem$ActionButtonsContent = (SurgeInfoItem$ActionButtonsContent) b.A(serialDescriptor, 3, t0.a, surgeInfoItem$ActionButtonsContent);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new c0(i, str, list, aVar, surgeInfoItem$ActionButtonsContent);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        c0 c0Var = (c0) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = c0.e;
        if (b.F() || c0Var.a != null) {
            b.g(serialDescriptor, 0, auu0.a, c0Var.a);
        }
        if (b.F() || !jl40.l(c0Var.b, EmptyList.a)) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), c0Var.b);
        }
        if (b.F() || c0Var.c != null) {
            b.g(serialDescriptor, 2, a0.a, c0Var.c);
        }
        if (b.F() || !jl40.l(c0Var.d, new SurgeInfoItem$ActionButtonsContent(0))) {
            b.e(serialDescriptor, 3, t0.a, c0Var.d);
        }
        b.c(serialDescriptor);
    }
}
