package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class wse implements p3d {
    public static final wse a;
    private static final /* synthetic */ j5m descriptor;

    static {
        wse wseVar = new wse();
        a = wseVar;
        j5m j5mVar = new j5m("ru.yandex.video.m3.ab.config.internal.InternalAbConfig", wseVar, 3);
        j5mVar.k("testids", true);
        j5mVar.k("flags", true);
        j5mVar.k("slots", true);
        descriptor = j5mVar;
    }

    @Override // defpackage.p3d
    public final t9f[] childSerializers() {
        return new t9f[]{yse.d[0], zse.a, tkr.a};
    }

    @Override // defpackage.t9f
    public final Object deserialize(eg7 eg7Var) {
        int i;
        List list;
        bte bteVar;
        String str;
        eg7Var.getClass();
        j5m j5mVar = descriptor;
        tq5 c = eg7Var.c(j5mVar);
        t9f[] t9fVarArr = yse.d;
        List list2 = null;
        if (c.m()) {
            list = (List) c.z(j5mVar, 0, t9fVarArr[0], null);
            bteVar = (bte) c.z(j5mVar, 1, zse.a, null);
            str = c.g(j5mVar, 2);
            i = 7;
        } else {
            boolean z = true;
            int i2 = 0;
            bte bteVar2 = null;
            String str2 = null;
            while (z) {
                int w = c.w(j5mVar);
                if (w == -1) {
                    z = false;
                } else if (w == 0) {
                    list2 = (List) c.z(j5mVar, 0, t9fVarArr[0], list2);
                    i2 |= 1;
                } else if (w == 1) {
                    bteVar2 = (bte) c.z(j5mVar, 1, zse.a, bteVar2);
                    i2 |= 2;
                } else {
                    if (w != 2) {
                        l1j.g(w);
                        return null;
                    }
                    str2 = c.g(j5mVar, 2);
                    i2 |= 4;
                }
            }
            i = i2;
            list = list2;
            bteVar = bteVar2;
            str = str2;
        }
        c.b(j5mVar);
        return new yse(i, list, bteVar, str);
    }

    @Override // defpackage.t9f
    public final mhp getDescriptor() {
        return descriptor;
    }

    @Override // defpackage.t9f
    public final void serialize(l6b l6bVar, Object obj) {
        yse yseVar = (yse) obj;
        l6bVar.getClass();
        yseVar.getClass();
        String str = yseVar.c;
        bte bteVar = yseVar.b;
        List list = yseVar.a;
        j5m j5mVar = descriptor;
        wq5 c = l6bVar.c(j5mVar);
        t9f[] t9fVarArr = yse.d;
        if (c.e(j5mVar) || !Intrinsics.d(list, c5b.a)) {
            c.k(j5mVar, 0, t9fVarArr[0], list);
        }
        if (c.e(j5mVar) || !Intrinsics.d(bteVar, new bte())) {
            c.k(j5mVar, 1, zse.a, bteVar);
        }
        if (c.e(j5mVar) || !Intrinsics.d(str, "")) {
            c.p(j5mVar, 2, str);
        }
        c.b(j5mVar);
    }

    @Override // defpackage.p3d
    public final t9f[] typeParametersSerializers() {
        return ild.k;
    }
}
