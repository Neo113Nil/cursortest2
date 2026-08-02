package defpackage;

import com.yandex.go.due.data.api.dto.ScheduledOrderButtons;
import java.util.Calendar;
import java.util.List;
import kotlin.collections.EmptyList;
import ru.yandex.taxi.due_selector.impl.presentation.ui.picker.DuePickerStateInfo$PickerState;

/* loaded from: classes5.dex */
public final class swm {
    public final DuePickerStateInfo$PickerState a;
    public final String b;
    public final j7z0 c;
    public final Calendar d;
    public final List e;
    public final List f;
    public final ScheduledOrderButtons g;
    public final ScheduledOrderButtons h;
    public final svm i;
    public final svm j;
    public final boolean k;
    public final boolean l;
    public final Integer m;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public swm(DuePickerStateInfo$PickerState duePickerStateInfo$PickerState) {
        this(duePickerStateInfo$PickerState, "", r0, null, r1, r1, r7, r7, r9, r9, false, false, null);
        EmptyList emptyList = EmptyList.a;
        j7z0 j7z0Var = new j7z0(emptyList, emptyList, -1, 1, null);
        ScheduledOrderButtons.Companion.getClass();
        svm svmVar = svm.f;
        ScheduledOrderButtons scheduledOrderButtons = ScheduledOrderButtons.c;
    }

    public swm(DuePickerStateInfo$PickerState duePickerStateInfo$PickerState, String str, j7z0 j7z0Var, Calendar calendar, List list, List list2, ScheduledOrderButtons scheduledOrderButtons, ScheduledOrderButtons scheduledOrderButtons2, svm svmVar, svm svmVar2, boolean z, boolean z2, Integer num) {
        this.a = duePickerStateInfo$PickerState;
        this.b = str;
        this.c = j7z0Var;
        this.d = calendar;
        this.e = list;
        this.f = list2;
        this.g = scheduledOrderButtons;
        this.h = scheduledOrderButtons2;
        this.i = svmVar;
        this.j = svmVar2;
        this.k = z;
        this.l = z2;
        this.m = num;
    }
}
