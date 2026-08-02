package com.miteksystems.misnap.workflow;

import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import com.miteksystems.misnap.workflow.MiSnapWorkflowError;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.EnumSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.TuplesKt;

@Deprecated
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/miteksystems/misnap/workflow/MiSnapWorkflowError.Voice.MissingRequirement.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Voice$MissingRequirement;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Voice$MissingRequirement;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Voice$MissingRequirement;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "workflow_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MiSnapWorkflowError$Voice$MissingRequirement$$serializer implements GeneratedSerializer {
    public static final MiSnapWorkflowError$Voice$MissingRequirement$$serializer INSTANCE;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor a;

    static {
        MiSnapWorkflowError$Voice$MissingRequirement$$serializer miSnapWorkflowError$Voice$MissingRequirement$$serializer = new MiSnapWorkflowError$Voice$MissingRequirement$$serializer();
        INSTANCE = miSnapWorkflowError$Voice$MissingRequirement$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice.MissingRequirement", miSnapWorkflowError$Voice$MissingRequirement$$serializer, 1);
        pluginGeneratedSerialDescriptor.addElement("reason", false);
        a = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] childSerializers() {
        MiSnapWorkflowError.Voice.MissingRequirement.Reason[] values = MiSnapWorkflowError.Voice.MissingRequirement.Reason.values();
        values.getClass();
        return new KSerializer[]{new EnumSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice.MissingRequirement.Reason", (Enum[]) values)};
    }

    @Override // kotlinx.serialization.KSerializer
    public MiSnapWorkflowError.Voice.MissingRequirement deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
        boolean z = true;
        int i = 0;
        Object obj = null;
        while (z) {
            int decodeElementIndex = beginStructure.decodeElementIndex(descriptor);
            if (decodeElementIndex == -1) {
                z = false;
            } else {
                if (decodeElementIndex != 0) {
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return null;
                }
                MiSnapWorkflowError.Voice.MissingRequirement.Reason[] values = MiSnapWorkflowError.Voice.MissingRequirement.Reason.values();
                values.getClass();
                obj = beginStructure.decodeSerializableElement(descriptor, 0, new EnumSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice.MissingRequirement.Reason", (Enum[]) values), obj);
                i = 1;
            }
        }
        beginStructure.endStructure(descriptor);
        return new MiSnapWorkflowError.Voice.MissingRequirement(i, (MiSnapWorkflowError.Voice.MissingRequirement.Reason) obj);
    }

    @Override // kotlinx.serialization.KSerializer
    public SerialDescriptor getDescriptor() {
        return a;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, MiSnapWorkflowError.Voice.MissingRequirement value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
        MiSnapWorkflowError.Voice.MissingRequirement.Reason[] values = MiSnapWorkflowError.Voice.MissingRequirement.Reason.values();
        values.getClass();
        beginStructure.encodeSerializableElement(descriptor, 0, new EnumSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice.MissingRequirement.Reason", (Enum[]) values), value.b);
        beginStructure.endStructure(descriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
