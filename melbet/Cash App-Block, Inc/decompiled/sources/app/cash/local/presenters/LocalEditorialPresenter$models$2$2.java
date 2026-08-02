package app.cash.local.presenters;

import androidx.compose.runtime.MutableState;
import app.cash.api.ApiResult;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.screens.app.LocalEditorialScreen;
import app.cash.local.service.LocalService;
import app.cash.local.viewmodels.LocalEditorialViewEvent;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.caverock.androidsvg.SVG;
import com.squareup.cash.blockers.data.BlockersData;
import com.squareup.protos.cash.local.client.app.v1.BulkAddBrandsRequest;
import com.squareup.protos.cash.local.client.app.v1.BulkRemoveBrandsRequest;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class LocalEditorialPresenter$models$2$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $addingOrRemovingBrand$delegate;
    public final /* synthetic */ LocalEditorialViewEvent $event;
    public final /* synthetic */ int $r8$classId;
    public LocalEditorialPresenter L$0;
    public String L$2;
    public SVG L$3;
    public int label;
    public final /* synthetic */ LocalEditorialPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LocalEditorialPresenter$models$2$2(LocalEditorialPresenter localEditorialPresenter, LocalEditorialViewEvent localEditorialViewEvent, MutableState mutableState, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = localEditorialPresenter;
        this.$event = localEditorialViewEvent;
        this.$addingOrRemovingBrand$delegate = mutableState;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                return new LocalEditorialPresenter$models$2$2(this.this$0, this.$event, this.$addingOrRemovingBrand$delegate, continuation, 0);
            default:
                return new LocalEditorialPresenter$models$2$2(this.this$0, this.$event, this.$addingOrRemovingBrand$delegate, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((LocalEditorialPresenter$models$2$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        SVG svg;
        String str;
        SVG svg2;
        String str2;
        int i = this.$r8$classId;
        MutableState mutableState = this.$addingOrRemovingBrand$delegate;
        LocalEditorialViewEvent localEditorialViewEvent = this.$event;
        LocalEditorialPresenter localEditorialPresenter = this.this$0;
        switch (i) {
            case 0:
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SVG svg3 = (SVG) localEditorialPresenter.responseContextHandler;
                    BlockersData.Flow.INSTANCE.getClass();
                    String generateToken = BlockersData.Flow.Companion.generateToken();
                    LocalEditorialViewEvent.AddBrandClicked addBrandClicked = (LocalEditorialViewEvent.AddBrandClicked) localEditorialViewEvent;
                    mutableState.setValue(addBrandClicked.brandSpot);
                    LocalService localService = (LocalService) localEditorialPresenter.service;
                    BrandSpot brandSpot = addBrandClicked.brandSpot;
                    String str3 = brandSpot.brandToken;
                    String str4 = brandSpot.locationToken;
                    BulkAddBrandsRequest bulkAddBrandsRequest = new BulkAddBrandsRequest(CollectionsKt__CollectionsJVMKt.listOf(new BulkAddBrandsRequest.AddBrandRequest(str3, str4 != null ? str4 : null)));
                    this.L$0 = localEditorialPresenter;
                    this.L$2 = generateToken;
                    this.L$3 = svg3;
                    this.label = 1;
                    Object bulkAddBrands = localService.bulkAddBrands(generateToken, bulkAddBrandsRequest, this);
                    if (bulkAddBrands == coroutineSingletons) {
                        break;
                    } else {
                        svg = svg3;
                        str = generateToken;
                        obj = bulkAddBrands;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    svg = this.L$3;
                    str = this.L$2;
                    localEditorialPresenter = this.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                svg.handle((ApiResult) obj, str, (LocalEditorialScreen) localEditorialPresenter.screen);
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    SVG svg4 = (SVG) localEditorialPresenter.responseContextHandler;
                    BlockersData.Flow.INSTANCE.getClass();
                    String generateToken2 = BlockersData.Flow.Companion.generateToken();
                    LocalEditorialViewEvent.RemoveBrandClicked removeBrandClicked = (LocalEditorialViewEvent.RemoveBrandClicked) localEditorialViewEvent;
                    mutableState.setValue(removeBrandClicked.brandSpot);
                    LocalService localService2 = (LocalService) localEditorialPresenter.service;
                    BulkRemoveBrandsRequest bulkRemoveBrandsRequest = new BulkRemoveBrandsRequest(CollectionsKt__CollectionsJVMKt.listOf(new BulkRemoveBrandsRequest.RemoveBrandRequest(removeBrandClicked.brandSpot.brandToken)));
                    this.L$0 = localEditorialPresenter;
                    this.L$2 = generateToken2;
                    this.L$3 = svg4;
                    this.label = 1;
                    Object bulkRemoveBrands = localService2.bulkRemoveBrands(generateToken2, bulkRemoveBrandsRequest, this);
                    if (bulkRemoveBrands == coroutineSingletons2) {
                        break;
                    } else {
                        svg2 = svg4;
                        str2 = generateToken2;
                        obj = bulkRemoveBrands;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    svg2 = this.L$3;
                    str2 = this.L$2;
                    localEditorialPresenter = this.L$0;
                    SafeTrace.throwOnFailure(obj);
                }
                svg2.handle((ApiResult) obj, str2, (LocalEditorialScreen) localEditorialPresenter.screen);
                break;
        }
        return Unit.INSTANCE;
    }
}
