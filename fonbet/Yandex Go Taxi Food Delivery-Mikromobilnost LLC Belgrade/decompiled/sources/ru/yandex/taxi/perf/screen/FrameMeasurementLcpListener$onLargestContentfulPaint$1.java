package ru.yandex.taxi.perf.screen;

import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.b0;
import defpackage.cfs;
import defpackage.dsg;
import defpackage.i3f;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.scc;
import defpackage.tje;
import defpackage.tse;
import defpackage.wls;
import defpackage.zes;
import defpackage.zy11;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.CoroutineStart;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.perf.screen.FrameMeasurementLcpListener$onLargestContentfulPaint$1", f = "FrameMeasurementLcpListener.kt", l = {}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
final class FrameMeasurementLcpListener$onLargestContentfulPaint$1 extends SuspendLambda implements wls {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ a this$0;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
    @mvg(c = "ru.yandex.taxi.perf.screen.FrameMeasurementLcpListener$onLargestContentfulPaint$1$1", f = "FrameMeasurementLcpListener.kt", l = {36}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.perf.screen.FrameMeasurementLcpListener$onLargestContentfulPaint$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ zes $frameMetricsListener;
        final /* synthetic */ List<PerformanceScreenName> $supportedScreens;
        int label;
        final /* synthetic */ a this$0;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
        @mvg(c = "ru.yandex.taxi.perf.screen.FrameMeasurementLcpListener$onLargestContentfulPaint$1$1$1", f = "FrameMeasurementLcpListener.kt", l = {58}, m = "invokeSuspend", v = 2)
        /* renamed from: ru.yandex.taxi.perf.screen.FrameMeasurementLcpListener$onLargestContentfulPaint$1$1$1, reason: invalid class name and collision with other inner class name */
        final class C01101 extends SuspendLambda implements wls {
            final /* synthetic */ zes $frameMetricsListener;
            final /* synthetic */ List<PerformanceScreenName> $supportedScreens;
            int label;
            final /* synthetic */ a this$0;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C01101(a aVar, zes zesVar, List list, Continuation continuation) {
                super(2, continuation);
                this.this$0 = aVar;
                this.$frameMetricsListener = zesVar;
                this.$supportedScreens = list;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new C01101(this.this$0, this.$frameMetricsListener, this.$supportedScreens, continuation);
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                return ((C01101) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                try {
                    if (i == 0) {
                        kotlin.b.b(obj);
                        a aVar = this.this$0;
                        aVar.d.i = new i3f(3, this.$supportedScreens, this.$frameMetricsListener, aVar);
                        this.label = 1;
                        if (kotlinx.coroutines.a.d(this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                    }
                    throw new KotlinNothingValueException();
                } catch (Throwable th) {
                    this.this$0.d.i = null;
                    ((cfs) this.$frameMetricsListener).b(new dsg(24));
                    throw th;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(a aVar, zes zesVar, List list, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aVar;
            this.$frameMetricsListener = zesVar;
            this.$supportedScreens = list;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.this$0, this.$frameMetricsListener, this.$supportedScreens, continuation);
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
                a aVar = this.this$0;
                Lifecycle lifecycle = aVar.c;
                Lifecycle.State state = Lifecycle.State.RESUMED;
                C01101 c01101 = new C01101(aVar, this.$frameMetricsListener, this.$supportedScreens, null);
                this.label = 1;
                if (b0.b(lifecycle, state, c01101, this) == coroutineSingletons) {
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
    @mvg(c = "ru.yandex.taxi.perf.screen.FrameMeasurementLcpListener$onLargestContentfulPaint$1$2", f = "FrameMeasurementLcpListener.kt", l = {67}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.perf.screen.FrameMeasurementLcpListener$onLargestContentfulPaint$1$2, reason: invalid class name */
    final class AnonymousClass2 extends SuspendLambda implements wls {
        final /* synthetic */ zes $frameMetricsListener;
        int label;
        final /* synthetic */ a this$0;

        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
        @mvg(c = "ru.yandex.taxi.perf.screen.FrameMeasurementLcpListener$onLargestContentfulPaint$1$2$1", f = "FrameMeasurementLcpListener.kt", l = {69}, m = "invokeSuspend", v = 2)
        /* renamed from: ru.yandex.taxi.perf.screen.FrameMeasurementLcpListener$onLargestContentfulPaint$1$2$1, reason: invalid class name */
        final class AnonymousClass1 extends SuspendLambda implements wls {
            final /* synthetic */ zes $frameMetricsListener;
            int label;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(zes zesVar, Continuation continuation) {
                super(2, continuation);
                this.$frameMetricsListener = zesVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Continuation create(Object obj, Continuation continuation) {
                return new AnonymousClass1(this.$frameMetricsListener, continuation);
            }

            @Override // defpackage.wls
            public final Object invoke(Object obj, Object obj2) {
                return ((AnonymousClass1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i = this.label;
                try {
                    if (i == 0) {
                        kotlin.b.b(obj);
                        this.label = 1;
                        if (kotlinx.coroutines.a.d(this) == coroutineSingletons) {
                            return coroutineSingletons;
                        }
                    } else {
                        if (i != 1) {
                            ny61.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kotlin.b.b(obj);
                    }
                    throw new KotlinNothingValueException();
                } catch (Throwable th) {
                    ((cfs) this.$frameMetricsListener).a();
                    throw th;
                }
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass2(a aVar, zes zesVar, Continuation continuation) {
            super(2, continuation);
            this.this$0 = aVar;
            this.$frameMetricsListener = zesVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass2(this.this$0, this.$frameMetricsListener, continuation);
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
                Lifecycle lifecycle = this.this$0.c;
                Lifecycle.State state = Lifecycle.State.CREATED;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$frameMetricsListener, null);
                this.label = 1;
                if (b0.b(lifecycle, state, anonymousClass1, this) == coroutineSingletons) {
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
    public FrameMeasurementLcpListener$onLargestContentfulPaint$1(a aVar, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        FrameMeasurementLcpListener$onLargestContentfulPaint$1 frameMeasurementLcpListener$onLargestContentfulPaint$1 = new FrameMeasurementLcpListener$onLargestContentfulPaint$1(this.this$0, continuation);
        frameMeasurementLcpListener$onLargestContentfulPaint$1.L$0 = obj;
        return frameMeasurementLcpListener$onLargestContentfulPaint$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        FrameMeasurementLcpListener$onLargestContentfulPaint$1 frameMeasurementLcpListener$onLargestContentfulPaint$1 = (FrameMeasurementLcpListener$onLargestContentfulPaint$1) create((tse) obj, (Continuation) obj2);
        zy11 zy11Var = zy11.a;
        frameMeasurementLcpListener$onLargestContentfulPaint$1.invokeSuspend(zy11Var);
        return zy11Var;
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
        cfs a = this.this$0.a.a();
        zy11 zy11Var = zy11.a;
        if (a == null) {
            return zy11Var;
        }
        List g = scc.g(PerformanceScreenName.Summary, PerformanceScreenName.Suggest);
        CoroutineStart coroutineStart = CoroutineStart.UNDISPATCHED;
        tje.N(tseVar, null, coroutineStart, new AnonymousClass1(this.this$0, a, g, null), 1);
        tje.N(tseVar, null, coroutineStart, new AnonymousClass2(this.this$0, a, null), 1);
        return zy11Var;
    }
}
