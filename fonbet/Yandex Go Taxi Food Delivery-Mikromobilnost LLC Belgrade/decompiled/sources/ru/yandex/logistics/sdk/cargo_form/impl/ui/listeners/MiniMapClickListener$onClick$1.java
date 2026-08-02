package ru.yandex.logistics.sdk.cargo_form.impl.ui.listeners;

import defpackage.b51;
import defpackage.bi20;
import defpackage.c51;
import defpackage.d51;
import defpackage.jse;
import defpackage.m2v;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.p61;
import defpackage.ru0;
import defpackage.su0;
import defpackage.tje;
import defpackage.tse;
import defpackage.tu0;
import defpackage.uu0;
import defpackage.vu0;
import defpackage.w511;
import defpackage.wls;
import defpackage.xh20;
import defpackage.ys0;
import defpackage.yzj0;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.b;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import ru.yandex.logistics.sdk.cargo_form.impl.domain.interactor.c;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.ui.listeners.MiniMapClickListener$onClick$1", f = "MiniMapClickListener.kt", l = {32}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class MiniMapClickListener$onClick$1 extends SuspendLambda implements wls {
    final /* synthetic */ bi20 $action;
    final /* synthetic */ yzj0 $routePosition;
    int label;
    final /* synthetic */ xh20 this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
    @mvg(c = "ru.yandex.logistics.sdk.cargo_form.impl.ui.listeners.MiniMapClickListener$onClick$1$1", f = "MiniMapClickListener.kt", l = {33}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.logistics.sdk.cargo_form.impl.ui.listeners.MiniMapClickListener$onClick$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ bi20 $action;
        final /* synthetic */ yzj0 $routePosition;
        int label;
        final /* synthetic */ xh20 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(xh20 xh20Var, bi20 bi20Var, yzj0 yzj0Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = xh20Var;
            this.$action = bi20Var;
            this.$routePosition = yzj0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$action, this.$routePosition, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:21:0x0058, code lost:
        
            if (r0 == r1) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x0091, code lost:
        
            if (r0 == r1) goto L49;
         */
        /* JADX WARN: Code restructure failed: missing block: B:37:0x008f, code lost:
        
            if (r0 == r1) goto L38;
         */
        /* JADX WARN: Code restructure failed: missing block: B:45:0x00ab, code lost:
        
            if (r0 == r1) goto L49;
         */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            Object a;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            zy11 zy11Var = zy11.a;
            if (i != 0) {
                if (i == 1) {
                    b.b(obj);
                    return zy11Var;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
            xh20 xh20Var = this.this$0;
            vu0 vu0Var = this.$action.b;
            yzj0 yzj0Var = this.$routePosition;
            this.label = 1;
            xh20Var.getClass();
            m2v m2vVar = xh20Var.f;
            c cVar = xh20Var.b;
            if (vu0Var instanceof su0) {
                int i2 = yzj0Var.a;
                m2v.v(xh20Var.f, i2, vu0Var, m2vVar.t(i2), null, 20);
            } else if (vu0Var instanceof tu0) {
                int i3 = yzj0Var.a;
                a = cVar.a(i3, new p61(xh20Var, (tu0) vu0Var, i3, 9), this);
                if (a != coroutineSingletons) {
                    a = zy11Var;
                }
            } else {
                int i4 = 6;
                if ((vu0Var instanceof ru0) || (vu0Var instanceof uu0)) {
                    int i5 = yzj0Var.a;
                    a = cVar.a(i5, new ys0(xh20Var, i5, i4), this);
                    if (a != coroutineSingletons) {
                        a = zy11Var;
                    }
                } else {
                    if (vu0Var != null) {
                        w511.b();
                        return null;
                    }
                    d51 d51Var = yzj0Var.b;
                    int i6 = yzj0Var.a;
                    if (d51Var instanceof b51) {
                        m2v.v(xh20Var.f, i6, null, m2vVar.t(i6), null, 20);
                    } else {
                        if (!(d51Var instanceof c51)) {
                            w511.b();
                            return null;
                        }
                        a = cVar.a(i6, new ys0(xh20Var, i6, i4), this);
                        if (a != coroutineSingletons) {
                            a = zy11Var;
                        }
                    }
                    a = zy11Var;
                }
            }
            a = zy11Var;
            return a == coroutineSingletons ? coroutineSingletons : zy11Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MiniMapClickListener$onClick$1(xh20 xh20Var, bi20 bi20Var, yzj0 yzj0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = xh20Var;
        this.$action = bi20Var;
        this.$routePosition = yzj0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MiniMapClickListener$onClick$1(this.this$0, this.$action, this.$routePosition, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MiniMapClickListener$onClick$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            b.b(obj);
            xh20 xh20Var = this.this$0;
            jse jseVar = xh20Var.e.a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(xh20Var, this.$action, this.$routePosition, null);
            this.label = 1;
            if (tje.k0(jseVar, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            b.b(obj);
        }
        return zy11.a;
    }
}
