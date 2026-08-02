package com.squareup.cash.bitcoin.views.map;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.internal.Expect_jvmKt;
import androidx.compose.ui.graphics.painter.Painter;
import app.cash.local.views.map.BrandSheetViewKt$$ExternalSyntheticLambda6;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.R;
import com.squareup.cash.arcade.ColorsDarkKt;
import com.squareup.cash.arcade.ColorsLightKt;
import com.squareup.cash.arcade.components.ModalKt;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.common.composeui.VisibleKt;
import com.squareup.cash.money.views.MoneyTabUIKt$$ExternalSyntheticLambda38;
import com.squareup.cash.mooncake.compose_ui.MooncakeTheme;
import com.squareup.util.cash.Countries;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class BitcoinMapOnboardingViewKt$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ boolean f$0;
    public final /* synthetic */ Function1 f$1;

    public /* synthetic */ BitcoinMapOnboardingViewKt$$ExternalSyntheticLambda1(boolean z, Function1 function1, int i) {
        this.$r8$classId = i;
        this.f$0 = z;
        this.f$1 = function1;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i;
        int i2;
        String str;
        int i3 = this.$r8$classId;
        Function1 function1 = this.f$1;
        boolean z = this.f$0;
        int i4 = 2;
        switch (i3) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(intValue & 1, (intValue & 3) != 2)) {
                    if (z) {
                        i = -522423426;
                        i2 = R.string.bitcoin_views_map_onboarding_title;
                    } else {
                        i = -522337029;
                        i2 = R.string.bitcoin_views_map_onboarding_title_ny;
                    }
                    String m = re$$ExternalSyntheticOutline0.m(gapComposer, i, i2, gapComposer, false);
                    if (z) {
                        str = re$$ExternalSyntheticOutline0.m(gapComposer, -522205217, R.string.bitcoin_views_map_onboarding_body, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-522121579);
                        gapComposer.end(false);
                        str = null;
                    }
                    String str2 = str;
                    Painter painterResource = Countries.painterResource(2131231126, 0, gapComposer);
                    NavigationType navigationType = NavigationType.BACK;
                    boolean changed = gapComposer.changed(function1);
                    Object rememberedValue = gapComposer.rememberedValue();
                    if (changed || rememberedValue == Composer.Companion.Empty) {
                        rememberedValue = new BitcoinMapViewKt$$ExternalSyntheticLambda6(2, function1);
                        gapComposer.updateRememberedValue(rememberedValue);
                    }
                    VisibleKt.m3492InfoUpsellvCkY0N0(m, painterResource, null, null, str2, navigationType, (Function0) rememberedValue, Expect_jvmKt.rememberComposableLambda(-1585722307, new BrandSheetViewKt$$ExternalSyntheticLambda6(27, function1), gapComposer), Expect_jvmKt.rememberComposableLambda(1389263559, new MoneyTabUIKt$$ExternalSyntheticLambda38(z, i4), gapComposer), gapComposer, (Painter.$stable << 3) | 113442816, 12);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    ArcadeThemeKt.ArcadeTheme(MooncakeTheme.getColors(gapComposer2).isLight ? ColorsLightKt.colorsLight : ColorsDarkKt.colorsDark, null, null, Expect_jvmKt.rememberComposableLambda(-1675187374, new BitcoinMapOnboardingViewKt$$ExternalSyntheticLambda1(z, function1, i4), gapComposer2), gapComposer2, 3072, 6);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 2:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    ModalKt.Toggle(this.f$0, null, this.f$1, true, null, gapComposer3, 0, 18);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
            default:
                Composer composer4 = (Composer) obj;
                int intValue4 = ((Integer) obj2).intValue();
                GapComposer gapComposer4 = (GapComposer) composer4;
                if (gapComposer4.shouldExecute(intValue4 & 1, (intValue4 & 3) != 2)) {
                    ModalKt.Toggle(this.f$0, null, this.f$1, false, null, gapComposer4, 0, 26);
                } else {
                    gapComposer4.skipToGroupEnd();
                }
                break;
        }
        return Unit.INSTANCE;
    }
}
