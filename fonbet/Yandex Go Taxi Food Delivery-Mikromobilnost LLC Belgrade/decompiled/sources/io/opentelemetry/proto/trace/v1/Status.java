package io.opentelemetry.proto.trace.v1;

import com.google.protobuf.ByteString;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.InvalidProtocolBufferException;
import com.google.protobuf.b;
import com.google.protobuf.n;
import defpackage.dqw;
import defpackage.eac;
import defpackage.fqw;
import defpackage.hqw;
import defpackage.ny61;
import defpackage.of90;
import defpackage.oxs;
import defpackage.pyo;
import defpackage.w511;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class Status extends GeneratedMessageLite implements StatusOrBuilder {
    public static final int CODE_FIELD_NUMBER = 3;
    private static final Status DEFAULT_INSTANCE;
    public static final int MESSAGE_FIELD_NUMBER = 2;
    private static volatile of90 PARSER;
    private int code_;
    private String message_ = "";

    /* renamed from: io.opentelemetry.proto.trace.v1.Status$1, reason: invalid class name */
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
        Status status = new Status();
        DEFAULT_INSTANCE = status;
        GeneratedMessageLite.registerDefaultInstance(Status.class, status);
    }

    private Status() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearCode() {
        this.code_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMessage() {
        this.message_ = getDefaultInstance().getMessage();
    }

    public static Status getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Status parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Status) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Status parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static of90 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCode(StatusCode statusCode) {
        this.code_ = statusCode.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setCodeValue(int i) {
        this.code_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessage(String str) {
        str.getClass();
        this.message_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMessageBytes(ByteString byteString) {
        b.checkByteStringIsUtf8(byteString);
        this.message_ = byteString.r();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        of90 of90Var;
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new Status();
            case 2:
                return new Builder(0);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0000\u0000\u0002\u0003\u0002\u0000\u0000\u0000\u0002Ȉ\u0003\f", new Object[]{"message_", "code_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                of90 of90Var2 = PARSER;
                if (of90Var2 != null) {
                    return of90Var2;
                }
                synchronized (Status.class) {
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

    @Override // io.opentelemetry.proto.trace.v1.StatusOrBuilder
    public StatusCode getCode() {
        StatusCode forNumber = StatusCode.forNumber(this.code_);
        return forNumber == null ? StatusCode.UNRECOGNIZED : forNumber;
    }

    @Override // io.opentelemetry.proto.trace.v1.StatusOrBuilder
    public int getCodeValue() {
        return this.code_;
    }

    @Override // io.opentelemetry.proto.trace.v1.StatusOrBuilder
    public String getMessage() {
        return this.message_;
    }

    @Override // io.opentelemetry.proto.trace.v1.StatusOrBuilder
    public ByteString getMessageBytes() {
        return ByteString.g(this.message_);
    }

    public static final class Builder extends n implements StatusOrBuilder {
        private Builder() {
            super(Status.DEFAULT_INSTANCE);
        }

        public Builder clearCode() {
            copyOnWrite();
            ((Status) this.instance).clearCode();
            return this;
        }

        public Builder clearMessage() {
            copyOnWrite();
            ((Status) this.instance).clearMessage();
            return this;
        }

        @Override // io.opentelemetry.proto.trace.v1.StatusOrBuilder
        public StatusCode getCode() {
            return ((Status) this.instance).getCode();
        }

        @Override // io.opentelemetry.proto.trace.v1.StatusOrBuilder
        public int getCodeValue() {
            return ((Status) this.instance).getCodeValue();
        }

        @Override // io.opentelemetry.proto.trace.v1.StatusOrBuilder
        public String getMessage() {
            return ((Status) this.instance).getMessage();
        }

        @Override // io.opentelemetry.proto.trace.v1.StatusOrBuilder
        public ByteString getMessageBytes() {
            return ((Status) this.instance).getMessageBytes();
        }

        public Builder setCode(StatusCode statusCode) {
            copyOnWrite();
            ((Status) this.instance).setCode(statusCode);
            return this;
        }

        public Builder setCodeValue(int i) {
            copyOnWrite();
            ((Status) this.instance).setCodeValue(i);
            return this;
        }

        public Builder setMessage(String str) {
            copyOnWrite();
            ((Status) this.instance).setMessage(str);
            return this;
        }

        public Builder setMessageBytes(ByteString byteString) {
            copyOnWrite();
            ((Status) this.instance).setMessageBytes(byteString);
            return this;
        }

        public /* synthetic */ Builder(int i) {
            this();
        }
    }

    public enum StatusCode implements dqw {
        STATUS_CODE_UNSET(0),
        STATUS_CODE_OK(1),
        STATUS_CODE_ERROR(2),
        UNRECOGNIZED(-1);

        public static final int STATUS_CODE_ERROR_VALUE = 2;
        public static final int STATUS_CODE_OK_VALUE = 1;
        public static final int STATUS_CODE_UNSET_VALUE = 0;
        private static final fqw internalValueMap = new fqw() { // from class: io.opentelemetry.proto.trace.v1.Status.StatusCode.1
            @Override // defpackage.fqw
            public StatusCode findValueByNumber(int i) {
                return StatusCode.forNumber(i);
            }
        };
        private final int value;

        public static final class StatusCodeVerifier implements hqw {
            static final hqw INSTANCE = new StatusCodeVerifier();

            private StatusCodeVerifier() {
            }

            @Override // defpackage.hqw
            public boolean isInRange(int i) {
                return StatusCode.forNumber(i) != null;
            }
        }

        StatusCode(int i) {
            this.value = i;
        }

        public static StatusCode forNumber(int i) {
            if (i == 0) {
                return STATUS_CODE_UNSET;
            }
            if (i == 1) {
                return STATUS_CODE_OK;
            }
            if (i != 2) {
                return null;
            }
            return STATUS_CODE_ERROR;
        }

        public static fqw internalGetValueMap() {
            return internalValueMap;
        }

        public static hqw internalGetVerifier() {
            return StatusCodeVerifier.INSTANCE;
        }

        @Override // defpackage.dqw
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            ny61.g("Can't get the number of an unknown enum value.");
            return 0;
        }

        @Deprecated
        public static StatusCode valueOf(int i) {
            return forNumber(i);
        }
    }

    public static Builder newBuilder(Status status) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(status);
    }

    public static Status parseDelimitedFrom(InputStream inputStream, pyo pyoVar) throws IOException {
        return (Status) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
    }

    public static Status parseFrom(ByteBuffer byteBuffer, pyo pyoVar) throws InvalidProtocolBufferException {
        return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, pyoVar);
    }

    public static Status parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Status parseFrom(ByteString byteString, pyo pyoVar) throws InvalidProtocolBufferException {
        return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, pyoVar);
    }

    public static Status parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Status parseFrom(byte[] bArr, pyo pyoVar) throws InvalidProtocolBufferException {
        return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, pyoVar);
    }

    public static Status parseFrom(InputStream inputStream) throws IOException {
        return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Status parseFrom(InputStream inputStream, pyo pyoVar) throws IOException {
        return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
    }

    public static Status parseFrom(eac eacVar) throws IOException {
        return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar);
    }

    public static Status parseFrom(eac eacVar, pyo pyoVar) throws IOException {
        return (Status) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar, pyoVar);
    }
}
