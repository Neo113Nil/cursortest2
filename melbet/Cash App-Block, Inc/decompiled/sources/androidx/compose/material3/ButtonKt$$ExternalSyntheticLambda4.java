package androidx.compose.material3;

import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusOwnerImpl;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.text.TextStyle;
import androidx.room.TransactorKt;
import coil3.RealImageLoader;
import com.google.common.primitives.Longs;
import com.squareup.cash.arcade.components.button.ButtonProminence;
import com.squareup.cash.bitcoin.viewmodels.transfer.BitcoinTransferViewModel;
import com.squareup.cash.bitcoin.views.exchange.BitcoinExchangeViewKt;
import com.squareup.cash.common.composeui.animations.Shaker;
import com.squareup.cash.elementboundsregistry.core.ElementBoundsRegistry;
import com.squareup.cash.graphics.swampgl.Engine;
import com.squareup.cash.graphics.swampgl.components.Scene;
import com.squareup.cash.money.applets.common.views.InstalledServiceAppletTileLayoutConfig;
import com.squareup.cash.money.applets.common.views.SharedUIKt;
import com.squareup.cash.money.viewmodels.InstalledAppletTileHeaderModel;
import com.squareup.cash.money.viewmodels.MoneyTabModel;
import com.squareup.cash.money.views.MoneyTabUIKt;
import com.squareup.cash.moneybot.views.chat.SuggestionRowStyle;
import com.squareup.cash.moneybot.views.chat.SuggestionUiKt;
import com.squareup.cash.moneybot.widgets.KeyboardState;
import com.squareup.cash.mooncake.compose_ui.components.AlertDialogButton;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.mooncake.compose_ui.components.LoadingIndicatorPosition;
import com.squareup.cash.performance.RealScrollPerformanceTrackerFactory;
import com.squareup.cash.shopping.sup.views.CartTotalDiscrepancy;
import com.squareup.cash.shopping.sup.views.SingleUsePaymentAddCardSheetKt;
import com.squareup.cash.ui.widget.amount.AmountDisplayState;
import com.squareup.cash.work.views.clockin.DisclaimerTextKt;
import java.util.List;
import kotlin.Unit;
import kotlin.io.ByteStreamsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes3.dex */
public final /* synthetic */ class ButtonKt$$ExternalSyntheticLambda4 implements Function2 {
    public final /* synthetic */ int $r8$classId = 2;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ int f$10;
    public final /* synthetic */ int f$11;
    public final /* synthetic */ boolean f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Object f$7;
    public final /* synthetic */ Object f$9;

    public /* synthetic */ ButtonKt$$ExternalSyntheticLambda4(String str, TextStyle textStyle, String str2, boolean z, int i, Function2 function2, Function3 function3, Function2 function22, int i2) {
        this.f$0 = str;
        this.f$1 = textStyle;
        this.f$3 = str2;
        this.f$2 = z;
        this.f$10 = i;
        this.f$4 = function2;
        this.f$7 = function3;
        this.f$9 = function22;
        this.f$11 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$10;
        Object obj3 = this.f$0;
        Object obj4 = this.f$9;
        Object obj5 = this.f$7;
        Object obj6 = this.f$4;
        Object obj7 = this.f$3;
        Object obj8 = this.f$1;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                MenuKt.TextButton((Function0) obj3, (Modifier) obj8, this.f$2, (Shape) obj7, (ButtonColors) obj6, (PaddingValues) obj5, (ComposableLambdaImpl) obj4, (Composer) obj, updateChangedFlags, this.f$11);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(i2 | 1);
                BitcoinExchangeViewKt.BitcoinExchangeKeypadAmountPicker((BitcoinTransferViewModel.Content.FullScreenContent) obj3, (AmountDisplayState) obj7, (Shaker) obj6, (Function1) obj5, (Modifier) obj8, (Function3) obj4, this.f$2, (Composer) obj, updateChangedFlags2, this.f$11);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int updateChangedFlags3 = Updater.updateChangedFlags(i2 | 1);
                ByteStreamsKt.SwampGLEffect((Modifier) obj8, (Engine) obj3, (Scene) obj7, (Longs) obj6, this.f$2, (Function1) obj5, (Function1) obj4, (Composer) obj, updateChangedFlags3, this.f$11);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int updateChangedFlags4 = Updater.updateChangedFlags(i2 | 1);
                SharedUIKt.InstalledServiceAppletTile((InstalledAppletTileHeaderModel) obj8, (List) obj7, (Function0) obj3, this.f$2, (Function2) obj6, (InstalledServiceAppletTileLayoutConfig) obj5, (Function2) obj4, (Composer) obj, updateChangedFlags4, this.f$11);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int updateChangedFlags5 = Updater.updateChangedFlags(i2 | 1);
                MoneyTabUIKt.MoneyTabUI((MoneyTabModel) obj8, (Function1) obj7, (RealImageLoader) obj6, (RealScrollPerformanceTrackerFactory) obj5, (ElementBoundsRegistry) obj4, (Function0) obj3, this.f$2, (Composer) obj, updateChangedFlags5, this.f$11);
                break;
            case 5:
                ((Integer) obj2).getClass();
                int updateChangedFlags6 = Updater.updateChangedFlags(i2 | 1);
                SuggestionUiKt.SuggestionsVerticalStack((FocusOwnerImpl) obj3, (List) obj8, (SuggestionRowStyle) obj7, this.f$2, (KeyboardState) obj6, (Function1) obj5, (Function1) obj4, (Composer) obj, updateChangedFlags6, this.f$11);
                break;
            case 6:
                ((Integer) obj2).getClass();
                int updateChangedFlags7 = Updater.updateChangedFlags(i2 | 1);
                TransactorKt.LoadableContent(this.f$0, this.f$2, (Modifier) obj8, (LoadingIndicatorPosition) obj7, (Function1) obj6, (Function3) obj5, (ComposableLambdaImpl) obj4, (Composer) obj, updateChangedFlags7, this.f$11);
                break;
            case 7:
                ((Integer) obj2).getClass();
                int updateChangedFlags8 = Updater.updateChangedFlags(i2 | 1);
                KeypadKt.AlertDialogContent((Modifier) obj8, (Function2) obj3, (String) obj7, (String) obj6, (AlertDialogButton) obj5, (AlertDialogButton) obj4, this.f$2, (Composer) obj, updateChangedFlags8, this.f$11);
                break;
            case 8:
                ((Integer) obj2).getClass();
                int updateChangedFlags9 = Updater.updateChangedFlags(this.f$11 | 1);
                KeypadKt.TextFieldDecorationBox((String) obj3, (TextStyle) obj8, (String) obj7, this.f$2, this.f$10, (Function2) obj6, (Function3) obj5, (Function2) obj4, (Composer) obj, updateChangedFlags9);
                break;
            case 9:
                ((Integer) obj2).getClass();
                int updateChangedFlags10 = Updater.updateChangedFlags(i2 | 1);
                SingleUsePaymentAddCardSheetKt.SingleUsePaymentHalfSheetContent((String) obj8, (String) obj7, (String) obj6, (ButtonProminence) obj5, this.f$2, (CartTotalDiscrepancy) obj4, (Function0) obj3, (Composer) obj, updateChangedFlags10, this.f$11);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags11 = Updater.updateChangedFlags(i2 | 1);
                DisclaimerTextKt.ItemPickerContent((String) obj8, (String) obj7, (List) obj6, (Function1) obj5, (Function0) obj3, (Function1) obj4, this.f$2, (Composer) obj, updateChangedFlags11, this.f$11);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ ButtonKt$$ExternalSyntheticLambda4(Modifier modifier, Function2 function2, String str, String str2, AlertDialogButton alertDialogButton, AlertDialogButton alertDialogButton2, boolean z, int i, int i2) {
        this.f$1 = modifier;
        this.f$0 = function2;
        this.f$3 = str;
        this.f$4 = str2;
        this.f$7 = alertDialogButton;
        this.f$9 = alertDialogButton2;
        this.f$2 = z;
        this.f$10 = i;
        this.f$11 = i2;
    }

    public /* synthetic */ ButtonKt$$ExternalSyntheticLambda4(FocusOwnerImpl focusOwnerImpl, List list, SuggestionRowStyle suggestionRowStyle, boolean z, KeyboardState keyboardState, Function1 function1, Function1 function12, int i, int i2) {
        this.f$0 = focusOwnerImpl;
        this.f$1 = list;
        this.f$3 = suggestionRowStyle;
        this.f$2 = z;
        this.f$4 = keyboardState;
        this.f$7 = function1;
        this.f$9 = function12;
        this.f$10 = i;
        this.f$11 = i2;
    }

    public /* synthetic */ ButtonKt$$ExternalSyntheticLambda4(BitcoinTransferViewModel.Content.FullScreenContent fullScreenContent, AmountDisplayState amountDisplayState, Shaker shaker, Function1 function1, Modifier modifier, Function3 function3, boolean z, int i, int i2) {
        this.f$0 = fullScreenContent;
        this.f$3 = amountDisplayState;
        this.f$4 = shaker;
        this.f$7 = function1;
        this.f$1 = modifier;
        this.f$9 = function3;
        this.f$2 = z;
        this.f$10 = i;
        this.f$11 = i2;
    }

    public /* synthetic */ ButtonKt$$ExternalSyntheticLambda4(InstalledAppletTileHeaderModel installedAppletTileHeaderModel, List list, Function0 function0, boolean z, Function2 function2, InstalledServiceAppletTileLayoutConfig installedServiceAppletTileLayoutConfig, Function2 function22, int i, int i2) {
        this.f$1 = installedAppletTileHeaderModel;
        this.f$3 = list;
        this.f$0 = function0;
        this.f$2 = z;
        this.f$4 = function2;
        this.f$7 = installedServiceAppletTileLayoutConfig;
        this.f$9 = function22;
        this.f$10 = i;
        this.f$11 = i2;
    }

    public /* synthetic */ ButtonKt$$ExternalSyntheticLambda4(MoneyTabModel moneyTabModel, Function1 function1, RealImageLoader realImageLoader, RealScrollPerformanceTrackerFactory realScrollPerformanceTrackerFactory, ElementBoundsRegistry elementBoundsRegistry, Function0 function0, boolean z, int i, int i2) {
        this.f$1 = moneyTabModel;
        this.f$3 = function1;
        this.f$4 = realImageLoader;
        this.f$7 = realScrollPerformanceTrackerFactory;
        this.f$9 = elementBoundsRegistry;
        this.f$0 = function0;
        this.f$2 = z;
        this.f$10 = i;
        this.f$11 = i2;
    }

    public /* synthetic */ ButtonKt$$ExternalSyntheticLambda4(Object obj, boolean z, Modifier modifier, LoadingIndicatorPosition loadingIndicatorPosition, Function1 function1, Function3 function3, ComposableLambdaImpl composableLambdaImpl, int i, int i2) {
        this.f$0 = obj;
        this.f$2 = z;
        this.f$1 = modifier;
        this.f$3 = loadingIndicatorPosition;
        this.f$4 = function1;
        this.f$7 = function3;
        this.f$9 = composableLambdaImpl;
        this.f$10 = i;
        this.f$11 = i2;
    }

    public /* synthetic */ ButtonKt$$ExternalSyntheticLambda4(Modifier modifier, Engine engine, Scene scene, Longs longs, boolean z, Function1 function1, Function1 function12, int i, int i2) {
        this.f$1 = modifier;
        this.f$0 = engine;
        this.f$3 = scene;
        this.f$4 = longs;
        this.f$2 = z;
        this.f$7 = function1;
        this.f$9 = function12;
        this.f$10 = i;
        this.f$11 = i2;
    }

    public /* synthetic */ ButtonKt$$ExternalSyntheticLambda4(String str, String str2, String str3, ButtonProminence buttonProminence, boolean z, CartTotalDiscrepancy cartTotalDiscrepancy, Function0 function0, int i, int i2) {
        this.f$1 = str;
        this.f$3 = str2;
        this.f$4 = str3;
        this.f$7 = buttonProminence;
        this.f$2 = z;
        this.f$9 = cartTotalDiscrepancy;
        this.f$0 = function0;
        this.f$10 = i;
        this.f$11 = i2;
    }

    public /* synthetic */ ButtonKt$$ExternalSyntheticLambda4(String str, String str2, List list, Function1 function1, Function0 function0, Function1 function12, boolean z, int i, int i2) {
        this.f$1 = str;
        this.f$3 = str2;
        this.f$4 = list;
        this.f$7 = function1;
        this.f$0 = function0;
        this.f$9 = function12;
        this.f$2 = z;
        this.f$10 = i;
        this.f$11 = i2;
    }

    public /* synthetic */ ButtonKt$$ExternalSyntheticLambda4(Function0 function0, Modifier modifier, boolean z, Shape shape, ButtonColors buttonColors, PaddingValues paddingValues, ComposableLambdaImpl composableLambdaImpl, int i, int i2) {
        this.f$0 = function0;
        this.f$1 = modifier;
        this.f$2 = z;
        this.f$3 = shape;
        this.f$4 = buttonColors;
        this.f$7 = paddingValues;
        this.f$9 = composableLambdaImpl;
        this.f$10 = i;
        this.f$11 = i2;
    }
}
