package ru.kinopoisk.sdk.easylogin.internal;

import android.net.nsd.NsdManager;
import android.net.nsd.NsdServiceInfo;
import defpackage.aur;
import defpackage.nm6;
import defpackage.qgg;
import defpackage.rjc;
import defpackage.we7;
import defpackage.xq0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import ru.kinopoisk.sdk.easylogin.internal.Q6;
import timber.log.Timber;

@we7(c = "ru.kinopoisk.pairing.nsd.NsdServiceResolver$resolve$2", f = "NsdServiceResolver.kt", l = {com.yandex.pulse.metrics.o.LTS_CHANNEL_FIELD_NUMBER, com.yandex.pulse.metrics.o.LTS_CHANNEL_FIELD_NUMBER}, m = "invokeSuspend")
/* loaded from: classes5.dex */
public final class W6 extends aur implements Function2<rjc, Continuation<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Q6.b c;
    public final /* synthetic */ V6 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public W6(Q6.b bVar, V6 v6, Continuation<? super W6> continuation) {
        super(2, continuation);
        this.c = bVar;
        this.d = v6;
    }

    @Override // defpackage.kq2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        W6 w6 = new W6(this.c, this.d, continuation);
        w6.b = obj;
        return w6;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((W6) create((rjc) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0056, code lost:
    
        if (r1.emit(r7, r6) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0058, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x004a, code lost:
    
        if (r7 == r0) goto L15;
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
            Timber.INSTANCE.tag("NsdServiceResolver").d("start resolve: %s", this.c);
            NsdManager nsdManager = this.d.a;
            NsdServiceInfo nsdServiceInfo = this.c.a;
            this.b = rjcVar;
            this.a = 1;
            obj = C0968a7.a(nsdManager, nsdServiceInfo, this);
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
