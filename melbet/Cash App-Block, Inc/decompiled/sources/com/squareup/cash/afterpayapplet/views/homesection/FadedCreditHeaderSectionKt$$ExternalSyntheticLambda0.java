package com.squareup.cash.afterpayapplet.views.homesection;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.afterpayapplet.viewmodels.AfterpayAppletHomeContentViewModel;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class FadedCreditHeaderSectionKt$$ExternalSyntheticLambda0 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AfterpayAppletHomeContentViewModel.HomeSection.CreditSectionHeader.FadedCreditHeader f$0;

    public /* synthetic */ FadedCreditHeaderSectionKt$$ExternalSyntheticLambda0(AfterpayAppletHomeContentViewModel.HomeSection.CreditSectionHeader.FadedCreditHeader fadedCreditHeader, int i) {
        this.$r8$classId = i;
        this.f$0 = fadedCreditHeader;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        AfterpayAppletHomeContentViewModel.HomeSection.CreditSectionHeader.FadedCreditHeader fadedCreditHeader = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                    String str = fadedCreditHeader.titleText;
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, colors.semantic.text.disabled, (Composer) gapComposer, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str, (Map) null, (Function1) null, false);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(1 & intValue2, (intValue2 & 3) != 2)) {
                    String str2 = fadedCreditHeader.subtitleText;
                    Colors colors2 = (Colors) gapComposer2.consume(ArcadeThemeKt.LocalColors);
                    if (colors2 == null) {
                        colors2 = re$$ExternalSyntheticOutline0.m(gapComposer2, -1762997026, gapComposer2, false);
                    } else {
                        gapComposer2.startReplaceGroup(-1762997739);
                        gapComposer2.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4086, colors2.semantic.text.disabled, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, str2, (Map) null, (Function1) null, false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 2:
                ((Integer) obj2).getClass();
                LegalSectionKt.FadedCreditSection(fadedCreditHeader, (Composer) obj, Updater.updateChangedFlags(1));
                break;
            case 3:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(1 & intValue3, (intValue3 & 3) != 2)) {
                    String str3 = fadedCreditHeader.titleText;
                    TextStyle textStyle = ((Typography) gapComposer3.consume(ArcadeThemeKt.LocalTypography)).titleBarPageTitle;
                    Colors colors3 = (Colors) gapComposer3.consume(ArcadeThemeKt.LocalColors);
                    if (colors3 == null) {
                        colors3 = re$$ExternalSyntheticOutline0.m(gapComposer3, -1762997026, gapComposer3, false);
                    } else {
                        gapComposer3.startReplaceGroup(-1762997739);
                        gapComposer3.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors3.semantic.text.disabled, (Composer) gapComposer3, (Modifier) null, textStyle, (TextLineBalancing) null, str3, (Map) null, (Function1) null, false);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
            case 4:
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(1 & intValue4, (intValue4 & 3) != 2)) {
                    String str4 = fadedCreditHeader.subtitleText;
                    TextStyle textStyle2 = ((Typography) gapComposer4.consume(ArcadeThemeKt.LocalTypography)).bodySmall;
                    Colors colors4 = (Colors) gapComposer4.consume(ArcadeThemeKt.LocalColors);
                    if (colors4 == null) {
                        colors4 = re$$ExternalSyntheticOutline0.m(gapComposer4, -1762997026, gapComposer4, false);
                    } else {
                        gapComposer4.startReplaceGroup(-1762997739);
                        gapComposer4.end(false);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4082, colors4.semantic.text.disabled, (Composer) gapComposer4, (Modifier) null, textStyle2, (TextLineBalancing) null, str4, (Map) null, (Function1) null, false);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                LegalSectionKt.FadedHeader(fadedCreditHeader, (Composer) obj, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ FadedCreditHeaderSectionKt$$ExternalSyntheticLambda0(AfterpayAppletHomeContentViewModel.HomeSection.CreditSectionHeader.FadedCreditHeader fadedCreditHeader, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = fadedCreditHeader;
    }
}
