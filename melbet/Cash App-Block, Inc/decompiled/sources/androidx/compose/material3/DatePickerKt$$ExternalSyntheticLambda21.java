package androidx.compose.material3;

import androidx.compose.foundation.lazy.LazyListState;
import androidx.compose.material3.internal.CalendarModelImpl;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.ui.Modifier;
import com.squareup.cash.bitcoin.views.applet.performance.BitcoinPerformanceSummaryViewKt;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;

/* loaded from: classes3.dex */
public final /* synthetic */ class DatePickerKt$$ExternalSyntheticLambda21 implements Function2 {
    public final /* synthetic */ int $r8$classId;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Object f$1;
    public final /* synthetic */ Function f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$4;
    public final /* synthetic */ Object f$5;
    public final /* synthetic */ Object f$6;
    public final /* synthetic */ Object f$7;
    public final /* synthetic */ Object f$8;
    public final /* synthetic */ int f$9;

    public /* synthetic */ DatePickerKt$$ExternalSyntheticLambda21(Object obj, Object obj2, Function function, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8, int i, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = obj2;
        this.f$2 = function;
        this.f$3 = obj3;
        this.f$4 = obj4;
        this.f$5 = obj5;
        this.f$6 = obj6;
        this.f$7 = obj7;
        this.f$8 = obj8;
        this.f$9 = i;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        int i2 = this.f$9;
        Object obj3 = this.f$8;
        Object obj4 = this.f$7;
        Object obj5 = this.f$6;
        Object obj6 = this.f$5;
        Object obj7 = this.f$4;
        Object obj8 = this.f$3;
        Function function = this.f$2;
        Object obj9 = this.f$1;
        Object obj10 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                DatePickerKt.HorizontalMonthsList((LazyListState) obj10, (Long) obj9, (Function1) function, (Function1) obj8, (CalendarModelImpl) obj7, (IntRange) obj6, (DatePickerFormatterImpl) obj5, (DatePickerDefaults$AllDates$1) obj4, (DatePickerColors) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
            default:
                ((Integer) obj2).getClass();
                BitcoinPerformanceSummaryViewKt.BitcoinPerformanceSummaryContent((String) obj10, (String) obj9, (Function0) function, (String) obj8, (String) obj7, (String) obj6, (Modifier) obj5, (String) obj4, (String) obj3, (Composer) obj, Updater.updateChangedFlags(i2 | 1));
                break;
        }
        return Unit.INSTANCE;
    }
}
