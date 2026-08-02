package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;

/* loaded from: classes6.dex */
public final /* synthetic */ class yuq implements uxs {
    public static final yuq a;
    private static final SerialDescriptor descriptor;

    static {
        yuq yuqVar = new yuq();
        a = yuqVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.presentation.feedback.data.model.FeedbackSettingsResponse", yuqVar, 4);
        pluginGeneratedSerialDescriptor.j("feedback_items", true);
        pluginGeneratedSerialDescriptor.j("feedback_tree", true);
        pluginGeneratedSerialDescriptor.j("screen_settings", true);
        pluginGeneratedSerialDescriptor.j("send_items_to_appmetrica", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = avq.e;
        return new KSerializer[]{qke.n((KSerializer) i3yVarArr[0].getValue()), qke.n((KSerializer) i3yVarArr[1].getValue()), qke.n(huq.a), qke.n((KSerializer) i3yVarArr[3].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = avq.e;
        b.getClass();
        boolean z = true;
        int i = 0;
        List list = null;
        List list2 = null;
        juq juqVar = null;
        List list3 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                list = (List) b.s(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), list);
                i |= 1;
            } else if (v == 1) {
                list2 = (List) b.s(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), list2);
                i |= 2;
            } else if (v == 2) {
                juqVar = (juq) b.s(serialDescriptor, 2, huq.a, juqVar);
                i |= 4;
            } else {
                if (v != 3) {
                    ny61.c(v);
                    return null;
                }
                list3 = (List) b.s(serialDescriptor, 3, (myi) i3yVarArr[3].getValue(), list3);
                i |= 8;
            }
        }
        b.c(serialDescriptor);
        return new avq(i, list, list2, juqVar, list3);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        avq avqVar = (avq) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = avq.e;
        if (b.F() || avqVar.a != null) {
            b.g(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), avqVar.a);
        }
        if (b.F() || avqVar.b != null) {
            b.g(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), avqVar.b);
        }
        if (b.F() || avqVar.c != null) {
            b.g(serialDescriptor, 2, huq.a, avqVar.c);
        }
        if (b.F() || avqVar.d != null) {
            b.g(serialDescriptor, 3, (KSerializer) i3yVarArr[3].getValue(), avqVar.d);
        }
        b.c(serialDescriptor);
    }
}
