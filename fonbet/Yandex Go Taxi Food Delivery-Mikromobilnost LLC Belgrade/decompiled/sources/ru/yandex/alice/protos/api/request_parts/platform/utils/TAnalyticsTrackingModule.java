package ru.yandex.alice.protos.api.request_parts.platform.utils;

import NYT.platform.utils.ColumnNameOption;
import NYT.platform.utils.DefaultFieldFlagsOption;
import NYT.platform.utils.EWrapperFieldFlag;
import com.squareup.wire.EnumAdapter;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireEnum;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import defpackage.g0c;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.k4o;
import defpackage.qoi0;
import defpackage.unr0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.ByteString;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.alice.protos.api.request_parts.platform.utils.TAnalyticsTrackingModule;

@DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u0000 !2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0002!\"B9\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0004\u0012\b\b\u0002\u0010\b\u001a\u00020\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0018\u001a\u00020\u0002H\u0017J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cH\u0096\u0002J\b\u0010\u001d\u001a\u00020\u001eH\u0016J\b\u0010\u001f\u001a\u00020\u0004H\u0016J8\u0010 \u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\u00042\b\b\u0002\u0010\b\u001a\u00020\u00042\b\b\u0002\u0010\t\u001a\u00020\nR\u001c\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\r\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0011\u0010\u000e\u001a\u0004\b\u0012\u0010\u0013R\u001c\u0010\u0007\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0014\u0010\u000e\u001a\u0004\b\u0015\u0010\u0010R\u001c\u0010\b\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0016\u0010\u000e\u001a\u0004\b\u0017\u0010\u0010¨\u0006#"}, d2 = {"Lru/yandex/alice/protos/api/request_parts/platform/utils/TAnalyticsTrackingModule;", "Lcom/squareup/wire/Message;", "", "ProductScenario", "", "Origin", "Lru/yandex/alice/protos/api/request_parts/platform/utils/TAnalyticsTrackingModule$EOrigin;", "Purpose", "OriginInfo", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Lru/yandex/alice/protos/api/request_parts/platform/utils/TAnalyticsTrackingModule$EOrigin;Ljava/lang/String;Ljava/lang/String;Lokio/ByteString;)V", "getProductScenario$annotations", "()V", "getProductScenario", "()Ljava/lang/String;", "getOrigin$annotations", "getOrigin", "()Lru/yandex/alice/protos/api/request_parts/platform/utils/TAnalyticsTrackingModule$EOrigin;", "getPurpose$annotations", "getPurpose", "getOriginInfo$annotations", "getOriginInfo", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "EOrigin", "quark-platform-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TAnalyticsTrackingModule extends Message {
    public static final ProtoAdapter<TAnalyticsTrackingModule> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "ru.yandex.alice.protos.api.request_parts.platform.utils.TAnalyticsTrackingModule$EOrigin#ADAPTER", jsonName = "origin", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final EOrigin Origin;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "origin_info", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 4)
    private final String OriginInfo;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "product_scenario", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String ProductScenario;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "purpose", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 3)
    private final String Purpose;

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final g0c a = qoi0.a(TAnalyticsTrackingModule.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TAnalyticsTrackingModule>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.api.request_parts.platform.utils.TAnalyticsTrackingModule$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public TAnalyticsTrackingModule decode(ProtoReader reader) {
                TAnalyticsTrackingModule.EOrigin eOrigin = TAnalyticsTrackingModule.EOrigin.Undefined;
                long beginMessage = reader.beginMessage();
                String str = "";
                String str2 = str;
                String str3 = str2;
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new TAnalyticsTrackingModule(str, eOrigin, str2, str3, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        str = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag == 2) {
                        try {
                            eOrigin = TAnalyticsTrackingModule.EOrigin.ADAPTER.decode(reader);
                        } catch (ProtoAdapter.EnumConstantNotFoundException e) {
                            reader.addUnknownField(nextTag, FieldEncoding.VARINT, Long.valueOf(e.value));
                        }
                    } else if (nextTag == 3) {
                        str2 = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag != 4) {
                        reader.readUnknownField(nextTag);
                    } else {
                        str3 = ProtoAdapter.STRING.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TAnalyticsTrackingModule value) {
                if (!jl40.l(value.getProductScenario(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getProductScenario());
                }
                if (value.getOrigin() != TAnalyticsTrackingModule.EOrigin.Undefined) {
                    TAnalyticsTrackingModule.EOrigin.ADAPTER.encodeWithTag(writer, 2, (int) value.getOrigin());
                }
                if (!jl40.l(value.getPurpose(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getPurpose());
                }
                if (!jl40.l(value.getOriginInfo(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getOriginInfo());
                }
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TAnalyticsTrackingModule value) {
                int h = value.unknownFields().h();
                if (!jl40.l(value.getProductScenario(), "")) {
                    h += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getProductScenario());
                }
                if (value.getOrigin() != TAnalyticsTrackingModule.EOrigin.Undefined) {
                    h += TAnalyticsTrackingModule.EOrigin.ADAPTER.encodedSizeWithTag(2, value.getOrigin());
                }
                if (!jl40.l(value.getPurpose(), "")) {
                    h += ProtoAdapter.STRING.encodedSizeWithTag(3, value.getPurpose());
                }
                return !jl40.l(value.getOriginInfo(), "") ? ProtoAdapter.STRING.encodedSizeWithTag(4, value.getOriginInfo()) + h : h;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TAnalyticsTrackingModule redact(TAnalyticsTrackingModule value) {
                return TAnalyticsTrackingModule.copy$default(value, null, null, null, null, ByteString.c, 15, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TAnalyticsTrackingModule value) {
                writer.writeBytes(value.unknownFields());
                if (!jl40.l(value.getOriginInfo(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 4, (int) value.getOriginInfo());
                }
                if (!jl40.l(value.getPurpose(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getPurpose());
                }
                if (value.getOrigin() != TAnalyticsTrackingModule.EOrigin.Undefined) {
                    TAnalyticsTrackingModule.EOrigin.ADAPTER.encodeWithTag(writer, 2, (int) value.getOrigin());
                }
                if (jl40.l(value.getProductScenario(), "")) {
                    return;
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getProductScenario());
            }
        };
    }

    public /* synthetic */ TAnalyticsTrackingModule(String str, EOrigin eOrigin, String str2, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? EOrigin.Undefined : eOrigin, (i & 4) != 0 ? "" : str2, (i & 8) != 0 ? "" : str3, (i & 16) != 0 ? ByteString.c : byteString);
    }

    public static /* synthetic */ TAnalyticsTrackingModule copy$default(TAnalyticsTrackingModule tAnalyticsTrackingModule, String str, EOrigin eOrigin, String str2, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tAnalyticsTrackingModule.ProductScenario;
        }
        if ((i & 2) != 0) {
            eOrigin = tAnalyticsTrackingModule.Origin;
        }
        if ((i & 4) != 0) {
            str2 = tAnalyticsTrackingModule.Purpose;
        }
        if ((i & 8) != 0) {
            str3 = tAnalyticsTrackingModule.OriginInfo;
        }
        if ((i & 16) != 0) {
            byteString = tAnalyticsTrackingModule.unknownFields();
        }
        ByteString byteString2 = byteString;
        String str4 = str2;
        return tAnalyticsTrackingModule.copy(str, eOrigin, str4, str3, byteString2);
    }

    @ColumnNameOption("origin")
    public static /* synthetic */ void getOrigin$annotations() {
    }

    @ColumnNameOption("origin_info")
    public static /* synthetic */ void getOriginInfo$annotations() {
    }

    @jxi
    @ColumnNameOption("product_scenario")
    public static /* synthetic */ void getProductScenario$annotations() {
    }

    @ColumnNameOption("purpose")
    public static /* synthetic */ void getPurpose$annotations() {
    }

    public final TAnalyticsTrackingModule copy(String ProductScenario, EOrigin Origin, String Purpose, String OriginInfo, ByteString unknownFields) {
        return new TAnalyticsTrackingModule(ProductScenario, Origin, Purpose, OriginInfo, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TAnalyticsTrackingModule)) {
            return false;
        }
        TAnalyticsTrackingModule tAnalyticsTrackingModule = (TAnalyticsTrackingModule) other;
        return jl40.l(unknownFields(), tAnalyticsTrackingModule.unknownFields()) && jl40.l(this.ProductScenario, tAnalyticsTrackingModule.ProductScenario) && this.Origin == tAnalyticsTrackingModule.Origin && jl40.l(this.Purpose, tAnalyticsTrackingModule.Purpose) && jl40.l(this.OriginInfo, tAnalyticsTrackingModule.OriginInfo);
    }

    public final EOrigin getOrigin() {
        return this.Origin;
    }

    public final String getOriginInfo() {
        return this.OriginInfo;
    }

    public final String getProductScenario() {
        return this.ProductScenario;
    }

    public final String getPurpose() {
        return this.Purpose;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = this.OriginInfo.hashCode() + unr0.b((this.Origin.hashCode() + unr0.b(unknownFields().hashCode() * 37, 37, this.ProductScenario)) * 37, 37, this.Purpose);
        this.hashCode = hashCode;
        return hashCode;
    }

    @jxi
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m512newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        unr0.B("ProductScenario=", Internal.sanitize(this.ProductScenario), arrayList);
        arrayList.add("Origin=" + this.Origin);
        unr0.B("Purpose=", Internal.sanitize(this.Purpose), arrayList);
        unr0.B("OriginInfo=", Internal.sanitize(this.OriginInfo), arrayList);
        return a.X(arrayList, Extension.FIX_SPACE, "TAnalyticsTrackingModule{", "}", null, 56);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\b\n\u0002\b\u0013\b\u0086\u0081\u0002\u0018\u0000 \u00162\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002:\u0001\u0016B\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bj\u0002\b\tj\u0002\b\nj\u0002\b\u000bj\u0002\b\fj\u0002\b\rj\u0002\b\u000ej\u0002\b\u000fj\u0002\b\u0010j\u0002\b\u0011j\u0002\b\u0012j\u0002\b\u0013j\u0002\b\u0014j\u0002\b\u0015¨\u0006\u0017"}, d2 = {"Lru/yandex/alice/protos/api/request_parts/platform/utils/TAnalyticsTrackingModule$EOrigin;", "Lcom/squareup/wire/WireEnum;", "", "value", "", "<init>", "(Ljava/lang/String;II)V", "getValue", "()I", "Undefined", "Web", "Scenario", "SmartSpeaker", "RemoteControl", "Proactivity", "Cast", "Timetable", "Push", "SearchApp", "ThisClient", "SmartTv", "VAD", "Companion", "quark-platform-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class EOrigin implements WireEnum {
        private static final /* synthetic */ k4o $ENTRIES;
        private static final /* synthetic */ EOrigin[] $VALUES;
        public static final ProtoAdapter<EOrigin> ADAPTER;
        public static final EOrigin Cast;

        /* renamed from: Companion, reason: from kotlin metadata */
        public static final Companion INSTANCE;
        public static final EOrigin Proactivity;
        public static final EOrigin Push;
        public static final EOrigin RemoteControl;
        public static final EOrigin Scenario;

        @jxi
        public static final EOrigin SearchApp;

        @jxi
        public static final EOrigin SmartSpeaker;

        @jxi
        public static final EOrigin SmartTv;
        public static final EOrigin ThisClient;
        public static final EOrigin Timetable;
        public static final EOrigin Undefined;
        public static final EOrigin VAD;
        public static final EOrigin Web;
        private final int value;

        private static final /* synthetic */ EOrigin[] $values() {
            return new EOrigin[]{Undefined, Web, Scenario, SmartSpeaker, RemoteControl, Proactivity, Cast, Timetable, Push, SearchApp, ThisClient, SmartTv, VAD};
        }

        static {
            final EOrigin eOrigin = new EOrigin("Undefined", 0, 0);
            Undefined = eOrigin;
            Web = new EOrigin("Web", 1, 1);
            Scenario = new EOrigin("Scenario", 2, 2);
            SmartSpeaker = new EOrigin("SmartSpeaker", 3, 3);
            RemoteControl = new EOrigin("RemoteControl", 4, 4);
            Proactivity = new EOrigin("Proactivity", 5, 5);
            Cast = new EOrigin("Cast", 6, 6);
            Timetable = new EOrigin("Timetable", 7, 7);
            Push = new EOrigin("Push", 8, 8);
            SearchApp = new EOrigin("SearchApp", 9, 9);
            ThisClient = new EOrigin("ThisClient", 10, 10);
            SmartTv = new EOrigin("SmartTv", 11, 11);
            VAD = new EOrigin("VAD", 12, 12);
            EOrigin[] $values = $values();
            $VALUES = $values;
            $ENTRIES = kotlin.enums.a.a($values);
            INSTANCE = new Companion(null);
            final g0c a = qoi0.a(EOrigin.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new EnumAdapter<EOrigin>(a, syntax, eOrigin) { // from class: ru.yandex.alice.protos.api.request_parts.platform.utils.TAnalyticsTrackingModule$EOrigin$Companion$ADAPTER$1
                @Override // com.squareup.wire.EnumAdapter
                public TAnalyticsTrackingModule.EOrigin fromValue(int value) {
                    return TAnalyticsTrackingModule.EOrigin.INSTANCE.fromValue(value);
                }
            };
        }

        private EOrigin(String str, int i, int i2) {
            this.value = i2;
        }

        public static final EOrigin fromValue(int i) {
            return INSTANCE.fromValue(i);
        }

        public static k4o getEntries() {
            return $ENTRIES;
        }

        public static EOrigin valueOf(String str) {
            return (EOrigin) Enum.valueOf(EOrigin.class, str);
        }

        public static EOrigin[] values() {
            return (EOrigin[]) $VALUES.clone();
        }

        @Override // com.squareup.wire.WireEnum
        public int getValue() {
            return this.value;
        }

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\b\u001a\u00020\tH\u0007R\u0016\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/yandex/alice/protos/api/request_parts/platform/utils/TAnalyticsTrackingModule$EOrigin$Companion;", "", "<init>", "()V", "ADAPTER", "Lcom/squareup/wire/ProtoAdapter;", "Lru/yandex/alice/protos/api/request_parts/platform/utils/TAnalyticsTrackingModule$EOrigin;", "fromValue", "value", "", "quark-platform-utils_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            public final EOrigin fromValue(int value) {
                switch (value) {
                    case 0:
                        return EOrigin.Undefined;
                    case 1:
                        return EOrigin.Web;
                    case 2:
                        return EOrigin.Scenario;
                    case 3:
                        return EOrigin.SmartSpeaker;
                    case 4:
                        return EOrigin.RemoteControl;
                    case 5:
                        return EOrigin.Proactivity;
                    case 6:
                        return EOrigin.Cast;
                    case 7:
                        return EOrigin.Timetable;
                    case 8:
                        return EOrigin.Push;
                    case 9:
                        return EOrigin.SearchApp;
                    case 10:
                        return EOrigin.ThisClient;
                    case 11:
                        return EOrigin.SmartTv;
                    case 12:
                        return EOrigin.VAD;
                    default:
                        return null;
                }
            }

            private Companion() {
            }
        }
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m512newBuilder();
    }

    public TAnalyticsTrackingModule() {
        this(null, null, null, null, null, 31, null);
    }

    public TAnalyticsTrackingModule(String str, EOrigin eOrigin, String str2, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.ProductScenario = str;
        this.Origin = eOrigin;
        this.Purpose = str2;
        this.OriginInfo = str3;
    }
}
