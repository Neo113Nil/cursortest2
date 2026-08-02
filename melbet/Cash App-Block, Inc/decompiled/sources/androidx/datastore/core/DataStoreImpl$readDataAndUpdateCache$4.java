package androidx.datastore.core;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.lazy.grid.LazyGridState;
import androidx.compose.runtime.ParcelableSnapshotMutableIntState;
import app.cash.local.viewmodels.LocalBrandLocationMenuViewModel;
import app.cash.molecule.PlatformKt;
import bo.app.a$$ExternalSyntheticBUOutline0;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntProgressionIterator;
import kotlin.ranges.RangesKt___RangesKt;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class DataStoreImpl$readDataAndUpdateCache$4 extends SuspendLambda implements Function2 {
    public final /* synthetic */ int $cachedVersion;
    public final /* synthetic */ int $r8$classId;
    public Object L$0;
    public /* synthetic */ boolean Z$0;
    public int label;
    public final /* synthetic */ Object this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$readDataAndUpdateCache$4(int i, LazyGridState lazyGridState, LocalBrandLocationMenuViewModel localBrandLocationMenuViewModel, boolean z, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 2;
        this.$cachedVersion = i;
        this.L$0 = lazyGridState;
        this.this$0 = localBrandLocationMenuViewModel;
        this.Z$0 = z;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        int i = this.$r8$classId;
        int i2 = this.$cachedVersion;
        Object obj2 = this.this$0;
        switch (i) {
            case 0:
                DataStoreImpl$readDataAndUpdateCache$4 dataStoreImpl$readDataAndUpdateCache$4 = new DataStoreImpl$readDataAndUpdateCache$4((DataStoreImpl) obj2, i2, continuation, 0);
                dataStoreImpl$readDataAndUpdateCache$4.Z$0 = ((Boolean) obj).booleanValue();
                return dataStoreImpl$readDataAndUpdateCache$4;
            case 1:
                DataStoreImpl$readDataAndUpdateCache$4 dataStoreImpl$readDataAndUpdateCache$42 = new DataStoreImpl$readDataAndUpdateCache$4((DataStoreImpl) obj2, i2, continuation, 1);
                dataStoreImpl$readDataAndUpdateCache$42.Z$0 = ((Boolean) obj).booleanValue();
                return dataStoreImpl$readDataAndUpdateCache$42;
            case 2:
                boolean z = this.Z$0;
                return new DataStoreImpl$readDataAndUpdateCache$4(this.$cachedVersion, (LazyGridState) this.L$0, (LocalBrandLocationMenuViewModel) obj2, z, continuation);
            default:
                return new DataStoreImpl$readDataAndUpdateCache$4(this.$cachedVersion, this.Z$0, (LazyListState) this.L$0, (ParcelableSnapshotMutableIntState) obj2, continuation);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                break;
            case 1:
                Boolean bool2 = (Boolean) obj;
                bool2.booleanValue();
                break;
        }
        return ((DataStoreImpl$readDataAndUpdateCache$4) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0092, code lost:
    
        if (androidx.compose.foundation.lazy.grid.LazyGridState.animateScrollToItem$default(r11, r1, r10) == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x009b, code lost:
    
        if (androidx.compose.foundation.lazy.grid.LazyGridState.scrollToItem$default(r11, r1, r10) == r0) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00cb, code lost:
    
        if (r11 == r0) goto L51;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00ee  */
    /* JADX WARN: Type inference failed for: r1v1, types: [int] */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v22 */
    /* JADX WARN: Type inference failed for: r1v4 */
    /* JADX WARN: Type inference failed for: r1v7 */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Throwable th;
        boolean z;
        State state;
        boolean z2;
        boolean z3;
        Object obj2;
        int i = this.$r8$classId;
        int i2 = this.$cachedVersion;
        Object obj3 = this.this$0;
        switch (i) {
            case 0:
                DataStoreImpl dataStoreImpl = (DataStoreImpl) obj3;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                boolean z4 = this.label;
                try {
                } catch (Throwable th2) {
                    th = th2;
                    if (z4 != 0) {
                        SingleProcessCoordinator coordinator = dataStoreImpl.getCoordinator();
                        this.L$0 = th;
                        this.Z$0 = z4;
                        this.label = 2;
                        Integer version = coordinator.getVersion();
                        if (version != coroutineSingletons) {
                            obj = version;
                            th = th;
                            z = z4 ? 1 : 0;
                        }
                    }
                }
                if (z4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    boolean z5 = this.Z$0;
                    this.Z$0 = z5;
                    this.label = 1;
                    obj = DataStoreImpl.access$readDataOrHandleCorruption(dataStoreImpl, z5, this);
                    z4 = z5;
                    if (obj == coroutineSingletons) {
                        break;
                    }
                } else if (z4 == 1) {
                    boolean z6 = this.Z$0;
                    SafeTrace.throwOnFailure(obj);
                    z4 = z6;
                } else if (z4 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    z = this.Z$0;
                    th = (Throwable) this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    i2 = ((Number) obj).intValue();
                    th = th;
                    z4 = z;
                    state = new ReadException(th, i2);
                    z2 = z4;
                    break;
                }
                state = (State) obj;
                z2 = z4;
            case 1:
                DataStoreImpl dataStoreImpl2 = (DataStoreImpl) obj3;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i3 = this.label;
                if (i3 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    z3 = this.Z$0;
                    this.Z$0 = z3;
                    this.label = 1;
                    obj = dataStoreImpl2.readDataFromFileOrDefault(this);
                    break;
                } else if (i3 == 1) {
                    z3 = this.Z$0;
                    SafeTrace.throwOnFailure(obj);
                } else if (i3 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    obj2 = this.L$0;
                    SafeTrace.throwOnFailure(obj);
                    i2 = ((Number) obj).intValue();
                    obj = obj2;
                    break;
                }
                if (z3) {
                    SingleProcessCoordinator coordinator2 = dataStoreImpl2.getCoordinator();
                    this.L$0 = obj;
                    this.label = 2;
                    Integer version2 = coordinator2.getVersion();
                    if (version2 != coroutineSingletons2) {
                        Object obj4 = obj;
                        obj = version2;
                        obj2 = obj4;
                        i2 = ((Number) obj).intValue();
                        obj = obj2;
                    }
                    break;
                }
            case 2:
                CoroutineSingletons coroutineSingletons3 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i4 = this.label;
                if (i4 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    LocalBrandLocationMenuViewModel localBrandLocationMenuViewModel = (LocalBrandLocationMenuViewModel) obj3;
                    IntProgressionIterator it = RangesKt___RangesKt.until(0, i2).iterator();
                    while (it.hasNext) {
                        LocalBrandLocationMenuViewModel.MenuCategory menuCategory = (LocalBrandLocationMenuViewModel.MenuCategory) localBrandLocationMenuViewModel.menuCategories.get(it.nextInt());
                        menuCategory.getClass();
                        LocalBrandLocationMenuViewModel.MenuCategory.Style style = LocalBrandLocationMenuViewModel.MenuCategory.Style.LIST;
                        r1 = r1 + 1 + menuCategory.items.size();
                    }
                    LazyGridState lazyGridState = (LazyGridState) this.L$0;
                    if (!this.Z$0) {
                        this.label = 2;
                        break;
                    } else {
                        this.label = 1;
                        break;
                    }
                } else if (i4 != 1 && i4 != 2) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                break;
            default:
                ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState = (ParcelableSnapshotMutableIntState) obj3;
                CoroutineSingletons coroutineSingletons4 = CoroutineSingletons.COROUTINE_SUSPENDED;
                int i5 = this.label;
                if (i5 == 0) {
                    SafeTrace.throwOnFailure(obj);
                    int intValue = i2 - parcelableSnapshotMutableIntState.getIntValue();
                    if (this.Z$0 && intValue > 0) {
                        this.label = 1;
                        if (PlatformKt.scrollBy((LazyListState) this.L$0, intValue, this) == coroutineSingletons4) {
                            break;
                        }
                    }
                } else if (i5 != 1) {
                    a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                    break;
                } else {
                    SafeTrace.throwOnFailure(obj);
                }
                parcelableSnapshotMutableIntState.setIntValue(i2);
                break;
        }
        return Unit.INSTANCE;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DataStoreImpl$readDataAndUpdateCache$4(int i, boolean z, LazyListState lazyListState, ParcelableSnapshotMutableIntState parcelableSnapshotMutableIntState, Continuation continuation) {
        super(2, continuation);
        this.$r8$classId = 3;
        this.$cachedVersion = i;
        this.Z$0 = z;
        this.L$0 = lazyListState;
        this.this$0 = parcelableSnapshotMutableIntState;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ DataStoreImpl$readDataAndUpdateCache$4(DataStoreImpl dataStoreImpl, int i, Continuation continuation, int i2) {
        super(2, continuation);
        this.$r8$classId = i2;
        this.this$0 = dataStoreImpl;
        this.$cachedVersion = i;
    }
}
