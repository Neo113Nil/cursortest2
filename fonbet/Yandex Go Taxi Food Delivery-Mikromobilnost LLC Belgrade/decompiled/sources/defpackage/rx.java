package defpackage;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;

/* loaded from: classes4.dex */
public final class rx extends y8 {
    public final SerialDescriptor a = c.Companion.serializer().getDescriptor();

    @Override // defpackage.y8
    public final Object a(sbx sbxVar, b bVar) {
        c m = qcx.m(bVar);
        b bVar2 = (b) m.get("shared");
        kr krVar = null;
        c m2 = bVar2 != null ? qcx.m(bVar2) : null;
        cnr0 cnr0Var = m2 != null ? (cnr0) sbxVar.a(gtq0.B(sbxVar.b, qoi0.a(cnr0.class)), m2) : cnr0.b;
        b bVar3 = (b) m.get("action");
        if (bVar3 != null) {
            if (bVar3 instanceof JsonNull) {
                bVar3 = null;
            }
            if (bVar3 != null) {
                krVar = (kr) sbxVar.a(qke.n(gtq0.B(sbxVar.b, qoi0.a(kr.class))), qcx.m(bVar3));
            }
        }
        return new nrq(krVar, cnr0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return this.a;
    }
}
