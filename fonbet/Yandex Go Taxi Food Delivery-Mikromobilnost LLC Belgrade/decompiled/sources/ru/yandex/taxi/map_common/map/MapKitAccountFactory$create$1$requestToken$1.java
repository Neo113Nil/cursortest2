package ru.yandex.taxi.map_common.map;

import com.yandex.runtime.auth.TokenListener;
import defpackage.fk00;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tje;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.zy11;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.map_common.map.MapKitAccountFactory$create$1$requestToken$1", f = "MapKitAccountFactory.kt", l = {37}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class MapKitAccountFactory$create$1$requestToken$1 extends SuspendLambda implements wls {
    final /* synthetic */ TokenListener $tokenListener;
    int I$0;
    int label;
    final /* synthetic */ h this$0;
    final /* synthetic */ fk00 this$1;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ltse;", "Lkotlin/Result;", "", "<anonymous>", "(Ltse;)Lkotlin/Result;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.map_common.map.MapKitAccountFactory$create$1$requestToken$1$1", f = "MapKitAccountFactory.kt", l = {38}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.map_common.map.MapKitAccountFactory$create$1$requestToken$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        int label;
        final /* synthetic */ fk00 this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(fk00 fk00Var, Continuation continuation) {
            super(2, continuation);
            this.this$0 = fk00Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object d;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                ru.yandex.taxi.am.token.a aVar = this.this$0.b;
                this.label = 1;
                d = aVar.d(false, this);
                if (d == coroutineSingletons) {
                    return coroutineSingletons;
                }
            } else {
                if (i != 1) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                d = ((Result) obj).getValue();
            }
            return new Result(d);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MapKitAccountFactory$create$1$requestToken$1(h hVar, TokenListener tokenListener, fk00 fk00Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = hVar;
        this.$tokenListener = tokenListener;
        this.this$1 = fk00Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new MapKitAccountFactory$create$1$requestToken$1(this.this$0, this.$tokenListener, this.this$1, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((MapKitAccountFactory$create$1$requestToken$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        zy11 zy11Var = zy11.a;
        if (i == 0) {
            kotlin.b.b(obj);
            boolean isEmpty = this.this$0.b.isEmpty();
            int i2 = !isEmpty ? 1 : 0;
            this.this$0.b.add(this.$tokenListener);
            if (!isEmpty) {
                return zy11Var;
            }
            this.this$1.c.getClass();
            sjh sjhVar = uyj.a;
            mdh mdhVar = mdh.b;
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.this$1, null);
            this.I$0 = i2;
            this.label = 1;
            obj = tje.k0(mdhVar, anonymousClass1, this);
            if (obj == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        Object value = ((Result) obj).getValue();
        h hVar = this.this$0;
        if (!(value instanceof Result.Failure)) {
            String str = (String) value;
            Iterator it = hVar.b.iterator();
            while (it.hasNext()) {
                ((TokenListener) it.next()).onTokenReceived(str);
            }
        }
        h hVar2 = this.this$0;
        Throwable a = Result.a(value);
        if (a != null) {
            Iterator it2 = hVar2.b.iterator();
            while (it2.hasNext()) {
                TokenListener tokenListener = (TokenListener) it2.next();
                String message = a.getMessage();
                if (message == null) {
                    message = "";
                }
                tokenListener.onTokenRefreshFailed(message);
            }
        }
        this.this$0.b.clear();
        return zy11Var;
    }
}
