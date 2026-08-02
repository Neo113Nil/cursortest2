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

@we7(c = "ru.kinopoisk.cast.lg.internal.LgCastDeviceManager$discoveryFlow$3", f = "LgCastDeviceManager.kt", l = {72}, m = "invokeSuspend")
/* renamed from: ru.kinopoisk.sdk.easylogin.internal.y5, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1297y5 extends aur implements ryc {
    public int a;
    public /* synthetic */ Throwable b;
    public final /* synthetic */ C1271w5 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1297y5(C1271w5 c1271w5, Continuation<? super C1297y5> continuation) {
        super(4, continuation);
        this.c = c1271w5;
    }

    @Override // defpackage.ryc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        ((Number) obj3).longValue();
        C1297y5 c1297y5 = new C1297y5(this.c, (Continuation) obj4);
        c1297y5.b = (Throwable) obj2;
        return c1297y5.invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.a;
        if (i == 0) {
            qgg.h0(obj);
            Throwable th = this.b;
            this.c.b.a(C1121l6.a.C0039a.b, "LgCastDeviceManager", "error", th, new Object[0]);
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
