package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.aur;
import defpackage.dzf;
import defpackage.ktm;
import defpackage.kyf;
import defpackage.ltm;
import defpackage.nm6;
import defpackage.oc4;
import defpackage.qgg;
import defpackage.ru2;
import defpackage.uif;
import defpackage.uyf;
import defpackage.we7;
import defpackage.xq0;
import defpackage.y7g;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

@we7(c = "ru.kinopoisk.cast.CastConnectionStateProvider$Companion$getLifecycleState$1", f = "CastConnectionStateProvider.kt", l = {132}, m = "invokeSuspend")
/* renamed from: ru.kinopoisk.sdk.easylogin.internal.s0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1212s0 extends aur implements Function2<ltm, Continuation<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ dzf c;

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.s0$a */
    public static final class a extends uif implements Function0<Unit> {
        public final /* synthetic */ dzf a;
        public final /* synthetic */ uyf b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(dzf dzfVar, uyf uyfVar) {
            super(0);
            this.a = dzfVar;
            this.b = uyfVar;
        }

        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            this.a.getLifecycle().d(this.b);
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1212s0(dzf dzfVar, Continuation<? super C1212s0> continuation) {
        super(2, continuation);
        this.c = dzfVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void a(ltm ltmVar, dzf dzfVar, kyf kyfVar) {
        if (dzfVar.getLifecycle().b().compareTo(kyfVar.a()) <= 0) {
            ktm ktmVar = (ktm) ltmVar;
            ktmVar.getClass();
            ktmVar.c(kyfVar.a());
        }
        if (kyfVar == kyf.ON_DESTROY) {
            ((oc4) ltmVar).p0(null);
        }
    }

    @Override // defpackage.kq2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C1212s0 c1212s0 = new C1212s0(this.c, continuation);
        c1212s0.b = obj;
        return c1212s0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        C1212s0 c1212s0 = new C1212s0(this.c, (Continuation) obj2);
        c1212s0.b = (ltm) obj;
        return c1212s0.invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.a;
        if (i == 0) {
            qgg.h0(obj);
            ltm ltmVar = (ltm) this.b;
            ru2 ru2Var = new ru2(12, ltmVar);
            this.c.getLifecycle().a(ru2Var);
            a aVar = new a(this.c, ru2Var);
            this.a = 1;
            if (y7g.q(ltmVar, aVar, this) == nm6Var) {
                return nm6Var;
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
