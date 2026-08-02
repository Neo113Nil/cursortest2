package com.google.crypto.tink.shaded.protobuf;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.crypto.tink.shaded.protobuf.ByteString;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes.dex */
public abstract class GeneratedMessageLite extends AbstractMessageLite {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Class<?>, GeneratedMessageLite> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected UnknownFieldSetLite unknownFields;

    public abstract class Builder implements MessageLiteOrBuilder, Cloneable {
        public final GeneratedMessageLite defaultInstance;
        public GeneratedMessageLite instance;

        public Builder(GeneratedMessageLite generatedMessageLite) {
            this.defaultInstance = generatedMessageLite;
            if (generatedMessageLite.isMutable()) {
                a$$ExternalSyntheticBUOutline0.m$3("Default instance must be immutable.");
                throw null;
            }
            this.instance = generatedMessageLite.newMutableInstance$1();
        }

        public static void mergeFromInstance(Object obj, Object obj2) {
            Protobuf protobuf = Protobuf.INSTANCE;
            protobuf.getClass();
            protobuf.schemaFor(obj.getClass()).mergeFrom(obj, obj2);
        }

        public final GeneratedMessageLite build() {
            GeneratedMessageLite buildPartial$1 = buildPartial$1();
            buildPartial$1.getClass();
            if (GeneratedMessageLite.isInitialized(buildPartial$1, true)) {
                return buildPartial$1;
            }
            throw new UninitializedMessageException();
        }

        public final GeneratedMessageLite buildPartial$1() {
            boolean isMutable = this.instance.isMutable();
            GeneratedMessageLite generatedMessageLite = this.instance;
            if (!isMutable) {
                return generatedMessageLite;
            }
            generatedMessageLite.getClass();
            Protobuf protobuf = Protobuf.INSTANCE;
            protobuf.getClass();
            protobuf.schemaFor(generatedMessageLite.getClass()).makeImmutable(generatedMessageLite);
            generatedMessageLite.markImmutable();
            return this.instance;
        }

        public final Builder clone() {
            Builder newBuilderForType = this.defaultInstance.newBuilderForType();
            newBuilderForType.instance = buildPartial$1();
            return newBuilderForType;
        }

        public final void copyOnWrite() {
            if (this.instance.isMutable()) {
                return;
            }
            GeneratedMessageLite newMutableInstance$1 = this.defaultInstance.newMutableInstance$1();
            mergeFromInstance(newMutableInstance$1, this.instance);
            this.instance = newMutableInstance$1;
        }
    }

    public final class DefaultInstanceBasedParser implements Parser {
        static {
            ExtensionRegistryLite.getEmptyRegistry();
        }
    }

    public GeneratedMessageLite() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = UnknownFieldSetLite.DEFAULT_INSTANCE;
    }

    public static void checkMessageInitialized(GeneratedMessageLite generatedMessageLite) {
        if (generatedMessageLite != null && !isInitialized(generatedMessageLite, true)) {
            throw new InvalidProtocolBufferException(new UninitializedMessageException().getMessage());
        }
    }

    public static GeneratedMessageLite getDefaultInstance(Class cls) {
        GeneratedMessageLite generatedMessageLite = defaultInstanceMap.get(cls);
        if (generatedMessageLite == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                generatedMessageLite = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                a$$ExternalSyntheticBUOutline0.m("Class initialization cannot fail.", e);
                return null;
            }
        }
        if (generatedMessageLite != null) {
            return generatedMessageLite;
        }
        GeneratedMessageLite defaultInstanceForType = ((GeneratedMessageLite) UnsafeUtil.allocateInstance(cls)).getDefaultInstanceForType();
        if (defaultInstanceForType != null) {
            defaultInstanceMap.put(cls, defaultInstanceForType);
            return defaultInstanceForType;
        }
        Path$$ExternalSyntheticBUOutline0.m();
        return null;
    }

    public static Object invokeOrDie(Method method, GeneratedMessageLite generatedMessageLite, Object... objArr) {
        try {
            return method.invoke(generatedMessageLite, objArr);
        } catch (IllegalAccessException e) {
            OptionalProvider$$ExternalSyntheticLambda0.m("Couldn't use Java reflection to implement protocol message reflection.", (Throwable) e);
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            OptionalProvider$$ExternalSyntheticLambda0.m("Unexpected exception thrown by generated accessor method.", cause);
            return null;
        }
    }

    public static final boolean isInitialized(GeneratedMessageLite generatedMessageLite, boolean z) {
        byte byteValue = ((Byte) generatedMessageLite.dynamicMethod(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        Protobuf protobuf = Protobuf.INSTANCE;
        protobuf.getClass();
        boolean isInitialized = protobuf.schemaFor(generatedMessageLite.getClass()).isInitialized(generatedMessageLite);
        if (z) {
            generatedMessageLite.dynamicMethod(2);
        }
        return isInitialized;
    }

    public static GeneratedMessageLite parseFrom(GeneratedMessageLite generatedMessageLite, ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        ByteString.LiteralByteString literalByteString = (ByteString.LiteralByteString) byteString;
        byte[] bArr = literalByteString.bytes;
        int offsetIntoBytes = literalByteString.getOffsetIntoBytes();
        int size = literalByteString.size();
        CodedInputStream$ArrayDecoder codedInputStream$ArrayDecoder = new CodedInputStream$ArrayDecoder(bArr, offsetIntoBytes, size, true);
        try {
            codedInputStream$ArrayDecoder.pushLimit(size);
            GeneratedMessageLite newMutableInstance$1 = generatedMessageLite.newMutableInstance$1();
            try {
                Protobuf protobuf = Protobuf.INSTANCE;
                protobuf.getClass();
                Schema schemaFor = protobuf.schemaFor(newMutableInstance$1.getClass());
                CodedInputStreamReader codedInputStreamReader = (CodedInputStreamReader) codedInputStream$ArrayDecoder.zzd;
                if (codedInputStreamReader == null) {
                    codedInputStreamReader = new CodedInputStreamReader(codedInputStream$ArrayDecoder);
                }
                schemaFor.mergeFrom(newMutableInstance$1, codedInputStreamReader, extensionRegistryLite);
                schemaFor.makeImmutable(newMutableInstance$1);
                if (codedInputStream$ArrayDecoder.lastTag != 0) {
                    throw new InvalidProtocolBufferException("Protocol message end-group tag did not match expected tag.");
                }
                checkMessageInitialized(newMutableInstance$1);
                return newMutableInstance$1;
            } catch (InvalidProtocolBufferException e) {
                throw e;
            } catch (UninitializedMessageException e2) {
                throw new InvalidProtocolBufferException(e2.getMessage());
            } catch (IOException e3) {
                if (e3.getCause() instanceof InvalidProtocolBufferException) {
                    throw ((InvalidProtocolBufferException) e3.getCause());
                }
                throw new InvalidProtocolBufferException(e3.getMessage(), e3);
            } catch (RuntimeException e4) {
                if (e4.getCause() instanceof InvalidProtocolBufferException) {
                    throw ((InvalidProtocolBufferException) e4.getCause());
                }
                throw e4;
            }
        } catch (InvalidProtocolBufferException e5) {
            Path$$ExternalSyntheticBUOutline0.m((Throwable) e5);
            return null;
        }
    }

    public static GeneratedMessageLite parsePartialFrom(GeneratedMessageLite generatedMessageLite, byte[] bArr, int i, ExtensionRegistryLite extensionRegistryLite) {
        if (i == 0) {
            return generatedMessageLite;
        }
        GeneratedMessageLite newMutableInstance$1 = generatedMessageLite.newMutableInstance$1();
        try {
            Protobuf protobuf = Protobuf.INSTANCE;
            protobuf.getClass();
            Schema schemaFor = protobuf.schemaFor(newMutableInstance$1.getClass());
            ArrayDecoders$Registers arrayDecoders$Registers = new ArrayDecoders$Registers();
            extensionRegistryLite.getClass();
            schemaFor.mergeFrom(newMutableInstance$1, bArr, 0, i, arrayDecoders$Registers);
            schemaFor.makeImmutable(newMutableInstance$1);
            return newMutableInstance$1;
        } catch (InvalidProtocolBufferException e) {
            throw e;
        } catch (UninitializedMessageException e2) {
            throw new InvalidProtocolBufferException(e2.getMessage());
        } catch (IOException e3) {
            if (e3.getCause() instanceof InvalidProtocolBufferException) {
                throw ((InvalidProtocolBufferException) e3.getCause());
            }
            throw new InvalidProtocolBufferException(e3.getMessage(), e3);
        } catch (IndexOutOfBoundsException unused) {
            throw InvalidProtocolBufferException.truncatedMessage();
        }
    }

    public static void registerDefaultInstance(Class cls, GeneratedMessageLite generatedMessageLite) {
        generatedMessageLite.markImmutable();
        defaultInstanceMap.put(cls, generatedMessageLite);
    }

    public final Builder createBuilder() {
        return (Builder) dynamicMethod(5);
    }

    public abstract Object dynamicMethod(int i);

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Protobuf protobuf = Protobuf.INSTANCE;
        protobuf.getClass();
        return protobuf.schemaFor(getClass()).equals(this, (GeneratedMessageLite) obj);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.MessageLiteOrBuilder
    /* renamed from: getDefaultInstanceForType$1, reason: merged with bridge method [inline-methods] */
    public final GeneratedMessageLite getDefaultInstanceForType() {
        return (GeneratedMessageLite) dynamicMethod(6);
    }

    public final Parser getParserForType() {
        return (Parser) dynamicMethod(7);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite
    public final int getSerializedSize(Schema schema) {
        int serializedSize;
        int serializedSize2;
        if (isMutable()) {
            if (schema == null) {
                Protobuf protobuf = Protobuf.INSTANCE;
                protobuf.getClass();
                serializedSize2 = protobuf.schemaFor(getClass()).getSerializedSize(this);
            } else {
                serializedSize2 = schema.getSerializedSize(this);
            }
            if (serializedSize2 >= 0) {
                return serializedSize2;
            }
            a$$ExternalSyntheticBUOutline0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(serializedSize2, "serialized size must be non-negative, was "));
            return 0;
        }
        int i = this.memoizedSerializedSize;
        if ((i & Integer.MAX_VALUE) != Integer.MAX_VALUE) {
            return i & Integer.MAX_VALUE;
        }
        if (schema == null) {
            Protobuf protobuf2 = Protobuf.INSTANCE;
            protobuf2.getClass();
            serializedSize = protobuf2.schemaFor(getClass()).getSerializedSize(this);
        } else {
            serializedSize = schema.getSerializedSize(this);
        }
        setMemoizedSerializedSize(serializedSize);
        return serializedSize;
    }

    public final int hashCode() {
        if (isMutable()) {
            Protobuf protobuf = Protobuf.INSTANCE;
            protobuf.getClass();
            return protobuf.schemaFor(getClass()).hashCode(this);
        }
        if (this.memoizedHashCode == 0) {
            Protobuf protobuf2 = Protobuf.INSTANCE;
            protobuf2.getClass();
            this.memoizedHashCode = protobuf2.schemaFor(getClass()).hashCode(this);
        }
        return this.memoizedHashCode;
    }

    public final boolean isMutable() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    public final void markImmutable() {
        this.memoizedSerializedSize &= Integer.MAX_VALUE;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite
    /* renamed from: newBuilderForType$1, reason: merged with bridge method [inline-methods] */
    public final Builder newBuilderForType() {
        return (Builder) dynamicMethod(5);
    }

    public final GeneratedMessageLite newMutableInstance$1() {
        return (GeneratedMessageLite) dynamicMethod(4);
    }

    public final void setMemoizedSerializedSize(int i) {
        if (i < 0) {
            a$$ExternalSyntheticBUOutline0.m$1(JsonLogicResult$Success$$ExternalSyntheticOutline0.m(i, "serialized size must be non-negative, was "));
        } else {
            this.memoizedSerializedSize = (i & Integer.MAX_VALUE) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
        }
    }

    public final String toString() {
        return MessageLiteToString.toString(this, super.toString());
    }

    @Override // com.google.crypto.tink.shaded.protobuf.AbstractMessageLite
    public final void writeTo(CodedOutputStream$ArrayEncoder codedOutputStream$ArrayEncoder) {
        Protobuf protobuf = Protobuf.INSTANCE;
        protobuf.getClass();
        Schema schemaFor = protobuf.schemaFor(getClass());
        ManifestSchemaFactory manifestSchemaFactory = codedOutputStream$ArrayEncoder.wrapper;
        if (manifestSchemaFactory == null) {
            manifestSchemaFactory = new ManifestSchemaFactory(codedOutputStream$ArrayEncoder);
        }
        schemaFor.writeTo(this, manifestSchemaFactory);
    }
}
