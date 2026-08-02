package app.cash.local.presenters.cart;

import app.cash.local.backend.LocalBrandSyncer$SyncResult;
import app.cash.local.backend.real.RealLocalBrandSyncer;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.BrandSpotSyncTokens;
import app.cash.local.screens.app.LocalBrandLocationOpenTabScreen;
import app.cash.local.screens.app.LocalExplanatoryDialog;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.screens.Back;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.collections.EmptyList;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class LocalBrandLocationOpenTabPresenter$models$1$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public int label;
    public final /* synthetic */ LocalBrandLocationOpenTabPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ LocalBrandLocationOpenTabPresenter$models$1$1(LocalBrandLocationOpenTabPresenter localBrandLocationOpenTabPresenter, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.this$0 = localBrandLocationOpenTabPresenter;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        LocalBrandLocationOpenTabPresenter localBrandLocationOpenTabPresenter = this.this$0;
        switch (i) {
            case 0:
                return new LocalBrandLocationOpenTabPresenter$models$1$1(localBrandLocationOpenTabPresenter, continuation, 0);
            default:
                return new LocalBrandLocationOpenTabPresenter$models$1$1(localBrandLocationOpenTabPresenter, continuation, 1);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        CoroutineScope coroutineScope = (CoroutineScope) obj;
        Continuation continuation = (Continuation) obj2;
        switch (this.$r8$classId) {
        }
        return ((LocalBrandLocationOpenTabPresenter$models$1$1) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        LocalBrandLocationOpenTabPresenter localBrandLocationOpenTabPresenter = this.this$0;
        switch (i) {
            case 0:
                BetterNavigator.ScreenNavigator screenNavigator = localBrandLocationOpenTabPresenter.navigator;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i2 = this.label;
                if (i2 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealLocalBrandSyncer realLocalBrandSyncer = localBrandLocationOpenTabPresenter.syncer;
                    LocalBrandLocationOpenTabScreen localBrandLocationOpenTabScreen = localBrandLocationOpenTabPresenter.screen;
                    BrandSpot brandSpot = localBrandLocationOpenTabScreen.brandSpot;
                    String str = localBrandLocationOpenTabScreen.attributionKey.value;
                    BrandSpotSyncTokens brandSpotSyncTokens = localBrandLocationOpenTabScreen.syncTokens;
                    this.label = 1;
                    obj = RealLocalBrandSyncer.syncBrandSpot$default(realLocalBrandSyncer, brandSpot, str, brandSpotSyncTokens, null, this, 24);
                    if (obj == coroutineSingletons) {
                        break;
                    }
                } else if (i2 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                LocalBrandSyncer$SyncResult localBrandSyncer$SyncResult = (LocalBrandSyncer$SyncResult) obj;
                if (!(localBrandSyncer$SyncResult instanceof LocalBrandSyncer$SyncResult.RedirectToWeb)) {
                    if (!(localBrandSyncer$SyncResult instanceof LocalBrandSyncer$SyncResult.Failure)) {
                        if (!(localBrandSyncer$SyncResult instanceof LocalBrandSyncer$SyncResult.Success) && !Intrinsics.areEqual(localBrandSyncer$SyncResult, LocalBrandSyncer$SyncResult.Cache.INSTANCE)) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            break;
                        }
                    } else {
                        screenNavigator.goTo(new LocalExplanatoryDialog(EmptyList.INSTANCE));
                    }
                } else {
                    screenNavigator.goTo(Back.INSTANCE);
                }
                break;
            default:
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    RealLocalBrandSyncer realLocalBrandSyncer2 = localBrandLocationOpenTabPresenter.syncer;
                    BrandSpot brandSpot2 = localBrandLocationOpenTabPresenter.screen.brandSpot;
                    this.label = 1;
                    if (realLocalBrandSyncer2.syncBuyerInfo(brandSpot2, this) == coroutineSingletons2) {
                        break;
                    }
                } else if (i3 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
