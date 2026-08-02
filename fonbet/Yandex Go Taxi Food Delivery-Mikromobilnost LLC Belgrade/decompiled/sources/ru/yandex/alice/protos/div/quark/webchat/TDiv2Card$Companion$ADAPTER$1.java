package ru.yandex.alice.protos.div.quark.webchat;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.internal.Internal;
import defpackage.dvw0;
import defpackage.i3y;
import defpackage.jl40;
import defpackage.lfx;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.a;
import okio.ByteString;
import ru.yandex.alice.protos.div.quark.webchat.TDiv2Card;

@Metadata(d1 = {"\u0000C\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R-\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00140\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"ru/yandex/alice/protos/div/quark/webchat/TDiv2Card$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lru/yandex/alice/protos/div/quark/webchat/TDiv2Card;", "value", "", "encodedSize", "(Lru/yandex/alice/protos/div/quark/webchat/TDiv2Card;)I", "Lcom/squareup/wire/ProtoWriter;", "writer", "Lzy11;", "encode", "(Lcom/squareup/wire/ProtoWriter;Lru/yandex/alice/protos/div/quark/webchat/TDiv2Card;)V", "Lcom/squareup/wire/ReverseProtoWriter;", "(Lcom/squareup/wire/ReverseProtoWriter;Lru/yandex/alice/protos/div/quark/webchat/TDiv2Card;)V", "Lcom/squareup/wire/ProtoReader;", "reader", "decode", "(Lcom/squareup/wire/ProtoReader;)Lru/yandex/alice/protos/div/quark/webchat/TDiv2Card;", "redact", "(Lru/yandex/alice/protos/div/quark/webchat/TDiv2Card;)Lru/yandex/alice/protos/div/quark/webchat/TDiv2Card;", "", "", "Lru/yandex/alice/protos/div/quark/webchat/TDiv2Card$Template;", "globalTemplatesAdapter$delegate", "Li3y;", "getGlobalTemplatesAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "globalTemplatesAdapter", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TDiv2Card$Companion$ADAPTER$1 extends ProtoAdapter<TDiv2Card> {

    /* renamed from: globalTemplatesAdapter$delegate, reason: from kotlin metadata */
    private final i3y globalTemplatesAdapter;

    public TDiv2Card$Companion$ADAPTER$1(FieldEncoding fieldEncoding, lfx lfxVar, Syntax syntax) {
        super(fieldEncoding, lfxVar, "type.googleapis.com/NAlice.TDiv2Card", syntax, (Object) null, "alice/protos/div/div2card.proto");
        this.globalTemplatesAdapter = a.a(new dvw0(7));
    }

    private final ProtoAdapter<Map<String, TDiv2Card.Template>> getGlobalTemplatesAdapter() {
        return (ProtoAdapter) this.globalTemplatesAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoAdapter globalTemplatesAdapter_delegate$lambda$0() {
        return ProtoAdapter.INSTANCE.newMapAdapter(ProtoAdapter.STRING, TDiv2Card.Template.ADAPTER);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public TDiv2Card decode(ProtoReader reader) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        ArrayList arrayList = new ArrayList();
        long beginMessage = reader.beginMessage();
        Map<String, ?> map = null;
        TDiv2Card.TDivPalette tDivPalette = null;
        boolean z = false;
        String str = "";
        String str2 = str;
        String str3 = null;
        TDiv2Id tDiv2Id = null;
        while (true) {
            int nextTag = reader.nextTag();
            if (nextTag == -1) {
                return new TDiv2Card(map, str3, z, str, linkedHashMap, str2, tDiv2Id, tDivPalette, arrayList, reader.endMessageAndGetUnknownFields(beginMessage));
            }
            switch (nextTag) {
                case 1:
                    map = ProtoAdapter.STRUCT_MAP.decode(reader);
                    break;
                case 2:
                    z = ProtoAdapter.BOOL.decode(reader).booleanValue();
                    break;
                case 3:
                    str = ProtoAdapter.STRING.decode(reader);
                    break;
                case 4:
                    linkedHashMap.putAll(getGlobalTemplatesAdapter().decode(reader));
                    break;
                case 5:
                    str2 = ProtoAdapter.STRING.decode(reader);
                    break;
                case 6:
                    str3 = ProtoAdapter.STRING.decode(reader);
                    break;
                case 7:
                    tDiv2Id = TDiv2Id.ADAPTER.decode(reader);
                    break;
                case 8:
                    tDivPalette = TDiv2Card.TDivPalette.ADAPTER.decode(reader);
                    break;
                case 9:
                    arrayList.add(TDivExternalVariable.ADAPTER.decode(reader));
                    break;
                default:
                    reader.readUnknownField(nextTag);
                    break;
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter writer, TDiv2Card value) {
        if (value.getHideBorders()) {
            ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getHideBorders()));
        }
        if (!jl40.l(value.getText(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 3, (int) value.getText());
        }
        getGlobalTemplatesAdapter().encodeWithTag(writer, 4, (int) value.getGlobalTemplates());
        if (!jl40.l(value.getCardName(), "")) {
            ProtoAdapter.STRING.encodeWithTag(writer, 5, (int) value.getCardName());
        }
        if (value.getId() != null) {
            TDiv2Id.ADAPTER.encodeWithTag(writer, 7, (int) value.getId());
        }
        if (value.getPalette() != null) {
            TDiv2Card.TDivPalette.ADAPTER.encodeWithTag(writer, 8, (int) value.getPalette());
        }
        TDivExternalVariable.ADAPTER.asRepeated().encodeWithTag(writer, 9, (int) value.getExternalVariables());
        ProtoAdapter.STRUCT_MAP.encodeWithTag(writer, 1, (int) value.getBody());
        ProtoAdapter.STRING.encodeWithTag(writer, 6, (int) value.getStringBody());
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(TDiv2Card value) {
        int encodedSizeWithTag = ProtoAdapter.STRUCT_MAP.encodedSizeWithTag(1, value.getBody()) + value.unknownFields().h();
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        int encodedSizeWithTag2 = protoAdapter.encodedSizeWithTag(6, value.getStringBody()) + encodedSizeWithTag;
        if (value.getHideBorders()) {
            encodedSizeWithTag2 += ProtoAdapter.BOOL.encodedSizeWithTag(2, Boolean.valueOf(value.getHideBorders()));
        }
        if (!jl40.l(value.getText(), "")) {
            encodedSizeWithTag2 += protoAdapter.encodedSizeWithTag(3, value.getText());
        }
        int encodedSizeWithTag3 = getGlobalTemplatesAdapter().encodedSizeWithTag(4, value.getGlobalTemplates()) + encodedSizeWithTag2;
        if (!jl40.l(value.getCardName(), "")) {
            encodedSizeWithTag3 += protoAdapter.encodedSizeWithTag(5, value.getCardName());
        }
        if (value.getId() != null) {
            encodedSizeWithTag3 += TDiv2Id.ADAPTER.encodedSizeWithTag(7, value.getId());
        }
        if (value.getPalette() != null) {
            encodedSizeWithTag3 += TDiv2Card.TDivPalette.ADAPTER.encodedSizeWithTag(8, value.getPalette());
        }
        return TDivExternalVariable.ADAPTER.asRepeated().encodedSizeWithTag(9, value.getExternalVariables()) + encodedSizeWithTag3;
    }

    @Override // com.squareup.wire.ProtoAdapter
    public TDiv2Card redact(TDiv2Card value) {
        Map<String, ?> body = value.getBody();
        Map<String, ?> redact = body != null ? ProtoAdapter.STRUCT_MAP.redact(body) : null;
        Map m134redactElements = Internal.m134redactElements(value.getGlobalTemplates(), TDiv2Card.Template.ADAPTER);
        TDiv2Id id = value.getId();
        TDiv2Id redact2 = id != null ? TDiv2Id.ADAPTER.redact(id) : null;
        TDiv2Card.TDivPalette palette = value.getPalette();
        return TDiv2Card.copy$default(value, redact, null, false, null, m134redactElements, null, redact2, palette != null ? TDiv2Card.TDivPalette.ADAPTER.redact(palette) : null, Internal.m133redactElements(value.getExternalVariables(), TDivExternalVariable.ADAPTER), ByteString.c, 46, null);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter writer, TDiv2Card value) {
        writer.writeBytes(value.unknownFields());
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        protoAdapter.encodeWithTag(writer, 6, (int) value.getStringBody());
        ProtoAdapter.STRUCT_MAP.encodeWithTag(writer, 1, (int) value.getBody());
        TDivExternalVariable.ADAPTER.asRepeated().encodeWithTag(writer, 9, (int) value.getExternalVariables());
        if (value.getPalette() != null) {
            TDiv2Card.TDivPalette.ADAPTER.encodeWithTag(writer, 8, (int) value.getPalette());
        }
        if (value.getId() != null) {
            TDiv2Id.ADAPTER.encodeWithTag(writer, 7, (int) value.getId());
        }
        if (!jl40.l(value.getCardName(), "")) {
            protoAdapter.encodeWithTag(writer, 5, (int) value.getCardName());
        }
        getGlobalTemplatesAdapter().encodeWithTag(writer, 4, (int) value.getGlobalTemplates());
        if (!jl40.l(value.getText(), "")) {
            protoAdapter.encodeWithTag(writer, 3, (int) value.getText());
        }
        if (value.getHideBorders()) {
            ProtoAdapter.BOOL.encodeWithTag(writer, 2, (int) Boolean.valueOf(value.getHideBorders()));
        }
    }
}
