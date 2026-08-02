package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.cg6;
import defpackage.lyf;
import defpackage.nm6;
import defpackage.pjc;
import defpackage.qgg;
import defpackage.rjc;
import defpackage.we7;
import defpackage.xq0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import ru.kinopoisk.sdk.easylogin.internal.C1198r0;
import timber.log.Timber;

/* renamed from: ru.kinopoisk.sdk.easylogin.internal.t0, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1226t0 implements pjc {
    public final /* synthetic */ pjc a;

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.t0$a */
    public static final class a<T> implements rjc {
        public final /* synthetic */ rjc a;

        @we7(c = "ru.kinopoisk.cast.CastConnectionStateProvider$Companion$getStateWithLifecycle$$inlined$map$1$2", f = "CastConnectionStateProvider.kt", l = {50}, m = "emit")
        /* renamed from: ru.kinopoisk.sdk.easylogin.internal.t0$a$a, reason: collision with other inner class name */
        public static final class C0042a extends cg6 {
            public /* synthetic */ Object a;
            public int b;

            public C0042a(Continuation continuation) {
                super(continuation);
            }

            @Override // defpackage.kq2
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(rjc rjcVar) {
            this.a = rjcVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // defpackage.rjc
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C0042a c0042a;
            int i;
            if (continuation instanceof C0042a) {
                c0042a = (C0042a) continuation;
                int i2 = c0042a.b;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c0042a.b = i2 - Integer.MIN_VALUE;
                    Object obj2 = c0042a.a;
                    nm6 nm6Var = nm6.a;
                    i = c0042a.b;
                    if (i != 0) {
                        qgg.h0(obj2);
                        rjc rjcVar = this.a;
                        lyf lyfVar = (lyf) obj;
                        Timber.INSTANCE.tag("CastConnectionState").d("LifecycleState: %s", lyfVar);
                        C1198r0.a aVar = C1198r0.b.a.a[lyfVar.ordinal()] == 1 ? C1198r0.a.Availability : C1198r0.a.AvailabilityLimited;
                        c0042a.b = 1;
                        if (rjcVar.emit(aVar, c0042a) == nm6Var) {
                            return nm6Var;
                        }
                    } else {
                        if (i != 1) {
                            xq0.q("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        qgg.h0(obj2);
                    }
                    return Unit.a;
                }
            }
            c0042a = new C0042a(continuation);
            Object obj22 = c0042a.a;
            nm6 nm6Var2 = nm6.a;
            i = c0042a.b;
            if (i != 0) {
            }
            return Unit.a;
        }
    }

    public C1226t0(pjc pjcVar) {
        this.a = pjcVar;
    }

    @Override // defpackage.pjc
    public final Object collect(rjc rjcVar, Continuation continuation) {
        Object collect = this.a.collect(new a(rjcVar), continuation);
        return collect == nm6.a ? collect : Unit.a;
    }
}
