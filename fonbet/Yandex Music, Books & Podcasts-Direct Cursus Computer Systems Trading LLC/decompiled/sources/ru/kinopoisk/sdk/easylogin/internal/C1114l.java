package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.aur;
import defpackage.cg6;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.we7;
import defpackage.xq0;
import defpackage.z7o;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import ru.kinopoisk.sdk.easylogin.internal.AbstractC1066h7;
import timber.log.Timber;

@we7(c = "ru.kinopoisk.cast.interaction.AbstractTvInteractor$openApp$2", f = "AbstractTvInteractor.kt", l = {37, 39}, m = "invokeSuspend")
/* renamed from: ru.kinopoisk.sdk.easylogin.internal.l, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1114l extends aur implements Function2<mm6, Continuation<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ defpackage.s9 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1114l(defpackage.s9 s9Var, Continuation continuation) {
        super(2, continuation);
        this.c = s9Var;
    }

    @Override // defpackage.kq2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C1114l c1114l = new C1114l(this.c, continuation);
        c1114l.b = obj;
        return c1114l;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C1114l c1114l = new C1114l(this.c, (Continuation) obj2);
        c1114l.b = (mm6) obj;
        return c1114l.invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        Object t7oVar;
        nm6 nm6Var = nm6.a;
        int i = this.a;
        try {
            if (i == 0) {
                qgg.h0(obj);
                defpackage.s9 s9Var = this.c;
                r7o r7oVar = z7o.b;
                this.a = 1;
                if (s9Var.a((cg6) this) == nm6Var) {
                    return nm6Var;
                }
            } else {
                if (i != 1 && i != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
            }
            t7oVar = Unit.a;
            r7o r7oVar2 = z7o.b;
        } catch (Throwable th) {
            r7o r7oVar3 = z7o.b;
            t7oVar = new t7o(th);
        }
        defpackage.s9 s9Var2 = this.c;
        Throwable a = z7o.a(t7oVar);
        if (a != null) {
            Timber.INSTANCE.tag(s9Var2.a()).i(a, "Failed to launch", new Object[0]);
        }
        Throwable a2 = z7o.a(t7oVar);
        if (a2 == null) {
            return Unit.a;
        }
        if (a2 instanceof AbstractC1066h7) {
            throw a2;
        }
        throw new AbstractC1066h7.b(null, a2, 1, null);
    }
}
