package ru.yandex.taxi.experiments.superapp;

import com.yandex.go.navigation.screen.api.Screen;
import defpackage.dms;
import defpackage.e3n;
import defpackage.eaf0;
import defpackage.j3s0;
import defpackage.kp50;
import defpackage.mth;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.o430;
import defpackage.qaf0;
import defpackage.tje;
import defpackage.tpo0;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.yaf0;
import defpackage.zls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.time.DurationUnit;
import kotlinx.coroutines.flow.o;
import ru.CryptoPro.JCSP.MSCAPI.HProv;
import ru.rt.ebs.cryptosdk.core.metadata.entities.MetaDataField;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ll8x;", "<anonymous>", "(Ltse;)Ll8x;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.experiments.superapp.ShortcutsOnOrderAvailabilityTracker$start$2", f = "ShortcutsOnOrderAvailabilityTracker.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class ShortcutsOnOrderAvailabilityTracker$start$2 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ i this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.experiments.superapp.ShortcutsOnOrderAvailabilityTracker$start$2$1", f = "ShortcutsOnOrderAvailabilityTracker.kt", l = {177}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.experiments.superapp.ShortcutsOnOrderAvailabilityTracker$start$2$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ i this$0;

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\b\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u00022\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005H\n¢\u0006\u0004\b\b\u0010\t"}, d2 = {"Lcom/yandex/go/navigation/screen/api/Screen;", MetaDataField.SCREEN_FIELD, "", "ordersCount", "<unused var>", "Leaf0;", "param", "Lj3s0;", "<anonymous>", "(Lcom/yandex/go/navigation/screen/api/Screen;IILeaf0;)Lj3s0;"}, k = 3, mv = {2, 4, 0})
        @mvg(c = "ru.yandex.taxi.experiments.superapp.ShortcutsOnOrderAvailabilityTracker$start$2$1$2", f = "ShortcutsOnOrderAvailabilityTracker.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: ru.yandex.taxi.experiments.superapp.ShortcutsOnOrderAvailabilityTracker$start$2$1$2, reason: invalid class name */
        final class AnonymousClass2 extends SuspendLambda implements dms {
            /* synthetic */ int I$0;
            /* synthetic */ Object L$0;
            /* synthetic */ Object L$1;
            int label;
            final /* synthetic */ i this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass2(i iVar, Continuation continuation) {
                super(5, continuation);
                this.this$0 = iVar;
            }

            @Override // defpackage.dms
            public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
                int intValue = ((Number) obj2).intValue();
                ((Number) obj3).intValue();
                AnonymousClass2 anonymousClass2 = new AnonymousClass2(this.this$0, (Continuation) obj5);
                anonymousClass2.L$0 = (Screen) obj;
                anonymousClass2.I$0 = intValue;
                anonymousClass2.L$1 = (eaf0) obj4;
                return anonymousClass2.invokeSuspend(zy11.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                Screen screen = (Screen) this.L$0;
                int i = this.I$0;
                eaf0 eaf0Var = (eaf0) this.L$1;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                if (this.label == 0) {
                    kotlin.b.b(obj);
                    return new j3s0(screen, i, this.this$0.h.c, eaf0Var);
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lvpr;", "Lj3s0;", "", "it", "Lzy11;", "<anonymous>", "(Lvpr;Ljava/lang/Throwable;)V"}, k = 3, mv = {2, 4, 0})
        @mvg(c = "ru.yandex.taxi.experiments.superapp.ShortcutsOnOrderAvailabilityTracker$start$2$1$4", f = "ShortcutsOnOrderAvailabilityTracker.kt", l = {}, m = "invokeSuspend", v = 2)
        /* renamed from: ru.yandex.taxi.experiments.superapp.ShortcutsOnOrderAvailabilityTracker$start$2$1$4, reason: invalid class name */
        final class AnonymousClass4 extends SuspendLambda implements zls {
            int label;
            final /* synthetic */ i this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass4(i iVar, Continuation continuation) {
                super(3, continuation);
                this.this$0 = iVar;
            }

            @Override // defpackage.zls
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                AnonymousClass4 anonymousClass4 = new AnonymousClass4(this.this$0, (Continuation) obj3);
                zy11 zy11Var = zy11.a;
                anonymousClass4.invokeSuspend(zy11Var);
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
                i iVar = this.this$0;
                a aVar = iVar.c;
                aVar.e = false;
                aVar.d.b();
                iVar.e.f.b();
                iVar.d.b(new qaf0(yaf0.c, iVar.hashCode()), true);
                return zy11.a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(i iVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = iVar;
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
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                com.yandex.go.navigation.screen.b c = this.this$0.b.c();
                tpr t = kotlinx.coroutines.flow.e.t(new com.yandex.go.superapp.order.multi.old.provider.b(this.this$0.a.h()));
                this.this$0.getClass();
                o430 o430Var = e3n.b;
                c cVar = new c(new mth(com.yandex.go.coroutines.b.m(kp50.U(10, DurationUnit.SECONDS), 0L), 7));
                i iVar = this.this$0;
                tpr d = com.yandex.go.coroutines.b.d(kotlinx.coroutines.flow.e.m(c, t, new e(cVar, iVar), com.yandex.go.coroutines.b.d(iVar.e.h, new ShortcutsOnOrderAvailabilityTracker$start$2$1$invokeSuspend$$inlined$start$1(null, null)), new AnonymousClass2(this.this$0, null)), new ShortcutsOnOrderAvailabilityTracker$start$2$1$invokeSuspend$$inlined$start$2(this.this$0.h, null));
                i iVar2 = this.this$0;
                kotlinx.coroutines.flow.k kVar = new kotlinx.coroutines.flow.k(new g(d, iVar2), new AnonymousClass4(iVar2, null));
                i iVar3 = this.this$0;
                o oVar = new o(kVar, new ShortcutsOnOrderAvailabilityTracker$start$2$1$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
                h hVar = new h(iVar3);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 1;
                if (oVar.collect(hVar, this) == coroutineSingletons) {
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

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.experiments.superapp.ShortcutsOnOrderAvailabilityTracker$start$2$2", f = "ShortcutsOnOrderAvailabilityTracker.kt", l = {HProv.PP_HANDLE_COUNT}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.experiments.superapp.ShortcutsOnOrderAvailabilityTracker$start$2$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        final /* synthetic */ i this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(i iVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.this$0, continuation);
        }

        @Override // defpackage.wls
        public final Object invoke(Object obj, Object obj2) {
            return ((AnonymousClass2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i == 0) {
                kotlin.b.b(obj);
                i iVar = this.this$0;
                o oVar = new o(iVar.g.a, new ShortcutsOnOrderAvailabilityTracker$start$2$2$invokeSuspend$$inlined$safeCollect$1(com.yandex.go.coroutines.b.e(), null));
                tpo0 tpo0Var = new tpo0(16, iVar);
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.label = 1;
                if (oVar.collect(tpo0Var, this) == coroutineSingletons) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ShortcutsOnOrderAvailabilityTracker$start$2(i iVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = iVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        ShortcutsOnOrderAvailabilityTracker$start$2 shortcutsOnOrderAvailabilityTracker$start$2 = new ShortcutsOnOrderAvailabilityTracker$start$2(this.this$0, continuation);
        shortcutsOnOrderAvailabilityTracker$start$2.L$0 = obj;
        return shortcutsOnOrderAvailabilityTracker$start$2;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((ShortcutsOnOrderAvailabilityTracker$start$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        tse tseVar = (tse) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        if (this.label != 0) {
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        tje.N(tseVar, null, null, new AnonymousClass1(this.this$0, null), 3);
        return tje.N(tseVar, null, null, new AnonymousClass2(this.this$0, null), 3);
    }
}
