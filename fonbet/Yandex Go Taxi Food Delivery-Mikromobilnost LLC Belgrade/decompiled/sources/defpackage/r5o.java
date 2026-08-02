package defpackage;

import kotlin.a;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;
import org.json.JSONObject;

/* loaded from: classes9.dex */
public final class r5o extends y8 {
    public final cot a;
    public final sul b;
    public final zjr c = new zjr(xfz.b(r5o.class.getSimpleName()));
    public final SerialDescriptor d = c.Companion.serializer().getDescriptor();

    public r5o(cot cotVar, sul sulVar) {
        this.a = cotVar;
        this.b = sulVar;
    }

    @Override // defpackage.y8
    public final Object a(sbx sbxVar, b bVar) {
        u2l u2lVar;
        xtl xtlVar = (xtl) bvf0.A(sbxVar).c(qoi0.a(xtl.class));
        px pxVar = new px(4, this);
        if (xtlVar == null || (u2lVar = xtlVar.a) == null) {
            sul sulVar = this.b;
            if (sulVar != null) {
                e7j0 e7j0Var = (e7j0) bvf0.A(sbxVar).c(qoi0.a(e7j0.class));
                u2lVar = new u2l(new qul(0, a.a(new in2(3, sulVar, new zr50[]{new zr50(e7j0Var != null ? e7j0Var.a : null)}, pxVar))));
            } else {
                u2lVar = new u2l(pxVar);
            }
        }
        c cVar = (c) bVar;
        cot cotVar = this.a;
        cotVar.getClass();
        JSONObject E = gwk0.E(cVar);
        v2l v2lVar = (v2l) cotVar.b;
        ymj ymjVar = new ymj(23, u2lVar, E);
        ((hah) v2lVar).getClass();
        return new q5o((y2l) ymjVar.invoke(), cVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return this.d;
    }
}
