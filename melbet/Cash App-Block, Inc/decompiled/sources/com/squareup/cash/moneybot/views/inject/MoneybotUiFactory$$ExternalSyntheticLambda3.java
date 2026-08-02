package com.squareup.cash.moneybot.views.inject;

import androidx.compose.foundation.layout.RowScope;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.semantics.SemanticsModifierKt;
import androidx.compose.ui.text.TextStyle;
import androidx.room.Room;
import app.cash.broadway.ui.compose.ChromeConfigKt;
import app.cash.broadway.ui.compose.ChromeSystemIconColor;
import bo.app.re$$ExternalSyntheticOutline0;
import com.braze.ui.UserJavascriptInterfaceBase$$ExternalSyntheticLambda5;
import com.plaid.internal.EnumC0170g;
import com.squareup.cash.R;
import com.squareup.cash.arcade.ColorsDarkKt;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.borrow.views.BorrowUiFactory$$ExternalSyntheticLambda1;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.protos.franklin.investing.common.HistoricalRange;
import defpackage.Drop$$ExternalSyntheticBUOutline0;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function4;

/* loaded from: classes6.dex */
public final /* synthetic */ class MoneybotUiFactory$$ExternalSyntheticLambda3 implements Function4 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ Object f$1;

    public /* synthetic */ MoneybotUiFactory$$ExternalSyntheticLambda3(ComposableLambdaImpl composableLambdaImpl, boolean z) {
        this.f$0 = z;
        this.f$1 = composableLambdaImpl;
    }

    @Override // kotlin.jvm.functions.Function4
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        int i2;
        String str;
        int i3;
        int i4 = this.$r8$classId;
        boolean z = this.f$0;
        Object obj5 = this.f$1;
        switch (i4) {
            case 0:
                ComposableLambdaImpl composableLambdaImpl = (ComposableLambdaImpl) obj5;
                Function1 function1 = (Function1) obj2;
                Composer composer = (Composer) obj3;
                int intValue = ((Integer) obj4).intValue();
                function1.getClass();
                if ((intValue & 6) == 0) {
                    i = ((intValue & 8) == 0 ? ((GapComposer) composer).changed(obj) : ((GapComposer) composer).changedInstance(obj) ? 4 : 2) | intValue;
                } else {
                    i = intValue;
                }
                if ((intValue & 48) == 0) {
                    i |= ((GapComposer) composer).changedInstance(function1) ? 32 : 16;
                }
                GapComposer gapComposer = (GapComposer) composer;
                if (!gapComposer.shouldExecute(i & 1, (i & 147) != 146)) {
                    gapComposer.skipToGroupEnd();
                } else if (z) {
                    gapComposer.startReplaceGroup(1613233245);
                    ChromeConfigKt.ChromeConfig(ChromeSystemIconColor.ALWAYS_LIGHT, (Boolean) null, gapComposer, 6, 14);
                    ArcadeThemeKt.ArcadeTheme(ColorsDarkKt.colorsDark, null, null, Expect_jvmKt.rememberComposableLambda(-1555272303, new BorrowUiFactory$$ExternalSyntheticLambda1(composableLambdaImpl, obj, function1, 2), gapComposer), gapComposer, 3072, 6);
                    gapComposer.end(false);
                } else {
                    gapComposer.startReplaceGroup(1613388462);
                    composableLambdaImpl.invoke(obj, function1, gapComposer, Integer.valueOf(i & EnumC0170g.SDK_ASSET_PLAID_LOGO_BLACK_BG_VALUE));
                    gapComposer.end(false);
                }
                break;
            default:
                HistoricalRange historicalRange = (HistoricalRange) obj5;
                Composer composer2 = (Composer) obj3;
                ((Integer) obj4).getClass();
                ((RowScope) obj).getClass();
                int ordinal = historicalRange.ordinal();
                if (ordinal == 0) {
                    i2 = R.string.investing_graph_1_day_contentdescription;
                } else if (ordinal == 1) {
                    i2 = R.string.investing_graph_1_week_contentdescription;
                } else if (ordinal == 2) {
                    i2 = R.string.investing_graph_1_month_contentdescription;
                } else if (ordinal == 3) {
                    i2 = R.string.investing_graph_1_year_contentdescription;
                } else if (ordinal != 4) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    i2 = R.string.investing_graph_all_contentdescription;
                }
                String stringResource = Room.stringResource(composer2, i2);
                if (z) {
                    GapComposer gapComposer2 = (GapComposer) composer2;
                    str = re$$ExternalSyntheticOutline0.m(gapComposer2, 1636186553, R.string.investing_graph_selected, gapComposer2, false);
                } else {
                    GapComposer gapComposer3 = (GapComposer) composer2;
                    gapComposer3.startReplaceGroup(-817771243);
                    gapComposer3.end(false);
                    str = null;
                }
                int ordinal2 = historicalRange.ordinal();
                if (ordinal2 == 0) {
                    i3 = R.string.investing_graph_1_day;
                } else if (ordinal2 == 1) {
                    i3 = R.string.investing_graph_1_week;
                } else if (ordinal2 == 2) {
                    i3 = R.string.investing_graph_1_month;
                } else if (ordinal2 == 3) {
                    i3 = R.string.investing_graph_1_year;
                } else if (ordinal2 != 4) {
                    Drop$$ExternalSyntheticBUOutline0.m1m();
                    break;
                } else {
                    i3 = R.string.investing_graph_all;
                }
                String stringResource2 = Room.stringResource(composer2, i3);
                GapComposer gapComposer4 = (GapComposer) composer2;
                boolean changed = gapComposer4.changed(stringResource) | gapComposer4.changed(str);
                Object rememberedValue = gapComposer4.rememberedValue();
                if (changed || rememberedValue == Composer.Companion.Empty) {
                    rememberedValue = new UserJavascriptInterfaceBase$$ExternalSyntheticLambda5(stringResource, str, 24);
                    gapComposer4.updateRememberedValue(rememberedValue);
                }
                Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4092, 0L, (Composer) gapComposer4, SemanticsModifierKt.semantics(Modifier.Companion.$$INSTANCE, false, (Function1) rememberedValue), (TextStyle) null, (TextLineBalancing) null, stringResource2, (Map) null, (Function1) null, false);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ MoneybotUiFactory$$ExternalSyntheticLambda3(HistoricalRange historicalRange, boolean z) {
        this.f$1 = historicalRange;
        this.f$0 = z;
    }
}
