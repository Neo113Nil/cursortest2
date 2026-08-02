package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.taxi.scooters.presentation.feedback.data.model.FeedbackSettingsParams$Screen;

/* loaded from: classes6.dex */
public final /* synthetic */ class uuq implements uxs {
    public static final uuq a;
    private static final SerialDescriptor descriptor;

    static {
        uuq uuqVar = new uuq();
        a = uuqVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.presentation.feedback.data.model.FeedbackSettingsParams", uuqVar, 2);
        pluginGeneratedSerialDescriptor.j(MetaDataField.SCREEN_FIELD, false);
        pluginGeneratedSerialDescriptor.j("vehicle_id", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{xuq.c[0].getValue(), auu0.a};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = xuq.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        FeedbackSettingsParams$Screen feedbackSettingsParams$Screen = null;
        String str = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                feedbackSettingsParams$Screen = (FeedbackSettingsParams$Screen) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), feedbackSettingsParams$Screen);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                str = b.k(serialDescriptor, 1);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new xuq(i, feedbackSettingsParams$Screen, str);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        xuq xuqVar = (xuq) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        b.e(serialDescriptor, 0, (KSerializer) xuq.c[0].getValue(), xuqVar.a);
        b.o(serialDescriptor, 1, xuqVar.b);
        b.c(serialDescriptor);
    }
}
