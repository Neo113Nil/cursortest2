package androidx.compose.material3;

import androidx.compose.material3.internal.CalendarMonth;
import androidx.compose.runtime.Composer;
import androidx.compose.runtime.Updater;
import androidx.compose.runtime.internal.ComposableLambdaImpl;
import androidx.compose.ui.Modifier;
import com.squareup.cash.arcade.components.titlebar.NavigationType;
import com.squareup.cash.collapsingtoolbar.views.CollapsingToolbarKt;
import java.util.Locale;
import kotlin.Function;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* loaded from: classes3.dex */
public final /* synthetic */ class DatePickerKt$$ExternalSyntheticLambda26 implements Function2 {
    public final /* synthetic */ int $r8$classId = 0;
    public final /* synthetic */ Object f$0;
    public final /* synthetic */ Function f$1;
    public final /* synthetic */ long f$2;
    public final /* synthetic */ Object f$3;
    public final /* synthetic */ Object f$6;
    public final /* synthetic */ Object f$7;
    public final /* synthetic */ Object f$8;
    public final /* synthetic */ Object f$9;

    public /* synthetic */ DatePickerKt$$ExternalSyntheticLambda26(CalendarMonth calendarMonth, Function1 function1, long j, Long l, DatePickerFormatterImpl datePickerFormatterImpl, DatePickerDefaults$AllDates$1 datePickerDefaults$AllDates$1, DatePickerColors datePickerColors, Locale locale, int i) {
        this.f$0 = calendarMonth;
        this.f$1 = function1;
        this.f$2 = j;
        this.f$3 = l;
        this.f$6 = datePickerFormatterImpl;
        this.f$7 = datePickerDefaults$AllDates$1;
        this.f$8 = datePickerColors;
        this.f$9 = locale;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        int i = this.$r8$classId;
        Object obj3 = this.f$9;
        Object obj4 = this.f$8;
        Object obj5 = this.f$7;
        Object obj6 = this.f$6;
        Object obj7 = this.f$3;
        Function function = this.f$1;
        Object obj8 = this.f$0;
        switch (i) {
            case 0:
                ((Integer) obj2).getClass();
                int updateChangedFlags = Updater.updateChangedFlags(221185);
                DatePickerKt.Month((CalendarMonth) obj8, (Function1) function, this.f$2, (Long) obj7, (DatePickerFormatterImpl) obj6, (DatePickerDefaults$AllDates$1) obj5, (DatePickerColors) obj4, (Locale) obj3, (Composer) obj, updateChangedFlags);
                break;
            default:
                ((Integer) obj2).getClass();
                int updateChangedFlags2 = Updater.updateChangedFlags(12804529);
                CollapsingToolbarKt.m3475CollapsingHeaderScaffold8r3B23s((Modifier) obj8, (ComposableLambdaImpl) function, (ComposableLambdaImpl) obj7, this.f$2, (ComposableLambdaImpl) obj6, (NavigationType) obj5, (Function0) obj4, (ComposableLambdaImpl) obj3, (Composer) obj, updateChangedFlags2);
                break;
        }
        return Unit.INSTANCE;
    }

    public /* synthetic */ DatePickerKt$$ExternalSyntheticLambda26(Modifier modifier, ComposableLambdaImpl composableLambdaImpl, ComposableLambdaImpl composableLambdaImpl2, long j, ComposableLambdaImpl composableLambdaImpl3, NavigationType navigationType, Function0 function0, ComposableLambdaImpl composableLambdaImpl4, int i) {
        this.f$0 = modifier;
        this.f$1 = composableLambdaImpl;
        this.f$3 = composableLambdaImpl2;
        this.f$2 = j;
        this.f$6 = composableLambdaImpl3;
        this.f$7 = navigationType;
        this.f$8 = function0;
        this.f$9 = composableLambdaImpl4;
    }
}
