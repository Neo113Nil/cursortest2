package io.opentelemetry.proto2.common.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.b;
import com.google.protobuf.n;
import defpackage.eac;
import defpackage.of90;
import defpackage.oqw;
import defpackage.oxs;
import defpackage.p9;
import defpackage.pyo;
import defpackage.w511;
import io.opentelemetry.proto2.common.v1.AnyValue;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class ArrayValue extends GeneratedMessageLite implements ArrayValueOrBuilder {
    private static final ArrayValue DEFAULT_INSTANCE;
    private static volatile of90 PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private oqw values_ = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: io.opentelemetry.proto2.common.v1.ArrayValue$1, reason: invalid class name */
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
        ArrayValue arrayValue = new ArrayValue();
        DEFAULT_INSTANCE = arrayValue;
        GeneratedMessageLite.registerDefaultInstance(ArrayValue.class, arrayValue);
    }

    private ArrayValue() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllValues(Iterable<? extends AnyValue> iterable) {
        ensureValuesIsMutable();
        b.addAll(iterable, this.values_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addValues(AnyValue anyValue) {
        anyValue.getClass();
        ensureValuesIsMutable();
        this.values_.add(anyValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearValues() {
        this.values_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureValuesIsMutable() {
        oqw oqwVar = this.values_;
        if (((p9) oqwVar).a) {
            return;
        }
        this.values_ = GeneratedMessageLite.mutableCopy(oqwVar);
    }

    public static ArrayValue getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ArrayValue parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ArrayValue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ArrayValue parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ArrayValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static of90 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeValues(int i) {
        ensureValuesIsMutable();
        this.values_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setValues(int i, AnyValue anyValue) {
        anyValue.getClass();
        ensureValuesIsMutable();
        this.values_.set(i, anyValue);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        of90 of90Var;
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new ArrayValue();
            case 2:
                return new Builder(0);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"values_", AnyValue.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                of90 of90Var2 = PARSER;
                if (of90Var2 != null) {
                    return of90Var2;
                }
                synchronized (ArrayValue.class) {
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

    @Override // io.opentelemetry.proto2.common.v1.ArrayValueOrBuilder
    public AnyValue getValues(int i) {
        return (AnyValue) this.values_.get(i);
    }

    @Override // io.opentelemetry.proto2.common.v1.ArrayValueOrBuilder
    public int getValuesCount() {
        return this.values_.size();
    }

    @Override // io.opentelemetry.proto2.common.v1.ArrayValueOrBuilder
    public List<AnyValue> getValuesList() {
        return this.values_;
    }

    public AnyValueOrBuilder getValuesOrBuilder(int i) {
        return (AnyValueOrBuilder) this.values_.get(i);
    }

    public List<? extends AnyValueOrBuilder> getValuesOrBuilderList() {
        return this.values_;
    }

    public static final class Builder extends n implements ArrayValueOrBuilder {
        private Builder() {
            super(ArrayValue.DEFAULT_INSTANCE);
        }

        public Builder addAllValues(Iterable<? extends AnyValue> iterable) {
            copyOnWrite();
            ((ArrayValue) this.instance).addAllValues(iterable);
            return this;
        }

        public Builder addValues(AnyValue.Builder builder) {
            copyOnWrite();
            ((ArrayValue) this.instance).addValues((AnyValue) builder.build());
            return this;
        }

        public Builder clearValues() {
            copyOnWrite();
            ((ArrayValue) this.instance).clearValues();
            return this;
        }

        @Override // io.opentelemetry.proto2.common.v1.ArrayValueOrBuilder
        public AnyValue getValues(int i) {
            return ((ArrayValue) this.instance).getValues(i);
        }

        @Override // io.opentelemetry.proto2.common.v1.ArrayValueOrBuilder
        public int getValuesCount() {
            return ((ArrayValue) this.instance).getValuesCount();
        }

        @Override // io.opentelemetry.proto2.common.v1.ArrayValueOrBuilder
        public List<AnyValue> getValuesList() {
            return Collections.unmodifiableList(((ArrayValue) this.instance).getValuesList());
        }

        public Builder removeValues(int i) {
            copyOnWrite();
            ((ArrayValue) this.instance).removeValues(i);
            return this;
        }

        public Builder setValues(int i, AnyValue.Builder builder) {
            copyOnWrite();
            ((ArrayValue) this.instance).setValues(i, (AnyValue) builder.build());
            return this;
        }

        public /* synthetic */ Builder(int i) {
            this();
        }

        public Builder addValues(int i, AnyValue anyValue) {
            copyOnWrite();
            ((ArrayValue) this.instance).addValues(i, anyValue);
            return this;
        }

        public Builder setValues(int i, AnyValue anyValue) {
            copyOnWrite();
            ((ArrayValue) this.instance).setValues(i, anyValue);
            return this;
        }

        public Builder addValues(AnyValue anyValue) {
            copyOnWrite();
            ((ArrayValue) this.instance).addValues(anyValue);
            return this;
        }

        public Builder addValues(int i, AnyValue.Builder builder) {
            copyOnWrite();
            ((ArrayValue) this.instance).addValues(i, (AnyValue) builder.build());
            return this;
        }
    }

    public static Builder newBuilder(ArrayValue arrayValue) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(arrayValue);
    }

    public static ArrayValue parseDelimitedFrom(InputStream inputStream, pyo pyoVar) throws IOException {
        return (ArrayValue) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
    }

    public static ArrayValue parseFrom(ByteBuffer byteBuffer, pyo pyoVar) throws InvalidProtocolBufferException {
        return (ArrayValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, pyoVar);
    }

    public static ArrayValue parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ArrayValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ArrayValue parseFrom(ByteString byteString, pyo pyoVar) throws InvalidProtocolBufferException {
        return (ArrayValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, pyoVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addValues(int i, AnyValue anyValue) {
        anyValue.getClass();
        ensureValuesIsMutable();
        this.values_.add(i, anyValue);
    }

    public static ArrayValue parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ArrayValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ArrayValue parseFrom(byte[] bArr, pyo pyoVar) throws InvalidProtocolBufferException {
        return (ArrayValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, pyoVar);
    }

    public static ArrayValue parseFrom(InputStream inputStream) throws IOException {
        return (ArrayValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ArrayValue parseFrom(InputStream inputStream, pyo pyoVar) throws IOException {
        return (ArrayValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
    }

    public static ArrayValue parseFrom(eac eacVar) throws IOException {
        return (ArrayValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar);
    }

    public static ArrayValue parseFrom(eac eacVar, pyo pyoVar) throws IOException {
        return (ArrayValue) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar, pyoVar);
    }
}
