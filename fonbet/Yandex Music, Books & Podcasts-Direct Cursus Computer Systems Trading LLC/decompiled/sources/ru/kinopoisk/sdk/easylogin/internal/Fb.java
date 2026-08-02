package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.aur;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.rjc;
import defpackage.we7;
import defpackage.xq0;
import java.util.List;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

@we7(c = "ru.kinopoisk.tvauth.discovery.presentation.TvSearchManager$search$4", f = "TvSearchManager.kt", l = {68}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class Fb extends aur implements Function2<rjc, Continuation<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Gb c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Fb(Gb gb, Continuation<? super Fb> continuation) {
        super(2, continuation);
        this.c = gb;
    }

    @Override // defpackage.kq2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        Fb fb = new Fb(this.c, continuation);
        fb.b = obj;
        return fb;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        Fb fb = new Fb(this.c, (Continuation) obj2);
        fb.b = (rjc) obj;
        return fb.invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.a;
        if (i == 0) {
            qgg.h0(obj);
            rjc rjcVar = (rjc) this.b;
            if (!((List) this.c.h.getValue()).isEmpty()) {
                List list = (List) this.c.h.getValue();
                this.a = 1;
                if (rjcVar.emit(list, this) == nm6Var) {
                    return nm6Var;
                }
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        return Unit.a;
    }
}
