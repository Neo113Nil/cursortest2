package com.miteksystems.misnap.core.serverconnection;

import androidx.camera.core.CameraState$Type$EnumUnboxingLocalUtility;
import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyMap;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Reflection;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.internal.KeyValueSerializer;
import kotlinx.serialization.internal.TuplesKt;
import kotlinx.serialization.json.JsonElement;
import kotlinx.serialization.json.JsonElementKt;

@Serializable
/* loaded from: classes4.dex */
public final class MobileVerifyV2Request$MobileVerifyV2RequestModel {
    public static final Companion Companion = new Companion();
    public final MetaData a;
    public final List b;
    public final Configuration c;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public final class Companion {
        public final KSerializer serializer() {
            return MobileVerifyV2Request$MobileVerifyV2RequestModel$$serializer.INSTANCE;
        }
    }

    @Serializable
    public final class Configuration {
        public static final Companion Companion = new Companion();
        public final Verifications a;
        public final List b;
        public final EiD c;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Configuration$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Configuration;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return MobileVerifyV2Request$MobileVerifyV2RequestModel$Configuration$$serializer.INSTANCE;
            }
        }

        @Serializable
        public final class EiD {
            public static final Companion Companion = new Companion();
            public final List a;

            @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Configuration$EiD$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Configuration$EiD;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public final class Companion {
                public final KSerializer serializer() {
                    return MobileVerifyV2Request$MobileVerifyV2RequestModel$Configuration$EiD$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ EiD(int i, List list) {
                if ((i & 1) == 0) {
                    this.a = null;
                } else {
                    this.a = list;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof EiD) && Intrinsics.areEqual(this.a, ((EiD) obj).a);
            }

            public final int hashCode() {
                List list = this.a;
                if (list == null) {
                    return 0;
                }
                return list.hashCode();
            }

            public final String toString() {
                return CameraState$Type$EnumUnboxingLocalUtility.m(new StringBuilder("EiD(miDniVerificationLevels="), this.a, ')');
            }
        }

        @Serializable
        public final class Verifications {
            public static final Companion Companion = new Companion();
            public final Boolean a;
            public final Boolean b;
            public final Boolean c;
            public final Boolean d;
            public final Boolean e;
            public final Boolean f;
            public final Boolean g;
            public final Boolean h;

            @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Configuration$Verifications$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Configuration$Verifications;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public final class Companion {
                public final KSerializer serializer() {
                    return MobileVerifyV2Request$MobileVerifyV2RequestModel$Configuration$Verifications$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ Verifications(int i, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, Boolean bool8) {
                if ((i & 1) == 0) {
                    this.a = null;
                } else {
                    this.a = bool;
                }
                if ((i & 2) == 0) {
                    this.b = null;
                } else {
                    this.b = bool2;
                }
                if ((i & 4) == 0) {
                    this.c = null;
                } else {
                    this.c = bool3;
                }
                if ((i & 8) == 0) {
                    this.d = null;
                } else {
                    this.d = bool4;
                }
                if ((i & 16) == 0) {
                    this.e = null;
                } else {
                    this.e = bool5;
                }
                if ((i & 32) == 0) {
                    this.f = null;
                } else {
                    this.f = bool6;
                }
                if ((i & 64) == 0) {
                    this.g = null;
                } else {
                    this.g = bool7;
                }
                if ((i & 128) == 0) {
                    this.h = null;
                } else {
                    this.h = bool8;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Verifications)) {
                    return false;
                }
                Verifications verifications = (Verifications) obj;
                return Intrinsics.areEqual(this.a, verifications.a) && Intrinsics.areEqual(this.b, verifications.b) && Intrinsics.areEqual(this.c, verifications.c) && Intrinsics.areEqual(this.d, verifications.d) && Intrinsics.areEqual(this.e, verifications.e) && Intrinsics.areEqual(this.f, verifications.f) && Intrinsics.areEqual(this.g, verifications.g) && Intrinsics.areEqual(this.h, verifications.h);
            }

            public final int hashCode() {
                Boolean bool = this.a;
                int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
                Boolean bool2 = this.b;
                int hashCode2 = (hashCode + (bool2 == null ? 0 : bool2.hashCode())) * 31;
                Boolean bool3 = this.c;
                int hashCode3 = (hashCode2 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
                Boolean bool4 = this.d;
                int hashCode4 = (hashCode3 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
                Boolean bool5 = this.e;
                int hashCode5 = (hashCode4 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
                Boolean bool6 = this.f;
                int hashCode6 = (hashCode5 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
                Boolean bool7 = this.g;
                int hashCode7 = (hashCode6 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
                Boolean bool8 = this.h;
                return hashCode7 + (bool8 != null ? bool8.hashCode() : 0);
            }

            public final String toString() {
                return "Verifications(faceComparison=" + this.a + ", faceLiveness=" + this.b + ", faceBlocklist=" + this.c + ", faceVelocity=" + this.d + ", dataSignalAAMVA=" + this.e + ", injectionAttackDetection=" + this.f + ", injectionAttackDetectionAi=" + this.g + ", templateAttackDetection=" + this.h + ')';
            }
        }

        public /* synthetic */ Configuration(int i, Verifications verifications, List list, EiD eiD) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = verifications;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = list;
            }
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = eiD;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Configuration)) {
                return false;
            }
            Configuration configuration = (Configuration) obj;
            return Intrinsics.areEqual(this.a, configuration.a) && Intrinsics.areEqual(this.b, configuration.b) && Intrinsics.areEqual(this.c, configuration.c);
        }

        public final int hashCode() {
            Verifications verifications = this.a;
            int hashCode = (verifications == null ? 0 : verifications.hashCode()) * 31;
            List list = this.b;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            EiD eiD = this.c;
            return hashCode2 + (eiD != null ? eiD.hashCode() : 0);
        }

        public final String toString() {
            return "Configuration(verifications=" + this.a + ", response=" + this.b + ", eId=" + this.c + ')';
        }
    }

    @Serializable
    public final class Document extends Evidence {
        public static final Companion Companion = new Companion();
        public final String a;
        public final List b;
        public final Nfc c;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Document;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$$serializer.INSTANCE;
            }
        }

        @Serializable
        public final class Image {
            public static final Companion Companion = new Companion();
            public final String a;
            public final String b;
            public final String c;
            public final EncodedData d;

            @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Image$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Image;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public final class Companion {
                public final KSerializer serializer() {
                    return MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Image$$serializer.INSTANCE;
                }
            }

            @Serializable
            public final class EncodedData {
                public static final Companion Companion = new Companion();
                public final String a;
                public final String b;

                @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Image$EncodedData$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Image$EncodedData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                public final class Companion {
                    public final KSerializer serializer() {
                        return MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Image$EncodedData$$serializer.INSTANCE;
                    }
                }

                public /* synthetic */ EncodedData(int i, String str, String str2) {
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
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof EncodedData)) {
                        return false;
                    }
                    EncodedData encodedData = (EncodedData) obj;
                    return Intrinsics.areEqual(this.a, encodedData.a) && Intrinsics.areEqual(this.b, encodedData.b);
                }

                public final int hashCode() {
                    String str = this.a;
                    int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.b;
                    return hashCode + (str2 != null ? str2.hashCode() : 0);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("EncodedData(encodedPDF=");
                    sb.append(this.a);
                    sb.append(", encodedQR=");
                    return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.b, ')');
                }
            }

            public /* synthetic */ Image(int i, String str, String str2, String str3, EncodedData encodedData) {
                if (1 != (i & 1)) {
                    TuplesKt.throwMissingFieldException(i, 1, MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Image$$serializer.INSTANCE.getDescriptor());
                    throw null;
                }
                this.a = str;
                if ((i & 2) == 0) {
                    this.b = null;
                } else {
                    this.b = str2;
                }
                if ((i & 4) == 0) {
                    this.c = null;
                } else {
                    this.c = str3;
                }
                if ((i & 8) == 0) {
                    this.d = null;
                } else {
                    this.d = encodedData;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Image)) {
                    return false;
                }
                Image image = (Image) obj;
                return Intrinsics.areEqual(this.a, image.a) && Intrinsics.areEqual(this.b, image.b) && Intrinsics.areEqual(this.c, image.c) && Intrinsics.areEqual(this.d, image.d);
            }

            public final int hashCode() {
                int hashCode = this.a.hashCode() * 31;
                String str = this.b;
                int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
                String str2 = this.c;
                int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                EncodedData encodedData = this.d;
                return hashCode3 + (encodedData != null ? encodedData.hashCode() : 0);
            }

            public final String toString() {
                return "Image(data=" + this.a + ", encryptedPayload=" + this.b + ", custReferenceId=" + this.c + ", encodedData=" + this.d + ')';
            }
        }

        @Serializable
        public final class Nfc {
            public static final Companion Companion = new Companion();
            public final String a;
            public final String b;
            public final String c;
            public final Map d;
            public final ActiveAuthInput e;
            public final String f;
            public final String g;
            public final String h;

            @Serializable
            public final class ActiveAuthInput {
                public static final Companion Companion = new Companion();
                public final String a;
                public final String b;
                public final String c;

                @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Nfc$ActiveAuthInput$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Nfc$ActiveAuthInput;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                public final class Companion {
                    public final KSerializer serializer() {
                        return MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Nfc$ActiveAuthInput$$serializer.INSTANCE;
                    }
                }

                public /* synthetic */ ActiveAuthInput(int i, String str, String str2, String str3) {
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
                        this.c = str3;
                    }
                }

                public final boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof ActiveAuthInput)) {
                        return false;
                    }
                    ActiveAuthInput activeAuthInput = (ActiveAuthInput) obj;
                    return Intrinsics.areEqual(this.a, activeAuthInput.a) && Intrinsics.areEqual(this.b, activeAuthInput.b) && Intrinsics.areEqual(this.c, activeAuthInput.c);
                }

                public final int hashCode() {
                    String str = this.a;
                    int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.b;
                    int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                    String str3 = this.c;
                    return hashCode2 + (str3 != null ? str3.hashCode() : 0);
                }

                public final String toString() {
                    StringBuilder sb = new StringBuilder("ActiveAuthInput(publicKey=");
                    sb.append(this.a);
                    sb.append(", signature=");
                    sb.append(this.b);
                    sb.append(", challenge=");
                    return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.c, ')');
                }
            }

            @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Nfc$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Nfc;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public final class Companion {
                public final KSerializer serializer() {
                    return MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$Nfc$$serializer.INSTANCE;
                }
            }

            public Nfc(int i, String str, String str2, String str3, Map map, ActiveAuthInput activeAuthInput, String str4, String str5, String str6) {
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
                    this.c = str3;
                }
                if ((i & 8) == 0) {
                    EmptyMap emptyMap = EmptyMap.INSTANCE;
                    emptyMap.getClass();
                    this.d = emptyMap;
                } else {
                    this.d = map;
                }
                if ((i & 16) == 0) {
                    this.e = null;
                } else {
                    this.e = activeAuthInput;
                }
                if ((i & 32) == 0) {
                    this.f = null;
                } else {
                    this.f = str4;
                }
                if ((i & 64) == 0) {
                    this.g = null;
                } else {
                    this.g = str5;
                }
                if ((i & 128) == 0) {
                    this.h = null;
                } else {
                    this.h = str6;
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof Nfc)) {
                    return false;
                }
                Nfc nfc = (Nfc) obj;
                return Intrinsics.areEqual(this.a, nfc.a) && Intrinsics.areEqual(this.b, nfc.b) && Intrinsics.areEqual(this.c, nfc.c) && Intrinsics.areEqual(this.d, nfc.d) && Intrinsics.areEqual(this.e, nfc.e) && Intrinsics.areEqual(this.f, nfc.f) && Intrinsics.areEqual(this.g, nfc.g) && Intrinsics.areEqual(this.h, nfc.h);
            }

            public final int hashCode() {
                String str = this.a;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.b;
                int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                String str3 = this.c;
                int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                Map map = this.d;
                int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
                ActiveAuthInput activeAuthInput = this.e;
                int hashCode5 = (hashCode4 + (activeAuthInput == null ? 0 : activeAuthInput.hashCode())) * 31;
                String str4 = this.f;
                int hashCode6 = (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
                String str5 = this.g;
                int hashCode7 = (hashCode6 + (str5 == null ? 0 : str5.hashCode())) * 31;
                String str6 = this.h;
                return hashCode7 + (str6 != null ? str6.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("Nfc(sod=");
                sb.append(this.a);
                sb.append(", com=");
                sb.append(this.b);
                sb.append(", dataFormat=");
                sb.append(this.c);
                sb.append(", dataGroups=");
                sb.append(this.d);
                sb.append(", activeAuthInput=");
                sb.append(this.e);
                sb.append(", chipAuthOutput=");
                sb.append(this.f);
                sb.append(", portrait=");
                sb.append(this.g);
                sb.append(", mibiString=");
                return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.h, ')');
            }
        }

        public Document(int i, String str, List list, Nfc nfc) {
            if (3 != (i & 3)) {
                TuplesKt.throwMissingFieldException(i, 3, MobileVerifyV2Request$MobileVerifyV2RequestModel$Document$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.a = str;
            this.b = list;
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = nfc;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Document)) {
                return false;
            }
            Document document = (Document) obj;
            return Intrinsics.areEqual(this.a, document.a) && Intrinsics.areEqual(this.b, document.b) && Intrinsics.areEqual(this.c, document.c);
        }

        public final int hashCode() {
            int m = Recorder$$ExternalSyntheticOutline2.m(this.a.hashCode() * 31, 31, this.b);
            Nfc nfc = this.c;
            return m + (nfc == null ? 0 : nfc.hashCode());
        }

        public final String toString() {
            return "Document(type=" + this.a + ", images=" + this.b + ", nfc=" + this.c + ')';
        }
    }

    @Serializable
    public final class EIdDocument extends Evidence {
        public static final Companion Companion = new Companion();
        public final String a;
        public final EId b;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$EIdDocument$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$EIdDocument;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return MobileVerifyV2Request$MobileVerifyV2RequestModel$EIdDocument$$serializer.INSTANCE;
            }
        }

        @Serializable
        public final class EId {
            public static final Companion Companion = new Companion();
            public final String a;
            public final String b;

            @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$EIdDocument$EId$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$EIdDocument$EId;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public final class Companion {
                public final KSerializer serializer() {
                    return MobileVerifyV2Request$MobileVerifyV2RequestModel$EIdDocument$EId$$serializer.INSTANCE;
                }
            }

            public /* synthetic */ EId(int i, String str, String str2) {
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
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof EId)) {
                    return false;
                }
                EId eId = (EId) obj;
                return Intrinsics.areEqual(this.a, eId.a) && Intrinsics.areEqual(this.b, eId.b);
            }

            public final int hashCode() {
                String str = this.a;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                String str2 = this.b;
                return hashCode + (str2 != null ? str2.hashCode() : 0);
            }

            public final String toString() {
                StringBuilder sb = new StringBuilder("EId(payload=");
                sb.append(this.a);
                sb.append(", dataFormat=");
                return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.b, ')');
            }
        }

        public EIdDocument(int i, String str, EId eId) {
            if (1 != (i & 1)) {
                TuplesKt.throwMissingFieldException(i, 1, MobileVerifyV2Request$MobileVerifyV2RequestModel$EIdDocument$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.a = str;
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = eId;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof EIdDocument)) {
                return false;
            }
            EIdDocument eIdDocument = (EIdDocument) obj;
            return Intrinsics.areEqual(this.a, eIdDocument.a) && Intrinsics.areEqual(this.b, eIdDocument.b);
        }

        public final int hashCode() {
            int hashCode = this.a.hashCode() * 31;
            EId eId = this.b;
            return hashCode + (eId == null ? 0 : eId.hashCode());
        }

        public final String toString() {
            return "EIdDocument(type=" + this.a + ", eid=" + this.b + ')';
        }
    }

    @Serializable(with = a.class)
    public abstract class Evidence {
        public static final Companion Companion = new Companion();

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Evidence$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Evidence;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return a.a;
            }
        }
    }

    @Serializable
    public final class Face extends Evidence {
        public static final Companion Companion = new Companion();
        public final String a;
        public final String b;
        public final String c;
        public final String d;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Face$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$Face;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return MobileVerifyV2Request$MobileVerifyV2RequestModel$Face$$serializer.INSTANCE;
            }
        }

        public Face(String str, int i, String str2, String str3, String str4) {
            if (3 != (i & 3)) {
                TuplesKt.throwMissingFieldException(i, 3, MobileVerifyV2Request$MobileVerifyV2RequestModel$Face$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
            this.a = str;
            this.b = str2;
            if ((i & 4) == 0) {
                this.c = null;
            } else {
                this.c = str3;
            }
            if ((i & 8) == 0) {
                this.d = null;
            } else {
                this.d = str4;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Face)) {
                return false;
            }
            Face face = (Face) obj;
            return Intrinsics.areEqual(this.a, face.a) && Intrinsics.areEqual(this.b, face.b) && Intrinsics.areEqual(this.c, face.c) && Intrinsics.areEqual(this.d, face.d);
        }

        public final int hashCode() {
            int m = JsonLogicResult$Success$$ExternalSyntheticOutline0.m(this.a.hashCode() * 31, 31, this.b);
            String str = this.c;
            int hashCode = (m + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.d;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("Face(type=");
            sb.append(this.a);
            sb.append(", biometricType=");
            sb.append(this.b);
            sb.append(", data=");
            sb.append(this.c);
            sb.append(", encryptedPayload=");
            return CameraState$Type$EnumUnboxingLocalUtility.m(sb, this.d, ')');
        }
    }

    @Serializable
    public final class MetaData {
        public static final Companion Companion = new Companion();
        public final String a;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$MetaData$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/serverconnection/MobileVerifyV2Request$MobileVerifyV2RequestModel$MetaData;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return MobileVerifyV2Request$MobileVerifyV2RequestModel$MetaData$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ MetaData(int i, String str) {
            if (1 == (i & 1)) {
                this.a = str;
            } else {
                TuplesKt.throwMissingFieldException(i, 1, MobileVerifyV2Request$MobileVerifyV2RequestModel$MetaData$$serializer.INSTANCE.getDescriptor());
                throw null;
            }
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof MetaData) && Intrinsics.areEqual(this.a, ((MetaData) obj).a);
        }

        public final int hashCode() {
            return this.a.hashCode();
        }

        public final String toString() {
            return CameraState$Type$EnumUnboxingLocalUtility.m(new StringBuilder("MetaData(refId="), this.a, ')');
        }
    }

    public final class a extends KeyValueSerializer {
        public static final a a = new a(Reflection.factory.getOrCreateKotlinClass(Evidence.class));

        @Override // kotlinx.serialization.internal.KeyValueSerializer
        public final KSerializer selectDeserializer(JsonElement jsonElement) {
            jsonElement.getClass();
            return (JsonElementKt.getJsonObject(jsonElement).containsKey("IdDocument") && JsonElementKt.getJsonObject(jsonElement).containsKey("eid")) ? EIdDocument.Companion.serializer() : JsonElementKt.getJsonObject(jsonElement).containsKey("IdDocument") ? Document.Companion.serializer() : JsonElementKt.getJsonObject(jsonElement).containsKey("Biometric") ? Face.Companion.serializer() : Evidence.Companion.serializer();
        }
    }

    public /* synthetic */ MobileVerifyV2Request$MobileVerifyV2RequestModel(int i, MetaData metaData, List list, Configuration configuration) {
        if (2 != (i & 2)) {
            TuplesKt.throwMissingFieldException(i, 2, MobileVerifyV2Request$MobileVerifyV2RequestModel$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = metaData;
        }
        this.b = list;
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = configuration;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MobileVerifyV2Request$MobileVerifyV2RequestModel)) {
            return false;
        }
        MobileVerifyV2Request$MobileVerifyV2RequestModel mobileVerifyV2Request$MobileVerifyV2RequestModel = (MobileVerifyV2Request$MobileVerifyV2RequestModel) obj;
        return Intrinsics.areEqual(this.a, mobileVerifyV2Request$MobileVerifyV2RequestModel.a) && Intrinsics.areEqual(this.b, mobileVerifyV2Request$MobileVerifyV2RequestModel.b) && Intrinsics.areEqual(this.c, mobileVerifyV2Request$MobileVerifyV2RequestModel.c);
    }

    public final int hashCode() {
        MetaData metaData = this.a;
        int hashCode = (metaData == null ? 0 : metaData.a.hashCode()) * 31;
        List list = this.b;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        Configuration configuration = this.c;
        return hashCode2 + (configuration != null ? configuration.hashCode() : 0);
    }

    public final String toString() {
        return "MobileVerifyV2RequestModel(metaData=" + this.a + ", evidence=" + this.b + ", configuration=" + this.c + ')';
    }
}
