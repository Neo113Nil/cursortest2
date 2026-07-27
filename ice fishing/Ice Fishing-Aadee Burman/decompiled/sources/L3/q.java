package L3;

import android.content.Context;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.gms.internal.ads.C2815Uo;
import h.C4544d;
import h.C4547g;
import java.util.Objects;
import k.AbstractC4615b;
import m.S0;
import o4.C4794g;
import o4.C4795h;
import o4.C4797j;
import o4.C4799l;
import t2.BinderC5036d;

/* loaded from: classes2.dex */
public final class q implements View.OnClickListener {

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ int f1729n;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Object f1730u;

    public /* synthetic */ q(int i, Object obj) {
        this.f1729n = i;
        this.f1730u = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f1729n) {
            case 0:
                ((Z2.e) this.f1730u).L();
                break;
            case 1:
                com.google.android.material.datepicker.j jVar = (com.google.android.material.datepicker.j) this.f1730u;
                int i = jVar.f35960D0;
                if (i != 2) {
                    if (i == 1) {
                        jVar.D(2);
                        break;
                    }
                } else {
                    jVar.D(1);
                    break;
                }
                break;
            case 2:
                super/*androidx.activity.p*/.onBackPressed();
                break;
            case 3:
                C4544d c4544d = (C4544d) this.f1730u;
                c4544d.getClass();
                DrawerLayout drawerLayout = c4544d.f37866b;
                int h9 = drawerLayout.h(8388611);
                View e9 = drawerLayout.e(8388611);
                if ((e9 != null ? DrawerLayout.p(e9) : false) && h9 != 2) {
                    drawerLayout.c();
                    break;
                } else if (h9 != 1) {
                    drawerLayout.r();
                    break;
                }
                break;
            case 4:
                C4547g c4547g = (C4547g) this.f1730u;
                Button button = c4547g.f37878f;
                c4547g.f37893v.obtainMessage(1, c4547g.f37874b).sendToTarget();
                break;
            case 5:
                ((AbstractC4615b) this.f1730u).a();
                break;
            case 6:
                S0 s02 = ((Toolbar) this.f1730u).f4620v0;
                l.o oVar = s02 == null ? null : s02.f39060u;
                if (oVar != null) {
                    oVar.collapseActionView();
                    break;
                }
                break;
            case 7:
                C4799l.g((Context) ((com.google.ads.mediation.e) this.f1730u).f23549u);
                break;
            case 8:
                C4799l.g(((C4794g) this.f1730u).f39579n);
                break;
            case 9:
                C4799l.g(((C4795h) this.f1730u).f39582n);
                break;
            case 10:
                C4799l.g((Context) ((C2815Uo) this.f1730u).f27983w);
                break;
            case 11:
                C4799l.g(((C4797j) this.f1730u).f39586n);
                break;
            case 12:
                C4799l.g((Context) ((m1.e) this.f1730u).f39301n);
                break;
            default:
                BinderC5036d binderC5036d = (BinderC5036d) this.f1730u;
                binderC5036d.f40821Q = 2;
                binderC5036d.f40823u.finish();
                break;
        }
    }

    public q(Z2.e eVar) {
        this.f1729n = 0;
        Objects.requireNonNull(eVar);
        this.f1730u = eVar;
    }

    public q(BinderC5036d binderC5036d) {
        this.f1729n = 13;
        Objects.requireNonNull(binderC5036d);
        this.f1730u = binderC5036d;
    }
}
