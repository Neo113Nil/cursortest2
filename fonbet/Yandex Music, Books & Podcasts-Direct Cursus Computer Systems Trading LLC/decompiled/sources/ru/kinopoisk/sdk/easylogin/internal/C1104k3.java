package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.aur;
import defpackage.bqi;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.r7o;
import defpackage.t7o;
import defpackage.we7;
import defpackage.xdr;
import defpackage.xq0;
import defpackage.z7o;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import ru.kinopoisk.sdk.easylogin.internal.H0;
import ru.kinopoisk.tvauth.internal.presentation.connectionsuccess.ConnectionSuccessScreen;
import timber.log.Timber;

@we7(c = "ru.kinopoisk.tvauth.internal.presentation.entercode.EnterCodeViewModel$verifyUserCode$1", f = "EnterCodeViewModel.kt", l = {63, 73}, m = "invokeSuspend")
/* renamed from: ru.kinopoisk.sdk.easylogin.internal.k3, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1104k3 extends aur implements Function2<mm6, Continuation<? super Unit>, Object> {
    public int a;
    public final /* synthetic */ C1090j3 b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1104k3(C1090j3 c1090j3, String str, Continuation<? super C1104k3> continuation) {
        super(2, continuation);
        this.b = c1090j3;
        this.c = str;
    }

    @Override // defpackage.kq2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        return new C1104k3(this.b, this.c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return new C1104k3(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0056, code lost:
    
        if (r9 == r0) goto L22;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x0058, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0028, code lost:
    
        if (defpackage.y2x.o(300, r8) == r0) goto L22;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object t7oVar;
        xdr xdrVar;
        Object value;
        nm6 nm6Var = nm6.a;
        int i = this.a;
        try {
        } catch (Throwable th) {
            r7o r7oVar = z7o.b;
            t7oVar = new t7o(th);
        }
        if (i == 0) {
            qgg.h0(obj);
            this.a = 1;
        } else {
            if (i != 1) {
                if (i != 2) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
                t7oVar = (H0) obj;
                r7o r7oVar2 = z7o.b;
                C1090j3 c1090j3 = this.b;
                if (!(t7oVar instanceof t7o)) {
                    H0 h0 = (H0) t7oVar;
                    if (h0 instanceof H0.a) {
                        Timber.INSTANCE.tag("EnterCodeViewModel").v("User code check failed", new Object[0]);
                        C1090j3.a(c1090j3);
                    } else if (h0 instanceof H0.b) {
                        Timber.Companion companion = Timber.INSTANCE;
                        companion.tag("EnterCodeViewModel").v("User code check successful", new Object[0]);
                        C1300y8 c1300y8 = c1090j3.e;
                        S9 s9 = new S9();
                        c1300y8.getClass();
                        companion.tag("ScreenResultDispatcher").d("event: %s", s9);
                        c1300y8.a.l(s9);
                        Z7.a(c1090j3.a.b, ConnectionSuccessScreen.a);
                    }
                }
                C1090j3 c1090j32 = this.b;
                Throwable a = z7o.a(t7oVar);
                if (a != null) {
                    Timber.INSTANCE.tag("EnterCodeViewModel").w(a, "Failed to verify user code", new Object[0]);
                    c1090j32.b.trackError(a);
                    C1090j3.a(c1090j32);
                }
                return Unit.a;
            }
            qgg.h0(obj);
        }
        bqi bqiVar = this.b.f;
        String str = this.c;
        do {
            xdrVar = (xdr) bqiVar;
            value = xdrVar.getValue();
        } while (!xdrVar.k(value, C1020e3.a((C1020e3) value, str, Nc.Checking, 4)));
        I9 i9 = this.b.c;
        String str2 = this.c;
        r7o r7oVar3 = z7o.b;
        this.a = 2;
        obj = i9.a(str2, this);
    }
}
