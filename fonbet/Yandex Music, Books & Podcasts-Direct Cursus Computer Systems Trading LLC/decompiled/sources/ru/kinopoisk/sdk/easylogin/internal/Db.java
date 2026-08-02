package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.cg6;
import defpackage.nm6;
import defpackage.pjc;
import defpackage.qgg;
import defpackage.rjc;
import defpackage.we7;
import defpackage.xq0;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;

/* loaded from: classes5.dex */
public final class Db implements pjc {
    public final /* synthetic */ Cb a;
    public final /* synthetic */ Gb b;

    public static final class a<T> implements rjc {
        public final /* synthetic */ rjc a;
        public final /* synthetic */ Gb b;

        @we7(c = "ru.kinopoisk.tvauth.discovery.presentation.TvSearchManager$search$$inlined$map$2$2", f = "TvSearchManager.kt", l = {50}, m = "emit")
        /* renamed from: ru.kinopoisk.sdk.easylogin.internal.Db$a$a, reason: collision with other inner class name */
        public static final class C0023a extends cg6 {
            public /* synthetic */ Object a;
            public int b;

            public C0023a(Continuation continuation) {
                super(continuation);
            }

            @Override // defpackage.kq2
            public final Object invokeSuspend(Object obj) {
                this.a = obj;
                this.b |= Integer.MIN_VALUE;
                return a.this.emit(null, this);
            }
        }

        public a(rjc rjcVar, Gb gb) {
            this.a = rjcVar;
            this.b = gb;
        }

        /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
        @Override // defpackage.rjc
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(Object obj, Continuation continuation) {
            C0023a c0023a;
            int i;
            if (continuation instanceof C0023a) {
                c0023a = (C0023a) continuation;
                int i2 = c0023a.b;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    c0023a.b = i2 - Integer.MIN_VALUE;
                    Object obj2 = c0023a.a;
                    nm6 nm6Var = nm6.a;
                    i = c0023a.b;
                    if (i != 0) {
                        qgg.h0(obj2);
                        rjc rjcVar = this.a;
                        ArrayList g0 = CollectionsKt.g0((List) obj, (List) this.b.h.getValue());
                        c0023a.b = 1;
                        if (rjcVar.emit(g0, c0023a) == nm6Var) {
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
            c0023a = new C0023a(continuation);
            Object obj22 = c0023a.a;
            nm6 nm6Var2 = nm6.a;
            i = c0023a.b;
            if (i != 0) {
            }
            return Unit.a;
        }
    }

    public Db(Cb cb, Gb gb) {
        this.a = cb;
        this.b = gb;
    }

    @Override // defpackage.pjc
    public final Object collect(rjc rjcVar, Continuation continuation) {
        Object collect = this.a.collect(new a(rjcVar, this.b), continuation);
        return collect == nm6.a ? collect : Unit.a;
    }
}
