package io.opentelemetry.proto2.collector.trace.v1;

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
import io.opentelemetry.proto2.trace.v1.ResourceSpans;
import io.opentelemetry.proto2.trace.v1.ResourceSpansOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class ExportTraceServiceRequest extends GeneratedMessageLite implements ExportTraceServiceRequestOrBuilder {
    private static final ExportTraceServiceRequest DEFAULT_INSTANCE;
    private static volatile of90 PARSER = null;
    public static final int RESOURCE_SPANS_FIELD_NUMBER = 1;
    private oqw resourceSpans_ = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: io.opentelemetry.proto2.collector.trace.v1.ExportTraceServiceRequest$1, reason: invalid class name */
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
        ExportTraceServiceRequest exportTraceServiceRequest = new ExportTraceServiceRequest();
        DEFAULT_INSTANCE = exportTraceServiceRequest;
        GeneratedMessageLite.registerDefaultInstance(ExportTraceServiceRequest.class, exportTraceServiceRequest);
    }

    private ExportTraceServiceRequest() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllResourceSpans(Iterable<? extends ResourceSpans> iterable) {
        ensureResourceSpansIsMutable();
        b.addAll(iterable, this.resourceSpans_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addResourceSpans(ResourceSpans resourceSpans) {
        resourceSpans.getClass();
        ensureResourceSpansIsMutable();
        this.resourceSpans_.add(resourceSpans);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearResourceSpans() {
        this.resourceSpans_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureResourceSpansIsMutable() {
        oqw oqwVar = this.resourceSpans_;
        if (((p9) oqwVar).a) {
            return;
        }
        this.resourceSpans_ = GeneratedMessageLite.mutableCopy(oqwVar);
    }

    public static ExportTraceServiceRequest getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ExportTraceServiceRequest parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ExportTraceServiceRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ExportTraceServiceRequest parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ExportTraceServiceRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static of90 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeResourceSpans(int i) {
        ensureResourceSpansIsMutable();
        this.resourceSpans_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setResourceSpans(int i, ResourceSpans resourceSpans) {
        resourceSpans.getClass();
        ensureResourceSpansIsMutable();
        this.resourceSpans_.set(i, resourceSpans);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        of90 of90Var;
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new ExportTraceServiceRequest();
            case 2:
                return new Builder(0);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0000\u0001\u0001\u0001\u0000\u0001\u0000\u0001\u001b", new Object[]{"resourceSpans_", ResourceSpans.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                of90 of90Var2 = PARSER;
                if (of90Var2 != null) {
                    return of90Var2;
                }
                synchronized (ExportTraceServiceRequest.class) {
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

    @Override // io.opentelemetry.proto2.collector.trace.v1.ExportTraceServiceRequestOrBuilder
    public ResourceSpans getResourceSpans(int i) {
        return (ResourceSpans) this.resourceSpans_.get(i);
    }

    @Override // io.opentelemetry.proto2.collector.trace.v1.ExportTraceServiceRequestOrBuilder
    public int getResourceSpansCount() {
        return this.resourceSpans_.size();
    }

    @Override // io.opentelemetry.proto2.collector.trace.v1.ExportTraceServiceRequestOrBuilder
    public List<ResourceSpans> getResourceSpansList() {
        return this.resourceSpans_;
    }

    public ResourceSpansOrBuilder getResourceSpansOrBuilder(int i) {
        return (ResourceSpansOrBuilder) this.resourceSpans_.get(i);
    }

    public List<? extends ResourceSpansOrBuilder> getResourceSpansOrBuilderList() {
        return this.resourceSpans_;
    }

    public static final class Builder extends n implements ExportTraceServiceRequestOrBuilder {
        private Builder() {
            super(ExportTraceServiceRequest.DEFAULT_INSTANCE);
        }

        public Builder addAllResourceSpans(Iterable<? extends ResourceSpans> iterable) {
            copyOnWrite();
            ((ExportTraceServiceRequest) this.instance).addAllResourceSpans(iterable);
            return this;
        }

        public Builder addResourceSpans(ResourceSpans.Builder builder) {
            copyOnWrite();
            ((ExportTraceServiceRequest) this.instance).addResourceSpans((ResourceSpans) builder.build());
            return this;
        }

        public Builder clearResourceSpans() {
            copyOnWrite();
            ((ExportTraceServiceRequest) this.instance).clearResourceSpans();
            return this;
        }

        @Override // io.opentelemetry.proto2.collector.trace.v1.ExportTraceServiceRequestOrBuilder
        public ResourceSpans getResourceSpans(int i) {
            return ((ExportTraceServiceRequest) this.instance).getResourceSpans(i);
        }

        @Override // io.opentelemetry.proto2.collector.trace.v1.ExportTraceServiceRequestOrBuilder
        public int getResourceSpansCount() {
            return ((ExportTraceServiceRequest) this.instance).getResourceSpansCount();
        }

        @Override // io.opentelemetry.proto2.collector.trace.v1.ExportTraceServiceRequestOrBuilder
        public List<ResourceSpans> getResourceSpansList() {
            return Collections.unmodifiableList(((ExportTraceServiceRequest) this.instance).getResourceSpansList());
        }

        public Builder removeResourceSpans(int i) {
            copyOnWrite();
            ((ExportTraceServiceRequest) this.instance).removeResourceSpans(i);
            return this;
        }

        public Builder setResourceSpans(int i, ResourceSpans.Builder builder) {
            copyOnWrite();
            ((ExportTraceServiceRequest) this.instance).setResourceSpans(i, (ResourceSpans) builder.build());
            return this;
        }

        public /* synthetic */ Builder(int i) {
            this();
        }

        public Builder addResourceSpans(int i, ResourceSpans resourceSpans) {
            copyOnWrite();
            ((ExportTraceServiceRequest) this.instance).addResourceSpans(i, resourceSpans);
            return this;
        }

        public Builder setResourceSpans(int i, ResourceSpans resourceSpans) {
            copyOnWrite();
            ((ExportTraceServiceRequest) this.instance).setResourceSpans(i, resourceSpans);
            return this;
        }

        public Builder addResourceSpans(ResourceSpans resourceSpans) {
            copyOnWrite();
            ((ExportTraceServiceRequest) this.instance).addResourceSpans(resourceSpans);
            return this;
        }

        public Builder addResourceSpans(int i, ResourceSpans.Builder builder) {
            copyOnWrite();
            ((ExportTraceServiceRequest) this.instance).addResourceSpans(i, (ResourceSpans) builder.build());
            return this;
        }
    }

    public static Builder newBuilder(ExportTraceServiceRequest exportTraceServiceRequest) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(exportTraceServiceRequest);
    }

    public static ExportTraceServiceRequest parseDelimitedFrom(InputStream inputStream, pyo pyoVar) throws IOException {
        return (ExportTraceServiceRequest) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
    }

    public static ExportTraceServiceRequest parseFrom(ByteBuffer byteBuffer, pyo pyoVar) throws InvalidProtocolBufferException {
        return (ExportTraceServiceRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, pyoVar);
    }

    public static ExportTraceServiceRequest parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ExportTraceServiceRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ExportTraceServiceRequest parseFrom(ByteString byteString, pyo pyoVar) throws InvalidProtocolBufferException {
        return (ExportTraceServiceRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, pyoVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addResourceSpans(int i, ResourceSpans resourceSpans) {
        resourceSpans.getClass();
        ensureResourceSpansIsMutable();
        this.resourceSpans_.add(i, resourceSpans);
    }

    public static ExportTraceServiceRequest parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ExportTraceServiceRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ExportTraceServiceRequest parseFrom(byte[] bArr, pyo pyoVar) throws InvalidProtocolBufferException {
        return (ExportTraceServiceRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, pyoVar);
    }

    public static ExportTraceServiceRequest parseFrom(InputStream inputStream) throws IOException {
        return (ExportTraceServiceRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ExportTraceServiceRequest parseFrom(InputStream inputStream, pyo pyoVar) throws IOException {
        return (ExportTraceServiceRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
    }

    public static ExportTraceServiceRequest parseFrom(eac eacVar) throws IOException {
        return (ExportTraceServiceRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar);
    }

    public static ExportTraceServiceRequest parseFrom(eac eacVar, pyo pyoVar) throws IOException {
        return (ExportTraceServiceRequest) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar, pyoVar);
    }
}
