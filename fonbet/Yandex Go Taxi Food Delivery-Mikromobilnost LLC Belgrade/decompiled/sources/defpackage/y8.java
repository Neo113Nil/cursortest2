package defpackage;

import kotlin.Pair;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.b;

/* loaded from: classes9.dex */
public abstract class y8 implements KSerializer {
    public abstract Object a(sbx sbxVar, b bVar);

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        if (!(decoder instanceof ncx)) {
            ny61.g("Failed requirement.");
            return null;
        }
        ncx ncxVar = (ncx) decoder;
        Pair pair = new Pair(ncxVar.t(), new xez0(System.currentTimeMillis(), System.currentTimeMillis()));
        b bVar = (b) pair.getFirst();
        bvf0.A(ncxVar.d()).e(new lg90((xez0) pair.getSecond()));
        return a(ncxVar.d(), bVar);
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        throw new SerializationException("Serialization is not supported by ".concat(getClass().getSimpleName()));
    }
}
