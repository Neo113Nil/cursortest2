package com.yandex.passport.common.mvi;

import defpackage.aur;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.wis;
import defpackage.xq0;
import defpackage.z7o;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class g extends aur implements Function2 {
    public final /* synthetic */ int j;
    public Object k;
    public int l;
    public final /* synthetic */ h m;
    public final /* synthetic */ Object n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(h hVar, Object obj, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = hVar;
        this.n = obj;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new g(this.m, this.n, continuation, 0);
            default:
                return new g(this.m, this.n, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((g) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x005d, code lost:
    
        if (r6.f(r1) == r0) goto L32;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x00b3, code lost:
    
        if (r6.f(r1) == r0) goto L63;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00ab  */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        t7o t7oVar;
        Object obj2;
        Throwable a;
        t7o t7oVar2;
        Object obj3;
        Throwable a2;
        int i = this.j;
        Object obj4 = this.n;
        h hVar = this.m;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i2 = this.l;
                try {
                } catch (wis e) {
                    r7o r7oVar = z7o.b;
                    t7oVar = new t7o(e);
                    obj2 = t7oVar;
                    a = z7o.a(obj2);
                    if (a != null) {
                    }
                    return Unit.a;
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable th) {
                    r7o r7oVar2 = z7o.b;
                    t7oVar = new t7o(th);
                    obj2 = t7oVar;
                    a = z7o.a(obj2);
                    if (a != null) {
                    }
                    return Unit.a;
                }
                if (i2 == 0) {
                    qgg.h0(obj);
                    r7o r7oVar3 = z7o.b;
                    this.l = 1;
                    if (hVar.c(obj4, this) == nm6Var) {
                        return nm6Var;
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
                obj2 = Unit.a;
                r7o r7oVar4 = z7o.b;
                a = z7o.a(obj2);
                if (a != null) {
                    this.k = obj2;
                    this.l = 2;
                    break;
                }
                return Unit.a;
            default:
                nm6 nm6Var2 = nm6.a;
                int i3 = this.l;
                try {
                } catch (wis e3) {
                    r7o r7oVar5 = z7o.b;
                    t7oVar2 = new t7o(e3);
                    obj3 = t7oVar2;
                    a2 = z7o.a(obj3);
                    if (a2 != null) {
                    }
                    return Unit.a;
                } catch (CancellationException e4) {
                    throw e4;
                } catch (Throwable th2) {
                    r7o r7oVar6 = z7o.b;
                    t7oVar2 = new t7o(th2);
                    obj3 = t7oVar2;
                    a2 = z7o.a(obj3);
                    if (a2 != null) {
                    }
                    return Unit.a;
                }
                if (i3 == 0) {
                    qgg.h0(obj);
                    r7o r7oVar7 = z7o.b;
                    this.l = 1;
                    if (hVar.d(obj4, this) == nm6Var2) {
                        return nm6Var2;
                    }
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
                obj3 = Unit.a;
                r7o r7oVar8 = z7o.b;
                a2 = z7o.a(obj3);
                if (a2 != null) {
                    this.k = obj3;
                    this.l = 2;
                    break;
                }
                return Unit.a;
        }
    }
}
