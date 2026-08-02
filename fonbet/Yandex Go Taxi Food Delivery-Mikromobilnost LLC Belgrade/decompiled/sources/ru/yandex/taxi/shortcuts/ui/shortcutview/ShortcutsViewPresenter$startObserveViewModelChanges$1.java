package ru.yandex.taxi.shortcuts.ui.shortcutview;

import com.yandex.go.shortcuts.ui.interactors.ShortcutViewSourceType;
import defpackage.bkt0;
import defpackage.j4s0;
import defpackage.jl40;
import defpackage.mdh;
import defpackage.mvg;
import defpackage.n4s0;
import defpackage.ny61;
import defpackage.sjh;
import defpackage.tpr;
import defpackage.tse;
import defpackage.uyj;
import defpackage.wls;
import defpackage.yaf0;
import defpackage.zls;
import defpackage.zy11;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.internal.g;
import kotlinx.coroutines.flow.k;
import kotlinx.coroutines.flow.o;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.shortcuts.ui.shortcutview.ShortcutsViewPresenter$startObserveViewModelChanges$1", f = "ShortcutsViewPresenter.kt", l = {333}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class ShortcutsViewPresenter$startObserveViewModelChanges$1 extends SuspendLambda implements wls {
    final /* synthetic */ boolean $force;
    final /* synthetic */ boolean $withDefault;
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ f this$0;

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u0007*\u001a\u0012\u0016\u0012\u0014\u0012\u0004\u0012\u00020\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u00010\u00002\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lvpr;", "Lkotlin/Pair;", "Ld4s0;", "", "Lw201;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.shortcuts.ui.shortcutview.ShortcutsViewPresenter$startObserveViewModelChanges$1$2", f = "ShortcutsViewPresenter.kt", l = {}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.shortcuts.ui.shortcutview.ShortcutsViewPresenter$startObserveViewModelChanges$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements zls {
        int label;
        final /* synthetic */ f this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(Continuation continuation, f fVar) {
            super(3, continuation);
            this.this$0 = fVar;
        }

        @Override // defpackage.zls
        public final Object invoke(Object obj, Object obj2, Object obj3) {
            AnonymousClass2 anonymousClass2 = new AnonymousClass2((Continuation) obj3, this.this$0);
            zy11 zy11Var = zy11.a;
            anonymousClass2.invokeSuspend(zy11Var);
            return zy11Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
            for (Map.Entry entry : this.this$0.B.a.a.entrySet()) {
                ((n4s0) entry.getValue()).stop();
            }
            return zy11.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortcutsViewPresenter$startObserveViewModelChanges$1(f fVar, boolean z, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = fVar;
        this.$force = z;
        this.$withDefault = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new ShortcutsViewPresenter$startObserveViewModelChanges$1(this.this$0, this.$force, this.$withDefault, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ShortcutsViewPresenter$startObserveViewModelChanges$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v9, types: [com.yandex.go.shortcuts.impl.ui.interactors.f] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        int i2 = 1;
        if (i == 0) {
            kotlin.b.b(obj);
            f fVar = this.this$0;
            bkt0 bkt0Var = fVar.B;
            yaf0 a = fVar.F.a();
            boolean z = this.$force;
            boolean z2 = this.$withDefault;
            LinkedHashMap linkedHashMap = bkt0Var.a.a;
            ArrayList arrayList = new ArrayList(linkedHashMap.size());
            for (Map.Entry entry : linkedHashMap.entrySet()) {
                arrayList.add(new com.yandex.go.shortcuts.impl.ui.interactors.c(((n4s0) entry.getValue()).a(a, z, z2), (ShortcutViewSourceType) entry.getKey()));
            }
            com.yandex.go.shortcuts.impl.ui.interactors.d dVar = new com.yandex.go.shortcuts.impl.ui.interactors.d((tpr[]) kotlin.collections.a.J0(arrayList).toArray(new tpr[0]), bkt0Var);
            if (jl40.l(a, yaf0.d)) {
                dVar = new com.yandex.go.shortcuts.impl.ui.interactors.f(dVar);
            }
            g X = kotlinx.coroutines.flow.e.X(dVar, new ShortcutsViewPresenter$startObserveViewModelChanges$1$invokeSuspend$$inlined$flatMapLatest$1(null, this.this$0));
            this.this$0.A.getClass();
            sjh sjhVar = uyj.a;
            k kVar = new k(kotlinx.coroutines.flow.e.F(X, mdh.b), new AnonymousClass2(null, this.this$0));
            f fVar2 = this.this$0;
            o oVar = new o(kVar, new ShortcutsViewPresenter$startObserveViewModelChanges$1$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
            j4s0 j4s0Var = new j4s0(fVar2, i2);
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            if (oVar.collect(j4s0Var, this) == coroutineSingletons) {
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
