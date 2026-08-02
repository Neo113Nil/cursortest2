package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.aur;
import defpackage.fk0;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.vje;
import defpackage.we7;
import defpackage.xq0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

@we7(c = "ru.kinopoisk.tvauth.internal.presentation.entercode.view.EnterUserCodeFieldViewKt$CharContainer$1$1$1", f = "EnterUserCodeFieldView.kt", l = {98, 99}, m = "invokeSuspend")
/* renamed from: ru.kinopoisk.sdk.easylogin.internal.l3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1118l3 extends aur implements Function2<mm6, Continuation<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ fk0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1118l3(fk0 fk0Var, Continuation<? super C1118l3> continuation) {
        super(2, continuation);
        this.b = fk0Var;
    }

    @Override // defpackage.kq2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C1118l3(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1118l3(this.b, (Continuation) obj2).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        if (defpackage.fk0.c(r3, r4, r5, null, r9, 12) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0046, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x002d, code lost:
    
        if (r10.f(r1, r9) == r0) goto L15;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.a;
        if (i == 0) {
            qgg.h0(obj);
            fk0 fk0Var = this.b;
            Float f = new Float(1.0f);
            this.a = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    qgg.h0(obj);
                    return Unit.a;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        fk0 fk0Var2 = this.b;
        Float f2 = new Float(0.0f);
        vje vjeVar = C1160o3.a;
        this.a = 2;
    }
}
