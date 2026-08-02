package com.yandex.passport.internal.badges;

import androidx.core.app.n0;
import com.yandex.passport.data.network.h3;
import com.yandex.passport.data.network.z2;
import com.yandex.passport.internal.report.ff;
import com.yandex.passport.internal.report.l2;
import com.yandex.passport.internal.report.m2;
import com.yandex.passport.internal.report.reporters.k;
import com.yandex.passport.internal.report.ue;
import defpackage.cg6;
import defpackage.j9w;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.x97;
import defpackage.xq0;
import defpackage.z7o;
import kotlin.Unit;
import kotlin.coroutines.Continuation;

/* loaded from: classes4.dex */
public final class j extends n0 {
    public final c b;
    public final h3 c;
    public final k d;
    public final com.yandex.passport.internal.network.mappers.b e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(com.yandex.passport.common.coroutine.a aVar, c cVar, h3 h3Var, k kVar, com.yandex.passport.internal.network.mappers.b bVar) {
        super((kotlinx.coroutines.a) ((com.yandex.passport.common.coroutine.b) aVar).d);
        aVar.getClass();
        cVar.getClass();
        h3Var.getClass();
        kVar.getClass();
        bVar.getClass();
        this.b = cVar;
        this.c = h3Var;
        this.d = kVar;
        this.e = bVar;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(9:0|1|(2:3|(6:5|6|7|(1:(1:(1:(4:12|13|14|15)(2:17|18))(3:19|20|(2:22|(1:24)(1:27))(3:28|14|15)))(2:29|30))(3:38|39|(2:41|26))|31|(2:33|34)(4:35|(2:37|26)|20|(0)(0))))|44|6|7|(0)(0)|31|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00ae, code lost:
    
        if (r12 == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0034, code lost:
    
        r12 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x00d3, code lost:
    
        r8.getClass();
        r8.n(com.yandex.passport.internal.report.l2.d, new com.yandex.passport.internal.report.ff(r12), new com.yandex.passport.internal.report.ue(r12));
     */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0090 A[Catch: Exception -> 0x0034, TryCatch #0 {Exception -> 0x0034, blocks: (B:12:0x002f, B:13:0x00b1, B:19:0x003d, B:20:0x0086, B:22:0x0090, B:27:0x00ac, B:28:0x00ba, B:30:0x0043, B:31:0x0060, B:33:0x0068, B:35:0x006b, B:39:0x004a), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00ba A[Catch: Exception -> 0x0034, TRY_LEAVE, TryCatch #0 {Exception -> 0x0034, blocks: (B:12:0x002f, B:13:0x00b1, B:19:0x003d, B:20:0x0086, B:22:0x0090, B:27:0x00ac, B:28:0x00ba, B:30:0x0043, B:31:0x0060, B:33:0x0068, B:35:0x006b, B:39:0x004a), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0068 A[Catch: Exception -> 0x0034, TryCatch #0 {Exception -> 0x0034, blocks: (B:12:0x002f, B:13:0x00b1, B:19:0x003d, B:20:0x0086, B:22:0x0090, B:27:0x00ac, B:28:0x00ba, B:30:0x0043, B:31:0x0060, B:33:0x0068, B:35:0x006b, B:39:0x004a), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x006b A[Catch: Exception -> 0x0034, TryCatch #0 {Exception -> 0x0034, blocks: (B:12:0x002f, B:13:0x00b1, B:19:0x003d, B:20:0x0086, B:22:0x0090, B:27:0x00ac, B:28:0x00ba, B:30:0x0043, B:31:0x0060, B:33:0x0068, B:35:0x006b, B:39:0x004a), top: B:7:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    @Override // androidx.core.app.n0
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object x(com.yandex.passport.common.core.b bVar, cg6 cg6Var) {
        i iVar;
        Object obj;
        int i;
        Throwable a;
        if (cg6Var instanceof i) {
            iVar = (i) cg6Var;
            int i2 = iVar.m;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                iVar.m = i2 - Integer.MIN_VALUE;
                obj = iVar.k;
                nm6 nm6Var = nm6.a;
                i = iVar.m;
                c cVar = this.b;
                int i3 = 1;
                k kVar = this.d;
                Continuation continuation = null;
                if (i != 0) {
                    qgg.h0(obj);
                    iVar.j = bVar;
                    iVar.m = 1;
                    obj = x97.V(((com.yandex.passport.common.coroutine.b) cVar.a).d, new b(cVar, continuation, i3), iVar);
                    if (obj == nm6Var) {
                        return nm6Var;
                    }
                } else if (i == 1) {
                    bVar = iVar.j;
                    qgg.h0(obj);
                } else {
                    if (i != 2) {
                        if (i != 3) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        kVar.getClass();
                        kVar.p(m2.d);
                        return Unit.a;
                    }
                    qgg.h0(obj);
                    Object obj2 = ((z7o) obj).a;
                    a = z7o.a(obj2);
                    if (a == null) {
                        kVar.getClass();
                        kVar.n(l2.d, new ff(a), new ue(a));
                        return Unit.a;
                    }
                    String str = ((com.yandex.passport.data.models.d) obj2).a;
                    iVar.j = null;
                    iVar.m = 3;
                    Object V = x97.V(((com.yandex.passport.common.coroutine.b) cVar.a).d, new j9w(cVar, str, continuation, 12), iVar);
                    if (V != nm6Var) {
                        V = Unit.a;
                    }
                }
                if (!((Boolean) obj).booleanValue()) {
                    return Unit.a;
                }
                h3 h3Var = this.c;
                this.e.getClass();
                z2 z2Var = new z2(com.yandex.passport.internal.network.mappers.b.a(bVar));
                iVar.j = null;
                iVar.m = 2;
                obj = h3Var.g(z2Var, iVar);
                if (obj == nm6Var) {
                    return nm6Var;
                }
                Object obj22 = ((z7o) obj).a;
                a = z7o.a(obj22);
                if (a == null) {
                }
            }
        }
        iVar = new i(this, cg6Var);
        obj = iVar.k;
        nm6 nm6Var2 = nm6.a;
        i = iVar.m;
        c cVar2 = this.b;
        int i32 = 1;
        k kVar2 = this.d;
        Continuation continuation2 = null;
        if (i != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }
}
