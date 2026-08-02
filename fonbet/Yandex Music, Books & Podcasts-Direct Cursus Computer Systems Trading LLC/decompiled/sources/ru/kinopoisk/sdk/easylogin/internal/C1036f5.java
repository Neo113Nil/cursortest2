package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.aur;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.ot0;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.we7;
import defpackage.x97;
import defpackage.xq0;
import defpackage.z7o;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import ru.kinopoisk.tvauth.internal.presentation.connectionerror.ConnectionErrorScreen;

@we7(c = "ru.kinopoisk.tvauth.internal.presentation.installtvapp.InstallTvAppViewModel$openAppStore$1", f = "InstallTvAppViewModel.kt", l = {50}, m = "invokeSuspend")
/* renamed from: ru.kinopoisk.sdk.easylogin.internal.f5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1036f5 extends aur implements Function2<mm6, Continuation<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ C1022e5 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1036f5(C1022e5 c1022e5, Continuation<? super C1036f5> continuation) {
        super(2, continuation);
        this.b = c1022e5;
    }

    @Override // defpackage.kq2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C1036f5(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1036f5(this.b, (Continuation) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        Object t7oVar;
        nm6 nm6Var = nm6.a;
        int i = this.a;
        try {
            if (i == 0) {
                qgg.h0(obj);
                I9 i9 = this.b.c;
                r7o r7oVar = z7o.b;
                this.a = 1;
                if (i9.a(this) == nm6Var) {
                    return nm6Var;
                }
            } else {
                if (i != 1) {
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
        C1022e5 c1022e5 = this.b;
        if (!(t7oVar instanceof t7o)) {
            int i2 = C1022e5.g;
            c1022e5.getClass();
            x97.y(ot0.F(c1022e5), null, null, new C1050g5(c1022e5, null), 3);
        }
        C1022e5 c1022e52 = this.b;
        Throwable a = z7o.a(t7oVar);
        if (a != null) {
            c1022e52.b.trackError(a);
            Z7.a(c1022e52.a.b, ConnectionErrorScreen.a);
        }
        return Unit.a;
    }
}
