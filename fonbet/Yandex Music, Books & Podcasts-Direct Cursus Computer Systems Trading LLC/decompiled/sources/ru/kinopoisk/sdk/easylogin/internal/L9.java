package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.aur;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.rjc;
import defpackage.we7;
import defpackage.xq0;
import java.lang.reflect.Type;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import ru.kinopoisk.tvauth.scenario.api.TvAuthApi$getAuthProcessState$$inlined$executeWithResult$1;

@we7(c = "ru.kinopoisk.tvauth.scenario.TvAuthScenarioManagerImpl$awaitAuthState$authProcessState$1", f = "TvAuthScenarioManagerImpl.kt", l = {139, 139}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class L9 extends aur implements Function2<rjc, Continuation<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ C1152n9 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L9(C1152n9 c1152n9, Continuation<? super L9> continuation) {
        super(2, continuation);
        this.c = c1152n9;
    }

    @Override // defpackage.kq2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        L9 l9 = new L9(this.c, continuation);
        l9.b = obj;
        return l9;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        L9 l9 = new L9(this.c, (Continuation) obj2);
        l9.b = (rjc) obj;
        return l9.invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x004d, code lost:
    
        if (r1.emit(r6, r5) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x004f, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0041, code lost:
    
        if (r6 == r0) goto L15;
     */
    @Override // defpackage.kq2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        rjc rjcVar;
        nm6 nm6Var = nm6.a;
        int i = this.a;
        if (i == 0) {
            qgg.h0(obj);
            rjcVar = (rjc) this.b;
            C1152n9 c1152n9 = this.c;
            this.b = rjcVar;
            this.a = 1;
            defpackage.s9 s9Var = c1152n9.a;
            E4 e4 = E4.a;
            Type type = new TvAuthApi$getAuthProcessState$$inlined$executeWithResult$1().getType();
            type.getClass();
            obj = s9Var.a(e4, type, this);
        } else {
            if (i != 1) {
                if (i == 2) {
                    qgg.h0(obj);
                    return Unit.a;
                }
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            rjcVar = (rjc) this.b;
            qgg.h0(obj);
        }
        this.b = null;
        this.a = 2;
    }
}
