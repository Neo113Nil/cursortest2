package ru.kinopoisk.sdk.easylogin.internal;

import com.connectsdk.service.webos.lgcast.screenmirroring.uibc.UibcKeyCode;
import defpackage.aur;
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
import ru.kinopoisk.sdk.easylogin.internal.W8;
import ru.kinopoisk.tvauth.internal.presentation.connectionerror.ConnectionErrorScreen;
import ru.kinopoisk.tvauth.internal.presentation.entercode.EnterCodeScreen;
import ru.kinopoisk.tvauth.internal.presentation.installtvapp.InstallTvAppScreen;
import timber.log.Timber;

@we7(c = "ru.kinopoisk.tvauth.internal.presentation.updatecode.UpdateCodeViewModel$onRequestNewCodeClick$2", f = "UpdateCodeViewModel.kt", l = {UibcKeyCode.TV_KEYCODE_1}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class Ic extends aur implements Function2<mm6, Continuation<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ Hc b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Ic(Hc hc, Continuation<? super Ic> continuation) {
        super(2, continuation);
        this.b = hc;
    }

    @Override // defpackage.kq2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new Ic(this.b, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new Ic(this.b, (Continuation) obj2).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        Object t7oVar;
        nm6 nm6Var = nm6.a;
        int i = this.a;
        try {
            if (i == 0) {
                qgg.h0(obj);
                I9 i9 = this.b.d;
                r7o r7oVar = z7o.b;
                this.a = 1;
                obj = i9.b(this);
                if (obj == nm6Var) {
                    return nm6Var;
                }
            } else {
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
            }
            t7oVar = (W8) obj;
            r7o r7oVar2 = z7o.b;
        } catch (Throwable th) {
            r7o r7oVar3 = z7o.b;
            t7oVar = new t7o(th);
        }
        Hc hc = this.b;
        boolean z = t7oVar instanceof t7o;
        ConnectionErrorScreen connectionErrorScreen = ConnectionErrorScreen.a;
        if (!z) {
            W8 w8 = (W8) t7oVar;
            if (w8 instanceof W8.c) {
                if (hc.e.a(hc.a.a)) {
                    Z7.a(hc.b.b, InstallTvAppScreen.a);
                } else {
                    hc.c.trackError("Tv app not found");
                    Z7.a(hc.b.b, connectionErrorScreen);
                }
            } else if (w8 instanceof W8.a) {
                hc.c.trackError("Someone has unexpectedly authorized");
                Z7.a(hc.b.b, connectionErrorScreen);
            } else if (w8 instanceof W8.b) {
                hc.c.trackError(((W8.b) w8).a);
                Z7.a(hc.b.b, connectionErrorScreen);
            } else if (w8 instanceof W8.d) {
                Z7.a(hc.b.b, EnterCodeScreen.a);
            }
        }
        Hc hc2 = this.b;
        Throwable a = z7o.a(t7oVar);
        if (a != null) {
            Timber.INSTANCE.tag("UpdateCodeViewModel").w(a, "Failed to request new user code", new Object[0]);
            hc2.c.trackError(a);
            Z7.a(hc2.b.b, connectionErrorScreen);
        }
        return Unit.a;
    }
}
