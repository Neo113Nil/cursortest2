package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextInputValidation;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public final class Common$SegmentedInput extends GeneratedMessageLite<Common$SegmentedInput, a> implements MessageLiteOrBuilder {
    private static final Common$SegmentedInput DEFAULT_INSTANCE;
    public static final int ID_FIELD_NUMBER = 1;
    public static final int LENGTH_FIELD_NUMBER = 3;
    private static volatile Parser<Common$SegmentedInput> PARSER = null;
    public static final int SIZE_FIELD_NUMBER = 4;
    public static final int TYPE_FIELD_NUMBER = 2;
    public static final int VALIDATION_FIELD_NUMBER = 5;
    private int bitField0_;
    private String id_ = "";
    private int length_;
    private int size_;
    private int type_;
    private Common$TextInputValidation validation_;

    public static final class a extends GeneratedMessageLite.Builder<Common$SegmentedInput, a> implements MessageLiteOrBuilder {
        public a() {
            super(Common$SegmentedInput.DEFAULT_INSTANCE);
        }
    }

    static {
        Common$SegmentedInput common$SegmentedInput = new Common$SegmentedInput();
        DEFAULT_INSTANCE = common$SegmentedInput;
        GeneratedMessageLite.registerDefaultInstance(Common$SegmentedInput.class, common$SegmentedInput);
    }

    private Common$SegmentedInput() {
    }

    private void clearId() {
        this.id_ = getDefaultInstance().getId();
    }

    private void clearLength() {
        this.length_ = 0;
    }

    private void clearSize() {
        this.size_ = 0;
    }

    private void clearType() {
        this.type_ = 0;
    }

    private void clearValidation() {
        this.validation_ = null;
        this.bitField0_ &= -2;
    }

    public static Common$SegmentedInput getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeValidation(Common$TextInputValidation common$TextInputValidation) {
        common$TextInputValidation.getClass();
        Common$TextInputValidation common$TextInputValidation2 = this.validation_;
        if (common$TextInputValidation2 != null && common$TextInputValidation2 != Common$TextInputValidation.getDefaultInstance()) {
            common$TextInputValidation = Common$TextInputValidation.newBuilder(this.validation_).mergeFrom((Common$TextInputValidation.a) common$TextInputValidation).buildPartial();
        }
        this.validation_ = common$TextInputValidation;
        this.bitField0_ |= 1;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$SegmentedInput parseDelimitedFrom(InputStream inputStream) {
        return (Common$SegmentedInput) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$SegmentedInput parseFrom(ByteString byteString) {
        return (Common$SegmentedInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Parser<Common$SegmentedInput> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setId(String str) {
        str.getClass();
        this.id_ = str;
    }

    private void setIdBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.id_ = byteString.toStringUtf8();
    }

    private void setLength(int i) {
        this.length_ = i;
    }

    private void setSize(b bVar) {
        this.size_ = bVar.getNumber();
    }

    private void setSizeValue(int i) {
        this.size_ = i;
    }

    private void setType(c cVar) {
        this.type_ = cVar.getNumber();
    }

    private void setTypeValue(int i) {
        this.type_ = i;
    }

    private void setValidation(Common$TextInputValidation common$TextInputValidation) {
        common$TextInputValidation.getClass();
        this.validation_ = common$TextInputValidation;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (C0127j.a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$SegmentedInput();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0005\u0000\u0001\u0001\u0005\u0005\u0000\u0000\u0000\u0001Ȉ\u0002\f\u0003\u000b\u0004\f\u0005ဉ\u0000", new Object[]{"bitField0_", "id_", "type_", "length_", "size_", "validation_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$SegmentedInput> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (Common$SegmentedInput.class) {
                    try {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return parser;
            case 6:
                return (byte) 1;
            default:
                OptionalProvider$$ExternalSyntheticLambda0.m();
            case 7:
                return null;
        }
    }

    public String getId() {
        return this.id_;
    }

    public ByteString getIdBytes() {
        return ByteString.copyFromUtf8(this.id_);
    }

    public int getLength() {
        return this.length_;
    }

    public b getSize() {
        b forNumber = b.forNumber(this.size_);
        return forNumber == null ? b.UNRECOGNIZED : forNumber;
    }

    public int getSizeValue() {
        return this.size_;
    }

    public c getType() {
        c forNumber = c.forNumber(this.type_);
        return forNumber == null ? c.UNRECOGNIZED : forNumber;
    }

    public int getTypeValue() {
        return this.type_;
    }

    public Common$TextInputValidation getValidation() {
        Common$TextInputValidation common$TextInputValidation = this.validation_;
        return common$TextInputValidation == null ? Common$TextInputValidation.getDefaultInstance() : common$TextInputValidation;
    }

    public boolean hasValidation() {
        return (this.bitField0_ & 1) != 0;
    }

    public enum b implements Internal.EnumLite {
        INPUT_SIZE_UNKNOWN(0),
        INPUT_SIZE_40(1),
        INPUT_SIZE_48(2),
        INPUT_SIZE_56(3),
        UNRECOGNIZED(-1);

        public static final int INPUT_SIZE_40_VALUE = 1;
        public static final int INPUT_SIZE_48_VALUE = 2;
        public static final int INPUT_SIZE_56_VALUE = 3;
        public static final int INPUT_SIZE_UNKNOWN_VALUE = 0;
        public static final a b = new a();
        public final int a;

        public class a implements Internal.EnumLiteMap<b> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final b findValueByNumber(int i) {
                return b.forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$SegmentedInput$b$b, reason: collision with other inner class name */
        public static final class C0041b implements Internal.EnumVerifier {
            public static final C0041b a = new C0041b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return b.forNumber(i) != null;
            }
        }

        b(int i) {
            this.a = i;
        }

        public static b forNumber(int i) {
            if (i == 0) {
                return INPUT_SIZE_UNKNOWN;
            }
            if (i == 1) {
                return INPUT_SIZE_40;
            }
            if (i == 2) {
                return INPUT_SIZE_48;
            }
            if (i != 3) {
                return null;
            }
            return INPUT_SIZE_56;
        }

        public static Internal.EnumLiteMap<b> internalGetValueMap() {
            return b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return C0041b.a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.a;
            }
            a$$ExternalSyntheticBUOutline0.m$3("Can't get the number of an unknown enum value.");
            return 0;
        }

        @Deprecated
        public static b valueOf(int i) {
            return forNumber(i);
        }
    }

    public enum c implements Internal.EnumLite {
        INPUT_TYPE_UNKNOWN(0),
        INPUT_TYPE_TEXT(1),
        INPUT_TYPE_NUMBER(2),
        INPUT_TYPE_PASSWORD(3),
        INPUT_TYPE_TELEPHONE(4),
        UNRECOGNIZED(-1);

        public static final int INPUT_TYPE_NUMBER_VALUE = 2;
        public static final int INPUT_TYPE_PASSWORD_VALUE = 3;
        public static final int INPUT_TYPE_TELEPHONE_VALUE = 4;
        public static final int INPUT_TYPE_TEXT_VALUE = 1;
        public static final int INPUT_TYPE_UNKNOWN_VALUE = 0;
        public static final a b = new a();
        public final int a;

        public class a implements Internal.EnumLiteMap<c> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final c findValueByNumber(int i) {
                return c.forNumber(i);
            }
        }

        public static final class b implements Internal.EnumVerifier {
            public static final b a = new b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return c.forNumber(i) != null;
            }
        }

        c(int i) {
            this.a = i;
        }

        public static c forNumber(int i) {
            if (i == 0) {
                return INPUT_TYPE_UNKNOWN;
            }
            if (i == 1) {
                return INPUT_TYPE_TEXT;
            }
            if (i == 2) {
                return INPUT_TYPE_NUMBER;
            }
            if (i == 3) {
                return INPUT_TYPE_PASSWORD;
            }
            if (i != 4) {
                return null;
            }
            return INPUT_TYPE_TELEPHONE;
        }

        public static Internal.EnumLiteMap<c> internalGetValueMap() {
            return b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.a;
            }
            a$$ExternalSyntheticBUOutline0.m$3("Can't get the number of an unknown enum value.");
            return 0;
        }

        @Deprecated
        public static c valueOf(int i) {
            return forNumber(i);
        }
    }

    public static a newBuilder(Common$SegmentedInput common$SegmentedInput) {
        return DEFAULT_INSTANCE.createBuilder(common$SegmentedInput);
    }

    public static Common$SegmentedInput parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$SegmentedInput) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$SegmentedInput parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$SegmentedInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$SegmentedInput parseFrom(CodedInputStream codedInputStream) {
        return (Common$SegmentedInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$SegmentedInput parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$SegmentedInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Common$SegmentedInput parseFrom(InputStream inputStream) {
        return (Common$SegmentedInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$SegmentedInput parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$SegmentedInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$SegmentedInput parseFrom(ByteBuffer byteBuffer) {
        return (Common$SegmentedInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Common$SegmentedInput parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$SegmentedInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$SegmentedInput parseFrom(byte[] bArr) {
        return (Common$SegmentedInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$SegmentedInput parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$SegmentedInput) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }
}
