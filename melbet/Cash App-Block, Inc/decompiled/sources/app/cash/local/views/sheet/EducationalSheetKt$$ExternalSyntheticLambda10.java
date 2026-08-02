package app.cash.local.views.sheet;

import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import app.cash.local.viewmodels.sheet.EducationalSheetModel;
import com.fillr.browsersdk.model.FillrWidgetVersion;
import com.squareup.cash.bugreporting.views.BugReportingViewKt;
import com.squareup.cash.shopping.views.ShopErrorKt;
import com.stripe.android.model.LinkBrand;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class EducationalSheetKt$$ExternalSyntheticLambda10 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ int f$2;
    public final /* synthetic */ Function f$3;
    public final /* synthetic */ boolean f$4;
    public final /* synthetic */ boolean f$5;

    public /* synthetic */ EducationalSheetKt$$ExternalSyntheticLambda10(Modifier modifier, EducationalSheetModel.Button button, int i, Function1 function1, boolean z, boolean z2, int i2) {
        this.f$0 = modifier;
        this.f$1 = button;
        this.f$2 = i;
        this.f$3 = function1;
        this.f$4 = z;
        this.f$5 = z2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$2;
        Function function = this.f$3;
        Object obj3 = this.f$1;
        Object obj4 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(7);
                LoyaltySheetKt.EducationalButton((Modifier) obj4, (EducationalSheetModel.Button) obj3, this.f$2, (Function1) function, this.f$4, this.f$5, (Composer) obj, updateChangedFlags);
                break;
            case 1:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(i2 | 1);
                BugReportingViewKt.ProblemSection((String) obj4, (String) obj3, this.f$4, this.f$5, (Function1) function, (Composer) obj, updateChangedFlags2);
                break;
            case 2:
                ((Integer) obj2).getClass();
                int updateChangedFlags3 = Updater.updateChangedFlags(i2 | 1);
                ShopErrorKt.NavigationButtons((Modifier) obj4, (Function0) obj3, (Function0) function, this.f$4, this.f$5, (Composer) obj, updateChangedFlags3);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags4 = Updater.updateChangedFlags(1);
                FillrWidgetVersion.Footer(this.f$4, this.f$5, this.f$2, (LinkBrand) obj4, (Function0) obj3, (Function0) function, (Composer) obj, updateChangedFlags4);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ EducationalSheetKt$$ExternalSyntheticLambda10(Modifier modifier, Function0 function0, Function0 function02, boolean z, boolean z2, int i) {
        this.f$0 = modifier;
        this.f$1 = function0;
        this.f$3 = function02;
        this.f$4 = z;
        this.f$5 = z2;
        this.f$2 = i;
    }

    public /* synthetic */ EducationalSheetKt$$ExternalSyntheticLambda10(String str, String str2, boolean z, boolean z2, Function1 function1, int i) {
        this.f$0 = str;
        this.f$1 = str2;
        this.f$4 = z;
        this.f$5 = z2;
        this.f$3 = function1;
        this.f$2 = i;
    }

    public /* synthetic */ EducationalSheetKt$$ExternalSyntheticLambda10(boolean z, boolean z2, int i, LinkBrand linkBrand, Function0 function0, Function0 function02, int i2) {
        this.f$4 = z;
        this.f$5 = z2;
        this.f$2 = i;
        this.f$0 = linkBrand;
        this.f$1 = function0;
        this.f$3 = function02;
    }
}
