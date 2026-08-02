package ru.yandex.alice.protos.div.quark.webchat;

import NYT.quark.webchat.ColumnNameOption;
import NYT.quark.webchat.DefaultFieldFlagsOption;
import NYT.quark.webchat.EWrapperFieldFlag;
import NYT.quark.webchat.FlagsOption;
import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import defpackage.g0c;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.ny61;
import defpackage.qoi0;
import defpackage.smw0;
import defpackage.unr0;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.EmptyList;
import kotlin.collections.a;
import kotlin.collections.b;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.ByteString;
import ru.CryptoPro.JCP.tools.CertReader.Extension;
import ru.yandex.alice.protos.div.quark.webchat.TDiv2Card;

@DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\b\u0001\u0018\u0000 82\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u000389:B\u008f\u0001\u0012\u0014\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0005\u0012\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\u0004\u0012\b\b\u0002\u0010\f\u001a\u00020\u0005\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015¢\u0006\u0004\b\u0016\u0010\u0017J\b\u00100\u001a\u00020\u0002H\u0017J\u0013\u00101\u001a\u00020\b2\b\u00102\u001a\u0004\u0018\u000103H\u0096\u0002J\b\u00104\u001a\u000205H\u0016J\b\u00106\u001a\u00020\u0005H\u0016J\u008e\u0001\u00107\u001a\u00020\u00002\u0014\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u00052\u0014\b\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\u00042\b\b\u0002\u0010\f\u001a\u00020\u00052\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\u000e\b\u0002\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\b\b\u0002\u0010\u0014\u001a\u00020\u0015R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0016\u0010\u0007\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u001c\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u001e\u0010\u0019\u001a\u0004\b\u001f\u0010\u001bR\u001c\u0010\f\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b \u0010\u0019\u001a\u0004\b!\u0010\u001bR\u001e\u0010\r\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\"\u0010\u0019\u001a\u0004\b#\u0010$R\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b%\u0010\u0019\u001a\u0004\b&\u0010'R(\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b(\u0010\u0019\u001a\u0004\b)\u0010*R(\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000b0\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b+\u0010\u0019\u001a\u0004\b,\u0010*R\"\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00130\u00128\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b-\u0010\u0019\u001a\u0004\b.\u0010/¨\u0006;"}, d2 = {"Lru/yandex/alice/protos/div/quark/webchat/TDiv2Card;", "Lcom/squareup/wire/Message;", "", "body", "", "", "stringBody", "hideBorders", "", "text", "globalTemplates", "Lru/yandex/alice/protos/div/quark/webchat/TDiv2Card$Template;", "cardName", "id", "Lru/yandex/alice/protos/div/quark/webchat/TDiv2Id;", "palette", "Lru/yandex/alice/protos/div/quark/webchat/TDiv2Card$TDivPalette;", "externalVariables", "", "Lru/yandex/alice/protos/div/quark/webchat/TDivExternalVariable;", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/Map;Ljava/lang/String;ZLjava/lang/String;Ljava/util/Map;Ljava/lang/String;Lru/yandex/alice/protos/div/quark/webchat/TDiv2Id;Lru/yandex/alice/protos/div/quark/webchat/TDiv2Card$TDivPalette;Ljava/util/List;Lokio/ByteString;)V", "getStringBody$annotations", "()V", "getStringBody", "()Ljava/lang/String;", "getHideBorders", "()Z", "getText$annotations", "getText", "getCardName$annotations", "getCardName", "getId$annotations", "getId", "()Lru/yandex/alice/protos/div/quark/webchat/TDiv2Id;", "getPalette$annotations", "getPalette", "()Lru/yandex/alice/protos/div/quark/webchat/TDiv2Card$TDivPalette;", "getBody$annotations", "getBody", "()Ljava/util/Map;", "getGlobalTemplates$annotations", "getGlobalTemplates", "getExternalVariables$annotations", "getExternalVariables", "()Ljava/util/List;", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "Companion", "Template", "TDivPalette", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TDiv2Card extends Message {
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRUCT_MAP", oneofName = "Div2Body", schemaIndex = 0, tag = 1)
    private final Map<String, ?> body;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "card_name", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 5, tag = 5)
    private final String cardName;

    @WireField(adapter = "ru.yandex.alice.protos.div.quark.webchat.TDivExternalVariable#ADAPTER", jsonName = "external_variables", label = WireField.Label.REPEATED, schemaIndex = 8, tag = 9)
    private final List<TDivExternalVariable> externalVariables;

    @WireField(adapter = "ru.yandex.alice.protos.div.quark.webchat.TDiv2Card$Template#ADAPTER", jsonName = "global_templates", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 4, tag = 4)
    private final Map<String, Template> globalTemplates;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL", jsonName = "hide_borders", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 2, tag = 2)
    private final boolean hideBorders;

    @WireField(adapter = "ru.yandex.alice.protos.div.quark.webchat.TDiv2Id#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 6, tag = 7)
    private final TDiv2Id id;

    @WireField(adapter = "ru.yandex.alice.protos.div.quark.webchat.TDiv2Card$TDivPalette#ADAPTER", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 7, tag = 8)
    private final TDivPalette palette;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "string_body", oneofName = "Div2Body", schemaIndex = 1, tag = 6)
    private final String stringBody;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 3, tag = 3)
    private final String text;
    public static final ProtoAdapter<TDiv2Card> ADAPTER = new TDiv2Card$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, qoi0.a(TDiv2Card.class), Syntax.PROTO_3);

    public /* synthetic */ TDiv2Card(Map map, String str, boolean z, String str2, Map map2, String str3, TDiv2Id tDiv2Id, TDivPalette tDivPalette, List list, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : map, (i & 2) != 0 ? null : str, (i & 4) != 0 ? false : z, (i & 8) != 0 ? "" : str2, (i & 16) != 0 ? b.f() : map2, (i & 32) != 0 ? "" : str3, (i & 64) != 0 ? null : tDiv2Id, (i & 128) != 0 ? null : tDivPalette, (i & 256) != 0 ? EmptyList.a : list, (i & 512) != 0 ? ByteString.c : byteString);
    }

    public static /* synthetic */ TDiv2Card copy$default(TDiv2Card tDiv2Card, Map map, String str, boolean z, String str2, Map map2, String str3, TDiv2Id tDiv2Id, TDivPalette tDivPalette, List list, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            map = tDiv2Card.body;
        }
        if ((i & 2) != 0) {
            str = tDiv2Card.stringBody;
        }
        if ((i & 4) != 0) {
            z = tDiv2Card.hideBorders;
        }
        if ((i & 8) != 0) {
            str2 = tDiv2Card.text;
        }
        if ((i & 16) != 0) {
            map2 = tDiv2Card.globalTemplates;
        }
        if ((i & 32) != 0) {
            str3 = tDiv2Card.cardName;
        }
        if ((i & 64) != 0) {
            tDiv2Id = tDiv2Card.id;
        }
        if ((i & 128) != 0) {
            tDivPalette = tDiv2Card.palette;
        }
        if ((i & 256) != 0) {
            list = tDiv2Card.externalVariables;
        }
        if ((i & 512) != 0) {
            byteString = tDiv2Card.unknownFields();
        }
        List list2 = list;
        ByteString byteString2 = byteString;
        TDiv2Id tDiv2Id2 = tDiv2Id;
        TDivPalette tDivPalette2 = tDivPalette;
        Map map3 = map2;
        String str4 = str3;
        return tDiv2Card.copy(map, str, z, str2, map3, str4, tDiv2Id2, tDivPalette2, list2, byteString2);
    }

    @jxi
    @ColumnNameOption("body")
    @FlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_PROTOBUF})
    public static /* synthetic */ void getBody$annotations() {
    }

    @jxi
    @ColumnNameOption("card_name")
    public static /* synthetic */ void getCardName$annotations() {
    }

    @ColumnNameOption("external_variables")
    public static /* synthetic */ void getExternalVariables$annotations() {
    }

    @ColumnNameOption("global_templates")
    public static /* synthetic */ void getGlobalTemplates$annotations() {
    }

    @ColumnNameOption("id")
    public static /* synthetic */ void getId$annotations() {
    }

    @ColumnNameOption("palette")
    public static /* synthetic */ void getPalette$annotations() {
    }

    @ColumnNameOption("string_body")
    public static /* synthetic */ void getStringBody$annotations() {
    }

    @ColumnNameOption("text")
    public static /* synthetic */ void getText$annotations() {
    }

    public final TDiv2Card copy(Map<String, ?> body, String stringBody, boolean hideBorders, String text, Map<String, Template> globalTemplates, String cardName, TDiv2Id id, TDivPalette palette, List<TDivExternalVariable> externalVariables, ByteString unknownFields) {
        return new TDiv2Card(body, stringBody, hideBorders, text, globalTemplates, cardName, id, palette, externalVariables, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TDiv2Card)) {
            return false;
        }
        TDiv2Card tDiv2Card = (TDiv2Card) other;
        return jl40.l(unknownFields(), tDiv2Card.unknownFields()) && jl40.l(this.body, tDiv2Card.body) && jl40.l(this.stringBody, tDiv2Card.stringBody) && this.hideBorders == tDiv2Card.hideBorders && jl40.l(this.text, tDiv2Card.text) && jl40.l(this.globalTemplates, tDiv2Card.globalTemplates) && jl40.l(this.cardName, tDiv2Card.cardName) && jl40.l(this.id, tDiv2Card.id) && jl40.l(this.palette, tDiv2Card.palette) && jl40.l(this.externalVariables, tDiv2Card.externalVariables);
    }

    public final Map<String, ?> getBody() {
        return this.body;
    }

    public final String getCardName() {
        return this.cardName;
    }

    public final List<TDivExternalVariable> getExternalVariables() {
        return this.externalVariables;
    }

    public final Map<String, Template> getGlobalTemplates() {
        return this.globalTemplates;
    }

    public final boolean getHideBorders() {
        return this.hideBorders;
    }

    public final TDiv2Id getId() {
        return this.id;
    }

    public final TDivPalette getPalette() {
        return this.palette;
    }

    public final String getStringBody() {
        return this.stringBody;
    }

    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int hashCode = unknownFields().hashCode() * 37;
        Map<String, ?> map = this.body;
        int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 37;
        String str = this.stringBody;
        int b = unr0.b(unr0.d(unr0.b(unr0.e((hashCode2 + (str != null ? str.hashCode() : 0)) * 37, 37, this.hideBorders), 37, this.text), 37, this.globalTemplates), 37, this.cardName);
        TDiv2Id tDiv2Id = this.id;
        int hashCode3 = (b + (tDiv2Id != null ? tDiv2Id.hashCode() : 0)) * 37;
        TDivPalette tDivPalette = this.palette;
        int hashCode4 = this.externalVariables.hashCode() + ((hashCode3 + (tDivPalette != null ? tDivPalette.hashCode() : 0)) * 37);
        this.hashCode = hashCode4;
        return hashCode4;
    }

    @jxi
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m521newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        Map<String, ?> map = this.body;
        if (map != null) {
            arrayList.add("body=" + map);
        }
        String str = this.stringBody;
        if (str != null) {
            unr0.B("stringBody=", Internal.sanitize(str), arrayList);
        }
        smw0.y("hideBorders=", arrayList, this.hideBorders);
        unr0.B("text=", Internal.sanitize(this.text), arrayList);
        if (!this.globalTemplates.isEmpty()) {
            arrayList.add("globalTemplates=" + this.globalTemplates);
        }
        unr0.B("cardName=", Internal.sanitize(this.cardName), arrayList);
        TDiv2Id tDiv2Id = this.id;
        if (tDiv2Id != null) {
            arrayList.add("id=" + tDiv2Id);
        }
        TDivPalette tDivPalette = this.palette;
        if (tDivPalette != null) {
            arrayList.add("palette=" + tDivPalette);
        }
        if (!this.externalVariables.isEmpty()) {
            smw0.x("externalVariables=", arrayList, this.externalVariables);
        }
        return a.X(arrayList, Extension.FIX_SPACE, "TDiv2Card{", "}", null, 56);
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001a2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001aB=\u0012\u0014\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0011\u001a\u00020\u0002H\u0017J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0015H\u0096\u0002J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0005H\u0016J<\u0010\u0019\u001a\u00020\u00002\u0014\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\u0014\b\u0002\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0002\u0010\u0007\u001a\u00020\bR(\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR(\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u000e¨\u0006\u001b"}, d2 = {"Lru/yandex/alice/protos/div/quark/webchat/TDiv2Card$TDivPalette;", "Lcom/squareup/wire/Message;", "", "dark", "", "", "light", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/Map;Ljava/util/Map;Lokio/ByteString;)V", "getDark$annotations", "()V", "getDark", "()Ljava/util/Map;", "getLight$annotations", "getLight", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    public static final class TDivPalette extends Message {
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 0, tag = 1)
        private final Map<String, String> dark;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", keyAdapter = "com.squareup.wire.ProtoAdapter#STRING", schemaIndex = 1, tag = 2)
        private final Map<String, String> light;
        public static final ProtoAdapter<TDivPalette> ADAPTER = new TDiv2Card$TDivPalette$Companion$ADAPTER$1(FieldEncoding.LENGTH_DELIMITED, qoi0.a(TDivPalette.class), Syntax.PROTO_3);

        public /* synthetic */ TDivPalette(Map map, Map map2, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? b.f() : map, (i & 2) != 0 ? b.f() : map2, (i & 4) != 0 ? ByteString.c : byteString);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ TDivPalette copy$default(TDivPalette tDivPalette, Map map, Map map2, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                map = tDivPalette.dark;
            }
            if ((i & 2) != 0) {
                map2 = tDivPalette.light;
            }
            if ((i & 4) != 0) {
                byteString = tDivPalette.unknownFields();
            }
            return tDivPalette.copy(map, map2, byteString);
        }

        @ColumnNameOption("dark")
        public static /* synthetic */ void getDark$annotations() {
        }

        @ColumnNameOption("light")
        public static /* synthetic */ void getLight$annotations() {
        }

        public final TDivPalette copy(Map<String, String> dark, Map<String, String> light, ByteString unknownFields) {
            return new TDivPalette(dark, light, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof TDivPalette)) {
                return false;
            }
            TDivPalette tDivPalette = (TDivPalette) other;
            return jl40.l(unknownFields(), tDivPalette.unknownFields()) && jl40.l(this.dark, tDivPalette.dark) && jl40.l(this.light, tDivPalette.light);
        }

        public final Map<String, String> getDark() {
            return this.dark;
        }

        public final Map<String, String> getLight() {
            return this.light;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = this.light.hashCode() + unr0.d(unknownFields().hashCode() * 37, 37, this.dark);
            this.hashCode = hashCode;
            return hashCode;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m522newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            if (!this.dark.isEmpty()) {
                arrayList.add("dark=" + this.dark);
            }
            if (!this.light.isEmpty()) {
                arrayList.add("light=" + this.light);
            }
            return a.X(arrayList, Extension.FIX_SPACE, "TDivPalette{", "}", null, 56);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m522newBuilder();
        }

        public TDivPalette() {
            this(null, null, null, 7, null);
        }

        public TDivPalette(Map<String, String> map, Map<String, String> map2, ByteString byteString) {
            super(ADAPTER, byteString);
            this.dark = Internal.immutableCopyOf("dark", map);
            this.light = Internal.immutableCopyOf("light", map2);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\b\u0007\u0018\u0000 \u001b2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001bB3\u0012\u0014\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b¢\u0006\u0004\b\t\u0010\nJ\b\u0010\u0012\u001a\u00020\u0002H\u0017J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0096\u0002J\b\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0005H\u0016J2\u0010\u001a\u001a\u00020\u00002\u0014\b\u0002\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\bR\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR(\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0002\b\u0003\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u000f\u0010\f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lru/yandex/alice/protos/div/quark/webchat/TDiv2Card$Template;", "Lcom/squareup/wire/Message;", "", "body", "", "", "stringBody", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/util/Map;Ljava/lang/String;Lokio/ByteString;)V", "getStringBody$annotations", "()V", "getStringBody", "()Ljava/lang/String;", "getBody$annotations", "getBody", "()Ljava/util/Map;", "newBuilder", "equals", "", "other", "", "hashCode", "", "toString", "copy", "Companion", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
    @DefaultFieldFlagsOption({EWrapperFieldFlag.Enum.SERIALIZATION_YT})
    public static final class Template extends Message {
        public static final ProtoAdapter<Template> ADAPTER;
        private static final long serialVersionUID = 0;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRUCT_MAP", oneofName = "TemplateBody", schemaIndex = 0, tag = 1)
        private final Map<String, ?> body;

        @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "string_body", oneofName = "TemplateBody", schemaIndex = 1, tag = 2)
        private final String stringBody;

        static {
            final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
            final g0c a = qoi0.a(Template.class);
            final Syntax syntax = Syntax.PROTO_3;
            ADAPTER = new ProtoAdapter<Template>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.protos.div.quark.webchat.TDiv2Card$Template$Companion$ADAPTER$1
                @Override // com.squareup.wire.ProtoAdapter
                public TDiv2Card.Template decode(ProtoReader reader) {
                    long beginMessage = reader.beginMessage();
                    Map<String, ?> map = null;
                    String str = null;
                    while (true) {
                        int nextTag = reader.nextTag();
                        if (nextTag == -1) {
                            return new TDiv2Card.Template(map, str, reader.endMessageAndGetUnknownFields(beginMessage));
                        }
                        if (nextTag == 1) {
                            map = ProtoAdapter.STRUCT_MAP.decode(reader);
                        } else if (nextTag != 2) {
                            reader.readUnknownField(nextTag);
                        } else {
                            str = ProtoAdapter.STRING.decode(reader);
                        }
                    }
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ProtoWriter writer, TDiv2Card.Template value) {
                    ProtoAdapter.STRUCT_MAP.encodeWithTag(writer, 1, (int) value.getBody());
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getStringBody());
                    writer.writeBytes(value.unknownFields());
                }

                @Override // com.squareup.wire.ProtoAdapter
                public int encodedSize(TDiv2Card.Template value) {
                    return ProtoAdapter.STRING.encodedSizeWithTag(2, value.getStringBody()) + ProtoAdapter.STRUCT_MAP.encodedSizeWithTag(1, value.getBody()) + value.unknownFields().h();
                }

                @Override // com.squareup.wire.ProtoAdapter
                public TDiv2Card.Template redact(TDiv2Card.Template value) {
                    Map<String, ?> body = value.getBody();
                    return TDiv2Card.Template.copy$default(value, body != null ? ProtoAdapter.STRUCT_MAP.redact(body) : null, null, ByteString.c, 2, null);
                }

                @Override // com.squareup.wire.ProtoAdapter
                public void encode(ReverseProtoWriter writer, TDiv2Card.Template value) {
                    writer.writeBytes(value.unknownFields());
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getStringBody());
                    ProtoAdapter.STRUCT_MAP.encodeWithTag(writer, 1, (int) value.getBody());
                }
            };
        }

        public Template(Map<String, ?> map, String str, ByteString byteString) {
            super(ADAPTER, byteString);
            this.stringBody = str;
            this.body = (Map) Internal.immutableCopyOfStruct("body", map);
            if (Internal.countNonNull(map, str) <= 1) {
                return;
            }
            ny61.g("At most one of body, stringBody may be non-null");
            throw null;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Template copy$default(Template template, Map map, String str, ByteString byteString, int i, Object obj) {
            if ((i & 1) != 0) {
                map = template.body;
            }
            if ((i & 2) != 0) {
                str = template.stringBody;
            }
            if ((i & 4) != 0) {
                byteString = template.unknownFields();
            }
            return template.copy(map, str, byteString);
        }

        @jxi
        @ColumnNameOption("body")
        public static /* synthetic */ void getBody$annotations() {
        }

        @ColumnNameOption("string_body")
        public static /* synthetic */ void getStringBody$annotations() {
        }

        public final Template copy(Map<String, ?> body, String stringBody, ByteString unknownFields) {
            return new Template(body, stringBody, unknownFields);
        }

        public boolean equals(Object other) {
            if (other == this) {
                return true;
            }
            if (!(other instanceof Template)) {
                return false;
            }
            Template template = (Template) other;
            return jl40.l(unknownFields(), template.unknownFields()) && jl40.l(this.body, template.body) && jl40.l(this.stringBody, template.stringBody);
        }

        public final Map<String, ?> getBody() {
            return this.body;
        }

        public final String getStringBody() {
            return this.stringBody;
        }

        public int hashCode() {
            int i = this.hashCode;
            if (i != 0) {
                return i;
            }
            int hashCode = unknownFields().hashCode() * 37;
            Map<String, ?> map = this.body;
            int hashCode2 = (hashCode + (map != null ? map.hashCode() : 0)) * 37;
            String str = this.stringBody;
            int hashCode3 = hashCode2 + (str != null ? str.hashCode() : 0);
            this.hashCode = hashCode3;
            return hashCode3;
        }

        @jxi
        /* renamed from: newBuilder, reason: collision with other method in class */
        public /* synthetic */ Void m523newBuilder() {
            throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
        }

        @Override // com.squareup.wire.Message
        public String toString() {
            ArrayList arrayList = new ArrayList();
            Map<String, ?> map = this.body;
            if (map != null) {
                arrayList.add("body=" + map);
            }
            String str = this.stringBody;
            if (str != null) {
                unr0.B("stringBody=", Internal.sanitize(str), arrayList);
            }
            return a.X(arrayList, Extension.FIX_SPACE, "Template{", "}", null, 56);
        }

        @Override // com.squareup.wire.Message
        public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
            return (Message.Builder) m523newBuilder();
        }

        public /* synthetic */ Template(Map map, String str, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
            this((i & 1) != 0 ? null : map, (i & 2) != 0 ? null : str, (i & 4) != 0 ? ByteString.c : byteString);
        }

        public Template() {
            this(null, null, null, 7, null);
        }
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m521newBuilder();
    }

    public TDiv2Card() {
        this(null, null, false, null, null, null, null, null, null, null, 1023, null);
    }

    public TDiv2Card(Map<String, ?> map, String str, boolean z, String str2, Map<String, Template> map2, String str3, TDiv2Id tDiv2Id, TDivPalette tDivPalette, List<TDivExternalVariable> list, ByteString byteString) {
        super(ADAPTER, byteString);
        this.stringBody = str;
        this.hideBorders = z;
        this.text = str2;
        this.cardName = str3;
        this.id = tDiv2Id;
        this.palette = tDivPalette;
        this.body = (Map) Internal.immutableCopyOfStruct("body", map);
        this.globalTemplates = Internal.immutableCopyOf("globalTemplates", map2);
        this.externalVariables = Internal.immutableCopyOf("externalVariables", list);
        if (Internal.countNonNull(map, str) <= 1) {
            return;
        }
        ny61.g("At most one of body, stringBody may be non-null");
        throw null;
    }
}
