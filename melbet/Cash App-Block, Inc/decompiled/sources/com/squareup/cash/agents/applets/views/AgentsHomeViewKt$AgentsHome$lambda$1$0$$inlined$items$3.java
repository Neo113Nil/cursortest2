package com.squareup.cash.agents.applets.views;

import android.graphics.Bitmap;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.RowScope;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.AndroidImageBitmap;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import androidx.room.util.DBUtil;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import bo.app.re$$ExternalSyntheticOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.activity.viewmodels.ActivityItemViewModel;
import com.squareup.cash.activity.views.ActivityItemViewKt;
import com.squareup.cash.agents.applets.viewmodels.AgentCardViewModel;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.offers.viewmodels.itemviewmodels.OffersSearchFilterGroupViewModel;
import java.util.ArrayList;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;

/* loaded from: classes5.dex */
public final class AgentsHomeViewKt$AgentsHome$lambda$1$0$$inlined$items$3 implements Function4 {
    public final /* synthetic */ Object $items;
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ AgentsHomeViewKt$AgentsHome$lambda$1$0$$inlined$items$3(Object obj, int i) {
        this.$r8$classId = i;
        this.$items = obj;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        int i3;
        int i4 = this.$r8$classId;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        Object obj5 = this.$items;
        switch (i4) {
            case 0:
                LazyItemScopeImpl lazyItemScopeImpl = (LazyItemScopeImpl) obj;
                int intValue = ((Number) obj2).intValue();
                Composer composer = (Composer) obj3;
                int intValue2 = ((Number) obj4).intValue();
                if ((intValue2 & 6) == 0) {
                    i = intValue2 | (((GapComposer) composer).changed(lazyItemScopeImpl) ? 4 : 2);
                } else {
                    i = intValue2;
                }
                if ((intValue2 & 48) == 0) {
                    i |= ((GapComposer) composer).changed(intValue) ? 32 : 16;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(i & 1, (i & 147) != 146)) {
                    AgentCardViewModel agentCardViewModel = (AgentCardViewModel) ((ArrayList) obj5).get(intValue);
                    gapComposer.startReplaceGroup(832607363);
                    ((DefaultSizes) gapComposer.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    AgentsHomeViewKt.AgentCard(agentCardViewModel, SizeKt.fillMaxWidth(SpacerKt.m299paddingVpY3zN4(companion, 16.0f, 4.0f), 1.0f), gapComposer, 0);
                    gapComposer.end(false);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                LazyItemScopeImpl lazyItemScopeImpl2 = (LazyItemScopeImpl) obj;
                int intValue3 = ((Number) obj2).intValue();
                Composer composer2 = (Composer) obj3;
                int intValue4 = ((Number) obj4).intValue();
                if ((intValue4 & 6) == 0) {
                    i2 = (((GapComposer) composer2).changed(lazyItemScopeImpl2) ? 4 : 2) | intValue4;
                } else {
                    i2 = intValue4;
                }
                if ((intValue4 & 48) == 0) {
                    i2 |= ((GapComposer) composer2).changed(intValue3) ? 32 : 16;
                }
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(i2 & 1, (i2 & 147) != 146)) {
                    UiCallbackModel uiCallbackModel = (UiCallbackModel) ((ArrayList) obj5).get(intValue3);
                    gapComposer2.startReplaceGroup(2125112894);
                    ActivityItemViewKt.m2972ActivityItemViewww6aTOc((ActivityItemViewModel) uiCallbackModel.model, uiCallbackModel.onEvent, LazyItemScopeImpl.animateItem$default(lazyItemScopeImpl2, companion), 0L, gapComposer2, 0, 8);
                    gapComposer2.end(false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 2:
                LazyItemScopeImpl lazyItemScopeImpl3 = (LazyItemScopeImpl) obj;
                int intValue5 = ((Number) obj2).intValue();
                Composer composer3 = (Composer) obj3;
                int intValue6 = ((Number) obj4).intValue();
                if ((intValue6 & 6) == 0) {
                    i3 = intValue6 | (((GapComposer) composer3).changed(lazyItemScopeImpl3) ? 4 : 2);
                } else {
                    i3 = intValue6;
                }
                if ((intValue6 & 48) == 0) {
                    i3 |= ((GapComposer) composer3).changed(intValue5) ? 32 : 16;
                }
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(i3 & 1, (i3 & 147) != 146)) {
                    Bitmap bitmap = (Bitmap) ((ArrayList) obj5).get(intValue5);
                    gapComposer3.startReplaceGroup(-384481040);
                    Colors colors = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                    } else {
                        gapComposer3.startReplaceGroup(-1762997739);
                        gapComposer3.end(false);
                    }
                    ImageKt.m176Image5hnEew(new AndroidImageBitmap(bitmap), null, SizeKt.fillMaxWidth(ImageKt.m177backgroundbw27NRU(companion, colors.base.constantWhite, ColorKt.RectangleShape), 1.0f), ContentScale.Companion.FillWidth, null, gapComposer3, 24624, EnumC0170g.SDK_ASSET_ILLUSTRATION_FIRST_DEPOSIT_CIRCLE_VALUE);
                    DBUtil.SpacerWithinSectionSmall(0, 1, gapComposer3, null);
                    gapComposer3.end(false);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
            default:
                ((Number) obj4).intValue();
                ((RowScope) obj).getClass();
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) obj3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, ((OffersSearchFilterGroupViewModel) obj5).name, (Map) null, (Function1) null, false);
                break;
        }
        return Unit.INSTANCE;
    }
}
