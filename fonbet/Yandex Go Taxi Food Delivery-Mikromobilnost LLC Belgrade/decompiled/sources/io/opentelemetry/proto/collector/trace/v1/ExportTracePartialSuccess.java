package io.opentelemetry.proto.collector.trace.v1;

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
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class ExportTracePartialSuccess extends GeneratedMessageLite implements ExportTracePartialSuccessOrBuilder {
    private static final ExportTracePartialSuccess DEFAULT_INSTANCE;
    public static final int ERROR_MESSAGE_FIELD_NUMBER = 2;
    private static volatile of90 PARSER = null;
    public static final int REJECTED_SPANS_FIELD_NUMBER = 1;
    private String errorMessage_ = "";
    private long rejectedSpans_;

    /* renamed from: io.opentelemetry.proto.collector.trace.v1.ExportTracePartialSuccess$1, reason: invalid class name */
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
        ExportTracePartialSuccess exportTracePartialSuccess = new ExportTracePartialSuccess();
        DEFAULT_INSTANCE = exportTracePartialSuccess;
        GeneratedMessageLite.registerDefaultInstance(ExportTracePartialSuccess.class, exportTracePartialSuccess);
    }

    private ExportTracePartialSuccess() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearErrorMessage() {
        this.errorMessage_ = getDefaultInstance().getErrorMessage();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearRejectedSpans() {
        this.rejectedSpans_ = 0L;
    }

    public static ExportTracePartialSuccess getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static ExportTracePartialSuccess parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (ExportTracePartialSuccess) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ExportTracePartialSuccess parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (ExportTracePartialSuccess) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static of90 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorMessage(String str) {
        str.getClass();
        this.errorMessage_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setErrorMessageBytes(ByteString byteString) {
        b.checkByteStringIsUtf8(byteString);
        this.errorMessage_ = byteString.r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setRejectedSpans(long j) {
        this.rejectedSpans_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        of90 of90Var;
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new ExportTracePartialSuccess();
            case 2:
                return new Builder(0);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001\u0002\u0002Ȉ", new Object[]{"rejectedSpans_", "errorMessage_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                of90 of90Var2 = PARSER;
                if (of90Var2 != null) {
                    return of90Var2;
                }
                synchronized (ExportTracePartialSuccess.class) {
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

    @Override // io.opentelemetry.proto.collector.trace.v1.ExportTracePartialSuccessOrBuilder
    public String getErrorMessage() {
        return this.errorMessage_;
    }

    @Override // io.opentelemetry.proto.collector.trace.v1.ExportTracePartialSuccessOrBuilder
    public ByteString getErrorMessageBytes() {
        return ByteString.g(this.errorMessage_);
    }

    @Override // io.opentelemetry.proto.collector.trace.v1.ExportTracePartialSuccessOrBuilder
    public long getRejectedSpans() {
        return this.rejectedSpans_;
    }

    public static final class Builder extends n implements ExportTracePartialSuccessOrBuilder {
        private Builder() {
            super(ExportTracePartialSuccess.DEFAULT_INSTANCE);
        }

        public Builder clearErrorMessage() {
            copyOnWrite();
            ((ExportTracePartialSuccess) this.instance).clearErrorMessage();
            return this;
        }

        public Builder clearRejectedSpans() {
            copyOnWrite();
            ((ExportTracePartialSuccess) this.instance).clearRejectedSpans();
            return this;
        }

        @Override // io.opentelemetry.proto.collector.trace.v1.ExportTracePartialSuccessOrBuilder
        public String getErrorMessage() {
            return ((ExportTracePartialSuccess) this.instance).getErrorMessage();
        }

        @Override // io.opentelemetry.proto.collector.trace.v1.ExportTracePartialSuccessOrBuilder
        public ByteString getErrorMessageBytes() {
            return ((ExportTracePartialSuccess) this.instance).getErrorMessageBytes();
        }

        @Override // io.opentelemetry.proto.collector.trace.v1.ExportTracePartialSuccessOrBuilder
        public long getRejectedSpans() {
            return ((ExportTracePartialSuccess) this.instance).getRejectedSpans();
        }

        public Builder setErrorMessage(String str) {
            copyOnWrite();
            ((ExportTracePartialSuccess) this.instance).setErrorMessage(str);
            return this;
        }

        public Builder setErrorMessageBytes(ByteString byteString) {
            copyOnWrite();
            ((ExportTracePartialSuccess) this.instance).setErrorMessageBytes(byteString);
            return this;
        }

        public Builder setRejectedSpans(long j) {
            copyOnWrite();
            ((ExportTracePartialSuccess) this.instance).setRejectedSpans(j);
            return this;
        }

        public /* synthetic */ Builder(int i) {
            this();
        }
    }

    public static Builder newBuilder(ExportTracePartialSuccess exportTracePartialSuccess) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(exportTracePartialSuccess);
    }

    public static ExportTracePartialSuccess parseDelimitedFrom(InputStream inputStream, pyo pyoVar) throws IOException {
        return (ExportTracePartialSuccess) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
    }

    public static ExportTracePartialSuccess parseFrom(ByteBuffer byteBuffer, pyo pyoVar) throws InvalidProtocolBufferException {
        return (ExportTracePartialSuccess) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, pyoVar);
    }

    public static ExportTracePartialSuccess parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (ExportTracePartialSuccess) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static ExportTracePartialSuccess parseFrom(ByteString byteString, pyo pyoVar) throws InvalidProtocolBufferException {
        return (ExportTracePartialSuccess) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, pyoVar);
    }

    public static ExportTracePartialSuccess parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (ExportTracePartialSuccess) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static ExportTracePartialSuccess parseFrom(byte[] bArr, pyo pyoVar) throws InvalidProtocolBufferException {
        return (ExportTracePartialSuccess) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, pyoVar);
    }

    public static ExportTracePartialSuccess parseFrom(InputStream inputStream) throws IOException {
        return (ExportTracePartialSuccess) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static ExportTracePartialSuccess parseFrom(InputStream inputStream, pyo pyoVar) throws IOException {
        return (ExportTracePartialSuccess) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
    }

    public static ExportTracePartialSuccess parseFrom(eac eacVar) throws IOException {
        return (ExportTracePartialSuccess) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar);
    }

    public static ExportTracePartialSuccess parseFrom(eac eacVar, pyo pyoVar) throws IOException {
        return (ExportTracePartialSuccess) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar, pyoVar);
    }
}
