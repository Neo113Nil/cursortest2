package com.miteksystems.misnap.core.serverconnection;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes4.dex */
public final class MiPassEnrollRequest$MiPassEnrollRequestModel {
    public static final Companion Companion = new Companion();
    public final String a;
    public final String b;
    public final List c;
    public final List d;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/core/serverconnection/MiPassEnrollRequest$MiPassEnrollRequestModel$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/serverconnection/MiPassEnrollRequest$MiPassEnrollRequestModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return MiPassEnrollRequest$MiPassEnrollRequestModel$$serializer.INSTANCE;
        }
    }

    @Serializable
    public final class EncodedFile {
        public static final Companion Companion = new Companion();
        public final String a;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/core/serverconnection/MiPassEnrollRequest$MiPassEnrollRequestModel$EncodedFile$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/serverconnection/MiPassEnrollRequest$MiPassEnrollRequestModel$EncodedFile;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return MiPassEnrollRequest$MiPassEnrollRequestModel$EncodedFile$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ EncodedFile(int i, String str) {
            if (1 == (i & 1)) {
                this.a = str;
            } else {
                TuplesKt.throwMissingFieldException(i, 1, MiPassEnrollRequest$MiPassEnrollRequestModel$EncodedFile$$serializer.INSTANCE.getDescriptor());
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

    public /* synthetic */ MiPassEnrollRequest$MiPassEnrollRequestModel(int i, String str, String str2, List list, List list2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = list;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = list2;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MiPassEnrollRequest$MiPassEnrollRequestModel)) {
            return false;
        }
        MiPassEnrollRequest$MiPassEnrollRequestModel miPassEnrollRequest$MiPassEnrollRequestModel = (MiPassEnrollRequest$MiPassEnrollRequestModel) obj;
        return Intrinsics.areEqual(this.a, miPassEnrollRequest$MiPassEnrollRequestModel.a) && Intrinsics.areEqual(this.b, miPassEnrollRequest$MiPassEnrollRequestModel.b) && Intrinsics.areEqual(this.c, miPassEnrollRequest$MiPassEnrollRequestModel.c) && Intrinsics.areEqual(this.d, miPassEnrollRequest$MiPassEnrollRequestModel.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List list = this.c;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        List list2 = this.d;
        return hashCode3 + (list2 != null ? list2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MiPassEnrollRequestModel(customerReferenceId=");
        sb.append(this.a);
        sb.append(", enrollmentId=");
        sb.append(this.b);
        sb.append(", voiceFeatures=");
        sb.append(this.c);
        sb.append(", selfieImages=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.d, ')');
    }
}
