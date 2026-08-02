package defpackage;

import java.util.HashMap;
import kotlin.coroutines.Continuation;
import ru.yandex.taxi.statebar.controller.b;

/* loaded from: classes10.dex */
public final class w8z implements vpr {
    public final /* synthetic */ int a;
    public final /* synthetic */ b b;

    public /* synthetic */ w8z(b bVar, int i) {
        this.a = i;
        this.b = bVar;
    }

    @Override // defpackage.vpr
    public final Object emit(Object obj, Continuation continuation) {
        int i = this.a;
        zy11 zy11Var = zy11.a;
        b bVar = this.b;
        switch (i) {
            case 0:
                v8z v8zVar = bVar.p;
                zz2 zz2Var = v8zVar.c;
                k0b0 k0b0Var = v8zVar.a;
                boolean z = k0b0Var.g() || k0b0Var.a();
                boolean z2 = !v8zVar.b.c();
                boolean g = k0b0Var.g();
                Boolean valueOf = Boolean.valueOf(z2);
                zz2Var.getClass();
                HashMap hashMap = new HashMap();
                hashMap.put("app_geo_permission", Boolean.valueOf(z));
                hashMap.put("system_geo_permission", valueOf);
                zz2Var.a.a("Application.AllowGeoPermissionWidget.Tapped", hashMap, 1, x4e.r(g, hashMap, "precise_location"));
                break;
            case 1:
                ((Boolean) obj).booleanValue();
                bVar.f();
                break;
            default:
                bVar.f();
                break;
        }
        return zy11Var;
    }
}
