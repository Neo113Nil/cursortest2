package com.yandex.passport.internal.config;

import android.content.SharedPreferences;
import androidx.core.app.n0;
import com.yandex.passport.data.network.e6;
import com.yandex.passport.data.network.i6;
import com.yandex.passport.data.network.u5;
import com.yandex.passport.data.network.y5;
import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.ue;
import com.yandex.passport.internal.report.x4;
import com.yandex.passport.internal.report.y4;
import com.yandex.passport.internal.report.z4;
import com.yandex.passport.internal.report.ze;
import defpackage.ca8;
import defpackage.cg6;
import defpackage.dq7;
import defpackage.mn7;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.rhw;
import defpackage.t7o;
import defpackage.x97;
import defpackage.xq0;
import defpackage.z7o;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class l extends n0 {
    public final g b;
    public final i6 c;
    public final com.yandex.passport.internal.report.reporters.o d;
    public final e e;
    public final com.yandex.passport.internal.network.mappers.b f;
    public final com.yandex.passport.data.network.token.i g;
    public final com.yandex.passport.internal.filter.l h;
    public final com.yandex.passport.internal.config.template.g i;
    public final p j;
    public final h k;
    public final n l;
    public final b m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(com.yandex.passport.common.coroutine.a aVar, g gVar, i6 i6Var, com.yandex.passport.internal.report.reporters.o oVar, e eVar, com.yandex.passport.internal.network.mappers.b bVar, com.yandex.passport.data.network.token.i iVar, com.yandex.passport.internal.filter.l lVar, com.yandex.passport.internal.config.template.g gVar2, p pVar, h hVar, n nVar, b bVar2) {
        super((kotlinx.coroutines.a) ((com.yandex.passport.common.coroutine.b) aVar).d);
        aVar.getClass();
        gVar.getClass();
        i6Var.getClass();
        oVar.getClass();
        eVar.getClass();
        bVar.getClass();
        iVar.getClass();
        lVar.getClass();
        gVar2.getClass();
        pVar.getClass();
        hVar.getClass();
        nVar.getClass();
        bVar2.getClass();
        this.b = gVar;
        this.c = i6Var;
        this.d = oVar;
        this.e = eVar;
        this.f = bVar;
        this.g = iVar;
        this.h = lVar;
        this.i = gVar2;
        this.j = pVar;
        this.k = hVar;
        this.l = nVar;
        this.m = bVar2;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:0|1|(2:3|(6:5|6|7|(1:(1:(1:(10:12|13|14|15|(1:17)|18|19|(1:21)|26|27)(2:29|30))(11:31|32|33|34|35|36|37|38|(1:40)(1:44)|(8:43|15|(0)|18|19|(0)|26|27)|42))(2:48|49))(3:60|61|(2:63|64)(2:65|(2:67|42)))|50|(5:52|53|54|55|(2:57|42)(9:58|34|35|36|37|38|(0)(0)|(0)|42))(5:59|19|(0)|26|27)))|70|6|7|(0)(0)|50|(0)(0)|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0048, code lost:
    
        r0 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x0049, code lost:
    
        r17 = 0;
        r16 = 1;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0101 A[Catch: Exception -> 0x011c, TryCatch #1 {Exception -> 0x011c, blocks: (B:15:0x00fd, B:17:0x0101, B:18:0x011e, B:19:0x0158, B:21:0x015e, B:38:0x00ec, B:44:0x00f6), top: B:37:0x00ec }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x015e A[Catch: Exception -> 0x011c, TRY_LEAVE, TryCatch #1 {Exception -> 0x011c, blocks: (B:15:0x00fd, B:17:0x0101, B:18:0x011e, B:19:0x0158, B:21:0x015e, B:38:0x00ec, B:44:0x00f6), top: B:37:0x00ec }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f5  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00fb  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00f6 A[Catch: Exception -> 0x011c, TryCatch #1 {Exception -> 0x011c, blocks: (B:15:0x00fd, B:17:0x0101, B:18:0x011e, B:19:0x0158, B:21:0x015e, B:38:0x00ec, B:44:0x00f6), top: B:37:0x00ec }] */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00a9 A[Catch: Exception -> 0x0048, TRY_LEAVE, TryCatch #2 {Exception -> 0x0048, blocks: (B:13:0x003f, B:32:0x005d, B:49:0x0068, B:50:0x00a1, B:52:0x00a9, B:61:0x006f, B:63:0x007b, B:65:0x007e), top: B:7:0x0031 }] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0033  */
    @Override // androidx.core.app.n0
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object x(com.yandex.passport.common.core.b bVar, cg6 cg6Var) {
        k kVar;
        int i;
        char c;
        char c2;
        Object obj;
        y5 y5Var;
        com.yandex.passport.common.core.b bVar2;
        Object obj2;
        int i2;
        y5 y5Var2;
        Object V;
        com.yandex.passport.common.core.b bVar3;
        Object obj3;
        Throwable a;
        String str;
        com.yandex.passport.common.core.b bVar4 = bVar;
        if (cg6Var instanceof k) {
            kVar = (k) cg6Var;
            int i3 = kVar.p;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                kVar.p = i3 - Integer.MIN_VALUE;
                Object obj4 = kVar.n;
                nm6 nm6Var = nm6.a;
                i = kVar.p;
                e eVar = this.e;
                com.yandex.passport.internal.report.reporters.o oVar = this.d;
                if (i != 0) {
                    qgg.h0(obj4);
                    eVar.getClass();
                    bVar4.getClass();
                    if (eVar.a(bVar4, "last_update", "package_name")) {
                        return Unit.a;
                    }
                    oVar.getClass();
                    oVar.p(y4.d);
                    i6 i6Var = this.c;
                    this.f.getClass();
                    u5 u5Var = new u5(com.yandex.passport.internal.network.mappers.b.a(bVar4));
                    kVar.j = bVar4;
                    kVar.p = 1;
                    obj4 = i6Var.g(u5Var, kVar);
                    if (obj4 == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                xq0.q("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            y5Var2 = kVar.l;
                            obj3 = kVar.k;
                            bVar3 = kVar.j;
                            qgg.h0(obj4);
                            c = 0;
                            c2 = 1;
                            str = y5Var2.c;
                            if (str != null) {
                                p pVar = this.j;
                                pVar.getClass();
                                ((SharedPreferences) pVar.b.getValue()).edit().putString("white_list_key", str).apply();
                            }
                            this.b.a(bVar3, y5Var2.a, y5Var2.d);
                            this.k.f(bVar3, y5Var2.f);
                            this.l.a(bVar3, y5Var2.g, y5Var2.h);
                            this.m.b(bVar3, y5Var2.i, y5Var2.j);
                            eVar.getClass();
                            eVar.b(bVar3, "last_update", "package_name");
                            oVar.getClass();
                            oVar.p(z4.d);
                            obj = obj3;
                            a = z7o.a(obj);
                            if (a != null) {
                                oVar.getClass();
                                x4 x4Var = x4.d;
                                ff ffVar = new ff(a);
                                ue ueVar = new ue(a);
                                ze[] zeVarArr = new ze[2];
                                zeVarArr[c] = ffVar;
                                zeVarArr[c2] = ueVar;
                                oVar.n(x4Var, zeVarArr);
                            }
                            return Unit.a;
                        }
                        int i4 = kVar.m;
                        y5Var = kVar.l;
                        obj2 = kVar.k;
                        bVar2 = kVar.j;
                        qgg.h0(obj4);
                        i2 = i4;
                        c2 = 1;
                        y5Var2 = y5Var;
                        com.yandex.passport.internal.config.template.g gVar = this.i;
                        e6 e6Var = y5Var2.e;
                        kVar.j = bVar2;
                        kVar.k = obj2;
                        kVar.l = y5Var2;
                        kVar.m = i2;
                        kVar.p = 3;
                        gVar.getClass();
                        dq7 dq7Var = ca8.a;
                        c = 0;
                        try {
                            V = x97.V(mn7.d, new rhw(gVar, e6Var, (Continuation) null, 21), kVar);
                            if (V == nm6Var) {
                                V = Unit.a;
                            }
                        } catch (Exception e) {
                            e = e;
                            oVar.getClass();
                            x4 x4Var2 = x4.d;
                            ff ffVar2 = new ff(e);
                            ue ueVar2 = new ue(e);
                            ze[] zeVarArr2 = new ze[2];
                            zeVarArr2[c] = ffVar2;
                            zeVarArr2[c2] = ueVar2;
                            oVar.n(x4Var2, zeVarArr2);
                            return Unit.a;
                        }
                        if (V != nm6Var) {
                            bVar3 = bVar2;
                            obj3 = obj2;
                            str = y5Var2.c;
                            if (str != null) {
                            }
                            this.b.a(bVar3, y5Var2.a, y5Var2.d);
                            this.k.f(bVar3, y5Var2.f);
                            this.l.a(bVar3, y5Var2.g, y5Var2.h);
                            this.m.b(bVar3, y5Var2.i, y5Var2.j);
                            eVar.getClass();
                            eVar.b(bVar3, "last_update", "package_name");
                            oVar.getClass();
                            oVar.p(z4.d);
                            obj = obj3;
                            a = z7o.a(obj);
                            if (a != null) {
                            }
                            return Unit.a;
                        }
                        return nm6Var;
                    }
                    bVar4 = kVar.j;
                    qgg.h0(obj4);
                }
                obj = ((z7o) obj4).a;
                if (!(obj instanceof t7o)) {
                    c = 0;
                    c2 = 1;
                    a = z7o.a(obj);
                    if (a != null) {
                    }
                    return Unit.a;
                }
                y5Var = (y5) obj;
                com.yandex.passport.internal.filter.l lVar = this.h;
                com.yandex.passport.data.network.token.i iVar = this.g;
                c2 = 1;
                try {
                    List list = y5Var.b;
                    iVar.getClass();
                    com.yandex.passport.data.models.a k = com.yandex.passport.data.network.token.i.k(list);
                    kVar.j = bVar4;
                    kVar.k = obj;
                    kVar.l = y5Var;
                    kVar.m = 0;
                    kVar.p = 2;
                    if (lVar.e(k, kVar) == nm6Var) {
                        return nm6Var;
                    }
                    bVar2 = bVar4;
                    obj2 = obj;
                    i2 = 0;
                    y5Var2 = y5Var;
                    com.yandex.passport.internal.config.template.g gVar2 = this.i;
                    e6 e6Var2 = y5Var2.e;
                    kVar.j = bVar2;
                    kVar.k = obj2;
                    kVar.l = y5Var2;
                    kVar.m = i2;
                    kVar.p = 3;
                    gVar2.getClass();
                    dq7 dq7Var2 = ca8.a;
                    c = 0;
                    V = x97.V(mn7.d, new rhw(gVar2, e6Var2, (Continuation) null, 21), kVar);
                    if (V == nm6Var) {
                    }
                    if (V != nm6Var) {
                    }
                    return nm6Var;
                } catch (Exception e2) {
                    e = e2;
                    c = 0;
                    oVar.getClass();
                    x4 x4Var22 = x4.d;
                    ff ffVar22 = new ff(e);
                    ue ueVar22 = new ue(e);
                    ze[] zeVarArr22 = new ze[2];
                    zeVarArr22[c] = ffVar22;
                    zeVarArr22[c2] = ueVar22;
                    oVar.n(x4Var22, zeVarArr22);
                    return Unit.a;
                }
            }
        }
        kVar = new k(this, cg6Var);
        Object obj42 = kVar.n;
        nm6 nm6Var2 = nm6.a;
        i = kVar.p;
        e eVar2 = this.e;
        com.yandex.passport.internal.report.reporters.o oVar2 = this.d;
        if (i != 0) {
        }
        obj = ((z7o) obj42).a;
        if (!(obj instanceof t7o)) {
        }
    }
}
