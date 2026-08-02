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
import io.opentelemetry.proto.resource.v1.Resource;
import io.opentelemetry.proto.trace.v1.ScopeSpans;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class ResourceSpans extends GeneratedMessageLite implements ResourceSpansOrBuilder {
    private static final ResourceSpans DEFAULT_INSTANCE;
    private static volatile of90 PARSER = null;
    public static final int RESOURCE_FIELD_NUMBER = 1;
    public static final int SCHEMA_URL_FIELD_NUMBER = 3;
    public static final int SCOPE_SPANS_FIELD_NUMBER = 2;
    private int bitField0_;
    private Resource resource_;
    private oqw scopeSpans_ = GeneratedMessageLite.emptyProtobufList();
    private String schemaUrl_ = "";

    /* renamed from: io.opentelemetry.proto.trace.v1.ResourceSpans$1, reason: invalid class name */
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
        ResourceSpans resourceSpans = new ResourceSpans();
        DEFAULT_INSTANCE = resourceSpans;
        GeneratedMessageLite.registerDefaultInstance(ResourceSpans.class, resourceSpans);
    }

    private ResourceSpans() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllScopeSpans(Iterable<? extends ScopeSpans> iterable) {
        ensureScopeSpansIsMutable();
        b.addAll(iterable, this.scopeSpans_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addScopeSpans(ScopeSpans scopeSpans) {
        scopeSpans.getClass();
        ensureScopeSpansIsMutable();
        this.scopeSpans_.add(scopeSpans);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResource() {
        this.resource_ = null;
        this.bitField0_ &= -2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSchemaUrl() {
        this.schemaUrl_ = getDefaultInstance().getSchemaUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearScopeSpans() {
        this.scopeSpans_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureScopeSpansIsMutable() {
        oqw oqwVar = this.scopeSpans_;
        if (((p9) oqwVar).a) {
            return;
        }
        this.scopeSpans_ = GeneratedMessageLite.mutableCopy(oqwVar);
    }

    public static ResourceSpans getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeResource(Resource resource) {
        resource.getClass();
        Resource resource2 = this.resource_;
        if (resource2 == null || resource2 == Resource.getDefaultInstance()) {
            this.resource_ = resource;
        } else {
            this.resource_ = (Resource) ((Resource.Builder) Resource.newBuilder(this.resource_).mergeFrom((GeneratedMessageLite) resource)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ResourceSpans parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ResourceSpans) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ResourceSpans parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ResourceSpans) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static of90 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeScopeSpans(int i) {
        ensureScopeSpansIsMutable();
        this.scopeSpans_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResource(Resource resource) {
        resource.getClass();
        this.resource_ = resource;
        this.bitField0_ |= 1;
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
    public void setScopeSpans(int i, ScopeSpans scopeSpans) {
        scopeSpans.getClass();
        ensureScopeSpansIsMutable();
        this.scopeSpans_.set(i, scopeSpans);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        of90 of90Var;
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new ResourceSpans();
            case 2:
                return new Builder(0);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0001\u0001\u0003\u0003\u0000\u0001\u0000\u0001ဉ\u0000\u0002\u001b\u0003Ȉ", new Object[]{"bitField0_", "resource_", "scopeSpans_", ScopeSpans.class, "schemaUrl_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                of90 of90Var2 = PARSER;
                if (of90Var2 != null) {
                    return of90Var2;
                }
                synchronized (ResourceSpans.class) {
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

    @Override // io.opentelemetry.proto.trace.v1.ResourceSpansOrBuilder
    public Resource getResource() {
        Resource resource = this.resource_;
        return resource == null ? Resource.getDefaultInstance() : resource;
    }

    @Override // io.opentelemetry.proto.trace.v1.ResourceSpansOrBuilder
    public String getSchemaUrl() {
        return this.schemaUrl_;
    }

    @Override // io.opentelemetry.proto.trace.v1.ResourceSpansOrBuilder
    public ByteString getSchemaUrlBytes() {
        return ByteString.g(this.schemaUrl_);
    }

    @Override // io.opentelemetry.proto.trace.v1.ResourceSpansOrBuilder
    public ScopeSpans getScopeSpans(int i) {
        return (ScopeSpans) this.scopeSpans_.get(i);
    }

    @Override // io.opentelemetry.proto.trace.v1.ResourceSpansOrBuilder
    public int getScopeSpansCount() {
        return this.scopeSpans_.size();
    }

    @Override // io.opentelemetry.proto.trace.v1.ResourceSpansOrBuilder
    public List<ScopeSpans> getScopeSpansList() {
        return this.scopeSpans_;
    }

    public ScopeSpansOrBuilder getScopeSpansOrBuilder(int i) {
        return (ScopeSpansOrBuilder) this.scopeSpans_.get(i);
    }

    public List<? extends ScopeSpansOrBuilder> getScopeSpansOrBuilderList() {
        return this.scopeSpans_;
    }

    @Override // io.opentelemetry.proto.trace.v1.ResourceSpansOrBuilder
    public boolean hasResource() {
        return (this.bitField0_ & 1) != 0;
    }

    public static final class Builder extends n implements ResourceSpansOrBuilder {
        private Builder() {
            super(ResourceSpans.DEFAULT_INSTANCE);
        }

        public Builder addAllScopeSpans(Iterable<? extends ScopeSpans> iterable) {
            copyOnWrite();
            ((ResourceSpans) this.instance).addAllScopeSpans(iterable);
            return this;
        }

        public Builder addScopeSpans(ScopeSpans.Builder builder) {
            copyOnWrite();
            ((ResourceSpans) this.instance).addScopeSpans((ScopeSpans) builder.build());
            return this;
        }

        public Builder clearResource() {
            copyOnWrite();
            ((ResourceSpans) this.instance).clearResource();
            return this;
        }

        public Builder clearSchemaUrl() {
            copyOnWrite();
            ((ResourceSpans) this.instance).clearSchemaUrl();
            return this;
        }

        public Builder clearScopeSpans() {
            copyOnWrite();
            ((ResourceSpans) this.instance).clearScopeSpans();
            return this;
        }

        @Override // io.opentelemetry.proto.trace.v1.ResourceSpansOrBuilder
        public Resource getResource() {
            return ((ResourceSpans) this.instance).getResource();
        }

        @Override // io.opentelemetry.proto.trace.v1.ResourceSpansOrBuilder
        public String getSchemaUrl() {
            return ((ResourceSpans) this.instance).getSchemaUrl();
        }

        @Override // io.opentelemetry.proto.trace.v1.ResourceSpansOrBuilder
        public ByteString getSchemaUrlBytes() {
            return ((ResourceSpans) this.instance).getSchemaUrlBytes();
        }

        @Override // io.opentelemetry.proto.trace.v1.ResourceSpansOrBuilder
        public ScopeSpans getScopeSpans(int i) {
            return ((ResourceSpans) this.instance).getScopeSpans(i);
        }

        @Override // io.opentelemetry.proto.trace.v1.ResourceSpansOrBuilder
        public int getScopeSpansCount() {
            return ((ResourceSpans) this.instance).getScopeSpansCount();
        }

        @Override // io.opentelemetry.proto.trace.v1.ResourceSpansOrBuilder
        public List<ScopeSpans> getScopeSpansList() {
            return Collections.unmodifiableList(((ResourceSpans) this.instance).getScopeSpansList());
        }

        @Override // io.opentelemetry.proto.trace.v1.ResourceSpansOrBuilder
        public boolean hasResource() {
            return ((ResourceSpans) this.instance).hasResource();
        }

        public Builder mergeResource(Resource resource) {
            copyOnWrite();
            ((ResourceSpans) this.instance).mergeResource(resource);
            return this;
        }

        public Builder removeScopeSpans(int i) {
            copyOnWrite();
            ((ResourceSpans) this.instance).removeScopeSpans(i);
            return this;
        }

        public Builder setResource(Resource.Builder builder) {
            copyOnWrite();
            ((ResourceSpans) this.instance).setResource((Resource) builder.build());
            return this;
        }

        public Builder setSchemaUrl(String str) {
            copyOnWrite();
            ((ResourceSpans) this.instance).setSchemaUrl(str);
            return this;
        }

        public Builder setSchemaUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((ResourceSpans) this.instance).setSchemaUrlBytes(byteString);
            return this;
        }

        public Builder setScopeSpans(int i, ScopeSpans.Builder builder) {
            copyOnWrite();
            ((ResourceSpans) this.instance).setScopeSpans(i, (ScopeSpans) builder.build());
            return this;
        }

        public /* synthetic */ Builder(int i) {
            this();
        }

        public Builder addScopeSpans(int i, ScopeSpans scopeSpans) {
            copyOnWrite();
            ((ResourceSpans) this.instance).addScopeSpans(i, scopeSpans);
            return this;
        }

        public Builder setResource(Resource resource) {
            copyOnWrite();
            ((ResourceSpans) this.instance).setResource(resource);
            return this;
        }

        public Builder setScopeSpans(int i, ScopeSpans scopeSpans) {
            copyOnWrite();
            ((ResourceSpans) this.instance).setScopeSpans(i, scopeSpans);
            return this;
        }

        public Builder addScopeSpans(ScopeSpans scopeSpans) {
            copyOnWrite();
            ((ResourceSpans) this.instance).addScopeSpans(scopeSpans);
            return this;
        }

        public Builder addScopeSpans(int i, ScopeSpans.Builder builder) {
            copyOnWrite();
            ((ResourceSpans) this.instance).addScopeSpans(i, (ScopeSpans) builder.build());
            return this;
        }
    }

    public static Builder newBuilder(ResourceSpans resourceSpans) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(resourceSpans);
    }

    public static ResourceSpans parseDelimitedFrom(InputStream inputStream, pyo pyoVar) throws IOException {
        return (ResourceSpans) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
    }

    public static ResourceSpans parseFrom(ByteBuffer byteBuffer, pyo pyoVar) throws InvalidProtocolBufferException {
        return (ResourceSpans) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, pyoVar);
    }

    public static ResourceSpans parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ResourceSpans) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ResourceSpans parseFrom(ByteString byteString, pyo pyoVar) throws InvalidProtocolBufferException {
        return (ResourceSpans) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, pyoVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addScopeSpans(int i, ScopeSpans scopeSpans) {
        scopeSpans.getClass();
        ensureScopeSpansIsMutable();
        this.scopeSpans_.add(i, scopeSpans);
    }

    public static ResourceSpans parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ResourceSpans) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ResourceSpans parseFrom(byte[] bArr, pyo pyoVar) throws InvalidProtocolBufferException {
        return (ResourceSpans) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, pyoVar);
    }

    public static ResourceSpans parseFrom(InputStream inputStream) throws IOException {
        return (ResourceSpans) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ResourceSpans parseFrom(InputStream inputStream, pyo pyoVar) throws IOException {
        return (ResourceSpans) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
    }

    public static ResourceSpans parseFrom(eac eacVar) throws IOException {
        return (ResourceSpans) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar);
    }

    public static ResourceSpans parseFrom(eac eacVar, pyo pyoVar) throws IOException {
        return (ResourceSpans) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar, pyoVar);
    }
}
