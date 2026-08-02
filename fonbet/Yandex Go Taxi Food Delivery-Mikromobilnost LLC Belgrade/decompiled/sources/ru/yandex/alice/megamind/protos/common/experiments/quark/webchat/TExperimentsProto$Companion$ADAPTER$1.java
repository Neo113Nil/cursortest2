package ru.yandex.alice.megamind.protos.common.experiments.quark.webchat;

import com.squareup.wire.FieldEncoding;
import com.squareup.wire.ProtoAdapter;
import com.squareup.wire.ProtoReader;
import com.squareup.wire.ProtoWriter;
import com.squareup.wire.ReverseProtoWriter;
import com.squareup.wire.Syntax;
import com.squareup.wire.internal.Internal;
import defpackage.dvw0;
import defpackage.i3y;
import defpackage.lfx;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.a;
import okio.ByteString;
import ru.yandex.alice.megamind.protos.common.experiments.quark.webchat.TExperimentsProto;

@Metadata(d1 = {"\u0000C\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\n\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\n\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u000f\u001a\u00020\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R-\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00160\u00140\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"ru/yandex/alice/megamind/protos/common/experiments/quark/webchat/TExperimentsProto$Companion$ADAPTER$1", "Lcom/squareup/wire/ProtoAdapter;", "Lru/yandex/alice/megamind/protos/common/experiments/quark/webchat/TExperimentsProto;", "value", "", "encodedSize", "(Lru/yandex/alice/megamind/protos/common/experiments/quark/webchat/TExperimentsProto;)I", "Lcom/squareup/wire/ProtoWriter;", "writer", "Lzy11;", "encode", "(Lcom/squareup/wire/ProtoWriter;Lru/yandex/alice/megamind/protos/common/experiments/quark/webchat/TExperimentsProto;)V", "Lcom/squareup/wire/ReverseProtoWriter;", "(Lcom/squareup/wire/ReverseProtoWriter;Lru/yandex/alice/megamind/protos/common/experiments/quark/webchat/TExperimentsProto;)V", "Lcom/squareup/wire/ProtoReader;", "reader", "decode", "(Lcom/squareup/wire/ProtoReader;)Lru/yandex/alice/megamind/protos/common/experiments/quark/webchat/TExperimentsProto;", "redact", "(Lru/yandex/alice/megamind/protos/common/experiments/quark/webchat/TExperimentsProto;)Lru/yandex/alice/megamind/protos/common/experiments/quark/webchat/TExperimentsProto;", "", "", "Lru/yandex/alice/megamind/protos/common/experiments/quark/webchat/TExperimentsProto$TValue;", "storageAdapter$delegate", "Li3y;", "getStorageAdapter", "()Lcom/squareup/wire/ProtoAdapter;", "storageAdapter", "quark-web-chat_multiRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TExperimentsProto$Companion$ADAPTER$1 extends ProtoAdapter<TExperimentsProto> {

    /* renamed from: storageAdapter$delegate, reason: from kotlin metadata */
    private final i3y storageAdapter;

    public TExperimentsProto$Companion$ADAPTER$1(FieldEncoding fieldEncoding, lfx lfxVar, Syntax syntax) {
        super(fieldEncoding, lfxVar, "type.googleapis.com/NAlice.TExperimentsProto", syntax, (Object) null, "alice/megamind/protos/common/experiments/experiments.proto");
        this.storageAdapter = a.a(new dvw0(10));
    }

    private final ProtoAdapter<Map<String, TExperimentsProto.TValue>> getStorageAdapter() {
        return (ProtoAdapter) this.storageAdapter.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ProtoAdapter storageAdapter_delegate$lambda$0() {
        return ProtoAdapter.INSTANCE.newMapAdapter(ProtoAdapter.STRING, TExperimentsProto.TValue.ADAPTER);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public TExperimentsProto decode(ProtoReader reader) {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        long beginMessage = reader.beginMessage();
        while (true) {
            int nextTag = reader.nextTag();
            if (nextTag == -1) {
                return new TExperimentsProto(linkedHashMap, reader.endMessageAndGetUnknownFields(beginMessage));
            }
            if (nextTag == 1) {
                linkedHashMap.putAll(getStorageAdapter().decode(reader));
            } else {
                reader.readUnknownField(nextTag);
            }
        }
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ProtoWriter writer, TExperimentsProto value) {
        getStorageAdapter().encodeWithTag(writer, 1, (int) value.getStorage());
        writer.writeBytes(value.unknownFields());
    }

    @Override // com.squareup.wire.ProtoAdapter
    public int encodedSize(TExperimentsProto value) {
        return getStorageAdapter().encodedSizeWithTag(1, value.getStorage()) + value.unknownFields().h();
    }

    @Override // com.squareup.wire.ProtoAdapter
    public TExperimentsProto redact(TExperimentsProto value) {
        return value.copy(Internal.m134redactElements(value.getStorage(), TExperimentsProto.TValue.ADAPTER), ByteString.c);
    }

    @Override // com.squareup.wire.ProtoAdapter
    public void encode(ReverseProtoWriter writer, TExperimentsProto value) {
        writer.writeBytes(value.unknownFields());
        getStorageAdapter().encodeWithTag(writer, 1, (int) value.getStorage());
    }
}
