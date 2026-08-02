package com.miteksystems.misnap.workflow.fragment;

import app.cash.local.presenters.LocalPresenterModule$Companion$$ExternalSyntheticLambda0;
import com.miteksystems.misnap.workflow.fragment.BarcodeAnalysisFragment;
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
import kotlinx.serialization.internal.EnumSerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.internal.TuplesKt;
import org.bouncycastle.asn1.cmp.PKIFailureInfo;

@Deprecated
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/miteksystems/misnap/workflow/fragment/BarcodeAnalysisFragment.WorkflowSettings.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/miteksystems/misnap/workflow/fragment/BarcodeAnalysisFragment$WorkflowSettings;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/miteksystems/misnap/workflow/fragment/BarcodeAnalysisFragment$WorkflowSettings;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/miteksystems/misnap/workflow/fragment/BarcodeAnalysisFragment$WorkflowSettings;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "workflow_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class BarcodeAnalysisFragment$WorkflowSettings$$serializer implements GeneratedSerializer {
    public static final BarcodeAnalysisFragment$WorkflowSettings$$serializer INSTANCE;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor a;

    static {
        BarcodeAnalysisFragment$WorkflowSettings$$serializer barcodeAnalysisFragment$WorkflowSettings$$serializer = new BarcodeAnalysisFragment$WorkflowSettings$$serializer();
        INSTANCE = barcodeAnalysisFragment$WorkflowSettings$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.miteksystems.misnap.workflow.fragment.BarcodeAnalysisFragment.WorkflowSettings", barcodeAnalysisFragment$WorkflowSettings$$serializer, 21);
        pluginGeneratedSerialDescriptor.addElement("guideViewDrawableId", true);
        pluginGeneratedSerialDescriptor.addElement("guideViewAlignedScalePercentage", true);
        pluginGeneratedSerialDescriptor.addElement("guideViewUnalignedScalePercentage", true);
        pluginGeneratedSerialDescriptor.addElement("guideViewShowVignette", true);
        pluginGeneratedSerialDescriptor.addElement("manualButtonDrawableId", true);
        pluginGeneratedSerialDescriptor.addElement("torchViewOnDrawableId", true);
        pluginGeneratedSerialDescriptor.addElement("torchViewOffDrawableId", true);
        pluginGeneratedSerialDescriptor.addElement("recordingIconDrawableId", true);
        pluginGeneratedSerialDescriptor.addElement("recordingIconAnimationId", true);
        pluginGeneratedSerialDescriptor.addElement("helpButtonDrawableId", true);
        pluginGeneratedSerialDescriptor.addElement("successViewMessageDrawableId", true);
        pluginGeneratedSerialDescriptor.addElement("successViewMessageAnimationId", true);
        pluginGeneratedSerialDescriptor.addElement("successViewBackgroundDrawableId", true);
        pluginGeneratedSerialDescriptor.addElement("successViewShouldVibrate", true);
        pluginGeneratedSerialDescriptor.addElement("successViewSoundUri", true);
        pluginGeneratedSerialDescriptor.addElement("reviewCondition", true);
        pluginGeneratedSerialDescriptor.addElement("handleOrientation", true);
        pluginGeneratedSerialDescriptor.addElement("shouldShowCancelButton", true);
        pluginGeneratedSerialDescriptor.addElement("cancelButtonDrawableId", true);
        pluginGeneratedSerialDescriptor.addElement("shouldShowBarcodeLabel", true);
        pluginGeneratedSerialDescriptor.addElement("barcodeLabelStringId", true);
        a = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] childSerializers() {
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        KSerializer nullable = BuiltinSerializersKt.getNullable(intSerializer);
        FloatSerializer floatSerializer = FloatSerializer.INSTANCE;
        KSerializer nullable2 = BuiltinSerializersKt.getNullable(floatSerializer);
        KSerializer nullable3 = BuiltinSerializersKt.getNullable(floatSerializer);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        KSerializer nullable4 = BuiltinSerializersKt.getNullable(booleanSerializer);
        KSerializer nullable5 = BuiltinSerializersKt.getNullable(intSerializer);
        KSerializer nullable6 = BuiltinSerializersKt.getNullable(intSerializer);
        KSerializer nullable7 = BuiltinSerializersKt.getNullable(intSerializer);
        KSerializer nullable8 = BuiltinSerializersKt.getNullable(intSerializer);
        KSerializer nullable9 = BuiltinSerializersKt.getNullable(intSerializer);
        KSerializer nullable10 = BuiltinSerializersKt.getNullable(intSerializer);
        KSerializer nullable11 = BuiltinSerializersKt.getNullable(intSerializer);
        KSerializer nullable12 = BuiltinSerializersKt.getNullable(intSerializer);
        KSerializer nullable13 = BuiltinSerializersKt.getNullable(intSerializer);
        KSerializer nullable14 = BuiltinSerializersKt.getNullable(booleanSerializer);
        KSerializer nullable15 = BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE);
        BarcodeAnalysisFragment.ReviewCondition[] values = BarcodeAnalysisFragment.ReviewCondition.values();
        values.getClass();
        return new KSerializer[]{nullable, nullable2, nullable3, nullable4, nullable5, nullable6, nullable7, nullable8, nullable9, nullable10, nullable11, nullable12, nullable13, nullable14, nullable15, BuiltinSerializersKt.getNullable(new EnumSerializer("com.miteksystems.misnap.workflow.fragment.BarcodeAnalysisFragment.ReviewCondition", (Enum[]) values)), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(intSerializer)};
    }

    @Override // kotlinx.serialization.KSerializer
    public BarcodeAnalysisFragment.WorkflowSettings deserialize(Decoder decoder) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        int i;
        Object obj5;
        Object obj6;
        decoder.getClass();
        SerialDescriptor descriptor = getDescriptor();
        CompositeDecoder beginStructure = decoder.beginStructure(descriptor);
        Object obj7 = null;
        Object obj8 = null;
        Object obj9 = null;
        Object obj10 = null;
        Object obj11 = null;
        Object obj12 = null;
        Object obj13 = null;
        Object obj14 = null;
        Object obj15 = null;
        Object obj16 = null;
        Object obj17 = null;
        Object obj18 = null;
        Object obj19 = null;
        Object obj20 = null;
        boolean z = true;
        int i2 = 0;
        Object obj21 = null;
        Object obj22 = null;
        Object obj23 = null;
        Object obj24 = null;
        Object obj25 = null;
        Object obj26 = null;
        Object obj27 = null;
        while (z) {
            int decodeElementIndex = beginStructure.decodeElementIndex(descriptor);
            Object obj28 = obj19;
            switch (decodeElementIndex) {
                case -1:
                    z = false;
                    obj8 = obj8;
                    obj21 = obj21;
                    obj26 = obj26;
                    obj7 = obj7;
                    obj25 = obj25;
                    obj19 = obj28;
                case 0:
                    Object obj29 = obj25;
                    Object obj30 = obj26;
                    obj = obj8;
                    obj14 = obj14;
                    obj23 = obj23;
                    obj2 = obj22;
                    obj21 = beginStructure.decodeNullableSerializableElement(descriptor, 0, IntSerializer.INSTANCE, obj21);
                    obj7 = obj7;
                    obj3 = obj27;
                    obj4 = obj30;
                    obj25 = obj29;
                    i = 1;
                    i2 |= i;
                    obj22 = obj2;
                    obj8 = obj;
                    obj26 = obj4;
                    obj27 = obj3;
                    obj19 = obj28;
                case 1:
                    Object obj31 = obj25;
                    Object obj32 = obj26;
                    obj = obj8;
                    obj7 = obj7;
                    obj14 = obj14;
                    obj23 = obj23;
                    obj3 = obj27;
                    obj2 = beginStructure.decodeNullableSerializableElement(descriptor, 1, FloatSerializer.INSTANCE, obj22);
                    obj4 = obj32;
                    obj25 = obj31;
                    i = 2;
                    i2 |= i;
                    obj22 = obj2;
                    obj8 = obj;
                    obj26 = obj4;
                    obj27 = obj3;
                    obj19 = obj28;
                case 2:
                    Object obj33 = obj25;
                    Object obj34 = obj26;
                    obj = obj8;
                    obj2 = obj22;
                    obj24 = obj24;
                    obj7 = obj7;
                    obj23 = beginStructure.decodeNullableSerializableElement(descriptor, 2, FloatSerializer.INSTANCE, obj23);
                    obj3 = obj27;
                    obj14 = obj14;
                    obj4 = obj34;
                    obj25 = obj33;
                    i = 4;
                    i2 |= i;
                    obj22 = obj2;
                    obj8 = obj;
                    obj26 = obj4;
                    obj27 = obj3;
                    obj19 = obj28;
                case 3:
                    Object obj35 = obj25;
                    Object obj36 = obj26;
                    obj = obj8;
                    obj24 = beginStructure.decodeNullableSerializableElement(descriptor, 3, BooleanSerializer.INSTANCE, obj24);
                    obj2 = obj22;
                    obj7 = obj7;
                    obj14 = obj14;
                    obj3 = obj27;
                    obj4 = obj36;
                    obj25 = obj35;
                    i = 8;
                    i2 |= i;
                    obj22 = obj2;
                    obj8 = obj;
                    obj26 = obj4;
                    obj27 = obj3;
                    obj19 = obj28;
                case 4:
                    obj25 = beginStructure.decodeNullableSerializableElement(descriptor, 4, IntSerializer.INSTANCE, obj25);
                    obj7 = obj7;
                    obj3 = obj27;
                    obj4 = obj26;
                    obj = obj8;
                    obj2 = obj22;
                    obj14 = obj14;
                    i = 16;
                    i2 |= i;
                    obj22 = obj2;
                    obj8 = obj;
                    obj26 = obj4;
                    obj27 = obj3;
                    obj19 = obj28;
                case 5:
                    Object obj37 = obj14;
                    i = 32;
                    Object obj38 = obj27;
                    obj4 = beginStructure.decodeNullableSerializableElement(descriptor, 5, IntSerializer.INSTANCE, obj26);
                    obj7 = obj7;
                    obj3 = obj38;
                    obj = obj8;
                    obj2 = obj22;
                    obj14 = obj37;
                    i2 |= i;
                    obj22 = obj2;
                    obj8 = obj;
                    obj26 = obj4;
                    obj27 = obj3;
                    obj19 = obj28;
                case 6:
                    i = 64;
                    obj3 = beginStructure.decodeNullableSerializableElement(descriptor, 6, IntSerializer.INSTANCE, obj27);
                    obj7 = obj7;
                    obj2 = obj22;
                    obj4 = obj26;
                    obj14 = obj14;
                    obj = obj8;
                    i2 |= i;
                    obj22 = obj2;
                    obj8 = obj;
                    obj26 = obj4;
                    obj27 = obj3;
                    obj19 = obj28;
                case 7:
                    obj28 = beginStructure.decodeNullableSerializableElement(descriptor, 7, IntSerializer.INSTANCE, obj28);
                    obj2 = obj22;
                    obj14 = obj14;
                    i = 128;
                    obj7 = obj7;
                    obj3 = obj27;
                    obj4 = obj26;
                    obj = obj8;
                    i2 |= i;
                    obj22 = obj2;
                    obj8 = obj;
                    obj26 = obj4;
                    obj27 = obj3;
                    obj19 = obj28;
                case 8:
                    obj20 = beginStructure.decodeNullableSerializableElement(descriptor, 8, IntSerializer.INSTANCE, obj20);
                    i = 256;
                    obj2 = obj22;
                    obj3 = obj27;
                    obj14 = obj14;
                    obj4 = obj26;
                    obj = obj8;
                    i2 |= i;
                    obj22 = obj2;
                    obj8 = obj;
                    obj26 = obj4;
                    obj27 = obj3;
                    obj19 = obj28;
                case 9:
                    obj5 = obj14;
                    obj9 = beginStructure.decodeNullableSerializableElement(descriptor, 9, IntSerializer.INSTANCE, obj9);
                    i = 512;
                    obj2 = obj22;
                    obj14 = obj5;
                    obj3 = obj27;
                    obj4 = obj26;
                    obj = obj8;
                    i2 |= i;
                    obj22 = obj2;
                    obj8 = obj;
                    obj26 = obj4;
                    obj27 = obj3;
                    obj19 = obj28;
                case 10:
                    obj5 = obj14;
                    obj8 = beginStructure.decodeNullableSerializableElement(descriptor, 10, IntSerializer.INSTANCE, obj8);
                    i = 1024;
                    obj2 = obj22;
                    obj14 = obj5;
                    obj3 = obj27;
                    obj4 = obj26;
                    obj = obj8;
                    i2 |= i;
                    obj22 = obj2;
                    obj8 = obj;
                    obj26 = obj4;
                    obj27 = obj3;
                    obj19 = obj28;
                case 11:
                    obj5 = obj14;
                    obj7 = beginStructure.decodeNullableSerializableElement(descriptor, 11, IntSerializer.INSTANCE, obj7);
                    i = 2048;
                    obj2 = obj22;
                    obj14 = obj5;
                    obj3 = obj27;
                    obj4 = obj26;
                    obj = obj8;
                    i2 |= i;
                    obj22 = obj2;
                    obj8 = obj;
                    obj26 = obj4;
                    obj27 = obj3;
                    obj19 = obj28;
                case 12:
                    obj5 = obj14;
                    obj10 = beginStructure.decodeNullableSerializableElement(descriptor, 12, IntSerializer.INSTANCE, obj10);
                    i = 4096;
                    obj2 = obj22;
                    obj14 = obj5;
                    obj3 = obj27;
                    obj4 = obj26;
                    obj = obj8;
                    i2 |= i;
                    obj22 = obj2;
                    obj8 = obj;
                    obj26 = obj4;
                    obj27 = obj3;
                    obj19 = obj28;
                case 13:
                    obj5 = obj14;
                    obj11 = beginStructure.decodeNullableSerializableElement(descriptor, 13, BooleanSerializer.INSTANCE, obj11);
                    i = PKIFailureInfo.certRevoked;
                    obj2 = obj22;
                    obj14 = obj5;
                    obj3 = obj27;
                    obj4 = obj26;
                    obj = obj8;
                    i2 |= i;
                    obj22 = obj2;
                    obj8 = obj;
                    obj26 = obj4;
                    obj27 = obj3;
                    obj19 = obj28;
                case 14:
                    obj5 = obj14;
                    obj12 = beginStructure.decodeNullableSerializableElement(descriptor, 14, StringSerializer.INSTANCE, obj12);
                    i = 16384;
                    obj2 = obj22;
                    obj14 = obj5;
                    obj3 = obj27;
                    obj4 = obj26;
                    obj = obj8;
                    i2 |= i;
                    obj22 = obj2;
                    obj8 = obj;
                    obj26 = obj4;
                    obj27 = obj3;
                    obj19 = obj28;
                case 15:
                    BarcodeAnalysisFragment.ReviewCondition[] values = BarcodeAnalysisFragment.ReviewCondition.values();
                    values.getClass();
                    obj5 = obj14;
                    obj13 = beginStructure.decodeNullableSerializableElement(descriptor, 15, new EnumSerializer("com.miteksystems.misnap.workflow.fragment.BarcodeAnalysisFragment.ReviewCondition", (Enum[]) values), obj13);
                    i = 32768;
                    obj2 = obj22;
                    obj20 = obj20;
                    obj14 = obj5;
                    obj3 = obj27;
                    obj4 = obj26;
                    obj = obj8;
                    i2 |= i;
                    obj22 = obj2;
                    obj8 = obj;
                    obj26 = obj4;
                    obj27 = obj3;
                    obj19 = obj28;
                case 16:
                    obj6 = obj20;
                    obj14 = beginStructure.decodeNullableSerializableElement(descriptor, 16, BooleanSerializer.INSTANCE, obj14);
                    i = 65536;
                    obj2 = obj22;
                    obj20 = obj6;
                    obj3 = obj27;
                    obj4 = obj26;
                    obj = obj8;
                    i2 |= i;
                    obj22 = obj2;
                    obj8 = obj;
                    obj26 = obj4;
                    obj27 = obj3;
                    obj19 = obj28;
                case 17:
                    obj6 = obj20;
                    obj15 = beginStructure.decodeNullableSerializableElement(descriptor, 17, BooleanSerializer.INSTANCE, obj15);
                    i = PKIFailureInfo.unsupportedVersion;
                    obj2 = obj22;
                    obj20 = obj6;
                    obj3 = obj27;
                    obj4 = obj26;
                    obj = obj8;
                    i2 |= i;
                    obj22 = obj2;
                    obj8 = obj;
                    obj26 = obj4;
                    obj27 = obj3;
                    obj19 = obj28;
                case 18:
                    obj6 = obj20;
                    obj16 = beginStructure.decodeNullableSerializableElement(descriptor, 18, IntSerializer.INSTANCE, obj16);
                    i = PKIFailureInfo.transactionIdInUse;
                    obj2 = obj22;
                    obj20 = obj6;
                    obj3 = obj27;
                    obj4 = obj26;
                    obj = obj8;
                    i2 |= i;
                    obj22 = obj2;
                    obj8 = obj;
                    obj26 = obj4;
                    obj27 = obj3;
                    obj19 = obj28;
                case 19:
                    obj6 = obj20;
                    obj17 = beginStructure.decodeNullableSerializableElement(descriptor, 19, BooleanSerializer.INSTANCE, obj17);
                    i = PKIFailureInfo.signerNotTrusted;
                    obj2 = obj22;
                    obj20 = obj6;
                    obj3 = obj27;
                    obj4 = obj26;
                    obj = obj8;
                    i2 |= i;
                    obj22 = obj2;
                    obj8 = obj;
                    obj26 = obj4;
                    obj27 = obj3;
                    obj19 = obj28;
                case 20:
                    obj6 = obj20;
                    obj18 = beginStructure.decodeNullableSerializableElement(descriptor, 20, IntSerializer.INSTANCE, obj18);
                    i = PKIFailureInfo.badCertTemplate;
                    obj2 = obj22;
                    obj20 = obj6;
                    obj3 = obj27;
                    obj4 = obj26;
                    obj = obj8;
                    i2 |= i;
                    obj22 = obj2;
                    obj8 = obj;
                    obj26 = obj4;
                    obj27 = obj3;
                    obj19 = obj28;
                default:
                    LocalPresenterModule$Companion$$ExternalSyntheticLambda0.m(decodeElementIndex);
                    return null;
            }
        }
        Object obj39 = obj7;
        Object obj40 = obj14;
        Object obj41 = obj19;
        Object obj42 = obj21;
        Object obj43 = obj23;
        Object obj44 = obj25;
        Object obj45 = obj26;
        Object obj46 = obj8;
        beginStructure.endStructure(descriptor);
        return new BarcodeAnalysisFragment.WorkflowSettings(i2, (Integer) obj42, (Float) obj22, (Float) obj43, (Boolean) obj24, (Integer) obj44, (Integer) obj45, (Integer) obj27, (Integer) obj41, (Integer) obj20, (Integer) obj9, (Integer) obj46, (Integer) obj39, (Integer) obj10, (Boolean) obj11, (String) obj12, (BarcodeAnalysisFragment.ReviewCondition) obj13, (Boolean) obj40, (Boolean) obj15, (Integer) obj16, (Boolean) obj17, (Integer) obj18);
    }

    @Override // kotlinx.serialization.KSerializer
    public SerialDescriptor getDescriptor() {
        return a;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, BarcodeAnalysisFragment.WorkflowSettings value) {
        Boolean bool;
        Integer num;
        encoder.getClass();
        value.getClass();
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
        Integer num2 = value.u;
        Boolean bool2 = value.t;
        Integer num3 = value.s;
        Boolean bool3 = value.r;
        Boolean bool4 = value.q;
        BarcodeAnalysisFragment.ReviewCondition reviewCondition = value.p;
        String str = value.o;
        Boolean bool5 = value.n;
        Integer num4 = value.m;
        Integer num5 = value.l;
        Integer num6 = value.k;
        Integer num7 = value.j;
        Integer num8 = value.i;
        Integer num9 = value.h;
        Integer num10 = value.g;
        Integer num11 = value.f;
        Integer num12 = value.e;
        Boolean bool6 = value.d;
        Float f = value.c;
        Float f2 = value.b;
        Integer num13 = value.a;
        if (!beginStructure.shouldEncodeElementDefault(descriptor) && num13 == null) {
            bool = bool5;
            num = num4;
        } else {
            bool = bool5;
            num = num4;
            beginStructure.encodeNullableSerializableElement(descriptor, 0, IntSerializer.INSTANCE, num13);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || f2 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 1, FloatSerializer.INSTANCE, f2);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || f != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 2, FloatSerializer.INSTANCE, f);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || bool6 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 3, BooleanSerializer.INSTANCE, bool6);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || num12 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 4, IntSerializer.INSTANCE, num12);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || num11 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 5, IntSerializer.INSTANCE, num11);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || num10 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 6, IntSerializer.INSTANCE, num10);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || num9 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 7, IntSerializer.INSTANCE, num9);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || num8 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 8, IntSerializer.INSTANCE, num8);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || num7 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 9, IntSerializer.INSTANCE, num7);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || num6 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 10, IntSerializer.INSTANCE, num6);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || num5 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 11, IntSerializer.INSTANCE, num5);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || num != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 12, IntSerializer.INSTANCE, num);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || bool != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 13, BooleanSerializer.INSTANCE, bool);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || str != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 14, StringSerializer.INSTANCE, str);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || reviewCondition != null) {
            BarcodeAnalysisFragment.ReviewCondition[] values = BarcodeAnalysisFragment.ReviewCondition.values();
            values.getClass();
            beginStructure.encodeNullableSerializableElement(descriptor, 15, new EnumSerializer("com.miteksystems.misnap.workflow.fragment.BarcodeAnalysisFragment.ReviewCondition", (Enum[]) values), reviewCondition);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || bool4 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 16, BooleanSerializer.INSTANCE, bool4);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || bool3 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 17, BooleanSerializer.INSTANCE, bool3);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || num3 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 18, IntSerializer.INSTANCE, num3);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || bool2 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 19, BooleanSerializer.INSTANCE, bool2);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || num2 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 20, IntSerializer.INSTANCE, num2);
        }
        beginStructure.endStructure(descriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
