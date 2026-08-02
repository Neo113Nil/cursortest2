package com.squareup.cash.card.onboarding;

import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.local.db.LocalTabContentQueries;
import app.cash.sqldelight.SimpleQuery;
import app.cash.sqldelight.db.SqlDriver;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.card.onboarding.CardStudioViewModel;
import com.squareup.cash.card.onboarding.db.CardStudio;
import com.squareup.cash.card.onboarding.db.CardStudioQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.card.onboarding.db.CardStudioQueries$selectTemporaryState$2;
import com.squareup.cash.card.onboarding.screens.CardStudioScreen;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.db.RealAppConfigManager;
import com.squareup.cash.db2.StampsConfig;
import com.squareup.cash.screens.Redacted;
import com.squareup.protos.franklin.api.CardCustomizationBlocker;
import com.squareup.protos.franklin.cards.CardTheme;
import com.squareup.protos.franklin.cards.TouchData;
import com.squareup.protos.franklin.common.Stamp;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class CardStudioPresenter$initialModel$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ String $cashtag;
    public int label;
    public final /* synthetic */ CardStudioPresenter this$0;

    public abstract /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CardCustomizationBlocker.CardOption.CashtagDisplay.values().length];
            try {
                iArr[CardCustomizationBlocker.CardOption.CashtagDisplay.ALWAYS_HIDDEN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CardCustomizationBlocker.CardOption.CashtagDisplay.ALWAYS_SHOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[CardCustomizationBlocker.CardOption.CashtagDisplay.OPTIONAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CardStudioPresenter$initialModel$2(CardStudioPresenter cardStudioPresenter, String str, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cardStudioPresenter;
        this.$cashtag = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CardStudioPresenter$initialModel$2(this.this$0, this.$cashtag, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CardStudioPresenter$initialModel$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00ef  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x012c  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00f1  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object first;
        CustomizationDetails customizationDetails;
        CustomizationDetails customizationDetails2;
        boolean z;
        boolean z2;
        CardTheme cardTheme;
        boolean z3;
        TouchData touchData;
        CardStudioPresenter cardStudioPresenter = this.this$0;
        LocalTabContentQueries localTabContentQueries = (LocalTabContentQueries) cardStudioPresenter.cardStudioQueries;
        CardStudioScreen cardStudioScreen = (CardStudioScreen) cardStudioPresenter.args;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            SafeTrace.throwOnFailure(obj);
            FinishSetupTileBadgeCounter stampConfig = ((RealAppConfigManager) ((AppConfigManager) cardStudioPresenter.appConfig)).stampConfig();
            this.label = 1;
            first = FlowKt.first(stampConfig, this);
            if (first == coroutineSingletons) {
                return coroutineSingletons;
            }
        } else {
            if (i != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            SafeTrace.throwOnFailure(obj);
            first = obj;
        }
        List list = ((StampsConfig) first).stamps;
        list.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            Stamp stamp = (Stamp) obj2;
            if (!cardStudioScreen.availableStamps.isEmpty()) {
                List list2 = cardStudioScreen.availableStamps;
                String str = stamp.name;
                str.getClass();
                if (list2.contains(str)) {
                }
            }
            arrayList.add(obj2);
        }
        int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
        if (mapCapacity < 16) {
            mapCapacity = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(mapCapacity);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            String str2 = ((Stamp) next).name;
            str2.getClass();
            linkedHashMap.put(str2, next);
        }
        CardStudio cardStudio = (CardStudio) localTabContentQueries.select$2().executeAsOne();
        localTabContentQueries.getClass();
        CardStudioQueries$selectTemporaryState$2 cardStudioQueries$selectTemporaryState$2 = CardStudioQueries$selectTemporaryState$2.INSTANCE;
        SqlDriver sqlDriver = localTabContentQueries.driver;
        CardStudioQueries$$ExternalSyntheticLambda0 cardStudioQueries$$ExternalSyntheticLambda0 = new CardStudioQueries$$ExternalSyntheticLambda0(localTabContentQueries, 0);
        sqlDriver.getClass();
        CardStudio cardStudio2 = (CardStudio) new SimpleQuery(-1252016507, new String[]{"cardStudio"}, sqlDriver, "CardStudio.sq", "selectTemporaryState", "SELECT cardStudio._id, cardStudio.touch_data, cardStudio.card_theme, cardStudio.cashtag_enabled FROM cardStudio WHERE _id = 2", cardStudioQueries$$ExternalSyntheticLambda0).executeAsOneOrNull();
        if (cardStudio2 == null || (touchData = cardStudio2.touch_data) == null) {
            TouchData touchData2 = cardStudio.touch_data;
            if (touchData2 == null) {
                customizationDetails = null;
                Redacted redacted = cardStudioScreen.cashtag;
                CardCustomizationBlocker.CardOption.CashtagDisplay cashtagDisplay = cardStudioScreen.cashtagDisplay;
                z = redacted == null;
                boolean z4 = !z && cashtagDisplay == CardCustomizationBlocker.CardOption.CashtagDisplay.OPTIONAL;
                if (z) {
                    int i2 = WhenMappings.$EnumSwitchMapping$0[cashtagDisplay.ordinal()];
                    if (i2 == 1) {
                        z3 = false;
                    } else if (i2 == 2) {
                        z3 = true;
                    } else {
                        if (i2 != 3) {
                            Drop$$ExternalSyntheticBUOutline0.m1m();
                            return null;
                        }
                        z3 = cardStudio.cashtag_enabled;
                    }
                    if (z3) {
                        z2 = true;
                        boolean z5 = cardStudioScreen.customizationEligible;
                        cardTheme = cardStudio.card_theme;
                        cardTheme.getClass();
                        CardTheme.Gradient gradient = cardTheme.gradient_style;
                        if (cardTheme.id == CardTheme.Identifier.TORTOISE_ID) {
                            gradient = null;
                        }
                        return new CardStudioViewModel.Content(this.$cashtag, z2, z5, z4, CardTheme.copy$default(cardTheme, gradient, null, null, 16775167), customizationDetails, CardStudioViewModel.CustomizationMode.DRAW.INSTANCE, false, false);
                    }
                }
                z2 = false;
                boolean z52 = cardStudioScreen.customizationEligible;
                cardTheme = cardStudio.card_theme;
                cardTheme.getClass();
                CardTheme.Gradient gradient2 = cardTheme.gradient_style;
                if (cardTheme.id == CardTheme.Identifier.TORTOISE_ID) {
                }
                return new CardStudioViewModel.Content(this.$cashtag, z2, z52, z4, CardTheme.copy$default(cardTheme, gradient2, null, null, 16775167), customizationDetails, CardStudioViewModel.CustomizationMode.DRAW.INSTANCE, false, false);
            }
            customizationDetails2 = StyledCardViewModelKt.toCustomizationDetails(touchData2, linkedHashMap);
        } else {
            customizationDetails2 = StyledCardViewModelKt.toCustomizationDetails(touchData, linkedHashMap);
        }
        customizationDetails = customizationDetails2;
        Redacted redacted2 = cardStudioScreen.cashtag;
        CardCustomizationBlocker.CardOption.CashtagDisplay cashtagDisplay2 = cardStudioScreen.cashtagDisplay;
        if (redacted2 == null) {
        }
        if (z) {
        }
        if (z) {
        }
        z2 = false;
        boolean z522 = cardStudioScreen.customizationEligible;
        cardTheme = cardStudio.card_theme;
        cardTheme.getClass();
        CardTheme.Gradient gradient22 = cardTheme.gradient_style;
        if (cardTheme.id == CardTheme.Identifier.TORTOISE_ID) {
        }
        return new CardStudioViewModel.Content(this.$cashtag, z2, z522, z4, CardTheme.copy$default(cardTheme, gradient22, null, null, 16775167), customizationDetails, CardStudioViewModel.CustomizationMode.DRAW.INSTANCE, false, false);
    }
}
