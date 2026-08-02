package com.miteksystems.misnap.core;

import android.util.Size;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.plaid.internal.EnumC0170g;
import java.util.HashMap;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.ArraysKt___ArraysKt;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.Serializable;
import kotlinx.serialization.descriptors.ClassSerialDescriptorBuilder;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.descriptors.SerialDescriptorImpl;
import kotlinx.serialization.descriptors.StructureKind;
import kotlinx.serialization.encoding.CompositeDecoder;
import kotlinx.serialization.encoding.CompositeEncoder;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.internal.IntSerializer;
import kotlinx.serialization.internal.PrimitiveSerialDescriptor;
import kotlinx.serialization.internal.TuplesKt;
import kotlinx.serialization.json.Json;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\b\n\b\u0007\u0018\u0000 \u00022\u00020\u0001:\t\u0003\u0004\u0005\u0002\u0006\u0007\b\t\n¨\u0006\u000b"}, d2 = {"Lcom/miteksystems/misnap/core/MiSnapSettings;", "", "Companion", "$serializer", "Analysis", "Camera", "Nfc", "SizeSerializer", "UseCase", "Voice", "Workflow", "core_release"}, k = 1, mv = {1, 8, 0})
@Serializable
/* loaded from: classes4.dex */
public final class MiSnapSettings implements Cloneable {

    /* renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion();
    public final UseCase a;
    public final Analysis analysis;
    public final String b;
    public final Camera camera;
    public final Nfc nfc;
    public final Voice voice;
    public final Workflow workflow;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0080\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068@X\u0080T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068@X\u0080T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00068@X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068@X\u0080T¢\u0006\u0006\n\u0004\b\u000b\u0010\b¨\u0006\f"}, d2 = {"Lcom/miteksystems/misnap/core/MiSnapSettings$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/MiSnapSettings;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "KEY_LICENSE", "Ljava/lang/String;", "KEY_NFC", "KEY_NFC_MRZ", "KEY_NFC_MRZ_TYPE", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class Companion {
        public final KSerializer serializer() {
            return MiSnapSettings$$serializer.INSTANCE;
        }
    }

    /* loaded from: classes9.dex */
    public final class SizeSerializer implements KSerializer {
        public static final SizeSerializer INSTANCE = new SizeSerializer();
        public static final SerialDescriptorImpl a;

        static {
            SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[0];
            if (StringsKt.isBlank("Size")) {
                a$$ExternalSyntheticBUOutline0.m$3("Blank serial names are prohibited");
                return;
            }
            ClassSerialDescriptorBuilder classSerialDescriptorBuilder = new ClassSerialDescriptorBuilder("Size");
            EmptyList emptyList = EmptyList.INSTANCE;
            IntSerializer intSerializer = IntSerializer.INSTANCE;
            PrimitiveSerialDescriptor primitiveSerialDescriptor = IntSerializer.descriptor;
            classSerialDescriptorBuilder.element("width", primitiveSerialDescriptor, emptyList, false);
            classSerialDescriptorBuilder.element("height", primitiveSerialDescriptor, emptyList, false);
            a = new SerialDescriptorImpl("Size", StructureKind.CLASS.INSTANCE, classSerialDescriptorBuilder.elementNames.size(), ArraysKt___ArraysKt.toList(serialDescriptorArr), classSerialDescriptorBuilder);
        }

        @Override // kotlinx.serialization.KSerializer
        public final Object deserialize(Decoder decoder) {
            SerialDescriptorImpl serialDescriptorImpl = a;
            CompositeDecoder beginStructure = decoder.beginStructure(serialDescriptorImpl);
            int i = 0;
            int i2 = 0;
            while (true) {
                int decodeElementIndex = beginStructure.decodeElementIndex(serialDescriptorImpl);
                if (decodeElementIndex == -1) {
                    Size size = new Size(i, i2);
                    beginStructure.endStructure(serialDescriptorImpl);
                    return size;
                }
                if (decodeElementIndex == 0) {
                    i = beginStructure.decodeIntElement(serialDescriptorImpl, 0);
                } else if (decodeElementIndex == 1) {
                    i2 = beginStructure.decodeIntElement(serialDescriptorImpl, 1);
                }
            }
        }

        @Override // kotlinx.serialization.KSerializer
        public final SerialDescriptor getDescriptor() {
            return a;
        }

        @Override // kotlinx.serialization.KSerializer
        public final void serialize(Encoder encoder, Object obj) {
            Size size = (Size) obj;
            size.getClass();
            SerialDescriptorImpl serialDescriptorImpl = a;
            CompositeEncoder beginStructure = encoder.beginStructure(serialDescriptorImpl);
            beginStructure.encodeIntElement(0, size.getWidth(), serialDescriptorImpl);
            beginStructure.encodeIntElement(1, size.getHeight(), serialDescriptorImpl);
            beginStructure.endStructure(serialDescriptorImpl);
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class UseCase {
        public static final UseCase BARCODE;
        public static final UseCase CHECK_BACK;
        public static final UseCase CHECK_FRONT;
        public static final UseCase FACE;
        public static final UseCase GENERIC_DOCUMENT;
        public static final UseCase ID_BACK;
        public static final UseCase ID_FRONT;
        public static final UseCase NFC;
        public static final UseCase PASSPORT;
        public static final UseCase VOICE;
        public static final /* synthetic */ UseCase[] a;

        static {
            UseCase useCase = new UseCase("PASSPORT", 0);
            PASSPORT = useCase;
            UseCase useCase2 = new UseCase("ID_FRONT", 1);
            ID_FRONT = useCase2;
            UseCase useCase3 = new UseCase("ID_BACK", 2);
            ID_BACK = useCase3;
            UseCase useCase4 = new UseCase("CHECK_FRONT", 3);
            CHECK_FRONT = useCase4;
            UseCase useCase5 = new UseCase("CHECK_BACK", 4);
            CHECK_BACK = useCase5;
            UseCase useCase6 = new UseCase("GENERIC_DOCUMENT", 5);
            GENERIC_DOCUMENT = useCase6;
            UseCase useCase7 = new UseCase("BARCODE", 6);
            BARCODE = useCase7;
            UseCase useCase8 = new UseCase("FACE", 7);
            FACE = useCase8;
            UseCase useCase9 = new UseCase("NFC", 8);
            NFC = useCase9;
            UseCase useCase10 = new UseCase("VOICE", 9);
            VOICE = useCase10;
            a = new UseCase[]{useCase, useCase2, useCase3, useCase4, useCase5, useCase6, useCase7, useCase8, useCase9, useCase10};
        }

        public static UseCase valueOf(String str) {
            return (UseCase) Enum.valueOf(UseCase.class, str);
        }

        public static UseCase[] values() {
            return (UseCase[]) a.clone();
        }
    }

    public MiSnapSettings(int i, UseCase useCase, String str, Camera camera, Analysis analysis, Workflow workflow, Nfc nfc, Voice voice) {
        Analysis.Document.Advanced.DocType docType = null;
        if (3 != (i & 3)) {
            TuplesKt.throwMissingFieldException(i, 3, MiSnapSettings$$serializer.INSTANCE.getDescriptor());
            throw null;
        }
        this.a = useCase;
        this.b = str;
        if ((i & 4) == 0) {
            this.camera = new Camera();
        } else {
            this.camera = camera;
        }
        if ((i & 8) == 0) {
            this.analysis = new Analysis();
        } else {
            this.analysis = analysis;
        }
        if ((i & 16) == 0) {
            this.workflow = new Workflow();
        } else {
            this.workflow = workflow;
        }
        if ((i & 32) == 0) {
            this.nfc = new Nfc();
        } else {
            this.nfc = nfc;
        }
        if ((i & 64) == 0) {
            this.voice = new Voice();
        } else {
            this.voice = voice;
        }
        Analysis.Document.Advanced advanced = this.analysis.document.advanced;
        if (advanced.m == null) {
            int ordinal = useCase.ordinal();
            if (ordinal == 0) {
                docType = Analysis.Document.Advanced.DocType.PASSPORT;
            } else if (ordinal == 1) {
                docType = Analysis.Document.Advanced.DocType.ID_FRONT;
            } else if (ordinal == 2) {
                docType = Analysis.Document.Advanced.DocType.ID_BACK;
            } else if (ordinal == 3) {
                docType = Analysis.Document.Advanced.DocType.CHECK_FRONT;
            } else if (ordinal == 4) {
                docType = Analysis.Document.Advanced.DocType.CHECK_BACK;
            } else if (ordinal == 5) {
                docType = Analysis.Document.Advanced.DocType.GENERIC;
            }
            advanced.m = docType;
        }
        Camera camera2 = this.camera;
        if (camera2.b == null) {
            camera2.b = useCase == UseCase.FACE ? Camera.Profile.FACE_FRONT_CAMERA : Camera.Profile.DOCUMENT_BACK_CAMERA;
        }
        if (camera2.a == null) {
            Analysis.Document.Advanced.DocType docType2 = this.analysis.document.advanced.m;
            camera2.a = (docType2 == null || !docType2.isCheck()) ? Camera.TorchMode.OFF : Camera.TorchMode.AUTO;
        }
    }

    /* renamed from: clone, reason: merged with bridge method [inline-methods] */
    public final MiSnapSettings m2165clone() {
        Json.Default r0 = Json.Default;
        r0.getClass();
        Companion companion = INSTANCE;
        return (MiSnapSettings) r0.decodeFromString(r0.encodeToString(companion.serializer(), this), companion.serializer());
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\b\b\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0007\u0003\u0004\u0005\u0002\u0006\u0007\b¨\u0006\t"}, d2 = {"Lcom/miteksystems/misnap/core/MiSnapSettings$Analysis;", "", "Companion", "$serializer", "AiBasedRtsPayloadSize", "Barcode", "Document", "Face", "MotionDetectorSensitivity", "core_release"}, k = 1, mv = {1, 8, 0})
    @Serializable
    public static final class Analysis implements Cloneable {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public Integer a;
        public final Integer b;
        public final Barcode barcode;
        public final MotionDetectorSensitivity c;
        public final Boolean d;
        public final Document document;
        public final AiBasedRtsPayloadSize e;
        public final Face face;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class AiBasedRtsPayloadSize {
            public static final /* synthetic */ AiBasedRtsPayloadSize[] a = {new AiBasedRtsPayloadSize("SMALL", 0), new AiBasedRtsPayloadSize("NORMAL", 1)};

            /* JADX INFO: Fake field, exist only in values array */
            AiBasedRtsPayloadSize EF5;

            public static AiBasedRtsPayloadSize valueOf(String str) {
                return (AiBasedRtsPayloadSize) Enum.valueOf(AiBasedRtsPayloadSize.class, str);
            }

            public static AiBasedRtsPayloadSize[] values() {
                return (AiBasedRtsPayloadSize[]) a.clone();
            }
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\b\u0007\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0006\u0003\u0002\u0004\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/miteksystems/misnap/core/MiSnapSettings$Analysis$Barcode;", "", "Companion", "$serializer", "Orientation", "ScanSpeed", "Trigger", "Type", "core_release"}, k = 1, mv = {1, 8, 0})
        @Serializable
        public static final class Barcode implements Cloneable {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion();
            public ScanSpeed a;
            public Integer b;
            public Orientation c;
            public Trigger d;

            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/miteksystems/misnap/core/MiSnapSettings$Analysis$Barcode$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/MiSnapSettings$Analysis$Barcode;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public final KSerializer serializer() {
                    return MiSnapSettings$Analysis$Barcode$$serializer.INSTANCE;
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class Orientation {
                public static final Orientation DEVICE;
                public static final Orientation LANDSCAPE;
                public static final Orientation PORTRAIT;
                public static final /* synthetic */ Orientation[] a;

                static {
                    Orientation orientation = new Orientation("LANDSCAPE", 0);
                    LANDSCAPE = orientation;
                    Orientation orientation2 = new Orientation("PORTRAIT", 1);
                    PORTRAIT = orientation2;
                    Orientation orientation3 = new Orientation("DEVICE", 2);
                    DEVICE = orientation3;
                    a = new Orientation[]{orientation, orientation2, orientation3};
                }

                public static Orientation valueOf(String str) {
                    return (Orientation) Enum.valueOf(Orientation.class, str);
                }

                public static Orientation[] values() {
                    return (Orientation[]) a.clone();
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class ScanSpeed {
                public static final /* synthetic */ ScanSpeed[] b = {new ScanSpeed("FAST", 0), new ScanSpeed("MEDIUM", 1), new ScanSpeed("SLOW", 2)};

                /* JADX INFO: Fake field, exist only in values array */
                ScanSpeed EF5;

                public static ScanSpeed valueOf(String str) {
                    return (ScanSpeed) Enum.valueOf(ScanSpeed.class, str);
                }

                public static ScanSpeed[] values() {
                    return (ScanSpeed[]) b.clone();
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class Trigger {
                public static final Trigger AUTO;
                public static final Trigger MANUAL;
                public static final /* synthetic */ Trigger[] a;

                static {
                    Trigger trigger = new Trigger("AUTO", 0);
                    AUTO = trigger;
                    Trigger trigger2 = new Trigger("MANUAL", 1);
                    MANUAL = trigger2;
                    a = new Trigger[]{trigger, trigger2};
                }

                public static Trigger valueOf(String str) {
                    return (Trigger) Enum.valueOf(Trigger.class, str);
                }

                public static Trigger[] values() {
                    return (Trigger[]) a.clone();
                }
            }

            @Serializable
            public final class Type implements Cloneable {
                public static final Companion Companion = new Companion();

                @Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\r\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005R\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\bR\u0014\u0010\n\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\bR\u0014\u0010\u000b\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000b\u0010\bR\u0014\u0010\f\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\bR\u0014\u0010\r\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\r\u0010\bR\u0014\u0010\u000e\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000e\u0010\bR\u0014\u0010\u000f\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\bR\u0014\u0010\u0010\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0010\u0010\bR\u0014\u0010\u0011\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0011\u0010\bR\u0014\u0010\u0012\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"com/miteksystems/misnap/core/MiSnapSettings$Analysis$Barcode$Type$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/MiSnapSettings$Analysis$Barcode$Type;", "serializer", "()Lkotlinx/serialization/KSerializer;", "", "ALL", "I", "AZTEC_CODE", "CODABAR", "CODE_128", "CODE_2_OF_5", "CODE_39", "CODE_93", "DATA_MATRIX", "PDF417", "QR_CODE", "RSS", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                public final class Companion {
                    public final KSerializer serializer() {
                        return MiSnapSettings$Analysis$Barcode$Type$$serializer.INSTANCE;
                    }
                }

                public final Object clone() {
                    return super.clone();
                }
            }

            public final Object clone() {
                Json.Default r0 = Json.Default;
                r0.getClass();
                Companion companion = INSTANCE;
                return (Barcode) r0.decodeFromString(r0.encodeToString(companion.serializer(), this), companion.serializer());
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/miteksystems/misnap/core/MiSnapSettings$Analysis$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/MiSnapSettings$Analysis;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer serializer() {
                return MiSnapSettings$Analysis$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class MotionDetectorSensitivity {
            public static final MotionDetectorSensitivity HIGH;
            public static final MotionDetectorSensitivity NONE;
            public static final /* synthetic */ MotionDetectorSensitivity[] a;

            static {
                MotionDetectorSensitivity motionDetectorSensitivity = new MotionDetectorSensitivity("NONE", 0);
                NONE = motionDetectorSensitivity;
                MotionDetectorSensitivity motionDetectorSensitivity2 = new MotionDetectorSensitivity("LOW", 1);
                MotionDetectorSensitivity motionDetectorSensitivity3 = new MotionDetectorSensitivity("HIGH", 2);
                HIGH = motionDetectorSensitivity3;
                a = new MotionDetectorSensitivity[]{motionDetectorSensitivity, motionDetectorSensitivity2, motionDetectorSensitivity3};
            }

            public static MotionDetectorSensitivity valueOf(String str) {
                return (MotionDetectorSensitivity) Enum.valueOf(MotionDetectorSensitivity.class, str);
            }

            public static MotionDetectorSensitivity[] values() {
                return (MotionDetectorSensitivity[]) a.clone();
            }
        }

        public Analysis(int i, Document document, Face face, Barcode barcode, Integer num, Integer num2, MotionDetectorSensitivity motionDetectorSensitivity, Boolean bool, AiBasedRtsPayloadSize aiBasedRtsPayloadSize) {
            this.document = (i & 1) == 0 ? new Document() : document;
            if ((i & 2) == 0) {
                this.face = new Face();
            } else {
                this.face = face;
            }
            if ((i & 4) == 0) {
                this.barcode = new Barcode();
            } else {
                this.barcode = barcode;
            }
            if ((i & 8) == 0) {
                this.a = null;
            } else {
                this.a = num;
            }
            if ((i & 16) == 0) {
                this.b = null;
            } else {
                this.b = num2;
            }
            if ((i & 32) == 0) {
                this.c = null;
            } else {
                this.c = motionDetectorSensitivity;
            }
            if ((i & 64) == 0) {
                this.d = null;
            } else {
                this.d = bool;
            }
            if ((i & 128) == 0) {
                this.e = null;
            } else {
                this.e = aiBasedRtsPayloadSize;
            }
        }

        public final Object clone() {
            Json.Default r0 = Json.Default;
            r0.getClass();
            Companion companion = INSTANCE;
            return (Analysis) r0.decodeFromString(r0.encodeToString(companion.serializer(), this), companion.serializer());
        }

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0002\u0005¨\u0006\u0006"}, d2 = {"Lcom/miteksystems/misnap/core/MiSnapSettings$Analysis$Face;", "", "Companion", "$serializer", "Advanced", "Trigger", "core_release"}, k = 1, mv = {1, 8, 0})
        @Serializable
        public static final class Face implements Cloneable {

            /* renamed from: Companion, reason: from kotlin metadata */
            public static final Companion INSTANCE = new Companion();
            public Trigger a;
            public final Advanced advanced;

            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0002\u0003\u0002¨\u0006\u0004"}, d2 = {"Lcom/miteksystems/misnap/core/MiSnapSettings$Analysis$Face$Advanced;", "", "Companion", "$serializer", "core_release"}, k = 1, mv = {1, 8, 0})
            @Serializable
            public static final class Advanced implements Cloneable {

                /* renamed from: Companion, reason: from kotlin metadata */
                public static final Companion INSTANCE = new Companion();
                public Integer a;
                public Integer b;
                public Integer c;
                public Integer d;
                public Integer e;
                public Integer f;
                public List g;

                @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/miteksystems/misnap/core/MiSnapSettings$Analysis$Face$Advanced$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/MiSnapSettings$Analysis$Face$Advanced;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                public static final class Companion {
                    public final KSerializer serializer() {
                        return MiSnapSettings$Analysis$Face$Advanced$$serializer.INSTANCE;
                    }
                }

                public final Object clone() {
                    Json.Default r0 = Json.Default;
                    r0.getClass();
                    Companion companion = INSTANCE;
                    return (Advanced) r0.decodeFromString(r0.encodeToString(companion.serializer(), this), companion.serializer());
                }
            }

            @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/miteksystems/misnap/core/MiSnapSettings$Analysis$Face$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/MiSnapSettings$Analysis$Face;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public static final class Companion {
                public final KSerializer serializer() {
                    return MiSnapSettings$Analysis$Face$$serializer.INSTANCE;
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public static final class Trigger {
                public static final Trigger AUTO;
                public static final Trigger AUTO_SMILE;
                public static final Companion Companion;
                public static final Trigger MANUAL;
                public static final /* synthetic */ Trigger[] a;

                public static final class Companion {
                }

                static {
                    Trigger trigger = new Trigger("AUTO", 0);
                    AUTO = trigger;
                    Trigger trigger2 = new Trigger("AUTO_SMILE", 1);
                    AUTO_SMILE = trigger2;
                    Trigger trigger3 = new Trigger("MANUAL", 2);
                    MANUAL = trigger3;
                    a = new Trigger[]{trigger, trigger2, trigger3};
                    Companion = new Companion();
                }

                public static Trigger valueOf(String str) {
                    return (Trigger) Enum.valueOf(Trigger.class, str);
                }

                public static Trigger[] values() {
                    return (Trigger[]) a.clone();
                }
            }

            public Face(int i, Advanced advanced, Trigger trigger) {
                this.advanced = (i & 1) == 0 ? new Advanced() : advanced;
                if ((i & 2) == 0) {
                    this.a = null;
                } else {
                    this.a = trigger;
                }
            }

            public final Object clone() {
                Json.Default r0 = Json.Default;
                r0.getClass();
                Companion companion = INSTANCE;
                return (Face) r0.decodeFromString(r0.encodeToString(companion.serializer(), this), companion.serializer());
            }

            public Face() {
                this.advanced = new Advanced();
            }
        }

        public Analysis() {
            this.document = new Document();
            this.face = new Face();
            this.barcode = new Barcode();
        }

        @Serializable
        public final class Document implements Cloneable {
            public static final Companion Companion = new Companion();
            public ExtractionRequirement a;
            public final Advanced advanced;
            public final Boolean b;
            public final ExtractionRequirement c;
            public final Check check;
            public final Orientation d;
            public Trigger e;
            public final Boolean f;
            public final Boolean g;
            public final Boolean h;
            public Boolean i;

            @Serializable
            public final class Advanced implements Cloneable {
                public static final Companion Companion = new Companion();
                public Integer a;
                public Integer b;
                public Integer c;
                public Integer d;
                public Integer e;
                public Integer f;
                public Integer g;
                public Integer h;
                public Integer i;
                public Integer j;
                public Integer k;
                public Integer l;
                public DocType m;
                public List n;

                @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/core/MiSnapSettings$Analysis$Document$Advanced$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/MiSnapSettings$Analysis$Document$Advanced;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                public final class Companion {
                    public final KSerializer serializer() {
                        return MiSnapSettings$Analysis$Document$Advanced$$serializer.INSTANCE;
                    }
                }

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                public final class DocType {
                    public static final DocType CHECK_BACK;
                    public static final DocType CHECK_FRONT;
                    public static final DocType GENERIC;
                    public static final DocType ID_BACK;
                    public static final DocType ID_FRONT;
                    public static final DocType ONE_LINE_MRZ;
                    public static final DocType PASSPORT;
                    public static final DocType TD1;
                    public static final DocType TD2;
                    public static final /* synthetic */ DocType[] a;

                    static {
                        DocType docType = new DocType("CHECK_FRONT", 0);
                        CHECK_FRONT = docType;
                        DocType docType2 = new DocType("CHECK_BACK", 1);
                        CHECK_BACK = docType2;
                        DocType docType3 = new DocType("ID_FRONT", 2);
                        ID_FRONT = docType3;
                        DocType docType4 = new DocType("ID_BACK", 3);
                        ID_BACK = docType4;
                        DocType docType5 = new DocType("PASSPORT", 4);
                        PASSPORT = docType5;
                        DocType docType6 = new DocType("TD1", 5);
                        TD1 = docType6;
                        DocType docType7 = new DocType("TD2", 6);
                        TD2 = docType7;
                        DocType docType8 = new DocType("ONE_LINE_MRZ", 7);
                        ONE_LINE_MRZ = docType8;
                        DocType docType9 = new DocType("GENERIC", 8);
                        GENERIC = docType9;
                        a = new DocType[]{docType, docType2, docType3, docType4, docType5, docType6, docType7, docType8, docType9};
                    }

                    public static DocType valueOf(String str) {
                        return (DocType) Enum.valueOf(DocType.class, str);
                    }

                    public static DocType[] values() {
                        return (DocType[]) a.clone();
                    }

                    public final boolean isCheck() {
                        return CollectionsKt__CollectionsKt.listOf((Object[]) new DocType[]{CHECK_BACK, CHECK_FRONT}).contains(this);
                    }

                    public final boolean isMrzDocument() {
                        return CollectionsKt__CollectionsKt.listOf((Object[]) new DocType[]{PASSPORT, TD1, TD2, ONE_LINE_MRZ}).contains(this);
                    }
                }

                public final Object clone() {
                    Json.Default r0 = Json.Default;
                    r0.getClass();
                    Companion companion = Companion;
                    return (Advanced) r0.decodeFromString(r0.encodeToString(companion.serializer(), this), companion.serializer());
                }
            }

            @Serializable
            public final class Check implements Cloneable {
                public static final Companion Companion = new Companion();
                public Geo a;

                @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/core/MiSnapSettings$Analysis$Document$Check$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/MiSnapSettings$Analysis$Document$Check;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                public final class Companion {
                    public final KSerializer serializer() {
                        return MiSnapSettings$Analysis$Document$Check$$serializer.INSTANCE;
                    }
                }

                public enum Geo {
                    /* JADX INFO: Fake field, exist only in values array */
                    US(0),
                    GLOBAL(1);

                    public final int a;

                    Geo(int i) {
                        this.a = i;
                    }
                }

                public final Object clone() {
                    Json.Default r0 = Json.Default;
                    r0.getClass();
                    Companion companion = Companion;
                    return (Check) r0.decodeFromString(r0.encodeToString(companion.serializer(), this), companion.serializer());
                }
            }

            @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/core/MiSnapSettings$Analysis$Document$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/MiSnapSettings$Analysis$Document;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public final class Companion {
                public final KSerializer serializer() {
                    return MiSnapSettings$Analysis$Document$$serializer.INSTANCE;
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class ExtractionRequirement {
                public static final ExtractionRequirement NONE;
                public static final ExtractionRequirement OPTIONAL;
                public static final ExtractionRequirement REQUIRED;
                public static final /* synthetic */ ExtractionRequirement[] a;

                static {
                    ExtractionRequirement extractionRequirement = new ExtractionRequirement("NONE", 0);
                    NONE = extractionRequirement;
                    ExtractionRequirement extractionRequirement2 = new ExtractionRequirement("OPTIONAL", 1);
                    OPTIONAL = extractionRequirement2;
                    ExtractionRequirement extractionRequirement3 = new ExtractionRequirement("REQUIRED", 2);
                    REQUIRED = extractionRequirement3;
                    a = new ExtractionRequirement[]{extractionRequirement, extractionRequirement2, extractionRequirement3};
                }

                public static ExtractionRequirement valueOf(String str) {
                    return (ExtractionRequirement) Enum.valueOf(ExtractionRequirement.class, str);
                }

                public static ExtractionRequirement[] values() {
                    return (ExtractionRequirement[]) a.clone();
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class Orientation {
                public static final Orientation DEVICE;
                public static final /* synthetic */ Orientation[] a;

                /* JADX INFO: Fake field, exist only in values array */
                Orientation EF0;

                static {
                    Orientation orientation = new Orientation("LANDSCAPE", 0);
                    Orientation orientation2 = new Orientation("PORTRAIT", 1);
                    Orientation orientation3 = new Orientation("DEVICE", 2);
                    DEVICE = orientation3;
                    a = new Orientation[]{orientation, orientation2, orientation3};
                }

                public static Orientation valueOf(String str) {
                    return (Orientation) Enum.valueOf(Orientation.class, str);
                }

                public static Orientation[] values() {
                    return (Orientation[]) a.clone();
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class Trigger {
                public static final Trigger AUTO;
                public static final Trigger MANUAL;
                public static final /* synthetic */ Trigger[] a;

                static {
                    Trigger trigger = new Trigger("AUTO", 0);
                    AUTO = trigger;
                    Trigger trigger2 = new Trigger("MANUAL", 1);
                    MANUAL = trigger2;
                    a = new Trigger[]{trigger, trigger2};
                }

                public static Trigger valueOf(String str) {
                    return (Trigger) Enum.valueOf(Trigger.class, str);
                }

                public static Trigger[] values() {
                    return (Trigger[]) a.clone();
                }
            }

            public Document(int i, Advanced advanced, Check check, ExtractionRequirement extractionRequirement, Boolean bool, ExtractionRequirement extractionRequirement2, Orientation orientation, Trigger trigger, Boolean bool2, Boolean bool3, Boolean bool4, Boolean bool5) {
                this.advanced = (i & 1) == 0 ? new Advanced() : advanced;
                if ((i & 2) == 0) {
                    this.check = new Check();
                } else {
                    this.check = check;
                }
                if ((i & 4) == 0) {
                    this.a = null;
                } else {
                    this.a = extractionRequirement;
                }
                if ((i & 8) == 0) {
                    this.b = null;
                } else {
                    this.b = bool;
                }
                if ((i & 16) == 0) {
                    this.c = null;
                } else {
                    this.c = extractionRequirement2;
                }
                if ((i & 32) == 0) {
                    this.d = null;
                } else {
                    this.d = orientation;
                }
                if ((i & 64) == 0) {
                    this.e = null;
                } else {
                    this.e = trigger;
                }
                if ((i & 128) == 0) {
                    this.f = null;
                } else {
                    this.f = bool2;
                }
                if ((i & 256) == 0) {
                    this.g = null;
                } else {
                    this.g = bool3;
                }
                if ((i & 512) == 0) {
                    this.h = null;
                } else {
                    this.h = bool4;
                }
                if ((i & 1024) == 0) {
                    this.i = null;
                } else {
                    this.i = bool5;
                }
            }

            /* renamed from: clone, reason: merged with bridge method [inline-methods] */
            public final Document m2166clone() {
                Json.Default r0 = Json.Default;
                r0.getClass();
                Companion companion = Companion;
                return (Document) r0.decodeFromString(r0.encodeToString(companion.serializer(), this), companion.serializer());
            }

            public Document() {
                this.advanced = new Advanced();
                this.check = new Check();
            }
        }
    }

    @Serializable
    public final class Voice implements Cloneable {
        public static final Companion Companion = new Companion();
        public final Flow a;
        public String b;
        public final Advanced c;

        @Serializable
        public final class Advanced implements Cloneable {
            public static final Companion Companion = new Companion();
            public Integer a;
            public Integer b;
            public Float c;

            @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/core/MiSnapSettings$Voice$Advanced$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/MiSnapSettings$Voice$Advanced;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public final class Companion {
                public final KSerializer serializer() {
                    return MiSnapSettings$Voice$Advanced$$serializer.INSTANCE;
                }
            }

            public final Object clone() {
                Json.Default r0 = Json.Default;
                r0.getClass();
                Companion companion = Companion;
                return (Advanced) r0.decodeFromString(r0.encodeToString(companion.serializer(), this), companion.serializer());
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/core/MiSnapSettings$Voice$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/MiSnapSettings$Voice;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return MiSnapSettings$Voice$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class Flow {
            public static final Flow ENROLLMENT;
            public static final Flow VERIFICATION;
            public static final /* synthetic */ Flow[] a;

            static {
                Flow flow = new Flow("ENROLLMENT", 0);
                ENROLLMENT = flow;
                Flow flow2 = new Flow("VERIFICATION", 1);
                VERIFICATION = flow2;
                a = new Flow[]{flow, flow2};
            }

            public static Flow valueOf(String str) {
                return (Flow) Enum.valueOf(Flow.class, str);
            }

            public static Flow[] values() {
                return (Flow[]) a.clone();
            }
        }

        public Voice(int i, Flow flow, String str, Advanced advanced) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = flow;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = str;
            }
            if ((i & 4) == 0) {
                this.c = new Advanced();
            } else {
                this.c = advanced;
            }
        }

        public final Object clone() {
            Json.Default r0 = Json.Default;
            r0.getClass();
            Companion companion = Companion;
            return (Voice) r0.decodeFromString(r0.encodeToString(companion.serializer(), this), companion.serializer());
        }

        public Voice() {
            this.c = new Advanced();
        }
    }

    @Serializable
    public final class Workflow implements Cloneable {
        public static final Companion Companion = new Companion();
        public final Integer a;
        public final Boolean b;
        public final HashMap c;

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/core/MiSnapSettings$Workflow$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/MiSnapSettings$Workflow;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return MiSnapSettings$Workflow$$serializer.INSTANCE;
            }
        }

        public /* synthetic */ Workflow(int i, Integer num, Boolean bool, HashMap hashMap) {
            if ((i & 1) == 0) {
                this.a = null;
            } else {
                this.a = num;
            }
            if ((i & 2) == 0) {
                this.b = null;
            } else {
                this.b = bool;
            }
            if ((i & 4) == 0) {
                this.c = new HashMap();
            } else {
                this.c = hashMap;
            }
        }

        public final Object clone() {
            Json.Default r0 = Json.Default;
            r0.getClass();
            Companion companion = Companion;
            return (Workflow) r0.decodeFromString(r0.encodeToString(companion.serializer(), this), companion.serializer());
        }

        public final String get(String str) {
            str.getClass();
            return (String) this.c.get(str);
        }

        public Workflow() {
            this.c = new HashMap();
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u001a\n\u0002\b\u0005\b\u0007\u0018\u0000 \u00022\u00020\u0001:\u0004\u0003\u0004\u0002\u0005¨\u0006\u0006"}, d2 = {"Lcom/miteksystems/misnap/core/MiSnapSettings$Nfc;", "", "Companion", "$serializer", "Advanced", "SoundAndVibration", "core_release"}, k = 1, mv = {1, 8, 0})
    @Serializable
    public static final class Nfc implements Cloneable {

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE = new Companion();
        public Mrz a;
        public final Advanced advanced;
        public final SoundAndVibration b;
        public final Boolean c;
        public final Boolean d;

        @Serializable
        public final class Advanced implements Cloneable {
            public static final Companion Companion = new Companion();
            public DocType a;

            @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/core/MiSnapSettings$Nfc$Advanced$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/MiSnapSettings$Nfc$Advanced;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public final class Companion {
                public final KSerializer serializer() {
                    return MiSnapSettings$Nfc$Advanced$$serializer.INSTANCE;
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class DocType {
                public static final DocType EU_DL;
                public static final DocType ID;
                public static final DocType PASSPORT;
                public static final /* synthetic */ DocType[] a;

                static {
                    DocType docType = new DocType("PASSPORT", 0);
                    PASSPORT = docType;
                    DocType docType2 = new DocType("ID", 1);
                    ID = docType2;
                    DocType docType3 = new DocType("EU_DL", 2);
                    EU_DL = docType3;
                    a = new DocType[]{docType, docType2, docType3};
                }

                public static DocType valueOf(String str) {
                    return (DocType) Enum.valueOf(DocType.class, str);
                }

                public static DocType[] values() {
                    return (DocType[]) a.clone();
                }
            }

            public final Object clone() {
                return super.clone();
            }
        }

        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/miteksystems/misnap/core/MiSnapSettings$Nfc$Companion;", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/MiSnapSettings$Nfc;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public static final class Companion {
            public final KSerializer serializer() {
                return MiSnapSettings$Nfc$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class SoundAndVibration {
            public static final /* synthetic */ SoundAndVibration[] a = {new SoundAndVibration("OFF", 0), new SoundAndVibration("FOLLOW_SYSTEM", 1), new SoundAndVibration("VIBRATE_ONLY", 2)};

            /* JADX INFO: Fake field, exist only in values array */
            SoundAndVibration EF5;

            public static SoundAndVibration valueOf(String str) {
                return (SoundAndVibration) Enum.valueOf(SoundAndVibration.class, str);
            }

            public static SoundAndVibration[] values() {
                return (SoundAndVibration[]) a.clone();
            }
        }

        public Nfc(int i, Advanced advanced, Mrz mrz, SoundAndVibration soundAndVibration, Boolean bool, Boolean bool2) {
            this.advanced = (i & 1) == 0 ? new Advanced() : advanced;
            if ((i & 2) == 0) {
                this.a = null;
            } else {
                this.a = mrz;
            }
            if ((i & 4) == 0) {
                this.b = null;
            } else {
                this.b = soundAndVibration;
            }
            if ((i & 8) == 0) {
                this.c = null;
            } else {
                this.c = bool;
            }
            if ((i & 16) == 0) {
                this.d = null;
            } else {
                this.d = bool2;
            }
        }

        public final Object clone() {
            return super.clone();
        }

        public Nfc() {
            this.advanced = new Advanced();
        }
    }

    @Serializable
    public final class Camera implements Cloneable {
        public static final Companion Companion = new Companion();
        public TorchMode a;
        public final Advanced advanced;
        public Profile b;
        public final Boolean c;
        public final VideoRecord videoRecord;

        @Serializable
        public final class Advanced implements Cloneable {
            public static final Companion Companion = new Companion();
            public Boolean a;
            public FrameInjection b;

            @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/core/MiSnapSettings$Camera$Advanced$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/MiSnapSettings$Camera$Advanced;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public final class Companion {
                public final KSerializer serializer() {
                    return MiSnapSettings$Camera$Advanced$$serializer.INSTANCE;
                }
            }

            @Serializable
            public final class FrameInjection implements Cloneable {
                public static final Companion Companion = new Companion();
                public final int a;
                public final int b;
                public final MiSnapCameraInfo c;

                @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/core/MiSnapSettings$Camera$Advanced$FrameInjection$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/MiSnapSettings$Camera$Advanced$FrameInjection;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
                public final class Companion {
                    public final KSerializer serializer() {
                        return MiSnapSettings$Camera$Advanced$FrameInjection$$serializer.INSTANCE;
                    }
                }

                public /* synthetic */ FrameInjection(int i, int i2, int i3, MiSnapCameraInfo miSnapCameraInfo) {
                    if (3 != (i & 3)) {
                        TuplesKt.throwMissingFieldException(i, 3, MiSnapSettings$Camera$Advanced$FrameInjection$$serializer.INSTANCE.getDescriptor());
                        throw null;
                    }
                    this.a = i2;
                    this.b = i3;
                    if ((i & 4) == 0) {
                        this.c = null;
                    } else {
                        this.c = miSnapCameraInfo;
                    }
                }

                public final Object clone() {
                    Json.Default r0 = Json.Default;
                    r0.getClass();
                    Companion companion = Companion;
                    return (FrameInjection) r0.decodeFromString(r0.encodeToString(companion.serializer(), this), companion.serializer());
                }
            }

            public final Object clone() {
                Json.Default r0 = Json.Default;
                r0.getClass();
                Companion companion = Companion;
                return (Advanced) r0.decodeFromString(r0.encodeToString(companion.serializer(), this), companion.serializer());
            }
        }

        @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/core/MiSnapSettings$Camera$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/MiSnapSettings$Camera;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
        public final class Companion {
            public final KSerializer serializer() {
                return MiSnapSettings$Camera$$serializer.INSTANCE;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class Profile {
            public static final Profile DOCUMENT_BACK_CAMERA;
            public static final Profile FACE_FRONT_CAMERA;
            public static final /* synthetic */ Profile[] a;

            static {
                Profile profile = new Profile("DOCUMENT_BACK_CAMERA", 0);
                DOCUMENT_BACK_CAMERA = profile;
                Profile profile2 = new Profile("FACE_FRONT_CAMERA", 1);
                FACE_FRONT_CAMERA = profile2;
                a = new Profile[]{profile, profile2, new Profile("FACE_BACK_CAMERA", 2)};
            }

            public static Profile valueOf(String str) {
                return (Profile) Enum.valueOf(Profile.class, str);
            }

            public static Profile[] values() {
                return (Profile[]) a.clone();
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public final class TorchMode {
            public static final TorchMode AUTO;
            public static final TorchMode OFF;
            public static final TorchMode ON;
            public static final /* synthetic */ TorchMode[] a;

            static {
                TorchMode torchMode = new TorchMode("OFF", 0);
                OFF = torchMode;
                TorchMode torchMode2 = new TorchMode("ON", 1);
                ON = torchMode2;
                TorchMode torchMode3 = new TorchMode("AUTO", 2);
                AUTO = torchMode3;
                a = new TorchMode[]{torchMode, torchMode2, torchMode3};
            }

            public static TorchMode valueOf(String str) {
                return (TorchMode) Enum.valueOf(TorchMode.class, str);
            }

            public static TorchMode[] values() {
                return (TorchMode[]) a.clone();
            }
        }

        @Serializable
        public final class VideoRecord implements Cloneable {
            public static final Companion Companion = new Companion();
            public Boolean a;
            public Boolean b;
            public VideoQuality c;
            public Size d;
            public Integer e;

            @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001J\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0001¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"com/miteksystems/misnap/core/MiSnapSettings$Camera$VideoRecord$Companion", "", "Lkotlinx/serialization/KSerializer;", "Lcom/miteksystems/misnap/core/MiSnapSettings$Camera$VideoRecord;", "serializer", "()Lkotlinx/serialization/KSerializer;", "core_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
            public final class Companion {
                public final KSerializer serializer() {
                    return MiSnapSettings$Camera$VideoRecord$$serializer.INSTANCE;
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            public final class VideoQuality {
                public static final VideoQuality FHD;
                public static final VideoQuality HD;
                public static final /* synthetic */ VideoQuality[] a;

                static {
                    VideoQuality videoQuality = new VideoQuality("FHD", 0);
                    FHD = videoQuality;
                    VideoQuality videoQuality2 = new VideoQuality("HD", 1);
                    HD = videoQuality2;
                    a = new VideoQuality[]{videoQuality, videoQuality2};
                }

                public static VideoQuality valueOf(String str) {
                    return (VideoQuality) Enum.valueOf(VideoQuality.class, str);
                }

                public static VideoQuality[] values() {
                    return (VideoQuality[]) a.clone();
                }
            }

            public final Object clone() {
                Json.Default r0 = Json.Default;
                r0.getClass();
                Companion companion = Companion;
                return (VideoRecord) r0.decodeFromString(r0.encodeToString(companion.serializer(), this), companion.serializer());
            }

            public final boolean equals(Object obj) {
                if (!(obj instanceof VideoRecord)) {
                    return false;
                }
                VideoRecord videoRecord = (VideoRecord) obj;
                return Intrinsics.areEqual(this.a, videoRecord.a) && Intrinsics.areEqual(this.b, videoRecord.b) && this.c == videoRecord.c && Intrinsics.areEqual(this.d, videoRecord.d) && Intrinsics.areEqual(this.e, videoRecord.e);
            }

            public final int hashCode() {
                Boolean bool = this.a;
                int hashCode = ((bool != null ? bool.hashCode() : 0) + EnumC0170g.SDK_ASSET_ICON_PROGRESS_VALUE) * 31;
                Boolean bool2 = this.b;
                int hashCode2 = (hashCode + (bool2 != null ? bool2.hashCode() : 0)) * 31;
                VideoQuality videoQuality = this.c;
                int hashCode3 = (hashCode2 + (videoQuality != null ? videoQuality.hashCode() : 0)) * 31;
                Size size = this.d;
                int hashCode4 = (hashCode3 + (size != null ? size.hashCode() : 0)) * 31;
                Integer num = this.e;
                return hashCode4 + (num != null ? num.intValue() : 0);
            }
        }

        public Camera(int i, Advanced advanced, VideoRecord videoRecord, TorchMode torchMode, Profile profile, Boolean bool) {
            this.advanced = (i & 1) == 0 ? new Advanced() : advanced;
            if ((i & 2) == 0) {
                this.videoRecord = new VideoRecord();
            } else {
                this.videoRecord = videoRecord;
            }
            if ((i & 4) == 0) {
                this.a = null;
            } else {
                this.a = torchMode;
            }
            if ((i & 8) == 0) {
                this.b = null;
            } else {
                this.b = profile;
            }
            if ((i & 16) == 0) {
                this.c = null;
            } else {
                this.c = bool;
            }
        }

        public final Object clone() {
            Json.Default r0 = Json.Default;
            r0.getClass();
            Companion companion = Companion;
            return (Camera) r0.decodeFromString(r0.encodeToString(companion.serializer(), this), companion.serializer());
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof Camera)) {
                return false;
            }
            Camera camera = (Camera) obj;
            return Intrinsics.areEqual(this.videoRecord, camera.videoRecord) && this.b == camera.b;
        }

        public final int hashCode() {
            int hashCode = (this.videoRecord.hashCode() + (this.advanced.hashCode() * 31)) * 31;
            TorchMode torchMode = this.a;
            int hashCode2 = (hashCode + (torchMode != null ? torchMode.hashCode() : 0)) * 31;
            Profile profile = this.b;
            return hashCode2 + (profile != null ? profile.hashCode() : 0);
        }

        public Camera() {
            this.advanced = new Advanced();
            this.videoRecord = new VideoRecord();
        }
    }

    public MiSnapSettings(UseCase useCase, String str) {
        useCase.getClass();
        str.getClass();
        this.a = useCase;
        this.b = str;
        Camera camera = new Camera();
        this.camera = camera;
        Analysis analysis = new Analysis();
        this.analysis = analysis;
        this.workflow = new Workflow();
        this.nfc = new Nfc();
        this.voice = new Voice();
        Analysis.Document document = analysis.document;
        Analysis.Document.Advanced advanced = document.advanced;
        if (advanced.m == null) {
            int ordinal = useCase.ordinal();
            advanced.m = ordinal != 0 ? ordinal != 1 ? ordinal != 2 ? ordinal != 3 ? ordinal != 4 ? ordinal != 5 ? null : Analysis.Document.Advanced.DocType.GENERIC : Analysis.Document.Advanced.DocType.CHECK_BACK : Analysis.Document.Advanced.DocType.CHECK_FRONT : Analysis.Document.Advanced.DocType.ID_BACK : Analysis.Document.Advanced.DocType.ID_FRONT : Analysis.Document.Advanced.DocType.PASSPORT;
        }
        if (camera.b == null) {
            camera.b = useCase == UseCase.FACE ? Camera.Profile.FACE_FRONT_CAMERA : Camera.Profile.DOCUMENT_BACK_CAMERA;
        }
        if (camera.a == null) {
            Analysis.Document.Advanced.DocType docType = document.advanced.m;
            camera.a = (docType == null || !docType.isCheck()) ? Camera.TorchMode.OFF : Camera.TorchMode.AUTO;
        }
    }
}
