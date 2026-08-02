package androidx.glance.appwidget.protobuf;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import okio.Path$$ExternalSyntheticBUOutline0;

/* loaded from: classes3.dex */
public abstract class GeneratedMessageLite extends AbstractMessageLite {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, GeneratedMessageLite> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected UnknownFieldSetLite unknownFields;

    public abstract class Builder implements Cloneable {
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
            GeneratedMessageLite buildPartial = buildPartial();
            buildPartial.getClass();
            if (GeneratedMessageLite.isInitialized(buildPartial, true)) {
                return buildPartial;
            }
            throw new UninitializedMessageException();
        }

        public final GeneratedMessageLite buildPartial() {
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

        public final Object clone() {
            Builder builder = (Builder) this.defaultInstance.dynamicMethod(5);
            builder.instance = buildPartial();
            return builder;
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
        GeneratedMessageLite generatedMessageLite2 = (GeneratedMessageLite) ((GeneratedMessageLite) UnsafeUtil.allocateInstance(cls)).dynamicMethod(6);
        if (generatedMessageLite2 != null) {
            defaultInstanceMap.put(cls, generatedMessageLite2);
            return generatedMessageLite2;
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

    public static void registerDefaultInstance(Class cls, GeneratedMessageLite generatedMessageLite) {
        generatedMessageLite.markImmutable();
        defaultInstanceMap.put(cls, generatedMessageLite);
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

    @Override // androidx.glance.appwidget.protobuf.AbstractMessageLite
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
        String obj = super.toString();
        char[] cArr = MessageLiteToString.INDENT_BUFFER;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        MessageLiteToString.reflectivePrintWithIndent(this, sb, 0);
        return sb.toString();
    }
}
