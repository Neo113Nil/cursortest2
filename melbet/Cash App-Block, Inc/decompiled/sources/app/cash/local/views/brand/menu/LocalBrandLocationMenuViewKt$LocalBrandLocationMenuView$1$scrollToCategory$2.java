package app.cash.local.views.brand.menu;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import androidx.datastore.core.DataStoreImpl$readDataAndUpdateCache$4;
import app.cash.local.viewmodels.LocalBrandLocationMenuViewModel;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.collapsingtoolbar.views.CollapsingToolbarScaffoldState;
import com.squareup.cash.fidesmo.presenters.FidesmoProvisioningPresenter$models$7$1;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.AwaitKt;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class LocalBrandLocationMenuViewKt$LocalBrandLocationMenuView$1$scrollToCategory$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ boolean $animated;
    public final /* synthetic */ int $categoryIndex;
    public final /* synthetic */ LazyListState $horizontalListState;
    public final /* synthetic */ LocalBrandLocationMenuViewModel $model;
    public final /* synthetic */ CollapsingToolbarScaffoldState $scaffoldState;
    public final /* synthetic */ ParcelableSnapshotMutableIntState $scrolledCategoryIndex$delegate;
    public final /* synthetic */ LazyGridState $verticalListState;
    public /* synthetic */ Object L$0;
    public int label;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalBrandLocationMenuViewKt$LocalBrandLocationMenuView$1$scrollToCategory$2(int i, CollapsingToolbarScaffoldState collapsingToolbarScaffoldState, LazyListState lazyListState, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState, boolean z, LazyGridState lazyGridState, LocalBrandLocationMenuViewModel localBrandLocationMenuViewModel, Continuation continuation) {
        super(2, continuation);
        this.$categoryIndex = i;
        this.$scaffoldState = collapsingToolbarScaffoldState;
        this.$horizontalListState = lazyListState;
        this.$scrolledCategoryIndex$delegate = parcelableSnapshotMutableIntState;
        this.$animated = z;
        this.$verticalListState = lazyGridState;
        this.$model = localBrandLocationMenuViewModel;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        LocalBrandLocationMenuViewKt$LocalBrandLocationMenuView$1$scrollToCategory$2 localBrandLocationMenuViewKt$LocalBrandLocationMenuView$1$scrollToCategory$2 = new LocalBrandLocationMenuViewKt$LocalBrandLocationMenuView$1$scrollToCategory$2(this.$categoryIndex, this.$scaffoldState, this.$horizontalListState, this.$scrolledCategoryIndex$delegate, this.$animated, this.$verticalListState, this.$model, continuation);
        localBrandLocationMenuViewKt$LocalBrandLocationMenuView$1$scrollToCategory$2.L$0 = obj;
        return localBrandLocationMenuViewKt$LocalBrandLocationMenuView$1$scrollToCategory$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((LocalBrandLocationMenuViewKt$LocalBrandLocationMenuView$1$scrollToCategory$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        CoroutineScope coroutineScope = (CoroutineScope) this.L$0;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            Job[] jobArr = {JobKt.launch$default(coroutineScope, null, null, new FidesmoProvisioningPresenter$models$7$1(this.$categoryIndex, this.$scaffoldState, this.$horizontalListState, this.$scrolledCategoryIndex$delegate, this.$animated, (Continuation) null), 3), JobKt.launch$default(coroutineScope, null, null, new DataStoreImpl$readDataAndUpdateCache$4(this.$categoryIndex, this.$verticalListState, this.$model, this.$animated, (Continuation) null), 3)};
            this.L$0 = null;
            this.label = 1;
            if (AwaitKt.joinAll(jobArr, this) == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
