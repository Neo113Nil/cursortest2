package com.squareup.cash.arcade.util;

import androidx.camera.viewfinder.core.ViewfinderDefaults;
import androidx.compose.foundation.gestures.ScrollableState;
import androidx.compose.foundation.layout.Arrangement$Horizontal;
import androidx.compose.foundation.layout.Arrangement$Vertical;
import androidx.compose.foundation.layout.FlowRowOverflow;
import androidx.compose.foundation.layout.OffsetKt;
import androidx.compose.foundation.layout.PaddingValues;
import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.collection.ExtensionsKt;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Shape;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.text.TextStyle;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import app.cash.local.viewmodels.CartItemCounterViewModel;
import app.cash.local.views.brand.menu.LocalCaloriesTextKt;
import app.cash.local.views.cart.CartBannerStyle;
import app.cash.local.views.cart.CartBannerViewKt;
import app.cash.local.views.internal.CartItemCounterStyle;
import app.cash.local.views.internal.LocalMapKt;
import coil3.RealImageLoader;
import com.google.mlkit.common.internal.zzd;
import com.squareup.cash.afterpayapplet.viewmodels.TappableIcon;
import com.squareup.cash.afterpayapplet.views.AfterpaySearchViewKt;
import com.squareup.cash.amountslider.TickersAmountCaptionKt;
import com.squareup.cash.amountslider.viewmodels.AmountPickerViewModel;
import com.squareup.cash.appmessages.views.sheet.SheetAppMessageView;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.ScreenScaffoldKt;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.benefits.components.viewmodels.GreenStatus;
import com.squareup.cash.benefits.components.views.Style;
import com.squareup.cash.blockers.views.StatusResultViewKt;
import com.squareup.cash.collapsingtoolbar.views.CollapsingToolbarScopeInstance;
import com.squareup.cash.common.viewmodels.AvatarBadgeViewModel;
import com.squareup.cash.directdeposit.views.directdeposit.DirectDepositFormErrorKt;
import com.squareup.cash.instruments.viewmodels.InstrumentCellViewModel;
import com.squareup.cash.instruments.views.InstrumentCellAlignment;
import com.squareup.cash.instruments.views.InstrumentCellKt;
import com.squareup.cash.qrcodes.viewmodels.QrAddressScannerViewModel;
import com.squareup.cash.qrcodes.views.CameraXPreviewKt;
import com.squareup.cash.support.backend.api.SupportActivityItemLoader;
import com.squareup.cash.support.viewmodels.ArticleViewModel;
import com.squareup.cash.support.views.article.ArticleViewKt;
import com.squareup.cash.ui.util.RealCashVibrator;
import com.squareup.cash.ui.widget.StackedAvatarViewModel;
import com.squareup.cash.ui.widget.amount.AmountConfig;
import com.squareup.cash.webview.android.WebViewProvider;
import com.squareup.util.compose.TransitionsKt;
import com.squareup.util.coroutines.TakeUntilKt;
import com.stripe.android.financialconnections.features.common.IconSize;
import com.stripe.android.financialconnections.features.common.ListItemKt;
import java.util.List;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;

/* loaded from: classes5.dex */
public final /* synthetic */ class AvatarsKt$$ExternalSyntheticLambda3 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Object f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ int f$5;
    public final /* synthetic */ int f$6;

    public /* synthetic */ AvatarsKt$$ExternalSyntheticLambda3(Modifier modifier, String str, String str2, Function0 function0, CartBannerStyle cartBannerStyle, int i, int i2) {
        this.$r8$classId = 3;
        zzd zzdVar = Icons.Companion;
        this.f$2 = modifier;
        this.f$0 = str;
        this.f$1 = str2;
        this.f$3 = function0;
        this.f$4 = cartBannerStyle;
        this.f$5 = i;
        this.f$6 = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$6;
        int i3 = this.f$5;
        Object obj3 = this.f$4;
        Object obj4 = this.f$3;
        Object obj5 = this.f$1;
        Object obj6 = this.f$2;
        Object obj7 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                AvatarsKt.Avatar((AvatarSize) obj7, (StackedAvatarViewModel.Single) obj5, (Modifier) obj6, (AvatarBadgeViewModel) obj4, (Function3) obj3, (Composer) obj, Updater.updateChangedFlags(i3 | 1), this.f$6);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(i2 | 1);
                OffsetKt.FlowRow((Modifier) obj6, (Arrangement$Horizontal) obj7, (Arrangement$Vertical) obj5, this.f$5, (FlowRowOverflow) obj4, (ComposableLambdaImpl) obj3, (Composer) obj, updateChangedFlags);
                break;
            case 2:
                ((Integer) obj2).intValue();
                int updateChangedFlags2 = Updater.updateChangedFlags(i2 | 1);
                LocalCaloriesTextKt.CategoryChipsHeader((CollapsingToolbarScopeInstance) obj7, (Function0) obj5, this.f$5, (LazyListState) obj6, (List) obj4, (Function1) obj3, (Composer) obj, updateChangedFlags2);
                break;
            case 3:
                zzd zzdVar = Icons.Companion;
                ((Integer) obj2).getClass();
                CartBannerViewKt.CartBannerView((Modifier) obj6, (String) obj7, (String) obj5, (Function0) obj4, (CartBannerStyle) obj3, (Composer) obj, Updater.updateChangedFlags(i3 | 1), this.f$6);
                break;
            case 4:
                ((Integer) obj2).getClass();
                LocalMapKt.CartItemCounterView((Modifier) obj6, (CartItemCounterViewModel) obj7, (Function1) obj5, (CartItemCounterStyle) obj4, (CartItemCounterStyle) obj3, (Composer) obj, Updater.updateChangedFlags(i3 | 1), this.f$6);
                break;
            case 5:
                ((Integer) obj2).getClass();
                com.squareup.cash.activity.views.AvatarsKt.ActivityEmbeddedView((UiCallbackModel) obj7, (Modifier) obj6, (Function3) obj3, (Function2) obj5, (Modifier) obj4, (Composer) obj, Updater.updateChangedFlags(i3 | 1), this.f$6);
                break;
            case 6:
                ((Integer) obj2).getClass();
                com.squareup.cash.activity.views.AvatarsKt.ActivityAvatar((Modifier) obj6, (StackedAvatarViewModel) obj5, (AvatarBadgeViewModel) obj4, (AvatarSize) obj7, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(i3 | 1), this.f$6);
                break;
            case 7:
                ((Integer) obj2).getClass();
                AfterpaySearchViewKt.AppletTitleBar((Modifier) obj6, (String) obj7, (TappableIcon) obj5, (Function0) obj4, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(i3 | 1), this.f$6);
                break;
            case 8:
                ((Integer) obj2).getClass();
                TickersAmountCaptionKt.FullscreenAmountPicker((AmountPickerViewModel) obj7, (AmountConfig) obj5, (Function1) obj4, (Modifier) obj6, (Function3) obj3, (Composer) obj, Updater.updateChangedFlags(i3 | 1), this.f$6);
                break;
            case 9:
                ((Integer) obj2).getClass();
                ((SheetAppMessageView) obj7).NavigationIcon((Modifier) obj6, (Icons) obj5, (String) obj4, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(i3 | 1), this.f$6);
                break;
            case 10:
                ((Integer) obj2).getClass();
                ScreenScaffoldKt.ScreenScaffoldGeneric((Modifier) obj6, (ScrollableState) obj7, (ComposableLambdaImpl) obj5, (Function2) obj4, (ComposableLambdaImpl) obj3, (Composer) obj, Updater.updateChangedFlags(i3 | 1), this.f$6);
                break;
            case 11:
                ((Integer) obj2).getClass();
                ViewfinderDefaults.SectionHeader((String) obj7, (Modifier) obj6, (String) obj5, (Function0) obj4, (String) obj3, (Composer) obj, Updater.updateChangedFlags(i3 | 1), this.f$6);
                break;
            case 12:
                ((Integer) obj2).getClass();
                ViewfinderDefaults.SectionHeader((ComposableLambdaImpl) obj7, (Modifier) obj6, (Function2) obj5, (Function0) obj4, (Function2) obj3, (Composer) obj, Updater.updateChangedFlags(i3 | 1), this.f$6);
                break;
            case 13:
                ((Integer) obj2).getClass();
                ExtensionsKt.CashGreenRectangleRow((GreenStatus) obj7, (Modifier) obj6, (Arrangement$Horizontal) obj5, (Style) obj4, (Function3) obj3, (Composer) obj, Updater.updateChangedFlags(i3 | 1), this.f$6);
                break;
            case 14:
                ((Integer) obj2).getClass();
                StatusResultViewKt.CallToAction((String) obj7, (String) obj5, (String) obj6, (Function0) obj4, (Function2) obj3, (Composer) obj, Updater.updateChangedFlags(i3 | 1), this.f$6);
                break;
            case 15:
                ((Integer) obj2).getClass();
                TransitionsKt.NullStateWidgetView((Painter) obj7, (String) obj5, (Modifier) obj6, (Modifier) obj4, (String) obj3, (Composer) obj, Updater.updateChangedFlags(i3 | 1), this.f$6);
                break;
            case 16:
                ((Integer) obj2).getClass();
                TakeUntilKt.WidgetSectionView((String) obj7, (Modifier) obj6, (String) obj5, (Function0) obj4, (ComposableLambdaImpl) obj3, (Composer) obj, Updater.updateChangedFlags(i3 | 1), this.f$6);
                break;
            case 17:
                ((Integer) obj2).getClass();
                DirectDepositFormErrorKt.ScrollableContentScaffold((ComposableLambdaImpl) obj7, (ComposableLambdaImpl) obj5, (ComposableLambdaImpl) obj4, (Modifier) obj6, (Function3) obj3, (Composer) obj, Updater.updateChangedFlags(i3 | 1), this.f$6);
                break;
            case 18:
                ((Integer) obj2).getClass();
                InstrumentCellKt.InstrumentCellSmall((Modifier) obj6, (InstrumentCellViewModel) obj7, (InstrumentCellAlignment) obj5, (TextStyle) obj4, (Function0) obj3, (Composer) obj, Updater.updateChangedFlags(i3 | 1), this.f$6);
                break;
            case 19:
                ((Integer) obj2).getClass();
                CameraXPreviewKt.QrAddressScannerView((QrAddressScannerViewModel) obj7, (Function1) obj5, (RealCashVibrator) obj4, (Modifier) obj6, (PaddingValues) obj3, (Composer) obj, Updater.updateChangedFlags(i3 | 1), this.f$6);
                break;
            case 20:
                ((Integer) obj2).getClass();
                ArticleViewKt.Article((ArticleViewModel) obj7, (RealImageLoader) obj5, (Function1) obj6, (WebViewProvider) obj4, (SupportActivityItemLoader) obj3, (Composer) obj, Updater.updateChangedFlags(i3 | 1), this.f$6);
                break;
            case 21:
                ((Integer) obj2).getClass();
                ListItemKt.ErrorContent((ComposableLambdaImpl) obj7, (String) obj5, (String) obj6, (Pair) obj4, (Pair) obj3, (Composer) obj, Updater.updateChangedFlags(i3 | 1), this.f$6);
                break;
            default:
                ((Integer) obj2).getClass();
                ListItemKt.ShapedIcon((Painter) obj7, (Modifier) obj6, (IconSize) obj5, (Shape) obj4, (String) obj3, (Composer) obj, Updater.updateChangedFlags(i3 | 1), this.f$6);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ AvatarsKt$$ExternalSyntheticLambda3(Modifier modifier, StackedAvatarViewModel stackedAvatarViewModel, AvatarBadgeViewModel avatarBadgeViewModel, AvatarSize avatarSize, Function0 function0, int i, int i2) {
        this.$r8$classId = 6;
        this.f$2 = modifier;
        this.f$1 = stackedAvatarViewModel;
        this.f$3 = avatarBadgeViewModel;
        this.f$0 = avatarSize;
        this.f$4 = function0;
        this.f$5 = i;
        this.f$6 = i2;
    }

    public /* synthetic */ AvatarsKt$$ExternalSyntheticLambda3(Modifier modifier, Object obj, Object obj2, Object obj3, Object obj4, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$2 = modifier;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$3 = obj3;
        this.f$4 = obj4;
        this.f$5 = i;
        this.f$6 = i2;
    }

    public /* synthetic */ AvatarsKt$$ExternalSyntheticLambda3(Modifier modifier, Arrangement$Horizontal arrangement$Horizontal, Arrangement$Vertical arrangement$Vertical, int i, FlowRowOverflow flowRowOverflow, ComposableLambdaImpl composableLambdaImpl, int i2) {
        this.$r8$classId = 1;
        this.f$2 = modifier;
        this.f$0 = arrangement$Horizontal;
        this.f$1 = arrangement$Vertical;
        this.f$5 = i;
        this.f$3 = flowRowOverflow;
        this.f$4 = composableLambdaImpl;
        this.f$6 = i2;
    }

    public /* synthetic */ AvatarsKt$$ExternalSyntheticLambda3(UiCallbackModel uiCallbackModel, Modifier modifier, Function3 function3, Function2 function2, Modifier modifier2, int i, int i2) {
        this.$r8$classId = 5;
        this.f$0 = uiCallbackModel;
        this.f$2 = modifier;
        this.f$4 = function3;
        this.f$1 = function2;
        this.f$3 = modifier2;
        this.f$5 = i;
        this.f$6 = i2;
    }

    public /* synthetic */ AvatarsKt$$ExternalSyntheticLambda3(CollapsingToolbarScopeInstance collapsingToolbarScopeInstance, Function0 function0, int i, LazyListState lazyListState, List list, Function1 function1, int i2) {
        this.$r8$classId = 2;
        this.f$0 = collapsingToolbarScopeInstance;
        this.f$1 = function0;
        this.f$5 = i;
        this.f$2 = lazyListState;
        this.f$3 = list;
        this.f$4 = function1;
        this.f$6 = i2;
    }

    public /* synthetic */ AvatarsKt$$ExternalSyntheticLambda3(Object obj, Modifier modifier, Object obj2, Object obj3, Object obj4, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = obj;
        this.f$2 = modifier;
        this.f$1 = obj2;
        this.f$3 = obj3;
        this.f$4 = obj4;
        this.f$5 = i;
        this.f$6 = i2;
    }

    public /* synthetic */ AvatarsKt$$ExternalSyntheticLambda3(Object obj, Object obj2, Object obj3, Modifier modifier, Object obj4, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$3 = obj3;
        this.f$2 = modifier;
        this.f$4 = obj4;
        this.f$5 = i;
        this.f$6 = i2;
    }

    public /* synthetic */ AvatarsKt$$ExternalSyntheticLambda3(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = obj3;
        this.f$3 = obj4;
        this.f$4 = obj5;
        this.f$5 = i;
        this.f$6 = i2;
    }

    public /* synthetic */ AvatarsKt$$ExternalSyntheticLambda3(String str, String str2, String str3, Function0 function0, Function2 function2, int i, int i2) {
        this.$r8$classId = 14;
        this.f$0 = str;
        this.f$1 = str2;
        this.f$2 = str3;
        this.f$3 = function0;
        this.f$4 = function2;
        this.f$5 = i;
        this.f$6 = i2;
    }
}
