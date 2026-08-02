package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.protobuf.AbstractMessageLite;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public final class Common$OutOfProcessIOSPopupOptions extends GeneratedMessageLite<Common$OutOfProcessIOSPopupOptions, a> implements MessageLiteOrBuilder {
    private static final Common$OutOfProcessIOSPopupOptions DEFAULT_INSTANCE;
    public static final int OUT_OF_PROCESS_IOS_POPUP_FIELD_NUMBER = 1;
    private static volatile Parser<Common$OutOfProcessIOSPopupOptions> PARSER;
    private int bitField0_;
    private OutOfProcessIOSPopup outOfProcessIosPopup_;

    public static final class a extends GeneratedMessageLite.Builder<Common$OutOfProcessIOSPopupOptions, a> implements MessageLiteOrBuilder {
        public a() {
            super(Common$OutOfProcessIOSPopupOptions.DEFAULT_INSTANCE);
        }
    }

    static {
        Common$OutOfProcessIOSPopupOptions common$OutOfProcessIOSPopupOptions = new Common$OutOfProcessIOSPopupOptions();
        DEFAULT_INSTANCE = common$OutOfProcessIOSPopupOptions;
        GeneratedMessageLite.registerDefaultInstance(Common$OutOfProcessIOSPopupOptions.class, common$OutOfProcessIOSPopupOptions);
    }

    private Common$OutOfProcessIOSPopupOptions() {
    }

    private void clearOutOfProcessIosPopup() {
        this.outOfProcessIosPopup_ = null;
        this.bitField0_ &= -2;
    }

    public static Common$OutOfProcessIOSPopupOptions getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeOutOfProcessIosPopup(OutOfProcessIOSPopup outOfProcessIOSPopup) {
        outOfProcessIOSPopup.getClass();
        OutOfProcessIOSPopup outOfProcessIOSPopup2 = this.outOfProcessIosPopup_;
        if (outOfProcessIOSPopup2 != null && outOfProcessIOSPopup2 != OutOfProcessIOSPopup.getDefaultInstance()) {
            outOfProcessIOSPopup = OutOfProcessIOSPopup.newBuilder(this.outOfProcessIosPopup_).mergeFrom((OutOfProcessIOSPopup.a) outOfProcessIOSPopup).buildPartial();
        }
        this.outOfProcessIosPopup_ = outOfProcessIOSPopup;
        this.bitField0_ |= 1;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$OutOfProcessIOSPopupOptions parseDelimitedFrom(InputStream inputStream) {
        return (Common$OutOfProcessIOSPopupOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$OutOfProcessIOSPopupOptions parseFrom(ByteString byteString) {
        return (Common$OutOfProcessIOSPopupOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Parser<Common$OutOfProcessIOSPopupOptions> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setOutOfProcessIosPopup(OutOfProcessIOSPopup outOfProcessIOSPopup) {
        outOfProcessIOSPopup.getClass();
        this.outOfProcessIosPopup_ = outOfProcessIOSPopup;
        this.bitField0_ |= 1;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (C0127j.a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$OutOfProcessIOSPopupOptions();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0001\u0000\u0001\u0001\u0001\u0001\u0000\u0000\u0000\u0001ဉ\u0000", new Object[]{"bitField0_", "outOfProcessIosPopup_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$OutOfProcessIOSPopupOptions> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (Common$OutOfProcessIOSPopupOptions.class) {
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

    public OutOfProcessIOSPopup getOutOfProcessIosPopup() {
        OutOfProcessIOSPopup outOfProcessIOSPopup = this.outOfProcessIosPopup_;
        return outOfProcessIOSPopup == null ? OutOfProcessIOSPopup.getDefaultInstance() : outOfProcessIOSPopup;
    }

    public boolean hasOutOfProcessIosPopup() {
        return (this.bitField0_ & 1) != 0;
    }

    public static final class OutOfProcessIOSPopup extends GeneratedMessageLite<OutOfProcessIOSPopup, a> implements MessageLiteOrBuilder {
        private static final OutOfProcessIOSPopup DEFAULT_INSTANCE;
        public static final int LEGACY_POPUP_BEHAVIOR_FIELD_NUMBER = 1;
        public static final int LOGIN_URI_FIELD_NUMBER = 2;
        private static volatile Parser<OutOfProcessIOSPopup> PARSER = null;
        public static final int POPUP_BEHAVIOR_FIELD_NUMBER = 3;
        private int legacyPopupBehavior_;
        private String loginUri_ = "";
        private int popupBehavior_;

        public static final class a extends GeneratedMessageLite.Builder<OutOfProcessIOSPopup, a> implements MessageLiteOrBuilder {
            public a() {
                super(OutOfProcessIOSPopup.DEFAULT_INSTANCE);
            }
        }

        static {
            OutOfProcessIOSPopup outOfProcessIOSPopup = new OutOfProcessIOSPopup();
            DEFAULT_INSTANCE = outOfProcessIOSPopup;
            GeneratedMessageLite.registerDefaultInstance(OutOfProcessIOSPopup.class, outOfProcessIOSPopup);
        }

        private OutOfProcessIOSPopup() {
        }

        private void clearLegacyPopupBehavior() {
            this.legacyPopupBehavior_ = 0;
        }

        private void clearLoginUri() {
            this.loginUri_ = getDefaultInstance().getLoginUri();
        }

        private void clearPopupBehavior() {
            this.popupBehavior_ = 0;
        }

        public static OutOfProcessIOSPopup getDefaultInstance() {
            return DEFAULT_INSTANCE;
        }

        public static a newBuilder() {
            return DEFAULT_INSTANCE.createBuilder();
        }

        public static OutOfProcessIOSPopup parseDelimitedFrom(InputStream inputStream) {
            return (OutOfProcessIOSPopup) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OutOfProcessIOSPopup parseFrom(ByteString byteString) {
            return (OutOfProcessIOSPopup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
        }

        public static Parser<OutOfProcessIOSPopup> parser() {
            return DEFAULT_INSTANCE.getParserForType();
        }

        private void setLegacyPopupBehavior(b bVar) {
            this.legacyPopupBehavior_ = bVar.getNumber();
        }

        private void setLegacyPopupBehaviorValue(int i) {
            this.legacyPopupBehavior_ = i;
        }

        private void setLoginUri(String str) {
            str.getClass();
            this.loginUri_ = str;
        }

        private void setLoginUriBytes(ByteString byteString) {
            AbstractMessageLite.checkByteStringIsUtf8(byteString);
            this.loginUri_ = byteString.toStringUtf8();
        }

        private void setPopupBehavior(a0 a0Var) {
            this.popupBehavior_ = a0Var.getNumber();
        }

        private void setPopupBehaviorValue(int i) {
            this.popupBehavior_ = i;
        }

        @Override // com.google.protobuf.GeneratedMessageLite
        public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
            Parser parser;
            switch (C0127j.a[methodToInvoke.ordinal()]) {
                case 1:
                    return new OutOfProcessIOSPopup();
                case 2:
                    return new a();
                case 3:
                    return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0003\u0000\u0000\u0001\u0003\u0003\u0000\u0000\u0000\u0001\f\u0002Ȉ\u0003\f", new Object[]{"legacyPopupBehavior_", "loginUri_", "popupBehavior_"});
                case 4:
                    return DEFAULT_INSTANCE;
                case 5:
                    Parser<OutOfProcessIOSPopup> parser2 = PARSER;
                    if (parser2 != null) {
                        return parser2;
                    }
                    synchronized (OutOfProcessIOSPopup.class) {
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

        public b getLegacyPopupBehavior() {
            b forNumber = b.forNumber(this.legacyPopupBehavior_);
            return forNumber == null ? b.UNRECOGNIZED : forNumber;
        }

        public int getLegacyPopupBehaviorValue() {
            return this.legacyPopupBehavior_;
        }

        public String getLoginUri() {
            return this.loginUri_;
        }

        public ByteString getLoginUriBytes() {
            return ByteString.copyFromUtf8(this.loginUri_);
        }

        public a0 getPopupBehavior() {
            a0 forNumber = a0.forNumber(this.popupBehavior_);
            return forNumber == null ? a0.UNRECOGNIZED : forNumber;
        }

        public int getPopupBehaviorValue() {
            return this.popupBehavior_;
        }

        public static a newBuilder(OutOfProcessIOSPopup outOfProcessIOSPopup) {
            return DEFAULT_INSTANCE.createBuilder(outOfProcessIOSPopup);
        }

        public static OutOfProcessIOSPopup parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OutOfProcessIOSPopup) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static OutOfProcessIOSPopup parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
            return (OutOfProcessIOSPopup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
        }

        public static OutOfProcessIOSPopup parseFrom(CodedInputStream codedInputStream) {
            return (OutOfProcessIOSPopup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
        }

        public static OutOfProcessIOSPopup parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OutOfProcessIOSPopup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
        }

        public static OutOfProcessIOSPopup parseFrom(InputStream inputStream) {
            return (OutOfProcessIOSPopup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
        }

        public static OutOfProcessIOSPopup parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
            return (OutOfProcessIOSPopup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
        }

        public static OutOfProcessIOSPopup parseFrom(ByteBuffer byteBuffer) {
            return (OutOfProcessIOSPopup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
        }

        public static OutOfProcessIOSPopup parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
            return (OutOfProcessIOSPopup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
        }

        public static OutOfProcessIOSPopup parseFrom(byte[] bArr) {
            return (OutOfProcessIOSPopup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
        }

        public static OutOfProcessIOSPopup parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
            return (OutOfProcessIOSPopup) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
        }
    }

    public enum b implements Internal.EnumLite {
        OUT_OF_PROCESS_IOS_POPUP_BEHAVIOR_UNKNOWN(0),
        OUT_OF_PROCESS_IOS_POPUP_BEHAVIOR_DEFAULT_BROWSER(1),
        OUT_OF_PROCESS_IOS_POPUP_BEHAVIOR_AUTH_SESSION(2),
        UNRECOGNIZED(-1);

        public static final int OUT_OF_PROCESS_IOS_POPUP_BEHAVIOR_AUTH_SESSION_VALUE = 2;
        public static final int OUT_OF_PROCESS_IOS_POPUP_BEHAVIOR_DEFAULT_BROWSER_VALUE = 1;
        public static final int OUT_OF_PROCESS_IOS_POPUP_BEHAVIOR_UNKNOWN_VALUE = 0;
        public static final a b = new a();
        public final int a;

        public class a implements Internal.EnumLiteMap<b> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final b findValueByNumber(int i) {
                return b.forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$OutOfProcessIOSPopupOptions$b$b, reason: collision with other inner class name */
        public static final class C0036b implements Internal.EnumVerifier {
            public static final C0036b a = new C0036b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return b.forNumber(i) != null;
            }
        }

        b(int i) {
            this.a = i;
        }

        public static b forNumber(int i) {
            if (i == 0) {
                return OUT_OF_PROCESS_IOS_POPUP_BEHAVIOR_UNKNOWN;
            }
            if (i == 1) {
                return OUT_OF_PROCESS_IOS_POPUP_BEHAVIOR_DEFAULT_BROWSER;
            }
            if (i != 2) {
                return null;
            }
            return OUT_OF_PROCESS_IOS_POPUP_BEHAVIOR_AUTH_SESSION;
        }

        public static Internal.EnumLiteMap<b> internalGetValueMap() {
            return b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return C0036b.a;
        }

        @Override // com.google.protobuf.Internal.EnumLite
        public final int getNumber() {
            if (this != UNRECOGNIZED) {
                return this.a;
            }
            a$$ExternalSyntheticBUOutline0.m$3("Can't get the number of an unknown enum value.");
            return 0;
        }

        @Deprecated
        public static b valueOf(int i) {
            return forNumber(i);
        }
    }

    public static a newBuilder(Common$OutOfProcessIOSPopupOptions common$OutOfProcessIOSPopupOptions) {
        return DEFAULT_INSTANCE.createBuilder(common$OutOfProcessIOSPopupOptions);
    }

    public static Common$OutOfProcessIOSPopupOptions parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$OutOfProcessIOSPopupOptions) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$OutOfProcessIOSPopupOptions parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$OutOfProcessIOSPopupOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$OutOfProcessIOSPopupOptions parseFrom(CodedInputStream codedInputStream) {
        return (Common$OutOfProcessIOSPopupOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$OutOfProcessIOSPopupOptions parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$OutOfProcessIOSPopupOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Common$OutOfProcessIOSPopupOptions parseFrom(InputStream inputStream) {
        return (Common$OutOfProcessIOSPopupOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$OutOfProcessIOSPopupOptions parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$OutOfProcessIOSPopupOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$OutOfProcessIOSPopupOptions parseFrom(ByteBuffer byteBuffer) {
        return (Common$OutOfProcessIOSPopupOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Common$OutOfProcessIOSPopupOptions parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$OutOfProcessIOSPopupOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$OutOfProcessIOSPopupOptions parseFrom(byte[] bArr) {
        return (Common$OutOfProcessIOSPopupOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$OutOfProcessIOSPopupOptions parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$OutOfProcessIOSPopupOptions) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }
}
