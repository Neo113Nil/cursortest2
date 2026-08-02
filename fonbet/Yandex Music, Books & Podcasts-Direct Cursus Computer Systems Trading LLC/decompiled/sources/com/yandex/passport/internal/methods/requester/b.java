package com.yandex.passport.internal.methods.requester;

import android.os.Bundle;
import com.yandex.passport.internal.methods.v5;
import com.yandex.passport.internal.methods.w5;
import defpackage.aur;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.xq0;
import defpackage.z7o;
import java.util.Iterator;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class b extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ f l;
    public final /* synthetic */ v5 m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ b(f fVar, v5 v5Var, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = fVar;
        this.m = v5Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new b(this.l, this.m, continuation, 0);
            default:
                return new b(this.l, this.m, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((b) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        Object r;
        Object a;
        int i = this.j;
        f fVar = this.l;
        v5 v5Var = this.m;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    a aVar = new a(fVar, v5Var);
                    Unit unit = Unit.a;
                    this.k = 1;
                    r = aVar.r(unit, this);
                    if (r == nm6Var) {
                        return nm6Var;
                    }
                } else {
                    if (i2 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    r = ((z7o) obj).a;
                }
                return new z7o(r);
            default:
                nm6 nm6Var2 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    w5 w5Var = v5Var.a;
                    Bundle bundle = new Bundle();
                    Iterator it = v5Var.a().iterator();
                    while (it.hasNext()) {
                        ((com.yandex.passport.internal.methods.e) it.next()).b(bundle);
                    }
                    this.k = 1;
                    a = f.a(fVar, w5Var, bundle, this);
                    if (a == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i3 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                    a = ((z7o) obj).a;
                }
                r7o r7oVar = z7o.b;
                if (!(a instanceof t7o)) {
                    try {
                        a = v5Var.c((Bundle) a);
                        qgg.h0(a);
                    } catch (Throwable th) {
                        r7o r7oVar2 = z7o.b;
                        a = new t7o(th);
                    }
                }
                return new z7o(a);
        }
    }
}
