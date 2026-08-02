package ru.yandex.taxi.logistics.sdk.tracking.domain.impl.data;

import defpackage.fse;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tse;
import defpackage.vpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
@mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.domain.impl.data.FeedbackRemoteDataSourceKt$debounce$1$1$1$1", f = "FeedbackRemoteDataSource.kt", l = {143, 144}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
final class FeedbackRemoteDataSourceKt$debounce$1$1$1$1 extends SuspendLambda implements wls {
    final /* synthetic */ vpr $$this$flow;
    final /* synthetic */ fse $context;
    final /* synthetic */ Object $it;
    final /* synthetic */ long $waitMillis;
    int label;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 3, 0})
    @mvg(c = "ru.yandex.taxi.logistics.sdk.tracking.domain.impl.data.FeedbackRemoteDataSourceKt$debounce$1$1$1$1$1", f = "FeedbackRemoteDataSource.kt", l = {145}, m = "invokeSuspend", v = 2)
    /* renamed from: ru.yandex.taxi.logistics.sdk.tracking.domain.impl.data.FeedbackRemoteDataSourceKt$debounce$1$1$1$1$1, reason: invalid class name */
    final class AnonymousClass1 extends SuspendLambda implements wls {
        final /* synthetic */ vpr $$this$flow;
        final /* synthetic */ Object $it;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AnonymousClass1(vpr vprVar, Object obj, Continuation continuation) {
            super(2, continuation);
            this.$$this$flow = vprVar;
            this.$it = obj;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new AnonymousClass1(this.$$this$flow, this.$it, continuation);
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
                vpr vprVar = this.$$this$flow;
                Object obj2 = this.$it;
                this.label = 1;
                if (vprVar.emit(obj2, this) == coroutineSingletons) {
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
    public FeedbackRemoteDataSourceKt$debounce$1$1$1$1(long j, fse fseVar, vpr vprVar, Object obj, Continuation continuation) {
        super(2, continuation);
        this.$waitMillis = j;
        this.$context = fseVar;
        this.$$this$flow = vprVar;
        this.$it = obj;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new FeedbackRemoteDataSourceKt$debounce$1$1$1$1(this.$waitMillis, this.$context, this.$$this$flow, this.$it, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((FeedbackRemoteDataSourceKt$debounce$1$1$1$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x003a, code lost:
    
        if (defpackage.tje.k0(r8, r1, r7) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x003c, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0026, code lost:
    
        if (kotlinx.coroutines.a.i(r5, r7) == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            long j = this.$waitMillis;
            this.label = 1;
        } else {
            if (i != 1) {
                if (i == 2) {
                    kotlin.b.b(obj);
                    return zy11.a;
                }
                ny61.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            kotlin.b.b(obj);
        }
        fse fseVar = this.$context;
        AnonymousClass1 anonymousClass1 = new AnonymousClass1(this.$$this$flow, this.$it, null);
        this.label = 2;
    }
}
