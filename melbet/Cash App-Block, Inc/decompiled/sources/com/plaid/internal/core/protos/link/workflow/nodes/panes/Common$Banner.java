package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$ButtonContent;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalAction;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$LocalizedString;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$RenderedAssetAppearance;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public final class Common$Banner extends GeneratedMessageLite<Common$Banner, a> implements MessageLiteOrBuilder {
    public static final int APPEARANCE_FIELD_NUMBER = 7;
    public static final int BUTTON_ACTION_FIELD_NUMBER = 6;
    public static final int BUTTON_FIELD_NUMBER = 5;
    public static final int CONTENT_FIELD_NUMBER = 4;
    private static final Common$Banner DEFAULT_INSTANCE;
    public static final int ICON_FIELD_NUMBER = 2;
    private static volatile Parser<Common$Banner> PARSER = null;
    public static final int TITLE_FIELD_NUMBER = 3;
    public static final int TYPE_FIELD_NUMBER = 1;
    private int appearance_;
    private int bitField0_;
    private Common$LocalAction buttonAction_;
    private Common$ButtonContent button_;
    private Common$LocalizedString content_;
    private Common$RenderedAssetAppearance icon_;
    private Common$LocalizedString title_;
    private int type_;

    public static final class a extends GeneratedMessageLite.Builder<Common$Banner, a> implements MessageLiteOrBuilder {
        public a() {
            super(Common$Banner.DEFAULT_INSTANCE);
        }
    }

    static {
        Common$Banner common$Banner = new Common$Banner();
        DEFAULT_INSTANCE = common$Banner;
        GeneratedMessageLite.registerDefaultInstance(Common$Banner.class, common$Banner);
    }

    private Common$Banner() {
    }

    private void clearAppearance() {
        this.appearance_ = 0;
    }

    private void clearButton() {
        this.button_ = null;
        this.bitField0_ &= -9;
    }

    private void clearButtonAction() {
        this.buttonAction_ = null;
        this.bitField0_ &= -17;
    }

    private void clearContent() {
        this.content_ = null;
        this.bitField0_ &= -5;
    }

    private void clearIcon() {
        this.icon_ = null;
        this.bitField0_ &= -2;
    }

    private void clearTitle() {
        this.title_ = null;
        this.bitField0_ &= -3;
    }

    private void clearType() {
        this.type_ = 0;
    }

    public static Common$Banner getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeButton(Common$ButtonContent common$ButtonContent) {
        common$ButtonContent.getClass();
        Common$ButtonContent common$ButtonContent2 = this.button_;
        if (common$ButtonContent2 != null && common$ButtonContent2 != Common$ButtonContent.getDefaultInstance()) {
            common$ButtonContent = Common$ButtonContent.newBuilder(this.button_).mergeFrom((Common$ButtonContent.a) common$ButtonContent).buildPartial();
        }
        this.button_ = common$ButtonContent;
        this.bitField0_ |= 8;
    }

    private void mergeButtonAction(Common$LocalAction common$LocalAction) {
        common$LocalAction.getClass();
        Common$LocalAction common$LocalAction2 = this.buttonAction_;
        if (common$LocalAction2 != null && common$LocalAction2 != Common$LocalAction.getDefaultInstance()) {
            common$LocalAction = Common$LocalAction.newBuilder(this.buttonAction_).mergeFrom((Common$LocalAction.b) common$LocalAction).buildPartial();
        }
        this.buttonAction_ = common$LocalAction;
        this.bitField0_ |= 16;
    }

    private void mergeContent(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        Common$LocalizedString common$LocalizedString2 = this.content_;
        if (common$LocalizedString2 != null && common$LocalizedString2 != Common$LocalizedString.getDefaultInstance()) {
            common$LocalizedString = Common$LocalizedString.newBuilder(this.content_).mergeFrom((Common$LocalizedString.a) common$LocalizedString).buildPartial();
        }
        this.content_ = common$LocalizedString;
        this.bitField0_ |= 4;
    }

    private void mergeIcon(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        common$RenderedAssetAppearance.getClass();
        Common$RenderedAssetAppearance common$RenderedAssetAppearance2 = this.icon_;
        if (common$RenderedAssetAppearance2 != null && common$RenderedAssetAppearance2 != Common$RenderedAssetAppearance.getDefaultInstance()) {
            common$RenderedAssetAppearance = Common$RenderedAssetAppearance.newBuilder(this.icon_).mergeFrom((Common$RenderedAssetAppearance.a) common$RenderedAssetAppearance).buildPartial();
        }
        this.icon_ = common$RenderedAssetAppearance;
        this.bitField0_ |= 1;
    }

    private void mergeTitle(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        Common$LocalizedString common$LocalizedString2 = this.title_;
        if (common$LocalizedString2 != null && common$LocalizedString2 != Common$LocalizedString.getDefaultInstance()) {
            common$LocalizedString = Common$LocalizedString.newBuilder(this.title_).mergeFrom((Common$LocalizedString.a) common$LocalizedString).buildPartial();
        }
        this.title_ = common$LocalizedString;
        this.bitField0_ |= 2;
    }

    public static a newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$Banner parseDelimitedFrom(InputStream inputStream) {
        return (Common$Banner) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$Banner parseFrom(ByteString byteString) {
        return (Common$Banner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Parser<Common$Banner> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAppearance(EnumC0131n enumC0131n) {
        this.appearance_ = enumC0131n.getNumber();
    }

    private void setAppearanceValue(int i) {
        this.appearance_ = i;
    }

    private void setButton(Common$ButtonContent common$ButtonContent) {
        common$ButtonContent.getClass();
        this.button_ = common$ButtonContent;
        this.bitField0_ |= 8;
    }

    private void setButtonAction(Common$LocalAction common$LocalAction) {
        common$LocalAction.getClass();
        this.buttonAction_ = common$LocalAction;
        this.bitField0_ |= 16;
    }

    private void setContent(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        this.content_ = common$LocalizedString;
        this.bitField0_ |= 4;
    }

    private void setIcon(Common$RenderedAssetAppearance common$RenderedAssetAppearance) {
        common$RenderedAssetAppearance.getClass();
        this.icon_ = common$RenderedAssetAppearance;
        this.bitField0_ |= 1;
    }

    private void setTitle(Common$LocalizedString common$LocalizedString) {
        common$LocalizedString.getClass();
        this.title_ = common$LocalizedString;
        this.bitField0_ |= 2;
    }

    private void setType(EnumC0132o enumC0132o) {
        this.type_ = enumC0132o.getNumber();
    }

    private void setTypeValue(int i) {
        this.type_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (C0127j.a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$Banner();
            case 2:
                return new a();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\u0007\u0000\u0001\u0001\u0007\u0007\u0000\u0000\u0000\u0001\f\u0002ဉ\u0000\u0003ဉ\u0001\u0004ဉ\u0002\u0005ဉ\u0003\u0006ဉ\u0004\u0007\f", new Object[]{"bitField0_", "type_", "icon_", "title_", "content_", "button_", "buttonAction_", "appearance_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$Banner> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (Common$Banner.class) {
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

    public EnumC0131n getAppearance() {
        EnumC0131n forNumber = EnumC0131n.forNumber(this.appearance_);
        return forNumber == null ? EnumC0131n.UNRECOGNIZED : forNumber;
    }

    public int getAppearanceValue() {
        return this.appearance_;
    }

    public Common$ButtonContent getButton() {
        Common$ButtonContent common$ButtonContent = this.button_;
        return common$ButtonContent == null ? Common$ButtonContent.getDefaultInstance() : common$ButtonContent;
    }

    public Common$LocalAction getButtonAction() {
        Common$LocalAction common$LocalAction = this.buttonAction_;
        return common$LocalAction == null ? Common$LocalAction.getDefaultInstance() : common$LocalAction;
    }

    public Common$LocalizedString getContent() {
        Common$LocalizedString common$LocalizedString = this.content_;
        return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public Common$RenderedAssetAppearance getIcon() {
        Common$RenderedAssetAppearance common$RenderedAssetAppearance = this.icon_;
        return common$RenderedAssetAppearance == null ? Common$RenderedAssetAppearance.getDefaultInstance() : common$RenderedAssetAppearance;
    }

    public Common$LocalizedString getTitle() {
        Common$LocalizedString common$LocalizedString = this.title_;
        return common$LocalizedString == null ? Common$LocalizedString.getDefaultInstance() : common$LocalizedString;
    }

    public EnumC0132o getType() {
        EnumC0132o forNumber = EnumC0132o.forNumber(this.type_);
        return forNumber == null ? EnumC0132o.UNRECOGNIZED : forNumber;
    }

    public int getTypeValue() {
        return this.type_;
    }

    public boolean hasButton() {
        return (this.bitField0_ & 8) != 0;
    }

    public boolean hasButtonAction() {
        return (this.bitField0_ & 16) != 0;
    }

    public boolean hasContent() {
        return (this.bitField0_ & 4) != 0;
    }

    public boolean hasIcon() {
        return (this.bitField0_ & 1) != 0;
    }

    public boolean hasTitle() {
        return (this.bitField0_ & 2) != 0;
    }

    public static a newBuilder(Common$Banner common$Banner) {
        return DEFAULT_INSTANCE.createBuilder(common$Banner);
    }

    public static Common$Banner parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Banner) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$Banner parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Banner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$Banner parseFrom(CodedInputStream codedInputStream) {
        return (Common$Banner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$Banner parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Banner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Common$Banner parseFrom(InputStream inputStream) {
        return (Common$Banner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$Banner parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Banner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$Banner parseFrom(ByteBuffer byteBuffer) {
        return (Common$Banner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Common$Banner parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Banner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$Banner parseFrom(byte[] bArr) {
        return (Common$Banner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$Banner parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$Banner) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }
}
