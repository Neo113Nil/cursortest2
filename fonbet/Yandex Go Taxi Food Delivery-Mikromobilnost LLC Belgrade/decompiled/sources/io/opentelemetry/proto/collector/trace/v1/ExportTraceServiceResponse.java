package io.opentelemetry.proto.collector.trace.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.n;
import defpackage.eac;
import defpackage.of90;
import defpackage.oxs;
import defpackage.pyo;
import defpackage.w511;
import io.opentelemetry.proto.collector.trace.v1.ExportTracePartialSuccess;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class ExportTraceServiceResponse extends GeneratedMessageLite implements ExportTraceServiceResponseOrBuilder {
    private static final ExportTraceServiceResponse DEFAULT_INSTANCE;
    private static volatile of90 PARSER = null;
    public static final int PARTIAL_SUCCESS_FIELD_NUMBER = 1;
    private int bitField0_;
    private ExportTracePartialSuccess partialSuccess_;

    /* renamed from: io.opentelemetry.proto.collector.trace.v1.ExportTraceServiceResponse$1, reason: invalid class name */
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
        ExportTraceServiceResponse exportTraceServiceResponse = new ExportTraceServiceResponse();
        DEFAULT_INSTANCE = exportTraceServiceResponse;
        GeneratedMessageLite.registerDefaultInstance(ExportTraceServiceResponse.class, exportTraceServiceResponse);
    }

    private ExportTraceServiceResponse() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPartialSuccess() {
        this.partialSuccess_ = null;
        this.bitField0_ &= -2;
    }

    public static ExportTraceServiceResponse getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergePartialSuccess(ExportTracePartialSuccess exportTracePartialSuccess) {
        exportTracePartialSuccess.getClass();
        ExportTracePartialSuccess exportTracePartialSuccess2 = this.partialSuccess_;
        if (exportTracePartialSuccess2 == null || exportTracePartialSuccess2 == ExportTracePartialSuccess.getDefaultInstance()) {
            this.partialSuccess_ = exportTracePartialSuccess;
        } else {
            this.partialSuccess_ = (ExportTracePartialSuccess) ((ExportTracePartialSuccess.Builder) ExportTracePartialSuccess.newBuilder(this.partialSuccess_).mergeFrom((GeneratedMessageLite) exportTracePartialSuccess)).buildPartial();
        }
        this.bitField0_ |= 1;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ExportTraceServiceResponse parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ExportTraceServiceResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ExportTraceServiceResponse parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ExportTraceServiceResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static of90 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPartialSuccess(ExportTracePartialSuccess exportTracePartialSuccess) {
        exportTracePartialSuccess.getClass();
        this.partialSuccess_ = exportTracePartialSuccess;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        of90 of90Var;
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new ExportTraceServiceResponse();
            case 2:
                return new Builder(0);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "partialSuccess_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                of90 of90Var2 = PARSER;
                if (of90Var2 != null) {
                    return of90Var2;
                }
                synchronized (ExportTraceServiceResponse.class) {
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

    @Override // io.opentelemetry.proto.collector.trace.v1.ExportTraceServiceResponseOrBuilder
    public ExportTracePartialSuccess getPartialSuccess() {
        ExportTracePartialSuccess exportTracePartialSuccess = this.partialSuccess_;
        return exportTracePartialSuccess == null ? ExportTracePartialSuccess.getDefaultInstance() : exportTracePartialSuccess;
    }

    @Override // io.opentelemetry.proto.collector.trace.v1.ExportTraceServiceResponseOrBuilder
    public boolean hasPartialSuccess() {
        return (this.bitField0_ & 1) != 0;
    }

    public static final class Builder extends n implements ExportTraceServiceResponseOrBuilder {
        private Builder() {
            super(ExportTraceServiceResponse.DEFAULT_INSTANCE);
        }

        public Builder clearPartialSuccess() {
            copyOnWrite();
            ((ExportTraceServiceResponse) this.instance).clearPartialSuccess();
            return this;
        }

        @Override // io.opentelemetry.proto.collector.trace.v1.ExportTraceServiceResponseOrBuilder
        public ExportTracePartialSuccess getPartialSuccess() {
            return ((ExportTraceServiceResponse) this.instance).getPartialSuccess();
        }

        @Override // io.opentelemetry.proto.collector.trace.v1.ExportTraceServiceResponseOrBuilder
        public boolean hasPartialSuccess() {
            return ((ExportTraceServiceResponse) this.instance).hasPartialSuccess();
        }

        public Builder mergePartialSuccess(ExportTracePartialSuccess exportTracePartialSuccess) {
            copyOnWrite();
            ((ExportTraceServiceResponse) this.instance).mergePartialSuccess(exportTracePartialSuccess);
            return this;
        }

        public Builder setPartialSuccess(ExportTracePartialSuccess.Builder builder) {
            copyOnWrite();
            ((ExportTraceServiceResponse) this.instance).setPartialSuccess((ExportTracePartialSuccess) builder.build());
            return this;
        }

        public /* synthetic */ Builder(int i) {
            this();
        }

        public Builder setPartialSuccess(ExportTracePartialSuccess exportTracePartialSuccess) {
            copyOnWrite();
            ((ExportTraceServiceResponse) this.instance).setPartialSuccess(exportTracePartialSuccess);
            return this;
        }
    }

    public static Builder newBuilder(ExportTraceServiceResponse exportTraceServiceResponse) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(exportTraceServiceResponse);
    }

    public static ExportTraceServiceResponse parseDelimitedFrom(InputStream inputStream, pyo pyoVar) throws IOException {
        return (ExportTraceServiceResponse) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
    }

    public static ExportTraceServiceResponse parseFrom(ByteBuffer byteBuffer, pyo pyoVar) throws InvalidProtocolBufferException {
        return (ExportTraceServiceResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, pyoVar);
    }

    public static ExportTraceServiceResponse parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ExportTraceServiceResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ExportTraceServiceResponse parseFrom(ByteString byteString, pyo pyoVar) throws InvalidProtocolBufferException {
        return (ExportTraceServiceResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, pyoVar);
    }

    public static ExportTraceServiceResponse parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ExportTraceServiceResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ExportTraceServiceResponse parseFrom(byte[] bArr, pyo pyoVar) throws InvalidProtocolBufferException {
        return (ExportTraceServiceResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, pyoVar);
    }

    public static ExportTraceServiceResponse parseFrom(InputStream inputStream) throws IOException {
        return (ExportTraceServiceResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ExportTraceServiceResponse parseFrom(InputStream inputStream, pyo pyoVar) throws IOException {
        return (ExportTraceServiceResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
    }

    public static ExportTraceServiceResponse parseFrom(eac eacVar) throws IOException {
        return (ExportTraceServiceResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar);
    }

    public static ExportTraceServiceResponse parseFrom(eac eacVar, pyo pyoVar) throws IOException {
        return (ExportTraceServiceResponse) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar, pyoVar);
    }
}
