package app.cash.local.presenters.cart;

import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.State;
import app.cash.local.backend.CartBuilder;
import app.cash.local.backend.CartBuilderKt;
import app.cash.local.backend.real.RealCartBuilder;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.CartEntry;
import app.cash.local.primitives.LocationMenu;
import app.cash.local.primitives.LocationMenu$$ExternalSyntheticLambda6;
import app.cash.local.primitives.Selection;
import app.cash.local.primitives.SelectionKt;
import app.cash.local.primitives.analytics.LocalClientCartMenuItemAddedContext;
import app.cash.local.screens.app.LocalBrandLocationCartScreen;
import com.squareup.protos.cash.local.client.v1.LocalActionOrdering;
import com.squareup.protos.cash.local.client.v1.LocalCart;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import papa.SafeTrace;

/* loaded from: classes3.dex */
public final class LocalBrandLocationCartPresenter$models$5$1 extends SuspendLambda implements Function2 {
    public final /* synthetic */ MutableState $currentOpenCart;
    public final /* synthetic */ State $menu$delegate;
    public final /* synthetic */ MutableState $pastOrderHasBeenAdded$delegate;
    public final /* synthetic */ LocalBrandLocationCartPresenter this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LocalBrandLocationCartPresenter$models$5$1(LocalBrandLocationCartPresenter localBrandLocationCartPresenter, MutableState mutableState, State state, MutableState mutableState2, Continuation continuation) {
        super(2, continuation);
        this.this$0 = localBrandLocationCartPresenter;
        this.$currentOpenCart = mutableState;
        this.$menu$delegate = state;
        this.$pastOrderHasBeenAdded$delegate = mutableState2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new LocalBrandLocationCartPresenter$models$5$1(this.this$0, this.$currentOpenCart, this.$menu$delegate, this.$pastOrderHasBeenAdded$delegate, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((LocalBrandLocationCartPresenter$models$5$1) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        LocalBrandLocationCartPresenter localBrandLocationCartPresenter = this.this$0;
        LocalBrandLocationCartScreen localBrandLocationCartScreen = localBrandLocationCartPresenter.screen;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        SafeTrace.throwOnFailure(obj);
        State state = this.$menu$delegate;
        if (((LocationMenu) state.getValue()) == null || localBrandLocationCartScreen.pastOrder == null) {
            return Unit.INSTANCE;
        }
        MutableState mutableState = this.$pastOrderHasBeenAdded$delegate;
        if (((Boolean) mutableState.getValue()).booleanValue()) {
            return Unit.INSTANCE;
        }
        mutableState.setValue(Boolean.TRUE);
        RealCartBuilder realCartBuilder = (RealCartBuilder) ((CartBuilder) this.$currentOpenCart.getValue());
        realCartBuilder.clearAll();
        LocalActionOrdering.PastOrder pastOrder = localBrandLocationCartScreen.pastOrder;
        pastOrder.getClass();
        LocationMenu locationMenu = (LocationMenu) state.getValue();
        locationMenu.getClass();
        List list = pastOrder.cart_line_selections;
        ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(SelectionKt.toSelection((LocalCart.Line.Selection) it.next()));
        }
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            Selection selection = (Selection) it2.next();
            CartEntry m1202toCartEntryxZOLh24 = CartBuilderKt.m1202toCartEntryxZOLh24(selection, locationMenu, null, null);
            List list2 = selection.comboSlots;
            int i = selection.quantity;
            BrandSpot brandSpot = localBrandLocationCartPresenter.brandSpot;
            realCartBuilder.add(m1202toCartEntryxZOLh24, i, locationMenu, new LocalClientCartMenuItemAddedContext(brandSpot.brandToken, brandSpot.locationToken, !list2.isEmpty() ? new LocalClientCartMenuItemAddedContext.MenuItemAddedContextComboData.ComboItemContextData(CollectionsKt.joinToString$default(list2, ",", null, null, 0, null, new LocationMenu$$ExternalSyntheticLambda6(5), 30)) : LocalClientCartMenuItemAddedContext.MenuItemAddedContextComboData.NonComboItemContextData.INSTANCE, null, null, null, localBrandLocationCartScreen.pastOrderIndex, LocalClientCartMenuItemAddedContext.ReorderableSelectionSource.LOCAL_HOME, 56));
        }
        return Unit.INSTANCE;
    }
}
