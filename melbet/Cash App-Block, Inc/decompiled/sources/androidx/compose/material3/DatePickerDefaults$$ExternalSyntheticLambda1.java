package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.BiasAlignment;
import androidx.compose.ui.Modifier;
import com.google.android.gms.internal.common.zzj;
import com.squareup.cash.cdf.detailspage.DetailsPageInteractTapButton;
import com.squareup.cash.common.composeui.animations.HypeCountdownAnimationKt;
import com.squareup.cash.common.viewmodels.CashTagSymbol;
import com.squareup.cash.retro.views.PaymentPlanSummaryKt;
import com.squareup.protos.cash.discover.api.app.v1.model.Button;
import java.time.LocalDate;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class DatePickerDefaults$$ExternalSyntheticLambda1 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ int f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Modifier f$4;
    public final /* synthetic */ long f$5;

    public /* synthetic */ DatePickerDefaults$$ExternalSyntheticLambda1(DatePickerDefaults datePickerDefaults, Long l, int i, DatePickerFormatterImpl datePickerFormatterImpl, Modifier modifier, long j, int i2) {
        this.f$0 = datePickerDefaults;
        this.f$1 = l;
        this.f$2 = i;
        this.f$3 = datePickerFormatterImpl;
        this.f$4 = modifier;
        this.f$5 = j;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$2;
        Object obj3 = this.f$3;
        Object obj4 = this.f$1;
        Object obj5 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(199681);
                ((DatePickerDefaults) obj5).m522DatePickerHeadlineISIPfiY((Long) obj4, this.f$2, (DatePickerFormatterImpl) obj3, this.f$4, this.f$5, (Composer) obj, updateChangedFlags);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(i2 | 1);
                HypeCountdownAnimationKt.m3502HypeCountdownAnimationFHprtrg((CashTagSymbol) obj5, (LocalDate) obj4, this.f$4, this.f$5, (Function0) obj3, (Composer) obj, updateChangedFlags2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int updateChangedFlags3 = Updater.updateChangedFlags(i2 | 1);
                zzj.m2002Button8V94_ZQ((Button) obj5, this.f$5, (DetailsPageInteractTapButton.DetailsPageButtonLocation) obj4, (Function1) obj3, this.f$4, (Composer) obj, updateChangedFlags3);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags4 = Updater.updateChangedFlags(385);
                PaymentPlanSummaryKt.m3733TextStackyrwZFoE((String) obj5, (String) obj4, (BiasAlignment.Horizontal) obj3, this.f$4, this.f$5, (Composer) obj, updateChangedFlags4, this.f$2);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ DatePickerDefaults$$ExternalSyntheticLambda1(CashTagSymbol cashTagSymbol, LocalDate localDate, Modifier modifier, long j, Function0 function0, int i) {
        this.f$0 = cashTagSymbol;
        this.f$1 = localDate;
        this.f$4 = modifier;
        this.f$5 = j;
        this.f$3 = function0;
        this.f$2 = i;
    }

    public /* synthetic */ DatePickerDefaults$$ExternalSyntheticLambda1(Button button, long j, DetailsPageInteractTapButton.DetailsPageButtonLocation detailsPageButtonLocation, Function1 function1, Modifier modifier, int i) {
        this.f$0 = button;
        this.f$5 = j;
        this.f$1 = detailsPageButtonLocation;
        this.f$3 = function1;
        this.f$4 = modifier;
        this.f$2 = i;
    }

    public /* synthetic */ DatePickerDefaults$$ExternalSyntheticLambda1(String str, String str2, BiasAlignment.Horizontal horizontal, Modifier modifier, long j, int i, int i2) {
        this.f$0 = str;
        this.f$1 = str2;
        this.f$3 = horizontal;
        this.f$4 = modifier;
        this.f$5 = j;
        this.f$2 = i2;
    }
}
