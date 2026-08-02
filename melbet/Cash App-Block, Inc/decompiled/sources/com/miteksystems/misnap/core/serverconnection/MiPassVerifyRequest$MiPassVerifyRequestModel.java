package com.miteksystems.misnap.core.serverconnection;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes4.dex */
public final class MiPassVerifyRequest$MiPassVerifyRequestModel {
    public static final Companion Companion = new Companion();
    public final String a;
    public final String b;
    public final EncodedFile c;
    public final EncodedFile d;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/core/serverconnection/MiPassVerifyRequest$MiPassVerifyRequestModel$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/serverconnection/MiPassVerifyRequest$MiPassVerifyRequestModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return MiPassVerifyRequest$MiPassVerifyRequestModel$$serializer.INSTANCE;
        }
    }

    @Serializable
    public final class EncodedFile {
        public static final Companion Companion = new Companion();
        public final String a;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/core/serverconnection/MiPassVerifyRequest$MiPassVerifyRequestModel$EncodedFile$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/serverconnection/MiPassVerifyRequest$MiPassVerifyRequestModel$EncodedFile;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return MiPassVerifyRequest$MiPassVerifyRequestModel$EncodedFile$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ EncodedFile(int i, String str) {
            if (1 == (i & 1)) {
                this.a = str;
            } else {
                TuplesKt.throwMissingFieldException(i, 1, MiPassVerifyRequest$MiPassVerifyRequestModel$EncodedFile$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof EncodedFile) && Intrinsics.areEqual(this.a, ((EncodedFile) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m(new StringBuilder("EncodedFile(data="), this.a, ')');
        }
    }

    public /* synthetic */ MiPassVerifyRequest$MiPassVerifyRequestModel(int i, String str, String str2, EncodedFile encodedFile, EncodedFile encodedFile2) {
        if (2 != (i & 2)) {
            TuplesKt.throwMissingFieldException(i, 2, MiPassVerifyRequest$MiPassVerifyRequestModel$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        this.b = str2;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = encodedFile;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = encodedFile2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MiPassVerifyRequest$MiPassVerifyRequestModel)) {
            return false;
        }
        MiPassVerifyRequest$MiPassVerifyRequestModel miPassVerifyRequest$MiPassVerifyRequestModel = (MiPassVerifyRequest$MiPassVerifyRequestModel) obj;
        return Intrinsics.areEqual(this.a, miPassVerifyRequest$MiPassVerifyRequestModel.a) && Intrinsics.areEqual(this.b, miPassVerifyRequest$MiPassVerifyRequestModel.b) && Intrinsics.areEqual(this.c, miPassVerifyRequest$MiPassVerifyRequestModel.c) && Intrinsics.areEqual(this.d, miPassVerifyRequest$MiPassVerifyRequestModel.d);
    }

    public final int hashCode() {
        String str = this.a;
        int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        EncodedFile encodedFile = this.c;
        int hashCode = (m + (encodedFile == null ? 0 : encodedFile.a.hashCode())) * 31;
        EncodedFile encodedFile2 = this.d;
        return hashCode + (encodedFile2 != null ? encodedFile2.a.hashCode() : 0);
    }

    public final String toString() {
        return "MiPassVerifyRequestModel(customerReferenceId=" + this.a + ", enrollmentId=" + this.b + ", voiceFeature=" + this.c + ", selfieImage=" + this.d + ')';
    }
}
