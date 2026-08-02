package androidx.compose.material3;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import app.cash.local.views.wallet.WalletWidgetKt;
import com.squareup.cash.maps.views.CashMapViewKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class DatePickerKt$$ExternalSyntheticLambda22 implements Function2 {
    public final /* synthetic */ int $r8$classId = 1;
    public final /* synthetic */ Function0 f$0;
    public final /* synthetic */ boolean f$1;
    public final /* synthetic */ Modifier f$2;
    public final /* synthetic */ ComposableLambdaImpl f$3;
    public final /* synthetic */ int f$4;

    public /* synthetic */ DatePickerKt$$ExternalSyntheticLambda22(Modifier modifier, Function0 function0, boolean z, ComposableLambdaImpl composableLambdaImpl, int i) {
        this.f$2 = modifier;
        this.f$0 = function0;
        this.f$1 = z;
        this.f$3 = composableLambdaImpl;
        this.f$4 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$4;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                DatePickerKt.YearPickerMenuButton(Updater.updateChangedFlags(i2 | 1), (Composer) obj, this.f$3, this.f$2, this.f$0, this.f$1);
                break;
            case 1:
                ((Integer) obj2).getClass();
                WalletWidgetKt.WalletWidget(Updater.updateChangedFlags(i2 | 1), (Composer) obj, this.f$3, this.f$2, this.f$0, this.f$1);
                break;
            default:
                ((Integer) obj2).getClass();
                CashMapViewKt.ArcadeMapIconButton(Updater.updateChangedFlags(385), this.f$4, (Composer) obj, this.f$3, this.f$2, this.f$0, this.f$1);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ DatePickerKt$$ExternalSyntheticLambda22(Function0 function0, Modifier modifier, boolean z, ComposableLambdaImpl composableLambdaImpl, int i, int i2) {
        this.f$2 = modifier;
        this.f$0 = function0;
        this.f$3 = composableLambdaImpl;
        this.f$1 = z;
        this.f$4 = i2;
    }

    public /* synthetic */ DatePickerKt$$ExternalSyntheticLambda22(Function0 function0, boolean z, Modifier modifier, ComposableLambdaImpl composableLambdaImpl, int i) {
        this.f$0 = function0;
        this.f$1 = z;
        this.f$2 = modifier;
        this.f$3 = composableLambdaImpl;
        this.f$4 = i;
    }
}
