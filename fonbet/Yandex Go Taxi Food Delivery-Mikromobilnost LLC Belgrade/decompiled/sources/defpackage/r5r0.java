package defpackage;

import java.util.LinkedHashMap;
import kotlin.Pair;
import kotlinx.serialization.KSerializer;
import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;

/* loaded from: classes9.dex */
public final class r5r0 extends vfx {
    public final LinkedHashMap a;
    public final SerialDescriptor b;

    public r5r0() {
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.a = linkedHashMap;
        linkedHashMap.put("boolean", ea6.Companion.serializer());
        this.b = b.Companion.serializer().getDescriptor();
    }

    @Override // defpackage.vfx
    public final Object a(ncx ncxVar) {
        String str;
        b t = ncxVar.t();
        if (!(t instanceof c)) {
            return null;
        }
        c cVar = (c) t;
        b bVar = (b) cVar.get("type");
        if (bVar == null || (str = qcx.g(qcx.n(bVar))) == null) {
            str = "none";
        }
        b bVar2 = (b) cVar.get("setting_id");
        String g = bVar2 != null ? qcx.g(qcx.n(bVar2)) : null;
        KSerializer kSerializer = (KSerializer) this.a.get(str);
        if (kSerializer == null) {
            return new i521(g);
        }
        try {
            return (q5r0) ncxVar.d().a(kSerializer, t);
        } catch (Exception e) {
            jst.e.k(e, "failed to parse object " + t);
            return new i521(g);
        }
    }

    @Override // defpackage.vfx
    public final void b(vcx vcxVar, Object obj) {
        c cVar;
        q5r0 q5r0Var = (q5r0) obj;
        if (q5r0Var == null) {
            vcxVar.y();
            return;
        }
        vcxVar.C();
        if (q5r0Var instanceof i521) {
            sbx d = vcxVar.d();
            KSerializer serializer = i521.Companion.serializer();
            d.getClass();
            cVar = new c(kotlin.collections.b.o(qcx.m(gwk0.J(d, q5r0Var, serializer)), new Pair("type", qcx.c("none"))));
        } else {
            if (!(q5r0Var instanceof ea6)) {
                w511.b();
                return;
            }
            sbx d2 = vcxVar.d();
            KSerializer serializer2 = ea6.Companion.serializer();
            d2.getClass();
            cVar = new c(kotlin.collections.b.o(qcx.m(gwk0.J(d2, q5r0Var, serializer2)), new Pair("type", qcx.c("boolean"))));
        }
        vcxVar.p(cVar);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return this.b;
    }
}
