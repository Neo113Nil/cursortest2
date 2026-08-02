package io.opentelemetry.proto.trace.v1;

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
import io.opentelemetry.proto.common.v1.InstrumentationScope;
import io.opentelemetry.proto.trace.v1.Span;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class ScopeSpans extends GeneratedMessageLite implements ScopeSpansOrBuilder {
    private static final ScopeSpans DEFAULT_INSTANCE;
    private static volatile of90 PARSER = null;
    public static final int SCHEMA_URL_FIELD_NUMBER = 3;
    public static final int SCOPE_FIELD_NUMBER = 1;
    public static final int SPANS_FIELD_NUMBER = 2;
    private int bitField0_;
    private InstrumentationScope scope_;
    private oqw spans_ = GeneratedMessageLite.emptyProtobufList();
    private String schemaUrl_ = "";

    /* renamed from: io.opentelemetry.proto.trace.v1.ScopeSpans$1, reason: invalid class name */
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
        ScopeSpans scopeSpans = new ScopeSpans();
        DEFAULT_INSTANCE = scopeSpans;
        GeneratedMessageLite.registerDefaultInstance(ScopeSpans.class, scopeSpans);
    }

    private ScopeSpans() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllSpans(Iterable<? extends Span> iterable) {
        ensureSpansIsMutable();
        b.addAll(iterable, this.spans_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSpans(Span span) {
        span.getClass();
        ensureSpansIsMutable();
        this.spans_.add(span);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSchemaUrl() {
        this.schemaUrl_ = getDefaultInstance().getSchemaUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScope() {
        this.scope_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSpans() {
        this.spans_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureSpansIsMutable() {
        oqw oqwVar = this.spans_;
        if (((p9) oqwVar).a) {
            return;
        }
        this.spans_ = GeneratedMessageLite.mutableCopy(oqwVar);
    }

    public static ScopeSpans getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeScope(InstrumentationScope instrumentationScope) {
        instrumentationScope.getClass();
        InstrumentationScope instrumentationScope2 = this.scope_;
        if (instrumentationScope2 == null || instrumentationScope2 == InstrumentationScope.getDefaultInstance()) {
            this.scope_ = instrumentationScope;
        } else {
            this.scope_ = (InstrumentationScope) ((InstrumentationScope.Builder) InstrumentationScope.newBuilder(this.scope_).mergeFrom((GeneratedMessageLite) instrumentationScope)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ScopeSpans parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ScopeSpans) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ScopeSpans parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ScopeSpans) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static of90 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeSpans(int i) {
        ensureSpansIsMutable();
        this.spans_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSchemaUrl(String str) {
        str.getClass();
        this.schemaUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSchemaUrlBytes(ByteString byteString) {
        b.checkByteStringIsUtf8(byteString);
        this.schemaUrl_ = byteString.r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setScope(InstrumentationScope instrumentationScope) {
        instrumentationScope.getClass();
        this.scope_ = instrumentationScope;
        this.bitField0_ |= 1;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSpans(int i, Span span) {
        span.getClass();
        ensureSpansIsMutable();
        this.spans_.set(i, span);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        of90 of90Var;
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new ScopeSpans();
            case 2:
                return new Builder(0);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003Ȉ", new Object[]{"bitField0_", "scope_", "spans_", Span.class, "schemaUrl_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                of90 of90Var2 = PARSER;
                if (of90Var2 != null) {
                    return of90Var2;
                }
                synchronized (ScopeSpans.class) {
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

    @Override // io.opentelemetry.proto.trace.v1.ScopeSpansOrBuilder
    public String getSchemaUrl() {
        return this.schemaUrl_;
    }

    @Override // io.opentelemetry.proto.trace.v1.ScopeSpansOrBuilder
    public ByteString getSchemaUrlBytes() {
        return ByteString.g(this.schemaUrl_);
    }

    @Override // io.opentelemetry.proto.trace.v1.ScopeSpansOrBuilder
    public InstrumentationScope getScope() {
        InstrumentationScope instrumentationScope = this.scope_;
        return instrumentationScope == null ? InstrumentationScope.getDefaultInstance() : instrumentationScope;
    }

    @Override // io.opentelemetry.proto.trace.v1.ScopeSpansOrBuilder
    public Span getSpans(int i) {
        return (Span) this.spans_.get(i);
    }

    @Override // io.opentelemetry.proto.trace.v1.ScopeSpansOrBuilder
    public int getSpansCount() {
        return this.spans_.size();
    }

    @Override // io.opentelemetry.proto.trace.v1.ScopeSpansOrBuilder
    public List<Span> getSpansList() {
        return this.spans_;
    }

    public SpanOrBuilder getSpansOrBuilder(int i) {
        return (SpanOrBuilder) this.spans_.get(i);
    }

    public List<? extends SpanOrBuilder> getSpansOrBuilderList() {
        return this.spans_;
    }

    @Override // io.opentelemetry.proto.trace.v1.ScopeSpansOrBuilder
    public boolean hasScope() {
        return (this.bitField0_ & 1) != 0;
    }

    public static final class Builder extends n implements ScopeSpansOrBuilder {
        private Builder() {
            super(ScopeSpans.DEFAULT_INSTANCE);
        }

        public Builder addAllSpans(Iterable<? extends Span> iterable) {
            copyOnWrite();
            ((ScopeSpans) this.instance).addAllSpans(iterable);
            return this;
        }

        public Builder addSpans(Span.Builder builder) {
            copyOnWrite();
            ((ScopeSpans) this.instance).addSpans((Span) builder.build());
            return this;
        }

        public Builder clearSchemaUrl() {
            copyOnWrite();
            ((ScopeSpans) this.instance).clearSchemaUrl();
            return this;
        }

        public Builder clearScope() {
            copyOnWrite();
            ((ScopeSpans) this.instance).clearScope();
            return this;
        }

        public Builder clearSpans() {
            copyOnWrite();
            ((ScopeSpans) this.instance).clearSpans();
            return this;
        }

        @Override // io.opentelemetry.proto.trace.v1.ScopeSpansOrBuilder
        public String getSchemaUrl() {
            return ((ScopeSpans) this.instance).getSchemaUrl();
        }

        @Override // io.opentelemetry.proto.trace.v1.ScopeSpansOrBuilder
        public ByteString getSchemaUrlBytes() {
            return ((ScopeSpans) this.instance).getSchemaUrlBytes();
        }

        @Override // io.opentelemetry.proto.trace.v1.ScopeSpansOrBuilder
        public InstrumentationScope getScope() {
            return ((ScopeSpans) this.instance).getScope();
        }

        @Override // io.opentelemetry.proto.trace.v1.ScopeSpansOrBuilder
        public Span getSpans(int i) {
            return ((ScopeSpans) this.instance).getSpans(i);
        }

        @Override // io.opentelemetry.proto.trace.v1.ScopeSpansOrBuilder
        public int getSpansCount() {
            return ((ScopeSpans) this.instance).getSpansCount();
        }

        @Override // io.opentelemetry.proto.trace.v1.ScopeSpansOrBuilder
        public List<Span> getSpansList() {
            return Collections.unmodifiableList(((ScopeSpans) this.instance).getSpansList());
        }

        @Override // io.opentelemetry.proto.trace.v1.ScopeSpansOrBuilder
        public boolean hasScope() {
            return ((ScopeSpans) this.instance).hasScope();
        }

        public Builder mergeScope(InstrumentationScope instrumentationScope) {
            copyOnWrite();
            ((ScopeSpans) this.instance).mergeScope(instrumentationScope);
            return this;
        }

        public Builder removeSpans(int i) {
            copyOnWrite();
            ((ScopeSpans) this.instance).removeSpans(i);
            return this;
        }

        public Builder setSchemaUrl(String str) {
            copyOnWrite();
            ((ScopeSpans) this.instance).setSchemaUrl(str);
            return this;
        }

        public Builder setSchemaUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((ScopeSpans) this.instance).setSchemaUrlBytes(byteString);
            return this;
        }

        public Builder setScope(InstrumentationScope.Builder builder) {
            copyOnWrite();
            ((ScopeSpans) this.instance).setScope((InstrumentationScope) builder.build());
            return this;
        }

        public Builder setSpans(int i, Span.Builder builder) {
            copyOnWrite();
            ((ScopeSpans) this.instance).setSpans(i, (Span) builder.build());
            return this;
        }

        public /* synthetic */ Builder(int i) {
            this();
        }

        public Builder addSpans(int i, Span span) {
            copyOnWrite();
            ((ScopeSpans) this.instance).addSpans(i, span);
            return this;
        }

        public Builder setScope(InstrumentationScope instrumentationScope) {
            copyOnWrite();
            ((ScopeSpans) this.instance).setScope(instrumentationScope);
            return this;
        }

        public Builder setSpans(int i, Span span) {
            copyOnWrite();
            ((ScopeSpans) this.instance).setSpans(i, span);
            return this;
        }

        public Builder addSpans(Span span) {
            copyOnWrite();
            ((ScopeSpans) this.instance).addSpans(span);
            return this;
        }

        public Builder addSpans(int i, Span.Builder builder) {
            copyOnWrite();
            ((ScopeSpans) this.instance).addSpans(i, (Span) builder.build());
            return this;
        }
    }

    public static Builder newBuilder(ScopeSpans scopeSpans) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(scopeSpans);
    }

    public static ScopeSpans parseDelimitedFrom(InputStream inputStream, pyo pyoVar) throws IOException {
        return (ScopeSpans) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
    }

    public static ScopeSpans parseFrom(ByteBuffer byteBuffer, pyo pyoVar) throws InvalidProtocolBufferException {
        return (ScopeSpans) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, pyoVar);
    }

    public static ScopeSpans parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ScopeSpans) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ScopeSpans parseFrom(ByteString byteString, pyo pyoVar) throws InvalidProtocolBufferException {
        return (ScopeSpans) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, pyoVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addSpans(int i, Span span) {
        span.getClass();
        ensureSpansIsMutable();
        this.spans_.add(i, span);
    }

    public static ScopeSpans parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ScopeSpans) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ScopeSpans parseFrom(byte[] bArr, pyo pyoVar) throws InvalidProtocolBufferException {
        return (ScopeSpans) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, pyoVar);
    }

    public static ScopeSpans parseFrom(InputStream inputStream) throws IOException {
        return (ScopeSpans) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ScopeSpans parseFrom(InputStream inputStream, pyo pyoVar) throws IOException {
        return (ScopeSpans) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
    }

    public static ScopeSpans parseFrom(eac eacVar) throws IOException {
        return (ScopeSpans) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar);
    }

    public static ScopeSpans parseFrom(eac eacVar, pyo pyoVar) throws IOException {
        return (ScopeSpans) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar, pyoVar);
    }
}
