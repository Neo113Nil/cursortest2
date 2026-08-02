package app.cash.local.views.internal;

import androidx.compose.foundation.ImageKt;
import androidx.compose.foundation.layout.SizeKt;
import androidx.compose.foundation.pager.PagerKt;
import androidx.compose.material.TextKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.NeverEqualPolicy;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.painter.Painter;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import com.squareup.cash.account.components.AccountSettingsKt;
import com.squareup.cash.bitcoin.views.applet.education.BitcoinStoriesWidgetViewKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.moneybot.views.plugins.TextCardKt;
import com.squareup.cash.offers.views.home.OffersHeroTileKt;
import com.squareup.cash.support.chat.views.ChatExitPromptViewKt;
import com.squareup.cash.tabs.views.TabToolbarsKt$$ExternalSyntheticLambda28;
import com.squareup.util.cash.Countries;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsColors;
import com.stripe.android.financialconnections.ui.theme.FinancialConnectionsTypography;
import com.stripe.android.financialconnections.ui.theme.ThemeKt;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class LocalCombinedViewsKt$$ExternalSyntheticLambda3 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ int f$0;

    public /* synthetic */ LocalCombinedViewsKt$$ExternalSyntheticLambda3(int i) {
        this.$r8$classId = 9;
        this.f$0 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        NeverEqualPolicy neverEqualPolicy = Composer.Companion.Empty;
        Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
        int i2 = this.f$0;
        switch (i) {
            case 0:
                ComposableLambdaImpl composableLambdaImpl = LocalMapKt.lambda$1673300566;
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    for (int i3 = 0; i3 < i2; i3++) {
                        composableLambdaImpl.invoke((Object) gapComposer, (Object) 0);
                    }
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                int intValue2 = ((Integer) obj).intValue();
                int intValue3 = ((Integer) obj2).intValue();
                int abs = Math.abs(intValue2 - i2) - Math.abs(intValue3 - i2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                AccountSettingsKt.SettingsLoading((Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 3:
                ((Integer) obj2).getClass();
                PagerKt.LoadingBalanceContent((Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 4:
                ((Integer) obj2).getClass();
                BitcoinStoriesWidgetViewKt.FillRemainingTiles(i2, Updater.updateChangedFlags(7), (Composer) obj);
                break;
            case 5:
                Composer composer2 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer2, i2), (Map) null, (Function1) null, false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 6:
                Composer composer3 = (Composer) obj;
                int intValue5 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue5 & 1, (intValue5 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer3, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer3, i2), (Map) null, (Function1) null, false);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
            case 7:
                Composer composer4 = (Composer) obj;
                int intValue6 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue6 & 1, (intValue6 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer4, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer4, i2), (Map) null, (Function1) null, false);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                break;
            case 8:
                Composer composer5 = (Composer) obj;
                int intValue7 = ((Integer) obj2).intValue();
                GapComposer gapComposer5 = (GapComposer) composer5;
                if (gapComposer5.shouldExecute(intValue7 & 1, (intValue7 & 3) != 2)) {
                    ImageKt.Image(Countries.painterResource(i2, 0, gapComposer5), null, SizeKt.m285size3ABfNKs(companion, 48.0f), null, null, RecyclerView.DECELERATION_RATE, null, gapComposer5, Painter.$stable | 432, 120);
                } else {
                    gapComposer5.skipToGroupEnd();
                }
                break;
            case 9:
                ((Integer) obj2).getClass();
                TextCardKt.LoadingGenieCard((Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 10:
                ((Integer) obj2).getClass();
                OffersHeroTileKt.Dimmer((Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            case 11:
                Composer composer6 = (Composer) obj;
                int intValue8 = ((Integer) obj2).intValue();
                GapComposer gapComposer6 = (GapComposer) composer6;
                if (gapComposer6.shouldExecute(intValue8 & 1, (intValue8 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer6, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, Room.stringResource(gapComposer6, i2), (Map) null, (Function1) null, false);
                } else {
                    gapComposer6.skipToGroupEnd();
                }
                break;
            case 12:
                ((Integer) obj2).getClass();
                ChatExitPromptViewKt.Loading(i2, Updater.updateChangedFlags(1), (Composer) obj);
                break;
            case 13:
                Composer composer7 = (Composer) obj;
                int intValue9 = ((Integer) obj2).intValue();
                GapComposer gapComposer7 = (GapComposer) composer7;
                if (gapComposer7.shouldExecute(1 & intValue9, (intValue9 & 3) != 2)) {
                    String stringResource = Room.stringResource(gapComposer7, i2);
                    Object rememberedValue = gapComposer7.rememberedValue();
                    if (rememberedValue == neverEqualPolicy) {
                        rememberedValue = new TabToolbarsKt$$ExternalSyntheticLambda28(15);
                        gapComposer7.updateRememberedValue(rememberedValue);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4092, 0L, (Composer) gapComposer7, SemanticsModifierKt.semantics(companion, false, (Function1) rememberedValue), (TextStyle) null, (TextLineBalancing) null, stringResource, (Map) null, (Function1) null, false);
                } else {
                    gapComposer7.skipToGroupEnd();
                }
                break;
            case 14:
                Composer composer8 = (Composer) obj;
                int intValue10 = ((Integer) obj2).intValue();
                GapComposer gapComposer8 = (GapComposer) composer8;
                if (gapComposer8.shouldExecute(1 & intValue10, (intValue10 & 3) != 2)) {
                    String stringResource2 = Room.stringResource(gapComposer8, i2);
                    Object rememberedValue2 = gapComposer8.rememberedValue();
                    if (rememberedValue2 == neverEqualPolicy) {
                        rememberedValue2 = new TabToolbarsKt$$ExternalSyntheticLambda28(14);
                        gapComposer8.updateRememberedValue(rememberedValue2);
                    }
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4092, 0L, (Composer) gapComposer8, SemanticsModifierKt.semantics(companion, false, (Function1) rememberedValue2), (TextStyle) null, (TextLineBalancing) null, stringResource2, (Map) null, (Function1) null, false);
                } else {
                    gapComposer8.skipToGroupEnd();
                }
                break;
            default:
                Composer composer9 = (Composer) obj;
                int intValue11 = ((Integer) obj2).intValue();
                GapComposer gapComposer9 = (GapComposer) composer9;
                if (gapComposer9.shouldExecute(intValue11 & 1, (intValue11 & 3) != 2)) {
                    TextKt.m509Text4IGK_g(Room.stringResource(gapComposer9, i2), null, ((FinancialConnectionsColors) gapComposer9.consume(ThemeKt.LocalColors)).textSubdued, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, ((FinancialConnectionsTypography) gapComposer9.consume(ThemeKt.LocalTypography)).labelLarge, gapComposer9, 0, 0, 65530);
                } else {
                    gapComposer9.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ LocalCombinedViewsKt$$ExternalSyntheticLambda3(int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = i;
    }

    public /* synthetic */ LocalCombinedViewsKt$$ExternalSyntheticLambda3(int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$0 = i;
    }
}
