package coil3.compose;

import androidx.compose.foundation.ScrollState;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Alignment;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.focus.FocusRequester;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.text.AnnotatedString;
import androidx.core.app.NotificationManagerCompat;
import androidx.media3.exoplayer.ExoPlayer;
import androidx.media3.ui.compose.PlayerSurfaceKt;
import androidx.room.TransactorKt;
import app.cash.local.viewmodels.marketingmessages.MarketingMessageBadge;
import app.cash.local.views.internal.LocalMapKt;
import app.cash.local.views.marketingmessages.MarketingMessageImageStyle;
import app.cash.local.views.marketingmessages.MarketingMessageKt;
import coil3.RealImageLoader;
import coil3.compose.internal.AsyncImageState;
import com.squareup.cash.activity.viewmodels.ActivityEmbeddedViewModel;
import com.squareup.cash.activity.views.AvatarsKt;
import com.squareup.cash.activity.views.compact.CompactCellActivityKt;
import com.squareup.cash.appmessages.CardAppMessageViewModel;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.Badge;
import com.squareup.cash.arcade.components.CopyCodeKt;
import com.squareup.cash.arcade.components.CopyCodeState;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.ScreenScaffoldKt;
import com.squareup.cash.arcade.components.cell.CellDefaultKt;
import com.squareup.cash.arcade.components.list.ListUnorderedScope;
import com.squareup.cash.arcade.components.titlebar.TitleBarActionScope;
import com.squareup.cash.charting.components.BarChartKt;
import com.squareup.cash.charting.components.EarningsBarChartConfig;
import com.squareup.cash.investing.components.custom.order.CustomOrderKt;
import com.squareup.cash.investing.components.custom.order.DragWidgetState;
import com.squareup.cash.invitations.InviteErrorDialogKt;
import com.squareup.cash.marketing.components.CardUpsellIllustration;
import com.squareup.cash.marketing.components.CardUpsellKt;
import com.squareup.cash.marketing.components.MarketingCompactCardKt;
import com.squareup.cash.offers.views.home.OfferTileKt;
import com.squareup.cash.transfers.views.AddMoneyViewKt;
import com.squareup.cash.ui.widget.amount.AmountDisplayState;
import com.squareup.cash.ui.widget.keypad.KeypadAmount;
import com.squareup.cash.wallet.viewmodels.CardSchemeViewModel;
import com.squareup.cash.wallet.views.HeroPaymentDevicesRenderingMode;
import com.squareup.cash.wallet.views.UtilsKt;
import com.squareup.protos.cash.local.client.v1.LocalColor;
import com.squareup.protos.cash.local.client.v1.LocalImage;
import com.squareup.protos.cash.ui.Image;
import java.util.List;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes3.dex */
public final /* synthetic */ class SubcomposeAsyncImageKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$11;
    public final /* synthetic */ int f$12;
    public final /* synthetic */ int f$13;
    public final /* synthetic */ Modifier f$2;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ Object f$6;

    public /* synthetic */ SubcomposeAsyncImageKt$$ExternalSyntheticLambda1(ComposableLambdaImpl composableLambdaImpl, ComposableLambdaImpl composableLambdaImpl2, Function0 function0, Modifier modifier, Function2 function2, CardUpsellIllustration cardUpsellIllustration, int i, int i2) {
        this.$r8$classId = 20;
        this.f$11 = composableLambdaImpl;
        this.f$0 = composableLambdaImpl2;
        this.f$1 = function0;
        this.f$2 = modifier;
        this.f$5 = function2;
        this.f$6 = cardUpsellIllustration;
        this.f$12 = i;
        this.f$13 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$12;
        Object obj3 = this.f$11;
        Object obj4 = this.f$6;
        Object obj5 = this.f$5;
        Object obj6 = this.f$1;
        Object obj7 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                int updateChangedFlags2 = Updater.updateChangedFlags(this.f$13);
                AsyncImageKt.m1444SubcomposeAsyncImagegl8XCv8((AsyncImageState) obj7, (String) obj6, this.f$2, (Alignment) obj5, (ContentScale) obj4, (ComposableLambdaImpl) obj3, (Composer) obj, updateChangedFlags, updateChangedFlags2);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int updateChangedFlags3 = Updater.updateChangedFlags(i2 | 1);
                PlayerSurfaceKt.PlayerSurfaceInternal((ExoPlayer) obj7, this.f$2, (Function1) obj6, (Function2) obj5, (Function2) obj4, (Function1) obj3, (Composer) obj, updateChangedFlags3, this.f$13);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int updateChangedFlags4 = Updater.updateChangedFlags(i2 | 1);
                LocalMapKt.InfoEntry(this.f$2, (String) obj6, (String) obj7, (Function2) obj5, (Function2) obj4, (Function0) obj3, (Composer) obj, updateChangedFlags4, this.f$13);
                break;
            case 3:
                ((Integer) obj2).getClass();
                int updateChangedFlags5 = Updater.updateChangedFlags(i2 | 1);
                LocalMapKt.InfoEntry(this.f$2, (AnnotatedString) obj7, (AnnotatedString) obj6, (Function2) obj5, (Function2) obj4, (Function0) obj3, (Composer) obj, updateChangedFlags5, this.f$13);
                break;
            case 4:
                ((Integer) obj2).getClass();
                int updateChangedFlags6 = Updater.updateChangedFlags(i2 | 1);
                MarketingMessageKt.MarketingMessageImage(this.f$2, (LocalColor) obj7, (LocalImage) obj5, (String) obj6, (MarketingMessageBadge) obj4, (MarketingMessageImageStyle) obj3, (Composer) obj, updateChangedFlags6, this.f$13);
                break;
            case 5:
                ((Integer) obj2).getClass();
                int updateChangedFlags7 = Updater.updateChangedFlags(i2 | 1);
                AvatarsKt.ActivityEmbeddedView((ActivityEmbeddedViewModel) obj7, (Function1) obj6, this.f$2, (Function3) obj5, (Function2) obj4, (Modifier) obj3, (Composer) obj, updateChangedFlags7, this.f$13);
                break;
            case 6:
                ((Integer) obj2).getClass();
                int updateChangedFlags8 = Updater.updateChangedFlags(i2 | 1);
                CompactCellActivityKt.CompactCellActivity((ComposableLambdaImpl) obj3, this.f$2, (String) obj6, (ComposableLambdaImpl) obj7, (ComposableLambdaImpl) obj5, (Function0) obj4, (Composer) obj, updateChangedFlags8, this.f$13);
                break;
            case 7:
                ((Integer) obj2).getClass();
                int updateChangedFlags9 = Updater.updateChangedFlags(i2 | 1);
                CopyCodeKt.CopyCode((String) obj6, (String) obj7, (String) obj5, this.f$2, (CopyCodeState) obj4, (Function1) obj3, (Composer) obj, updateChangedFlags9, this.f$13);
                break;
            case 8:
                ((Integer) obj2).getClass();
                int updateChangedFlags10 = Updater.updateChangedFlags(i2 | 1);
                ModalKt.InlineMessage(this.f$2, (ComposableLambdaImpl) obj3, (ComposableLambdaImpl) obj7, (ComposableLambdaImpl) obj6, (Function3) obj5, (Function3) obj4, (Composer) obj, updateChangedFlags10, this.f$13);
                break;
            case 9:
                ((Integer) obj2).getClass();
                int updateChangedFlags11 = Updater.updateChangedFlags(i2 | 1);
                ModalKt.Modal(this.f$2, (Function3) obj7, (Function3) obj6, (Function3) obj5, (Function3) obj4, (Function3) obj3, (Composer) obj, updateChangedFlags11, this.f$13);
                break;
            case 10:
                ((Integer) obj2).getClass();
                int updateChangedFlags12 = Updater.updateChangedFlags(i2 | 1);
                ScreenScaffoldKt.ScreenScaffoldLazy(this.f$2, (LazyListState) obj7, (PaddingValues) obj6, (ComposableLambdaImpl) obj3, (Function2) obj5, (Function1) obj4, (Composer) obj, updateChangedFlags12, this.f$13);
                break;
            case 11:
                ((Integer) obj2).getClass();
                int updateChangedFlags13 = Updater.updateChangedFlags(i2 | 1);
                ScreenScaffoldKt.ScreenScaffoldColumn(this.f$2, (ScrollState) obj7, (PaddingValues) obj6, (ComposableLambdaImpl) obj3, (Function2) obj5, (ComposableLambdaImpl) obj4, (Composer) obj, updateChangedFlags13, this.f$13);
                break;
            case 12:
                ((Integer) obj2).getClass();
                int updateChangedFlags14 = Updater.updateChangedFlags(i2 | 1);
                CellDefaultKt.CellSearchResult((Function2) obj7, (String) obj6, this.f$2, (Function0) obj5, (String) obj4, (Function1) obj3, (Composer) obj, updateChangedFlags14, this.f$13);
                break;
            case 13:
                ((Integer) obj2).getClass();
                int updateChangedFlags15 = Updater.updateChangedFlags(i2 | 1);
                CellDefaultKt.CellSearchResult((Function2) obj7, (ComposableLambdaImpl) obj3, this.f$2, (Function0) obj6, (Function2) obj5, (Function1) obj4, (Composer) obj, updateChangedFlags15, this.f$13);
                break;
            case 14:
                ((Integer) obj2).getClass();
                int updateChangedFlags16 = Updater.updateChangedFlags(i2 | 1);
                ((ListUnorderedScope) obj7).ListUnorderedItem((ComposableLambdaImpl) obj3, this.f$2, (Function2) obj6, (Function2) obj5, (Function2) obj4, (Composer) obj, updateChangedFlags16, this.f$13);
                break;
            case 15:
                ((Integer) obj2).getClass();
                int updateChangedFlags17 = Updater.updateChangedFlags(i2 | 1);
                ((ListUnorderedScope) obj7).ListUnorderedItem((AnnotatedString) obj6, this.f$2, (Icons) obj5, (AnnotatedString) obj4, (AnnotatedString) obj3, (Composer) obj, updateChangedFlags17, this.f$13);
                break;
            case 16:
                ((Integer) obj2).getClass();
                int updateChangedFlags18 = Updater.updateChangedFlags(i2 | 1);
                TransactorKt.IconAction((TitleBarActionScope) obj7, (Painter) obj5, (String) obj6, (Function0) obj4, this.f$2, (Badge) obj3, (Composer) obj, updateChangedFlags18, this.f$13);
                break;
            case 17:
                ((Integer) obj2).getClass();
                int updateChangedFlags19 = Updater.updateChangedFlags(i2 | 1);
                BarChartKt.EarningsBarChart((List) obj7, (String) obj6, this.f$2, (EarningsBarChartConfig) obj5, (Function1) obj4, (Function0) obj3, (Composer) obj, updateChangedFlags19, this.f$13);
                break;
            case 18:
                ((Integer) obj2).getClass();
                int updateChangedFlags20 = Updater.updateChangedFlags(i2 | 1);
                CustomOrderKt.CustomOrderDragWidget((DragWidgetState) obj7, (Function0) obj6, (Function0) obj5, (Function0) obj4, this.f$2, (Function0) obj3, (Composer) obj, updateChangedFlags20, this.f$13);
                break;
            case 19:
                ((Integer) obj2).getClass();
                int updateChangedFlags21 = Updater.updateChangedFlags(i2 | 1);
                InviteErrorDialogKt.InviteConsentDialog(this.f$2, (Function0) obj7, (Function0) obj5, (String) obj6, (String) obj4, (String) obj3, (Composer) obj, updateChangedFlags21, this.f$13);
                break;
            case 20:
                ((Integer) obj2).getClass();
                int updateChangedFlags22 = Updater.updateChangedFlags(i2 | 1);
                CardUpsellKt.CardUpsellSmall((ComposableLambdaImpl) obj3, (ComposableLambdaImpl) obj7, (Function0) obj6, this.f$2, (Function2) obj5, (CardUpsellIllustration) obj4, (Composer) obj, updateChangedFlags22, this.f$13);
                break;
            case 21:
                ((Integer) obj2).getClass();
                int updateChangedFlags23 = Updater.updateChangedFlags(i2 | 1);
                MarketingCompactCardKt.m3599MarketingCompactCard_trzpw(this.f$2, (CardAppMessageViewModel.Ready) obj7, (Function1) obj6, (Color) obj5, (ContentScale) obj4, (Function1) obj3, (Composer) obj, updateChangedFlags23, this.f$13);
                break;
            case 22:
                ((Integer) obj2).getClass();
                int updateChangedFlags24 = Updater.updateChangedFlags(i2 | 1);
                OfferTileKt.m3680CircularIconButtonjM_yU8I((Icons) obj7, (String) obj6, (Function0) obj4, this.f$2, (Color) obj3, (Alignment) obj5, (Composer) obj, updateChangedFlags24, this.f$13);
                break;
            case 23:
                ((Integer) obj2).getClass();
                int updateChangedFlags25 = Updater.updateChangedFlags(i2 | 1);
                NotificationManagerCompat.Api28Impl.CompactPromotionCard(this.f$2, (String) obj6, (String) obj7, (String) obj5, (Image) obj4, (Function0) obj3, (Composer) obj, updateChangedFlags25, this.f$13);
                break;
            case 24:
                ((Integer) obj2).getClass();
                int updateChangedFlags26 = Updater.updateChangedFlags(i2 | 1);
                AddMoneyViewKt.TransfersAmountView((AmountDisplayState) obj7, (KeypadAmount) obj6, this.f$2, (Function0) obj5, (Function0) obj4, (FocusRequester) obj3, (Composer) obj, updateChangedFlags26, this.f$13);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags27 = Updater.updateChangedFlags(i2 | 1);
                UtilsKt.Module((CardSchemeViewModel.Module) obj7, (Function1) obj6, (RealImageLoader) obj5, this.f$2, (Function1) obj4, (HeroPaymentDevicesRenderingMode) obj3, (Composer) obj, updateChangedFlags27, this.f$13);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ SubcomposeAsyncImageKt$$ExternalSyntheticLambda1(ComposableLambdaImpl composableLambdaImpl, Modifier modifier, String str, ComposableLambdaImpl composableLambdaImpl2, ComposableLambdaImpl composableLambdaImpl3, Function0 function0, int i, int i2) {
        this.$r8$classId = 6;
        this.f$11 = composableLambdaImpl;
        this.f$2 = modifier;
        this.f$1 = str;
        this.f$0 = composableLambdaImpl2;
        this.f$5 = composableLambdaImpl3;
        this.f$6 = function0;
        this.f$12 = i;
        this.f$13 = i2;
    }

    public /* synthetic */ SubcomposeAsyncImageKt$$ExternalSyntheticLambda1(Modifier modifier, ScrollableState scrollableState, PaddingValues paddingValues, ComposableLambdaImpl composableLambdaImpl, Function2 function2, Function function, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$2 = modifier;
        this.f$0 = scrollableState;
        this.f$1 = paddingValues;
        this.f$11 = composableLambdaImpl;
        this.f$5 = function2;
        this.f$6 = function;
        this.f$12 = i;
        this.f$13 = i2;
    }

    public /* synthetic */ SubcomposeAsyncImageKt$$ExternalSyntheticLambda1(Modifier modifier, ComposableLambdaImpl composableLambdaImpl, ComposableLambdaImpl composableLambdaImpl2, ComposableLambdaImpl composableLambdaImpl3, Function3 function3, Function3 function32, int i, int i2) {
        this.$r8$classId = 8;
        this.f$2 = modifier;
        this.f$11 = composableLambdaImpl;
        this.f$0 = composableLambdaImpl2;
        this.f$1 = composableLambdaImpl3;
        this.f$5 = function3;
        this.f$6 = function32;
        this.f$12 = i;
        this.f$13 = i2;
    }

    public /* synthetic */ SubcomposeAsyncImageKt$$ExternalSyntheticLambda1(Modifier modifier, Object obj, Object obj2, Object obj3, Object obj4, Function function, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$2 = modifier;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$5 = obj3;
        this.f$6 = obj4;
        this.f$11 = function;
        this.f$12 = i;
        this.f$13 = i2;
    }

    public /* synthetic */ SubcomposeAsyncImageKt$$ExternalSyntheticLambda1(Modifier modifier, Object obj, Object obj2, String str, Object obj3, Object obj4, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$2 = modifier;
        this.f$0 = obj;
        this.f$5 = obj2;
        this.f$1 = str;
        this.f$6 = obj3;
        this.f$11 = obj4;
        this.f$12 = i;
        this.f$13 = i2;
    }

    public /* synthetic */ SubcomposeAsyncImageKt$$ExternalSyntheticLambda1(Modifier modifier, String str, String str2, Object obj, Object obj2, Function0 function0, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$2 = modifier;
        this.f$1 = str;
        this.f$0 = str2;
        this.f$5 = obj;
        this.f$6 = obj2;
        this.f$11 = function0;
        this.f$12 = i;
        this.f$13 = i2;
    }

    public /* synthetic */ SubcomposeAsyncImageKt$$ExternalSyntheticLambda1(ExoPlayer exoPlayer, Modifier modifier, Function1 function1, Function2 function2, Function2 function22, Function1 function12, int i, int i2) {
        this.$r8$classId = 1;
        this.f$0 = exoPlayer;
        this.f$2 = modifier;
        this.f$1 = function1;
        this.f$5 = function2;
        this.f$6 = function22;
        this.f$11 = function12;
        this.f$12 = i;
        this.f$13 = i2;
    }

    public /* synthetic */ SubcomposeAsyncImageKt$$ExternalSyntheticLambda1(Icons icons, String str, Function0 function0, Modifier modifier, Color color, Alignment alignment, int i, int i2) {
        this.$r8$classId = 22;
        this.f$0 = icons;
        this.f$1 = str;
        this.f$6 = function0;
        this.f$2 = modifier;
        this.f$11 = color;
        this.f$5 = alignment;
        this.f$12 = i;
        this.f$13 = i2;
    }

    public /* synthetic */ SubcomposeAsyncImageKt$$ExternalSyntheticLambda1(TitleBarActionScope titleBarActionScope, Painter painter, String str, Function0 function0, Modifier modifier, Badge badge, int i, int i2) {
        this.$r8$classId = 16;
        this.f$0 = titleBarActionScope;
        this.f$5 = painter;
        this.f$1 = str;
        this.f$6 = function0;
        this.f$2 = modifier;
        this.f$11 = badge;
        this.f$12 = i;
        this.f$13 = i2;
    }

    public /* synthetic */ SubcomposeAsyncImageKt$$ExternalSyntheticLambda1(DragWidgetState dragWidgetState, Function0 function0, Function0 function02, Function0 function03, Modifier modifier, Function0 function04, int i, int i2) {
        this.$r8$classId = 18;
        this.f$0 = dragWidgetState;
        this.f$1 = function0;
        this.f$5 = function02;
        this.f$6 = function03;
        this.f$2 = modifier;
        this.f$11 = function04;
        this.f$12 = i;
        this.f$13 = i2;
    }

    public /* synthetic */ SubcomposeAsyncImageKt$$ExternalSyntheticLambda1(CardSchemeViewModel.Module module, Function1 function1, RealImageLoader realImageLoader, Modifier modifier, Function1 function12, HeroPaymentDevicesRenderingMode heroPaymentDevicesRenderingMode, int i, int i2) {
        this.$r8$classId = 25;
        this.f$0 = module;
        this.f$1 = function1;
        this.f$5 = realImageLoader;
        this.f$2 = modifier;
        this.f$6 = function12;
        this.f$11 = heroPaymentDevicesRenderingMode;
        this.f$12 = i;
        this.f$13 = i2;
    }

    public /* synthetic */ SubcomposeAsyncImageKt$$ExternalSyntheticLambda1(Object obj, ComposableLambdaImpl composableLambdaImpl, Modifier modifier, Function function, Function2 function2, Function function3, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = obj;
        this.f$11 = composableLambdaImpl;
        this.f$2 = modifier;
        this.f$1 = function;
        this.f$5 = function2;
        this.f$6 = function3;
        this.f$12 = i;
        this.f$13 = i2;
    }

    public /* synthetic */ SubcomposeAsyncImageKt$$ExternalSyntheticLambda1(Object obj, Object obj2, Modifier modifier, Object obj3, Object obj4, Object obj5, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = modifier;
        this.f$5 = obj3;
        this.f$6 = obj4;
        this.f$11 = obj5;
        this.f$12 = i;
        this.f$13 = i2;
    }

    public /* synthetic */ SubcomposeAsyncImageKt$$ExternalSyntheticLambda1(String str, String str2, String str3, Modifier modifier, CopyCodeState copyCodeState, Function1 function1, int i, int i2) {
        this.$r8$classId = 7;
        this.f$1 = str;
        this.f$0 = str2;
        this.f$5 = str3;
        this.f$2 = modifier;
        this.f$6 = copyCodeState;
        this.f$11 = function1;
        this.f$12 = i;
        this.f$13 = i2;
    }
}
