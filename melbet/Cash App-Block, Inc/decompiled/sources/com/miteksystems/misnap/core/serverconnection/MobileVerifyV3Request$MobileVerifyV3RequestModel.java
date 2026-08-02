package com.miteksystems.misnap.core.serverconnection;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.TuplesKt;

@Serializable
/* loaded from: classes4.dex */
public final class MobileVerifyV3Request$MobileVerifyV3RequestModel {
    public static final Companion Companion = new Companion();
    public final String a;
    public final String b;
    public final List c;
    public final List d;

    @Serializable
    public final class BarcodeData {
        public static final Companion Companion = new Companion();
        public final String a;
        public final String b;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/core/serverconnection/MobileVerifyV3Request$MobileVerifyV3RequestModel$BarcodeData$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV3Request$MobileVerifyV3RequestModel$BarcodeData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return MobileVerifyV3Request$MobileVerifyV3RequestModel$BarcodeData$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ BarcodeData(int i, String str, String str2) {
            if (3 != (i & 3)) {
                TuplesKt.throwMissingFieldException(i, 3, MobileVerifyV3Request$MobileVerifyV3RequestModel$BarcodeData$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.a = str;
            this.b = str2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BarcodeData)) {
                return false;
            }
            BarcodeData barcodeData = (BarcodeData) obj;
            return Intrinsics.areEqual(this.a, barcodeData.a) && Intrinsics.areEqual(this.b, barcodeData.b);
        }

        public final int hashCode() {
            String str = this.a;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.b;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("BarcodeData(dataType=");
            sb.append(this.a);
            sb.append(", data=");
            return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.b, ')');
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/core/serverconnection/MobileVerifyV3Request$MobileVerifyV3RequestModel$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV3Request$MobileVerifyV3RequestModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return MobileVerifyV3Request$MobileVerifyV3RequestModel$$serializer.INSTANCE;
        }
    }

    @Serializable
    public final class DocumentImage {
        public static final Companion Companion = new Companion();
        public final String a;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/core/serverconnection/MobileVerifyV3Request$MobileVerifyV3RequestModel$DocumentImage$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV3Request$MobileVerifyV3RequestModel$DocumentImage;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return MobileVerifyV3Request$MobileVerifyV3RequestModel$DocumentImage$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ DocumentImage(int i, String str) {
            if (1 == (i & 1)) {
                this.a = str;
            } else {
                TuplesKt.throwMissingFieldException(i, 1, MobileVerifyV3Request$MobileVerifyV3RequestModel$DocumentImage$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof DocumentImage) && Intrinsics.areEqual(this.a, ((DocumentImage) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m(new StringBuilder("DocumentImage(data="), this.a, ')');
        }
    }

    public /* synthetic */ MobileVerifyV3Request$MobileVerifyV3RequestModel(int i, String str, String str2, List list, List list2) {
        if (4 != (i & 4)) {
            TuplesKt.throwMissingFieldException(i, 4, MobileVerifyV3Request$MobileVerifyV3RequestModel$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
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
        this.c = list;
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
        if (!(obj instanceof MobileVerifyV3Request$MobileVerifyV3RequestModel)) {
            return false;
        }
        MobileVerifyV3Request$MobileVerifyV3RequestModel mobileVerifyV3Request$MobileVerifyV3RequestModel = (MobileVerifyV3Request$MobileVerifyV3RequestModel) obj;
        return Intrinsics.areEqual(this.a, mobileVerifyV3Request$MobileVerifyV3RequestModel.a) && Intrinsics.areEqual(this.b, mobileVerifyV3Request$MobileVerifyV3RequestModel.b) && Intrinsics.areEqual(this.c, mobileVerifyV3Request$MobileVerifyV3RequestModel.c) && Intrinsics.areEqual(this.d, mobileVerifyV3Request$MobileVerifyV3RequestModel.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int m = Recorder$$ExternalSyntheticOutline2.m((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.c);
        List list = this.d;
        return m + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MobileVerifyV3RequestModel(transactionRequestId=");
        sb.append(this.a);
        sb.append(", customerReferenceId=");
        sb.append(this.b);
        sb.append(", images=");
        sb.append(this.c);
        sb.append(", deviceExtractedData=");
        return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.d, ')');
    }
}
