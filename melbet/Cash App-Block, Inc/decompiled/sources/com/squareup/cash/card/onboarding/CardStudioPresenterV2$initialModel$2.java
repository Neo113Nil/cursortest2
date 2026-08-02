package com.squareup.cash.card.onboarding;

import app.cash.badging.backend.FinishSetupTileBadgeCounter;
import app.cash.local.db.LocalTabContentQueries;
import app.cash.sqldelight.SimpleQuery;
import app.cash.sqldelight.db.SqlDriver;
import bo.app.a$$ExternalSyntheticBUOutline0;
import com.squareup.cash.card.onboarding.CardStudioViewModelV2;
import com.squareup.cash.card.onboarding.db.CardStudio;
import com.squareup.cash.card.onboarding.db.CardStudioQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.card.onboarding.db.CardStudioQueries$selectTemporaryState$2;
import com.squareup.cash.card.onboarding.screens.CardStudioScreen;
import com.squareup.cash.data.db.AppConfigManager;
import com.squareup.cash.data.db.RealAppConfigManager;
import com.squareup.cash.db2.StampsConfig;
import com.squareup.cash.device.DeviceOrientation;
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
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsJVMKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.CoroutineScope;
import kotlinx.coroutines.flow.FlowKt;
import papa.SafeTrace;

/* loaded from: classes6.dex */
public final class CardStudioPresenterV2$initialModel$2 extends SuspendLambda implements Function2 {
    public final /* synthetic */ String $cashtag;
    public final /* synthetic */ DeviceOrientation $deviceOrientation;
    public int I$1;
    public int I$2;
    public CardStudio L$0;
    public CardStudio L$1;
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
    public CardStudioPresenterV2$initialModel$2(CardStudioPresenter cardStudioPresenter, String str, DeviceOrientation deviceOrientation, Continuation continuation) {
        super(2, continuation);
        this.this$0 = cardStudioPresenter;
        this.$cashtag = str;
        this.$deviceOrientation = deviceOrientation;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation create(Object obj, Continuation continuation) {
        return new CardStudioPresenterV2$initialModel$2(this.this$0, this.$cashtag, this.$deviceOrientation, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((CardStudioPresenterV2$initialModel$2) create((CoroutineScope) obj, (Continuation) obj2)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0159  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0160  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00b4  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        CardStudio cardStudio;
        int i;
        Object first;
        CardStudio cardStudio2;
        int i2;
        boolean z;
        Map map;
        CustomizationDetails customizationDetails;
        CustomizationDetails portraitCustomizationDetails;
        CardTheme cardTheme;
        TouchData touchData;
        CardStudioPresenter cardStudioPresenter = this.this$0;
        LocalTabContentQueries localTabContentQueries = (LocalTabContentQueries) cardStudioPresenter.cardStudioQueries;
        CardStudioScreen cardStudioScreen = (CardStudioScreen) cardStudioPresenter.args;
        CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
        int i3 = this.label;
        if (i3 == 0) {
            SafeTrace.throwOnFailure(obj);
            cardStudio = (CardStudio) localTabContentQueries.select$2().executeAsOne();
            Redacted redacted = cardStudioScreen.cashtag;
            CardCustomizationBlocker.CardOption.CashtagDisplay cashtagDisplay = cardStudioScreen.cashtagDisplay;
            boolean z2 = redacted != null;
            int i4 = (z2 && cashtagDisplay == CardCustomizationBlocker.CardOption.CashtagDisplay.OPTIONAL) ? 1 : 0;
            if (z2) {
                int i5 = WhenMappings.$EnumSwitchMapping$0[cashtagDisplay.ordinal()];
                if (i5 == 1) {
                    z = false;
                } else if (i5 == 2) {
                    z = true;
                } else {
                    if (i5 != 3) {
                        Drop$$ExternalSyntheticBUOutline0.m1m();
                        return null;
                    }
                    z = cardStudio.cashtag_enabled;
                }
                if (z) {
                    i = 1;
                    localTabContentQueries.getClass();
                    CardStudioQueries$selectTemporaryState$2 cardStudioQueries$selectTemporaryState$2 = CardStudioQueries$selectTemporaryState$2.INSTANCE;
                    SqlDriver sqlDriver = localTabContentQueries.driver;
                    CardStudioQueries$$ExternalSyntheticLambda0 cardStudioQueries$$ExternalSyntheticLambda0 = new CardStudioQueries$$ExternalSyntheticLambda0(localTabContentQueries, 0);
                    sqlDriver.getClass();
                    CardStudio cardStudio3 = (CardStudio) new SimpleQuery(-1252016507, new String[]{"cardStudio"}, sqlDriver, "CardStudio.sq", "selectTemporaryState", "SELECT cardStudio._id, cardStudio.touch_data, cardStudio.card_theme, cardStudio.cashtag_enabled FROM cardStudio WHERE _id = 2", cardStudioQueries$$ExternalSyntheticLambda0).executeAsOneOrNull();
                    FinishSetupTileBadgeCounter stampConfig = ((RealAppConfigManager) ((AppConfigManager) cardStudioPresenter.appConfig)).stampConfig();
                    this.L$0 = cardStudio;
                    this.L$1 = cardStudio3;
                    this.I$1 = i4;
                    this.I$2 = i;
                    this.label = 1;
                    first = FlowKt.first(stampConfig, this);
                    if (first != coroutineSingletons) {
                        return coroutineSingletons;
                    }
                    cardStudio2 = cardStudio3;
                    i2 = i4;
                }
            }
            i = 0;
            localTabContentQueries.getClass();
            CardStudioQueries$selectTemporaryState$2 cardStudioQueries$selectTemporaryState$22 = CardStudioQueries$selectTemporaryState$2.INSTANCE;
            SqlDriver sqlDriver2 = localTabContentQueries.driver;
            CardStudioQueries$$ExternalSyntheticLambda0 cardStudioQueries$$ExternalSyntheticLambda02 = new CardStudioQueries$$ExternalSyntheticLambda0(localTabContentQueries, 0);
            sqlDriver2.getClass();
            CardStudio cardStudio32 = (CardStudio) new SimpleQuery(-1252016507, new String[]{"cardStudio"}, sqlDriver2, "CardStudio.sq", "selectTemporaryState", "SELECT cardStudio._id, cardStudio.touch_data, cardStudio.card_theme, cardStudio.cashtag_enabled FROM cardStudio WHERE _id = 2", cardStudioQueries$$ExternalSyntheticLambda02).executeAsOneOrNull();
            FinishSetupTileBadgeCounter stampConfig2 = ((RealAppConfigManager) ((AppConfigManager) cardStudioPresenter.appConfig)).stampConfig();
            this.L$0 = cardStudio;
            this.L$1 = cardStudio32;
            this.I$1 = i4;
            this.I$2 = i;
            this.label = 1;
            first = FlowKt.first(stampConfig2, this);
            if (first != coroutineSingletons) {
            }
        } else {
            if (i3 != 1) {
                a$$ExternalSyntheticBUOutline0.m$1("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            int i6 = this.I$2;
            i2 = this.I$1;
            cardStudio2 = this.L$1;
            cardStudio = this.L$0;
            SafeTrace.throwOnFailure(obj);
            i = i6;
            first = obj;
        }
        List list = ((StampsConfig) first).stamps;
        if (list != null) {
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                Stamp stamp = (Stamp) obj2;
                if (cardStudioScreen.availableStamps.isEmpty() || CollectionsKt.contains(cardStudioScreen.availableStamps, stamp.name)) {
                    arrayList.add(obj2);
                }
            }
            int mapCapacity = MapsKt__MapsJVMKt.mapCapacity(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
            if (mapCapacity < 16) {
                mapCapacity = 16;
            }
            map = new LinkedHashMap(mapCapacity);
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                String str = ((Stamp) next).name;
                str.getClass();
                map.put(str, next);
            }
        } else {
            map = EmptyMap.INSTANCE;
            map.getClass();
        }
        if (cardStudio2 == null || (touchData = cardStudio2.touch_data) == null) {
            TouchData touchData2 = cardStudio.touch_data;
            if (touchData2 == null) {
                customizationDetails = null;
                boolean z3 = cardStudioScreen.customizationEligible;
                cardTheme = cardStudio.card_theme;
                cardTheme.getClass();
                CardTheme.Gradient gradient = cardTheme.gradient_style;
                if (cardTheme.id == CardTheme.Identifier.TORTOISE_ID) {
                    gradient = null;
                }
                return new CardStudioViewModelV2.Content(this.$cashtag, i == 0, i2 == 0, z3, CardTheme.copy$default(cardTheme, gradient, null, null, 16775167), customizationDetails, CardStudioPresenter.toCardStudioOrientation(this.$deviceOrientation), 1792);
            }
            portraitCustomizationDetails = StyledCardViewModelKt.toPortraitCustomizationDetails(touchData2, map);
        } else {
            portraitCustomizationDetails = StyledCardViewModelKt.toPortraitCustomizationDetails(touchData, map);
        }
        customizationDetails = portraitCustomizationDetails;
        boolean z32 = cardStudioScreen.customizationEligible;
        cardTheme = cardStudio.card_theme;
        cardTheme.getClass();
        CardTheme.Gradient gradient2 = cardTheme.gradient_style;
        if (cardTheme.id == CardTheme.Identifier.TORTOISE_ID) {
        }
        return new CardStudioViewModelV2.Content(this.$cashtag, i == 0, i2 == 0, z32, CardTheme.copy$default(cardTheme, gradient2, null, null, 16775167), customizationDetails, CardStudioPresenter.toCardStudioOrientation(this.$deviceOrientation), 1792);
    }
}
