package com.bugsnag.android.repackaged.server.os;

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
public final class TombstoneProtos$FD extends GeneratedMessageLite<TombstoneProtos$FD, Builder> implements TombstoneProtos$FDOrBuilder {
    private static final TombstoneProtos$FD DEFAULT_INSTANCE;
    public static final int FD_FIELD_NUMBER = 1;
    public static final int OWNER_FIELD_NUMBER = 3;
    private static volatile Parser<TombstoneProtos$FD> PARSER = null;
    public static final int PATH_FIELD_NUMBER = 2;
    public static final int TAG_FIELD_NUMBER = 4;
    private int fd_;
    private long tag_;
    private String path_ = "";
    private String owner_ = "";

    public final class Builder extends GeneratedMessageLite.Builder implements TombstoneProtos$FDOrBuilder {
    }

    static {
        TombstoneProtos$FD tombstoneProtos$FD = new TombstoneProtos$FD();
        DEFAULT_INSTANCE = tombstoneProtos$FD;
        GeneratedMessageLite.registerDefaultInstance(TombstoneProtos$FD.class, tombstoneProtos$FD);
    }

    private TombstoneProtos$FD() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearFd() {
        this.fd_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearOwner() {
        this.owner_ = getDefaultInstance().getOwner();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearPath() {
        this.path_ = getDefaultInstance().getPath();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTag() {
        this.tag_ = 0L;
    }

    public static TombstoneProtos$FD getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static TombstoneProtos$FD parseDelimitedFrom(InputStream inputStream) {
        return (TombstoneProtos$FD) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$FD parseFrom(ByteBuffer byteBuffer) {
        return (TombstoneProtos$FD) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<TombstoneProtos$FD> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setFd(int i) {
        this.fd_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOwner(String str) {
        str.getClass();
        this.owner_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setOwnerBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.owner_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPath(String str) {
        str.getClass();
        this.path_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setPathBytes(ByteString byteString) {
        AbstractMessageLite.checkByteStringIsUtf8(byteString);
        this.path_ = byteString.toStringUtf8();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTag(long j) {
        this.tag_ = j;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (TombstoneProtos$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new TombstoneProtos$FD();
            case 2:
                return new Builder(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0000\u0000\u0001\u0004\u0002Ȉ\u0003Ȉ\u0004\u0003", new Object[]{"fd_", "path_", "owner_", "tag_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<TombstoneProtos$FD> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (TombstoneProtos$FD.class) {
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

    public int getFd() {
        return this.fd_;
    }

    public String getOwner() {
        return this.owner_;
    }

    public ByteString getOwnerBytes() {
        return ByteString.copyFromUtf8(this.owner_);
    }

    public String getPath() {
        return this.path_;
    }

    public ByteString getPathBytes() {
        return ByteString.copyFromUtf8(this.path_);
    }

    public long getTag() {
        return this.tag_;
    }

    public static Builder newBuilder(TombstoneProtos$FD tombstoneProtos$FD) {
        return DEFAULT_INSTANCE.createBuilder(tombstoneProtos$FD);
    }

    public static TombstoneProtos$FD parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$FD) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TombstoneProtos$FD parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$FD) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static TombstoneProtos$FD parseFrom(ByteString byteString) {
        return (TombstoneProtos$FD) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static TombstoneProtos$FD parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$FD) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static TombstoneProtos$FD parseFrom(byte[] bArr) {
        return (TombstoneProtos$FD) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TombstoneProtos$FD parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$FD) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static TombstoneProtos$FD parseFrom(InputStream inputStream) {
        return (TombstoneProtos$FD) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$FD parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$FD) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TombstoneProtos$FD parseFrom(CodedInputStream codedInputStream) {
        return (TombstoneProtos$FD) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TombstoneProtos$FD parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$FD) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
