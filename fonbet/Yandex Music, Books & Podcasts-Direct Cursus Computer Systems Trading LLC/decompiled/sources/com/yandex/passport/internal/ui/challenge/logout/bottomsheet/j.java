package com.yandex.passport.internal.ui.challenge.logout.bottomsheet;

import com.google.android.material.bottomsheet.BottomSheetBehavior;
import defpackage.aur;
import defpackage.lyf;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.nyf;
import defpackage.o8g;
import defpackage.ouj;
import defpackage.qgg;
import defpackage.x0q;
import defpackage.xq0;
import defpackage.y2x;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class j extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ LogoutBottomSheetActivity l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(LogoutBottomSheetActivity logoutBottomSheetActivity, Continuation continuation, int i) {
        super(2, continuation);
        this.j = i;
        this.l = logoutBottomSheetActivity;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new j(this.l, continuation, 0);
            case 1:
                return new j(this.l, continuation, 1);
            default:
                return new j(this.l, continuation, 2);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
            case 0:
                ((j) create(mm6Var, continuation)).invokeSuspend(Unit.a);
                break;
        }
        return ((j) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        int i2 = 0;
        LogoutBottomSheetActivity logoutBottomSheetActivity = this.l;
        Continuation continuation = null;
        int i3 = 1;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i4 = this.k;
                if (i4 != 0) {
                    if (i4 == 1) {
                        throw ouj.e(obj);
                    }
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                int i5 = LogoutBottomSheetActivity.k;
                x0q x0qVar = logoutBottomSheetActivity.k().q;
                i iVar = new i(logoutBottomSheetActivity, i3);
                this.k = 1;
                x0qVar.getClass();
                x0q.m(x0qVar, iVar, this);
                return nm6Var;
            case 1:
                nm6 nm6Var2 = nm6.a;
                int i6 = this.k;
                if (i6 == 0) {
                    qgg.h0(obj);
                    nyf lifecycle = logoutBottomSheetActivity.getLifecycle();
                    lyf lyfVar = lyf.c;
                    j jVar = new j(logoutBottomSheetActivity, continuation, i2);
                    this.k = 1;
                    if (o8g.J(lifecycle, lyfVar, jVar, this) == nm6Var2) {
                        return nm6Var2;
                    }
                } else {
                    if (i6 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                return Unit.a;
            default:
                nm6 nm6Var3 = nm6.a;
                int i7 = this.k;
                if (i7 == 0) {
                    qgg.h0(obj);
                    long a = com.yandex.passport.common.time.a.a(0, 0, 100);
                    this.k = 1;
                    if (y2x.o(a, this) == nm6Var3) {
                        return nm6Var3;
                    }
                } else {
                    if (i7 != 1) {
                        xq0.q("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    qgg.h0(obj);
                }
                int i8 = LogoutBottomSheetActivity.k;
                BottomSheetBehavior bottomSheetBehavior = ((com.yandex.passport.internal.ui.bouncer.roundabout.o) logoutBottomSheetActivity.d.getValue()).e;
                bottomSheetBehavior.setState(3);
                bottomSheetBehavior.addBottomSheetCallback((g) logoutBottomSheetActivity.f.getValue());
                return Unit.a;
        }
    }
}
