package app.cash.local.presenters.brand.checkout;

import app.cash.local.presenters.internal.AnalyticsKt;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.viewmodels.LocalBrandBannerModel;
import com.squareup.cash.cdf.localclient.BannerLocation;
import com.squareup.cash.cdf.localclient.LocalClientBannerView;
import com.squareup.cash.integration.analytics.Analytics;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class LocalBrandLocationCheckoutPresenter$models$$inlined$LaunchedEffectNotNull$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ LocalBrandBannerModel $t1;
    public /* synthetic */ Object L$0;
    public final /* synthetic */ LocalBrandLocationCheckoutPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LocalBrandLocationCheckoutPresenter$models$$inlined$LaunchedEffectNotNull$2(LocalBrandBannerModel localBrandBannerModel, Continuation continuation, LocalBrandLocationCheckoutPresenter localBrandLocationCheckoutPresenter, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$t1 = localBrandBannerModel;
        this.this$0 = localBrandLocationCheckoutPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        LocalBrandLocationCheckoutPresenter localBrandLocationCheckoutPresenter = this.this$0;
        LocalBrandBannerModel localBrandBannerModel = this.$t1;
        switch (i) {
            case 0:
                LocalBrandLocationCheckoutPresenter$models$$inlined$LaunchedEffectNotNull$2 localBrandLocationCheckoutPresenter$models$$inlined$LaunchedEffectNotNull$2 = new LocalBrandLocationCheckoutPresenter$models$$inlined$LaunchedEffectNotNull$2(localBrandBannerModel, continuation, localBrandLocationCheckoutPresenter, 0);
                localBrandLocationCheckoutPresenter$models$$inlined$LaunchedEffectNotNull$2.L$0 = obj;
                return localBrandLocationCheckoutPresenter$models$$inlined$LaunchedEffectNotNull$2;
            default:
                LocalBrandLocationCheckoutPresenter$models$$inlined$LaunchedEffectNotNull$2 localBrandLocationCheckoutPresenter$models$$inlined$LaunchedEffectNotNull$22 = new LocalBrandLocationCheckoutPresenter$models$$inlined$LaunchedEffectNotNull$2(localBrandBannerModel, continuation, localBrandLocationCheckoutPresenter, 1);
                localBrandLocationCheckoutPresenter$models$$inlined$LaunchedEffectNotNull$22.L$0 = obj;
                return localBrandLocationCheckoutPresenter$models$$inlined$LaunchedEffectNotNull$22;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((LocalBrandLocationCheckoutPresenter$models$$inlined$LaunchedEffectNotNull$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        LocalBrandLocationCheckoutPresenter localBrandLocationCheckoutPresenter = this.this$0;
        LocalBrandBannerModel localBrandBannerModel = this.$t1;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Analytics analytics = localBrandLocationCheckoutPresenter.analytics;
                BrandSpot brandSpot = localBrandLocationCheckoutPresenter.screen.brandSpot;
                String str = brandSpot.brandToken;
                String str2 = brandSpot.locationToken;
                analytics.track(new LocalClientBannerView(str, str2 == null ? null : str2, BannerLocation.ORDER_DETAILS, AnalyticsKt.toBannerType(localBrandBannerModel.f917type), AnalyticsKt.toOfferToken(localBrandBannerModel.mode)), null);
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Analytics analytics2 = localBrandLocationCheckoutPresenter.analytics;
                BrandSpot brandSpot2 = localBrandLocationCheckoutPresenter.screen.brandSpot;
                String str3 = brandSpot2.brandToken;
                String str4 = brandSpot2.locationToken;
                analytics2.track(new LocalClientBannerView(str3, str4 == null ? null : str4, BannerLocation.ORDER_DETAILS, AnalyticsKt.toBannerType(localBrandBannerModel.f917type), AnalyticsKt.toOfferToken(localBrandBannerModel.mode)), null);
                break;
        }
        return Unit.INSTANCE;
    }
}
