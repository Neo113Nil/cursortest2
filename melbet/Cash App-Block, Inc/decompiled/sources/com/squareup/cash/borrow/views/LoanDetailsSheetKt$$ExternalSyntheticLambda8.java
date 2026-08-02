package com.squareup.cash.borrow.views;

import androidx.camera.video.Recorder$$ExternalSyntheticOutline2;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.text.TextStyle;
import androidx.compose.ui.viewinterop.AndroidView_androidKt;
import androidx.room.Room;
import androidx.tracing.Trace;
import app.cash.local.viewmodels.pos.LocalPosLocalCashRedemptionViewModel;
import app.cash.local.views.map.LocalMapPinKt$$ExternalSyntheticLambda5;
import app.cash.local.views.pos.LocalPosCheckInViewKt;
import com.google.mlkit.common.internal.zzd;
import com.nimbusds.jose.util.X509CertChainUtils;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel;
import com.squareup.cash.arcade.Icons;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.arcade.util.ThemablesKt;
import com.squareup.cash.borrow.viewmodels.BorrowHomeOverlayViewModel;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.investing.db.InvestmentEntityQueries$$ExternalSyntheticLambda1;
import com.squareup.cash.investingcrypto.viewmodels.common.InvestingCryptoAvatarContentModel$Icon;
import com.squareup.cash.portfolio.graphs.views.InvestingGraphTabsViewKt;
import com.squareup.cash.prepurchasecashcard.viewmodels.PrepurchaseCashCardPlanningViewModel;
import com.squareup.protos.cash.localization.LocalizedString;
import com.squareup.protos.lending.sync_values.BorrowAppletBulletinsTile;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class LoanDetailsSheetKt$$ExternalSyntheticLambda8 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ long f$1;

    public /* synthetic */ LoanDetailsSheetKt$$ExternalSyntheticLambda8(Object obj, long j, int i) {
        this.$r8$classId = i;
        this.f$0 = obj;
        this.f$1 = j;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        TextStyle textStyle;
        int i = this.$r8$classId;
        long j = this.f$1;
        Object obj3 = this.f$0;
        switch (i) {
            case 0:
                BorrowHomeOverlayViewModel.LoanDetails loanDetails = (BorrowHomeOverlayViewModel.LoanDetails) obj3;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, this.f$1, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, loanDetails.secondaryText, (Map) null, (Function1) null, false);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                LocalPosCheckInViewKt.m1329CouponRPmYEkk((LocalPosLocalCashRedemptionViewModel.Coupon) obj3, j, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            case 2:
                AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.IconText iconText = (AfterpayAppletHomeContentViewModel.HomeSection.SectionContent.IconText) obj3;
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    zzd zzdVar = Icons.Companion;
                    String str = iconText.tintedIcon.iconId;
                    zzdVar.getClass();
                    Icons icons = zzd.get(str);
                    if (icons != null) {
                        gapComposer2.startReplaceGroup(-890019680);
                        Modifier m285size3ABfNKs = SizeKt.m285size3ABfNKs(Modifier.Companion.$$INSTANCE, 24.0f);
                        Color forTheme = ThemablesKt.forTheme(iconText.tintedIcon.iconTintColor, gapComposer2);
                        if (forTheme != null) {
                            j = forTheme.value;
                        }
                        Trace.m1191Iconww6aTOc(icons, (String) null, m285size3ABfNKs, j, gapComposer2, 432, 0);
                        gapComposer2.end(false);
                    } else {
                        gapComposer2.startReplaceGroup(-889796728);
                        gapComposer2.end(false);
                    }
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 3:
                BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet.Bullet bullet = (BorrowAppletBulletinsTile.Data.Bulletin.InfoSheet.Bullet) obj3;
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    LocalizedString localizedString = bullet.text;
                    localizedString.getClass();
                    String str2 = localizedString.translated_value;
                    str2.getClass();
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, this.f$1, (Composer) gapComposer3, (Modifier) null, ((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).bodyMedium, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 4:
                X509CertChainUtils x509CertChainUtils = (X509CertChainUtils) obj3;
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    Object rememberedValue = gapComposer4.rememberedValue();
                    NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = new InvestmentEntityQueries$$ExternalSyntheticLambda1(9);
                        gapComposer4.updateRememberedValue(rememberedValue);
                    }
                    Function1 function1 = (Function1) rememberedValue;
                    Object rememberedValue2 = gapComposer4.rememberedValue();
                    if (rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new InvestmentEntityQueries$$ExternalSyntheticLambda1(10);
                        gapComposer4.updateRememberedValue(rememberedValue2);
                    }
                    Function1 function12 = (Function1) rememberedValue2;
                    boolean changedInstance = gapComposer4.changedInstance(x509CertChainUtils) | gapComposer4.changed(j);
                    Object rememberedValue3 = gapComposer4.rememberedValue();
                    if (changedInstance || rememberedValue3 == neverEqualPolicy) {
                        rememberedValue3 = new LocalMapPinKt$$ExternalSyntheticLambda5(x509CertChainUtils, j, 10);
                        gapComposer4.updateRememberedValue(rememberedValue3);
                    }
                    AndroidView_androidKt.AndroidView(function1, null, function12, null, (Function1) rememberedValue3, gapComposer4, 390, 10);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                InvestingGraphTabsViewKt.m3723SubtitleIconRPmYEkk((InvestingCryptoAvatarContentModel$Icon) obj3, j, (Composer) obj, Updater.updateChangedFlags(1));
                return Unit.INSTANCE;
            default:
                PrepurchaseCashCardPlanningViewModel.PrepurchaseCardInfoSheet.TextBlockListItem textBlockListItem = (PrepurchaseCashCardPlanningViewModel.PrepurchaseCardInfoSheet.TextBlockListItem) obj3;
                Composer composer5 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    String str3 = textBlockListItem.leadingText;
                    int ordinal = textBlockListItem.style.ordinal();
                    if (ordinal == 0) {
                        gapComposer5.startReplaceGroup(-830662160);
                        textStyle = (TextStyle) gapComposer5.consume(ArcadeThemeKt.LocalTextStyle);
                        if (textStyle == null) {
                            gapComposer5.startReplaceGroup(-1100573765);
                            textStyle = ((Typography) gapComposer5.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                        } else {
                            gapComposer5.startReplaceGroup(-1100574912);
                        }
                        gapComposer5.end(false);
                        gapComposer5.end(false);
                    } else {
                        if (ordinal != 1) {
                            throw Recorder$$ExternalSyntheticOutline2.m(gapComposer5, -830665016, false);
                        }
                        gapComposer5.startReplaceGroup(-830658933);
                        textStyle = ((Typography) gapComposer5.consume(ArcadeThemeKt.LocalTypography)).labelMedium;
                        gapComposer5.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, this.f$1, (Composer) gapComposer5, (Modifier) null, textStyle, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                return Unit.INSTANCE;
        }
    }

    public /* synthetic */ LoanDetailsSheetKt$$ExternalSyntheticLambda8(Object obj, long j, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = j;
    }
}
