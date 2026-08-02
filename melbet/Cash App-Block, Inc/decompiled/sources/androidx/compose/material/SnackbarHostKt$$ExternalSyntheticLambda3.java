package androidx.compose.material;

import androidx.compose.foundation.text.AndroidCursorHandle_androidKt;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import app.cash.local.views.brand.menu.LocalCaloriesTextKt;
import com.squareup.cash.card.onboarding.graphics.FlowsKt;
import com.squareup.cash.datefilterbar.views.DateFilterBarShimmerKt;
import com.squareup.cash.earningstracker.views.components.LoadingErrorKt;
import com.squareup.cash.graphics.views.AnimationsKt;
import com.squareup.cash.money.views.MoneyTabThemedHeaderKt;
import com.squareup.cash.payments.views.personalization.AlphaKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class SnackbarHostKt$$ExternalSyntheticLambda3 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Modifier f$1;
    public final /* synthetic */ int f$3;

    public /* synthetic */ SnackbarHostKt$$ExternalSyntheticLambda3(Modifier modifier, int i, int i2) {
        this.$r8$classId = 2;
        this.f$1 = modifier;
        this.f$3 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$3;
        Modifier modifier = this.f$1;
        Composer composer = (Composer) obj;
        ((Integer) obj2).getClass();
        switch (i) {
            case 0:
                CardKt.FadeInFadeOutWithScale(modifier, composer, Updater.updateChangedFlags(i2 | 1));
                break;
            case 1:
                AndroidCursorHandle_androidKt.DefaultCursorHandle(Updater.updateChangedFlags(1), i2, composer, modifier);
                break;
            case 2:
                LocalCaloriesTextKt.LocalCaloriesText(i2, Updater.updateChangedFlags(1), composer, modifier);
                break;
            case 3:
                FlowsKt.HoloBackground(modifier, composer, Updater.updateChangedFlags(i2 | 1));
                break;
            case 4:
                DateFilterBarShimmerKt.DateFilterBarShimmer(Updater.updateChangedFlags(1), i2, composer, modifier);
                break;
            case 5:
                LoadingErrorKt.KeyStatsShimmer(Updater.updateChangedFlags(1), i2, composer, modifier);
                break;
            case 6:
                LoadingErrorKt.TopCustomersShimmer(Updater.updateChangedFlags(1), i2, composer, modifier);
                break;
            case 7:
                AnimationsKt.GlitterBackground(Updater.updateChangedFlags(1), i2, composer, modifier);
                break;
            case 8:
                MoneyTabThemedHeaderKt.MoodCardHeader(modifier, composer, Updater.updateChangedFlags(i2 | 1));
                break;
            case 9:
                MoneyTabThemedHeaderKt.GlitterCardHeader(modifier, composer, Updater.updateChangedFlags(i2 | 1));
                break;
            case 10:
                MoneyTabThemedHeaderKt.HoloCardHeader(modifier, composer, Updater.updateChangedFlags(i2 | 1));
                break;
            case 11:
                MoneyTabThemedHeaderKt.BlackMetalCardHeader(modifier, composer, Updater.updateChangedFlags(i2 | 1));
                break;
            case 12:
                MoneyTabThemedHeaderKt.BratCardHeader(modifier, composer, Updater.updateChangedFlags(i2 | 1));
                break;
            case 13:
                MoneyTabThemedHeaderKt.TortoiseCardHeader(modifier, composer, Updater.updateChangedFlags(i2 | 1));
                break;
            case 14:
                MoneyTabThemedHeaderKt.BlackCardHeader(modifier, composer, Updater.updateChangedFlags(i2 | 1));
                break;
            case 15:
                MoneyTabThemedHeaderKt.PinkCardHeader(modifier, composer, Updater.updateChangedFlags(i2 | 1));
                break;
            case 16:
                MoneyTabThemedHeaderKt.GlowCardHeader(modifier, composer, Updater.updateChangedFlags(i2 | 1));
                break;
            case 17:
                MoneyTabThemedHeaderKt.ChameleonCardHeader(modifier, composer, Updater.updateChangedFlags(i2 | 1));
                break;
            case 18:
                MoneyTabThemedHeaderKt.WhiteCardHeader(modifier, composer, Updater.updateChangedFlags(i2 | 1));
                break;
            default:
                AlphaKt.Alpha(modifier, composer, Updater.updateChangedFlags(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ SnackbarHostKt$$ExternalSyntheticLambda3(Modifier modifier, int i, int i2, byte b) {
        this.$r8$classId = i2;
        this.f$1 = modifier;
        this.f$3 = i;
    }

    public /* synthetic */ SnackbarHostKt$$ExternalSyntheticLambda3(Modifier modifier, int i, int i2, int i3) {
        this.$r8$classId = i3;
        this.f$1 = modifier;
        this.f$3 = i2;
    }
}
