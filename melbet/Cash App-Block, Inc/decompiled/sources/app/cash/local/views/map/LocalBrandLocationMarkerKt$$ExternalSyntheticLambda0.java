package app.cash.local.views.map;

import androidx.cardview.widget.CardViewApi21Impl;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import coil3.size.SizeKt;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.InlineMessageButtonScope;
import com.squareup.cash.arcade.components.ModalButtonScope;
import com.squareup.cash.avatar.components.StackedAvatarsKt;
import com.squareup.cash.bitcoin.viewmodels.performance.details.BitcoinPerformanceDetailsContentViewModel;
import com.squareup.cash.bitcoin.views.performance.details.BitcoinPerformanceDetailsContentKt;
import com.squareup.cash.charting.components.ChartConfig;
import com.squareup.cash.charting.components.SegmentedBarChartKt;
import com.squareup.cash.charting.viewmodels.SegmentedBarChartViewModel;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.money.applets.common.views.SharedUIKt;
import com.squareup.cash.money.viewmodels.InstalledAppletTileHeaderModel;
import com.squareup.cash.moneybot.viewmodels.chat.MoneybotChatViewModel;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.paymentpad.viewmodels.MainPaymentPadViewModel;
import com.squareup.cash.paymentpad.views.MainPaymentPadViewKt;
import com.squareup.cash.portfolio.graphs.views.InvestingGraphTabsViewKt;
import com.squareup.cash.savings.viewmodels.SavingsScreenViewModel$Content$SavingsScreenElement$Header$Balance;
import com.squareup.cash.savings.views.SavingsScreenHeaderKt;
import com.squareup.cash.support.viewmodels.SupportSearchViewModel;
import com.squareup.cash.support.views.search.SupportSearchViewKt;
import com.squareup.cash.ui.widget.StackedAvatarView$TextSize;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import com.stripe.android.financialconnections.features.manualentry.ManualEntryScreenKt;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes3.dex */
public final /* synthetic */ class LocalBrandLocationMarkerKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ boolean f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ int f$5;
    public final /* synthetic */ int f$6;

    public /* synthetic */ LocalBrandLocationMarkerKt$$ExternalSyntheticLambda0(MoneybotChatViewModel.Content.Chat chat, LazyListState lazyListState, int i, boolean z, Function1 function1, ComposableLambdaImpl composableLambdaImpl, int i2) {
        this.$r8$classId = 8;
        this.f$0 = chat;
        this.f$2 = lazyListState;
        this.f$5 = i;
        this.f$1 = z;
        this.f$3 = function1;
        this.f$4 = composableLambdaImpl;
        this.f$6 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$6;
        int i3 = this.f$5;
        Object obj3 = this.f$4;
        Object obj4 = this.f$2;
        Object obj5 = this.f$3;
        Object obj6 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(i3 | 1);
                LocalMapPinKt.LocalBrandLocationMarker((String) obj6, this.f$1, (String) obj4, (LocalColor) obj5, (Modifier) obj3, (Composer) obj, updateChangedFlags, this.f$6);
                break;
            case 1:
                Modifier modifier = (Modifier) obj3;
                Composer composer = (Composer) obj;
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(i3 | 1);
                int i4 = this.f$6;
                ((InlineMessageButtonScope) obj6).PrimaryButton(updateChangedFlags2, i4, composer, (ComposableLambdaImpl) obj5, modifier, (Function0) obj4, this.f$1);
                break;
            case 2:
                Modifier modifier2 = (Modifier) obj3;
                Composer composer2 = (Composer) obj;
                ((Integer) obj2).getClass();
                int updateChangedFlags3 = Updater.updateChangedFlags(i3 | 1);
                int i5 = this.f$6;
                ((ModalButtonScope) obj6).PrimaryModalButtonDestructive(updateChangedFlags3, i5, composer2, (ComposableLambdaImpl) obj5, modifier2, (Function0) obj4, this.f$1);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int updateChangedFlags4 = Updater.updateChangedFlags(i3 | 1);
                SizeKt.ButtonDropdown((Function0) obj6, (Modifier) obj3, this.f$1, (MutableInteractionSourceImpl) obj4, (ComposableLambdaImpl) obj5, (Composer) obj, updateChangedFlags4, this.f$6);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int updateChangedFlags5 = Updater.updateChangedFlags(i3 | 1);
                StackedAvatarsKt.ToComposable((StackedAvatarViewModel.Avatar) obj6, (Modifier) obj3, (StackedAvatarView$TextSize) obj4, (Function3) obj5, this.f$1, (Composer) obj, updateChangedFlags5, this.f$6);
                break;
            case 5:
                ((Integer) obj2).getClass();
                int updateChangedFlags6 = Updater.updateChangedFlags(i3 | 1);
                BitcoinPerformanceDetailsContentKt.BitcoinPerformanceDetailsContent((BitcoinPerformanceDetailsContentViewModel) obj6, (Function1) obj4, (Function2) obj5, (Modifier) obj3, this.f$1, (Composer) obj, updateChangedFlags6, this.f$6);
                break;
            case 6:
                ((Integer) obj2).getClass();
                int updateChangedFlags7 = Updater.updateChangedFlags(i3 | 1);
                SegmentedBarChartKt.SegmentedBarChart((SegmentedBarChartViewModel) obj6, (Modifier) obj3, (ChartConfig) obj4, this.f$1, (Function1) obj5, (Composer) obj, updateChangedFlags7, this.f$6);
                break;
            case 7:
                ((Integer) obj2).getClass();
                int updateChangedFlags8 = Updater.updateChangedFlags(i3 | 1);
                SharedUIKt.InstalledAppletTile((InstalledAppletTileHeaderModel) obj6, (ComposableLambdaImpl) obj4, (Function0) obj5, this.f$1, (Function2) obj3, (Composer) obj, updateChangedFlags8, this.f$6);
                break;
            case 8:
                ((Integer) obj2).getClass();
                int updateChangedFlags9 = Updater.updateChangedFlags(i2 | 1);
                CardViewApi21Impl.ChatContent((MoneybotChatViewModel.Content.Chat) obj6, (LazyListState) obj4, this.f$5, this.f$1, (Function1) obj5, (ComposableLambdaImpl) obj3, (Composer) obj, updateChangedFlags9);
                break;
            case 9:
                ((Integer) obj2).getClass();
                int updateChangedFlags10 = Updater.updateChangedFlags(i3 | 1);
                KeypadKt.IconButton((Function0) obj4, (Modifier) obj3, (String) obj6, this.f$1, (ComposableLambdaImpl) obj5, (Composer) obj, updateChangedFlags10, this.f$6);
                break;
            case 10:
                ((Integer) obj2).getClass();
                int updateChangedFlags11 = Updater.updateChangedFlags(i3 | 1);
                MainPaymentPadViewKt.MainPaymentPad((MainPaymentPadViewModel) obj6, (Function1) obj4, this.f$1, (Modifier) obj3, (ElementBoundsRegistry) obj5, (Composer) obj, updateChangedFlags11, this.f$6);
                break;
            case 11:
                ((Integer) obj2).getClass();
                int updateChangedFlags12 = Updater.updateChangedFlags(i3 | 1);
                InvestingGraphTabsViewKt.InvestingGraphTimeRangeButtons((HistoricalRange) obj6, this.f$1, (Function1) obj4, (Modifier) obj3, (List) obj5, (Composer) obj, updateChangedFlags12, this.f$6);
                break;
            case 12:
                ((Integer) obj2).getClass();
                int updateChangedFlags13 = Updater.updateChangedFlags(i3 | 1);
                SavingsScreenHeaderKt.BalanceHeader((SavingsScreenViewModel$Content$SavingsScreenElement$Header$Balance) obj6, (Modifier) obj3, (Shaker) obj4, (Function1) obj5, this.f$1, (Composer) obj, updateChangedFlags13, this.f$6);
                break;
            case 13:
                ((Integer) obj2).getClass();
                int updateChangedFlags14 = Updater.updateChangedFlags(i3 | 1);
                SupportSearchViewKt.ItemRow((SupportSearchViewModel.HighlightedString) obj6, (SupportSearchViewModel.HighlightedString) obj4, (Icons) obj5, this.f$1, (Function0) obj3, (Composer) obj, updateChangedFlags14, this.f$6);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags15 = Updater.updateChangedFlags(i2 | 1);
                ManualEntryScreenKt.InputWithError(this.f$1, (String) obj6, (Integer) obj5, this.f$5, (String) obj4, (Function1) obj3, (Composer) obj, updateChangedFlags15);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ LocalBrandLocationMarkerKt$$ExternalSyntheticLambda0(SegmentedBarChartViewModel segmentedBarChartViewModel, Modifier modifier, ChartConfig chartConfig, boolean z, Function1 function1, int i, int i2) {
        this.$r8$classId = 6;
        this.f$0 = segmentedBarChartViewModel;
        this.f$4 = modifier;
        this.f$2 = chartConfig;
        this.f$1 = z;
        this.f$3 = function1;
        this.f$5 = i;
        this.f$6 = i2;
    }

    public /* synthetic */ LocalBrandLocationMarkerKt$$ExternalSyntheticLambda0(BitcoinPerformanceDetailsContentViewModel bitcoinPerformanceDetailsContentViewModel, Function1 function1, Function2 function2, Modifier modifier, boolean z, int i, int i2) {
        this.$r8$classId = 5;
        this.f$0 = bitcoinPerformanceDetailsContentViewModel;
        this.f$2 = function1;
        this.f$3 = function2;
        this.f$4 = modifier;
        this.f$1 = z;
        this.f$5 = i;
        this.f$6 = i2;
    }

    public /* synthetic */ LocalBrandLocationMarkerKt$$ExternalSyntheticLambda0(MainPaymentPadViewModel mainPaymentPadViewModel, Function1 function1, boolean z, Modifier modifier, ElementBoundsRegistry elementBoundsRegistry, int i, int i2) {
        this.$r8$classId = 10;
        this.f$0 = mainPaymentPadViewModel;
        this.f$2 = function1;
        this.f$1 = z;
        this.f$4 = modifier;
        this.f$3 = elementBoundsRegistry;
        this.f$5 = i;
        this.f$6 = i2;
    }

    public /* synthetic */ LocalBrandLocationMarkerKt$$ExternalSyntheticLambda0(HistoricalRange historicalRange, boolean z, Function1 function1, Modifier modifier, List list, int i, int i2) {
        this.$r8$classId = 11;
        this.f$0 = historicalRange;
        this.f$1 = z;
        this.f$2 = function1;
        this.f$4 = modifier;
        this.f$3 = list;
        this.f$5 = i;
        this.f$6 = i2;
    }

    public /* synthetic */ LocalBrandLocationMarkerKt$$ExternalSyntheticLambda0(Object obj, Modifier modifier, Object obj2, Function function, boolean z, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = obj;
        this.f$4 = modifier;
        this.f$2 = obj2;
        this.f$3 = function;
        this.f$1 = z;
        this.f$5 = i;
        this.f$6 = i2;
    }

    public /* synthetic */ LocalBrandLocationMarkerKt$$ExternalSyntheticLambda0(Object obj, Object obj2, Object obj3, boolean z, Function function, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = obj;
        this.f$2 = obj2;
        this.f$3 = obj3;
        this.f$1 = z;
        this.f$4 = function;
        this.f$5 = i;
        this.f$6 = i2;
    }

    public /* synthetic */ LocalBrandLocationMarkerKt$$ExternalSyntheticLambda0(Object obj, Function0 function0, Modifier modifier, boolean z, ComposableLambdaImpl composableLambdaImpl, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = obj;
        this.f$2 = function0;
        this.f$4 = modifier;
        this.f$1 = z;
        this.f$3 = composableLambdaImpl;
        this.f$5 = i;
        this.f$6 = i2;
    }

    public /* synthetic */ LocalBrandLocationMarkerKt$$ExternalSyntheticLambda0(String str, boolean z, String str2, LocalColor localColor, Modifier modifier, int i, int i2) {
        this.$r8$classId = 0;
        this.f$0 = str;
        this.f$1 = z;
        this.f$2 = str2;
        this.f$3 = localColor;
        this.f$4 = modifier;
        this.f$5 = i;
        this.f$6 = i2;
    }

    public /* synthetic */ LocalBrandLocationMarkerKt$$ExternalSyntheticLambda0(Function0 function0, Modifier modifier, String str, boolean z, ComposableLambdaImpl composableLambdaImpl, int i, int i2) {
        this.$r8$classId = 9;
        this.f$2 = function0;
        this.f$4 = modifier;
        this.f$0 = str;
        this.f$1 = z;
        this.f$3 = composableLambdaImpl;
        this.f$5 = i;
        this.f$6 = i2;
    }

    public /* synthetic */ LocalBrandLocationMarkerKt$$ExternalSyntheticLambda0(Function0 function0, Modifier modifier, boolean z, MutableInteractionSourceImpl mutableInteractionSourceImpl, ComposableLambdaImpl composableLambdaImpl, int i, int i2) {
        this.$r8$classId = 3;
        this.f$0 = function0;
        this.f$4 = modifier;
        this.f$1 = z;
        this.f$2 = mutableInteractionSourceImpl;
        this.f$3 = composableLambdaImpl;
        this.f$5 = i;
        this.f$6 = i2;
    }

    public /* synthetic */ LocalBrandLocationMarkerKt$$ExternalSyntheticLambda0(boolean z, String str, Integer num, int i, String str2, Function1 function1, int i2) {
        this.$r8$classId = 14;
        this.f$1 = z;
        this.f$0 = str;
        this.f$3 = num;
        this.f$5 = i;
        this.f$2 = str2;
        this.f$4 = function1;
        this.f$6 = i2;
    }
}
