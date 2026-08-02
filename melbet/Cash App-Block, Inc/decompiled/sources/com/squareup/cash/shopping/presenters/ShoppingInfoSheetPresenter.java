package com.squareup.cash.shopping.presenters;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.MutableState;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.emoji2.text.EmojiExclusions;
import app.cash.broadway.presenter.molecule.MoleculePresenter;
import app.cash.directory.data.Protos_interopKt;
import com.datadog.android.rum.model.ErrorEvent;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.cdf.browser.BrowserViewCloseInformationSheet;
import com.squareup.cash.cdf.browser.BrowserViewOpenInformationSheet;
import com.squareup.cash.cdf.browser.InfoContext;
import com.squareup.cash.clientroutes.RealClientRouteParser;
import com.squareup.cash.clientrouting.RealRouter$Factory$Impl;
import com.squareup.cash.common.viewmodels.ColorModel;
import com.squareup.cash.core.navigationcontainer.navigator.BetterNavigator;
import com.squareup.cash.integration.analytics.Analytics;
import com.squareup.cash.launcher.IntentLauncher;
import com.squareup.cash.resource.text.AndroidStringManager;
import com.squareup.cash.sheet.BasicShieetKt$BasicShieet$4$1;
import com.squareup.cash.shopping.backend.api.SheetDetails;
import com.squareup.cash.shopping.backend.real.RealShopHubAnalyticsHelper;
import com.squareup.cash.shopping.backend.real.RealShopHubRepository;
import com.squareup.cash.shopping.screens.ShoppingInfoSheetScreen;
import com.squareup.cash.shopping.screens.ShoppingScreenContext;
import com.squareup.cash.shopping.viewmodels.ActionType;
import com.squareup.cash.shopping.viewmodels.BulletImage;
import com.squareup.cash.shopping.viewmodels.BulletModel;
import com.squareup.cash.shopping.viewmodels.ButtonModel;
import com.squareup.cash.shopping.viewmodels.LogoImage;
import com.squareup.cash.shopping.viewmodels.ShoppingInfoSheetViewModel$BulletedListInfoSheetViewModel;
import com.squareup.cash.tax.presenters.TaxWebAppPresenter$models$1$1;
import com.squareup.protos.cash.cashsuggest.api.Bullet;
import com.squareup.protos.cash.discover.api.app.v1.model.HorizontalAlignment;
import com.squareup.protos.cash.discover.api.app.v1.model.Text;
import com.squareup.protos.cash.discover.api.app.v1.model.TextDecoration;
import com.squareup.protos.cash.discover.api.app.v1.model.TextStyle;
import com.squareup.protos.cash.genericelements.ui.Alignment;
import com.squareup.protos.cash.p2p.profile_directory.ui.Avatar;
import com.squareup.protos.cash.p2p.profile_directory.ui.Button;
import com.squareup.protos.cash.p2p.profile_directory.ui.Button$Content$Icon;
import com.squareup.protos.cash.p2p.profile_directory.ui.Button$Content$Text;
import com.squareup.protos.cash.ui.Color;
import com.squareup.protos.cash.ui.Image;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.ArrayList;
import java.util.List;
import kotlin.NotImplementedError;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.CollectionsKt__IterablesKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.Flow;

/* loaded from: classes7.dex */
public final class ShoppingInfoSheetPresenter implements MoleculePresenter {
    public final ShoppingInfoSheetViewModel$BulletedListInfoSheetViewModel.Loaded afterpayInNetworkInfoFallbackModel;
    public final Analytics analytics;
    public final ShoppingInfoSheetScreen args;
    public final ShoppingInfoSheetViewModel$BulletedListInfoSheetViewModel.Loaded cashAppPayIncentiveSheetViewModel;
    public final IntentLauncher launcher;
    public final BetterNavigator.ScreenNavigator navigator;
    public final RealShopHubRepository shopHubRepository;

    public final class State {
        public final SheetDetails sheetDetails;

        public State(SheetDetails sheetDetails) {
            this.sheetDetails = sheetDetails;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof State) && Intrinsics.areEqual(this.sheetDetails, ((State) obj).sheetDetails);
        }

        public final int hashCode() {
            SheetDetails sheetDetails = this.sheetDetails;
            if (sheetDetails == null) {
                return 0;
            }
            return sheetDetails.hashCode();
        }

        public final String toString() {
            return "State(sheetDetails=" + this.sheetDetails + ")";
        }
    }

    public ShoppingInfoSheetPresenter(ShoppingInfoSheetScreen shoppingInfoSheetScreen, BetterNavigator.ScreenNavigator screenNavigator, Analytics analytics, RealShopHubAnalyticsHelper realShopHubAnalyticsHelper, RealShopHubRepository realShopHubRepository, IntentLauncher intentLauncher, RealClientRouteParser realClientRouteParser, RealRouter$Factory$Impl realRouter$Factory$Impl, AndroidStringManager androidStringManager) {
        shoppingInfoSheetScreen.getClass();
        this.args = shoppingInfoSheetScreen;
        this.navigator = screenNavigator;
        this.analytics = analytics;
        this.shopHubRepository = realShopHubRepository;
        this.launcher = intentLauncher;
        realRouter$Factory$Impl.create$1(screenNavigator);
        String str = androidStringManager.get(R.string.afterpay_in_network_info_sheet_title);
        TextStyle textStyle = TextStyle.HEADER_3;
        Text text = new Text(str, textStyle, (TextDecoration) null, new Color(new Color.ModeVariant("#333333", null, null, null, null, 30, null), new Color.ModeVariant("#FFFFFF", null, null, null, null, 30, null), 4), (Image) null, 52);
        String str2 = androidStringManager.get(R.string.afterpay_in_network_info_sheet_setup_bullet_title);
        TextStyle textStyle2 = TextStyle.MAIN_TITLE;
        Text text2 = new Text(str2, textStyle2, (TextDecoration) null, new Color(new Color.ModeVariant("#333333", null, null, null, null, 30, null), new Color.ModeVariant("#FFFFFF", null, null, null, null, 30, null), 4), (Image) null, 52);
        String str3 = androidStringManager.get(R.string.afterpay_in_network_info_sheet_setup_bullet_body);
        TextStyle textStyle3 = TextStyle.SMALL_BODY;
        List listOf = CollectionsKt__CollectionsKt.listOf((Object[]) new BulletModel[]{new BulletModel(null, text2, new Text(str3, textStyle3, (TextDecoration) null, new Color(new Color.ModeVariant("#999999", null, null, null, null, 30, null), new Color.ModeVariant("#A2A3A3", null, null, null, null, 30, null), 4), (Image) null, 52)), new BulletModel(null, new Text(androidStringManager.get(R.string.afterpay_in_network_info_sheet_checkout_bullet_title), textStyle2, (TextDecoration) null, new Color(new Color.ModeVariant("#333333", null, null, null, null, 30, null), new Color.ModeVariant("#FFFFFF", null, null, null, null, 30, null), 4), (Image) null, 52), new Text(androidStringManager.get(R.string.afterpay_in_network_info_sheet_checkout_bullet_body), textStyle3, (TextDecoration) null, new Color(new Color.ModeVariant("#999999", null, null, null, null, 30, null), new Color.ModeVariant("#A2A3A3", null, null, null, null, 30, null), 4), (Image) null, 52)), new BulletModel(null, new Text(androidStringManager.get(R.string.afterpay_in_network_info_sheet_payment_bullet_title), textStyle2, (TextDecoration) null, new Color(new Color.ModeVariant("#333333", null, null, null, null, 30, null), new Color.ModeVariant("#FFFFFF", null, null, null, null, 30, null), 4), (Image) null, 52), new Text(androidStringManager.get(R.string.afterpay_in_network_info_sheet_payment_bullet_body), textStyle3, (TextDecoration) null, new Color(new Color.ModeVariant("#999999", null, null, null, null, 30, null), new Color.ModeVariant("#A2A3A3", null, null, null, null, 30, null), 4), (Image) null, 52))});
        ActionType actionType = ActionType.DISMISS;
        ButtonModel buttonModel = new ButtonModel(androidStringManager.get(R.string.info_sheet_dismiss_button));
        String str4 = androidStringManager.get(R.string.afterpay_in_network_info_sheet_footer);
        TextStyle textStyle4 = TextStyle.CAPTION;
        Text text3 = null;
        this.afterpayInNetworkInfoFallbackModel = new ShoppingInfoSheetViewModel$BulletedListInfoSheetViewModel.Loaded(text, text3, listOf, buttonModel, new Text(str4, textStyle4, (TextDecoration) null, new Color(new Color.ModeVariant("#0000FF", null, null, null, null, 30, null), new Color.ModeVariant("#FFFFFF", null, null, null, null, 30, null), 4), (Image) null, 52), 74);
        Text text4 = new Text(androidStringManager.get(R.string.shop_incentive_info_sheet_title), textStyle, (TextDecoration) null, new Color(new Color.ModeVariant("#333333", null, null, null, null, 30, null), new Color.ModeVariant("#FFFFFF", null, null, null, null, 30, null), 4), (Image) null, 52);
        Text text5 = new Text(androidStringManager.get(R.string.shop_incentive_info_sheet_subtitle), textStyle4, (TextDecoration) null, new Color(new Color.ModeVariant("#666666", null, null, null, null, 30, null), new Color.ModeVariant("#A2A3A3", null, null, null, null, 30, null), 4), (Image) null, 52);
        BulletImage.LocalImage localImage = new BulletImage.LocalImage(BulletImage.LocalImage.Icon.CASH_LOGO_SQUARE);
        String str5 = androidStringManager.get(R.string.shop_incentive_info_sheet_bullet_one_title);
        TextStyle textStyle5 = TextStyle.SMALL_TITLE;
        BulletModel bulletModel = new BulletModel(localImage, new Text(str5, textStyle5, (TextDecoration) null, new Color(new Color.ModeVariant("#333333", null, null, null, null, 30, null), new Color.ModeVariant("#FFFFFF", null, null, null, null, 30, null), 4), (Image) null, 52), new Text(androidStringManager.get(R.string.shop_incentive_info_sheet_bullet_one_message), textStyle4, (TextDecoration) null, new Color(new Color.ModeVariant("#666666", null, null, null, null, 30, null), new Color.ModeVariant("#A2A3A3", null, null, null, null, 30, null), 4), (Image) null, 52));
        BulletImage.LocalImage localImage2 = new BulletImage.LocalImage(BulletImage.LocalImage.Icon.SHOPPING_TAG);
        Text text6 = new Text(androidStringManager.get(R.string.shop_incentive_info_sheet_bullet_two_title), textStyle5, (TextDecoration) null, new Color(new Color.ModeVariant("#333333", null, null, null, null, 30, null), new Color.ModeVariant("#FFFFFF", null, null, null, null, 30, null), 4), (Image) null, 52);
        TextDecoration textDecoration = null;
        this.cashAppPayIncentiveSheetViewModel = new ShoppingInfoSheetViewModel$BulletedListInfoSheetViewModel.Loaded(text4, text5, CollectionsKt__CollectionsKt.listOf((Object[]) new BulletModel[]{bulletModel, new BulletModel(localImage2, text6, new Text(androidStringManager.get(R.string.shop_incentive_info_sheet_bullet_two_message), textStyle4, textDecoration, new Color(new Color.ModeVariant("#666666", null, null, null, null, 30, null), new Color.ModeVariant("#A2A3A3", null, null, null, null, 30, null), 4), (Image) null, 52)), new BulletModel(new BulletImage.LocalImage(BulletImage.LocalImage.Icon.SECURE_SHIELD), new Text(androidStringManager.get(R.string.shop_incentive_info_sheet_bullet_three_title), textStyle5, textDecoration, new Color(new Color.ModeVariant("#333333", null, null, null, null, 30, null), new Color.ModeVariant("#FFFFFF", null, null, null, null, 30, null), 4), (Image) null, 52), new Text(androidStringManager.get(R.string.shop_incentive_info_sheet_bullet_three_message), textStyle4, (TextDecoration) null, new Color(new Color.ModeVariant("#666666", null, null, null, null, 30, null), new Color.ModeVariant("#A2A3A3", null, null, null, null, 30, null), 4), (Image) null, 52))}), new ButtonModel(androidStringManager.get(R.string.info_sheet_dismiss_button)), null, EnumC0170g.SDK_ASSET_PLAID_PROFILE_CIRCLE_VALUE);
    }

    public static final void access$trackBrowserInfoSheetClose(ShoppingInfoSheetPresenter shoppingInfoSheetPresenter, InfoContext infoContext) {
        Analytics analytics = shoppingInfoSheetPresenter.analytics;
        ShoppingInfoSheetScreen shoppingInfoSheetScreen = shoppingInfoSheetPresenter.args;
        ShoppingScreenContext screenContext = shoppingInfoSheetScreen.getScreenContext();
        String flowToken = screenContext != null ? EmojiExclusions.getFlowToken(screenContext) : null;
        ShoppingScreenContext screenContext2 = shoppingInfoSheetScreen.getScreenContext();
        analytics.track(new BrowserViewCloseInformationSheet(infoContext, flowToken, screenContext2 != null ? EmojiExclusions.toOrigin(screenContext2) : null), null);
    }

    public static final void access$trackBrowserInfoSheetOpen(ShoppingInfoSheetPresenter shoppingInfoSheetPresenter, InfoContext infoContext) {
        Analytics analytics = shoppingInfoSheetPresenter.analytics;
        ShoppingInfoSheetScreen shoppingInfoSheetScreen = shoppingInfoSheetPresenter.args;
        ShoppingScreenContext screenContext = shoppingInfoSheetScreen.getScreenContext();
        String flowToken = screenContext != null ? EmojiExclusions.getFlowToken(screenContext) : null;
        ShoppingScreenContext screenContext2 = shoppingInfoSheetScreen.getScreenContext();
        analytics.track(new BrowserViewOpenInformationSheet(infoContext, flowToken, null, screenContext2 != null ? EmojiExclusions.toOrigin(screenContext2) : null, null, 40), null);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x01b3, code lost:
    
        if (r0 != null) goto L105;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00f5 A[LOOP:0: B:37:0x00ef->B:39:0x00f5, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x0153  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x015a  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0165  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0168  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x014a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x00a4  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0098  */
    @Override // app.cash.broadway.presenter.molecule.MoleculePresenter
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object models(Flow flow, Composer composer, int i) {
        Object obj;
        LogoImage logoImage;
        LogoImage imageModel;
        int ordinal;
        ActionType actionType;
        Button.ButtonStyle buttonStyle;
        ButtonModel.Style style;
        ButtonModel.Style style2;
        HorizontalAlignment horizontalAlignment;
        flow.getClass();
        GapComposer gapComposer = (GapComposer) composer;
        gapComposer.startReplaceGroup(1033211434);
        Object rememberedValue = gapComposer.rememberedValue();
        Object[] objArr = 0;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        if (rememberedValue == neverEqualPolicy) {
            rememberedValue = Updater.mutableStateOf$default(new State(null));
            gapComposer.updateRememberedValue(rememberedValue);
        }
        MutableState mutableState = (MutableState) rememberedValue;
        Unit unit = Unit.INSTANCE;
        boolean changedInstance = gapComposer.changedInstance(this);
        Object rememberedValue2 = gapComposer.rememberedValue();
        if (changedInstance || rememberedValue2 == neverEqualPolicy) {
            rememberedValue2 = new TaxWebAppPresenter$models$1$1(this, mutableState, (Continuation) null);
            gapComposer.updateRememberedValue(rememberedValue2);
        }
        Updater.LaunchedEffect(gapComposer, unit, (Function2) rememberedValue2);
        Updater.LaunchedEffect(gapComposer, flow, new BasicShieetKt$BasicShieet$4$1(flow, objArr == true ? 1 : 0, this, 18));
        ShoppingInfoSheetScreen shoppingInfoSheetScreen = this.args;
        if (shoppingInfoSheetScreen instanceof ShoppingInfoSheetScreen.AfterPayInfoSheetScreen) {
            SheetDetails sheetDetails = ((State) mutableState.getValue()).sheetDetails;
            if (sheetDetails != null) {
                if (sheetDetails.errorMessage != null) {
                    obj = this.afterpayInNetworkInfoFallbackModel;
                } else {
                    HorizontalAlignment horizontalAlignment2 = HorizontalAlignment.LEFT;
                    Avatar avatar = sheetDetails.avatar;
                    Button button = sheetDetails.actionButton;
                    com.squareup.protos.cash.cashsuggest.api.HorizontalAlignment horizontalAlignment3 = sheetDetails.imageHorizontalAlignment;
                    if (avatar != null) {
                        Image image = avatar.picture;
                        image.getClass();
                        if (horizontalAlignment3 != null) {
                            Alignment.Companion companion = HorizontalAlignment.Companion;
                            int i2 = horizontalAlignment3.value;
                            companion.getClass();
                            HorizontalAlignment m3859fromValue = Alignment.Companion.m3859fromValue(i2);
                            if (m3859fromValue != null) {
                                horizontalAlignment = m3859fromValue;
                                Integer num = sheetDetails.imageHeight;
                                Image image2 = avatar.icon;
                                Boolean bool = avatar.colorize_avatar;
                                boolean booleanValue = bool == null ? bool.booleanValue() : false;
                                Color color = avatar.background_color;
                                imageModel = new LogoImage.AvatarModel(image, horizontalAlignment, num, image2, booleanValue, color == null ? new ColorModel.Accented(color) : null);
                            }
                        }
                        horizontalAlignment = horizontalAlignment2;
                        Integer num2 = sheetDetails.imageHeight;
                        Image image22 = avatar.icon;
                        Boolean bool2 = avatar.colorize_avatar;
                        if (bool2 == null) {
                        }
                        Color color2 = avatar.background_color;
                        imageModel = new LogoImage.AvatarModel(image, horizontalAlignment, num2, image22, booleanValue, color2 == null ? new ColorModel.Accented(color2) : null);
                    } else {
                        Image image3 = sheetDetails.picture;
                        if (image3 != null) {
                            if (horizontalAlignment3 != null) {
                                Alignment.Companion companion2 = HorizontalAlignment.Companion;
                                int i3 = horizontalAlignment3.value;
                                companion2.getClass();
                                HorizontalAlignment m3859fromValue2 = Alignment.Companion.m3859fromValue(i3);
                                if (m3859fromValue2 != null) {
                                    horizontalAlignment2 = m3859fromValue2;
                                }
                            }
                            imageModel = new LogoImage.ImageModel(image3, horizontalAlignment2, sheetDetails.imageHeight);
                        } else {
                            logoImage = null;
                            com.squareup.protos.cash.p2p.profile_directory.ui.Text text = sheetDetails.title;
                            text.getClass();
                            Text compat = Protos_interopKt.compat(text);
                            com.squareup.protos.cash.p2p.profile_directory.ui.Text text2 = sheetDetails.subtitle;
                            Text compat2 = text2 == null ? Protos_interopKt.compat(text2) : null;
                            List<Bullet> list = sheetDetails.bullets;
                            ArrayList arrayList = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list, 10));
                            for (Bullet bullet : list) {
                                bullet.getClass();
                                Image image4 = bullet.bullet_icon;
                                image4.getClass();
                                BulletImage.RemoteImage remoteImage = new BulletImage.RemoteImage(image4);
                                com.squareup.protos.cash.p2p.profile_directory.ui.Text text3 = bullet.bullet_title;
                                text3.getClass();
                                Text compat3 = Protos_interopKt.compat(text3);
                                com.squareup.protos.cash.p2p.profile_directory.ui.Text text4 = bullet.bullet_body;
                                text4.getClass();
                                arrayList.add(new BulletModel(remoteImage, compat3, Protos_interopKt.compat(text4)));
                            }
                            button.getClass();
                            String str = button.action_url;
                            Button.ButtonAction buttonAction = button.action_type;
                            buttonAction.getClass();
                            ordinal = buttonAction.ordinal();
                            if (ordinal != 0) {
                                actionType = ActionType.DISMISS;
                            } else {
                                if (ordinal != 1) {
                                    if (ordinal == 2) {
                                        throw new NotImplementedError(null, 1, null);
                                    }
                                    Drop$$ExternalSyntheticBUOutline0.m1m();
                                    return null;
                                }
                                actionType = ActionType.URL;
                            }
                            ActionType actionType2 = actionType;
                            ErrorEvent.Companion companion3 = button.content;
                            Button$Content$Text button$Content$Text = !(companion3 instanceof Button$Content$Text) ? (Button$Content$Text) companion3 : null;
                            String str2 = button$Content$Text == null ? button$Content$Text.value : null;
                            Button$Content$Icon button$Content$Icon = !(companion3 instanceof Button$Content$Icon) ? (Button$Content$Icon) companion3 : null;
                            Image image5 = button$Content$Icon == null ? button$Content$Icon.value : null;
                            Color color3 = button.background_color;
                            buttonStyle = button.button_style;
                            if (buttonStyle == null) {
                                int ordinal2 = buttonStyle.ordinal();
                                if (ordinal2 == 0) {
                                    style2 = ButtonModel.Style.PRIMARY;
                                } else if (ordinal2 == 1) {
                                    style2 = ButtonModel.Style.SECONDARY;
                                } else if (ordinal2 == 2) {
                                    style2 = ButtonModel.Style.TERTIARY;
                                } else {
                                    if (ordinal2 != 3) {
                                        Drop$$ExternalSyntheticBUOutline0.m1m();
                                        return null;
                                    }
                                    style2 = ButtonModel.Style.OUTLINE;
                                }
                                style = style2;
                            } else {
                                style = null;
                            }
                            ButtonModel buttonModel = new ButtonModel(str, actionType2, str2, image5, color3, style);
                            Color color4 = button.background_color;
                            com.squareup.protos.cash.p2p.profile_directory.ui.Text text5 = sheetDetails.footer;
                            obj = new ShoppingInfoSheetViewModel$BulletedListInfoSheetViewModel.Loaded(logoImage, compat, compat2, arrayList, buttonModel, color4, text5 != null ? Protos_interopKt.compat(text5) : null, true);
                        }
                    }
                    logoImage = imageModel;
                    com.squareup.protos.cash.p2p.profile_directory.ui.Text text6 = sheetDetails.title;
                    text6.getClass();
                    Text compat4 = Protos_interopKt.compat(text6);
                    com.squareup.protos.cash.p2p.profile_directory.ui.Text text22 = sheetDetails.subtitle;
                    if (text22 == null) {
                    }
                    List<Bullet> list2 = sheetDetails.bullets;
                    ArrayList arrayList2 = new ArrayList(CollectionsKt__IterablesKt.collectionSizeOrDefault(list2, 10));
                    while (r0.hasNext()) {
                    }
                    button.getClass();
                    String str3 = button.action_url;
                    Button.ButtonAction buttonAction2 = button.action_type;
                    buttonAction2.getClass();
                    ordinal = buttonAction2.ordinal();
                    if (ordinal != 0) {
                    }
                    ActionType actionType22 = actionType;
                    ErrorEvent.Companion companion32 = button.content;
                    if (!(companion32 instanceof Button$Content$Text)) {
                    }
                    if (button$Content$Text == null) {
                    }
                    if (!(companion32 instanceof Button$Content$Icon)) {
                    }
                    if (button$Content$Icon == null) {
                    }
                    Color color32 = button.background_color;
                    buttonStyle = button.button_style;
                    if (buttonStyle == null) {
                    }
                    ButtonModel buttonModel2 = new ButtonModel(str3, actionType22, str2, image5, color32, style);
                    Color color42 = button.background_color;
                    com.squareup.protos.cash.p2p.profile_directory.ui.Text text52 = sheetDetails.footer;
                    obj = new ShoppingInfoSheetViewModel$BulletedListInfoSheetViewModel.Loaded(logoImage, compat4, compat2, arrayList2, buttonModel2, color42, text52 != null ? Protos_interopKt.compat(text52) : null, true);
                }
            }
            obj = ShoppingInfoSheetViewModel$BulletedListInfoSheetViewModel.Loading.INSTANCE;
        } else {
            if (!(shoppingInfoSheetScreen instanceof ShoppingInfoSheetScreen.CashAppPayIncentiveInfoSheetScreen)) {
                Drop$$ExternalSyntheticBUOutline0.m1m();
                return null;
            }
            obj = this.cashAppPayIncentiveSheetViewModel;
        }
        gapComposer.end(false);
        return obj;
    }
}
