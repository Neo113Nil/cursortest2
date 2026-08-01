package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;
import k0.K;

/* loaded from: classes.dex */
public final class f implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2516a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ o f2517b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ MaterialCalendar f2518c;

    public /* synthetic */ f(MaterialCalendar materialCalendar, o oVar, int i) {
        this.f2516a = i;
        this.f2518c = materialCalendar;
        this.f2517b = oVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f2516a) {
            case 0:
                MaterialCalendar materialCalendar = this.f2518c;
                int O02 = ((LinearLayoutManager) materialCalendar.f2472d0.getLayoutManager()).O0() - 1;
                if (O02 >= 0) {
                    Calendar a2 = r.a(this.f2517b.f2542d.f2504a.f2528a);
                    a2.add(2, O02);
                    materialCalendar.M(new k(a2));
                    break;
                }
                break;
            default:
                MaterialCalendar materialCalendar2 = this.f2518c;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) materialCalendar2.f2472d0.getLayoutManager();
                View Q02 = linearLayoutManager.Q0(0, linearLayoutManager.v(), false);
                int H2 = (Q02 == null ? -1 : K.H(Q02)) + 1;
                if (H2 < materialCalendar2.f2472d0.getAdapter().a()) {
                    Calendar a3 = r.a(this.f2517b.f2542d.f2504a.f2528a);
                    a3.add(2, H2);
                    materialCalendar2.M(new k(a3));
                    break;
                }
                break;
        }
    }
}
