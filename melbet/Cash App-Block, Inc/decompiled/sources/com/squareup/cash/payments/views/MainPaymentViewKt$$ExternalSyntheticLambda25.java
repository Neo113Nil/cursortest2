package com.squareup.cash.payments.views;

import androidx.compose.animation.AnimatedContentKt;
import androidx.compose.animation.AnimatedContentTransitionScopeImpl;
import androidx.compose.animation.EnterExitTransitionKt;
import androidx.compose.animation.core.AnimatableKt;
import androidx.compose.animation.core.SnapSpec;
import androidx.compose.ui.graphics.ReusableGraphicsLayerScope;
import androidx.compose.ui.semantics.ProgressBarRangeInfo;
import androidx.compose.ui.semantics.SemanticsPropertiesKt;
import androidx.compose.ui.semantics.SemanticsPropertyReceiver;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.payments.backend.api.P2pSettingsManager$P2pSettings;
import com.squareup.cash.payments.backend.real.RealP2pSettingsManager;
import com.squareup.cash.payments.viewmodels.PaymentConfigurationViewModel;
import com.squareup.cash.payments.viewmodels.StablecoinWithdrawalOptionRow;
import com.squareup.protos.franklin.ui.UiP2pSettings;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.collections.EmptyMap;
import kotlin.collections.MapsKt__MapsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Reflection;
import kotlin.text.StringsKt__StringsKt;

/* loaded from: classes6.dex */
public final /* synthetic */ class MainPaymentViewKt$$ExternalSyntheticLambda25 implements Function1 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ MainPaymentViewKt$$ExternalSyntheticLambda25(RealP2pSettingsManager realP2pSettingsManager) {
        this.$r8$classId = 1;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        List split$default;
        List split$default2;
        List split$default3;
        List split$default4;
        int i = 10;
        int i2 = 6;
        switch (this.$r8$classId) {
            case 0:
                SemanticsPropertyReceiver semanticsPropertyReceiver = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver.getClass();
                SemanticsPropertiesKt.m950setRolekuIjeqM(semanticsPropertyReceiver, 0);
                return Unit.INSTANCE;
            case 1:
                UiP2pSettings uiP2pSettings = (UiP2pSettings) obj;
                uiP2pSettings.getClass();
                Integer num = uiP2pSettings.require_minimum_initiator_notes_length_for_requests;
                return new P2pSettingsManager$P2pSettings(num != null ? num.intValue() : 0, uiP2pSettings.incoming_request_policy, uiP2pSettings.nearby_visibility, uiP2pSettings.rate_plan, uiP2pSettings.can_upgrade_to_business, uiP2pSettings.deposit_preference, uiP2pSettings.deposit_preference_data, uiP2pSettings.cash_balance_home_screen_button_enabled);
            case 2:
                String str = (String) obj;
                str.getClass();
                if (str.length() == 0) {
                    EmptyMap emptyMap = EmptyMap.INSTANCE;
                    emptyMap.getClass();
                    return emptyMap;
                }
                split$default = StringsKt__StringsKt.split$default(str, new String[]{","}, false, 0, 6, null);
                List list = split$default;
                ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    split$default2 = StringsKt__StringsKt.split$default((String) it.next(), new String[]{";"}, false, 0, 6, null);
                    arrayList.add(split$default2);
                }
                ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList, 10));
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    List list2 = (List) it2.next();
                    arrayList2.add(new Pair(list2.get(0), Integer.valueOf(Integer.parseInt((String) list2.get(1)))));
                }
                return MapsKt__MapsKt.toMap(arrayList2);
            case 3:
                Map map = (Map) obj;
                map.getClass();
                if (map.isEmpty()) {
                    return "";
                }
                Set<Map.Entry> entrySet = map.entrySet();
                ArrayList arrayList3 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(entrySet, 10));
                for (Map.Entry entry : entrySet) {
                    arrayList3.add(entry.getKey() + ";" + entry.getValue());
                }
                return CollectionsKt.joinToString$default(arrayList3, ",", null, null, 0, null, new MainPaymentViewKt$$ExternalSyntheticLambda25(i2), 30);
            case 4:
                String str2 = (String) obj;
                str2.getClass();
                if (str2.length() == 0) {
                    EmptyMap emptyMap2 = EmptyMap.INSTANCE;
                    emptyMap2.getClass();
                    return emptyMap2;
                }
                split$default3 = StringsKt__StringsKt.split$default(str2, new String[]{","}, false, 0, 6, null);
                List list3 = split$default3;
                ArrayList arrayList4 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list3, 10));
                Iterator it3 = list3.iterator();
                while (it3.hasNext()) {
                    split$default4 = StringsKt__StringsKt.split$default((String) it3.next(), new String[]{";"}, false, 0, 6, null);
                    arrayList4.add(split$default4);
                }
                ArrayList arrayList5 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(arrayList4, 10));
                Iterator it4 = arrayList4.iterator();
                while (it4.hasNext()) {
                    List list4 = (List) it4.next();
                    arrayList5.add(new Pair(list4.get(0), Boolean.valueOf(Boolean.parseBoolean((String) list4.get(1)))));
                }
                return MapsKt__MapsKt.toMap(arrayList5);
            case 5:
                Map map2 = (Map) obj;
                map2.getClass();
                if (map2.isEmpty()) {
                    return "";
                }
                Set<Map.Entry> entrySet2 = map2.entrySet();
                ArrayList arrayList6 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(entrySet2, 10));
                for (Map.Entry entry2 : entrySet2) {
                    arrayList6.add(entry2.getKey() + ";" + entry2.getValue());
                }
                return CollectionsKt.joinToString$default(arrayList6, ",", null, null, 0, null, new MainPaymentViewKt$$ExternalSyntheticLambda25(7), 30);
            case 6:
                String str3 = (String) obj;
                str3.getClass();
                return str3;
            case 7:
                String str4 = (String) obj;
                str4.getClass();
                return str4;
            case 8:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope.getClass();
                reusableGraphicsLayerScope.m709setCompositingStrategyaDBOjCE(1);
                return Unit.INSTANCE;
            case 9:
                ReusableGraphicsLayerScope reusableGraphicsLayerScope2 = (ReusableGraphicsLayerScope) obj;
                reusableGraphicsLayerScope2.getClass();
                reusableGraphicsLayerScope2.m709setCompositingStrategyaDBOjCE(1);
                return Unit.INSTANCE;
            case 10:
                return Integer.valueOf(((Integer) obj).intValue() / 4);
            case 11:
                ((AnimatedContentTransitionScopeImpl) obj).getClass();
                return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE, 0, null, 6), 2).plus(EnterExitTransitionKt.slideInVertically(AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE, 0, null, 6), new MainPaymentViewKt$$ExternalSyntheticLambda25(i))), EnterExitTransitionKt.fadeOut$default(AnimatableKt.tween$default(150, 0, null, 6), 2));
            case 12:
                PaymentConfigurationViewModel paymentConfigurationViewModel = (PaymentConfigurationViewModel) obj;
                paymentConfigurationViewModel.getClass();
                return Reflection.factory.getOrCreateKotlinClass(paymentConfigurationViewModel.getClass());
            case 13:
                ((Integer) obj).intValue();
                return Unit.INSTANCE;
            case 14:
                SemanticsPropertyReceiver semanticsPropertyReceiver2 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver2.getClass();
                SemanticsPropertiesKt.heading(semanticsPropertyReceiver2);
                return Unit.INSTANCE;
            case 15:
                SemanticsPropertyReceiver semanticsPropertyReceiver3 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver3.getClass();
                SemanticsPropertiesKt.heading(semanticsPropertyReceiver3);
                return Unit.INSTANCE;
            case 16:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 17:
                SemanticsPropertyReceiver semanticsPropertyReceiver4 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver4.getClass();
                SemanticsPropertiesKt.m950setRolekuIjeqM(semanticsPropertyReceiver4, 0);
                return Unit.INSTANCE;
            case 18:
                SemanticsPropertyReceiver semanticsPropertyReceiver5 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver5.getClass();
                SemanticsPropertiesKt.m950setRolekuIjeqM(semanticsPropertyReceiver5, 0);
                return Unit.INSTANCE;
            case 19:
                SemanticsPropertyReceiver semanticsPropertyReceiver6 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver6.getClass();
                SemanticsPropertiesKt.setProgressBarRangeInfo(semanticsPropertyReceiver6, ProgressBarRangeInfo.Indeterminate);
                SemanticsPropertiesKt.m950setRolekuIjeqM(semanticsPropertyReceiver6, 0);
                SemanticsPropertiesKt.disabled(semanticsPropertyReceiver6);
                return Unit.INSTANCE;
            case 20:
                ((AnimatedContentTransitionScopeImpl) obj).getClass();
                return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE, 0, null, 6), 2), EnterExitTransitionKt.fadeOut$default(new SnapSpec(EnumC0170g.SDK_ASSET_TRANSFER_ICON_CIRCLE_VALUE), 2));
            case 21:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 22:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 23:
                ((SemanticsPropertyReceiver) obj).getClass();
                return Unit.INSTANCE;
            case 24:
                SemanticsPropertyReceiver semanticsPropertyReceiver7 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver7.getClass();
                SemanticsPropertiesKt.m950setRolekuIjeqM(semanticsPropertyReceiver7, 0);
                return Unit.INSTANCE;
            case 25:
                ((String) obj).getClass();
                return Unit.INSTANCE;
            case 26:
                ((AnimatedContentTransitionScopeImpl) obj).getClass();
                return AnimatedContentKt.togetherWith(EnterExitTransitionKt.fadeIn$default(AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE, 0, null, 6), 2), EnterExitTransitionKt.fadeOut$default(AnimatableKt.tween$default(EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ROUTING_NUMBER_SEARCH_VALUE, 0, null, 6), 2));
            case 27:
                SemanticsPropertyReceiver semanticsPropertyReceiver8 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver8.getClass();
                SemanticsPropertiesKt.invisibleToUser(semanticsPropertyReceiver8);
                return Unit.INSTANCE;
            case 28:
                SemanticsPropertyReceiver semanticsPropertyReceiver9 = (SemanticsPropertyReceiver) obj;
                semanticsPropertyReceiver9.getClass();
                SemanticsPropertiesKt.heading(semanticsPropertyReceiver9);
                return Unit.INSTANCE;
            default:
                StablecoinWithdrawalOptionRow stablecoinWithdrawalOptionRow = (StablecoinWithdrawalOptionRow) obj;
                stablecoinWithdrawalOptionRow.getClass();
                return stablecoinWithdrawalOptionRow.option.network.chain;
        }
    }

    public /* synthetic */ MainPaymentViewKt$$ExternalSyntheticLambda25(int i) {
        this.$r8$classId = i;
    }
}
