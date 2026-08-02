package com.miteksystems.misnap.workflow;

import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import com.knotapi.knot.utilities.PreferenceManager;
import com.miteksystems.misnap.core.MiSnapSettings;
import com.miteksystems.misnap.core.MiSnapSettings$$serializer;
import com.miteksystems.misnap.workflow.MiSnapWorkflowStep;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.TuplesKt;

@Deprecated
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/miteksystems/misnap/workflow/MiSnapWorkflowStep.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowStep;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/miteksystems/misnap/workflow/MiSnapWorkflowStep;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/miteksystems/misnap/workflow/MiSnapWorkflowStep;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "workflow_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MiSnapWorkflowStep$$serializer implements GeneratedSerializer {
    public static final MiSnapWorkflowStep$$serializer INSTANCE;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor a;

    static {
        MiSnapWorkflowStep$$serializer miSnapWorkflowStep$$serializer = new MiSnapWorkflowStep$$serializer();
        INSTANCE = miSnapWorkflowStep$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.miteksystems.misnap.workflow.MiSnapWorkflowStep", miSnapWorkflowStep$$serializer, 3);
        pluginGeneratedSerialDescriptor.addElement(PreferenceManager.PREF_SETTINGS, false);
        pluginGeneratedSerialDescriptor.addElement("navGraphId", true);
        pluginGeneratedSerialDescriptor.addElement("behavior", true);
        a = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] childSerializers() {
        return new KSerializer[]{MiSnapSettings$$serializer.INSTANCE, BuiltinSerializersKt.getNullable(IntSerializer.INSTANCE), MiSnapWorkflowStep.Behavior.Companion.serializer()};
    }

    @Override // kotlinx.serialization.KSerializer
    public MiSnapWorkflowStep deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
        boolean z = true;
        int i = 0;
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        while (z) {
            int decodeElementIndex = beginStructure.decodeElementIndex(descriptor);
            if (decodeElementIndex == -1) {
                z = false;
            } else if (decodeElementIndex == 0) {
                obj = beginStructure.decodeSerializableElement(descriptor, 0, MiSnapSettings$$serializer.INSTANCE, obj);
                i |= 1;
            } else if (decodeElementIndex == 1) {
                obj2 = beginStructure.decodeNullableSerializableElement(descriptor, 1, IntSerializer.INSTANCE, obj2);
                i |= 2;
            } else {
                if (decodeElementIndex != 2) {
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return null;
                }
                obj3 = beginStructure.decodeSerializableElement(descriptor, 2, MiSnapWorkflowStep.Behavior.Companion.serializer(), obj3);
                i |= 4;
            }
        }
        beginStructure.endStructure(descriptor);
        return new MiSnapWorkflowStep(i, (MiSnapSettings) obj, (Integer) obj2, (MiSnapWorkflowStep.Behavior) obj3);
    }

    @Override // kotlinx.serialization.KSerializer
    public SerialDescriptor getDescriptor() {
        return a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0047, code lost:
    
        if (kotlin.jvm.internal.Intrinsics.areEqual(r2, r1.a == com.miteksystems.misnap.core.MiSnapSettings.UseCase.NFC ? com.miteksystems.misnap.workflow.MiSnapWorkflowStep.Behavior.OnNfcMrzExtraction.SkipStepIfMrzMissing.INSTANCE : com.miteksystems.misnap.workflow.MiSnapWorkflowStep.Behavior.None.INSTANCE) == false) goto L16;
     */
    @Override // kotlinx.serialization.KSerializer
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void serialize(Encoder encoder, MiSnapWorkflowStep value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
        MiSnapSettings$$serializer miSnapSettings$$serializer = MiSnapSettings$$serializer.INSTANCE;
        MiSnapSettings miSnapSettings = value.a;
        MiSnapWorkflowStep.Behavior behavior = value.c;
        Integer num = value.b;
        beginStructure.encodeSerializableElement(descriptor, 0, miSnapSettings$$serializer, miSnapSettings);
        if (beginStructure.shouldEncodeElementDefault(descriptor) || num != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 1, IntSerializer.INSTANCE, num);
        }
        if (!beginStructure.shouldEncodeElementDefault(descriptor)) {
            MiSnapWorkflowStep.Companion.getClass();
            miSnapSettings.getClass();
        }
        beginStructure.encodeSerializableElement(descriptor, 2, MiSnapWorkflowStep.Behavior.Companion.serializer(), behavior);
        beginStructure.endStructure(descriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
