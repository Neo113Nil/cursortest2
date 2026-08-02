package com.mikepenz.markdown.compose.elements;

import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontFamily;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.util.DBUtil;
import app.cash.local.viewmodels.LocalBrandLocationOpenTabViewModel;
import app.cash.local.viewmodels.LocalCartSummaryLineViewModel;
import app.cash.local.viewmodels.LocalCheckoutOrderSummaryViewModel;
import app.cash.local.views.brand.checkout.CheckoutTipSectionKt;
import com.squareup.cash.globalsearch.viewmodels.GlobalSearchViewModel;
import com.squareup.cash.globalsearch.views.GlobalSearchFeedKt$$ExternalSyntheticLambda5;
import com.squareup.cash.globalsearch.views.QuickAccessBarKt;
import com.squareup.cash.profile.viewmodels.NotificationSectionViewModel;
import com.squareup.cash.profile.viewmodels.ProfileNotificationsViewModel;
import com.squareup.cash.profile.views.notifications.ChannelListViewKt;
import defpackage.JsonLogicResult$Success$$ExternalSyntheticOutline0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.jvm.functions.Function4;
import kotlinx.serialization.encoding.AbstractEncoder;
import org.intellij.markdown.ast.ASTNodeImpl;

/* loaded from: classes6.dex */
public final class MarkdownCheckBoxKt$MarkdownCheckBox$1 implements Function4 {
    public final /* synthetic */ Object $node;
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object $style;

    public /* synthetic */ MarkdownCheckBoxKt$MarkdownCheckBox$1(int i, Object obj, Object obj2) {
        this.$r8$classId = i;
        this.$node = obj;
        this.$style = obj2;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5 = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Object obj5 = this.$style;
        Object obj6 = this.$node;
        switch (i5) {
            case 0:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                Modifier modifier = (Modifier) obj2;
                Composer composer = (Composer) obj3;
                int intValue = ((Number) obj4).intValue();
                modifier.getClass();
                if ((intValue & 6) == 0) {
                    i = (((GapComposer) composer).changed(booleanValue) ? 4 : 2) | intValue;
                } else {
                    i = intValue;
                }
                if ((intValue & 48) == 0) {
                    i |= ((GapComposer) composer).changed(modifier) ? 32 : 16;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(i & 1, (i & 147) != 146)) {
                    AbstractEncoder.MarkdownText(JsonLogicResult$Success$$ExternalSyntheticOutline0.m("[", booleanValue ? "x" : " ", "] "), (ASTNodeImpl) obj6, modifier, TextStyle.m994copyp1EtxEg$default((TextStyle) obj5, 0L, 0L, null, FontFamily.Monospace, 0L, null, 0L, null, null, null, 0, 0L, null, null, 0, 16777183), gapComposer, (i << 3) & 896, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                LazyItemScopeImpl lazyItemScopeImpl = (LazyItemScopeImpl) obj;
                int intValue2 = ((Number) obj2).intValue();
                Composer composer2 = (Composer) obj3;
                int intValue3 = ((Number) obj4).intValue();
                if ((intValue3 & 6) == 0) {
                    i2 = intValue3 | (((GapComposer) composer2).changed(lazyItemScopeImpl) ? 4 : 2);
                } else {
                    i2 = intValue3;
                }
                if ((intValue3 & 48) == 0) {
                    i2 |= ((GapComposer) composer2).changed(intValue2) ? 32 : 16;
                }
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
                    LocalBrandLocationOpenTabViewModel.Round round = (LocalBrandLocationOpenTabViewModel.Round) ((List) obj6).get(intValue2);
                    gapComposer2.startReplaceGroup(-221376780);
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(SizeKt.fillMaxWidth(companion, 1.0f), RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, intValue2 == CollectionsKt__CollectionsKt.getLastIndex(((LocalBrandLocationOpenTabViewModel) obj5).rounds) ? RecyclerView.DECELERATION_RATE : 32.0f, 7);
                    String str = round.title;
                    String str2 = round.subtitle;
                    Iterator it = round.selections.iterator();
                    int i6 = 0;
                    while (it.hasNext()) {
                        i6 += ((LocalCartSummaryLineViewModel) it.next()).quantity;
                    }
                    CheckoutTipSectionKt.m1302CheckoutOrderSummarySectionyrwZFoE(new LocalCheckoutOrderSummaryViewModel(i6, round.selections, null, round.isExpandedByDefault, 20), m302paddingqDBjuR0$default, str, str2, 0L, gapComposer2, 0, 16);
                    gapComposer2.end(false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 2:
                LazyItemScopeImpl lazyItemScopeImpl2 = (LazyItemScopeImpl) obj;
                int intValue4 = ((Number) obj2).intValue();
                Composer composer3 = (Composer) obj3;
                int intValue5 = ((Number) obj4).intValue();
                if ((intValue5 & 6) == 0) {
                    i3 = (((GapComposer) composer3).changed(lazyItemScopeImpl2) ? 4 : 2) | intValue5;
                } else {
                    i3 = intValue5;
                }
                if ((intValue5 & 48) == 0) {
                    i3 |= ((GapComposer) composer3).changed(intValue4) ? 32 : 16;
                }
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
                    GlobalSearchViewModel.Item item = (GlobalSearchViewModel.Item) ((ArrayList) obj6).get(intValue4);
                    gapComposer3.startReplaceGroup(2050878687);
                    QuickAccessBarKt.GlobalSearchCell(item, LazyItemScopeImpl.animateItem$default(lazyItemScopeImpl2, companion), (GlobalSearchFeedKt$$ExternalSyntheticLambda5) obj5, gapComposer3, 0);
                    gapComposer3.end(false);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
            default:
                LazyItemScopeImpl lazyItemScopeImpl3 = (LazyItemScopeImpl) obj;
                int intValue6 = ((Number) obj2).intValue();
                Composer composer4 = (Composer) obj3;
                int intValue7 = ((Number) obj4).intValue();
                if ((intValue7 & 6) == 0) {
                    i4 = intValue7 | (((GapComposer) composer4).changed(lazyItemScopeImpl3) ? 4 : 2);
                } else {
                    i4 = intValue7;
                }
                if ((intValue7 & 48) == 0) {
                    i4 |= ((GapComposer) composer4).changed(intValue6) ? 32 : 16;
                }
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(i4 & 1, (i4 & 147) != 146)) {
                    NotificationSectionViewModel notificationSectionViewModel = (NotificationSectionViewModel) ((List) obj6).get(intValue6);
                    gapComposer4.startReplaceGroup(2123635582);
                    ChannelListViewKt.NotificationSectionView(notificationSectionViewModel, gapComposer4, 0);
                    if (intValue6 != CollectionsKt__CollectionsKt.getLastIndex(((ProfileNotificationsViewModel.Loaded) ((ProfileNotificationsViewModel) obj5)).sections)) {
                        gapComposer4.startReplaceGroup(2123717266);
                        DBUtil.SpacerBetweenSectionXLarge(0, 1, gapComposer4, null);
                        gapComposer4.end(false);
                    } else {
                        gapComposer4.startReplaceGroup(2123773004);
                        gapComposer4.end(false);
                    }
                    gapComposer4.end(false);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
