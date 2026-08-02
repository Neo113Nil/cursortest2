package defpackage;

import java.util.List;
import kotlin.collections.EmptyList;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import ru.yandex.taxi.scooters.presentation.feedback.data.model.FeedbackAttachments;
import ru.yandex.taxi.scooters.presentation.feedback.data.model.a;

/* loaded from: classes6.dex */
public final /* synthetic */ class ruq implements uxs {
    public static final ruq a;
    private static final SerialDescriptor descriptor;

    static {
        ruq ruqVar = new ruq();
        a = ruqVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.presentation.feedback.data.model.FeedbackSettings", ruqVar, 3);
        pluginGeneratedSerialDescriptor.j("root_item_id", true);
        pluginGeneratedSerialDescriptor.j("attachments", true);
        pluginGeneratedSerialDescriptor.j("level_titles", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        return new KSerializer[]{qke.n(auu0.a), a.a, tuq.d[2].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = tuq.d;
        b.getClass();
        boolean z = true;
        int i = 0;
        String str = null;
        FeedbackAttachments feedbackAttachments = null;
        List list = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                str = (String) b.s(serialDescriptor, 0, auu0.a, str);
                i |= 1;
            } else if (v == 1) {
                feedbackAttachments = (FeedbackAttachments) b.A(serialDescriptor, 1, a.a, feedbackAttachments);
                i |= 2;
            } else {
                if (v != 2) {
                    ny61.c(v);
                    return null;
                }
                list = (List) b.A(serialDescriptor, 2, (myi) i3yVarArr[2].getValue(), list);
                i |= 4;
            }
        }
        b.c(serialDescriptor);
        return new tuq(i, str, feedbackAttachments, list);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    /* JADX WARN: Code restructure failed: missing block: B:8:0x0031, code lost:
    
        if (defpackage.jl40.l(r1, ru.yandex.taxi.scooters.presentation.feedback.data.model.FeedbackAttachments.d) == false) goto L13;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void serialize(Encoder encoder, Object obj) {
        tuq tuqVar = (tuq) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = tuq.d;
        if (b.F() || tuqVar.a != null) {
            b.g(serialDescriptor, 0, auu0.a, tuqVar.a);
        }
        if (!b.F()) {
            FeedbackAttachments feedbackAttachments = tuqVar.b;
            FeedbackAttachments.Companion.getClass();
        }
        b.e(serialDescriptor, 1, a.a, tuqVar.b);
        if (b.F() || !jl40.l(tuqVar.c, EmptyList.a)) {
            b.e(serialDescriptor, 2, (KSerializer) i3yVarArr[2].getValue(), tuqVar.c);
        }
        b.c(serialDescriptor);
    }
}
