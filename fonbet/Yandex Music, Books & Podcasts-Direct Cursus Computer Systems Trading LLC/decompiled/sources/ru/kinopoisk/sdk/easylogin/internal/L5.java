package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.cg6;
import defpackage.nm6;
import defpackage.pjc;
import defpackage.qgg;
import defpackage.rjc;
import defpackage.we7;
import defpackage.xq0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import ru.kinopoisk.sdk.easylogin.internal.I5;

/* loaded from: classes5.dex */
public final class L5 implements pjc {
    public final /* synthetic */ K5 a;

    public static final class a<T> implements rjc {
        public final /* synthetic */ rjc a;

        @we7(c = "ru.kinopoisk.cast.lg.internal.LgDeviceConnector$connectInternal$$inlined$map$1$2", f = "LgDeviceConnector.kt", l = {50}, m = "emit")
        /* renamed from: ru.kinopoisk.sdk.easylogin.internal.L5$a$a, reason: collision with other inner class name */
        public static final class C0031a extends cg6 {
            public /* synthetic */ Object a;
            public int b;

            public C0031a(Continuation continuation) {
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
            C0031a c0031a;
            int i;
            if (continuation instanceof C0031a) {
                c0031a = (C0031a) continuation;
                int i2 = c0031a.b;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c0031a.b = i2 - Integer.MIN_VALUE;
                    Object obj2 = c0031a.a;
                    nm6 nm6Var = nm6.a;
                    i = c0031a.b;
                    if (i != 0) {
                        qgg.h0(obj2);
                        rjc rjcVar = this.a;
                        I5.c cVar = (I5.c) obj;
                        if (cVar instanceof I5.c.d) {
                            throw ((I5.c.d) cVar).a;
                        }
                        Unit unit = Unit.a;
                        c0031a.b = 1;
                        if (rjcVar.emit(unit, c0031a) == nm6Var) {
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
            c0031a = new C0031a(continuation);
            Object obj22 = c0031a.a;
            nm6 nm6Var2 = nm6.a;
            i = c0031a.b;
            if (i != 0) {
            }
            return Unit.a;
        }
    }

    public L5(K5 k5) {
        this.a = k5;
    }

    @Override // defpackage.pjc
    public final Object collect(rjc rjcVar, Continuation continuation) {
        Object collect = this.a.collect(new a(rjcVar), continuation);
        return collect == nm6.a ? collect : Unit.a;
    }
}
