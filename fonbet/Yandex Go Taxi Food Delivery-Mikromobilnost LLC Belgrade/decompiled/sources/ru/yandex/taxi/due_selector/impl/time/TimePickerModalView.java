package ru.yandex.taxi.due_selector.impl.time;

import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.e;
import com.google.android.material.timepicker.TimeModel;
import com.yandex.go.design.view.GoLinearLayout;
import defpackage.b6w;
import defpackage.c6w;
import defpackage.cma1;
import defpackage.d6w;
import defpackage.f7z0;
import defpackage.g7z0;
import defpackage.h7z0;
import defpackage.i7z0;
import defpackage.j7z0;
import defpackage.k1a;
import defpackage.kj8;
import defpackage.kyh0;
import defpackage.n2v0;
import defpackage.ny61;
import defpackage.q6z0;
import defpackage.qdb1;
import defpackage.qdh0;
import defpackage.qje;
import defpackage.t6z0;
import defpackage.tcc;
import defpackage.tje;
import defpackage.u6z0;
import defpackage.uph0;
import defpackage.v6z0;
import defpackage.wpy0;
import defpackage.xng0;
import defpackage.xvy0;
import defpackage.y6i0;
import defpackage.zql0;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collections;
import kotlin.Metadata;
import ru.yandex.taxi.design.ButtonComponent;
import ru.yandex.taxi.due_selector.impl.presentation.ui.picker.dayspicker.DaysTimePicker;
import ru.yandex.taxi.due_selector.impl.time.TimePickerModalView;
import ru.yandex.taxi.theme.ThemeType;
import ru.yandex.taxi.widget.GoNumberPicker;
import ru.yandex.taxi.widget.SlideableBindingModalView;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001'B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u000fJ\u0017\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u001f\u0010\u0019\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u0017H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\rH\u0014¢\u0006\u0004\b\u001b\u0010\u000fJ\u000f\u0010\u001c\u001a\u00020\rH\u0014¢\u0006\u0004\b\u001c\u0010\u000fJ\u0017\u0010\u001f\u001a\u00020\r2\u0006\u0010\u001e\u001a\u00020\u001dH\u0016¢\u0006\u0004\b\u001f\u0010 R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010!R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010$R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010%R\u0016\u0010\u0011\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010&¨\u0006("}, d2 = {"Lru/yandex/taxi/due_selector/impl/time/TimePickerModalView;", "Lru/yandex/taxi/widget/SlideableBindingModalView;", "Lq6z0;", "Landroid/view/ContextThemeWrapper;", "contextWrapper", "Ljava/util/Calendar;", "initialDate", "Lv6z0;", "navigator", "Lu6z0;", "presenter", "<init>", "(Landroid/view/ContextThemeWrapper;Ljava/util/Calendar;Lv6z0;Lu6z0;)V", "Lzy11;", "configureTimeOnlyMode", "()V", "dispatchThemeToCardContent", "selectedDate", "Lj7z0;", "createSingleDayTimeRanges", "(Ljava/util/Calendar;)Lj7z0;", "Landroid/view/LayoutInflater;", "inflater", "Landroid/view/ViewGroup;", "parent", "bindingFactory", "(Landroid/view/LayoutInflater;Landroid/view/ViewGroup;)Lq6z0;", "onAttachedToWindow", "onDetachedFromWindow", "Lru/yandex/taxi/theme/ThemeType;", "themeType", "applyTheme", "(Lru/yandex/taxi/theme/ThemeType;)V", "Landroid/view/ContextThemeWrapper;", "Lv6z0;", "getNavigator", "()Lv6z0;", "Lu6z0;", "Ljava/util/Calendar;", "t6z0", "impl"}, k = 1, mv = {2, 4, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class TimePickerModalView extends SlideableBindingModalView<q6z0> {
    private final ContextThemeWrapper contextWrapper;
    private final v6z0 navigator;
    private final u6z0 presenter;
    private Calendar selectedDate;

    public TimePickerModalView(ContextThemeWrapper contextThemeWrapper, Calendar calendar, v6z0 v6z0Var, u6z0 u6z0Var) {
        super(contextThemeWrapper);
        this.contextWrapper = contextThemeWrapper;
        this.navigator = v6z0Var;
        this.presenter = u6z0Var;
        this.selectedDate = (Calendar) calendar.clone();
        final int i = 0;
        qdb1.c(this, new Runnable(this) { // from class: s6z0
            public final /* synthetic */ TimePickerModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i2 = i;
                TimePickerModalView timePickerModalView = this.b;
                switch (i2) {
                    case 0:
                        timePickerModalView.onBackPressed();
                        break;
                    default:
                        TimePickerModalView._init_$lambda$1(timePickerModalView);
                        break;
                }
            }
        });
        getBinding().b.setText(getContext().getString(kyh0.common_ok));
        getBinding().c.setValues(createSingleDayTimeRanges(this.selectedDate), this.selectedDate);
        configureTimeOnlyMode();
        getBinding().c.setListener(new n2v0(17, this));
        final int i2 = 1;
        getBinding().b.setDebounceClickListener(new Runnable(this) { // from class: s6z0
            public final /* synthetic */ TimePickerModalView b;

            {
                this.b = this;
            }

            @Override // java.lang.Runnable
            public final void run() {
                int i22 = i2;
                TimePickerModalView timePickerModalView = this.b;
                switch (i22) {
                    case 0:
                        timePickerModalView.onBackPressed();
                        break;
                    default:
                        TimePickerModalView._init_$lambda$1(timePickerModalView);
                        break;
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(TimePickerModalView timePickerModalView) {
        ((k1a) ((wpy0) timePickerModalView.navigator).b).r(new kj8(timePickerModalView.selectedDate, 2));
    }

    private final void configureTimeOnlyMode() {
        GoNumberPicker goNumberPicker;
        GoNumberPicker goNumberPicker2;
        DaysTimePicker daysTimePicker = getBinding().c;
        GoNumberPicker goNumberPicker3 = (GoNumberPicker) daysTimePicker.findViewById(qdh0.day);
        if (goNumberPicker3 == null || (goNumberPicker = (GoNumberPicker) daysTimePicker.findViewById(qdh0.hour)) == null || (goNumberPicker2 = (GoNumberPicker) daysTimePicker.findViewById(qdh0.minute)) == null) {
            return;
        }
        float u = tje.u(8, getContext());
        goNumberPicker.setSelectorCornerRadius(u, 0.0f, 0.0f, u);
        goNumberPicker2.setSelectorCornerRadius(0.0f, u, u, 0.0f);
        ViewParent parent = goNumberPicker3.getParent();
        ConstraintLayout constraintLayout = parent instanceof ConstraintLayout ? (ConstraintLayout) parent : null;
        if (constraintLayout == null) {
            return;
        }
        goNumberPicker3.setVisibility(8);
        e eVar = new e();
        eVar.g(constraintLayout);
        eVar.l(goNumberPicker2.getId(), -2);
        eVar.e(goNumberPicker.getId(), 6);
        eVar.e(goNumberPicker.getId(), 7);
        eVar.e(goNumberPicker2.getId(), 6);
        eVar.e(goNumberPicker2.getId(), 7);
        eVar.i(goNumberPicker.getId(), 6, 0, 6);
        eVar.i(goNumberPicker.getId(), 7, goNumberPicker2.getId(), 6);
        eVar.i(goNumberPicker2.getId(), 6, goNumberPicker.getId(), 7);
        eVar.i(goNumberPicker2.getId(), 7, 0, 7);
        eVar.o(goNumberPicker.getId()).e.W = 2;
        eVar.o(goNumberPicker2.getId()).e.W = 2;
        eVar.b(constraintLayout);
    }

    private final j7z0 createSingleDayTimeRanges(Calendar selectedDate) {
        Calendar calendar = (Calendar) selectedDate.clone();
        d6w d6wVar = new d6w(0, 23, 1);
        ArrayList arrayList = new ArrayList(tcc.n(d6wVar, 10));
        c6w it = d6wVar.iterator();
        while (it.c) {
            int nextInt = it.nextInt();
            Calendar calendar2 = (Calendar) calendar.clone();
            calendar2.set(11, nextInt);
            b6w m = y6i0.m(new d6w(0, 59, 1), 1);
            ArrayList arrayList2 = new ArrayList(tcc.n(m, 10));
            c6w it2 = m.iterator();
            while (it2.c) {
                int nextInt2 = it2.nextInt();
                Calendar calendar3 = (Calendar) calendar2.clone();
                calendar3.set(12, nextInt2);
                arrayList2.add(new i7z0(String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(nextInt2)}, 1)), String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(nextInt2)}, 1)), calendar3));
            }
            arrayList.add(new g7z0(String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(nextInt)}, 1)), String.format(TimeModel.ZERO_LEADING_NUMBER_FORMAT, Arrays.copyOf(new Object[]{Integer.valueOf(nextInt)}, 1)), arrayList2, calendar2));
        }
        f7z0 f7z0Var = new f7z0(calendar, "", arrayList);
        Calendar calendar4 = (Calendar) calendar.clone();
        calendar4.add(6, 1);
        calendar4.add(14, -1);
        return new j7z0(Collections.singletonList(f7z0Var), Collections.singletonList(new h7z0(calendar, calendar4)), 1, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void dispatchThemeToCardContent() {
        xvy0.b(getBinding().a, qje.X(this.contextWrapper), true, new zql0(qje.u(this.contextWrapper.getTheme(), xng0.bgMain), 2));
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, defpackage.nwy0
    public void applyTheme(ThemeType themeType) {
        super.applyTheme(themeType);
        this.presenter.Kg(themeType);
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // ru.yandex.taxi.widget.SlideableBindingModalView
    public q6z0 bindingFactory(LayoutInflater inflater, ViewGroup parent) {
        View inflate = inflater.inflate(uph0.time_picker_modal_content, parent, false);
        int i = qdh0.approve;
        ButtonComponent buttonComponent = (ButtonComponent) cma1.O(i, inflate);
        if (buttonComponent != null) {
            i = qdh0.time;
            DaysTimePicker daysTimePicker = (DaysTimePicker) cma1.O(i, inflate);
            if (daysTimePicker != null) {
                return new q6z0((GoLinearLayout) inflate, buttonComponent, daysTimePicker);
            }
        }
        ny61.t("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    public final v6z0 getNavigator() {
        return this.navigator;
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        u6z0 u6z0Var = this.presenter;
        u6z0Var.Bg(new t6z0(this));
        tje.N(u6z0Var.Jg(), null, null, new TimePickerModalViewPresenter$attachView$1(u6z0Var, null), 3);
        u6z0 u6z0Var2 = this.presenter;
        u6z0Var2.Kg(u6z0Var2.z.getThemeType());
    }

    @Override // ru.yandex.taxi.widget.SlideableModalView, ru.yandex.taxi.widget.ModalView, android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        this.presenter.Cg();
        super.onDetachedFromWindow();
    }
}
