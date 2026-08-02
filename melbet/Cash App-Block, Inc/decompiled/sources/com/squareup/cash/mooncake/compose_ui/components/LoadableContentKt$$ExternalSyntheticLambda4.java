package com.squareup.cash.mooncake.compose_ui.components;

import androidx.compose.animation.AnimatedContentScopeImpl;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.lazy.LazyItemScopeImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.recyclerview.widget.RecyclerView;
import app.cash.local.views.wallet.TabContentViewKt$$ExternalSyntheticLambda18;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.arcade.DefaultSizes;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.transfers.viewmodels.RecurringReloadConfigurationViewModel;
import com.squareup.cash.transfers.views.composer.ScheduledReloadConfigurationComposersKt;
import kotlin.Function;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.functions.Function4;

/* loaded from: classes5.dex */
public final /* synthetic */ class LoadableContentKt$$ExternalSyntheticLambda4 implements Function4 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Function f$1;
    public final /* synthetic */ int f$2;

    public /* synthetic */ LoadableContentKt$$ExternalSyntheticLambda4(int i, RecurringReloadConfigurationViewModel.SelectDay selectDay, Function1 function1) {
        this.f$2 = i;
        this.f$0 = selectDay;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i = this.$r8$classId;
        Function function = this.f$1;
        Object obj5 = this.f$0;
        int i2 = this.f$2;
        switch (i) {
            case 0:
                Function3 function3 = (Function3) obj5;
                ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) function;
                AnimatedContentScopeImpl animatedContentScopeImpl = (AnimatedContentScopeImpl) obj;
                Pair pair = (Pair) obj2;
                Composer composer = (Composer) obj3;
                int intValue = ((Integer) obj4).intValue();
                animatedContentScopeImpl.getClass();
                pair.getClass();
                Object obj6 = pair.first;
                if (((Boolean) pair.second).booleanValue()) {
                    GapComposer gapComposer = (GapComposer) composer;
                    gapComposer.startReplaceGroup(-1090697873);
                    function3.invoke(animatedContentScopeImpl, gapComposer, Integer.valueOf(intValue & 14));
                    gapComposer.end(false);
                } else {
                    GapComposer gapComposer2 = (GapComposer) composer;
                    gapComposer2.startReplaceGroup(-1090668702);
                    composableLambdaImpl.invoke(animatedContentScopeImpl, obj6, gapComposer2, Integer.valueOf(((i2 & 8) << 3) | (intValue & 14)));
                    gapComposer2.end(false);
                }
                break;
            default:
                RecurringReloadConfigurationViewModel.SelectDay selectDay = (RecurringReloadConfigurationViewModel.SelectDay) obj5;
                Function1 function1 = (Function1) function;
                int intValue2 = ((Integer) obj2).intValue();
                Composer composer2 = (Composer) obj3;
                int intValue3 = ((Integer) obj4).intValue();
                ((LazyItemScopeImpl) obj).getClass();
                if ((intValue3 & 48) == 0) {
                    intValue3 |= ((GapComposer) composer2).changed(intValue2) ? 32 : 16;
                }
                GapComposer gapComposer3 = (GapComposer) composer2;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & EnumC0170g.SDK_ASSET_ILLUSTRATION_PLAID_OVERLAY_ACCOUNT_VALUE) != 144)) {
                    int i3 = intValue2 % i2;
                    int i4 = i3 + 1;
                    ((DefaultSizes) gapComposer3.consume(ArcadeThemeKt.LocalSizes)).getClass();
                    DefaultSizes.spacing.getClass();
                    Modifier m300paddingVpY3zN4$default = SpacerKt.m300paddingVpY3zN4$default(Modifier.Companion.$$INSTANCE, 16.0f, RecyclerView.DECELERATION_RATE, 2);
                    String str = (String) selectDay.items.get(i3);
                    Integer num = selectDay.selectedIndex;
                    boolean changed = gapComposer3.changed(function1) | gapComposer3.changed(i4);
                    Object rememberedValue = gapComposer3.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new TabContentViewKt$$ExternalSyntheticLambda18(i4, 13, function1);
                        gapComposer3.updateRememberedValue(rememberedValue);
                    }
                    ScheduledReloadConfigurationComposersKt.DayItem(m300paddingVpY3zN4$default, str, i4, num, (Function0) rememberedValue, gapComposer3, 0, 0);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ LoadableContentKt$$ExternalSyntheticLambda4(Function3 function3, ComposableLambdaImpl composableLambdaImpl, int i) {
        this.f$0 = function3;
        this.f$1 = composableLambdaImpl;
        this.f$2 = i;
    }
}
