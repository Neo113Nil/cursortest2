package com.yandex.passport.internal.ui.sloth.authsdk;

import com.yandex.passport.internal.report.reporters.o1;
import defpackage.aur;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.pjc;
import defpackage.qgg;
import defpackage.xq0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

/* loaded from: classes4.dex */
public final class j extends aur implements Function2 {
    public final /* synthetic */ int j;
    public int k;
    public final /* synthetic */ pjc l;
    public final /* synthetic */ AuthSdkSlothActivity m;
    public final /* synthetic */ o1 n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ j(pjc pjcVar, Continuation continuation, AuthSdkSlothActivity authSdkSlothActivity, o1 o1Var, int i) {
        super(2, continuation);
        this.j = i;
        this.l = pjcVar;
        this.m = authSdkSlothActivity;
        this.n = o1Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.j) {
            case 0:
                return new j(this.l, continuation, this.m, this.n, 0);
            default:
                return new j(this.l, continuation, this.m, this.n, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        mm6 mm6Var = (mm6) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.j) {
        }
        return ((j) create(mm6Var, continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        switch (this.j) {
            case 0:
                nm6 nm6Var = nm6.a;
                int i = this.k;
                if (i == 0) {
                    qgg.h0(obj);
                    i iVar = new i(this.m, this.n, 0);
                    this.k = 1;
                    if (this.l.collect(iVar, this) == nm6Var) {
                    }
                } else if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                int i2 = this.k;
                if (i2 == 0) {
                    qgg.h0(obj);
                    i iVar2 = new i(this.m, this.n, 1);
                    this.k = 1;
                    if (this.l.collect(iVar2, this) == nm6Var2) {
                    }
                } else if (i2 != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    qgg.h0(obj);
                }
                break;
        }
        return Unit.a;
    }
}
