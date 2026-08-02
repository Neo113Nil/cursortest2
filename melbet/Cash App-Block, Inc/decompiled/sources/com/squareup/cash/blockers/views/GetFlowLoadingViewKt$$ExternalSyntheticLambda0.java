package com.squareup.cash.blockers.views;

import android.content.res.Configuration;
import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.BoxKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.foundation.shape.RoundedCornerShapeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.draw.ClipKt;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.RectangleShapeKt$RectangleShape$1;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import androidx.tracing.Trace;
import bo.app.re$$ExternalSyntheticOutline0;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.components.avatar.AvatarEntry;
import com.squareup.cash.arcade.components.avatar.AvatarImage;
import com.squareup.cash.arcade.components.avatar.AvatarOverlay;
import com.squareup.cash.arcade.components.avatar.AvatarSize;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.moneybot.genie.TextViewKt;
import com.squareup.util.Strings;
import com.squareup.util.cash.Countries;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class GetFlowLoadingViewKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;

    public /* synthetic */ GetFlowLoadingViewKt$$ExternalSyntheticLambda0(int i) {
        this.$r8$classId = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        RectangleShapeKt$RectangleShape$1 rectangleShapeKt$RectangleShape$1 = ColorKt.RectangleShape;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                SsnViewKt.GetFlowLoadingSheet((Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 1:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Trace.m1191Iconww6aTOc(Icons.Investing24, (String) null, (Modifier) null, 0L, gapComposer, 54, 12);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 2:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer2, R.string.paid_in_bitcoin_sell_point1_title), (Map) null, (Function1) null, false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 3:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer3, R.string.paid_in_bitcoin_sell_point1_subtitle), (Map) null, (Function1) null, false);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
            case 4:
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    Trace.m1191Iconww6aTOc(Icons.DiscountPercentage24, (String) null, (Modifier) null, 0L, gapComposer4, 54, 12);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                break;
            case 5:
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer5, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer5, R.string.paid_in_bitcoin_sell_point2_title), (Map) null, (Function1) null, false);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                break;
            case 6:
                Composer composer6 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer6, R.string.paid_in_bitcoin_sell_point2_subtitle), (Map) null, (Function1) null, false);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                break;
            case 7:
                Composer composer7 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    Modifier clip = ClipKt.clip(SizeKt.m277height3ABfNKs(SizeKt.fillMaxWidth(companion, 1.0f), 20.0f), RoundedCornerShapeKt.m340RoundedCornerShape0680j_4(32.0f));
                    Colors colors = (Colors) gapComposer7.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer7, -1762997026, gapComposer7, false);
                    } else {
                        gapComposer7.startReplaceGroup(-1762997739);
                        gapComposer7.end(false);
                    }
                    BoxKt.Box(ImageKt.m177backgroundbw27NRU(clip, colors.semantic.background.subtle, rectangleShapeKt$RectangleShape$1), gapComposer7, 0);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                break;
            case 8:
                Composer composer8 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                    Trace.m1191Iconww6aTOc(Icons.NavigationScanQr, Room.stringResource(gapComposer8, R.string.bitcoin_toolbar_scanner_title), SizeKt.m285size3ABfNKs(companion, 24.0f), ((Color) gapComposer8.consume(ArcadeThemeKt.LocalIconColor)).value, gapComposer8, 390, 0);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                break;
            case 9:
                Composer composer9 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue9 & 1, (intValue9 & 3) != 2)) {
                    ImageKt.Image(Countries.painterResource(R.drawable.crypto_common_stablecoin_logo, 0, gapComposer9), null, SizeKt.m285size3ABfNKs(companion, 48.0f), null, null, RecyclerView.DECELERATION_RATE, null, gapComposer9, Painter.$stable | 432, 120);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                break;
            case 10:
                Composer composer10 = (Composer) obj;
                int intValue10 = ((Integer) obj2).intValue();
                GapComposer gapComposer10 = (GapComposer) composer10;
                if (gapComposer10.shouldExecute(intValue10 & 1, (intValue10 & 3) != 2)) {
                    AvatarSize avatarSize = AvatarSize.Size64;
                    AvatarImage.LocalIcon localIcon = new AvatarImage.LocalIcon(Icons.Alert32, 0L, 6);
                    Colors colors2 = (Colors) gapComposer10.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer10, -1762997026, gapComposer10, false);
                    } else {
                        gapComposer10.startReplaceGroup(-1762997739);
                        gapComposer10.end(false);
                    }
                    TextViewKt.m3613AvatarB_rZmmc(avatarSize, "", colors2.semantic.icon.warning, (String) null, (Modifier) null, (AvatarImage) localIcon, (Function2) null, (AvatarOverlay) null, false, 0L, (Composer) gapComposer10, 199734, 0, 2000);
                } else {
                    gapComposer10.skipToGroupEnd();
                }
                break;
            case 11:
                ((Integer) obj2).getClass();
                WelcomeViewKt.BalanceTransferLoading((Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 12:
                ((Integer) obj2).getClass();
                SsnViewKt.ClientScenarioLauncherUi((Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 13:
                Composer composer11 = (Composer) obj;
                int intValue11 = ((Integer) obj2).intValue();
                GapComposer gapComposer11 = (GapComposer) composer11;
                if (!gapComposer11.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                    gapComposer11.skipToGroupEnd();
                }
                break;
            case 14:
                Composer composer12 = (Composer) obj;
                int intValue12 = ((Integer) obj2).intValue();
                GapComposer gapComposer12 = (GapComposer) composer12;
                if (gapComposer12.shouldExecute(intValue12 & 1, (intValue12 & 3) != 2)) {
                    Trace.m1191Iconww6aTOc(Icons.Share24, (String) null, (Modifier) null, 0L, gapComposer12, 54, 12);
                } else {
                    gapComposer12.skipToGroupEnd();
                }
                break;
            case 15:
                Composer composer13 = (Composer) obj;
                int intValue13 = ((Integer) obj2).intValue();
                GapComposer gapComposer13 = (GapComposer) composer13;
                if (gapComposer13.shouldExecute(intValue13 & 1, (intValue13 & 3) != 2)) {
                    WelcomeViewKt.BalanceTransferLoading(gapComposer13, 0);
                } else {
                    gapComposer13.skipToGroupEnd();
                }
                break;
            case 16:
                Composer composer14 = (Composer) obj;
                int intValue14 = ((Integer) obj2).intValue();
                GapComposer gapComposer14 = (GapComposer) composer14;
                if (gapComposer14.shouldExecute(intValue14 & 1, (intValue14 & 3) != 2)) {
                    Unit unit = Unit.INSTANCE;
                    Colors colors3 = (Colors) gapComposer14.consume(ArcadeThemeKt.LocalColors);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer14, -1762997026, gapComposer14, false);
                    } else {
                        gapComposer14.startReplaceGroup(-1762997739);
                        gapComposer14.end(false);
                    }
                    Strings.LoadableFullScreenContent(unit, true, ImageKt.m177backgroundbw27NRU(companion, colors3.semantic.background.f1047app, rectangleShapeKt$RectangleShape$1), null, null, AmountBlockerViewKt.f281lambda$147201544, gapComposer14, 196662, 24);
                } else {
                    gapComposer14.skipToGroupEnd();
                }
                break;
            case 17:
                Composer composer15 = (Composer) obj;
                int intValue15 = ((Integer) obj2).intValue();
                GapComposer gapComposer15 = (GapComposer) composer15;
                if (gapComposer15.shouldExecute(intValue15 & 1, (intValue15 & 3) != 2)) {
                    Strings.m3984LoadableSheetContentosbwsH8(Unit.INSTANCE, true, ((Configuration) gapComposer15.consume(AndroidCompositionLocals_androidKt.LocalConfiguration)).screenHeightDp / 2, null, null, AmountBlockerViewKt.f296lambda$438748398, gapComposer15, 196662, 24);
                } else {
                    gapComposer15.skipToGroupEnd();
                }
                break;
            case 18:
                Composer composer16 = (Composer) obj;
                int intValue16 = ((Integer) obj2).intValue();
                GapComposer gapComposer16 = (GapComposer) composer16;
                if (gapComposer16.shouldExecute(intValue16 & 1, (intValue16 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer16, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer16, R.string.card_cardholder_name_hint), (Map) null, (Function1) null, false);
                } else {
                    gapComposer16.skipToGroupEnd();
                }
                break;
            case 19:
                Composer composer17 = (Composer) obj;
                int intValue17 = ((Integer) obj2).intValue();
                GapComposer gapComposer17 = (GapComposer) composer17;
                if (gapComposer17.shouldExecute(intValue17 & 1, (intValue17 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer17, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer17, R.string.blockers_input_card_expiration_label), (Map) null, (Function1) null, false);
                } else {
                    gapComposer17.skipToGroupEnd();
                }
                break;
            case 20:
                Composer composer18 = (Composer) obj;
                int intValue18 = ((Integer) obj2).intValue();
                GapComposer gapComposer18 = (GapComposer) composer18;
                if (gapComposer18.shouldExecute(intValue18 & 1, (intValue18 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer18, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer18, R.string.card_security_code_hint), (Map) null, (Function1) null, false);
                } else {
                    gapComposer18.skipToGroupEnd();
                }
                break;
            case 21:
                Composer composer19 = (Composer) obj;
                int intValue19 = ((Integer) obj2).intValue();
                GapComposer gapComposer19 = (GapComposer) composer19;
                if (gapComposer19.shouldExecute(intValue19 & 1, (intValue19 & 3) != 2)) {
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalColors;
                    Colors colors4 = (Colors) gapComposer19.consume(staticProvidableCompositionLocal);
                    if (colors4 == null) {
                        colors4 = re$$ExternalSyntheticOutline0.m(gapComposer19, -1762997026, gapComposer19, false);
                    } else {
                        gapComposer19.startReplaceGroup(-1762997739);
                        gapComposer19.end(false);
                    }
                    Modifier m298padding3ABfNKs = SpacerKt.m298padding3ABfNKs(ImageKt.m177backgroundbw27NRU(companion, colors4.semantic.background.danger, RoundedCornerShapeKt.CircleShape), 16.0f);
                    Icons icons = Icons.Alert32;
                    Colors colors5 = (Colors) gapComposer19.consume(staticProvidableCompositionLocal);
                    if (colors5 == null) {
                        colors5 = re$$ExternalSyntheticOutline0.m(gapComposer19, -1762997026, gapComposer19, false);
                    } else {
                        gapComposer19.startReplaceGroup(-1762997739);
                        gapComposer19.end(false);
                    }
                    Trace.m1191Iconww6aTOc(icons, (String) null, m298padding3ABfNKs, colors5.semantic.icon.inverse, gapComposer19, 54, 0);
                } else {
                    gapComposer19.skipToGroupEnd();
                }
                break;
            case 22:
                Composer composer20 = (Composer) obj;
                int intValue20 = ((Integer) obj2).intValue();
                GapComposer gapComposer20 = (GapComposer) composer20;
                if (gapComposer20.shouldExecute(intValue20 & 1, (intValue20 & 3) != 2)) {
                    AvatarSize avatarSize2 = AvatarSize.Size64;
                    Colors colors6 = (Colors) gapComposer20.consume(ArcadeThemeKt.LocalColors);
                    if (colors6 == null) {
                        colors6 = re$$ExternalSyntheticOutline0.m(gapComposer20, -1762997026, gapComposer20, false);
                    } else {
                        gapComposer20.startReplaceGroup(-1762997739);
                        gapComposer20.end(false);
                    }
                    TextViewKt.Avatar(avatarSize2, new AvatarEntry("", colors6.semantic.background.brand, null, new AvatarImage.LocalIcon(Icons.Avatar32, 0L, 6), null, null, null, null, EnumC0170g.SDK_ASSET_ILLUSTRATION_BUBBLES_QUESTION_VALUE), null, false, gapComposer20, 6, 28);
                } else {
                    gapComposer20.skipToGroupEnd();
                }
                break;
            case 23:
                Composer composer21 = (Composer) obj;
                int intValue21 = ((Integer) obj2).intValue();
                GapComposer gapComposer21 = (GapComposer) composer21;
                if (gapComposer21.shouldExecute(intValue21 & 1, (intValue21 & 3) != 2)) {
                    Trace.m1191Iconww6aTOc(Icons.Search24, (String) null, (Modifier) null, 0L, gapComposer21, 54, 12);
                } else {
                    gapComposer21.skipToGroupEnd();
                }
                break;
            case 24:
                Composer composer22 = (Composer) obj;
                int intValue22 = ((Integer) obj2).intValue();
                GapComposer gapComposer22 = (GapComposer) composer22;
                if (gapComposer22.shouldExecute(intValue22 & 1, (intValue22 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer22, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer22, R.string.contacts_permissions_explanation_find_friends), (Map) null, (Function1) null, false);
                } else {
                    gapComposer22.skipToGroupEnd();
                }
                break;
            case 25:
                Composer composer23 = (Composer) obj;
                int intValue23 = ((Integer) obj2).intValue();
                GapComposer gapComposer23 = (GapComposer) composer23;
                if (gapComposer23.shouldExecute(intValue23 & 1, (intValue23 & 3) != 2)) {
                    Trace.m1191Iconww6aTOc(Icons.SecurityCheckOutline24, (String) null, (Modifier) null, 0L, gapComposer23, 54, 12);
                } else {
                    gapComposer23.skipToGroupEnd();
                }
                break;
            case 26:
                Composer composer24 = (Composer) obj;
                int intValue24 = ((Integer) obj2).intValue();
                GapComposer gapComposer24 = (GapComposer) composer24;
                if (gapComposer24.shouldExecute(intValue24 & 1, (intValue24 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer24, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer24, R.string.contacts_permissions_explanation_verify_identity), (Map) null, (Function1) null, false);
                } else {
                    gapComposer24.skipToGroupEnd();
                }
                break;
            case 27:
                Composer composer25 = (Composer) obj;
                int intValue25 = ((Integer) obj2).intValue();
                GapComposer gapComposer25 = (GapComposer) composer25;
                if (gapComposer25.shouldExecute(intValue25 & 1, (intValue25 & 3) != 2)) {
                    Trace.m1191Iconww6aTOc(Icons.Avatar24, (String) null, (Modifier) null, 0L, gapComposer25, 54, 12);
                } else {
                    gapComposer25.skipToGroupEnd();
                }
                break;
            case 28:
                Composer composer26 = (Composer) obj;
                int intValue26 = ((Integer) obj2).intValue();
                GapComposer gapComposer26 = (GapComposer) composer26;
                if (gapComposer26.shouldExecute(intValue26 & 1, (intValue26 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer26, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer26, R.string.contacts_permissions_explanation_prevent_fraud), (Map) null, (Function1) null, false);
                } else {
                    gapComposer26.skipToGroupEnd();
                }
                break;
            default:
                Composer composer27 = (Composer) obj;
                int intValue27 = ((Integer) obj2).intValue();
                GapComposer gapComposer27 = (GapComposer) composer27;
                if (gapComposer27.shouldExecute(intValue27 & 1, (intValue27 & 3) != 2)) {
                    Modifier clip2 = ClipKt.clip(SizeKt.m285size3ABfNKs(companion, 64.0f), RoundedCornerShapeKt.CircleShape);
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal2 = ArcadeThemeKt.LocalColors;
                    Colors colors7 = (Colors) gapComposer27.consume(staticProvidableCompositionLocal2);
                    if (colors7 == null) {
                        colors7 = re$$ExternalSyntheticOutline0.m(gapComposer27, -1762997026, gapComposer27, false);
                    } else {
                        gapComposer27.startReplaceGroup(-1762997739);
                        gapComposer27.end(false);
                    }
                    Modifier m298padding3ABfNKs2 = SpacerKt.m298padding3ABfNKs(ImageKt.m177backgroundbw27NRU(clip2, colors7.semantic.background.brand, rectangleShapeKt$RectangleShape$1), 16.0f);
                    Icons icons2 = Icons.ContactAdd32;
                    String stringResource = Room.stringResource(gapComposer27, R.string.invite_friends_icon_content_description);
                    Colors colors8 = (Colors) gapComposer27.consume(staticProvidableCompositionLocal2);
                    if (colors8 == null) {
                        colors8 = re$$ExternalSyntheticOutline0.m(gapComposer27, -1762997026, gapComposer27, false);
                    } else {
                        gapComposer27.startReplaceGroup(-1762997739);
                        gapComposer27.end(false);
                    }
                    Trace.m1191Iconww6aTOc(icons2, stringResource, m298padding3ABfNKs2, colors8.semantic.icon.inverse, gapComposer27, 6, 0);
                } else {
                    gapComposer27.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ GetFlowLoadingViewKt$$ExternalSyntheticLambda0(int i, int i2) {
        this.$r8$classId = i2;
    }
}
