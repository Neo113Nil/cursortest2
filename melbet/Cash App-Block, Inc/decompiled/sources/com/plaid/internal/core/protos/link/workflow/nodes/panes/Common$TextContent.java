package com.plaid.internal.core.protos.link.workflow.nodes.panes;

import bo.app.a$$ExternalSyntheticBUOutline0;
import com.google.firebase.components.OptionalProvider$$ExternalSyntheticLambda0;
import com.google.protobuf.ByteString;
import com.google.protobuf.CodedInputStream;
import com.google.protobuf.ExtensionRegistryLite;
import com.google.protobuf.GeneratedMessageLite;
import com.google.protobuf.Internal;
import com.google.protobuf.MessageLiteOrBuilder;
import com.google.protobuf.Parser;
import com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$AttributedLocalizedString;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* loaded from: classes5.dex */
public final class Common$TextContent extends GeneratedMessageLite<Common$TextContent, c> implements MessageLiteOrBuilder {
    public static final int ALIGN_FIELD_NUMBER = 5;
    public static final int AS_FIELD_NUMBER = 1;
    public static final int CASING_FIELD_NUMBER = 7;
    public static final int CONTENT_FIELD_NUMBER = 4;
    public static final int CONTRAST_FIELD_NUMBER = 8;
    private static final Common$TextContent DEFAULT_INSTANCE;
    public static final int FONT_FIELD_NUMBER = 6;
    public static final int LINE_HEIGHT_FIELD_NUMBER = 9;
    private static volatile Parser<Common$TextContent> PARSER = null;
    public static final int SIZE_FIELD_NUMBER = 2;
    public static final int WEIGHT_FIELD_NUMBER = 3;
    private int align_;
    private int as_;
    private int bitField0_;
    private int casing_;
    private Common$AttributedLocalizedString content_;
    private int contrast_;
    private int font_;
    private int lineHeight_;
    private int size_;
    private int weight_;

    public static final class c extends GeneratedMessageLite.Builder<Common$TextContent, c> implements MessageLiteOrBuilder {
        public c() {
            super(Common$TextContent.DEFAULT_INSTANCE);
        }
    }

    static {
        Common$TextContent common$TextContent = new Common$TextContent();
        DEFAULT_INSTANCE = common$TextContent;
        GeneratedMessageLite.registerDefaultInstance(Common$TextContent.class, common$TextContent);
    }

    private Common$TextContent() {
    }

    private void clearAlign() {
        this.align_ = 0;
    }

    private void clearAs() {
        this.as_ = 0;
    }

    private void clearCasing() {
        this.casing_ = 0;
    }

    private void clearContent() {
        this.content_ = null;
        this.bitField0_ &= -2;
    }

    private void clearContrast() {
        this.contrast_ = 0;
    }

    private void clearFont() {
        this.font_ = 0;
    }

    private void clearLineHeight() {
        this.lineHeight_ = 0;
    }

    private void clearSize() {
        this.size_ = 0;
    }

    private void clearWeight() {
        this.weight_ = 0;
    }

    public static Common$TextContent getDefaultInstance() {
        return DEFAULT_INSTANCE;
    }

    private void mergeContent(Common$AttributedLocalizedString common$AttributedLocalizedString) {
        common$AttributedLocalizedString.getClass();
        Common$AttributedLocalizedString common$AttributedLocalizedString2 = this.content_;
        if (common$AttributedLocalizedString2 != null && common$AttributedLocalizedString2 != Common$AttributedLocalizedString.getDefaultInstance()) {
            common$AttributedLocalizedString = Common$AttributedLocalizedString.newBuilder(this.content_).mergeFrom((Common$AttributedLocalizedString.c) common$AttributedLocalizedString).buildPartial();
        }
        this.content_ = common$AttributedLocalizedString;
        this.bitField0_ |= 1;
    }

    public static c newBuilder() {
        return DEFAULT_INSTANCE.createBuilder();
    }

    public static Common$TextContent parseDelimitedFrom(InputStream inputStream) {
        return (Common$TextContent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$TextContent parseFrom(ByteString byteString) {
        return (Common$TextContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString);
    }

    public static Parser<Common$TextContent> parser() {
        return DEFAULT_INSTANCE.getParserForType();
    }

    private void setAlign(a aVar) {
        this.align_ = aVar.getNumber();
    }

    private void setAlignValue(int i) {
        this.align_ = i;
    }

    private void setAs(b bVar) {
        this.as_ = bVar.getNumber();
    }

    private void setAsValue(int i) {
        this.as_ = i;
    }

    private void setCasing(d dVar) {
        this.casing_ = dVar.getNumber();
    }

    private void setCasingValue(int i) {
        this.casing_ = i;
    }

    private void setContent(Common$AttributedLocalizedString common$AttributedLocalizedString) {
        common$AttributedLocalizedString.getClass();
        this.content_ = common$AttributedLocalizedString;
        this.bitField0_ |= 1;
    }

    private void setContrast(e eVar) {
        this.contrast_ = eVar.getNumber();
    }

    private void setContrastValue(int i) {
        this.contrast_ = i;
    }

    private void setFont(f fVar) {
        this.font_ = fVar.getNumber();
    }

    private void setFontValue(int i) {
        this.font_ = i;
    }

    private void setLineHeight(int i) {
        this.lineHeight_ = i;
    }

    private void setSize(int i) {
        this.size_ = i;
    }

    private void setWeight(g gVar) {
        this.weight_ = gVar.getNumber();
    }

    private void setWeightValue(int i) {
        this.weight_ = i;
    }

    @Override // com.google.protobuf.GeneratedMessageLite
    public final Object dynamicMethod(GeneratedMessageLite.MethodToInvoke methodToInvoke, Object obj, Object obj2) {
        Parser parser;
        switch (C0127j.a[methodToInvoke.ordinal()]) {
            case 1:
                return new Common$TextContent();
            case 2:
                return new c();
            case 3:
                return GeneratedMessageLite.newMessageInfo(DEFAULT_INSTANCE, "\u0000\t\u0000\u0001\u0001\t\t\u0000\u0000\u0000\u0001\f\u0002\u000b\u0003\f\u0004ဉ\u0000\u0005\f\u0006\f\u0007\f\b\f\t\u000b", new Object[]{"bitField0_", "as_", "size_", "weight_", "content_", "align_", "font_", "casing_", "contrast_", "lineHeight_"});
            case 4:
                return DEFAULT_INSTANCE;
            case 5:
                Parser<Common$TextContent> parser2 = PARSER;
                if (parser2 != null) {
                    return parser2;
                }
                synchronized (Common$TextContent.class) {
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

    public a getAlign() {
        a forNumber = a.forNumber(this.align_);
        return forNumber == null ? a.UNRECOGNIZED : forNumber;
    }

    public int getAlignValue() {
        return this.align_;
    }

    public b getAs() {
        b forNumber = b.forNumber(this.as_);
        return forNumber == null ? b.UNRECOGNIZED : forNumber;
    }

    public int getAsValue() {
        return this.as_;
    }

    public d getCasing() {
        d forNumber = d.forNumber(this.casing_);
        return forNumber == null ? d.UNRECOGNIZED : forNumber;
    }

    public int getCasingValue() {
        return this.casing_;
    }

    public Common$AttributedLocalizedString getContent() {
        Common$AttributedLocalizedString common$AttributedLocalizedString = this.content_;
        return common$AttributedLocalizedString == null ? Common$AttributedLocalizedString.getDefaultInstance() : common$AttributedLocalizedString;
    }

    public e getContrast() {
        e forNumber = e.forNumber(this.contrast_);
        return forNumber == null ? e.UNRECOGNIZED : forNumber;
    }

    public int getContrastValue() {
        return this.contrast_;
    }

    public f getFont() {
        f forNumber = f.forNumber(this.font_);
        return forNumber == null ? f.UNRECOGNIZED : forNumber;
    }

    public int getFontValue() {
        return this.font_;
    }

    public int getLineHeight() {
        return this.lineHeight_;
    }

    public int getSize() {
        return this.size_;
    }

    public g getWeight() {
        g forNumber = g.forNumber(this.weight_);
        return forNumber == null ? g.UNRECOGNIZED : forNumber;
    }

    public int getWeightValue() {
        return this.weight_;
    }

    public boolean hasContent() {
        return (this.bitField0_ & 1) != 0;
    }

    public enum a implements Internal.EnumLite {
        ALIGN_START(0),
        ALIGN_END(1),
        ALIGN_LEFT(2),
        ALIGN_RIGHT(3),
        ALIGN_CENTER(4),
        UNRECOGNIZED(-1);

        public static final int ALIGN_CENTER_VALUE = 4;
        public static final int ALIGN_END_VALUE = 1;
        public static final int ALIGN_LEFT_VALUE = 2;
        public static final int ALIGN_RIGHT_VALUE = 3;
        public static final int ALIGN_START_VALUE = 0;
        public static final C0042a b = new C0042a();
        public final int a;

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent$a$a, reason: collision with other inner class name */
        public class C0042a implements Internal.EnumLiteMap<a> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final a findValueByNumber(int i) {
                return a.forNumber(i);
            }
        }

        public static final class b implements Internal.EnumVerifier {
            public static final b a = new b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return a.forNumber(i) != null;
            }
        }

        a(int i) {
            this.a = i;
        }

        public static a forNumber(int i) {
            if (i == 0) {
                return ALIGN_START;
            }
            if (i == 1) {
                return ALIGN_END;
            }
            if (i == 2) {
                return ALIGN_LEFT;
            }
            if (i == 3) {
                return ALIGN_RIGHT;
            }
            if (i != 4) {
                return null;
            }
            return ALIGN_CENTER;
        }

        public static Internal.EnumLiteMap<a> internalGetValueMap() {
            return b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.a;
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
        public static a valueOf(int i) {
            return forNumber(i);
        }
    }

    public enum b implements Internal.EnumLite {
        AS_CODE(0),
        AS_H1(1),
        AS_H2(2),
        AS_H3(3),
        AS_H4(4),
        AS_H5(5),
        AS_H6(6),
        AS_P(7),
        AS_SMALL(8),
        AS_SPAN(9),
        UNRECOGNIZED(-1);

        public static final int AS_CODE_VALUE = 0;
        public static final int AS_H1_VALUE = 1;
        public static final int AS_H2_VALUE = 2;
        public static final int AS_H3_VALUE = 3;
        public static final int AS_H4_VALUE = 4;
        public static final int AS_H5_VALUE = 5;
        public static final int AS_H6_VALUE = 6;
        public static final int AS_P_VALUE = 7;
        public static final int AS_SMALL_VALUE = 8;
        public static final int AS_SPAN_VALUE = 9;
        public static final a b = new a();
        public final int a;

        public class a implements Internal.EnumLiteMap<b> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final b findValueByNumber(int i) {
                return b.forNumber(i);
            }
        }

        /* renamed from: com.plaid.internal.core.protos.link.workflow.nodes.panes.Common$TextContent$b$b, reason: collision with other inner class name */
        public static final class C0043b implements Internal.EnumVerifier {
            public static final C0043b a = new C0043b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return b.forNumber(i) != null;
            }
        }

        b(int i) {
            this.a = i;
        }

        public static b forNumber(int i) {
            switch (i) {
                case 0:
                    return AS_CODE;
                case 1:
                    return AS_H1;
                case 2:
                    return AS_H2;
                case 3:
                    return AS_H3;
                case 4:
                    return AS_H4;
                case 5:
                    return AS_H5;
                case 6:
                    return AS_H6;
                case 7:
                    return AS_P;
                case 8:
                    return AS_SMALL;
                case 9:
                    return AS_SPAN;
                default:
                    return null;
            }
        }

        public static Internal.EnumLiteMap<b> internalGetValueMap() {
            return b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return C0043b.a;
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

    public enum d implements Internal.EnumLite {
        CASING_NONE(0),
        CASING_CAPITALIZE(1),
        CASING_LOWERCASE(2),
        CASING_UPPERCASE(3),
        UNRECOGNIZED(-1);

        public static final int CASING_CAPITALIZE_VALUE = 1;
        public static final int CASING_LOWERCASE_VALUE = 2;
        public static final int CASING_NONE_VALUE = 0;
        public static final int CASING_UPPERCASE_VALUE = 3;
        public static final a b = new a();
        public final int a;

        public class a implements Internal.EnumLiteMap<d> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final d findValueByNumber(int i) {
                return d.forNumber(i);
            }
        }

        public static final class b implements Internal.EnumVerifier {
            public static final b a = new b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return d.forNumber(i) != null;
            }
        }

        d(int i) {
            this.a = i;
        }

        public static d forNumber(int i) {
            if (i == 0) {
                return CASING_NONE;
            }
            if (i == 1) {
                return CASING_CAPITALIZE;
            }
            if (i == 2) {
                return CASING_LOWERCASE;
            }
            if (i != 3) {
                return null;
            }
            return CASING_UPPERCASE;
        }

        public static Internal.EnumLiteMap<d> internalGetValueMap() {
            return b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.a;
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
        public static d valueOf(int i) {
            return forNumber(i);
        }
    }

    public enum e implements Internal.EnumLite {
        CONTRAST_DEFAULT(0),
        CONTRAST_LOW(1),
        CONTRAST_HIGH(2),
        CONTRAST_INVERSE_DEFAULT(3),
        CONTRAST_INVERSE_LOW(4),
        CONTRAST_INVERSE_HIGH(5),
        UNRECOGNIZED(-1);

        public static final int CONTRAST_DEFAULT_VALUE = 0;
        public static final int CONTRAST_HIGH_VALUE = 2;
        public static final int CONTRAST_INVERSE_DEFAULT_VALUE = 3;
        public static final int CONTRAST_INVERSE_HIGH_VALUE = 5;
        public static final int CONTRAST_INVERSE_LOW_VALUE = 4;
        public static final int CONTRAST_LOW_VALUE = 1;
        public static final a b = new a();
        public final int a;

        public class a implements Internal.EnumLiteMap<e> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final e findValueByNumber(int i) {
                return e.forNumber(i);
            }
        }

        public static final class b implements Internal.EnumVerifier {
            public static final b a = new b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return e.forNumber(i) != null;
            }
        }

        e(int i) {
            this.a = i;
        }

        public static e forNumber(int i) {
            if (i == 0) {
                return CONTRAST_DEFAULT;
            }
            if (i == 1) {
                return CONTRAST_LOW;
            }
            if (i == 2) {
                return CONTRAST_HIGH;
            }
            if (i == 3) {
                return CONTRAST_INVERSE_DEFAULT;
            }
            if (i == 4) {
                return CONTRAST_INVERSE_LOW;
            }
            if (i != 5) {
                return null;
            }
            return CONTRAST_INVERSE_HIGH;
        }

        public static Internal.EnumLiteMap<e> internalGetValueMap() {
            return b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.a;
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
        public static e valueOf(int i) {
            return forNumber(i);
        }
    }

    public enum f implements Internal.EnumLite {
        FONT_SANS(0),
        FONT_MONO(1),
        UNRECOGNIZED(-1);

        public static final int FONT_MONO_VALUE = 1;
        public static final int FONT_SANS_VALUE = 0;
        public static final a b = new a();
        public final int a;

        public class a implements Internal.EnumLiteMap<f> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final f findValueByNumber(int i) {
                return f.forNumber(i);
            }
        }

        public static final class b implements Internal.EnumVerifier {
            public static final b a = new b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return f.forNumber(i) != null;
            }
        }

        f(int i) {
            this.a = i;
        }

        public static f forNumber(int i) {
            if (i == 0) {
                return FONT_SANS;
            }
            if (i != 1) {
                return null;
            }
            return FONT_MONO;
        }

        public static Internal.EnumLiteMap<f> internalGetValueMap() {
            return b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.a;
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
        public static f valueOf(int i) {
            return forNumber(i);
        }
    }

    public enum g implements Internal.EnumLite {
        FONT_WEIGHT_NORMAL(0),
        FONT_WEIGHT_BOLD(1),
        FONT_WEIGHT_MEDIUM(2),
        FONT_WEIGHT_SEMI_BOLD(3),
        FONT_WEIGHT_EXTRA_BOLD(4),
        UNRECOGNIZED(-1);

        public static final int FONT_WEIGHT_BOLD_VALUE = 1;
        public static final int FONT_WEIGHT_EXTRA_BOLD_VALUE = 4;
        public static final int FONT_WEIGHT_MEDIUM_VALUE = 2;
        public static final int FONT_WEIGHT_NORMAL_VALUE = 0;
        public static final int FONT_WEIGHT_SEMI_BOLD_VALUE = 3;
        public static final a b = new a();
        public final int a;

        public class a implements Internal.EnumLiteMap<g> {
            @Override // com.google.protobuf.Internal.EnumLiteMap
            public final g findValueByNumber(int i) {
                return g.forNumber(i);
            }
        }

        public static final class b implements Internal.EnumVerifier {
            public static final b a = new b();

            @Override // com.google.protobuf.Internal.EnumVerifier
            public final boolean isInRange(int i) {
                return g.forNumber(i) != null;
            }
        }

        g(int i) {
            this.a = i;
        }

        public static g forNumber(int i) {
            if (i == 0) {
                return FONT_WEIGHT_NORMAL;
            }
            if (i == 1) {
                return FONT_WEIGHT_BOLD;
            }
            if (i == 2) {
                return FONT_WEIGHT_MEDIUM;
            }
            if (i == 3) {
                return FONT_WEIGHT_SEMI_BOLD;
            }
            if (i != 4) {
                return null;
            }
            return FONT_WEIGHT_EXTRA_BOLD;
        }

        public static Internal.EnumLiteMap<g> internalGetValueMap() {
            return b;
        }

        public static Internal.EnumVerifier internalGetVerifier() {
            return b.a;
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
        public static g valueOf(int i) {
            return forNumber(i);
        }
    }

    public static c newBuilder(Common$TextContent common$TextContent) {
        return DEFAULT_INSTANCE.createBuilder(common$TextContent);
    }

    public static Common$TextContent parseDelimitedFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$TextContent) GeneratedMessageLite.parseDelimitedFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$TextContent parseFrom(ByteString byteString, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$TextContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteString, extensionRegistryLite);
    }

    public static Common$TextContent parseFrom(CodedInputStream codedInputStream) {
        return (Common$TextContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream);
    }

    public static Common$TextContent parseFrom(CodedInputStream codedInputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$TextContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, codedInputStream, extensionRegistryLite);
    }

    public static Common$TextContent parseFrom(InputStream inputStream) {
        return (Common$TextContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream);
    }

    public static Common$TextContent parseFrom(InputStream inputStream, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$TextContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, inputStream, extensionRegistryLite);
    }

    public static Common$TextContent parseFrom(ByteBuffer byteBuffer) {
        return (Common$TextContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer);
    }

    public static Common$TextContent parseFrom(ByteBuffer byteBuffer, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$TextContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, byteBuffer, extensionRegistryLite);
    }

    public static Common$TextContent parseFrom(byte[] bArr) {
        return (Common$TextContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr);
    }

    public static Common$TextContent parseFrom(byte[] bArr, ExtensionRegistryLite extensionRegistryLite) {
        return (Common$TextContent) GeneratedMessageLite.parseFrom(DEFAULT_INSTANCE, bArr, extensionRegistryLite);
    }
}
