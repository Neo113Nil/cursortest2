package com.yandex.passport.internal.config;

import androidx.core.app.n0;
import com.yandex.passport.data.network.b8;
import com.yandex.passport.data.network.c8;
import com.yandex.passport.data.network.t7;
import com.yandex.passport.data.network.y7;
import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.ic;
import com.yandex.passport.internal.report.jc;
import com.yandex.passport.internal.report.kc;
import com.yandex.passport.internal.report.ue;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.t7o;
import defpackage.tah;
import defpackage.v75;
import defpackage.xq0;
import defpackage.z7o;
import java.util.LinkedHashMap;
import java.util.List;

/* loaded from: classes4.dex */
public final class j extends n0 {
    public final c8 b;
    public final com.yandex.passport.internal.report.reporters.o c;
    public final e d;
    public final com.yandex.passport.internal.network.mappers.b e;
    public final a f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.yandex.passport.common.coroutine.a aVar, c8 c8Var, com.yandex.passport.internal.report.reporters.o oVar, e eVar, com.yandex.passport.internal.network.mappers.b bVar, a aVar2) {
        super((kotlinx.coroutines.a) ((com.yandex.passport.common.coroutine.b) aVar).d);
        aVar.getClass();
        c8Var.getClass();
        oVar.getClass();
        eVar.getClass();
        bVar.getClass();
        aVar2.getClass();
        this.b = c8Var;
        this.c = oVar;
        this.d = eVar;
        this.e = bVar;
        this.f = aVar2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:0|1|(2:3|(12:5|6|7|(1:(2:10|11)(2:31|32))(3:33|34|(2:36|37)(2:38|(1:40)))|12|(6:14|(1:16)|17|(2:20|18)|21|22)|23|(1:25)|26|27|28|29))|43|6|7|(0)(0)|12|(0)|23|(0)|26|27|28|29) */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x0033, code lost:
    
        r14 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00e8, code lost:
    
        r9.getClass();
        r9.n(com.yandex.passport.internal.report.ic.d, new com.yandex.passport.internal.report.ff(r14), new com.yandex.passport.internal.report.ue(r14));
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007a A[Catch: Exception -> 0x0033, TryCatch #0 {Exception -> 0x0033, blocks: (B:11:0x002f, B:12:0x0072, B:14:0x007a, B:17:0x0094, B:18:0x009d, B:20:0x00a3, B:22:0x00b1, B:23:0x00c5, B:25:0x00cb, B:26:0x00e3, B:34:0x0040, B:36:0x004c, B:38:0x004f), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cb A[Catch: Exception -> 0x0033, TryCatch #0 {Exception -> 0x0033, blocks: (B:11:0x002f, B:12:0x0072, B:14:0x007a, B:17:0x0094, B:18:0x009d, B:20:0x00a3, B:22:0x00b1, B:23:0x00c5, B:25:0x00cb, B:26:0x00e3, B:34:0x0040, B:36:0x004c, B:38:0x004f), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x003d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    @Override // androidx.core.app.n0
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object x(com.yandex.passport.common.core.b bVar, cg6 cg6Var) {
        i iVar;
        int i;
        Object obj;
        Throwable a;
        if (cg6Var instanceof i) {
            iVar = (i) cg6Var;
            int i2 = iVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.m = i2 - Integer.MIN_VALUE;
                Object obj2 = iVar.k;
                nm6 nm6Var = nm6.a;
                i = iVar.m;
                boolean z = false;
                e eVar = this.d;
                com.yandex.passport.internal.report.reporters.o oVar = this.c;
                if (i != 0) {
                    qgg.h0(obj2);
                    eVar.getClass();
                    bVar.getClass();
                    if (eVar.a(bVar, "last_update_app_account_visibility", "package_name_app_account_visibility")) {
                        return Boolean.TRUE;
                    }
                    oVar.getClass();
                    oVar.p(jc.d);
                    c8 c8Var = this.b;
                    this.e.getClass();
                    t7 t7Var = new t7(com.yandex.passport.internal.network.mappers.b.a(bVar));
                    iVar.j = bVar;
                    iVar.m = 1;
                    obj2 = c8Var.g(t7Var, iVar);
                    if (obj2 == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    bVar = iVar.j;
                    qgg.h0(obj2);
                }
                obj = ((z7o) obj2).a;
                if (!(obj instanceof t7o)) {
                    y7 y7Var = (y7) obj;
                    a aVar = this.f;
                    List list = y7Var.a;
                    List<b8> list2 = y7Var.b;
                    int a2 = tah.a(v75.o(list2, 10));
                    if (a2 < 16) {
                        a2 = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(a2);
                    for (b8 b8Var : list2) {
                        linkedHashMap.put(b8Var.a, b8Var.b);
                    }
                    aVar.a(list, linkedHashMap);
                    eVar.getClass();
                    bVar.getClass();
                    eVar.b(bVar, "last_update_app_account_visibility", "package_name_app_account_visibility");
                    oVar.getClass();
                    oVar.p(kc.d);
                }
                a = z7o.a(obj);
                if (a != null) {
                    oVar.getClass();
                    oVar.n(ic.d, new ff(a), new ue(a));
                }
                z = !(obj instanceof t7o);
                return Boolean.valueOf(z);
            }
        }
        iVar = new i(this, cg6Var);
        Object obj22 = iVar.k;
        nm6 nm6Var2 = nm6.a;
        i = iVar.m;
        boolean z2 = false;
        e eVar2 = this.d;
        com.yandex.passport.internal.report.reporters.o oVar2 = this.c;
        if (i != 0) {
        }
        obj = ((z7o) obj22).a;
        if (!(obj instanceof t7o)) {
        }
        a = z7o.a(obj);
        if (a != null) {
        }
        z2 = !(obj instanceof t7o);
        return Boolean.valueOf(z2);
    }
}
