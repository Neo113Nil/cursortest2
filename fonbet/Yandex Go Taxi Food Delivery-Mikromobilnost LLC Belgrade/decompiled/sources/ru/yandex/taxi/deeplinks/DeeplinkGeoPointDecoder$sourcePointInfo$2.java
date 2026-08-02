package ru.yandex.taxi.deeplinks;

import defpackage.mvg;
import defpackage.ny61;
import defpackage.tpr;
import defpackage.tse;
import defpackage.wls;
import defpackage.zy11;
import defpackage.zzs;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Ltse;", "Ldd61;", "<anonymous>", "(Ltse;)Ldd61;"}, k = 3, mv = {2, 4, 0})
@mvg(c = "ru.yandex.taxi.deeplinks.DeeplinkGeoPointDecoder$sourcePointInfo$2", f = "DeeplinkGeoPointDecoder.kt", l = {45}, m = "invokeSuspend", v = 2)
/* loaded from: classes13.dex */
final class DeeplinkGeoPointDecoder$sourcePointInfo$2 extends SuspendLambda implements wls {
    final /* synthetic */ String $analyticsEventForRouteDeeplink;
    final /* synthetic */ zzs $sourceGeoPoint;
    final /* synthetic */ boolean $sticky;
    final /* synthetic */ boolean $withMultiexitArea;
    int label;
    final /* synthetic */ e this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeeplinkGeoPointDecoder$sourcePointInfo$2(e eVar, zzs zzsVar, String str, boolean z, boolean z2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = eVar;
        this.$sourceGeoPoint = zzsVar;
        this.$analyticsEventForRouteDeeplink = str;
        this.$sticky = z;
        this.$withMultiexitArea = z2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new DeeplinkGeoPointDecoder$sourcePointInfo$2(this.this$0, this.$sourceGeoPoint, this.$analyticsEventForRouteDeeplink, this.$sticky, this.$withMultiexitArea, continuation);
    }

    @Override // defpackage.wls
    public final Object invoke(Object obj, Object obj2) {
        return ((DeeplinkGeoPointDecoder$sourcePointInfo$2) create((tse) obj, (Continuation) obj2)).invokeSuspend(zy11.a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i != 0) {
            if (i == 1) {
                kotlin.b.b(obj);
                return obj;
            }
            ny61.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        kotlin.b.b(obj);
        tpr g = this.this$0.g(this.$sourceGeoPoint, this.$analyticsEventForRouteDeeplink, this.$sticky, this.$withMultiexitArea);
        this.label = 1;
        Object y = kotlinx.coroutines.flow.e.y(g, this);
        return y == coroutineSingletons ? coroutineSingletons : y;
    }
}
