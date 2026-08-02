package androidx.compose.material3;

import androidx.compose.foundation.contextmenu.ContextMenuColors;
import androidx.compose.foundation.contextmenu.ContextMenuUiKt;
import androidx.compose.foundation.interaction.MutableInteractionSourceImpl;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.foundation.text.input.TextFieldState;
import androidx.compose.material3.internal.Icons$Filled;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.window.PopupPositionProvider;
import androidx.media3.common.PlayerExtensionsKt;
import app.cash.arcade.values.ButtonProminence;
import coil3.RealImageLoader;
import com.squareup.cash.arcade.treehouse.ButtonBinding;
import com.squareup.cash.collapsingtoolbar.views.CollapsingToolbarKt;
import com.squareup.cash.collapsingtoolbar.views.CollapsingToolbarScaffoldState;
import com.squareup.cash.collapsingtoolbar.views.ScrollStrategy;
import com.squareup.cash.datefilterbar.backend.api.DateFilter;
import com.squareup.cash.earnings.views.components.EarningsFilterBarKt;
import com.squareup.cash.money.views.CardNestedScrollExpander;
import com.squareup.cash.money.views.MoneyTabThemedHeaderKt;
import com.squareup.cash.money.views.ToolbarNestedScrollExpander;
import com.squareup.cash.moneybot.components.api.ClientRenderablePluginRegistry;
import com.squareup.cash.moneybot.viewmodels.MoneybotHomeViewModel;
import com.squareup.cash.moneybot.views.home.MoneybotHomeViewKt;
import com.squareup.cash.pools.views.PoolToastKt;
import com.squareup.cash.support.chat.viewmodels.ChatAttachmentViewModel;
import com.squareup.cash.support.chat.views.transcript.message.compose.MessageFileKt;
import com.squareup.protos.cash.ui.Image;
import com.squareup.protos.franklin.cards.CardTheme;
import com.stripe.android.financialconnections.features.common.IconSize;
import com.stripe.android.financialconnections.features.common.ListItemKt;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlinx.coroutines.CoroutineScope;
import net.idrnd.face.iad.capture.internal.s2;

/* loaded from: classes3.dex */
public final /* synthetic */ class SliderKt$$ExternalSyntheticLambda4 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ boolean f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ int f$6;

    public /* synthetic */ SliderKt$$ExternalSyntheticLambda4(Modifier modifier, CollapsingToolbarScaffoldState collapsingToolbarScaffoldState, boolean z, Modifier modifier2, ComposableLambdaImpl composableLambdaImpl, ComposableLambdaImpl composableLambdaImpl2, int i) {
        this.$r8$classId = 5;
        ScrollStrategy[] scrollStrategyArr = ScrollStrategy.$VALUES;
        this.f$0 = modifier;
        this.f$1 = collapsingToolbarScaffoldState;
        this.f$2 = z;
        this.f$3 = modifier2;
        this.f$4 = composableLambdaImpl;
        this.f$5 = composableLambdaImpl2;
        this.f$6 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$6;
        Object obj3 = this.f$5;
        Object obj4 = this.f$4;
        Object obj5 = this.f$3;
        Object obj6 = this.f$0;
        Object obj7 = this.f$1;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                SliderKt.SliderImpl((Modifier) obj6, (SliderState) obj7, this.f$2, (MutableInteractionSourceImpl) obj5, (ComposableLambdaImpl) obj4, (ComposableLambdaImpl) obj3, (Composer) obj, updateChangedFlags);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(i2 | 1);
                ContextMenuUiKt.ContextMenuItem((String) obj7, this.f$2, (ContextMenuColors) obj5, (Modifier) obj6, (Function3) obj4, (Function0) obj3, (Composer) obj, updateChangedFlags2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int updateChangedFlags3 = Updater.updateChangedFlags(i2 | 1);
                MenuKt.IconButtonImpl((Modifier) obj6, (Function0) obj7, this.f$2, (Shape) obj5, (IconButtonColors) obj3, (ComposableLambdaImpl) obj4, (Composer) obj, updateChangedFlags3);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int updateChangedFlags4 = Updater.updateChangedFlags(i2 | 1);
                Icons$Filled.TooltipPopup((PopupPositionProvider) obj6, (TooltipStateImpl) obj7, (CoroutineScope) obj5, this.f$2, (MutableState) obj3, (ComposableLambdaImpl) obj4, (Composer) obj, updateChangedFlags4);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int i3 = ButtonBinding.$r8$clinit;
                int updateChangedFlags5 = Updater.updateChangedFlags(i2 | 1);
                ((ButtonBinding) obj6).Button((ButtonBinding.ArcadeStyle) obj7, (Function0) obj5, (ButtonProminence) obj3, this.f$2, (ComposableLambdaImpl) obj4, (Composer) obj, updateChangedFlags5);
                break;
            case 5:
                ScrollStrategy[] scrollStrategyArr = ScrollStrategy.$VALUES;
                ((Integer) obj2).getClass();
                int updateChangedFlags6 = Updater.updateChangedFlags(i2 | 1);
                CollapsingToolbarKt.CollapsingToolbarScaffold((Modifier) obj6, (CollapsingToolbarScaffoldState) obj7, this.f$2, (Modifier) obj5, (ComposableLambdaImpl) obj4, (ComposableLambdaImpl) obj3, (Composer) obj, updateChangedFlags6);
                break;
            case 6:
                ((Integer) obj2).getClass();
                int updateChangedFlags7 = Updater.updateChangedFlags(196609);
                EarningsFilterBarKt.EarningsFilterBar((List) obj7, (DateFilter) obj5, (Function1) obj4, (Modifier) obj6, (Function0) obj3, this.f$2, (Composer) obj, updateChangedFlags7, this.f$6);
                break;
            case 7:
                ((Integer) obj2).getClass();
                int updateChangedFlags8 = Updater.updateChangedFlags(i2 | 1);
                s2.SearchToolBar((String) obj6, (Function1) obj7, (Function1) obj5, (Function1) obj4, (FocusRequester) obj3, this.f$2, (Composer) obj, updateChangedFlags8);
                break;
            case 8:
                ToolbarNestedScrollExpander toolbarNestedScrollExpander = (ToolbarNestedScrollExpander) obj4;
                CardNestedScrollExpander cardNestedScrollExpander = (CardNestedScrollExpander) obj3;
                Composer composer = (Composer) obj;
                ((Integer) obj2).getClass();
                int updateChangedFlags9 = Updater.updateChangedFlags(i2 | 1);
                MoneyTabThemedHeaderKt.MoneyTabThemedHeader(updateChangedFlags9, composer, (Modifier) obj6, cardNestedScrollExpander, toolbarNestedScrollExpander, (Image) obj5, (CardTheme.Identifier) obj7, this.f$2);
                break;
            case 9:
                ((Integer) obj2).getClass();
                int updateChangedFlags10 = Updater.updateChangedFlags(i2 | 1);
                MoneybotHomeViewKt.MoneybotHomeView((MoneybotHomeViewModel) obj6, (RealImageLoader) obj7, (Function1) obj5, (ClientRenderablePluginRegistry) obj4, (LazyListState) obj3, this.f$2, (Composer) obj, updateChangedFlags10);
                break;
            case 10:
                ((Integer) obj2).getClass();
                int updateChangedFlags11 = Updater.updateChangedFlags(i2 | 1);
                PoolToastKt.PoolDescription((String) obj7, this.f$2, (Function1) obj5, (Function0) obj4, (Modifier) obj6, (String) obj3, (Composer) obj, updateChangedFlags11);
                break;
            case 11:
                ((Integer) obj2).getClass();
                int updateChangedFlags12 = Updater.updateChangedFlags(i2 | 1);
                PlayerExtensionsKt.InputColumn((ChatAttachmentViewModel) obj7, (TextFieldState) obj5, this.f$2, (Function0) obj4, (Function0) obj3, (Modifier) obj6, (Composer) obj, updateChangedFlags12);
                break;
            case 12:
                ((Integer) obj2).getClass();
                int updateChangedFlags13 = Updater.updateChangedFlags(i2 | 1);
                MessageFileKt.MessageFailedRetrySheetUI((String) obj6, this.f$2, (Function1) obj7, (Function1) obj5, (Function1) obj4, (String) obj3, (Composer) obj, updateChangedFlags13);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags14 = Updater.updateChangedFlags(24577);
                ListItemKt.ShapedIcon((String) obj7, (Modifier) obj6, (IconSize) obj5, (Shape) obj4, (String) obj3, this.f$2, (Composer) obj, updateChangedFlags14, this.f$6);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ SliderKt$$ExternalSyntheticLambda4(Modifier modifier, SliderState sliderState, boolean z, MutableInteractionSourceImpl mutableInteractionSourceImpl, ComposableLambdaImpl composableLambdaImpl, ComposableLambdaImpl composableLambdaImpl2, int i) {
        this.$r8$classId = 0;
        this.f$0 = modifier;
        this.f$1 = sliderState;
        this.f$2 = z;
        this.f$3 = mutableInteractionSourceImpl;
        this.f$4 = composableLambdaImpl;
        this.f$5 = composableLambdaImpl2;
        this.f$6 = i;
    }

    public /* synthetic */ SliderKt$$ExternalSyntheticLambda4(Modifier modifier, Function0 function0, boolean z, Shape shape, IconButtonColors iconButtonColors, ComposableLambdaImpl composableLambdaImpl, int i) {
        this.$r8$classId = 2;
        this.f$0 = modifier;
        this.f$1 = function0;
        this.f$2 = z;
        this.f$3 = shape;
        this.f$5 = iconButtonColors;
        this.f$4 = composableLambdaImpl;
        this.f$6 = i;
    }

    public /* synthetic */ SliderKt$$ExternalSyntheticLambda4(PopupPositionProvider popupPositionProvider, TooltipStateImpl tooltipStateImpl, CoroutineScope coroutineScope, boolean z, MutableState mutableState, ComposableLambdaImpl composableLambdaImpl, int i) {
        this.$r8$classId = 3;
        this.f$0 = popupPositionProvider;
        this.f$1 = tooltipStateImpl;
        this.f$3 = coroutineScope;
        this.f$2 = z;
        this.f$5 = mutableState;
        this.f$4 = composableLambdaImpl;
        this.f$6 = i;
    }

    public /* synthetic */ SliderKt$$ExternalSyntheticLambda4(ButtonBinding buttonBinding, ButtonBinding.ArcadeStyle arcadeStyle, Function0 function0, ButtonProminence buttonProminence, boolean z, ComposableLambdaImpl composableLambdaImpl, int i) {
        this.$r8$classId = 4;
        this.f$0 = buttonBinding;
        this.f$1 = arcadeStyle;
        this.f$3 = function0;
        this.f$5 = buttonProminence;
        this.f$2 = z;
        this.f$4 = composableLambdaImpl;
        this.f$6 = i;
    }

    public /* synthetic */ SliderKt$$ExternalSyntheticLambda4(ChatAttachmentViewModel chatAttachmentViewModel, TextFieldState textFieldState, boolean z, Function0 function0, Function0 function02, Modifier modifier, int i) {
        this.$r8$classId = 11;
        this.f$1 = chatAttachmentViewModel;
        this.f$3 = textFieldState;
        this.f$2 = z;
        this.f$4 = function0;
        this.f$5 = function02;
        this.f$0 = modifier;
        this.f$6 = i;
    }

    public /* synthetic */ SliderKt$$ExternalSyntheticLambda4(CardTheme.Identifier identifier, Modifier modifier, Image image, boolean z, ToolbarNestedScrollExpander toolbarNestedScrollExpander, CardNestedScrollExpander cardNestedScrollExpander, int i) {
        this.$r8$classId = 8;
        this.f$1 = identifier;
        this.f$0 = modifier;
        this.f$3 = image;
        this.f$2 = z;
        this.f$4 = toolbarNestedScrollExpander;
        this.f$5 = cardNestedScrollExpander;
        this.f$6 = i;
    }

    public /* synthetic */ SliderKt$$ExternalSyntheticLambda4(Object obj, Object obj2, Function1 function1, Object obj3, Object obj4, boolean z, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$3 = function1;
        this.f$4 = obj3;
        this.f$5 = obj4;
        this.f$2 = z;
        this.f$6 = i;
    }

    public /* synthetic */ SliderKt$$ExternalSyntheticLambda4(String str, Modifier modifier, IconSize iconSize, Shape shape, String str2, boolean z, int i, int i2) {
        this.$r8$classId = 13;
        this.f$1 = str;
        this.f$0 = modifier;
        this.f$3 = iconSize;
        this.f$4 = shape;
        this.f$5 = str2;
        this.f$2 = z;
        this.f$6 = i2;
    }

    public /* synthetic */ SliderKt$$ExternalSyntheticLambda4(String str, boolean z, ContextMenuColors contextMenuColors, Modifier modifier, Function3 function3, Function0 function0, int i) {
        this.$r8$classId = 1;
        this.f$1 = str;
        this.f$2 = z;
        this.f$3 = contextMenuColors;
        this.f$0 = modifier;
        this.f$4 = function3;
        this.f$5 = function0;
        this.f$6 = i;
    }

    public /* synthetic */ SliderKt$$ExternalSyntheticLambda4(String str, boolean z, Function1 function1, Function0 function0, Modifier modifier, String str2, int i) {
        this.$r8$classId = 10;
        this.f$1 = str;
        this.f$2 = z;
        this.f$3 = function1;
        this.f$4 = function0;
        this.f$0 = modifier;
        this.f$5 = str2;
        this.f$6 = i;
    }

    public /* synthetic */ SliderKt$$ExternalSyntheticLambda4(String str, boolean z, Function1 function1, Function1 function12, Function1 function13, String str2, int i) {
        this.$r8$classId = 12;
        this.f$0 = str;
        this.f$2 = z;
        this.f$1 = function1;
        this.f$3 = function12;
        this.f$4 = function13;
        this.f$5 = str2;
        this.f$6 = i;
    }

    public /* synthetic */ SliderKt$$ExternalSyntheticLambda4(List list, DateFilter dateFilter, Function1 function1, Modifier modifier, Function0 function0, boolean z, int i, int i2) {
        this.$r8$classId = 6;
        this.f$1 = list;
        this.f$3 = dateFilter;
        this.f$4 = function1;
        this.f$0 = modifier;
        this.f$5 = function0;
        this.f$2 = z;
        this.f$6 = i2;
    }
}
