package com.google.crypto.tink.shaded.protobuf;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class ManifestSchemaFactory {
    public static final AnonymousClass1 EMPTY_FACTORY = new AnonymousClass1(0);
    public final Object messageInfoFactory;

    /* renamed from: com.google.crypto.tink.shaded.protobuf.ManifestSchemaFactory$1, reason: invalid class name */
    public final class AnonymousClass1 implements MessageInfoFactory {
        public static final AnonymousClass1 instance = new AnonymousClass1(1);
        public final /* synthetic */ int $r8$classId;

        public /* synthetic */ AnonymousClass1(int i) {
            this.$r8$classId = i;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageInfoFactory
        public final boolean isSupported(Class cls) {
            switch (this.$r8$classId) {
                case 0:
                    return false;
                default:
                    return GeneratedMessageLite.class.isAssignableFrom(cls);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageInfoFactory
        public final RawMessageInfo messageInfoFor(Class cls) {
            switch (this.$r8$classId) {
                case 0:
                    throw new IllegalStateException("This should never be called.");
                default:
                    if (!GeneratedMessageLite.class.isAssignableFrom(cls)) {
                        a$$ExternalSyntheticBUOutline0.m$3("Unsupported message type: ".concat(cls.getName()));
                        return null;
                    }
                    try {
                        return (RawMessageInfo) GeneratedMessageLite.getDefaultInstance(cls.asSubclass(GeneratedMessageLite.class)).dynamicMethod(3);
                    } catch (Exception e) {
                        OptionalProvider$$ExternalSyntheticLambda0.m("Unable to get message info for ".concat(cls.getName()), (Throwable) e);
                        return null;
                    }
            }
        }
    }

    public final class CompositeMessageInfoFactory implements MessageInfoFactory {
        public MessageInfoFactory[] factories;

        @Override // com.google.crypto.tink.shaded.protobuf.MessageInfoFactory
        public final boolean isSupported(Class cls) {
            for (MessageInfoFactory messageInfoFactory : this.factories) {
                if (messageInfoFactory.isSupported(cls)) {
                    return true;
                }
            }
            return false;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.MessageInfoFactory
        public final RawMessageInfo messageInfoFor(Class cls) {
            for (MessageInfoFactory messageInfoFactory : this.factories) {
                if (messageInfoFactory.isSupported(cls)) {
                    return messageInfoFactory.messageInfoFor(cls);
                }
            }
            a$$ExternalSyntheticBUOutline0.m("No factory is available for message type: ".concat(cls.getName()));
            return null;
        }
    }

    public ManifestSchemaFactory() {
        MessageInfoFactory messageInfoFactory;
        Protobuf protobuf = Protobuf.INSTANCE;
        try {
            messageInfoFactory = (MessageInfoFactory) Class.forName("com.google.crypto.tink.shaded.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
        } catch (Exception unused) {
            messageInfoFactory = EMPTY_FACTORY;
        }
        MessageInfoFactory[] messageInfoFactoryArr = {AnonymousClass1.instance, messageInfoFactory};
        CompositeMessageInfoFactory compositeMessageInfoFactory = new CompositeMessageInfoFactory();
        compositeMessageInfoFactory.factories = messageInfoFactoryArr;
        Charset charset = Internal.UTF_8;
        this.messageInfoFactory = compositeMessageInfoFactory;
    }

    public void writeGroup(int i, Object obj, Schema schema) {
        CodedOutputStream$ArrayEncoder codedOutputStream$ArrayEncoder = (CodedOutputStream$ArrayEncoder) this.messageInfoFactory;
        codedOutputStream$ArrayEncoder.writeTag(i, 3);
        schema.writeTo((AbstractMessageLite) obj, codedOutputStream$ArrayEncoder.wrapper);
        codedOutputStream$ArrayEncoder.writeTag(i, 4);
    }

    public void writeMessage(int i, Object obj, Schema schema) {
        AbstractMessageLite abstractMessageLite = (AbstractMessageLite) obj;
        CodedOutputStream$ArrayEncoder codedOutputStream$ArrayEncoder = (CodedOutputStream$ArrayEncoder) this.messageInfoFactory;
        codedOutputStream$ArrayEncoder.writeTag(i, 2);
        codedOutputStream$ArrayEncoder.writeUInt32NoTag(abstractMessageLite.getSerializedSize(schema));
        schema.writeTo(abstractMessageLite, this);
    }

    public ManifestSchemaFactory(CodedOutputStream$ArrayEncoder codedOutputStream$ArrayEncoder) {
        Internal.checkNotNull(codedOutputStream$ArrayEncoder, "output");
        this.messageInfoFactory = codedOutputStream$ArrayEncoder;
        codedOutputStream$ArrayEncoder.wrapper = this;
    }
}
