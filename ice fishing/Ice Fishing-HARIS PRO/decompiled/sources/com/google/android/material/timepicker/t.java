package com.google.android.material.timepicker;

import android.view.View;
import com.lumenpath.harispro.hrnavigator.R;

/* loaded from: classes.dex */
public final class t implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2770a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2771b;

    public /* synthetic */ t(int i, Object obj) {
        this.f2770a = i;
        this.f2771b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f2770a) {
            case 0:
                m mVar = ((TimePickerView) this.f2771b).f2726w;
                if (mVar != null) {
                    mVar.a(((Integer) view.getTag(R.id.selection_type)).intValue(), true);
                    break;
                }
                break;
            default:
                ((r) this.f2771b).a(((Integer) view.getTag(R.id.selection_type)).intValue());
                break;
        }
    }
}
