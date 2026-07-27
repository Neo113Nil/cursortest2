package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;
import t0.AbstractC4990E;

/* loaded from: classes2.dex */
public final class f implements View.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f35949n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r f35950u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ j f35951v;

    public /* synthetic */ f(j jVar, r rVar, int i) {
        this.f35949n = i;
        this.f35951v = jVar;
        this.f35950u = rVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f35949n) {
            case 0:
                j jVar = this.f35951v;
                int K02 = ((LinearLayoutManager) jVar.f35963G0.getLayoutManager()).K0() - 1;
                if (K02 >= 0) {
                    Calendar a9 = v.a(this.f35950u.f36013c.f35935n.f35997n);
                    a9.add(2, K02);
                    jVar.C(new n(a9));
                    break;
                }
                break;
            default:
                j jVar2 = this.f35951v;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) jVar2.f35963G0.getLayoutManager();
                View M02 = linearLayoutManager.M0(0, linearLayoutManager.v(), false);
                int H8 = (M02 == null ? -1 : AbstractC4990E.H(M02)) + 1;
                if (H8 < jVar2.f35963G0.getAdapter().a()) {
                    Calendar a10 = v.a(this.f35950u.f36013c.f35935n.f35997n);
                    a10.add(2, H8);
                    jVar2.C(new n(a10));
                    break;
                }
                break;
        }
    }
}
