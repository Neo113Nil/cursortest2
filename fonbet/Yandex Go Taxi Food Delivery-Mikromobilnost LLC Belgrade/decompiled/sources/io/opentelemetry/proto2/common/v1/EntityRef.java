package io.opentelemetry.proto2.common.v1;

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
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.Collections;
import java.util.List;

/* loaded from: classes4.dex */
public final class EntityRef extends GeneratedMessageLite implements EntityRefOrBuilder {
    private static final EntityRef DEFAULT_INSTANCE;
    public static final int DESCRIPTION_KEYS_FIELD_NUMBER = 4;
    public static final int ID_KEYS_FIELD_NUMBER = 3;
    private static volatile of90 PARSER = null;
    public static final int SCHEMA_URL_FIELD_NUMBER = 1;
    public static final int TYPE_FIELD_NUMBER = 2;
    private String schemaUrl_ = "";
    private String type_ = "";
    private oqw idKeys_ = GeneratedMessageLite.emptyProtobufList();
    private oqw descriptionKeys_ = GeneratedMessageLite.emptyProtobufList();

    /* renamed from: io.opentelemetry.proto2.common.v1.EntityRef$1, reason: invalid class name */
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
        EntityRef entityRef = new EntityRef();
        DEFAULT_INSTANCE = entityRef;
        GeneratedMessageLite.registerDefaultInstance(EntityRef.class, entityRef);
    }

    private EntityRef() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllDescriptionKeys(Iterable<String> iterable) {
        ensureDescriptionKeysIsMutable();
        b.addAll(iterable, this.descriptionKeys_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addAllIdKeys(Iterable<String> iterable) {
        ensureIdKeysIsMutable();
        b.addAll(iterable, this.idKeys_);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDescriptionKeys(String str) {
        str.getClass();
        ensureDescriptionKeysIsMutable();
        this.descriptionKeys_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addDescriptionKeysBytes(ByteString byteString) {
        b.checkByteStringIsUtf8(byteString);
        ensureDescriptionKeysIsMutable();
        this.descriptionKeys_.add(byteString.r());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addIdKeys(String str) {
        str.getClass();
        ensureIdKeysIsMutable();
        this.idKeys_.add(str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void addIdKeysBytes(ByteString byteString) {
        b.checkByteStringIsUtf8(byteString);
        ensureIdKeysIsMutable();
        this.idKeys_.add(byteString.r());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearDescriptionKeys() {
        this.descriptionKeys_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearIdKeys() {
        this.idKeys_ = GeneratedMessageLite.emptyProtobufList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearSchemaUrl() {
        this.schemaUrl_ = getDefaultInstance().getSchemaUrl();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void clearType() {
        this.type_ = getDefaultInstance().getType();
    }

    private void ensureDescriptionKeysIsMutable() {
        oqw oqwVar = this.descriptionKeys_;
        if (((p9) oqwVar).a) {
            return;
        }
        this.descriptionKeys_ = GeneratedMessageLite.mutableCopy(oqwVar);
    }

    private void ensureIdKeysIsMutable() {
        oqw oqwVar = this.idKeys_;
        if (((p9) oqwVar).a) {
            return;
        }
        this.idKeys_ = GeneratedMessageLite.mutableCopy(oqwVar);
    }

    public static EntityRef getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    public static Builder newBuilder() {
        return (Builder) DEFAULT_INSTANCE.createBuilder();
    }

    public static EntityRef parseDelimitedFrom(InputStream inputStream) throws IOException {
        return (EntityRef) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EntityRef parseFrom(ByteBuffer byteBuffer) throws InvalidProtocolBufferException {
        return (EntityRef) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static of90 parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setDescriptionKeys(int i, String str) {
        str.getClass();
        ensureDescriptionKeysIsMutable();
        this.descriptionKeys_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setIdKeys(int i, String str) {
        str.getClass();
        ensureIdKeysIsMutable();
        this.idKeys_.set(i, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSchemaUrl(String str) {
        str.getClass();
        this.schemaUrl_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setSchemaUrlBytes(ByteString byteString) {
        b.checkByteStringIsUtf8(byteString);
        this.schemaUrl_ = byteString.r();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setType(String str) {
        str.getClass();
        this.type_ = str;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void setTypeBytes(ByteString byteString) {
        b.checkByteStringIsUtf8(byteString);
        this.type_ = byteString.r();
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        of90 of90Var;
        switch (AnonymousClass1.$SwitchMap$com$google$protobuf$GeneratedMessageLite$MethodToInvoke[methodToInvoke.ordinal()]) {
            case 1:
                return new EntityRef();
            case 2:
                return new Builder(0);
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0004\u0000\u0000\u0001\u0004\u0004\u0000\u0002\u0000\u0001Ȉ\u0002Ȉ\u0003Ț\u0004Ț", new Object[]{"schemaUrl_", "type_", "idKeys_", "descriptionKeys_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                of90 of90Var2 = PARSER;
                if (of90Var2 != null) {
                    return of90Var2;
                }
                synchronized (EntityRef.class) {
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

    @Override // io.opentelemetry.proto2.common.v1.EntityRefOrBuilder
    public String getDescriptionKeys(int i) {
        return (String) this.descriptionKeys_.get(i);
    }

    @Override // io.opentelemetry.proto2.common.v1.EntityRefOrBuilder
    public ByteString getDescriptionKeysBytes(int i) {
        return ByteString.g((String) this.descriptionKeys_.get(i));
    }

    @Override // io.opentelemetry.proto2.common.v1.EntityRefOrBuilder
    public int getDescriptionKeysCount() {
        return this.descriptionKeys_.size();
    }

    @Override // io.opentelemetry.proto2.common.v1.EntityRefOrBuilder
    public List<String> getDescriptionKeysList() {
        return this.descriptionKeys_;
    }

    @Override // io.opentelemetry.proto2.common.v1.EntityRefOrBuilder
    public String getIdKeys(int i) {
        return (String) this.idKeys_.get(i);
    }

    @Override // io.opentelemetry.proto2.common.v1.EntityRefOrBuilder
    public ByteString getIdKeysBytes(int i) {
        return ByteString.g((String) this.idKeys_.get(i));
    }

    @Override // io.opentelemetry.proto2.common.v1.EntityRefOrBuilder
    public int getIdKeysCount() {
        return this.idKeys_.size();
    }

    @Override // io.opentelemetry.proto2.common.v1.EntityRefOrBuilder
    public List<String> getIdKeysList() {
        return this.idKeys_;
    }

    @Override // io.opentelemetry.proto2.common.v1.EntityRefOrBuilder
    public String getSchemaUrl() {
        return this.schemaUrl_;
    }

    @Override // io.opentelemetry.proto2.common.v1.EntityRefOrBuilder
    public ByteString getSchemaUrlBytes() {
        return ByteString.g(this.schemaUrl_);
    }

    @Override // io.opentelemetry.proto2.common.v1.EntityRefOrBuilder
    public String getType() {
        return this.type_;
    }

    @Override // io.opentelemetry.proto2.common.v1.EntityRefOrBuilder
    public ByteString getTypeBytes() {
        return ByteString.g(this.type_);
    }

    public static final class Builder extends n implements EntityRefOrBuilder {
        private Builder() {
            super(EntityRef.DEFAULT_INSTANCE);
        }

        public Builder addAllDescriptionKeys(Iterable<String> iterable) {
            copyOnWrite();
            ((EntityRef) this.instance).addAllDescriptionKeys(iterable);
            return this;
        }

        public Builder addAllIdKeys(Iterable<String> iterable) {
            copyOnWrite();
            ((EntityRef) this.instance).addAllIdKeys(iterable);
            return this;
        }

        public Builder addDescriptionKeys(String str) {
            copyOnWrite();
            ((EntityRef) this.instance).addDescriptionKeys(str);
            return this;
        }

        public Builder addDescriptionKeysBytes(ByteString byteString) {
            copyOnWrite();
            ((EntityRef) this.instance).addDescriptionKeysBytes(byteString);
            return this;
        }

        public Builder addIdKeys(String str) {
            copyOnWrite();
            ((EntityRef) this.instance).addIdKeys(str);
            return this;
        }

        public Builder addIdKeysBytes(ByteString byteString) {
            copyOnWrite();
            ((EntityRef) this.instance).addIdKeysBytes(byteString);
            return this;
        }

        public Builder clearDescriptionKeys() {
            copyOnWrite();
            ((EntityRef) this.instance).clearDescriptionKeys();
            return this;
        }

        public Builder clearIdKeys() {
            copyOnWrite();
            ((EntityRef) this.instance).clearIdKeys();
            return this;
        }

        public Builder clearSchemaUrl() {
            copyOnWrite();
            ((EntityRef) this.instance).clearSchemaUrl();
            return this;
        }

        public Builder clearType() {
            copyOnWrite();
            ((EntityRef) this.instance).clearType();
            return this;
        }

        @Override // io.opentelemetry.proto2.common.v1.EntityRefOrBuilder
        public String getDescriptionKeys(int i) {
            return ((EntityRef) this.instance).getDescriptionKeys(i);
        }

        @Override // io.opentelemetry.proto2.common.v1.EntityRefOrBuilder
        public ByteString getDescriptionKeysBytes(int i) {
            return ((EntityRef) this.instance).getDescriptionKeysBytes(i);
        }

        @Override // io.opentelemetry.proto2.common.v1.EntityRefOrBuilder
        public int getDescriptionKeysCount() {
            return ((EntityRef) this.instance).getDescriptionKeysCount();
        }

        @Override // io.opentelemetry.proto2.common.v1.EntityRefOrBuilder
        public List<String> getDescriptionKeysList() {
            return Collections.unmodifiableList(((EntityRef) this.instance).getDescriptionKeysList());
        }

        @Override // io.opentelemetry.proto2.common.v1.EntityRefOrBuilder
        public String getIdKeys(int i) {
            return ((EntityRef) this.instance).getIdKeys(i);
        }

        @Override // io.opentelemetry.proto2.common.v1.EntityRefOrBuilder
        public ByteString getIdKeysBytes(int i) {
            return ((EntityRef) this.instance).getIdKeysBytes(i);
        }

        @Override // io.opentelemetry.proto2.common.v1.EntityRefOrBuilder
        public int getIdKeysCount() {
            return ((EntityRef) this.instance).getIdKeysCount();
        }

        @Override // io.opentelemetry.proto2.common.v1.EntityRefOrBuilder
        public List<String> getIdKeysList() {
            return Collections.unmodifiableList(((EntityRef) this.instance).getIdKeysList());
        }

        @Override // io.opentelemetry.proto2.common.v1.EntityRefOrBuilder
        public String getSchemaUrl() {
            return ((EntityRef) this.instance).getSchemaUrl();
        }

        @Override // io.opentelemetry.proto2.common.v1.EntityRefOrBuilder
        public ByteString getSchemaUrlBytes() {
            return ((EntityRef) this.instance).getSchemaUrlBytes();
        }

        @Override // io.opentelemetry.proto2.common.v1.EntityRefOrBuilder
        public String getType() {
            return ((EntityRef) this.instance).getType();
        }

        @Override // io.opentelemetry.proto2.common.v1.EntityRefOrBuilder
        public ByteString getTypeBytes() {
            return ((EntityRef) this.instance).getTypeBytes();
        }

        public Builder setDescriptionKeys(int i, String str) {
            copyOnWrite();
            ((EntityRef) this.instance).setDescriptionKeys(i, str);
            return this;
        }

        public Builder setIdKeys(int i, String str) {
            copyOnWrite();
            ((EntityRef) this.instance).setIdKeys(i, str);
            return this;
        }

        public Builder setSchemaUrl(String str) {
            copyOnWrite();
            ((EntityRef) this.instance).setSchemaUrl(str);
            return this;
        }

        public Builder setSchemaUrlBytes(ByteString byteString) {
            copyOnWrite();
            ((EntityRef) this.instance).setSchemaUrlBytes(byteString);
            return this;
        }

        public Builder setType(String str) {
            copyOnWrite();
            ((EntityRef) this.instance).setType(str);
            return this;
        }

        public Builder setTypeBytes(ByteString byteString) {
            copyOnWrite();
            ((EntityRef) this.instance).setTypeBytes(byteString);
            return this;
        }

        public /* synthetic */ Builder(int i) {
            this();
        }
    }

    public static Builder newBuilder(EntityRef entityRef) {
        return (Builder) DEFAULT_INSTANCE.createBuilder(entityRef);
    }

    public static EntityRef parseDelimitedFrom(InputStream inputStream, pyo pyoVar) throws IOException {
        return (EntityRef) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
    }

    public static EntityRef parseFrom(ByteBuffer byteBuffer, pyo pyoVar) throws InvalidProtocolBufferException {
        return (EntityRef) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, pyoVar);
    }

    public static EntityRef parseFrom(ByteString byteString) throws InvalidProtocolBufferException {
        return (EntityRef) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static EntityRef parseFrom(ByteString byteString, pyo pyoVar) throws InvalidProtocolBufferException {
        return (EntityRef) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, pyoVar);
    }

    public static EntityRef parseFrom(byte[] bArr) throws InvalidProtocolBufferException {
        return (EntityRef) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static EntityRef parseFrom(byte[] bArr, pyo pyoVar) throws InvalidProtocolBufferException {
        return (EntityRef) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, pyoVar);
    }

    public static EntityRef parseFrom(InputStream inputStream) throws IOException {
        return (EntityRef) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static EntityRef parseFrom(InputStream inputStream, pyo pyoVar) throws IOException {
        return (EntityRef) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, pyoVar);
    }

    public static EntityRef parseFrom(eac eacVar) throws IOException {
        return (EntityRef) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar);
    }

    public static EntityRef parseFrom(eac eacVar, pyo pyoVar) throws IOException {
        return (EntityRef) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, eacVar, pyoVar);
    }
}
