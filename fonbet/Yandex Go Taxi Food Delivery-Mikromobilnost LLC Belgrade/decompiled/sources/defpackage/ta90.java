package defpackage;

import kotlin.Pair;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;

/* loaded from: classes9.dex */
public final class ta90 extends dcx {
    public final asq0 d;

    public ta90(KSerializer kSerializer, KSerializer kSerializer2) {
        super(kSerializer, kSerializer2);
        SerialDescriptor[] serialDescriptorArr = new SerialDescriptor[0];
        if (evu0.J("kotlin.Pair")) {
            ny61.g("Blank serial names are prohibited");
            throw null;
        }
        h0c h0cVar = new h0c("kotlin.Pair");
        h0cVar.a("first", kSerializer.getDescriptor(), (r3 & 8) == 0);
        h0cVar.a("second", kSerializer2.getDescriptor(), (r3 & 8) == 0);
        this.d = new asq0("kotlin.Pair", ovu0.g, h0cVar.c.size(), j73.d0(serialDescriptorArr), h0cVar);
    }

    @Override // defpackage.dcx
    public final Object a(Object obj) {
        return ((Pair) obj).c();
    }

    @Override // defpackage.dcx
    public final Object b(Object obj) {
        return ((Pair) obj).f();
    }

    @Override // defpackage.dcx
    public final Object d(Object obj, Object obj2) {
        return new Pair(obj, obj2);
    }

    @Override // defpackage.dcx, defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return this.d;
    }
}
