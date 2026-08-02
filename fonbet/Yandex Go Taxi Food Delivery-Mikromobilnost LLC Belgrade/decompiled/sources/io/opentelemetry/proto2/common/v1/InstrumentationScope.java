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
import io.opentelemetry.proto2.common.v1.KeyValue;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class InstrumentationScope extends GeneratedMessageLite implements InstrumentationScopeOrBuilder {
    public static final int ATTRIBUTES_FIELD_NUMBER = 3;
    private static final InstrumentationScope DEFAULT_INSTANCE;
    public static final int DROPPED_ATTRIBUTES_COUNT_FIELD_NUMBER = 4;
    public static final int NAME_FIELD_NUMBER = 1;
    private static volatile of90 PARSER = null;
    public static final int VERSION_FIELD_NUMBER = 2;
    private int droppedAttributesCount_;
    private String name_ = "";
    private String version_ = "";
    private oqw attributes_ = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: io.opentelemetry.proto2.common.v1.InstrumentationScope$1, reason: invalid class name */
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
        InstrumentationScope instrumentationScope = new InstrumentationScope();
        DEFAULT_INSTANCE = instrumentationScope;
        GeneratedMessageLite.registerDefaultInstance(InstrumentationScope.class, instrumentationScope);
    }

    private InstrumentationScope() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAttributes(Iterable<? extends KeyValue> iterable) {
        ensureAttributesIsMutable();
        b.addAll(iterable, this.attributes_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAttributes(KeyValue keyValue) {
        keyValue.getClass();
        ensureAttributesIsMutable();
        this.attributes_.add(keyValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAttributes() {
        this.attributes_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDroppedAttributesCount() {
        this.droppedAttributesCount_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearName() {
        this.name_ = getDefaultInstance().getName();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearVersion() {
        this.version_ = getDefaultInstance().getVersion();
    }

    private void ensureAttributesIsMutable() {
        oqw oqwVar = this.attributes_;
        if (((p9) oqwVar).a) {
            return;
        }
        this.attributes_ = GeneratedMessageLite.mutableCopy(oqwVar);
    }

    public static InstrumentationScope getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static InstrumentationScope parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (InstrumentationScope) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static InstrumentationScope parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (InstrumentationScope) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static of90 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAttributes(int i) {
        ensureAttributesIsMutable();
        this.attributes_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAttributes(int i, KeyValue keyValue) {
        keyValue.getClass();
        ensureAttributesIsMutable();
        this.attributes_.set(i, keyValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDroppedAttributesCount(int i) {
        this.droppedAttributesCount_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setName(String str) {
        str.getClass();
        this.name_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setNameBytes(ByteString byteString) {
        b.checkByteStringIsUtf8(byteString);
        this.name_ = byteString.r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersion(String str) {
        str.getClass();
        this.version_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setVersionBytes(ByteString byteString) {
        b.checkByteStringIsUtf8(byteString);
        this.version_ = byteString.r();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        of90 of90Var;
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new InstrumentationScope();
            case 2:
                return new Builder(0);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0001\u0000\u0001Ȉ\u0002Ȉ\u0003\u001b\u0004\u000b", new Object[]{"name_", "version_", "attributes_", KeyValue.class, "droppedAttributesCount_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                of90 of90Var2 = PARSER;
                if (of90Var2 != null) {
                    return of90Var2;
                }
                synchronized (InstrumentationScope.class) {
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

    @Override // io.opentelemetry.proto2.common.v1.InstrumentationScopeOrBuilder
    public KeyValue getAttributes(int i) {
        return (KeyValue) this.attributes_.get(i);
    }

    @Override // io.opentelemetry.proto2.common.v1.InstrumentationScopeOrBuilder
    public int getAttributesCount() {
        return this.attributes_.size();
    }

    @Override // io.opentelemetry.proto2.common.v1.InstrumentationScopeOrBuilder
    public List<KeyValue> getAttributesList() {
        return this.attributes_;
    }

    public KeyValueOrBuilder getAttributesOrBuilder(int i) {
        return (KeyValueOrBuilder) this.attributes_.get(i);
    }

    public List<? extends KeyValueOrBuilder> getAttributesOrBuilderList() {
        return this.attributes_;
    }

    @Override // io.opentelemetry.proto2.common.v1.InstrumentationScopeOrBuilder
    public int getDroppedAttributesCount() {
        return this.droppedAttributesCount_;
    }

    @Override // io.opentelemetry.proto2.common.v1.InstrumentationScopeOrBuilder
    public String getName() {
        return this.name_;
    }

    @Override // io.opentelemetry.proto2.common.v1.InstrumentationScopeOrBuilder
    public ByteString getNameBytes() {
        return ByteString.g(this.name_);
    }

    @Override // io.opentelemetry.proto2.common.v1.InstrumentationScopeOrBuilder
    public String getVersion() {
        return this.version_;
    }

    @Override // io.opentelemetry.proto2.common.v1.InstrumentationScopeOrBuilder
    public ByteString getVersionBytes() {
        return ByteString.g(this.version_);
    }

    public static final class Builder extends n implements InstrumentationScopeOrBuilder {
        private Builder() {
            super(InstrumentationScope.DEFAULT_INSTANCE);
        }

        public Builder addAllAttributes(Iterable<? extends KeyValue> iterable) {
            copyOnWrite();
            ((InstrumentationScope) this.instance).addAllAttributes(iterable);
            return this;
        }

        public Builder addAttributes(KeyValue.Builder builder) {
            copyOnWrite();
            ((InstrumentationScope) this.instance).addAttributes((KeyValue) builder.build());
            return this;
        }

        public Builder clearAttributes() {
            copyOnWrite();
            ((InstrumentationScope) this.instance).clearAttributes();
            return this;
        }

        public Builder clearDroppedAttributesCount() {
            copyOnWrite();
            ((InstrumentationScope) this.instance).clearDroppedAttributesCount();
            return this;
        }

        public Builder clearName() {
            copyOnWrite();
            ((InstrumentationScope) this.instance).clearName();
            return this;
        }

        public Builder clearVersion() {
            copyOnWrite();
            ((InstrumentationScope) this.instance).clearVersion();
            return this;
        }

        @Override // io.opentelemetry.proto2.common.v1.InstrumentationScopeOrBuilder
        public KeyValue getAttributes(int i) {
            return ((InstrumentationScope) this.instance).getAttributes(i);
        }

        @Override // io.opentelemetry.proto2.common.v1.InstrumentationScopeOrBuilder
        public int getAttributesCount() {
            return ((InstrumentationScope) this.instance).getAttributesCount();
        }

        @Override // io.opentelemetry.proto2.common.v1.InstrumentationScopeOrBuilder
        public List<KeyValue> getAttributesList() {
            return Collections.unmodifiableList(((InstrumentationScope) this.instance).getAttributesList());
        }

        @Override // io.opentelemetry.proto2.common.v1.InstrumentationScopeOrBuilder
        public int getDroppedAttributesCount() {
            return ((InstrumentationScope) this.instance).getDroppedAttributesCount();
        }

        @Override // io.opentelemetry.proto2.common.v1.InstrumentationScopeOrBuilder
        public String getName() {
            return ((InstrumentationScope) this.instance).getName();
        }

        @Override // io.opentelemetry.proto2.common.v1.InstrumentationScopeOrBuilder
        public ByteString getNameBytes() {
            return ((InstrumentationScope) this.instance).getNameBytes();
        }

        @Override // io.opentelemetry.proto2.common.v1.InstrumentationScopeOrBuilder
        public String getVersion() {
            return ((InstrumentationScope) this.instance).getVersion();
        }

        @Override // io.opentelemetry.proto2.common.v1.InstrumentationScopeOrBuilder
        public ByteString getVersionBytes() {
            return ((InstrumentationScope) this.instance).getVersionBytes();
        }

        public Builder removeAttributes(int i) {
            copyOnWrite();
            ((InstrumentationScope) this.instance).removeAttributes(i);
            return this;
        }

        public Builder setAttributes(int i, KeyValue.Builder builder) {
            copyOnWrite();
            ((InstrumentationScope) this.instance).setAttributes(i, (KeyValue) builder.build());
            return this;
        }

        public Builder setDroppedAttributesCount(int i) {
            copyOnWrite();
            ((InstrumentationScope) this.instance).setDroppedAttributesCount(i);
            return this;
        }

        public Builder setName(String str) {
            copyOnWrite();
            ((InstrumentationScope) this.instance).setName(str);
            return this;
        }

        public Builder setNameBytes(ByteString byteString) {
            copyOnWrite();
            ((InstrumentationScope) this.instance).setNameBytes(byteString);
            return this;
        }

        public Builder setVersion(String str) {
            copyOnWrite();
            ((InstrumentationScope) this.instance).setVersion(str);
            return this;
        }

        public Builder setVersionBytes(ByteString byteString) {
            copyOnWrite();
            ((InstrumentationScope) this.instance).setVersionBytes(byteString);
            return this;
        }

        public /* synthetic */ Builder(int i) {
            this();
        }

        public Builder addAttributes(int i, KeyValue keyValue) {
            copyOnWrite();
            ((InstrumentationScope) this.instance).addAttributes(i, keyValue);
            return this;
        }

        public Builder setAttributes(int i, KeyValue keyValue) {
            copyOnWrite();
            ((InstrumentationScope) this.instance).setAttributes(i, keyValue);
            return this;
        }

        public Builder addAttributes(KeyValue keyValue) {
            copyOnWrite();
            ((InstrumentationScope) this.instance).addAttributes(keyValue);
            return this;
        }

        public Builder addAttributes(int i, KeyValue.Builder builder) {
            copyOnWrite();
            ((InstrumentationScope) this.instance).addAttributes(i, (KeyValue) builder.build());
            return this;
        }
    }

    public static Builder newBuilder(InstrumentationScope instrumentationScope) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(instrumentationScope);
    }

    public static InstrumentationScope parseDelimitedFrom(InputStream inputStream, pyo pyoVar) throws IOException {
        return (InstrumentationScope) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
    }

    public static InstrumentationScope parseFrom(ByteBuffer byteBuffer, pyo pyoVar) throws InvalidProtocolBufferException {
        return (InstrumentationScope) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, pyoVar);
    }

    public static InstrumentationScope parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (InstrumentationScope) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static InstrumentationScope parseFrom(ByteString byteString, pyo pyoVar) throws InvalidProtocolBufferException {
        return (InstrumentationScope) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, pyoVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAttributes(int i, KeyValue keyValue) {
        keyValue.getClass();
        ensureAttributesIsMutable();
        this.attributes_.add(i, keyValue);
    }

    public static InstrumentationScope parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (InstrumentationScope) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static InstrumentationScope parseFrom(byte[] bArr, pyo pyoVar) throws InvalidProtocolBufferException {
        return (InstrumentationScope) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, pyoVar);
    }

    public static InstrumentationScope parseFrom(InputStream inputStream) throws IOException {
        return (InstrumentationScope) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static InstrumentationScope parseFrom(InputStream inputStream, pyo pyoVar) throws IOException {
        return (InstrumentationScope) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
    }

    public static InstrumentationScope parseFrom(eac eacVar) throws IOException {
        return (InstrumentationScope) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar);
    }

    public static InstrumentationScope parseFrom(eac eacVar, pyo pyoVar) throws IOException {
        return (InstrumentationScope) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar, pyoVar);
    }
}
