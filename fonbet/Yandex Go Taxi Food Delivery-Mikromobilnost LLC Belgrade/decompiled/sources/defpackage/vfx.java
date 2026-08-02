package defpackage;

import kotlinx.serialization.KSerializer;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;

/* loaded from: classes8.dex */
public abstract class vfx implements KSerializer {
    public abstract Object a(ncx ncxVar);

    public abstract void b(vcx vcxVar, Object obj);

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        ncx ncxVar = decoder instanceof ncx ? (ncx) decoder : null;
        if (ncxVar != null) {
            return a(ncxVar);
        }
        yci0.m(b64.j(qoi0.a(getClass()).d(), " require Json serialization context"));
        return null;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        vcx vcxVar = encoder instanceof vcx ? (vcx) encoder : null;
        if (vcxVar != null) {
            b(vcxVar, obj);
        } else {
            yci0.m(b64.j(qoi0.a(getClass()).d(), " require Json serialization context"));
        }
    }
}
