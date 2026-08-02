package io.opentelemetry.proto.resource.v1;

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
import io.opentelemetry.proto.common.v1.EntityRef;
import io.opentelemetry.proto.common.v1.EntityRefOrBuilder;
import io.opentelemetry.proto.common.v1.KeyValue;
import io.opentelemetry.proto.common.v1.KeyValueOrBuilder;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class Resource extends GeneratedMessageLite implements ResourceOrBuilder {
    public static final int ATTRIBUTES_FIELD_NUMBER = 1;
    private static final Resource DEFAULT_INSTANCE;
    public static final int DROPPED_ATTRIBUTES_COUNT_FIELD_NUMBER = 2;
    public static final int ENTITY_REFS_FIELD_NUMBER = 3;
    private static volatile of90 PARSER;
    private int droppedAttributesCount_;
    private oqw attributes_ = GeneratedMessageLite.emptyProtobufList();
    private oqw entityRefs_ = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: io.opentelemetry.proto.resource.v1.Resource$1, reason: invalid class name */
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
        Resource resource = new Resource();
        DEFAULT_INSTANCE = resource;
        GeneratedMessageLite.registerDefaultInstance(Resource.class, resource);
    }

    private Resource() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllAttributes(Iterable<? extends KeyValue> iterable) {
        ensureAttributesIsMutable();
        b.addAll(iterable, this.attributes_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllEntityRefs(Iterable<? extends EntityRef> iterable) {
        ensureEntityRefsIsMutable();
        b.addAll(iterable, this.entityRefs_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAttributes(KeyValue keyValue) {
        keyValue.getClass();
        ensureAttributesIsMutable();
        this.attributes_.add(keyValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEntityRefs(EntityRef entityRef) {
        entityRef.getClass();
        ensureEntityRefsIsMutable();
        this.entityRefs_.add(entityRef);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearAttributes() {
        this.attributes_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDroppedAttributesCount() {
        this.droppedAttributesCount_ = 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearEntityRefs() {
        this.entityRefs_ = GeneratedMessageLite.emptyProtobufList();
    }

    private void ensureAttributesIsMutable() {
        oqw oqwVar = this.attributes_;
        if (((p9) oqwVar).a) {
            return;
        }
        this.attributes_ = GeneratedMessageLite.mutableCopy(oqwVar);
    }

    private void ensureEntityRefsIsMutable() {
        oqw oqwVar = this.entityRefs_;
        if (((p9) oqwVar).a) {
            return;
        }
        this.entityRefs_ = GeneratedMessageLite.mutableCopy(oqwVar);
    }

    public static Resource getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static Resource parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (Resource) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Resource parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static of90 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeAttributes(int i) {
        ensureAttributesIsMutable();
        this.attributes_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void removeEntityRefs(int i) {
        ensureEntityRefsIsMutable();
        this.entityRefs_.remove(i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setAttributes(int i, KeyValue keyValue) {
        keyValue.getClass();
        ensureAttributesIsMutable();
        this.attributes_.set(i, keyValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDroppedAttributesCount(int i) {
        this.droppedAttributesCount_ = i;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setEntityRefs(int i, EntityRef entityRef) {
        entityRef.getClass();
        ensureEntityRefsIsMutable();
        this.entityRefs_.set(i, entityRef);
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        of90 of90Var;
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new Resource();
            case 2:
                return new Builder(0);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0002\u0000\u0001\u001b\u0002\u000b\u0003\u001b", new Object[]{"attributes_", KeyValue.class, "droppedAttributesCount_", "entityRefs_", EntityRef.class});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                of90 of90Var2 = PARSER;
                if (of90Var2 != null) {
                    return of90Var2;
                }
                synchronized (Resource.class) {
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

    @Override // io.opentelemetry.proto.resource.v1.ResourceOrBuilder
    public KeyValue getAttributes(int i) {
        return (KeyValue) this.attributes_.get(i);
    }

    @Override // io.opentelemetry.proto.resource.v1.ResourceOrBuilder
    public int getAttributesCount() {
        return this.attributes_.size();
    }

    @Override // io.opentelemetry.proto.resource.v1.ResourceOrBuilder
    public List<KeyValue> getAttributesList() {
        return this.attributes_;
    }

    public KeyValueOrBuilder getAttributesOrBuilder(int i) {
        return (KeyValueOrBuilder) this.attributes_.get(i);
    }

    public List<? extends KeyValueOrBuilder> getAttributesOrBuilderList() {
        return this.attributes_;
    }

    @Override // io.opentelemetry.proto.resource.v1.ResourceOrBuilder
    public int getDroppedAttributesCount() {
        return this.droppedAttributesCount_;
    }

    @Override // io.opentelemetry.proto.resource.v1.ResourceOrBuilder
    public EntityRef getEntityRefs(int i) {
        return (EntityRef) this.entityRefs_.get(i);
    }

    @Override // io.opentelemetry.proto.resource.v1.ResourceOrBuilder
    public int getEntityRefsCount() {
        return this.entityRefs_.size();
    }

    @Override // io.opentelemetry.proto.resource.v1.ResourceOrBuilder
    public List<EntityRef> getEntityRefsList() {
        return this.entityRefs_;
    }

    public EntityRefOrBuilder getEntityRefsOrBuilder(int i) {
        return (EntityRefOrBuilder) this.entityRefs_.get(i);
    }

    public List<? extends EntityRefOrBuilder> getEntityRefsOrBuilderList() {
        return this.entityRefs_;
    }

    public static final class Builder extends n implements ResourceOrBuilder {
        private Builder() {
            super(Resource.DEFAULT_INSTANCE);
        }

        public Builder addAllAttributes(Iterable<? extends KeyValue> iterable) {
            copyOnWrite();
            ((Resource) this.instance).addAllAttributes(iterable);
            return this;
        }

        public Builder addAllEntityRefs(Iterable<? extends EntityRef> iterable) {
            copyOnWrite();
            ((Resource) this.instance).addAllEntityRefs(iterable);
            return this;
        }

        public Builder addAttributes(KeyValue.Builder builder) {
            copyOnWrite();
            ((Resource) this.instance).addAttributes((KeyValue) builder.build());
            return this;
        }

        public Builder addEntityRefs(EntityRef.Builder builder) {
            copyOnWrite();
            ((Resource) this.instance).addEntityRefs((EntityRef) builder.build());
            return this;
        }

        public Builder clearAttributes() {
            copyOnWrite();
            ((Resource) this.instance).clearAttributes();
            return this;
        }

        public Builder clearDroppedAttributesCount() {
            copyOnWrite();
            ((Resource) this.instance).clearDroppedAttributesCount();
            return this;
        }

        public Builder clearEntityRefs() {
            copyOnWrite();
            ((Resource) this.instance).clearEntityRefs();
            return this;
        }

        @Override // io.opentelemetry.proto.resource.v1.ResourceOrBuilder
        public KeyValue getAttributes(int i) {
            return ((Resource) this.instance).getAttributes(i);
        }

        @Override // io.opentelemetry.proto.resource.v1.ResourceOrBuilder
        public int getAttributesCount() {
            return ((Resource) this.instance).getAttributesCount();
        }

        @Override // io.opentelemetry.proto.resource.v1.ResourceOrBuilder
        public List<KeyValue> getAttributesList() {
            return Collections.unmodifiableList(((Resource) this.instance).getAttributesList());
        }

        @Override // io.opentelemetry.proto.resource.v1.ResourceOrBuilder
        public int getDroppedAttributesCount() {
            return ((Resource) this.instance).getDroppedAttributesCount();
        }

        @Override // io.opentelemetry.proto.resource.v1.ResourceOrBuilder
        public EntityRef getEntityRefs(int i) {
            return ((Resource) this.instance).getEntityRefs(i);
        }

        @Override // io.opentelemetry.proto.resource.v1.ResourceOrBuilder
        public int getEntityRefsCount() {
            return ((Resource) this.instance).getEntityRefsCount();
        }

        @Override // io.opentelemetry.proto.resource.v1.ResourceOrBuilder
        public List<EntityRef> getEntityRefsList() {
            return Collections.unmodifiableList(((Resource) this.instance).getEntityRefsList());
        }

        public Builder removeAttributes(int i) {
            copyOnWrite();
            ((Resource) this.instance).removeAttributes(i);
            return this;
        }

        public Builder removeEntityRefs(int i) {
            copyOnWrite();
            ((Resource) this.instance).removeEntityRefs(i);
            return this;
        }

        public Builder setAttributes(int i, KeyValue.Builder builder) {
            copyOnWrite();
            ((Resource) this.instance).setAttributes(i, (KeyValue) builder.build());
            return this;
        }

        public Builder setDroppedAttributesCount(int i) {
            copyOnWrite();
            ((Resource) this.instance).setDroppedAttributesCount(i);
            return this;
        }

        public Builder setEntityRefs(int i, EntityRef.Builder builder) {
            copyOnWrite();
            ((Resource) this.instance).setEntityRefs(i, (EntityRef) builder.build());
            return this;
        }

        public /* synthetic */ Builder(int i) {
            this();
        }

        public Builder addAttributes(int i, KeyValue keyValue) {
            copyOnWrite();
            ((Resource) this.instance).addAttributes(i, keyValue);
            return this;
        }

        public Builder addEntityRefs(int i, EntityRef entityRef) {
            copyOnWrite();
            ((Resource) this.instance).addEntityRefs(i, entityRef);
            return this;
        }

        public Builder setAttributes(int i, KeyValue keyValue) {
            copyOnWrite();
            ((Resource) this.instance).setAttributes(i, keyValue);
            return this;
        }

        public Builder setEntityRefs(int i, EntityRef entityRef) {
            copyOnWrite();
            ((Resource) this.instance).setEntityRefs(i, entityRef);
            return this;
        }

        public Builder addAttributes(KeyValue keyValue) {
            copyOnWrite();
            ((Resource) this.instance).addAttributes(keyValue);
            return this;
        }

        public Builder addEntityRefs(EntityRef entityRef) {
            copyOnWrite();
            ((Resource) this.instance).addEntityRefs(entityRef);
            return this;
        }

        public Builder addAttributes(int i, KeyValue.Builder builder) {
            copyOnWrite();
            ((Resource) this.instance).addAttributes(i, (KeyValue) builder.build());
            return this;
        }

        public Builder addEntityRefs(int i, EntityRef.Builder builder) {
            copyOnWrite();
            ((Resource) this.instance).addEntityRefs(i, (EntityRef) builder.build());
            return this;
        }
    }

    public static Builder newBuilder(Resource resource) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(resource);
    }

    public static Resource parseDelimitedFrom(InputStream inputStream, pyo pyoVar) throws IOException {
        return (Resource) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
    }

    public static Resource parseFrom(ByteBuffer byteBuffer, pyo pyoVar) throws InvalidProtocolBufferException {
        return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, pyoVar);
    }

    public static Resource parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Resource parseFrom(ByteString byteString, pyo pyoVar) throws InvalidProtocolBufferException {
        return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, pyoVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAttributes(int i, KeyValue keyValue) {
        keyValue.getClass();
        ensureAttributesIsMutable();
        this.attributes_.add(i, keyValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addEntityRefs(int i, EntityRef entityRef) {
        entityRef.getClass();
        ensureEntityRefsIsMutable();
        this.entityRefs_.add(i, entityRef);
    }

    public static Resource parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Resource parseFrom(byte[] bArr, pyo pyoVar) throws InvalidProtocolBufferException {
        return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, pyoVar);
    }

    public static Resource parseFrom(InputStream inputStream) throws IOException {
        return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Resource parseFrom(InputStream inputStream, pyo pyoVar) throws IOException {
        return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
    }

    public static Resource parseFrom(eac eacVar) throws IOException {
        return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar);
    }

    public static Resource parseFrom(eac eacVar, pyo pyoVar) throws IOException {
        return (Resource) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar, pyoVar);
    }
}
