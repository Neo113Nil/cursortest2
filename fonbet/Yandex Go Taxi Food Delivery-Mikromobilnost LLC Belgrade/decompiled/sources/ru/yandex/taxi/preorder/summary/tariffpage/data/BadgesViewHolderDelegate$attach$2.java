package ru.yandex.taxi.preorder.summary.tariffpage.data;

import defpackage.ebx0;
import defpackage.jqr;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tcc;
import defpackage.tpr;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.x5;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.e;
import kotlinx.coroutines.flow.m0;
import kotlinx.coroutines.flow.o;
import kotlinx.coroutines.flow.r0;
import ru.CryptoPro.JCSP.MSCAPI.HProv;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.summary.tariffpage.data.BadgesViewHolderDelegate$attach$2", f = "BadgesViewHolderDelegate.kt", l = {HProv.PP_DELETE_SAVED_PASSWD}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class BadgesViewHolderDelegate$attach$2 extends SuspendLambda implements wls {
    Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ d this$0;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "Lwl4;", "badges", "Lru/yandex/taxi/theme/ThemeType;", "<unused var>", "<anonymous>", "(Ljava/util/List;Lru/yandex/taxi/theme/ThemeType;)Ljava/util/List;"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.preorder.summary.tariffpage.data.BadgesViewHolderDelegate$attach$2$1", f = "BadgesViewHolderDelegate.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.preorder.summary.tariffpage.data.BadgesViewHolderDelegate$attach$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements zls {
        /* synthetic */ Object L$0;
        int label;

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            AnonymousClass1 anonymousClass1 = new AnonymousClass1(3, (Continuation) obj3);
            anonymousClass1.L$0 = (List) obj;
            return anonymousClass1.invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List list = (List) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label == 0) {
                kotlin.b.b(obj);
                return list;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lwl4;", "badges", "Lzy11;", "<anonymous>", "(Ljava/util/List;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.preorder.summary.tariffpage.data.BadgesViewHolderDelegate$attach$2$2", f = "BadgesViewHolderDelegate.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.preorder.summary.tariffpage.data.BadgesViewHolderDelegate$attach$2$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        /* synthetic */ Object L$0;
        int label;
        final /* synthetic */ d this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(d dVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = dVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, continuation);
            anonymousClass2.L$0 = obj;
            return anonymousClass2;
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            AnonymousClass2 anonymousClass2 = (AnonymousClass2) create((List) obj, (Continuation) obj2);
            zy11 zy11Var = zy11.a;
            anonymousClass2.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            List list = (List) this.L$0;
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            r0 r0Var = this.this$0.k;
            Integer num = new Integer(list.size());
            r0Var.getClass();
            r0Var.m(null, num);
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BadgesViewHolderDelegate$attach$2(d dVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = dVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new BadgesViewHolderDelegate$attach$2(this.this$0, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((BadgesViewHolderDelegate$attach$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            d dVar = this.this$0;
            List list = dVar.f;
            ArrayList arrayList = new ArrayList(tcc.n(list, 10));
            Iterator it = list.iterator();
            while (it.hasNext()) {
                arrayList.add(com.yandex.go.coroutines.b.d(((ebx0) it.next()).a(dVar.e.a()), new BadgesViewHolderDelegate$attach$2$bottomBadgesFlow$1$1(2, null)));
            }
            jqr jqrVar = new jqr(new m0(e.t(new c((tpr[]) kotlin.collections.a.J0(arrayList).toArray(new tpr[0]))), this.this$0.i.a(), new AnonymousClass1(3, null)), new AnonymousClass2(this.this$0, null), 3);
            this.this$0.g.getClass();
            tpr F = e.F(jqrVar, uyj.a);
            d dVar2 = this.this$0;
            o oVar = new o(F, new BadgesViewHolderDelegate$attach$2$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
            x5 x5Var = new x5(27, dVar2);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.L$3 = null;
            this.label = 1;
            if (oVar.collect(x5Var, this) == coroutineSingletons) {
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
