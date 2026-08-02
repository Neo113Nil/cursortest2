package com.squareup.cash.card.onboarding.db;

import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import com.squareup.cash.card.onboarding.PaymentDeviceCustomizationViewEvent;
import com.squareup.cash.card.onboarding.ZoomLevel;
import com.squareup.cash.card.onboarding.core.instancing.CardDesignLibraryState;
import com.squareup.cash.card.onboarding.graphics.HeartScene;
import com.squareup.cash.card.onboarding.graphics.MiniCardScene;
import com.squareup.cash.card.onboarding.graphics.WandScene;
import com.squareup.cash.card.spendinginsights.viewmodels.SpendingInsightDetailViewModel;
import com.squareup.cash.cashapppay.settings.viewmodels.CashAppPaySettingsViewEvent;
import com.squareup.cash.charting.viewmodels.EarningsBarViewModel;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* loaded from: classes6.dex */
public final /* synthetic */ class CardStudioQueries$$ExternalSyntheticLambda3 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ CardStudioQueries$$ExternalSyntheticLambda3(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Long l;
        switch (this.$r8$classId) {
            case 0:
                Function1 function1 = (Function1) obj;
                function1.getClass();
                function1.invoke("cardStudio");
                break;
            case 1:
                List list = (List) obj;
                list.getClass();
                Object obj2 = list.get(0);
                obj2.getClass();
                ZoomLevel valueOf = ZoomLevel.valueOf((String) obj2);
                Object obj3 = list.get(1);
                obj3.getClass();
                Integer num = (Integer) obj3;
                int intValue = num.intValue();
                CardDesignLibraryState cardDesignLibraryState = new CardDesignLibraryState();
                valueOf.getClass();
                cardDesignLibraryState.zoomLevel$delegate.setValue(valueOf);
                cardDesignLibraryState.focusedCardIndex$delegate.setIntValue(intValue);
                if (valueOf != ZoomLevel.FAR) {
                    cardDesignLibraryState.pendingFocusIndex$delegate.setValue(num);
                    cardDesignLibraryState.pendingFocusZoom$delegate.setValue(valueOf);
                    break;
                }
                break;
            case 2:
                Function1 function12 = (Function1) obj;
                function12.getClass();
                function12.invoke("cardStudio");
                break;
            case 3:
                Function1 function13 = (Function1) obj;
                function13.getClass();
                function13.invoke("cardStudio");
                break;
            case 4:
                Function1 function14 = (Function1) obj;
                function14.getClass();
                function14.invoke("cardStudio");
                break;
            case 5:
                Function1 function15 = (Function1) obj;
                function15.getClass();
                function15.invoke("cardStudio");
                break;
            case 6:
                Function1 function16 = (Function1) obj;
                function16.getClass();
                function16.invoke("cardStudio");
                break;
            case 7:
                Function1 function17 = (Function1) obj;
                function17.getClass();
                function17.invoke("cardStudio");
                break;
            case 8:
                ((HeartScene) obj).getClass();
                break;
            case 9:
                ((MiniCardScene) obj).getClass();
                break;
            case 10:
                ((Float) obj).floatValue();
                break;
            case 11:
                Long l2 = (Long) obj;
                l2.longValue();
                break;
            case 12:
                ((WandScene) obj).getClass();
                break;
            case 13:
                ((PaymentDeviceCustomizationViewEvent) obj).getClass();
                break;
            case 14:
                ((SemanticsPropertyReceiver) obj).getClass();
                break;
            case 15:
                ((SemanticsPropertyReceiver) obj).getClass();
                break;
            case 16:
                SpendingInsightDetailViewModel.Content.ColoredString coloredString = (SpendingInsightDetailViewModel.Content.ColoredString) obj;
                coloredString.getClass();
                break;
            case 17:
                ((SemanticsPropertyReceiver) obj).getClass();
                break;
            case 18:
                ((CashAppPaySettingsViewEvent) obj).getClass();
                break;
            case 19:
                ((CashAppPaySettingsViewEvent) obj).getClass();
                break;
            case 20:
                ((CashAppPaySettingsViewEvent) obj).getClass();
                break;
            case 21:
                break;
            case 22:
                List list2 = (List) obj;
                list2.getClass();
                Iterator it = list2.iterator();
                if (it.hasNext()) {
                    long longValue = ((Number) it.next()).longValue();
                    if (longValue == 0) {
                        longValue = 1;
                    }
                    Long valueOf2 = Long.valueOf(longValue);
                    while (it.hasNext()) {
                        long longValue2 = ((Number) it.next()).longValue();
                        if (longValue2 == 0) {
                            longValue2 = 1;
                        }
                        Long valueOf3 = Long.valueOf(longValue2);
                        if (valueOf2.compareTo(valueOf3) < 0) {
                            valueOf2 = valueOf3;
                        }
                    }
                    l = valueOf2;
                } else {
                    l = null;
                }
                break;
            case 23:
                ((EarningsBarViewModel) obj).getClass();
                break;
            case 24:
                ((SemanticsPropertyReceiver) obj).getClass();
                break;
            case 25:
                ((SemanticsPropertyReceiver) obj).getClass();
                break;
            case 26:
                ((Integer) obj).intValue();
                break;
            case 27:
                ((SemanticsPropertyReceiver) obj).getClass();
                break;
            case 28:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                SemanticsPropertiesKt.setTraversalGroup(semanticsPropertyReceiver);
                break;
            default:
                ((SemanticsPropertyReceiver) obj).getClass();
                break;
        }
        return Unit.INSTANCE;
    }
}
