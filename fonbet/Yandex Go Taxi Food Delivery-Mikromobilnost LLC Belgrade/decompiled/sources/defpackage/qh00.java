package defpackage;

import java.util.Map;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes15.dex */
public final class qh00 extends dcx {
    public final asq0 d;

    public qh00(KSerializer kSerializer, KSerializer kSerializer2) {
        super(kSerializer, kSerializer2);
        this.d = d6z.h("kotlin.collections.Map.Entry", ovu0.i, new SerialDescriptor[0], new vmz(8, kSerializer, kSerializer2));
    }

    @Override // defpackage.dcx
    public final Object a(Object obj) {
        return ((Map.Entry) obj).getKey();
    }

    @Override // defpackage.dcx
    public final Object b(Object obj) {
        return ((Map.Entry) obj).getValue();
    }

    @Override // defpackage.dcx
    public final Object d(Object obj, Object obj2) {
        return new ph00(obj, obj2);
    }

    @Override // defpackage.dcx, defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return this.d;
    }
}
