package ru.kinopoisk.sdk.easylogin.internal;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.aur;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.ryc;
import defpackage.we7;
import defpackage.xq0;
import defpackage.y2x;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import timber.log.Timber;

@we7(c = "ru.kinopoisk.pairing.nsd.NsdServiceResolver$resolve$4", f = "NsdServiceResolver.kt", l = {UibcKeyCode.TV_KEYCODE_4}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class Y6 extends aur implements ryc {
    public int a;
    public int b;
    public /* synthetic */ Throwable c;
    public /* synthetic */ long d;
    public final /* synthetic */ V6 e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y6(V6 v6, Continuation<? super Y6> continuation) {
        super(4, continuation);
        this.e = v6;
    }

    @Override // defpackage.ryc
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        long longValue = ((Number) obj3).longValue();
        Y6 y6 = new Y6(this.e, (Continuation) obj4);
        y6.c = (Throwable) obj2;
        y6.d = longValue;
        return y6.invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        int i;
        nm6 nm6Var = nm6.a;
        int i2 = this.b;
        if (i2 == 0) {
            qgg.h0(obj);
            Throwable th = this.c;
            long j = this.d;
            int i3 = j < this.e.b.d ? 1 : 0;
            Timber.INSTANCE.tag("NsdServiceResolver").d(th, "retryWhen attempt:%s", new Long(j));
            if (i3 != 0) {
                long j2 = this.e.b.e;
                this.a = i3;
                this.b = 1;
                if (y2x.o(j2, this) == nm6Var) {
                    return nm6Var;
                }
            }
            i = i3;
        } else {
            if (i2 != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i = this.a;
            qgg.h0(obj);
        }
        return Boolean.valueOf(i != 0);
    }
}
