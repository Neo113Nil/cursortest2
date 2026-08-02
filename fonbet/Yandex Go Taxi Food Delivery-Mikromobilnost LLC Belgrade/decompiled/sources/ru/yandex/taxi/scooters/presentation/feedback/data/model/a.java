package ru.yandex.taxi.scooters.presentation.feedback.data.model;

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
import ru.yandex.taxi.scooters.presentation.feedback.data.model.FeedbackAttachments;

/* loaded from: classes6.dex */
public final /* synthetic */ class a implements uxs {
    public static final a a;
    private static final SerialDescriptor descriptor;

    static {
        a aVar = new a();
        a = aVar;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("ru.yandex.taxi.scooters.presentation.feedback.data.model.FeedbackAttachments", aVar, 2);
        pluginGeneratedSerialDescriptor.j("comment", true);
        pluginGeneratedSerialDescriptor.j("photo", true);
        descriptor = pluginGeneratedSerialDescriptor;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.uxs
    public final KSerializer[] childSerializers() {
        i3y[] i3yVarArr = FeedbackAttachments.c;
        return new KSerializer[]{i3yVarArr[0].getValue(), i3yVarArr[1].getValue()};
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        SerialDescriptor serialDescriptor = descriptor;
        sjd b = decoder.b(serialDescriptor);
        i3y[] i3yVarArr = FeedbackAttachments.c;
        b.getClass();
        boolean z = true;
        int i = 0;
        FeedbackAttachments.Requirement requirement = null;
        FeedbackAttachments.Requirement requirement2 = null;
        while (z) {
            int v = b.v(serialDescriptor);
            if (v == -1) {
                z = false;
            } else if (v == 0) {
                requirement = (FeedbackAttachments.Requirement) b.A(serialDescriptor, 0, (myi) i3yVarArr[0].getValue(), requirement);
                i |= 1;
            } else {
                if (v != 1) {
                    ny61.c(v);
                    return null;
                }
                requirement2 = (FeedbackAttachments.Requirement) b.A(serialDescriptor, 1, (myi) i3yVarArr[1].getValue(), requirement2);
                i |= 2;
            }
        }
        b.c(serialDescriptor);
        return new FeedbackAttachments(i, requirement, requirement2);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return descriptor;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        FeedbackAttachments feedbackAttachments = (FeedbackAttachments) obj;
        SerialDescriptor serialDescriptor = descriptor;
        yjd b = encoder.b(serialDescriptor);
        i3y[] i3yVarArr = FeedbackAttachments.c;
        if (b.F() || feedbackAttachments.a != FeedbackAttachments.Requirement.NONE) {
            b.e(serialDescriptor, 0, (KSerializer) i3yVarArr[0].getValue(), feedbackAttachments.a);
        }
        if (b.F() || feedbackAttachments.b != FeedbackAttachments.Requirement.NONE) {
            b.e(serialDescriptor, 1, (KSerializer) i3yVarArr[1].getValue(), feedbackAttachments.b);
        }
        b.c(serialDescriptor);
    }
}
