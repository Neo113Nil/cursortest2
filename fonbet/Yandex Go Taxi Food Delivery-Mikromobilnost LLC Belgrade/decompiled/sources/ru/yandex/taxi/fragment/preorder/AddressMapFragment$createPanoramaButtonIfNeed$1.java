package ru.yandex.taxi.fragment.preorder;

import defpackage.e8y0;
import defpackage.mvg;
import defpackage.ny61;
import defpackage.pv0;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Lzy11;", "<anonymous>", "(Ltse;)V"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.fragment.preorder.AddressMapFragment$createPanoramaButtonIfNeed$1", f = "AddressMapFragment.kt", l = {991, 992}, m = "invokeSuspend", v = 2)
/* loaded from: classes5.dex */
public final class AddressMapFragment$createPanoramaButtonIfNeed$1 extends SuspendLambda implements wls {
    final /* synthetic */ pv0 $addressInfo;
    Object L$0;
    int label;
    final /* synthetic */ AddressMapFragment<L, I> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AddressMapFragment$createPanoramaButtonIfNeed$1(AddressMapFragment addressMapFragment, pv0 pv0Var, Continuation continuation) {
        super(2, continuation);
        this.this$0 = addressMapFragment;
        this.$addressInfo = pv0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new AddressMapFragment$createPanoramaButtonIfNeed$1(this.this$0, this.$addressInfo, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((AddressMapFragment$createPanoramaButtonIfNeed$1) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0041, code lost:
    
        if (r5 == r0) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0043, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0030, code lost:
    
        if (r6 == r0) goto L15;
     */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object createPanoramaButtonIfNeed;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            kotlin.b.b(obj);
            e8y0 taxiPanoramaExperimentRepository = this.this$0.getTaxiPanoramaExperimentRepository();
            this.label = 1;
            obj = taxiPanoramaExperimentRepository.a.b(this);
        } else {
            if (i != 1) {
                if (i != 2) {
                    ny61.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                kotlin.b.b(obj);
                return zy11.a;
            }
            kotlin.b.b(obj);
        }
        AddressMapFragment<L, I> addressMapFragment = this.this$0;
        pv0 pv0Var = this.$addressInfo;
        this.L$0 = null;
        this.label = 2;
        createPanoramaButtonIfNeed = addressMapFragment.createPanoramaButtonIfNeed(pv0Var, (ru.yandex.taxi.panorama.d) obj, this);
    }
}
