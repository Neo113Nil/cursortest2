package ru.yandex.taxi.masstransit.trains.search;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.pc01;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.masstransit.trains.search.TrainStationSearchActionInteractor$debouncedSearch$1", f = "TrainStationSearchActionInteractor.kt", l = {302, 303}, m = "invokeSuspend", v = 2)
/* loaded from: classes6.dex */
final class TrainStationSearchActionInteractor$debouncedSearch$1 extends SuspendLambda implements wls {
    final /* synthetic */ String $query;
    final /* synthetic */ SuggestType $type;
    final /* synthetic */ pc01 $uiStateRepository;
    int label;
    final /* synthetic */ a this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TrainStationSearchActionInteractor$debouncedSearch$1(a aVar, String str, pc01 pc01Var, SuggestType suggestType, Continuation continuation) {
        super(2, continuation);
        this.this$0 = aVar;
        this.$query = str;
        this.$uiStateRepository = pc01Var;
        this.$type = suggestType;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new TrainStationSearchActionInteractor$debouncedSearch$1(this.this$0, this.$query, this.$uiStateRepository, this.$type, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((TrainStationSearchActionInteractor$debouncedSearch$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0037, code lost:
    
        if (r6.b(r1, r3, r4, r5) == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0039, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0026, code lost:
    
        if (kotlinx.coroutines.a.i(300, r5) == r0) goto L15;
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
        a aVar = this.this$0;
        String str = this.$query;
        pc01 pc01Var = this.$uiStateRepository;
        SuggestType suggestType = this.$type;
        this.label = 2;
    }
}
