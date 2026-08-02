package ru.yandex.taxi.communications.api.dto;

import defpackage.i3y;
import defpackage.myi;
import defpackage.ny61;
import defpackage.sjd;
import defpackage.uxs;
import defpackage.yjd;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.communications.api.dto.Story;

/* loaded from: classes6.dex */
public final /* synthetic */ class l0 implements uxs {
    public static final l0 a;
    private static final SerialDescriptor descriptor;

    static {
        l0 l0Var = new l0();
        a = l0Var;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.communications.api.dto.Story.StoryLayout", l0Var, 1);
        pluginGeneratedSerialDescriptor.j("id", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{Story.g.b[0].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = Story.g.b;
        b.getClass();
        boolean z = true;
        int i = 0;
        Story.StoryLayoutType storyLayoutType = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else {
                if (v != 0) {
                    ny61.c(v);
                    return null;
                }
                storyLayoutType = (Story.StoryLayoutType) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), storyLayoutType);
                i = 1;
            }
        }
        b.c(serialDescriptor);
        return new Story.g(i, storyLayoutType);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        Story.g gVar = (Story.g) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = Story.g.b;
        if (b.F() || gVar.a != Story.StoryLayoutType.MAIN) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), gVar.a);
        }
        b.c(serialDescriptor);
    }
}
