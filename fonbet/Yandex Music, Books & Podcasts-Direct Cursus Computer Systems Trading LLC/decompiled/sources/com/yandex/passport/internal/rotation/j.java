package com.yandex.passport.internal.rotation;

import androidx.core.app.n0;
import com.yandex.passport.internal.l;
import com.yandex.passport.internal.report.reporters.k0;
import com.yandex.passport.internal.report.reporters.x0;
import com.yandex.passport.internal.usecase.a2;
import com.yandex.passport.internal.usecase.v1;
import com.yandex.passport.internal.usecase.x1;
import defpackage.cg6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.rhw;
import defpackage.t7o;
import defpackage.xq0;
import defpackage.z7o;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class j extends n0 {
    public final h b;
    public final a2 c;
    public final com.yandex.passport.internal.core.accounts.e d;
    public final k0 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.yandex.passport.common.coroutine.a aVar, h hVar, a2 a2Var, com.yandex.passport.internal.core.accounts.e eVar, k0 k0Var) {
        super((kotlinx.coroutines.a) ((com.yandex.passport.common.coroutine.b) aVar).d);
        aVar.getClass();
        hVar.getClass();
        a2Var.getClass();
        eVar.getClass();
        k0Var.getClass();
        this.b = hVar;
        this.c = a2Var;
        this.d = eVar;
        this.e = k0Var;
    }

    @Override // androidx.core.app.n0
    /* renamed from: s */
    public final /* bridge */ /* synthetic */ Object x(Object obj, rhw rhwVar) {
        return u(rhwVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(7:0|1|(2:3|(4:5|6|7|(1:(8:10|11|12|(1:40)|14|(10:16|(2:17|(2:19|(2:21|22)(1:35))(2:36|37))|23|(1:34)(1:29)|30|(1:32)|12|(0)|14|(0))|38|39)(2:42|43))(8:44|45|(1:47)|48|14|(0)|38|39)))|53|6|7|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x003d, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x0101, code lost:
    
        if (com.yandex.passport.common.logger.a.a.isEnabled() != false) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x0103, code lost:
    
        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.c, null, "Error RevokeQuarantineMasterToken with " + r0, 8);
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0082 A[Catch: Exception -> 0x003d, TryCatch #0 {Exception -> 0x003d, blocks: (B:11:0x0038, B:12:0x00ed, B:14:0x007c, B:16:0x0082, B:17:0x0090, B:19:0x0096, B:23:0x00a9, B:25:0x00b6, B:27:0x00bc, B:30:0x00c6, B:40:0x00f5, B:45:0x004a, B:47:0x0056, B:48:0x0067), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00f5 A[Catch: Exception -> 0x003d, TRY_LEAVE, TryCatch #0 {Exception -> 0x003d, blocks: (B:11:0x0038, B:12:0x00ed, B:14:0x007c, B:16:0x0082, B:17:0x0090, B:19:0x0096, B:23:0x00a9, B:25:0x00b6, B:27:0x00bc, B:30:0x00c6, B:40:0x00f5, B:45:0x004a, B:47:0x0056, B:48:0x0067), top: B:7:0x002c }] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x00ea -> B:12:0x00ed). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u(Continuation continuation) {
        i iVar;
        int i;
        Iterator it;
        List list;
        Object obj;
        if (continuation instanceof i) {
            iVar = (i) continuation;
            int i2 = iVar.o;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.o = i2 - Integer.MIN_VALUE;
                Object obj2 = iVar.m;
                nm6 nm6Var = nm6.a;
                i = iVar.o;
                h hVar = this.b;
                if (i != 0) {
                    qgg.h0(obj2);
                    List a = hVar.a();
                    if (com.yandex.passport.common.logger.a.a.isEnabled()) {
                        com.yandex.passport.common.logger.a.c(com.yandex.passport.common.logger.b.b, null, "Start RevokeQuarantineMasterToken with " + a, 8);
                    }
                    this.e.u(a);
                    ArrayList g = this.d.a().g();
                    it = a.iterator();
                    list = g;
                    if (it.hasNext()) {
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                g gVar = iVar.l;
                it = iVar.k;
                list = iVar.j;
                qgg.h0(obj2);
                Object obj3 = ((z7o) obj2).a;
                if (!(obj3 instanceof t7o)) {
                    hVar.b(gVar);
                }
                if (it.hasNext()) {
                    gVar = (g) it.next();
                    Iterator it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            obj = null;
                            break;
                        }
                        obj = it2.next();
                        if (Intrinsics.d(((l) obj).b, gVar.b)) {
                            break;
                        }
                    }
                    l lVar = (l) obj;
                    a2 a2Var = this.c;
                    String str = gVar.a;
                    if (str == null || str.length() <= 0 || str.equals("-")) {
                        str = null;
                    }
                    v1 v1Var = new v1(lVar, new com.yandex.passport.common.account.a(str), new x1(gVar.c), gVar.b, x0.g, true);
                    iVar.j = list;
                    iVar.k = it;
                    iVar.l = gVar;
                    iVar.o = 1;
                    obj2 = a2Var.g(v1Var, iVar);
                    if (obj2 == nm6Var) {
                        return nm6Var;
                    }
                    Object obj32 = ((z7o) obj2).a;
                    if (!(obj32 instanceof t7o)) {
                    }
                    if (it.hasNext()) {
                    }
                }
                return Unit.a;
            }
        }
        iVar = new i(this, (cg6) continuation);
        Object obj22 = iVar.m;
        nm6 nm6Var2 = nm6.a;
        i = iVar.o;
        h hVar2 = this.b;
        if (i != 0) {
        }
    }
}
