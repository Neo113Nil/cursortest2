package app.cash.local.presenters.wallet;

import androidx.compose.runtime.MutableState;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.BrandToken;
import app.cash.local.views.home.LocalHomeGeoViewKt;
import com.squareup.cash.sheet.SheetPosition;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class TabContentPresenter$models$6$1$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $addedBrandTokens;
    public final /* synthetic */ MutableState $addedCards$delegate;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ MutableState $refreshState$delegate;
    public /* synthetic */ Object L$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ TabContentPresenter$models$6$1$2(MutableState mutableState, MutableState mutableState2, MutableState mutableState3, Continuation continuation, int i) {
        super(2, continuation);
        this.$r8$classId = i;
        this.$addedBrandTokens = mutableState;
        this.$addedCards$delegate = mutableState2;
        this.$refreshState$delegate = mutableState3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        switch (this.$r8$classId) {
            case 0:
                TabContentPresenter$models$6$1$2 tabContentPresenter$models$6$1$2 = new TabContentPresenter$models$6$1$2(this.$addedBrandTokens, this.$addedCards$delegate, this.$refreshState$delegate, continuation, 0);
                tabContentPresenter$models$6$1$2.L$0 = obj;
                return tabContentPresenter$models$6$1$2;
            default:
                TabContentPresenter$models$6$1$2 tabContentPresenter$models$6$1$22 = new TabContentPresenter$models$6$1$2(this.$addedBrandTokens, this.$addedCards$delegate, this.$refreshState$delegate, continuation, 1);
                tabContentPresenter$models$6$1$22.L$0 = obj;
                return tabContentPresenter$models$6$1$22;
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.$r8$classId) {
            case 0:
                return ((TabContentPresenter$models$6$1$2) create((Map) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
            default:
                return ((TabContentPresenter$models$6$1$2) create((SheetPosition) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
        }
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        int i = this.$r8$classId;
        MutableState mutableState = this.$refreshState$delegate;
        MutableState mutableState2 = this.$addedCards$delegate;
        MutableState mutableState3 = this.$addedBrandTokens;
        Object obj2 = this.L$0;
        switch (i) {
            case 0:
                Map map = (Map) obj2;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                Set keySet = map.keySet();
                int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(keySet, 10));
                if (mapCapacity < 16) {
                    mapCapacity = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
                for (Object obj3 : keySet) {
                    linkedHashMap.put(new BrandToken(((BrandSpot) obj3).brandToken), obj3);
                }
                mutableState3.setValue(linkedHashMap);
                mutableState2.setValue(map);
                mutableState.setValue(RefreshState.copy$default((RefreshState) mutableState.getValue(), 23));
                break;
            default:
                SheetPosition sheetPosition = (SheetPosition) obj2;
                CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
                SafeTrace.throwOnFailure(obj);
                if (sheetPosition != SheetPosition.Hidden) {
                    int i2 = LocalHomeGeoViewKt.$r8$clinit;
                    mutableState3.setValue(Boolean.TRUE);
                } else {
                    int i3 = LocalHomeGeoViewKt.$r8$clinit;
                    if (((Boolean) mutableState3.getValue()).booleanValue() && ((Boolean) mutableState2.getValue()).booleanValue()) {
                        ((Function0) mutableState.getValue()).invoke();
                    }
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
