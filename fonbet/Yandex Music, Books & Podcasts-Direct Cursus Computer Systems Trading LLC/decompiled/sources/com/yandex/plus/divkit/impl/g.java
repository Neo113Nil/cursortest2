package com.yandex.plus.divkit.impl;

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
    public int k;
    public /* synthetic */ Object l;
    public final /* synthetic */ i m;
    public final /* synthetic */ String n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ g(i iVar, String str, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.m = iVar;
        this.n = str;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                g gVar = new g(this.m, this.n, continuation, 0);
                gVar.l = obj;
                return gVar;
            default:
                g gVar2 = new g(this.m, this.n, continuation, 1);
                gVar2.l = obj;
                return gVar2;
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

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        t7o t7oVar;
        t7o t7oVar2;
        int i = this.j;
        String str = this.n;
        i iVar = this.m;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i2 = this.k;
                try {
                    if (i2 == 0) {
                        qgg.h0(obj);
                        r7o r7oVar = z7o.b;
                        com.yandex.plus.bdui.plus.content.controller.f b = ((com.yandex.plus.coil.b) iVar.a).b(str);
                        this.l = null;
                        this.k = 1;
                        obj = b.w(this);
                        if (obj == nm6Var) {
                            return nm6Var;
                        }
                    } else {
                        if (i2 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                    }
                    r7o r7oVar2 = z7o.b;
                } catch (wis e) {
                    r7o r7oVar3 = z7o.b;
                    t7oVar = new t7o(e);
                    obj = t7oVar;
                    return new z7o(obj);
                } catch (CancellationException e2) {
                    throw e2;
                } catch (Throwable th) {
                    r7o r7oVar4 = z7o.b;
                    t7oVar = new t7o(th);
                    obj = t7oVar;
                    return new z7o(obj);
                }
                return new z7o(obj);
            default:
                nm6 nm6Var2 = nm6.a;
                int i3 = this.k;
                try {
                    if (i3 == 0) {
                        qgg.h0(obj);
                        r7o r7oVar5 = z7o.b;
                        com.yandex.plus.bdui.plus.content.controller.f b2 = ((com.yandex.plus.coil.b) iVar.a).b(str);
                        this.l = null;
                        this.k = 1;
                        obj = b2.w(this);
                        if (obj == nm6Var2) {
                            return nm6Var2;
                        }
                    } else {
                        if (i3 != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj);
                    }
                    r7o r7oVar6 = z7o.b;
                } catch (wis e3) {
                    r7o r7oVar7 = z7o.b;
                    t7oVar2 = new t7o(e3);
                    obj = t7oVar2;
                    return new z7o(obj);
                } catch (CancellationException e4) {
                    throw e4;
                } catch (Throwable th2) {
                    r7o r7oVar8 = z7o.b;
                    t7oVar2 = new t7o(th2);
                    obj = t7oVar2;
                    return new z7o(obj);
                }
                return new z7o(obj);
        }
    }
}
