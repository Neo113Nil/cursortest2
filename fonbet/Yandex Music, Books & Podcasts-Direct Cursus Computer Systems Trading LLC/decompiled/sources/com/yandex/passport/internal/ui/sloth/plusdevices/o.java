package com.yandex.passport.internal.ui.sloth.plusdevices;

import com.yandex.passport.sloth.ui.a1;
import com.yandex.passport.sloth.ui.t0;
import defpackage.aur;
import defpackage.gld;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.ouj;
import defpackage.qgg;
import defpackage.x0q;
import defpackage.xq0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes4.dex */
public final class o extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ ManagingPlusDevicesSlothActivity l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o(ManagingPlusDevicesSlothActivity managingPlusDevicesSlothActivity, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = managingPlusDevicesSlothActivity;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new o(this.l, continuation, 0);
            case 1:
                return new o(this.l, continuation, 1);
            default:
                return new o(this.l, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
            case 0:
                return ((o) create(mm6Var, continuation)).invokeSuspend(Unit.a);
            case 1:
                return ((o) create(mm6Var, continuation)).invokeSuspend(Unit.a);
            default:
                ((o) create(mm6Var, continuation)).invokeSuspend(Unit.a);
                return nm6.a;
        }
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        ManagingPlusDevicesSlothActivity managingPlusDevicesSlothActivity = this.l;
        Continuation continuation = null;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    t tVar = (t) managingPlusDevicesSlothActivity.e.getValue();
                    com.yandex.passport.internal.ui.sloth.s sVar = managingPlusDevicesSlothActivity.b;
                    if (sVar == null) {
                        Intrinsics.j("component");
                        throw null;
                    }
                    com.yandex.passport.sloth.data.m params = sVar.getParams();
                    this.k = 1;
                    obj = tVar.a(params, this);
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
                a1 a1Var = (a1) obj;
                com.yandex.passport.internal.ui.sloth.s sVar2 = managingPlusDevicesSlothActivity.b;
                if (sVar2 != null) {
                    ((com.yandex.passport.sloth.ui.b0) sVar2.getUi().b.d.getValue()).e(new t0(a1Var));
                    return Unit.a;
                }
                Intrinsics.j("component");
                throw null;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i3 = this.k;
                if (i3 == 0) {
                    qgg.h0(obj);
                    this.k = 1;
                    int i4 = ManagingPlusDevicesSlothActivity.g;
                    if (gld.Q(new com.yandex.passport.internal.storage.a(managingPlusDevicesSlothActivity, continuation, 19), this) == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i3 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            default:
                nm6 nm6Var3 = nm6.a;
                int i5 = this.k;
                if (i5 != 0) {
                    if (i5 == 1) {
                        throw ouj.e(obj);
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                x0q x0qVar = ((t) managingPlusDevicesSlothActivity.e.getValue()).k;
                com.yandex.passport.common.ui.compose.a aVar = new com.yandex.passport.common.ui.compose.a(10, managingPlusDevicesSlothActivity);
                this.k = 1;
                x0qVar.getClass();
                x0q.m(x0qVar, aVar, this);
                return nm6Var3;
        }
    }
}
