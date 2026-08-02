package com.miteksystems.misnap.workflow;

import com.miteksystems.misnap.core.MiSnapMibiData;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes4.dex */
public final class MiSnapErrorResult {
    public static final Companion Companion = new Companion();
    public final MiSnapWorkflowError a;
    public final MiSnapMibiData b;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/workflow/MiSnapErrorResult$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/workflow/MiSnapErrorResult;", "serializer", "()Lkotlinx/serialization/KSerializer;", "workflow_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return MiSnapErrorResult$$serializer.INSTANCE;
        }
    }

    public /* synthetic */ MiSnapErrorResult(int i, MiSnapWorkflowError miSnapWorkflowError, MiSnapMibiData miSnapMibiData) {
        if (3 != (i & 3)) {
            TuplesKt.throwMissingFieldException(i, 3, MiSnapErrorResult$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = miSnapWorkflowError;
        this.b = miSnapMibiData;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MiSnapErrorResult)) {
            return false;
        }
        MiSnapErrorResult miSnapErrorResult = (MiSnapErrorResult) obj;
        return Intrinsics.areEqual(this.a, miSnapErrorResult.a) && Intrinsics.areEqual(this.b, miSnapErrorResult.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MiSnapErrorResult(error=" + this.a + ", misnapMibiData=" + this.b + ')';
    }

    public MiSnapErrorResult(MiSnapWorkflowError miSnapWorkflowError, MiSnapMibiData miSnapMibiData) {
        miSnapWorkflowError.getClass();
        this.a = miSnapWorkflowError;
        this.b = miSnapMibiData;
    }
}
