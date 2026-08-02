package com.miteksystems.misnap.workflow.fragment;

import com.miteksystems.misnap.workflow.fragment.FaceAnalysisFragment;
import kotlin.Deprecated;
import kotlin.Metadata;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.builtins.BuiltinSerializersKt;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.BooleanSerializer;
import kotlinx.serialization.internal.EnumSerializer;
import kotlinx.serialization.internal.FloatSerializer;
import kotlinx.serialization.internal.GeneratedSerializer;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PluginGeneratedSerialDescriptor;
import kotlinx.serialization.internal.StringSerializer;
import kotlinx.serialization.internal.TuplesKt;

@Deprecated
@Metadata(d1 = {"\u00006\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\bÇ\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u001a\u0010\u0005\u001a\f\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u00040\u0003HÖ\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0018\u0010\t\u001a\u00020\u00022\u0006\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0014\u001a\u00020\u00118VXÖ\u0005¢\u0006\u0006\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0015"}, d2 = {"com/miteksystems/misnap/workflow/fragment/FaceAnalysisFragment.WorkflowSettings.$serializer", "Lkotlinx/serialization/internal/GeneratedSerializer;", "Lcom/miteksystems/misnap/workflow/fragment/FaceAnalysisFragment$WorkflowSettings;", "", "Lkotlinx/serialization/KSerializer;", "childSerializers", "()[Lkotlinx/serialization/KSerializer;", "Lkotlinx/serialization/encoding/Decoder;", "decoder", "deserialize", "(Lkotlinx/serialization/encoding/Decoder;)Lcom/miteksystems/misnap/workflow/fragment/FaceAnalysisFragment$WorkflowSettings;", "Lkotlinx/serialization/encoding/Encoder;", "encoder", "value", "", "serialize", "(Lkotlinx/serialization/encoding/Encoder;Lcom/miteksystems/misnap/workflow/fragment/FaceAnalysisFragment$WorkflowSettings;)V", "Lkotlinx/serialization/descriptors/SerialDescriptor;", "getDescriptor", "()Lkotlinx/serialization/descriptors/SerialDescriptor;", "descriptor", "workflow_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class FaceAnalysisFragment$WorkflowSettings$$serializer implements GeneratedSerializer {
    public static final FaceAnalysisFragment$WorkflowSettings$$serializer INSTANCE;
    public static final /* synthetic */ PluginGeneratedSerialDescriptor a;

    static {
        FaceAnalysisFragment$WorkflowSettings$$serializer faceAnalysisFragment$WorkflowSettings$$serializer = new FaceAnalysisFragment$WorkflowSettings$$serializer();
        INSTANCE = faceAnalysisFragment$WorkflowSettings$$serializer;
        PluginGeneratedSerialDescriptor pluginGeneratedSerialDescriptor = new PluginGeneratedSerialDescriptor("com.miteksystems.misnap.workflow.fragment.FaceAnalysisFragment.WorkflowSettings", faceAnalysisFragment$WorkflowSettings$$serializer, 31);
        pluginGeneratedSerialDescriptor.addElement("guideViewDrawableId", true);
        pluginGeneratedSerialDescriptor.addElement("guideViewScalePercentage", true);
        pluginGeneratedSerialDescriptor.addElement("guideViewShowVignette", true);
        pluginGeneratedSerialDescriptor.addElement("manualButtonDrawableId", true);
        pluginGeneratedSerialDescriptor.addElement("timeoutDuration", true);
        pluginGeneratedSerialDescriptor.addElement("torchViewOnDrawableId", true);
        pluginGeneratedSerialDescriptor.addElement("torchViewOffDrawableId", true);
        pluginGeneratedSerialDescriptor.addElement("hintDuration", true);
        pluginGeneratedSerialDescriptor.addElement("hintAnimationId", true);
        pluginGeneratedSerialDescriptor.addElement("hintViewShouldShowBackground", true);
        pluginGeneratedSerialDescriptor.addElement("hintViewInitialHintDelay", true);
        pluginGeneratedSerialDescriptor.addElement("showCountdownTimer", true);
        pluginGeneratedSerialDescriptor.addElement("countdownTimerDuration", true);
        pluginGeneratedSerialDescriptor.addElement("countdownTimerLabelsId", true);
        pluginGeneratedSerialDescriptor.addElement("countdownTimerAnimationId", true);
        pluginGeneratedSerialDescriptor.addElement("recordingIconDrawableId", true);
        pluginGeneratedSerialDescriptor.addElement("recordingIconAnimationId", true);
        pluginGeneratedSerialDescriptor.addElement("helpButtonDrawableId", true);
        pluginGeneratedSerialDescriptor.addElement("successViewMessageDrawableId", true);
        pluginGeneratedSerialDescriptor.addElement("successViewMessageAnimationId", true);
        pluginGeneratedSerialDescriptor.addElement("successViewBackgroundDrawableId", true);
        pluginGeneratedSerialDescriptor.addElement("successViewShouldVibrate", true);
        pluginGeneratedSerialDescriptor.addElement("successViewSoundUri", true);
        pluginGeneratedSerialDescriptor.addElement("misnapViewShouldShowBoundingBox", true);
        pluginGeneratedSerialDescriptor.addElement("reviewCondition", true);
        pluginGeneratedSerialDescriptor.addElement("handleOrientation", true);
        pluginGeneratedSerialDescriptor.addElement("changeGuideViewStateOnFeedback", true);
        pluginGeneratedSerialDescriptor.addElement("lowLightSensitivity", true);
        pluginGeneratedSerialDescriptor.addElement("shouldShowCancelButton", true);
        pluginGeneratedSerialDescriptor.addElement("cancelButtonDrawableId", true);
        pluginGeneratedSerialDescriptor.addElement("hintViewShouldAnnounceUnchangedHints", true);
        a = pluginGeneratedSerialDescriptor;
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] childSerializers() {
        IntSerializer intSerializer = IntSerializer.INSTANCE;
        KSerializer nullable = BuiltinSerializersKt.getNullable(intSerializer);
        KSerializer nullable2 = BuiltinSerializersKt.getNullable(FloatSerializer.INSTANCE);
        BooleanSerializer booleanSerializer = BooleanSerializer.INSTANCE;
        KSerializer nullable3 = BuiltinSerializersKt.getNullable(booleanSerializer);
        KSerializer nullable4 = BuiltinSerializersKt.getNullable(intSerializer);
        KSerializer nullable5 = BuiltinSerializersKt.getNullable(intSerializer);
        KSerializer nullable6 = BuiltinSerializersKt.getNullable(intSerializer);
        KSerializer nullable7 = BuiltinSerializersKt.getNullable(intSerializer);
        KSerializer nullable8 = BuiltinSerializersKt.getNullable(intSerializer);
        KSerializer nullable9 = BuiltinSerializersKt.getNullable(intSerializer);
        KSerializer nullable10 = BuiltinSerializersKt.getNullable(booleanSerializer);
        KSerializer nullable11 = BuiltinSerializersKt.getNullable(intSerializer);
        KSerializer nullable12 = BuiltinSerializersKt.getNullable(booleanSerializer);
        KSerializer nullable13 = BuiltinSerializersKt.getNullable(intSerializer);
        KSerializer nullable14 = BuiltinSerializersKt.getNullable(intSerializer);
        KSerializer nullable15 = BuiltinSerializersKt.getNullable(intSerializer);
        KSerializer nullable16 = BuiltinSerializersKt.getNullable(intSerializer);
        KSerializer nullable17 = BuiltinSerializersKt.getNullable(intSerializer);
        KSerializer nullable18 = BuiltinSerializersKt.getNullable(intSerializer);
        KSerializer nullable19 = BuiltinSerializersKt.getNullable(intSerializer);
        KSerializer nullable20 = BuiltinSerializersKt.getNullable(intSerializer);
        KSerializer nullable21 = BuiltinSerializersKt.getNullable(intSerializer);
        KSerializer nullable22 = BuiltinSerializersKt.getNullable(booleanSerializer);
        KSerializer nullable23 = BuiltinSerializersKt.getNullable(StringSerializer.INSTANCE);
        KSerializer nullable24 = BuiltinSerializersKt.getNullable(booleanSerializer);
        FaceAnalysisFragment.ReviewCondition[] values = FaceAnalysisFragment.ReviewCondition.values();
        values.getClass();
        KSerializer nullable25 = BuiltinSerializersKt.getNullable(new EnumSerializer("com.miteksystems.misnap.workflow.fragment.FaceAnalysisFragment.ReviewCondition", (Enum[]) values));
        KSerializer nullable26 = BuiltinSerializersKt.getNullable(booleanSerializer);
        KSerializer nullable27 = BuiltinSerializersKt.getNullable(booleanSerializer);
        FaceAnalysisFragment.LowLightSensitivity[] values2 = FaceAnalysisFragment.LowLightSensitivity.values();
        values2.getClass();
        return new KSerializer[]{nullable, nullable2, nullable3, nullable4, nullable5, nullable6, nullable7, nullable8, nullable9, nullable10, nullable11, nullable12, nullable13, nullable14, nullable15, nullable16, nullable17, nullable18, nullable19, nullable20, nullable21, nullable22, nullable23, nullable24, nullable25, nullable26, nullable27, BuiltinSerializersKt.getNullable(new EnumSerializer("com.miteksystems.misnap.workflow.fragment.FaceAnalysisFragment.LowLightSensitivity", (Enum[]) values2)), BuiltinSerializersKt.getNullable(booleanSerializer), BuiltinSerializersKt.getNullable(intSerializer), BuiltinSerializersKt.getNullable(booleanSerializer)};
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type update terminated with stack overflow, arg: (r9v21 java.lang.Object), method size: 1462
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    @Override // kotlinx.serialization.KSerializer
    public com.miteksystems.misnap.workflow.fragment.FaceAnalysisFragment.WorkflowSettings deserialize(kotlinx.serialization.encoding.Decoder r41) {
        /*
            Method dump skipped, instructions count: 1462
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.miteksystems.misnap.workflow.fragment.FaceAnalysisFragment$WorkflowSettings$$serializer.deserialize(kotlinx.serialization.encoding.Decoder):com.miteksystems.misnap.workflow.fragment.FaceAnalysisFragment$WorkflowSettings");
    }

    @Override // kotlinx.serialization.KSerializer
    public SerialDescriptor getDescriptor() {
        return a;
    }

    @Override // kotlinx.serialization.KSerializer
    public void serialize(Encoder encoder, FaceAnalysisFragment.WorkflowSettings value) {
        Integer num;
        Integer num2;
        encoder.getClass();
        value.getClass();
        Boolean bool = value.E;
        Integer num3 = value.D;
        Boolean bool2 = value.C;
        FaceAnalysisFragment.LowLightSensitivity lowLightSensitivity = value.B;
        Boolean bool3 = value.A;
        Boolean bool4 = value.z;
        FaceAnalysisFragment.ReviewCondition reviewCondition = value.y;
        Boolean bool5 = value.x;
        String str = value.w;
        SerialDescriptor descriptor = getDescriptor();
        CompositeEncoder beginStructure = encoder.beginStructure(descriptor);
        Boolean bool6 = value.v;
        Integer num4 = value.u;
        Integer num5 = value.t;
        Integer num6 = value.s;
        Integer num7 = value.r;
        Integer num8 = value.q;
        Integer num9 = value.p;
        Integer num10 = value.o;
        Integer num11 = value.n;
        Integer num12 = value.m;
        Boolean bool7 = value.l;
        Integer num13 = value.k;
        Boolean bool8 = value.j;
        Integer num14 = value.i;
        Integer num15 = value.h;
        Integer num16 = value.g;
        Integer num17 = value.f;
        Integer num18 = value.e;
        Integer num19 = value.d;
        Boolean bool9 = value.c;
        Float f = value.b;
        Integer num20 = value.a;
        if (!beginStructure.shouldEncodeElementDefault(descriptor) && num20 == null) {
            num = num11;
            num2 = num12;
        } else {
            num = num11;
            num2 = num12;
            beginStructure.encodeNullableSerializableElement(descriptor, 0, IntSerializer.INSTANCE, num20);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || f != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 1, FloatSerializer.INSTANCE, f);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || bool9 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 2, BooleanSerializer.INSTANCE, bool9);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || num19 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 3, IntSerializer.INSTANCE, num19);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || num18 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 4, IntSerializer.INSTANCE, num18);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || num17 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 5, IntSerializer.INSTANCE, num17);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || num16 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 6, IntSerializer.INSTANCE, num16);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || num15 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 7, IntSerializer.INSTANCE, num15);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || num14 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 8, IntSerializer.INSTANCE, num14);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || bool8 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 9, BooleanSerializer.INSTANCE, bool8);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || num13 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 10, IntSerializer.INSTANCE, num13);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || bool7 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 11, BooleanSerializer.INSTANCE, bool7);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || num2 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 12, IntSerializer.INSTANCE, num2);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || num != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 13, IntSerializer.INSTANCE, num);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || num10 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 14, IntSerializer.INSTANCE, num10);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || num9 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 15, IntSerializer.INSTANCE, num9);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || num8 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 16, IntSerializer.INSTANCE, num8);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || num7 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 17, IntSerializer.INSTANCE, num7);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || num6 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 18, IntSerializer.INSTANCE, num6);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || num5 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 19, IntSerializer.INSTANCE, num5);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || num4 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 20, IntSerializer.INSTANCE, num4);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || bool6 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 21, BooleanSerializer.INSTANCE, bool6);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || str != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 22, StringSerializer.INSTANCE, str);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || bool5 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 23, BooleanSerializer.INSTANCE, bool5);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || reviewCondition != null) {
            FaceAnalysisFragment.ReviewCondition[] values = FaceAnalysisFragment.ReviewCondition.values();
            values.getClass();
            beginStructure.encodeNullableSerializableElement(descriptor, 24, new EnumSerializer("com.miteksystems.misnap.workflow.fragment.FaceAnalysisFragment.ReviewCondition", (Enum[]) values), reviewCondition);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || bool4 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 25, BooleanSerializer.INSTANCE, bool4);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || bool3 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 26, BooleanSerializer.INSTANCE, bool3);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || lowLightSensitivity != null) {
            FaceAnalysisFragment.LowLightSensitivity[] values2 = FaceAnalysisFragment.LowLightSensitivity.values();
            values2.getClass();
            beginStructure.encodeNullableSerializableElement(descriptor, 27, new EnumSerializer("com.miteksystems.misnap.workflow.fragment.FaceAnalysisFragment.LowLightSensitivity", (Enum[]) values2), lowLightSensitivity);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || bool2 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 28, BooleanSerializer.INSTANCE, bool2);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || num3 != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 29, IntSerializer.INSTANCE, num3);
        }
        if (beginStructure.shouldEncodeElementDefault(descriptor) || bool != null) {
            beginStructure.encodeNullableSerializableElement(descriptor, 30, BooleanSerializer.INSTANCE, bool);
        }
        beginStructure.endStructure(descriptor);
    }

    @Override // kotlinx.serialization.internal.GeneratedSerializer
    public KSerializer[] typeParametersSerializers() {
        return TuplesKt.EMPTY_SERIALIZER_ARRAY;
    }
}
