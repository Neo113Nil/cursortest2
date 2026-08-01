package com.google.android.material.timepicker;

import android.view.View;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class h implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2734a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ MaterialTimePicker f2735b;

    public /* synthetic */ h(MaterialTimePicker materialTimePicker, int i) {
        this.f2734a = i;
        this.f2735b = materialTimePicker;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f2734a) {
            case 0:
                MaterialTimePicker materialTimePicker = this.f2735b;
                Iterator it = materialTimePicker.f2707m0.iterator();
                while (it.hasNext()) {
                    ((View.OnClickListener) it.next()).onClick(view);
                }
                materialTimePicker.N(false, false);
                break;
            case 1:
                MaterialTimePicker materialTimePicker2 = this.f2735b;
                Iterator it2 = materialTimePicker2.f2708n0.iterator();
                while (it2.hasNext()) {
                    ((View.OnClickListener) it2.next()).onClick(view);
                }
                materialTimePicker2.N(false, false);
                break;
            default:
                MaterialTimePicker materialTimePicker3 = this.f2735b;
                materialTimePicker3.f2705F0 = materialTimePicker3.f2705F0 == 0 ? 1 : 0;
                materialTimePicker3.R(materialTimePicker3.f2703D0);
                break;
        }
    }
}
