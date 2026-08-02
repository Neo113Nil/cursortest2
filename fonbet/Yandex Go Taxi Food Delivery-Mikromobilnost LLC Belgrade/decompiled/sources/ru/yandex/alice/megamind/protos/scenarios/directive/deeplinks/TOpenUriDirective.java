package ru.yandex.alice.megamind.protos.scenarios.directive.deeplinks;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.Message;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.WireField;
import com.squareup.wire.internal.Internal;
import com.ybsdk.feature.webview.internal.browser.LaunchBrowserActivity;
import defpackage.g0c;
import defpackage.jl40;
import defpackage.jxi;
import defpackage.qoi0;
import defpackage.unr0;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import okio.ByteString;
import ru.CryptoPro.JCP.tools.CertReader.Extension;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0001\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0000\u0018\u0000 \u001d2\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u001dB=\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\b\u0010\u0014\u001a\u00020\u0002H\u0017J\u0013\u0010\u0015\u001a\u00020\u00072\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0096\u0002J\b\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0004H\u0016JA\u0010\u001b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\t\u001a\u00020\n¢\u0006\u0002\u0010\u001cR\u0016\u0010\u0003\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u001a\u0010\u0006\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0012\u001a\u0004\b\u0010\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000e¨\u0006\u001e"}, d2 = {"Lru/yandex/alice/megamind/protos/scenarios/directive/deeplinks/TOpenUriDirective;", "Lcom/squareup/wire/Message;", "", "name", "", LaunchBrowserActivity.KEY_URI, "openInCurrentTab", "", "screenId", "unknownFields", "Lokio/ByteString;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lokio/ByteString;)V", "getName", "()Ljava/lang/String;", "getUri", "getOpenInCurrentTab", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getScreenId", "newBuilder", "equals", "other", "", "hashCode", "", "toString", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Lokio/ByteString;)Lru/yandex/alice/megamind/protos/scenarios/directive/deeplinks/TOpenUriDirective;", "Companion", "quark-deeplinks_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TOpenUriDirective extends Message {
    public static final ProtoAdapter<TOpenUriDirective> ADAPTER;
    private static final long serialVersionUID = 0;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 0, tag = 1)
    private final String name;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#BOOL_VALUE", jsonName = "open_in_current_tab", schemaIndex = 2, tag = 4)
    private final Boolean openInCurrentTab;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", jsonName = "screen_id", oneofName = "OptionalScreenId", schemaIndex = 3, tag = 3)
    private final String screenId;

    @WireField(adapter = "com.squareup.wire.ProtoAdapter#STRING", label = WireField.Label.OMIT_IDENTITY, schemaIndex = 1, tag = 2)
    private final String uri;

    static {
        final FieldEncoding fieldEncoding = FieldEncoding.LENGTH_DELIMITED;
        final g0c a = qoi0.a(TOpenUriDirective.class);
        final Syntax syntax = Syntax.PROTO_3;
        ADAPTER = new ProtoAdapter<TOpenUriDirective>(fieldEncoding, a, syntax) { // from class: ru.yandex.alice.megamind.protos.scenarios.directive.deeplinks.TOpenUriDirective$Companion$ADAPTER$1
            @Override // com.squareup.wire.ProtoAdapter
            public TOpenUriDirective decode(ProtoReader reader) {
                long beginMessage = reader.beginMessage();
                String str = "";
                Boolean bool = null;
                String str2 = null;
                String str3 = "";
                while (true) {
                    int nextTag = reader.nextTag();
                    if (nextTag == -1) {
                        return new TOpenUriDirective(str, str3, bool, str2, reader.endMessageAndGetUnknownFields(beginMessage));
                    }
                    if (nextTag == 1) {
                        str = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag == 2) {
                        str3 = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag == 3) {
                        str2 = ProtoAdapter.STRING.decode(reader);
                    } else if (nextTag != 4) {
                        reader.readUnknownField(nextTag);
                    } else {
                        bool = ProtoAdapter.BOOL_VALUE.decode(reader);
                    }
                }
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ProtoWriter writer, TOpenUriDirective value) {
                if (!jl40.l(value.getName(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 1, (int) value.getName());
                }
                if (!jl40.l(value.getUri(), "")) {
                    ProtoAdapter.STRING.encodeWithTag(writer, 2, (int) value.getUri());
                }
                if (value.getOpenInCurrentTab() != null) {
                    ProtoAdapter.BOOL_VALUE.encodeWithTag(writer, 4, (int) value.getOpenInCurrentTab());
                }
                ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getScreenId());
                writer.writeBytes(value.unknownFields());
            }

            @Override // com.squareup.wire.ProtoAdapter
            public int encodedSize(TOpenUriDirective value) {
                int h = value.unknownFields().h();
                if (!jl40.l(value.getName(), "")) {
                    h += ProtoAdapter.STRING.encodedSizeWithTag(1, value.getName());
                }
                if (!jl40.l(value.getUri(), "")) {
                    h += ProtoAdapter.STRING.encodedSizeWithTag(2, value.getUri());
                }
                if (value.getOpenInCurrentTab() != null) {
                    h += ProtoAdapter.BOOL_VALUE.encodedSizeWithTag(4, value.getOpenInCurrentTab());
                }
                return ProtoAdapter.STRING.encodedSizeWithTag(3, value.getScreenId()) + h;
            }

            @Override // com.squareup.wire.ProtoAdapter
            public TOpenUriDirective redact(TOpenUriDirective value) {
                Boolean openInCurrentTab = value.getOpenInCurrentTab();
                return TOpenUriDirective.copy$default(value, null, null, openInCurrentTab != null ? ProtoAdapter.BOOL_VALUE.redact(openInCurrentTab) : null, null, ByteString.c, 11, null);
            }

            @Override // com.squareup.wire.ProtoAdapter
            public void encode(ReverseProtoWriter writer, TOpenUriDirective value) {
                writer.writeBytes(value.unknownFields());
                ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
                protoAdapter.encodeWithTag(writer, 3, (int) value.getScreenId());
                if (value.getOpenInCurrentTab() != null) {
                    ProtoAdapter.BOOL_VALUE.encodeWithTag(writer, 4, (int) value.getOpenInCurrentTab());
                }
                if (!jl40.l(value.getUri(), "")) {
                    protoAdapter.encodeWithTag(writer, 2, (int) value.getUri());
                }
                if (jl40.l(value.getName(), "")) {
                    return;
                }
                protoAdapter.encodeWithTag(writer, 1, (int) value.getName());
            }
        };
    }

    public /* synthetic */ TOpenUriDirective(String str, String str2, Boolean bool, String str3, ByteString byteString, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? "" : str, (i & 2) != 0 ? "" : str2, (i & 4) != 0 ? null : bool, (i & 8) != 0 ? null : str3, (i & 16) != 0 ? ByteString.c : byteString);
    }

    public static /* synthetic */ TOpenUriDirective copy$default(TOpenUriDirective tOpenUriDirective, String str, String str2, Boolean bool, String str3, ByteString byteString, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tOpenUriDirective.name;
        }
        if ((i & 2) != 0) {
            str2 = tOpenUriDirective.uri;
        }
        if ((i & 4) != 0) {
            bool = tOpenUriDirective.openInCurrentTab;
        }
        if ((i & 8) != 0) {
            str3 = tOpenUriDirective.screenId;
        }
        if ((i & 16) != 0) {
            byteString = tOpenUriDirective.unknownFields();
        }
        ByteString byteString2 = byteString;
        Boolean bool2 = bool;
        return tOpenUriDirective.copy(str, str2, bool2, str3, byteString2);
    }

    public final TOpenUriDirective copy(String name, String uri, Boolean openInCurrentTab, String screenId, ByteString unknownFields) {
        return new TOpenUriDirective(name, uri, openInCurrentTab, screenId, unknownFields);
    }

    public boolean equals(Object other) {
        if (other == this) {
            return true;
        }
        if (!(other instanceof TOpenUriDirective)) {
            return false;
        }
        TOpenUriDirective tOpenUriDirective = (TOpenUriDirective) other;
        return jl40.l(unknownFields(), tOpenUriDirective.unknownFields()) && jl40.l(this.name, tOpenUriDirective.name) && jl40.l(this.uri, tOpenUriDirective.uri) && jl40.l(this.openInCurrentTab, tOpenUriDirective.openInCurrentTab) && jl40.l(this.screenId, tOpenUriDirective.screenId);
    }

    public final String getName() {
        return this.name;
    }

    public final Boolean getOpenInCurrentTab() {
        return this.openInCurrentTab;
    }

    public final String getScreenId() {
        return this.screenId;
    }

    public final String getUri() {
        return this.uri;
    }

    public int hashCode() {
        int i = this.hashCode;
        if (i != 0) {
            return i;
        }
        int b = unr0.b(unr0.b(unknownFields().hashCode() * 37, 37, this.name), 37, this.uri);
        Boolean bool = this.openInCurrentTab;
        int hashCode = (b + (bool != null ? bool.hashCode() : 0)) * 37;
        String str = this.screenId;
        int hashCode2 = hashCode + (str != null ? str.hashCode() : 0);
        this.hashCode = hashCode2;
        return hashCode2;
    }

    @jxi
    /* renamed from: newBuilder, reason: collision with other method in class */
    public /* synthetic */ Void m503newBuilder() {
        throw new AssertionError("Builders are deprecated and only available in a javaInterop build; see https://square.github.io/wire/wire_compiler/#kotlin");
    }

    @Override // com.squareup.wire.Message
    public String toString() {
        ArrayList arrayList = new ArrayList();
        unr0.B("name=", Internal.sanitize(this.name), arrayList);
        unr0.B("uri=", Internal.sanitize(this.uri), arrayList);
        Boolean bool = this.openInCurrentTab;
        if (bool != null) {
            arrayList.add("openInCurrentTab=" + bool);
        }
        String str = this.screenId;
        if (str != null) {
            unr0.B("screenId=", Internal.sanitize(str), arrayList);
        }
        return a.X(arrayList, Extension.FIX_SPACE, "TOpenUriDirective{", "}", null, 56);
    }

    @Override // com.squareup.wire.Message
    public /* bridge */ /* synthetic */ Message.Builder newBuilder() {
        return (Message.Builder) m503newBuilder();
    }

    public TOpenUriDirective() {
        this(null, null, null, null, null, 31, null);
    }

    public TOpenUriDirective(String str, String str2, Boolean bool, String str3, ByteString byteString) {
        super(ADAPTER, byteString);
        this.name = str;
        this.uri = str2;
        this.openInCurrentTab = bool;
        this.screenId = str3;
    }
}
