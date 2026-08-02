package io.opentelemetry.proto2.common.v1;

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
import io.opentelemetry.proto2.common.v1.AnyValue;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class KeyValue extends GeneratedMessageLite implements KeyValueOrBuilder {
    private static final KeyValue DEFAULT_INSTANCE;
    public static final int KEY_FIELD_NUMBER = 1;
    private static volatile of90 PARSER = null;
    public static final int VALUE_FIELD_NUMBER = 2;
    private int bitField0_;
    private String key_ = "";
    private AnyValue value_;

    /* renamed from: io.opentelemetry.proto2.common.v1.KeyValue$1, reason: invalid class name */
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
        KeyValue keyValue = new KeyValue();
        DEFAULT_INSTANCE = keyValue;
        GeneratedMessageLite.registerDefaultInstance(KeyValue.class, keyValue);
    }

    private KeyValue() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearKey() {
        this.key_ = getDefaultInstance().getKey();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValue() {
        this.value_ = null;
        this.bitField0_ &= -2;
    }

    public static KeyValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeValue(AnyValue anyValue) {
        anyValue.getClass();
        AnyValue anyValue2 = this.value_;
        if (anyValue2 == null || anyValue2 == AnyValue.getDefaultInstance()) {
            this.value_ = anyValue;
        } else {
            this.value_ = (AnyValue) ((AnyValue.Builder) AnyValue.newBuilder(this.value_).mergeFrom((GeneratedMessageLite) anyValue)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static KeyValue parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (KeyValue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static KeyValue parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (KeyValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static of90 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKey(String str) {
        str.getClass();
        this.key_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setKeyBytes(ByteString byteString) {
        b.checkByteStringIsUtf8(byteString);
        this.key_ = byteString.r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValue(AnyValue anyValue) {
        anyValue.getClass();
        this.value_ = anyValue;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        of90 of90Var;
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new KeyValue();
            case 2:
                return new Builder(0);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0001\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002ဉ\u0000", new Object[]{"bitField0_", "key_", "value_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                of90 of90Var2 = PARSER;
                if (of90Var2 != null) {
                    return of90Var2;
                }
                synchronized (KeyValue.class) {
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

    @Override // io.opentelemetry.proto2.common.v1.KeyValueOrBuilder
    public String getKey() {
        return this.key_;
    }

    @Override // io.opentelemetry.proto2.common.v1.KeyValueOrBuilder
    public ByteString getKeyBytes() {
        return ByteString.g(this.key_);
    }

    @Override // io.opentelemetry.proto2.common.v1.KeyValueOrBuilder
    public AnyValue getValue() {
        AnyValue anyValue = this.value_;
        return anyValue == null ? AnyValue.getDefaultInstance() : anyValue;
    }

    @Override // io.opentelemetry.proto2.common.v1.KeyValueOrBuilder
    public boolean hasValue() {
        return (this.bitField0_ & 1) != 0;
    }

    public static final class Builder extends n implements KeyValueOrBuilder {
        private Builder() {
            super(KeyValue.DEFAULT_INSTANCE);
        }

        public Builder clearKey() {
            copyOnWrite();
            ((KeyValue) this.instance).clearKey();
            return this;
        }

        public Builder clearValue() {
            copyOnWrite();
            ((KeyValue) this.instance).clearValue();
            return this;
        }

        @Override // io.opentelemetry.proto2.common.v1.KeyValueOrBuilder
        public String getKey() {
            return ((KeyValue) this.instance).getKey();
        }

        @Override // io.opentelemetry.proto2.common.v1.KeyValueOrBuilder
        public ByteString getKeyBytes() {
            return ((KeyValue) this.instance).getKeyBytes();
        }

        @Override // io.opentelemetry.proto2.common.v1.KeyValueOrBuilder
        public AnyValue getValue() {
            return ((KeyValue) this.instance).getValue();
        }

        @Override // io.opentelemetry.proto2.common.v1.KeyValueOrBuilder
        public boolean hasValue() {
            return ((KeyValue) this.instance).hasValue();
        }

        public Builder mergeValue(AnyValue anyValue) {
            copyOnWrite();
            ((KeyValue) this.instance).mergeValue(anyValue);
            return this;
        }

        public Builder setKey(String str) {
            copyOnWrite();
            ((KeyValue) this.instance).setKey(str);
            return this;
        }

        public Builder setKeyBytes(ByteString byteString) {
            copyOnWrite();
            ((KeyValue) this.instance).setKeyBytes(byteString);
            return this;
        }

        public Builder setValue(AnyValue.Builder builder) {
            copyOnWrite();
            ((KeyValue) this.instance).setValue((AnyValue) builder.build());
            return this;
        }

        public /* synthetic */ Builder(int i) {
            this();
        }

        public Builder setValue(AnyValue anyValue) {
            copyOnWrite();
            ((KeyValue) this.instance).setValue(anyValue);
            return this;
        }
    }

    public static Builder newBuilder(KeyValue keyValue) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(keyValue);
    }

    public static KeyValue parseDelimitedFrom(InputStream inputStream, pyo pyoVar) throws IOException {
        return (KeyValue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
    }

    public static KeyValue parseFrom(ByteBuffer byteBuffer, pyo pyoVar) throws InvalidProtocolBufferException {
        return (KeyValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, pyoVar);
    }

    public static KeyValue parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (KeyValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static KeyValue parseFrom(ByteString byteString, pyo pyoVar) throws InvalidProtocolBufferException {
        return (KeyValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, pyoVar);
    }

    public static KeyValue parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (KeyValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static KeyValue parseFrom(byte[] bArr, pyo pyoVar) throws InvalidProtocolBufferException {
        return (KeyValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, pyoVar);
    }

    public static KeyValue parseFrom(InputStream inputStream) throws IOException {
        return (KeyValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static KeyValue parseFrom(InputStream inputStream, pyo pyoVar) throws IOException {
        return (KeyValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
    }

    public static KeyValue parseFrom(eac eacVar) throws IOException {
        return (KeyValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar);
    }

    public static KeyValue parseFrom(eac eacVar, pyo pyoVar) throws IOException {
        return (KeyValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar, pyoVar);
    }
}
