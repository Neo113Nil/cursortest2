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

@we7(c = "ru.kinopoisk.cast.samsung.SamsungCastDeviceManager$discoveryFlow$2", f = "SamsungCastDeviceManager.kt", l = {65}, m = "invokeSuspend")
/* renamed from: ru.kinopoisk.sdk.easylogin.internal.c8, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C0997c8 extends aur implements ryc {
    public int a;
    public /* synthetic */ Throwable b;
    public final /* synthetic */ C0983b8 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0997c8(C0983b8 c0983b8, Continuation<? super C0997c8> continuation) {
        super(4, continuation);
        this.c = c0983b8;
    }

    @Override // defpackage.ryc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        ((Number) obj3).longValue();
        C0997c8 c0997c8 = new C0997c8(this.c, (Continuation) obj4);
        c0997c8.b = (Throwable) obj2;
        return c0997c8.invokeSuspend(Unit.a);
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
            f0.a(C1121l6.a.C0039a.b, "SamsungCastDeviceManager", "error", th, new Object[0]);
            long j = this.c.c.a;
            this.a = 1;
            if (y2x.p(j, this) == nm6Var) {
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
