package defpackage;

import android.os.SystemClock;
import com.yandex.passport.common.account.a;
import com.yandex.passport.common.core.b;
import com.yandex.passport.data.network.o8;
import com.yandex.passport.data.network.t8;
import com.yandex.passport.internal.methods.performer.q0;
import com.yandex.passport.internal.report.we;
import com.yandex.plus.bdui.plus.content.controller.f;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class hkc extends aur implements Function2 {
    public final /* synthetic */ int j = 1;
    public int k;
    public final /* synthetic */ long l;
    public final /* synthetic */ Object m;
    public /* synthetic */ Object n;
    public final /* synthetic */ Object o;
    public final /* synthetic */ Object p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hkc(long j, j7i j7iVar, pjc pjcVar, a0p a0pVar, xqn xqnVar, Continuation continuation) {
        super(2, continuation);
        this.l = j;
        this.n = j7iVar;
        this.o = pjcVar;
        this.p = a0pVar;
        this.m = xqnVar;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                hkc hkcVar = new hkc((xqn) this.m, (ltm) this.o, (Function2) this.p, this.l, continuation);
                hkcVar.n = obj;
                return hkcVar;
            case 1:
                return new hkc(this.l, (j7i) this.n, (pjc) this.o, (a0p) this.p, (xqn) this.m, continuation);
            case 2:
                return new hkc((q0) this.n, (b) this.m, this.l, (String) this.o, (a) this.p, continuation);
            default:
                return new hkc(this.n, continuation, (Set) this.m, (f) this.o, this.l, this.p);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.j) {
        }
        return ((hkc) create((mm6) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x01a5, code lost:
    
        if (defpackage.y2x.o(r4 - r15, r17) == r11) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0155, code lost:
    
        if (defpackage.xg.B(r4, (defpackage.pjc) r8, (defpackage.a0p) r3, (defpackage.xqn) r6, r17) == r0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:73:?, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x0140, code lost:
    
        if (defpackage.y2x.o(r4, r17) == r0) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x01c3, code lost:
    
        if (r8.d.m(r0, r17) == r11) goto L95;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:?, code lost:
    
        return r11;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object t7oVar;
        int i = this.j;
        Object obj2 = this.p;
        long j = this.l;
        Object obj3 = this.m;
        Object obj4 = this.o;
        switch (i) {
            case 0:
                mm6 mm6Var = (ltm) obj4;
                xqn xqnVar = (xqn) obj3;
                Object obj5 = this.n;
                nm6 nm6Var = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    ab6 ab6Var = (ab6) xqnVar.a;
                    if (ab6Var != null) {
                        Object obj6 = ab6Var.a;
                        long j2 = ab6Var.b;
                        if (((Boolean) ((Function2) obj2).invoke(obj6, obj5)).booleanValue()) {
                            long elapsedRealtime = SystemClock.elapsedRealtime() - j2;
                            if (elapsedRealtime < j) {
                                this.n = obj5;
                                this.k = 1;
                                break;
                            }
                        }
                    }
                } else {
                    if (i2 != 1) {
                        if (i2 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                oc4 oc4Var = (oc4) mm6Var;
                if (!oc4Var.d.B()) {
                    xqnVar.a = new ab6(obj5);
                    this.n = null;
                    this.k = 2;
                    break;
                }
                return Unit.a;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    if (j < 0) {
                        j = 0;
                    }
                    this.k = 1;
                    break;
                } else {
                    if (i3 != 1) {
                        if (i3 == 2) {
                            qgg.h0(obj);
                            return Unit.a;
                        }
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                j7i j7iVar = (j7i) this.n;
                j7iVar.X = 0L;
                this.k = 2;
                break;
            case 2:
                nm6 nm6Var3 = nm6.a;
                int i4 = this.k;
                if (i4 != 0) {
                    if (i4 == 1) {
                        qgg.h0(obj);
                        return obj;
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                q0 q0Var = (q0) this.n;
                t8 t8Var = q0Var.b;
                q0Var.d.getClass();
                o8 o8Var = new o8(this.l, (a) obj2, com.yandex.passport.internal.network.mappers.b.a((b) obj3), (String) obj4);
                this.k = 1;
                Object g = t8Var.g(o8Var, this);
                return g == nm6Var3 ? nm6Var3 : g;
            default:
                com.yandex.plus.log.api.b bVar = (com.yandex.plus.log.api.b) ((f) obj4).b;
                nm6 nm6Var4 = nm6.a;
                int i5 = this.k;
                try {
                    if (i5 == 0) {
                        qgg.h0(obj);
                        com.yandex.plus.bdui.plus.data.a aVar = (com.yandex.plus.bdui.plus.data.a) this.n;
                        aVar.getClass();
                        LinkedHashSet U = CollectionsKt.U((Set) obj3, com.yandex.plus.bdui.plus.data.a.a);
                        if (U.isEmpty()) {
                            com.yandex.plus.log.api.a aVar2 = com.yandex.plus.log.api.a.c;
                            if (bVar.b(aVar2)) {
                                bVar.c(aVar2, "DefaultDataProvider", "getData(); needed placeholders is empty");
                            }
                            e5b e5bVar = e5b.a;
                            e5bVar.getClass();
                            return e5bVar;
                        }
                        com.yandex.plus.log.api.a aVar3 = com.yandex.plus.log.api.a.c;
                        if (bVar.b(aVar3)) {
                            bVar.c(aVar3, "DefaultDataProvider", "getData(); needed placeholders = " + U);
                        }
                        r7o r7oVar = z7o.b;
                        we weVar = new we(aVar, U, this.p, (Continuation) null, 28);
                        this.k = 1;
                        t7oVar = tyf.J(j, weVar, this);
                        if (t7oVar == nm6Var4) {
                            return nm6Var4;
                        }
                    } else {
                        if (i5 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                        t7oVar = obj;
                    }
                    r7o r7oVar2 = z7o.b;
                } catch (wis e) {
                    r7o r7oVar3 = z7o.b;
                    t7oVar = new t7o(e);
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable th) {
                    r7o r7oVar4 = z7o.b;
                    t7oVar = new t7o(th);
                }
                if (!(t7oVar instanceof t7o)) {
                    com.yandex.plus.log.api.a aVar4 = com.yandex.plus.log.api.a.c;
                    if (bVar.b(aVar4)) {
                        bVar.c(aVar4, "DefaultDataProvider", "getData() succeeded");
                    }
                }
                Throwable a = z7o.a(t7oVar);
                if (a == null) {
                    return (Map) t7oVar;
                }
                com.yandex.plus.log.api.a aVar5 = com.yandex.plus.log.api.a.e;
                if (bVar.b(aVar5)) {
                    bVar.a(aVar5, "DefaultDataProvider", "getData() failed", a);
                }
                throw new com.yandex.plus.core.templating.data.a("Some data sources failed!", a);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hkc(xqn xqnVar, ltm ltmVar, Function2 function2, long j, Continuation continuation) {
        super(2, continuation);
        this.m = xqnVar;
        this.o = ltmVar;
        this.p = function2;
        this.l = j;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hkc(q0 q0Var, b bVar, long j, String str, a aVar, Continuation continuation) {
        super(2, continuation);
        this.n = q0Var;
        this.m = bVar;
        this.l = j;
        this.o = str;
        this.p = aVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hkc(Object obj, Continuation continuation, Set set, f fVar, long j, Object obj2) {
        super(2, continuation);
        this.n = obj;
        this.m = set;
        this.o = fVar;
        this.l = j;
        this.p = obj2;
    }
}
