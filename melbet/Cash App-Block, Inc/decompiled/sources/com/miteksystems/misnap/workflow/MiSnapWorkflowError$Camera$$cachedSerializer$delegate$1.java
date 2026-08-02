package com.miteksystems.misnap.workflow;

import com.miteksystems.misnap.workflow.MiSnapFinalResult;
import com.miteksystems.misnap.workflow.MiSnapWorkflowError;
import com.miteksystems.misnap.workflow.MiSnapWorkflowStep;
import java.lang.annotation.Annotation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.ReflectionFactory;
import kotlin.reflect.KClass;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SealedClassSerializer;
import kotlinx.serialization.internal.EnumSerializer;

/* loaded from: classes4.dex */
public final class MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1 extends Lambda implements Function0 {
    public static final MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1 INSTANCE;
    public static final MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1 INSTANCE$1;
    public static final MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1 INSTANCE$10;
    public static final MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1 INSTANCE$11;
    public static final MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1 INSTANCE$12;
    public static final MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1 INSTANCE$13;
    public static final MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1 INSTANCE$14;
    public static final MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1 INSTANCE$15;
    public static final MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1 INSTANCE$16;
    public static final MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1 INSTANCE$17;
    public static final MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1 INSTANCE$18;
    public static final MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1 INSTANCE$19;
    public static final MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1 INSTANCE$2;
    public static final MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1 INSTANCE$20;
    public static final MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1 INSTANCE$21;
    public static final MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1 INSTANCE$22;
    public static final MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1 INSTANCE$23;
    public static final MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1 INSTANCE$24;
    public static final MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1 INSTANCE$25;
    public static final MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1 INSTANCE$3;
    public static final MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1 INSTANCE$4;
    public static final MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1 INSTANCE$5;
    public static final MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1 INSTANCE$6;
    public static final MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1 INSTANCE$7;
    public static final MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1 INSTANCE$8;
    public static final MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1 INSTANCE$9;
    public final /* synthetic */ int $r8$classId;

    static {
        int i = 0;
        INSTANCE$1 = new MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1(i, 1);
        INSTANCE$2 = new MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1(i, 2);
        INSTANCE = new MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1(i, 0);
        INSTANCE$3 = new MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1(i, 3);
        INSTANCE$4 = new MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1(i, 4);
        INSTANCE$5 = new MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1(i, 5);
        INSTANCE$6 = new MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1(i, 6);
        INSTANCE$7 = new MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1(i, 7);
        INSTANCE$8 = new MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1(i, 8);
        INSTANCE$9 = new MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1(i, 9);
        INSTANCE$10 = new MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1(i, 10);
        INSTANCE$11 = new MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1(i, 11);
        INSTANCE$12 = new MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1(i, 12);
        INSTANCE$13 = new MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1(i, 13);
        INSTANCE$14 = new MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1(i, 14);
        INSTANCE$15 = new MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1(i, 15);
        INSTANCE$16 = new MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1(i, 16);
        INSTANCE$17 = new MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1(i, 17);
        INSTANCE$18 = new MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1(i, 18);
        INSTANCE$19 = new MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1(i, 19);
        INSTANCE$20 = new MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1(i, 20);
        INSTANCE$21 = new MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1(i, 21);
        INSTANCE$22 = new MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1(i, 22);
        INSTANCE$23 = new MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1(i, 23);
        INSTANCE$24 = new MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1(i, 24);
        INSTANCE$25 = new MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1(i, 25);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1(int i, int i2) {
        super(i);
        this.$r8$classId = i2;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.$r8$classId) {
            case 0:
                return new EnumSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.Camera", MiSnapWorkflowError.Camera.INSTANCE, new Annotation[0]);
            case 1:
                ReflectionFactory reflectionFactory = Reflection.factory;
                return new SealedClassSerializer("com.miteksystems.misnap.workflow.MiSnapFinalResult", reflectionFactory.getOrCreateKotlinClass(MiSnapFinalResult.class), new KClass[]{reflectionFactory.getOrCreateKotlinClass(MiSnapFinalResult.BarcodeSession.class), reflectionFactory.getOrCreateKotlinClass(MiSnapFinalResult.DocumentSession.class), reflectionFactory.getOrCreateKotlinClass(MiSnapFinalResult.FaceSession.class), reflectionFactory.getOrCreateKotlinClass(MiSnapFinalResult.NfcSession.class), reflectionFactory.getOrCreateKotlinClass(MiSnapFinalResult.VoiceSession.class)}, new KSerializer[]{MiSnapFinalResult$BarcodeSession$$serializer.INSTANCE, MiSnapFinalResult$DocumentSession$$serializer.INSTANCE, MiSnapFinalResult$FaceSession$$serializer.INSTANCE, MiSnapFinalResult$NfcSession$$serializer.INSTANCE, MiSnapFinalResult$VoiceSession$$serializer.INSTANCE}, new Annotation[0]);
            case 2:
                return new EnumSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.Analysis", MiSnapWorkflowError.Analysis.INSTANCE, new Annotation[0]);
            case 3:
                return new EnumSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.Cancelled", MiSnapWorkflowError.Cancelled.INSTANCE, new Annotation[0]);
            case 4:
                return new EnumSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.CombinedWorkflow", MiSnapWorkflowError.CombinedWorkflow.INSTANCE, new Annotation[0]);
            case 5:
                return new EnumSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.CombinedWorkflowSkippedStep", MiSnapWorkflowError.CombinedWorkflowSkippedStep.INSTANCE, new Annotation[0]);
            case 6:
                ReflectionFactory reflectionFactory2 = Reflection.factory;
                return new SealedClassSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError", reflectionFactory2.getOrCreateKotlinClass(MiSnapWorkflowError.class), new KClass[]{reflectionFactory2.getOrCreateKotlinClass(MiSnapWorkflowError.Analysis.class), reflectionFactory2.getOrCreateKotlinClass(MiSnapWorkflowError.Camera.class), reflectionFactory2.getOrCreateKotlinClass(MiSnapWorkflowError.Cancelled.class), reflectionFactory2.getOrCreateKotlinClass(MiSnapWorkflowError.CombinedWorkflow.class), reflectionFactory2.getOrCreateKotlinClass(MiSnapWorkflowError.CombinedWorkflowSkippedStep.class), reflectionFactory2.getOrCreateKotlinClass(MiSnapWorkflowError.License.class), reflectionFactory2.getOrCreateKotlinClass(MiSnapWorkflowError.Nfc.DeviceDoesNotSupportNfc.class), reflectionFactory2.getOrCreateKotlinClass(MiSnapWorkflowError.Nfc.DocumentNotNfcEnabled.class), reflectionFactory2.getOrCreateKotlinClass(MiSnapWorkflowError.Nfc.InvalidCredentials.class), reflectionFactory2.getOrCreateKotlinClass(MiSnapWorkflowError.Nfc.Skipped.class), reflectionFactory2.getOrCreateKotlinClass(MiSnapWorkflowError.Permission.class), reflectionFactory2.getOrCreateKotlinClass(MiSnapWorkflowError.SettingState.class), reflectionFactory2.getOrCreateKotlinClass(MiSnapWorkflowError.Voice.Execution.class), reflectionFactory2.getOrCreateKotlinClass(MiSnapWorkflowError.Voice.Initialization.class), reflectionFactory2.getOrCreateKotlinClass(MiSnapWorkflowError.Voice.InputFormat.class), reflectionFactory2.getOrCreateKotlinClass(MiSnapWorkflowError.Voice.MicrophoneMuted.class), reflectionFactory2.getOrCreateKotlinClass(MiSnapWorkflowError.Voice.MissingRequirement.class), reflectionFactory2.getOrCreateKotlinClass(MiSnapWorkflowError.Voice.Skipped.class)}, new KSerializer[]{new EnumSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.Analysis", MiSnapWorkflowError.Analysis.INSTANCE, new Annotation[0]), new EnumSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.Camera", MiSnapWorkflowError.Camera.INSTANCE, new Annotation[0]), new EnumSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.Cancelled", MiSnapWorkflowError.Cancelled.INSTANCE, new Annotation[0]), new EnumSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.CombinedWorkflow", MiSnapWorkflowError.CombinedWorkflow.INSTANCE, new Annotation[0]), new EnumSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.CombinedWorkflowSkippedStep", MiSnapWorkflowError.CombinedWorkflowSkippedStep.INSTANCE, new Annotation[0]), MiSnapWorkflowError$License$$serializer.INSTANCE, new EnumSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc.DeviceDoesNotSupportNfc", MiSnapWorkflowError.Nfc.DeviceDoesNotSupportNfc.INSTANCE, new Annotation[0]), new EnumSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc.DocumentNotNfcEnabled", MiSnapWorkflowError.Nfc.DocumentNotNfcEnabled.INSTANCE, new Annotation[0]), new EnumSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc.InvalidCredentials", MiSnapWorkflowError.Nfc.InvalidCredentials.INSTANCE, new Annotation[0]), new EnumSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc.Skipped", MiSnapWorkflowError.Nfc.Skipped.INSTANCE, new Annotation[0]), new EnumSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.Permission", MiSnapWorkflowError.Permission.INSTANCE, new Annotation[0]), new EnumSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.SettingState", MiSnapWorkflowError.SettingState.INSTANCE, new Annotation[0]), new EnumSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice.Execution", MiSnapWorkflowError.Voice.Execution.INSTANCE, new Annotation[0]), new EnumSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice.Initialization", MiSnapWorkflowError.Voice.Initialization.INSTANCE, new Annotation[0]), new EnumSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice.InputFormat", MiSnapWorkflowError.Voice.InputFormat.INSTANCE, new Annotation[0]), new EnumSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice.MicrophoneMuted", MiSnapWorkflowError.Voice.MicrophoneMuted.INSTANCE, new Annotation[0]), MiSnapWorkflowError$Voice$MissingRequirement$$serializer.INSTANCE, new EnumSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice.Skipped", MiSnapWorkflowError.Voice.Skipped.INSTANCE, new Annotation[0])}, new Annotation[0]);
            case 7:
                ReflectionFactory reflectionFactory3 = Reflection.factory;
                return new SealedClassSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc", reflectionFactory3.getOrCreateKotlinClass(MiSnapWorkflowError.Nfc.class), new KClass[]{reflectionFactory3.getOrCreateKotlinClass(MiSnapWorkflowError.Nfc.DeviceDoesNotSupportNfc.class), reflectionFactory3.getOrCreateKotlinClass(MiSnapWorkflowError.Nfc.DocumentNotNfcEnabled.class), reflectionFactory3.getOrCreateKotlinClass(MiSnapWorkflowError.Nfc.InvalidCredentials.class), reflectionFactory3.getOrCreateKotlinClass(MiSnapWorkflowError.Nfc.Skipped.class)}, new KSerializer[]{new EnumSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc.DeviceDoesNotSupportNfc", MiSnapWorkflowError.Nfc.DeviceDoesNotSupportNfc.INSTANCE, new Annotation[0]), new EnumSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc.DocumentNotNfcEnabled", MiSnapWorkflowError.Nfc.DocumentNotNfcEnabled.INSTANCE, new Annotation[0]), new EnumSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc.InvalidCredentials", MiSnapWorkflowError.Nfc.InvalidCredentials.INSTANCE, new Annotation[0]), new EnumSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc.Skipped", MiSnapWorkflowError.Nfc.Skipped.INSTANCE, new Annotation[0])}, new Annotation[0]);
            case 8:
                return new EnumSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc.DeviceDoesNotSupportNfc", MiSnapWorkflowError.Nfc.DeviceDoesNotSupportNfc.INSTANCE, new Annotation[0]);
            case 9:
                return new EnumSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc.DocumentNotNfcEnabled", MiSnapWorkflowError.Nfc.DocumentNotNfcEnabled.INSTANCE, new Annotation[0]);
            case 10:
                return new EnumSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc.InvalidCredentials", MiSnapWorkflowError.Nfc.InvalidCredentials.INSTANCE, new Annotation[0]);
            case 11:
                return new EnumSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.Nfc.Skipped", MiSnapWorkflowError.Nfc.Skipped.INSTANCE, new Annotation[0]);
            case 12:
                return new EnumSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.Permission", MiSnapWorkflowError.Permission.INSTANCE, new Annotation[0]);
            case 13:
                return new EnumSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.SettingState", MiSnapWorkflowError.SettingState.INSTANCE, new Annotation[0]);
            case 14:
                return new EnumSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice.Execution", MiSnapWorkflowError.Voice.Execution.INSTANCE, new Annotation[0]);
            case 15:
                return new EnumSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice.Initialization", MiSnapWorkflowError.Voice.Initialization.INSTANCE, new Annotation[0]);
            case 16:
                return new EnumSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice.InputFormat", MiSnapWorkflowError.Voice.InputFormat.INSTANCE, new Annotation[0]);
            case 17:
                return new EnumSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice.MicrophoneMuted", MiSnapWorkflowError.Voice.MicrophoneMuted.INSTANCE, new Annotation[0]);
            case 18:
                return new EnumSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowError.Voice.Skipped", MiSnapWorkflowError.Voice.Skipped.INSTANCE, new Annotation[0]);
            case 19:
                ReflectionFactory reflectionFactory4 = Reflection.factory;
                return new SealedClassSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowStep.Behavior", reflectionFactory4.getOrCreateKotlinClass(MiSnapWorkflowStep.Behavior.class), new KClass[]{reflectionFactory4.getOrCreateKotlinClass(MiSnapWorkflowStep.Behavior.None.class), reflectionFactory4.getOrCreateKotlinClass(MiSnapWorkflowStep.Behavior.OnMissingNldBSN.class), reflectionFactory4.getOrCreateKotlinClass(MiSnapWorkflowStep.Behavior.OnNfcMrzExtraction.SkipStepIfMrzMissing.class), reflectionFactory4.getOrCreateKotlinClass(MiSnapWorkflowStep.Behavior.OnNfcMrzExtraction.UseMrzIfAvailable.class)}, new KSerializer[]{new EnumSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowStep.Behavior.None", MiSnapWorkflowStep.Behavior.None.INSTANCE, new Annotation[0]), new EnumSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowStep.Behavior.OnMissingNldBSN", MiSnapWorkflowStep.Behavior.OnMissingNldBSN.INSTANCE, new Annotation[0]), new EnumSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowStep.Behavior.OnNfcMrzExtraction.SkipStepIfMrzMissing", MiSnapWorkflowStep.Behavior.OnNfcMrzExtraction.SkipStepIfMrzMissing.INSTANCE, new Annotation[0]), new EnumSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowStep.Behavior.OnNfcMrzExtraction.UseMrzIfAvailable", MiSnapWorkflowStep.Behavior.OnNfcMrzExtraction.UseMrzIfAvailable.INSTANCE, new Annotation[0])}, new Annotation[0]);
            case 20:
                return new EnumSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowStep.Behavior.None", MiSnapWorkflowStep.Behavior.None.INSTANCE, new Annotation[0]);
            case 21:
                return new EnumSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowStep.Behavior.OnMissingNldBSN", MiSnapWorkflowStep.Behavior.OnMissingNldBSN.INSTANCE, new Annotation[0]);
            case 22:
                ReflectionFactory reflectionFactory5 = Reflection.factory;
                return new SealedClassSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowStep.Behavior.OnNfcMrzExtraction", reflectionFactory5.getOrCreateKotlinClass(MiSnapWorkflowStep.Behavior.OnNfcMrzExtraction.class), new KClass[]{reflectionFactory5.getOrCreateKotlinClass(MiSnapWorkflowStep.Behavior.OnNfcMrzExtraction.SkipStepIfMrzMissing.class), reflectionFactory5.getOrCreateKotlinClass(MiSnapWorkflowStep.Behavior.OnNfcMrzExtraction.UseMrzIfAvailable.class)}, new KSerializer[]{new EnumSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowStep.Behavior.OnNfcMrzExtraction.SkipStepIfMrzMissing", MiSnapWorkflowStep.Behavior.OnNfcMrzExtraction.SkipStepIfMrzMissing.INSTANCE, new Annotation[0]), new EnumSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowStep.Behavior.OnNfcMrzExtraction.UseMrzIfAvailable", MiSnapWorkflowStep.Behavior.OnNfcMrzExtraction.UseMrzIfAvailable.INSTANCE, new Annotation[0])}, new Annotation[0]);
            case 23:
                return new EnumSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowStep.Behavior.OnNfcMrzExtraction.SkipStepIfMrzMissing", MiSnapWorkflowStep.Behavior.OnNfcMrzExtraction.SkipStepIfMrzMissing.INSTANCE, new Annotation[0]);
            case 24:
                return new EnumSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowStep.Behavior.OnNfcMrzExtraction.UseMrzIfAvailable", MiSnapWorkflowStep.Behavior.OnNfcMrzExtraction.UseMrzIfAvailable.INSTANCE, new Annotation[0]);
            default:
                ReflectionFactory reflectionFactory6 = Reflection.factory;
                return new SealedClassSerializer("com.miteksystems.misnap.workflow.MiSnapWorkflowStep.Result", reflectionFactory6.getOrCreateKotlinClass(MiSnapWorkflowStep.Result.class), new KClass[]{reflectionFactory6.getOrCreateKotlinClass(MiSnapWorkflowStep.Result.Error.class), reflectionFactory6.getOrCreateKotlinClass(MiSnapWorkflowStep.Result.Success.class)}, new KSerializer[]{MiSnapWorkflowStep$Result$Error$$serializer.INSTANCE, MiSnapWorkflowStep$Result$Success$$serializer.INSTANCE}, new Annotation[0]);
        }
    }
}
