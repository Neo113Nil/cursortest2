package io.opentelemetry.proto.common.v1;

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
import io.opentelemetry.proto.common.v1.KeyValue;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class KeyValueList extends GeneratedMessageLite implements KeyValueListOrBuilder {
    private static final KeyValueList DEFAULT_INSTANCE;
    private static volatile of90 PARSER = null;
    public static final int VALUES_FIELD_NUMBER = 1;
    private oqw values_ = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: io.opentelemetry.proto.common.v1.KeyValueList$1, reason: invalid class name */
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
        KeyValueList keyValueList = new KeyValueList();
        DEFAULT_INSTANCE = keyValueList;
        GeneratedMessageLite.registerDefaultInstance(KeyValueList.class, keyValueList);
    }

    private KeyValueList() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllValues(Iterable<? extends KeyValue> iterable) {
        ensureValuesIsMutable();
        b.addAll(iterable, this.values_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addValues(KeyValue keyValue) {
        keyValue.getClass();
        ensureValuesIsMutable();
        this.values_.add(keyValue);
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

    public static KeyValueList getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static KeyValueList parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (KeyValueList) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static KeyValueList parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (KeyValueList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
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
    public void setValues(int i, KeyValue keyValue) {
        keyValue.getClass();
        ensureValuesIsMutable();
        this.values_.set(i, keyValue);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        of90 of90Var;
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new KeyValueList();
            case 2:
                return new Builder(0);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"values_", KeyValue.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                of90 of90Var2 = PARSER;
                if (of90Var2 != null) {
                    return of90Var2;
                }
                synchronized (KeyValueList.class) {
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

    @Override // io.opentelemetry.proto.common.v1.KeyValueListOrBuilder
    public KeyValue getValues(int i) {
        return (KeyValue) this.values_.get(i);
    }

    @Override // io.opentelemetry.proto.common.v1.KeyValueListOrBuilder
    public int getValuesCount() {
        return this.values_.size();
    }

    @Override // io.opentelemetry.proto.common.v1.KeyValueListOrBuilder
    public List<KeyValue> getValuesList() {
        return this.values_;
    }

    public KeyValueOrBuilder getValuesOrBuilder(int i) {
        return (KeyValueOrBuilder) this.values_.get(i);
    }

    public List<? extends KeyValueOrBuilder> getValuesOrBuilderList() {
        return this.values_;
    }

    public static final class Builder extends n implements KeyValueListOrBuilder {
        private Builder() {
            super(KeyValueList.DEFAULT_INSTANCE);
        }

        public Builder addAllValues(Iterable<? extends KeyValue> iterable) {
            copyOnWrite();
            ((KeyValueList) this.instance).addAllValues(iterable);
            return this;
        }

        public Builder addValues(KeyValue.Builder builder) {
            copyOnWrite();
            ((KeyValueList) this.instance).addValues((KeyValue) builder.build());
            return this;
        }

        public Builder clearValues() {
            copyOnWrite();
            ((KeyValueList) this.instance).clearValues();
            return this;
        }

        @Override // io.opentelemetry.proto.common.v1.KeyValueListOrBuilder
        public KeyValue getValues(int i) {
            return ((KeyValueList) this.instance).getValues(i);
        }

        @Override // io.opentelemetry.proto.common.v1.KeyValueListOrBuilder
        public int getValuesCount() {
            return ((KeyValueList) this.instance).getValuesCount();
        }

        @Override // io.opentelemetry.proto.common.v1.KeyValueListOrBuilder
        public List<KeyValue> getValuesList() {
            return Collections.unmodifiableList(((KeyValueList) this.instance).getValuesList());
        }

        public Builder removeValues(int i) {
            copyOnWrite();
            ((KeyValueList) this.instance).removeValues(i);
            return this;
        }

        public Builder setValues(int i, KeyValue.Builder builder) {
            copyOnWrite();
            ((KeyValueList) this.instance).setValues(i, (KeyValue) builder.build());
            return this;
        }

        public /* synthetic */ Builder(int i) {
            this();
        }

        public Builder addValues(int i, KeyValue keyValue) {
            copyOnWrite();
            ((KeyValueList) this.instance).addValues(i, keyValue);
            return this;
        }

        public Builder setValues(int i, KeyValue keyValue) {
            copyOnWrite();
            ((KeyValueList) this.instance).setValues(i, keyValue);
            return this;
        }

        public Builder addValues(KeyValue keyValue) {
            copyOnWrite();
            ((KeyValueList) this.instance).addValues(keyValue);
            return this;
        }

        public Builder addValues(int i, KeyValue.Builder builder) {
            copyOnWrite();
            ((KeyValueList) this.instance).addValues(i, (KeyValue) builder.build());
            return this;
        }
    }

    public static Builder newBuilder(KeyValueList keyValueList) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(keyValueList);
    }

    public static KeyValueList parseDelimitedFrom(InputStream inputStream, pyo pyoVar) throws IOException {
        return (KeyValueList) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
    }

    public static KeyValueList parseFrom(ByteBuffer byteBuffer, pyo pyoVar) throws InvalidProtocolBufferException {
        return (KeyValueList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, pyoVar);
    }

    public static KeyValueList parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (KeyValueList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static KeyValueList parseFrom(ByteString byteString, pyo pyoVar) throws InvalidProtocolBufferException {
        return (KeyValueList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, pyoVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addValues(int i, KeyValue keyValue) {
        keyValue.getClass();
        ensureValuesIsMutable();
        this.values_.add(i, keyValue);
    }

    public static KeyValueList parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (KeyValueList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static KeyValueList parseFrom(byte[] bArr, pyo pyoVar) throws InvalidProtocolBufferException {
        return (KeyValueList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, pyoVar);
    }

    public static KeyValueList parseFrom(InputStream inputStream) throws IOException {
        return (KeyValueList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static KeyValueList parseFrom(InputStream inputStream, pyo pyoVar) throws IOException {
        return (KeyValueList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
    }

    public static KeyValueList parseFrom(eac eacVar) throws IOException {
        return (KeyValueList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar);
    }

    public static KeyValueList parseFrom(eac eacVar, pyo pyoVar) throws IOException {
        return (KeyValueList) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar, pyoVar);
    }
}
