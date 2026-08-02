package ru.yandex.alice.protos.div.quark.webchat;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import defpackage.dvw0;
import defpackage.i3y;
import defpackage.lfx;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.a;
import okio.ByteString;
import ru.yandex.alice.protos.div.quark.webchat.TDiv2Card;

@Metadata(d1 = {"\u0000?\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\t*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R-\u0010\u001a\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u00140\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0016\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R-\u0010\u001d\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u00140\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u0017\u001a\u0004\b\u001c\u0010\u0019¨\u0006\u001e"}, d2 = {"ru/yandex/alice/protos/div/quark/webchat/TDiv2Card$TDivPalette$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lru/yandex/alice/protos/div/quark/webchat/TDiv2Card$TDivPalette;", "value", "", "encodedSize", "(Lru/yandex/alice/protos/div/quark/webchat/TDiv2Card$TDivPalette;)I", "Lcom/squareup/wire/ProtoWriter;", "writer", "Lzy11;", "encode", "(Lcom/squareup/wire/ProtoWriter;Lru/yandex/alice/protos/div/quark/webchat/TDiv2Card$TDivPalette;)V", "Lcom/squareup/wire/ReverseProtoWriter;", "(Lcom/squareup/wire/ReverseProtoWriter;Lru/yandex/alice/protos/div/quark/webchat/TDiv2Card$TDivPalette;)V", "Lcom/squareup/wire/ProtoReader;", "reader", "decode", "(Lcom/squareup/wire/ProtoReader;)Lru/yandex/alice/protos/div/quark/webchat/TDiv2Card$TDivPalette;", "redact", "(Lru/yandex/alice/protos/div/quark/webchat/TDiv2Card$TDivPalette;)Lru/yandex/alice/protos/div/quark/webchat/TDiv2Card$TDivPalette;", "", "", "darkAdapter$delegate", "Li3y;", "getDarkAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "darkAdapter", "lightAdapter$delegate", "getLightAdapter", "lightAdapter", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TDiv2Card$TDivPalette$Companion$ADAPTER$1 extends ProtoAdapter<TDiv2Card.TDivPalette> {

    /* renamed from: darkAdapter$delegate, reason: from kotlin metadata */
    private final i3y darkAdapter;

    /* renamed from: lightAdapter$delegate, reason: from kotlin metadata */
    private final i3y lightAdapter;

    public TDiv2Card$TDivPalette$Companion$ADAPTER$1(FieldEncoding fieldEncoding, lfx lfxVar, Syntax syntax) {
        super(fieldEncoding, lfxVar, "type.googleapis.com/NAlice.TDiv2Card.TDivPalette", syntax, (Object) null, "alice/protos/div/div2card.proto");
        this.darkAdapter = a.a(new dvw0(8));
        this.lightAdapter = a.a(new dvw0(9));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoAdapter darkAdapter_delegate$lambda$0() {
        ProtoAdapter.Companion companion = ProtoAdapter.INSTANCE;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return companion.newMapAdapter(protoAdapter, protoAdapter);
    }

    private final ProtoAdapter<Map<String, String>> getDarkAdapter() {
        return (ProtoAdapter) this.darkAdapter.getValue();
    }

    private final ProtoAdapter<Map<String, String>> getLightAdapter() {
        return (ProtoAdapter) this.lightAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoAdapter lightAdapter_delegate$lambda$1() {
        ProtoAdapter.Companion companion = ProtoAdapter.INSTANCE;
        ProtoAdapter<String> protoAdapter = ProtoAdapter.STRING;
        return companion.newMapAdapter(protoAdapter, protoAdapter);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public TDiv2Card.TDivPalette decode(ProtoReader reader) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        long beginMessage = reader.beginMessage();
        while (true) {
            int nextTag = reader.nextTag();
            if (nextTag == -1) {
                return new TDiv2Card.TDivPalette(linkedHashMap, linkedHashMap2, reader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                linkedHashMap.putAll(getDarkAdapter().decode(reader));
            } else if (nextTag != 2) {
                reader.readUnknownField(nextTag);
            } else {
                linkedHashMap2.putAll(getLightAdapter().decode(reader));
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter writer, TDiv2Card.TDivPalette value) {
        getDarkAdapter().encodeWithTag(writer, 1, (int) value.getDark());
        getLightAdapter().encodeWithTag(writer, 2, (int) value.getLight());
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(TDiv2Card.TDivPalette value) {
        return getLightAdapter().encodedSizeWithTag(2, value.getLight()) + getDarkAdapter().encodedSizeWithTag(1, value.getDark()) + value.unknownFields().h();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public TDiv2Card.TDivPalette redact(TDiv2Card.TDivPalette value) {
        return TDiv2Card.TDivPalette.copy$default(value, null, null, ByteString.c, 3, null);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter writer, TDiv2Card.TDivPalette value) {
        writer.writeBytes(value.unknownFields());
        getLightAdapter().encodeWithTag(writer, 2, (int) value.getLight());
        getDarkAdapter().encodeWithTag(writer, 1, (int) value.getDark());
    }
}
