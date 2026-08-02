package com.miteksystems.misnap.workflow.fragment;

import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import com.miteksystems.misnap.workflow.fragment.HelpFragment;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.TuplesKt;

@Deprecated
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/miteksystems/misnap/workflow/fragment/HelpFragment.WorkflowSettings.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/miteksystems/misnap/workflow/fragment/HelpFragment$WorkflowSettings;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/miteksystems/misnap/workflow/fragment/HelpFragment$WorkflowSettings;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/miteksystems/misnap/workflow/fragment/HelpFragment$WorkflowSettings;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "workflow_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HelpFragment$WorkflowSettings$$serializer implements GeneratedSerializer {
    public static final HelpFragment$WorkflowSettings$$serializer INSTANCE;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor a;

    static {
        HelpFragment$WorkflowSettings$$serializer helpFragment$WorkflowSettings$$serializer = new HelpFragment$WorkflowSettings$$serializer();
        INSTANCE = helpFragment$WorkflowSettings$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.miteksystems.misnap.workflow.fragment.HelpFragment.WorkflowSettings", helpFragment$WorkflowSettings$$serializer, 5);
        pluginGeneratedSerialDescriptor.addElement("autoLayoutId", true);
        pluginGeneratedSerialDescriptor.addElement("manualLayoutId", true);
        pluginGeneratedSerialDescriptor.addElement("showSkipCheckBox", true);
        pluginGeneratedSerialDescriptor.addElement("handleOrientation", true);
        pluginGeneratedSerialDescriptor.addElement("enableAccessibilityTutorial", true);
        a = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] childSerializers() {
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        KSerializer nullable = BuiltinSerializersKt.getNullable(intSerializer);
        KSerializer nullable2 = BuiltinSerializersKt.getNullable(intSerializer);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        return new KSerializer[]{nullable, nullable2, BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer)};
    }

    @Override // kotlinx.serialization.KSerializer
    public HelpFragment.WorkflowSettings deserialize(Decoder decoder) {
        decoder.getClass();
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
        boolean z = true;
        int i = 0;
        Object obj = null;
        Object obj2 = null;
        Object obj3 = null;
        Object obj4 = null;
        Object obj5 = null;
        while (z) {
            int decodeElementIndex = beginStructure.decodeElementIndex(descriptor);
            if (decodeElementIndex == -1) {
                z = false;
            } else if (decodeElementIndex == 0) {
                obj = beginStructure.decodeNullableSerializableElement(descriptor, 0, IntSerializer.INSTANCE, obj);
                i |= 1;
            } else if (decodeElementIndex == 1) {
                obj2 = beginStructure.decodeNullableSerializableElement(descriptor, 1, IntSerializer.INSTANCE, obj2);
                i |= 2;
            } else if (decodeElementIndex == 2) {
                obj3 = beginStructure.decodeNullableSerializableElement(descriptor, 2, BooleanSerializer.INSTANCE, obj3);
                i |= 4;
            } else if (decodeElementIndex == 3) {
                obj4 = beginStructure.decodeNullableSerializableElement(descriptor, 3, BooleanSerializer.INSTANCE, obj4);
                i |= 8;
            } else {
                if (decodeElementIndex != 4) {
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return null;
                }
                obj5 = beginStructure.decodeNullableSerializableElement(descriptor, 4, BooleanSerializer.INSTANCE, obj5);
                i |= 16;
            }
        }
        beginStructure.endStructure(descriptor);
        return new HelpFragment.WorkflowSettings(i, (Integer) obj, (Integer) obj2, (Boolean) obj3, (Boolean) obj4, (Boolean) obj5);
    }

    @Override // kotlinx.serialization.KSerializer
    public SerialDescriptor getDescriptor() {
        return a;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, HelpFragment.WorkflowSettings value) {
        encoder.getClass();
        value.getClass();
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
        Boolean bool = value.e;
        Boolean bool2 = value.d;
        Boolean bool3 = value.c;
        Integer num = value.b;
        Integer num2 = value.a;
        if (beginStructure.shouldEncodeElementDefault(descriptor) || num2 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 0, IntSerializer.INSTANCE, num2);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || num != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 1, IntSerializer.INSTANCE, num);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || bool3 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 2, BooleanSerializer.INSTANCE, bool3);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || bool2 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 3, BooleanSerializer.INSTANCE, bool2);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || bool != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 4, BooleanSerializer.INSTANCE, bool);
        }
        beginStructure.endStructure(descriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
