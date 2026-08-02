package app.cash.local.presenters;

import androidx.compose.material.MenuKt$$ExternalSyntheticLambda1;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.RecomposeScopeImpl;
import androidx.compose.runtime.Updater;
import app.cash.local.backend.BuyerIntentManager;
import app.cash.local.backend.BuyerIntentScope;
import app.cash.local.backend.BuyerIntentState;
import app.cash.local.backend.BuyerIntentType;
import app.cash.local.backend.CartBuilder;
import app.cash.local.backend.CartBuilderManager;
import app.cash.local.backend.real.RealBuyerIntentManager;
import app.cash.local.backend.real.RealCartBuilderManager;
import app.cash.local.primitives.BrandSpot;
import app.cash.local.primitives.LocationMenu;
import bo.app.a$$ExternalSyntheticBUOutline0;
import coil3.gif.AnimatedImageDecoder$wrapDrawable$2;
import com.squareup.cash.clientroutes.ClientRoute;
import com.squareup.cash.work.data.api.DateRangedFeed;
import com.squareup.cash.work.data.api.DayBucket;
import com.squareup.cash.work.data.api.LoadPhase;
import java.time.LocalDate;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.text.StringsKt;
import kotlinx.coroutines.flow.MutableStateFlow;
import kotlinx.coroutines.flow.StateFlow;

/* loaded from: classes3.dex */
public abstract class BuyerIntentCartScopesKt {
    public static final void SeedBuyerIntentCartEffect(CartBuilderManager cartBuilderManager, BuyerIntentState buyerIntentState, LocationMenu locationMenu, Composer composer, int i) {
        CartBuilderManager cartBuilderManager2;
        BuyerIntentState buyerIntentState2;
        LocationMenu locationMenu2;
        cartBuilderManager.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startRestartGroup(1643030393);
        int i2 = (gapComposer.changedInstance(cartBuilderManager) ? 4 : 2) | i | (gapComposer.changedInstance(buyerIntentState) ? 32 : 16) | (gapComposer.changedInstance(locationMenu) ? 256 : 128);
        if (gapComposer.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
            boolean changedInstance = gapComposer.changedInstance(locationMenu) | ((i2 & 112) == 32 || gapComposer.changedInstance(buyerIntentState)) | gapComposer.changedInstance(cartBuilderManager);
            Object rememberedValue = gapComposer.rememberedValue();
            if (changedInstance || rememberedValue == Composer.Companion.Empty) {
                buyerIntentState2 = buyerIntentState;
                AnimatedImageDecoder$wrapDrawable$2 animatedImageDecoder$wrapDrawable$2 = new AnimatedImageDecoder$wrapDrawable$2(buyerIntentState2, locationMenu, cartBuilderManager, null, 8);
                locationMenu2 = locationMenu;
                cartBuilderManager2 = cartBuilderManager;
                gapComposer.updateRememberedValue(animatedImageDecoder$wrapDrawable$2);
                rememberedValue = animatedImageDecoder$wrapDrawable$2;
            } else {
                cartBuilderManager2 = cartBuilderManager;
                buyerIntentState2 = buyerIntentState;
                locationMenu2 = locationMenu;
            }
            Updater.LaunchedEffect(buyerIntentState2, locationMenu2, (Function2) rememberedValue, gapComposer);
        } else {
            cartBuilderManager2 = cartBuilderManager;
            buyerIntentState2 = buyerIntentState;
            locationMenu2 = locationMenu;
            gapComposer.skipToGroupEnd();
        }
        RecomposeScopeImpl endRestartGroup = gapComposer.endRestartGroup();
        if (endRestartGroup != null) {
            endRestartGroup.block = new MenuKt$$ExternalSyntheticLambda1(cartBuilderManager2, buyerIntentState2, locationMenu2, i, 9);
        }
    }

    public static final DateRangedFeed appendingSuccess(DateRangedFeed dateRangedFeed, List list) {
        dateRangedFeed.getClass();
        list.getClass();
        List list2 = list;
        if (list2.isEmpty()) {
            a$$ExternalSyntheticBUOutline0.m$3("appendingSuccess requires at least one bucket.");
            return null;
        }
        LocalDate localDate = ((DayBucket) CollectionsKt.first(list)).date;
        LocalDate endInclusive = dateRangedFeed.getEndInclusive();
        List list3 = dateRangedFeed.itemsByDay;
        boolean equals = localDate.equals(endInclusive.plusDays(1L));
        LoadPhase.Idle idle = LoadPhase.Idle.INSTANCE;
        if (equals) {
            return new DateRangedFeed(CollectionsKt.plus((Iterable) list, (Collection) list3), idle);
        }
        if (((DayBucket) CollectionsKt.last(list)).date.equals(dateRangedFeed.getStart().minusDays(1L))) {
            return new DateRangedFeed(CollectionsKt.plus((Iterable) list3, (Collection) list2), idle);
        }
        throw new IllegalStateException(("Non-adjacent merge: existing=" + dateRangedFeed.getStart() + ".." + dateRangedFeed.getEndInclusive() + " new=" + ((DayBucket) CollectionsKt.first(list)).date + ".." + ((DayBucket) CollectionsKt.last(list)).date).toString());
    }

    public static List getDeepLinkSpecs() {
        return ClientRoute.ViewCard.deepLinkSpecs;
    }

    public static final CartBuilder rememberBuyerIntentCartBuilder(CartBuilderManager cartBuilderManager, BuyerIntentState buyerIntentState, BrandSpot brandSpot, Composer composer) {
        brandSpot.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        boolean changed = gapComposer.changed(buyerIntentState != null ? buyerIntentState.scope : null) | gapComposer.changed(brandSpot);
        Object rememberedValue = gapComposer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = buyerIntentState != null ? ((RealCartBuilderManager) cartBuilderManager).getBuilder(buyerIntentState.scope) : ((RealCartBuilderManager) cartBuilderManager).getBuilder(brandSpot);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        return (CartBuilder) rememberedValue;
    }

    public static final BuyerIntentState rememberBuyerIntentCartState(BuyerIntentManager buyerIntentManager, BrandSpot brandSpot, String str, Composer composer) {
        MutableStateFlow orPutStateFlow;
        brandSpot.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        boolean changed = gapComposer.changed(brandSpot) | gapComposer.changed(str);
        Object rememberedValue = gapComposer.rememberedValue();
        if (changed || rememberedValue == Composer.Companion.Empty) {
            rememberedValue = (str == null || StringsKt.isBlank(str)) ? new BuyerIntentScope(brandSpot, BuyerIntentType.REMOTE_ORDERING, null) : new BuyerIntentScope(brandSpot, BuyerIntentType.IN_STORE_ORDERING, str);
            gapComposer.updateRememberedValue(rememberedValue);
        }
        BuyerIntentScope buyerIntentScope = (BuyerIntentScope) rememberedValue;
        boolean changed2 = gapComposer.changed(buyerIntentScope);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changed2 || rememberedValue2 == Composer.Companion.Empty) {
            RealBuyerIntentManager realBuyerIntentManager = (RealBuyerIntentManager) buyerIntentManager;
            buyerIntentScope.getClass();
            synchronized (realBuyerIntentManager.lock) {
                orPutStateFlow = RealBuyerIntentManager.getOrPutStateFlow(realBuyerIntentManager.states, buyerIntentScope);
            }
            gapComposer.updateRememberedValue(orPutStateFlow);
            rememberedValue2 = orPutStateFlow;
        }
        BuyerIntentState buyerIntentState = (BuyerIntentState) Updater.collectAsState((StateFlow) rememberedValue2, ((RealBuyerIntentManager) buyerIntentManager).current(buyerIntentScope), null, gapComposer, 64, 2).getValue();
        if (buyerIntentState == null || buyerIntentState.scope.brandSpot.locationToken == null) {
            return null;
        }
        return buyerIntentState;
    }
}
