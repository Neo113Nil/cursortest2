package defpackage;

import java.util.Iterator;
import java.util.List;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.encoding.Decoder;
import kotlinx.serialization.encoding.Encoder;
import kotlinx.serialization.json.a;
import kotlinx.serialization.json.b;

/* loaded from: classes9.dex */
public final class zbx implements KSerializer {
    public static final zbx a = new zbx();
    public static final ybx b = ybx.b;

    @Override // defpackage.myi
    public final Object deserialize(Decoder decoder) {
        y5e.e(decoder);
        return new a((List) new p53(rcx.a, 0).e(decoder));
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }

    @Override // kotlinx.serialization.KSerializer
    public final void serialize(Encoder encoder, Object obj) {
        a aVar = (a) obj;
        y5e.f(encoder);
        rcx rcxVar = rcx.a;
        s43 s43Var = new s43(rcxVar.getDescriptor(), 1);
        int size = aVar.size();
        yjd r = encoder.r(s43Var);
        Iterator<b> it = aVar.iterator();
        for (int i = 0; i < size; i++) {
            r.e(s43Var, i, rcxVar, it.next());
        }
        r.c(s43Var);
    }
}
