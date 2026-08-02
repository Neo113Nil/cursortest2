package ru.yandex.taxi.due_selector.impl.presentation.ui.picker.dayspicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import com.google.ar.core.ImageMetadata;
import com.yandex.go.design.view.GoLinearLayout;
import defpackage.f7z0;
import defpackage.g7z0;
import defpackage.i7z0;
import defpackage.j7z0;
import defpackage.kyh0;
import defpackage.mrg0;
import defpackage.qdh0;
import defpackage.qke;
import defpackage.ssg;
import defpackage.tje;
import defpackage.tp11;
import defpackage.tpt;
import defpackage.uph0;
import defpackage.upt;
import defpackage.wf7;
import defpackage.xw31;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import ru.CryptoPro.JCPRequest.ca20.status.CA20Status;
import ru.CryptoPro.JCSP.api.bio.CspBioProgressConstants;
import ru.yandex.taxi.HapticController$Effect;
import ru.yandex.taxi.widget.BackportNumberPicker;
import ru.yandex.taxi.widget.GoNumberPicker;

@Metadata(d1 = {"\u0000|\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\b\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0010\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001GB'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0015\u001a\u00020\f2\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ/\u0010\"\u001a\u00020\f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010 \u001a\u00020\u001f2\u0006\u0010!\u001a\u00020\u001fH\u0002¢\u0006\u0004\b\"\u0010#J\u000f\u0010$\u001a\u00020\fH\u0002¢\u0006\u0004\b$\u0010\u000eJ5\u0010+\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u001b2\u0006\u0010&\u001a\u00020\b2\u0006\u0010'\u001a\u00020\b2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020)0(H\u0002¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u000fH\u0002¢\u0006\u0004\b-\u0010.J'\u00101\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u001b2\u0006\u0010/\u001a\u00020\b2\u0006\u00100\u001a\u00020\bH\u0002¢\u0006\u0004\b1\u00102J'\u00103\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u001b2\u0006\u0010/\u001a\u00020\b2\u0006\u00100\u001a\u00020\bH\u0002¢\u0006\u0004\b3\u00102J'\u00104\u001a\u00020\u000f2\u0006\u0010%\u001a\u00020\u001b2\u0006\u0010/\u001a\u00020\b2\u0006\u00100\u001a\u00020\bH\u0002¢\u0006\u0004\b4\u00102J'\u00105\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u001b2\u0006\u0010/\u001a\u00020\b2\u0006\u00100\u001a\u00020\bH\u0002¢\u0006\u0004\b5\u00106J/\u00108\u001a\u00020\f2\u0006\u0010%\u001a\u00020\u001b2\u0006\u0010/\u001a\u00020\b2\u0006\u00100\u001a\u00020\b2\u0006\u00107\u001a\u00020\u000fH\u0016¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020\f2\b\u0010;\u001a\u0004\u0018\u00010:¢\u0006\u0004\b<\u0010=J\u001f\u0010@\u001a\u00020\f2\u0006\u0010>\u001a\u00020\u001b2\u0006\u0010?\u001a\u00020\bH\u0016¢\u0006\u0004\b@\u0010AJ\u001f\u0010E\u001a\u00020\f2\u0006\u0010C\u001a\u00020B2\b\u0010D\u001a\u0004\u0018\u00010:¢\u0006\u0004\bE\u0010FJ\u0017\u0010I\u001a\u00020\f2\b\u0010H\u001a\u0004\u0018\u00010G¢\u0006\u0004\bI\u0010JR\u0014\u0010K\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010M\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010LR\u0014\u0010N\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010LR\u0014\u0010O\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010Q\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010RR\u0016\u0010S\u001a\u00020:8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bS\u0010TR\u0016\u0010C\u001a\u00020B8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\bC\u0010UR\u0018\u0010H\u001a\u0004\u0018\u00010G8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bH\u0010V¨\u0006W"}, d2 = {"Lru/yandex/taxi/due_selector/impl/presentation/ui/picker/dayspicker/DaysTimePicker;", "Lcom/yandex/go/design/view/GoLinearLayout;", "Lupt;", "Ltpt;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyle", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lzy11;", "init", "()V", "", "animateScroll", "initDays", "(Z)V", "Lf7z0;", "selectedDay", "initHours", "(Lf7z0;Z)V", "Lg7z0;", "selectedHour", "initMinutes", "(Lg7z0;Z)V", "Lru/yandex/taxi/widget/GoNumberPicker;", "numberPicker", "Lru/yandex/taxi/widget/BackportNumberPicker$TextAlignment;", "textAlignment", "", "leftCornersRadius", "rightCornersRadius", "setupPicker", "(Lru/yandex/taxi/widget/GoNumberPicker;Lru/yandex/taxi/widget/BackportNumberPicker$TextAlignment;FF)V", "initBoundaryListeners", "picker", "min", CspBioProgressConstants.MAX, "", "", "values", "setMinMaxValues", "(Lru/yandex/taxi/widget/GoNumberPicker;II[Ljava/lang/String;)V", "isGeneralStateIdle", "()Z", "oldVal", "newVal", "onNewMinute", "(Lru/yandex/taxi/widget/GoNumberPicker;II)Z", "onNewHour", "onNewDay", "setOldPickerVal", "(Lru/yandex/taxi/widget/GoNumberPicker;II)V", "fromUser", "onValueChange", "(Lru/yandex/taxi/widget/GoNumberPicker;IIZ)V", "Ljava/util/Calendar;", "calendar", "scrollToDate", "(Ljava/util/Calendar;)V", "view", "scrollState", "onScrollStateChange", "(Lru/yandex/taxi/widget/GoNumberPicker;I)V", "Lj7z0;", "days", "value", "setValues", "(Lj7z0;Ljava/util/Calendar;)V", "Lssg;", "listener", "setListener", "(Lssg;)V", "dayPicker", "Lru/yandex/taxi/widget/GoNumberPicker;", "hourPicker", "minutePicker", "selectorCornerRadius", CA20Status.STATUS_USER_I, "isRtl", "Z", "selectedDate", "Ljava/util/Calendar;", "Lj7z0;", "Lssg;", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class DaysTimePicker extends GoLinearLayout implements upt, tpt {
    private final GoNumberPicker dayPicker;
    private j7z0 days;
    private final GoNumberPicker hourPicker;
    private final boolean isRtl;
    private ssg listener;
    private final GoNumberPicker minutePicker;
    private Calendar selectedDate;
    private final int selectorCornerRadius;

    public DaysTimePicker(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i, 0, 8, null);
        View.inflate(context, uph0.date_picker, this);
        this.dayPicker = (GoNumberPicker) findViewById(qdh0.day);
        this.hourPicker = (GoNumberPicker) findViewById(qdh0.hour);
        this.minutePicker = (GoNumberPicker) findViewById(qdh0.minute);
        this.selectorCornerRadius = tje.r(mrg0.go_design_m_space, getContext());
        this.isRtl = xw31.n(context);
    }

    private final void init() {
        Boolean bool = tp11.a;
        View[] viewArr = {this.dayPicker, this.hourPicker, this.minutePicker};
        for (int i = 0; i < 3; i++) {
            View view = viewArr[i];
            if (view != null) {
                tp11.b(0, view);
            }
        }
        initBoundaryListeners();
        initDays(false);
        j7z0 j7z0Var = this.days;
        if (j7z0Var == null) {
            j7z0Var = null;
        }
        Calendar calendar = this.selectedDate;
        if (calendar == null) {
            calendar = null;
        }
        f7z0 a = j7z0Var.a(calendar);
        if (a == null) {
            return;
        }
        initHours(a, false);
        Calendar calendar2 = this.selectedDate;
        g7z0 a2 = a.a(calendar2 != null ? calendar2 : null);
        if (a2 == null) {
            return;
        }
        initMinutes(a2, false);
        GoNumberPicker goNumberPicker = this.dayPicker;
        onValueChange(goNumberPicker, goNumberPicker.getValue(), this.dayPicker.getValue(), false);
    }

    private final void initBoundaryListeners() {
        this.dayPicker.setOnValueChangedListener(this);
        this.dayPicker.setOnScrollListener(this);
        this.hourPicker.setOnValueChangedListener(this);
        this.hourPicker.setOnScrollListener(this);
        this.minutePicker.setOnValueChangedListener(this);
        this.minutePicker.setOnScrollListener(this);
    }

    private final void initDays(boolean animateScroll) {
        j7z0 j7z0Var;
        boolean z = this.isRtl;
        setupPicker(this.dayPicker, BackportNumberPicker.TextAlignment.END, z ? 0.0f : this.selectorCornerRadius, z ? this.selectorCornerRadius : 0.0f);
        j7z0 j7z0Var2 = this.days;
        if (j7z0Var2 == null) {
            j7z0Var2 = null;
        }
        int size = j7z0Var2.a.size();
        String[] strArr = new String[size];
        int i = 0;
        while (true) {
            j7z0Var = this.days;
            if (i >= size) {
                break;
            }
            if (j7z0Var == null) {
                j7z0Var = null;
            }
            strArr[i] = ((f7z0) j7z0Var.a.get(i)).b;
            i++;
        }
        if (j7z0Var == null) {
            j7z0Var = null;
        }
        int size2 = j7z0Var.a.size();
        int i2 = 0;
        for (int i3 = 0; i3 < size2; i3++) {
            j7z0 j7z0Var3 = this.days;
            if (j7z0Var3 == null) {
                j7z0Var3 = null;
            }
            f7z0 f7z0Var = (f7z0) j7z0Var3.a.get(i3);
            Calendar calendar = this.selectedDate;
            if (calendar == null) {
                calendar = null;
            }
            if (calendar.get(6) == f7z0Var.a.get(6)) {
                i2 = i3;
            }
        }
        setMinMaxValues(this.dayPicker, 0, (this.days != null ? r4 : null).a.size() - 1, strArr);
        GoNumberPicker goNumberPicker = this.dayPicker;
        if (animateScroll) {
            goNumberPicker.animateScrollTo(i2);
        } else {
            goNumberPicker.setValue(i2);
        }
    }

    private final void initHours(f7z0 selectedDay, boolean animateScroll) {
        setupPicker(this.hourPicker, BackportNumberPicker.TextAlignment.CENTER, 0.0f, 0.0f);
        ArrayList arrayList = selectedDay.c;
        int size = arrayList.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = ((g7z0) arrayList.get(i)).b;
        }
        int size2 = arrayList.size();
        String[] strArr2 = new String[size2];
        for (int i2 = 0; i2 < size2; i2++) {
            strArr2[i2] = ((g7z0) arrayList.get(i2)).d;
        }
        int size3 = arrayList.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size3; i4++) {
            g7z0 g7z0Var = (g7z0) arrayList.get(i4);
            Calendar calendar = this.selectedDate;
            if (calendar == null) {
                calendar = null;
            }
            if (calendar.get(11) == g7z0Var.a.get(11)) {
                i3 = i4;
            }
        }
        setMinMaxValues(this.hourPicker, 0, arrayList.size() - 1, strArr);
        this.hourPicker.setSpokenValues(strArr2);
        GoNumberPicker goNumberPicker = this.hourPicker;
        if (animateScroll) {
            goNumberPicker.animateScrollTo(i3);
        } else {
            goNumberPicker.setValue(i3);
        }
    }

    private final void initMinutes(g7z0 selectedHour, boolean animateScroll) {
        boolean z = this.isRtl;
        setupPicker(this.minutePicker, BackportNumberPicker.TextAlignment.START, z ? this.selectorCornerRadius : 0.0f, z ? 0.0f : this.selectorCornerRadius);
        ArrayList arrayList = selectedHour.c;
        int size = arrayList.size();
        String[] strArr = new String[size];
        for (int i = 0; i < size; i++) {
            strArr[i] = ((i7z0) arrayList.get(i)).b;
        }
        int size2 = arrayList.size();
        String[] strArr2 = new String[size2];
        for (int i2 = 0; i2 < size2; i2++) {
            strArr2[i2] = ((i7z0) arrayList.get(i2)).c;
        }
        int size3 = arrayList.size();
        int i3 = 0;
        for (int i4 = 0; i4 < size3; i4++) {
            i7z0 i7z0Var = (i7z0) arrayList.get(i4);
            Calendar calendar = this.selectedDate;
            if (calendar == null) {
                calendar = null;
            }
            if (calendar.get(12) == i7z0Var.a.get(12)) {
                i3 = i4;
            }
        }
        setMinMaxValues(this.minutePicker, 0, arrayList.size() - 1, strArr);
        this.minutePicker.setSpokenValues(strArr2);
        GoNumberPicker goNumberPicker = this.minutePicker;
        if (animateScroll) {
            goNumberPicker.animateScrollTo(i3);
        } else {
            goNumberPicker.setValue(i3);
        }
    }

    private final boolean isGeneralStateIdle() {
        return this.dayPicker.isIdleScrollState() && this.hourPicker.isIdleScrollState() && this.minutePicker.isIdleScrollState();
    }

    private final boolean onNewDay(GoNumberPicker picker, int oldVal, int newVal) {
        ArrayList arrayList;
        j7z0 j7z0Var = this.days;
        if (j7z0Var == null) {
            j7z0Var = null;
        }
        f7z0 f7z0Var = (f7z0) a.S(newVal, j7z0Var.a);
        if (f7z0Var == null) {
            setOldPickerVal(picker, oldVal, newVal);
            return true;
        }
        ArrayList arrayList2 = f7z0Var.c;
        j7z0 j7z0Var2 = this.days;
        if (j7z0Var2 == null) {
            j7z0Var2 = null;
        }
        f7z0 f7z0Var2 = (f7z0) a.S(oldVal, j7z0Var2.a);
        if (f7z0Var2 == null) {
            setOldPickerVal(picker, oldVal, newVal);
            return true;
        }
        g7z0 g7z0Var = (g7z0) a.S(this.hourPicker.getValue(), f7z0Var2.c);
        if (g7z0Var == null) {
            setOldPickerVal(picker, oldVal, newVal);
            return true;
        }
        int size = arrayList2.size();
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < size; i3++) {
            int abs = Math.abs(g7z0Var.a.get(11) - ((g7z0) arrayList2.get(i3)).a.get(11));
            if (i == -1 || abs < i) {
                i = abs;
                i2 = i3;
            }
        }
        i7z0 i7z0Var = (i7z0) a.S(this.minutePicker.getValue(), g7z0Var.c);
        if (i7z0Var == null) {
            setOldPickerVal(picker, oldVal, newVal);
            return true;
        }
        g7z0 g7z0Var2 = (g7z0) arrayList2.get(i2);
        int size2 = g7z0Var2.c.size();
        int i4 = 0;
        int i5 = -1;
        int i6 = -1;
        while (true) {
            arrayList = g7z0Var2.c;
            if (i4 >= size2) {
                break;
            }
            int abs2 = Math.abs(i7z0Var.a.get(12) - ((i7z0) arrayList.get(i4)).a.get(12));
            if (i6 == -1 || abs2 < i6) {
                i5 = i4;
                i6 = abs2;
            }
            i4++;
        }
        i7z0 i7z0Var2 = (i7z0) arrayList.get(i5);
        Calendar calendar = this.selectedDate;
        if (calendar == null) {
            calendar = null;
        }
        calendar.set(6, f7z0Var.a.get(6));
        Calendar calendar2 = this.selectedDate;
        if (calendar2 == null) {
            calendar2 = null;
        }
        calendar2.set(11, g7z0Var2.a.get(11));
        Calendar calendar3 = this.selectedDate;
        if (calendar3 == null) {
            calendar3 = null;
        }
        calendar3.set(12, i7z0Var2.a.get(12));
        initHours(f7z0Var, false);
        initMinutes(g7z0Var2, false);
        this.hourPicker.setValue(i2);
        this.minutePicker.setValue(i5);
        return false;
    }

    private final boolean onNewHour(GoNumberPicker picker, int oldVal, int newVal) {
        j7z0 j7z0Var = this.days;
        if (j7z0Var == null) {
            j7z0Var = null;
        }
        f7z0 f7z0Var = (f7z0) a.S(this.dayPicker.getValue(), j7z0Var.a);
        if (f7z0Var == null) {
            setOldPickerVal(picker, oldVal, newVal);
            return true;
        }
        ArrayList arrayList = f7z0Var.c;
        g7z0 g7z0Var = (g7z0) a.S(oldVal, arrayList);
        if (g7z0Var == null) {
            setOldPickerVal(picker, oldVal, newVal);
            return true;
        }
        g7z0 g7z0Var2 = (g7z0) a.S(newVal, arrayList);
        if (g7z0Var2 == null) {
            setOldPickerVal(picker, oldVal, newVal);
            return true;
        }
        ArrayList arrayList2 = g7z0Var2.c;
        i7z0 i7z0Var = (i7z0) a.S(this.minutePicker.getValue(), g7z0Var.c);
        if (i7z0Var == null) {
            setOldPickerVal(picker, oldVal, newVal);
            return true;
        }
        int size = arrayList2.size();
        int i = -1;
        int i2 = -1;
        for (int i3 = 0; i3 < size; i3++) {
            int abs = Math.abs(i7z0Var.a.get(12) - ((i7z0) arrayList2.get(i3)).a.get(12));
            if (i2 == -1 || abs < i2) {
                i = i3;
                i2 = abs;
            }
        }
        i7z0 i7z0Var2 = (i7z0) arrayList2.get(i);
        Calendar calendar = this.selectedDate;
        if (calendar == null) {
            calendar = null;
        }
        calendar.set(11, g7z0Var2.a.get(11));
        Calendar calendar2 = this.selectedDate;
        (calendar2 != null ? calendar2 : null).set(12, i7z0Var2.a.get(12));
        initMinutes(g7z0Var2, false);
        this.minutePicker.setValue(i);
        return false;
    }

    private final boolean onNewMinute(GoNumberPicker picker, int oldVal, int newVal) {
        j7z0 j7z0Var = this.days;
        if (j7z0Var == null) {
            j7z0Var = null;
        }
        f7z0 f7z0Var = (f7z0) a.S(this.dayPicker.getValue(), j7z0Var.a);
        if (f7z0Var == null) {
            setOldPickerVal(picker, oldVal, newVal);
            return true;
        }
        g7z0 g7z0Var = (g7z0) a.S(this.hourPicker.getValue(), f7z0Var.c);
        if (g7z0Var == null) {
            setOldPickerVal(picker, oldVal, newVal);
            return true;
        }
        i7z0 i7z0Var = (i7z0) a.S(newVal, g7z0Var.c);
        if (i7z0Var == null) {
            setOldPickerVal(picker, oldVal, newVal);
            return true;
        }
        Calendar calendar = this.selectedDate;
        (calendar != null ? calendar : null).set(12, i7z0Var.a.get(12));
        return false;
    }

    private final void setMinMaxValues(GoNumberPicker picker, int min, int max, String[] values) {
        int i = (max - min) + 1;
        String[] strArr = new String[i];
        for (int i2 = 0; i2 < i; i2++) {
            strArr[i2] = values[i2 + min];
        }
        picker.setDisplayedValues(null);
        picker.setMinValue(min);
        picker.setMaxValue(max);
        picker.setWrapSelectorWheel(false);
        picker.setDisplayedValues(strArr);
    }

    private final void setOldPickerVal(GoNumberPicker picker, int oldVal, int newVal) {
        if (oldVal == newVal) {
            return;
        }
        onValueChange(picker, oldVal, oldVal, true);
    }

    private final void setupPicker(GoNumberPicker numberPicker, BackportNumberPicker.TextAlignment textAlignment, float leftCornersRadius, float rightCornersRadius) {
        numberPicker.setSelectedValueDescriptionSuffix(getContext().getString(kyh0.content_description_selected));
        numberPicker.setDescendantFocusability(ImageMetadata.HOT_PIXEL_MODE);
        numberPicker.setSelectorVisible(true);
        numberPicker.setSelectorCornerRadius(leftCornersRadius, rightCornersRadius, rightCornersRadius, leftCornersRadius);
        numberPicker.setTextAlignment(textAlignment);
    }

    @Override // defpackage.tpt
    public void onScrollStateChange(GoNumberPicker view, int scrollState) {
        ssg ssgVar;
        if (scrollState != 0 || (ssgVar = this.listener) == null) {
            return;
        }
        Calendar calendar = this.selectedDate;
        if (calendar == null) {
            calendar = null;
        }
        ssgVar.a(wf7.a(calendar));
    }

    @Override // defpackage.upt
    public void onValueChange(GoNumberPicker picker, int oldVal, int newVal, boolean fromUser) {
        ssg ssgVar;
        int id = picker.getId();
        if (id == qdh0.day) {
            if (onNewDay(picker, oldVal, newVal)) {
                return;
            }
        } else if (id == qdh0.hour) {
            if (onNewHour(picker, oldVal, newVal)) {
                return;
            }
        } else if (id == qdh0.minute && onNewMinute(picker, oldVal, newVal)) {
            return;
        }
        if (isGeneralStateIdle() && (ssgVar = this.listener) != null) {
            Calendar calendar = this.selectedDate;
            if (calendar == null) {
                calendar = null;
            }
            ssgVar.a(wf7.a(calendar));
        }
        if (fromUser) {
            qke.w(getContext(), HapticController$Effect.TICK, false, false);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v4, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r14v5 */
    /* JADX WARN: Type inference failed for: r14v6 */
    /* JADX WARN: Type inference failed for: r14v7 */
    public final void scrollToDate(Calendar calendar) {
        g7z0 a;
        if (calendar != null) {
            j7z0 j7z0Var = this.days;
            i7z0 i7z0Var = null;
            if (j7z0Var == null) {
                j7z0Var = null;
            }
            if (j7z0Var.b(calendar)) {
                j7z0 j7z0Var2 = this.days;
                if (j7z0Var2 == null) {
                    j7z0Var2 = null;
                }
                f7z0 a2 = j7z0Var2.a(calendar);
                if (a2 == null || (a = a2.a(calendar)) == null) {
                    return;
                }
                ArrayList<i7z0> arrayList = a.c;
                if (!arrayList.isEmpty()) {
                    long timeInMillis = calendar.getTimeInMillis();
                    i7z0 P = a.P(arrayList);
                    long j = -1;
                    for (i7z0 i7z0Var2 : arrayList) {
                        long abs = Math.abs(timeInMillis - i7z0Var2.a.getTimeInMillis());
                        if (j == -1 || abs < j) {
                            P = i7z0Var2;
                            j = abs;
                        }
                    }
                    i7z0Var = P;
                }
                if (i7z0Var == null) {
                    return;
                }
                Calendar calendar2 = i7z0Var.a;
                wf7 wf7Var = wf7.a;
                this.selectedDate = wf7.c(calendar2, calendar2.getTimeZone());
                initDays(true);
                initHours(a2, true);
                initMinutes(a, true);
            }
        }
    }

    public final void setListener(ssg listener) {
        this.listener = listener;
    }

    public final void setValues(j7z0 days, Calendar value) {
        Calendar c;
        List list = days.a;
        if (list.isEmpty()) {
            return;
        }
        this.days = days;
        Calendar calendar = ((f7z0) list.get(0)).a;
        if (value != null) {
            List list2 = list;
            if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                Iterator it = list2.iterator();
                loop0: while (it.hasNext()) {
                    ArrayList arrayList = ((f7z0) it.next()).c;
                    if (!arrayList.isEmpty()) {
                        Iterator it2 = arrayList.iterator();
                        while (it2.hasNext()) {
                            ArrayList arrayList2 = ((g7z0) it2.next()).c;
                            if (!arrayList2.isEmpty()) {
                                Iterator it3 = arrayList2.iterator();
                                while (it3.hasNext()) {
                                    Calendar calendar2 = ((i7z0) it3.next()).a;
                                    if (wf7.e(value, calendar2) && value.get(11) == calendar2.get(11) && value.get(12) == calendar2.get(12)) {
                                        c = wf7.c(value, value.getTimeZone());
                                        break loop0;
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        wf7 wf7Var = wf7.a;
        c = wf7.c(calendar, calendar.getTimeZone());
        this.selectedDate = c;
        init();
    }

    public DaysTimePicker(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public DaysTimePicker(Context context) {
        this(context, null, 0, 6, null);
    }

    public /* synthetic */ DaysTimePicker(Context context, AttributeSet attributeSet, int i, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i2 & 2) != 0 ? null : attributeSet, (i2 & 4) != 0 ? 0 : i);
    }
}
