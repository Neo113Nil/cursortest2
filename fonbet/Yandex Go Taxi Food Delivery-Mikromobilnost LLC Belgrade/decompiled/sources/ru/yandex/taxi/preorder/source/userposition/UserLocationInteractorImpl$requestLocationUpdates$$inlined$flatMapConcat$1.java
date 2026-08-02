package ru.yandex.taxi.preorder.source.userposition;

import com.pdfview.subsamplincscaleimageview.SubsamplingScaleImageView;
import defpackage.hcz;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\n\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0010\u0004\u001a\b\u0012\u0004\u0012\u00028\u00000\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0001H\n"}, d2 = {"R", "T", "it", "Ltpr;", "<anonymous>"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.preorder.source.userposition.UserLocationInteractorImpl$requestLocationUpdates$$inlined$flatMapConcat$1", f = "UserLocationInteractorImpl.kt", l = {SubsamplingScaleImageView.ORIENTATION_270, 271, 273}, m = "invokeSuspend", v = 2)
/* loaded from: classes9.dex */
public final class UserLocationInteractorImpl$requestLocationUpdates$$inlined$flatMapConcat$1 extends SuspendLambda implements wls {
    long J$0;
    /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public UserLocationInteractorImpl$requestLocationUpdates$$inlined$flatMapConcat$1(Continuation continuation, e eVar) {
        super(2, continuation);
        this.this$0 = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        UserLocationInteractorImpl$requestLocationUpdates$$inlined$flatMapConcat$1 userLocationInteractorImpl$requestLocationUpdates$$inlined$flatMapConcat$1 = new UserLocationInteractorImpl$requestLocationUpdates$$inlined$flatMapConcat$1(continuation, this.this$0);
        userLocationInteractorImpl$requestLocationUpdates$$inlined$flatMapConcat$1.L$0 = obj;
        return userLocationInteractorImpl$requestLocationUpdates$$inlined$flatMapConcat$1;
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((UserLocationInteractorImpl$requestLocationUpdates$$inlined$flatMapConcat$1) create(obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x007c, code lost:
    
        if (r8 == r1) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0064, code lost:
    
        if (r8 == r1) goto L20;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        hcz hczVar;
        long j;
        Object obj2 = this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            this.this$0.i.getClass();
            ru.yandex.taxi.preorder.source.userposition.repository.d dVar = this.this$0.e;
            this.L$0 = null;
            this.L$1 = null;
            this.L$2 = null;
            this.label = 1;
            obj = dVar.a(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    if (i != 3) {
                        ny61.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = this.J$0;
                    kotlin.b.b(obj);
                    return kotlinx.coroutines.flow.e.p((tpr) obj, j);
                }
                hczVar = (hcz) this.L$3;
                kotlin.b.b(obj);
                long longValue = ((Number) obj).longValue();
                this.this$0.h.getClass();
                this.L$0 = null;
                this.L$1 = null;
                this.L$2 = null;
                this.L$3 = null;
                this.J$0 = longValue;
                this.label = 3;
                obj = hczVar.a(this);
                if (obj != coroutineSingletons) {
                    j = longValue;
                    return kotlinx.coroutines.flow.e.p((tpr) obj, j);
                }
                return coroutineSingletons;
            }
            kotlin.b.b(obj);
        }
        hczVar = (hcz) obj;
        ru.yandex.taxi.main.map.autoupdatelocationthrottle.e eVar = this.this$0.g;
        this.L$0 = null;
        this.L$1 = null;
        this.L$2 = null;
        this.L$3 = hczVar;
        this.label = 2;
        obj = eVar.b(this);
    }
}
