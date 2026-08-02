package com.squareup.cash.pools.views;

import androidx.appcompat.app.LocaleOverlayHelper;
import androidx.compose.foundation.ImageKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.BlendModeColorFilter;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import app.cash.local.views.marketingmessages.MarketingMessageKt;
import com.squareup.cash.R;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.fidesmo.views.FidesmoProvisioningViewKt;
import com.squareup.cash.formview.components.arcade.ArcadeFormUpsellKt;
import com.squareup.cash.incentives.finishsetup.applets.views.FinishSetupAppletTileKt;
import com.squareup.cash.instruments.views.CardArtImageKt;
import com.squareup.cash.moneybot.views.plugins.TextCardKt;
import com.squareup.cash.mooncake.compose_ui.components.KeypadKt;
import com.squareup.cash.offers.views.UtilsKt;
import com.squareup.cash.offers.views.details.OfferDetailsSheetKt;
import com.squareup.cash.support.chat.views.transcript.message.compose.MessageFileKt;
import com.squareup.util.cash.Countries;
import com.stripe.android.financialconnections.features.common.ListItemKt;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsColors;
import com.stripe.android.financialconnections.ui.theme.ThemeKt;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.bouncycastle.pqc.crypto.mlkem.MLKEMEngine;

/* loaded from: classes6.dex */
public final /* synthetic */ class PoolCreateViewKt$$ExternalSyntheticLambda4 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ String f$0;
    public final /* synthetic */ Modifier f$1;

    public /* synthetic */ PoolCreateViewKt$$ExternalSyntheticLambda4(int i, Modifier modifier, String str) {
        this.$r8$classId = i;
        this.f$0 = str;
        this.f$1 = modifier;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        String str = this.f$0;
        Modifier modifier = this.f$1;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                PoolToastKt.PoolCreateLoading(Updater.updateChangedFlags(1), (Composer) obj, modifier, str);
                break;
            case 1:
                ((Integer) obj2).getClass();
                MarketingMessageKt.EmptyMessages(Updater.updateChangedFlags(7), (Composer) obj, modifier, str);
                break;
            case 2:
                ((Integer) obj2).getClass();
                LocaleOverlayHelper.BusinessInfoHeader(Updater.updateChangedFlags(1), (Composer) obj, modifier, str);
                break;
            case 3:
                ((Integer) obj2).getClass();
                VisibleKt.ScalableMonogram(Updater.updateChangedFlags(1), (Composer) obj, modifier, str);
                break;
            case 4:
                ((Integer) obj2).getClass();
                FidesmoProvisioningViewKt.SuccessCardImage(Updater.updateChangedFlags(1), (Composer) obj, modifier, str);
                break;
            case 5:
                ((Integer) obj2).getClass();
                ArcadeFormUpsellKt.CtaTextArrow(Updater.updateChangedFlags(1), (Composer) obj, modifier, str);
                break;
            case 6:
                ((Integer) obj2).getClass();
                FinishSetupAppletTileKt.RemoteHeroImage(Updater.updateChangedFlags(1), (Composer) obj, modifier, str);
                break;
            case 7:
                ((Integer) obj2).getClass();
                CardArtImageKt.CardNameLabel(Updater.updateChangedFlags(1), (Composer) obj, modifier, str);
                break;
            case 8:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4092, 0L, (Composer) gapComposer, this.f$1, (TextStyle) null, (TextLineBalancing) null, this.f$0, (Map) null, (Function1) null, false);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 9:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4092, 0L, (Composer) gapComposer2, this.f$1, (TextStyle) null, (TextLineBalancing) null, this.f$0, (Map) null, (Function1) null, false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 10:
                ((Integer) obj2).getClass();
                TextCardKt.ToolRequestError(Updater.updateChangedFlags(49), (Composer) obj, modifier, str);
                break;
            case 11:
                ((Integer) obj2).getClass();
                KeypadKt.ToolbarTitle(Updater.updateChangedFlags(7), (Composer) obj, modifier, str);
                break;
            case 12:
                ((Integer) obj2).getClass();
                UtilsKt.OffersTabEmptyView(Updater.updateChangedFlags(7), (Composer) obj, modifier, str);
                break;
            case 13:
                ((Integer) obj2).getClass();
                OfferDetailsSheetKt.FooterMessage(Updater.updateChangedFlags(1), (Composer) obj, modifier, str);
                break;
            case 14:
                ((Integer) obj2).getClass();
                OfferDetailsSheetKt.MessageButton(Updater.updateChangedFlags(1), (Composer) obj, modifier, str);
                break;
            case 15:
                ((Integer) obj2).getClass();
                MessageFileKt.MessageTimestamp(Updater.updateChangedFlags(1), (Composer) obj, modifier, str);
                break;
            case 16:
                ((Integer) obj2).getClass();
                ListItemKt.GifWebView(Updater.updateChangedFlags(7), (Composer) obj, modifier, str);
                break;
            default:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    Painter painterResource = Countries.painterResource(R.drawable.stripe_ic_add, 0, gapComposer3);
                    long j = ((FinancialConnectionsColors) gapComposer3.consume(ThemeKt.LocalColors)).iconTint;
                    ImageKt.Image(painterResource, this.f$0, this.f$1, null, null, RecyclerView.DECELERATION_RATE, new BlendModeColorFilter(j, 5, new android.graphics.BlendModeColorFilter(ColorKt.m694toArgb8_81llA(j), ColorKt.m693toAndroidBlendModes9anfk8(5))), gapComposer3, Painter.$stable | MLKEMEngine.KyberPolyBytes, 56);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ PoolCreateViewKt$$ExternalSyntheticLambda4(Modifier modifier, String str, int i, int i2) {
        this.$r8$classId = i2;
        this.f$1 = modifier;
        this.f$0 = str;
    }

    public /* synthetic */ PoolCreateViewKt$$ExternalSyntheticLambda4(String str, Modifier modifier, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = str;
        this.f$1 = modifier;
    }
}
