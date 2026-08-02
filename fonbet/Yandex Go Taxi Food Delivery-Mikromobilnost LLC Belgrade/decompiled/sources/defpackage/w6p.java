package defpackage;

import com.yandex.payment.sdk.flex.api.dtotransport.FTTransportKind;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;

/* loaded from: classes2.dex */
public final class w6p implements KSerializer {
    public static final w6p a = new w6p();
    public static final asq0 b = d6z.g("FTValueTransportNodeSerializer", new SerialDescriptor[0]);

    public static v6p a(b bVar, ncx ncxVar) {
        if (!(bVar instanceof c)) {
            ny61.r("FTValueTransportNodeSerializer -- value should be a map");
            return null;
        }
        String a2 = qcx.n((b) kotlin.collections.b.g("ft_node_type", qcx.m(bVar))).a();
        if (a2 == null) {
            ny61.r("ft_node_type field is not found or not a string");
            return null;
        }
        FTTransportKind fTTransportKind = FTTransportKind.variable;
        if (a2.equals(fTTransportKind.toString())) {
            return new v6p(fTTransportKind, (z6p) ncxVar.d().a(z6p.Companion.serializer(), bVar), null, null, 12);
        }
        FTTransportKind fTTransportKind2 = FTTransportKind.oauth_token;
        if (a2.equals(fTTransportKind2.toString())) {
            return new v6p(fTTransportKind2, null, (c6p) ncxVar.d().a(c6p.Companion.serializer(), bVar), null, 10);
        }
        FTTransportKind fTTransportKind3 = FTTransportKind.gen_uuid;
        if (a2.equals(fTTransportKind3.toString())) {
            return new v6p(fTTransportKind3, null, null, (y5p) ncxVar.d().a(y5p.Companion.serializer(), bVar), 6);
        }
        ny61.r("Unsupported transport kind");
        return null;
    }

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        ncx ncxVar = decoder instanceof ncx ? (ncx) decoder : null;
        if (ncxVar != null) {
            return a(ncxVar.t(), ncxVar);
        }
        ny61.r("Expected JsonDecoder");
        return null;
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        encoder.j((v6p) obj, v6p.Companion.serializer());
    }
}
