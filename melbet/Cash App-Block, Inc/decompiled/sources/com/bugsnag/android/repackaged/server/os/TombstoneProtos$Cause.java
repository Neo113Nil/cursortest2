package com.bugsnag.android.repackaged.server.os;

import com.bugsnag.android.repackaged.server.os.TombstoneProtos$MemoryError;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class TombstoneProtos$Cause extends GeneratedMessageLite<TombstoneProtos$Cause, Builder> implements TombstoneProtos$CauseOrBuilder {
    private static final TombstoneProtos$Cause DEFAULT_INSTANCE;
    public static final int HUMAN_READABLE_FIELD_NUMBER = 1;
    public static final int MEMORY_ERROR_FIELD_NUMBER = 2;
    private static volatile Parser<TombstoneProtos$Cause> PARSER;
    private Object details_;
    private int detailsCase_ = 0;
    private String humanReadable_ = "";

    public final class Builder extends GeneratedMessageLite.Builder implements TombstoneProtos$CauseOrBuilder {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class DetailsCase {
        public static final /* synthetic */ DetailsCase[] $VALUES;
        public static final DetailsCase DETAILS_NOT_SET;
        public static final DetailsCase MEMORY_ERROR;

        static {
            DetailsCase detailsCase = new DetailsCase("MEMORY_ERROR", 0);
            MEMORY_ERROR = detailsCase;
            DetailsCase detailsCase2 = new DetailsCase("DETAILS_NOT_SET", 1);
            DETAILS_NOT_SET = detailsCase2;
            $VALUES = new DetailsCase[]{detailsCase, detailsCase2};
        }

        public static DetailsCase valueOf(String str) {
            return (DetailsCase) Enum.valueOf(DetailsCase.class, str);
        }

        public static DetailsCase[] values() {
            return (DetailsCase[]) $VALUES.clone();
        }
    }

    static {
        TombstoneProtos$Cause tombstoneProtos$Cause = new TombstoneProtos$Cause();
        DEFAULT_INSTANCE = tombstoneProtos$Cause;
        GeneratedMessageLite.registerDefaultInstance(TombstoneProtos$Cause.class, tombstoneProtos$Cause);
    }

    private TombstoneProtos$Cause() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDetails() {
        this.detailsCase_ = 0;
        this.details_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHumanReadable() {
        this.humanReadable_ = getDefaultInstance().getHumanReadable();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearMemoryError() {
        if (this.detailsCase_ == 2) {
            this.detailsCase_ = 0;
            this.details_ = null;
        }
    }

    public static TombstoneProtos$Cause getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeMemoryError(TombstoneProtos$MemoryError tombstoneProtos$MemoryError) {
        tombstoneProtos$MemoryError.getClass();
        if (this.detailsCase_ != 2 || this.details_ == TombstoneProtos$MemoryError.getDefaultInstance()) {
            this.details_ = tombstoneProtos$MemoryError;
        } else {
            this.details_ = ((TombstoneProtos$MemoryError.Builder) TombstoneProtos$MemoryError.newBuilder((TombstoneProtos$MemoryError) this.details_).mergeFrom((TombstoneProtos$MemoryError.Builder) tombstoneProtos$MemoryError)).buildPartial();
        }
        this.detailsCase_ = 2;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static TombstoneProtos$Cause parseDelimitedFrom(InputStream inputStream) {
        return (TombstoneProtos$Cause) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$Cause parseFrom(ByteBuffer byteBuffer) {
        return (TombstoneProtos$Cause) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<TombstoneProtos$Cause> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHumanReadable(String str) {
        str.getClass();
        this.humanReadable_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHumanReadableBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.humanReadable_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setMemoryError(TombstoneProtos$MemoryError tombstoneProtos$MemoryError) {
        tombstoneProtos$MemoryError.getClass();
        this.details_ = tombstoneProtos$MemoryError;
        this.detailsCase_ = 2;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (TombstoneProtos$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new TombstoneProtos$Cause();
            case 2:
                return new Builder(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0002\u0001\u0000\u0001\u0002\u0002\u0000\u0000\u0000\u0001Ȉ\u0002<\u0000", new Object[]{"details_", "detailsCase_", "humanReadable_", TombstoneProtos$MemoryError.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<TombstoneProtos$Cause> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (TombstoneProtos$Cause.class) {
                    try {
                        parser = PARSER;
                        if (parser == null) {
                            parser = new GeneratedMessageLite.DefaultInstanceBasedParser(DEFAULT_INSTANCE);
                            PARSER = parser;
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return parser;
            case 6:
                return (byte) 1;
            default:
                OptionalProvider$$ExternalSyntheticLambda0.m();
            case 7:
                return null;
        }
    }

    public DetailsCase getDetailsCase() {
        int i = this.detailsCase_;
        if (i == 0) {
            return DetailsCase.DETAILS_NOT_SET;
        }
        if (i != 2) {
            return null;
        }
        return DetailsCase.MEMORY_ERROR;
    }

    public String getHumanReadable() {
        return this.humanReadable_;
    }

    public ByteString getHumanReadableBytes() {
        return ByteString.copyFromUtf8(this.humanReadable_);
    }

    public TombstoneProtos$MemoryError getMemoryError() {
        return this.detailsCase_ == 2 ? (TombstoneProtos$MemoryError) this.details_ : TombstoneProtos$MemoryError.getDefaultInstance();
    }

    public boolean hasMemoryError() {
        return this.detailsCase_ == 2;
    }

    public static Builder newBuilder(TombstoneProtos$Cause tombstoneProtos$Cause) {
        return DEFAULT_INSTANCE.createBuilder(tombstoneProtos$Cause);
    }

    public static TombstoneProtos$Cause parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$Cause) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TombstoneProtos$Cause parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$Cause) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static TombstoneProtos$Cause parseFrom(ByteString byteString) {
        return (TombstoneProtos$Cause) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static TombstoneProtos$Cause parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$Cause) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static TombstoneProtos$Cause parseFrom(byte[] bArr) {
        return (TombstoneProtos$Cause) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TombstoneProtos$Cause parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$Cause) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static TombstoneProtos$Cause parseFrom(InputStream inputStream) {
        return (TombstoneProtos$Cause) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$Cause parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$Cause) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TombstoneProtos$Cause parseFrom(CodedInputStream codedInputStream) {
        return (TombstoneProtos$Cause) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TombstoneProtos$Cause parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$Cause) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
