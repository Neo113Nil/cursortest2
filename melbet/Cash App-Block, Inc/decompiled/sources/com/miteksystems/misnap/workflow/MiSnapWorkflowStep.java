package com.miteksystems.misnap.workflow;

import com.miteksystems.misnap.core.MiSnapSettings;
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
public final class MiSnapWorkflowStep {
    public static final Companion Companion = new Companion();
    public final MiSnapSettings a;
    public final Integer b;
    public final Behavior c;

    @Serializable
    public abstract class Behavior {
        public static final Companion Companion = new Companion();
        public static final Lazy a = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1.INSTANCE$19);

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/workflow/MiSnapWorkflowStep$Behavior$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowStep$Behavior;", "serializer", "()Lkotlinx/serialization/KSerializer;", "workflow_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return (KSerializer) Behavior.a.getValue();
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/workflow/MiSnapWorkflowStep$Behavior$None", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowStep$Behavior;", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowStep$Behavior$None;", "serializer", "()Lkotlinx/serialization/KSerializer;", "workflow_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @Serializable
        public final class None extends Behavior {
            public static final None INSTANCE = new None();
            public static final /* synthetic */ Lazy b = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1.INSTANCE$20);

            public final KSerializer serializer() {
                return (KSerializer) b.getValue();
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/workflow/MiSnapWorkflowStep$Behavior$OnMissingNldBSN", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowStep$Behavior;", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowStep$Behavior$OnMissingNldBSN;", "serializer", "()Lkotlinx/serialization/KSerializer;", "workflow_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        @Serializable
        public final class OnMissingNldBSN extends Behavior {
            public static final OnMissingNldBSN INSTANCE = new OnMissingNldBSN();
            public static final /* synthetic */ Lazy b = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1.INSTANCE$21);

            public final KSerializer serializer() {
                return (KSerializer) b.getValue();
            }
        }

        @Serializable
        public abstract class OnNfcMrzExtraction extends Behavior {
            public static final Companion Companion = new Companion();
            public static final Lazy b = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1.INSTANCE$22);

            @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/workflow/MiSnapWorkflowStep$Behavior$OnNfcMrzExtraction$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowStep$Behavior$OnNfcMrzExtraction;", "serializer", "()Lkotlinx/serialization/KSerializer;", "workflow_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public final class Companion {
                public final KSerializer serializer() {
                    return (KSerializer) OnNfcMrzExtraction.b.getValue();
                }
            }

            @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/workflow/MiSnapWorkflowStep$Behavior$OnNfcMrzExtraction$SkipStepIfMrzMissing", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowStep$Behavior$OnNfcMrzExtraction;", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowStep$Behavior$OnNfcMrzExtraction$SkipStepIfMrzMissing;", "serializer", "()Lkotlinx/serialization/KSerializer;", "workflow_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            @Serializable
            public final class SkipStepIfMrzMissing extends OnNfcMrzExtraction {
                public static final SkipStepIfMrzMissing INSTANCE = new SkipStepIfMrzMissing();
                public static final /* synthetic */ Lazy c = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1.INSTANCE$23);

                public final KSerializer serializer() {
                    return (KSerializer) c.getValue();
                }
            }

            @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/workflow/MiSnapWorkflowStep$Behavior$OnNfcMrzExtraction$UseMrzIfAvailable", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowStep$Behavior$OnNfcMrzExtraction;", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowStep$Behavior$OnNfcMrzExtraction$UseMrzIfAvailable;", "serializer", "()Lkotlinx/serialization/KSerializer;", "workflow_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            @Serializable
            public final class UseMrzIfAvailable extends OnNfcMrzExtraction {
                public static final UseMrzIfAvailable INSTANCE = new UseMrzIfAvailable();
                public static final /* synthetic */ Lazy c = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1.INSTANCE$24);

                public final KSerializer serializer() {
                    return (KSerializer) c.getValue();
                }
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/workflow/MiSnapWorkflowStep$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowStep;", "serializer", "()Lkotlinx/serialization/KSerializer;", "workflow_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return MiSnapWorkflowStep$$serializer.INSTANCE;
        }
    }

    public MiSnapWorkflowStep(int i, MiSnapSettings miSnapSettings, Integer num, Behavior behavior) {
        if (1 != (i & 1)) {
            TuplesKt.throwMissingFieldException(i, 1, MiSnapWorkflowStep$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = miSnapSettings;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = num;
        }
        if ((i & 4) != 0) {
            this.c = behavior;
            return;
        }
        Companion.getClass();
        miSnapSettings.getClass();
        this.c = miSnapSettings.a == MiSnapSettings.UseCase.NFC ? Behavior.OnNfcMrzExtraction.SkipStepIfMrzMissing.INSTANCE : Behavior.None.INSTANCE;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MiSnapWorkflowStep)) {
            return false;
        }
        MiSnapWorkflowStep miSnapWorkflowStep = (MiSnapWorkflowStep) obj;
        return Intrinsics.areEqual(this.a, miSnapWorkflowStep.a) && Intrinsics.areEqual(this.b, miSnapWorkflowStep.b) && Intrinsics.areEqual(this.c, miSnapWorkflowStep.c);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Integer num = this.b;
        return this.c.hashCode() + ((hashCode + (num == null ? 0 : num.hashCode())) * 31);
    }

    public final String toString() {
        return "MiSnapWorkflowStep(settings=" + this.a + ", navGraphId=" + this.b + ", behavior=" + this.c + ')';
    }

    @Serializable
    public abstract class Result {
        public static final Companion Companion = new Companion();
        public static final Lazy a = LazyKt.lazy(LazyThreadSafetyMode.PUBLICATION, (Function0) MiSnapWorkflowError$Camera$$cachedSerializer$delegate$1.INSTANCE$25);

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/workflow/MiSnapWorkflowStep$Result$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowStep$Result;", "serializer", "()Lkotlinx/serialization/KSerializer;", "workflow_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return (KSerializer) Result.a.getValue();
            }
        }

        @Serializable
        public final class Error extends Result {
            public static final Companion Companion = new Companion();
            public final MiSnapErrorResult b;

            @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/workflow/MiSnapWorkflowStep$Result$Error$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowStep$Result$Error;", "serializer", "()Lkotlinx/serialization/KSerializer;", "workflow_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public final class Companion {
                public final KSerializer serializer() {
                    return MiSnapWorkflowStep$Result$Error$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ Error(int i, MiSnapErrorResult miSnapErrorResult) {
                if (1 == (i & 1)) {
                    this.b = miSnapErrorResult;
                } else {
                    TuplesKt.throwMissingFieldException(i, 1, MiSnapWorkflowStep$Result$Error$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Error) && Intrinsics.areEqual(this.b, ((Error) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "Error(errorResult=" + this.b + ')';
            }

            public Error(MiSnapErrorResult miSnapErrorResult) {
                miSnapErrorResult.getClass();
                this.b = miSnapErrorResult;
            }
        }

        @Serializable
        public final class Success extends Result {
            public static final Companion Companion = new Companion();
            public final MiSnapFinalResult b;

            @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/workflow/MiSnapWorkflowStep$Result$Success$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/workflow/MiSnapWorkflowStep$Result$Success;", "serializer", "()Lkotlinx/serialization/KSerializer;", "workflow_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public final class Companion {
                public final KSerializer serializer() {
                    return MiSnapWorkflowStep$Result$Success$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ Success(int i, MiSnapFinalResult miSnapFinalResult) {
                if (1 == (i & 1)) {
                    this.b = miSnapFinalResult;
                } else {
                    TuplesKt.throwMissingFieldException(i, 1, MiSnapWorkflowStep$Result$Success$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof Success) && Intrinsics.areEqual(this.b, ((Success) obj).b);
            }

            public final int hashCode() {
                return this.b.hashCode();
            }

            public final String toString() {
                return "Success(result=" + this.b + ')';
            }

            public Success(MiSnapFinalResult miSnapFinalResult) {
                miSnapFinalResult.getClass();
                this.b = miSnapFinalResult;
            }
        }
    }
}
