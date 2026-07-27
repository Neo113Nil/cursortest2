package com.google.android.material.datepicker;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.gms.internal.ads.C2833Vo;
import h.C4545d;
import h.C4549h;
import java.util.Objects;
import k.AbstractC4614b;
import k4.C4653h;
import k4.C4654i;
import k4.C4656k;
import m.T0;
import s2.BinderC4996d;

/* loaded from: classes2.dex */
public final class j implements View.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f36121n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f36122u;

    public /* synthetic */ j(int i, Object obj) {
        this.f36121n = i;
        this.f36122u = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f36121n) {
            case 0:
                k kVar = (k) this.f36122u;
                int i = kVar.f36125D0;
                if (i != 2) {
                    if (i == 1) {
                        kVar.D(2);
                        break;
                    }
                } else {
                    kVar.D(1);
                    break;
                }
                break;
            case 1:
                super/*androidx.activity.p*/.onBackPressed();
                break;
            case 2:
                C4545d c4545d = (C4545d) this.f36122u;
                c4545d.getClass();
                DrawerLayout drawerLayout = c4545d.f38079b;
                int h9 = drawerLayout.h(8388611);
                View e6 = drawerLayout.e(8388611);
                if ((e6 != null ? DrawerLayout.p(e6) : false) && h9 != 2) {
                    drawerLayout.c();
                    break;
                } else if (h9 != 1) {
                    drawerLayout.r();
                    break;
                }
                break;
            case 3:
                C4549h c4549h = (C4549h) this.f36122u;
                Button button = c4549h.f38093f;
                c4549h.f38108v.obtainMessage(1, c4549h.f38089b).sendToTarget();
                break;
            case 4:
                k4.m.g((Context) ((com.google.ads.mediation.e) this.f36122u).f23705u);
                break;
            case 5:
                k4.m.g(((C4653h) this.f36122u).f38758n);
                break;
            case 6:
                k4.m.g(((C4654i) this.f36122u).f38761n);
                break;
            case 7:
                k4.m.g((Context) ((C2833Vo) this.f36122u).f28308w);
                break;
            case 8:
                k4.m.g(((C4656k) this.f36122u).f38765n);
                break;
            case 9:
                k4.m.g((Context) ((S0.l) this.f36122u).f2911v);
                break;
            case 10:
                ((AbstractC4614b) this.f36122u).a();
                break;
            case 11:
                T0 t02 = ((Toolbar) this.f36122u).f4735v0;
                l.n nVar = t02 == null ? null : t02.f39331u;
                if (nVar != null) {
                    nVar.collapseActionView();
                    break;
                }
                break;
            default:
                BinderC4996d binderC4996d = (BinderC4996d) this.f36122u;
                binderC4996d.f40453Q = 2;
                binderC4996d.f40455u.finish();
                break;
        }
    }

    public j(BinderC4996d binderC4996d) {
        this.f36121n = 12;
        Objects.requireNonNull(binderC4996d);
        this.f36122u = binderC4996d;
    }
}
