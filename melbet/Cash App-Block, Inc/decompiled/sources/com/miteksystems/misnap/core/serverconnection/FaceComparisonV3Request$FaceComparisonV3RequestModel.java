package com.miteksystems.misnap.core.serverconnection;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes4.dex */
public final class FaceComparisonV3Request$FaceComparisonV3RequestModel {
    public static final Companion Companion = new Companion();
    public final FaceConfiguration a;
    public final String b;
    public final String c;
    public final List d;
    public final List e;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/core/serverconnection/FaceComparisonV3Request$FaceComparisonV3RequestModel$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/serverconnection/FaceComparisonV3Request$FaceComparisonV3RequestModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return FaceComparisonV3Request$FaceComparisonV3RequestModel$$serializer.INSTANCE;
        }
    }

    @Serializable
    public final class FaceConfiguration {
        public static final Companion Companion = new Companion();
        public final boolean a;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/core/serverconnection/FaceComparisonV3Request$FaceComparisonV3RequestModel$FaceConfiguration$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/serverconnection/FaceComparisonV3Request$FaceComparisonV3RequestModel$FaceConfiguration;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return FaceComparisonV3Request$FaceComparisonV3RequestModel$FaceConfiguration$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ FaceConfiguration(int i, boolean z) {
            if (1 == (i & 1)) {
                this.a = z;
            } else {
                TuplesKt.throwMissingFieldException(i, 1, FaceComparisonV3Request$FaceComparisonV3RequestModel$FaceConfiguration$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof FaceConfiguration) && this.a == ((FaceConfiguration) obj).a;
        }

        public final int hashCode() {
            boolean z = this.a;
            if (z) {
                return 1;
            }
            return z ? 1 : 0;
        }

        public final String toString() {
            return JsonLogicResult$Success$$ExternalSyntheticOutline0.m(new StringBuilder("FaceConfiguration(liveness="), this.a, ')');
        }
    }

    @Serializable
    public final class Image {
        public static final Companion Companion = new Companion();
        public final String a;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/core/serverconnection/FaceComparisonV3Request$FaceComparisonV3RequestModel$Image$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/serverconnection/FaceComparisonV3Request$FaceComparisonV3RequestModel$Image;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return FaceComparisonV3Request$FaceComparisonV3RequestModel$Image$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Image(int i, String str) {
            if (1 == (i & 1)) {
                this.a = str;
            } else {
                TuplesKt.throwMissingFieldException(i, 1, FaceComparisonV3Request$FaceComparisonV3RequestModel$Image$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof Image) && Intrinsics.areEqual(this.a, ((Image) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m(new StringBuilder("Image(data="), this.a, ')');
        }
    }

    public /* synthetic */ FaceComparisonV3Request$FaceComparisonV3RequestModel(int i, FaceConfiguration faceConfiguration, String str, String str2, List list, List list2) {
        if (24 != (i & 24)) {
            TuplesKt.throwMissingFieldException(i, 24, FaceComparisonV3Request$FaceComparisonV3RequestModel$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = faceConfiguration;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        this.d = list;
        this.e = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof FaceComparisonV3Request$FaceComparisonV3RequestModel)) {
            return false;
        }
        FaceComparisonV3Request$FaceComparisonV3RequestModel faceComparisonV3Request$FaceComparisonV3RequestModel = (FaceComparisonV3Request$FaceComparisonV3RequestModel) obj;
        return Intrinsics.areEqual(this.a, faceComparisonV3Request$FaceComparisonV3RequestModel.a) && Intrinsics.areEqual(this.b, faceComparisonV3Request$FaceComparisonV3RequestModel.b) && Intrinsics.areEqual(this.c, faceComparisonV3Request$FaceComparisonV3RequestModel.c) && Intrinsics.areEqual(this.d, faceComparisonV3Request$FaceComparisonV3RequestModel.d) && Intrinsics.areEqual(this.e, faceComparisonV3Request$FaceComparisonV3RequestModel.e);
    }

    public final int hashCode() {
        FaceConfiguration faceConfiguration = this.a;
        int hashCode = (faceConfiguration == null ? 0 : faceConfiguration.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        return this.e.hashCode() + Recorder$$ExternalSyntheticOutline2.m((hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FaceComparisonV3RequestModel(configuration=");
        sb.append(this.a);
        sb.append(", transactionRequestId=");
        sb.append(this.b);
        sb.append(", customerReferenceId=");
        sb.append(this.c);
        sb.append(", referenceImages=");
        sb.append(this.d);
        sb.append(", selfieImages=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.e, ')');
    }
}
