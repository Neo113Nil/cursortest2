package com.google.android.material.timepicker;

import O.K;
import android.text.TextUtils;
import com.google.android.material.chip.Chip;
import com.lumenpath.harispro.hrnavigator.R;
import java.util.Locale;
import java.util.WeakHashMap;

/* loaded from: classes.dex */
public final class m implements f, n {

    /* renamed from: f, reason: collision with root package name */
    public static final String[] f2747f = {"12", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11"};

    /* renamed from: g, reason: collision with root package name */
    public static final String[] f2748g = {"00", "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23"};

    /* renamed from: h, reason: collision with root package name */
    public static final String[] f2749h = {"00", "5", "10", "15", "20", "25", "30", "35", "40", "45", "50", "55"};

    /* renamed from: a, reason: collision with root package name */
    public final TimePickerView f2750a;

    /* renamed from: b, reason: collision with root package name */
    public final k f2751b;

    /* renamed from: c, reason: collision with root package name */
    public float f2752c;

    /* renamed from: d, reason: collision with root package name */
    public float f2753d;
    public boolean e = false;

    public m(TimePickerView timePickerView, k kVar) {
        this.f2750a = timePickerView;
        this.f2751b = kVar;
        if (kVar.f2742c == 0) {
            timePickerView.f2724u.setVisibility(0);
        }
        timePickerView.f2722s.j.add(this);
        timePickerView.f2726w = this;
        timePickerView.f2725v = this;
        timePickerView.f2722s.f2696r = this;
        String[] strArr = f2747f;
        for (int i = 0; i < 12; i++) {
            strArr[i] = k.a(this.f2750a.getResources(), strArr[i], "%d");
        }
        String[] strArr2 = f2749h;
        for (int i2 = 0; i2 < 12; i2++) {
            strArr2[i2] = k.a(this.f2750a.getResources(), strArr2[i2], "%02d");
        }
        f();
    }

    public final void a(int i, boolean z2) {
        boolean z3 = i == 12;
        TimePickerView timePickerView = this.f2750a;
        timePickerView.f2722s.f2685d = z3;
        k kVar = this.f2751b;
        kVar.f2744f = i;
        int i2 = kVar.f2742c;
        String[] strArr = z3 ? f2749h : i2 == 1 ? f2748g : f2747f;
        int i3 = z3 ? R.string.material_minute_suffix : i2 == 1 ? R.string.material_hour_24h_suffix : R.string.material_hour_suffix;
        ClockFaceView clockFaceView = timePickerView.f2723t;
        clockFaceView.p(strArr, i3);
        int i4 = (kVar.f2744f == 10 && i2 == 1 && kVar.f2743d >= 12) ? 2 : 1;
        ClockHandView clockHandView = clockFaceView.f2674t;
        clockHandView.f2699u = i4;
        clockHandView.invalidate();
        timePickerView.f2722s.c(z3 ? this.f2752c : this.f2753d, z2);
        boolean z4 = i == 12;
        Chip chip = timePickerView.f2720q;
        chip.setChecked(z4);
        int i5 = z4 ? 2 : 0;
        WeakHashMap weakHashMap = K.f747a;
        chip.setAccessibilityLiveRegion(i5);
        boolean z5 = i == 10;
        Chip chip2 = timePickerView.f2721r;
        chip2.setChecked(z5);
        chip2.setAccessibilityLiveRegion(z5 ? 2 : 0);
        K.l(chip2, new l(this, timePickerView.getContext(), 0));
        K.l(chip, new l(this, timePickerView.getContext(), 1));
    }

    public final void b() {
        k kVar = this.f2751b;
        int i = kVar.f2745g;
        int b2 = kVar.b();
        int i2 = kVar.e;
        TimePickerView timePickerView = this.f2750a;
        timePickerView.getClass();
        timePickerView.f2724u.b(i == 1 ? R.id.material_clock_period_pm_button : R.id.material_clock_period_am_button, true);
        Locale locale = timePickerView.getResources().getConfiguration().locale;
        String format = String.format(locale, "%02d", Integer.valueOf(i2));
        String format2 = String.format(locale, "%02d", Integer.valueOf(b2));
        Chip chip = timePickerView.f2720q;
        if (!TextUtils.equals(chip.getText(), format)) {
            chip.setText(format);
        }
        Chip chip2 = timePickerView.f2721r;
        if (TextUtils.equals(chip2.getText(), format2)) {
            return;
        }
        chip2.setText(format2);
    }

    @Override // com.google.android.material.timepicker.n
    public final void c() {
        this.f2750a.setVisibility(0);
    }

    @Override // com.google.android.material.timepicker.f
    public final void d(float f2, boolean z2) {
        if (this.e) {
            return;
        }
        k kVar = this.f2751b;
        int i = kVar.f2743d;
        int i2 = kVar.e;
        int round = Math.round(f2);
        int i3 = kVar.f2744f;
        TimePickerView timePickerView = this.f2750a;
        if (i3 == 12) {
            kVar.e = ((round + 3) / 6) % 60;
            this.f2752c = (float) Math.floor(r8 * 6);
        } else {
            int i4 = (round + 15) / 30;
            if (kVar.f2742c == 1) {
                i4 %= 12;
                if (timePickerView.f2723t.f2674t.f2699u == 2) {
                    i4 += 12;
                }
            }
            kVar.c(i4);
            this.f2753d = (kVar.b() * 30) % 360;
        }
        if (z2) {
            return;
        }
        b();
        if (kVar.e == i2 && kVar.f2743d == i) {
            return;
        }
        timePickerView.performHapticFeedback(4);
    }

    @Override // com.google.android.material.timepicker.n
    public final void e() {
        this.f2750a.setVisibility(8);
    }

    @Override // com.google.android.material.timepicker.n
    public final void f() {
        k kVar = this.f2751b;
        this.f2753d = (kVar.b() * 30) % 360;
        this.f2752c = kVar.e * 6;
        a(kVar.f2744f, false);
        b();
    }
}
