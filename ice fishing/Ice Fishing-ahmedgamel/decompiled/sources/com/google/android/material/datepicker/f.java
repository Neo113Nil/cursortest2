package com.google.android.material.datepicker;

import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.Calendar;
import t0.AbstractC4987C;

/* loaded from: classes2.dex */
public final class f implements View.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f36717n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r f36718u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ j f36719v;

    public /* synthetic */ f(j jVar, r rVar, int i) {
        this.f36717n = i;
        this.f36719v = jVar;
        this.f36718u = rVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f36717n) {
            case 0:
                j jVar = this.f36719v;
                int K02 = ((LinearLayoutManager) jVar.f36727B0.getLayoutManager()).K0() - 1;
                if (K02 >= 0) {
                    Calendar a9 = v.a(this.f36718u.f36781c.f36703n.f36765n);
                    a9.add(2, K02);
                    jVar.C(new n(a9));
                    break;
                }
                break;
            default:
                j jVar2 = this.f36719v;
                LinearLayoutManager linearLayoutManager = (LinearLayoutManager) jVar2.f36727B0.getLayoutManager();
                View M02 = linearLayoutManager.M0(0, linearLayoutManager.v(), false);
                int H8 = (M02 == null ? -1 : AbstractC4987C.H(M02)) + 1;
                if (H8 < jVar2.f36727B0.getAdapter().a()) {
                    Calendar a10 = v.a(this.f36718u.f36781c.f36703n.f36765n);
                    a10.add(2, H8);
                    jVar2.C(new n(a10));
                    break;
                }
                break;
        }
    }
}
