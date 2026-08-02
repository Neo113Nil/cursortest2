package com.bugsnag.android.repackaged.server.os;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.bugsnag.android.repackaged.server.os.TombstoneProtos$HeapObject;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes4.dex */
public final class TombstoneProtos$MemoryError extends GeneratedMessageLite<TombstoneProtos$MemoryError, Builder> implements MessageLiteOrBuilder {
    private static final TombstoneProtos$MemoryError DEFAULT_INSTANCE;
    public static final int HEAP_FIELD_NUMBER = 3;
    private static volatile Parser<TombstoneProtos$MemoryError> PARSER = null;
    public static final int TOOL_FIELD_NUMBER = 1;
    public static final int TYPE_FIELD_NUMBER = 2;
    private int locationCase_ = 0;
    private Object location_;
    private int tool_;
    private int type_;

    public final class Builder extends GeneratedMessageLite.Builder implements MessageLiteOrBuilder {
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public final class LocationCase {
        public static final /* synthetic */ LocationCase[] $VALUES;
        public static final LocationCase HEAP;
        public static final LocationCase LOCATION_NOT_SET;

        static {
            LocationCase locationCase = new LocationCase("HEAP", 0);
            HEAP = locationCase;
            LocationCase locationCase2 = new LocationCase("LOCATION_NOT_SET", 1);
            LOCATION_NOT_SET = locationCase2;
            $VALUES = new LocationCase[]{locationCase, locationCase2};
        }

        public static LocationCase valueOf(String str) {
            return (LocationCase) Enum.valueOf(LocationCase.class, str);
        }

        public static LocationCase[] values() {
            return (LocationCase[]) $VALUES.clone();
        }
    }

    public enum Tool implements Internal.EnumLite {
        GWP_ASAN(0),
        SCUDO(1),
        UNRECOGNIZED(-1);

        public final int value;

        Tool(int i) {
            this.value = i;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            a$$ExternalSyntheticBUOutline0.m$3("Can't get the number of an unknown enum value.");
            return 0;
        }
    }

    public enum Type implements Internal.EnumLite {
        UNKNOWN(0),
        USE_AFTER_FREE(1),
        DOUBLE_FREE(2),
        INVALID_FREE(3),
        BUFFER_OVERFLOW(4),
        BUFFER_UNDERFLOW(5),
        UNRECOGNIZED(-1);

        public final int value;

        Type(int i) {
            this.value = i;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.value;
            }
            a$$ExternalSyntheticBUOutline0.m$3("Can't get the number of an unknown enum value.");
            return 0;
        }
    }

    static {
        TombstoneProtos$MemoryError tombstoneProtos$MemoryError = new TombstoneProtos$MemoryError();
        DEFAULT_INSTANCE = tombstoneProtos$MemoryError;
        GeneratedMessageLite.registerDefaultInstance(TombstoneProtos$MemoryError.class, tombstoneProtos$MemoryError);
    }

    private TombstoneProtos$MemoryError() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearHeap() {
        if (this.locationCase_ == 3) {
            this.locationCase_ = 0;
            this.location_ = null;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearLocation() {
        this.locationCase_ = 0;
        this.location_ = null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearTool() {
        this.tool_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = 0;
    }

    public static TombstoneProtos$MemoryError getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void mergeHeap(TombstoneProtos$HeapObject tombstoneProtos$HeapObject) {
        tombstoneProtos$HeapObject.getClass();
        if (this.locationCase_ != 3 || this.location_ == TombstoneProtos$HeapObject.getDefaultInstance()) {
            this.location_ = tombstoneProtos$HeapObject;
        } else {
            this.location_ = ((TombstoneProtos$HeapObject.Builder) TombstoneProtos$HeapObject.newBuilder((TombstoneProtos$HeapObject) this.location_).mergeFrom((TombstoneProtos$HeapObject.Builder) tombstoneProtos$HeapObject)).buildPartial();
        }
        this.locationCase_ = 3;
    }

    public static Builder newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static TombstoneProtos$MemoryError parseDelimitedFrom(InputStream inputStream) {
        return (TombstoneProtos$MemoryError) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$MemoryError parseFrom(ByteBuffer byteBuffer) {
        return (TombstoneProtos$MemoryError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Parser<TombstoneProtos$MemoryError> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setHeap(TombstoneProtos$HeapObject tombstoneProtos$HeapObject) {
        tombstoneProtos$HeapObject.getClass();
        this.location_ = tombstoneProtos$HeapObject;
        this.locationCase_ = 3;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTool(Tool tool) {
        this.tool_ = tool.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setToolValue(int i) {
        this.tool_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(Type type2) {
        this.type_ = type2.getNumber();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeValue(int i) {
        this.type_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (TombstoneProtos$1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new TombstoneProtos$MemoryError();
            case 2:
                return new Builder(DEFAULT_INSTANCE);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0001\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002\f\u0003<\u0000", new Object[]{"location_", "locationCase_", "tool_", "type_", TombstoneProtos$HeapObject.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<TombstoneProtos$MemoryError> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (TombstoneProtos$MemoryError.class) {
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

    public TombstoneProtos$HeapObject getHeap() {
        return this.locationCase_ == 3 ? (TombstoneProtos$HeapObject) this.location_ : TombstoneProtos$HeapObject.getDefaultInstance();
    }

    public LocationCase getLocationCase() {
        int i = this.locationCase_;
        if (i == 0) {
            return LocationCase.LOCATION_NOT_SET;
        }
        if (i != 3) {
            return null;
        }
        return LocationCase.HEAP;
    }

    public Tool getTool() {
        int i = this.tool_;
        Tool tool = i != 0 ? i != 1 ? null : Tool.SCUDO : Tool.GWP_ASAN;
        return tool == null ? Tool.UNRECOGNIZED : tool;
    }

    public int getToolValue() {
        return this.tool_;
    }

    public Type getType() {
        int i = this.type_;
        Type type2 = i != 0 ? i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? null : Type.BUFFER_UNDERFLOW : Type.BUFFER_OVERFLOW : Type.INVALID_FREE : Type.DOUBLE_FREE : Type.USE_AFTER_FREE : Type.UNKNOWN;
        return type2 == null ? Type.UNRECOGNIZED : type2;
    }

    public int getTypeValue() {
        return this.type_;
    }

    public boolean hasHeap() {
        return this.locationCase_ == 3;
    }

    public static Builder newBuilder(TombstoneProtos$MemoryError tombstoneProtos$MemoryError) {
        return DEFAULT_INSTANCE.createBuilder(tombstoneProtos$MemoryError);
    }

    public static TombstoneProtos$MemoryError parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$MemoryError) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TombstoneProtos$MemoryError parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$MemoryError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static TombstoneProtos$MemoryError parseFrom(ByteString byteString) {
        return (TombstoneProtos$MemoryError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static TombstoneProtos$MemoryError parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$MemoryError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static TombstoneProtos$MemoryError parseFrom(byte[] bArr) {
        return (TombstoneProtos$MemoryError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static TombstoneProtos$MemoryError parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$MemoryError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }

    public static TombstoneProtos$MemoryError parseFrom(InputStream inputStream) {
        return (TombstoneProtos$MemoryError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static TombstoneProtos$MemoryError parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$MemoryError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static TombstoneProtos$MemoryError parseFrom(CodedInputStream codedInputStream) {
        return (TombstoneProtos$MemoryError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static TombstoneProtos$MemoryError parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (TombstoneProtos$MemoryError) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }
}
