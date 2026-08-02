package ru.yandex.taxi.surge.models.dto;

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
import ru.yandex.taxi.surge.models.dto.SurgeInfoItem$ActionButtonsContent;

/* loaded from: classes6.dex */
public final /* synthetic */ class t0 implements uxs {
    public static final t0 a;
    private static final SerialDescriptor descriptor;

    static {
        t0 t0Var = new t0();
        a = t0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.surge.models.dto.SurgeInfoItem.ActionButtonsContent", t0Var, 2);
        pluginGeneratedSerialDescriptor.j("orientation", true);
        pluginGeneratedSerialDescriptor.j("buttons", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = SurgeInfoItem$ActionButtonsContent.c;
        return new KSerializer[]{i3yVarArr[0].getValue(), i3yVarArr[1].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = SurgeInfoItem$ActionButtonsContent.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        SurgeInfoItem$ActionButtonsContent.ButtonsOrientation buttonsOrientation = null;
        List list = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                buttonsOrientation = (SurgeInfoItem$ActionButtonsContent.ButtonsOrientation) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), buttonsOrientation);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                list = (List) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new SurgeInfoItem$ActionButtonsContent(i, buttonsOrientation, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        SurgeInfoItem$ActionButtonsContent surgeInfoItem$ActionButtonsContent = (SurgeInfoItem$ActionButtonsContent) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = SurgeInfoItem$ActionButtonsContent.c;
        if (b.F() || surgeInfoItem$ActionButtonsContent.a != SurgeInfoItem$ActionButtonsContent.ButtonsOrientation.VERTICAL) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), surgeInfoItem$ActionButtonsContent.a);
        }
        if (b.F() || !jl40.l(surgeInfoItem$ActionButtonsContent.b, EmptyList.a)) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), surgeInfoItem$ActionButtonsContent.b);
        }
        b.c(serialDescriptor);
    }
}
