package com.yandex.passport.sloth.ui;

import defpackage.aur;
import defpackage.nm6;
import defpackage.qgg;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* loaded from: classes4.dex */
public final class r0 extends aur implements Function1 {
    public final /* synthetic */ int j;
    public final /* synthetic */ s0 k;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ r0(s0 s0Var, Continuation continuation, int i) {
        super(1, continuation);
        this.j = i;
        this.k = s0Var;
    }

    @Override // defpackage.kq2
    public final Continuation create(Continuation continuation) {
        switch (this.j) {
            case 0:
                return new r0(this.k, continuation, 0);
            default:
                return new r0(this.k, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Continuation continuation = (Continuation) obj;
        switch (this.j) {
        }
        return ((r0) create(continuation)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i = this.j;
        s0 s0Var = this.k;
        switch (i) {
            case 0:
                nm6 nm6Var = nm6.a;
                qgg.h0(obj);
                Function0 function0 = s0Var.d;
                if (function0 != null) {
                    function0.invoke();
                }
                break;
            default:
                nm6 nm6Var2 = nm6.a;
                qgg.h0(obj);
                Function0 function02 = s0Var.d;
                if (function02 != null) {
                    function02.invoke();
                }
                break;
        }
        return Unit.a;
    }
}
