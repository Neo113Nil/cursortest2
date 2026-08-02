package com.miteksystems.misnap.workflow;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes4.dex */
public abstract class MiSnapWorkflowError {
    public static final Companion Companion = new Companion();
    public static final Lazy a = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1.INSTANCE$6);

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/workflow/MiSnapWorkflowError$Analysis", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError;", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Analysis;", "serializer", "()Lkotlinx/serialization/KSerializer;", "workflow_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Serializable
    public final class Analysis extends MiSnapWorkflowError {
        public static final Analysis INSTANCE = new Analysis();
        public static final /* synthetic */ Lazy b = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1.INSTANCE$2);

        public final KSerializer serializer() {
            return (KSerializer) b.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/workflow/MiSnapWorkflowError$Camera", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError;", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Camera;", "serializer", "()Lkotlinx/serialization/KSerializer;", "workflow_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Serializable
    public final class Camera extends MiSnapWorkflowError {
        public static final Camera INSTANCE = new Camera();
        public static final /* synthetic */ Lazy b = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1.INSTANCE);

        public final KSerializer serializer() {
            return (KSerializer) b.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/workflow/MiSnapWorkflowError$Cancelled", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError;", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Cancelled;", "serializer", "()Lkotlinx/serialization/KSerializer;", "workflow_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Serializable
    public final class Cancelled extends MiSnapWorkflowError {
        public static final Cancelled INSTANCE = new Cancelled();
        public static final /* synthetic */ Lazy b = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1.INSTANCE$3);

        public final KSerializer serializer() {
            return (KSerializer) b.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/workflow/MiSnapWorkflowError$CombinedWorkflow", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError;", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$CombinedWorkflow;", "serializer", "()Lkotlinx/serialization/KSerializer;", "workflow_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Serializable
    public final class CombinedWorkflow extends MiSnapWorkflowError {
        public static final CombinedWorkflow INSTANCE = new CombinedWorkflow();
        public static final /* synthetic */ Lazy b = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1.INSTANCE$4);

        public final KSerializer serializer() {
            return (KSerializer) b.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/workflow/MiSnapWorkflowError$CombinedWorkflowSkippedStep", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError;", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$CombinedWorkflowSkippedStep;", "serializer", "()Lkotlinx/serialization/KSerializer;", "workflow_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Serializable
    public final class CombinedWorkflowSkippedStep extends MiSnapWorkflowError {
        public static final CombinedWorkflowSkippedStep INSTANCE = new CombinedWorkflowSkippedStep();
        public static final /* synthetic */ Lazy b = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1.INSTANCE$5);

        public final KSerializer serializer() {
            return (KSerializer) b.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/workflow/MiSnapWorkflowError$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError;", "serializer", "()Lkotlinx/serialization/KSerializer;", "workflow_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return (KSerializer) MiSnapWorkflowError.a.getValue();
        }
    }

    @Serializable
    public abstract class Nfc extends MiSnapWorkflowError {
        public static final Companion Companion = new Companion();
        public static final Lazy b = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1.INSTANCE$7);

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/workflow/MiSnapWorkflowError$Nfc$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Nfc;", "serializer", "()Lkotlinx/serialization/KSerializer;", "workflow_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return (KSerializer) Nfc.b.getValue();
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/workflow/MiSnapWorkflowError$Nfc$DeviceDoesNotSupportNfc", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Nfc;", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Nfc$DeviceDoesNotSupportNfc;", "serializer", "()Lkotlinx/serialization/KSerializer;", "workflow_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @Serializable
        public final class DeviceDoesNotSupportNfc extends Nfc {
            public static final DeviceDoesNotSupportNfc INSTANCE = new DeviceDoesNotSupportNfc();
            public static final /* synthetic */ Lazy c = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1.INSTANCE$8);

            public final KSerializer serializer() {
                return (KSerializer) c.getValue();
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/workflow/MiSnapWorkflowError$Nfc$DocumentNotNfcEnabled", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Nfc;", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Nfc$DocumentNotNfcEnabled;", "serializer", "()Lkotlinx/serialization/KSerializer;", "workflow_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @Serializable
        public final class DocumentNotNfcEnabled extends Nfc {
            public static final DocumentNotNfcEnabled INSTANCE = new DocumentNotNfcEnabled();
            public static final /* synthetic */ Lazy c = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1.INSTANCE$9);

            public final KSerializer serializer() {
                return (KSerializer) c.getValue();
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/workflow/MiSnapWorkflowError$Nfc$InvalidCredentials", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Nfc;", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Nfc$InvalidCredentials;", "serializer", "()Lkotlinx/serialization/KSerializer;", "workflow_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @Serializable
        public final class InvalidCredentials extends Nfc {
            public static final InvalidCredentials INSTANCE = new InvalidCredentials();
            public static final /* synthetic */ Lazy c = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1.INSTANCE$10);

            public final KSerializer serializer() {
                return (KSerializer) c.getValue();
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/workflow/MiSnapWorkflowError$Nfc$Skipped", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Nfc;", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Nfc$Skipped;", "serializer", "()Lkotlinx/serialization/KSerializer;", "workflow_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @Serializable
        public final class Skipped extends Nfc {
            public static final Skipped INSTANCE = new Skipped();
            public static final /* synthetic */ Lazy c = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1.INSTANCE$11);

            public final KSerializer serializer() {
                return (KSerializer) c.getValue();
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/workflow/MiSnapWorkflowError$Permission", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError;", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Permission;", "serializer", "()Lkotlinx/serialization/KSerializer;", "workflow_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Serializable
    public final class Permission extends MiSnapWorkflowError {
        public static final Permission INSTANCE = new Permission();
        public static final /* synthetic */ Lazy b = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1.INSTANCE$12);

        public final KSerializer serializer() {
            return (KSerializer) b.getValue();
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/workflow/MiSnapWorkflowError$SettingState", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError;", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$SettingState;", "serializer", "()Lkotlinx/serialization/KSerializer;", "workflow_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @Serializable
    public final class SettingState extends MiSnapWorkflowError {
        public static final SettingState INSTANCE = new SettingState();
        public static final /* synthetic */ Lazy b = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1.INSTANCE$13);

        public final KSerializer serializer() {
            return (KSerializer) b.getValue();
        }
    }

    public abstract class Voice extends MiSnapWorkflowError {

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/workflow/MiSnapWorkflowError$Voice$Execution", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Voice;", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Voice$Execution;", "serializer", "()Lkotlinx/serialization/KSerializer;", "workflow_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @Serializable
        public final class Execution extends Voice {
            public static final Execution INSTANCE = new Execution();
            public static final /* synthetic */ Lazy b = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1.INSTANCE$14);

            public final KSerializer serializer() {
                return (KSerializer) b.getValue();
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/workflow/MiSnapWorkflowError$Voice$Initialization", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Voice;", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Voice$Initialization;", "serializer", "()Lkotlinx/serialization/KSerializer;", "workflow_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @Serializable
        public final class Initialization extends Voice {
            public static final Initialization INSTANCE = new Initialization();
            public static final /* synthetic */ Lazy b = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1.INSTANCE$15);

            public final KSerializer serializer() {
                return (KSerializer) b.getValue();
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/workflow/MiSnapWorkflowError$Voice$InputFormat", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Voice;", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Voice$InputFormat;", "serializer", "()Lkotlinx/serialization/KSerializer;", "workflow_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @Serializable
        public final class InputFormat extends Voice {
            public static final InputFormat INSTANCE = new InputFormat();
            public static final /* synthetic */ Lazy b = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1.INSTANCE$16);

            public final KSerializer serializer() {
                return (KSerializer) b.getValue();
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/workflow/MiSnapWorkflowError$Voice$MicrophoneMuted", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Voice;", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Voice$MicrophoneMuted;", "serializer", "()Lkotlinx/serialization/KSerializer;", "workflow_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @Serializable
        public final class MicrophoneMuted extends Voice {
            public static final MicrophoneMuted INSTANCE = new MicrophoneMuted();
            public static final /* synthetic */ Lazy b = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1.INSTANCE$17);

            public final KSerializer serializer() {
                return (KSerializer) b.getValue();
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/workflow/MiSnapWorkflowError$Voice$Skipped", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Voice;", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Voice$Skipped;", "serializer", "()Lkotlinx/serialization/KSerializer;", "workflow_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @Serializable
        public final class Skipped extends Voice {
            public static final Skipped INSTANCE = new Skipped();
            public static final /* synthetic */ Lazy b = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1.INSTANCE$18);

            public final KSerializer serializer() {
                return (KSerializer) b.getValue();
            }
        }

        @Serializable
        public final class MissingRequirement extends Voice {
            public static final Companion Companion = new Companion();
            public final Reason b;

            @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/workflow/MiSnapWorkflowError$Voice$MissingRequirement$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$Voice$MissingRequirement;", "serializer", "()Lkotlinx/serialization/KSerializer;", "workflow_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public final class Companion {
                public final KSerializer serializer() {
                    return MiSnapWorkflowError$Voice$MissingRequirement$$serializer.INSTANCE;
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class Reason {
                public static final Reason Flow;
                public static final Reason Phrase;
                public static final /* synthetic */ Reason[] a;

                static {
                    Reason reason = new Reason("Flow", 0);
                    Flow = reason;
                    Reason reason2 = new Reason("Phrase", 1);
                    Phrase = reason2;
                    a = new Reason[]{reason, reason2};
                }

                public static Reason valueOf(String str) {
                    return (Reason) Enum.valueOf(Reason.class, str);
                }

                public static Reason[] values() {
                    return (Reason[]) a.clone();
                }
            }

            public MissingRequirement(int i, Reason reason) {
                if (1 == (i & 1)) {
                    this.b = reason;
                } else {
                    TuplesKt.throwMissingFieldException(i, 1, MiSnapWorkflowError$Voice$MissingRequirement$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
            }

            public MissingRequirement(Reason reason) {
                this.b = reason;
            }
        }
    }

    @Serializable
    public final class License extends MiSnapWorkflowError {
        public static final Companion Companion = new Companion();
        public final String b;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/workflow/MiSnapWorkflowError$License$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowError$License;", "serializer", "()Lkotlinx/serialization/KSerializer;", "workflow_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return MiSnapWorkflowError$License$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ License(int i, String str) {
            if (1 == (i & 1)) {
                this.b = str;
            } else {
                TuplesKt.throwMissingFieldException(i, 1, MiSnapWorkflowError$License$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof License) && Intrinsics.areEqual(this.b, ((License) obj).b);
        }

        public final int hashCode() {
            return this.b.hashCode();
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m(new StringBuilder("License(reason="), this.b, ')');
        }

        public License(String str) {
            str.getClass();
            this.b = str;
        }
    }
}
