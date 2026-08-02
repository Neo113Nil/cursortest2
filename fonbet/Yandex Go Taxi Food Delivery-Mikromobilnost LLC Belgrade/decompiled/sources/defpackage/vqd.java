package defpackage;

import kotlinx.serialization.descriptors.SerialDescriptor;
import kotlinx.serialization.json.JsonNull;
import kotlinx.serialization.json.b;
import kotlinx.serialization.json.c;

/* loaded from: classes14.dex */
public final class vqd extends vfx {
    public static final vqd a = new vqd();
    public static final asq0 b = d6z.f("ru.yandex.taxi.object.CompositePayment", new SerialDescriptor[0], new foc(11));

    @Override // defpackage.vfx
    public final Object a(ncx ncxVar) {
        b t = ncxVar.t();
        if (!(t instanceof c)) {
            return wqd.c;
        }
        c cVar = (c) t;
        b bVar = (b) cVar.get("base");
        lv90 lv90Var = null;
        if (bVar == null || (bVar instanceof JsonNull)) {
            bVar = null;
        }
        if (bVar == null) {
            lv90 lv90Var2 = (lv90) ncxVar.d().a(lv90.Companion.serializer(), t);
            if (!lv90Var2.c()) {
                lv90Var2 = lv90.g;
            }
            return new wqd(lv90Var2, null);
        }
        sbx d = ncxVar.d();
        kv90 kv90Var = lv90.Companion;
        lv90 lv90Var3 = (lv90) d.a(kv90Var.serializer(), bVar);
        if (!lv90Var3.c()) {
            lv90Var3 = lv90.g;
        }
        b bVar2 = (b) cVar.get("complement");
        if (bVar2 != null) {
            if (bVar2 instanceof JsonNull) {
                bVar2 = null;
            }
            if (bVar2 != null) {
                lv90Var = (lv90) ncxVar.d().a(kv90Var.serializer(), bVar2);
            }
        }
        return new wqd(lv90Var3, lv90Var);
    }

    @Override // defpackage.vfx
    public final void b(vcx vcxVar, Object obj) {
        wqd wqdVar = (wqd) obj;
        asq0 asq0Var = b;
        yjd b2 = vcxVar.b(asq0Var);
        a.getClass();
        kv90 kv90Var = lv90.Companion;
        b2.g(asq0Var, 0, kv90Var.serializer(), wqdVar.a);
        b2.g(asq0Var, 1, kv90Var.serializer(), wqdVar.b);
        b2.c(asq0Var);
    }

    @Override // defpackage.myi
    public final SerialDescriptor getDescriptor() {
        return b;
    }
}
