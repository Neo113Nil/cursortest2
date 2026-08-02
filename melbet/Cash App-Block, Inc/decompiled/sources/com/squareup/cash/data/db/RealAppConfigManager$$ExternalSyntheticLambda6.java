package com.squareup.cash.data.db;

import androidx.camera.video.internal.utils.StorageUtil;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.saveable.SaveableHolder;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.layout.ContentScale;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.text.font.FontWeightKt;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.broadway.presenter.molecule.viewmodels.UiCallbackModel;
import bo.app.re$$ExternalSyntheticOutline0;
import coil3.RealImageLoader;
import coil3.compose.LocalImageLoaderKt;
import com.google.mlkit.common.internal.zzd;
import com.knotapi.knot.utilities.Constants;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarOverlay;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.card.onboarding.ProductDetailsPageViewModel;
import com.squareup.cash.card.onboarding.TestData;
import com.squareup.cash.card.onboarding.core.CardScene$$ExternalSyntheticLambda1;
import com.squareup.cash.card.onboarding.core.instancing.CardDesignLibraryState;
import com.squareup.cash.card.onboarding.db.CardStudioQueries$$ExternalSyntheticLambda3;
import com.squareup.cash.card.onboarding.pdp.HeroSectionKt;
import com.squareup.cash.cashapplite.views.KycAppletTileKt;
import com.squareup.cash.cashapppay.settings.viewmodels.CashAppPaySettingsRowViewModel$BusinessViewModel;
import com.squareup.cash.cashapppay.settings.viewmodels.CashAppPaySettingsViewModel;
import com.squareup.cash.cashapppay.settings.views.UnlinkResultViewKt;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.common.composeui.shimmer.ShimmerCellsKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.data.profile.RealProfileNotificationsRepository;
import com.squareup.cash.datefilterbar.backend.api.DateFilter;
import com.squareup.cash.db.profile.Alias;
import com.squareup.cash.db2.security.PasswordInfoQueries$$ExternalSyntheticLambda0;
import com.squareup.cash.deposits.physical.view.map.AtmWithdrawalMapViewArcadeKt;
import com.squareup.cash.deposits.physical.viewmodels.map.AtmWithdrawalMapViewModel;
import com.squareup.cash.deposits.physical.viewmodels.map.ViewTextViewModel;
import com.squareup.cash.dialog.ComposeDialogKt$$ExternalSyntheticLambda14;
import com.squareup.cash.maps.viewmodels.CashMapViewModel;
import com.squareup.cash.maps.viewmodels.LocationViewModel;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.cash.util.legal.LegalUrl;
import com.squareup.protos.cash.ui.Icon;
import com.squareup.protos.franklin.api.RetailerMapBlocker;
import com.squareup.protos.franklin.common.SyncBusinessGrant;
import com.squareup.util.cash.Countries;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt__CollectionsKt;
import kotlin.collections.EmptyList;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes6.dex */
public final /* synthetic */ class RealAppConfigManager$$ExternalSyntheticLambda6 implements Function2 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ RealAppConfigManager$$ExternalSyntheticLambda6(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int indexOf;
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        int i2 = 1;
        switch (i) {
            case 0:
                String str = (String) obj;
                String str2 = (String) obj2;
                if (str == null) {
                    str = LegalUrl.Privacy;
                }
                if (str2 == null) {
                    str2 = LegalUrl.TermsOfService;
                }
                break;
            case 1:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Painter painterResource = Countries.painterResource(R.drawable.pattern_four_dots, 0, gapComposer);
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    long j = colors.component.segmentedControl.button.text;
                    ImageKt.Image(painterResource, null, null, null, ContentScale.Companion.Inside, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer, Painter.$stable | 24624, 44);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 2:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Trace.m1191Iconww6aTOc(Icons.NumberPad24, (String) null, (Modifier) null, 0L, gapComposer2, 54, 12);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 3:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    Icons icons = Icons.Clear24;
                    String stringResource = Room.stringResource(gapComposer3, R.string.accessibility_clear);
                    Object rememberedValue = gapComposer3.rememberedValue();
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = new CardScene$$ExternalSyntheticLambda1(8);
                        gapComposer3.updateRememberedValue(rememberedValue);
                    }
                    StorageUtil.ButtonIcon(icons, stringResource, (Function0) rememberedValue, null, false, null, gapComposer3, 390, 56);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
            case 4:
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    AvatarSize avatarSize = AvatarSize.Size64;
                    Colors colors2 = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                    } else {
                        gapComposer4.startReplaceGroup(-1762997739);
                        gapComposer4.end(false);
                    }
                    TextViewKt.m3613AvatarB_rZmmc(avatarSize, "", colors2.semantic.background.brand, (String) null, (Modifier) null, (AvatarImage) new AvatarImage.LocalIcon(Icons.CardBasic32, 0L, 6), (Function2) null, (AvatarOverlay) null, false, 0L, (Composer) gapComposer4, 199734, 0, 2000);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                break;
            case 5:
                CardDesignLibraryState cardDesignLibraryState = (CardDesignLibraryState) obj2;
                ((SaveableHolder) obj).getClass();
                cardDesignLibraryState.getClass();
                break;
            case 6:
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    ProductDetailsPageViewModel productDetailsPageViewModel = TestData.PRODUCT_DETAILS_PAGE;
                    Object rememberedValue2 = gapComposer5.rememberedValue();
                    if (rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new CardStudioQueries$$ExternalSyntheticLambda3(13);
                        gapComposer5.updateRememberedValue(rememberedValue2);
                    }
                    HeroSectionKt.ProductDetailsPage(productDetailsPageViewModel, (Function1) rememberedValue2, gapComposer5, 48);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                break;
            case 7:
                ((Integer) obj2).getClass();
                FontWeightKt.Divider((Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 8:
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    AvatarSize avatarSize2 = AvatarSize.Size64;
                    Colors colors3 = (Colors) gapComposer6.consume(ArcadeThemeKt.LocalColors);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer6, -1762997026, gapComposer6, false);
                    } else {
                        gapComposer6.startReplaceGroup(-1762997739);
                        gapComposer6.end(false);
                    }
                    TextViewKt.Avatar(avatarSize2, new AvatarEntry("", colors3.semantic.background.danger, null, new AvatarImage.LocalIcon(Icons.Alert32, 0L, 6), null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE), null, false, gapComposer6, 6, 28);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                break;
            case 9:
                ((Integer) obj2).getClass();
                KycAppletTileKt.TitleRow((Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 10:
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    SyncBusinessGrant.ActionType actionType = SyncBusinessGrant.ActionType.ON_FILE_PAYMENT;
                    CashAppPaySettingsViewModel.Loaded loaded = new CashAppPaySettingsViewModel.Loaded(CollectionsKt__CollectionsKt.listOf((Object[]) new CashAppPaySettingsRowViewModel$BusinessViewModel[]{new CashAppPaySettingsRowViewModel$BusinessViewModel("grant_id_1", null, "Business 1", actionType, null), new CashAppPaySettingsRowViewModel$BusinessViewModel("grant_id_1", null, "Business 2", actionType, SyncBusinessGrant.RenderingBehavior.AFTERPAY)}));
                    RealImageLoader realImageLoader = (RealImageLoader) gapComposer7.consume(LocalImageLoaderKt.LocalImageLoader);
                    Object rememberedValue3 = gapComposer7.rememberedValue();
                    if (rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new CardStudioQueries$$ExternalSyntheticLambda3(19);
                        gapComposer7.updateRememberedValue(rememberedValue3);
                    }
                    UnlinkResultViewKt.CashAppPaySettings(loaded, (Function1) rememberedValue3, realImageLoader, gapComposer7, 48);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                break;
            case 11:
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                    CashAppPaySettingsViewModel.Loaded loaded2 = new CashAppPaySettingsViewModel.Loaded(EmptyList.INSTANCE);
                    RealImageLoader realImageLoader2 = (RealImageLoader) gapComposer8.consume(LocalImageLoaderKt.LocalImageLoader);
                    Object rememberedValue4 = gapComposer8.rememberedValue();
                    if (rememberedValue4 == neverEqualPolicy) {
                        rememberedValue4 = new CardStudioQueries$$ExternalSyntheticLambda3(20);
                        gapComposer8.updateRememberedValue(rememberedValue4);
                    }
                    UnlinkResultViewKt.CashAppPaySettings(loaded2, (Function1) rememberedValue4, realImageLoader2, gapComposer8, 48);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                break;
            case 12:
                Composer composer9 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                    RealImageLoader realImageLoader3 = (RealImageLoader) gapComposer9.consume(LocalImageLoaderKt.LocalImageLoader);
                    Object rememberedValue5 = gapComposer9.rememberedValue();
                    if (rememberedValue5 == neverEqualPolicy) {
                        rememberedValue5 = new CardStudioQueries$$ExternalSyntheticLambda3(18);
                        gapComposer9.updateRememberedValue(rememberedValue5);
                    }
                    UnlinkResultViewKt.CashAppPaySettings(CashAppPaySettingsViewModel.Loading.INSTANCE, (Function1) rememberedValue5, realImageLoader3, gapComposer9, 48);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                break;
            case 13:
                Composer composer10 = (Composer) obj;
                int intValue10 = ((Integer) obj2).intValue();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                    AvatarSize avatarSize3 = AvatarSize.Size64;
                    Colors colors4 = (Colors) gapComposer10.consume(ArcadeThemeKt.LocalColors);
                    if (colors4 == null) {
                        colors4 = re$$ExternalSyntheticOutline0.m(gapComposer10, -1762997026, gapComposer10, false);
                    } else {
                        gapComposer10.startReplaceGroup(-1762997739);
                        gapComposer10.end(false);
                    }
                    TextViewKt.Avatar(avatarSize3, new AvatarEntry("", colors4.semantic.icon.brand, null, new AvatarImage.LocalIcon(Icons.CameraFill32, 0L, 6), null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE), null, false, gapComposer10, 6, 28);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                break;
            case 14:
                Composer composer11 = (Composer) obj;
                int intValue11 = ((Integer) obj2).intValue();
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (!gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                    gapComposer11.skipToGroupEnd();
                }
                break;
            case 15:
                Composer composer12 = (Composer) obj;
                int intValue12 = ((Integer) obj2).intValue();
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                    VisibleKt.ShimmerBox(null, false, null, ShimmerCellsKt.f360lambda$612625851, gapComposer12, 3072, 7);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                break;
            case 16:
                Composer composer13 = (Composer) obj;
                int intValue13 = ((Integer) obj2).intValue();
                GapComposer gapComposer13 = (GapComposer) composer13;
                if (gapComposer13.shouldExecute(intValue13 & 1, (intValue13 & 3) != 2)) {
                    VisibleKt.ShimmerBox(null, false, null, ShimmerCellsKt.f357lambda$1565812670, gapComposer13, 3072, 7);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                break;
            case 17:
                Composer composer14 = (Composer) obj;
                int intValue14 = ((Integer) obj2).intValue();
                GapComposer gapComposer14 = (GapComposer) composer14;
                if (gapComposer14.shouldExecute(intValue14 & 1, (intValue14 & 3) != 2)) {
                    VisibleKt.ShimmerBox(null, false, null, ShimmerCellsKt.lambda$738129113, gapComposer14, 3072, 7);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                break;
            case 18:
                Composer composer15 = (Composer) obj;
                int intValue15 = ((Integer) obj2).intValue();
                GapComposer gapComposer15 = (GapComposer) composer15;
                if (!gapComposer15.shouldExecute(intValue15 & 1, (intValue15 & 3) != 2)) {
                    gapComposer15.skipToGroupEnd();
                }
                break;
            case 19:
                Composer composer16 = (Composer) obj;
                int intValue16 = ((Integer) obj2).intValue();
                GapComposer gapComposer16 = (GapComposer) composer16;
                if (gapComposer16.shouldExecute(intValue16 & 1, (intValue16 & 3) != 2)) {
                    Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, 64.0f);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                    Colors colors5 = (Colors) gapComposer16.consume(staticProvidableCompositionLocal);
                    if (colors5 == null) {
                        colors5 = re$$ExternalSyntheticOutline0.m(gapComposer16, -1762997026, gapComposer16, false);
                    } else {
                        gapComposer16.startReplaceGroup(-1762997739);
                        gapComposer16.end(false);
                    }
                    Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(ImageKt.m177backgroundbw27NRU(m285size3ABfNKs, colors5.semantic.background.danger, RoundedCornerShapeKt.CircleShape), 16.0f);
                    Icons icons2 = Icons.Alert32;
                    Colors colors6 = (Colors) gapComposer16.consume(staticProvidableCompositionLocal);
                    if (colors6 == null) {
                        colors6 = re$$ExternalSyntheticOutline0.m(gapComposer16, -1762997026, gapComposer16, false);
                    } else {
                        gapComposer16.startReplaceGroup(-1762997739);
                        gapComposer16.end(false);
                    }
                    Trace.m1191Iconww6aTOc(icons2, (String) null, m298padding3ABfNKs, colors6.semantic.icon.inverse, gapComposer16, 54, 0);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                break;
            case 20:
                Composer composer17 = (Composer) obj;
                int intValue17 = ((Integer) obj2).intValue();
                GapComposer gapComposer17 = (GapComposer) composer17;
                if (gapComposer17.shouldExecute(intValue17 & 1, (intValue17 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer17, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer17, R.string.sync_contacts_upsell_card_title), (Map) null, (Function1) null, false);
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                break;
            case 21:
                Composer composer18 = (Composer) obj;
                int intValue18 = ((Integer) obj2).intValue();
                GapComposer gapComposer18 = (GapComposer) composer18;
                if (gapComposer18.shouldExecute(intValue18 & 1, (intValue18 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer18, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer18, R.string.sync_contacts_row_body), (Map) null, (Function1) null, false);
                } else {
                    gapComposer18.skipToGroupEnd();
                }
                break;
            case 22:
                Composer composer19 = (Composer) obj;
                int intValue19 = ((Integer) obj2).intValue();
                GapComposer gapComposer19 = (GapComposer) composer19;
                if (gapComposer19.shouldExecute(intValue19 & 1, (intValue19 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 6, 0, 4094, 0L, (Composer) gapComposer19, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, "...", (Map) null, (Function1) null, false);
                } else {
                    gapComposer19.skipToGroupEnd();
                }
                break;
            case 23:
                Alias alias = (Alias) obj;
                Alias alias2 = (Alias) obj2;
                alias.getClass();
                alias2.getClass();
                if (alias.getType() == alias2.getType()) {
                    indexOf = alias.getCanonical_text().compareTo(alias2.getCanonical_text());
                } else {
                    List list = RealProfileNotificationsRepository.TYPE_ORDER;
                    indexOf = list.indexOf(alias.getType()) - list.indexOf(alias2.getType());
                }
                break;
            case 24:
                ((Integer) obj).intValue();
                DateFilter dateFilter = (DateFilter) obj2;
                dateFilter.getClass();
                break;
            case 25:
                Composer composer20 = (Composer) obj;
                int intValue20 = ((Integer) obj2).intValue();
                GapComposer gapComposer20 = (GapComposer) composer20;
                if (gapComposer20.shouldExecute(intValue20 & 1, (intValue20 & 3) != 2)) {
                    AvatarSize avatarSize4 = AvatarSize.Size48;
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ArcadeThemeKt.LocalColors;
                    Colors colors7 = (Colors) gapComposer20.consume(staticProvidableCompositionLocal2);
                    if (colors7 == null) {
                        colors7 = re$$ExternalSyntheticOutline0.m(gapComposer20, -1762997026, gapComposer20, false);
                    } else {
                        gapComposer20.startReplaceGroup(-1762997739);
                        gapComposer20.end(false);
                    }
                    long j2 = colors7.semantic.background.subtle;
                    Icons icons3 = Icons.Location24;
                    Colors colors8 = (Colors) gapComposer20.consume(staticProvidableCompositionLocal2);
                    if (colors8 == null) {
                        colors8 = re$$ExternalSyntheticOutline0.m(gapComposer20, -1762997026, gapComposer20, false);
                    } else {
                        gapComposer20.startReplaceGroup(-1762997739);
                        gapComposer20.end(false);
                    }
                    TextViewKt.Avatar(avatarSize4, new AvatarEntry("", j2, null, new AvatarImage.LocalIcon(icons3, colors8.semantic.icon.subtle, 4), null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE), null, false, gapComposer20, 6, 28);
                } else {
                    gapComposer20.skipToGroupEnd();
                }
                break;
            case 26:
                Composer composer21 = (Composer) obj;
                int intValue21 = ((Integer) obj2).intValue();
                GapComposer gapComposer21 = (GapComposer) composer21;
                if (gapComposer21.shouldExecute(intValue21 & 1, (intValue21 & 3) != 2)) {
                    Trace.m1191Iconww6aTOc(Icons.Help24, Room.stringResource(gapComposer21, R.string.withdrawal_help_description), (Modifier) null, 0L, gapComposer21, 6, 12);
                } else {
                    gapComposer21.skipToGroupEnd();
                }
                break;
            case 27:
                Composer composer22 = (Composer) obj;
                int intValue22 = ((Integer) obj2).intValue();
                GapComposer gapComposer22 = (GapComposer) composer22;
                if (gapComposer22.shouldExecute(intValue22 & 1, (intValue22 & 3) != 2)) {
                    EmptyList emptyList = EmptyList.INSTANCE;
                    ViewTextViewModel viewTextViewModel = new ViewTextViewModel(new RetailerMapBlocker.MapScreen("ATM Locations", "For accuracy, enable location", "Cash App can most accurately show locations near you once you enable location permissions in Settings", "Go to Settings", Constants.META_CLOSE, "No locations found", "Could not find retailers within 25 miles", "Continue", null, 256, null));
                    CashMapViewModel cashMapViewModel = new CashMapViewModel(LocationViewModel.DEFAULT_LOCATION_VIEW_MODEL, true, null, null, null, true, null);
                    Object rememberedValue6 = gapComposer22.rememberedValue();
                    if (rememberedValue6 == neverEqualPolicy) {
                        rememberedValue6 = new PasswordInfoQueries$$ExternalSyntheticLambda0(29);
                        gapComposer22.updateRememberedValue(rememberedValue6);
                    }
                    UiCallbackModel uiCallbackModel = new UiCallbackModel((Function1) rememberedValue6, cashMapViewModel);
                    zzd zzdVar = Icons.Companion;
                    AtmWithdrawalMapViewModel atmWithdrawalMapViewModel = new AtmWithdrawalMapViewModel(viewTextViewModel, uiCallbackModel, emptyList, false, true, "123 Main St, San Francisco, CA 94105", new AtmWithdrawalMapViewModel.AtmFeeViewModel(new Icon("pfbkAI"), "Fees at in-network ATMs are reimbursed"));
                    Object rememberedValue7 = gapComposer22.rememberedValue();
                    if (rememberedValue7 == neverEqualPolicy) {
                        rememberedValue7 = new ComposeDialogKt$$ExternalSyntheticLambda14(i2);
                        gapComposer22.updateRememberedValue(rememberedValue7);
                    }
                    AtmWithdrawalMapViewArcadeKt.AtmWithdrawalMapArcade(atmWithdrawalMapViewModel, (Function1) rememberedValue7, gapComposer22, 48);
                } else {
                    gapComposer22.skipToGroupEnd();
                }
                break;
            case 28:
                Composer composer23 = (Composer) obj;
                int intValue23 = ((Integer) obj2).intValue();
                GapComposer gapComposer23 = (GapComposer) composer23;
                if (gapComposer23.shouldExecute(intValue23 & 1, (intValue23 & 3) != 2)) {
                    AvatarSize avatarSize5 = AvatarSize.Size64;
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal3 = ArcadeThemeKt.LocalColors;
                    Colors colors9 = (Colors) gapComposer23.consume(staticProvidableCompositionLocal3);
                    if (colors9 == null) {
                        colors9 = re$$ExternalSyntheticOutline0.m(gapComposer23, -1762997026, gapComposer23, false);
                    } else {
                        gapComposer23.startReplaceGroup(-1762997739);
                        gapComposer23.end(false);
                    }
                    long j3 = colors9.semantic.background.brand;
                    Icons icons4 = Icons.Atm32;
                    Colors colors10 = (Colors) gapComposer23.consume(staticProvidableCompositionLocal3);
                    if (colors10 == null) {
                        colors10 = re$$ExternalSyntheticOutline0.m(gapComposer23, -1762997026, gapComposer23, false);
                    } else {
                        gapComposer23.startReplaceGroup(-1762997739);
                        gapComposer23.end(false);
                    }
                    TextViewKt.Avatar(avatarSize5, new AvatarEntry("", j3, null, new AvatarImage.LocalIcon(icons4, colors10.semantic.icon.inverse, 4), null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE), null, false, gapComposer23, 6, 28);
                } else {
                    gapComposer23.skipToGroupEnd();
                }
                break;
            default:
                Composer composer24 = (Composer) obj;
                int intValue24 = ((Integer) obj2).intValue();
                GapComposer gapComposer24 = (GapComposer) composer24;
                if (!gapComposer24.shouldExecute(intValue24 & 1, (intValue24 & 3) != 2)) {
                    gapComposer24.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ RealAppConfigManager$$ExternalSyntheticLambda6(int i, int i2) {
        this.$r8$classId = i2;
    }
}
