package ru.kinopoisk.sdk.easylogin.internal;

import defpackage.aur;
import defpackage.ltm;
import defpackage.mm6;
import defpackage.nm6;
import defpackage.oc4;
import defpackage.pjc;
import defpackage.qgg;
import defpackage.r2f;
import defpackage.rar;
import defpackage.rjc;
import defpackage.we7;
import defpackage.x97;
import defpackage.xq0;
import defpackage.y2x;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;

@we7(c = "ru.kinopoisk.coroutines.flow.TimeoutFirstKt$timeoutFirst$1", f = "TimeoutFirst.kt", l = {18}, m = "invokeSuspend")
/* renamed from: ru.kinopoisk.sdk.easylogin.internal.l9, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C1124l9 extends aur implements Function2<ltm, Continuation<? super Unit>, Object> {
    public int a;
    public /* synthetic */ Object b;
    public final /* synthetic */ pjc c;
    public final /* synthetic */ long d;

    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.l9$a */
    public static final class a<T> implements rjc {
        public final /* synthetic */ r2f a;
        public final /* synthetic */ ltm b;

        public a(r2f r2fVar, ltm ltmVar) {
            this.a = r2fVar;
            this.b = ltmVar;
        }

        @Override // defpackage.rjc
        public final Object emit(T t, Continuation<? super Unit> continuation) {
            this.a.g(null);
            Object m = ((oc4) this.b).d.m(t, continuation);
            return m == nm6.a ? m : Unit.a;
        }
    }

    @we7(c = "ru.kinopoisk.coroutines.flow.TimeoutFirstKt$timeoutFirst$1$timeoutJob$1", f = "TimeoutFirst.kt", l = {14}, m = "invokeSuspend")
    /* renamed from: ru.kinopoisk.sdk.easylogin.internal.l9$b */
    public static final class b extends aur implements Function2<mm6, Continuation<? super Unit>, Object> {
        public int a;
        public final /* synthetic */ long b;
        public final /* synthetic */ ltm c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(long j, ltm ltmVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.b = j;
            this.c = ltmVar;
        }

        @Override // defpackage.kq2
        public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
            return new b(this.b, this.c, continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Object obj, Object obj2) {
            return new b(this.b, this.c, (Continuation) obj2).invokeSuspend(Unit.a);
        }

        @Override // defpackage.kq2
        public final Object invokeSuspend(Object obj) {
            nm6 nm6Var = nm6.a;
            int i = this.a;
            if (i == 0) {
                qgg.h0(obj);
                long j = this.b;
                this.a = 1;
                if (y2x.o(j, this) == nm6Var) {
                    return nm6Var;
                }
            } else {
                if (i != 1) {
                    xq0.q("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                qgg.h0(obj);
            }
            ((oc4) this.c).p0(new C1110k9(this.b));
            return Unit.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1124l9(pjc pjcVar, long j, Continuation<? super C1124l9> continuation) {
        super(2, continuation);
        this.c = pjcVar;
        this.d = j;
    }

    @Override // defpackage.kq2
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        C1124l9 c1124l9 = new C1124l9(this.c, this.d, continuation);
        c1124l9.b = obj;
        return c1124l9;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C1124l9) create((ltm) obj, (Continuation) obj2)).invokeSuspend(Unit.a);
    }

    @Override // defpackage.kq2
    public final Object invokeSuspend(Object obj) {
        nm6 nm6Var = nm6.a;
        int i = this.a;
        if (i == 0) {
            qgg.h0(obj);
            ltm ltmVar = (ltm) this.b;
            rar y = x97.y(ltmVar, null, null, new b(this.d, ltmVar, null), 3);
            pjc pjcVar = this.c;
            a aVar = new a(y, ltmVar);
            this.a = 1;
            if (pjcVar.collect(aVar, this) == nm6Var) {
                return nm6Var;
            }
        } else {
            if (i != 1) {
                xq0.q("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            qgg.h0(obj);
        }
        return Unit.a;
    }
}
