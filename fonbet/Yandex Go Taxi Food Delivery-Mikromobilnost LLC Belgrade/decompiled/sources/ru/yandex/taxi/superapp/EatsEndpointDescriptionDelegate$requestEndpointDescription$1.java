package ru.yandex.taxi.superapp;

import defpackage.ck7;
import defpackage.g6u;
import defpackage.gcn;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o400;
import defpackage.q0o;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.superapp.EatsEndpointDescriptionDelegate$requestEndpointDescription$1", f = "EatsEndpointDescriptionDelegate.kt", l = {24}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class EatsEndpointDescriptionDelegate$requestEndpointDescription$1 extends SuspendLambda implements wls {
    final /* synthetic */ gcn $callback;
    final /* synthetic */ q0o $params;
    int label;
    final /* synthetic */ g this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.superapp.EatsEndpointDescriptionDelegate$requestEndpointDescription$1$1", f = "EatsEndpointDescriptionDelegate.kt", l = {25}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.superapp.EatsEndpointDescriptionDelegate$requestEndpointDescription$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ gcn $callback;
        final /* synthetic */ q0o $params;
        Object L$0;
        int label;
        final /* synthetic */ g this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(gcn gcnVar, q0o q0oVar, Continuation continuation, g gVar) {
            super(2, continuation);
            this.$callback = gcnVar;
            this.this$0 = gVar;
            this.$params = q0oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$callback, this.$params, continuation, this.this$0);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            gcn gcnVar;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                gcn gcnVar2 = this.$callback;
                com.yandex.go.superapp.web.domain.a aVar = this.this$0.c;
                q0o q0oVar = this.$params;
                this.L$0 = gcnVar2;
                this.label = 1;
                Object a = aVar.a(q0oVar, this);
                if (a == coroutineSingletons) {
                    return coroutineSingletons;
                }
                obj = a;
                gcnVar = gcnVar2;
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                gcnVar = (gcn) this.L$0;
                kotlin.b.b(obj);
            }
            gcnVar.a((ck7) obj);
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EatsEndpointDescriptionDelegate$requestEndpointDescription$1(gcn gcnVar, q0o q0oVar, Continuation continuation, g gVar) {
        super(2, continuation);
        this.this$0 = gVar;
        this.$callback = gcnVar;
        this.$params = q0oVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new EatsEndpointDescriptionDelegate$requestEndpointDescription$1(this.$callback, this.$params, continuation, this.this$0);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((EatsEndpointDescriptionDelegate$requestEndpointDescription$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.this$0.b.getClass();
            sjh sjhVar = uyj.a;
            g6u g6uVar = o400.a;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$callback, this.$params, null, this.this$0);
            this.label = 1;
            if (tje.k0(g6uVar, anonymousClass1, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        return zy11.a;
    }
}
