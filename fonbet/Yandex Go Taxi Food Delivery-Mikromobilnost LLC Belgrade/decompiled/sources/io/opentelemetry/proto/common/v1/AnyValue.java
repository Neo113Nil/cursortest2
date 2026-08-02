package io.opentelemetry.proto.common.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.b;
import com.google.protobuf.n;
import defpackage.eac;
import defpackage.of90;
import defpackage.oxs;
import defpackage.pyo;
import defpackage.w511;
import io.opentelemetry.proto.common.v1.ArrayValue;
import io.opentelemetry.proto.common.v1.KeyValueList;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class AnyValue extends GeneratedMessageLite implements AnyValueOrBuilder {
    public static final int ARRAY_VALUE_FIELD_NUMBER = 5;
    public static final int BOOL_VALUE_FIELD_NUMBER = 2;
    public static final int BYTES_VALUE_FIELD_NUMBER = 7;
    private static final AnyValue DEFAULT_INSTANCE;
    public static final int DOUBLE_VALUE_FIELD_NUMBER = 4;
    public static final int INT_VALUE_FIELD_NUMBER = 3;
    public static final int KVLIST_VALUE_FIELD_NUMBER = 6;
    private static volatile of90 PARSER = null;
    public static final int STRING_VALUE_FIELD_NUMBER = 1;
    private int valueCase_ = 0;
    private Object value_;

    /* renamed from: io.opentelemetry.proto.common.v1.AnyValue$1, reason: invalid class name */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke;

        static {
            int[] iArr = new int[GeneratedMessageLite.MethodToInvoke.values().length];
            $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke = iArr;
            try {
                iArr[GeneratedMessageLite.MethodToInvoke.NEW_MUTABLE_INSTANCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.NEW_BUILDER.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.BUILD_MESSAGE_INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_DEFAULT_INSTANCE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_PARSER.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.GET_MEMOIZED_IS_INITIALIZED.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                $SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[GeneratedMessageLite.MethodToInvoke.SET_MEMOIZED_IS_INITIALIZED.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    static {
        AnyValue anyValue = new AnyValue();
        DEFAULT_INSTANCE = anyValue;
        GeneratedMessageLite.registerDefaultInstance(AnyValue.class, anyValue);
    }

    private AnyValue() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearArrayValue() {
        if (this.valueCase_ == 5) {
            this.valueCase_ = 0;
            this.value_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBoolValue() {
        if (this.valueCase_ == 2) {
            this.valueCase_ = 0;
            this.value_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearBytesValue() {
        if (this.valueCase_ == 7) {
            this.valueCase_ = 0;
            this.value_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDoubleValue() {
        if (this.valueCase_ == 4) {
            this.valueCase_ = 0;
            this.value_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIntValue() {
        if (this.valueCase_ == 3) {
            this.valueCase_ = 0;
            this.value_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKvlistValue() {
        if (this.valueCase_ == 6) {
            this.valueCase_ = 0;
            this.value_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearStringValue() {
        if (this.valueCase_ == 1) {
            this.valueCase_ = 0;
            this.value_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.valueCase_ = 0;
        this.value_ = null;
    }

    public static AnyValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeArrayValue(ArrayValue arrayValue) {
        arrayValue.getClass();
        if (this.valueCase_ != 5 || this.value_ == ArrayValue.getDefaultInstance()) {
            this.value_ = arrayValue;
        } else {
            this.value_ = ((ArrayValue.Builder) ArrayValue.newBuilder((ArrayValue) this.value_).mergeFrom((GeneratedMessageLite) arrayValue)).buildPartial();
        }
        this.valueCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeKvlistValue(KeyValueList keyValueList) {
        keyValueList.getClass();
        if (this.valueCase_ != 6 || this.value_ == KeyValueList.getDefaultInstance()) {
            this.value_ = keyValueList;
        } else {
            this.value_ = ((KeyValueList.Builder) KeyValueList.newBuilder((KeyValueList) this.value_).mergeFrom((GeneratedMessageLite) keyValueList)).buildPartial();
        }
        this.valueCase_ = 6;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static AnyValue parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (AnyValue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AnyValue parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (AnyValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static of90 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setArrayValue(ArrayValue arrayValue) {
        arrayValue.getClass();
        this.value_ = arrayValue;
        this.valueCase_ = 5;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBoolValue(boolean z) {
        this.valueCase_ = 2;
        this.value_ = Boolean.valueOf(z);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setBytesValue(ByteString byteString) {
        byteString.getClass();
        this.valueCase_ = 7;
        this.value_ = byteString;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDoubleValue(double d) {
        this.valueCase_ = 4;
        this.value_ = Double.valueOf(d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIntValue(long j) {
        this.valueCase_ = 3;
        this.value_ = Long.valueOf(j);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKvlistValue(KeyValueList keyValueList) {
        keyValueList.getClass();
        this.value_ = keyValueList;
        this.valueCase_ = 6;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStringValue(String str) {
        str.getClass();
        this.valueCase_ = 1;
        this.value_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setStringValueBytes(ByteString byteString) {
        b.checkByteStringIsUtf8(byteString);
        this.value_ = byteString.r();
        this.valueCase_ = 1;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        of90 of90Var;
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new AnyValue();
            case 2:
                return new Builder(0);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0001\u0000\u0001\u0007\u0007\u0000\u0000\u0000\u0001Ȼ\u0000\u0002:\u0000\u00035\u0000\u00043\u0000\u0005<\u0000\u0006<\u0000\u0007=\u0000", new Object[]{"value_", "valueCase_", ArrayValue.class, KeyValueList.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                of90 of90Var2 = PARSER;
                if (of90Var2 != null) {
                    return of90Var2;
                }
                synchronized (AnyValue.class) {
                    try {
                        of90Var = PARSER;
                        if (of90Var == null) {
                            of90Var = new oxs();
                            PARSER = of90Var;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return of90Var;
            case 6:
                return (byte) 1;
            default:
                w511.u();
            case 7:
                return null;
        }
    }

    @Override // io.opentelemetry.proto.common.v1.AnyValueOrBuilder
    public ArrayValue getArrayValue() {
        return this.valueCase_ == 5 ? (ArrayValue) this.value_ : ArrayValue.getDefaultInstance();
    }

    @Override // io.opentelemetry.proto.common.v1.AnyValueOrBuilder
    public boolean getBoolValue() {
        if (this.valueCase_ == 2) {
            return ((Boolean) this.value_).booleanValue();
        }
        return false;
    }

    @Override // io.opentelemetry.proto.common.v1.AnyValueOrBuilder
    public ByteString getBytesValue() {
        return this.valueCase_ == 7 ? (ByteString) this.value_ : ByteString.a;
    }

    @Override // io.opentelemetry.proto.common.v1.AnyValueOrBuilder
    public double getDoubleValue() {
        if (this.valueCase_ == 4) {
            return ((Double) this.value_).doubleValue();
        }
        return 0.0d;
    }

    @Override // io.opentelemetry.proto.common.v1.AnyValueOrBuilder
    public long getIntValue() {
        if (this.valueCase_ == 3) {
            return ((Long) this.value_).longValue();
        }
        return 0L;
    }

    @Override // io.opentelemetry.proto.common.v1.AnyValueOrBuilder
    public KeyValueList getKvlistValue() {
        return this.valueCase_ == 6 ? (KeyValueList) this.value_ : KeyValueList.getDefaultInstance();
    }

    @Override // io.opentelemetry.proto.common.v1.AnyValueOrBuilder
    public String getStringValue() {
        return this.valueCase_ == 1 ? (String) this.value_ : "";
    }

    @Override // io.opentelemetry.proto.common.v1.AnyValueOrBuilder
    public ByteString getStringValueBytes() {
        return ByteString.g(this.valueCase_ == 1 ? (String) this.value_ : "");
    }

    @Override // io.opentelemetry.proto.common.v1.AnyValueOrBuilder
    public ValueCase getValueCase() {
        return ValueCase.forNumber(this.valueCase_);
    }

    @Override // io.opentelemetry.proto.common.v1.AnyValueOrBuilder
    public boolean hasArrayValue() {
        return this.valueCase_ == 5;
    }

    @Override // io.opentelemetry.proto.common.v1.AnyValueOrBuilder
    public boolean hasBoolValue() {
        return this.valueCase_ == 2;
    }

    @Override // io.opentelemetry.proto.common.v1.AnyValueOrBuilder
    public boolean hasBytesValue() {
        return this.valueCase_ == 7;
    }

    @Override // io.opentelemetry.proto.common.v1.AnyValueOrBuilder
    public boolean hasDoubleValue() {
        return this.valueCase_ == 4;
    }

    @Override // io.opentelemetry.proto.common.v1.AnyValueOrBuilder
    public boolean hasIntValue() {
        return this.valueCase_ == 3;
    }

    @Override // io.opentelemetry.proto.common.v1.AnyValueOrBuilder
    public boolean hasKvlistValue() {
        return this.valueCase_ == 6;
    }

    @Override // io.opentelemetry.proto.common.v1.AnyValueOrBuilder
    public boolean hasStringValue() {
        return this.valueCase_ == 1;
    }

    public static final class Builder extends n implements AnyValueOrBuilder {
        private Builder() {
            super(AnyValue.DEFAULT_INSTANCE);
        }

        public Builder clearArrayValue() {
            copyOnWrite();
            ((AnyValue) this.instance).clearArrayValue();
            return this;
        }

        public Builder clearBoolValue() {
            copyOnWrite();
            ((AnyValue) this.instance).clearBoolValue();
            return this;
        }

        public Builder clearBytesValue() {
            copyOnWrite();
            ((AnyValue) this.instance).clearBytesValue();
            return this;
        }

        public Builder clearDoubleValue() {
            copyOnWrite();
            ((AnyValue) this.instance).clearDoubleValue();
            return this;
        }

        public Builder clearIntValue() {
            copyOnWrite();
            ((AnyValue) this.instance).clearIntValue();
            return this;
        }

        public Builder clearKvlistValue() {
            copyOnWrite();
            ((AnyValue) this.instance).clearKvlistValue();
            return this;
        }

        public Builder clearStringValue() {
            copyOnWrite();
            ((AnyValue) this.instance).clearStringValue();
            return this;
        }

        public Builder clearValue() {
            copyOnWrite();
            ((AnyValue) this.instance).clearValue();
            return this;
        }

        @Override // io.opentelemetry.proto.common.v1.AnyValueOrBuilder
        public ArrayValue getArrayValue() {
            return ((AnyValue) this.instance).getArrayValue();
        }

        @Override // io.opentelemetry.proto.common.v1.AnyValueOrBuilder
        public boolean getBoolValue() {
            return ((AnyValue) this.instance).getBoolValue();
        }

        @Override // io.opentelemetry.proto.common.v1.AnyValueOrBuilder
        public ByteString getBytesValue() {
            return ((AnyValue) this.instance).getBytesValue();
        }

        @Override // io.opentelemetry.proto.common.v1.AnyValueOrBuilder
        public double getDoubleValue() {
            return ((AnyValue) this.instance).getDoubleValue();
        }

        @Override // io.opentelemetry.proto.common.v1.AnyValueOrBuilder
        public long getIntValue() {
            return ((AnyValue) this.instance).getIntValue();
        }

        @Override // io.opentelemetry.proto.common.v1.AnyValueOrBuilder
        public KeyValueList getKvlistValue() {
            return ((AnyValue) this.instance).getKvlistValue();
        }

        @Override // io.opentelemetry.proto.common.v1.AnyValueOrBuilder
        public String getStringValue() {
            return ((AnyValue) this.instance).getStringValue();
        }

        @Override // io.opentelemetry.proto.common.v1.AnyValueOrBuilder
        public ByteString getStringValueBytes() {
            return ((AnyValue) this.instance).getStringValueBytes();
        }

        @Override // io.opentelemetry.proto.common.v1.AnyValueOrBuilder
        public ValueCase getValueCase() {
            return ((AnyValue) this.instance).getValueCase();
        }

        @Override // io.opentelemetry.proto.common.v1.AnyValueOrBuilder
        public boolean hasArrayValue() {
            return ((AnyValue) this.instance).hasArrayValue();
        }

        @Override // io.opentelemetry.proto.common.v1.AnyValueOrBuilder
        public boolean hasBoolValue() {
            return ((AnyValue) this.instance).hasBoolValue();
        }

        @Override // io.opentelemetry.proto.common.v1.AnyValueOrBuilder
        public boolean hasBytesValue() {
            return ((AnyValue) this.instance).hasBytesValue();
        }

        @Override // io.opentelemetry.proto.common.v1.AnyValueOrBuilder
        public boolean hasDoubleValue() {
            return ((AnyValue) this.instance).hasDoubleValue();
        }

        @Override // io.opentelemetry.proto.common.v1.AnyValueOrBuilder
        public boolean hasIntValue() {
            return ((AnyValue) this.instance).hasIntValue();
        }

        @Override // io.opentelemetry.proto.common.v1.AnyValueOrBuilder
        public boolean hasKvlistValue() {
            return ((AnyValue) this.instance).hasKvlistValue();
        }

        @Override // io.opentelemetry.proto.common.v1.AnyValueOrBuilder
        public boolean hasStringValue() {
            return ((AnyValue) this.instance).hasStringValue();
        }

        public Builder mergeArrayValue(ArrayValue arrayValue) {
            copyOnWrite();
            ((AnyValue) this.instance).mergeArrayValue(arrayValue);
            return this;
        }

        public Builder mergeKvlistValue(KeyValueList keyValueList) {
            copyOnWrite();
            ((AnyValue) this.instance).mergeKvlistValue(keyValueList);
            return this;
        }

        public Builder setArrayValue(ArrayValue.Builder builder) {
            copyOnWrite();
            ((AnyValue) this.instance).setArrayValue((ArrayValue) builder.build());
            return this;
        }

        public Builder setBoolValue(boolean z) {
            copyOnWrite();
            ((AnyValue) this.instance).setBoolValue(z);
            return this;
        }

        public Builder setBytesValue(ByteString byteString) {
            copyOnWrite();
            ((AnyValue) this.instance).setBytesValue(byteString);
            return this;
        }

        public Builder setDoubleValue(double d) {
            copyOnWrite();
            ((AnyValue) this.instance).setDoubleValue(d);
            return this;
        }

        public Builder setIntValue(long j) {
            copyOnWrite();
            ((AnyValue) this.instance).setIntValue(j);
            return this;
        }

        public Builder setKvlistValue(KeyValueList.Builder builder) {
            copyOnWrite();
            ((AnyValue) this.instance).setKvlistValue((KeyValueList) builder.build());
            return this;
        }

        public Builder setStringValue(String str) {
            copyOnWrite();
            ((AnyValue) this.instance).setStringValue(str);
            return this;
        }

        public Builder setStringValueBytes(ByteString byteString) {
            copyOnWrite();
            ((AnyValue) this.instance).setStringValueBytes(byteString);
            return this;
        }

        public /* synthetic */ Builder(int i) {
            this();
        }

        public Builder setArrayValue(ArrayValue arrayValue) {
            copyOnWrite();
            ((AnyValue) this.instance).setArrayValue(arrayValue);
            return this;
        }

        public Builder setKvlistValue(KeyValueList keyValueList) {
            copyOnWrite();
            ((AnyValue) this.instance).setKvlistValue(keyValueList);
            return this;
        }
    }

    public enum ValueCase {
        STRING_VALUE(1),
        BOOL_VALUE(2),
        INT_VALUE(3),
        DOUBLE_VALUE(4),
        ARRAY_VALUE(5),
        KVLIST_VALUE(6),
        BYTES_VALUE(7),
        VALUE_NOT_SET(0);

        private final int value;

        ValueCase(int i) {
            this.value = i;
        }

        public static ValueCase forNumber(int i) {
            switch (i) {
                case 0:
                    return VALUE_NOT_SET;
                case 1:
                    return STRING_VALUE;
                case 2:
                    return BOOL_VALUE;
                case 3:
                    return INT_VALUE;
                case 4:
                    return DOUBLE_VALUE;
                case 5:
                    return ARRAY_VALUE;
                case 6:
                    return KVLIST_VALUE;
                case 7:
                    return BYTES_VALUE;
                default:
                    return null;
            }
        }

        public int getNumber() {
            return this.value;
        }

        @Deprecated
        public static ValueCase valueOf(int i) {
            return forNumber(i);
        }
    }

    public static Builder newBuilder(AnyValue anyValue) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(anyValue);
    }

    public static AnyValue parseDelimitedFrom(InputStream inputStream, pyo pyoVar) throws IOException {
        return (AnyValue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
    }

    public static AnyValue parseFrom(ByteBuffer byteBuffer, pyo pyoVar) throws InvalidProtocolBufferException {
        return (AnyValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, pyoVar);
    }

    public static AnyValue parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (AnyValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static AnyValue parseFrom(ByteString byteString, pyo pyoVar) throws InvalidProtocolBufferException {
        return (AnyValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, pyoVar);
    }

    public static AnyValue parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (AnyValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static AnyValue parseFrom(byte[] bArr, pyo pyoVar) throws InvalidProtocolBufferException {
        return (AnyValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, pyoVar);
    }

    public static AnyValue parseFrom(InputStream inputStream) throws IOException {
        return (AnyValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static AnyValue parseFrom(InputStream inputStream, pyo pyoVar) throws IOException {
        return (AnyValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
    }

    public static AnyValue parseFrom(eac eacVar) throws IOException {
        return (AnyValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar);
    }

    public static AnyValue parseFrom(eac eacVar, pyo pyoVar) throws IOException {
        return (AnyValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar, pyoVar);
    }
}
