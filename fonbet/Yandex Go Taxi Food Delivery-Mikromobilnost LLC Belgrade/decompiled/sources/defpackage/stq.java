package defpackage;

import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;
import ru.yandex.taxi.scooters.presentation.feedback.data.model.FeedbackSettingsParams$Screen;

/* loaded from: classes6.dex */
public final /* synthetic */ class stq implements uxs {
    public static final stq a;
    private static final SerialDescriptor descriptor;

    static {
        stq stqVar = new stq();
        a = stqVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.presentation.feedback.data.model.FeedbackParams", stqVar, 7);
        pluginGeneratedSerialDescriptor.j(MetaDataField.SCREEN_FIELD, false);
        pluginGeneratedSerialDescriptor.j("session_id", false);
        pluginGeneratedSerialDescriptor.j("vehicle_id", false);
        pluginGeneratedSerialDescriptor.j("rating", false);
        pluginGeneratedSerialDescriptor.j("comment", false);
        pluginGeneratedSerialDescriptor.j("photo_ids", false);
        pluginGeneratedSerialDescriptor.j("feedback_item_ids", false);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = utq.h;
        auu0 auu0Var = auu0.a;
        return new KSerializer[]{i3yVarArr[0].getValue(), qke.n(auu0Var), auu0Var, h6w.a, qke.n(auu0Var), qke.n((KSerializer) i3yVarArr[5].getValue()), qke.n((KSerializer) i3yVarArr[6].getValue())};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = utq.h;
        b.getClass();
        Object obj = null;
        boolean z = true;
        int i = 0;
        int i2 = 0;
        FeedbackSettingsParams$Screen feedbackSettingsParams$Screen = null;
        String str = null;
        String str2 = null;
        String str3 = null;
        List list = null;
        List list2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            switch (v) {
                case -1:
                    z = false;
                    continue;
                case 0:
                    feedbackSettingsParams$Screen = (FeedbackSettingsParams$Screen) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), feedbackSettingsParams$Screen);
                    i |= 1;
                    break;
                case 1:
                    str = (String) b.s(serialDescriptor, 1, auu0.a, str);
                    i |= 2;
                    break;
                case 2:
                    str2 = b.k(serialDescriptor, 2);
                    i |= 4;
                    break;
                case 3:
                    i2 = b.h(serialDescriptor, 3);
                    i |= 8;
                    break;
                case 4:
                    str3 = (String) b.s(serialDescriptor, 4, auu0.a, str3);
                    i |= 16;
                    break;
                case 5:
                    list = (List) b.s(serialDescriptor, 5, (myi) i3yVarArr[5].getValue(), list);
                    i |= 32;
                    break;
                case 6:
                    list2 = (List) b.s(serialDescriptor, 6, (myi) i3yVarArr[6].getValue(), list2);
                    i |= 64;
                    break;
                default:
                    ny61.c(v);
                    return obj;
            }
            obj = null;
        }
        b.c(serialDescriptor);
        return new utq(i, feedbackSettingsParams$Screen, str, str2, i2, str3, list, list2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        utq utqVar = (utq) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = utq.h;
        b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), utqVar.a);
        auu0 auu0Var = auu0.a;
        b.g(serialDescriptor, 1, auu0Var, utqVar.b);
        b.o(serialDescriptor, 2, utqVar.c);
        b.A(3, utqVar.d, serialDescriptor);
        b.g(serialDescriptor, 4, auu0Var, utqVar.e);
        b.g(serialDescriptor, 5, (KSerializer) i3yVarArr[5].getValue(), utqVar.f);
        b.g(serialDescriptor, 6, (KSerializer) i3yVarArr[6].getValue(), utqVar.g);
        b.c(serialDescriptor);
    }
}
