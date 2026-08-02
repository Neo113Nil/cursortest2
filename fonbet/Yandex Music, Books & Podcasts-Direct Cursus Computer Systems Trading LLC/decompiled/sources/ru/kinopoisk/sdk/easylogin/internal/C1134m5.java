package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.aur;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.ryc;
import defpackage.we7;
import defpackage.xq0;
import defpackage.y2x;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import ru.kinopoisk.sdk.easylogin.internal.C1121l6;

@we7(c = "ru.kinopoisk.cast.kinopoisk.internal.KinopoiskCastDeviceManager$discoveryFlow$3", f = "KinopoiskCastDeviceManager.kt", l = {65}, m = "invokeSuspend")
/* renamed from: ru.kinopoisk.sdk.easylogin.internal.m5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1134m5 extends aur implements ryc {
    public int a;
    public /* synthetic */ Throwable b;
    public final /* synthetic */ C1106k5 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1134m5(C1106k5 c1106k5, Continuation<? super C1134m5> continuation) {
        super(4, continuation);
        this.c = c1106k5;
    }

    @Override // defpackage.ryc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        ((Number) obj3).longValue();
        C1134m5 c1134m5 = new C1134m5(this.c, (Continuation) obj4);
        c1134m5.b = (Throwable) obj2;
        return c1134m5.invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.a;
        if (i == 0) {
            qgg.h0(obj);
            Throwable th = this.b;
            F0 f0 = this.c.b;
            f0.getClass();
            f0.a(C1121l6.a.C0039a.b, "KinopoiskCastDeviceManager", "error", th, new Object[0]);
            this.c.getClass();
            this.a = 1;
            if (y2x.o(2000L, this) == nm6Var) {
                return nm6Var;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        return Boolean.TRUE;
    }
}
