package com.squareup.cash.account.components.accountswitcher;

import androidx.compose.foundation.layout.SpacerKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.GapComposer;
import androidx.compose.runtime.StaticProvidableCompositionLocal;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import androidx.compose.ui.graphics.Color;
import androidx.compose.ui.graphics.ColorKt;
import androidx.compose.ui.text.TextStyle;
import androidx.recyclerview.widget.RecyclerView;
import androidx.room.Room;
import bo.app.re$$ExternalSyntheticOutline0;
import com.squareup.cash.account.viewmodels.accountswitcher.AccountViewModel;
import com.squareup.cash.arcade.Colors;
import com.squareup.cash.arcade.Typography;
import com.squareup.cash.arcade.theme.ArcadeThemeKt;
import com.squareup.cash.composeUi.foundation.text.TextLineBalancing;
import com.squareup.cash.profile.views.BadgeNameKt;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes5.dex */
public final /* synthetic */ class AccountSwitcherViewKt$$ExternalSyntheticLambda9 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ AccountViewModel f$0;

    public /* synthetic */ AccountSwitcherViewKt$$ExternalSyntheticLambda9(AccountViewModel accountViewModel, int i) {
        this.$r8$classId = 3;
        this.f$0 = accountViewModel;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        AccountViewModel accountViewModel = this.f$0;
        switch (i) {
            case 0:
                Composer composer = (Composer) obj;
                int intValue = ((Integer) obj2).intValue();
                GapComposer gapComposer = (GapComposer) composer;
                if (gapComposer.shouldExecute(1 & intValue, (intValue & 3) != 2)) {
                    String str = accountViewModel.title;
                    boolean z = accountViewModel.isBusiness;
                    Colors colors = (Colors) gapComposer.consume(ArcadeThemeKt.LocalColors);
                    if (colors == null) {
                        colors = re$$ExternalSyntheticOutline0.m(gapComposer, -1762997026, gapComposer, false);
                    } else {
                        gapComposer.startReplaceGroup(-1762997739);
                        gapComposer.end(false);
                    }
                    BadgeNameKt.m3727BadgeTitlefjcvTT8(null, str, z, 0L, null, 0L, colors.semantic.text.brand, gapComposer, 0);
                } else {
                    gapComposer.skipToGroupEnd();
                }
                break;
            case 1:
                Composer composer2 = (Composer) obj;
                int intValue2 = ((Integer) obj2).intValue();
                GapComposer gapComposer2 = (GapComposer) composer2;
                if (gapComposer2.shouldExecute(intValue2 & 1, (intValue2 & 3) != 2)) {
                    Room.m1165Text25TpFw(0, 0, 0, 0, 0, 0, 4094, 0L, (Composer) gapComposer2, (Modifier) null, (TextStyle) null, (TextLineBalancing) null, accountViewModel.subtitle, (Map) null, (Function1) null, false);
                } else {
                    gapComposer2.skipToGroupEnd();
                }
                break;
            case 2:
                Composer composer3 = (Composer) obj;
                int intValue3 = ((Integer) obj2).intValue();
                GapComposer gapComposer3 = (GapComposer) composer3;
                if (gapComposer3.shouldExecute(intValue3 & 1, (intValue3 & 3) != 2)) {
                    Modifier.Companion companion = Modifier.Companion.$$INSTANCE;
                    Modifier m302paddingqDBjuR0$default = SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, 16.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13);
                    String str2 = accountViewModel.title;
                    boolean z2 = accountViewModel.isBusiness;
                    long j = Color.White;
                    StaticProvidableCompositionLocal staticProvidableCompositionLocal = ArcadeThemeKt.LocalTypography;
                    BadgeTitleKt.m2971BadgeTitleU6WRak(m302paddingqDBjuR0$default, str2, z2, j, ((Typography) gapComposer3.consume(staticProvidableCompositionLocal)).header, 3, ((Typography) gapComposer3.consume(staticProvidableCompositionLocal)).header.spanStyle.fontSize, Room.getSp(8), gapComposer3, 12585990);
                    Room.m1165Text25TpFw(0, 1, 0, 3, 1572912, 0, 3760, ColorKt.Color(-4210753), (Composer) gapComposer3, SpacerKt.m302paddingqDBjuR0$default(companion, RecyclerView.DECELERATION_RATE, 4.0f, RecyclerView.DECELERATION_RATE, RecyclerView.DECELERATION_RATE, 13), ((Typography) gapComposer3.consume(staticProvidableCompositionLocal)).bodyMedium, (TextLineBalancing) null, accountViewModel.subtitle, (Map) null, (Function1) null, false);
                } else {
                    gapComposer3.skipToGroupEnd();
                }
                break;
            default:
                ((Integer) obj2).getClass();
                BadgeTitleKt.SwitchFullAccountLoadingContent(accountViewModel, (Composer) obj, Updater.updateChangedFlags(1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ AccountSwitcherViewKt$$ExternalSyntheticLambda9(AccountViewModel accountViewModel, int i, byte b) {
        this.$r8$classId = i;
        this.f$0 = accountViewModel;
    }
}
