package com.google.android.material.timepicker;

import com.lumenpath.harispro.hrnavigator.R;

/* loaded from: classes.dex */
public final /* synthetic */ class s {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2768a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2769b;

    public /* synthetic */ s(int i, Object obj) {
        this.f2768a = i;
        this.f2769b = obj;
    }

    public final void a(int i, boolean z2) {
        Object obj = this.f2769b;
        switch (this.f2768a) {
            case 0:
                TimePickerView timePickerView = (TimePickerView) obj;
                if (!z2) {
                    int i2 = TimePickerView.f2719y;
                    timePickerView.getClass();
                    break;
                } else {
                    m mVar = timePickerView.f2725v;
                    if (mVar != null) {
                        mVar.f2751b.d(i == R.id.material_clock_period_pm_button ? 1 : 0);
                        break;
                    }
                }
                break;
            default:
                r rVar = (r) obj;
                rVar.getClass();
                if (z2) {
                    rVar.f2762b.d(i == R.id.material_clock_period_pm_button ? 1 : 0);
                    break;
                }
                break;
        }
    }
}
